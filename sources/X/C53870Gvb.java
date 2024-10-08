package X;

import com.instagram.android.R;
import com.instagram.api.schemas.MidCardClipsClickedAction;
import com.instagram.api.schemas.MidCardLayoutType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Gvb  reason: case insensitive filesystem */
public final class C53870Gvb extends C251343mx {
    public final float A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final JQ3 A03;
    public final C59619JQn A04;
    public final GZ4 A05;
    public final C52644GaI A06;
    public final C53600GrF A07;
    public final String A08;
    public final HashMap A09;
    public final HashMap A0A;
    public final List A0B;

    public final C251263mp A0X(AnonymousClass3Y5 r37) {
        ArrayList arrayList;
        2Tp r14;
        String str;
        MidCardClipsClickedAction midCardClipsClickedAction;
        AnonymousClass3Y5 r3 = r37;
        0qQ.A0B(r3, 0);
        C52644GaI gaI = this.A06;
        C53452Gok gok = gaI.A03;
        if (gaI.A00 != null) {
            List<C53602GrH> list = this.A07.A02;
            arrayList = AnonymousClass7TF.A0p(list);
            for (C53602GrH grH : list) {
                AnonymousClass0iw r22 = this.A01;
                String str2 = grH.A08;
                String str3 = grH.A07;
                AnonymousClass3XV r2 = 2WX.A02;
                2WX A0D = C51974G9v.A0D((2WX) null, C51965G9l.A0b(AnonymousClass05K.A00, 100.0f, 0), 100.0f, 0);
                int i = grH.A02;
                int i2 = grH.A01;
                boolean z = grH.A09;
                C59619JQn jQn = this.A04;
                C53449Goh goh = gok.A06;
                MidCardClipsClickedAction midCardClipsClickedAction2 = goh.A00;
                MidCardLayoutType midCardLayoutType = grH.A03;
                HashMap hashMap = this.A0A;
                int i3 = grH.A00;
                String str4 = grH.A06;
                arrayList.add(new C53874Gvf(A0D, midCardClipsClickedAction2, (JSG) 00k.A0O(goh.A07, 0), midCardLayoutType, r22, grH.A05, jQn, str2, str3, str4, hashMap, (C62320sa) null, (C62320sa) null, (AnonymousClass0Ud) null, i, i2, i3, z));
            }
        } else {
            C53449Goh goh2 = gok.A06;
            List<C276014sL> list2 = goh2.A08;
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (C276014sL r1 : list2) {
                C51971G9r.A1M(r1.A00, A1C);
            }
            List<C53602GrH> list3 = this.A07.A02;
            arrayList = AnonymousClass7TF.A0p(list3);
            for (C53602GrH grH2 : list3) {
                List list4 = goh2.A07;
                int i4 = grH2.A00;
                JSG jsg = (JSG) 00k.A0O(list4, i4);
                UserSession userSession = this.A02;
                AnonymousClass0iw r17 = this.A01;
                HashMap hashMap2 = this.A09;
                02z A012 = 106.A01(String.valueOf(grH2.A04));
                AnonymousClass3XV r12 = 2WX.A02;
                2WX A0D2 = C51974G9v.A0D((2WX) null, C51965G9l.A0b(AnonymousClass05K.A00, 100.0f, 0), 100.0f, 0);
                C59619JQn jQn2 = this.A04;
                boolean z2 = grH2.A09;
                if (jsg != null) {
                    midCardClipsClickedAction = jsg.AYD();
                } else {
                    midCardClipsClickedAction = null;
                }
                JSG jsg2 = jsg;
                arrayList.add(new C53876Gvh(A0D2, midCardClipsClickedAction, jsg2, r17, userSession, jQn2, grH2, this.A08, hashMap2, A1C, (C62320sa) null, (C62320sa) 00k.A0O(this.A0B, i4), (C62320sa) null, A012, z2));
            }
        }
        GZ4 gz4 = this.A05;
        C53449Goh goh3 = gok.A06;
        String str5 = goh3.A06;
        String str6 = goh3.A05;
        float f = this.A00;
        C61083JwL BfW = this.A03.BfW();
        if (BfW != null) {
            2V1 r6 = r3.A05;
            int A0H = 2Yu.A0H(r6.A0C, R.attr.igds_color_text_on_white);
            AnonymousClass3XV r13 = 2WX.A02;
            2WX A002 = AnonymousClass9JR.A00(AnonymousClass9JR.A00(AnonymousClass9JR.A00(G9t.A0y((2WX) null, AnonymousClass05K.A00, 0), AnonymousClass05K.A0Y, 0, C244013aV.A0C(r3, R.dimen.audience_selector_pill_layout_height)), AnonymousClass05K.A0A, 0, C51967G9n.A06(r3)), AnonymousClass05K.A04, 0, C244013aV.A06(r3));
            2Wb A0S = AnonymousClass7TG.A0S(r6);
            C266444Yx r8 = (C266444Yx) BfW.A00;
            if (r8 == null || (str = C51968G9o.A11(C51966G9m.A0O(A0S), r8)) == null) {
                str = C244013aV.A0E(A0S, 2131963566);
            }
            A0S.A00(new GZ8(C51974G9v.A0C((2WX) null, C51965G9l.A0b(AnonymousClass05K.A01, 1.0f, 1), 1.0f), (C62320sa) BfW.A01, 106.A01(str), R.drawable.rounded_white_button, A0H, 0, 232));
            r14 = C243563Zg.A0F(A0S, r3, A002);
        } else {
            r14 = null;
        }
        return new C53846GvD(gz4, (C251263mp) null, r14, str5, str6, arrayList, f, true, false);
    }

    public C53870Gvb(AnonymousClass0iw r2, UserSession userSession, JQ3 jq3, C59619JQn jQn, GZ4 gz4, C52644GaI gaI, C53600GrF grF, String str, HashMap hashMap, HashMap hashMap2, List list, float f) {
        C51974G9v.A1L(r2, userSession, jQn);
        AnonymousClass7TF.A1F(hashMap, 7, hashMap2);
        0qQ.A0B(str, 12);
        this.A01 = r2;
        this.A02 = userSession;
        this.A06 = gaI;
        this.A04 = jQn;
        this.A07 = grF;
        this.A05 = gz4;
        this.A09 = hashMap;
        this.A0A = hashMap2;
        this.A0B = list;
        this.A00 = f;
        this.A03 = jq3;
        this.A08 = str;
    }
}
