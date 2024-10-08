package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class UOW extends AnonymousClass0T0 implements XCH {
    public float A00 = 0.0f;
    public float A01 = 0.0f;
    public float A02 = 0.0f;
    public int A03 = 0;
    public int A04 = 0;
    public int A05 = 0;
    public ULw A06 = null;
    public ULH A07 = null;
    public C15042UKv A08 = null;
    public C16597Uxr A09;
    public String A0A = "";
    public String A0B = null;
    public String A0C = "";
    public String A0D;
    public final String A0E = "media_poll_sticker";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UOW) {
                UOW uow = (UOW) obj;
                if (!0qQ.A0K(this.A0D, uow.A0D) || this.A09 != uow.A09 || !0qQ.A0K(this.A08, uow.A08) || !0qQ.A0K(this.A07, uow.A07) || !0qQ.A0K(this.A06, uow.A06) || this.A05 != uow.A05 || !0qQ.A0K(this.A0A, uow.A0A) || !0qQ.A0K(this.A0C, uow.A0C) || Float.compare(this.A00, uow.A00) != 0 || Float.compare(this.A02, uow.A02) != 0 || !0qQ.A0K(this.A0B, uow.A0B) || Float.compare(this.A01, uow.A01) != 0 || this.A03 != uow.A03 || this.A04 != uow.A04) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final ULH Ayy() {
        return this.A07;
    }

    public final C15042UKv Az6() {
        return this.A08;
    }

    public final int Brw() {
        return this.A05;
    }

    public final C16597Uxr Bzo() {
        return this.A09;
    }

    public final ULw C7Q() {
        return this.A06;
    }

    public final String CDC() {
        return this.A0D;
    }

    public final void EUX(ULH ulh) {
        this.A07 = ulh;
    }

    public final void EUZ(C15042UKv uKv) {
        this.A08 = uKv;
    }

    public final void Ejk(int i) {
        this.A05 = i;
    }

    public final void Eoi(ULw uLw) {
        this.A06 = uLw;
    }

    public final String getTypeName() {
        return this.A0E;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A0D);
        return ((AnonymousClass7TF.A00((AnonymousClass7TF.A00(AnonymousClass7TF.A00(AnonymousClass7TF.A08(this.A0C, AnonymousClass7TF.A08(this.A0A, (((((((AnonymousClass7TF.A07(this.A09, A0O) + AnonymousClass7TG.A0C(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + this.A05) * 31)), this.A00), this.A02) + C41845B3m.A00(this.A0B)) * 31, this.A01) + this.A03) * 31) + this.A04;
    }

    public /* synthetic */ UOW(ULw uLw, ULH ulh, C15042UKv uKv, C16597Uxr uxr, String str, String str2, String str3, String str4, DefaultConstructorMarker defaultConstructorMarker, float f, float f2, float f3, int i, int i2, int i3, int i4) {
        String A0j = AnonymousClass7TG.A0j();
        C16597Uxr uxr2 = C16597Uxr.UNKNOWN;
        this.A0D = A0j;
        this.A09 = uxr2;
    }

    public UOW() {
        String A0j = AnonymousClass7TG.A0j();
        C16597Uxr uxr = C16597Uxr.UNKNOWN;
        this.A0D = A0j;
        this.A09 = uxr;
    }
}
