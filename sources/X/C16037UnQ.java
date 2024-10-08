package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.List;

/* renamed from: X.UnQ  reason: case insensitive filesystem */
public final class C16037UnQ extends U8P {
    public boolean A00;
    public final 2Fk A01;
    public final 2Fk A02;
    public final 2Fk A03;
    public final UserSession A04;
    public final WYW A05;
    public final C17831Vgk A06;
    public final String A07;
    public final 05G A08;
    public final 05G A09;
    public final 05G A0A;
    public final boolean A0B;
    public final boolean A0C;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C16037UnQ(C319836rJ r15, UserSession userSession, ImageUrl imageUrl, WYW wyw) {
        this();
        String str;
        List list;
        Integer num;
        CsW csW;
        String str2;
        ImageUrl imageUrl2 = imageUrl;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        this.A04 = userSession2;
        WYW wyw2 = wyw;
        this.A05 = wyw2;
        Object A002 = r15.A00("formID");
        if (A002 != null) {
            this.A07 = (String) A002;
            boolean z = false;
            boolean A1X = AnonymousClass7TG.A1X((Boolean) r15.A00("submission_successful"));
            this.A06 = new C17831Vgk(wyw2, C13991Tnr.A0f(r15), this.A07);
            this.A0C = C13991Tnr.A1X(r15, "is_from_lead_ad_activity");
            Boolean bool = (Boolean) r15.A00("is_bottom_sheet_flow");
            this.A0B = bool != null ? bool.booleanValue() : z;
            AnonymousClass7TF.A1O(this.A0A, A1X);
            C18027Vk5 A003 = C18544Vtw.A01.A00(this.A07);
            if (A003 == null) {
                C13991Tnr.A1L(this, C318116oQ.A00(this), 14);
                return;
            }
            int A012 = DbX.A01((Number) r15.A00("advertiserFollowerCount"));
            C45385CvR cvR = A003.A00.A03;
            05G r3 = this.A09;
            String str3 = A003.A00().A01;
            ImageUrl imageUrl3 = A003.A00().A00;
            C16643Uyf uyf = null;
            if (cvR != null) {
                str = cvR.A03;
            } else {
                str = null;
            }
            C266444Yx A013 = W33.A01(str);
            if (cvR != null) {
                list = 00k.A0a(cvR.A00);
            } else {
                list = 0sn.A00;
            }
            if ((cvR != null ? cvR.A02 : uyf) == C16643Uyf.LIST_STYLE) {
                num = AnonymousClass05K.A01;
            } else {
                num = AnonymousClass05K.A00;
            }
            if (!(cvR == null || (csW = cvR.A01) == null || (str2 = csW.A00) == null)) {
                imageUrl2 = new SimpleImageUrl(str2);
            }
            r3.Epw(new C15027UKg(A013, imageUrl3, imageUrl2, num, str3, list, A012, 0, false));
            this.A00 = A003.A02();
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public C16037UnQ() {
        02z A012 = 106.A01((Object) null);
        this.A09 = A012;
        19B r1 = 19B.A00;
        this.A02 = C226292g8.A00(r1, A012);
        02z A10 = C51970G9q.A10(false);
        this.A0A = A10;
        this.A03 = C226292g8.A00(r1, A10);
        02z A013 = 106.A01((Object) null);
        this.A08 = A013;
        this.A01 = C226292g8.A00(r1, A013);
    }
}
