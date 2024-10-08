package X;

import android.content.Context;
import com.facebook.browser.lite.chrome.container.DefaultBrowserLiteChrome;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: X.Wup  reason: case insensitive filesystem */
public final class C20572Wup extends ArrayList {
    public final int A00 = 1;
    public final Object A01;

    public C20572Wup(WDA wda) {
        this.A01 = wda;
        Context context = wda.A03;
        addAll(Arrays.asList(new Integer[]{DbV.A0n(context, R.color.design_dark_default_color_on_background), DbV.A0n(context, R.color.black), Integer.valueOf(AnonymousClass7TF.A03(context, R.attr.igds_color_creation_tools_pink)), Integer.valueOf(AnonymousClass7TF.A03(context, R.attr.igds_color_gradient_lavender)), Integer.valueOf(AnonymousClass7TF.A03(context, R.attr.igds_color_gradient_purple)), Integer.valueOf(AnonymousClass7TF.A03(context, R.attr.igds_color_creation_tools_orange)), Integer.valueOf(AnonymousClass7TF.A03(context, R.attr.igds_color_creation_tools_green)), Integer.valueOf(AnonymousClass7TF.A03(context, R.attr.igds_color_creation_tools_blue))}));
    }

    public C20572Wup(DefaultBrowserLiteChrome defaultBrowserLiteChrome) {
        this.A01 = defaultBrowserLiteChrome;
        add("iab_nav_optimization_ig");
        add("iab_android_ig_expandable_footer");
        add("iab_link_history_ig_android");
        add("ig_android_browser_lite");
    }
}
