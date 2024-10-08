package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.2lb  reason: invalid class name and case insensitive filesystem */
public final class C228392lb implements C228402lc, C228412ld {
    public final long A00;
    public final UserSession A01;
    public final Map A02 = new HashMap();
    public final Map A03 = new HashMap();
    public final Map A04 = new HashMap();
    public final Map A05 = new HashMap();
    public final Map A06 = new HashMap();
    public final Map A07 = new HashMap();
    public final Map A08 = new HashMap();
    public final Map A09 = new HashMap();
    public final Map A0A = new HashMap();
    public final Map A0B = new HashMap();
    public final Map A0C = new HashMap();
    public final Map A0D = new HashMap();
    public final Map A0E = new HashMap();
    public final Map A0F = new HashMap();
    public final Map A0G = new HashMap();
    public final Map A0H = new HashMap();
    public final Map A0I = new HashMap();
    public final Map A0J = new HashMap();
    public final Map A0K = new HashMap();

    public final C292795jX A01(AnonymousClass3Y6 r4) {
        0qQ.A0B(r4, 0);
        Map map = this.A0J;
        String id = r4.getId();
        Object obj = map.get(id);
        if (obj == null) {
            obj = new C292795jX();
            map.put(id, obj);
        }
        return (C292795jX) obj;
    }

    public final AnonymousClass3W1 BQr(1Xj r8) {
        C247733gp A1T;
        0qQ.A0B(r8, 0);
        Map map = this.A0A;
        AnonymousClass3W1 r2 = (AnonymousClass3W1) map.get(r8.getId());
        if (r2 == null) {
            r2 = new AnonymousClass3W1(r8.A0o(), r8.A4o());
            r2.A0O(1sy.A0H);
            UserSession userSession = this.A01;
            0Tu r5 = 0Tu.A05;
            if (182.A06(r5, userSession, 36314442408987181L)) {
                r2.A37 = true;
            }
            if (AnonymousClass3WP.A08(userSession, r8) && (!182.A06(r5, userSession, 2342165929888656048L) || r8.A1T() == null || ((A1T = r8.A1T()) != null && !A1T.A0h))) {
                AnonymousClass3W9 r1 = AnonymousClass3W9.Translated;
                0qQ.A0B(r1, 0);
                r2.A3b.A00(r2, r1);
            }
            map.put(r8.getId(), r2);
        }
        return r2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        if (r0.length() != 0) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C266934aa A00(X.AnonymousClass3UH r6) {
        /*
            r5 = this;
            java.util.Map r4 = r5.A0G
            java.lang.String r3 = r6.A0F
            if (r3 != 0) goto L_0x0008
            java.lang.String r3 = ""
        L_0x0008:
            java.lang.Object r2 = r4.get(r3)
            if (r2 != 0) goto L_0x002a
            X.4aa r2 = new X.4aa
            r2.<init>()
            X.1UQ r0 = r6.A05
            if (r0 != 0) goto L_0x0019
            X.1UQ r0 = X.1UQ.A0v
        L_0x0019:
            int r0 = r0.ordinal()
            r1 = 1
            switch(r0) {
                case 2: goto L_0x002d;
                case 3: goto L_0x0037;
                case 4: goto L_0x0037;
                case 5: goto L_0x0021;
                case 6: goto L_0x0021;
                case 7: goto L_0x002d;
                case 8: goto L_0x002d;
                case 9: goto L_0x0021;
                case 10: goto L_0x0037;
                default: goto L_0x0021;
            }
        L_0x0021:
            r2.A0A = r1
            boolean r0 = r6.A0S
            r2.A0B = r0
            r4.put(r3, r2)
        L_0x002a:
            X.4aa r2 = (X.C266934aa) r2
            return r2
        L_0x002d:
            java.lang.String r0 = r6.A0A
            if (r0 == 0) goto L_0x0037
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0021
        L_0x0037:
            r1 = 0
            goto L_0x0021
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C228392lb.A00(X.3UH):X.4aa");
    }

    public final AnonymousClass5GJ A02(C275464qK r5) {
        boolean z;
        Map map = this.A0K;
        String id = r5.getId();
        AnonymousClass5GJ r1 = (AnonymousClass5GJ) map.get(id);
        if (r1 != null) {
            return r1;
        }
        Boolean bool = r5.A00.A02;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        AnonymousClass5GJ r12 = new AnonymousClass5GJ(z);
        map.put(id, r12);
        return r12;
    }

    public C228392lb(Context context, UserSession userSession) {
        this.A01 = userSession;
        long integer = (long) context.getResources().getInteger(17694722);
        this.A00 = (long) (((double) integer) * 182.A00(0Tu.A05, userSession, 37154864441786372L));
    }
}
