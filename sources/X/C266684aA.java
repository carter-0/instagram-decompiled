package X;

/* renamed from: X.4aA  reason: invalid class name and case insensitive filesystem */
public final class C266684aA extends AnonymousClass0T0 {
    public static final C266694aB A0N = new Object();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public AnonymousClass9JE A05;
    public 1iA A06;
    public Boolean A07;
    public Integer A08;
    public Integer A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;

    public C266684aA(AnonymousClass9JE r3, 1iA r4, Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, float f, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A02 = i;
        this.A0B = str;
        this.A0H = str2;
        this.A01 = i2;
        this.A0A = str3;
        this.A0K = z;
        this.A0C = str4;
        this.A0G = str5;
        this.A00 = i3;
        this.A0D = str6;
        this.A0I = z2;
        this.A07 = bool;
        this.A0L = z3;
        this.A05 = r3;
        this.A06 = r4;
        this.A04 = i4;
        this.A0F = str7;
        this.A0M = z4;
        this.A0E = str8;
        this.A0J = z5;
        this.A09 = null;
        this.A08 = null;
        this.A03 = (int) (f * 100.0f);
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this != obj) {
            Class<?> cls2 = getClass();
            if (obj != null) {
                cls = obj.getClass();
            } else {
                cls = null;
            }
            if (0qQ.A0K(cls2, cls)) {
                0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.music.common.model.ClipsSegmentMetadata");
                C266684aA r5 = (C266684aA) obj;
                if (this.A02 != r5.A02 || !0qQ.A0K(this.A0B, r5.A0B) || this.A03 != r5.A03 || !0qQ.A0K(this.A0H, r5.A0H) || this.A01 != r5.A01 || this.A04 != r5.A04 || !0qQ.A0K(this.A0A, r5.A0A) || this.A0K != r5.A0K || this.A00 != r5.A00 || !0qQ.A0K(this.A0D, r5.A0D) || this.A0I != r5.A0I || !0qQ.A0K(this.A07, r5.A07) || this.A0L != r5.A0L || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A0G, r5.A0G) || !0qQ.A0K(this.A05, r5.A05) || this.A06 != r5.A06 || !0qQ.A0K(this.A0F, r5.A0F) || this.A0J != r5.A0J || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A08, r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11 = this.A02 * 31;
        String str = this.A0B;
        int i12 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int i13 = (((i11 + i) * 31) + this.A03) * 31;
        String str2 = this.A0H;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i14 = (((((i13 + i2) * 31) + this.A01) * 31) + this.A04) * 31;
        String str3 = this.A0A;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i15 = (i14 + i3) * 31;
        int i16 = 1237;
        if (this.A0K) {
            i16 = 1231;
        }
        int i17 = (((i15 + i16) * 31) + this.A00) * 31;
        String str4 = this.A0D;
        if (str4 != null) {
            i4 = str4.hashCode();
        } else {
            i4 = 0;
        }
        int i18 = (i17 + i4) * 31;
        int i19 = 1237;
        if (this.A0I) {
            i19 = 1231;
        }
        int i20 = (i18 + i19) * 31;
        Boolean bool = this.A07;
        if (bool != null) {
            i5 = bool.hashCode();
        } else {
            i5 = 0;
        }
        int i21 = (i20 + i5) * 31;
        int i22 = 1237;
        if (this.A0L) {
            i22 = 1231;
        }
        int i23 = (i21 + i22) * 31;
        String str5 = this.A0C;
        if (str5 != null) {
            i6 = str5.hashCode();
        } else {
            i6 = 0;
        }
        int i24 = (i23 + i6) * 31;
        String str6 = this.A0G;
        if (str6 != null) {
            i7 = str6.hashCode();
        } else {
            i7 = 0;
        }
        int i25 = (i24 + i7) * 31;
        AnonymousClass9JE r0 = this.A05;
        if (r0 != null) {
            i8 = r0.hashCode();
        } else {
            i8 = 0;
        }
        int hashCode = (((i25 + i8) * 31) + this.A06.hashCode()) * 31;
        String str7 = this.A0F;
        if (str7 != null) {
            i9 = str7.hashCode();
        } else {
            i9 = 0;
        }
        int i26 = (hashCode + i9) * 31;
        int i27 = 1237;
        if (this.A0J) {
            i27 = 1231;
        }
        int i28 = (i26 + i27) * 31;
        Integer num = this.A09;
        if (num != null) {
            i10 = num.intValue();
        } else {
            i10 = 0;
        }
        int i29 = (i28 + i10) * 31;
        Integer num2 = this.A08;
        if (num2 != null) {
            i12 = num2.intValue();
        }
        return i29 + i12;
    }

    public C266684aA() {
        this((AnonymousClass9JE) null, 1iA.A0a, (Boolean) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, 0, 0, 0, false, false, false, false, false);
    }
}
