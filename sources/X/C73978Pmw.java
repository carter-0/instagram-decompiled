package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.Map;

/* renamed from: X.Pmw  reason: case insensitive filesystem */
public final class C73978Pmw extends 0Yg implements 0sP {
    public final /* synthetic */ C53401GnY A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ AnonymousClass7L9 A02;
    public final /* synthetic */ C254933tI A03;
    public final /* synthetic */ AnonymousClass3Q2 A04;
    public final /* synthetic */ C352218Cl A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73978Pmw(C53401GnY gnY, UserSession userSession, AnonymousClass7L9 r4, C254933tI r5, AnonymousClass3Q2 r6, C352218Cl r7, String str, String str2, String str3) {
        super(1);
        this.A07 = str;
        this.A02 = r4;
        this.A01 = userSession;
        this.A05 = r7;
        this.A03 = r5;
        this.A08 = str2;
        this.A04 = r6;
        this.A00 = gnY;
        this.A06 = str3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map A0y;
        C254743sy r8 = (C254743sy) obj;
        0qQ.A0B(r8, 0);
        String str = this.A07;
        if (str != null) {
            AnonymousClass7L9 r4 = this.A02;
            UserSession userSession = this.A01;
            C352218Cl r1 = this.A05;
            if (AnonymousClass7L9.A01(r4, r8) && 182.A06(0Tu.A05, userSession, 36315146783755291L)) {
                C72191OyA A002 = C70171NyP.A00(userSession);
                MsysThreadId A062 = C66647MaG.A06(r8);
                0qQ.A0B(A062, 0);
                Uri fromFile = Uri.fromFile(r1.A03());
                UserSession userSession2 = A002.A00;
                String str2 = userSession2.A06;
                long A042 = DbY.A04(AnonymousClass7TF.A0Q(userSession2).BST());
                C70728OHx oHx = new C70728OHx(new OGA(new OG9(Integer.valueOf(r1.A09), Integer.valueOf(r1.A06), fromFile.toString(), fromFile.toString(), 2), Integer.valueOf(r1.A09), Integer.valueOf(r1.A06), (Long) null, 2), str, (String) null, str2, AnonymousClass7TF.A0Q(userSession2).getUsername(), JTP.A0o(AnonymousClass7TF.A0Q(userSession2).A0D()), (String) null, A042, System.currentTimeMillis());
                MYd A003 = AnonymousClass6FA.A00(userSession2);
                A003.A00.put(str, DbT.A10(fromFile));
                long j = A062.A00;
                Map map = A002.A02;
                Long valueOf = Long.valueOf(j);
                if (map.containsKey(valueOf)) {
                    A0y = (Map) map.get(valueOf);
                    if (A0y != null) {
                        A0y.put(str, oHx);
                    }
                    r4.A02.AvL().E2N();
                } else {
                    A0y = C66582MXn.A0y(str, oHx);
                }
                map.put(valueOf, A0y);
                r4.A02.AvL().E2N();
            }
        }
        AnonymousClass7L7 r5 = this.A02.A05;
        C352218Cl r9 = this.A05;
        C254933tI r7 = this.A03;
        String str3 = this.A08;
        r5.A03(this.A00, r7, this.A04, r9, str, str3, this.A06);
        return C60340gF.A00;
    }
}
