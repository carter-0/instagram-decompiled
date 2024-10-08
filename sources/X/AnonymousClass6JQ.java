package X;

import androidx.compose.ui.unit.Constraints;
import java.util.Arrays;

/* renamed from: X.6JQ  reason: invalid class name */
public final class AnonymousClass6JQ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04 = 1;
    public Constraints A05;
    public C56602I4b[] A06 = XY2.A00;
    public final /* synthetic */ AnonymousClass6H4 A07;

    public AnonymousClass6JQ(AnonymousClass6H4 r2) {
        this.A07 = r2;
    }

    public final void A00(AnonymousClass6JL r7, C285855Sz r8, C262224Cq r9, int i, int i2, int i3) {
        C56602I4b[] i4bArr;
        AnonymousClass6JN r5;
        C56602I4b[] i4bArr2 = this.A06;
        int length = i4bArr2.length;
        int i4 = 0;
        while (true) {
            if (i4 >= length) {
                this.A03 = i;
                this.A02 = i2;
                break;
            }
            C56602I4b i4b = i4bArr2[i4];
            if (i4b != null && i4b.A05) {
                break;
            }
            i4++;
        }
        int Bco = r7.Bco();
        int length2 = this.A06.length;
        while (true) {
            i4bArr = this.A06;
            if (Bco >= length2) {
                break;
            }
            C56602I4b i4b2 = i4bArr[Bco];
            if (i4b2 != null) {
                i4b2.A03();
            }
            Bco++;
        }
        if (i4bArr.length != r7.Bco()) {
            Object[] copyOf = Arrays.copyOf(this.A06, r7.Bco());
            0qQ.A07(copyOf);
            this.A06 = (C56602I4b[]) copyOf;
        }
        this.A05 = new Constraints(r7.Aq6());
        this.A00 = i3;
        this.A01 = r7.BKU();
        this.A04 = r7.By3();
        int Bco2 = r7.Bco();
        AnonymousClass6H4 r3 = this.A07;
        for (int i5 = 0; i5 < Bco2; i5++) {
            Object BaY = r7.BaY(i5);
            if (!(BaY instanceof AnonymousClass6JN) || (r5 = (AnonymousClass6JN) BaY) == null) {
                C56602I4b i4b3 = this.A06[i5];
                if (i4b3 != null) {
                    i4b3.A03();
                }
                this.A06[i5] = null;
            } else {
                C56602I4b i4b4 = this.A06[i5];
                if (i4b4 == null) {
                    i4b4 = new C56602I4b(r8, new C58682Ivr(r3, 13), r9);
                    this.A06[i5] = i4b4;
                }
                i4b4.A03 = r5.A00;
            }
        }
    }
}
