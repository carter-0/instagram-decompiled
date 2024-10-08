package X;

import android.os.Bundle;
import com.bloks.foa.core.lifecycles.impl.NativeLifecycleCallback$NativeCallback;

/* renamed from: X.DiR  reason: case insensitive filesystem */
public abstract class C46646DiR {
    public static final C51893G6j A00(Bundle bundle, String str) {
        Integer num;
        C51893G6j g6j;
        String str2;
        String str3;
        String string = bundle.getString(002.A0R("CALLBACK_TYPE_PREFIX_", str));
        if (string == null) {
            return null;
        }
        if (string.equals("BLOKS")) {
            num = AnonymousClass05K.A00;
        } else if (string.equals("NATIVE")) {
            num = AnonymousClass05K.A01;
        } else {
            throw AnonymousClass7TE.A0w(string);
        }
        if (num.intValue() != 0) {
            NativeLifecycleCallback$NativeCallback nativeLifecycleCallback$NativeCallback = (NativeLifecycleCallback$NativeCallback) bundle.getParcelable(str);
            g6j = null;
            if (nativeLifecycleCallback$NativeCallback != null) {
                g6j = new FRH(nativeLifecycleCallback$NativeCallback);
            } else {
                str2 = "NativeLifecycleCallback";
                str3 = "Retrieved a null NativeCallback from the Bundle.";
                1Kn.A02(str2, str3);
            }
        } else {
            C46620Di0 di0 = (C46620Di0) C14615TzM.A02(C46620Di0.class, Integer.valueOf(bundle.getInt(str, -1)));
            g6j = null;
            if (di0 != null) {
                g6j = new FRG(di0);
            } else {
                str2 = "BloksLifecycleCallback";
                str3 = "Retrieved a null ActionParseResult from the Bundle.";
                1Kn.A02(str2, str3);
            }
        }
        return g6j;
    }

    public static final void A01(Bundle bundle, C51893G6j g6j, String str) {
        String str2;
        if (g6j != null) {
            g6j.Ezo(str, bundle);
            String A0R = 002.A0R("CALLBACK_TYPE_PREFIX_", str);
            if (g6j.CAj().intValue() != 0) {
                str2 = "NATIVE";
            } else {
                str2 = "BLOKS";
            }
            bundle.putString(A0R, str2);
        }
    }
}
