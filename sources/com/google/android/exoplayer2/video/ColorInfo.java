package com.google.android.exoplayer2.video;

import X.AnonymousClass4YG;
import X.AnonymousClass4YH;
import X.C376409Hw;
import X.Pxd;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class ColorInfo implements Parcelable {
    public static final ColorInfo A05 = new ColorInfo(1, 2, 3, (byte[]) null);
    public static final ColorInfo A06 = new ColorInfo(1, 1, 2, (byte[]) null);
    public static final AnonymousClass4YH CREATOR = new AnonymousClass4YG();
    public static final Parcelable.Creator PARCELABLE_CREATOR = new C376409Hw(35);
    public int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final byte[] A04;

    public static int A00(int i) {
        if (i == 1) {
            return 1;
        }
        if (i != 9) {
            return (i == 4 || i == 5 || i == 6 || i == 7) ? 2 : -1;
        }
        return 6;
    }

    public static int A01(int i) {
        if (i != 1) {
            if (i == 4) {
                return 10;
            }
            if (i == 13) {
                return 2;
            }
            if (i == 16) {
                return 6;
            }
            if (i != 18) {
                return (i == 6 || i == 7) ? 3 : -1;
            }
            return 7;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ColorInfo colorInfo = (ColorInfo) obj;
            if (!(this.A02 == colorInfo.A02 && this.A01 == colorInfo.A01 && this.A03 == colorInfo.A03 && Arrays.equals(this.A04, colorInfo.A04))) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = this.A00;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((527 + this.A02) * 31) + this.A01) * 31) + this.A03) * 31) + Arrays.hashCode(this.A04);
        this.A00 = hashCode;
        return hashCode;
    }

    public final String toString() {
        String A002;
        String A003;
        String A004;
        StringBuilder sb = new StringBuilder();
        sb.append("ColorInfo(");
        int i = this.A02;
        if (i == -1) {
            A002 = Pxd.A00(605);
        } else if (i == 6) {
            A002 = "BT2020";
        } else if (i == 1) {
            A002 = "BT709";
        } else if (i != 2) {
            A002 = "Undefined color space";
        } else {
            A002 = "BT601";
        }
        sb.append(A002);
        sb.append(", ");
        int i2 = this.A01;
        if (i2 == -1) {
            A003 = Pxd.A00(604);
        } else if (i2 == 1) {
            A003 = "Full range";
        } else if (i2 != 2) {
            A003 = "Undefined color range";
        } else {
            A003 = Pxd.A00(525);
        }
        sb.append(A003);
        sb.append(", ");
        int i3 = this.A03;
        if (i3 == -1) {
            A004 = Pxd.A00(606);
        } else if (i3 == 10) {
            A004 = "Gamma 2.2";
        } else if (i3 == 1) {
            A004 = "Linear";
        } else if (i3 == 2) {
            A004 = "sRGB";
        } else if (i3 == 3) {
            A004 = Pxd.A00(556);
        } else if (i3 == 6) {
            A004 = "ST2084 PQ";
        } else if (i3 != 7) {
            A004 = "Undefined color transfer";
        } else {
            A004 = "HLG";
        }
        sb.append(A004);
        sb.append(", ");
        boolean z = false;
        if (this.A04 != null) {
            z = true;
        }
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A02);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A03);
        byte[] bArr = this.A04;
        int i2 = 0;
        if (bArr != null) {
            i2 = 1;
        }
        parcel.writeInt(i2);
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }

    public ColorInfo(int i, int i2, int i3, byte[] bArr) {
        this.A02 = i;
        this.A01 = i2;
        this.A03 = i3;
        this.A04 = bArr;
    }

    public ColorInfo(Parcel parcel) {
        byte[] bArr;
        this.A02 = parcel.readInt();
        this.A01 = parcel.readInt();
        this.A03 = parcel.readInt();
        if (parcel.readInt() != 0) {
            bArr = parcel.createByteArray();
        } else {
            bArr = null;
        }
        this.A04 = bArr;
    }
}
