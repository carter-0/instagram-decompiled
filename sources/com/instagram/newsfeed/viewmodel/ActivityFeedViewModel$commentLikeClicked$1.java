package com.instagram.newsfeed.viewmodel;

import X.0eP;
import X.0eS;
import X.0qQ;
import X.0sL;
import X.1Hj;
import X.AnonymousClass0iw;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C283155Gi;
import X.C318116oQ;
import X.C47179Dru;
import X.C48087EVf;
import X.C60340gF;
import X.C66176MGn;
import X.JV7;
import com.instagram.newsfeed.data.ActivityFeedRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.newsfeed.viewmodel.ActivityFeedViewModel$commentLikeClicked$1", f = "ActivityFeedViewModel.kt", i = {}, l = {627}, m = "invokeSuspend", n = {}, s = {})
public final class ActivityFeedViewModel$commentLikeClicked$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ JV7 A02;
    public final /* synthetic */ C283155Gi A03;
    public final /* synthetic */ ActivityFeedViewModel A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityFeedViewModel$commentLikeClicked$1(JV7 jv7, C283155Gi r3, ActivityFeedViewModel activityFeedViewModel, AnonymousClass4D7 r5, int i, boolean z, boolean z2) {
        super(2, r5);
        this.A06 = z;
        this.A03 = r3;
        this.A05 = z2;
        this.A04 = activityFeedViewModel;
        this.A01 = i;
        this.A02 = jv7;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.newsfeed.viewmodel.ActivityFeedViewModel$commentLikeClicked$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        boolean z = this.A06;
        C283155Gi r2 = this.A03;
        boolean z2 = this.A05;
        return new ActivityFeedViewModel$commentLikeClicked$1(this.A02, r2, this.A04, r10, this.A01, z, z2);
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.newsfeed.viewmodel.ActivityFeedViewModel$commentLikeClicked$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r4 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            if (this.A06) {
                C283155Gi r1 = this.A03;
                boolean z = this.A05;
                r1.A04.A04 = Boolean.valueOf(z);
                this.A04.A0F();
            }
            String str = this.A03.A04.A0b;
            if (str != null) {
                ActivityFeedViewModel activityFeedViewModel = this.A04;
                boolean z2 = this.A05;
                ActivityFeedRepository activityFeedRepository = activityFeedViewModel.A08;
                AnonymousClass0iw r0 = activityFeedViewModel.A03;
                this.A00 = 1;
                if (activityFeedRepository.A02(r0, str, this, z2) == r4) {
                    return r4;
                }
            }
        }
        ActivityFeedViewModel activityFeedViewModel2 = this.A04;
        C283155Gi r3 = this.A03;
        int i = this.A01;
        0eP A1L = AnonymousClass7TE.A1L("tap_target", "ufi_like");
        C47179Dru dru = new C47179Dru(this.A02, C48087EVf.LIKE_BUTTON, (Integer) null, i);
        0qQ.A0B(r3, 0);
        AnonymousClass7TE.A1Z(new C66176MGn(activityFeedViewModel2, r3, dru, A1L, (AnonymousClass4D7) null, i, 6), C318116oQ.A00(activityFeedViewModel2));
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ActivityFeedViewModel$commentLikeClicked$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
