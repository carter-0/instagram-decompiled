package com.facebook.react.modules.appearance;

import X.0qQ;
import X.2X1;
import X.C13437TaP;
import X.C9535RcY;
import X.JTR;
import X.Pxe;
import X.Pxf;
import X.QZK;
import android.content.Context;
import com.facebook.fbreact.specs.NativeAppearanceSpec;
import com.facebook.react.bridge.WritableNativeMap;
import com.facebook.react.module.annotations.ReactModule;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ReactModule(name = "Appearance")
public final class AppearanceModule extends NativeAppearanceSpec {
    public static final String APPEARANCE_CHANGED_EVENT_NAME = "appearanceChanged";
    public static final C9535RcY Companion = new Object();
    public static final String NAME = "Appearance";
    public String lastEmittedColorScheme;
    public final C13437TaP overrideColorScheme;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AppearanceModule(QZK qzk, C13437TaP taP) {
        super(qzk);
        0qQ.A0B(qzk, 1);
        this.overrideColorScheme = taP;
    }

    public void addListener(String str) {
    }

    public final void onConfigurationChanged(Context context) {
        0qQ.A0B(context, 0);
        String colorSchemeForCurrentConfiguration = colorSchemeForCurrentConfiguration(context);
        if (!0qQ.A0K(this.lastEmittedColorScheme, colorSchemeForCurrentConfiguration)) {
            this.lastEmittedColorScheme = colorSchemeForCurrentConfiguration;
            emitAppearanceChanged(colorSchemeForCurrentConfiguration);
        }
    }

    public void removeListeners(double d) {
    }

    public final void emitAppearanceChanged(String str) {
        0qQ.A0B(str, 0);
        WritableNativeMap A0U = Pxe.A0U();
        A0U.putString("colorScheme", str);
        QZK reactApplicationContextIfActiveOrWarn = getReactApplicationContextIfActiveOrWarn();
        if (reactApplicationContextIfActiveOrWarn != null) {
            reactApplicationContextIfActiveOrWarn.A0E(APPEARANCE_CHANGED_EVENT_NAME, A0U);
        }
    }

    private final String colorSchemeForCurrentConfiguration(Context context) {
        int i = Pxf.A0G(context).uiMode & 48;
        if (i == 16 || i != 32) {
            return "light";
        }
        return "dark";
    }

    public String getColorScheme() {
        Context A00 = Pxe.A0T(this).A00();
        if (A00 == null) {
            A00 = Pxe.A0T(this);
        }
        Context context = A00;
        0qQ.A0A(context);
        return colorSchemeForCurrentConfiguration(context);
    }

    public void setColorScheme(String str) {
        int i;
        int A0F = JTR.A0F(str);
        if (A0F != -1626174665) {
            if (A0F != 3075958) {
                if (A0F == 102970646 && str.equals("light")) {
                    i = 1;
                } else {
                    return;
                }
            } else if (str.equals("dark")) {
                i = 2;
            } else {
                return;
            }
        } else if (str.equals("unspecified")) {
            i = -1;
        } else {
            return;
        }
        2X1.A01(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AppearanceModule(QZK qzk, C13437TaP taP, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(qzk, (i & 2) != 0 ? null : taP);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AppearanceModule(QZK qzk) {
        this(qzk, (C13437TaP) null);
        0qQ.A0B(qzk, 1);
    }
}
