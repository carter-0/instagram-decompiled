package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Deprecated;

@Deprecated(message = "Keep in sync with ReelAdsAndNetegoResponseHandlerKt which is the Kotlin equivalent of this class, which is being AB tested. If adding a usage of this class, you should also use ReelAdsAndNetegoResponseHandlerKt depending on A/B test state.")
/* renamed from: X.3CK  reason: invalid class name */
public final class AnonymousClass3CK implements AnonymousClass3CL {
    public static final 1P0 A0O = new AnonymousClass3CM();
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public 1P0 A07 = A0O;
    public C250903mF A08;
    public AnonymousClass3CP A09;
    public Integer A0A = AnonymousClass05K.A00;
    public final int A0B;
    public final Context A0C;
    public final UserSession A0D;
    public final C233172vA A0E;
    public final AnonymousClass4DU A0F;
    public final AnonymousClass3BQ A0G;
    public final C228812mN A0H;
    public final C249763kK A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final 1wn A0M = new AnonymousClass3CN(this);
    public final String A0N;

    public final 1P0 AMj(C238523Ce r7, UUID uuid, boolean z) {
        return new C238553Ci(this, r7, uuid, false, z);
    }

    public static C268314dB A00(C250903mF r12, AnonymousClass3CK r13, boolean z, boolean z2) {
        Collection<AnonymousClass3HX> emptyList;
        HashMap hashMap;
        String obj;
        List A0K2;
        if (z) {
            C233072uu r0 = r13.A09.A02;
            if (r0 != null) {
                r0.D67();
                0sn r1 = 0sn.A00;
                return new C268314dB(r1, r1);
            }
            throw new IllegalStateException("Required value was null.");
        }
        UserSession userSession = r13.A0D;
        if (r12.A03(userSession) != null) {
            emptyList = r12.A03(userSession).values();
        } else {
            emptyList = Collections.emptyList();
        }
        HashMap hashMap2 = r12.A06;
        if (hashMap2 != null) {
            new HashMap(hashMap2);
        }
        HashMap hashMap3 = r12.A06;
        if (hashMap3 == null) {
            hashMap = new HashMap();
        }
        Collection values = hashMap.values();
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass3HX r14 : emptyList) {
            if (r14 != null && AnonymousClass3P9.A08(userSession, r14)) {
                AnonymousClass3P9.A04(r14);
                for (1Xj r15 : AnonymousClass3P9.A05(r14)) {
                    if (!arrayList.contains(C231122qu.A07(userSession, r15))) {
                        arrayList.add(C231122qu.A07(userSession, r15));
                    }
                    1Xj BPf = r15.BPf();
                    if (BPf.CcK() && C231122qu.A0K(userSession, BPf) == null && (A0K2 = C231122qu.A0K(userSession, BPf)) != null) {
                        C271954jr A002 = C271944jq.A00(userSession);
                        if (!A0K2.isEmpty()) {
                            A002.A00 = A0K2;
                        }
                    }
                }
            }
        }
        A01(r13, arrayList, r12.mStatusCode);
        int i = r12.mStatusCode;
        C233172vA r2 = r13.A0E;
        r2.A0Z = Integer.toString(r12.mResponseId);
        UUID uuid = r12.A08;
        if (uuid == null) {
            obj = null;
        } else {
            obj = uuid.toString();
        }
        r2.A0b = obj;
        r2.A0J = Long.valueOf((long) r12.A03(userSession).size());
        return r13.A09.A01(Integer.toString(r12.mResponseId), emptyList, values, r12.A08, i, System.currentTimeMillis() - r13.A06, z2);
    }

    public final void A7K(C233632w4 r2) {
        this.A04 = r2.A01;
    }

    public final 1P0 AM1() {
        return new C238553Ci(this, C238523Ce.A04, (UUID) null, true, false);
    }

    public final int Aa2() {
        return this.A00;
    }

    public final int Azm() {
        return this.A01;
    }

    public final C250903mF B6A() {
        return this.A08;
    }

    public final int BW4() {
        return this.A02;
    }

    public final int BfC() {
        return this.A03;
    }

    public final boolean CaQ() {
        if (this.A0A == AnonymousClass05K.A0C) {
            return true;
        }
        return false;
    }

    public AnonymousClass3CK(Context context, UserSession userSession, C233172vA r8, AnonymousClass4DU r9, AnonymousClass3BQ r10, C228812mN r11, C249763kK r12, String str) {
        int i = -1;
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = -1;
        this.A0C = context;
        this.A0D = userSession;
        this.A0N = str;
        this.A0F = r9;
        this.A0I = r12;
        this.A0G = r10;
        this.A0E = r8;
        this.A0H = r11;
        0Tu r4 = 0Tu.A05;
        this.A0J = 182.A06(r4, userSession, 36310542579728518L);
        boolean A062 = 182.A06(r4, userSession, 36310542579990666L);
        this.A0L = A062;
        int i2 = 0;
        this.A00 = A062 ? 0 : i;
        this.A0K = 182.A06(r4, userSession, 36310542580056203L);
        Long valueOf = Long.valueOf(182.A01(r4, userSession, 36592017558798463L));
        this.A0B = valueOf != null ? valueOf.intValue() : i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r13.A01 != -1) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void A01(X.AnonymousClass3CK r13, java.util.List r14, int r15) {
        /*
            long r10 = java.lang.System.currentTimeMillis()
            com.instagram.common.session.UserSession r2 = r13.A0D
            X.4DU r3 = r13.A0F
            java.lang.String r4 = r13.A0N
            X.3kK r0 = r13.A0I
            java.lang.String r5 = r0.getSessionId()
            int r0 = r13.A02
            r1 = -1
            if (r0 != r1) goto L_0x001a
            int r0 = r13.A01
            r12 = 1
            if (r0 == r1) goto L_0x001b
        L_0x001a:
            r12 = 0
        L_0x001b:
            long r0 = r13.A06
            long r8 = r10 - r0
            long r0 = r13.A05
            long r10 = r10 - r0
            r6 = r14
            r7 = r15
            X.C233822wX.A0U(r2, r3, r4, r5, r6, r7, r8, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass3CK.A01(X.3CK, java.util.List, int):void");
    }

    public final void ENz(1P0 r1) {
        this.A07 = r1;
    }

    public final void EQK(AnonymousClass3CP r1) {
        this.A09 = r1;
    }
}
