package com.example.milind.bottombar;

import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;

import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.BottomBarBadge;
import com.roughike.bottombar.OnMenuTabClickListener;

public class MainActivity extends AppCompatActivity {

    BottomBar mBottomBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBottomBar = BottomBar.attach(this, savedInstanceState);
        mBottomBar.setItemsFromMenu(R.menu.main, new OnMenuTabClickListener() {
            @Override
            public void onMenuTabSelected(@IdRes int i) {
                if(i == R.id.BottomBarItemOne)
                {
                    PeopleFragment f = new PeopleFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }

                else if(i == R.id.BottomBarItemTwo)
                {
                    CardsFragment f = new CardsFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }

                else if(i == R.id.BottomBarItemThree)
                {
                    CallFragment f = new CallFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }

                else if(i == R.id.BottomBarItemFour)
                {
                    EmailFragment f = new EmailFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }

                else if(i == R.id.BottomBarItemFive)
                {
                    FavoriteFragment f = new FavoriteFragment();
                    getSupportFragmentManager().beginTransaction().replace(R.id.frame,f).commit();
                }

            }

            @Override
            public void onMenuTabReSelected(@IdRes int i) {

            }
        });
        mBottomBar.mapColorForTab(0,"#F44336");
        mBottomBar.mapColorForTab(1,"#9C27B0");
        mBottomBar.mapColorForTab(2,"#673AB7");
        mBottomBar.mapColorForTab(3,"#795548");
        mBottomBar.mapColorForTab(4,"#CDDC39");

        BottomBarBadge unread;
        unread = mBottomBar.makeBadgeForTabAt(3,"#FF0000",13);
        unread.show();

    }
}
