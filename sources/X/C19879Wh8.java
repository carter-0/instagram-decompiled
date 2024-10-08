package X;

import com.facebook.android.maps.model.LatLng;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.Wh8  reason: case insensitive filesystem */
public final class C19879Wh8 implements Iterable, X2C {
    public double A00;
    public double A01;
    public double A02;
    public int A03 = 0;
    public C19879Wh8 A04;
    public C14633Tzf A05;
    public boolean A06 = false;
    public C19876Wh5[] A07 = new C19876Wh5[2];
    public int A08;
    public LatLng A09;
    public boolean A0A = false;
    public boolean A0B = false;
    public boolean A0C = false;
    public final double[] A0D = new double[2];
    public final double[] A0E = new double[2];

    public final void A05(C19876Wh5 wh5) {
        this.A0B = false;
        this.A06 = false;
        this.A0C = false;
        this.A0A = false;
        int i = this.A03;
        int i2 = i + 1;
        C19876Wh5[] wh5Arr = this.A07;
        int length = wh5Arr.length;
        if (i2 == length) {
            C19876Wh5[] wh5Arr2 = new C19876Wh5[(length + (length >> 1))];
            this.A07 = wh5Arr2;
            System.arraycopy(wh5Arr, 0, wh5Arr2, 0, i);
        }
        C19876Wh5[] wh5Arr3 = this.A07;
        int i3 = this.A03;
        this.A03 = i3 + 1;
        wh5Arr3[i3] = wh5;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C19879Wh8) {
                C19879Wh8 wh8 = (C19879Wh8) obj;
                if (this.A03 == wh8.A03) {
                    A02(this);
                    A02(wh8);
                    int i = 0;
                    while (i < this.A03) {
                        if (this.A07[i].equals(wh8.A07[i])) {
                            i++;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public static double A00(double d) {
        int i;
        if (d < 0.0d) {
            i = 1;
        } else {
            i = 0;
            if (d > 1.0d) {
                i = -1;
            }
        }
        return d + ((double) i);
    }

    private void A01() {
        double[] dArr;
        double d;
        double d2;
        if (!this.A0B) {
            int i = this.A03;
            if (i == 0) {
                1yR.A0J.A03("Cannot compute centroid of an empty cluster");
                return;
            }
            if (!this.A06) {
                if (i == 1) {
                    C19876Wh5 wh5 = this.A07[0];
                    double[] dArr2 = this.A0D;
                    wh5.AmS(dArr2);
                    this.A02 = dArr2[1];
                    d2 = A00(dArr2[0]);
                    this.A00 = d2;
                } else {
                    this.A02 = 1.0d;
                    double d3 = 1.0d;
                    double d4 = 0.0d;
                    double[] dArr3 = new double[i];
                    for (int i2 = 0; i2 < i; i2++) {
                        C19876Wh5 wh52 = this.A07[i2];
                        double[] dArr4 = this.A0D;
                        wh52.AmS(dArr4);
                        double d5 = dArr4[0];
                        double d6 = dArr4[1];
                        if (d6 < d3) {
                            this.A02 = d6;
                            d3 = d6;
                        }
                        if (d6 > d4) {
                            d4 = d6;
                        }
                        dArr3[i2] = A00(d5);
                    }
                    Arrays.sort(dArr3);
                    int i3 = this.A03;
                    d2 = dArr3[i3 - 1];
                    double d7 = dArr3[0];
                    double d8 = (d7 - d2) + 1.0d;
                    for (int i4 = 1; i4 < i3; i4++) {
                        double d9 = dArr3[i4 - 1];
                        double d10 = dArr3[i4];
                        double d11 = d10 - d9;
                        if (d11 > d8) {
                            d2 = d9;
                            d7 = d10;
                            d8 = d11;
                        }
                    }
                    this.A00 = d7;
                }
                this.A01 = d2;
                this.A06 = true;
            }
            if (i == 1) {
                dArr = this.A0E;
                dArr[0] = this.A00;
                d = this.A02;
            } else {
                double d12 = this.A00;
                double d13 = this.A01;
                boolean A1R = AnonymousClass7TF.A1R((d12 > d13 ? 1 : (d12 == d13 ? 0 : -1)));
                double d14 = 0.0d;
                double d15 = 0.0d;
                for (int i5 = 0; i5 < this.A03; i5++) {
                    C19876Wh5 wh53 = this.A07[i5];
                    double[] dArr5 = this.A0D;
                    wh53.AmS(dArr5);
                    double d16 = dArr5[0];
                    d15 += dArr5[1];
                    double A002 = A00(d16);
                    if (A1R && 0.0d <= A002 && A002 <= d13) {
                        A002 += 1.0d;
                    }
                    d14 += A002;
                }
                dArr = this.A0E;
                double d17 = (double) i;
                dArr[0] = A00(d14 / d17);
                d = d15 / d17;
            }
            dArr[1] = d;
            this.A0B = true;
            this.A09 = null;
        }
    }

    public static void A02(C19879Wh8 wh8) {
        if (!wh8.A0A) {
            Arrays.sort(wh8.A07, 0, wh8.A03);
            wh8.A0A = true;
        }
    }

    public final LinkedList A04() {
        C20944X5n x5n;
        LinkedList linkedList = new LinkedList();
        for (int i = 0; i < this.A03; i++) {
            A02(this);
            if (i < this.A03 && i >= 0 && (x5n = this.A07[i].A04) != null) {
                linkedList.add(x5n);
            }
        }
        return linkedList;
    }

    public final int hashCode() {
        if (!this.A0C) {
            this.A08 = 0;
            int i = 0;
            for (int i2 = 0; i2 < this.A03; i2++) {
                i = AnonymousClass7TE.A0N(this.A07[i2], i);
                this.A08 = i;
            }
            this.A0C = true;
        }
        return this.A08;
    }

    public final LatLng A03() {
        A01();
        LatLng latLng = this.A09;
        if (latLng != null) {
            return latLng;
        }
        double[] dArr = this.A0E;
        LatLng latLng2 = new LatLng(C13990Tnq.A00(dArr[1]), W2R.A02(dArr[0]));
        this.A09 = latLng2;
        return latLng2;
    }

    public final void AmS(double[] dArr) {
        A01();
        double[] dArr2 = this.A0E;
        dArr[0] = dArr2[0];
        dArr[1] = dArr2[1];
    }

    public final Iterator iterator() {
        A02(this);
        return new C20384WqQ(this);
    }
}
