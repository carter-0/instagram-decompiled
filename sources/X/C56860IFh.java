package X;

/* renamed from: X.IFh  reason: case insensitive filesystem */
public final class C56860IFh implements C59646JRo {
    public final int A00;

    public C56860IFh(int i) {
        this.A00 = i;
    }

    public final C56101Hso AAn(JNW jnw) {
        JNU jnu;
        long j;
        long j2;
        C56100Hsn hsn;
        C56033Hrg hrg;
        C56100Hsn A01;
        C56100Hsn hsn2;
        C56100Hsn hsn3;
        boolean z;
        C56100Hsn hsn4;
        boolean z2;
        int A002;
        C56100Hsn A003;
        boolean z3;
        switch (this.A00) {
            case 0:
                C56033Hrg hrg2 = ((C56861IFi) jnw).A00;
                return new C56101Hso(hrg2.A00(hrg2.A02), hrg2.A00(hrg2.A00), AnonymousClass7TF.A1W(jnw.Asz(), AnonymousClass05K.A00));
            case 1:
                jnu = C56856IFd.A00;
                break;
            case 2:
                jnu = C56855IFc.A00;
                break;
            default:
                C56861IFi iFi = (C56861IFi) jnw;
                C56101Hso hso = iFi.A01;
                if (hso == null) {
                    return C56491HzN.A03.AAn(jnw);
                }
                boolean z4 = iFi.A02;
                if (z4) {
                    hsn = hso.A01;
                    hrg = iFi.A00;
                    A01 = C56167Htw.A01(hrg, hsn, jnw);
                    hsn3 = hso.A00;
                    hsn2 = A01;
                } else {
                    hsn = hso.A00;
                    hrg = iFi.A00;
                    A01 = C56167Htw.A01(hrg, hsn, jnw);
                    hsn2 = hso.A01;
                    hsn3 = A01;
                }
                if (0qQ.A0K(A01, hsn)) {
                    return hso;
                }
                Integer Asz = jnw.Asz();
                if (Asz == AnonymousClass05K.A00 || (Asz == AnonymousClass05K.A0C && hsn2.A00 > hsn3.A00)) {
                    z = true;
                } else {
                    z = false;
                }
                C56101Hso hso2 = new C56101Hso(hsn2, hsn3, z);
                C56100Hsn hsn5 = hso2.A01;
                long j3 = hsn5.A01;
                C56100Hsn hsn6 = hso2.A00;
                if (j3 != hsn6.A01) {
                    boolean z5 = hso2.A02;
                    C56100Hsn hsn7 = hsn6;
                    if (z5) {
                        hsn7 = hsn5;
                    }
                    if (hsn7.A00 != 0) {
                        return hso2;
                    }
                    C56100Hsn hsn8 = hsn5;
                    if (z5) {
                        hsn8 = hsn6;
                    }
                    if (hrg.A03.A04.A03.A00.length() != hsn8.A00) {
                        return hso2;
                    }
                } else if (hsn5.A00 != hsn6.A00) {
                    return hso2;
                }
                String str = hrg.A03.A04.A03.A00;
                int length = str.length();
                if (length == 0) {
                    return hso2;
                }
                int i = hrg.A02;
                if (i == 0) {
                    int A004 = C18085VlF.A00(str, 0);
                    if (z4) {
                        A003 = C56167Htw.A00(hrg, hsn5, A004);
                        z3 = true;
                    } else {
                        hsn4 = C56167Htw.A00(hrg, hsn6, A004);
                        z2 = false;
                        return new C56101Hso(hsn5, hsn4, z2);
                    }
                } else if (i == length) {
                    int A012 = C18085VlF.A01(str, length);
                    if (z4) {
                        A003 = C56167Htw.A00(hrg, hsn5, A012);
                        z3 = false;
                    } else {
                        hsn4 = C56167Htw.A00(hrg, hsn6, A012);
                        z2 = true;
                        return new C56101Hso(hsn5, hsn4, z2);
                    }
                } else {
                    boolean A1S = AnonymousClass7TF.A1S(hso.A02 ? 1 : 0, 1);
                    if (z4 ^ A1S) {
                        A002 = C18085VlF.A01(str, i);
                    } else {
                        A002 = C18085VlF.A00(str, i);
                    }
                    if (z4) {
                        return new C56101Hso(C56167Htw.A00(hrg, hsn5, A002), hsn6, A1S);
                    }
                    return new C56101Hso(hsn5, C56167Htw.A00(hrg, hsn6, A002), A1S);
                }
                return new C56101Hso(A003, hsn6, z3);
        }
        boolean A1W = AnonymousClass7TF.A1W(jnw.Asz(), AnonymousClass05K.A00);
        C56033Hrg hrg3 = ((C56861IFi) jnw).A00;
        long AhR = jnu.AhR(hrg3, hrg3.A02);
        if (!A1W) {
            j = AhR >> 32;
        } else {
            j = AhR & 4294967295L;
        }
        C56100Hsn A005 = hrg3.A00((int) j);
        long AhR2 = jnu.AhR(hrg3, hrg3.A00);
        if (A1W) {
            j2 = AhR2 >> 32;
        } else {
            j2 = AhR2 & 4294967295L;
        }
        return new C56101Hso(A005, hrg3.A00((int) j2), A1W);
    }
}
