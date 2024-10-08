package X;

import java.util.Arrays;
import java.util.List;

/* renamed from: X.LFd  reason: case insensitive filesystem */
public final class C63957LFd {
    public final float A00;
    public final int A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;

    public C63957LFd(Integer num, String str, String str2, String str3, String str4, String str5, List list, float f, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8) {
        this.A07 = str5;
        this.A02 = num;
        this.A01 = i;
        this.A06 = str4;
        this.A0F = z8;
        this.A0G = z6;
        this.A00 = f;
        this.A03 = str;
        this.A08 = list;
        this.A05 = str3;
        this.A04 = str2;
        this.A0B = z3;
        this.A09 = z;
        this.A0C = z4;
        this.A0E = z7;
        this.A0D = z5;
        this.A0A = z2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            C63957LFd lFd = (C63957LFd) obj;
            if (!(0qQ.A0K(this.A07, lFd.A07) && 0qQ.A0K(this.A02, lFd.A02) && this.A01 == lFd.A01 && 0qQ.A0K(this.A06, lFd.A06) && this.A0F == lFd.A0F && this.A0G == lFd.A0G && this.A00 == lFd.A00 && 0qQ.A0K(this.A03, lFd.A03) && 0qQ.A0K(this.A08, lFd.A08) && 0qQ.A0K(this.A05, lFd.A05) && 0qQ.A0K(this.A04, lFd.A04) && this.A0B == lFd.A0B && this.A0C == lFd.A0C && this.A0E == lFd.A0E && this.A0D == lFd.A0D && this.A0A == lFd.A0A)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A07;
        Boolean A0u = AnonymousClass7TE.A0u();
        Integer num = this.A02;
        Integer valueOf = Integer.valueOf(this.A01);
        String str2 = this.A06;
        Boolean valueOf2 = Boolean.valueOf(this.A0F);
        Boolean valueOf3 = Boolean.valueOf(this.A0G);
        Float valueOf4 = Float.valueOf(this.A00);
        String str3 = this.A03;
        List list = this.A08;
        String str4 = this.A05;
        return Arrays.hashCode(new Object[]{null, null, str, null, null, null, null, A0u, num, valueOf, str2, valueOf2, valueOf3, valueOf4, str3, list, str4, this.A04, Boolean.valueOf(this.A0B), Boolean.valueOf(this.A0C), Boolean.valueOf(this.A0E), Boolean.valueOf(this.A0D), Boolean.valueOf(this.A0A)});
    }
}
