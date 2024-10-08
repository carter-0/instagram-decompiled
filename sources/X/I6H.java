package X;

import android.app.Activity;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.save.analytics.SaveToCollectionsParentInsightsHost;
import com.instagram.save.model.SavedCollection;

public final class I6H {
    public final Activity A00;
    public final UserSession A01;
    public final AnonymousClass4DU A02;
    public final C249763kK A03;

    public final void A04(1Xj r9, JOV jov) {
        C331127Pr A0W = DbS.A0W(this.A01);
        Activity activity = this.A00;
        A0W.A0d = AnonymousClass7TE.A16(activity, 2131968265);
        C331157Pu A002 = A0W.A00();
        C55115HcO.A00();
        H27 h27 = new H27();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("SaveToNewCollectionFragment.ARGS_MEDIA_ID", r9.getId());
        h27.setArguments(A0a);
        0qQ.A0C(h27, "null cannot be cast to non-null type com.instagram.save.fragment.SaveToNewCollectionFragment");
        String A16 = AnonymousClass7TE.A16(activity, 2131960992);
        ID0 id0 = new ID0(25, (Object) A002, (Object) jov, (Object) h27);
        h27.A08 = new C55736HmX(id0, A002, A16);
        A002.A02(activity, h27);
        C331137Ps A0h = C51971G9r.A0h(0);
        A0h.A06 = A16;
        A0h.A05 = id0;
        A0h.A0A = false;
        A002.A0K(A0h.A00(), true);
    }

    public final void A05(1Xj r10, JOV jov, JOW jow, SavedCollection savedCollection) {
        1Xj r4 = r10;
        SavedCollection savedCollection2 = savedCollection;
        AnonymousClass7TF.A1C(savedCollection, 0, r10);
        UserSession userSession = this.A01;
        C57096IOk A002 = C55124HcX.A00(userSession);
        JOV jov2 = jov;
        if (!A002.A07() || !A03(A002)) {
            C331127Pr A0W = DbS.A0W(userSession);
            Activity activity = this.A00;
            DbZ.A0z(activity, A0W, 2131972535);
            C331157Pu A003 = A0W.A00();
            A003.A02(activity, A00(r4, A003, jov2, jow, savedCollection2));
            return;
        }
        A04(r10, jov);
    }

