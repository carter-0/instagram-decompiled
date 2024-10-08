package X;

import java.util.List;

/* renamed from: X.7o6  reason: invalid class name and case insensitive filesystem */
public final class C342137o6 implements C342147o7 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final List A0C;
    public final List A0D;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C342137o6) {
                C342137o6 r8 = (C342137o6) obj;
                if (!0qQ.A0K(this.A08, r8.A08) || !0qQ.A0K(this.A0A, r8.A0A) || !0qQ.A0K(this.A09, r8.A09) || !0qQ.A0K(this.A05, r8.A05) || this.A00 != r8.A00 || !0qQ.A0K(this.A0B, r8.A0B) || !0qQ.A0K(this.A0C, r8.A0C) || !0qQ.A0K(this.A0D, r8.A0D) || this.A03 != r8.A03 || this.A04 != r8.A04 || this.A02 != r8.A02 || !0qQ.A0K(this.A06, r8.A06) || this.A01 != r8.A01 || !0qQ.A0K(this.A07, r8.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CameraAnalyticsInfo(oneCameraActiveSessionID=");
        sb.append(this.A08);
        sb.append(", productSessionID=");
        sb.append(this.A0A);
        sb.append(C66579MXk.A00(441));
        sb.append(this.A09);
        sb.append(AnonymousClass000.A00(843));
        sb.append(this.A05);
        sb.append(", cameraFacing=");
        sb.append(this.A00);
        sb.append(", effectIDs=");
        sb.append(this.A0B);
        sb.append(", effectInstanceIDs=");
        sb.append(this.A0C);
        sb.append(", effectSessionIDs=");
        sb.append(this.A0D);
        sb.append(", availableMemoryMb=");
        sb.append(this.A03);
        sb.append(", totalMemoryMb=");
        sb.append(this.A04);
        sb.append(", photoCaptureType=");
        sb.append(this.A02);
        sb.append(", isCameraColdStart=");
        sb.append(this.A06);
        sb.append(", cameraType=");
        sb.append(this.A01);
        sb.append(", isPowerSaveMode=");
        sb.append(this.A07);
        sb.append(')');
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5 = this.A08.hashCode() * 31;
        String str = this.A0A;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int hashCode6 = (((hashCode5 + hashCode) * 31) + this.A09.hashCode()) * 31;
        String str2 = this.A05;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i2 = (((hashCode6 + hashCode2) * 31) + this.A00) * 31;
        List list = this.A0B;
        if (list == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = list.hashCode();
        }
        int i3 = (i2 + hashCode3) * 31;
        List list2 = this.A0C;
        if (list2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = list2.hashCode();
        }
        int i4 = (i3 + hashCode4) * 31;
        List list3 = this.A0D;
        if (list3 != null) {
            i = list3.hashCode();
        }
        long j = this.A03;
        long j2 = this.A04;
        return ((((((((((((i4 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.A02) * 31) + this.A06.hashCode()) * 31) + this.A01) * 31) + this.A07.hashCode();
    }

    public C342137o6(String str, String str2, String str3, String str4, String str5, String str6, List list, List list2, List list3, int i, int i2, int i3, long j, long j2) {
        this.A08 = str;
        this.A0A = str2;
        this.A09 = str3;
        this.A05 = str4;
        this.A00 = i;
        this.A0B = list;
        this.A0C = list2;
        this.A0D = list3;
        this.A03 = j;
        this.A04 = j2;
        this.A02 = i2;
        this.A06 = str5;
        this.A01 = i3;
        this.A07 = str6;
    }
}
