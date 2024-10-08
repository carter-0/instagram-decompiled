package X;

import com.instagram.api.schemas.ClipsIFUType;
import com.instagram.api.schemas.RIXUAspectRatio;
import com.instagram.api.schemas.RIXUCoverSize;
import com.instagram.api.schemas.RIXUCtaType;
import com.instagram.api.schemas.RIXULayoutFormat;
import com.instagram.api.schemas.RIXULayoutStyle;
import com.instagram.api.schemas.RIXUTextLink;
import com.instagram.clips.intf.ClipsViewerSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* renamed from: X.3Y6  reason: invalid class name */
public final class AnonymousClass3Y6 extends AnonymousClass0T0 implements AnonymousClass3O9, AnonymousClass3Y7 {
    public C376559Il A00;
    public C61074JwC A01;
    public C61079JwH A02;
    public ClipsIFUType A03;
    public C276104sZ A04;
    public C250533lb A05;
    public RIXUAspectRatio A06;
    public RIXUCoverSize A07;
    public RIXUCtaType A08;
    public RIXULayoutFormat A09;
    public RIXULayoutStyle A0A;
    public Integer A0B;
    public Integer A0C;
    public Integer A0D;
    public Integer A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public List A0K;
    public List A0L;
    public List A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public final String A0S;

    public AnonymousClass3Y6(C276124sb r32) {
        ArrayList arrayList;
        C276104sZ r1;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        C276124sb r2 = r32;
        String str = r2.A0K;
        String valueOf = String.valueOf(r2.A06);
        Integer num = r2.A0I;
        String str2 = r2.A0N;
        String str3 = r2.A0M;
        String str4 = r2.A0L;
        List<RIXUTextLink> list = r2.A0P;
        C250533lb r12 = null;
        if (list != null) {
            arrayList = new ArrayList(0Yv.A1E(list, 10));
            for (RIXUTextLink F8T : list) {
                arrayList.add(F8T.F8T());
            }
        } else {
            arrayList = null;
        }
        ClipsIFUType clipsIFUType = r2.A03;
        clipsIFUType = clipsIFUType == null ? ClipsIFUType.SUGGESTED : clipsIFUType;
        0sn r13 = r2.A0O;
        r13 = r13 == null ? 0sn.A00 : r13;
        C276114sa r0 = r2.A04;
        if (r0 != null) {
            r1 = r0.F7P();
        } else {
            r1 = new C276104sZ((String) null, false);
        }
        Boolean bool = r2.A0E;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        Integer num2 = r2.A0J;
        Boolean bool2 = r2.A0C;
        if (bool2 != null) {
            z2 = bool2.booleanValue();
        } else {
            z2 = false;
        }
        Boolean bool3 = r2.A0F;
        if (bool3 != null) {
            z3 = bool3.booleanValue();
        } else {
            z3 = false;
        }
        Boolean bool4 = r2.A0D;
        if (bool4 != null) {
            z4 = bool4.booleanValue();
        } else {
            z4 = false;
        }
        List list2 = r2.A0Q;
        Boolean bool5 = r2.A0G;
        if (bool5 != null) {
            z5 = bool5.booleanValue();
        } else {
            z5 = false;
        }
        Integer num3 = r2.A0H;
        C67241sS r02 = r2.A05;
        r12 = r02 != null ? r02.F8M() : r12;
        RIXUCoverSize rIXUCoverSize = r2.A08;
        RIXUCtaType rIXUCtaType = r2.A09;
        C61074JwC jwC = r2.A01;
        RIXULayoutFormat rIXULayoutFormat = r2.A0A;
        RIXULayoutStyle rIXULayoutStyle = r2.A0B;
        RIXUAspectRatio rIXUAspectRatio = r2.A07;
        C376559Il r5 = r2.A00;
        C61079JwH jwH = r2.A02;
        String obj = UUID.randomUUID().toString();
        Integer num4 = AnonymousClass05K.A00;
        0qQ.A0B(clipsIFUType, 8);
        0qQ.A0B(obj, 28);
        0qQ.A0B(num4, 29);
        this.A0H = str;
        this.A0G = valueOf;
        this.A0D = num;
        this.A0F = str2;
        this.A0J = str3;
        this.A0I = str4;
        this.A0L = arrayList;
        this.A03 = clipsIFUType;
        this.A0M = r13;
        this.A04 = r1;
        this.A0P = z;
        this.A0C = num2;
        this.A0N = z2;
        this.A0Q = z3;
        this.A0O = z4;
        this.A0K = list2;
        this.A0R = z5;
        this.A0B = num3;
        this.A05 = r12;
        this.A07 = rIXUCoverSize;
        this.A08 = rIXUCtaType;
        this.A01 = jwC;
        this.A09 = rIXULayoutFormat;
        this.A0A = rIXULayoutStyle;
        this.A06 = rIXUAspectRatio;
        this.A00 = r5;
        this.A02 = jwH;
        this.A0S = obj;
        this.A0E = num4;
    }

