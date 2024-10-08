package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.HashMap;
import java.util.List;

public final class GZ9 extends C251343mx {
    public final AnonymousClass0iw A00;
    public final JQ3 A01;
    public final JTM A02;
    public final UserSession A03;
    public final C59620JQo A04;
    public final HashMap A05;
    public final HashMap A06;

    public GZ9(AnonymousClass0iw r2, UserSession userSession, JQ3 jq3, JTM jtm, C59620JQo jQo, HashMap hashMap, HashMap hashMap2) {
        0qQ.A0B(r2, 1);
        C51974G9v.A1S(userSession, jtm, jq3, jQo, hashMap);
        0qQ.A0B(hashMap2, 7);
        this.A00 = r2;
        this.A03 = userSession;
        this.A02 = jtm;
        this.A01 = jq3;
        this.A04 = jQo;
        this.A05 = hashMap;
        this.A06 = hashMap2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r30) {
        C243583Zi r8;
        2WX A0D;
        2Wb A0K;
        JQ3 jq3;
        C61083JwL BfW;
        2WX A002;
        int i;
        GZ8 A042;
        AnonymousClass3Y5 r10 = r30;
        0qQ.A0B(r10, 0);
        JTM jtm = this.A02;
        boolean CCZ = jtm.CCZ();
        if (CCZ) {
            r8 = C243583Zi.FLEX_START;
            AnonymousClass3XV r0 = 2WX.A02;
            Integer num = AnonymousClass05K.A00;
            2WX A0X = C51965G9l.A0X((2WX) null, C51965G9l.A0b(num, 100.0f, 0));
            Integer num2 = AnonymousClass05K.A01;
            A0D = C51971G9r.A0X(A0X, num2, 100.0f, 0);
            A0K = C51973G9u.A0K(r10);
            A0K.A00(new GZ4((2WX) null, this.A00, jtm.Aeu()));
            A0K.A00(new GZ5((2WX) null, A05(A0K, jtm.C7g()), A05(A0K, jtm.C2Y()), 0.0f, 0.0f, 0, R.attr.igds_color_creation_tools_grey_04, R.dimen.abc_button_padding_horizontal_material, R.dimen.account_discovery_bottom_gap, 0, 217852, C244013aV.A0C(A0K, R.dimen.backup_codes_text_size), true));
            2WX A003 = C51971G9r.A0X((2WX) null, num2, 1.0f, 1).A00((2WX) null);
            2Wb A0w = G9t.A0w(A0K);
            C51971G9r.A1F(A00(A0w), A0w, A0K, A003);
            jq3 = this.A01;
            BfW = jq3.BfW();
            if (BfW != null) {
                2WX A0X2 = C51971G9r.A0X((2WX) null, num, 100.0f, 0);
                i = R.dimen.abc_dialog_padding_material;
                A002 = AnonymousClass9JR.A00(A0X2, AnonymousClass05K.A0A, 0, C244013aV.A0C(A0K, R.dimen.abc_dialog_padding_material));
            }
            return C243563Zg.A08(A0K, r10, A0D, r8);
        }
        r8 = C243583Zi.CENTER;
        AnonymousClass3XV r02 = 2WX.A02;
        A0D = C51974G9v.A0D((2WX) null, C51965G9l.A0b(AnonymousClass05K.A00, 100.0f, 0), 100.0f, 0);
        A0K = C51973G9u.A0K(r10);
        A0K.A00(new GZ4((2WX) null, this.A00, jtm.Aeu()));
        A0K.A00(A00(A0K));
        A0K.A00(new GZ5((2WX) null, A05(A0K, jtm.C7g()), A05(A0K, jtm.C2Y()), 0.0f, 0.0f, 0, 0, 0, 0, 0, 262140, 0, false));
        jq3 = this.A01;
        BfW = jq3.BfW();
        if (BfW != null) {
            A002 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A08, 0, C51967G9n.A06(A0K));
            i = R.dimen.abc_dropdownitem_icon_width;
        }
        return C243563Zg.A08(A0K, r10, A0D, r8);
        2WX A004 = AnonymousClass9JR.A00(A002, AnonymousClass05K.A04, 0, C244013aV.A0C(A0K, i));
        C61083JwL Bqb = jq3.Bqb();
        2Wb A0M = C51973G9u.A0M(A0K);
        if (CCZ) {
            if (Bqb != null) {
                A0M.A00(A04(Bqb, A0M, false));
            }
            A042 = A04(BfW, A0M, true);
        } else {
            A0M.A00(A04(BfW, A0M, true));
            if (Bqb != null) {
                A042 = A04(Bqb, A0M, false);
            }
            C51967G9n.A1D(A0M, A0K, A004);
            return C243563Zg.A08(A0K, r10, A0D, r8);
        }
        A0M.A00(A042);
        C51967G9n.A1D(A0M, A0K, A004);
        return C243563Zg.A08(A0K, r10, A0D, r8);
    }

    private final C251263mp A00(C70832Wc r12) {
        JTM jtm = this.A02;
        JV5 CG2 = jtm.CG2();
        if (CG2 == null) {
            return new GZA(this.A00, this.A03, this.A04, jtm, this.A05);
        }
        HashMap hashMap = this.A06;
        String id = jtm.getId();
        AnonymousClass0iw r5 = this.A00;
        int A09 = C51969G9p.A09(r12, C244013aV.A03(r12));
        AnonymousClass3XV r0 = 2WX.A02;
        return new C53978GxM(C51973G9u.A0Z(C51972G9s.A0T(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A00, 0, C244013aV.A0C(r12, R.dimen.clips_fullcard_auto_created_reel_video_width)), 0, C244013aV.A0C(r12, R.dimen.clips_fullcard_auto_created_reel_video_height)), J6Q.A00(CG2, this, 28)), r5, (ImageUrl) 00k.A0J((List) CG2.A00), id, hashMap, 0, A09);
    }

    public static String A05(2Wb r0, C266444Yx r1) {
        if (r1 == null) {
            return null;
        }
        Context context = r0.Aqq().A0C;
        0qQ.A07(context);
        return C66909Mes.A00(context, r1).toString();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0027, code lost:
        if (r0 == null) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final X.GZ8 A04(X.C61083JwL r11, X.C70832Wc r12, boolean r13) {
        /*
            r10 = this;
            X.2V1 r0 = r12.Aqq()
            android.content.Context r1 = r0.A0C
            r0 = 2130970334(0x7f0406de, float:1.7549375E38)
            if (r13 == 0) goto L_0x000e
            r0 = 2130970335(0x7f0406df, float:1.7549377E38)
        L_0x000e:
            int r7 = X.2Yu.A0H(r1, r0)
            r6 = 2131239836(0x7f08239c, float:1.809599E38)
            if (r13 == 0) goto L_0x001a
            r6 = 2131239856(0x7f0823b0, float:1.809603E38)
        L_0x001a:
            java.lang.Object r0 = r11.A00
            X.4Yx r0 = (X.C266444Yx) r0
            if (r0 == 0) goto L_0x0029
            X.0qQ.A07(r1)
            java.lang.String r0 = X.C51968G9o.A11(r1, r0)
            if (r0 != 0) goto L_0x0030
        L_0x0029:
            r0 = 2131963566(0x7f132eae, float:1.956389E38)
            java.lang.String r0 = X.C244013aV.A0E(r12, r0)
        L_0x0030:
            X.02z r5 = X.106.A01(r0)
            r3 = 0
            X.JTM r0 = r10.A02
            boolean r0 = r0.CCZ()
            if (r0 == 0) goto L_0x0054
            X.3XV r0 = X.2WX.A02
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r1 = 1065353216(0x3f800000, float:1.0)
            r0 = 1
            X.9JQ r0 = X.C51965G9l.A0b(r2, r1, r0)
            X.2WX r3 = X.C51974G9v.A0C(r3, r0, r1)
            if (r13 != 0) goto L_0x0054
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            X.C244013aV.A0C(r12, r0)
        L_0x0054:
            r8 = 0
            java.lang.Object r4 = r11.A01
            X.0sa r4 = (X.C62320sa) r4
            r9 = 232(0xe8, float:3.25E-43)
            X.GZ8 r2 = new X.GZ8
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.GZ9.A04(X.JwL, X.2Wc, boolean):X.GZ8");
    }
}
