package X;

import android.content.Context;
import com.instagram.search.common.api.SerpApi;
import java.util.List;
import java.util.Map;

/* renamed from: X.Ocm  reason: case insensitive filesystem */
public final class C71108Ocm {
    public final Context A00;
    public final AnonymousClass4HW A01;
    public final AnonymousClass4HW A02;
    public final SerpApi A03 = new Object();
    public final Map A04 = AnonymousClass7TE.A1H();
    public final Map A05 = AnonymousClass7TE.A1H();

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, com.instagram.search.common.api.SerpApi] */
    public C71108Ocm(Context context) {
        0qQ.A0B(context, 1);
        this.A00 = context;
        AnonymousClass4HU r1 = AnonymousClass4HU.A00;
        this.A02 = C335967dq.A00(r1);
        this.A01 = C335967dq.A00(r1);
    }

    public static final 05G A01(C71108Ocm ocm, String str, String str2) {
        Map map = ocm.A04;
        String A0T = 002.A0T(str, str2, ':');
        Object obj = map.get(A0T);
        if (obj == null) {
            obj = DbS.A10(new C15051ULh());
            map.put(A0T, obj);
        }
        return (05G) obj;
    }

    public static final 05G A02(C71108Ocm ocm, String str, String str2) {
        Map map = ocm.A05;
        String A0T = 002.A0T(str, str2, ':');
        Object obj = map.get(A0T);
        if (obj == null) {
            0sn r18 = 0sn.A00;
            Integer num = AnonymousClass05K.A00;
            obj = DbS.A10(new N4N((C15051ULh) null, new C61041Jvf(), (N3M) null, (1Xj) null, (OEW) null, C69174Nfx.A00, num, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, r18, 0Yt.A0E(), AnonymousClass7TE.A1H(), 0, 0, false, false, false, false, false, false));
            map.put(A0T, obj);
        }
        return (05G) obj;
    }

    public final void A04(String str, String str2, String str3) {
        05G A022 = A02(this, str, str2);
        N4N n4n = (N4N) A022.getValue();
        0qQ.A0B(n4n, 0);
        A022.Epw(N4N.A00((C15051ULh) null, (C61041Jvf) null, (N3M) null, (1Xj) null, (OEW) null, (C69628NpA) null, n4n, (Integer) null, (Integer) null, (String) null, str3, (String) null, (String) null, (String) null, (List) null, (Map) null, (Map) null, 0, 0, 33552383, false, false, false, false, false, false));
    }

    public static Object A00(C71108Ocm ocm, String str, String str2) {
        return A02(ocm, str, str2).getValue();
    }

    public static final void A03(C71108Ocm ocm, String str, String str2, 0sP r3) {
        05G A022 = A02(ocm, str, str2);
        A022.Epw(r3.invoke(A022.getValue()));
    }

    public final boolean A05(String str, String str2) {
        N4N n4n = (N4N) A00(this, str, str2);
        if (!(!n4n.A0H.isEmpty()) && n4n.A07 == null && n4n.A09 == null) {
            return false;
        }
        return true;
    }
}
