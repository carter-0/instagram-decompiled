package com.facebook.react.modules.statusbar;

import X.04k;
import X.0I1;
import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C18773W0w;
import X.C586203k;
import X.C73163PXy;
import X.C9543Rcg;
import X.DbY;
import X.Pxe;
import X.QZ5;
import X.QZ7;
import X.QZK;
import X.TG9;
import X.W2U;
import android.app.Activity;
import android.view.View;
import android.view.Window;
import com.facebook.fbreact.specs.NativeStatusBarManagerAndroidSpec;
import com.facebook.react.module.annotations.ReactModule;
import java.util.Arrays;
import java.util.Map;

@ReactModule(name = "StatusBarManager")
public final class StatusBarModule extends NativeStatusBarManagerAndroidSpec {
    public static final C9543Rcg Companion = new Object();
    public static final String DEFAULT_BACKGROUND_COLOR_KEY = "DEFAULT_BACKGROUND_COLOR";
    public static final String HEIGHT_KEY = "HEIGHT";
    public static final String NAME = "StatusBarManager";

    public void setColor(double d, boolean z) {
        int i = (int) d;
        Activity A00 = Pxe.A0T(this).A00();
        if (A00 == null) {
            0I1.A04("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            C18773W0w.A01(new QZ7(A00, Pxe.A0T(this), i, z));
        }
    }

    private final float getStatusBarHeightPx() {
        Window window;
        View decorView;
        04k A00;
        Activity A002 = Pxe.A0T(this).A00();
        if (A002 == null || (window = A002.getWindow()) == null || (decorView = window.getDecorView()) == null || (A00 = C586203k.A00(decorView)) == null) {
            return 0.0f;
        }
        return (float) A00.A00.A05(131).A03;
    }

    public Map getTypedExportedConstants() {
        String str;
        Window window;
        Activity A00 = Pxe.A0T(this).A00();
        if (A00 == null || (window = A00.getWindow()) == null) {
            str = "black";
        } else {
            str = String.format("#%06X", Arrays.copyOf(AnonymousClass7TF.A1b(window.getStatusBarColor() & 16777215), 1));
            0qQ.A07(str);
        }
        return DbY.A0p(DEFAULT_BACKGROUND_COLOR_KEY, str, AnonymousClass7TE.A1L(HEIGHT_KEY, Float.valueOf(W2U.A00(getStatusBarHeightPx()))));
    }

    public void setHidden(boolean z) {
        Activity A00 = Pxe.A0T(this).A00();
        if (A00 == null) {
            0I1.A04("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            C18773W0w.A01(new C73163PXy(A00, z));
        }
    }

    public void setStyle(String str) {
        Activity A00 = Pxe.A0T(this).A00();
        if (A00 == null) {
            0I1.A04("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            C18773W0w.A01(new TG9(A00, str));
        }
    }

    public void setTranslucent(boolean z) {
        Activity A00 = Pxe.A0T(this).A00();
        if (A00 == null) {
            0I1.A04("ReactNative", "StatusBarModule: Ignored status bar change, current activity is null.");
        } else {
            C18773W0w.A01(new QZ5(A00, Pxe.A0T(this), z));
        }
    }

    public StatusBarModule(QZK qzk) {
        super(qzk);
    }
}
