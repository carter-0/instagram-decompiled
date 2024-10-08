package X;

import com.instagram.android.R;
import com.instagram.api.schemas.IntentAwareAdsFormatInfo;
import com.instagram.api.schemas.IntentAwareAdsInfoIntf;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.GwK  reason: case insensitive filesystem */
public final class C53914GwK extends C251343mx {
    public final C267324bN A00;
    public final C52058GDe A01;
    public final UserSession A02;
    public final C51984GAh A03;
    public final JTB A04;
    public final ClipsViewerConfig A05;
    public final AnonymousClass4DU A06;
    public final C230292pL A07;
    public final C51987GAk A08;
    public final JT5 A09;
    public final HashMap A0A;
    public final List A0B;
    public final boolean A0C;

    public final C251263mp A0X(AnonymousClass3Y5 r46) {
        String str;
        float f;
        2Wa A002;
        String A0E;
        C251263mp A0F;
        int intValue;
        AnonymousClass3Y5 r4 = r46;
        0qQ.A0B(r4, 0);
        C267324bN r40 = this.A00;
        IntentAwareAdsInfoIntf A003 = C57031ILx.A00(r40);
        IntentAwareAdsFormatInfo B7S = A003.B7S();
        if (B7S == null || (str = B7S.getTitle()) == null) {
            str = C244013aV.A0E(r4, 2131963718);
        }
        List A022 = C57031ILx.A02(r40);
        UserSession userSession = this.A02;
        C54644HMb A012 = I2T.A01(userSession);
        if (this.A0C) {
            f = (float) C226122ff.A01();
        } else {
            f = 0.0f;
        }
        C52058GDe gDe = this.A01;
        AnonymousClass3W1 r6 = gDe.A0E;
        if (r6 == null || I2T.A00(userSession) == C54643HMa.A04) {
            A002 = C243643Zq.A00(r4, C58596IuT.A00);
        } else {
            A002 = C243753a2.A01(r4, r6, C59083J5q.A00, 33, false);
        }
        C55676HlZ hlZ = (C55676HlZ) AnonymousClass3Zw.A00(r4, C58595IuS.A00, new Object[0]);
        AnonymousClass4DU r62 = this.A06;
        ImageUrl A1Q = ((AnonymousClass3OA) A022.get(0)).A0K.A1Q();
        if (A1Q != null) {
            C53750Gtf gtf = new C53750Gtf(A1Q, r62);
            if ((0qQ.A0K(str, C244013aV.A0E(r4, 2131963714)) || !182.A06(C51965G9l.A0Z(userSession, 0), userSession, 36319239892835414L)) && A012 == C54644HMb.ABOVE_GRID) {
                A0E = C244013aV.A0E(r4, 2131963717);
            } else {
                A0E = null;
            }
            ArrayList A0p = AnonymousClass7TF.A0p(A022);
            Iterator it = A022.iterator();
            while (it.hasNext()) {
                C51972G9s.A1G(A0p, it);
            }
            ArrayList A0p2 = AnonymousClass7TF.A0p(A022);
            int i = 0;
            for (Object next : A022) {
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                C267324bN A013 = C295375o3.A01(r40.A03().A01, (AnonymousClass3OA) next);
                HashMap hashMap = this.A0A;
                C51987GAk gAk = this.A08;
                ArrayList arrayList = A0p2;
                arrayList.add(new C53929GwZ(A002, A013, (C52058GDe) this.A0B.get(i), gDe, userSession, r62, this.A07, this.A03, this.A04, gAk, hlZ, hashMap, C58705IwE.A01(this, 19), i));
                i = i2;
            }
            0Tu A0Z = C51965G9l.A0Z(userSession, 0);
            if (182.A06(A0Z, userSession, 36319239892638805L) || 182.A06(A0Z, userSession, 36319239892573268L)) {
                2V1 r15 = r4.A05;
                int A0E2 = 2Yu.A0E(r15.A0C);
                int i3 = 2131963715;
                if (182.A06(A0Z, userSession, 36319239892638805L)) {
                    i3 = 2131972971;
                }
                AnonymousClass3XV r0 = 2WX.A02;
                Integer num = AnonymousClass05K.A00;
                2WX A004 = AnonymousClass9JR.A00(C51974G9v.A0J(AnonymousClass9JR.A00(C51965G9l.A0X((2WX) null, C51965G9l.A0b(num, 100.0f, 0)), AnonymousClass05K.A0Y, 0, C244013aV.A0C(r4, R.dimen.audience_selector_pill_layout_height)), C51965G9l.A0c(AnonymousClass05K.A0A, 0, C51967G9n.A06(r4)), num), AnonymousClass05K.A04, 0, C244013aV.A06(r4));
                2Wb A0S = AnonymousClass7TG.A0S(r15);
                A0S.A00(new C53780Gu9(C51974G9v.A0C((2WX) null, C51965G9l.A0b(AnonymousClass05K.A01, 1.0f, 1), 1.0f), C244013aV.A0E(A0S, i3), C58705IwE.A01(this, 18), A0E2));
                A0F = C243563Zg.A0F(A0S, r4, A004);
            } else {
                A0F = null;
            }
            Integer A005 = AnonymousClass4I5.A00(A003.BUY());
            if (A005 == null || !((intValue = A005.intValue()) == 14 || intValue == 15)) {
                return new C53846GvD(gtf, A00(r4, A012), A0F, str, A0E, A0p2, f, 182.A06(A0Z, userSession, 2342162249102793775L), AnonymousClass7TF.A1W(A012, C54644HMb.WITHIN_CARD));
            }
            return new C53869Gva(gtf, A00(r4, A012), A0F, hlZ, this.A09, str, A0E, A0p, A0p2, f, 182.A06(A0Z, userSession, 2342162249102793775L), AnonymousClass7TF.A1W(A012, C54644HMb.WITHIN_CARD));
        }
        throw AnonymousClass7TE.A0y();
    }

