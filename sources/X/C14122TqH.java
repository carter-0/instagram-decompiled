package X;

import android.graphics.Color;
import java.util.Arrays;

/* renamed from: X.TqH  reason: case insensitive filesystem */
public final class C14122TqH {
    public int A00;
    public int A01;
    public boolean A02;
    public float[] A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final int A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C14122TqH tqH = (C14122TqH) obj;
            if (!(this.A04 == tqH.A04 && this.A05 == tqH.A05)) {
                return false;
            }
        }
        return true;
    }

    private void A00() {
        int A062;
        int A063;
        if (!this.A02) {
            int i = this.A05;
            int A042 = 2eL.A04(4.5f, -1, i);
            int A043 = 2eL.A04(3.0f, -1, i);
            if (A042 == -1 || A043 == -1) {
                int A044 = 2eL.A04(4.5f, -16777216, i);
                int A045 = 2eL.A04(3.0f, -16777216, i);
                if (A044 == -1 || A045 == -1) {
                    if (A042 != -1) {
                        A062 = 2eL.A06(-1, A042);
                    } else {
                        A062 = 2eL.A06(-16777216, A044);
                    }
                    this.A00 = A062;
                    if (A043 != -1) {
                        A063 = 2eL.A06(-1, A043);
                    } else {
                        A063 = 2eL.A06(-16777216, A045);
                    }
                } else {
                    this.A00 = 2eL.A06(-16777216, A044);
                    A063 = 2eL.A06(-16777216, A045);
                }
            } else {
                this.A00 = 2eL.A06(-1, A042);
                A063 = 2eL.A06(-1, A043);
            }
            this.A01 = A063;
            this.A02 = true;
        }
    }

    public final float[] A01() {
        float[] fArr = this.A03;
        if (fArr == null) {
            fArr = new float[3];
            this.A03 = fArr;
        }
        2eL.A08(this.A08, this.A07, this.A06, fArr);
        return fArr;
    }

    public final int hashCode() {
        return (this.A05 * 31) + this.A04;
    }

    public C14122TqH(int i, int i2) {
        this.A08 = Color.red(i);
        this.A07 = Color.green(i);
        this.A06 = Color.blue(i);
        this.A05 = i;
        this.A04 = i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(C51968G9o.A16(this));
        sb.append(" [RGB: #");
        sb.append(Integer.toHexString(this.A05));
        sb.append(']');
        sb.append(" [HSL: ");
        sb.append(Arrays.toString(A01()));
        sb.append(']');
        sb.append(" [Population: ");
        sb.append(this.A04);
        sb.append(']');
        sb.append(" [Title Text: #");
        A00();
        sb.append(Integer.toHexString(this.A01));
        sb.append(']');
        sb.append(" [Body Text: #");
        A00();
        sb.append(Integer.toHexString(this.A00));
        return C51967G9n.A0r(sb, ']');
    }
}
