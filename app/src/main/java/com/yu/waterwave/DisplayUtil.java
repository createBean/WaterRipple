package com.yu.waterwave;

import android.content.Context;

/**
 * Created by yu on 2017/5/23.
 */

public class DisplayUtil {
    public static int dip2px(Context context, float dipValue) {
        final float scale = context.getResources().getDisplayMetrics().density;
        return (int) (dipValue * scale + 0.5f);
    }
}
