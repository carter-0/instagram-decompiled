package X;

import java.util.List;

public final class OuA implements C232262tL {
    public final float A00;
    public final int A01;
    public final long A02;
    public final C66776McM A03;
    public final C66694Mb1 A04;
    public final C66693Mb0 A05;
    public final C254703su A06;
    public final C74516PwB A07;
    public final DcN A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final boolean A0C;
    public final boolean A0D;

    public OuA(C66776McM mcM, C66694Mb1 mb1, C66693Mb0 mb0, C254703su r5, C74516PwB pwB, DcN dcN, String str, String str2, List list, float f, int i, long j, boolean z, boolean z2) {
        0qQ.A0B(str, 1);
        this.A09 = str;
        this.A07 = pwB;
        this.A0D = z;
        this.A02 = j;
        this.A00 = f;
        this.A0C = z2;
        this.A06 = r5;
        this.A04 = mb1;
        this.A03 = mcM;
        this.A05 = mb0;
        this.A08 = dcN;
        this.A0B = list;
        this.A0A = str2;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A09;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        OuA ouA = (OuA) obj;
        0qQ.A0B(ouA, 0);
        if (this.A0D == ouA.A0D && this.A02 == ouA.A02 && 0qQ.A0K(this.A0A, ouA.A0A)) {
            C66776McM mcM = this.A03;
            C66776McM mcM2 = ouA.A03;
            0qQ.A0B(mcM2, 0);
            if (!mcM.equals(mcM2) || !2PP.A00(this.A08, ouA.A08)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
