package com.gta.code_cheats;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

import java.util.Timer;
import java.util.TimerTask;

public class SplashScreenActivity extends Activity {

    private InterstitialAd mInterstitialAd;

    Timer interstitialAsLoad;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        MobileAds.initialize(this, "ca-app-pub-1683287051972127~3232678243");

        mInterstitialAd = new InterstitialAd(SplashScreenActivity.this);

        mInterstitialAd.setAdUnitId("ca-app-pub-1683287051972127/9223371527");
        final AdRequest adRequestInter = new AdRequest.Builder().build();

        mInterstitialAd.loadAd(adRequestInter);

        mInterstitialAd.setAdListener(new AdListener() {
            @Override
            public void onAdLoaded() {

            }

            @Override
            public void onAdFailedToLoad(int i) {
                super.onAdFailedToLoad(i);

                mInterstitialAd.loadAd(adRequestInter);
            }
        });

        setContentView(R.layout.splash_screen);

        StartAnimations();

    }

    private void StartAnimations() {
        LinearLayout l=(LinearLayout) findViewById(R.id.lin_lay);
        final ImageView iv = (ImageView) findViewById(R.id.splash);

        Animation animationSplash = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate);
        animationSplash.setAnimationListener(new Animation.AnimationListener() {
            @Override
            public void onAnimationStart(Animation animation) {

            }

            @Override
            public void onAnimationEnd(Animation animation) {
                iv.setVisibility(View.GONE);
            }

            @Override
            public void onAnimationRepeat(Animation animation) {

            }
        });

        iv.startAnimation(animationSplash);

        waitInterstitialAsLoad();
    }

    private void waitInterstitialAsLoad() {

        interstitialAsLoad = new Timer();
        final int[] timer = {0};

        interstitialAsLoad.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                runOnUiThread(new Runnable() {
                    public void run() {
                        if ((mInterstitialAd != null && mInterstitialAd.isLoaded()) && timer[0] > 6) {
                            startMenuActivity();

                            mInterstitialAd.show();

                            interstitialAsLoad.cancel();

                            SplashScreenActivity.this.finish();
                        } else if (timer[0] >= 16) {
                            startMenuActivity();

                            interstitialAsLoad.cancel();

                            SplashScreenActivity.this.finish();
                        }
                        timer[0]++;
                    }
                });
            }
        }, 0, 500);
    }

    public void startMenuActivity () {
        Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
        intent.setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
        startActivity(intent);
    }
}