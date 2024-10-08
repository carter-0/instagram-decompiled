package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.JuJ  reason: case insensitive filesystem */
public final class C60961JuJ extends AnonymousClass0T0 {
    public final int A00;
    public final int A01;
    public final long A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final boolean A07;
    public final boolean A08;

    public C60961JuJ(ImageUrl imageUrl, Reel reel, User user, String str, int i, int i2, long j, boolean z, boolean z2) {
        this.A00 = i2;
        C51974G9v.A1L(str, user, imageUrl);
        this.A06 = str;
        this.A05 = user;
        this.A02 = j;
        this.A03 = imageUrl;
        this.A01 = i;
        this.A08 = z;
        this.A04 = reel;
        this.A07 = z2;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this.A00 != 0) {
            if (this == obj) {
                return true;
            }
            i = 1;
        } else if (this == obj) {
            return true;
        } else {
            i = 0;
        }
        if (!(obj instanceof C60961JuJ)) {
            return false;
        }
        C60961JuJ juJ = (C60961JuJ) obj;
        if (juJ.A00 == i && 0qQ.A0K(this.A06, juJ.A06) && 0qQ.A0K(this.A05, juJ.A05) && this.A02 == juJ.A02 && 0qQ.A0K(this.A03, juJ.A03) && this.A01 == juJ.A01 && this.A08 == juJ.A08 && 0qQ.A0K(this.A04, juJ.A04) && this.A07 == juJ.A07) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int A072 = C51972G9s.A07(this.A02, AnonymousClass7TF.A07(this.A05, AnonymousClass7TE.A0O(this.A06)));
        boolean z = this.A08;
        return DbS.A06(this.A07, (AnonymousClass7TF.A09(z, (AnonymousClass7TF.A07(this.A03, A072) + this.A01) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31);
    }
}
