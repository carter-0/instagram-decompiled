package X;

import android.os.Bundle;
import java.io.Serializable;
import java.util.ArrayList;

/* renamed from: X.3yR  reason: invalid class name and case insensitive filesystem */
public abstract class C258083yR {
    public static Serializable A00(Bundle bundle) {
        return bundle.getSerializable(AnonymousClass000.A00(1098), C69287Nin.class);
    }

    public static Object A01(Bundle bundle, Class cls, String str) {
        return bundle.getParcelable(str, cls);
    }

    public static ArrayList A02(Bundle bundle, Class cls, String str) {
        return bundle.getParcelableArrayList(str, cls);
    }
}
