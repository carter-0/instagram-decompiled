package X;

import android.text.Editable;

public final class U20 extends Editable.Factory {
    public static Class A00;
    public static final Object A01 = new Object();
    public static volatile Editable.Factory A02;

    public final Editable newEditable(CharSequence charSequence) {
        Class cls = A00;
        if (cls != null) {
            return new C267104ay(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }

    public U20() {
        try {
            A00 = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, Pxf.A0W(this));
        } catch (Throwable unused) {
        }
    }
}
