package X;

import android.util.Log;

/* renamed from: X.WGl  reason: case insensitive filesystem */
public final class C19010WGl implements 1T7 {
    public final /* synthetic */ VLZ A00;
    public final /* synthetic */ C16784V5r A01;

    public C19010WGl(VLZ vlz, C16784V5r v5r) {
        this.A00 = vlz;
        this.A01 = v5r;
    }

    public final void EG8(C240533Lg r5, Throwable th) {
        String str;
        String stackTraceString;
        Object A012 = r5.A01();
        if (A012 != null) {
            str = C66581MXm.A0y(A012);
        } else {
            str = "<value is null>";
        }
        Integer valueOf = Integer.valueOf(System.identityHashCode(this));
        Integer valueOf2 = Integer.valueOf(System.identityHashCode(r5));
        if (th == null) {
            stackTraceString = "";
        } else {
            stackTraceString = Log.getStackTraceString(th);
        }
        0I1.A09("Fresco", "Finalized without closing: %x %x (type = %s).\nStack:\n%s", new Object[]{valueOf, valueOf2, str, stackTraceString});
    }
}
