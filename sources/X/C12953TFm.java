package X;

import android.app.Activity;
import android.content.Context;
import java.lang.reflect.Field;

/* renamed from: X.TFm  reason: case insensitive filesystem */
public final class C12953TFm implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass195 A01;

    public C12953TFm(Activity activity, AnonymousClass195 r2) {
        this.A01 = r2;
        this.A00 = activity;
    }

    public final void run() {
        Object obj;
        Field field;
        Object obj2;
        Field field2;
        AnonymousClass195 r0 = this.A01;
        C10669Rw3 rw3 = r0.A00;
        if (rw3 == null) {
            rw3 = new C10669Rw3();
            r0.A00 = rw3;
        }
        Context context = r0.A01;
        Activity activity = this.A00;
        if (rw3.A03) {
            try {
                Field field3 = rw3.A02;
                if (field3 != null && (obj = field3.get(activity)) != null && (field = rw3.A01) != null && (obj2 = field.get(obj)) != null && (field2 = rw3.A00) != null) {
                    field2.set(obj2, context);
                }
            } catch (Throwable unused) {
            }
        }
    }
}
