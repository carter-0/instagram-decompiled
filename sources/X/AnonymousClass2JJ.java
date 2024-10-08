package X;

import android.content.Context;

/* renamed from: X.2JJ  reason: invalid class name */
public abstract class AnonymousClass2JJ {
    public static 2JI A00(Context context) {
        AnonymousClass2JN r1;
        synchronized (AnonymousClass2JK.class) {
            r1 = AnonymousClass2JK.A00;
            if (r1 == null) {
                Context applicationContext = context.getApplicationContext();
                if (applicationContext != null) {
                    context = applicationContext;
                }
                r1 = new AnonymousClass2JM(new AnonymousClass2JL(context));
                AnonymousClass2JK.A00 = r1;
            }
        }
        return (2JI) ((AnonymousClass2JM) r1).A00.FP1();
    }
}
