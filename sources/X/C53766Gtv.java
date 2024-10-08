package X;

import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.Gtv  reason: case insensitive filesystem */
public final class C53766Gtv extends C251343mx {
    public final String A00;
    public final String A01;
    public final 0sK A02;
    public final boolean A03;
    public final 2WX A04;

    public final C251263mp A0X(AnonymousClass3Y5 r17) {
        AnonymousClass3Y5 r3 = r17;
        0qQ.A0B(r3, 0);
        Float A0h = C51967G9n.A0h();
        2V5 A002 = C247343gB.A00(r3, A0h);
        2V5 A003 = C247343gB.A00(r3, A0h);
        2V5 A004 = C247343gB.A00(r3, A0h);
        String str = this.A00;
        Object A005 = AnonymousClass3Zw.A00(r3, new C41567AwZ(8, A004, A003, A002), new Object[]{str});
        C300835xz r11 = new C300835xz();
        C243773a4.A00(r3, new GNG(45, r11, A005), new Object[]{str});
        AnonymousClass3XV r0 = 2WX.A02;
        long A06 = C244013aV.A06(r3);
        long A0B = C244013aV.A0B(r3);
        2WX A006 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0u, 0, A06);
        Integer num = AnonymousClass05K.A1F;
        2WX A007 = C51971G9r.A0Y(C51971G9r.A0X(AnonymousClass9JR.A00(A006, num, 0, A0B), AnonymousClass05K.A0C, 0.0f, 1), num, new C66312MMv(13, r11, this), 4).A00(this.A04);
        2Wb A0Q = C51972G9s.A0Q(r3);
        long A062 = C244013aV.A06(A0Q);
        Integer num2 = AnonymousClass05K.A00;
        2WX A0U = C51973G9u.A0U(C51974G9v.A0J(C51971G9r.A0W(A004, C51974G9v.A0A(A003, AnonymousClass9JR.A00(C51972G9s.A0T(AnonymousClass9JR.A00((2WX) null, num2, 0, A062), 0, C244013aV.A06(A0Q)), AnonymousClass05K.A0E, 0, C244013aV.A07(A0Q)), new AnonymousClass9JS(A002, num)), num2), C51965G9l.A0d(AnonymousClass05K.A06, Boolean.valueOf(this.A03), 4), num2), A0Q, 2131964931);
        int A012 = C244013aV.A01(A0Q, R.attr.glyphColorSecondary);
        int A013 = C244013aV.A01(A0Q, R.attr.feedLikeActiveColor);
        return C51967G9n.A0Q(new C244603bS(C244013aV.A0D(A0Q, R.drawable.ufi_heart_icon), ImageView.ScaleType.FIT_CENTER, (2V5) null, A0U, A012, A013), A0Q, r3, A007);
    }

    public C53766Gtv(2WX r1, String str, String str2, 0sK r4, boolean z) {
        this.A00 = str;
        this.A01 = str2;
        this.A03 = z;
        this.A02 = r4;
        this.A04 = r1;
    }
}