    private final C251343mx A00(C70832Wc r14, C54644HMb hMb) {
        if (hMb != C54644HMb.BELOW_GRID) {
            return null;
        }
        UserSession userSession = this.A02;
        if (182.A06(0Tu.A05, userSession, 36328413937614164L)) {
            AnonymousClass3XV r0 = 2WX.A02;
            2WX A0T = C51972G9s.A0T(G9t.A0z((2WX) null, AnonymousClass05K.A00, C243573Zh.FLEX_START), 0, C244013aV.A0C(r14, R.dimen.audition_flow_picker_subtitle_margin_bottom));
            long A062 = C51967G9n.A06(r14);
            2WX A0F = C51974G9v.A0F(A0T, C51967G9n.A0U(0, A062), 0, C244013aV.A03(r14));
            AnonymousClass4DU r9 = this.A06;
            return new C53844GvB(A0F, this.A05, this.A00, (C52058GDe) this.A0B.get(0), userSession, r9, (S6e) null, (JTK) null, (C52679Gar) null);
        }
        AnonymousClass3XV r02 = 2WX.A02;
        2WX A0T2 = C51972G9s.A0T(G9t.A0z((2WX) null, AnonymousClass05K.A00, C243573Zh.FLEX_START), 0, C244013aV.A0C(r14, R.dimen.audition_flow_picker_subtitle_margin_bottom));
        long A063 = C51967G9n.A06(r14);
        2WX A0F2 = C51974G9v.A0F(A0T2, C51967G9n.A0U(0, A063), 0, C244013aV.A03(r14));
        AnonymousClass4DU r92 = this.A06;
        return new C52462GTo(A0F2, this.A05, this.A00, (C52058GDe) this.A0B.get(0), userSession, r92, (S6e) null, (JTB) null);
    }

    public C53914GwK(ClipsViewerConfig clipsViewerConfig, C267324bN r3, C52058GDe gDe, UserSession userSession, AnonymousClass4DU r6, C230292pL r7, C51984GAh gAh, JTB jtb, C51987GAk gAk, JT5 jt5, HashMap hashMap, List list, boolean z) {
        C51974G9v.A1S(r6, r3, userSession, gDe, list);
        C51973G9u.A0t(7, hashMap, gAk, gAh);
        0qQ.A0B(clipsViewerConfig, 11);
        this.A04 = jtb;
        this.A06 = r6;
        this.A00 = r3;
        this.A02 = userSession;
        this.A01 = gDe;
        this.A0B = list;
        this.A0A = hashMap;
        this.A08 = gAk;
        this.A03 = gAh;
        this.A0C = z;
        this.A05 = clipsViewerConfig;
        this.A07 = r7;
        this.A09 = jt5;
    }
}
