package com.instagram.newsfeed.data;

import X.0Tu;
import X.0qQ;
import X.182;
import X.19B;
import X.1Eo;
import X.AnonymousClass05K;
import X.AnonymousClass43D;
import X.AnonymousClass4D7;
import X.AnonymousClass4HN;
import X.AnonymousClass4HS;
import X.AnonymousClass4HT;
import X.AnonymousClass4HU;
import X.AnonymousClass4HW;
import X.AnonymousClass9JK;
import X.C252733pa;
import X.C262224Cq;
import X.C294645mn;
import X.C376909Ju;
import com.instagram.common.session.UserSession;
import com.instagram.repository.common.MemoryCache;
import java.util.Locale;

public final class ActivityFeedRepository extends C252733pa {
    public final AnonymousClass4HW A00 = new AnonymousClass4HW(AnonymousClass4HU.A00);
    public final UserSession A01;
    public final AnonymousClass4HS A02;
    public final AnonymousClass4HN A03;
    public final MemoryCache A04;
    public final AnonymousClass4HT A05;

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9JX, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(X.AnonymousClass0iw r14, java.lang.String r15, X.AnonymousClass4D7 r16, boolean r17) {
        /*
            r13 = this;
            r7 = r15
            r3 = 44
            r5 = r16
            boolean r0 = X.AnonymousClass9JX.A00(r3, r5)
            if (r0 == 0) goto L_0x007b
            r4 = r5
            X.9JX r4 = (X.AnonymousClass9JX) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007b
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0019:
            java.lang.Object r2 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r1 = 1
            if (r0 == 0) goto L_0x004e
            if (r0 != r1) goto L_0x0087
            java.lang.Object r7 = r4.A01
            java.lang.String r7 = (java.lang.String) r7
            X.0eS.A00(r2)
        L_0x002b:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x004b
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0081
            X.5sO r2 = (X.C297815sO) r2
            java.lang.Object r2 = r2.A00
            X.4dm r2 = (X.C268654dm) r2
            boolean r1 = r2 instanceof X.C268674do
            r0 = 0
            if (r1 == 0) goto L_0x0048
            X.4do r2 = (X.C268674do) r2
            if (r2 == 0) goto L_0x0048
            java.lang.Object r0 = r2.A00
            X.Gym r0 = (X.C54063Gym) r0
        L_0x0048:
            X.C56631I5k.A04(r0, r7)
        L_0x004b:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x004e:
            X.0eS.A00(r2)
            X.4HS r0 = r13.A02
            r0.A00()
            com.instagram.common.session.UserSession r5 = r13.A01
            r6 = 0
            java.lang.String r8 = r14.getModuleName()
            r11 = 0
            r9 = -1
            r10 = r9
            r12 = r11
            if (r17 == 0) goto L_0x0076
            X.1OC r2 = X.C56631I5k.A01(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0067:
            r4.A01 = r15
            r4.A00 = r1
            r1 = 2109432776(0x7dbb63c8, float:3.1135466E37)
            r0 = 3
            java.lang.Object r2 = r2.A02(r4, r1, r0, r11)
            if (r2 != r3) goto L_0x002b
            return r3
        L_0x0076:
            X.1OC r2 = X.C56631I5k.A02(r5, r6, r7, r8, r9, r10, r11, r12)
            goto L_0x0067
        L_0x007b:
            X.9JX r4 = new X.9JX
            r4.<init>(r13, r5, r3)
            goto L_0x0019
        L_0x0081:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0087:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.data.ActivityFeedRepository.A02(X.0iw, java.lang.String, X.4D7, boolean):java.lang.Object");
    }

    public static final boolean A00(ActivityFeedRepository activityFeedRepository) {
        AnonymousClass4HS r6 = activityFeedRepository.A02;
        if (System.currentTimeMillis() >= r6.A00 + 10000 && !r6.A02.A01.getBoolean("notification_feed_is_304_disabled", false)) {
            if (!182.A06(0Tu.A05, r6.A01, 36317959987140303L)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void A03(boolean z) {
        if (z || this.A05.A00.A01.getBoolean("HAS_NEW_NOTIFICATION", false)) {
            C262224Cq r3 = this.A01;
            C376909Ju r2 = new C376909Ju(this, (AnonymousClass4D7) null, 27);
            1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, r3);
        }
    }

    public ActivityFeedRepository(UserSession userSession, AnonymousClass4HS r4, AnonymousClass4HT r5, AnonymousClass4HN r6, MemoryCache memoryCache) {
        super("ActivityFeed", AnonymousClass43D.A01(2109432776, 3));
        this.A01 = userSession;
        this.A03 = r6;
        this.A04 = memoryCache;
        this.A02 = r4;
        this.A05 = r5;
    }

    public final ActivityPagedData A01(C294645mn r8, boolean z) {
        String obj = Locale.getDefault().toString();
        0qQ.A07(obj);
        return new ActivityPagedData(new AnonymousClass9JK(r8, obj), this.A01, this.A03, this.A04, z, A00(this));
    }
}
