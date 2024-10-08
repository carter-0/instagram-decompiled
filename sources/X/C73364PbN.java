package X;

import com.facebook.msys.mca.MailboxCallback;

/* renamed from: X.PbN  reason: case insensitive filesystem */
public final class C73364PbN implements Runnable {
    public final /* synthetic */ C72939PPx A00;
    public final /* synthetic */ 0Jv A01;
    public final /* synthetic */ 0r1 A02;
    public final /* synthetic */ boolean A03;

    public C73364PbN(C72939PPx pPx, 0Jv r2, 0r1 r3, boolean z) {
        this.A02 = r3;
        this.A00 = pPx;
        this.A03 = z;
        this.A01 = r2;
    }

    public final void run() {
        0r1 r1 = this.A02;
        if (!r1.A00) {
            r1.A00 = true;
            C72939PPx pPx = this.A00;
            02m r4 = pPx.A02;
            if (r4 != null) {
                int A002 = C72939PPx.A00(pPx);
                short s = 2;
                if (this.A03) {
                    s = 113;
                }
                r4.markerEnd(755177991, A002, s);
            }
            pPx.A02 = null;
            AnonymousClass65S r0 = pPx.A0M;
            if (r0 != null) {
                r0.A01();
            }
            C72939PPx.A02(pPx);
            MailboxCallback mailboxCallback = pPx.A0E;
            if (mailboxCallback != null) {
                mailboxCallback.onCompletion(DbT.A0l(this.A03));
            }
            this.A01.AId((Object) null);
        }
    }
}
