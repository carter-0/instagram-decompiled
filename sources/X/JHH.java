package X;

import androidx.compose.ui.Modifier;
import com.instagram.common.typedurl.ImageUrl;
import java.util.Iterator;
import java.util.List;

public final class JHH extends 0Yg implements 0sK {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JHH(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        super(3);
        this.A00 = i;
        this.A06 = z;
        this.A02 = obj;
        this.A04 = obj2;
        this.A01 = obj3;
        this.A05 = obj4;
        this.A03 = obj5;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        C54629HLm hLm;
        C54629HLm hLm2;
        int i;
        C286575Wy r0 = (C286575Wy) obj2;
        if (this.A00 != 0) {
            if (G9w.A1a(obj3)) {
                0fL.A01(1228253660, "com.instagram.barcelona.feed.mediaviewer.ui.MediaViewerScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MediaViewerScreen.kt:442)");
            }
            boolean z = this.A06;
            r0.ExS(-420234987);
            Object obj4 = this.A02;
            boolean AGu = r0.AGu(obj4);
            Object obj5 = this.A04;
            boolean A1U = C51966G9m.A1U(r0, obj5, AGu);
            Object obj6 = this.A01;
            boolean A1U2 = C51966G9m.A1U(r0, obj6, A1U);
            Object obj7 = this.A05;
            boolean A1Z = C51965G9l.A1Z(r0, obj7, A1U2);
            Object obj8 = this.A03;
            boolean A1Z2 = C51965G9l.A1Z(r0, obj8, A1Z);
            Object ECw = r0.ECw();
            if (A1Z2 || ECw == AnonymousClass5XT.A00) {
                ECw = new C58218IoM(4, obj6, obj4, obj7, obj5, obj8);
                r0.FLL(ECw);
            }
            C54825HUg.A00(r0, (Modifier) null, (C62320sa) ECw, C51968G9o.A1Y(r0) ? 1 : 0, 4, z);
            if (0fL.A02()) {
                i = 49477531;
            }
            return C60340gF.A00;
        }
        int A0M = AnonymousClass7TE.A0M(obj3);
        0qQ.A0B(obj, 0);
        if ((A0M & 17) != 16 || !r0.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-70947157, "com.instagram.aistudio.editor.AiCreationTopicPickerScreen.<anonymous>.<anonymous>.<anonymous> (AiCreationTopicPickerScreen.kt:100)");
            }
            C285245Qk r9 = Modifier.A00;
            Modifier A0B = C287195Zj.A0B(r9, 0.0f, 0.0f, 0.0f, 10.0f);
            C304756Fc A012 = C287275Zs.A01(11.0f);
            boolean z2 = this.A06;
            C61060Jvy jvy = (C61060Jvy) this.A05;
            0sL r22 = (0sL) this.A02;
            List list = (List) this.A01;
            C62320sa r21 = (C62320sa) this.A03;
            List list2 = (List) this.A04;
            AnonymousClass5RD A0K = G9w.A0K(A012, r0);
            int A002 = C287425a7.A00(r0);
            C286565Wx r4 = (C286565Wx) r0;
            AnonymousClass5RM A042 = C286565Wx.A04(r4);
            Modifier A013 = C287435a8.A01(r0, A0B);
            C62320sa r3 = C287485aD.A00;
            C51973G9u.A0z(r0, r4, r3);
            0sL r2 = C287485aD.A03;
            0sL A0w = C51969G9p.A0w(r0, A0K, A042, r2);
            0sL r1 = C287485aD.A02;
            if (r4.A0K || !C51972G9s.A1Q(r0, A002)) {
                C51971G9r.A13(r0, r1, A002);
            }
            0sL A1K = C51966G9m.A1K(r0, A013);
            AnonymousClass6FX r18 = AnonymousClass6FX.A00;
            Modifier A003 = r18.A00(r9);
            C287325Zx r17 = C287275Zs.A07;
            C287265Zr r12 = C287215Zl.A02;
            AnonymousClass5RD A022 = C291495hO.A02(r17, r0, r12, 0);
            int A004 = C287425a7.A00(r0);
            AnonymousClass5RM A043 = C286565Wx.A04(r4);
            Modifier A014 = C287435a8.A01(r0, A003);
            C51973G9u.A0z(r0, r4, r3);
            C287595aO.A00(r0, A022, r2);
            if (C51965G9l.A1Y(r0, r4, A043, A0w) || !C51972G9s.A1Q(r0, A004)) {
                C51971G9r.A13(r0, r1, A004);
            }
            C287595aO.A00(r0, A014, A1K);
            boolean z3 = jvy.A03;
            String A005 = AnonymousClass000.A00(2946);
            if (z3) {
                r0.ExS(-70848615);
                C56612I4m.A02(r0, 0);
            } else {
                r0.ExS(-70734225);
                C286575Wy r24 = r0;
                0sL r30 = r22;
                I64.A01(r24, C54629HLm.CUSTOM, DbS.A0V(""), "", "", "", r30, 28086);
                if (jvy.A02) {
                    r0.ExS(-70347407);
                    C56612I4m.A01(r0, 0);
                } else {
                    Iterator A17 = C51968G9o.A17(r0, list, -70241852);
                    while (A17.hasNext()) {
                        C61070Jw8 jw8 = (C61070Jw8) A17.next();
                        String str = jw8.A03;
                        ImageUrl imageUrl = (ImageUrl) jw8.A01;
                        String A015 = C52409GRk.A01(r0, (C266444Yx) jw8.A02);
                        String A016 = C52409GRk.A01(r0, (C266444Yx) jw8.A00);
                        if (0qQ.A0K(str, A005)) {
                            hLm = C54629HLm.CREATOR_AI_COMING_SOON;
                        } else {
                            hLm = C54629HLm.TEMPLATE;
                        }
                        I64.A01(r24, hLm, imageUrl, str, A015, A016, r30, 0);
                    }
                    r21.invoke();
                }
                C286565Wx.A0L(r4, false);
            }
            C286565Wx.A0L(r4, false);
            r0.ASN();
            Modifier A006 = r18.A00(r9);
            float f = 66.0f;
            if (z2) {
                f = 0.0f;
            }
            Modifier A0B2 = C287195Zj.A0B(A006, 0.0f, f, 0.0f, 0.0f);
            AnonymousClass5RD A023 = C291495hO.A02(r17, r0, r12, 0);
            int A007 = C287425a7.A00(r0);
            AnonymousClass5RM A044 = C286565Wx.A04(r4);
            Modifier A017 = C287435a8.A01(r0, A0B2);
            C51973G9u.A0z(r0, r4, r3);
            C287595aO.A00(r0, A023, r2);
            if (C51965G9l.A1Y(r0, r4, A044, A0w) || !C51972G9s.A1Q(r0, A007)) {
                C51971G9r.A13(r0, r1, A007);
            }
            C287595aO.A00(r0, A017, A1K);
            if (z3) {
                r0.ExS(-69086575);
                C56612I4m.A02(r0, 0);
            } else {
                r0.ExS(-68975533);
                if (jvy.A02) {
                    r0.ExS(-68956375);
                    C56612I4m.A01(r0, 0);
                } else {
                    Iterator A172 = C51968G9o.A17(r0, list2, -68842698);
                    while (A172.hasNext()) {
                        C61070Jw8 jw82 = (C61070Jw8) A172.next();
                        String str2 = jw82.A03;
                        ImageUrl imageUrl2 = (ImageUrl) jw82.A01;
                        String A018 = C52409GRk.A01(r0, (C266444Yx) jw82.A02);
                        String A019 = C52409GRk.A01(r0, (C266444Yx) jw82.A00);
                        if (0qQ.A0K(str2, A005)) {
                            hLm2 = C54629HLm.CREATOR_AI_COMING_SOON;
                        } else {
                            hLm2 = C54629HLm.TEMPLATE;
                        }
                        I64.A01(r0, hLm2, imageUrl2, str2, A018, A019, r22, 0);
                    }
                }
                C286565Wx.A0L(r4, false);
            }
            if (C51973G9u.A1R(r0, r4)) {
                i = 2032430297;
            }
            return C60340gF.A00;
        }
        r0.Evl();
        return C60340gF.A00;
        0fL.A00(i);
        return C60340gF.A00;
    }
}
