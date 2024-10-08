package X;

import android.content.Context;

/* renamed from: X.7ng  reason: invalid class name and case insensitive filesystem */
public abstract class C341887ng {
    public static C341897nh A00(Context context, boolean z) {
        try {
            Class<?> cls = Class.forName("com.facebook.cameracore.camerasdk.optic.arcore.PreviewSetupDelegateImpl");
            Class cls2 = Boolean.TYPE;
            return (C341897nh) cls.getConstructor(new Class[]{Context.class, cls2, cls2}).newInstance(new Object[]{context, false, Boolean.valueOf(z)});
        } catch (Exception unused) {
            return C341897nh.A01;
        }
    }
}
