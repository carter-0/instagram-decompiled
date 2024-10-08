package X;

import android.content.Context;

/* renamed from: X.4Di  reason: invalid class name and case insensitive filesystem */
public final class C262344Di implements C253183qL {
    public final C244503bI A00;
    public final AnonymousClass2WF A01 = new Object();

    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        0qQ.A0B(context, 0);
        AnonymousClass2WF r2 = this.A01;
        r2.A00 = context;
        try {
            return this.A00.ADL(r2, obj, obj3);
        } finally {
            r2.A00 = null;
        }
    }

    public final Class CAe() {
        return this.A00.getClass();
    }

    public final boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return this.A00.Ete(obj, obj2, obj3, obj4);
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        C246263eI r8 = (C246263eI) obj4;
        0qQ.A0B(context, 0);
        AnonymousClass2WF r2 = this.A01;
        r2.A00 = context;
        if (r8 != null) {
            try {
                r8.A00.invoke();
            } catch (Throwable th) {
                r2.A00 = null;
                throw th;
            }
        }
        r2.A00 = null;
    }

    public final String getDescription() {
        return 002.A0R("binder:", this.A00.getDescription());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.2WF, java.lang.Object] */
    public C262344Di(C244503bI r2) {
        this.A00 = r2;
    }
}
