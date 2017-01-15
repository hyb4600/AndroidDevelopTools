package io.micro.adt.model;

import android.content.Context;

import io.micro.adt.Developer;

/**
 * DevItem model
 */
public class DevItem {
    public int id;
    public String desc;
    public int icon;
    public boolean activated;

    public static void handle(Context context, DevItem item) {
        boolean activated = item.activated;
        switch (item.id) {
            case 0x01:
                Developer.setAdbEnable(context, activated);
                break;
            case 0x02:
                Developer.keepScreenOn(context, activated);
                break;
            case 0x03:
                Developer.setDebugLayout(activated);
                break;
            case 0x04:
                Developer.setDebugOverdraw(activated);
                break;
            case 0x05:
                Developer.setProfile(activated);
                break;
            case 0x06:
                Developer.setStrictMode(activated);
                break;
            case 0x07:
                Developer.setDestroyActivities(activated);
                break;
            default:
                // no-op
        }
    }
}
