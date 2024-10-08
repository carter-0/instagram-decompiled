package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.user.model.User;

/* renamed from: X.MFr  reason: case insensitive filesystem */
public final class C66154MFr extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final String A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66154MFr(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, String str3, AnonymousClass4D7 r9, int i) {
        super(2, r9);
        this.A02 = i;
        this.A04 = obj;
        this.A07 = str;
        this.A06 = str2;
        this.A08 = str3;
        this.A05 = obj2;
        this.A01 = obj3;
        this.A03 = obj4;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [X.4D7, X.MFr] */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.4D7, X.MFr] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r13) {
        int i;
        String str;
        String str2;
        String str3;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        AnonymousClass4D7 r9 = r13;
        switch (this.A02) {
            case 0:
                obj5 = this.A04;
                str3 = this.A07;
                str2 = this.A06;
                str = this.A08;
                obj4 = this.A05;
                obj3 = this.A01;
                obj2 = this.A03;
                i = 0;
                break;
            case 1:
                obj4 = this.A05;
                str2 = this.A06;
                str3 = this.A07;
                obj3 = this.A01;
                obj5 = this.A04;
                obj2 = this.A03;
                str = this.A08;
                i = 1;
                break;
            default:
                ? mFr = new C66154MFr((FragmentActivity) this.A03, (FEX) this.A05, (User) this.A04, this.A08, this.A06, this.A07, r13);
                mFr.A01 = obj;
                return mFr;
        }
        return new C66154MFr(obj5, obj4, obj3, obj2, str3, str2, str, r9, i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, X.MFr] */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0119, code lost:
        X.0eS.A00(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0182, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x007b, code lost:
        if (r0 != r1) goto L_0x0180;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x007d, code lost:
        return r1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            r4 = r23
            int r1 = r0.A02
            switch(r1) {
                case 0: goto L_0x011d;
                case 1: goto L_0x007e;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 != 0) goto L_0x0119
            X.0eS.A00(r4)
            java.lang.Object r5 = r0.A01
            X.3pV r5 = (X.C252683pV) r5
            java.lang.Object r4 = r0.A05
            X.FEX r4 = (X.FEX) r4
            java.lang.Object r10 = r0.A04
            com.instagram.user.model.User r10 = (com.instagram.user.model.User) r10
            r10.getId()
            X.KVj r7 = r4.A04
            java.lang.Integer r3 = X.AnonymousClass05K.A0u
            r15 = 0
            java.lang.String r2 = "INSTAGRAM_FAN_SUBS"
            r7.A01(r3, r15, r15, r2)
            java.lang.Object r7 = r0.A03
            androidx.fragment.app.FragmentActivity r7 = (androidx.fragment.app.FragmentActivity) r7
            java.lang.String r12 = r0.A08
            X.RF1 r11 = X.RF1.ITEM_TYPE_INAPP
            org.json.JSONObject r8 = X.DbS.A11()
            java.lang.String r9 = r0.A07
            org.json.JSONArray r3 = new org.json.JSONArray
            r3.<init>()
            r2 = 0
            java.lang.Long r2 = X.C51971G9r.A0n(r2, r9)
            r3.put(r2)
            java.lang.String r2 = "receiver_id"
            r8.put(r2, r3)
            java.lang.String r3 = r10.getId()
            java.lang.String r2 = "payee_id"
            r8.put(r2, r3)
            com.instagram.common.session.UserSession r2 = r4.A02
            java.lang.String r3 = r2.A06
            java.lang.String r2 = "payer_id"
            r8.put(r2, r3)
            java.lang.String r13 = r8.toString()
            java.lang.String r14 = r0.A06
            X.QOs r10 = new X.QOs
            r16 = r15
            r10.<init>(r11, r12, r13, r14, r15, r16)
            X.FEX.A00(r7, r10, r4, r5)
            r3 = 38
            X.G2h r2 = new X.G2h
            r2.<init>(r4, r3)
            r0.A00 = r6
            java.lang.Object r0 = X.C239083Et.A00(r0, r2, r5)
        L_0x007b:
            if (r0 != r1) goto L_0x0180
            return r1
        L_0x007e:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r6 = 1
            if (r2 != 0) goto L_0x0119
            X.0eS.A00(r4)
            java.lang.Object r4 = r0.A05
            com.instagram.common.session.UserSession r4 = (com.instagram.common.session.UserSession) r4
            java.lang.String r3 = r0.A06
            java.lang.String r5 = r0.A07
            r2 = 0
            X.2IS r10 = X.C41845B3m.A04()
            X.2IS r9 = X.C41845B3m.A04()
            X.0K0 r8 = com.facebook.graphql.calls.GraphQlCallInput.A02
            java.lang.String r7 = "challenge_id"
            X.0Df r8 = X.C41845B3m.A03(r8, r3, r7)
            java.lang.String r7 = "input"
            X.DbW.A18(r8, r10, r7)
            java.lang.String r7 = "submissionId"
            boolean r7 = X.C41848B3p.A1Z(r10, r7, r5)
            X.1vR r11 = X.C41845B3m.A06(r7)
            java.util.Map r13 = r10.getParamsCopy()
            java.util.Map r14 = r9.getParamsCopy()
            java.lang.Class<X.Bos> r15 = X.C42976Bos.class
            java.util.ArrayList r21 = X.AnonymousClass7TE.A1C()
            java.lang.String r12 = "IGDirectChallengesPromptSingleSubmissionQuery"
            r16 = 0
            r18 = 96
            java.lang.String r20 = "xfb_igd_channel_challenge"
            com.facebook.pando.PandoGraphQLRequest r10 = new com.facebook.pando.PandoGraphQLRequest
            r19 = r2
            r17 = r2
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.1vn r7 = X.1vm.A01(r4)
            X.032 r10 = r7.A05(r10)
            r7 = 10
            X.JaI r8 = new X.JaI
            r8.<init>((java.lang.String) r3, (java.lang.Object) r4, (X.AnonymousClass4D7) r2, (int) r7)
            r7 = 24
            X.MCA r9 = new X.MCA
            r9.<init>((X.0sL) r8, (X.AnonymousClass0r6) r10, (int) r7)
            r8 = 38
            X.MFz r7 = new X.MFz
            r7.<init>(r8, r2)
            X.7qX r11 = new X.7qX
            r11.<init>(r7, r9)
            java.lang.Object r10 = r0.A01
            X.0sa r10 = (X.C62320sa) r10
            java.lang.Object r9 = r0.A04
            X.0sa r9 = (X.C62320sa) r9
            java.lang.Object r8 = r0.A03
            android.content.Context r8 = (android.content.Context) r8
            java.lang.String r7 = r0.A08
            com.instagram.direct.fragment.cardgallery.plugin.ChallengesLauncher$maybeOpenSubmission$1$1 r12 = new com.instagram.direct.fragment.cardgallery.plugin.ChallengesLauncher$maybeOpenSubmission$1$1
            r13 = r8
            r14 = r4
            r15 = r7
            r16 = r3
            r17 = r5
            r18 = r2
            r19 = r10
            r20 = r9
            r12.<init>(r13, r14, r15, r16, r17, r18, r19, r20)
            r0.A00 = r6
            java.lang.Object r0 = X.AnonymousClass11O.A00(r0, r12, r11)
            goto L_0x007b
        L_0x0119:
            X.0eS.A00(r4)
            goto L_0x0180
        L_0x011d:
            X.1Hj r1 = X.1Hj.A02
            int r2 = r0.A00
            r3 = 1
            if (r2 == 0) goto L_0x019a
            X.0eS.A00(r4)
        L_0x0127:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r1 = r4 instanceof X.C239793Ih
            if (r1 == 0) goto L_0x0183
            java.lang.Object r3 = r0.A05
            X.KrS r3 = (X.C63099KrS) r3
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r5 = r4.A00
            com.instagram.camera.effect.models.CameraAREffect r5 = (com.instagram.camera.effect.models.CameraAREffect) r5
            r7 = 0
            java.lang.String r4 = r5.A0C
            com.instagram.common.typedurl.ImageUrl r1 = r5.A05
            if (r1 == 0) goto L_0x018c
            java.lang.String r1 = r1.getUrl()
            if (r1 == 0) goto L_0x018c
            if (r4 == 0) goto L_0x018c
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration r2 = new com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoAttributionConfiguration
            r2.<init>(r5, r4)
            r2.A07 = r1
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode r1 = com.instagram.creation.capture.quickcapture.effectinfobottomsheet.model.EffectInfoBottomSheetMode.NORMAL
            r2.A01 = r1
            r2.A00 = r7
            com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration r8 = new com.instagram.creation.capture.quickcapture.effectinfobottomsheet.EffectInfoBottomSheetConfiguration
            r8.<init>()
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r2)
            r8.A02 = r1
            r1 = 10
            r8.A00 = r1
            X.28D r1 = X.28D.A0R
            r8.A01 = r1
            r1 = 0
            r8.A06 = r1
            java.lang.Object r6 = r0.A01
            com.instagram.common.session.UserSession r6 = (com.instagram.common.session.UserSession) r6
            java.lang.Object r4 = r0.A03
            androidx.fragment.app.FragmentActivity r4 = (androidx.fragment.app.FragmentActivity) r4
            X.LlZ r9 = new X.LlZ
            r9.<init>(r4, r3)
            X.JVj r5 = X.C59725JVj.NO_CAMERA_SESSION
            X.Lyu r10 = new X.Lyu
            r10.<init>(r4, r3)
            X.LPQ.A02(r4, r5, r6, r7, r8, r9, r10)
        L_0x0180:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x0183:
            boolean r1 = r4 instanceof X.C297815sO
            if (r1 != 0) goto L_0x018c
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x018c:
            java.lang.Object r1 = r0.A03
            android.app.Activity r1 = (android.app.Activity) r1
            r0 = 2131972463(0x7f13516f, float:1.9581934E38)
            X.C59689JTv.A07(r1, r0)
            r1.finish()
            goto L_0x0180
        L_0x019a:
            X.0eS.A00(r4)
            java.lang.Object r4 = r0.A04
            com.instagram.ar.core.effectcollection.EffectCollectionService r4 = (com.instagram.ar.core.effectcollection.EffectCollectionService) r4
            java.lang.String r6 = r0.A07
            X.8cI r5 = X.C359218cI.A0C
            java.lang.String r7 = r0.A06
            java.lang.String r2 = r0.A08
            X.0qQ.A0B(r6, r3)
            r0.A00 = r3
            r10 = 86400000(0x5265c00, double:4.2687272E-316)
            r8 = r2
            r9 = r0
            java.lang.Object r4 = com.instagram.ar.core.effectcollection.EffectCollectionService.A03(r4, r5, r6, r7, r8, r9, r10)
            if (r4 != r1) goto L_0x0127
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66154MFr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C66154MFr) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66154MFr(FragmentActivity fragmentActivity, FEX fex, User user, String str, String str2, String str3, AnonymousClass4D7 r8) {
        super(2, r8);
        this.A02 = 2;
        this.A05 = fex;
        this.A04 = user;
        this.A03 = fragmentActivity;
        this.A08 = str;
        this.A06 = str2;
        this.A07 = str3;
    }
}
