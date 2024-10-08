package X;

import com.instagram.direct.inbox.notes.models.NoteAudience;

/* renamed from: X.Gmr  reason: case insensitive filesystem */
public final class C53367Gmr extends AnonymousClass0T0 {
    public final int A00;
    public final NoteAudience A01;
    public final C68150N2q A02;
    public final boolean A03;
    public final boolean A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final boolean A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53367Gmr) {
                C53367Gmr gmr = (C53367Gmr) obj;
                if (!(this.A08 == gmr.A08 && this.A09 == gmr.A09 && this.A0E == gmr.A0E && this.A0H == gmr.A0H && this.A0F == gmr.A0F && this.A0D == gmr.A0D && this.A00 == gmr.A00 && this.A07 == gmr.A07 && this.A0A == gmr.A0A && this.A0C == gmr.A0C && this.A0G == gmr.A0G && this.A04 == gmr.A04 && this.A06 == gmr.A06 && this.A05 == gmr.A05 && this.A03 == gmr.A03 && this.A01 == gmr.A01 && this.A0B == gmr.A0B && 0qQ.A0K(this.A02, gmr.A02))) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A092 = AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A09(this.A0H, AnonymousClass7TF.A09(this.A0E, AnonymousClass7TF.A09(this.A09, C51965G9l.A05(this.A08)))));
        return AnonymousClass7TF.A09(this.A0B, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A05, AnonymousClass7TF.A09(this.A06, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A0G, AnonymousClass7TF.A09(this.A0C, AnonymousClass7TF.A09(this.A0A, AnonymousClass7TF.A09(this.A07, (AnonymousClass7TF.A09(this.A0D, A092) + this.A00) * 31)))))))))) + AnonymousClass7TG.A0C(this.A02);
    }

    public C53367Gmr(NoteAudience noteAudience, C68150N2q n2q, int i, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15) {
        this.A08 = z;
        this.A09 = z2;
        this.A0E = z3;
        this.A0H = z4;
        this.A0F = z5;
        this.A0D = z6;
        this.A00 = i;
        this.A07 = z7;
        this.A0A = z8;
        this.A0C = z9;
        this.A0G = z10;
        this.A04 = z11;
        this.A06 = z12;
        this.A05 = z13;
        this.A03 = z14;
        this.A01 = noteAudience;
        this.A0B = z15;
        this.A02 = n2q;
    }

    public C53367Gmr() {
        this(NoteAudience.MUTUAL_FOLLOWERS, (C68150N2q) null, 0, true, false, false, true, false, false, true, false, false, false, true, false, true, false, false);
    }
}
