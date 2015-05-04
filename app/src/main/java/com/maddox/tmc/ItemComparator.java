package com.maddox.tmc;

import DaneMapy.MapItem;

/**
 * Created by bopablo.g on 2015-05-04.
 */
public class ItemComparator {

    public int compare(Object arg0, Object arg1) {

        MapItem item1 = (MapItem)arg0;
        MapItem item2 = (MapItem)arg1;

        int type1 = item1.type;
        int type2 = item2.type;

        if(type1 > type2) {
            return 1;
        } else if(type1 == type2) {
            return 0;
        } else {
            return -1;
        }
    }

}
