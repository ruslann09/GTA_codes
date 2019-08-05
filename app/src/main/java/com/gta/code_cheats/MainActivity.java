package com.gta.code_cheats;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String myHtmlFormattedText = getResources().getString(R.string.codes);

        TextView tv = (TextView) findViewById(R.id.textView2);
        tv.setText("" +
                "        Raise Wanted Level\n" +
                "PS: R1, R1, CIRCLE, R2, LEFT, RIGHT, LEFT, RIGHT, LEFT, RIGHT\n" +
                "Xbox: RB, RB, B, RT, LEFT, RIGHT, LEFT, RIGHT, LEFT, RIGHT\n" +
                "PC: FUGITIVE\n" +
                "Phone: 1-999-3844-8483 [1-999-FUGITIVE]" +
                "" +
                "Lower Wanted Level\n" +
                "PS: R1, R1, CIRCLE, R2, RIGHT, LEFT, RIGHT, LEFT, RIGHT, LEFT\n" +
                "Xbox: RB, RB, B, RT, RIGHT, LEFT, RIGHT, LEFT, RIGHT, LEFT\n" +
                "PC: LAWYERUP\n" +
                "Phone: 1-999-5299-3787 [1-999-LAWYERUP]\n" +
                "\n" +
                "Max Health and Armor\n" +
                "PS: CIRCLE, L1, TRIANGLE, R2, X, SQUARE, CIRCLE, RIGHT, SQUARE, L1, L1, L1\n" +
                "Xbox: B, LB, Y, RT, A, X, B, RIGHT, X, LB, LB, LB\n" +
                "PC: TURTLE\n" +
                "Phone: 1-999-887-853 [1-999-TURTLE]\n" +
                "\n" +
                "Invincibility (Last 5 minutes)\n" +
                "PS: RIGHT, X, RIGHT, LEFT, RIGHT, R1, RIGHT, LEFT, X, TRIANGLE\n" +
                "Xbox: RIGHT, A, RIGHT, LEFT, RIGHT, RB, RIGHT, LEFT, A, Y\n" +
                "PC: PAINKILLER\n" +
                "Phone: 1-999-7246-545-537 [1-999-PAINKILLER]\n" +
                "\n" +
                "Recharge Special Ability\n" +
                "PS: X, X, SQUARE, R1, L1, X, RIGHT, LEFT, X\n" +
                "Xbox: A, A, X, RB, LB, A, RIGHT, LEFT, A\n" +
                "PC: POWERUP\n" +
                "Phone: 1-999-769-3787 [1-999-POWERUP]\n" +
                "\n" +
                "Give Parachute\n" +
                "PS: LEFT, RIGHT, L1, L2, R1, R2, R2, LEFT, LEFT, RIGHT, L1 (PS)\n" +
                "Xbox: LEFT, RIGHT, LB, LT, RB, RT, RT, LEFT, LEFT, RIGHT, LB (Xbox)\n" +
                "PC: SKYDIVE\n" +
                "Phone: 1-999-759-3483 [1-999-SKYDIVE]\n" +
                "\n" +
                "Give Weapons and Extra Ammo\n" +
                "PS: TRIANGLE, R2, LEFT, L1, X, RIGHT, TRIANGLE, DOWN, SQUARE, L1, L1, L1\n" +
                "Xbox: Y, RT, LEFT, LB, A, RIGHT, Y, DOWN, X, LB, LB, LB\n" +
                "PC: TOOLUP\n" +
                "Phone: 1-999-866-587 [1-999-TOOLUP]\n" +
                "\n" +
                "Drunk Mode\n" +
                "PS: TRIANGLE, RIGHT, RIGHT, LEFT, RIGHT, SQUARE, CIRCLE, LEFT\n" +
                "Xbox: Y, RIGHT, RIGHT, LEFT, RIGHT, X, B, LEFT\n" +
                "PC: LIQUOR\n" +
                "Phone: 1-999-547-861 [1-999-LIQUOR]\n" +
                "\n" +
                "Fast Run\n" +
                "PS: TRIANGLE, LEFT, RIGHT, RIGHT, L2, L1, SQUARE\n" +
                "Xbox: Y, LEFT, RIGHT, RIGHT, LT, LB, X\n" +
                "PC: CATCHME\n" +
                "Phone: 1-999-2288-463 [1-999-CATCHME]\n" +
                "\n" +
                "Fast Swim\n" +
                "PS: LEFT, LEFT, L1, RIGHT, RIGHT, R2, LEFT, L2, RIGHT\n" +
                "Xbox: LEFT, LEFT, LB, RIGHT, RIGHT, RT, LEFT, LT, RIGHT (Xbox)\n" +
                "PC: GOTGILLS\n" +
                "Phone: 1-999-4684-4557 [1-999-GOTGILLS]\n" +
                "\n" +
                "    Skyfall (Get dropped from high altitude)\n" +
                "PS: L1, L2, R1, R2, LEFT, RIGHT, LEFT, RIGHT, L1, L2, R1, R2, LEFT, RIGHT, LEFT, RIGHT\n" +
                "Xbox: LB, LT, RB, RT, LEFT, RIGHT, LEFT, RIGHT, LB, LT, RB, RT, LEFT, RIGHT, LEFT, RIGHT\n" +
                "PC: SKYFALL\n" +
                "Phone: 1-999-759-3255 [1-999-SKYFALL]\n" +
                "\n" +
                "Super Jump (Hold jump to go higher)\n" +
                "PS: LEFT, LEFT, TRIANGLE, TRIANGLE, RIGHT, RIGHT, LEFT, RIGHT, SQUARE, R1, R2\n" +
                "Xbox: LEFT, LEFT, Y, Y, RIGHT, RIGHT, LEFT, RIGHT, X, RB, RT\n" +
                "PC: HOPTOIT\n" +
                "Phone: 1-999-467-8648 [1-999-HOPTOIT]\n" +
                "\n" +
                "    Moon Gravity\n" +
                "PS: LEFT, LEFT, L1, R1, L1, RIGHT, LEFT, L1, LEFT\n" +
                "Xbox: LEFT, LEFT, LB, RB, LB, RIGHT, LEFT, LB, LEFT\n" +
                "PC: FLOATER\n" +
                "Phone: 1-999-356-2837 [1-999-FLOATER]\n" +
                "\n" +
                "Explosive Melee Attacks\n" +
                "PS: RIGHT, LEFT, X, TRIANGLE, R1, CIRCLE, CIRCLE, CIRCLE, L2\n" +
                "Xbox: RIGHT, LEFT, A, Y, RB, B, B, B, LT\n" +
                "PC: HOTHANDS\n" +
                "Phone: 1-999-4684-2637 [1-999-HOTHANDS]\n" +
                "\n" +
                "Slow Motion Aim (Cycle through 3 levels)\n" +
                "PS: SQUARE, L2, R1, TRIANGLE, LEFT, SQUARE, L2, RIGHT, X\n" +
                "Xbox: X, LT, RB, Y, LEFT, X, LT, RIGHT, A\n" +
                "PC: DEADEYE\n" +
                "Phone: 1-999-3323-393 [1-999-DEADEYE]\n" +
                "\n" +
                "Bang Bang (Explosive bullets)\n" +
                "PS: RIGHT, SQUARE, X, LEFT, R1, R2, LEFT, RIGHT, RIGHT, L1, L1, L1\n" +
                "Xbox: RIGHT, X, A, LEFT, RB, RT, LEFT, RIGHT, RIGHT, LB, LB, LB\n" +
                "PC: HIGHEX\n" +
                "Phone: 1-999-444-439 [1-999-HIGHEX]\n" +
                "\n" +
                "Flaming Bullets\n" +
                "PS: L1, R1, SQUARE, R1, LEFT, R2, R1, LEFT, SQUARE, RIGHT, L1, L1\n" +
                "Xbox: LB, RB, X, RB, LEFT, RT, RB, LEFT, X, RIGHT, LB, LB\n" +
                "PC: INCENDIARY\n" +
                "Phone: 1-999-462-363-4279 [1-999-INCENDIARY]\n" +
                "\n" +
                "Slow Motion (Cycle through 3 levels)\n" +
                "PS: TRIANGLE, LEFT, RIGHT, RIGHT, SQUARE, R2, R1\n" +
                "Xbox: Y, LEFT, RIGHT, RIGHT, X, RT, RB\n" +
                "PC: SLOWMO\n" +
                "Phone: 1-999-756-966 [1-999-SLOWMO]\n" +
                "\n" +
                "Change Weather (Cycle through various options)\n" +
                "PS: R2, X, L1, L1, L2, L2, L2, SQUARE\n" +
                "Xbox: RT, A, LB, LB, LT, LT, LT, X\n" +
                "PC: MAKEITRAIN\n" +
                "Phone: 1-999-625-348-7246 [1-999-MAKEITRAIN]\n" +
                "\n" +
                "Slidey Cars\n" +
                "PS: TRIANGLE, R1, R1, LEFT, R1, L1, R2, L1\n" +
                "Xbox: Y, RB, RB, LEFT, RB, LB, RT, LB\n" +
                "PC: SNOWDAY\n" +
                "Phone: 1-999-7669-329 [1-999-SNOWDAY]\n" +
                "\n" +
                "Access Director Mode\n" +
                "PC: JRTALENT\n" +
                "Phone: 1-999-5782-5368 [1-999-JRTALENT]\n" +
                "\n" +
                "Black Cellphones (may cause explosions and other effects)\n" +
                "Phone: 1-999-367-3767 [1-999-EMPEROR or 1-999-EMP-DROP]\n" +
                "\n" +
                "    Spawn Buzzard Attack Helicopter\n" +
                "PS: CIRCLE, CIRCLE, L1, CIRCLE, CIRCLE, CIRCLE, L1, L2, R1, TRIANGLE, CIRCLE, TRIANGLE\n" +
                "Xbox: B, B, LB, B, B, B, LB, LT, RB, Y, B, Y\n" +
                "PC: BUZZOFF\n" +
                "Phone: 1-999-2899-633 [1-999-BUZZOFF]\n" +
                "\n" +
                "Spawn Stunt Plane\n" +
                "PS: CIRCLE, RIGHT, L1, L2, LEFT, R1, L1, L1, LEFT, LEFT, X, TRIANGLE\n" +
                "Xbox: B, RIGHT, LB, LT, LEFT, RB, LB, LB, LEFT, LEFT, A, Y\n" +
                "PC: BARNSTORM\n" +
                "Phone: 1-999-227-678-676 [1-999-BARNSTORM]\n" +
                "\n" +
                "    Spawn Duster Crop Plane\n" +
                "PS: RIGHT, LEFT, R1, R1, R1, LEFT, TRIANGLE, TRIANGLE, X, CIRCLE, L1, L1\n" +
                "Xbox: RIGHT, LEFT, RB, RB, RB, LEFT, Y, Y, A, B, LB, LB (Xbox)\n" +
                "PC: FLYSPRAY\n" +
                "Phone: 1-999-3597-7729 [1-999-FLYSPRAY]\n" +
                "\n" +
                "Spawn Dodo Seaplane\n" +
                "(Need to unlock vehicle first - GTA 5 Dodo seaplane unlock and location)\n" +
                "PC: EXTINCT\n" +
                "Phone: 1-999-398-4628 [1-999-EXTINCT]\n" +
                "\n" +
                "Spawn Kraken Sub\n" +
                "(Need to unlock vehicle first - GTA 5 Wildlife Photography Challenge guide)\n" +
                "PC: BUBBLES\n" +
                "Phone: 1-999-282-2537 [1-999-BUBBLES]\n" +
                "\n" +
                "Spawn Duke O'Death\n" +
                "(Need to unlock vehicle first - GTA 5 Duke O'Death unlock and location)\n" +
                "PC: DEATHCAR\n" +
                "Phone: 1-999-3328-4227 [1-999-DEATHCAR]\n" +
                "\n" +
                "Spawn Comet Sports Car\n" +
                "PS: R1, CIRCLE, R2, RIGHT, L1, L2, X, X, SQUARE, R1\n" +
                "Xbox: RB, B, RT, RIGHT, LB, LT, A, A, X, RB\n" +
                "PC: COMET\n" +
                "Phone: 1-999-266-38 [1-999-COMET]\n" +
                "\n" +
                "Spawn Rapid GT Sports Car\n" +
                "PS: R2, R2, L1, CIRCLE, RIGHT, L1, R1, RIGHT, LEFT, CIRCLE, R2\n" +
                "Xbox: RT, RT, LB, B, RIGHT, LB, RB, RIGHT, LEFT, B, RT\n" +
                "PC: RAPIDGT\n" +
                "Phone: 1-999-727-4348 [1-999-RAPIDGT]\n" +
                "\n" +
                "    Spawn Limo\n" +
                "PS: R2, RIGHT, L2, LEFT, LEFT, R1, L1, CIRCLE, RIGHT\n" +
                "Xbox: RT, RIGHT, LT, LEFT, LEFT, RB, LB, B, RIGHT\n" +
                "PC: VINEWOOD\n" +
                "Phone: 1-999-8463-9663 [1-999-VINEWOOD]\n" +
                "\n" +
                "Spawn Trashmaster\n" +
                "PS: CIRCLE, R1, CIRCLE, R1, LEFT, LEFT, R1, L1, CIRCLE, RIGHT\n" +
                "Xbox: B, RB, B, RB, LEFT, LEFT, RB, LB, B, RIGHT\n" +
                "PC: TRASHED\n" +
                "Phone: 1-999-8727-433 [1-999-TRASHED]\n" +
                "\n" +
                "Spawn Caddy Golf Cart\n" +
                "PS: CIRCLE, L1, LEFT, R1, L2, X, R1, L1, CIRCLE, X\n" +
                "Xbox: B, LB, LEFT, RB, LT, A, RB, LB, B, A\n" +
                "PC: HOLEIN1\n" +
                "Phone: 1-999-4653-461 [1-999-HOLEIN1]\n" +
                "\n" +
                "Spawn Sanchez Dirt Bike\n" +
                "PS: CIRCLE, X, L1, CIRCLE, CIRCLE, L1, CIRCLE, R1, R2, L2, L1, L1\n" +
                "Xbox: B, A, LB, B, B, LB, B, RB, RT, LT, LB, LB\n" +
                "PC: OFFROAD\n" +
                "Phone: 1-999-633-7623 [1-999-OFFROAD]\n" +
                "\n" +
                "Spawn PCJ Motorbike\n" +
                "PS: R1, RIGHT, LEFT, RIGHT, R2, LEFT, RIGHT, SQUARE, RIGHT, L2, L1, L1\n" +
                "Xbox: RB, RIGHT, LEFT, RIGHT, RT, LEFT, RIGHT, X, RIGHT, LT, LB, LB\n" +
                "PC: ROCKET\n" +
                "Phone: 1-999-762-538 [1-999-ROCKET]\n" +
                "\n" +
                "Spawn BMX Bike\n" +
                "PS: LEFT, LEFT, RIGHT, RIGHT, LEFT, RIGHT, SQUARE, CIRCLE, TRIANGLE, R1, R2\n" +
                "Xbox: LEFT, LEFT, RIGHT, RIGHT, LEFT, RIGHT, X, B, Y, RB, RT\n" +
                "PC: BANDIT\n" +
                "Phone: 1-999-226-348 [1-999-BANDIT]");
    }
}
