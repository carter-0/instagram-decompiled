package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.KLz  reason: case insensitive filesystem */
public final class C61785KLz extends K5U implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "ClipsTimelineTemplateEditorFragment";
    public C64711Lgk A00;
    public ClipsCreationViewModel A01;
    public AnonymousClass8RF A02;
    public C3516889w A03;
    public C64706Lge A04;
    public MXI A05;
    public C64701LgW A06;
    public AnonymousClass8RL A07;

    public final String getModuleName() {
        return "clips_template_page";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        if (this.A01 == C390839rv.PRE_CAPTURE) {
            UserSession A0l = AnonymousClass7TE.A0l(this.A05);
            0qQ.A0B(A0l, 0);
            C55605HkQ hkQ = (C55605HkQ) A0l.A01(C55605HkQ.class, new C58710IwJ(A0l, 30));
            if (hkQ.A00 != 0) {
                C51965G9l.A0a(hkQ.A01).flowEndSuccess(hkQ.A00);
                hkQ.A00 = 0;
            }
        }
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHJ.A02(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 21), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public final boolean onBackPressed() {
        if (this.A06 != null) {
            return false;
        }
        0qQ.A0F("deleteTrayController");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r21v0, resolved type: X.4DH} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r17v1, resolved type: X.4DH} */
    /* JADX WARNING: type inference failed for: r0v40, types: [X.3on, X.LgW, java.lang.Object] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r30) {
        /*
            r29 = this;
            r0 = -1176555456(0xffffffffb9df3040, float:-4.2569824E-4)
            int r5 = X.AnonymousClass0fD.A02(r0)
            r6 = r29
            r0 = r30
            super.onCreate(r0)
            android.content.Context r4 = r6.requireContext()
            android.os.Bundle r2 = r6.requireArguments()
            java.lang.String r0 = "ARG_CLIPS_CREATION_TYPE"
            java.lang.Object r1 = r2.get(r0)
            if (r1 == 0) goto L_0x002a
            boolean r0 = r1 instanceof X.C2801950r
            if (r0 == 0) goto L_0x002a
            X.50r r1 = (X.C2801950r) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r6.A04 = r1
        L_0x002a:
            java.lang.String r0 = "ARG_EDITOR_TRANSITION_SOURCE"
            java.lang.Object r1 = r2.get(r0)
            if (r1 == 0) goto L_0x003e
            boolean r0 = r1 instanceof X.C390839rv
            if (r0 == 0) goto L_0x003e
            X.9rv r1 = (X.C390839rv) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r6.A01 = r1
        L_0x003e:
            java.lang.String r0 = "ARG_EDITOR_CONFIG"
            java.lang.Object r1 = r2.get(r0)
            if (r1 == 0) goto L_0x0052
            boolean r0 = r1 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig
            if (r0 == 0) goto L_0x0052
            com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig r1 = (com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            r6.A02 = r1
        L_0x0052:
            java.lang.Class<com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider> r0 = com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r2.setClassLoader(r0)
            boolean r9 = X.K5U.A00(r6)
            X.2YN r0 = X.DbW.A0F(r6)
            java.lang.Class<X.860> r10 = X.AnonymousClass860.class
            X.2YL r0 = r0.A00(r10)
            X.860 r0 = (X.AnonymousClass860) r0
            java.lang.String r2 = "post_capture"
            X.89w r0 = r0.A01(r2)
            r6.A03 = r0
            X.89v r1 = X.C3516489r.A02(r4)
            X.89w r0 = r6.A03
            java.lang.String r19 = "bitmapTimelineViewModel"
            r3 = 0
            if (r0 == 0) goto L_0x0263
            r8 = 2
            r0.A02(r1, r1)
            X.89w r11 = r6.A03
            if (r11 == 0) goto L_0x0263
            int r7 = r1.A00
            X.0sP r0 = r1.A05
            java.lang.Object r0 = r0.invoke(r3)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            int r1 = r0 * 10
            int r0 = X.AnonymousClass89x.A00()
            int r7 = r7 * r1
            int r1 = java.lang.Math.min(r7, r0)
            if (r1 <= 0) goto L_0x00a4
            X.89y r0 = r11.A08
            r0.resize(r1)
        L_0x00a4:
            java.lang.String r0 = "clips_template_page"
            r6.setModuleNameV2(r0)
            androidx.fragment.app.FragmentActivity r1 = r6.requireActivity()
            X.0eM r7 = r6.A05
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r7)
            X.2YL r0 = X.JTS.A0E(r6, r1, r0)
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = (com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel) r0
            r6.A01 = r0
            X.2YN r0 = X.DbW.A0F(r6)
            X.2YL r0 = r0.A00(r10)
            X.860 r0 = (X.AnonymousClass860) r0
            X.861 r12 = r0.A00(r2)
            androidx.fragment.app.FragmentActivity r13 = r6.requireActivity()
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r7)
            androidx.fragment.app.FragmentActivity r10 = r6.requireActivity()
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r6.A01
            java.lang.String r18 = "clipsCreationViewModel"
            if (r0 == 0) goto L_0x0202
            X.2Fk r2 = r0.A0C
            X.2Fj r1 = r12.A0G
            X.8RE r0 = new X.8RE
            r0.<init>(r10, r2, r1, r11)
            X.2YN r1 = X.JTO.A0L(r0, r13)
            java.lang.Class<X.8RF> r0 = X.AnonymousClass8RF.class
            X.2YL r0 = r1.A00(r0)
            X.8RF r0 = (X.AnonymousClass8RF) r0
            r6.A02 = r0
            androidx.fragment.app.FragmentActivity r10 = r6.requireActivity()
            androidx.fragment.app.FragmentActivity r2 = r6.requireActivity()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r7)
            X.8RK r0 = new X.8RK
            r0.<init>(r2, r1)
            X.2YN r1 = X.JTO.A0L(r0, r10)
            java.lang.Class<X.8RL> r0 = X.AnonymousClass8RL.class
            X.2YL r0 = r1.A00(r0)
            X.8RL r0 = (X.AnonymousClass8RL) r0
            r6.A07 = r0
            X.8RF r1 = r6.A02
            java.lang.String r17 = "clipsTimelineEditorViewModel"
            if (r1 == 0) goto L_0x025f
            r1.A03 = r9
            X.8RG r0 = new X.8RG
            r0.<init>(r9)
            r1.A0G(r0)
            com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig r0 = r6.A02
            boolean r0 = r0.isOpenLastClip
            r2 = 1
            if (r0 == 0) goto L_0x0144
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r6.A01
            if (r0 == 0) goto L_0x0202
            X.831 r0 = X.JTQ.A0K(r0)
            if (r0 == 0) goto L_0x0144
            X.8RF r10 = r6.A02
            if (r10 == 0) goto L_0x025f
            java.util.List r0 = r0.A01
            int r1 = X.DbT.A02(r0, r2)
            X.KM2 r0 = new X.KM2
            r0.<init>(r1, r9)
            r10.A0G(r0)
        L_0x0144:
            com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig r0 = r6.A02
            int r10 = r0.reorderVersion
            com.instagram.common.session.UserSession r22 = X.AnonymousClass7TE.A0l(r7)
            X.8RF r13 = r6.A02
            if (r13 == 0) goto L_0x025f
            X.8RL r11 = r6.A07
            java.lang.String r16 = "clipsTimelineButtonEventProvider"
            if (r11 == 0) goto L_0x025b
            X.87s r23 = r6.A0P()
            X.50r r1 = r6.A04
            X.AbQ r0 = new X.AbQ
            r20 = r0
            r21 = r6
            r24 = r11
            r25 = r13
            r26 = r1
            r20.<init>(r21, r22, r23, r24, r25, r26)
            r6.A05 = r0
            com.instagram.common.session.UserSession r22 = X.AnonymousClass7TE.A0l(r7)
            X.8RF r14 = r6.A02
            if (r14 == 0) goto L_0x025f
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r13 = r6.A01
            if (r13 == 0) goto L_0x0202
            X.9rv r11 = r6.A01
            X.MXI r1 = r6.A05
            java.lang.String r15 = "viewController"
            if (r1 == 0) goto L_0x0257
            X.Lge r0 = new X.Lge
            r20 = r0
            r23 = r11
            r24 = r1
            r25 = r13
            r26 = r14
            r27 = r12
            r20.<init>(r21, r22, r23, r24, r25, r26, r27)
            r6.A04 = r0
            r6.registerLifecycleListener(r0)
            com.instagram.common.session.UserSession r12 = X.AnonymousClass7TE.A0l(r7)
            X.MXI r11 = r6.A05
            if (r11 == 0) goto L_0x0257
            X.50r r1 = r6.A04
            X.LgX r0 = new X.LgX
            r0.<init>(r6, r12, r11, r1)
            r6.registerLifecycleListener(r0)
            X.LgW r0 = new X.LgW
            r0.<init>()
            r6.A06 = r0
            r6.registerLifecycleListener(r0)
            com.instagram.common.session.UserSession r21 = X.AnonymousClass7TE.A0l(r7)
            X.89w r14 = r6.A03
            if (r14 == 0) goto L_0x0263
            X.8RF r12 = r6.A02
            if (r12 == 0) goto L_0x025f
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r11 = r6.A01
            if (r11 == 0) goto L_0x0202
            X.L0R r1 = new X.L0R
            r1.<init>(r6)
            X.8RL r0 = r6.A07
            if (r0 == 0) goto L_0x025b
            X.KM0 r13 = new X.KM0
            r20 = r13
            r22 = r1
            r23 = r11
            r24 = r0
            r25 = r12
            r26 = r14
            r20.<init>(r21, r22, r23, r24, r25, r26)
            if (r10 != r8) goto L_0x0251
            r13.A01 = r9
            r13.setHasStableIds(r9)
        L_0x01e4:
            com.instagram.common.session.UserSession r18 = X.AnonymousClass7TE.A0l(r7)
            X.89w r14 = r6.A03
            if (r14 == 0) goto L_0x0263
            X.MXI r12 = r6.A05
            if (r12 == 0) goto L_0x0257
            X.8RF r11 = r6.A02
            if (r11 == 0) goto L_0x025f
            X.8RL r9 = r6.A07
            if (r9 == 0) goto L_0x025b
            X.50r r8 = r6.A04
            com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig r7 = r6.A02
            X.LgW r2 = r6.A06
            if (r2 != 0) goto L_0x020a
            java.lang.String r18 = "deleteTrayController"
        L_0x0202:
            X.0qQ.A0F(r18)
        L_0x0205:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x020a:
            X.Lge r1 = r6.A04
            if (r1 != 0) goto L_0x0211
            java.lang.String r18 = "playbackController"
            goto L_0x0202
        L_0x0211:
            X.Lgk r0 = new X.Lgk
            r17 = r6
            r19 = r1
            r20 = r12
            r21 = r2
            r22 = r13
            r23 = r7
            r24 = r9
            r25 = r11
            r26 = r8
            r27 = r14
            r28 = r10
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r6.A00 = r0
            r6.registerLifecycleListener(r0)
            X.MXI r0 = r6.A05
            if (r0 == 0) goto L_0x0257
            r6.registerLifecycleListener(r0)
            X.87s r0 = r6.A0P()
            X.0r6 r2 = r0.A0O
            r1 = 38
            X.JZr r0 = new X.JZr
            r0.<init>((X.AnonymousClass4D7) r3, (java.lang.Object) r6, (java.lang.Object) r4, (int) r1)
            X.JTS.A10(r6, r0, r2)
            r0 = -1439193013(0xffffffffaa37a84b, float:-1.6312053E-13)
            X.AnonymousClass0fD.A09(r0, r5)
            return
        L_0x0251:
            r13.A01 = r2
            r13.setHasStableIds(r2)
            goto L_0x01e4
        L_0x0257:
            X.0qQ.A0F(r15)
            goto L_0x0205
        L_0x025b:
            X.0qQ.A0F(r16)
            goto L_0x0205
        L_0x025f:
            X.0qQ.A0F(r17)
            goto L_0x0205
        L_0x0263:
            X.0qQ.A0F(r19)
            goto L_0x0205
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61785KLz.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1735131323);
        0qQ.A0B(layoutInflater, 0);
        27r A0I = JTQ.A0I(this);
        0Aj A0e = AnonymousClass7TE.A0e(A0I.A01, "ig_camera_template_builder_impression");
        AnonymousClass283 r3 = A0I.A04;
        String str = r3.A0L;
        C59725JVj jVj = r3.A0C;
        if (!(!A0e.isSampled() || str == null || jVj == null)) {
            JTP.A1E(A0e);
            JTO.A1S(A0e, str);
            AnonymousClass7TE.A1V(A0e, r3);
            AnonymousClass7TH.A0U(A0e);
            C51965G9l.A1A(jVj, A0e);
            AnonymousClass7TE.A1W(A0e, "event_type", 2);
            AnonymousClass7TH.A0V(A0e);
        }
        MXI mxi = this.A05;
        if (mxi == null) {
            0qQ.A0F("viewController");
            throw AnonymousClass00P.createAndThrow();
        }
        View inflate = layoutInflater.inflate(mxi.BLy(), viewGroup, false);
        AnonymousClass0fD.A09(1020537734, A022);
        return inflate;
    }
}
