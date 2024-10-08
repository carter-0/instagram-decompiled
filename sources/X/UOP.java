package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class UOP extends AnonymousClass0T0 implements XCH {
    public float A00 = 0.0f;
    public int A01 = 0;
    public int A02 = 0;
    public ULw A03 = null;
    public ULH A04 = null;
    public C15042UKv A05 = null;
    public C16597Uxr A06;
    public String A07 = "";
    public String A08;
    public final String A09 = "media_hashtag_sticker";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UOP) {
                UOP uop = (UOP) obj;
                if (!0qQ.A0K(this.A08, uop.A08) || this.A06 != uop.A06 || !0qQ.A0K(this.A05, uop.A05) || !0qQ.A0K(this.A04, uop.A04) || !0qQ.A0K(this.A03, uop.A03) || this.A02 != uop.A02 || !0qQ.A0K(this.A07, uop.A07) || Float.compare(this.A00, uop.A00) != 0 || this.A01 != uop.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ULH Ayy() {
        return this.A04;
    }

    public final C15042UKv Az6() {
        return this.A05;
    }

    public final int Brw() {
        return this.A02;
    }

    public final C16597Uxr Bzo() {
        return this.A06;
    }

    public final ULw C7Q() {
        return this.A03;
    }

    public final String CDC() {
        return this.A08;
    }

    public final void EUX(ULH ulh) {
        this.A04 = ulh;
    }

    public final void EUZ(C15042UKv uKv) {
        this.A05 = uKv;
    }

    public final void Ejk(int i) {
        this.A02 = i;
    }

    public final void Eoi(ULw uLw) {
        this.A03 = uLw;
    }

    public final String getTypeName() {
        return this.A09;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A08);
        return AnonymousClass7TF.A00(AnonymousClass7TF.A08(this.A07, (((((((AnonymousClass7TF.A07(this.A06, A0O) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A03)) * 31) + this.A02) * 31), this.A00) + this.A01;
    }

    public /* synthetic */ UOP(ULw uLw, ULH ulh, C15042UKv uKv, C16597Uxr uxr, String str, String str2, DefaultConstructorMarker defaultConstructorMarker, float f, int i, int i2, int i3) {
        String A0j = AnonymousClass7TG.A0j();
        C16597Uxr uxr2 = C16597Uxr.UNKNOWN;
        this.A08 = A0j;
        this.A06 = uxr2;
    }

    public UOP() {
        String A0j = AnonymousClass7TG.A0j();
        C16597Uxr uxr = C16597Uxr.UNKNOWN;
        this.A08 = A0j;
        this.A06 = uxr;
    }
}
