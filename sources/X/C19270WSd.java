package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;

/* renamed from: X.WSd  reason: case insensitive filesystem */
public final class C19270WSd implements C232262tL {
    public final double A00;
    public final long A01;
    public final ImageUrl A02;
    public final Reel A03;
    public final User A04;
    public final String A05;
    public final boolean A06;
    public final boolean A07;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C19270WSd wSd = (C19270WSd) obj;
        0qQ.A0B(wSd, 0);
        if (0qQ.A0K(this.A04, wSd.A04) && this.A00 == wSd.A00 && this.A01 == wSd.A01 && 0qQ.A0K(this.A02, wSd.A02) && this.A07 == wSd.A07 && 0qQ.A0K(this.A03, wSd.A03) && this.A06 == wSd.A06) {
            return true;
        }
        return false;
    }

    public C19270WSd(ImageUrl imageUrl, Reel reel, User user, String str, double d, long j, boolean z, boolean z2) {
        AnonymousClass7TG.A1O(str, user);
        0qQ.A0B(imageUrl, 5);
        this.A05 = str;
        this.A04 = user;
        this.A00 = d;
        this.A01 = j;
        this.A02 = imageUrl;
        this.A07 = z;
        this.A03 = reel;
        this.A06 = z2;
    }
}
