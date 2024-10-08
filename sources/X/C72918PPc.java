package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.fragment.DirectSearchInboxFragment;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.ui.widget.search.SearchController;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.PPc  reason: case insensitive filesystem */
public final class C72918PPc implements C337237fw {
    public C232262tL A00;
    public NPE A01;
    public C71982OuE A02;
    public DirectShareTarget A03;
    public C337257fy A04;
    public Object A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public List A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H = false;
    public OKM A0I;
    public final int A0J;
    public final int A0K;
    public final int A0L;
    public final Context A0M;
    public final AnonymousClass4DH A0N;
    public final AnonymousClass0iw A0O;
    public final AnonymousClass2t9 A0P;
    public final UserSession A0Q;
    public final C72208OyY A0R;
    public final DirectSearchInboxFragment A0S;
    public final AnonymousClass7BY A0T;
    public final C251033mS A0U;
    public final SearchController A0V;
    public final List A0W = AnonymousClass7TE.A1C();
    public final List A0X = new CopyOnWriteArrayList();
    public final List A0Y = AnonymousClass7TE.A1C();
    public final boolean A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;
    public final boolean A0h;
    public final boolean A0i;
    public final boolean A0j;
    public final boolean A0k;
    public final int A0l;
    public final AnonymousClass2Fj A0m;
    public final String A0n;
    public final boolean A0o;

    public static void A01(C72918PPc pPc) {
        UserSession userSession = pPc.A0Q;
        NIS A002 = C69913NuF.A00(userSession, 182.A06(0Tu.A05, userSession, 36317934218122912L) ? 1 : 0);
        C331127Pr A0W2 = DbS.A0W(userSession);
        A0W2.A17 = true;
        DbU.A1I(pPc.A0N, A002, A0W2.A00());
    }

