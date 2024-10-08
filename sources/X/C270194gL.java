package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* renamed from: X.4gL  reason: invalid class name and case insensitive filesystem */
public final class C270194gL extends 1XP implements 1Nv, AnonymousClass1Xp {
    public C278044w9 A00;
    public C278054wA A01;
    public C277954w0 A02;
    public C278094wG A03;
    public C277984w3 A04;
    public ImageUrl A05;
    public C278114wI A06 = C278114wI.UNKNOWN;
    public C278134wK A07 = null;
    public AnonymousClass547 A08;
    public User A09;
    public AnonymousClass3NV A0A;
    public Boolean A0B;
    public Boolean A0C;
    public Boolean A0D;
    public Boolean A0E;
    public Boolean A0F;
    public Boolean A0G = null;
    public Boolean A0H;
    public Boolean A0I;
    public Boolean A0J = false;
    public Boolean A0K = true;
    public Boolean A0L;
    public Boolean A0M = false;
    public Integer A0N = AnonymousClass05K.A0C;
    public Integer A0O = null;
    public Integer A0P;
    public Integer A0Q;
    public Integer A0R;
    public Long A0S;
    public Long A0T;
    public Long A0U;
    public Long A0V;
    public Long A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public String A0d;
    public String A0e;
    public String A0f;
    public String A0g;
    public String A0h;
    public String A0i;
    public String A0j;
    public List A0k = new ArrayList();
    public List A0l = new ArrayList();
    public List A0m = new ArrayList();
    public Set A0n = new HashSet();
    public final C278124wJ A0o = new C278124wJ(this);

    public final void AHi() {
        this.A0G = false;
    }

    public final String ByO(UserSession userSession) {
        return "";
    }

    public final boolean CUz() {
        return true;
    }

    public final boolean CYg() {
        return true;
    }

    public final boolean CcK() {
        return false;
    }

