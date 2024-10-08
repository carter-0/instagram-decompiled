package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.Map;

/* renamed from: X.Pms  reason: case insensitive filesystem */
public final class C73974Pms extends 0Yg implements 0sP {
    public final /* synthetic */ C53401GnY A00;
    public final /* synthetic */ AnonymousClass7L9 A01;
    public final /* synthetic */ C254933tI A02;
    public final /* synthetic */ ClipInfo A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73974Pms(C53401GnY gnY, AnonymousClass7L9 r3, C254933tI r4, ClipInfo clipInfo, String str, String str2, String str3, String str4) {
        super(1);
        this.A06 = str;
        this.A01 = r3;
        this.A03 = clipInfo;
        this.A05 = str2;
        this.A02 = r4;
        this.A07 = str3;
        this.A00 = gnY;
        this.A04 = str4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map A0y;
        C254743sy r9 = (C254743sy) obj;
        0qQ.A0B(r9, 0);
        String str = this.A06;
        if (str != null) {
            AnonymousClass7L9 r1 = this.A01;
            ClipInfo clipInfo = this.A03;
            String str2 = this.A05;
            if (AnonymousClass7L9.A01(r1, r9)) {
                UserSession userSession = r1.A00;
                if (182.A06(0Tu.A05, userSession, 36315146783820828L)) {
                    C72191OyA A002 = C70171NyP.A00(userSession);
                    MsysThreadId A062 = C66647MaG.A06(r9);
                    AnonymousClass7TF.A1B(A062, 0, clipInfo);
                    Uri A09 = JTQ.A09(clipInfo.A0F);
                    UserSession userSession2 = A002.A00;
                    String str3 = userSession2.A06;
                    long A042 = DbY.A04(AnonymousClass7TF.A0Q(userSession2).BST());
                    String username = AnonymousClass7TF.A0Q(userSession2).getUsername();
                    String A0o = JTP.A0o(AnonymousClass7TF.A0Q(userSession2).A0D());
                    long currentTimeMillis = System.currentTimeMillis();
                    Integer valueOf = Integer.valueOf(clipInfo.A09);
                    Integer valueOf2 = Integer.valueOf(clipInfo.A06);
                    C70728OHx oHx = new C70728OHx(new OGA(new OG9(valueOf, valueOf2, str2, A09.toString(), 4), valueOf, valueOf2, (Long) null, 4), str, (String) null, str3, username, A0o, (String) null, A042, currentTimeMillis);
                    AnonymousClass6FA.A00(userSession2).A00.put(str, str2);
                    long j = A062.A00;
                    Map map = A002.A02;
                    Long valueOf3 = Long.valueOf(j);
                    if (map.containsKey(valueOf3)) {
                        A0y = (Map) map.get(valueOf3);
                        if (A0y != null) {
                            A0y.put(str, oHx);
                        }
                        r1.A02.AvL().E2N();
                    } else {
                        A0y = C66582MXn.A0y(str, oHx);
                    }
                    map.put(valueOf3, A0y);
                    r1.A02.AvL().E2N();
                }
            }
        }
        AnonymousClass7L9 r12 = this.A01;
        AnonymousClass7L7 r5 = r12.A05;
        ClipInfo clipInfo2 = this.A03;
        String str4 = this.A05;
        boolean A1b = C51971G9r.A1b(r12.A07);
        r5.A02(this.A00, this.A02, clipInfo2, str4, str, this.A07, this.A04, A1b);
        return C60340gF.A00;
    }
}
