package X;

import java.util.Arrays;

/* renamed from: X.5Gg  reason: invalid class name and case insensitive filesystem */
public final class C283135Gg extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final int A02;
    public final long A03;
    public final Long A04;
    public final String A05;
    public final String A06;
    public final boolean A07;
    public final byte[] A08;

    public C283135Gg(Long l, String str, String str2, byte[] bArr, int i, int i2, int i3, long j, boolean z) {
        0qQ.A0B(str, 1);
        0qQ.A0B(str2, 2);
        0qQ.A0B(bArr, 9);
        this.A05 = str;
        this.A06 = str2;
        this.A02 = i;
        this.A03 = j;
        this.A04 = l;
        this.A00 = i2;
        this.A07 = z;
        this.A01 = i3;
        this.A08 = bArr;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C283135Gg) {
                C283135Gg r8 = (C283135Gg) obj;
                if (!(0qQ.A0K(this.A05, r8.A05) && 0qQ.A0K(this.A06, r8.A06) && this.A02 == r8.A02 && this.A03 == r8.A03 && 0qQ.A0K(this.A04, r8.A04) && this.A00 == r8.A00 && this.A07 == r8.A07 && this.A01 == r8.A01 && 0qQ.A0K(this.A08, r8.A08))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final C283155Gi A00() {
        C283155Gi r2;
        String str;
        byte[] bArr = this.A08;
        0qQ.A0B(bArr, 0);
        try {
            r2 = C283145Gh.parseFromJson(16P.A00(new String(bArr, AnonymousClass15Q.A05)));
        } catch (Throwable th) {
            r2 = new 0eQ(th);
        }
        if (r2 instanceof 0eQ) {
            r2 = null;
        }
        C283155Gi r22 = r2;
        if (r22 == null) {
            return null;
        }
        r22.A07 = AnonymousClass05K.A01;
        if (this.A07) {
            str = "priority_stories";
        } else if (this.A00 == 0) {
            str = "new_stories";
        } else {
            str = "old_stories";
        }
        r22.A0D = str;
        C46373Ddq.A00(r22, new AnonymousClass9LT(this, 12));
        return r22;
    }

    public final int hashCode() {
        int hashCode;
        long j = this.A03;
        int hashCode2 = ((((((this.A05.hashCode() * 31) + this.A06.hashCode()) * 31) + this.A02) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        Long l = this.A04;
        if (l == null) {
            hashCode = 0;
        } else {
            hashCode = l.hashCode();
        }
        int i = (((hashCode2 + hashCode) * 31) + this.A00) * 31;
        int i2 = 1237;
        if (this.A07) {
            i2 = 1231;
        }
        return ((((i + i2) * 31) + this.A01) * 31) + Arrays.hashCode(this.A08);
    }
}
