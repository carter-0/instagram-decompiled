package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class UOM extends AnonymousClass0T0 implements XCH {
    public int A00 = 0;
    public long A01 = 0;
    public ULw A02 = null;
    public ULH A03 = null;
    public C15042UKv A04 = null;
    public C16597Uxr A05;
    public String A06;
    public final String A07 = "media_date_time_sticker";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UOM) {
                UOM uom = (UOM) obj;
                if (!0qQ.A0K(this.A06, uom.A06) || this.A05 != uom.A05 || !0qQ.A0K(this.A04, uom.A04) || !0qQ.A0K(this.A03, uom.A03) || !0qQ.A0K(this.A02, uom.A02) || this.A00 != uom.A00 || this.A01 != uom.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ULH Ayy() {
        return this.A03;
    }

    public final C15042UKv Az6() {
        return this.A04;
    }

    public final int Brw() {
        return this.A00;
    }

    public final C16597Uxr Bzo() {
        return this.A05;
    }

    public final ULw C7Q() {
        return this.A02;
    }

    public final String CDC() {
        return this.A06;
    }

    public final void EUX(ULH ulh) {
        this.A03 = ulh;
    }

    public final void EUZ(C15042UKv uKv) {
        this.A04 = uKv;
    }

    public final void Ejk(int i) {
        this.A00 = i;
    }

    public final void Eoi(ULw uLw) {
        this.A02 = uLw;
    }

    public final String getTypeName() {
        return this.A07;
    }

    public final int hashCode() {
        return ((((((((AnonymousClass7TF.A07(this.A05, AnonymousClass7TE.A0O(this.A06)) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31) + this.A00) * 31) + C51968G9o.A03(this.A01);
    }

    public /* synthetic */ UOM(ULw uLw, ULH ulh, C15042UKv uKv, C16597Uxr uxr, String str, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, long j) {
        String A0j = AnonymousClass7TG.A0j();
        C16597Uxr uxr2 = C16597Uxr.UNKNOWN;
        this.A06 = A0j;
        this.A05 = uxr2;
    }

    public UOM() {
        String A0j = AnonymousClass7TG.A0j();
        C16597Uxr uxr = C16597Uxr.UNKNOWN;
        this.A06 = A0j;
        this.A05 = uxr;
    }
}
