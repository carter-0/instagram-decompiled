package X;

import com.instagram.api.schemas.BoostedActionStatus;

public final class Ou9 implements C232262tL {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final int A07;
    public final long A08;
    public final BoostedActionStatus A09;
    public final Integer A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A0C;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        Ou9 ou9 = (Ou9) obj;
        String str2 = this.A0C;
        if (ou9 != null) {
            str = ou9.A0C;
        } else {
            str = null;
        }
        if (0qQ.A0K(str2, str) && this.A08 == ou9.A08 && 0qQ.A0K(this.A0D, ou9.A0D) && 0qQ.A0K(this.A0B, ou9.A0B) && 0qQ.A0K(this.A0A, ou9.A0A) && this.A09 == ou9.A09 && this.A00 == ou9.A00 && this.A01 == ou9.A01 && this.A02 == ou9.A02 && this.A03 == ou9.A03 && this.A04 == ou9.A04 && this.A05 == ou9.A05 && this.A06 == ou9.A06 && this.A07 == ou9.A07) {
            return true;
        }
        return false;
    }

    public Ou9(BoostedActionStatus boostedActionStatus, Integer num, String str, String str2, String str3, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, long j) {
        this.A0C = str;
        this.A08 = j;
        this.A0D = str2;
        this.A0B = str3;
        this.A0A = num;
        this.A09 = boostedActionStatus;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
        this.A03 = i4;
        this.A04 = i5;
        this.A05 = i6;
        this.A06 = i7;
        this.A07 = i8;
    }
}