    public final AnonymousClass5OD A00() {
        AnonymousClass5OD r1;
        String str = this.A0G;
        AnonymousClass5OD r2 = null;
        if (str == null) {
            return null;
        }
        try {
            String upperCase = str.toUpperCase(Locale.ROOT);
            0qQ.A07(upperCase);
            r1 = AnonymousClass5OD.valueOf(upperCase);
        } catch (Throwable th) {
            r1 = new 0eQ(th);
        }
        if (!(r1 instanceof 0eQ)) {
            r2 = r1;
        }
        return r2;
    }

    public final ClipsViewerSource A01() {
        int ordinal = this.A03.ordinal();
        if (ordinal == 2) {
            return ClipsViewerSource.CLIPS_MUSIC_DROPS_NETEGO;
        }
        if (ordinal == 3) {
            return ClipsViewerSource.CLIPS_QUICK_PROMOTION_IN_FEED_UNIT;
        }
        if (ordinal != 4) {
            if (ordinal == 5) {
                return ClipsViewerSource.CLIPS_TRENDING_IN_FEED_UNIT;
            }
            if (ordinal != 1) {
                return ClipsViewerSource.UNKNOWN;
            }
            return ClipsViewerSource.DIRECT_SEARCH;
        } else if (this.A0E == AnonymousClass05K.A0C) {
            return ClipsViewerSource.CLIPS_SUGGESTED_FEED_CONTEXTUAL_CHAIN;
        } else {
            return ClipsViewerSource.CLIPS_NETEGO;
        }
    }

    public final boolean AJb(1Xj r4) {
        List<C276014sL> list = this.A0M;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            for (C276014sL r0 : list) {
                if (0qQ.A0K(r0.A00, r4)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final 1UQ B5J() {
        return 1UQ.A0C;
    }

    public final Integer B9V() {
        return this.A0B;
    }

    public final C67241sS BJP() {
        return this.A05;
    }

    public final Integer BVp() {
        return this.A0D;
    }

    public final String C9L() {
        return this.A0F;
    }

    public final Integer CBd() {
        return AnonymousClass05K.A0N;
    }

    public final Integer CEl() {
        return this.A0C;
    }

    public final String getId() {
        String str = this.A0H;
        if (str != null) {
            return str;
        }
        0wb.A03("ClipsNetego", "ClipsNetego Id is null at time of getId()");
        String obj = UUID.randomUUID().toString();
        0qQ.A07(obj);
        return obj;
    }

    public AnonymousClass3Y6() {
        ClipsIFUType clipsIFUType = ClipsIFUType.SUGGESTED;
        0sn r5 = 0sn.A00;
        C298855u9 A002 = C276114sa.A00.A00(false);
        A002.A00 = null;
        C276104sZ A003 = A002.A00();
        String obj = UUID.randomUUID().toString();
        Integer num = AnonymousClass05K.A00;
        0qQ.A0B(clipsIFUType, 8);
        0qQ.A0B(r5, 9);
        0qQ.A0B(obj, 28);
        0qQ.A0B(num, 29);
        this.A0H = null;
        this.A0G = null;
        this.A0D = null;
        this.A0F = null;
        this.A0J = null;
        this.A0I = null;
        this.A0L = null;
        this.A03 = clipsIFUType;
        this.A0M = r5;
        this.A04 = A003;
        this.A0P = false;
        this.A0C = null;
        this.A0N = false;
        this.A0Q = false;
        this.A0O = false;
        this.A0K = null;
        this.A0R = false;
        this.A0B = null;
        this.A05 = null;
        this.A07 = null;
        this.A08 = null;
        this.A01 = null;
        this.A09 = null;
        this.A0A = null;
        this.A06 = null;
        this.A00 = null;
        this.A02 = null;
        this.A0S = obj;
        this.A0E = num;
    }
}
