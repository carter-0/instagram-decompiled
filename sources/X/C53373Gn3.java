package X;

import java.util.List;

/* renamed from: X.Gn3  reason: case insensitive filesystem */
public final class C53373Gn3 extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final boolean A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C53373Gn3(int i, int i2, boolean z) {
        this((C59500JLy) null, (i2 & 2) != 0 ? C54617HLa.LOADING : null, (i2 & 8) != 0 ? 2131956928 : i, z);
        this.A00 = 2;
    }

    public final boolean equals(Object obj) {
        int i;
        int i2;
        int i3;
        switch (this.A00) {
            case 0:
                if (this != obj) {
                    i = 0;
                    break;
                } else {
                    return true;
                }
            case 1:
                if (this != obj) {
                    i = 1;
                    break;
                } else {
                    return true;
                }
            default:
                if (this == obj) {
                    return true;
                }
                if (obj instanceof C53373Gn3) {
                    C53373Gn3 gn3 = (C53373Gn3) obj;
                    if (gn3.A00 == 2 && this.A04 == gn3.A04 && this.A02 == gn3.A02 && 0qQ.A0K(this.A03, gn3.A03)) {
                        i2 = this.A01;
                        i3 = gn3.A01;
                        break;
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
                break;
        }
        if (!(obj instanceof C53373Gn3)) {
            return false;
        }
        C53373Gn3 gn32 = (C53373Gn3) obj;
        if (gn32.A00 != i || this.A01 != gn32.A01 || !0qQ.A0K(this.A03, gn32.A03) || this.A02 != gn32.A02) {
            return false;
        }
        i2 = this.A04;
        i3 = gn32.A04;
        if (i2 != i3) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A07;
        int i;
        if (2 - this.A00 != 0) {
            A07 = AnonymousClass7TF.A07(this.A02, AnonymousClass7TF.A07(this.A03, this.A01 * 31));
            i = 1237;
            if (this.A04) {
                i = 1231;
            }
        } else {
            A07 = (AnonymousClass7TF.A07(this.A02, C51965G9l.A05(this.A04)) + AnonymousClass7TG.A0C(this.A03)) * 31;
            i = this.A01;
        }
        return A07 + i;
    }

    public C53373Gn3(C59500JLy jLy, C54617HLa hLa, int i, boolean z) {
        this.A00 = 2;
        0qQ.A0B(hLa, 2);
        this.A04 = z;
        this.A02 = hLa;
        this.A03 = jLy;
        this.A01 = i;
    }

    public C53373Gn3(C62450Kg0 kg0, List list, int i, int i2, boolean z) {
        this.A00 = i2;
        if (i2 == 0) {
            0qQ.A0B(list, 2);
        }
        0qQ.A0B(kg0, 3);
        this.A01 = i;
        this.A03 = list;
        this.A02 = kg0;
        this.A04 = z;
    }
}
