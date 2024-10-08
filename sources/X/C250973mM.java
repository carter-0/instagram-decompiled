package X;

import com.instagram.api.schemas.IntentAwareAdsFormatInfo;
import com.instagram.api.schemas.IntentAwareAdsFormatType;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: X.3mM  reason: invalid class name and case insensitive filesystem */
public final class C250973mM {
    public int A00;
    public int A01;
    public int A02;
    public Integer A03;
    public Integer A04;
    public List A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public final int A0E;
    public final long A0F;
    public final UserSession A0G;
    public final Reel A0H;
    public final String A0I;
    public final String A0J;
    public final Set A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final C255773uh A0O;
    public final Boolean A0P;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C250973mM(UserSession userSession, Reel reel, String str, String str2, int i, long j, boolean z) {
        this(userSession, reel, false, str, str2, 0sl.A00, i, j, z);
        0qQ.A0B(userSession, 1);
    }

    public final int A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return A00(userSession, this).size();
    }

    public final int A03(UserSession userSession, C255773uh r3) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r3, 1);
        if (!A00(userSession, this).isEmpty() || r3 != this.A0O) {
            return A00(userSession, this).indexOf(r3);
        }
        return 0;
    }

    public final int A04(UserSession userSession, String str) {
        0qQ.A0B(userSession, 0);
        0qQ.A0B(str, 1);
        int i = 0;
        for (C255773uh r0 : A00(userSession, this)) {
            if (0qQ.A0K(r0.A0j, str)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final ImageUrl A07(UserSession userSession) {
        Integer CAm;
        0qQ.A0B(userSession, 0);
        Reel reel = this.A0H;
        1Ns r0 = reel.A0W;
        if (r0 == null) {
            CAm = null;
        } else {
            CAm = r0.CAm();
        }
        if ((CAm != AnonymousClass05K.A1F && A05() != IntentAwareAdsFormatType.MAC_SUBTLE_V1 && A05() != IntentAwareAdsFormatType.MAC_SUBTLE_V2) || A00(userSession, this).isEmpty()) {
            return reel.A07();
        }
        A0C(userSession, this.A01);
        User user = ((C255773uh) A00(userSession, this).get(this.A01)).A0i;
        if (user != null) {
            return user.Bh3();
        }
        return null;
    }

    public final C255773uh A08(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        if (A00(userSession, this).isEmpty()) {
            return this.A0O;
        }
        A0C(userSession, this.A01);
        return (C255773uh) A00(userSession, this).get(this.A01);
    }

    public final C255773uh A09(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return (C255773uh) A00(userSession, this).get(this.A00);
    }

    public final C255773uh A0A(UserSession userSession, int i) {
        0qQ.A0B(userSession, 0);
        return (C255773uh) A00(userSession, this).get(i);
    }

    public final void A0C(UserSession userSession, int i) {
        0qQ.A0B(userSession, 0);
        this.A01 = Math.max(Math.min(i, A00(userSession, this).size() - 1), 0);
    }

    public final boolean A0E(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return A00(userSession, this).isEmpty();
    }

    public static final List A00(UserSession userSession, C250973mM r6) {
        List A0O2 = r6.A0H.A0O(userSession);
        0qQ.A07(A0O2);
        boolean z = r6.A0L;
        if (z) {
            ArrayList arrayList = new ArrayList();
            for (Object next : A0O2) {
                if (r6.A0K.contains(((C255773uh) next).A0j)) {
                    arrayList.add(next);
                }
            }
            A0O2 = arrayList;
        }
        if (!0qQ.A0K(r6.A0P, true) || !z || !(!A0O2.isEmpty())) {
            return A0O2;
        }
        return 00k.A0g(A0O2, new C58004Ijx(r6));
    }

    public final int A01() {
        List list = this.A0H.A17;
        if (list != null && !list.isEmpty()) {
            return this.A02;
        }
        throw new IllegalStateException(C273654mx.A00(512));
    }

    public final IntentAwareAdsFormatType A05() {
        IntentAwareAdsFormatInfo intentAwareAdsFormatInfo;
        IntentAwareAdsInfo intentAwareAdsInfo = this.A0H.A0B;
        if (intentAwareAdsInfo == null || (intentAwareAdsFormatInfo = intentAwareAdsInfo.A00) == null) {
            return null;
        }
        return intentAwareAdsFormatInfo.B7R();
    }

    public final ImageUrl A06() {
        Reel reel = this.A0H;
        List list = reel.A17;
        if (list == null || list.isEmpty()) {
            throw new IllegalStateException(C273654mx.A00(512));
        }
        List list2 = reel.A18;
        if (list2 == null || !(!list2.isEmpty())) {
            return null;
        }
        A01();
        if (A01() < list2.size()) {
            return (ImageUrl) list2.get(A01());
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Reel ID:");
        sb.append(reel.getId());
        sb.append(", Ad ID:");
        sb.append(reel.A0F());
        sb.append(". The video to carousel index (");
        sb.append(A01());
        sb.append(") is larger than the number of thumbnails (");
        sb.append(list2.size());
        sb.append("). The amount of segments and thumbnails should be equal.");
        throw new IllegalStateException(sb.toString());
    }

    public final void A0B(UserSession userSession) {
        int A032;
        if (this.A0L) {
            A032 = 0;
        } else {
            A032 = this.A0H.A03(userSession);
        }
        this.A00 = A032;
        this.A01 = A032;
    }

    public final boolean A0D() {
        if (this.A0H.A0P == ReelType.A05) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C250973mM) {
            String id = ((C250973mM) obj).A0H.getId();
            0qQ.A07(id);
            String id2 = this.A0H.getId();
            0qQ.A07(id2);
            if (!id.equals(id2)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String id = this.A0H.getId();
        0qQ.A07(id);
        return Arrays.hashCode(new Object[]{id});
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C250973mM(UserSession userSession, Reel reel, Set set) {
        this(userSession, reel, false, (String) null, (String) null, set, -1, System.currentTimeMillis(), false);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(reel, 2);
        0qQ.A0B(set, 5);
    }

    public C250973mM(UserSession userSession, Reel reel, Boolean bool, String str, String str2, Set set, int i, long j, boolean z) {
        int i2;
        1Ns r0;
        User CCd;
        0qQ.A0B(userSession, 1);
        this.A0G = userSession;
        this.A0H = reel;
        this.A0E = i;
        this.A0N = z;
        this.A0K = set;
        this.A0I = str;
        this.A0J = str2;
        this.A0P = bool;
        boolean z2 = !set.isEmpty();
        this.A0L = z2;
        this.A0O = new C255773uh(C250963mL.LOADING_PLACEHOLDER, reel.A0D(), reel.getId(), 002.A0R(reel.getId(), "-PLACEHOLDER"));
        if (z2 || !reel.A0z(userSession)) {
            i2 = 0;
        } else {
            i2 = reel.A03(userSession);
        }
        this.A00 = i2;
        this.A01 = i2;
        this.A05 = 0sn.A00;
        boolean z3 = false;
        if (!(reel.A1a || (r0 = reel.A0W) == null || (CCd = r0.CCd()) == null)) {
            z3 = C250993mO.A01(userSession).A0C(C251033mS.A00(userSession), CCd);
        }
        this.A0M = z3;
        this.A0F = j;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C250973mM(UserSession userSession, Reel reel, int i) {
        this(userSession, reel, false, (String) null, (String) null, 0sl.A00, i, System.currentTimeMillis(), false);
        0qQ.A0B(userSession, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C250973mM(UserSession userSession, Reel reel) {
        this(userSession, reel, false, (String) null, (String) null, 0sl.A00, -1, System.currentTimeMillis(), false);
        0qQ.A0B(userSession, 1);
        0qQ.A0B(reel, 2);
    }
}
