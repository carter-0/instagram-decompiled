package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.PbS  reason: case insensitive filesystem */
public final class C73369PbS implements Runnable {
    public final /* synthetic */ C68966Nbt A00;
    public final /* synthetic */ MsysThreadId A01;
    public final /* synthetic */ C254743sy A02;
    public final /* synthetic */ boolean A03;

    public C73369PbS(C68966Nbt nbt, MsysThreadId msysThreadId, C254743sy r3, boolean z) {
        this.A00 = nbt;
        this.A01 = msysThreadId;
        this.A03 = z;
        this.A02 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.1qK, java.lang.Object] */
    public final void run() {
        C68966Nbt nbt = this.A00;
        1Ng r5 = nbt.A01;
        MsysThreadId msysThreadId = this.A01;
        r5.A00(new 2Kd(msysThreadId));
        if (this.A03) {
            UserSession userSession = nbt.A02;
            0Tu r2 = 0Tu.A05;
            if (182.A06(r2, userSession, 36326214914684515L) && 182.A06(r2, userSession, 36326214914750052L)) {
                r5.A00(new Object());
            }
        }
        nbt.A02(msysThreadId);
    }
}
