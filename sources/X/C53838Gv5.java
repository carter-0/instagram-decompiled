package X;

import android.graphics.Color;
import android.graphics.Typeface;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.clips.ClipsShoppingCTABarIntf;
import java.util.List;

/* renamed from: X.Gv5  reason: case insensitive filesystem */
public final class C53838Gv5 extends C251343mx {
    public final C267324bN A00;
    public final AnonymousClass3W1 A01;
    public final C59571JOr A02;
    public final JPE A03;
    public final C52058GDe A04;
    public final UserSession A05;
    public final Boolean A06;
    public final boolean A07;

    public final C251263mp A0X(AnonymousClass3Y5 r27) {
        boolean z;
        ClipsShoppingCTABarIntf clipsShoppingCTABarIntf;
        int A08;
        float f;
        Integer AzW;
        String str;
        2V1 Aqq;
        HnU hnU;
        String dominantColor;
        AnonymousClass3Y5 r9 = r27;
        0qQ.A0B(r9, 0);
        UserSession userSession = this.A05;
        UserSession userSession2 = userSession;
        if (!182.A06(DbS.A0J(userSession, 0), userSession, 36323105358097248L) || this.A00.CcK()) {
            z = false;
        } else {
            z = true;
            if (AnonymousClass7TF.A1Y(this.A06, false)) {
                return new 2Tp((C243573Zh) null, (C243573Zh) null, (C243583Zi) null, (C244343b2) null, (List) null, false);
            }
        }
        C267324bN r0 = this.A00;
        C267324bN r24 = r0;
        1Xj r02 = r0.A02;
        if (r02 != null) {
            clipsShoppingCTABarIntf = C14064TpC.A00(r02);
        } else {
            clipsShoppingCTABarIntf = null;
        }
        C243533Zd r13 = C243533Zd.GLOBAL;
        int i = 0;
        if (z) {
            i = 300;
        }
        C243533Zd r03 = 2Vi.A04;
        AnonymousClass4Ex r6 = new AnonymousClass4Ex(i);
        AnonymousClass4Ey A002 = 2Vi.A00(r13, "trans_key_dwell_cta");
        C246053du r12 = C246033ds.A04;
        C246053du r11 = C246033ds.A01;
        C246053du r2 = C246033ds.A03;
        A002.A06(r12, r11, r2);
        float A032 = C51970G9q.A03(A002, C246033ds.A00);
        A002.A02 = r6;
        AnonymousClass4Ey A003 = 2Vi.A00(r13, "trans_key_dwell_cta");
        A003.A06(r12, r11, r2);
        A003.A03(C246033ds.A05);
        AnonymousClass4F7.A00(r9, C51974G9v.A09(r9.A05.A0C, r6, A003, A002, 10));
        if (clipsShoppingCTABarIntf == null || (dominantColor = clipsShoppingCTABarIntf.getDominantColor()) == null) {
            A08 = C51969G9p.A08(r9, R.color.badge_color);
        } else {
            A08 = Color.parseColor(dominantColor);
        }
        if (z) {
            f = 2.0f;
        } else if (clipsShoppingCTABarIntf == null || (AzW = clipsShoppingCTABarIntf.AzW()) == null) {
            f = 4.0f;
        } else {
            f = (float) AzW.intValue();
        }
        C52058GDe gDe = this.A04;
        C58705IwE A012 = C58705IwE.A01(this, 35);
        JPE jpe = this.A03;
        C243803a8.A00(r9);
        if (clipsShoppingCTABarIntf != null) {
            str = clipsShoppingCTABarIntf.getTitle();
        } else {
            str = null;
        }
        2WW r4 = null;
        if (clipsShoppingCTABarIntf != null) {
            List BgO = clipsShoppingCTABarIntf.BgO();
            if (BgO == null || BgO.size() <= 1) {
                String subtitle = clipsShoppingCTABarIntf.getSubtitle();
                if (!(subtitle == null || subtitle.length() == 0)) {
                    String subtitle2 = clipsShoppingCTABarIntf.getSubtitle();
                    String subtitle3 = clipsShoppingCTABarIntf.getSubtitle();
                    Aqq = r9.Aqq();
                    hnU = new HnU(subtitle2, subtitle3, C51972G9s.A0A(Aqq.A0C, r9, R.attr.igds_color_secondary_text_on_media), 0);
                }
            } else {
                String A0E = C244013aV.A0E(r9, 2131969106);
                String A0D = 002.A0D(C244013aV.A0E(r9, 2131969105), ' ');
                Aqq = r9.Aqq();
                hnU = new HnU(A0E, A0D, C51972G9s.A09(Aqq.A0C, r9), 1);
            }
            AnonymousClass3XV r04 = 2WX.A02;
            C243573Zh r05 = C243573Zh.CENTER;
            Integer num = AnonymousClass05K.A00;
            2WX A0Y = C51971G9r.A0Y((2WX) null, num, r05, 3);
            Integer num2 = AnonymousClass05K.A0C;
            2WX A0R = C51972G9s.A0R(C51971G9r.A0X(A0Y, num2, A032, 1), 0, C244013aV.A0C(r9, R.dimen.abc_edit_text_inset_bottom_material));
            String str2 = hnU.A02;
            if (str2 != null) {
                A0R = C51971G9r.A0Y(A0R, AnonymousClass05K.A0N, str2, 0);
            }
            String str3 = hnU.A03;
            int i2 = hnU.A00;
            long A042 = C244013aV.A04(r9);
            int i3 = hnU.A01;
            Typeface typeface = Typeface.DEFAULT;
            long A0D2 = C51969G9p.A0D();
            C244103ae A0b = C51971G9r.A0b(Aqq, (2V5) null, str3, 0);
            C51973G9u.A16(r9, A0b, i2, A042);
            A0b.A0R(i3);
            G9w.A11(typeface, r9, A0b, A0D2);
            A0b.A0W(num2);
            C51974G9v.A15(A0b, num, 0, true);
            C51974G9v.A0z(A0R, A0b, false);
            r4 = A0b.A0A();
        }
        return I3N.A00(r4, r9, jpe, r24, gDe, userSession2, str, A012, f, A08, true, false, this.A07);
    }

    public C53838Gv5(JPE jpe, C267324bN r2, C52058GDe gDe, UserSession userSession, AnonymousClass3W1 r5, C59571JOr jOr, Boolean bool, boolean z) {
        AnonymousClass7TG.A1Q(gDe, r5);
        AnonymousClass7TG.A1S(jOr, userSession);
        this.A00 = r2;
        this.A04 = gDe;
        this.A01 = r5;
        this.A03 = jpe;
        this.A02 = jOr;
        this.A05 = userSession;
        this.A07 = z;
        this.A06 = bool;
    }
}
