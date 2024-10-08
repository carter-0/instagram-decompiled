package X;

/* renamed from: X.7FE  reason: invalid class name */
public final class AnonymousClass7FE extends AnonymousClass0T0 implements AnonymousClass7FF {
    public boolean A00;
    public boolean A01;
    public final AnonymousClass9HC A02;
    public final AnonymousClass7L2 A03;
    public final 2FW A04;
    public final AnonymousClass0eM A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

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
                0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.direct.messagethread.commondecorations.theme.model.ThemeModel");
                AnonymousClass7FE r5 = (AnonymousClass7FE) obj;
                if (!(this.A04 == r5.A04 && 0qQ.A0K(this.A02, r5.A02) && this.A06 == r5.A06 && this.A07 == r5.A07 && this.A00 == r5.A00 && this.A01 == r5.A01 && this.A08 == r5.A08 && this.A09 == r5.A09 && 0qQ.A0K(this.A03, r5.A03))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final boolean CUQ() {
        return this.A00;
    }

    public final boolean CUR() {
        return this.A01;
    }

    public final int hashCode() {
        int hashCode = ((this.A04.hashCode() * 31) + this.A02.hashCode()) * 31;
        int i = 1237;
        if (this.A06) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A07) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A00) {
            i5 = 1231;
        }
        int i6 = (i4 + i5) * 31;
        int i7 = 1237;
        if (this.A01) {
            i7 = 1231;
        }
        int i8 = (i6 + i7) * 31;
        int i9 = 1237;
        if (this.A08) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        int i11 = 1237;
        if (this.A09) {
            i11 = 1231;
        }
        return ((i10 + i11) * 31) + this.A03.hashCode();
    }

    public AnonymousClass7FE(AnonymousClass9HC r1, AnonymousClass7L2 r2, 2FW r3, AnonymousClass0eM r4, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.A04 = r3;
        this.A02 = r1;
        this.A05 = r4;
        this.A06 = z;
        this.A07 = z2;
        this.A00 = z3;
        this.A01 = z4;
        this.A08 = z5;
        this.A09 = z6;
        this.A03 = r2;
    }
}
