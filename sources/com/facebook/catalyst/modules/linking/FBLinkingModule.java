package com.facebook.catalyst.modules.linking;

import X.002;
import X.0Qx;
import X.0Sd;
import X.0b6;
import X.0bs;
import X.0cp;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13904TjR;
import X.C9238RUp;
import X.Pxe;
import X.Pxf;
import X.QZK;
import android.content.ContextWrapper;
import android.content.Intent;
import com.facebook.fbreact.specs.NativeFBLinkingAndroidSpec;
import com.facebook.react.module.annotations.ReactModule;

@ReactModule(name = "FBLinkingAndroid")
public final class FBLinkingModule extends NativeFBLinkingAndroidSpec {
    public static final C9238RUp Companion = new Object();
    public static final String NAME = "FBLinkingAndroid";

    public void invalidate() {
    }

    private final 0bs scopeToIntentLauncher(String str) {
        0Qx A09;
        switch (str.hashCode()) {
            case -1281860764:
                if (str.equals("family")) {
                    return 0b6.A00().A05();
                }
                return null;
            case -969937473:
                if (str.equals("thirdParty")) {
                    return 0b6.A00().A0A();
                }
                return null;
            case -354142814:
                if (str.equals("accessibleByAnyApp")) {
                    return 0b6.A00().A03();
                }
                return null;
            case 570410685:
                if (str.equals("internal")) {
                    return Pxf.A0O();
                }
                return null;
            case 1864483865:
                if (!str.equals("sameKey")) {
                    return null;
                }
                0b6 A00 = 0b6.A00();
                synchronized (A00) {
                    A09 = A00.A09();
                }
                return A09;
            default:
                return null;
        }
    }

    public void canOpenURL(String str, String str2, C13904TjR tjR) {
        AnonymousClass7TG.A1T(str, str2, tjR);
        if (str.length() == 0) {
            C13904TjR.A01("Invalid URL: ", str, tjR);
            return;
        }
        0bs scopeToIntentLauncher = scopeToIntentLauncher(str2);
        if (scopeToIntentLauncher == null) {
            C13904TjR.A01("Invalid scope: ", str2, tjR);
            return;
        }
        try {
            Intent A0F = Pxe.A0F(0cp.A03(str).normalizeScheme());
            QZK qzk = this.mReactApplicationContext;
            0Sd.A01(qzk, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
            ContextWrapper A00 = qzk.A00();
            if (A00 == null) {
                A00 = this.mReactApplicationContext;
                0Sd.A01(A00, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
            }
            tjR.resolve(Boolean.valueOf(AnonymousClass7TF.A1V(0bs.A00(A00, A0F, scopeToIntentLauncher))));
        } catch (Throwable th) {
            C13904TjR.A00(tjR, "Could not check if URL '", str, "' can be opened: ", th);
        }
    }

    public void openURL(String str, String str2, C13904TjR tjR) {
        AnonymousClass7TG.A1T(str, str2, tjR);
        if (str.length() == 0) {
            C13904TjR.A01("Invalid URL: ", str, tjR);
            return;
        }
        0bs scopeToIntentLauncher = scopeToIntentLauncher(str2);
        if (scopeToIntentLauncher == null) {
            C13904TjR.A01("Invalid scope: ", str2, tjR);
            return;
        }
        try {
            Intent A0F = Pxe.A0F(0cp.A03(str).normalizeScheme());
            QZK qzk = this.mReactApplicationContext;
            0Sd.A01(qzk, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
            ContextWrapper A00 = qzk.A00();
            if (A00 == null) {
                A00 = this.mReactApplicationContext;
                0Sd.A01(A00, "Tried to get ReactApplicationContext even though NativeModule wasn't instantiated with one");
            }
            boolean A0G = scopeToIntentLauncher.A0G(A00, A0F);
            if (A0G) {
                tjR.resolve(Boolean.valueOf(A0G));
            } else {
                tjR.reject(new RuntimeException(002.A0S("Could not launch activity for '", str, '\'')));
            }
        } catch (Throwable th) {
            C13904TjR.A00(tjR, "Could not open URL '", str, "': ", th);
        }
    }

    public FBLinkingModule(QZK qzk) {
        super(qzk);
    }
}
