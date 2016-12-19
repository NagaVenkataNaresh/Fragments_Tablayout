package naresh.fragments_tablayout.Adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import naresh.fragments_tablayout.Tabs.Tab1;
import naresh.fragments_tablayout.Tabs.Tab2;
import naresh.fragments_tablayout.Tabs.Tab3;

/**
 * Created by Naresh on 19-12-2016.
 */

public class PageAdapter extends FragmentStatePagerAdapter
{

    int tabCount;

    public PageAdapter(FragmentManager fm, int tabCount)
    {
        super(fm);
        this.tabCount= tabCount;
    }

    @Override
    public Fragment getItem(int position)
    {
        switch (position)
        {
            case 0:
                Tab1 tab1 = new Tab1();
                return tab1;
            case 1:
                Tab2 tab2 = new Tab2();
                return tab2;
            case 2:
                Tab3 tab3 = new Tab3();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount()
    {
        return tabCount;
    }
}
