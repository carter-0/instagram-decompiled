package com.facebook.browser.lite.chrome.widgets.menu;

import X.C11347SOg;
import X.C11498SbL;
import X.C13551TcN;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import java.util.Locale;

public class MenuItemNavigationView extends LinearLayout {
    public static void A00(ImageButton imageButton, C11347SOg sOg, C13551TcN tcN, MenuItemNavigationView menuItemNavigationView) {
        imageButton.setEnabled(sOg.A05);
        if (TextUtils.getLayoutDirectionFromLocale(Locale.getDefault()) == 1) {
            imageButton.setScaleX(-1.0f);
        }
        if (sOg.A05) {
            imageButton.setOnClickListener(new C11498SbL(0, (Object) menuItemNavigationView, (Object) tcN, (Object) sOg));
        }
    }

    public MenuItemNavigationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MenuItemNavigationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MenuItemNavigationView(Context context) {
        this(context, (AttributeSet) null);
    }
}