    public static void A02(C16744V4b v4b, Integer num, Integer num2, Object obj, List list) {
        list.add(new C71982OuE(v4b, num, num2, obj));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r63v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r58v0, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v3, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v7, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r46v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r47v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v8, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r62v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r45v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r56v1, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r48v6, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r23v4, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r50v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v9, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v11, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v12, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v13, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v17, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v18, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r15v14, resolved type: boolean} */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02fa, code lost:
        r1 = r13.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x049e, code lost:
        X.0qQ.A0B(r7, 2);
        r5.addAll(X.C48843El5.A00(r4, r8, r7, r47, r48, r10, r9, false, false, r2));
        r1 = r7.size();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x04bd, code lost:
        r48 = r48 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x04bf, code lost:
        r9 = r39;
        r10 = r36;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x0500, code lost:
        if (r21 != false) goto L_0x0502;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:218:0x057c, code lost:
        r48 = r48 + r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x057e, code lost:
        r9 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x05f1, code lost:
        if (r0.A0D != false) goto L_0x05f3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x08fb, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:417:0x0a76, code lost:
        r1.addAll(r9);
        r14 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:418:0x0a79, code lost:
        r7 = X.DbT.A01(r8, r7);
        r23 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:462:0x0bb4, code lost:
        r1.addAll(r8);
        r8 = r44.size();
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:463:0x0bbb, code lost:
        r7 = r7 + r8;
        r15 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:471:0x0bde, code lost:
        if (X.182.A06(r4, r2, 36326515562657588L) == false) goto L_0x0be0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:492:0x0c76, code lost:
        r23 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:508:0x0cd1, code lost:
        r7 = r7 + r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:562:0x0dfe, code lost:
        if (((java.util.AbstractMap) r2).get("inform_module") == null) goto L_0x0e00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01c7, code lost:
        r40 = r40 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0025, code lost:
        if (r50.isEmpty() == false) goto L_0x0027;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:528:0x0d51  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(java.util.List r69, java.lang.String r70) {
        /*
            r68 = this;
            r50 = r69
            com.instagram.common.recyclerview.ViewModelListUpdate r31 = X.DbS.A0R()
            r0 = r68
            X.2tL r2 = r0.A00
            if (r2 == 0) goto L_0x0011
            r1 = r31
            r1.A00(r2)
        L_0x0011:
            r25 = 0
            r12 = 1
            r26 = r70
            if (r70 == 0) goto L_0x0069
            boolean r1 = r26.isEmpty()
            if (r1 != 0) goto L_0x0069
            r2 = 0
            boolean r1 = r50.isEmpty()
            r16 = 1
            if (r1 != 0) goto L_0x0029
        L_0x0027:
            r16 = 0
        L_0x0029:
            java.lang.String r30 = ""
            r67 = r30
            if (r2 == 0) goto L_0x05b0
            java.util.ArrayList r20 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r4 = r50.iterator()
        L_0x0037:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x006b
            java.lang.Object r3 = r4.next()
            com.instagram.model.direct.DirectSearchResult r3 = (com.instagram.model.direct.DirectSearchResult) r3
            boolean r1 = r3 instanceof com.instagram.model.direct.DirectShareTarget
            if (r1 == 0) goto L_0x0063
            r2 = r3
            com.instagram.model.direct.DirectShareTarget r2 = (com.instagram.model.direct.DirectShareTarget) r2
            com.instagram.direct.model.thread.DiscoverableThreadInfo r1 = r2.A06
            if (r1 != 0) goto L_0x0037
            int r1 = r2.A01
            boolean r1 = X.AnonymousClass48O.A04(r1)
            if (r1 == 0) goto L_0x0063
            boolean r1 = r2.A0H()
            if (r1 == 0) goto L_0x0037
            java.lang.String r1 = r2.A05()
            if (r1 != 0) goto L_0x0063
            goto L_0x0037
        L_0x0063:
            r1 = r20
            r1.add(r3)
            goto L_0x0037
        L_0x0069:
            r2 = 1
            goto L_0x0027
        L_0x006b:
            if (r70 == 0) goto L_0x006f
            r30 = r26
        L_0x006f:
            java.lang.Object r2 = r0.A05
            boolean r1 = r2 instanceof java.util.HashMap
            r23 = 0
            if (r1 == 0) goto L_0x0589
            java.util.AbstractMap r2 = (java.util.AbstractMap) r2
            if (r2 == 0) goto L_0x0589
            java.lang.String r1 = "reshared_content"
            java.lang.Object r27 = r2.get(r1)
            java.lang.String r1 = "ibc_chats"
            java.lang.Object r28 = r2.get(r1)
            java.lang.String r1 = "ibc_chats_context_lines"
            java.lang.Object r24 = r2.get(r1)
            java.lang.String r1 = "agents"
            java.lang.Object r23 = r2.get(r1)
            java.lang.String r1 = "meta_ai_agent"
            java.lang.Object r1 = r2.get(r1)
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1
            r0.A03 = r1
            java.lang.String r1 = "ai_prompts"
            java.lang.Object r22 = r2.get(r1)
        L_0x00a3:
            java.util.List r5 = r0.A0X
            r5.clear()
            java.lang.Integer r32 = X.AnonymousClass05K.A00
            boolean r1 = r0.A0d
            r21 = r1
            if (r1 == 0) goto L_0x0583
            int r1 = r0.A0L
            r29 = r1
            java.lang.Integer r19 = X.AnonymousClass05K.A0C
        L_0x00b6:
            X.7BY r1 = r0.A0T
            com.google.common.collect.ImmutableList r18 = r1.A01()
            com.instagram.common.session.UserSession r4 = r0.A0Q
            java.lang.String r17 = "direct_user_search_nullstate"
            r2 = r17
            r1 = r20
            X.ON1 r35 = X.F9W.A00(r4, r2, r1)
            r8 = 0
            java.lang.String r34 = "SUGGESTED"
            java.lang.String[] r1 = new java.lang.String[]{r34}
            java.util.List r1 = java.util.Arrays.asList(r1)
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1D(r1)
            X.0Tu r3 = X.0Tu.A05
            r1 = 36603472233370536(0x820aaa000413a8, double:3.211521458511282E-306)
            java.lang.Long r1 = X.AnonymousClass7TF.A0Y(r3, r4, r1)
            int r7 = r1.intValue()
            boolean r1 = r18.isEmpty()
            java.lang.String r38 = "RECENT_SEARCHES"
            if (r1 != 0) goto L_0x00f5
            r1 = r38
            r6.add(r8, r1)
            int r7 = r7 + 1
        L_0x00f5:
            com.instagram.model.direct.DirectShareTarget r1 = r0.A03
            java.lang.String r37 = "NULL_STATE_PROMPTS"
            if (r1 == 0) goto L_0x0128
            r1 = 36320438183272877(0x81093f000021ad, double:3.032529585542881E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x0128
            r1 = 36320438184321466(0x81093f001021ba, double:3.032529586206013E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 != 0) goto L_0x0121
            r1 = r38
            boolean r1 = r6.contains(r1)
            if (r1 == 0) goto L_0x0121
            r1 = r38
            int r1 = r6.indexOf(r1)
            int r8 = r1 + 1
        L_0x0121:
            r1 = r37
            r6.add(r8, r1)
            int r7 = r7 + 1
        L_0x0128:
            boolean r1 = X.AnonymousClass9B8.A0B(r4)
            java.lang.String r15 = "AGENTS"
            if (r1 == 0) goto L_0x0156
            r1 = 2342166367975189612(0x20810be700072c6c, double:4.068433825069959E-152)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x0156
            r1 = r23
            boolean r1 = r1 instanceof java.util.List
            if (r1 == 0) goto L_0x0156
            r1 = r23
            java.util.List r1 = (java.util.List) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0156
            r1 = r34
            int r1 = r6.indexOf(r1)
            r6.add(r1, r15)
            int r7 = r7 + 1
        L_0x0156:
            boolean r1 = r0.A0e
            java.lang.String r43 = "IBC"
            if (r1 == 0) goto L_0x0184
            r1 = r28
            boolean r1 = r1 instanceof java.util.List
            if (r1 == 0) goto L_0x0184
            r1 = r28
            java.util.List r1 = (java.util.List) r1
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0184
            r1 = 36323358761430123(0x810be700062c6b, double:3.0343765709297474E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x017f
            r1 = r34
            int r1 = r6.indexOf(r1)
            int r7 = r1 + 1
        L_0x017f:
            r1 = r43
            r6.add(r7, r1)
        L_0x0184:
            java.lang.String r42 = "RESHARED_CONTENT"
            java.lang.String r41 = "FB_FRIENDS"
            r1 = r41
            r6.add(r1)
            boolean r1 = r6.contains(r15)
            if (r1 == 0) goto L_0x01a4
            r1 = 36323358761561197(0x810be700082c6d, double:3.034376571012639E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x01a4
            r6.remove(r15)
            r6.add(r15)
        L_0x01a4:
            r48 = 0
            r9 = 0
            r10 = 0
            r40 = 0
        L_0x01aa:
            int r2 = r6.size()
            r1 = r40
            if (r1 >= r2) goto L_0x0593
            int r1 = r6.size()
            if (r10 >= r1) goto L_0x0593
            r1 = r40
            java.lang.Object r2 = r6.get(r1)
            java.lang.String r2 = (java.lang.String) r2
            int r1 = r2.hashCode()
            switch(r1) {
                case -1897420567: goto L_0x01ca;
                case -1744402574: goto L_0x022c;
                case -1722808078: goto L_0x02b8;
                case -1192641789: goto L_0x0300;
                case 72266: goto L_0x0333;
                case 386270650: goto L_0x04c5;
                case 1928598030: goto L_0x0520;
                default: goto L_0x01c7;
            }
        L_0x01c7:
            int r40 = r40 + 1
            goto L_0x01aa
        L_0x01ca:
            r1 = r37
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01c7
            r1 = r22
            boolean r1 = r1 instanceof java.util.List
            if (r1 == 0) goto L_0x01c7
            r11 = r22
            java.util.List r11 = (java.util.List) r11
            boolean r1 = r11.isEmpty()
            if (r1 != 0) goto L_0x01c7
            r1 = 36320438184255929(0x81093f000f21b9, double:3.032529586164567E-306)
            boolean r7 = X.182.A06(r3, r4, r1)
            if (r7 == 0) goto L_0x01fa
            java.lang.Integer r14 = X.AnonymousClass05K.A0L
            java.lang.Integer r13 = X.AnonymousClass05K.A0N
            r8 = 0
            X.OuE r7 = new X.OuE
            r7.<init>(r8, r14, r13, r8)
            r5.add(r7)
        L_0x01fa:
            int r13 = r11.size()
            boolean r14 = X.182.A06(r3, r4, r1)
            r1 = 36601913160110453(0x82093f00021175, double:3.2105354943037216E-306)
            long r7 = X.182.A01(r3, r4, r1)
            int r1 = r11.size()
            long r1 = (long) r1
            long r1 = java.lang.Math.min(r7, r1)
            int r7 = (int) r1
            r1 = r25
            java.util.List r2 = r11.subList(r1, r7)
            if (r14 == 0) goto L_0x0226
            X.NPB r1 = new X.NPB
            r1.<init>(r2, r13)
        L_0x0222:
            r5.add(r1)
            goto L_0x01c7
        L_0x0226:
            X.NP5 r1 = new X.NP5
            r1.<init>(r2)
            goto L_0x0222
        L_0x022c:
            r1 = r42
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01c7
            int r39 = r9 + 1
            int r36 = r10 + 1
            java.lang.Integer r7 = X.AnonymousClass05K.A01
            X.NcN r2 = new X.NcN
            r2.<init>(r0, r10, r9)
            r1 = r35
            java.util.ArrayList r13 = r1.A0C
            r1 = r32
            A02(r2, r7, r1, r13, r5)
            r1 = r27
            boolean r1 = r1 instanceof java.lang.String
            if (r1 == 0) goto L_0x029a
            r1 = r27
            java.lang.String r1 = (java.lang.String) r1
            r45 = r1
        L_0x0254:
            X.0iw r1 = r0.A0O
            r44 = r1
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r33 = r13.iterator()
        L_0x0264:
            boolean r1 = r33.hasNext()
            if (r1 == 0) goto L_0x029d
            java.lang.Object r8 = r33.next()
            com.instagram.model.direct.DirectSearchResult r8 = (com.instagram.model.direct.DirectSearchResult) r8
            boolean r1 = r8 instanceof com.instagram.model.direct.DirectSearchResharedContent
            if (r1 == 0) goto L_0x0264
            com.instagram.model.direct.DirectSearchResharedContent r8 = (com.instagram.model.direct.DirectSearchResharedContent) r8
            X.1Xj r1 = r8.A01
            if (r1 == 0) goto L_0x0290
            X.4bN r7 = X.C295375o3.A02(r1)
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Set r1 = r8.A02
            com.google.common.collect.ImmutableSet r1 = com.google.common.collect.ImmutableSet.A03(r1)
            r2.addAll(r1)
            r7.A08 = r2
            r14.add(r7)
        L_0x0290:
            java.util.Set r1 = r8.A02
            com.google.common.collect.ImmutableSet r1 = com.google.common.collect.ImmutableSet.A03(r1)
            r11.add(r1)
            goto L_0x0264
        L_0x029a:
            r45 = r67
            goto L_0x0254
        L_0x029d:
            X.NPF r1 = new X.NPF
            r49 = r1
            r50 = r44
            r51 = r45
            r52 = r13
            r53 = r14
            r54 = r11
            r55 = r48
            r56 = r10
            r57 = r9
            r49.<init>(r50, r51, r52, r53, r54, r55, r56, r57)
            r5.add(r1)
            goto L_0x02fa
        L_0x02b8:
            r1 = r41
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01c7
            int r39 = r9 + 1
            int r36 = r10 + 1
            r1 = r35
            java.util.ArrayList r13 = r1.A03
            int r1 = r13.size()
            if (r1 < r12) goto L_0x02fa
            java.lang.Integer r8 = X.AnonymousClass05K.A0j
            java.lang.Integer r7 = X.AnonymousClass05K.A0N
            r2 = 0
            X.OuE r1 = new X.OuE
            r1.<init>(r2, r8, r7, r2)
            r5.add(r1)
            boolean r1 = r0.A0Z
            if (r1 == 0) goto L_0x02e1
            X.3mS r2 = r0.A0U
        L_0x02e1:
            r47 = 11
            r44 = r4
            r45 = r2
            r46 = r13
            r49 = r10
            r50 = r9
            r51 = r25
            r52 = r25
            r53 = r25
            java.util.ArrayList r1 = X.C48843El5.A00(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            r5.addAll(r1)
        L_0x02fa:
            int r1 = r13.size()
            goto L_0x04bd
        L_0x0300:
            r1 = r34
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01c7
            int r39 = r9 + 1
            int r36 = r10 + 1
            java.lang.Integer r7 = X.AnonymousClass05K.A0Y
            java.lang.Integer r2 = X.AnonymousClass05K.A0N
            r8 = 0
            X.OuE r1 = new X.OuE
            r1.<init>(r8, r7, r2, r8)
            r5.add(r1)
            r1 = r35
            java.util.ArrayList r1 = r1.A0D
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r1)
            r1 = 40
            java.util.List r7 = A00(r2, r1)
            boolean r1 = r0.A0Z
            if (r1 == 0) goto L_0x032d
            X.3mS r8 = r0.A0U
        L_0x032d:
            boolean r2 = r0.A0j
            r47 = 6
            goto L_0x049e
        L_0x0333:
            r1 = r43
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01c7
            java.lang.String r8 = r0.A08
            int r39 = r9 + 1
            int r36 = r10 + 1
            r1 = r28
            boolean r1 = r1 instanceof java.util.List
            if (r1 == 0) goto L_0x04bf
            r7 = r28
            java.util.List r7 = (java.util.List) r7
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x04bf
            r1 = r25
            java.lang.Object r1 = r7.get(r1)
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1
            java.lang.String r1 = r1.A0F
            if (r1 == 0) goto L_0x037d
            boolean r1 = r0.A0B
            if (r1 != 0) goto L_0x037d
            X.OSi r13 = X.C69968Nv8.A00(r4)
            int r11 = r7.size()
            r1 = r25
            java.lang.Object r1 = r7.get(r1)
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1
            java.lang.String r2 = r1.A0F
            X.0qQ.A0B(r2, r12)
            java.lang.String r1 = "channels_rendered"
            X.C70935OSi.A00(r13, r2, r1, r11)
            r0.A0B = r12
        L_0x037d:
            r1 = 36317521901131020(0x810698000a150c, double:3.030685316973445E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x03af
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r11 = r7.iterator()
        L_0x0390:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x03ae
            com.instagram.model.direct.DirectShareTarget r7 = X.DbT.A0f(r11)
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r1 = r7.A04
            if (r1 == 0) goto L_0x03a2
            boolean r1 = r1.A07
            if (r1 == 0) goto L_0x03aa
        L_0x03a2:
            com.instagram.direct.model.thread.DiscoverableThreadInfo r1 = r7.A06
            if (r1 == 0) goto L_0x0390
            boolean r1 = r1.A03
            if (r1 != 0) goto L_0x0390
        L_0x03aa:
            r2.add(r7)
            goto L_0x0390
        L_0x03ae:
            r7 = r2
        L_0x03af:
            com.google.common.collect.ImmutableList$Builder r11 = new com.google.common.collect.ImmutableList$Builder
            r11.<init>()
            r1 = 36317521900672267(0x8106980003150b, double:3.0306853166833275E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x03f4
            java.util.Iterator r13 = r7.iterator()
        L_0x03c3:
            boolean r1 = r13.hasNext()
            if (r1 == 0) goto L_0x03fb
            com.instagram.model.direct.DirectShareTarget r7 = X.DbT.A0f(r13)
            com.instagram.direct.model.thread.CreatorBroadcastThreadInfo r1 = r7.A04
            if (r1 == 0) goto L_0x03ed
            java.lang.String r1 = r1.A03
        L_0x03d3:
            if (r1 == 0) goto L_0x03e9
            com.instagram.user.model.User r2 = X.DbV.A0j(r4, r1)
            if (r2 == 0) goto L_0x03e9
            X.2f1 r1 = X.AnonymousClass2f1.A00(r4)
            boolean r1 = r1.A0Q(r2)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r7.A0C = r1
        L_0x03e9:
            r11.add(r7)
            goto L_0x03c3
        L_0x03ed:
            com.instagram.direct.model.thread.DiscoverableThreadInfo r1 = r7.A06
            if (r1 == 0) goto L_0x03e9
            java.lang.String r1 = r1.A01
            goto L_0x03d3
        L_0x03f4:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r7)
            r11.addAll(r1)
        L_0x03fb:
            com.google.common.collect.ImmutableList r7 = r11.build()
            java.lang.Integer r2 = X.AnonymousClass05K.A15
            X.NcR r1 = new X.NcR
            r49 = r1
            r50 = r7
            r51 = r0
            r52 = r30
            r53 = r8
            r54 = r10
            r55 = r25
            r49.<init>(r50, r51, r52, r53, r54, r55)
            r8 = r32
            A02(r1, r2, r8, r7, r5)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1D(r7)
            r1 = 36603472233239463(0x820aaa000213a7, double:3.211521458428391E-306)
            java.lang.Long r1 = X.AnonymousClass7TF.A0Y(r3, r4, r1)
            int r1 = r1.intValue()
            java.util.List r7 = A00(r7, r1)
            if (r24 != 0) goto L_0x044e
            boolean r1 = r0.A0F
            if (r1 != 0) goto L_0x0499
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r8 = r7.iterator()
        L_0x043c:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L_0x0492
            com.instagram.model.direct.DirectShareTarget r1 = X.DbT.A0f(r8)
            java.lang.String r1 = r1.A08()
            r2.add(r1)
            goto L_0x043c
        L_0x044e:
            java.util.HashMap r8 = X.AnonymousClass7TE.A1E()
            java.util.Iterator r11 = X.C51966G9m.A1H(r24)
        L_0x0456:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0468
            java.lang.Object r2 = r11.next()
            X.BIM r2 = (X.BIM) r2
            java.lang.String r1 = r2.A03
            r8.put(r1, r2)
            goto L_0x0456
        L_0x0468:
            java.util.Iterator r11 = r7.iterator()
        L_0x046c:
            boolean r1 = r11.hasNext()
            if (r1 == 0) goto L_0x0499
            com.instagram.model.direct.DirectShareTarget r2 = X.DbT.A0f(r11)
            java.lang.String r1 = r2.A08()
            java.lang.Object r1 = r8.get(r1)
            if (r1 == 0) goto L_0x048f
            java.lang.String r1 = r2.A08()
            java.lang.Object r1 = r8.get(r1)
            X.BIM r1 = (X.BIM) r1
            java.lang.String r1 = r1.A02
        L_0x048c:
            r2.A0N = r1
            goto L_0x046c
        L_0x048f:
            r1 = r67
            goto L_0x048c
        L_0x0492:
            X.7fy r1 = r0.A04
            if (r1 == 0) goto L_0x0499
            r1.ERO(r2)
        L_0x0499:
            r8 = 0
            boolean r2 = r0.A0k
            r47 = 30
        L_0x049e:
            r1 = 2
            X.0qQ.A0B(r7, r1)
            r44 = r4
            r45 = r8
            r46 = r7
            r49 = r10
            r50 = r9
            r51 = r25
            r52 = r25
            r53 = r2
            java.util.ArrayList r1 = X.C48843El5.A00(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            r5.addAll(r1)
            int r1 = r7.size()
        L_0x04bd:
            int r48 = r48 + r1
        L_0x04bf:
            r9 = r39
            r10 = r36
            goto L_0x01c7
        L_0x04c5:
            r1 = r38
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01c7
            java.lang.String r1 = r0.A08
            int r11 = r9 + 1
            X.NcM r8 = new X.NcM
            r2 = r30
            r8.<init>(r0, r2, r1)
            r1 = 0
            r7 = r19
            r2 = r32
            A02(r8, r2, r7, r1, r5)
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1D(r18)
            boolean r2 = r0.A0Z
            if (r2 == 0) goto L_0x04ea
            X.3mS r1 = r0.A0U
        L_0x04ea:
            int r7 = r18.size()
            r2 = r29
            int r2 = java.lang.Math.min(r2, r7)
            r7 = r25
            java.util.List r51 = r8.subList(r7, r2)
            boolean r2 = r0.A0j
            if (r2 == 0) goto L_0x0502
            r58 = 1
            if (r21 == 0) goto L_0x0504
        L_0x0502:
            r58 = 0
        L_0x0504:
            r52 = 7
            r54 = -1
            r49 = r4
            r50 = r1
            r53 = r7
            r55 = r9
            r56 = r12
            r57 = r21
            java.util.ArrayList r1 = X.C48843El5.A00(r49, r50, r51, r52, r53, r54, r55, r56, r57, r58)
            r5.addAll(r1)
            int r1 = r18.size()
            goto L_0x057c
        L_0x0520:
            boolean r1 = r2.equals(r15)
            if (r1 == 0) goto L_0x01c7
            int r11 = r9 + 1
            r1 = r23
            boolean r1 = r1 instanceof java.util.List
            if (r1 == 0) goto L_0x057e
            r8 = r23
            java.util.List r8 = (java.util.List) r8
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L_0x057e
            java.lang.Integer r7 = X.AnonymousClass05K.A0K
            X.NcL r2 = new X.NcL
            r2.<init>(r0, r8)
            r1 = r32
            A02(r2, r7, r1, r8, r5)
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1D(r8)
            boolean r1 = X.AnonymousClass9B8.A07(r4)
            if (r1 == 0) goto L_0x0581
            r1 = 36601316159656071(0x8208b400021087, double:3.2101579488124426E-306)
            int r1 = X.DbS.A04(r3, r4, r1)
        L_0x0557:
            java.util.List r2 = A00(r7, r1)
            r45 = 0
            r47 = 35
            r49 = -1
            r1 = 2
            X.0qQ.A0B(r2, r1)
            r44 = r4
            r46 = r2
            r50 = r9
            r51 = r25
            r52 = r25
            r53 = r25
            java.util.ArrayList r1 = X.C48843El5.A00(r44, r45, r46, r47, r48, r49, r50, r51, r52, r53)
            r5.addAll(r1)
            int r1 = r2.size()
        L_0x057c:
            int r48 = r48 + r1
        L_0x057e:
            r9 = r11
            goto L_0x01c7
        L_0x0581:
            r1 = 0
            goto L_0x0557
        L_0x0583:
            r19 = r32
            r29 = 3
            goto L_0x00b6
        L_0x0589:
            r28 = r23
            r27 = r23
            r24 = r23
            r22 = r23
            goto L_0x00a3
        L_0x0593:
            r1 = r31
            r1.A01(r5)
            java.lang.String r1 = r0.A09
            if (r1 == 0) goto L_0x0d66
            X.5gJ r5 = X.C290965gI.A00(r4)
            r4 = 77017147(0x497303b, float:3.5544222E-36)
            java.lang.String r3 = r0.A09
            int r2 = r20.size()
            r1 = r17
            r5.A00(r4, r3, r1, r2)
            goto L_0x0d66
        L_0x05b0:
            boolean r1 = r0.A0f
            r24 = r1
            if (r1 != 0) goto L_0x05df
            java.util.ArrayList r4 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r3 = r50.iterator()
        L_0x05be:
            boolean r1 = r3.hasNext()
            if (r1 == 0) goto L_0x05dd
            java.lang.Object r2 = r3.next()
            com.instagram.model.direct.DirectSearchResult r2 = (com.instagram.model.direct.DirectSearchResult) r2
            boolean r1 = r2 instanceof com.instagram.model.direct.DirectShareTarget
            if (r1 == 0) goto L_0x05d9
            r1 = r2
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1
            int r1 = r1.A01
            boolean r1 = X.AnonymousClass48O.A04(r1)
            if (r1 != 0) goto L_0x05be
        L_0x05d9:
            r4.add(r2)
            goto L_0x05be
        L_0x05dd:
            r50 = r4
        L_0x05df:
            com.instagram.common.session.UserSession r2 = r0.A0Q
            X.0Tu r4 = X.0Tu.A05
            r5 = 36317521901393168(0x810698000e1510, double:3.030685317139228E-306)
            boolean r1 = X.182.A06(r4, r2, r5)
            if (r1 == 0) goto L_0x05f3
            boolean r1 = r0.A0D
            r7 = 1
            if (r1 == 0) goto L_0x05f4
        L_0x05f3:
            r7 = 0
        L_0x05f4:
            if (r70 == 0) goto L_0x05f8
            r30 = r26
        L_0x05f8:
            java.lang.Object r3 = r0.A05
            boolean r1 = r3 instanceof java.util.HashMap
            r29 = 0
            if (r1 == 0) goto L_0x067a
            java.util.AbstractMap r3 = (java.util.AbstractMap) r3
            if (r3 == 0) goto L_0x067a
            java.lang.String r1 = "message_content"
            java.lang.Object r59 = r3.get(r1)
            java.lang.String r1 = "reshared_content"
            r3.get(r1)
            java.lang.String r1 = "meta_ai_agent"
            java.lang.Object r1 = r3.get(r1)
            com.instagram.model.direct.DirectShareTarget r1 = (com.instagram.model.direct.DirectShareTarget) r1
            r0.A03 = r1
            java.lang.String r1 = "section_order"
            java.lang.Object r3 = r3.get(r1)
            java.util.List r3 = (java.util.List) r3
        L_0x0621:
            java.util.List r1 = r0.A0Y
            r1.clear()
            boolean r5 = r0.A0h
            if (r5 == 0) goto L_0x067f
            boolean r5 = r0.A0G
            if (r5 != 0) goto L_0x067f
            java.lang.Object r6 = r0.A05
            boolean r5 = r6 instanceof java.util.HashMap
            if (r5 == 0) goto L_0x067f
            java.util.AbstractMap r6 = (java.util.AbstractMap) r6
            java.lang.String r5 = "inform_module"
            java.lang.Object r6 = r6.get(r5)
            if (r6 == 0) goto L_0x067f
            java.util.List r1 = r0.A0W
            r1.clear()
            java.lang.Object r3 = r0.A05
            java.util.AbstractMap r3 = (java.util.AbstractMap) r3
            java.lang.Object r5 = r3.get(r5)
            X.N3M r5 = (X.N3M) r5
            X.Nfp r3 = new X.Nfp
            r3.<init>(r5)
            r1.add(r3)
            java.util.List r4 = r5.A0C
            if (r4 == 0) goto L_0x0d28
            boolean r3 = r4.isEmpty()
            if (r3 != 0) goto L_0x0d28
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r4.iterator()
        L_0x0667:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L_0x0d0b
            com.instagram.user.model.User r4 = X.DbT.A0k(r7)
            com.instagram.model.direct.DirectShareTarget r3 = new com.instagram.model.direct.DirectShareTarget
            r3.<init>((com.instagram.user.model.User) r4)
            r6.add(r3)
            goto L_0x0667
        L_0x067a:
            r3 = r29
            r59 = r3
            goto L_0x0621
        L_0x067f:
            r5 = r25
            r0.A0G = r5
            r5 = 36326515562264369(0x810ec600043731, double:3.036372944488741E-306)
            boolean r17 = X.182.A06(r4, r2, r5)
            boolean r5 = r0.A0g
            r28 = r5
            java.lang.String r49 = "direct_user_search_keypressed"
            X.OVf r47 = X.F9W.A00
            r48 = r2
            r51 = r12
            r52 = r25
            r53 = r12
            r54 = r5
            r55 = r25
            X.ON1 r5 = r47.A01(r48, r49, r50, r51, r52, r53, r54, r55)
            if (r7 == 0) goto L_0x06ca
            java.util.ArrayList r6 = r5.A0D
            java.util.Iterator r7 = r6.iterator()
        L_0x06ac:
            boolean r6 = r7.hasNext()
            if (r6 == 0) goto L_0x06c0
            com.instagram.model.direct.DirectShareTarget r6 = X.DbT.A0f(r7)
            boolean r6 = r6.A0L()
            if (r6 == 0) goto L_0x06ac
            r7.remove()
            goto L_0x06ac
        L_0x06c0:
            java.util.ArrayList r6 = r5.A03
            r6.clear()
            java.util.ArrayList r6 = r5.A04
            r6.clear()
        L_0x06ca:
            java.util.ArrayList r13 = r5.A0D
            r11 = 0
            boolean r6 = r0.A0j
            r65 = r6
            r35 = 6
            r22 = 2
            r6 = r22
            X.0qQ.A0B(r13, r6)
            r32 = r2
            r33 = r29
            r34 = r13
            r36 = r11
            r37 = r11
            r38 = r11
            r39 = r11
            r40 = r11
            r41 = r65
            java.util.ArrayList r6 = X.C48843El5.A00(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r1.addAll(r6)
            int r8 = r1.size()
            if (r17 == 0) goto L_0x074a
            android.content.Context r9 = r0.A0M
            boolean r6 = X.C267044ar.A01(r9, r2)
            if (r6 != 0) goto L_0x074a
            r6 = 36326515562657588(0x810ec6000a3734, double:3.0363729447374146E-306)
            boolean r6 = X.182.A06(r4, r2, r6)
            if (r6 != 0) goto L_0x074a
            r6 = 36326515562002221(0x810ec60000372d, double:3.036372944322958E-306)
            boolean r6 = X.182.A06(r4, r2, r6)
            if (r6 == 0) goto L_0x0cfd
            r6 = 36607990539097746(0x820ec600061692, double:3.2143788532469266E-306)
            int r6 = X.DbS.A04(r4, r2, r6)
            int r6 = r6 + -1
        L_0x0722:
            int r6 = java.lang.Math.min(r8, r6)
            r35 = 2131238154(0x7f081d0a, float:1.8092579E38)
            r7 = 2131964483(0x7f133243, float:1.9565749E38)
            java.lang.String r33 = r9.getString(r7)
            r7 = 2131964482(0x7f133242, float:1.9565747E38)
            java.lang.String r34 = r9.getString(r7)
            r36 = 2131964477(0x7f13323d, float:1.9565737E38)
            com.instagram.direct.inbox.DirectInviteContactViewModel r7 = new com.instagram.direct.inbox.DirectInviteContactViewModel
            r32 = r7
            r37 = r6
            r38 = r6
            r32.<init>(r33, r34, r35, r36, r37, r38, r39, r40)
            r1.add(r6, r7)
            int r8 = r8 + 1
        L_0x074a:
            java.util.ArrayList r7 = r5.A0B
            int r6 = r0.A0J
            r66 = r6
            java.util.List r6 = A00(r7, r6)
            r33 = 32
            r32 = r7
            r34 = r8
            r35 = r11
            r36 = r11
            r37 = r65
            java.util.ArrayList r7 = X.FYR.A00(r32, r33, r34, r35, r36, r37)
            r1.addAll(r7)
            int r7 = X.DbT.A01(r6, r8)
            boolean r23 = X.AnonymousClass7TF.A1R(r7)
            java.lang.String r21 = "DISCOVER"
            r10 = 3
            java.lang.String r20 = "MORE_ON_FB"
            java.lang.String r19 = "MORE_ON_IG"
            java.lang.String r18 = "FB_FRIENDS"
            r6 = 4
            if (r3 == 0) goto L_0x0781
            boolean r8 = r3.isEmpty()
            if (r8 == 0) goto L_0x079e
        L_0x0781:
            r8 = 36317521901589777(0x81069800111511, double:3.0306853172635646E-306)
            boolean r8 = X.182.A06(r4, r2, r8)
            java.lang.String[] r3 = new java.lang.String[r6]
            if (r8 == 0) goto L_0x0cf3
            r3[r25] = r19
            r3[r12] = r21
            r3[r22] = r18
            r3[r10] = r20
        L_0x0796:
            java.util.List r3 = java.util.Arrays.asList(r3)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1D(r3)
        L_0x079e:
            java.lang.String r27 = "IBC"
            if (r24 == 0) goto L_0x07c7
            r8 = r27
            boolean r8 = r3.contains(r8)
            if (r8 != 0) goto L_0x07c7
            r8 = 36598996877446489(0x82069800040d59, double:3.208691225404103E-306)
            java.lang.Long r8 = X.AnonymousClass7TF.A0Y(r4, r2, r8)
            int r9 = r8.intValue()
            int r9 = r9 - r12
            int r8 = r3.size()
            if (r9 <= r8) goto L_0x0cee
            int r9 = r3.size()
        L_0x07c2:
            r8 = r27
            r3.add(r9, r8)
        L_0x07c7:
            boolean r8 = X.AnonymousClass9B8.A0B(r2)
            java.lang.String r32 = "AGENTS"
            if (r8 == 0) goto L_0x07dc
            r8 = r32
            boolean r8 = r3.contains(r8)
            if (r8 != 0) goto L_0x07dc
            r8 = r32
            r3.add(r11, r8)
        L_0x07dc:
            java.lang.String r33 = "MESSAGES"
            r8 = r33
            boolean r8 = r3.contains(r8)
            if (r8 != 0) goto L_0x07eb
            r9 = r33
            r3.add(r11, r9)
        L_0x07eb:
            r8 = 36320438183535023(0x81093f000421af, double:3.032529585708663E-306)
            boolean r8 = X.182.A06(r4, r2, r8)
            java.lang.String r34 = "META_AI_TYPEAHEAD"
            if (r8 == 0) goto L_0x0821
            r8 = r34
            boolean r8 = r3.contains(r8)
            if (r8 != 0) goto L_0x0821
            X.0Tu r14 = X.0Tu.A06
            r8 = 36328091815001015(0x81103500003bb7, double:3.0373697730664565E-306)
            boolean r8 = X.182.A06(r14, r2, r8)
            if (r8 == 0) goto L_0x0811
            boolean r8 = r0.A0H
            if (r8 != 0) goto L_0x0821
        L_0x0811:
            r8 = 36320438183600560(0x81093f000521b0, double:3.032529585750109E-306)
            boolean r8 = X.182.A06(r4, r2, r8)
            if (r8 == 0) goto L_0x0ce7
            r8 = r34
            r3.add(r11, r8)
        L_0x0821:
            X.0Tu r35 = X.0Tu.A06
            r8 = 36328091815001015(0x81103500003bb7, double:3.0373697730664565E-306)
            r14 = r35
            boolean r8 = X.182.A06(r14, r2, r8)
            java.lang.String r38 = "META_AI_SEARCH_SNIPPET"
            if (r8 == 0) goto L_0x0843
            r8 = r38
            boolean r8 = r3.contains(r8)
            if (r8 != 0) goto L_0x0843
            boolean r8 = r0.A0H
            if (r8 == 0) goto L_0x0843
            r9 = r38
            r3.add(r11, r9)
        L_0x0843:
            java.lang.String r39 = "INVITE_CONTACTS"
            if (r17 == 0) goto L_0x088c
            android.content.Context r8 = r0.A0M
            boolean r8 = X.C267044ar.A01(r8, r2)
            if (r8 == 0) goto L_0x088c
            java.util.ArrayList r8 = r5.A07
            int r8 = r8.size()
            if (r8 <= 0) goto L_0x088c
            r8 = r39
            boolean r8 = r3.contains(r8)
            if (r8 != 0) goto L_0x088c
            r8 = 36326515562133295(0x810ec60002372f, double:3.0363729444058496E-306)
            boolean r8 = X.182.A06(r4, r2, r8)
            if (r8 != 0) goto L_0x0887
            r8 = 36326515562198832(0x810ec600033730, double:3.0363729444472954E-306)
            boolean r8 = X.182.A06(r4, r2, r8)
            if (r8 == 0) goto L_0x088c
            r8 = r32
            int r9 = r3.indexOf(r8)
            r8 = r34
            int r8 = r3.indexOf(r8)
            int r8 = java.lang.Math.max(r9, r8)
            int r11 = r8 + 1
        L_0x0887:
            r8 = r39
            r3.add(r11, r8)
        L_0x088c:
            int r8 = r13.size()
            boolean r13 = X.AnonymousClass7TF.A1R(r8)
            boolean r8 = r0.A0i
            if (r8 == 0) goto L_0x08e1
            X.NkX r9 = r5.A00
            X.NkX r8 = X.C69393NkX.META_AI
            if (r9 == r8) goto L_0x08ad
            java.lang.String r11 = "\\s+"
            r8 = r30
            java.lang.String[] r8 = r8.split(r11)
            int r8 = r8.length
            if (r8 < r6) goto L_0x0ce4
            X.NkX r8 = X.C69393NkX.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            if (r9 != r8) goto L_0x0ce4
        L_0x08ad:
            r11 = 1
        L_0x08ae:
            boolean r8 = r0.A0D
            if (r8 == 0) goto L_0x08c0
            r8 = 36320438185435592(0x81093f002121c8, double:3.0325295869105905E-306)
            boolean r8 = X.182.A06(r4, r2, r8)
            if (r8 == 0) goto L_0x08c0
            r8 = r13 ^ 1
            r11 = r11 | r8
        L_0x08c0:
            com.instagram.ui.widget.search.SearchController r9 = r0.A0V
            X.OIK r13 = r9.mViewHolder
            boolean r8 = r9.A05
            if (r8 == r11) goto L_0x08e1
            if (r13 == 0) goto L_0x08e1
            r9.A05 = r11
            com.instagram.ui.widget.searchedittext.SearchEditText r8 = r13.A0F
            if (r11 == 0) goto L_0x0cda
            r8.setImeOptions(r6)
            com.instagram.ui.widget.searchedittext.SearchEditText r6 = r13.A0F
            r6.setInputType(r12)
            X.OyY r8 = r9.A0F
            if (r8 == 0) goto L_0x08e1
            r6 = r22
            r8.A05(r6)
        L_0x08e1:
            r6 = 0
        L_0x08e2:
            int r8 = r3.size()
            if (r6 >= r8) goto L_0x0d48
            int r9 = r3.size()
            r8 = r23
            if (r8 >= r9) goto L_0x0d48
            java.lang.String r9 = X.AnonymousClass7TE.A19(r3, r6)
            int r8 = r9.hashCode()
            switch(r8) {
                case -2015381303: goto L_0x08fe;
                case -1722808078: goto L_0x0958;
                case 72266: goto L_0x0a12;
                case 320532812: goto L_0x09b4;
                case 899663523: goto L_0x0a87;
                case 1024304970: goto L_0x0ab8;
                case 1055811561: goto L_0x0b13;
                case 1778263474: goto L_0x0b6e;
                case 1778263572: goto L_0x0bc2;
                case 1928598030: goto L_0x0c80;
                default: goto L_0x08fb;
            }
        L_0x08fb:
            int r6 = r6 + 1
            goto L_0x08e2
        L_0x08fe:
            r8 = r39
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x08fb
            int r47 = r6 + 1
            int r15 = r23 + 1
            java.lang.Integer r11 = X.AnonymousClass05K.A09
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            X.EKF r9 = new X.EKF
            r9.<init>(r0, r12)
            r8 = r29
            A02(r9, r11, r10, r8, r1)
            java.util.ArrayList r9 = r5.A07
            r8 = 0
        L_0x091b:
            int r10 = r9.size()
            if (r8 >= r10) goto L_0x0952
            r43 = 2131238154(0x7f081d0a, float:1.8092579E38)
            java.lang.Object r10 = r9.get(r8)
            com.instagram.model.direct.DirectShareTarget r10 = (com.instagram.model.direct.DirectShareTarget) r10
            java.lang.String r11 = r10.A0I
            if (r11 != 0) goto L_0x0930
            r11 = r67
        L_0x0930:
            java.lang.Object r10 = r9.get(r8)
            com.instagram.model.direct.DirectShareTarget r10 = (com.instagram.model.direct.DirectShareTarget) r10
            java.lang.String r13 = r10.A0K
            r44 = 2131964477(0x7f13323d, float:1.9565737E38)
            int r45 = r7 + r8
            com.instagram.direct.inbox.DirectInviteContactViewModel r10 = new com.instagram.direct.inbox.DirectInviteContactViewModel
            r40 = r10
            r41 = r11
            r42 = r13
            r46 = r8
            r48 = r23
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48)
            r1.add(r10)
            int r8 = r8 + 1
            goto L_0x091b
        L_0x0952:
            int r8 = r9.size()
            goto L_0x0bbb
        L_0x0958:
            r8 = r18
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x08fb
            java.util.ArrayList r11 = r5.A03
            int r8 = r11.size()
            if (r8 < r12) goto L_0x08fb
            java.lang.String r13 = r0.A08
            int r46 = r6 + 1
            int r14 = r23 + 1
            java.lang.Integer r10 = X.AnonymousClass05K.A0j
            boolean r8 = r0.A0b
            if (r8 == 0) goto L_0x09af
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            X.NcR r8 = new X.NcR
            r51 = r8
            r52 = r5
            r53 = r0
            r54 = r30
            r55 = r13
            r56 = r23
            r57 = r12
            r51.<init>(r52, r53, r54, r55, r56, r57)
        L_0x0989:
            A02(r8, r10, r9, r11, r1)
            r8 = r66
            java.util.List r8 = A00(r11, r8)
            r43 = 11
            r9 = r22
            X.0qQ.A0B(r8, r9)
            r40 = r2
            r41 = r29
            r42 = r8
            r44 = r7
            r45 = r23
            r47 = r25
            r48 = r25
            r49 = r25
            java.util.ArrayList r9 = X.C48843El5.A00(r40, r41, r42, r43, r44, r45, r46, r47, r48, r49)
            goto L_0x0a76
        L_0x09af:
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
            r8 = r29
            goto L_0x0989
        L_0x09b4:
            r8 = r33
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x08fb
            java.util.ArrayList r10 = r5.A08
            boolean r8 = r0.A0c
            if (r8 == 0) goto L_0x08fb
            int r8 = r10.size()
            if (r8 < r12) goto L_0x08fb
            int r44 = r6 + 1
            int r14 = r23 + 1
            java.lang.Integer r11 = X.AnonymousClass05K.A06
            boolean r8 = r0.A0b
            if (r8 == 0) goto L_0x0a0e
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            X.NcP r8 = new X.NcP
            r57 = r8
            r58 = r0
            r60 = r30
            r61 = r10
            r62 = r23
            r57.<init>(r58, r59, r60, r61, r62)
        L_0x09e3:
            A02(r8, r11, r9, r10, r1)
            int r8 = r0.A0K
            java.util.List r8 = A00(r10, r8)
            r11 = 0
        L_0x09ed:
            int r9 = r8.size()
            if (r11 >= r9) goto L_0x0a79
            java.lang.Object r10 = r8.get(r11)
            com.instagram.model.direct.DirectSearchResult r10 = (com.instagram.model.direct.DirectSearchResult) r10
            int r42 = r7 + r11
            X.Ou5 r9 = new X.Ou5
            r40 = r9
            r41 = r10
            r43 = r11
            r45 = r23
            r40.<init>(r41, r42, r43, r44, r45)
            r1.add(r9)
            int r11 = r11 + 1
            goto L_0x09ed
        L_0x0a0e:
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
            r8 = 0
            goto L_0x09e3
        L_0x0a12:
            r8 = r27
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x08fb
            java.util.ArrayList r10 = r5.A02
            if (r24 == 0) goto L_0x08fb
            int r8 = r10.size()
            if (r8 < r12) goto L_0x08fb
            java.lang.String r11 = r0.A08
            int r48 = r6 + 1
            int r14 = r23 + 1
            r8 = 36328508427091329(0x81109600043d81, double:3.0376332402299333E-306)
            boolean r8 = X.182.A06(r4, r2, r8)
            if (r8 == 0) goto L_0x0a84
            java.lang.Integer r13 = X.AnonymousClass05K.A1F
        L_0x0a37:
            boolean r8 = r0.A0b
            if (r8 == 0) goto L_0x0a81
            java.lang.Integer r9 = X.AnonymousClass05K.A00
        L_0x0a3d:
            X.NcS r8 = new X.NcS
            r40 = r8
            r41 = r0
            r42 = r5
            r43 = r13
            r44 = r30
            r45 = r11
            r46 = r23
            r47 = r12
            r40.<init>(r41, r42, r43, r44, r45, r46, r47)
            A02(r8, r13, r9, r10, r1)
            r8 = 36601891686781296(0x82093a00191170, double:3.2105219144838966E-306)
            java.lang.Long r8 = X.AnonymousClass7TF.A0Y(r4, r2, r8)
            int r8 = r8.intValue()
            java.util.List r8 = A00(r10, r8)
            r45 = 30
            boolean r9 = r0.A0k
            r44 = r8
            r46 = r7
            r47 = r23
            r49 = r9
            java.util.ArrayList r9 = X.FYR.A00(r44, r45, r46, r47, r48, r49)
        L_0x0a76:
            r1.addAll(r9)
        L_0x0a79:
            int r7 = X.DbT.A01(r8, r7)
            r23 = r14
            goto L_0x08fb
        L_0x0a81:
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
            goto L_0x0a3d
        L_0x0a84:
            java.lang.Integer r13 = X.AnonymousClass05K.A15
            goto L_0x0a37
        L_0x0a87:
            r8 = r38
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x08fb
            int r8 = r6 + 1
            X.NPE r10 = r0.A01
            if (r10 == 0) goto L_0x08fb
            long r8 = (long) r8
            r10.A00 = r8
            java.lang.Integer r11 = X.AnonymousClass05K.A0M
            java.lang.Integer r10 = X.AnonymousClass05K.A0N
            X.NcT r9 = new X.NcT
            r8 = r30
            r9.<init>(r0, r8)
            X.OuE r13 = new X.OuE
            r8 = r29
            r13.<init>(r9, r11, r10, r8)
            r0.A02 = r13
            r1.add(r13)
            X.NPE r8 = r0.A01
            r1.add(r8)
            int r7 = r7 + 1
            goto L_0x08fb
        L_0x0ab8:
            r8 = r34
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x08fb
            java.util.ArrayList r11 = r5.A09
            int r8 = r11.size()
            if (r8 < r12) goto L_0x08fb
            r8 = 36328091815001015(0x81103500003bb7, double:3.0373697730664565E-306)
            r10 = r35
            boolean r8 = X.182.A06(r10, r2, r8)
            if (r8 == 0) goto L_0x0ad9
            boolean r8 = r0.A0H
            if (r8 != 0) goto L_0x08fb
        L_0x0ad9:
            X.OuE r8 = r0.A02
            if (r8 != 0) goto L_0x08fb
            int r37 = r6 + 1
            java.lang.Integer r10 = X.AnonymousClass05K.A0L
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
            r8 = r29
            A02(r8, r10, r9, r11, r1)
            java.util.ArrayList r14 = X.AnonymousClass7TE.A1C()
            int r36 = r11.size()
            r13 = 0
        L_0x0af1:
            r8 = r36
            if (r13 >= r8) goto L_0x0b0a
            java.lang.Object r10 = r11.get(r13)
            com.instagram.model.direct.DirectSearchPrompt r10 = (com.instagram.model.direct.DirectSearchPrompt) r10
            int r15 = r7 + r13
            X.FYH r9 = new X.FYH
            r8 = r37
            r9.<init>(r10, r15, r13, r8)
            r14.add(r9)
            int r13 = r13 + 1
            goto L_0x0af1
        L_0x0b0a:
            r1.addAll(r14)
            int r8 = r11.size()
            goto L_0x0cd1
        L_0x0b13:
            r8 = r21
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x08fb
            java.util.ArrayList r10 = r5.A05
            int r8 = r10.size()
            if (r8 < r12) goto L_0x08fb
            java.lang.String r11 = r0.A08
            int r48 = r6 + 1
            int r15 = r23 + 1
            r8 = 36328508427091329(0x81109600043d81, double:3.0376332402299333E-306)
            boolean r8 = X.182.A06(r4, r2, r8)
            if (r8 == 0) goto L_0x0b6b
            java.lang.Integer r13 = X.AnonymousClass05K.A08
        L_0x0b36:
            boolean r8 = r0.A0b
            if (r8 == 0) goto L_0x0b67
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            X.NcS r8 = new X.NcS
            r40 = r8
            r41 = r0
            r42 = r5
            r43 = r13
            r44 = r30
            r45 = r11
            r46 = r23
            r47 = r25
            r40.<init>(r41, r42, r43, r44, r45, r46, r47)
        L_0x0b51:
            A02(r8, r13, r9, r10, r1)
            r8 = r66
            java.util.List r44 = A00(r10, r8)
            r45 = 21
            r46 = r7
            r47 = r23
            r49 = r65
            java.util.ArrayList r8 = X.FYR.A00(r44, r45, r46, r47, r48, r49)
            goto L_0x0bb4
        L_0x0b67:
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
            r8 = 0
            goto L_0x0b51
        L_0x0b6b:
            java.lang.Integer r13 = X.AnonymousClass05K.A04
            goto L_0x0b36
        L_0x0b6e:
            r8 = r20
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x08fb
            java.util.ArrayList r11 = r5.A04
            int r8 = r11.size()
            if (r8 < r12) goto L_0x08fb
            java.lang.String r13 = r0.A08
            int r48 = r6 + 1
            int r15 = r23 + 1
            java.lang.Integer r10 = X.AnonymousClass05K.A03
            boolean r8 = r0.A0b
            if (r8 == 0) goto L_0x0bbe
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            X.NcR r8 = new X.NcR
            r40 = r8
            r41 = r5
            r42 = r0
            r43 = r30
            r44 = r13
            r45 = r23
            r46 = r22
            r40.<init>(r41, r42, r43, r44, r45, r46)
        L_0x0b9f:
            A02(r8, r10, r9, r11, r1)
            r8 = r66
            java.util.List r44 = A00(r11, r8)
            r45 = 13
            r46 = r7
            r47 = r23
            r49 = r25
            java.util.ArrayList r8 = X.FYR.A00(r44, r45, r46, r47, r48, r49)
        L_0x0bb4:
            r1.addAll(r8)
            int r8 = r44.size()
        L_0x0bbb:
            int r7 = r7 + r8
            goto L_0x0c76
        L_0x0bbe:
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
            r8 = 0
            goto L_0x0b9f
        L_0x0bc2:
            r8 = r19
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x08fb
            if (r17 == 0) goto L_0x0be0
            android.content.Context r8 = r0.A0M
            boolean r8 = X.C267044ar.A01(r8, r2)
            if (r8 != 0) goto L_0x0be0
            r8 = 36326515562657588(0x810ec6000a3734, double:3.0363729447374146E-306)
            boolean r8 = X.182.A06(r4, r2, r8)
            r14 = 1
            if (r8 != 0) goto L_0x0be1
        L_0x0be0:
            r14 = 0
        L_0x0be1:
            java.util.ArrayList r11 = r5.A06
            int r8 = r11.size()
            if (r8 >= r12) goto L_0x0beb
            if (r14 == 0) goto L_0x08fb
        L_0x0beb:
            java.lang.String r13 = r0.A08
            int r47 = r6 + 1
            int r15 = r23 + 1
            r61 = 12
            r57 = 16
            if (r28 == 0) goto L_0x0bfb
            r61 = 23
            r57 = 24
        L_0x0bfb:
            java.lang.Integer r10 = X.AnonymousClass05K.A1I
            r8 = 36328508427091329(0x81109600043d81, double:3.0376332402299333E-306)
            boolean r8 = X.182.A06(r4, r2, r8)
            if (r8 == 0) goto L_0x0c0a
            java.lang.Integer r10 = X.AnonymousClass05K.A07
        L_0x0c0a:
            r8 = 36328508427222402(0x81109600063d82, double:3.0376332403128244E-306)
            boolean r8 = X.182.A06(r4, r2, r8)
            if (r8 == 0) goto L_0x0c17
            java.lang.Integer r10 = X.AnonymousClass05K.A02
        L_0x0c17:
            boolean r8 = r0.A0b
            if (r8 == 0) goto L_0x0c7c
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            X.NcQ r8 = new X.NcQ
            r51 = r8
            r52 = r0
            r53 = r5
            r54 = r10
            r55 = r30
            r56 = r13
            r58 = r23
            r51.<init>(r52, r53, r54, r55, r56, r57, r58)
        L_0x0c30:
            A02(r8, r10, r9, r11, r1)
            r8 = r66
            java.util.List r10 = A00(r11, r8)
            if (r14 == 0) goto L_0x0c7a
            r43 = 2131238154(0x7f081d0a, float:1.8092579E38)
            android.content.Context r9 = r0.A0M
            r8 = 2131964483(0x7f133243, float:1.9565749E38)
            java.lang.String r41 = r9.getString(r8)
            r8 = 2131964482(0x7f133242, float:1.9565747E38)
            java.lang.String r42 = r9.getString(r8)
            r44 = 2131964477(0x7f13323d, float:1.9565737E38)
            int r9 = r7 + 1
            com.instagram.direct.inbox.DirectInviteContactViewModel r8 = new com.instagram.direct.inbox.DirectInviteContactViewModel
            r40 = r8
            r45 = r7
            r46 = r25
            r48 = r23
            r40.<init>(r41, r42, r43, r44, r45, r46, r47, r48)
            r1.add(r8)
        L_0x0c63:
            r60 = r10
            r62 = r9
            r63 = r23
            r64 = r47
            java.util.ArrayList r7 = X.FYR.A00(r60, r61, r62, r63, r64, r65)
            r1.addAll(r7)
            int r7 = X.DbT.A01(r10, r9)
        L_0x0c76:
            r23 = r15
            goto L_0x08fb
        L_0x0c7a:
            r9 = r7
            goto L_0x0c63
        L_0x0c7c:
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
            r8 = 0
            goto L_0x0c30
        L_0x0c80:
            r8 = r32
            boolean r8 = r9.equals(r8)
            if (r8 == 0) goto L_0x08fb
            java.util.ArrayList r10 = r5.A01
            boolean r8 = r0.A0a
            if (r8 == 0) goto L_0x08fb
            int r8 = r10.size()
            if (r8 < r12) goto L_0x08fb
            java.lang.String r14 = r0.A08
            int r44 = r6 + 1
            java.lang.Integer r13 = X.AnonymousClass05K.A0K
            boolean r8 = r0.A0b
            if (r8 == 0) goto L_0x0cd6
            java.lang.Integer r11 = X.AnonymousClass05K.A00
            X.NcO r9 = new X.NcO
            r8 = r30
            r9.<init>(r0, r5, r8, r14)
        L_0x0ca7:
            A02(r9, r13, r11, r10, r1)
            boolean r8 = X.AnonymousClass9B8.A07(r2)
            if (r8 == 0) goto L_0x0cd4
            r8 = 36601316159852681(0x8208b400051089, double:3.2101579489367795E-306)
            long r8 = X.182.A01(r4, r2, r8)
            int r11 = (int) r8
        L_0x0cba:
            java.util.List r40 = A00(r10, r11)
            r41 = 35
            r43 = -1
            r42 = r7
            r45 = r25
            java.util.ArrayList r8 = X.FYR.A00(r40, r41, r42, r43, r44, r45)
            r1.addAll(r8)
            int r8 = r40.size()
        L_0x0cd1:
            int r7 = r7 + r8
            goto L_0x08fb
        L_0x0cd4:
            r11 = 0
            goto L_0x0cba
        L_0x0cd6:
            java.lang.Integer r11 = X.AnonymousClass05K.A0N
            r9 = 0
            goto L_0x0ca7
        L_0x0cda:
            r8.setImeOptions(r10)
            com.instagram.ui.widget.searchedittext.SearchEditText r6 = r13.A0F
            r6.setInputType(r12)
            goto L_0x08e1
        L_0x0ce4:
            r11 = 0
            goto L_0x08ae
        L_0x0ce7:
            r8 = r34
            r3.add(r12, r8)
            goto L_0x0821
        L_0x0cee:
            if (r9 >= 0) goto L_0x07c2
            r9 = 0
            goto L_0x07c2
        L_0x0cf3:
            r3[r25] = r18
            r3[r12] = r19
            r3[r22] = r20
            r3[r10] = r21
            goto L_0x0796
        L_0x0cfd:
            r6 = 36326515562067758(0x810ec60001372e, double:3.036372944364404E-306)
            boolean r6 = X.182.A06(r4, r2, r6)
            if (r6 == 0) goto L_0x074a
            r6 = r8
            goto L_0x0722
        L_0x0d0b:
            boolean r3 = r0.A0j
            r35 = 6
            r32 = r2
            r33 = r29
            r34 = r6
            r36 = r25
            r37 = r25
            r38 = r25
            r39 = r25
            r40 = r25
            r41 = r3
            java.util.ArrayList r2 = X.C48843El5.A00(r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r1.addAll(r2)
        L_0x0d28:
            java.lang.Integer r2 = r5.A01
            if (r2 == 0) goto L_0x0d48
            int r2 = r2.intValue()
            if (r2 != r12) goto L_0x0d48
            X.Mfz r2 = new X.Mfz
            r2.<init>()
            r2.A0H = r12
            X.Mg0 r4 = new X.Mg0
            r4.<init>(r2)
            X.Otu r3 = new X.Otu
            r2 = r30
            r3.<init>(r4, r2)
            r1.add(r3)
        L_0x0d48:
            r2 = r31
            r2.A01(r1)
            X.OKM r2 = r0.A0I
            if (r2 == 0) goto L_0x0d66
            boolean r4 = r0.A0D
            int r3 = r50.size()
            java.lang.Integer r1 = r2.A00
            if (r1 == 0) goto L_0x0d66
            com.facebook.messaging.analytics.search.universal.qpllatency.QPLSearchLatencyLoggingJni r2 = r2.A01
            int r1 = r1.intValue()
            if (r4 != 0) goto L_0x0e3d
            r2.cacheQueryRender(r1, r3)
        L_0x0d66:
            boolean r1 = r0.A0E
            if (r1 == 0) goto L_0x0d87
            java.util.List r1 = r0.A0W
            r1.clear()
            java.lang.String r4 = r0.A0n
        L_0x0d71:
            int r3 = r0.A0l
            boolean r1 = r0.A0E
            X.EGc r2 = new X.EGc
            r2.<init>(r4, r3, r1)
        L_0x0d7a:
            r1 = r31
            r1.A00(r2)
        L_0x0d7f:
            X.2Fj r1 = r0.A0m
            r0 = r31
            r1.A0A(r0)
            return
        L_0x0d87:
            boolean r1 = r0.A0C
            if (r1 == 0) goto L_0x0dea
            boolean r1 = r0.A0o
            if (r1 == 0) goto L_0x0dda
            if (r16 == 0) goto L_0x0dda
            android.content.Context r2 = r0.A0M
            boolean r1 = X.C61970qY.A0F(r2)
            r5 = r1 ^ 1
            if (r5 == 0) goto L_0x0dc8
            r1 = 2131968398(0x7f13418e, float:1.957369E38)
            java.lang.String r4 = r2.getString(r1)
            r1 = 2131968400(0x7f134190, float:1.9573694E38)
            java.lang.String r3 = r2.getString(r1)
            r1 = 2131237637(0x7f081b05, float:1.809153E38)
        L_0x0dac:
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r1)
            X.NPC r2 = new X.NPC
            r2.<init>(r1, r4, r3, r12)
            r1 = r31
            r1.A00(r2)
            X.OyY r1 = r0.A0R
            r2 = 3
            if (r5 == 0) goto L_0x0dc0
            r2 = 2
        L_0x0dc0:
            X.OO3 r1 = r1.A01
            if (r1 == 0) goto L_0x0d7f
            r1.A01(r2)
            goto L_0x0d7f
        L_0x0dc8:
            r1 = 2131974095(0x7f1357cf, float:1.9585244E38)
            java.lang.String r4 = r2.getString(r1)
            r1 = 2131974096(0x7f1357d0, float:1.9585246E38)
            java.lang.String r3 = r2.getString(r1)
            r1 = 2131237636(0x7f081b04, float:1.8091528E38)
            goto L_0x0dac
        L_0x0dda:
            android.content.Context r1 = r0.A0M
            android.content.res.Resources r3 = r1.getResources()
            r2 = 2131972817(0x7f1352d1, float:1.9582652E38)
            r1 = r26
            java.lang.String r4 = X.AnonymousClass7TF.A0e(r3, r1, r2)
            goto L_0x0d71
        L_0x0dea:
            if (r16 == 0) goto L_0x0d7f
            boolean r1 = r0.A0h
            if (r1 == 0) goto L_0x0e00
            java.lang.Object r2 = r0.A05
            boolean r1 = r2 instanceof java.util.HashMap
            if (r1 == 0) goto L_0x0d7f
            java.util.AbstractMap r2 = (java.util.AbstractMap) r2
            java.lang.String r1 = "inform_module"
            java.lang.Object r1 = r2.get(r1)
            if (r1 != 0) goto L_0x0d7f
        L_0x0e00:
            boolean r3 = r0.A0o
            android.content.Context r2 = r0.A0M
            r1 = 2131968420(0x7f1341a4, float:1.9573734E38)
            if (r3 == 0) goto L_0x0e32
            java.lang.String r5 = r2.getString(r1)
            r1 = 2131968422(0x7f1341a6, float:1.9573738E38)
            java.lang.String r4 = r2.getString(r1)
            r1 = 2131237638(0x7f081b06, float:1.8091532E38)
            android.graphics.drawable.Drawable r3 = r2.getDrawable(r1)
            X.NPC r2 = new X.NPC
            r1 = r25
            r2.<init>(r3, r5, r4, r1)
            r1 = r31
            r1.A00(r2)
            X.OyY r1 = r0.A0R
            X.OO3 r1 = r1.A01
            if (r1 == 0) goto L_0x0d7f
            r1.A01(r12)
            goto L_0x0d7f
        L_0x0e32:
            java.lang.String r1 = r2.getString(r1)
            X.EGY r2 = new X.EGY
            r2.<init>(r1)
            goto L_0x0d7a
        L_0x0e3d:
            r2.networkQueryRender(r1, r3)
            goto L_0x0d66
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72918PPc.A03(java.util.List, java.lang.String):void");
    }

    public final void Dam(C337257fy r4) {
        this.A04 = r4;
        this.A08 = r4.BnF();
        String Amq = r4.Amq();
        this.A06 = Amq;
        this.A05 = r4.B3J();
        this.A06 = Amq;
        this.A0A = r4.Bqo();
        this.A0F = r4.CYL();
        this.A0D = r4.CWX();
        this.A0E = r4.isLoading();
        this.A0C = r4.CT5();
        A03((List) r4.Bo1(), r4.BiY());
    }

    public C72918PPc(Context context, AnonymousClass4DH r7, AnonymousClass2t9 r8, UserSession userSession, C72208OyY oyY, DirectSearchInboxFragment directSearchInboxFragment, SearchController searchController, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AnonymousClass2Fj r3 = new AnonymousClass2Fj();
        this.A0m = r3;
        this.A0G = false;
        this.A0B = false;
        this.A0P = r8;
        this.A0N = r7;
        this.A0M = context;
        this.A0Q = userSession;
        this.A0V = searchController;
        this.A0l = context.getColor(R.color.grey_5);
        this.A0n = context.getString(2131972868);
        this.A0S = directSearchInboxFragment;
        this.A0R = oyY;
        this.A0o = z;
        this.A0c = z2;
        this.A0e = z4;
        this.A0f = z5;
        this.A0g = z3;
        0Tu r2 = 0Tu.A05;
        this.A0K = AnonymousClass7TF.A0Y(r2, userSession, 36596286753278339L).intValue();
        this.A0j = 182.A06(r2, userSession, 36320416709026194L);
        this.A0k = 182.A06(r2, userSession, 36320416708895120L);
        this.A0Z = 182.A06(r2, userSession, 36317521902507286L);
        this.A0a = AnonymousClass9B8.A0B(userSession);
        this.A0h = 182.A06(r2, userSession, 36320416708698510L);
        this.A0i = 182.A06(r2, userSession, 36320438184190392L);
        182.A06(r2, userSession, 36320438185304518L);
        this.A0b = 182.A06(r2, userSession, 36328508427025792L);
        this.A0J = DbS.A04(r2, userSession, 36609983403857866L);
        this.A0T = AnonymousClass7BY.A00(userSession);
        this.A0L = DbS.A04(r2, userSession, 36601891686715759L);
        this.A0d = 182.A06(r2, userSession, 36320416708764047L);
        this.A0O = new C71851Ors();
        this.A0U = C251033mS.A00(userSession);
        r3.A06(directSearchInboxFragment.getViewLifecycleOwner(), new C50139FQw(this, 18));
        if (182.A06(r2, userSession, 36320416708632973L)) {
            this.A0I = C69969Nv9.A00(userSession);
        }
    }

    public static List A00(ArrayList arrayList, int i) {
        return arrayList.subList(0, Math.min(i, arrayList.size()));
    }
}
