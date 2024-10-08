package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class UON extends AnonymousClass0T0 implements XCH {
    public int A00;
    public ULw A01;
    public ULH A02;
    public C15042UKv A03;
    public XMC A04;
    public C16597Uxr A05;
    public Integer A06;
    public String A07;
    public final String A08;

    public UON() {
        this((ULw) null, (ULH) null, (C15042UKv) null, (XMC) null, (C16597Uxr) null, (Integer) null, (String) null, (DefaultConstructorMarker) null, 0, 255);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UON) {
                UON uon = (UON) obj;
                if (!0qQ.A0K(this.A07, uon.A07) || this.A05 != uon.A05 || !0qQ.A0K(this.A03, uon.A03) || !0qQ.A0K(this.A02, uon.A02) || !0qQ.A0K(this.A01, uon.A01) || this.A00 != uon.A00 || !0qQ.A0K(this.A04, uon.A04) || !0qQ.A0K(this.A06, uon.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ULH Ayy() {
        return this.A02;
    }

    public final C15042UKv Az6() {
        return this.A03;
    }

    public final int Brw() {
        return this.A00;
    }

    public final C16597Uxr Bzo() {
        return this.A05;
    }

    public final ULw C7Q() {
        return this.A01;
    }

    public final String CDC() {
        return this.A07;
    }

    public final void EUX(ULH ulh) {
        this.A02 = ulh;
    }

    public final void EUZ(C15042UKv uKv) {
        this.A03 = uKv;
    }

    public final void Ejk(int i) {
        this.A00 = i;
    }

    public final void Eoi(ULw uLw) {
        this.A01 = uLw;
    }

    public final String getTypeName() {
        return this.A08;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A07);
        return AnonymousClass7TF.A07(this.A04, (((((((AnonymousClass7TF.A07(this.A05, A0O) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + this.A00) * 31) + AnonymousClass7TE.A0L(this.A06);
    }

    public /* synthetic */ UON(ULw uLw, ULH ulh, C15042UKv uKv, XMC xmc, C16597Uxr uxr, Integer num, String str, DefaultConstructorMarker defaultConstructorMarker, int i, int i2) {
        String A0j = AnonymousClass7TG.A0j();
        C16597Uxr uxr2 = C16597Uxr.UNKNOWN;
        XMC xmc2 = new XMC((Boolean) null, (Boolean) null, (Float) null, (Float) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Integer) null, (Long) null, (Long) null, (Long) null, (Long) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
        this.A07 = A0j;
        this.A05 = uxr2;
        this.A03 = null;
        this.A02 = null;
        this.A01 = null;
        this.A00 = 0;
        this.A04 = xmc2;
        this.A06 = null;
        this.A08 = "media_location_sticker";
    }
}
