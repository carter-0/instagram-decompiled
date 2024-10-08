package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class UOT extends AnonymousClass0T0 implements XCH {
    public float A00 = 0.0f;
    public int A01 = 0;
    public int A02 = 0;
    public ULw A03 = null;
    public ULH A04 = null;
    public C15042UKv A05 = null;
    public C15036UKp A06 = null;
    public C16597Uxr A07;
    public String A08 = "";
    public String A09;
    public final String A0A = "media_mention_sticker";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UOT) {
                UOT uot = (UOT) obj;
                if (!0qQ.A0K(this.A09, uot.A09) || this.A07 != uot.A07 || !0qQ.A0K(this.A05, uot.A05) || !0qQ.A0K(this.A04, uot.A04) || !0qQ.A0K(this.A03, uot.A03) || this.A02 != uot.A02 || !0qQ.A0K(this.A08, uot.A08) || Float.compare(this.A00, uot.A00) != 0 || this.A01 != uot.A01 || !0qQ.A0K(this.A06, uot.A06)) {
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
        return this.A07;
    }

    public final ULw C7Q() {
        return this.A03;
    }

    public final String CDC() {
        return this.A09;
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
        return this.A0A;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A09);
        return ((AnonymousClass7TF.A00(AnonymousClass7TF.A08(this.A08, (((((((AnonymousClass7TF.A07(this.A07, A0O) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + this.A02) * 31), this.A00) + this.A01) * 31) + AnonymousClass7TE.A0L(this.A06);
    }

    public /* synthetic */ UOT(ULw uLw, ULH ulh, C15042UKv uKv, C15036UKp uKp, C16597Uxr uxr, String str, String str2, DefaultConstructorMarker defaultConstructorMarker, float f, int i, int i2, int i3) {
        String A0j = AnonymousClass7TG.A0j();
        C16597Uxr uxr2 = C16597Uxr.UNKNOWN;
        this.A09 = A0j;
        this.A07 = uxr2;
    }

    public UOT() {
        String A0j = AnonymousClass7TG.A0j();
        C16597Uxr uxr = C16597Uxr.UNKNOWN;
        this.A09 = A0j;
        this.A07 = uxr;
    }
}
