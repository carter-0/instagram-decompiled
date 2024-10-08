package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.GwG  reason: case insensitive filesystem */
public final class C53910GwG extends C251343mx {
    public static final long A09 = C51972G9s.A0G(12.0f);
    public static final long A0A = C51970G9q.A0H();
    public final C335907dj A00;
    public final UserSession A01;
    public final C300835xz A02;
    public final String A03;
    public final boolean A04;
    public final 2WX A05;
    public final C333777a7 A06;
    public final C52971GgO A07;
    public final boolean A08;

    public C53910GwG(2WX r2, C335907dj r3, C333777a7 r4, C52971GgO ggO, UserSession userSession, C300835xz r7, String str, boolean z, boolean z2) {
        C51973G9u.A0r(3, ggO, r7, userSession);
        0qQ.A0B(str, 7);
        this.A00 = r3;
        this.A06 = r4;
        this.A07 = ggO;
        this.A02 = r7;
        this.A01 = userSession;
        this.A04 = z;
        this.A03 = str;
        this.A08 = z2;
        this.A05 = r2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r39) {
        List list;
        AnonymousClass3Y5 r6 = r39;
        0qQ.A0B(r6, 0);
        Float valueOf = Float.valueOf(1.0f);
        2V5 A002 = C247343gB.A00(r6, valueOf);
        2V5 A003 = C247343gB.A00(r6, valueOf);
        C243773a4.A00(r6, new C58188Ins(43, AnonymousClass3Zw.A00(r6, new C58188Ins(44, A003, A002), new Object[0]), this), C51970G9q.A1b());
        C335907dj r12 = this.A00;
        int A0A2 = AnonymousClass7TG.A0A(r12.A0G);
        String A004 = C14066TpE.A00(C51969G9p.A0M(r6), Integer.valueOf(A0A2), Integer.valueOf(IgNetworkConsentStorage.MAX_ENTRIES), true);
        0qQ.A07(A004);
        AnonymousClass3XV r1 = 2WX.A02;
        Integer num = AnonymousClass05K.A0C;
        2WX A005 = C51965G9l.A0X((2WX) null, C51965G9l.A0b(num, 0.0f, 1)).A00(this.A05);
        UserSession userSession = this.A01;
        C333777a7 r11 = this.A06;
        C52971GgO ggO = this.A07;
        C300835xz r7 = this.A02;
        2V1 r3 = r6.A05;
        2WX A006 = A005.A00(HX6.A00(AnonymousClass7TF.A0A(r3.A0C), r12, r11, ggO, userSession, r7, false));
        User user = null;
        2Wb A0S = AnonymousClass7TG.A0S(r3);
        Drawable drawable = (Drawable) AnonymousClass3Zw.A00(r6, new C58177Inh(r6, 31), new Object[0]);
        Drawable drawable2 = (Drawable) AnonymousClass3Zw.A00(r6, new C58177Inh(r6, 30), new Object[0]);
        boolean z = r12.A0S;
        boolean z2 = z;
        if (z) {
            drawable = drawable2;
        }
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        if (this.A08) {
            if (r11 != null) {
                user = r11.A0A;
            }
            if (!r12.A05(userSession) || user == null) {
                list = 0sn.A00;
            } else {
                list = AnonymousClass7TE.A1I(user);
            }
            Context A007 = C243803a8.A00(r6);
            String str = this.A03;
            int i = 14;
            if (this.A04) {
                i = 16;
            }
            Drawable drawable3 = drawable;
            drawable = C244283aw.A00(A007, drawable3, Float.valueOf(0.25f), AnonymousClass05K.A00, 2, (Integer) null, (Integer) null, (Integer) null, str, list, C61380mr.A01(C243803a8.A00(r6), i), false, false, false, false, true);
        }
        boolean z3 = this.A04;
        int i2 = 14;
        if (z3) {
            i2 = 16;
        }
        long A072 = C51965G9l.A07(i2);
        Integer num2 = AnonymousClass05K.A01;
        2WX A008 = AnonymousClass9JR.A00(C51974G9v.A0A(A002, AnonymousClass9JR.A00((2WX) null, num2, 0, A072), new AnonymousClass9JS(A002, AnonymousClass05K.A1F)), AnonymousClass05K.A0E, 0, A0A);
        Integer num3 = AnonymousClass05K.A00;
        2WX A0S2 = C51973G9u.A0S(C51971G9r.A0W(A003, A008, num3), C51965G9l.A0d(AnonymousClass05K.A06, Boolean.valueOf(z2), 4), num, 0.0f, 1);
        Integer num4 = AnonymousClass05K.A08;
        C51969G9p.A13(drawable, scaleType, A0S, C51973G9u.A0U(C51971G9r.A0Y(A0S2, num4, "row_comment_like_button", 4), A0S, 2131964931));
        if (A0A2 > 0) {
            2WX A0Y = C51971G9r.A0Y(C51971G9r.A0X((2WX) null, num2, 0.0f, 1), num4, "row_comment_textview_like_count", 4);
            long j = A09;
            2V1 r15 = A0S.A00;
            Context context = r15.A0C;
            int A073 = C51968G9o.A07(context, A0S);
            int i3 = R.style.igds_emphasized_body_2;
            if (z3) {
                i3 = R.style.igds_emphasized_body_1;
            }
            Typeface create = Typeface.create("sans-serif-medium", 0);
            0qQ.A07(create);
            Typeface A032 = 0oh.A03(context, create, num2);
            long A0D = C51969G9p.A0D();
            C244103ae A0b = C51971G9r.A0b(r15, (2V5) null, A004, i3);
            C51973G9u.A17(A0S, A0b, A073, j);
            A0b.A0R(0);
            G9w.A12(A032, A0S, A0b, A0D);
            A0b.A0W(num3);
            C51974G9v.A13(A0b, num3, 1.0f);
            A0b.A0D();
            G9t.A1M(A0S, A0Y, A0b);
        }
        return C243563Zg.A0G(A0S, r6, A006);
    }
}
