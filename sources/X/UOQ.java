package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class UOQ extends AnonymousClass0T0 implements XCH {
    public int A00 = 0;
    public int A01 = 0;
    public ULw A02 = null;
    public ULH A03 = null;
    public C15042UKv A04 = null;
    public C16597Uxr A05;
    public String A06;
    public boolean A07 = false;
    public boolean A08 = false;
    public final String A09 = "media_internal_sticker";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UOQ) {
                UOQ uoq = (UOQ) obj;
                if (!(0qQ.A0K(this.A06, uoq.A06) && this.A05 == uoq.A05 && 0qQ.A0K(this.A04, uoq.A04) && 0qQ.A0K(this.A03, uoq.A03) && 0qQ.A0K(this.A02, uoq.A02) && this.A01 == uoq.A01 && this.A00 == uoq.A00 && this.A07 == uoq.A07 && this.A08 == uoq.A08)) {
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
        return this.A01;
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
        this.A01 = i;
    }

    public final void Eoi(ULw uLw) {
        this.A02 = uLw;
    }

    public final String getTypeName() {
        return this.A09;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A06);
        return DbS.A06(this.A08, AnonymousClass7TF.A09(this.A07, (((((((((AnonymousClass7TF.A07(this.A05, A0O) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TE.A0L(this.A02)) * 31) + this.A01) * 31) + this.A00) * 31));
    }

    public /* synthetic */ UOQ(ULw uLw, ULH ulh, C15042UKv uKv, C16597Uxr uxr, String str, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, int i3, boolean z, boolean z2) {
        String A0j = AnonymousClass7TG.A0j();
        C16597Uxr uxr2 = C16597Uxr.UNKNOWN;
        this.A06 = A0j;
        this.A05 = uxr2;
    }

    public UOQ() {
        String A0j = AnonymousClass7TG.A0j();
        C16597Uxr uxr = C16597Uxr.UNKNOWN;
        this.A06 = A0j;
        this.A05 = uxr;
    }
}
