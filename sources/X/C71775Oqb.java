package X;

import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.Execution;

/* renamed from: X.Oqb  reason: case insensitive filesystem */
public final class C71775Oqb implements C13775Tgq {
    public final /* synthetic */ C70627ODy A00;

    public final void DET(int i, String str) {
        0qQ.A0B(str, 1);
        Execution.executeAsync(new C68355NBr(this.A00.A01, str, i), (AccountSession) null, 3);
    }

    public C71775Oqb(C70627ODy oDy) {
        this.A00 = oDy;
    }

    public final void Dat(int i) {
        Execution.executeAsync(new C68345NBg(this.A00.A01, i), (AccountSession) null, 3);
    }

    public final void onSuccess(int i) {
        Execution.executeAsync(new C68344NBf(this.A00.A01, i), (AccountSession) null, 3);
    }
}
