package com.instagram.react.modules.product;

import X.0gy;
import X.0lg;
import X.1ES;
import X.AnonymousClass07i;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C18773W0w;
import X.C229382nI;
import X.C359988do;
import X.C360678ey;
import X.E86;
import X.JTR;
import X.Pxe;
import X.QZK;
import X.T66;
import X.TKR;
import android.app.Activity;
import android.util.SparseArray;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fbreact.specs.NativeIGBloksNavigationReactModuleSpec;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

@ReactModule(name = "IGBloksNavigationReactModule")
public class IgReactBloksNavigationModule extends NativeIGBloksNavigationReactModuleSpec {
    public static final String MODULE_NAME = "IGBloksNavigationReactModule";
    public 0lg mSession;

    public String getName() {
        return "IGBloksNavigationReactModule";
    }

    @ReactMethod
    public void navigate(double d, String str, String str2, ReadableMap readableMap) {
        Activity A00 = Pxe.A0T(this).A00();
        if (A00 != null && (A00 instanceof FragmentActivity)) {
            C18773W0w.A01(new TKR(A00, this, str, str2, parseParams(readableMap)));
        }
    }

    private HashMap parseParams(ReadableMap readableMap) {
        HashMap A1E;
        if (readableMap != null) {
            A1E = readableMap.toHashMap();
        } else {
            A1E = AnonymousClass7TE.A1E();
        }
        HashMap A1E2 = AnonymousClass7TE.A1E();
        Iterator A0s = AnonymousClass7TF.A0s(A1E);
        while (A0s.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
            if (A1J.getValue() instanceof String) {
                JTR.A1U(A1E2, A1J);
            }
        }
        return A1E2;
    }

    public IgReactBloksNavigationModule(QZK qzk, 0lg r2) {
        super(qzk);
        this.mSession = r2;
    }

    @ReactMethod
    public void runAction(double d, String str, ReadableMap readableMap) {
        FragmentActivity A00 = Pxe.A0T(this).A00();
        C229382nI A01 = C229382nI.A01((SparseArray) null, A00, new T66(this), this.mSession);
        HashMap parseParams = parseParams(readableMap);
        Activity A002 = Pxe.A0T(this).A00();
        0gy A003 = AnonymousClass07i.A00(A00);
        C360678ey A04 = C359988do.A04(this.mSession, str, parseParams);
        A04.A00(new E86(14, (Object) this, (Object) A01));
        1ES.A00(A002, A003, A04);
    }
}
