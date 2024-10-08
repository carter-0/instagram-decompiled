package com.instagram.quicksnap.data.repository;

import X.00k;
import X.02z;
import X.05G;
import X.0qQ;
import X.0sP;
import X.0sn;
import X.106;
import X.10b;
import X.19E;
import X.AnonymousClass0Ud;
import X.AnonymousClass0t1;
import X.AnonymousClass12T;
import X.AnonymousClass19G;
import X.AnonymousClass3ZA;
import X.C252733pa;
import X.C262204Co;
import X.C359068bx;
import X.C359098c0;
import X.C359108c1;
import X.C53401GnY;
import com.instagram.common.session.UserSession;
import com.instagram.quicksnap.data.api.QuickSnapApi;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class QuickSnapRepository extends C252733pa {
    public long A00;
    public boolean A01;
    public final C359098c0 A02;
    public final QuickSnapApi A03;
    public final C359068bx A04;
    public final User A05;
    public final Map A06 = new LinkedHashMap();
    public final 05G A07;
    public final 05G A08;
    public final AnonymousClass0Ud A09;
    public final AnonymousClass0Ud A0A;
    public final AnonymousClass0Ud A0B;
    public final 05G A0C;

    public QuickSnapRepository(UserSession userSession, C359098c0 r7, QuickSnapApi quickSnapApi, C359068bx r9) {
        super("QuickSnapRepository", 19E.A02(new AnonymousClass19G((C262204Co) null).plus(AnonymousClass12T.A00.CO6(307878321, 3))));
        this.A03 = quickSnapApi;
        this.A04 = r9;
        this.A02 = r7;
        0sn r2 = 0sn.A00;
        02z r0 = new 02z(new C359108c1(r2, r2));
        this.A08 = r0;
        this.A0B = 10b.A03(r0);
        02z A012 = 106.A01((Object) null);
        this.A07 = A012;
        this.A09 = 10b.A03(A012);
        this.A05 = AnonymousClass0t1.A01.A01(userSession);
        02z A013 = 106.A01(r2);
        this.A0C = A013;
        this.A0A = A013;
    }

    public final void A05(String str) {
        Object value;
        C359108c1 r6;
        ArrayList arrayList;
        0qQ.A0B(str, 0);
        05G r4 = this.A08;
        do {
            value = r4.getValue();
            r6 = (C359108c1) value;
            List list = r6.A01;
            arrayList = new ArrayList();
            for (Object next : list) {
                if (!0qQ.A0K(AnonymousClass3ZA.A00((User) ((C53401GnY) next).A01), str)) {
                    arrayList.add(next);
                }
            }
        } while (!r4.AIY(value, new C359108c1(arrayList, r6.A00)));
    }

    public static final void A00(QuickSnapRepository quickSnapRepository, 0sP r3) {
        Object value;
        ArrayList A0U;
        05G r2 = quickSnapRepository.A0C;
        do {
            value = r2.getValue();
            A0U = 00k.A0U((Collection) value);
            r3.invoke(A0U);
        } while (!r2.AIY(value, A0U));
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.ME9, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v8 */
    /* JADX WARNING: type inference failed for: r3v9 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r4 = 23
            boolean r0 = X.ME9.A03(r4, r7)
            if (r0 == 0) goto L_0x0086
            r3 = r7
            X.ME9 r3 = (X.ME9) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0086
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r3.A03
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r1 = 1
            if (r0 == 0) goto L_0x0073
            if (r0 != r1) goto L_0x008c
            java.lang.Object r6 = r3.A02
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = r3.A01
            com.instagram.quicksnap.data.repository.QuickSnapRepository r3 = (com.instagram.quicksnap.data.repository.QuickSnapRepository) r3
            X.0eS.A00(r4)
        L_0x002c:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            r2 = r4
            boolean r0 = r4.booleanValue()
            if (r0 == 0) goto L_0x004f
            X.05G r0 = r3.A0C
            java.lang.Object r1 = r0.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x0050
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0050
        L_0x004a:
            X.05G r0 = r3.A07
            r0.Epw(r6)
        L_0x004f:
            return r2
        L_0x0050:
            java.util.Iterator r1 = r1.iterator()
        L_0x0054:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r1.next()
            X.L9x r0 = (X.C63868L9x) r0
            java.lang.String r0 = r0.A04
            boolean r0 = X.0qQ.A0K(r0, r6)
            if (r0 == 0) goto L_0x0054
            r1 = 45
            X.MYK r0 = new X.MYK
            r0.<init>(r6, r1)
            A00(r3, r0)
            return r2
        L_0x0073:
            X.0eS.A00(r4)
            com.instagram.quicksnap.data.api.QuickSnapApi r0 = r5.A03
            r3.A01 = r5
            r3.A02 = r6
            r3.A00 = r1
            java.lang.Object r4 = r0.A01(r6, r3)
            if (r4 == r2) goto L_0x004f
            r3 = r5
            goto L_0x002c
        L_0x0086:
            X.ME9 r3 = new X.ME9
            r3.<init>(r5, r7, r4)
            goto L_0x0016
        L_0x008c:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.data.repository.QuickSnapRepository.A01(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.ME6, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0045 A[LOOP:0: B:17:0x003f->B:19:0x0045, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0049  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0068 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.util.List r8, X.AnonymousClass4D7 r9) {
        /*
            r7 = this;
            r6 = 47
            boolean r0 = X.ME6.A02(r6, r9)
            if (r0 == 0) goto L_0x0069
            r5 = r9
            X.ME6 r5 = (X.ME6) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0069
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A01
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0049
            if (r0 == r2) goto L_0x005b
            if (r0 != r3) goto L_0x0071
            X.0eS.A00(r1)
        L_0x0027:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x003b
            r0 = r1
            java.util.Collection r0 = (java.util.Collection) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x003b
        L_0x0036:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x003b:
            java.util.Iterator r1 = r1.iterator()
        L_0x003f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0036
            r1.next()
            goto L_0x003f
        L_0x0049:
            X.0eS.A00(r1)
            r1 = 0
            X.MfO r0 = new X.MfO
            r0.<init>(r7, r8, r1, r6)
            r5.A00 = r2
            java.lang.Object r1 = X.19E.A00(r5, r0)
            if (r1 != r4) goto L_0x005e
            return r4
        L_0x005b:
            X.0eS.A00(r1)
        L_0x005e:
            java.util.Collection r1 = (java.util.Collection) r1
            r5.A00 = r3
            java.lang.Object r1 = X.AnonymousClass42T.A00(r1, r5)
            if (r1 != r4) goto L_0x0027
            return r4
        L_0x0069:
            r0 = 42
            X.ME6 r5 = new X.ME6
            r5.<init>(r7, r9, r6, r0)
            goto L_0x0016
        L_0x0071:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.data.repository.QuickSnapRepository.A02(java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(java.util.List r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 34
            boolean r0 = X.C66138MDq.A02(r3, r7)
            if (r0 == 0) goto L_0x0054
            r4 = r7
            X.MDq r4 = (X.C66138MDq) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0054
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r4.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x0040
            if (r0 != r1) goto L_0x005a
            java.lang.Object r2 = r4.A01
            com.instagram.quicksnap.data.repository.QuickSnapRepository r2 = (com.instagram.quicksnap.data.repository.QuickSnapRepository) r2
            X.0eS.A00(r3)
        L_0x0028:
            r0 = 0
            r2.A01 = r0
            if (r3 == 0) goto L_0x003f
            long r0 = java.lang.System.currentTimeMillis()
            r2.A00 = r0
            X.05G r1 = r2.A08
        L_0x0035:
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r1.AIY(r0, r3)
            if (r0 == 0) goto L_0x0035
        L_0x003f:
            return r3
        L_0x0040:
            X.0eS.A00(r3)
            r5.A01 = r1
            com.instagram.quicksnap.data.api.QuickSnapApi r0 = r5.A03
            r4.A01 = r5
            r4.A00 = r1
            java.lang.Object r3 = r0.A04(r6, r4)
            if (r3 != r2) goto L_0x0052
            return r2
        L_0x0052:
            r2 = r5
            goto L_0x0028
        L_0x0054:
            X.MDq r4 = new X.MDq
            r4.<init>(r5, r7, r3)
            goto L_0x0016
        L_0x005a:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.data.repository.QuickSnapRepository.A03(java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A04(X.AnonymousClass4D7 r11, boolean r12) {
        /*
            r10 = this;
            r3 = 33
            boolean r0 = X.C66138MDq.A02(r3, r11)
            if (r0 == 0) goto L_0x007a
            r6 = r11
            X.MDq r6 = (X.C66138MDq) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007a
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r3 = r6.A02
            X.1Hj r7 = X.1Hj.A02
            int r0 = r6.A00
            r5 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 != r5) goto L_0x0080
            java.lang.Object r2 = r6.A01
            com.instagram.quicksnap.data.repository.QuickSnapRepository r2 = (com.instagram.quicksnap.data.repository.QuickSnapRepository) r2
            X.0eS.A00(r3)
        L_0x0028:
            r0 = 0
            r2.A01 = r0
            if (r3 == 0) goto L_0x0042
            long r0 = java.lang.System.currentTimeMillis()
            r2.A00 = r0
        L_0x0033:
            X.05G r1 = r2.A08
        L_0x0035:
            java.lang.Object r0 = r1.getValue()
            boolean r0 = r1.AIY(r0, r3)
            if (r0 == 0) goto L_0x0035
        L_0x003f:
            X.0gF r7 = X.C60340gF.A00
        L_0x0041:
            return r7
        L_0x0042:
            X.0sn r0 = X.0sn.A00
            X.8c1 r3 = new X.8c1
            r3.<init>(r0, r0)
            goto L_0x0033
        L_0x004a:
            X.0eS.A00(r3)
            long r8 = java.lang.System.currentTimeMillis()
            long r2 = r10.A00
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
            r0 = 30
            long r0 = r4.toMillis(r0)
            long r2 = r2 + r0
            int r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            r1 = 0
            if (r0 < 0) goto L_0x0062
            r1 = 1
        L_0x0062:
            boolean r0 = r10.A01
            if (r0 != 0) goto L_0x003f
            if (r12 != 0) goto L_0x006a
            if (r1 == 0) goto L_0x003f
        L_0x006a:
            r10.A01 = r5
            com.instagram.quicksnap.data.api.QuickSnapApi r0 = r10.A03
            r6.A01 = r10
            r6.A00 = r5
            java.lang.Object r3 = r0.A06(r6)
            if (r3 == r7) goto L_0x0041
            r2 = r10
            goto L_0x0028
        L_0x007a:
            X.MDq r6 = new X.MDq
            r6.<init>(r10, r11, r3)
            goto L_0x0016
        L_0x0080:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.quicksnap.data.repository.QuickSnapRepository.A04(X.4D7, boolean):java.lang.Object");
    }
}
