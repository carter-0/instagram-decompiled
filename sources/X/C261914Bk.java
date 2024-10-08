package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: X.4Bk  reason: invalid class name and case insensitive filesystem */
public final class C261914Bk extends Handler {
    public final /* synthetic */ AnonymousClass43O A00;

    public final void handleMessage(Message message) {
        int i;
        1XR r0;
        C268654dm r02;
        Throwable A01;
        int A002;
        1XR r03;
        0qQ.A0B(message, 0);
        if (message.what == 2) {
            AnonymousClass43O r2 = this.A00;
            Object obj = message.obj;
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.realtime.snapshot.BaseSnapshotRequestManager.SnapshotHttpRequest<*>");
            AnonymousClass659 r3 = (AnonymousClass659) obj;
            0qQ.A0B(r3, 0);
            if (r3.A02 != null) {
                C268654dm r04 = r3.A01;
                if (r04 == null || (r03 = (1XR) r04.A00()) == null) {
                    i = 0;
                } else {
                    i = r03.getStatusCode();
                }
                r3.A02 = null;
                boolean A003 = C370788x4.A00(i);
                if (i == 200 || A003) {
                    r2.A0B.remove(r3);
                    AnonymousClass433 r05 = r2.A0A;
                    r05.A01 = 0;
                    r05.A00 = 0;
                    if (A003) {
                        C268654dm r06 = r3.A01;
                        if (!(r06 == null || (r0 = (1XR) r06.A00()) == null || r0.getStatusCode() != 200 || (r02 = r3.A01) == null || (A01 = r02.A01()) == null)) {
                            0KC.A0F(C273654mx.A00(1203), "failed to fetch snapshot", A01);
                            if ((A01 instanceof C69248NiA) || (A01 instanceof NullPointerException)) {
                                1Zp A004 = ((1Zn) r2.A0C.getValue()).A00(AnonymousClass05K.A04, 817891655, 0, false);
                                A004.A05(A01);
                                A004.A00();
                            }
                        }
                        r3.A02();
                    } else {
                        r3.A04();
                    }
                } else if (!C61970qY.A0F(r2.A01) || ((A002 = r3.A00()) != -1 && r3.A00 >= A002)) {
                    r2.A0B.remove(r3);
                    AnonymousClass433 r07 = r2.A0A;
                    r07.A01 = 0;
                    r07.A00 = 0;
                    r3.A07(true);
                } else {
                    r3.A07(false);
                    r2.A0A.A00();
                }
            }
        }
        this.A00.A08();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C261914Bk(Looper looper, AnonymousClass43O r2) {
        super(looper);
        this.A00 = r2;
    }
}
