package com.facebook.videolite.instagram;

import X.AnonymousClass3Q2;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C2373837k;
import X.LP8;
import X.MU6;
import X.Pxd;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.pendingmedia.model.ClipInfo;
import com.instagram.pendingmedia.model.constants.ShareType;

public final class VideoIngestionStep implements MU6 {
    public Exception A00;
    public final Context A01;
    public final UserSession A02;
    public final C2373837k A03;

    public final Object FIH(LP8 lp8, AnonymousClass4D7 r3) {
        return A00(this, lp8, r3);
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MED, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0067 A[Catch:{ all -> 0x0071 }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ java.lang.Object A00(com.facebook.videolite.instagram.VideoIngestionStep r8, X.LP8 r9, X.AnonymousClass4D7 r10) {
        /*
            r3 = 15
            boolean r0 = X.MED.A04(r3, r10)
            if (r0 == 0) goto L_0x002a
            r7 = r10
            X.MED r7 = (X.MED) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002a
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r7.A04
            X.1Hj r6 = X.1Hj.A02
            int r2 = r7.A00
            r5 = 2
            r1 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0041
            if (r2 == r1) goto L_0x0035
            if (r2 != r5) goto L_0x0030
            java.lang.Object r3 = r7.A01
            X.136 r3 = (X.136) r3
            goto L_0x0068
        L_0x002a:
            X.MED r7 = new X.MED
            r7.<init>(r8, r10, r3)
            goto L_0x0016
        L_0x0030:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0035:
            java.lang.Object r3 = r7.A03
            X.136 r3 = (X.136) r3
            java.lang.Object r9 = r7.A02
            java.lang.Object r8 = r7.A01
            X.0eS.A00(r0)
            goto L_0x0050
        L_0x0041:
            X.0eS.A00(r0)
            X.136 r3 = X.C63536Kyl.A00
            X.MED.A00(r8, r9, r3, r7, r1)
            java.lang.Object r0 = X.136.A00(r7, r3)
            if (r0 != r6) goto L_0x0050
            return r6
        L_0x0050:
            r0 = 22
            X.TVw r2 = new X.TVw     // Catch:{ all -> 0x0071 }
            r2.<init>(r0, r9, r8)     // Catch:{ all -> 0x0071 }
            X.MED.A02(r3, r7, r5)     // Catch:{ all -> 0x0071 }
            X.19B r1 = X.19B.A00     // Catch:{ all -> 0x0071 }
            X.ImM r0 = new X.ImM     // Catch:{ all -> 0x0071 }
            r0.<init>(r4, r2)     // Catch:{ all -> 0x0071 }
            java.lang.Object r0 = X.1Eo.A00(r7, r1, r0)     // Catch:{ all -> 0x0071 }
            if (r0 != r6) goto L_0x006b
            return r6
        L_0x0068:
            X.0eS.A00(r0)     // Catch:{ all -> 0x0073 }
        L_0x006b:
            X.L28 r0 = (X.L28) r0     // Catch:{ all -> 0x0073 }
            r3.A05(r4)
            return r0
        L_0x0071:
            r0 = move-exception
            goto L_0x0074
        L_0x0073:
            r0 = move-exception
        L_0x0074:
            r3.A05(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.videolite.instagram.VideoIngestionStep.A00(com.facebook.videolite.instagram.VideoIngestionStep, X.LP8, X.4D7):java.lang.Object");
    }

    public static final String A01(AnonymousClass3Q2 r3) {
        ClipInfo clipInfo = r3.A1N;
        String str = clipInfo.A0F;
        String str2 = clipInfo.A0D;
        if (clipInfo.A0M) {
            if (str2 != null) {
                return str2;
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        } else if (str != null) {
            return str;
        } else {
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
    }

    public final String getName() {
        return Pxd.A00(612);
    }

    public VideoIngestionStep(Context context, UserSession userSession, C2373837k r3) {
        this.A02 = userSession;
        this.A01 = context;
        this.A03 = r3;
    }

    public static final boolean A02(AnonymousClass3Q2 r1) {
        if (r1.A0v() || r1.A5J) {
            return true;
        }
        return false;
    }

    public static final boolean A03(AnonymousClass3Q2 r3) {
        FilterGroupModel filterGroupModel;
        if (r3.A0E() == ShareType.UNKNOWN && (filterGroupModel = r3.A1D) != null && ((FilterGroupModelImpl) filterGroupModel).A04) {
            return true;
        }
        return false;
    }
}
