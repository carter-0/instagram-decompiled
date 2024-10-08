package X;

import android.graphics.Typeface;

/* renamed from: X.VsM  reason: case insensitive filesystem */
public final class C18470VsM {
    public final Typeface A00;
    public final C18549Vu1 A01;
    public final UEy A02;
    public final char[] A03;

    public C18470VsM(Typeface typeface, UEy uEy) {
        int i;
        int i2;
        int i3;
        this.A00 = typeface;
        this.A02 = uEy;
        this.A01 = new C18549Vu1(1024);
        int A002 = uEy.A00(6);
        if (A002 != 0) {
            i = C13992Tns.A03(uEy, A002);
        } else {
            i = 0;
        }
        this.A03 = new char[(i * 2)];
        int A003 = uEy.A00(6);
        if (A003 != 0) {
            int A032 = C13992Tns.A03(uEy, A003);
            for (int i4 = 0; i4 < A032; i4++) {
                C18749Vzk vzk = new C18749Vzk(this, i4);
                Character.toChars(C13992Tns.A01(C18749Vzk.A00(vzk)), this.A03, i4 * 2);
                C14914UEx A004 = C18749Vzk.A00(vzk);
                int A005 = A004.A00(16);
                if (A005 != 0) {
                    i2 = C13992Tns.A03(A004, A005);
                } else {
                    i2 = 0;
                }
                02V.A06(AnonymousClass7TF.A1R(i2), "invalid metadata codepoint length");
                C18549Vu1 vu1 = this.A01;
                C14914UEx A006 = C18749Vzk.A00(vzk);
                int A007 = A006.A00(16);
                if (A007 != 0) {
                    i3 = C13992Tns.A03(A006, A007);
                } else {
                    i3 = 0;
                }
                vu1.A00(vzk, 0, i3 - 1);
            }
        }
    }

    public C18470VsM() {
        this.A00 = null;
        this.A02 = null;
        this.A01 = new C18549Vu1(1024);
        this.A03 = new char[0];
    }
}
