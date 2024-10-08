package X;

import android.content.DialogInterface;

public final class LV3 implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;

    public LV3(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static LV3 A00(Object obj, int i) {
        return new LV3(obj, i);
    }

    public static void A01(C358248ab r1, Object obj, int i, int i2) {
        r1.A0I(new LV3(obj, i), i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:104:0x0247, code lost:
        r3.A05(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x024a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x0406, code lost:
        r0.A0C(r7);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x0409, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x051a, code lost:
        X.DbT.A1J(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x051d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x009a, code lost:
        r0 = (X.C62320sa) r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00b4, code lost:
        X.0qQ.A0F(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00bb, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        r0.invoke();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00d4, code lost:
        r2 = r1.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0187, code lost:
        if (r0 == null) goto L_?;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x019c, code lost:
        r2.finish();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x019f, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.content.DialogInterface r17, int r18) {
        /*
            r16 = this;
            r2 = r16
            int r0 = r2.A00
            switch(r0) {
                case 5: goto L_0x04f4;
                case 6: goto L_0x04e6;
                case 7: goto L_0x04e6;
                case 8: goto L_0x04d6;
                case 9: goto L_0x0510;
                case 10: goto L_0x018b;
                case 11: goto L_0x04ce;
                case 12: goto L_0x04c6;
                case 13: goto L_0x04c6;
                case 14: goto L_0x0181;
                case 15: goto L_0x017a;
                case 16: goto L_0x0181;
                case 17: goto L_0x017a;
                case 18: goto L_0x04be;
                case 19: goto L_0x04b5;
                case 20: goto L_0x0496;
                case 21: goto L_0x007c;
                case 22: goto L_0x0035;
                case 23: goto L_0x048a;
                case 24: goto L_0x013c;
                case 25: goto L_0x047f;
                case 26: goto L_0x0477;
                case 27: goto L_0x0467;
                case 28: goto L_0x045d;
                case 29: goto L_0x045d;
                case 30: goto L_0x045d;
                case 31: goto L_0x003d;
                case 32: goto L_0x011a;
                case 33: goto L_0x00f9;
                case 34: goto L_0x044c;
                case 35: goto L_0x043c;
                case 36: goto L_0x00eb;
                case 37: goto L_0x040a;
                case 38: goto L_0x050c;
                case 39: goto L_0x03c5;
                case 40: goto L_0x050c;
                case 41: goto L_0x0389;
                case 42: goto L_0x0381;
                case 43: goto L_0x0379;
                case 44: goto L_0x0363;
                case 45: goto L_0x0357;
                case 46: goto L_0x00aa;
                case 47: goto L_0x034e;
                case 48: goto L_0x009e;
                case 49: goto L_0x0334;
                case 50: goto L_0x0318;
                case 51: goto L_0x030a;
                case 52: goto L_0x0094;
                case 53: goto L_0x0091;
                case 54: goto L_0x0302;
                case 55: goto L_0x02f6;
                case 56: goto L_0x001b;
                case 57: goto L_0x02ea;
                case 58: goto L_0x0094;
                case 59: goto L_0x0091;
                case 60: goto L_0x02cd;
                case 61: goto L_0x02c3;
                case 62: goto L_0x02b1;
                case 63: goto L_0x0276;
                case 64: goto L_0x025c;
                case 65: goto L_0x0254;
                case 66: goto L_0x024b;
                case 67: goto L_0x0235;
                case 68: goto L_0x0222;
                case 69: goto L_0x000f;
                case 70: goto L_0x020e;
                default: goto L_0x0007;
            }
        L_0x0007:
            java.lang.Object r0 = r2.A01
            X.0sa r0 = (X.C62320sa) r0
        L_0x000b:
            r0.invoke()
        L_0x000e:
            return
        L_0x000f:
            java.lang.Object r0 = r2.A01
            X.Lp2 r0 = (X.C65198Lp2) r0
            X.KHY r1 = r0.A00
            if (r1 != 0) goto L_0x01a0
            java.lang.String r4 = "recommendOnFbContainer"
            goto L_0x00b4
        L_0x001b:
            X.6SR r1 = X.AnonymousClass6SR.A01()
            java.lang.String r0 = "cancel"
            r1.A0B = r0
            java.lang.Object r2 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r2 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r2
            boolean r0 = X.LSR.A05(r2)
            if (r0 == 0) goto L_0x0202
            X.LAE r1 = r2.A04
            if (r1 != 0) goto L_0x01a5
            java.lang.String r4 = "feedPromoteFlowToggleRowController"
            goto L_0x00b4
        L_0x0035:
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.FragmentActivity r2 = X.DbT.A0E(r0)
            goto L_0x019c
        L_0x003d:
            java.lang.Object r4 = r2.A01
            X.Jal r4 = (X.C59867Jal) r4
            r17.getClass()
            r17.dismiss()
            X.Jat r2 = r4.A0e
            X.Jav r1 = r2.A06
        L_0x004b:
            X.Jaw r0 = r1.A01
            java.util.LinkedList r0 = r0.A01
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0059
            r1.A00()
            goto L_0x004b
        L_0x0059:
            com.instagram.common.session.UserSession r3 = r2.A04
            com.instagram.pendingmedia.store.PendingMediaStore r2 = X.28K.A00(r3)
            X.1iA r1 = X.1iA.A0a
            X.0sl r0 = X.0sl.A00
            r2.A0C(r1, r0)
            X.JTP.A1M(r3)
            android.content.Context r2 = r4.getContext()
            android.app.Activity r2 = (android.app.Activity) r2
            com.instagram.common.session.UserSession r0 = r4.A0a
            X.2cc r1 = X.C71342cb.A00(r0)
            java.lang.String r0 = "back"
            r1.A0A(r2, r0)
            goto L_0x019c
        L_0x007c:
            java.lang.Object r1 = r2.A01
            X.K61 r1 = (X.K61) r1
            com.instagram.igds.components.form.IgFormField r0 = r1.A01
            java.lang.String r4 = "inputField"
            if (r0 == 0) goto L_0x00b4
            r0.requestFocus()
            com.instagram.igds.components.form.IgFormField r0 = r1.A01
            if (r0 == 0) goto L_0x00b4
            X.0nA.A0M(r0)
            return
        L_0x0091:
            java.lang.Object r0 = r2.A01
            goto L_0x009a
        L_0x0094:
            java.lang.Object r0 = r2.A01
            X.GAX r0 = (X.GAX) r0
            java.lang.Object r0 = r0.A04
        L_0x009a:
            X.0sa r0 = (X.C62320sa) r0
            goto L_0x0187
        L_0x009e:
            java.lang.Object r0 = r2.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r0 = (com.instagram.creation.fragment.EditMediaInfoFragment) r0
            X.8Wq r0 = r0.A0Q
            if (r0 == 0) goto L_0x000e
            X.C357128Wq.A00(r0)
            return
        L_0x00aa:
            java.lang.Object r3 = r2.A01
            com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment r3 = (com.instagram.creation.capture.quickcapture.sundial.edit.ClipsStackedTimelineFragment) r3
            X.8RF r0 = r3.A0d
            if (r0 != 0) goto L_0x00bc
            java.lang.String r4 = "clipsTimelineEditorViewModel"
        L_0x00b4:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00bc:
            X.8RH r1 = r0.A0E()
            boolean r0 = r1 instanceof X.C355868Rr
            if (r0 == 0) goto L_0x000e
            X.8Rr r1 = (X.C355868Rr) r1
            if (r1 == 0) goto L_0x000e
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r3.A0Z
            java.lang.String r4 = "clipsCreationViewModel"
            if (r0 == 0) goto L_0x00b4
            X.831 r0 = X.JTQ.A0K(r0)
            if (r0 == 0) goto L_0x000e
            int r2 = r1.A00
            X.51M r0 = X.JTO.A0f(r0, r2)
            if (r0 == 0) goto L_0x000e
            float r1 = r0.A00
            r0 = 0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L_0x000e
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r3.A0Z
            if (r0 == 0) goto L_0x00b4
            r0.A0R(r2)
            return
        L_0x00eb:
            java.lang.Object r0 = r2.A01
            X.UAO r0 = (X.UAO) r0
            X.WPf r1 = r0.A01
            if (r1 == 0) goto L_0x000e
            java.lang.String r0 = r0.A0H
            r1.A04(r0)
            return
        L_0x00f9:
            java.lang.Object r2 = r2.A01
            X.Ll4 r2 = (X.C64965Ll4) r2
            java.lang.Integer r1 = r2.A0D
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r0) goto L_0x0107
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            if (r1 != r0) goto L_0x0117
        L_0x0107:
            X.L05 r0 = r2.A04
            boolean r0 = r0 instanceof X.C61734KJz
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0117
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r2.A0A
        L_0x0111:
            if (r0 == 0) goto L_0x000e
            r0.callOnClick()
            return
        L_0x0117:
            com.instagram.igds.components.mediabutton.IgdsMediaButton r0 = r2.A0C
            goto L_0x0111
        L_0x011a:
            java.lang.Object r0 = r2.A01
            X.Jal r0 = (X.C59867Jal) r0
            X.MQE r1 = r0.A04
            r1.getClass()
            com.instagram.creation.capture.MediaCaptureFragment r1 = (com.instagram.creation.capture.MediaCaptureFragment) r1
            X.82p r0 = r1.A04
            com.instagram.creation.base.CreationSession r0 = X.JWE.A01(r0)
            com.instagram.model.creation.MediaCaptureConfig r0 = r0.A09
            if (r0 == 0) goto L_0x000e
            boolean r0 = r0.A06
            if (r0 == 0) goto L_0x000e
            X.Jah r2 = r1.mMediaTabHost
            com.instagram.creation.base.ui.mediatabbar.Tab r1 = X.JXL.A00
            r0 = 1
            r2.A03(r1, r0)
            return
        L_0x013c:
            java.lang.Object r1 = r2.A01
            X.L5V r1 = (X.L5V) r1
            if (r1 == 0) goto L_0x000e
            X.Lgb r0 = r1.A00
            X.0eM r0 = r0.A08
            java.lang.Object r6 = r0.getValue()
            X.JjB r6 = (X.C60310JjB) r6
            X.KoG r0 = r1.A01
            X.Kf8 r0 = (X.C62397Kf8) r0
            X.3uh r4 = r0.A00
            java.lang.String r9 = r0.A02
            java.lang.String r10 = r0.A03
            X.6gd r5 = r0.A01
            r0 = 0
            X.AnonymousClass7TF.A1C(r4, r0, r5)
            r6.A03 = r0
            X.1Av r3 = r6.A05
            r11 = 1
            X.0s0 r2 = r3.A6N
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 112(0x70, float:1.57E-43)
            X.AnonymousClass7TF.A1J(r3, r2, r1, r0, r11)
            X.4gL r0 = r4.A0c
            if (r0 == 0) goto L_0x0178
            java.lang.String r8 = r0.A0X
            r8.getClass()
        L_0x0173:
            r7 = 0
            X.C60310JjB.A00(r5, r6, r7, r8, r9, r10, r11)
            return
        L_0x0178:
            r8 = 0
            goto L_0x0173
        L_0x017a:
            java.lang.Object r0 = r2.A01
            X.LAD r0 = (X.LAD) r0
            X.0sa r0 = r0.A05
            goto L_0x0187
        L_0x0181:
            java.lang.Object r0 = r2.A01
            X.LAD r0 = (X.LAD) r0
            X.0sa r0 = r0.A04
        L_0x0187:
            if (r0 == 0) goto L_0x000e
            goto L_0x000b
        L_0x018b:
            java.lang.Object r1 = r2.A01
            com.instagram.archive.fragment.SelectHighlightsCoverFragment r1 = (com.instagram.archive.fragment.SelectHighlightsCoverFragment) r1
            r0 = 1
            r1.A05 = r0
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x051a
            androidx.fragment.app.FragmentActivity r2 = r1.getActivity()
            if (r2 == 0) goto L_0x000e
        L_0x019c:
            r2.finish()
            return
        L_0x01a0:
            r0 = 1
            r1.setChecked(r0)
            return
        L_0x01a5:
            java.lang.String r3 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A06(r2)
            boolean r9 = com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0P(r2)
            X.3Q2 r0 = X.LRK.A00(r2)
            boolean r10 = r0.A0t()
            X.3Q2 r0 = X.LRK.A00(r2)
            com.instagram.user.model.UpcomingEventImpl r0 = r0.A1p
            boolean r12 = X.AnonymousClass7TF.A1V(r0)
            X.3Q2 r0 = X.LRK.A00(r2)
            boolean r13 = r0.A0w()
            X.3Q2 r0 = X.LRK.A00(r2)
            boolean r14 = r0.A12()
            X.3Q2 r0 = X.LRK.A00(r2)
            int r6 = r0.A0R
            X.3Q2 r0 = X.LRK.A00(r2)
            int r7 = r0.A0S
            X.3Q2 r0 = X.LRK.A00(r2)
            boolean r15 = r0.A0u()
            X.3Q2 r0 = X.LRK.A00(r2)
            java.util.List r0 = r0.A0L()
            int r8 = r0.size()
            r11 = 0
            r4 = 0
            com.instagram.common.session.UserSession r2 = r1.A03
            X.1OC r2 = X.C18765W0j.A02(r2, r3, r4, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            X.1P0 r0 = r1.A02
            r2.A00 = r0
            X.4D6 r0 = r1.A04
            r0.schedule(r2)
            return
        L_0x0202:
            X.8Wq r0 = r2.A0K
            if (r0 == 0) goto L_0x020a
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0J(r2, r0)
            return
        L_0x020a:
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0G(r2)
            return
        L_0x020e:
            java.lang.Object r0 = r2.A01
            X.Lp2 r0 = (X.C65198Lp2) r0
            r4 = 1
            com.instagram.common.session.UserSession r0 = r0.A02
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            r0 = 0
            X.FWg r2 = new X.FWg
            r2.<init>(r1, r4, r0)
            goto L_0x0247
        L_0x0222:
            java.lang.Object r0 = r2.A01
            X.Lp2 r0 = (X.C65198Lp2) r0
            r6 = 0
            X.8qV r1 = X.C367288qV.A01
            com.instagram.common.session.UserSession r3 = r0.A02
            X.4DH r2 = r0.A01
            r5 = 0
            java.lang.String r4 = "REELS_ROW_SHARE"
            r7 = 1
            r1.A0B(r2, r3, r4, r5, r6, r7)
            return
        L_0x0235:
            java.lang.Object r0 = r2.A01
            X.Lp2 r0 = (X.C65198Lp2) r0
            r1 = 0
            com.instagram.common.session.UserSession r0 = r0.A02
            X.1Ng r3 = X.AnonymousClass1Nd.A00(r0)
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            X.FWg r2 = new X.FWg
            r2.<init>(r0, r1, r1)
        L_0x0247:
            r3.A05(r2)
            return
        L_0x024b:
            java.lang.Object r1 = r2.A01
            X.LpX r1 = (X.C65227LpX) r1
            r0 = 0
            X.C65227LpX.A02(r1, r0)
            return
        L_0x0254:
            java.lang.Object r0 = r2.A01
            X.LpX r0 = (X.C65227LpX) r0
            X.C65227LpX.A01(r0)
            return
        L_0x025c:
            X.DbW.A0r(r17)
            java.lang.Object r0 = r2.A01
            X.L4F r0 = (X.L4F) r0
            X.K66 r3 = r0.A01
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r2 = X.K66.A01(r3)
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 9
            X.C51971G9r.A1Q(r2, r1, r0)
            r3.onBackPressed()
            return
        L_0x0276:
            X.DbW.A0r(r17)
            java.lang.Object r1 = r2.A01
            X.L4F r1 = (X.L4F) r1
            X.9P8 r3 = r1.A00
            X.8JI r2 = r3.A06
            X.8JI r0 = X.AnonymousClass8JI.SEQUENTIAL_REMIX
            r4 = 0
            X.K66 r1 = r1.A01
            if (r2 != r0) goto L_0x02a9
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r5 = X.K66.A01(r1)
            r8 = 1
        L_0x028d:
            X.6oS r0 = X.C318116oQ.A00(r5)
            r7 = 7
            X.JTe r3 = new X.JTe
            r6 = r4
            r3.<init>(r4, r5, r6, r7, r8)
            X.AnonymousClass7TE.A1Z(r3, r0)
            X.3Q2 r0 = X.C61829KNs.A02(r1)
            if (r0 == 0) goto L_0x02a3
            r0.A12 = r4
        L_0x02a3:
            java.lang.String r0 = "share_sheet_remix_unavailable_keep_button_tap"
            X.K66.A0L(r1, r0)
            return
        L_0x02a9:
            r1.A01 = r3
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r5 = X.K66.A01(r1)
            r8 = 0
            goto L_0x028d
        L_0x02b1:
            java.lang.Object r0 = r2.A01
            X.K66 r0 = (X.K66) r0
            X.27r r2 = X.JTP.A0X(r0)
            X.283 r0 = r2.A04
            X.JVj r1 = r0.A0C
            java.lang.String r0 = "CANT_LOAD_DRAFT_AUDIO_UNAVAILABLE_OK"
            r2.A1Q(r1, r0)
            return
        L_0x02c3:
            java.lang.Object r2 = r2.A01
            X.K66 r2 = (X.K66) r2
            r1 = 0
            r0 = 0
            X.K66.A0A(r1, r2, r0)
            return
        L_0x02cd:
            java.lang.Object r3 = r2.A01
            X.K66 r3 = (X.K66) r3
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.ClipsSharingDraftViewModel r2 = X.K66.A01(r3)
            boolean r0 = r2.A07()
            if (r0 == 0) goto L_0x02e4
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository r1 = r2.A07
            X.5kq r0 = r2.A03()
            r1.A0M(r0)
        L_0x02e4:
            r1 = 0
            r0 = 0
            X.K66.A0A(r0, r3, r1)
            return
        L_0x02ea:
            java.lang.Object r1 = r2.A01
            X.LoZ r1 = (X.C65170LoZ) r1
            r0 = 0
            r1.FKr(r0)
            r1.FKU(r0)
            return
        L_0x02f6:
            java.lang.Object r0 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r0 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r0
            X.KOf r0 = X.C60102Jfi.A00(r0)
            r0.A0B()
            return
        L_0x0302:
            java.lang.Object r0 = r2.A01
            com.instagram.creation.fragment.followersshare.FollowersShareFragment r0 = (com.instagram.creation.fragment.followersshare.FollowersShareFragment) r0
            com.instagram.creation.fragment.followersshare.FollowersShareFragment.A0E(r0)
            return
        L_0x030a:
            java.lang.Object r0 = r2.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r0 = (com.instagram.creation.fragment.EditMediaInfoFragment) r0
            X.WGU r2 = r0.A07
            X.UzE r1 = X.C16678UzE.EDIT_CAPTION
            java.lang.String r0 = "go_back_button"
            r2.A0F(r1, r0)
            return
        L_0x0318:
            java.lang.Object r3 = r2.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r3 = (com.instagram.creation.fragment.EditMediaInfoFragment) r3
            X.1Av r0 = r3.A0N
            X.0xY r1 = X.AnonymousClass7TE.A0p(r0)
            java.lang.String r0 = "has_seen_boost_edit_caption_confirmation_dialog"
            X.DbW.A1L(r1, r0)
            X.WGU r2 = r3.A07
            X.UzE r1 = X.C16678UzE.EDIT_CAPTION
            java.lang.String r0 = "done_button"
            r2.A0F(r1, r0)
            com.instagram.creation.fragment.EditMediaInfoFragment.A08(r3)
            return
        L_0x0334:
            java.lang.Object r2 = r2.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r2 = (com.instagram.creation.fragment.EditMediaInfoFragment) r2
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1C()
            r2.A0g = r0
            X.LPD r1 = r2.A0O
            r0 = 0
            r1.A04(r0)
            r0 = 0
            r2.A0q = r0
            com.instagram.creation.fragment.EditMediaInfoFragment.A0H(r2)
            com.instagram.creation.fragment.EditMediaInfoFragment.A07(r2)
            return
        L_0x034e:
            java.lang.Object r1 = r2.A01
            com.instagram.creation.fragment.EditMediaInfoFragment r1 = (com.instagram.creation.fragment.EditMediaInfoFragment) r1
            r0 = 1
            com.instagram.creation.fragment.EditMediaInfoFragment.A0K(r1, r0)
            return
        L_0x0357:
            java.lang.Object r0 = r2.A01
            X.Lzf r0 = (X.C65787Lzf) r0
            X.80W r1 = r0.A0F
            X.8T3 r0 = X.AnonymousClass8T3.A00
            r1.A04(r0)
            return
        L_0x0363:
            java.lang.Object r0 = r2.A01
            X.LxB r0 = (X.C65634LxB) r0
            X.K7n r4 = r0.A05
            X.0xx r3 = X.DbV.A0J(r4)
            r2 = 0
            r1 = 27
            X.MH1 r0 = new X.MH1
            r0.<init>(r4, r2, r1)
            X.AnonymousClass7TE.A1Z(r0, r3)
            return
        L_0x0379:
            java.lang.Object r0 = r2.A01
            X.K7u r0 = (X.C61443K7u) r0
            X.C61443K7u.A01(r0)
            return
        L_0x0381:
            java.lang.Object r0 = r2.A01
            X.K7u r0 = (X.C61443K7u) r0
            X.C61443K7u.A02(r0)
            return
        L_0x0389:
            java.lang.Object r2 = r2.A01
            X.LYA r2 = (X.LYA) r2
            java.lang.Object r1 = r2.A01
            X.JpQ r1 = (X.C60679JpQ) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.Ll9 r6 = r1.A0C
            java.lang.Object r0 = r2.A03
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
            com.instagram.common.session.UserSession r5 = r6.A0D
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            X.1a1 r3 = X.C46447Df9.A02()
            java.lang.String r2 = r0.getId()
            java.lang.String r1 = "fundraiser_sticker_search"
            java.lang.String r0 = "fundraiser_sticker_recipient_search"
            com.instagram.profile.intf.UserDetailLaunchConfig r0 = X.C46474Dfc.A01(r5, r2, r0, r1)
            android.os.Bundle r2 = r3.A01(r5, r0)
            android.content.Context r7 = r6.A09
            java.lang.Class<android.app.Activity> r0 = android.app.Activity.class
            java.lang.Object r1 = X.0mE.A00(r7, r0)
            r1.getClass()
            android.app.Activity r1 = (android.app.Activity) r1
            java.lang.String r0 = "profile"
            X.6W8 r0 = X.DbS.A0b(r1, r2, r5, r4, r0)
            goto L_0x0406
        L_0x03c5:
            java.lang.Object r2 = r2.A01
            X.LY8 r2 = (X.LY8) r2
            java.lang.Object r1 = r2.A01
            X.JpM r1 = (X.C60675JpM) r1
            int r0 = X.C249703kE.FLAG_ADAPTER_FULLUPDATE
            X.Ll9 r1 = r1.A09
            java.lang.Object r0 = r2.A02
            X.9hg r0 = (X.C384659hg) r0
            java.lang.String r6 = r0.A06
            com.instagram.common.session.UserSession r5 = r1.A0D
            android.app.Activity r7 = r1.A08
            java.lang.String r1 = "STICKER_TRAY"
            r4 = 0
            X.0qQ.A0B(r5, r4)
            boolean r3 = X.DbW.A1Y(r6)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            r0 = 0
            java.util.HashMap r1 = X.LTV.A01(r6, r1, r0, r0, r4)
            java.lang.String r0 = "com.instagram.social_impact.fundraiser.personal.component.view"
            X.DiU r1 = X.C46649DiU.A04(r0, r1)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = X.DbS.A0N(r5)
            r0.A0l = r4
            r0.A0k = r4
            r0.A0i = r3
            android.os.Bundle r1 = X.C49891FBs.A00(r0, r1)
            java.lang.String r0 = "bloks"
            X.6W8 r0 = X.Dba.A0K(r7, r1, r5, r2, r0)
        L_0x0406:
            r0.A0C(r7)
            return
        L_0x040a:
            java.lang.Object r1 = r2.A01
            X.UAO r1 = (X.UAO) r1
            com.instagram.common.session.UserSession r0 = r1.A09
            X.27r r4 = X.27p.A01(r0)
            java.lang.String r0 = r1.A0H
            java.lang.String r3 = r1.A0I
            java.lang.String[] r1 = new java.lang.String[]{r0}
            java.lang.String r0 = "ig_camera_effect_remove_deny"
            X.0xI r2 = X.27r.A01(r4, r0)
            java.lang.String r0 = "applied_effect_ids"
            r2.A0E(r0, r1)
            if (r3 == 0) goto L_0x0436
            java.lang.String[] r1 = new java.lang.String[]{r3}
            r0 = 67
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r2.A0E(r0, r1)
        L_0x0436:
            com.instagram.common.session.UserSession r0 = r4.A03
            X.DbU.A1R(r2, r0)
            return
        L_0x043c:
            java.lang.Object r1 = r2.A01
            X.Ll2 r1 = (X.C64963Ll2) r1
            X.8MT r0 = r1.A07
            X.8ME r0 = (X.AnonymousClass8ME) r0
            r0.onBackPressed()
            r0 = 0
            X.C64963Ll2.A02(r1, r0)
            return
        L_0x044c:
            java.lang.Object r2 = r2.A01
            X.Ll4 r2 = (X.C64965Ll4) r2
            r1 = 1
            r2.A0E = r1
            X.8N2 r0 = r2.A0S
            r0.A0B = r1
            X.8MI r0 = r2.A0R
            r0.D7c()
            return
        L_0x045d:
            java.lang.Object r0 = r2.A01
            X.JWG r0 = (X.JWG) r0
            android.app.Activity r0 = r0.A05
            r0.onBackPressed()
            return
        L_0x0467:
            java.lang.Object r0 = r2.A01
            X.JWG r0 = (X.JWG) r0
            com.instagram.common.session.UserSession r0 = r0.A08
            X.27r r1 = X.27p.A01(r0)
            java.lang.String r0 = "EXIT_DIALOG_CANCEL"
            r1.A1l(r0)
            return
        L_0x0477:
            java.lang.Object r0 = r2.A01
            X.JWG r0 = (X.JWG) r0
            X.JWG.A05(r0)
            return
        L_0x047f:
            r17.dismiss()
            java.lang.Object r0 = r2.A01
            android.view.View r0 = (android.view.View) r0
            X.C69979NvJ.A00(r0)
            return
        L_0x048a:
            java.lang.Object r0 = r2.A01
            X.LFp r0 = (X.C63964LFp) r0
            X.30m r1 = r0.A01
            java.lang.String r0 = "clips_camera"
            r1.D6c(r0)
            return
        L_0x0496:
            java.lang.Object r0 = r2.A01
            X.Ldb r0 = (X.C64534Ldb) r0
            X.LdI r0 = r0.A00
            if (r0 == 0) goto L_0x04b0
            X.LdH r0 = r0.A02
            if (r0 == 0) goto L_0x04ab
            X.LrN r1 = r0.A03
            r0 = 1
            r1.A03 = r0
            X.C65324LrN.A02(r1)
            return
        L_0x04ab:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x04b0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x04b5:
            java.lang.Object r1 = r2.A01
            com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController r1 = (com.instagram.brandedcontent.ui.BrandedContentFeedDisclosureController) r1
            r0 = 0
            r1.A01(r0)
            return
        L_0x04be:
            java.lang.Object r0 = r2.A01
            X.K8W r0 = (X.K8W) r0
            X.K8W.A03(r0)
            return
        L_0x04c6:
            java.lang.Object r0 = r2.A01
            X.K8a r0 = (X.C61446K8a) r0
            X.C61446K8a.A01(r0)
            return
        L_0x04ce:
            java.lang.Object r0 = r2.A01
            X.MRW r0 = (X.MRW) r0
            r0.DuO()
            return
        L_0x04d6:
            java.lang.Object r2 = r2.A01
            X.LRN r2 = (X.LRN) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            X.Jr6 r0 = X.LRN.A01(r2, r1, r0)
            X.LRO.A01(r0, r2)
            return
        L_0x04e6:
            X.37E r1 = X.AnonymousClass37D.A00
            java.lang.Object r0 = r2.A01
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.fragment.app.FragmentActivity r0 = r0.getActivity()
            X.DbX.A10(r0, r1)
            return
        L_0x04f4:
            java.lang.Object r0 = r2.A01
            X.K89 r0 = (X.K89) r0
            X.0eM r0 = r0.A02
            java.lang.Object r0 = r0.getValue()
            X.Jh4 r0 = (X.C60185Jh4) r0
            X.LTO r3 = r0.A00
            java.lang.Integer r2 = X.AnonymousClass05K.A04
            java.lang.Integer r1 = X.AnonymousClass05K.A09
            com.instagram.appreciation.analytics.creator.CreatorLoggingData r0 = r0.A01
            X.LTO.A03(r3, r0, r2, r1)
            return
        L_0x050c:
            r17.dismiss()
            return
        L_0x0510:
            java.lang.Object r1 = r2.A01
            X.K68 r1 = (X.K68) r1
            r0 = 1
            r1.A07 = r0
            X.K68.A00(r1)
        L_0x051a:
            X.DbT.A1J(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LV3.onClick(android.content.DialogInterface, int):void");
    }
}
