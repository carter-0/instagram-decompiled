package com.facebook.react.modules.toast;

import X.0Yt;
import X.0eP;
import X.0qQ;
import X.AnonymousClass7TE;
import X.C13025TIh;
import X.C13051TJh;
import X.C18773W0w;
import X.C51967G9n;
import X.C9544Rch;
import X.QZK;
import X.TKY;
import com.facebook.fbreact.specs.NativeToastAndroidSpec;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Map;

@ReactModule(name = "ToastAndroid")
public final class ToastModule extends NativeToastAndroidSpec {
    public static final C9544Rch Companion = new Object();
    public static final String DURATION_LONG_KEY = "LONG";
    public static final String DURATION_SHORT_KEY = "SHORT";
    public static final String GRAVITY_BOTTOM_KEY = "BOTTOM";
    public static final String GRAVITY_CENTER = "CENTER";
    public static final String GRAVITY_TOP_KEY = "TOP";
    public static final String NAME = "ToastAndroid";

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ToastModule(QZK qzk) {
        super(qzk);
        0qQ.A0B(qzk, 1);
    }

    public void show(String str, double d) {
        C18773W0w.A01(new C13025TIh(this, str, (int) d));
    }

    public void showWithGravity(String str, double d, double d2) {
        C18773W0w.A01(new C13051TJh(this, str, (int) d, (int) d2));
    }

    public void showWithGravityAndOffset(String str, double d, double d2, double d3, double d4) {
        C18773W0w.A01(new TKY(this, str, (int) d, (int) d2, (int) d3, (int) d4));
    }

    public Map getTypedExportedConstants() {
        return 0Yt.A07(new 0eP[]{AnonymousClass7TE.A1L(DURATION_SHORT_KEY, C51967G9n.A0k()), AnonymousClass7TE.A1L(DURATION_LONG_KEY, 1), AnonymousClass7TE.A1L("TOP", 49), AnonymousClass7TE.A1L("BOTTOM", 81), AnonymousClass7TE.A1L("CENTER", 17)});
    }
}
