package X;

import android.content.Context;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* renamed from: X.Xxe  reason: case insensitive filesystem */
public abstract class C22224Xxe implements C22556YAg {
    public static ThreadLocal A00 = new Y5O();
    public static final C21384XZr A01 = new C21384XZr(new C22150XwF());
    public static volatile Context A02;

    public static Context A00() {
        if (A02 == null) {
            int i = 0;
            while (A02 == null) {
                try {
                    Thread.sleep(1);
                    i++;
                    if (i >= 5 && A02 == null) {
                        throw AnonymousClass7TE.A0z("Application is Null, was FbInjector.setApplication() called?");
                    }
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return A02;
    }

    public static C22224Xxe get(Context context) {
        Object Cg0;
        C21384XZr xZr = A01;
        WeakHashMap weakHashMap = xZr.A01;
        Reference reference = (Reference) weakHashMap.get(context);
        if (reference == null || (Cg0 = reference.get()) == null) {
            Cg0 = xZr.A00.Cg0(context);
            synchronized (xZr) {
                weakHashMap.put(context, new WeakReference(Cg0));
            }
        }
        return (C22224Xxe) Cg0;
    }
}
