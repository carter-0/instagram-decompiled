package X;

import java.nio.FloatBuffer;

/* renamed from: X.Usf  reason: case insensitive filesystem */
public class C16311Usf extends C19723WeP {
    public int A00;
    public int A01;
    public Um6 A02;
    public C14278TtB A03;
    public C14278TtB A04;
    public C14260Tsi A05;
    public C17872VhP A06;

    public final C17872VhP Aqs() {
        return this.A06;
    }

    public void CMf(C17872VhP vhP) {
        C14261Tsj A022;
        IllegalStateException illegalStateException;
        Um6 um6;
        C14278TtB ttB;
        C14278TtB ttB2;
        if (this.A06 == null) {
            this.A06 = vhP;
            try {
                int i = this.A00;
                if (i != 0) {
                    A022 = C18699Vwx.A01(vhP, this.A01, i);
                } else {
                    A022 = C18699Vwx.A02((String) null, (String) null);
                }
                this.A04 = A022;
                UmH umH = (UmH) A022.A03.get("uMVP");
                if (umH == null) {
                    um6 = null;
                } else if (umH instanceof Um6) {
                    um6 = (Um6) umH;
                } else {
                    illegalStateException = Pxg.A0e("brush program must have ", "uMVP", " as floatMatrix4 uniform");
                    throw illegalStateException;
                }
                this.A02 = um6;
                if (um6 == null) {
                    C14261Tsj tsj = this.A04;
                    0qQ.A0B(tsj, 0);
                    UmH umH2 = (UmH) tsj.A03.get("uMVPMatrix");
                    if (umH2 != null) {
                        if (umH2 instanceof Um6) {
                            Um6 um62 = (Um6) umH2;
                            if (um62 != null) {
                                this.A02 = um62;
                            }
                        } else {
                            illegalStateException = Pxg.A0e("brush program must have ", "uMVPMatrix", " as floatMatrix4 uniform");
                            throw illegalStateException;
                        }
                    }
                    illegalStateException = Pxg.A0e("program must have ", "uMVPMatrix", " as floatMatrix4 uniform");
                    throw illegalStateException;
                }
                C14261Tsj tsj2 = this.A04;
                0qQ.A0B(tsj2, 0);
                UmH umH3 = (UmH) tsj2.A03.get("uNativeScale");
                if (umH3 instanceof C14278TtB) {
                    ttB = (C14278TtB) umH3;
                } else {
                    ttB = null;
                }
                this.A03 = ttB;
                if (ttB != null) {
                    ttB.A00(1.0f);
                }
                C14261Tsj tsj3 = this.A04;
                0qQ.A0B(tsj3, 0);
                UmH umH4 = (UmH) tsj3.A03.get("uSize");
                if (umH4 instanceof C14278TtB) {
                    ttB2 = (C14278TtB) umH4;
                } else {
                    ttB2 = null;
                }
                this.A04 = ttB2;
                this.A05 = VC7.A00(this.A04);
            } catch (RuntimeException e) {
                0wb.A07("IGDrawKit", e);
                this.A04 = null;
            }
        }
    }

    public final void Ecj(float[] fArr) {
        this.A07 = fArr;
        Um6 um6 = this.A02;
        if (um6 != null) {
            um6.A00 = FloatBuffer.wrap(fArr);
            um6.A00 = true;
        }
    }
}
