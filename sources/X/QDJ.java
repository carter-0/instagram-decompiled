package X;

import com.facebookpay.expresscheckout.models.AuthScreenStyle;
import com.facebookpay.paymentmethod.model.PaymentMethod;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class QDJ extends 2YL {
    public AuthScreenStyle A00;
    public C11009S5g A01;
    public final 2Fk A02;
    public final AnonymousClass2gB A03;
    public final AnonymousClass2gB A04;
    public final AnonymousClass2gB A05 = Pxh.A0M();
    public final AnonymousClass2Fj A06 = JTO.A0K();
    public final AnonymousClass2gO A07;
    public final AnonymousClass2gO A08;
    public final AnonymousClass2gO A09;
    public final QDH A0A;
    public final List A0B;
    public final QDL A0C;

    public static final void A00(C10824Ryk ryk, QDJ qdj) {
        QDJ qdj2 = qdj;
        C10824Ryk ryk2 = ryk;
        if (!A02(ryk2, qdj2)) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            C11009S5g s5g = qdj2.A01;
            if (s5g != null) {
                A1C.addAll(s5g.A01);
                PaymentMethod paymentMethod = ryk2.A03;
                A1C.add(new S6A(1, false, AnonymousClass7TE.A1I(new C11027S6f((C45888D9m) null, (String) null, paymentMethod.Asm(), (String) null, (String) null, paymentMethod.getTitle(), "CSC", (String) null, (String) null, (String) null))));
                C11009S5g s5g2 = qdj2.A01;
                if (s5g2 != null) {
                    qdj2.A01 = new C11009S5g(A1C, s5g2.A00 + 1);
                    return;
                }
            }
            0qQ.A0F("authFactorRequirement");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x005a, code lost:
        if (r2 == null) goto L_0x005c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.QDJ r6) {
        /*
            java.util.List r0 = r6.A0B
            java.util.Iterator r2 = r0.iterator()
            r5 = 1
            r4 = 1
        L_0x0008:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0031
            java.lang.Object r0 = r2.next()
            X.2Fk r0 = (X.2Fk) r0
            X.SUj r1 = X.Pxe.A0W(r0)
            if (r1 == 0) goto L_0x002a
            boolean r0 = X.SUj.A0T(r1)
            if (r0 == 0) goto L_0x0022
            r5 = 0
            goto L_0x0008
        L_0x0022:
            boolean r0 = X.SUj.A0S(r1)
            if (r0 == 0) goto L_0x0008
            r4 = 0
            goto L_0x0008
        L_0x002a:
            java.lang.String r0 = "Empty components value found"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        L_0x0031:
            X.2Fj r0 = r6.A06
            java.lang.Object r0 = r0.A02()
            com.facebookpay.common.models.CurrencyAmount r0 = (com.facebookpay.common.models.CurrencyAmount) r0
            r3 = 0
            if (r0 == 0) goto L_0x0068
            java.lang.String r1 = r0.A00
            java.lang.String r0 = r0.A01
            X.SEC r2 = new X.SEC
            r2.<init>(r1, r0)
        L_0x0045:
            X.2gB r1 = r6.A05
            if (r5 == 0) goto L_0x005a
            if (r2 == 0) goto L_0x005c
            if (r4 != 0) goto L_0x0055
            X.SUj r0 = X.SUj.A0A(r2, r3)
        L_0x0051:
            r1.A0B(r0)
            return
        L_0x0055:
            X.SUj r0 = X.SUj.A09(r2)
            goto L_0x0051
        L_0x005a:
            if (r2 != 0) goto L_0x0063
        L_0x005c:
            java.lang.String r0 = ""
            X.SEC r2 = new X.SEC
            r2.<init>(r0, r0)
        L_0x0063:
            X.SUj r0 = X.SUj.A08(r2)
            goto L_0x0051
        L_0x0068:
            r2 = r3
            goto L_0x0045
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QDJ.A01(X.QDJ):void");
    }

    public static final boolean A02(C10824Ryk ryk, QDJ qdj) {
        C11009S5g s5g = qdj.A01;
        if (s5g != null) {
            for (S6A s6a : s5g.A01) {
                List<C11027S6f> list = s6a.A00;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (C11027S6f next : list) {
                        if (0qQ.A0K(next.A00, "CSC")) {
                            String str = next.A02;
                            PaymentMethod paymentMethod = ryk.A03;
                            if (0qQ.A0K(str, paymentMethod.Asm()) && 0qQ.A0K(next.A06, paymentMethod.getTitle())) {
                                return true;
                            }
                        }
                    }
                    continue;
                }
            }
            ArrayList A1C = AnonymousClass7TE.A1C();
            C11009S5g s5g2 = qdj.A01;
            if (s5g2 != null) {
                int i = s5g2.A00;
                for (S6A next2 : s5g2.A01) {
                    List<C11027S6f> list2 = next2.A00;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<C11027S6f> it = list2.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (0qQ.A0K(it.next().A00, "CSC")) {
                                    i--;
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                    A1C.add(next2);
                }
                qdj.A01 = new C11009S5g(A1C, i);
                return false;
            }
        }
        0qQ.A0F("authFactorRequirement");
        throw AnonymousClass00P.createAndThrow();
    }

    public QDJ(QDL qdl, QDH qdh) {
        this.A0A = qdh;
        this.A0C = qdl;
        AnonymousClass2gB A0M = Pxh.A0M();
        JTP.A1B(A0M, false);
        this.A04 = A0M;
        AnonymousClass2gB A0M2 = Pxh.A0M();
        this.A03 = A0M2;
        this.A02 = A0M2;
        this.A0B = AnonymousClass7TE.A1C();
        this.A08 = C11647Sdp.A00(this, 25);
        this.A07 = C11647Sdp.A00(this, 24);
        this.A09 = C11647Sdp.A00(this, 26);
    }
}
