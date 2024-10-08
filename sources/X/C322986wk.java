package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.repository.storyhighlights.StoryHighlightsRepository$fetchStoryHighlights$1;

/* renamed from: X.6wk  reason: invalid class name and case insensitive filesystem */
public final class C322986wk extends C252733pa {
    public final 0V2 A00;
    public final C61770pa A01;

    public C322986wk() {
        this(3, false);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C322986wk(int r4, boolean r5) {
        /*
            r3 = this;
            r1 = 0
            r0 = r4 & 1
            if (r0 == 0) goto L_0x0006
            r5 = 0
        L_0x0006:
            r0 = r4 & 2
            if (r0 == 0) goto L_0x0012
            r1 = 1392808555(0x5304926b, float:5.6939217E11)
            r0 = 3
            X.19S r1 = X.AnonymousClass43D.A01(r1, r0)
        L_0x0012:
            r0 = 2
            X.0qQ.A0B(r1, r0)
            java.lang.String r0 = "Profile"
            r3.<init>(r0, r1)
            r1 = 0
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.05D r2 = X.10D.A01(r0, r5, r1)
            r3.A00 = r2
            r1 = 0
            X.0V1 r0 = new X.0V1
            r0.<init>(r1, r2)
            r3.A01 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C322986wk.<init>(int, boolean):void");
    }

    public final void A00(Context context, UserSession userSession, C318476p0 r18, Boolean bool, Boolean bool2, Boolean bool3, Integer num, String str, boolean z) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        C262224Cq r2 = this.A01;
        StoryHighlightsRepository$fetchStoryHighlights$1 storyHighlightsRepository$fetchStoryHighlights$1 = new StoryHighlightsRepository$fetchStoryHighlights$1(context, userSession2, r18, this, bool, bool2, bool3, num, str, (AnonymousClass4D7) null, z);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, storyHighlightsRepository$fetchStoryHighlights$1, r2);
    }
}
