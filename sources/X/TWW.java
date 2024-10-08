package X;

import android.util.SparseArray;
import com.facebookpay.otc.models.OtcInput;

public final class TWW extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ SparseArray A01;
    public final /* synthetic */ 2Fk A02;
    public final /* synthetic */ AnonymousClass2gB A03;
    public final /* synthetic */ SJ1 A04;
    public final /* synthetic */ OtcInput A05;
    public final /* synthetic */ Stc A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TWW(SparseArray sparseArray, 2Fk r3, AnonymousClass2gB r4, SJ1 sj1, OtcInput otcInput, Stc stc, String str, String str2, int i) {
        super(1);
        this.A00 = i;
        this.A08 = str;
        this.A05 = otcInput;
        this.A06 = stc;
        this.A04 = sj1;
        this.A01 = sparseArray;
        this.A07 = str2;
        this.A03 = r4;
        this.A02 = r3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003a, code lost:
        r2 = X.Pxi.A0G(r10.A04, r10.A06);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r11) {
        /*
            r10 = this;
            X.SUj r11 = (X.SUj) r11
            int r1 = r10.A00
            r0 = 3
            if (r1 == r0) goto L_0x002c
            r0 = 7
            if (r1 != r0) goto L_0x00ef
            X.Stc r2 = r10.A06
            X.SJ1 r1 = r10.A04
            X.0qQ.A0A(r11)
            java.lang.String r0 = r10.A07
            r2.A0B(r1, r11, r0)
        L_0x0016:
            boolean r0 = X.SUj.A0V(r11)
            if (r0 != 0) goto L_0x0022
            boolean r0 = X.SUj.A0S(r11)
            if (r0 == 0) goto L_0x0029
        L_0x0022:
            X.2gB r1 = r10.A03
            X.2Fk r0 = r10.A02
            r1.A0D(r0)
        L_0x0029:
            X.0gF r0 = X.C60340gF.A00
            return r0
        L_0x002c:
            java.lang.String r1 = r10.A08
            java.lang.String r0 = "CREATE"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x005a
            com.facebookpay.otc.models.OtcInput r0 = r10.A05
            if (r0 == 0) goto L_0x004d
            X.Stc r1 = r10.A06
            X.SJ1 r0 = r10.A04
            X.2gB r2 = X.Pxi.A0G(r0, r1)
            X.SUj r1 = X.Pxe.A0W(r2)
            if (r1 == 0) goto L_0x004d
            X.Scj r0 = X.C11584Scj.A00
            X.SUj.A0E(r0, r2, r1)
        L_0x004d:
            X.Stc r2 = r10.A06
            android.util.SparseArray r1 = r10.A01
            X.SJ1 r0 = r10.A04
            X.0qQ.A0A(r11)
            r2.A08(r1, r0, r11)
            goto L_0x0016
        L_0x005a:
            X.Stc r1 = r10.A06
            android.util.SparseArray r4 = r10.A01
            X.SJ1 r0 = r10.A04
            X.0qQ.A0A(r11)
            X.2gB r5 = X.Pxi.A0G(r0, r1)
            boolean r0 = X.SUj.A0V(r11)
            if (r0 == 0) goto L_0x0016
            java.lang.Object r1 = r11.A01
            if (r1 == 0) goto L_0x0016
            boolean r0 = X.SUj.A0Q(r5)
            if (r0 == 0) goto L_0x0016
            r1.getClass()
            X.QXg r1 = (X.C7795QXg) r1
            X.QXK r0 = r1.A0E()
            r1 = 0
            if (r0 == 0) goto L_0x0087
            X.QRp r1 = r0.A0E()
        L_0x0087:
            r0 = 0
            X.SUj r8 = X.Stc.A03(r1, r0)
            if (r8 == 0) goto L_0x0016
            java.lang.Object r2 = r8.A01
            com.facebookpay.paymentmethod.model.PaymentMethod r2 = (com.facebookpay.paymentmethod.model.PaymentMethod) r2
            if (r2 == 0) goto L_0x0016
            java.lang.Object r6 = X.SUj.A0C(r5)
            X.SJH r6 = (X.SJH) r6
            java.util.List r9 = r6.A02
            X.2IJ r1 = X.AnonymousClass2IK.A04
            X.2IK r0 = X.AnonymousClass2IK.A06
            if (r0 == 0) goto L_0x00b3
            X.S7C r3 = r1.A02()
            java.lang.String r2 = r2.Asm()
            java.lang.String r1 = X.C11385SQy.A02(r4)
            java.lang.String r0 = "ECP"
            r3.A02(r2, r1, r0)
        L_0x00b3:
            X.TYU r7 = X.TYU.A00
            r0 = 2
            X.0qQ.A0B(r7, r0)
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1D(r9)
            java.util.Iterator r3 = r9.iterator()
            r2 = 0
        L_0x00c2:
            boolean r0 = r3.hasNext()
            r1 = -1
            if (r0 == 0) goto L_0x00dc
            java.lang.Object r0 = r3.next()
            java.lang.Object r0 = r7.invoke(r0, r8)
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x00ec
            if (r2 == r1) goto L_0x00dc
            r4.set(r2, r8)
        L_0x00dc:
            java.util.List r2 = X.00k.A0a(r4)
            r1 = 0
            r0 = 1022(0x3fe, float:1.432E-42)
            X.SJH r0 = X.SJH.A00(r6, r1, r2, r0)
            X.SUj.A0K(r5, r0)
            goto L_0x0016
        L_0x00ec:
            int r2 = r2 + 1
            goto L_0x00c2
        L_0x00ef:
            java.lang.UnsupportedOperationException r0 = X.C66580MXl.A11()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.TWW.invoke(java.lang.Object):java.lang.Object");
    }
}
