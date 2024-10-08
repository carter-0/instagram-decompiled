package X;

import android.app.Activity;
import com.instagram.profilecard.domain.ProfileCardViewModel;
import com.instagram.user.model.User;

/* renamed from: X.MGr  reason: case insensitive filesystem */
public final class C66180MGr extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public final int A06;
    public final Object A07;
    public final String A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66180MGr(User user, C60213JhW jhW, String str, AnonymousClass4D7 r5) {
        super(2, r5);
        this.A06 = 4;
        this.A05 = jhW;
        this.A07 = user;
        this.A08 = str;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [X.MGr, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v1, types: [X.MGr, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4, types: [X.MGr, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r17) {
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        Object obj7;
        String str;
        int i;
        Object obj8 = obj;
        AnonymousClass4D7 r13 = r17;
        switch (this.A06) {
            case 0:
                Object obj9 = this.A04;
                Object obj10 = this.A07;
                String str2 = this.A08;
                Object obj11 = this.A01;
                return new C66180MGr(obj9, obj10, this.A02, this.A03, obj11, str2, r13, 0);
            case 1:
                obj2 = this.A05;
                obj3 = this.A07;
                obj4 = this.A04;
                obj5 = this.A01;
                obj6 = this.A03;
                obj7 = this.A02;
                str = this.A08;
                i = 1;
                break;
            case 2:
                Object obj12 = this.A04;
                String str3 = this.A08;
                C66180MGr mGr = new C66180MGr(obj12, this.A07, this.A02, this.A03, this.A01, str3, r13, 2);
                mGr.A05 = obj8;
                return mGr;
            case 3:
                ? mGr2 = new C66180MGr((Activity) this.A07, (AnonymousClass0iw) this.A01, (L3W) this.A02, (ProfileCardViewModel) this.A05, this.A08, r13);
                mGr2.A03 = obj8;
                return mGr2;
            case 4:
                return new C66180MGr((User) this.A07, (C60213JhW) this.A05, this.A08, r13);
            default:
                obj7 = this.A02;
                str = this.A08;
                obj5 = this.A01;
                obj6 = this.A03;
                obj3 = this.A07;
                obj2 = this.A05;
                obj4 = this.A04;
                i = 5;
                break;
        }
        return new C66180MGr(obj2, obj3, obj4, obj5, obj6, obj7, str, r13, i);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.MGr, X.4D7] */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x031e, code lost:
        if (r0 != r1) goto L_0x03ed;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0320, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x0346, code lost:
        X.0eS.A00(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x03ef, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x01d8  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            r0 = r22
            r2 = r23
            int r1 = r0.A06
            switch(r1) {
                case 0: goto L_0x034b;
                case 1: goto L_0x029f;
                case 2: goto L_0x0202;
                case 3: goto L_0x0149;
                case 4: goto L_0x00dc;
                default: goto L_0x0009;
            }
        L_0x0009:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r5 = 1
            if (r3 == 0) goto L_0x004c
            if (r3 != r5) goto L_0x00d7
            X.0eS.A00(r2)
        L_0x0015:
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L_0x03ed
            boolean r1 = r2.isEmpty()
            if (r1 != 0) goto L_0x03ed
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r7 = r2.iterator()
        L_0x0027:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L_0x0062
            java.lang.Object r6 = r7.next()
            r1 = r6
            com.instagram.common.gallery.Medium r1 = (com.instagram.common.gallery.Medium) r1
            java.lang.String r1 = r1.A0X
            java.io.File r1 = X.AnonymousClass7TE.A0t(r1)
            long r4 = r1.length()
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            boolean r1 = X.AnonymousClass7TF.A1R(r1)
            if (r1 == 0) goto L_0x0027
            r8.add(r6)
            goto L_0x0027
        L_0x004c:
            X.0eS.A00(r2)
            java.lang.Object r4 = r0.A02
            X.I75 r4 = (X.I75) r4
            java.lang.String r3 = r0.A08
            java.lang.Object r2 = r0.A01
            java.util.List r2 = (java.util.List) r2
            r0.A00 = r5
            java.lang.Object r2 = r4.A07(r2, r3, r0)
            if (r2 != r1) goto L_0x0015
            return r1
        L_0x0062:
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1D(r8)
            java.lang.Object r1 = r0.A03
            java.util.Collection r1 = (java.util.Collection) r1
            java.util.ArrayList r9 = X.AnonymousClass7TE.A1D(r1)
            java.lang.String r7 = r0.A08
            java.lang.Object r2 = r0.A07
            X.4bN r2 = (X.C267324bN) r2
            X.GmI r1 = r2.A01()
            com.instagram.api.schemas.ClipsACRMidCardSubType r1 = r1.A03
            if (r1 == 0) goto L_0x0083
            int r1 = r1.ordinal()
            switch(r1) {
                case 1: goto L_0x00d4;
                case 2: goto L_0x0083;
                case 3: goto L_0x00d4;
                case 4: goto L_0x0083;
                case 5: goto L_0x00d1;
                case 6: goto L_0x00d1;
                case 7: goto L_0x00d1;
                case 8: goto L_0x00ce;
                case 9: goto L_0x00ce;
                default: goto L_0x0083;
            }
        L_0x0083:
            r6 = 0
        L_0x0084:
            X.GmI r3 = r2.A01()
            com.instagram.api.schemas.InstagramMidcardType r1 = r3.A05
            int r2 = r1.ordinal()
            r1 = 33
            r10 = 29
            if (r2 == r1) goto L_0x00c1
            r1 = 12
            if (r2 != r1) goto L_0x009a
            r10 = 40
        L_0x009a:
            r5 = 0
            r11 = 0
            java.util.List r1 = X.ABX.A01(r6, r7, r8, r9, r10, r11)
            java.lang.Object r4 = r0.A05
            instagram.features.clips.viewer.video.ClipsMidcardVirtualVideoPlayerController r4 = (instagram.features.clips.viewer.video.ClipsMidcardVirtualVideoPlayerController) r4
            com.instagram.common.session.UserSession r3 = r4.A05
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1D(r1)
            java.lang.Object r1 = r0.A04
            com.instagram.music.common.model.AudioOverlayTrack r1 = (com.instagram.music.common.model.AudioOverlayTrack) r1
            r0 = 0
            com.facebook.videolite.transcoder.base.composition.MediaComposition r1 = X.ABX.A00(r5, r3, r1, r2, r0)
            X.HnX r0 = r4.midcardPlayerManager
            if (r0 != 0) goto L_0x03e3
            java.lang.String r0 = "midcardPlayerManager"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00c1:
            com.instagram.api.schemas.ClipsACRMidCardSubType r2 = r3.A03
            com.instagram.api.schemas.ClipsACRMidCardSubType r1 = com.instagram.api.schemas.ClipsACRMidCardSubType.ACR_SMART_REELS
            if (r2 == r1) goto L_0x00cb
            com.instagram.api.schemas.ClipsACRMidCardSubType r1 = com.instagram.api.schemas.ClipsACRMidCardSubType.ACR_SMART_REELS_3D
            if (r2 != r1) goto L_0x009a
        L_0x00cb:
            r10 = 30
            goto L_0x009a
        L_0x00ce:
            com.instagram.api.schemas.ACRType r6 = com.instagram.api.schemas.ACRType.HIGHLIGHT_REEL
            goto L_0x0084
        L_0x00d1:
            com.instagram.api.schemas.ACRType r6 = com.instagram.api.schemas.ACRType.SMART_REEL
            goto L_0x0084
        L_0x00d4:
            com.instagram.api.schemas.ACRType r6 = com.instagram.api.schemas.ACRType.FEED_CAROUSEL_HISTORICAL
            goto L_0x0084
        L_0x00d7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00dc:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r8 = 1
            if (r3 == 0) goto L_0x0116
            if (r3 != r8) goto L_0x0144
            java.lang.Object r7 = r0.A04
            X.JvD r7 = (X.C61013JvD) r7
            java.lang.Object r14 = r0.A03
            java.lang.String r14 = (java.lang.String) r14
            java.lang.Object r5 = r0.A02
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            java.lang.Object r6 = r0.A01
            X.JhW r6 = (X.C60213JhW) r6
            X.0eS.A00(r2)
        L_0x00f8:
            boolean r0 = X.AnonymousClass7TE.A1a(r2)
            X.LF6 r8 = r6.A00
            if (r0 == 0) goto L_0x0113
            java.lang.String r9 = "confirm"
        L_0x0102:
            java.lang.String r10 = r5.getId()
            java.lang.String r11 = r7.A08
            java.lang.String r12 = X.C61013JvD.A00(r7)
            java.lang.String r13 = r7.A09
            r8.A01(r9, r10, r11, r12, r13, r14)
            goto L_0x03ed
        L_0x0113:
            java.lang.String r9 = "fail"
            goto L_0x0102
        L_0x0116:
            X.0eS.A00(r2)
            java.lang.Object r6 = r0.A05
            X.JhW r6 = (X.C60213JhW) r6
            com.instagram.video.live.mvvm.model.repository.core.IgLiveBroadcastInfoManager r2 = r6.A02
            X.JvD r7 = X.JTQ.A0Q(r2)
            if (r7 == 0) goto L_0x03ed
            java.lang.Object r5 = r0.A07
            com.instagram.user.model.User r5 = (com.instagram.user.model.User) r5
            java.lang.String r14 = r0.A08
            com.instagram.video.live.mvvm.model.repository.IgLiveModerationRepository r4 = r6.A01
            java.lang.String r3 = r7.A08
            java.lang.String r2 = r5.getId()
            r0.A01 = r6
            r0.A02 = r5
            r0.A03 = r14
            r0.A04 = r7
            r0.A00 = r8
            java.lang.Object r2 = r4.A00(r3, r2, r0)
            if (r2 != r1) goto L_0x00f8
            return r1
        L_0x0144:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0149:
            X.1Hj r1 = X.1Hj.A02
            int r4 = r0.A00
            r6 = 2
            r3 = 1
            if (r4 == 0) goto L_0x015c
            if (r4 == r3) goto L_0x016e
            java.lang.Object r7 = r0.A04
            X.LDv r7 = (X.C63935LDv) r7
            java.lang.Object r5 = r0.A03
            X.4Cq r5 = (X.C262224Cq) r5
            goto L_0x01ca
        L_0x015c:
            X.0eS.A00(r2)
            java.lang.Object r5 = r0.A03
            X.4Cq r5 = (X.C262224Cq) r5
            r0.A03 = r5
            r0.A00 = r3
            java.lang.Object r2 = X.C241603Pv.A00(r0)
            if (r2 != r1) goto L_0x0174
            return r1
        L_0x016e:
            java.lang.Object r3 = r0.A03
            X.4Cq r5 = X.JTO.A1D(r3, r2)
        L_0x0174:
            java.lang.Object r7 = r0.A05
            com.instagram.profilecard.domain.ProfileCardViewModel r7 = (com.instagram.profilecard.domain.ProfileCardViewModel) r7
            X.05G r9 = r7.A0K
        L_0x017a:
            java.lang.Object r8 = r9.getValue()
            r4 = r8
            X.GnU r4 = (X.C53397GnU) r4
            r3 = 0
            r2 = 8382463(0x7fe7ff, float:1.1746333E-38)
            X.GnU r2 = X.C53397GnU.A00((com.instagram.common.typedurl.ImageUrl) null, r3, r3, r4, (java.lang.Integer) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.lang.String) null, (java.util.Map) null, 0.0f, 0.0f, 0.0f, r2, false, false, false, false, false, false, false, false, false, false)
            boolean r2 = r9.AIY(r8, r2)
            if (r2 == 0) goto L_0x017a
            java.lang.Object r2 = r0.A02     // Catch:{ all -> 0x01ea }
            X.L3W r2 = (X.L3W) r2     // Catch:{ all -> 0x01ea }
            X.3Ns r4 = new X.3Ns     // Catch:{ all -> 0x01ea }
            r4.<init>()     // Catch:{ all -> 0x01ea }
            X.0V2 r3 = r2.A00     // Catch:{ all -> 0x01ea }
            X.Kzw r2 = new X.Kzw     // Catch:{ all -> 0x01ea }
            r2.<init>(r4)     // Catch:{ all -> 0x01ea }
            r3.FIA(r2)     // Catch:{ all -> 0x01ea }
            java.lang.Object r8 = r0.A07     // Catch:{ all -> 0x01ea }
            android.app.Activity r8 = (android.app.Activity) r8     // Catch:{ all -> 0x01ea }
            com.instagram.common.session.UserSession r10 = r7.A0F     // Catch:{ all -> 0x01ea }
            java.lang.Object r9 = r0.A01     // Catch:{ all -> 0x01ea }
            X.0iw r9 = (X.AnonymousClass0iw) r9     // Catch:{ all -> 0x01ea }
            java.lang.String r11 = r0.A08     // Catch:{ all -> 0x01ea }
            X.0Ud r2 = r7.A0L     // Catch:{ all -> 0x01ea }
            java.lang.Object r2 = r2.getValue()     // Catch:{ all -> 0x01ea }
            X.GnU r2 = (X.C53397GnU) r2     // Catch:{ all -> 0x01ea }
            java.lang.String r12 = r2.A08     // Catch:{ all -> 0x01ea }
            X.LDv r7 = new X.LDv     // Catch:{ all -> 0x01ea }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x01ea }
            r0.A03 = r5     // Catch:{ all -> 0x01ea }
            r0.A04 = r7     // Catch:{ all -> 0x01ea }
            r0.A00 = r6     // Catch:{ all -> 0x01ea }
            java.lang.Object r2 = r4.A0E(r0)     // Catch:{ all -> 0x01ea }
            if (r2 != r1) goto L_0x01cd
            return r1
        L_0x01ca:
            X.0eS.A00(r2)     // Catch:{ all -> 0x01ea }
        L_0x01cd:
            X.60f r2 = (X.C3018260f) r2     // Catch:{ all -> 0x01ea }
            r7.A00(r2)     // Catch:{ all -> 0x01ea }
            boolean r1 = X.19E.A07(r5)
            if (r1 == 0) goto L_0x03ed
            java.lang.Object r2 = r0.A05
            com.instagram.profilecard.domain.ProfileCardViewModel r2 = (com.instagram.profilecard.domain.ProfileCardViewModel) r2
            java.lang.Object r1 = r0.A07
            android.app.Activity r1 = (android.app.Activity) r1
            X.37E r0 = X.AnonymousClass37D.A00
            X.DbX.A10(r1, r0)
            com.instagram.profilecard.domain.ProfileCardViewModel.A03(r2)
            goto L_0x03ed
        L_0x01ea:
            r3 = move-exception
            boolean r1 = X.19E.A07(r5)
            if (r1 == 0) goto L_0x0345
            java.lang.Object r2 = r0.A05
            com.instagram.profilecard.domain.ProfileCardViewModel r2 = (com.instagram.profilecard.domain.ProfileCardViewModel) r2
            java.lang.Object r1 = r0.A07
            android.app.Activity r1 = (android.app.Activity) r1
            X.37E r0 = X.AnonymousClass37D.A00
            X.DbX.A10(r1, r0)
            com.instagram.profilecard.domain.ProfileCardViewModel.A03(r2)
            throw r3
        L_0x0202:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r14 = 1
            if (r3 == 0) goto L_0x0210
            if (r3 == r14) goto L_0x0346
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0210:
            X.0eS.A00(r2)
            java.lang.Object r4 = r0.A05
            X.3pV r4 = (X.C252683pV) r4
            java.lang.Object r5 = r0.A04
            com.instagram.common.session.UserSession r5 = (com.instagram.common.session.UserSession) r5
            java.lang.String r3 = r0.A08
            r15 = 0
            r9 = 0
            r2 = 397594746(0x17b2d07a, float:1.1555607E-24)
            X.1FZ r6 = new X.1FZ
            r6.<init>(r5, r2, r14, r15)
            java.lang.String r2 = "clips/templates_browser_v2/"
            r6.A0A(r2)
            r6.A04()
            java.lang.Class<X.Cye> r13 = X.C45566Cye.class
            X.0bH r11 = new X.0bH
            r11.<init>(r5)
            X.1NX r12 = new X.1NX
            r12.<init>(r9)
            X.1Fj r10 = new X.1Fj
            r10.<init>(r11, r12, r13, r14, r15)
            r6.A00 = r10
            java.lang.String r2 = "template_category"
            r6.A9m(r2, r3)
            java.lang.Object r2 = r0.A07
            com.instagram.api.schemas.ClipsTemplateBrowserV2Type r2 = (com.instagram.api.schemas.ClipsTemplateBrowserV2Type) r2
            if (r2 == 0) goto L_0x029d
            java.lang.String r3 = r2.A00
        L_0x024f:
            java.lang.String r2 = "template_browser_type"
            r6.A0G(r2, r3)
            X.1GP r7 = r6.A0M()
            X.Hng r8 = X.HWS.A00(r5)
            java.lang.Object r2 = r0.A01
            java.util.Map r2 = (java.util.Map) r2
            X.Lem r6 = new X.Lem
            r6.<init>(r8, r2, r4)
            r7.A02(r6)
            java.lang.Object r5 = r0.A02
            android.content.Context r5 = (android.content.Context) r5
            java.lang.Object r3 = r0.A03
            X.07i r3 = (X.AnonymousClass07i) r3
            X.2lw r2 = new X.2lw
            r2.<init>(r5, r3, r9)
            r2.schedule(r7)
            r8.A00 = r15
            X.0eM r2 = r8.A04
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r5 = X.C51965G9l.A0a(r2)
            r3 = 357642199(0x15512fd7, float:4.2244953E-26)
            java.lang.String r2 = "user"
            long r2 = r5.flowStartForMarker(r3, r2, r15)
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r8.A01 = r2
            r3 = 7
            X.Ins r2 = new X.Ins
            r2.<init>(r3, r6, r7)
            r0.A00 = r14
            java.lang.Object r0 = X.C239083Et.A00(r0, r2, r4)
            goto L_0x031e
        L_0x029d:
            r3 = 0
            goto L_0x024f
        L_0x029f:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r7 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0321
            if (r3 != r6) goto L_0x0346
            X.0eS.A00(r2)
        L_0x02ac:
            X.3Ii r2 = (X.C239803Ii) r2
            java.lang.Object r5 = r0.A05
            X.72N r5 = (X.AnonymousClass72N) r5
            java.lang.Object r11 = r0.A01
            android.content.Context r11 = (android.content.Context) r11
            java.lang.Object r12 = r0.A03
            androidx.fragment.app.FragmentActivity r12 = (androidx.fragment.app.FragmentActivity) r12
            java.lang.Object r4 = r0.A02
            java.util.List r4 = (java.util.List) r4
            java.lang.String r9 = r0.A08
            boolean r3 = r2 instanceof X.C239793Ih
            if (r3 == 0) goto L_0x033d
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r14 = r2.A00
            X.5kq r14 = (X.C293505kq) r14
            com.instagram.common.session.UserSession r13 = r5.A07
            com.instagram.pendingmedia.store.PendingMediaStore r3 = X.28K.A00(r13)
            java.lang.String r2 = r14.A0i
            X.3Q2 r15 = r3.A03(r2)
            if (r15 == 0) goto L_0x0300
            r16 = 0
            r20 = 0
            X.C51973G9u.A1E(r11, r12, r13)
            r8 = 3
            X.AnonymousClass7TG.A1S(r4, r14)
            X.12T r3 = X.AnonymousClass12T.A00
            r2 = 653905865(0x26f9cfc9, float:1.7334166E-15)
            X.0nV r2 = r3.AOJ(r2, r8)
            X.19S r2 = X.19E.A02(r2)
            com.instagram.creation.capture.quickcapture.controller.helper.ClipsDirectSendHelper$sendVideoToDirect$2 r10 = new com.instagram.creation.capture.quickcapture.controller.helper.ClipsDirectSendHelper$sendVideoToDirect$2
            r19 = r16
            r21 = r6
            r18 = r4
            r17 = r9
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.AnonymousClass7TE.A1Z(r10, r2)
        L_0x0300:
            com.instagram.creation.capture.quickcapture.analytics.common.ShareMediaLoggingInfo r2 = r14.A0B
            if (r2 == 0) goto L_0x0306
            r2.A11 = r6
        L_0x0306:
            X.JXe r3 = new X.JXe
            r3.<init>()
            X.JXc r2 = X.C59764JXc.A00(r2)
            r3.A0k = r2
            X.5kq r4 = r3.A01(r14)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r3 = r5.A08
            r2 = 0
            r0.A00 = r7
            java.lang.Object r0 = r3.A0A(r2, r4, r0)
        L_0x031e:
            if (r0 != r1) goto L_0x03ed
            return r1
        L_0x0321:
            X.0eS.A00(r2)
            java.lang.Object r2 = r0.A05
            X.72N r2 = (X.AnonymousClass72N) r2
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r4 = r2.A08
            java.lang.Object r2 = r0.A07
            X.8vc r2 = (X.C369968vc) r2
            java.lang.String r3 = r2.A09
            java.lang.Object r2 = r0.A04
            X.LO6 r2 = (X.LO6) r2
            r0.A00 = r6
            java.lang.Object r2 = r4.A0H(r2, r3, r0)
            if (r2 != r1) goto L_0x02ac
            return r1
        L_0x033d:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x03ed
            X.Wub r3 = X.AnonymousClass7TE.A1K()
        L_0x0345:
            throw r3
        L_0x0346:
            X.0eS.A00(r2)
            goto L_0x03ed
        L_0x034b:
            X.1Hj r1 = X.1Hj.A02
            int r3 = r0.A00
            r7 = 1
            if (r3 == 0) goto L_0x0370
            if (r3 != r7) goto L_0x03f5
            X.0eS.A00(r2)
        L_0x0357:
            X.3Ii r2 = (X.C239803Ii) r2
            java.lang.Object r4 = r0.A01
            X.6Rx r4 = (X.C307896Rx) r4
            java.lang.Object r3 = r0.A03
            X.4uI r3 = (X.C277014uI) r3
            java.lang.Object r1 = r0.A02
            X.4uI r1 = (X.C277014uI) r1
            boolean r0 = r2 instanceof X.C297815sO
            r6 = 0
            if (r0 == 0) goto L_0x0391
            java.lang.Object[] r0 = new java.lang.Object[r6]
            X.C308206Td.A0E(r4, r1, r0)
            goto L_0x03ed
        L_0x0370:
            X.0eS.A00(r2)
            X.LNh r5 = X.C64106LNh.A00
            X.C66631pj.A00()
            java.lang.Object r2 = r0.A04
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r4 = r0.A07
            java.util.List r4 = (java.util.List) r4
            java.lang.String r3 = r0.A08
            r0.A05 = r5
            r0.A00 = r7
            com.instagram.wellbeing.equity.diversity.DiversityInfoRepository r2 = X.C63496Ky2.A00(r2)
            java.lang.Object r2 = r2.A05(r4, r3, r0)
            if (r2 != r1) goto L_0x0357
            return r1
        L_0x0391:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x03f0
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r5 = r2.A00
            X.3lr r5 = (X.C250663lr) r5
            if (r5 == 0) goto L_0x03c3
            X.KiV r1 = X.C62598KiV.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "diversity_type"
            com.google.common.collect.ImmutableList r0 = r5.getRequiredCompactedEnumListField(r7, r0, r1)
            if (r0 == 0) goto L_0x03c3
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x03af:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x03c5
            java.lang.Object r0 = r1.next()
            X.KiV r0 = (X.C62598KiV) r0
            java.lang.String r0 = r0.name()
            r2.add(r0)
            goto L_0x03af
        L_0x03c3:
            X.0sn r2 = X.0sn.A00
        L_0x03c5:
            if (r5 == 0) goto L_0x03d9
            X.KiW r1 = X.C62599KiW.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            java.lang.String r0 = "ethnicity"
            java.lang.Enum r0 = r5.getOptionalEnumField(r6, r0, r1)
            X.KiW r0 = (X.C62599KiW) r0
            if (r0 == 0) goto L_0x03d9
            java.lang.String r0 = r0.name()
            if (r0 != 0) goto L_0x03db
        L_0x03d9:
            java.lang.String r0 = ""
        L_0x03db:
            java.lang.Object[] r0 = new java.lang.Object[]{r2, r0}
            X.C308206Td.A0E(r4, r3, r0)
            goto L_0x03ed
        L_0x03e3:
            X.0qQ.A0B(r1, r11)
            X.LVB r0 = r0.A00
            if (r0 == 0) goto L_0x03ed
            r0.A01(r1)
        L_0x03ed:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x03f0:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x03f5:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66180MGr.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C66180MGr) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66180MGr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, AnonymousClass4D7 r8, int i) {
        super(2, r8);
        this.A06 = i;
        this.A04 = obj;
        this.A08 = str;
        this.A07 = obj2;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A01 = obj5;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66180MGr(Activity activity, AnonymousClass0iw r3, L3W l3w, ProfileCardViewModel profileCardViewModel, String str, AnonymousClass4D7 r7) {
        super(2, r7);
        this.A06 = 3;
        this.A05 = profileCardViewModel;
        this.A02 = l3w;
        this.A07 = activity;
        this.A01 = r3;
        this.A08 = str;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66180MGr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, AnonymousClass4D7 r9, int i) {
        super(2, r9);
        this.A06 = i;
        this.A05 = obj;
        this.A07 = obj2;
        this.A04 = obj3;
        this.A01 = obj4;
        this.A03 = obj5;
        this.A02 = obj6;
        this.A08 = str;
    }
}
