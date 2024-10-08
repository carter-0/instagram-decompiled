package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebookpay.logging.LoggingContext;
import com.instagram.common.session.UserSession;
import com.instagram.rtc.signaling.models.RtcConnectionEntity;
import com.instagram.user.model.User;
import java.util.LinkedHashMap;
import java.util.List;

/* renamed from: X.Pmi  reason: case insensitive filesystem */
public final class C73964Pmi extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Integer num;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                boolean A1a = AnonymousClass7TE.A1a(obj);
                C12411Sto A0g = C51965G9l.A0g();
                QDN qdn = (QDN) this.A03;
                LoggingContext loggingContext = qdn.A1P;
                String str = this.A05;
                Long l = (Long) this.A01;
                C21267XRm xRm = (C21267XRm) this.A02;
                SEB A032 = qdn.A1Q.A03();
                String str2 = this.A04;
                LinkedHashMap A0m = C66583MXo.A0m(A032, A1a);
                if (str2 != null) {
                    A0m.put(Pxd.A00(873), str2);
                }
                A0g.A0D(xRm, loggingContext, l, str, A0m);
                break;
            case 1:
                0qQ.A0B(obj, 0);
                ((0sI) this.A02).invoke(obj2, this.A05, this.A04, this.A01, this.A03);
                break;
            case 2:
                String str3 = this.A05;
                ((AnonymousClass7L9) this.A03).A05.A04((C53401GnY) this.A02, str3, this.A04, (List) this.A01);
                break;
            case 3:
                boolean A1a2 = AnonymousClass7TE.A1a(obj);
                1XB r3 = ((1XE) this.A03).A04;
                C331537Rj r2 = C331537Rj.PUSH_NOTIFICATION;
                String str4 = ((UserSession) this.A02).A06;
                RtcConnectionEntity.RtcCallConnectionEntity rtcCallConnectionEntity = (RtcConnectionEntity.RtcCallConnectionEntity) this.A01;
                String str5 = rtcCallConnectionEntity.A0J;
                String str6 = this.A05;
                String str7 = this.A04;
                String str8 = rtcCallConnectionEntity.A0H;
                if (A1a2) {
                    num = AnonymousClass05K.A0j;
                } else {
                    num = AnonymousClass05K.A0u;
                }
                1XC.A00(1XB.A01(r2, r3, num, str4, (String) null, str8, str5, str6, str7, (String) null), str4);
                break;
            default:
                NAY nay = (NAY) obj2;
                0qQ.A0B(nay, 0);
                String str9 = this.A04;
                Long BST = ((User) this.A02).BST();
                if (BST != null) {
                    long longValue = BST.longValue();
                    String str10 = this.A05;
                    C71721Opf opf = new C71721Opf(44, (0sP) this.A01);
                    AnonymousClass68L A0I = C66581MXm.A0I(nay);
                    MailboxFutureImpl A0J = C66581MXm.A0J(A0I, opf);
                    C66582MXn.A1E(A0I, new C71670Oop(nay, A0J, str9, str10, (List) this.A03, longValue), A0J);
                    break;
                } else {
                    throw AnonymousClass7TE.A0y();
                }
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73964Pmi(Object obj, Object obj2, Object obj3, String str, String str2, int i) {
        super(1);
        this.A00 = i;
        this.A03 = obj;
        this.A05 = str;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A04 = str2;
    }
}
