package X;

import android.widget.ImageView;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.GvT  reason: case insensitive filesystem */
public final class C53862GvT extends C251343mx {
    public final float A00;
    public final int A01;
    public final C267324bN A02;
    public final C52058GDe A03;
    public final UserSession A04;
    public final 1Xj A05;
    public final JTB A06;
    public final float A07;
    public final 2WX A08;
    public final AnonymousClass4DU A09;
    public final HK1 A0A;

    public final C251263mp A0X(AnonymousClass3Y5 r30) {
        String str;
        2WX A0X;
        AnonymousClass2WY A0b;
        String str2;
        AnonymousClass3Y5 r7 = r30;
        0qQ.A0B(r7, 0);
        1Xj r3 = this.A05;
        ExtendedImageUrl A1n = r3.A1n(C243803a8.A00(r7));
        if (A1n == null) {
            return null;
        }
        C60340gF r13 = C60340gF.A00;
        Object A002 = AnonymousClass3Zw.A00(r7, new C58693Iw2(38, this, r7), new Object[]{r13});
        AnonymousClass3XV r0 = 2WX.A02;
        long A062 = C51965G9l.A06(this.A07);
        Integer num = AnonymousClass05K.A01;
        2WX A003 = AnonymousClass9JR.A00((2WX) null, num, 0, A062);
        long A063 = C51965G9l.A06(this.A00);
        Integer num2 = AnonymousClass05K.A00;
        2WX A0Y = C51971G9r.A0Y(AnonymousClass9JR.A00(A003, num2, 0, A063), AnonymousClass05K.A05, A002, 4);
        Integer num3 = AnonymousClass05K.A0N;
        2WX A0Y2 = C51971G9r.A0Y(C51971G9r.A0Y(C51973G9u.A0Y(A0Y, num3, true), num2, AnonymousClass3Zw.A00(r7, C58705IwE.A01(this, 39), new Object[]{r13}), 4), AnonymousClass05K.A0j, 2, 0);
        C267324bN r16 = this.A02;
        UserSession userSession = this.A04;
        AnonymousClass4DU r15 = this.A09;
        C267324bN r23 = r16;
        UserSession userSession2 = userSession;
        AnonymousClass4DU r25 = r15;
        2WX A004 = GFM.A03((C238863Ds) null, GFM.A00(C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON, A0Y2, (C59543JNp) null, r23, userSession2, r25, Integer.valueOf(this.A01), false, false), userSession, r15, J6N.A00(this, 8)).A00(this.A08);
        2Wb A0Q = C51972G9s.A0Q(r7);
        2WX A0z = G9t.A0z((2WX) null, num2, C243573Zh.CENTER);
        C247733gp A1U = r3.A1U();
        if (!(A1U == null || (str2 = A1U.A0d) == null)) {
            A0z = C51971G9r.A0Y(A0z, num3, str2, 0);
        }
        2WX A0Y3 = C51971G9r.A0Y(A0z, num, C273654mx.A00(118), 0);
        float A0l = r3.A0l();
        DynamicProductAdDisplayOption dynamicProductAdDisplayOption = r16.A06().A07;
        if (dynamicProductAdDisplayOption != null) {
            str = dynamicProductAdDisplayOption.A00;
        } else {
            str = null;
        }
        boolean A1a = C51966G9m.A1a(str, DynamicProductAdDisplayOption.BACKGROUND_CROPPING.toString());
        if ((182.A06(DbS.A0J(userSession, 0), userSession, 36321761034053319L) || A1a) && A0l == 1.0f) {
            A0X = AnonymousClass9JR.A00((2WX) null, num, 0, A063);
            A0b = C51965G9l.A0c(num2, 0, A063);
        } else {
            A0X = C51971G9r.A0X((2WX) null, num, 100.0f, 0);
            A0b = C51965G9l.A0b(num2, 100.0f, 0);
        }
        A0Q.A00(new GYW(ImageView.ScaleType.FIT_CENTER, A0Y3.A00(C51965G9l.A0X(A0X, A0b)), r15, A1n, (ImageUrl) null, (C240963Ni) null, (C226632hb) null, (String) null, this.A0A.A03(), true, true));
        return C243563Zg.A04(A0Q, r7, A004);
    }

    public C53862GvT(2WX r2, C267324bN r3, C52058GDe gDe, UserSession userSession, 1Xj r6, AnonymousClass4DU r7, JTB jtb, HK1 hk1, float f, float f2, int i) {
        AnonymousClass7TG.A1U(userSession, r3, gDe);
        C51973G9u.A0s(5, hk1, jtb, r7);
        C51972G9s.A1F(r6, r2);
        this.A04 = userSession;
        this.A02 = r3;
        this.A03 = gDe;
        this.A07 = f;
        this.A0A = hk1;
        this.A00 = f2;
        this.A06 = jtb;
        this.A09 = r7;
        this.A01 = i;
        this.A05 = r6;
        this.A08 = r2;
    }
}
