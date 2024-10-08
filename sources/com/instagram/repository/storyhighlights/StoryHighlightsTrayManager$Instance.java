package com.instagram.repository.storyhighlights;

import X.0Tu;
import X.0qQ;
import X.182;
import X.19B;
import X.1Eo;
import X.AnonymousClass05K;
import X.AnonymousClass07a;
import X.AnonymousClass0xx;
import X.AnonymousClass4D7;
import X.AnonymousClass4DH;
import X.C228112ko;
import X.C262224Cq;
import X.C317776no;
import X.C322966wh;
import X.C322986wk;
import X.C376909Ju;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashSet;
import java.util.Set;

public final class StoryHighlightsTrayManager$Instance implements C228112ko {
    public Context A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public final C322986wk A05;
    public final Set A06 = new LinkedHashSet();
    public final boolean A07;
    public final String A08;
    public final /* synthetic */ C322966wh A09;

    public StoryHighlightsTrayManager$Instance(C322966wh r6, String str) {
        this.A09 = r6;
        this.A08 = str;
        UserSession userSession = r6.A00;
        this.A07 = str.equals(userSession.A06);
        this.A05 = new C322986wk(2, 182.A06(0Tu.A05, userSession, 36329341650616383L));
    }

    public final void A01(C317776no r5, AnonymousClass4DH r6) {
        0qQ.A0B(r6, 0);
        0qQ.A0B(r5, 1);
        this.A00 = r6.requireContext();
        this.A06.add(r5);
        AnonymousClass0xx A002 = AnonymousClass07a.A00(r6.getViewLifecycleOwner());
        C376909Ju r2 = new C376909Ju(this, (AnonymousClass4D7) null, 34);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, r2, A002);
    }

    public final void Cmq() {
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.9JT, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0031  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.1Hj A00(com.instagram.repository.storyhighlights.StoryHighlightsTrayManager$Instance r5, X.AnonymousClass4D7 r6) {
        /*
            r3 = 40
            boolean r0 = X.AnonymousClass9JT.A00(r3, r6)
            if (r0 == 0) goto L_0x0029
            r4 = r6
            X.9JT r4 = (X.AnonymousClass9JT) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0029
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A01
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0031
            if (r0 == r2) goto L_0x0046
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0029:
            r0 = 42
            X.9JT r4 = new X.9JT
            r4.<init>(r5, r6, r3, r0)
            goto L_0x0016
        L_0x0031:
            X.0eS.A00(r1)
            X.6wk r0 = r5.A05
            X.0pa r1 = r0.A01
            X.6yP r0 = new X.6yP
            r0.<init>(r5)
            r4.A00 = r2
            java.lang.Object r0 = r1.collect(r0, r4)
            if (r0 != r3) goto L_0x0049
            return r3
        L_0x0046:
            X.0eS.A00(r1)
        L_0x0049:
            X.MCr r0 = new X.MCr
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.repository.storyhighlights.StoryHighlightsTrayManager$Instance.A00(com.instagram.repository.storyhighlights.StoryHighlightsTrayManager$Instance, X.4D7):X.1Hj");
    }

    public final void AUz() {
        String str;
        String str2 = this.A08;
        Context context = this.A00;
        if (context != null && (str = this.A01) != null) {
            C322966wh r2 = this.A09;
            UserSession userSession = r2.A00;
            0qQ.A0B(userSession, 0);
            if (182.A06(0Tu.A05, userSession, 36320008687525751L) && !this.A03 && !this.A04) {
                this.A04 = true;
                for (C317776no DJR : this.A06) {
                    DJR.DJR(false);
                }
                C322986wk r8 = this.A05;
                Integer A002 = C322966wh.A00(r2);
                C262224Cq r22 = r8.A01;
                StoryHighlightsRepository$fetchMoreStoryHighlights$1 storyHighlightsRepository$fetchMoreStoryHighlights$1 = new StoryHighlightsRepository$fetchMoreStoryHighlights$1(context, userSession, r8, (Boolean) null, (Boolean) null, A002, str2, (String) null, str, (AnonymousClass4D7) null, true);
                1Eo.A03(AnonymousClass05K.A00, 19B.A00, storyHighlightsRepository$fetchMoreStoryHighlights$1, r22);
            }
        }
    }

    public final boolean CJl() {
        return this.A02;
    }

    public final /* synthetic */ boolean CKY() {
        return false;
    }

    public final boolean CKZ() {
        UserSession userSession = this.A09.A00;
        0qQ.A0B(userSession, 0);
        if (!182.A06(0Tu.A05, userSession, 36320008687525751L) || this.A01 == null) {
            return false;
        }
        return true;
    }

    public final boolean EsD(Integer num, int i, int i2) {
        if (CKZ()) {
            int i3 = i2 - i;
            UserSession userSession = this.A09.A00;
            0qQ.A0B(userSession, 0);
            if (i3 > ((int) 182.A01(0Tu.A05, userSession, 36601483664036051L))) {
                return false;
            }
            return true;
        }
        return false;
    }
}
