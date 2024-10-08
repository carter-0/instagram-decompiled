package X;

import androidx.compose.ui.Modifier;
import com.instagram.compose.core.ui.IgClickableTextKt;
import java.util.Iterator;

/* renamed from: X.HXx  reason: case insensitive filesystem */
public abstract class C54915HXx {
    /* JADX INFO: finally extract failed */
    public static final void A00(C62320sa r28, C286575Wy r29, int i) {
        int i2;
        int i3;
        C62320sa r3 = r28;
        0qQ.A0B(r3, 0);
        C286575Wy r2 = r29;
        r2.ExV(-1777586169);
        int i4 = i;
        if ((i & 6) == 0) {
            i2 = C41848B3p.A01(r2, r3) | i;
        } else {
            i2 = i4;
        }
        if ((i2 & 3) != 2 || !r2.Bwn()) {
            if (0fL.A02()) {
                0fL.A01(-567874642, "com.instagram.creation.genai.attribution.bottomsheet.FooterCreatedWithAIText (FooterCreatedWithAIText.kt:29)");
            }
            Object A16 = C51966G9m.A16(r2);
            int i5 = 0;
            String A00 = C304346Dc.A00(r2, 2131956901);
            r2.ExS(9388920);
            boolean A1S = AnonymousClass7TF.A1S(i2 & 14, 4);
            Object ECw = r2.ECw();
            if (A1S || ECw == AnonymousClass5XT.A00) {
                ECw = C51969G9p.A0z(r2, r3, 11);
            }
            C286565Wx A0H = C51965G9l.A0H(r2, false);
            C61081JwJ jwJ = new C61081JwJ(A00, (0sP) ECw);
            String A002 = C304346Dc.A00(r2, 2131964884);
            boolean A1Z = C51967G9n.A1Z(r2, A16, 9392607);
            Object ECw2 = r2.ECw();
            if (A1Z || ECw2 == AnonymousClass5XT.A00) {
                ECw2 = C51969G9p.A0z(r2, A16, 12);
            }
            AnonymousClass62O A04 = AnonymousClass62Q.A04(jwJ, new C61081JwJ(A002, C51965G9l.A0z(A0H, ECw2)));
            boolean A1Y = C51967G9n.A1Y(r2, A04, 9401659);
            Object ECw3 = r2.ECw();
            if (A1Y || ECw3 == AnonymousClass5XT.A00) {
                ECw3 = G9t.A0o(r2, DbT.A0z(" • ", A04, J25.A00));
            }
            C284945Oz A0J = C51965G9l.A0J(A0H, ECw3, false);
            r2.ExS(9405716);
            C303876Bd A0b = C51969G9p.A0b();
            Iterator A17 = C51968G9o.A17(r2, A04, 9406735);
            while (A17.hasNext()) {
                Object next = A17.next();
                int i6 = i5 + 1;
                if (i5 < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                String str = ((C61081JwJ) next).A01;
                A0b.A09(str);
                int A003 = A0b.A00(new AnonymousClass5ZB((C268454dQ) null, (C291715hl) null, (C291725hm) null, AnonymousClass5ZD.A03, (C291795ht) null, 65530, C51966G9m.A0D(r2), 0, 0));
                try {
                    int A08 = 00l.A08(C51966G9m.A1A(A0J), str, 0, false);
                    if (str != null) {
                        i3 = str.length();
                    } else {
                        i3 = 0;
                    }
                    A0b.A0A("Link", str, A08, i3 + A08);
                    A0b.A04(A003);
                    if (i5 < DbT.A02(A04, 1)) {
                        A0b.A09(" • ");
                    }
                    i5 = i6;
                } catch (Throwable th) {
                    A0b.A04(A003);
                    throw th;
                }
            }
            C286565Wx.A0L(A0H, false);
            C286025Tq A02 = A0b.A02();
            C286565Wx.A0L(A0H, false);
            long A0D = C51966G9m.A0D(r2);
            Modifier A09 = C287195Zj.A09(C287195Zj.A0B(Modifier.A00, 0.0f, 0.0f, 0.0f, 16.0f), 16.0f, 0.0f);
            AnonymousClass5Z4 A0b2 = C51966G9m.A0b(r2);
            boolean A1Z2 = G9t.A1Z(r2, A02, A04, 9430026);
            Object ECw4 = r2.ECw();
            if (A1Z2 || ECw4 == AnonymousClass5XT.A00) {
                ECw4 = C59102J6k.A00(r2, A04, A02, 1);
            }
            IgClickableTextKt.A07(r2, A09, A02, A0b2, C51965G9l.A0z(A0H, ECw4), A0D);
            if (0fL.A02()) {
                0fL.A00(1222981824);
            }
        } else {
            r2.Evl();
        }
        C286625Xd ASQ = r2.ASQ();
        if (ASQ != null) {
            JGC.A01(ASQ, r3, i4, 38);
        }
    }
}
