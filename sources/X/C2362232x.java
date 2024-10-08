package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.search.common.analytics.SearchContext;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.32x  reason: invalid class name and case insensitive filesystem */
public final class C2362232x {
    public int A00;
    public C228422le A01;
    public C227762js A02;
    public C227282ix A03;
    public 2el A04;
    public C2356130n A05;
    public AnonymousClass57N A06;
    public AnonymousClass57V A07;
    public C2355030c A08;
    public AnonymousClass57T A09;
    public AnonymousClass310 A0A;
    public C2362332y A0B;
    public C234172xD A0C;
    public AnonymousClass2lU A0D;
    public AnonymousClass2xI A0E;
    public C2356230o A0F;
    public AnonymousClass2xS A0G;
    public AnonymousClass30S A0H;
    public AnonymousClass57Q A0I;
    public C228182kv A0J;
    public C234422xq A0K;
    public AnonymousClass57U A0L;
    public AnonymousClass324 A0M;
    public C2355630i A0N;
    public SearchContext A0O;
    public C228232l0 A0P;
    public C234342xi A0Q;
    public C249763kK A0R;
    public C270394gf A0S = null;
    public Boolean A0T = false;
    public Long A0U = null;
    public String A0V;
    public String A0W;
    public String A0X = null;
    public List A0Y;
    public boolean A0Z;
    public boolean A0a = false;
    public boolean A0b;
    public boolean A0c;
    public C2355930l A0d;
    public UserSession A0e;
    public AnonymousClass2xI A0f;
    public User A0g;
    public final Context A0h;
    public final Fragment A0i;
    public final 0hq A0j;
    public final C231322rQ A0k;
    public final AnonymousClass4DU A0l;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v5, resolved type: X.4DP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v60, resolved type: X.2ZP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v63, resolved type: X.4DP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: X.30h} */
    /* JADX WARNING: type inference failed for: r8v5, types: [java.lang.Object, X.30i] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.AnonymousClass332 A00() {
        /*
            r62 = this;
            r0 = r62
            X.30S r1 = r0.A0H
            if (r1 != 0) goto L_0x0012
            X.3kK r1 = r0.A0R
            if (r1 != 0) goto L_0x0012
            java.lang.String r1 = "Either SessionIdProvider or MediaViewPointHelper must be not null."
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            r0.<init>(r1)
            throw r0
        L_0x0012:
            X.2el r1 = r0.A04
            if (r1 != 0) goto L_0x001e
            androidx.fragment.app.Fragment r1 = r0.A0i
            X.2el r1 = X.C2362432z.A00(r1)
            r0.A04 = r1
        L_0x001e:
            X.2xS r1 = r0.A0G
            r27 = 0
            if (r1 != 0) goto L_0x004c
            int r1 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            android.content.Context r4 = r0.A0h
            com.instagram.common.session.UserSession r6 = r0.A0e
            X.4DU r8 = r0.A0l
            X.2rQ r2 = r0.A0k
            X.3kK r1 = r0.A0R
            if (r1 == 0) goto L_0x00b1
            java.lang.String r14 = r1.getSessionId()
        L_0x0036:
            X.2xQ r12 = X.AnonymousClass2xQ.A08
            X.2el r7 = r0.A04
            r15 = 0
            java.lang.Integer r13 = X.AnonymousClass05K.A0u
            X.2lU r1 = r0.A0D
            androidx.fragment.app.Fragment r5 = r0.A0i
            X.2xS r3 = new X.2xS
            r9 = r1
            r10 = r2
            r11 = r27
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r0.A0G = r3
        L_0x004c:
            X.2xq r1 = r0.A0K
            if (r1 != 0) goto L_0x0061
            android.content.Context r5 = r0.A0h
            com.instagram.common.session.UserSession r4 = r0.A0e
            X.4DU r3 = r0.A0l
            X.2xP r2 = X.C234242xR.A00()
            X.2xq r1 = new X.2xq
            r1.<init>(r5, r4, r3, r2)
            r0.A0K = r1
        L_0x0061:
            X.2xi r1 = r0.A0Q
            if (r1 != 0) goto L_0x0078
            com.instagram.common.session.UserSession r5 = r0.A0e
            androidx.fragment.app.Fragment r1 = r0.A0i
            androidx.fragment.app.FragmentActivity r4 = r1.getActivity()
            X.2rQ r3 = r0.A0k
            X.4DU r2 = r0.A0l
            X.2xi r1 = new X.2xi
            r1.<init>(r4, r3, r5, r2)
            r0.A0Q = r1
        L_0x0078:
            X.30c r2 = r0.A08
            if (r2 != 0) goto L_0x0093
            com.instagram.common.session.UserSession r2 = r0.A0e
            X.4DU r5 = r0.A0l
            X.2rQ r6 = r0.A0k
            X.3kK r1 = r0.A0R
            X.2pq r4 = new X.2pq
            r4.<init>((com.instagram.common.session.UserSession) r2, (X.AnonymousClass4DU) r5, (X.C228402lc) r6, (X.C249763kK) r1)
            androidx.fragment.app.Fragment r3 = r0.A0i
            r7 = 0
            X.30c r2 = new X.30c
            r2.<init>(r3, r4, r5, r6, r7)
            r0.A08 = r2
        L_0x0093:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r1.add(r2)
            java.util.List r2 = r0.A0Y
            if (r2 == 0) goto L_0x00b4
            java.util.Iterator r3 = r2.iterator()
        L_0x00a3:
            boolean r2 = r3.hasNext()
            if (r2 == 0) goto L_0x00b4
            java.lang.Object r2 = r3.next()
            r1.add(r2)
            goto L_0x00a3
        L_0x00b1:
            r14 = r27
            goto L_0x0036
        L_0x00b4:
            X.2xI r2 = r0.A0E
            if (r2 != 0) goto L_0x00c6
            com.instagram.common.session.UserSession r4 = r0.A0e
            X.30e r3 = new X.30e
            r3.<init>(r4)
            X.2xI r2 = new X.2xI
            r2.<init>(r4, r3)
            r0.A0E = r2
        L_0x00c6:
            X.2xI r2 = r0.A0f
            if (r2 != 0) goto L_0x00da
            com.instagram.common.session.UserSession r4 = r0.A0e
            boolean r2 = r0.A0Z
            X.331 r3 = new X.331
            r3.<init>(r2)
            X.2xI r2 = new X.2xI
            r2.<init>(r4, r3)
            r0.A0f = r2
        L_0x00da:
            X.30i r8 = r0.A0N
            if (r8 != 0) goto L_0x00ff
            androidx.fragment.app.Fragment r4 = r0.A0i
            boolean r2 = r4 instanceof X.AnonymousClass2ZP
            if (r2 == 0) goto L_0x02e7
            r2 = r4
            X.2ZP r2 = (X.AnonymousClass2ZP) r2
            int r2 = r2.C3p()
            if (r2 != 0) goto L_0x02e7
            X.4DU r3 = r0.A0l
            r2 = r4
            X.4DP r2 = (X.AnonymousClass4DP) r2
            android.app.Activity r2 = r2.getRootActivity()
            X.2Zb r2 = (X.C70952Zb) r2
            X.30h r8 = new X.30h
            r8.<init>(r4, r3, r2)
            r0.A0N = r8
        L_0x00ff:
            X.324 r2 = r0.A0M
            if (r2 != 0) goto L_0x0126
            androidx.fragment.app.Fragment r10 = r0.A0i
            X.3kK r7 = r0.A0R
            X.4DU r6 = r0.A0l
            com.instagram.common.session.UserSession r5 = r0.A0e
            r19 = 0
            com.instagram.search.common.analytics.SearchContext r4 = r0.A0O
            java.lang.Long r3 = r0.A0U
            java.lang.String r2 = r0.A0X
            X.323 r9 = new X.323
            r11 = r5
            r12 = r6
            r14 = r8
            r15 = r4
            r16 = r7
            r17 = r3
            r18 = r2
            r13 = r27
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r0.A0M = r9
        L_0x0126:
            X.30l r2 = r0.A0d
            if (r2 != 0) goto L_0x0139
            androidx.fragment.app.Fragment r2 = r0.A0i
            androidx.fragment.app.FragmentActivity r4 = r2.getActivity()
            com.instagram.common.session.UserSession r3 = r0.A0e
            X.30l r2 = new X.30l
            r2.<init>(r4, r3)
            r0.A0d = r2
        L_0x0139:
            X.2l0 r2 = r0.A0P
            if (r2 != 0) goto L_0x0144
            X.4LP r2 = new X.4LP
            r2.<init>()
            r0.A0P = r2
        L_0x0144:
            X.310 r2 = r0.A0A
            if (r2 != 0) goto L_0x028b
            X.30S r2 = r0.A0H
            if (r2 != 0) goto L_0x019a
            android.content.Context r8 = r0.A0h
            androidx.fragment.app.Fragment r2 = r0.A0i
            r10 = r2
            X.4DJ r10 = (X.AnonymousClass4DJ) r10
            androidx.fragment.app.FragmentActivity r9 = r2.requireActivity()
            com.instagram.common.session.UserSession r11 = r0.A0e
            X.4DU r13 = r0.A0l
            X.3kK r6 = r0.A0R
            X.2el r12 = r0.A04
            X.1sy r15 = X.1sy.A0K
            X.Ulw r5 = new X.Ulw
            r5.<init>()
            X.2xS r3 = r0.A0G
            X.2el r2 = r3.A0B
            r16 = r27
            if (r2 == 0) goto L_0x0170
            r16 = r3
        L_0x0170:
            X.2xq r7 = r0.A0K
            X.2lU r14 = r0.A0D
            X.2kv r4 = r0.A0J
            r3 = 1
            X.0qQ.A0B(r10, r3)
            r2 = 5
            X.0qQ.A0B(r6, r2)
            r2 = 6
            X.0qQ.A0B(r12, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r3)
            r2.add(r5)
            r20 = r27
            r21 = r2
            r17 = r4
            r18 = r7
            r19 = r6
            X.30S r2 = X.GU3.A00(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            r0.A0H = r2
        L_0x019a:
            androidx.fragment.app.Fragment r2 = r0.A0i
            r61 = r2
            X.0hq r12 = r0.A0j
            X.4DU r2 = r0.A0l
            r60 = r2
            X.2rQ r11 = r0.A0k
            X.2xS r10 = r0.A0G
            X.2xq r2 = r0.A0K
            r36 = r2
            X.30c r2 = r0.A08
            r59 = r2
            X.2xD r2 = r0.A0C
            r58 = r2
            X.2xi r9 = r0.A0Q
            com.instagram.common.session.UserSession r8 = r0.A0e
            X.3kK r2 = r0.A0R
            r43 = r2
            X.2xI r7 = r0.A0E
            X.2xI r2 = r0.A0f
            r28 = r2
            X.324 r6 = r0.A0M
            X.30l r2 = r0.A0d
            r57 = r2
            android.content.Context r2 = r0.A0h
            X.0Pl r30 = X.0Pl.A04(r2, r8)
            boolean r2 = r0.A0b
            r51 = r2
            X.57T r2 = r0.A09
            r56 = r2
            X.2el r5 = r0.A04
            X.30S r2 = r0.A0H
            r32 = r2
            java.lang.String r2 = r0.A0W
            r47 = r2
            X.30n r2 = r0.A05
            r55 = r2
            X.30o r2 = r0.A0F
            r29 = r2
            X.2l0 r4 = r0.A0P
            boolean r2 = r0.A0c
            r52 = r2
            boolean r2 = r0.A0a
            r24 = r2
            X.57U r2 = r0.A0L
            r23 = r2
            java.lang.String r2 = r0.A0V
            r22 = r2
            X.57N r2 = r0.A06
            r21 = r2
            X.4gf r2 = r0.A0S
            r20 = r2
            X.57V r2 = r0.A07
            r19 = r2
            java.lang.Boolean r2 = r0.A0T
            boolean r54 = r2.booleanValue()
            com.instagram.search.common.analytics.SearchContext r2 = r0.A0O
            r18 = r2
            X.2js r2 = r0.A02
            r17 = r2
            X.57Q r2 = r0.A0I
            r16 = r2
            java.lang.Long r15 = r0.A0U
            java.lang.String r14 = r0.A0X
            X.2ix r13 = r0.A03
            X.2lU r3 = r0.A0D
            r2 = 2
            X.0qQ.A0B(r12, r2)
            r2 = 4
            X.0qQ.A0B(r11, r2)
            r2 = 5
            X.0qQ.A0B(r10, r2)
            r2 = 9
            X.0qQ.A0B(r9, r2)
            r2 = 12
            X.0qQ.A0B(r7, r2)
            r2 = 14
            X.0qQ.A0B(r6, r2)
            r2 = 20
            X.0qQ.A0B(r5, r2)
            r2 = 27
            X.0qQ.A0B(r4, r2)
            X.30y r2 = new X.30y
            r25 = r11
            r26 = r7
            r31 = r10
            r33 = r16
            r34 = r27
            r35 = r27
            r37 = r23
            r38 = r27
            r39 = r6
            r40 = r18
            r41 = r4
            r42 = r9
            r44 = r20
            r45 = r15
            r46 = r27
            r48 = r27
            r49 = r22
            r50 = r14
            r53 = r24
            r9 = r2
            r10 = r61
            r11 = r12
            r12 = r17
            r14 = r57
            r15 = r8
            r16 = r5
            r17 = r55
            r18 = r21
            r20 = r59
            r21 = r56
            r22 = r60
            r23 = r58
            r24 = r3
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51, r52, r53, r54)
            r0.A0A = r2
        L_0x028b:
            int r3 = r0.A00
            int r2 = X.C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION
            androidx.fragment.app.Fragment r2 = r0.A0i
            r17 = r2
            androidx.fragment.app.FragmentActivity r2 = r17.getActivity()
            com.instagram.common.session.UserSession r13 = r0.A0e
            X.4DU r12 = r0.A0l
            if (r3 > 0) goto L_0x02a0
            r3 = 23592961(0x1680001, float:4.2611673E-38)
        L_0x02a0:
            X.2nK r11 = new X.2nK
            r11.<init>(r2, r12, r13, r3)
            X.2rQ r15 = r0.A0k
            X.2xS r14 = r0.A0G
            X.2xq r10 = r0.A0K
            X.30c r9 = r0.A08
            X.2xD r8 = r0.A0C
            X.2xi r7 = r0.A0Q
            X.30i r6 = r0.A0N
            X.32y r5 = r0.A0B
            X.310 r4 = r0.A0A
            X.0MB r26 = X.0MB.A05(r13)
            X.2l0 r3 = r0.A0P
            X.3kK r2 = r0.A0R
            X.2le r0 = r0.A01
            X.332 r16 = new X.332
            r31 = r3
            r32 = r7
            r33 = r2
            r34 = r1
            r23 = r5
            r24 = r12
            r25 = r8
            r27 = r14
            r28 = r10
            r29 = r11
            r30 = r6
            r20 = r9
            r21 = r4
            r22 = r15
            r18 = r0
            r19 = r13
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return r16
        L_0x02e7:
            X.H5O r8 = new X.H5O
            r8.<init>()
            r0.A0N = r8
            goto L_0x00ff
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2362232x.A00():X.332");
    }

    public C2362232x(Fragment fragment, 0hq r4, C231322rQ r5, AnonymousClass2kR r6) {
        this.A0h = r6.A00;
        this.A0i = fragment;
        this.A0j = r4;
        this.A0k = r5;
        this.A0l = r6.A02;
        UserSession userSession = r6.A01;
        this.A0e = userSession;
        this.A0g = AnonymousClass0t1.A01.A01(userSession);
    }
}
