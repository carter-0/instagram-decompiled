package com.facebook.react.uimanager;

import X.002;
import X.AnonymousClass7TE;
import X.C13774Tgp;
import X.C20877X2e;
import X.C7372Q9d;
import X.DbW;
import X.Q6H;
import X.QZL;
import X.TQR;
import X.X9N;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.ReactSoftExceptionLogger;

public final class UIManagerHelper {
    public static C20877X2e A05(Q6H q6h, int i) {
        int i2 = 2;
        if (i % 2 != 0) {
            i2 = 1;
        }
        C20877X2e A04 = A04(q6h, i2);
        if (A04 == null) {
            ReactSoftExceptionLogger.logSoftException("com.facebook.react.uimanager.UIManagerHelper", DbW.A0b("Cannot get EventDispatcher for reactTag ", i));
        }
        return A04;
    }

    public static int A00(Context context) {
        if (context instanceof QZL) {
            return ((QZL) context).A00;
        }
        return -1;
    }

    public static int A01(View view) {
        if (view instanceof C13774Tgp) {
            C7372Q9d q9d = (C7372Q9d) ((C13774Tgp) view);
            if (q9d.A02 == 2) {
                return q9d.A01;
            }
            return -1;
        }
        int id = view.getId();
        if (id % 2 != 0) {
            return -1;
        }
        Context context = view.getContext();
        if (!(context instanceof QZL) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        int A00 = A00(context);
        if (A00 == -1) {
            ReactSoftExceptionLogger.logSoftException("com.facebook.react.uimanager.UIManagerHelper", AnonymousClass7TE.A0z(002.A0c("Fabric View [", "] does not have SurfaceId associated with it", id)));
        }
        return A00;
    }

    public static Q6H A02(View view) {
        Context context = view.getContext();
        if (!(context instanceof Q6H) && (context instanceof ContextWrapper)) {
            context = ((ContextWrapper) context).getBaseContext();
        }
        return (Q6H) context;
    }

    public static X9N A03(Q6H q6h, int i, boolean z) {
        if (q6h.A0I()) {
            X9N A04 = q6h.A04();
            if (A04 != null) {
                return A04;
            }
            TQR.A00("Cannot get UIManager because the instance hasn't been initialized yet.", "com.facebook.react.uimanager.UIManagerHelper");
            return null;
        } else if (!q6h.A0G()) {
            TQR.A00("Cannot get UIManager because the context doesn't contain a CatalystInstance.", "com.facebook.react.uimanager.UIManagerHelper");
            return null;
        } else {
            if (!q6h.A0F()) {
                TQR.A00("Cannot get UIManager because the context doesn't contain an active CatalystInstance.", "com.facebook.react.uimanager.UIManagerHelper");
                if (z) {
                    return null;
                }
            }
            CatalystInstance A01 = q6h.A01();
            if (i != 2) {
                return (X9N) A01.getNativeModule(UIManagerModule.class);
            }
            try {
                return q6h.A04();
            } catch (IllegalArgumentException unused) {
                TQR.A00(002.A0O("Cannot get UIManager for UIManagerType: ", i), "com.facebook.react.uimanager.UIManagerHelper");
                return (X9N) A01.getNativeModule(UIManagerModule.class);
            }
        }
    }

    public static C20877X2e A04(Q6H q6h, int i) {
        if (q6h.A0I()) {
            throw AnonymousClass7TE.A11("getEventDispatcher");
        }
        X9N A03 = A03(q6h, i, false);
        if (A03 == null) {
            TQR.A00(002.A0O("Unable to find UIManager for UIManagerType ", i), "com.facebook.react.uimanager.UIManagerHelper");
            return null;
        }
        C20877X2e x2e = ((UIManagerModule) A03).mEventDispatcher;
        if (x2e != null) {
            return x2e;
        }
        ReactSoftExceptionLogger.logSoftException("com.facebook.react.uimanager.UIManagerHelper", DbW.A0b("Cannot get EventDispatcher for UIManagerType ", i));
        return x2e;
    }
}
