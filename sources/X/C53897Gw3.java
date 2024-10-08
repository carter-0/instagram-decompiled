package X;

import android.graphics.Typeface;
import android.graphics.drawable.GradientDrawable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.animation.LinearInterpolator;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.Gw3  reason: case insensitive filesystem */
public final class C53897Gw3 extends C251343mx {
    public final C335907dj A00;
    public final UserSession A01;
    public final C70804OLz A02;
    public final C60314JjH A03;
    public final float A04;
    public final C55844HoR A05;

    public final C251263mp A0X(AnonymousClass3Y5 r36) {
        SpannableStringBuilder spannableStringBuilder;
        AnonymousClass3Y5 r1 = r36;
        0qQ.A0B(r1, 0);
        C243673Zt A002 = C243633Zp.A00(r1, C58374Iqt.A00);
        Float valueOf = Float.valueOf(1.0f);
        2V5 r2 = new 2V5(valueOf);
        2V5 A003 = C247343gB.A00(r1, valueOf);
        2V5 A0Z = C51968G9o.A0Z(r1, 1.05f);
        2Wa A004 = C243643Zq.A00(r1, C58375Iqu.A00);
        Object obj = A004.A03;
        int ordinal = ((C54633HLq) obj).ordinal();
        if (ordinal == 1) {
            r2 = A003;
        } else if (ordinal == 2) {
            r2 = A0Z;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius((float) C51972G9s.A0B(r1, 20.0d));
        C55844HoR hoR = this.A05;
        int A0B = C51972G9s.A0B(r1, 1.0d);
        int i = hoR.A00;
        gradientDrawable.setColor(i);
        if (i == hoR.A06.A04.A07) {
            gradientDrawable.setStroke(A0B, hoR.A01);
        }
        IIY iiy = new IIY(new C59606JQa[]{HSI.A00(new LinearInterpolator(), A003, new IIZ(A004, 2), 1.05f, 125), HSI.A00(new LinearInterpolator(), A0Z, new IIZ(A004, 3), 1.0f, 125)});
        C335907dj r10 = this.A00;
        if ((r10.A04 instanceof C338057hL) && obj == C54633HLq.A03) {
            AnonymousClass7TF.A0D().postDelayed(new C57819Igy(A004, iiy), 250);
        }
        Boolean valueOf2 = Boolean.valueOf(this.A02.A00());
        String str = r10.A0K;
        String str2 = r10.A0N;
        User user = r10.A0C;
        Boolean valueOf3 = Boolean.valueOf(r10.A0S);
        Integer num = r10.A0G;
        Object A005 = AnonymousClass3Zw.A00(r1, new C41567AwZ(38, A002, this, r1), new Object[]{valueOf2, str, str2, user, valueOf3, num, r10.A05});
        AnonymousClass3XV r16 = 2WX.A02;
        2WX A0Y = C51971G9r.A0Y((2WX) null, AnonymousClass05K.A0D, C66579MXk.A00(1071), 4);
        long A0I = C51970G9q.A0I();
        long A0D = C51970G9q.A0D();
        long A0E = C51969G9p.A0E();
        Integer num2 = AnonymousClass05K.A04;
        2WX A0G = C51974G9v.A0G(A0Y, C51965G9l.A0c(num2, 0, A0I), 0, A0D);
        Integer num3 = AnonymousClass05K.A1I;
        2WX A006 = AnonymousClass9JR.A00(A0G, num3, 0, A0E);
        Integer num4 = AnonymousClass05K.A00;
        2V5 r22 = r2;
        2WX A0W = C51971G9r.A0W(r22, C51971G9r.A0W(r22, C51971G9r.A0Y(C51971G9r.A0Y(C51971G9r.A0Y(A006, num4, gradientDrawable, 4), AnonymousClass05K.A0N, C244143ai.END, 3), num2, new J6W(44, A002, A005, this), 4), AnonymousClass05K.A1F), num3);
        2Wb A0Q = C51972G9s.A0Q(r1);
        String str3 = r10.A0J;
        if (str3 != null) {
            UserSession userSession = this.A01;
            UserSession userSession2 = userSession;
            String str4 = str3;
            spannableStringBuilder = C336887fL.A00(C51965G9l.A0B(A0Q.Aqq()), (SpannableString) null, userSession2, str4, 0sn.A00, (Map) null, C58373Iqs.A00, new C74191PqX(28, A005, (Object) this), C59009J2u.A00, JFK.A00, (0sL) null, R.attr.igds_color_link, true);
        } else {
            spannableStringBuilder = null;
        }
        int i2 = hoR.A04;
        long A0C = C244013aV.A0C(A0Q, R.dimen.account_group_management_row_text_size);
        2WX A012 = C52112GFg.A01(r16, this.A04);
        Typeface typeface = Typeface.DEFAULT;
        long A0D2 = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(A0Q.A00, (2V5) null, spannableStringBuilder, 0);
        C51973G9u.A17(A0Q, A0b, i2, A0C);
        A0b.A0R(0);
        G9w.A12(typeface, A0Q, A0b, A0D2);
        A0b.A0W(num4);
        C51974G9v.A14(A0b, num4, 1.0f, false, true);
        G9t.A1M(A0Q, A012, A0b);
        return C243563Zg.A0B(A0Q, r1, A0W);
    }

    public C53897Gw3(C335907dj r2, UserSession userSession, C70804OLz oLz, C55844HoR hoR, C60314JjH jjH, float f) {
        C51972G9s.A1B(userSession, hoR);
        0qQ.A0B(jjH, 6);
        this.A01 = userSession;
        this.A00 = r2;
        this.A02 = oLz;
        this.A05 = hoR;
        this.A04 = f;
        this.A03 = jjH;
    }

    public static final void A00(View view, C243673Zt r3) {
        AnonymousClass2VL.A00();
        if (r3.A00 == null) {
            WVJ wvj = new WVJ(view, (C328287Ef) null);
            wvj.Exa();
            r3.A00(wvj);
            return;
        }
        AnonymousClass2VL.A00();
        WVJ wvj2 = (WVJ) r3.A00;
        if (wvj2 != null) {
            wvj2.Exa();
        }
    }
}
