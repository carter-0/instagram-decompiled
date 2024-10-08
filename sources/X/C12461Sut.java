package X;

import android.os.Bundle;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* renamed from: X.Sut  reason: case insensitive filesystem */
public final class C12461Sut implements C13735Tg7 {
    public final AnonymousClass07Z A00;
    public final AnonymousClass2Fj A01;
    public final QDE A02;
    public final C10440RsH A03;
    public final SSY A04;
    public final AnonymousClass5A3 A05;
    public final Object A06;
    public final String A07;
    public final Queue A08;

    private void A00(C13620Tdm tdm, Set set) {
        String str = this.A07;
        Object obj = this.A06;
        Bundle bundle = this.A03.A01;
        String string = bundle.getString("PAYMENT_ACCOUNT_ID");
        String string2 = bundle.getString("PAYMENT_OTC_SESSION_ID");
        String string3 = bundle.getString("PAYMENT_OTC_TYPE");
        Map A012 = S9s.A01(bundle);
        AnonymousClass7TG.A1N(str, obj);
        0qQ.A0B(A012, 7);
        C11214SFo sFo = new C11214SFo(C11095S9w.A00(tdm, set), obj, str, string, string2, string3, (String) null, (String) null, A012, set);
        SSC.A03(SQA.A03(AnonymousClass2E0.A04(), this.A05, sFo)).A06(this.A00, C11652Sdu.A00(this.A01, 29));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001f, code lost:
        if (r1.A00 == 10) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Cwz(java.lang.Throwable r7) {
        /*
            r6 = this;
            boolean r3 = r7 instanceof X.C13223TQo
            if (r3 == 0) goto L_0x000d
            r0 = r7
            X.TQo r0 = (X.C13223TQo) r0
            int r1 = r0.A00
            r0 = 104(0x68, float:1.46E-43)
            if (r1 == r0) goto L_0x0034
        L_0x000d:
            boolean r0 = r7 instanceof X.TQY
            r2 = 0
            if (r0 != 0) goto L_0x0021
            if (r3 == 0) goto L_0x0035
            r1 = r7
            X.TQo r1 = (X.C13223TQo) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r1 = r1.A00
            r0 = 10
            if (r1 != r0) goto L_0x0035
        L_0x0021:
            X.QDE r0 = r6.A02
            r0.A01()
            X.2Fj r1 = r6.A01
            X.TQY r0 = new X.TQY
            r0.<init>(r7)
            X.SUj r0 = X.SUj.A0A(r2, r0)
        L_0x0031:
            r1.A0A(r0)
        L_0x0034:
            return
        L_0x0035:
            boolean r0 = r7 instanceof X.C8285QnR
            if (r0 == 0) goto L_0x0040
            X.2Fj r1 = r6.A01
            X.SUj r0 = X.SUj.A0A(r2, r7)
            goto L_0x0031
        L_0x0040:
            java.util.Queue r5 = r6.A08
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x0060
            r0 = 0
            X.SNj[] r0 = new X.C11330SNj[r0]
            java.util.HashSet r3 = X.AnonymousClass7TE.A1F()
            java.util.Collections.addAll(r3, r0)
            X.SSZ r2 = X.SOC.A01()
            r1 = 1
            X.SvS r0 = new X.SvS
            r0.<init>(r2, r1)
            r6.A00(r0, r3)
            return
        L_0x0060:
            X.SSY r0 = r6.A04
            X.2Fj r1 = r6.A01
            java.lang.String r4 = r6.A07
            java.lang.Object r3 = r6.A06
            X.RsH r2 = r6.A03
            r0.A06(r1, r2, r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12461Sut.Cwz(java.lang.Throwable):void");
    }

    public final void Cx0(C10586Rug rug) {
        HashSet A1F;
        C12496SvS svS;
        C11330SNj sNj = rug.A01;
        if (sNj != null) {
            A1F = Pxj.A0v(sNj);
            if ("BIO".equalsIgnoreCase(sNj.A03)) {
                svS = new C12496SvS(rug, 0);
            } else {
                svS = new C12496SvS(SOC.A01(), 1);
            }
        } else {
            A1F = AnonymousClass7TE.A1F();
            Collections.addAll(A1F, new C11330SNj[0]);
            svS = new C12496SvS(SOC.A01(), 1);
        }
        A00(svS, A1F);
    }

    public C12461Sut(AnonymousClass07Z r1, AnonymousClass2Fj r2, QDE qde, C10440RsH rsH, SSY ssy, AnonymousClass5A3 r6, Object obj, String str, Queue queue) {
        this.A04 = ssy;
        this.A05 = r6;
        this.A00 = r1;
        this.A02 = qde;
        this.A01 = r2;
        this.A07 = str;
        this.A06 = obj;
        this.A03 = rsH;
        this.A08 = queue;
    }
}
