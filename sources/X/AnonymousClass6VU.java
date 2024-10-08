package X;

import android.content.Context;
import com.instagram.api.schemas.IGPostTriggerExperience;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.6VU  reason: invalid class name */
public final class AnonymousClass6VU {
    public int A00;
    public int A01;
    public Integer A02 = AnonymousClass05K.A00;
    public final Context A03;
    public final UserSession A04;
    public final AnonymousClass6VV A05;
    public final AnonymousClass6VX A06;
    public final C310006aH A07;
    public final 1Ph A08;

    public AnonymousClass6VU(Context context, UserSession userSession, C310006aH r5, 1Ph r6) {
        0qQ.A0B(r6, 4);
        this.A03 = context;
        this.A04 = userSession;
        this.A07 = r5;
        this.A08 = r6;
        this.A05 = new AnonymousClass6VV(userSession, r5);
        this.A06 = new AnonymousClass6VX(userSession, new AnonymousClass6VW(this), r5);
    }

    public static final Integer A00(C250973mM r4, AnonymousClass6VU r5) {
        List list;
        if (182.A06(0Tu.A06, r5.A04, 36317818255709783L) || ((list = r4.A0H.A14) != null && list.contains(IGPostTriggerExperience.IG_POST_TRIGGER_EXPERIENCE_STORIES_MULTI_ADVERTISER_CAROUSEL))) {
            return AnonymousClass05K.A02;
        }
        return AnonymousClass05K.A0u;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0010, code lost:
        r2 = r4.A0H;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(X.C250973mM r4, X.AnonymousClass6VU r5) {
        /*
            com.instagram.common.session.UserSession r3 = r5.A04
            X.0Tu r2 = X.0Tu.A06
            r0 = 36317818255709783(0x8106dd00261657, double:3.0308727328023786E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r3 = 1
            if (r0 != 0) goto L_0x001e
            com.instagram.model.reels.Reel r2 = r4.A0H
            java.util.List r1 = r2.A14
            if (r1 == 0) goto L_0x001f
            com.instagram.api.schemas.IGPostTriggerExperience r0 = com.instagram.api.schemas.IGPostTriggerExperience.IG_POST_TRIGGER_EXPERIENCE_STORIES_CONTEXTUAL_AD_NEXT_AD_SLOT
            boolean r0 = r1.contains(r0)
            if (r0 != r3) goto L_0x001f
        L_0x001e:
            return r3
        L_0x001f:
            java.util.List r1 = r2.A14
            if (r1 == 0) goto L_0x002c
            com.instagram.api.schemas.IGPostTriggerExperience r0 = com.instagram.api.schemas.IGPostTriggerExperience.IG_POST_TRIGGER_EXPERIENCE_STORIES_MULTI_ADVERTISER_CAROUSEL
            boolean r0 = r1.contains(r0)
            if (r0 != r3) goto L_0x002c
            return r3
        L_0x002c:
            r3 = 0
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6VU.A01(X.3mM, X.6VU):boolean");
    }
}
