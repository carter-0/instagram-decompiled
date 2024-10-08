package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class UOO extends AnonymousClass0T0 implements XCH {
    public int A00;
    public int A01;
    public int A02;
    public ULw A03;
    public ULH A04;
    public C15042UKv A05;
    public C15056ULz A06;
    public C16597Uxr A07;
    public String A08;
    public final String A09;

    public UOO() {
        this((ULw) null, (ULH) null, (C15042UKv) null, (C15056ULz) null, (C16597Uxr) null, (String) null, (DefaultConstructorMarker) null, 0, 0, 0, 511);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UOO) {
                UOO uoo = (UOO) obj;
                if (!0qQ.A0K(this.A08, uoo.A08) || this.A07 != uoo.A07 || !0qQ.A0K(this.A05, uoo.A05) || !0qQ.A0K(this.A04, uoo.A04) || !0qQ.A0K(this.A03, uoo.A03) || this.A02 != uoo.A02 || !0qQ.A0K(this.A06, uoo.A06) || this.A01 != uoo.A01 || this.A00 != uoo.A00) {
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
        return ((AnonymousClass7TF.A07(this.A06, (((((((AnonymousClass7TF.A07(this.A07, A0O) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A03)) * 31) + this.A02) * 31) + this.A01) * 31) + this.A00;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.ULz, java.lang.Object] */
    public /* synthetic */ UOO(ULw uLw, ULH ulh, C15042UKv uKv, C15056ULz uLz, C16597Uxr uxr, String str, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, int i3, int i4) {
        String A0j = AnonymousClass7TG.A0j();
        C16597Uxr uxr2 = C16597Uxr.UNKNOWN;
        ? obj = new Object();
        obj.A05 = 0;
        obj.A08 = 0;
        obj.A0X = "";
        C15056ULz.A01(obj);
        obj.A0E = null;
        C15056ULz.A00(obj);
        obj.A0e = null;
        C15056ULz.A02(obj);
        obj.A0F = null;
        this.A08 = A0j;
        this.A07 = uxr2;
        this.A05 = null;
        this.A04 = null;
        this.A03 = null;
        this.A02 = 0;
        this.A06 = obj;
        this.A01 = 0;
        this.A00 = 0;
        this.A09 = "media_gallery_sticker";
    }
}
