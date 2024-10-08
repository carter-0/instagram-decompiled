package X;

import android.location.Location;
import com.facebook.android.maps.model.LatLng;
import com.instagram.api.schemas.NotePogImageDict;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.VideoVersion;
import com.instagram.user.model.User;
import java.util.List;

public final class N4t extends AnonymousClass0T0 implements XCL {
    public boolean A00;
    public final int A01;
    public final long A02;
    public final Location A03;
    public final LatLng A04;
    public final AnonymousClass4AB A05;
    public final User A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final boolean A0C;
    public final boolean A0D;
    public final boolean A0E;
    public final boolean A0F;
    public final boolean A0G;
    public final boolean A0H;
    public final boolean A0I;
    public final boolean A0J;
    public final boolean A0K;

    public final boolean A06(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return DbV.A1Z(A02(), userSession.A06);
    }

    public static String A01(Object obj) {
        return ((N4t) obj).A02().getId();
    }

    public final User A02() {
        User user;
        AnonymousClass4AB r0 = this.A05;
        if (r0 == null || (user = r0.A0A) == null) {
            return this.A06;
        }
        return user;
    }

    public final AnonymousClass3WR A03() {
        String str;
        NotePogVideoDict notePogVideoDict;
        List list;
        VideoVersion videoVersion;
        NotePogVideoDict notePogVideoDict2;
        AnonymousClass4AB r1 = this.A05;
        if (r1 == null || (notePogVideoDict2 = r1.A08) == null) {
            str = null;
        } else {
            str = notePogVideoDict2.A01;
        }
        String str2 = null;
        if (str == null) {
            return null;
        }
        if (!(r1 == null || (notePogVideoDict = r1.A08) == null || (list = notePogVideoDict.A03) == null || (videoVersion = (VideoVersion) 00k.A0O(list, 0)) == null)) {
            str2 = videoVersion.A06;
        }
        C271394im r0 = new C271394im(AnonymousClass05K.A00, str);
        r0.A0B = str2;
        return r0.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001f, code lost:
        if (r1 == 0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A04() {
        /*
            r2 = this;
            X.4AB r0 = r2.A05
            if (r0 == 0) goto L_0x0021
            java.util.List r0 = r0.A0J
            if (r0 == 0) goto L_0x0021
            java.lang.Object r0 = X.00k.A0J(r0)
            X.913 r0 = (X.AnonymousClass913) r0
            if (r0 == 0) goto L_0x0021
            X.4zZ r0 = r0.BWY()
            if (r0 == 0) goto L_0x0021
            java.lang.String r0 = r0.A0J
            if (r0 == 0) goto L_0x0021
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            r0 = r0 ^ 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.N4t.A04():boolean");
    }

    public final boolean A05() {
        AnonymousClass4AB r1 = this.A05;
        if (r1 == null) {
            return false;
        }
        NotePogVideoDict notePogVideoDict = r1.A08;
        if (notePogVideoDict != null && notePogVideoDict.A01 != null && A03() != null) {
            return true;
        }
        NotePogImageDict notePogImageDict = r1.A07;
        if (notePogImageDict == null || notePogImageDict.A00 == null || notePogImageDict.A01 == null) {
            return false;
        }
        return true;
    }

    public final LatLng Bdm() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        LatLng latLng;
        N4t n4t = (N4t) obj;
        LatLng latLng2 = this.A04;
        if (n4t != null) {
            latLng = n4t.A04;
        } else {
            latLng = null;
        }
        if (0qQ.A0K(latLng2, latLng)) {
            return 0;
        }
        return -1;
    }

    public final boolean equals(Object obj) {
        N4t n4t;
        if (obj instanceof N4t) {
            n4t = (N4t) obj;
        } else {
            n4t = null;
        }
        if (n4t != null && 0qQ.A0K(this.A0B, n4t.A0B) && this.A0I == n4t.A0I && 0qQ.A0K(this.A04, n4t.A04) && this.A0E == n4t.A0E && this.A0C == n4t.A0C && this.A0H == n4t.A0H && this.A00 == n4t.A00 && this.A0F == n4t.A0F && 0qQ.A0K(this.A05, n4t.A05) && this.A0D == n4t.A0D && this.A07 == n4t.A07) {
            return true;
        }
        return false;
    }

    public final String getId() {
        return this.A0B;
    }

    public final int hashCode() {
        int A0O = AnonymousClass7TE.A0O(this.A0B);
        int A072 = AnonymousClass7TF.A07(this.A06, (AnonymousClass7TF.A07(this.A04, A0O) + AnonymousClass7TG.A0C(this.A05)) * 31);
        int A092 = AnonymousClass7TF.A09(this.A0I, AnonymousClass7TF.A09(this.A0H, (C51972G9s.A07(this.A02, A072) + AnonymousClass7TG.A0E(this.A0A)) * 31));
        int A093 = AnonymousClass7TF.A09(this.A0C, (AnonymousClass7TF.A09(this.A0J, A092) + AnonymousClass7TG.A0E(this.A09)) * 31);
        return ((AnonymousClass7TF.A09(this.A0D, AnonymousClass7TF.A09(this.A00, AnonymousClass7TF.A09(this.A0K, AnonymousClass7TF.A09(this.A0F, AnonymousClass7TF.A09(this.A0G, (AnonymousClass7TF.A09(this.A0E, A093) + this.A01) * 31))))) + C41845B3m.A00(this.A08)) * 31) + C48908Em8.A00(this.A07);
    }

    public N4t(LatLng latLng, AnonymousClass4AB r5, User user, Integer num, String str, String str2, String str3, String str4, int i, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10) {
        C51974G9v.A1L(str, latLng, user);
        0qQ.A0B(num, 20);
        this.A0B = str;
        this.A04 = latLng;
        this.A05 = r5;
        this.A06 = user;
        this.A02 = j;
        this.A0A = str2;
        this.A0H = z;
        this.A0I = z2;
        this.A0J = z3;
        this.A09 = str3;
        this.A0C = z4;
        this.A0E = z5;
        this.A01 = i;
        this.A0G = z6;
        this.A0F = z7;
        this.A0K = z8;
        this.A00 = z9;
        this.A0D = z10;
        this.A08 = str4;
        this.A07 = num;
        Location location = new Location("FriendMapPin");
        location.setLatitude(latLng.A00);
        location.setLongitude(latLng.A01);
        this.A03 = location;
    }

    public static String A00(N4t n4t) {
        return n4t.A02().getId();
    }
}
