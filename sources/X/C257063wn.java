package X;

import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3wn  reason: invalid class name and case insensitive filesystem */
public final class C257063wn {
    public 28e A00;
    public boolean A01;
    public final C255643uT A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final AtomicBoolean A08;
    public final boolean A09;
    public final boolean A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C257063wn r5 = (C257063wn) obj;
            if (!2Ob.A00(this.A07, r5.A07) || !2Ob.A00(this.A03, r5.A03) || !2Ob.A00(this.A04, r5.A04) || !2Ob.A00(this.A08, r5.A08) || this.A02 != r5.A02 || this.A00 != r5.A00) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A07, this.A03, this.A04, this.A08, this.A00, this.A02, false, Boolean.valueOf(this.A01)});
    }

    public C257063wn(28e r2, C255643uT r3, String str, String str2, String str3, boolean z) {
        this.A07 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A08 = null;
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = z;
        this.A06 = "unknown";
        this.A05 = "unknown";
        this.A09 = false;
        this.A0A = false;
    }

    public C257063wn(28e r5, String str, boolean z) {
        C255643uT r2 = C255643uT.GENERAL;
        this.A07 = str;
        this.A03 = null;
        this.A04 = null;
        this.A08 = null;
        this.A00 = r5;
        this.A02 = r2;
        this.A01 = z;
        this.A06 = "unknown";
        this.A05 = "unknown";
        this.A09 = false;
        this.A0A = false;
    }

    public C257063wn(28e r2, C255643uT r3, String str, String str2, String str3, String str4, String str5, AtomicBoolean atomicBoolean, boolean z, boolean z2) {
        this.A07 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A08 = atomicBoolean;
        this.A00 = r2;
        this.A02 = r3;
        this.A01 = z;
        this.A06 = "";
        this.A05 = "";
        this.A09 = false;
        this.A0A = z2;
    }

    public C257063wn(28e r3, C255643uT r4, String str, String str2, String str3, AtomicBoolean atomicBoolean, boolean z, boolean z2) {
        this.A07 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A08 = atomicBoolean;
        this.A00 = r3;
        this.A02 = r4;
        this.A01 = z;
        this.A06 = "unknown";
        this.A05 = "unknown";
        this.A09 = z2;
        this.A0A = false;
    }

    public C257063wn(28e r3, C255643uT r4, String str, String str2, String str3, AtomicBoolean atomicBoolean, boolean z) {
        this.A07 = str;
        this.A03 = str2;
        this.A04 = str3;
        this.A08 = atomicBoolean;
        this.A00 = r3;
        this.A02 = r4;
        this.A01 = z;
        this.A06 = "unknown";
        this.A05 = "unknown";
        this.A09 = false;
        this.A0A = false;
    }
}
