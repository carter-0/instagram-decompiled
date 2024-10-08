package X;

import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.8Mp  reason: invalid class name and case insensitive filesystem */
public final class C354588Mp extends 2YL {
    public int A00;
    public List A01 = 0sn.A00;
    public boolean A02;
    public final int A03;
    public final UserSession A04;
    public final C310376au A05;
    public final List A06 = 0sr.A1M(new 0eP[]{new 0eP((Object) null, (Object) null)});
    public final C249513ju A07;
    public final AnonymousClass0r6 A08;
    public final boolean A09;

    public /* synthetic */ C354588Mp(UserSession userSession, boolean z, int i) {
        C310376au r1 = new C310376au(userSession);
        0qQ.A0B(userSession, 3);
        this.A09 = z;
        this.A03 = i;
        this.A04 = userSession;
        this.A05 = r1;
        1HR r0 = new 1HR(0);
        this.A07 = r0;
        this.A08 = 0u9.A04(r0);
    }

    public final 0eP A00() {
        0eP r1;
        int i = this.A00;
        List list = this.A06;
        if (i >= list.size() || (r1 = (0eP) 00k.A0O(list, this.A00)) == null) {
            return new 0eP(C62477KgS.USER_INITIAL, (Object) null);
        }
        return r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        if (r5.isEmpty() != false) goto L_0x001b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(java.util.List r19) {
        /*
            r18 = this;
            r4 = r18
            java.util.List r3 = r4.A06
            r3.clear()
            r10 = 0
            X.0eP r0 = new X.0eP
            r0.<init>(r10, r10)
            r3.add(r0)
            r5 = r19
            if (r19 == 0) goto L_0x001b
            boolean r1 = r5.isEmpty()
            r0 = 0
            if (r1 == 0) goto L_0x001c
        L_0x001b:
            r0 = 1
        L_0x001c:
            r0 = r0 ^ 1
            r4.A02 = r0
            r2 = 10
            if (r19 == 0) goto L_0x009e
            int r0 = X.0Yv.A1E(r5, r2)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>(r0)
            java.util.Iterator r7 = r5.iterator()
        L_0x0031:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r9 = r7.next()
            com.instagram.api.schemas.StoryTemplateDict r9 = (com.instagram.api.schemas.StoryTemplateDict) r9
            boolean r14 = r4.A09
            int r13 = r4.A03
            r15 = 0
            X.82n r8 = new X.82n
            r11 = r10
            r12 = r10
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            java.util.List r5 = r8.A03
            int r0 = X.0Yv.A1E(r5, r2)
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r0)
            java.util.Iterator r5 = r5.iterator()
        L_0x0058:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x0075
            java.lang.Object r12 = r5.next()
            X.A7h r12 = (X.C39741A7h) r12
            X.50v r13 = r12.A06
            r17 = 1
            r16 = 12
            X.Jvv r11 = new X.Jvv
            r14 = r10
            r15 = r10
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r6.add(r11)
            goto L_0x0058
        L_0x0075:
            r1.add(r6)
            goto L_0x0031
        L_0x0079:
            int r0 = X.0Yv.A1E(r1, r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>(r0)
            java.util.Iterator r4 = r1.iterator()
        L_0x0086:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x009b
            java.lang.Object r2 = r4.next()
            X.KgS r1 = X.C62477KgS.SUGGESTED
            X.0eP r0 = new X.0eP
            r0.<init>(r1, r2)
            r5.add(r0)
            goto L_0x0086
        L_0x009b:
            r3.addAll(r5)
        L_0x009e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C354588Mp.A01(java.util.List):void");
    }
}
