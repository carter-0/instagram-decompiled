package X;

import android.util.Log;

/* renamed from: X.TJl  reason: case insensitive filesystem */
public final /* synthetic */ class C13055TJl implements Runnable {
    public final /* synthetic */ C12356Ss2 A00;
    public final /* synthetic */ C13596TdO A01;
    public final /* synthetic */ C390949s6 A02;
    public final /* synthetic */ Throwable A03;

    public /* synthetic */ C13055TJl(C12356Ss2 ss2, C13596TdO tdO, C390949s6 r3, Throwable th) {
        this.A00 = ss2;
        this.A01 = tdO;
        this.A02 = r3;
        this.A03 = th;
    }

    public final void run() {
        String stackTraceString;
        C12356Ss2 ss2 = this.A00;
        C13596TdO tdO = this.A01;
        C390949s6 r3 = this.A02;
        Throwable th = this.A03;
        String str = ss2.A0u;
        if (th == null) {
            stackTraceString = "";
        } else {
            stackTraceString = Log.getStackTraceString(th);
            0qQ.A0A(stackTraceString);
        }
        tdO.DXY(r3, str, stackTraceString, th);
    }
}
