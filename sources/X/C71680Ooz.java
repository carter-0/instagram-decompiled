package X;

import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.instagram.direct.msys.reverb.ReverbMessage;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Ooz  reason: case insensitive filesystem */
public final class C71680Ooz implements MailboxCallback {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        int i;
        Object obj2 = obj;
        if (this.A00 != 0) {
            List list = ((C70546OAu) obj2).A00;
            ArrayList A1C = AnonymousClass7TE.A1C();
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                Object obj3 = list.get(i2);
                0qQ.A0C(obj3, "null cannot be cast to non-null type com.instagram.direct.msys.reverb.ReverbMessage");
                ONE one = ((OKF) this.A05).A00;
                long j = this.A01;
                Object obj4 = one.A00((C331237Qc) this.A04, (ReverbMessage) obj3, j, false).A00;
                if (obj4 != null) {
                    A1C.add(obj4);
                }
            }
            0sP r2 = (0sP) this.A02;
            if (A1C.size() < DbS.A05(this.A03)) {
                i = 10028;
            } else {
                i = null;
            }
            r2.invoke(AnonymousClass7TE.A1L(A1C, i));
            return;
        }
        C71726Opk A002 = C71726Opk.A00(this, 53);
        AnonymousClass681 r0 = C68313NAa.A00;
        MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj2, (MailboxFutureImpl) this.A03, false, 0, 1, "MCAMailboxShim", "SHIMTransportHybridMoveIgFolder", A002);
    }

    public C71680Ooz(int i, long j, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj;
        this.A01 = j;
        this.A05 = obj3;
        this.A04 = obj4;
    }
}
