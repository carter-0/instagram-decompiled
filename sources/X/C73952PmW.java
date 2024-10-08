package X;

import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.List;
import java.util.Map;

/* renamed from: X.PmW  reason: case insensitive filesystem */
public final class C73952PmW extends 0Yg implements 0sP {
    public final /* synthetic */ AnonymousClass7L9 A00;
    public final /* synthetic */ C254933tI A01;
    public final /* synthetic */ C63822L8d A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73952PmW(AnonymousClass7L9 r2, C254933tI r3, C63822L8d l8d, String str, String str2) {
        super(1);
        this.A03 = str;
        this.A00 = r2;
        this.A02 = l8d;
        this.A04 = str2;
        this.A01 = r3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Map A0y;
        C254743sy r8 = (C254743sy) obj;
        0qQ.A0B(r8, 0);
        String str = this.A03;
        if (str != null) {
            AnonymousClass7L9 r1 = this.A00;
            C63822L8d l8d = this.A02;
            if (AnonymousClass7L9.A01(r1, r8) && !r1.A09) {
                UserSession userSession = r1.A00;
                if (182.A06(0Tu.A05, userSession, 36315146783951902L)) {
                    C72191OyA A002 = C70171NyP.A00(userSession);
                    MsysThreadId A06 = C66647MaG.A06(r8);
                    0qQ.A0B(A06, 0);
                    Uri A09 = JTQ.A09(l8d.A01);
                    UserSession userSession2 = A002.A00;
                    String str2 = userSession2.A06;
                    long A042 = DbY.A04(AnonymousClass7TF.A0Q(userSession2).BST());
                    C70728OHx oHx = new C70728OHx(new OGA(new OG9((Integer) null, (Integer) null, (String) null, A09.toString(), 5), (Integer) null, (Integer) null, DbS.A0j(l8d.A00), 5), str, (String) null, str2, AnonymousClass7TF.A0Q(userSession2).getUsername(), JTP.A0o(AnonymousClass7TF.A0Q(userSession2).A0D()), (String) null, A042, System.currentTimeMillis());
                    MYd A003 = AnonymousClass6FA.A00(userSession2);
                    A003.A00.put(str, DbT.A10(A09));
                    long j = A06.A00;
                    Map map = A002.A02;
                    Long valueOf = Long.valueOf(j);
                    if (map.containsKey(valueOf)) {
                        A0y = (Map) map.get(valueOf);
                        if (A0y != null) {
                            A0y.put(str, oHx);
                        }
                        r1.A02.AvL().E2N();
                    } else {
                        A0y = C66582MXn.A0y(str, oHx);
                    }
                    map.put(valueOf, A0y);
                    r1.A02.AvL().E2N();
                }
            }
        }
        AnonymousClass7L7 r4 = this.A00.A05;
        C63822L8d l8d2 = this.A02;
        String str3 = this.A04;
        C254933tI r12 = this.A01;
        C254743sy r13 = (C254743sy) r4.A07.invoke();
        if (r13 != null) {
            if (182.A06(0Tu.A05, r4.A01, 36324033071427270L)) {
                try {
                    C333547Zj r11 = r4.A03;
                    List list = (List) r4.A05.invoke();
                    boolean A1b = C51971G9r.A1b(r4.A04);
                    if (str3 == null) {
                        str3 = r4.A02.A00();
                    }
                    r11.EN5(r12, r13, l8d2, str3, (String) null, str, list, A1b);
                } catch (Exception e) {
                    0wb.A07("DirectSendController_sendVoiceSync", e);
                    r4.A06.invoke();
                }
            } else {
                C333547Zj r112 = r4.A03;
                List list2 = (List) r4.A05.invoke();
                boolean A1b2 = C51971G9r.A1b(r4.A04);
                if (str3 == null) {
                    str3 = r4.A02.A00();
                }
                R20.A01(new OrA(new C73934PmE(r4, 15)), r112.EN4(r12, r13, l8d2, str3, (String) null, str, list2, A1b2), C73443Pcl.A00);
            }
        }
        return C60340gF.A00;
    }
}