    public final int A00() {
        Integer num = this.A0R;
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public final long A01() {
        Long l = this.A0T;
        if (l == null) {
            return 0;
        }
        return l.longValue();
    }

    public final ImageUrl A02() {
        ImageUrl imageUrl = this.A05;
        if (!C253833rU.A02(imageUrl)) {
            return imageUrl;
        }
        return null;
    }

    public final User A03() {
        User user = this.A09;
        user.getClass();
        return user;
    }

    public final AnonymousClass3WR A04(UserSession userSession) {
        String str;
        long longValue;
        String str2;
        C271394im r3;
        boolean booleanValue;
        long longValue2;
        boolean isEmpty;
        String str3;
        long longValue3;
        boolean z = false;
        if (this.A07 != null) {
            z = true;
        }
        boolean z2 = false;
        if (z) {
            if (!(this.A0i == null || (str3 = this.A0e) == null)) {
                r3 = new C271394im(AnonymousClass05K.A0j, str3);
                r3.A0B = this.A0i;
                TimeUnit timeUnit = TimeUnit.SECONDS;
                Long l = this.A0S;
                if (l == null) {
                    longValue3 = 0;
                } else {
                    longValue3 = l.longValue();
                }
                r3.A02 = timeUnit.toMillis(longValue3);
                Boolean bool = this.A0L;
                if (bool != null && !bool.booleanValue()) {
                    z2 = true;
                }
                r3.A05 = Boolean.valueOf(z2);
                isEmpty = this.A0i.isEmpty();
            }
            return null;
        }
        String A052 = A05(userSession);
        if (A052 == null || (str2 = this.A0X) == null) {
            if (!(this.A0a == null || (str = this.A0X) == null)) {
                C271394im r32 = new C271394im(AnonymousClass05K.A0Y, str);
                r32.A08 = this.A0a;
                TimeUnit timeUnit2 = TimeUnit.SECONDS;
                Long l2 = this.A0S;
                if (l2 == null) {
                    longValue = 0;
                } else {
                    longValue = l2.longValue();
                }
                r32.A02 = timeUnit2.toMillis(longValue);
                Boolean bool2 = this.A0L;
                if (bool2 != null && !bool2.booleanValue()) {
                    z2 = true;
                }
                r32.A05 = Boolean.valueOf(z2);
                r32.A0I = !this.A0a.isEmpty();
                r32.A00();
            }
            return null;
        }
        r3 = new C271394im(AnonymousClass05K.A0N, str2);
        r3.A0B = A052;
        r3.A0E = A052.equals(this.A0Z);
        Boolean bool3 = this.A0H;
        if (bool3 == null) {
            booleanValue = false;
        } else {
            booleanValue = bool3.booleanValue();
        }
        r3.A0F = booleanValue;
        TimeUnit timeUnit3 = TimeUnit.SECONDS;
        Long l3 = this.A0S;
        if (l3 == null) {
            longValue2 = 0;
        } else {
            longValue2 = l3.longValue();
        }
        r3.A02 = timeUnit3.toMillis(longValue2);
        Boolean bool4 = this.A0L;
        if (bool4 != null && !bool4.booleanValue()) {
            z2 = true;
        }
        r3.A05 = Boolean.valueOf(z2);
        isEmpty = A052.isEmpty();
        r3.A0I = !isEmpty;
        return r3.A00();
    }

    public final String A05(UserSession userSession) {
        String str = this.A0Z;
        if (str == null && (str = this.A0b) == null) {
            return str;
        }
        if (str.contains("&ms=")) {
            return str;
        }
        String A042 = 182.A04(0Tu.A05, userSession, 36875536937910342L);
        if (!A042.isEmpty()) {
            return 0mp.A06("%s&ms=%s", new Object[]{str, A042});
        }
        return str;
    }

    public final Set A06() {
        Set set = this.A0n;
        if (set == null) {
            return new HashSet();
        }
        return Collections.unmodifiableSet(set);
    }

    public final boolean A07() {
        User user = this.A09;
        if (user != null && user.A29()) {
            return true;
        }
        Set<User> set = this.A0n;
        if (set == null) {
            return false;
        }
        for (User A29 : set) {
            if (A29.A29()) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000d, code lost:
        if (r1 == false) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A08() {
        /*
            r2 = this;
            java.lang.Boolean r0 = r2.A0G
            if (r0 != 0) goto L_0x0016
            X.4w3 r0 = r2.A04
            if (r0 == 0) goto L_0x000f
            boolean r1 = X.C52501GVd.A04(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0010
        L_0x000f:
            r0 = 0
        L_0x0010:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.A0G = r0
        L_0x0016:
            boolean r0 = r0.booleanValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C270194gL.A08():boolean");
    }

    public final /* bridge */ /* synthetic */ C277994w4 BQf() {
        return this.A04;
    }

    public final String BTL() {
        return this.A0g;
    }

    public final String Bi3() {
        String str = this.A0e;
        str.getClass();
        return str.split("_")[1];
    }

    public final String Bi4() {
        String str = this.A0e;
        str.getClass();
        return str.split("_")[0];
    }

    public final String getId() {
        String str = this.A0X;
        str.getClass();
        return str;
    }

    public C270194gL(C239653Hl r7) {
        C277444vB r4;
        Long l = r7.A0b;
        if (l != null) {
            this.A0X = l.toString();
        }
        String str = r7.A0j;
        if (str != null) {
            this.A05 = new SimpleImageUrl(str);
        }
        this.A02 = r7.A03;
        this.A0b = r7.A0m;
        this.A0Z = r7.A0k;
        this.A0a = r7.A0l;
        this.A0i = r7.A0s;
        AnonymousClass547 r5 = this.A08;
        if (!(r5 == null || (r4 = r7.A06) == null)) {
            r5.A00 = r4.getHeight();
            r5.A01 = r4.getWidth();
        }
        this.A09 = r7.A09;
        Float f = r7.A0Q;
        if (f != null) {
            this.A0R = Integer.valueOf(f.intValue());
        }
        this.A0m = r7.A0y;
        this.A0Q = r7.A0Y;
        Integer num = r7.A0V;
        if (num != null) {
            this.A0T = Long.valueOf(num.longValue());
        }
        Integer num2 = r7.A0R;
        if (num2 != null) {
            this.A0S = Long.valueOf(num2.longValue());
        }
        this.A0L = r7.A0L;
        this.A0e = r7.A0o;
        String str2 = r7.A0i;
        if (str2 != null) {
            this.A06 = C278144wL.A00(str2);
        }
        this.A0C = r7.A0D;
        Integer num3 = r7.A0Z;
        if (num3 != null) {
            this.A0A = C278154wM.A00(num3.intValue());
        }
        this.A0P = r7.A0U;
        this.A0I = r7.A0J;
        this.A0F = r7.A0E;
        Integer num4 = r7.A0T;
        if (num4 == null || num4.intValue() != 1) {
            this.A0H = false;
        } else {
            this.A0H = true;
        }
        this.A0E = r7.A0C;
        this.A0g = r7.A0r;
        this.A04 = r7.A08;
        this.A01 = r7.A01;
        this.A03 = r7.A07;
        this.A0Y = r7.A0g;
        Integer num5 = r7.A0W;
        if (num5 != null) {
            this.A0V = Long.valueOf(num5.longValue());
        }
        Integer num6 = r7.A0X;
        if (num6 != null) {
            this.A0W = Long.valueOf(num6.longValue());
        }
        this.A0h = r7.A0p;
        this.A0c = r7.A0n;
        Long l2 = r7.A0c;
        if (l2 != null) {
            this.A0d = l2.toString();
        }
        List list = r7.A0v;
        if (list != null) {
            this.A0n = new HashSet(list);
        }
        String str3 = r7.A0t;
        if (str3 != null) {
            this.A0U = Long.valueOf(Long.parseLong(str3));
        }
        Boolean bool = r7.A0K;
        if (bool != null) {
            this.A0K = bool;
        }
        C278044w9 r1 = r7.A00;
        if (r1 != null) {
            this.A00 = r1.F0J();
        }
        this.A0k = r7.A0u;
        this.A0M = r7.A0M;
        this.A0D = r7.A0B;
        this.A0J = r7.A0O;
        this.A0O = r7.A0S;
        this.A0B = r7.A0A;
        this.A0l = r7.A0w;
        Long l3 = r7.A0f;
        if (l3 != null) {
            this.A0j = l3.toString();
        }
        if (r1 != null) {
            this.A00 = r1.F0J();
        }
    }

    public final boolean A09(UserSession userSession) {
        1Av A002 = 1Au.A00(userSession);
        if (((Boolean) A002.A09.CDM(A002, 1Av.A8a[176])).booleanValue() || (A01() * 1000) + 86400000 >= System.currentTimeMillis()) {
            return false;
        }
        return true;
    }

    public C270194gL() {
    }
}
