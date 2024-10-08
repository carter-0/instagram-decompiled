package X;

import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;

/* renamed from: X.7FT  reason: invalid class name */
public final class AnonymousClass7FT extends AnonymousClass0T0 implements AnonymousClass7FU {
    public final long A00;
    public final C61063Jw1 A01;
    public final AnonymousClass7FR A02;
    public final C327627Bo A03;
    public final 2FW A04;
    public final MessageIdentifier A05;
    public final MessageIdentifier A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final /* synthetic */ boolean ARU() {
        return C3270779h.A01(this);
    }

    public final /* synthetic */ String CBF() {
        return C3270779h.A00(this);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass7FT) {
                AnonymousClass7FT r8 = (AnonymousClass7FT) obj;
                if (!(0qQ.A0K(this.A06, r8.A06) && this.A00 == r8.A00 && this.A0B == r8.A0B && this.A08 == r8.A08 && this.A0A == r8.A0A && 0qQ.A0K(this.A02, r8.A02) && 0qQ.A0K(this.A07, r8.A07) && this.A04 == r8.A04 && this.A09 == r8.A09 && this.A0C == r8.A0C && 0qQ.A0K(this.A05, r8.A05) && 0qQ.A0K(this.A01, r8.A01) && this.A03 == r8.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final 2FW Aqm() {
        return this.A04;
    }

    public final MessageIdentifier Ar2() {
        return this.A05;
    }

    public final List Atz() {
        return this.A07;
    }

    public final C327627Bo Ax9() {
        return this.A03;
    }

    public final boolean BCL() {
        return this.A08;
    }

    public final int BIZ() {
        C61063Jw1 jw1 = this.A01;
        if (jw1 == null) {
            return 0;
        }
        return ((C74552Pwl) jw1.A03).BIa(jw1.A01);
    }

    public final AnonymousClass7FR BOV() {
        return this.A02;
    }

    public final MessageIdentifier BSG() {
        return this.A06;
    }

    public final long BSP() {
        return this.A00;
    }

    public final /* synthetic */ AnonymousClass5FV BeQ() {
        return AnonymousClass5FV.None;
    }

    public final /* synthetic */ String Bwc() {
        return null;
    }

    public final /* synthetic */ String Bze() {
        return this.A02.A06;
    }

    public final boolean CU2() {
        return this.A09;
    }

    public final boolean CWG() {
        return this.A0A;
    }

    public final boolean CXM() {
        return this.A0B;
    }

    public final boolean Cbp() {
        return this.A0C;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        long j = this.A00;
        int hashCode3 = ((this.A06.hashCode() * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        int i = 1237;
        if (this.A0B) {
            i = 1231;
        }
        int i2 = (hashCode3 + i) * 31;
        int i3 = 1237;
        if (this.A08) {
            i3 = 1231;
        }
        int i4 = (i2 + i3) * 31;
        int i5 = 1237;
        if (this.A0A) {
            i5 = 1231;
        }
        int hashCode4 = (((i4 + i5) * 31) + this.A02.hashCode()) * 31;
        List list = this.A07;
        int i6 = 0;
        if (list == null) {
            hashCode = 0;
        } else {
            hashCode = list.hashCode();
        }
        int hashCode5 = (((hashCode4 + hashCode) * 31) + this.A04.hashCode()) * 31;
        int i7 = 1237;
        if (this.A09) {
            i7 = 1231;
        }
        int i8 = (hashCode5 + i7) * 31;
        int i9 = 1237;
        if (this.A0C) {
            i9 = 1231;
        }
        int i10 = (i8 + i9) * 31;
        MessageIdentifier messageIdentifier = this.A05;
        if (messageIdentifier == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = messageIdentifier.hashCode();
        }
        int i11 = (i10 + hashCode2) * 31;
        C61063Jw1 jw1 = this.A01;
        if (jw1 != null) {
            i6 = jw1.hashCode();
        }
        return ((i11 + i6) * 31) + this.A03.hashCode();
    }

    public AnonymousClass7FT(C61063Jw1 jw1, AnonymousClass7FR r2, C327627Bo r3, 2FW r4, MessageIdentifier messageIdentifier, MessageIdentifier messageIdentifier2, List list, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        this.A06 = messageIdentifier;
        this.A00 = j;
        this.A0B = z;
        this.A08 = z2;
        this.A0A = z3;
        this.A02 = r2;
        this.A07 = list;
        this.A04 = r4;
        this.A09 = z4;
        this.A0C = z5;
        this.A05 = messageIdentifier2;
        this.A01 = jw1;
        this.A03 = r3;
    }
}
