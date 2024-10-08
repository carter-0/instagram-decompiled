package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* renamed from: X.WZn  reason: case insensitive filesystem */
public final class C19439WZn implements AnonymousClass3CL {
    public static final 1P0 A0O = new C15573Uf1(1);
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
    public final 1wn A0M = new C19221WQb(this, 32);
    public final String A0N;

    public final 1P0 AMj(C238523Ce r8, UUID uuid, boolean z) {
        return new C15617Ufj(0, this, r8, uuid, false, z);
    }

    public static final C268314dB A00(C250903mF r11, C19439WZn wZn, boolean z, boolean z2) {
        Collection<AnonymousClass3HX> emptyList;
        HashMap hashMap;
        List A0K2;
        C19439WZn wZn2 = wZn;
        if (z) {
            AnonymousClass3CP r0 = wZn.A09;
            if (r0 != null) {
                C233072uu r02 = r0.A02;
                if (r02 != null) {
                    r02.D67();
                    0sn r1 = 0sn.A00;
                    return new C268314dB(r1, r1);
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        UserSession userSession = wZn.A0D;
        C250903mF r5 = r11;
        if (r11.A03(userSession) != null) {
            emptyList = r11.A03(userSession).values();
        } else {
            emptyList = Collections.emptyList();
        }
        0qQ.A07(emptyList);
        HashMap hashMap2 = r5.A06;
        if (hashMap2 == null) {
            hashMap = new HashMap();
        }
        0sn values = hashMap.values();
        if (values == null) {
            values = 0sn.A00;
        }
        ArrayList arrayList = new ArrayList();
        for (AnonymousClass3HX r3 : emptyList) {
            if (r3 != null && AnonymousClass3P9.A08(userSession, r3)) {
                AnonymousClass3P9.A04(r3);
                Iterator it = AnonymousClass3P9.A05(r3).iterator();
                while (it.hasNext()) {
                    1Xj A0t = C51966G9m.A0t(it);
                    if (!arrayList.contains(C231122qu.A07(userSession, A0t))) {
                        arrayList.add(C231122qu.A07(userSession, A0t));
                    }
                    1Xj BPf = A0t.BPf();
                    if (BPf.CcK() && C231122qu.A0K(userSession, BPf) == null && (A0K2 = C231122qu.A0K(userSession, BPf)) != null) {
                        C271954jr A002 = C271944jq.A00(userSession);
                        if (!A0K2.isEmpty()) {
                            A002.A00 = A0K2;
                        }
                    }
                }
            }
        }
        A01(wZn, 00k.A0X(arrayList), r5.mStatusCode);
        int i = r5.mStatusCode;
        C233172vA r6 = wZn.A0E;
        r6.A0Z = String.valueOf(r5.mResponseId);
        r6.A0b = DbX.A0t(r5.A08);
        r6.A0J = Long.valueOf((long) r5.A03(userSession).size());
        AnonymousClass3CP r62 = wZn.A09;
        if (r62 != null) {
            return r62.A01(String.valueOf(r5.mResponseId), 00k.A0X(emptyList), 00k.A0X(values), r5.A08, i, System.currentTimeMillis() - wZn2.A06, z2);
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void A7K(C233632w4 r2) {
        this.A04 = r2.A01;
    }

    public final 1P0 AM1() {
        return new C15617Ufj(0, this, C238523Ce.A04, (Object) null, true, false);
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
        return AnonymousClass7TF.A1W(this.A0A, AnonymousClass05K.A0C);
    }

    public final void ENz(1P0 r1) {
        this.A07 = r1;
    }

    public final void EQK(AnonymousClass3CP r1) {
        this.A09 = r1;
    }

    public C19439WZn(Context context, UserSession userSession, C233172vA r7, AnonymousClass4DU r8, AnonymousClass3BQ r9, C228812mN r10, C249763kK r11, String str) {
        this.A0C = context;
        this.A0G = r9;
        this.A0D = userSession;
        this.A0F = r8;
        this.A0I = r11;
        this.A0N = str;
        this.A0E = r7;
        this.A0H = r10;
        0Tu r3 = 0Tu.A05;
        this.A0J = 182.A06(r3, userSession, 36310542579728518L);
        boolean A062 = 182.A06(r3, userSession, 36310542579990666L);
        this.A0L = A062;
        int i = -1;
        this.A03 = -1;
        this.A02 = -1;
        this.A01 = -1;
        this.A00 = A062 ? 0 : i;
        this.A0K = 182.A06(r3, userSession, 36310542580056203L);
        this.A0B = (int) 182.A01(r3, userSession, 36592017558798463L);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0018, code lost:
        if (r13.A01 != -1) goto L_0x001a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.C19439WZn r13, java.util.List r14, int r15) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C19439WZn.A01(X.WZn, java.util.List, int):void");
    }
}
