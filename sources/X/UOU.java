package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class UOU extends AnonymousClass0T0 implements XCH {
    public int A00 = 0;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public ULw A05 = null;
    public ULH A06 = null;
    public C15042UKv A07 = null;
    public C16597Uxr A08;
    public String A09 = "";
    public String A0A;
    public final String A0B = "media_bitmap_sticker";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UOU) {
                UOU uou = (UOU) obj;
                if (!(0qQ.A0K(this.A0A, uou.A0A) && this.A08 == uou.A08 && 0qQ.A0K(this.A07, uou.A07) && 0qQ.A0K(this.A06, uou.A06) && 0qQ.A0K(this.A05, uou.A05) && this.A04 == uou.A04 && 0qQ.A0K(this.A09, uou.A09) && this.A01 == uou.A01 && this.A03 == uou.A03 && this.A02 == uou.A02 && this.A00 == uou.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ULH Ayy() {
        return this.A06;
    }

    public final C15042UKv Az6() {
        return this.A07;
    }

    public final int Brw() {
        return this.A04;
    }

    public final C16597Uxr Bzo() {
        return this.A08;
    }

    public final ULw C7Q() {
        return this.A05;
    }

    public final String CDC() {
        return this.A0A;
    }

    public final void EUX(ULH ulh) {
        this.A06 = ulh;
    }

    public final void EUZ(C15042UKv uKv) {
        this.A07 = uKv;
    }

    public final void Ejk(int i) {
        this.A04 = i;
    }

    public final void Eoi(ULw uLw) {
        this.A05 = uLw;
    }

    public final String getTypeName() {
        return this.A0B;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A0A);
        return ((((((AnonymousClass7TF.A08(this.A09, (((((((AnonymousClass7TF.A07(this.A08, A0O) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TE.A0L(this.A05)) * 31) + this.A04) * 31) + this.A01) * 31) + this.A03) * 31) + this.A02) * 31) + this.A00;
    }

    public /* synthetic */ UOU(ULw uLw, ULH ulh, C15042UKv uKv, C16597Uxr uxr, String str, String str2, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, int i3, int i4, int i5, int i6) {
        String A0j = AnonymousClass7TG.A0j();
        C16597Uxr uxr2 = C16597Uxr.UNKNOWN;
        this.A0A = A0j;
        this.A08 = uxr2;
    }

    public UOU() {
        String A0j = AnonymousClass7TG.A0j();
        C16597Uxr uxr = C16597Uxr.UNKNOWN;
        this.A0A = A0j;
        this.A08 = uxr;
    }
}
