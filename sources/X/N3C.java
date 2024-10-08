package X;

import com.instagram.api.schemas.Lyrics;
import com.instagram.api.schemas.TrackData;
import com.instagram.user.model.User;

public final class N3C extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final Lyrics A02;
    public final TrackData A03;
    public final User A04;
    public final Boolean A05;
    public final Boolean A06;
    public final String A07;
    public final boolean A08;
    public final boolean A09 = true;

    public N3C(Lyrics lyrics, TrackData trackData, User user, Boolean bool, Boolean bool2, String str, int i, int i2, boolean z) {
        0qQ.A0B(trackData, 6);
        this.A01 = i;
        this.A00 = i2;
        this.A07 = str;
        this.A08 = z;
        this.A03 = trackData;
        this.A04 = user;
        this.A05 = bool;
        this.A06 = bool2;
        this.A02 = lyrics;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N3C) {
                N3C n3c = (N3C) obj;
                if (this.A01 != n3c.A01 || this.A00 != n3c.A00 || this.A09 != n3c.A09 || !0qQ.A0K(this.A07, n3c.A07) || this.A08 != n3c.A08 || !0qQ.A0K(this.A03, n3c.A03) || !0qQ.A0K(this.A04, n3c.A04) || !0qQ.A0K(this.A05, n3c.A05) || !0qQ.A0K(this.A06, n3c.A06) || !0qQ.A0K(this.A02, n3c.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        boolean z = this.A09;
        return ((((((AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A09(this.A08, (AnonymousClass7TF.A09(z, ((this.A01 * 31) + this.A00) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31)) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }
}
