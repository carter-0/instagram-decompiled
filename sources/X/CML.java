package X;

import java.util.ArrayList;
import java.util.List;

public final class CML extends 17P implements C46241DRw {
    public C46235DRq A00;
    public C46237DRs A01;
    public DS1 A02;
    public DS3 A03;
    public DS5 A04;
    public DS6 A05;
    public DSD A06;
    public List A07;

    public final C46241DRw E7e(1E9 r5) {
        ArrayList A0r;
        C46235DRq dRq = this.A00;
        if (dRq == null) {
            dRq = (C46235DRq) A05(-1639512865, CIQ.class);
        }
        DSD dsd = null;
        if (dRq != null) {
            dRq.E77(r5);
        } else {
            dRq = null;
        }
        this.A00 = dRq;
        C46237DRs dRs = this.A01;
        if (dRs == null) {
            dRs = (C46237DRs) A05(-807412377, CK2.class);
        }
        if (dRs != null) {
            dRs.E7N(r5);
        } else {
            dRs = null;
        }
        this.A01 = dRs;
        List<C46243DRy> list = this.A07;
        if (list == null && (list = A08(-932192328, CMM.class)) == null) {
            A0r = null;
        } else {
            A0r = AnonymousClass7TG.A0r(list);
            for (C46243DRy dRy : list) {
                dRy.E7g(r5);
                A0r.add(dRy);
            }
        }
        this.A07 = A0r;
        DS1 ds1 = this.A02;
        if (ds1 == null) {
            ds1 = (DS1) A05(172404652, CNf.class);
        }
        if (ds1 != null) {
            ds1.E82(r5);
        } else {
            ds1 = null;
        }
        this.A02 = ds1;
        DS3 ds3 = this.A03;
        if (ds3 == null) {
            ds3 = (DS3) A05(-741971185, CNs.class);
        }
        if (ds3 != null) {
            ds3.E85(r5);
        } else {
            ds3 = null;
        }
        this.A03 = ds3;
        DS5 ds5 = this.A04;
        if (ds5 == null) {
            ds5 = (DS5) A05(486111451, CP8.class);
        }
        if (ds5 != null) {
            ds5.E8h(r5);
        } else {
            ds5 = null;
        }
        this.A04 = ds5;
        DS6 ds6 = this.A05;
        if (ds6 == null) {
            ds6 = (DS6) A05(-883390368, CP9.class);
        }
        if (ds6 != null) {
            ds6.E8i(r5);
        } else {
            ds6 = null;
        }
        this.A05 = ds6;
        DSD dsd2 = this.A06;
        if (!(dsd2 == null && (dsd2 = (DSD) A05(-432682686, CQG.class)) == null)) {
            dsd2.E9L(r5);
            dsd = dsd2;
        }
        this.A06 = dsd;
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.BFZ F6K(X.1E9 r18) {
        /*
            r17 = this;
            r0 = 150595944(0x8f9e968, float:1.5041016E-33)
            r1 = r17
            java.lang.String r12 = r1.A0j(r0)
            r0 = -468163310(0xffffffffe4186512, float:-1.1244752E22)
            int r14 = r1.getIntValueByHashCode(r0)
            X.DRq r0 = r1.A00
            if (r0 != 0) goto L_0x001f
            r2 = -1639512865(0xffffffff9e4704df, float:-1.053598E-20)
            java.lang.Class<X.CIQ> r0 = X.CIQ.class
            com.facebook.pando.TreeJNI r0 = r1.A05(r2, r0)
            X.DRq r0 = (X.C46235DRq) r0
        L_0x001f:
            r11 = 0
            r2 = r18
            if (r0 == 0) goto L_0x00fc
            X.GoT r4 = r0.F1A(r2)
        L_0x0028:
            X.DRs r0 = r1.A01
            if (r0 != 0) goto L_0x00f6
            r3 = -807412377(0xffffffffcfdfdd67, float:-7.511658E9)
            java.lang.Class<X.CK2> r0 = X.CK2.class
            com.facebook.pando.TreeJNI r0 = r1.A05(r3, r0)
            X.DRs r0 = (X.C46237DRs) r0
            if (r0 != 0) goto L_0x00f6
            r6 = r11
        L_0x003a:
            java.util.List r0 = r1.A07
            if (r0 != 0) goto L_0x00da
            r3 = -932192328(0xffffffffc86fdfb8, float:-245630.88)
            java.lang.Class<X.CMM> r0 = X.CMM.class
            com.google.common.collect.ImmutableList r0 = r1.A08(r3, r0)
            if (r0 != 0) goto L_0x00da
            r13 = r11
        L_0x004a:
            X.DLF r3 = X.DLF.A00
            r0 = 2007145938(0x77a29dd2, float:6.5965083E33)
            java.lang.Object r5 = r1.A0M(r0, r3)
            com.instagram.api.schemas.ClipsMidCardType r5 = (com.instagram.api.schemas.ClipsMidCardType) r5
            X.DS1 r0 = r1.A02
            if (r0 != 0) goto L_0x00d5
            r3 = 172404652(0xa46afac, float:9.5663934E-33)
            java.lang.Class<X.CNf> r0 = X.CNf.class
            com.facebook.pando.TreeJNI r0 = r1.A05(r3, r0)
            X.DS1 r0 = (X.DS1) r0
            if (r0 != 0) goto L_0x00d5
            r7 = r11
        L_0x0067:
            X.DS3 r0 = r1.A03
            if (r0 != 0) goto L_0x00d0
            r3 = -741971185(0xffffffffd3c66b0f, float:-1.70439934E12)
            java.lang.Class<X.CNs> r0 = X.CNs.class
            com.facebook.pando.TreeJNI r0 = r1.A05(r3, r0)
            X.DS3 r0 = (X.DS3) r0
            if (r0 != 0) goto L_0x00d0
            r8 = r11
        L_0x0079:
            X.DS5 r0 = r1.A04
            if (r0 != 0) goto L_0x00cb
            r3 = 486111451(0x1cf978db, float:1.6508678E-21)
            java.lang.Class<X.CP8> r0 = X.CP8.class
            com.facebook.pando.TreeJNI r0 = r1.A05(r3, r0)
            X.DS5 r0 = (X.DS5) r0
            if (r0 != 0) goto L_0x00cb
            r9 = r11
        L_0x008b:
            X.DS6 r0 = r1.A05
            if (r0 != 0) goto L_0x00c6
            r3 = -883390368(0xffffffffcb588860, float:-1.4190688E7)
            java.lang.Class<X.CP9> r0 = X.CP9.class
            com.facebook.pando.TreeJNI r0 = r1.A05(r3, r0)
            X.DS6 r0 = (X.DS6) r0
            if (r0 != 0) goto L_0x00c6
            r10 = r11
        L_0x009d:
            r0 = 1709232679(0x65e0d227, float:1.3271084E23)
            int r15 = r1.getIntValueByHashCode(r0)
            X.DSD r0 = r1.A06
            if (r0 != 0) goto L_0x00b5
            r3 = -432682686(0xffffffffe635c942, float:-2.1461522E23)
            java.lang.Class<X.CQG> r0 = X.CQG.class
            com.facebook.pando.TreeJNI r0 = r1.A05(r3, r0)
            X.DSD r0 = (X.DSD) r0
            if (r0 == 0) goto L_0x00b9
        L_0x00b5:
            X.BHo r11 = r0.FCM(r2)
        L_0x00b9:
            r0 = 1496409374(0x5931651e, float:3.12076565E15)
            int r16 = r1.getIntValueByHashCode(r0)
            X.BFZ r3 = new X.BFZ
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r3
        L_0x00c6:
            X.BH1 r10 = r0.FAR(r2)
            goto L_0x009d
        L_0x00cb:
            X.BH0 r9 = r0.FAQ(r2)
            goto L_0x008b
        L_0x00d0:
            X.Got r8 = r0.F8W(r2)
            goto L_0x0079
        L_0x00d5:
            X.BG4 r7 = r0.F8F(r2)
            goto L_0x0067
        L_0x00da:
            java.util.ArrayList r13 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r3 = r0.iterator()
        L_0x00e2:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r3.next()
            X.DRy r0 = (X.C46243DRy) r0
            X.BFa r0 = r0.F6N(r2)
            r13.add(r0)
            goto L_0x00e2
        L_0x00f6:
            X.Goa r6 = r0.F33(r2)
            goto L_0x003a
        L_0x00fc:
            r4 = r11
            goto L_0x0028
        */
        throw new UnsupportedOperationException("Method not decompiled: X.CML.F6K(X.1E9):X.BFZ");
    }
}