    public final void A06(1Xj r10, JOV jov, JOW jow, SavedCollection savedCollection) {
        1Xj r4 = r10;
        SavedCollection savedCollection2 = savedCollection;
        AnonymousClass7TF.A1C(savedCollection, 0, r10);
        UserSession userSession = this.A01;
        C57096IOk A002 = C55124HcX.A00(userSession);
        JOV jov2 = jov;
        if (!A002.A07() || !A03(A002)) {
            C331127Pr A0W = DbS.A0W(userSession);
            Activity activity = this.A00;
            DbZ.A0z(activity, A0W, 2131966745);
            C331157Pu A003 = A0W.A00();
            A003.A02(activity, A00(r4, A003, jov2, jow, savedCollection2));
            return;
        }
        A04(r10, jov);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0087, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x008d, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A03(X.C57096IOk r8) {
        /*
            X.HMw r0 = X.C54665HMw.MEDIA
            java.util.List r7 = X.AnonymousClass7TE.A1I(r0)
            java.util.List r6 = java.util.Collections.emptyList()
            X.0qQ.A07(r6)
            monitor-enter(r8)
            boolean r0 = r8.A05     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x0037
            java.util.LinkedList r0 = r8.A00     // Catch:{ all -> 0x008f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x008f }
            if (r0 != 0) goto L_0x008c
            java.util.LinkedList r0 = r8.A00     // Catch:{ all -> 0x008f }
            java.util.Iterator r1 = X.AnonymousClass7TE.A1G(r0)     // Catch:{ all -> 0x008f }
        L_0x0020:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x008c
            java.lang.Object r0 = X.AnonymousClass7TF.A0a(r1)     // Catch:{ all -> 0x008f }
            com.instagram.save.model.SavedCollection r0 = (com.instagram.save.model.SavedCollection) r0     // Catch:{ all -> 0x008f }
            X.HMU r0 = r0.A06     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x0086
            boolean r0 = X.00k.A0u(r6, r0)     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x0020
            goto L_0x0086
        L_0x0037:
            java.util.concurrent.ConcurrentHashMap r0 = r8.A03     // Catch:{ all -> 0x008f }
            boolean r0 = r0.isEmpty()     // Catch:{ all -> 0x008f }
            if (r0 != 0) goto L_0x008c
            java.util.concurrent.ConcurrentHashMap r5 = r8.A04     // Catch:{ all -> 0x008f }
            java.util.Set r0 = r5.keySet()     // Catch:{ all -> 0x008f }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ all -> 0x008f }
        L_0x0049:
            boolean r0 = r4.hasNext()     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x008c
            java.lang.Object r1 = X.AnonymousClass7TF.A0a(r4)     // Catch:{ all -> 0x008f }
            X.HMw r1 = (X.C54665HMw) r1     // Catch:{ all -> 0x008f }
            boolean r0 = r7.contains(r1)     // Catch:{ all -> 0x008f }
            if (r0 == 0) goto L_0x0049
            java.lang.Object r3 = r5.get(r1)     // Catch:{ all -> 0x008f }
            X.HzT r3 = (X.C56497HzT) r3     // Catch:{ all -> 0x008f }
            if (r3 == 0) goto L_0x0049
            monitor-enter(r3)     // Catch:{ all -> 0x008f }
            r2 = 0
            java.util.LinkedList r0 = r3.A00     // Catch:{ all -> 0x0089 }
            java.util.Iterator r1 = X.AnonymousClass7TE.A1G(r0)     // Catch:{ all -> 0x0089 }
        L_0x006b:
            boolean r0 = r1.hasNext()     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0082
            java.lang.Object r0 = X.AnonymousClass7TF.A0a(r1)     // Catch:{ all -> 0x0089 }
            com.instagram.save.model.SavedCollection r0 = (com.instagram.save.model.SavedCollection) r0     // Catch:{ all -> 0x0089 }
            X.HMU r0 = r0.A06     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0083
            boolean r0 = X.00k.A0u(r6, r0)     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x006b
            goto L_0x0083
        L_0x0082:
            r2 = 1
        L_0x0083:
            monitor-exit(r3)     // Catch:{ all -> 0x008f }
            if (r2 != 0) goto L_0x0049
        L_0x0086:
            monitor-exit(r8)
            r0 = 0
            return r0
        L_0x0089:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x008f }
            throw r0     // Catch:{ all -> 0x008f }
        L_0x008c:
            monitor-exit(r8)
            r0 = 1
            return r0
        L_0x008f:
            r0 = move-exception
            monitor-exit(r8)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.I6H.A03(X.IOk):boolean");
    }

    public I6H(Activity activity, UserSession userSession, AnonymousClass4DU r3, C249763kK r4) {
        AnonymousClass7TG.A1P(r3, userSession);
        this.A02 = r3;
        this.A00 = activity;
        this.A03 = r4;
        this.A01 = userSession;
    }

    private final H26 A00(1Xj r12, C331157Pu r13, JOV jov, JOW jow, SavedCollection savedCollection) {
        0jB r0;
        String str;
        C55115HcO.A00();
        String str2 = savedCollection.A0F;
        0qQ.A07(str2);
        C249763kK r5 = this.A03;
        String str3 = this.A01.A05;
        AnonymousClass4DU r4 = this.A02;
        String moduleName = r4.getModuleName();
        boolean isSponsoredEligible = r4.isSponsoredEligible();
        boolean isOrganicEligible = r4.isOrganicEligible();
        if (r4 instanceof C232682uF) {
            r0 = ((C232682uF) r4).E4k();
        } else {
            r0 = null;
        }
        SaveToCollectionsParentInsightsHost saveToCollectionsParentInsightsHost = new SaveToCollectionsParentInsightsHost(r0, moduleName, isSponsoredEligible, isOrganicEligible);
        0qQ.A0B(str3, 2);
        Fragment r3 = new C273374mT();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putSerializable("SaveToCollectionFragment.ARGS_SELECTION_MODE", C54613HKw.MOVE_TO);
        A0a.putString("SaveToCollectionFragment.ARGS_COLLECTION_ID_VIEWING", str2);
        A0a.putString("IgSessionManager.SESSION_TOKEN_KEY", str3);
        A0a.putParcelable("SaveToCollectionFragment.ARGS_PARENT_MODULE", saveToCollectionsParentInsightsHost);
        if (r5 != null) {
            str = r5.getSessionId();
        } else {
            str = null;
        }
        A0a.putString("SaveToCollectionFragment.ARGS_SESSION_ID", str);
        r3.setArguments(A0a);
        0qQ.A0C(r3, "null cannot be cast to non-null type com.instagram.save.fragment.SaveToCollectionFragment");
        r3.A06 = new IXJ(r12, r13, this, jov, jow);
        return r3;
    }

    public static final void A01(1Xj r6, AnonymousClass3W1 r7, C331157Pu r8, I6H i6h, String str, int i, int i2, boolean z) {
        0jB r0;
        String str2;
        C55115HcO.A00();
        C249763kK r1 = i6h.A03;
        AnonymousClass4DU r5 = i6h.A02;
        String moduleName = r5.getModuleName();
        boolean isSponsoredEligible = r5.isSponsoredEligible();
        boolean isOrganicEligible = r5.isOrganicEligible();
        if (r5 instanceof C232682uF) {
            r0 = ((C232682uF) r5).E4l(r6);
        } else {
            r0 = null;
        }
        SaveToCollectionsParentInsightsHost saveToCollectionsParentInsightsHost = new SaveToCollectionsParentInsightsHost(r0, moduleName, isSponsoredEligible, isOrganicEligible);
        H27 h27 = new H27();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("SaveToNewCollectionFragment.ARGS_MEDIA_ID", r6.getId());
        A0a.putInt("SaveToNewCollectionFragment.ARGS_CAROUSEL_INDEX", r7.A03);
        A0a.putInt("SaveToNewCollectionFragment.ARGS_POSITION", i);
        A0a.putInt("SaveToNewCollectionFragment.ARGS_PREV_NUM_COLLECTIONS", i2);
        if (r1 != null) {
            str2 = r1.getSessionId();
        } else {
            str2 = null;
        }
        A0a.putString("SaveToNewCollectionFragment.ARGS_SESSION_ID", str2);
        A0a.putString("SaveToNewCollectionFragment.ARGS_NAVIGATION_TYPE", str);
        A0a.putParcelable("SaveToNewCollectionFragment.ARGS_PARENT_MODULE", saveToCollectionsParentInsightsHost);
        h27.setArguments(A0a);
        0qQ.A0C(h27, "null cannot be cast to non-null type com.instagram.save.fragment.SaveToNewCollectionFragment");
        ID2 id2 = new ID2(46, (Object) r8, (Object) h27);
        Activity activity = i6h.A00;
        h27.A08 = new C55736HmX(id2, r8, AnonymousClass7TE.A16(activity, 2131972529));
        C331127Pr A0W = DbS.A0W(i6h.A01);
        A0W.A0d = AnonymousClass7TE.A16(activity, 2131968265);
        C331137Ps A0h = C51971G9r.A0h(0);
        A0h.A06 = activity.getString(2131972529);
        A0h.A05 = id2;
        A0h.A0A = false;
        A0W.A07(A0h.A00());
        r8.A0G(h27, A0W, z, z);
    }

    public static final void A02(1Xj r10, C331157Pu r11, I6H i6h, JOV jov, int i, boolean z) {
        C55115HcO.A00();
        H27 h27 = new H27();
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("SaveToNewCollectionFragment.ARGS_MEDIA_ID", r10.getId());
        h27.setArguments(A0a);
        0qQ.A0C(h27, "null cannot be cast to non-null type com.instagram.save.fragment.SaveToNewCollectionFragment");
        Activity activity = i6h.A00;
        String A16 = AnonymousClass7TE.A16(activity, 2131960992);
        int i2 = i;
        IC9 ic9 = new IC9(i2, 2, jov, h27, r11);
        h27.A08 = new C55736HmX(ic9, r11, A16);
        C331127Pr A0W = DbS.A0W(i6h.A01);
        A0W.A0d = AnonymousClass7TE.A16(activity, 2131968265);
        C331137Ps A0h = C51971G9r.A0h(0);
        A0h.A06 = A16;
        A0h.A05 = ic9;
        A0h.A0A = false;
        A0W.A07(A0h.A00());
        r11.A0G(h27, A0W, z, z);
    }
}
