package X;

import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class UOX extends AnonymousClass0T0 implements XCH {
    public int A00 = 0;
    public ULw A01 = null;
    public ULH A02 = null;
    public C15042UKv A03 = null;
    public C16597Uxr A04;
    public Integer A05 = null;
    public String A06;
    public String A07 = "";
    public String A08 = null;
    public String A09;
    public List A0A;
    public List A0B;
    public boolean A0C = false;
    public boolean A0D = false;
    public final String A0E;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UOX) {
                UOX uox = (UOX) obj;
                if (!0qQ.A0K(this.A09, uox.A09) || this.A04 != uox.A04 || !0qQ.A0K(this.A03, uox.A03) || !0qQ.A0K(this.A02, uox.A02) || !0qQ.A0K(this.A01, uox.A01) || this.A00 != uox.A00 || !0qQ.A0K(this.A07, uox.A07) || !0qQ.A0K(this.A08, uox.A08) || !0qQ.A0K(this.A05, uox.A05) || this.A0D != uox.A0D || this.A0C != uox.A0C || !0qQ.A0K(this.A0B, uox.A0B) || !0qQ.A0K(this.A0A, uox.A0A) || !0qQ.A0K(this.A06, uox.A06)) {
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
        return this.A04;
    }

    public final ULw C7Q() {
        return this.A01;
    }

    public final String CDC() {
        return this.A09;
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
        return this.A0E;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A09);
        String str = this.A07;
        int A092 = AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A0D, (((AnonymousClass7TF.A08(str, (((((((AnonymousClass7TF.A07(this.A04, A0O) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A08)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31));
        return C41845B3m.A01(this.A06, (AnonymousClass7TF.A07(this.A0B, A092) + AnonymousClass7TE.A0L(this.A0A)) * 31);
    }

    public /* synthetic */ UOX(ULw uLw, ULH ulh, C15042UKv uKv, C16597Uxr uxr, Integer num, String str, String str2, String str3, String str4, List list, List list2, DefaultConstructorMarker defaultConstructorMarker, int i, int i2, boolean z, boolean z2) {
        String A0j = AnonymousClass7TG.A0j();
        C16597Uxr uxr2 = C16597Uxr.UNKNOWN;
        0sn r1 = 0sn.A00;
        0qQ.A0B(r1, 12);
        this.A09 = A0j;
        this.A04 = uxr2;
        this.A0B = r1;
        this.A0A = null;
        this.A06 = "";
        this.A0E = "media_poll_v2_sticker";
    }

    public UOX() {
        String A0j = AnonymousClass7TG.A0j();
        C16597Uxr uxr = C16597Uxr.UNKNOWN;
        0sn r2 = 0sn.A00;
        0qQ.A0B(r2, 12);
        this.A09 = A0j;
        this.A04 = uxr;
        this.A0B = r2;
        this.A0A = null;
        this.A06 = "";
        this.A0E = "media_poll_v2_sticker";
    }
}
