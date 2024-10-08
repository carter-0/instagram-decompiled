package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.concurrent.Callable;

/* renamed from: X.MAz  reason: case insensitive filesystem */
public final class C66092MAz implements Callable {
    public final /* synthetic */ QP5 A00;
    public final /* synthetic */ C333537Zi A01;
    public final /* synthetic */ C254743sy A02;
    public final /* synthetic */ boolean A03;

    public C66092MAz(QP5 qp5, C333537Zi r2, C254743sy r3, boolean z) {
        this.A01 = r2;
        this.A02 = r3;
        this.A00 = qp5;
        this.A03 = z;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        C70621ODs oDs;
        C333537Zi r3 = this.A01;
        DirectThreadKey A032 = C66647MaG.A03(this.A02);
        QP5 qp5 = this.A00;
        boolean z = this.A03;
        Boolean A0u = AnonymousClass7TE.A0u();
        Context context = r3.A02;
        UserSession userSession = r3.A03;
        1ua A0n = JTO.A0n(context, userSession);
        AnonymousClass7TG.A1Q(qp5, A0n);
        ShareType shareType = ShareType.DIRECT_SHARE;
        AnonymousClass3Q2 r1 = new AnonymousClass3Q2(JTQ.A0Z());
        1iA r5 = 1iA.A0E;
        r1.A0V(r5);
        String str = qp5.A01;
        r1.A2t = str;
        r1.A3L = str;
        r1.A0e(shareType);
        r1.A0V(r5);
        r1.A2s = qp5.A00;
        r1.A3B = qp5.A03;
        r1.A2u = qp5.A02;
        r1.A53 = true;
        r1.A6C = true;
        JTT.A1P(r5, r1, A0n, A0n.A04);
        r1.A0c(AnonymousClass3QD.UPLOADED);
        1ua.A02(r1);
        1ua.A04(r1, A0n, "pre-upload");
        C300925yB A002 = C63326Kv9.A00(r1);
        AnonymousClass3U9 B33 = 2L2.A00(userSession).B33(A032);
        if (B33 != null) {
            oDs = B33.B25();
        } else {
            oDs = null;
        }
        0qQ.A0B(A032, 2);
        1bp r9 = new 1bp(C66669Mac.A01(userSession, oDs, A0u, 1fi.class, (String) null, "direct_file_share", (String) null, z, r3.A00), A032, OQO.A01(userSession, A032), System.currentTimeMillis() * 1000);
        r9.A02 = A002.A06;
        r9.A01 = A032;
        r9.A00 = A002;
        1Ou.A01(userSession).A0A(r9);
        return C60340gF.A00;
    }
}
