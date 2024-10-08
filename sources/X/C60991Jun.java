package X;

import com.instagram.model.reels.ReelType;

/* renamed from: X.Jun  reason: case insensitive filesystem */
public final class C60991Jun extends AnonymousClass0T0 {
    public int A00 = 0;
    public long A01 = 0;
    public C61065Jw3 A02 = null;
    public ReelType A03 = null;
    public String A04 = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60991Jun) {
                C60991Jun jun = (C60991Jun) obj;
                if (!(0qQ.A0K(this.A04, jun.A04) && this.A01 == jun.A01 && this.A00 == jun.A00 && 0qQ.A0K(this.A02, jun.A02) && this.A03 == jun.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((C51972G9s.A07(this.A01, AnonymousClass7TG.A0E(this.A04) * 31) + this.A00) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ArchiveShell(id=");
        A1A.append(this.A04);
        A1A.append(", timestamp=");
        A1A.append(this.A01);
        A1A.append(C66579MXk.A00(438));
        A1A.append(this.A00);
        A1A.append(", coverImage=");
        A1A.append(this.A02);
        A1A.append(", reelType=");
        return AnonymousClass7TG.A0n(this.A03, A1A);
    }
}
