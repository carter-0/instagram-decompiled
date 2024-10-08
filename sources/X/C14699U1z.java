package X;

import android.text.Editable;

/* renamed from: X.U1z  reason: case insensitive filesystem */
public final class C14699U1z extends Editable.Factory {
    public static Class A00;
    public static final Object A01 = new Object();
    public static volatile Editable.Factory A02;

    public final Editable newEditable(CharSequence charSequence) {
        Class cls = A00;
        if (cls != null) {
            return new Q8H(charSequence, cls);
        }
        return super.newEditable(charSequence);
    }

    public C14699U1z() {
        try {
            A00 = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, Pxf.A0W(this));
        } catch (Throwable unused) {
        }
    }
}
