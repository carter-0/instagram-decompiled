package X;

import kotlin.jvm.internal.DefaultConstructorMarker;

public final class UOV extends AnonymousClass0T0 implements XCH {
    public float A00 = 0.0f;
    public int A01 = 0;
    public int A02 = 0;
    public int A03 = 0;
    public int A04 = 0;
    public ULw A05 = null;
    public ULH A06 = null;
    public C15042UKv A07 = null;
    public C16597Uxr A08;
    public String A09 = null;
    public String A0A = null;
    public String A0B;
    public boolean A0C = false;
    public boolean A0D = false;
    public final String A0E = "media_igtv_share_sticker";

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UOV) {
                UOV uov = (UOV) obj;
                if (!(0qQ.A0K(this.A0B, uov.A0B) && this.A08 == uov.A08 && 0qQ.A0K(this.A07, uov.A07) && 0qQ.A0K(this.A06, uov.A06) && 0qQ.A0K(this.A05, uov.A05) && this.A04 == uov.A04 && 0qQ.A0K(this.A0A, uov.A0A) && 0qQ.A0K(this.A09, uov.A09) && this.A03 == uov.A03 && this.A02 == uov.A02 && this.A01 == uov.A01 && Float.compare(this.A00, uov.A00) == 0 && this.A0D == uov.A0D && this.A0C == uov.A0C)) {
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
        return this.A0B;
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
        return this.A0E;
    }

    public final int hashCode() {
        return DbS.A06(this.A0C, AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A00((((((((((((((((((AnonymousClass7TF.A07(this.A08, AnonymousClass7TE.A0O(this.A0B)) + AnonymousClass7TG.A0C(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + this.A04) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + C41845B3m.A00(this.A09)) * 31) + this.A03) * 31) + this.A02) * 31) + this.A01) * 31, this.A00)));
    }

    public /* synthetic */ UOV(ULw uLw, ULH ulh, C15042UKv uKv, C16597Uxr uxr, String str, String str2, String str3, DefaultConstructorMarker defaultConstructorMarker, float f, int i, int i2, int i3, int i4, int i5, boolean z, boolean z2) {
        String A0j = AnonymousClass7TG.A0j();
        C16597Uxr uxr2 = C16597Uxr.UNKNOWN;
        this.A0B = A0j;
        this.A08 = uxr2;
    }

    public UOV() {
        String A0j = AnonymousClass7TG.A0j();
        C16597Uxr uxr = C16597Uxr.UNKNOWN;
        this.A0B = A0j;
        this.A08 = uxr;
    }
}
