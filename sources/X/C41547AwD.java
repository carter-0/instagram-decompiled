package X;

import android.app.Activity;
import com.google.common.collect.ImmutableList;

/* renamed from: X.AwD  reason: case insensitive filesystem */
public final class C41547AwD extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;
    public final boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41547AwD(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, AnonymousClass4D7 r8, int i, boolean z) {
        super(2, r8);
        this.A02 = i;
        this.A03 = obj;
        this.A06 = obj2;
        this.A07 = str;
        this.A04 = obj3;
        this.A01 = obj4;
        this.A05 = obj5;
        this.A08 = z;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.AwD, X.4D7] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.AwD, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r14) {
        Object obj2;
        Object obj3;
        String str;
        boolean z;
        Object obj4;
        Object obj5;
        Object obj6;
        int i;
        AnonymousClass4D7 r9 = r14;
        switch (this.A02) {
            case 0:
                obj2 = this.A03;
                obj3 = this.A01;
                str = this.A07;
                z = this.A08;
                obj4 = this.A05;
                obj5 = this.A04;
                obj6 = this.A06;
                i = 0;
                break;
            case 1:
                ImmutableList immutableList = (ImmutableList) this.A04;
                return new C41547AwD((Activity) this.A03, immutableList, (C367188qK) this.A06, this.A07, r14, (0rm) this.A05, this.A08);
            default:
                obj2 = this.A03;
                obj6 = this.A06;
                str = this.A07;
                obj5 = this.A04;
                obj3 = this.A01;
                obj4 = this.A05;
                z = this.A08;
                i = 2;
                break;
        }
        return new C41547AwD(obj2, obj6, obj5, obj3, obj4, str, r9, i, z);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.AwD, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0130, code lost:
        if (r7 == X.AnonymousClass05K.A0Y) goto L_0x0132;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r31) {
        /*
            r30 = this;
            r0 = r30
            r3 = r31
            int r1 = r0.A02
            switch(r1) {
                case 0: goto L_0x00c9;
                case 1: goto L_0x0072;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r5 = 1
            if (r2 == 0) goto L_0x0011
            goto L_0x0036
        L_0x0011:
            X.0eS.A00(r3)
            X.2MU r4 = com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository.A09     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r2 = r0.A03     // Catch:{ Exception -> 0x0056 }
            android.app.Activity r2 = (android.app.Activity) r2     // Catch:{ Exception -> 0x0056 }
            android.app.Application r3 = r2.getApplication()     // Catch:{ Exception -> 0x0056 }
            X.0qQ.A07(r3)     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r2 = r0.A06     // Catch:{ Exception -> 0x0056 }
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2     // Catch:{ Exception -> 0x0056 }
            com.instagram.clips.drafts.model.ClipsDraftPreviewItemRepository r2 = r4.A00(r3, r2)     // Catch:{ Exception -> 0x0056 }
            java.lang.String r3 = r0.A07     // Catch:{ Exception -> 0x0056 }
            r0.A00 = r5     // Catch:{ Exception -> 0x0056 }
            com.instagram.clips.drafts.model.datasource.ClipsDraftLocalDataSource r2 = r2.A01     // Catch:{ Exception -> 0x0056 }
            java.lang.Object r3 = r2.A09(r3, r0)     // Catch:{ Exception -> 0x0056 }
            if (r3 != r1) goto L_0x0039
            return r1
        L_0x0036:
            X.0eS.A00(r3)     // Catch:{ Exception -> 0x0056 }
        L_0x0039:
            X.8vc r3 = (X.C369968vc) r3     // Catch:{ Exception -> 0x0056 }
            if (r3 != 0) goto L_0x01dc
            java.lang.Object r0 = r0.A06
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.8A2 r2 = X.AnonymousClass8A1.A01(r0)
            r0 = 2166(0x876, float:3.035E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1293(0x50d, float:1.812E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0N(r1, r0)
            goto L_0x0206
        L_0x0056:
            r3 = move-exception
            java.lang.Object r0 = r0.A06
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            X.8A2 r2 = X.AnonymousClass8A1.A01(r0)
            java.lang.Class r0 = r3.getClass()
            java.lang.String r1 = r0.getSimpleName()
            X.0qQ.A07(r1)
            java.lang.String r0 = r3.getMessage()
            r2.A0N(r1, r0)
            throw r3
        L_0x0072:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 == 0) goto L_0x0084
            java.lang.Object r5 = r0.A01
            X.0rm r5 = (X.0rm) r5
            X.0eS.A00(r3)
        L_0x0080:
            r5.A00 = r3
            goto L_0x0206
        L_0x0084:
            X.0eS.A00(r3)
            java.lang.Object r5 = r0.A05
            X.0rm r5 = (X.0rm) r5
            com.instagram.share.facebook.upsell.api.CLNoticeApi r8 = com.instagram.share.facebook.upsell.api.CLNoticeApi.A00
            java.lang.Object r7 = r0.A06
            X.8qK r7 = (X.C367188qK) r7
            com.instagram.common.session.UserSession r12 = r7.A00
            java.lang.Object r11 = r0.A04
            com.google.common.collect.ImmutableList r11 = (com.google.common.collect.ImmutableList) r11
            X.0qQ.A0A(r11)
            X.8qS r4 = X.C367258qS.A00
            java.lang.Object r2 = r0.A03
            android.content.Context r2 = (android.content.Context) r2
            android.content.Context r3 = r2.getApplicationContext()
            java.lang.String r2 = r0.A07
            X.2IV r9 = r4.A01(r3, r12, r2)
            X.8qL r3 = r7.A02
            com.instagram.share.facebook.cxpnotice.noticestate.internal.CXPNoticeStateRepository r13 = r7.A01
            boolean r2 = r0.A08
            if (r2 == 0) goto L_0x00c7
            X.9ID r10 = X.C367278qU.A00(r12)
        L_0x00b6:
            r0.A01 = r5
            r0.A00 = r6
            r17 = 0
            r14 = r3
            r15 = r0
            r16 = r2
            java.lang.Object r3 = r8.A01(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            if (r3 != r1) goto L_0x0080
            return r1
        L_0x00c7:
            r10 = 0
            goto L_0x00b6
        L_0x00c9:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r11 = 1
            if (r2 == 0) goto L_0x00d5
            X.0eS.A00(r3)
            goto L_0x0206
        L_0x00d5:
            X.0eS.A00(r3)
            java.lang.Object r9 = r0.A03
            android.content.Context r9 = (android.content.Context) r9
            java.lang.Object r8 = r0.A01
            com.instagram.common.session.UserSession r8 = (com.instagram.common.session.UserSession) r8
            java.lang.String r10 = r0.A07
            boolean r2 = r0.A08
            r18 = r2
            java.lang.Object r5 = r0.A05
            X.6p0 r5 = (X.C318476p0) r5
            java.lang.Object r3 = r0.A04
            java.lang.Integer r3 = (java.lang.Integer) r3
            java.lang.Object r4 = r0.A06
            r2 = 69
            X.MId r15 = new X.MId
            r15.<init>(r4, r2)
            r0.A00 = r11
            java.lang.Integer r7 = X.C318606pE.A00(r5)
            r6 = 0
            r2 = 0
            X.0qQ.A0B(r9, r2)
            X.AnonymousClass7TF.A1B(r8, r11, r10)
            r13 = 3
            X.0qQ.A0B(r7, r13)
            r4 = 727(0x2d7, float:1.019E-42)
            java.lang.String r5 = X.C273654mx.A00(r4)
            java.lang.String r4 = "/highlights_tray/"
            java.lang.String r4 = X.002.A0g(r5, r10, r4)
            java.lang.String r22 = X.AnonymousClass7TG.A0j()
            java.lang.String r23 = X.AnonymousClass7TG.A0j()
            java.lang.Class<X.1NR> r27 = X.AnonymousClass1NR.class
            X.0bH r14 = new X.0bH
            r14.<init>(r8)
            java.lang.Integer r17 = X.AnonymousClass05K.A0C
            r16 = 0
            r5 = r17
            if (r7 == r5) goto L_0x0132
            java.lang.Integer r5 = X.AnonymousClass05K.A0Y
            r29 = 0
            if (r7 != r5) goto L_0x0134
        L_0x0132:
            r29 = 1
        L_0x0134:
            X.1NX r5 = new X.1NX
            r5.<init>(r6)
            X.1Fj r12 = new X.1Fj
            r24 = r12
            r25 = r14
            r26 = r5
            r28 = r2
            r24.<init>(r25, r26, r27, r28, r29)
            r6 = 65767057(0x3eb8691, float:1.3842954E-36)
            X.1FZ r5 = new X.1FZ
            r5.<init>(r8, r6, r11, r2)
            r5.A05()
            r5.A0A(r4)
            r5.A0A = r4
            r5.A07 = r7
            r5.A00 = r12
            X.0Tu r4 = X.0Tu.A05
            r11 = 36320008688050045(0x8108db00171f7d, double:3.0322579710345234E-306)
            boolean r11 = X.182.A06(r4, r8, r11)
            if (r11 == 0) goto L_0x016e
            java.lang.String r12 = "X-IG-Accept-Hint"
            java.lang.String r11 = "feed"
            r5.A0F(r12, r11)
        L_0x016e:
            android.util.Pair r11 = X.C278474ww.A00(r8)
            java.lang.Object r12 = r11.first
            X.0qQ.A06(r12)
            java.lang.String r12 = (java.lang.String) r12
            java.lang.Object r11 = r11.second
            java.lang.String r11 = (java.lang.String) r11
            r5.A0G(r12, r11)
            if (r18 == 0) goto L_0x018a
            X.1Cn r11 = new X.1Cn
            r11.<init>(r9)
            X.1G2.A00(r9, r5, r8, r11, r2)
        L_0x018a:
            r2 = 809(0x329, float:1.134E-42)
            java.lang.String r2 = X.C273654mx.A00(r2)
            r5.A09(r3, r2)
            java.lang.String r2 = r8.A06
            boolean r2 = r10.equals(r2)
            if (r2 == 0) goto L_0x01a8
            r2 = 36322289314179110(0x810aee00002826, double:3.0337002481818884E-306)
            boolean r2 = X.182.A06(r4, r8, r2)
            if (r2 == 0) goto L_0x01a8
            r16 = 1
        L_0x01a8:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r16)
            java.lang.String r2 = "should_include_my_week_preview"
            r5.A0E(r2, r3)
            java.lang.String r2 = "com.instagram.barcelona"
            java.lang.String r3 = X.0oI.A05(r9, r2)
            java.lang.String r2 = "threads_app_version"
            r5.A9m(r2, r3)
            X.1GP r18 = r5.A0M()
            java.lang.Integer r20 = X.AnonymousClass05K.A15
            X.1Oz r2 = new X.1Oz
            r19 = r7
            r21 = r17
            r17 = r2
            r17.<init>(r18, r19, r20, r21, r22, r23)
            X.1GP r4 = r2.A00
            r3 = 6
            X.PqW r2 = new X.PqW
            r2.<init>(r15, r3)
            java.lang.Object r0 = r4.A01(r0, r2, r6, r13)
            if (r0 != r1) goto L_0x0206
            return r1
        L_0x01dc:
            java.lang.Object r6 = r0.A04
            X.50r r6 = (X.C2801950r) r6
            if (r6 != 0) goto L_0x01e4
            X.50r r6 = X.C2801950r.CLIPS
        L_0x01e4:
            X.9P8 r1 = r3.A03
            java.lang.Object r5 = r0.A06
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            if (r1 == 0) goto L_0x0209
            java.lang.String r1 = r1.A09
            java.lang.Object r4 = r0.A05
            X.28D r4 = (X.28D) r4
            java.lang.Object r3 = r0.A03
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.String r8 = r0.A07
            java.lang.Object r7 = r0.A01
            com.instagram.pendingmedia.model.recipients.PendingRecipient r7 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r7
            boolean r9 = r0.A08
            X.IQG r2 = new X.IQG
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.C63175Ksi.A00(r5, r2, r1)
        L_0x0206:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0209:
            java.lang.Object r3 = r0.A03
            android.app.Activity r3 = (android.app.Activity) r3
            java.lang.String r8 = r0.A07
            java.lang.Object r7 = r0.A01
            com.instagram.pendingmedia.model.recipients.PendingRecipient r7 = (com.instagram.pendingmedia.model.recipients.PendingRecipient) r7
            java.lang.Object r4 = r0.A05
            X.28D r4 = (X.28D) r4
            boolean r9 = r0.A08
            X.Ijf r2 = new X.Ijf
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.11Z.A03(r2)
            goto L_0x0206
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C41547AwD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C41547AwD) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41547AwD(Activity activity, ImmutableList immutableList, C367188qK r4, String str, AnonymousClass4D7 r6, 0rm r7, boolean z) {
        super(2, r6);
        this.A02 = 1;
        this.A05 = r7;
        this.A06 = r4;
        this.A04 = immutableList;
        this.A03 = activity;
        this.A07 = str;
        this.A08 = z;
    }
}
