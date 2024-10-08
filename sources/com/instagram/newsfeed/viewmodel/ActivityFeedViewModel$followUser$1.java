package com.instagram.newsfeed.viewmodel;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.JV7;
import com.instagram.user.model.User;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.newsfeed.viewmodel.ActivityFeedViewModel$followUser$1", f = "ActivityFeedViewModel.kt", i = {0, 0}, l = {458, 488}, m = "invokeSuspend", n = {"userAction", "newFollowStatus"}, s = {"L$0", "L$1"})
public final class ActivityFeedViewModel$followUser$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public final /* synthetic */ int A03;
    public final /* synthetic */ JV7 A04;
    public final /* synthetic */ ActivityFeedViewModel A05;
    public final /* synthetic */ User A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityFeedViewModel$followUser$1(JV7 jv7, ActivityFeedViewModel activityFeedViewModel, User user, AnonymousClass4D7 r5, int i) {
        super(2, r5);
        this.A06 = user;
        this.A05 = activityFeedViewModel;
        this.A03 = i;
        this.A04 = jv7;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.newsfeed.viewmodel.ActivityFeedViewModel$followUser$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r8) {
        User user = this.A06;
        return new ActivityFeedViewModel$followUser$1(this.A04, this.A05, user, r8, this.A03);
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.newsfeed.viewmodel.ActivityFeedViewModel$followUser$1, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0104 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            X.1Hj r4 = X.1Hj.A02
            r5 = r19
            int r0 = r5.A00
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x001e
            if (r0 == r2) goto L_0x0012
            X.0eS.A00(r20)
        L_0x000f:
            X.0gF r4 = X.C60340gF.A00
            return r4
        L_0x0012:
            java.lang.Object r14 = r5.A02
            com.instagram.user.model.FollowStatus r14 = (com.instagram.user.model.FollowStatus) r14
            java.lang.Object r1 = r5.A01
            X.EWA r1 = (X.EWA) r1
            X.0eS.A00(r20)
            goto L_0x0064
        L_0x001e:
            X.0eS.A00(r20)
            com.instagram.user.model.User r15 = r5.A06
            com.instagram.user.model.FollowStatus r18 = r15.B6o()
            com.instagram.newsfeed.viewmodel.ActivityFeedViewModel r6 = r5.A05
            int r1 = r18.ordinal()
            r0 = 4
            if (r1 == r0) goto L_0x00e0
            r0 = 3
            if (r1 == r0) goto L_0x00dc
            r0 = 5
            if (r1 == r0) goto L_0x00d8
            r1 = 0
        L_0x0037:
            com.instagram.user.model.FollowStatus r7 = r15.B6o()
            com.instagram.user.model.FollowStatus r14 = com.instagram.user.model.FollowStatus.A06
            if (r7 != r14) goto L_0x00cc
            java.lang.Integer r7 = r15.A0N()
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            if (r7 == r0) goto L_0x00bf
            com.instagram.user.model.FollowStatus r14 = com.instagram.user.model.FollowStatus.A07
        L_0x0049:
            if (r1 == 0) goto L_0x000f
            com.instagram.repository.common.FeedPagedData r7 = r6.A01
            int r12 = r5.A03
            X.JV7 r0 = r5.A04
            r13 = 4
            X.GA0 r11 = new X.GA0
            r17 = r6
            r16 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            r5.A01 = r1
            r5.A02 = r14
            r5.A00 = r2
            com.instagram.repository.common.FeedPagedData.A01(r7, r11)
        L_0x0064:
            com.instagram.newsfeed.viewmodel.ActivityFeedViewModel r11 = r5.A05
            X.JZn r10 = r11.A09
            com.instagram.user.model.User r9 = r5.A06
            boolean r7 = X.DbW.A1S(r2, r9, r14)
            X.0eM r0 = r10.A03
            boolean r0 = X.AnonymousClass7TF.A1Z(r0)
            if (r0 == 0) goto L_0x00f5
            X.05G r8 = r10.A04
            java.lang.Object r6 = r8.getValue()
            X.MQ0 r6 = (X.MQ0) r6
            boolean r0 = X.C59678JTj.A01(r7, r6)
            if (r0 != 0) goto L_0x00f5
            X.JUj r0 = X.C59702JUj.A00
            boolean r0 = X.0qQ.A0K(r6, r0)
            if (r0 != 0) goto L_0x00f5
            boolean r0 = X.C59678JTj.A01(r2, r6)
            if (r0 == 0) goto L_0x0105
            X.JTj r6 = (X.C59678JTj) r6
            java.lang.Object r0 = r6.A01
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r7 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r13 = r0.iterator()
        L_0x00a0:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00e4
            java.lang.Object r12 = r13.next()
            X.FnT r12 = (X.C51037FnT) r12
            com.instagram.user.model.User r6 = r12.A00
            java.lang.String r0 = r6.getId()
            boolean r0 = X.DbV.A1Z(r9, r0)
            if (r0 == 0) goto L_0x00bb
            r6.A0n(r14)
        L_0x00bb:
            r7.add(r12)
            goto L_0x00a0
        L_0x00bf:
            boolean r0 = r15.A28()
            if (r0 == 0) goto L_0x00c8
            com.instagram.user.model.FollowStatus r14 = com.instagram.user.model.FollowStatus.A04
            goto L_0x0049
        L_0x00c8:
            com.instagram.user.model.FollowStatus r14 = com.instagram.user.model.FollowStatus.A05
            goto L_0x0049
        L_0x00cc:
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A05
            if (r7 == r0) goto L_0x0049
            com.instagram.user.model.FollowStatus r0 = com.instagram.user.model.FollowStatus.A07
            if (r7 == r0) goto L_0x0049
            com.instagram.user.model.FollowStatus r14 = com.instagram.user.model.FollowStatus.A08
            goto L_0x0049
        L_0x00d8:
            X.EWA r1 = X.EWA.UserActionCancelRequest
            goto L_0x0037
        L_0x00dc:
            X.EWA r1 = X.EWA.UserActionFollow
            goto L_0x0037
        L_0x00e0:
            X.EWA r1 = X.EWA.UserActionUnfollow
            goto L_0x0037
        L_0x00e4:
            java.lang.Object r6 = r8.getValue()
            X.JTj r0 = new X.JTj
            r0.<init>(r7, r2)
            boolean r0 = r8.AIY(r6, r0)
            if (r0 == 0) goto L_0x00e4
            r10.A00 = r2
        L_0x00f5:
            com.instagram.newsfeed.data.ActivityFeedRecommendedUserRepository r2 = r11.A07
            r0 = 0
            r5.A01 = r0
            r5.A02 = r0
            r5.A00 = r3
            java.lang.Object r0 = r2.A00(r14, r1, r9, r5)
            if (r0 != r4) goto L_0x000f
            return r4
        L_0x0105:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.newsfeed.viewmodel.ActivityFeedViewModel$followUser$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ActivityFeedViewModel$followUser$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
