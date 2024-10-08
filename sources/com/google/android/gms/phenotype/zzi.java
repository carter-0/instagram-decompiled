package com.google.android.gms.phenotype;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C273654mx;
import X.C301145yd;
import X.C9730Rfn;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public final class zzi extends AbstractSafeParcelable implements Comparable {
    public static final Parcelable.Creator CREATOR = SWR.A00(67);
    public final int A00;
    public final String A01;
    public final double A02;
    public final int A03;
    public final long A04;
    public final String A05;
    public final boolean A06;
    public final byte[] A07;

    public final /* synthetic */ int compareTo(Object obj) {
        zzi zzi = (zzi) obj;
        int compareTo = this.A01.compareTo(zzi.A01);
        if (compareTo == 0) {
            int i = this.A03;
            int i2 = zzi.A03;
            if (i < i2) {
                return -1;
            }
            if (i != i2) {
                return 1;
            }
            int i3 = 0;
            compareTo = 1;
            if (i != 1) {
                if (i == 2) {
                    boolean z = this.A06;
                    if (z != zzi.A06) {
                        if (z) {
                            return 1;
                        }
                    }
                } else if (i == 3) {
                    return Double.compare(this.A02, zzi.A02);
                } else {
                    if (i == 4) {
                        String str = this.A05;
                        String str2 = zzi.A05;
                        if (str != str2) {
                            if (str != null) {
                                if (str2 != null) {
                                    return str.compareTo(str2);
                                }
                            }
                        }
                    } else if (i == 5) {
                        byte[] bArr = this.A07;
                        byte[] bArr2 = zzi.A07;
                        if (bArr != bArr2) {
                            if (bArr != null) {
                                if (bArr2 != null) {
                                    while (true) {
                                        int length = bArr.length;
                                        int length2 = bArr2.length;
                                        if (i3 < Math.min(length, length2)) {
                                            compareTo = bArr[i3] - bArr2[i3];
                                            if (compareTo != 0) {
                                                break;
                                            }
                                            i3++;
                                        } else if (length < length2) {
                                            return -1;
                                        } else {
                                            compareTo = 0;
                                            if (length != length2) {
                                                return 1;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        throw Pxe.A0e(Pxg.A0t("Invalid enum value: ", Pxe.A14(31), i));
                    }
                }
                return 0;
            }
            long j = this.A04;
            long j2 = zzi.A04;
            if (j >= j2) {
                if (j == j2) {
                    return 0;
                }
            }
            return -1;
        }
        return compareTo;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        if (!(obj instanceof zzi)) {
            return false;
        }
        zzi zzi = (zzi) obj;
        if (!C9730Rfn.A00(this.A01, zzi.A01) || (i = this.A03) != zzi.A03 || this.A00 != zzi.A00) {
            return false;
        }
        if (i == 1) {
            i2 = (this.A04 > zzi.A04 ? 1 : (this.A04 == zzi.A04 ? 0 : -1));
        } else if (i != 2) {
            if (i == 3) {
                i2 = (this.A02 > zzi.A02 ? 1 : (this.A02 == zzi.A02 ? 0 : -1));
            } else if (i == 4) {
                return C9730Rfn.A00(this.A05, zzi.A05);
            } else {
                if (i == 5) {
                    return Arrays.equals(this.A07, zzi.A07);
                }
                throw Pxe.A0e(Pxg.A0t("Invalid enum value: ", Pxe.A14(31), i));
            }
        } else if (this.A06 == zzi.A06) {
            return true;
        } else {
            return false;
        }
        if (i2 == 0) {
            return true;
        }
        return false;
    }

    public zzi(String str, String str2, byte[] bArr, double d, int i, int i2, long j, boolean z) {
        this.A01 = str;
        this.A04 = j;
        this.A06 = z;
        this.A02 = d;
        this.A05 = str2;
        this.A07 = bArr;
        this.A03 = i;
        this.A00 = i2;
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Flag(");
        String str2 = this.A01;
        A1A.append(str2);
        A1A.append(", ");
        int i = this.A03;
        if (i == 1) {
            A1A.append(this.A04);
        } else if (i == 2) {
            A1A.append(this.A06);
        } else if (i != 3) {
            if (i == 4) {
                A1A.append("'");
                str = this.A05;
            } else if (i == 5) {
                byte[] bArr = this.A07;
                if (bArr == null) {
                    A1A.append("null");
                } else {
                    A1A.append("'");
                    str = Base64.encodeToString(bArr, 3);
                }
            } else {
                StringBuilder A14 = Pxe.A14(Pxf.A09(str2) + 27);
                A14.append(C273654mx.A00(489));
                A14.append(str2);
                throw Pxe.A0e(Pxg.A0t(", ", A14, i));
            }
            A1A.append(str);
            A1A.append("'");
        } else {
            A1A.append(this.A02);
        }
        A1A.append(", ");
        A1A.append(i);
        A1A.append(", ");
        A1A.append(this.A00);
        return AnonymousClass7TF.A0l(")", A1A);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A0B(parcel, this.A01);
        C301145yd.A08(parcel, 3, this.A04);
        C301145yd.A09(parcel, 4, this.A06);
        double d = this.A02;
        parcel.writeInt(524293);
        parcel.writeDouble(d);
        C301145yd.A0C(parcel, this.A05, 6, false);
        C301145yd.A0F(parcel, this.A07, 7, false);
        C301145yd.A07(parcel, 8, this.A03);
        C301145yd.A07(parcel, 9, this.A00);
        C301145yd.A06(parcel, A032);
    }
}
