package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.camera.DirectCameraViewModel;

/* renamed from: X.9i4  reason: invalid class name and case insensitive filesystem */
public final class C384899i4 extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "DirectVisualReplyFragment";
    public RectF A00;
    public RectF A01;
    public 28D A02;
    public UserSession A03;
    public ImageUrl A04;
    public AnonymousClass80Q A05;
    public AnonymousClass80C A06;
    public C39719A6k A07;
    public DirectCameraViewModel A08;
    public C254743sy A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public boolean A0E;
    public boolean A0F = true;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public AnonymousClass3KG A0L;
    public AnonymousClass3KQ A0M;
    public PCP A0N;
    public String A0O;
    public boolean A0P;

    public final String getModuleName() {
        return C273654mx.A00(2280);
    }

    public final AnonymousClass0wW getSession() {
        return this.A03;
    }

    public final boolean onBackPressed() {
        AnonymousClass80Q r0 = this.A05;
        if (r0 == null || !r0.A06()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0175, code lost:
        if (r2.contains(0) == false) goto L_0x0177;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0187, code lost:
        if (r2.contains(1) == false) goto L_0x0189;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r18) {
        /*
            r17 = this;
            r0 = 1426944645(0x550d7285, float:9.7201873E12)
            int r3 = X.AnonymousClass0fD.A02(r0)
            r0 = r18
            r4 = r17
            X.C384899i4.super.onCreate(r0)
            android.os.Bundle r2 = r4.requireArguments()
            X.0eM r0 = X.C227642jf.A02(r4)
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            r4.A03 = r1
            android.content.Context r0 = r4.requireContext()
            X.3KG r0 = X.AnonymousClass3KF.A00(r0, r1)
            r4.A0L = r0
            com.instagram.common.session.UserSession r1 = r4.A03
            X.PCP r0 = new X.PCP
            r0.<init>(r1)
            r4.A0N = r0
            android.os.Bundle r1 = r4.requireArguments()
            r0 = 437(0x1b5, float:6.12E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.Object r1 = r1.get(r0)
            boolean r0 = r1 instanceof X.28D
            if (r0 == 0) goto L_0x01c8
            X.28D r1 = (X.28D) r1
        L_0x0043:
            r4.A02 = r1
            r0 = 106(0x6a, float:1.49E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r0 = r2.getParcelable(r0)
            r0.getClass()
            com.instagram.model.direct.camera.DirectCameraViewModel r0 = (com.instagram.model.direct.camera.DirectCameraViewModel) r0
            r4.A08 = r0
            r0 = 24
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r0 = r2.getParcelable(r0)
            android.graphics.RectF r0 = (android.graphics.RectF) r0
            r4.A00 = r0
            r0 = 2201(0x899, float:3.084E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r0 = r2.getParcelable(r0)
            android.graphics.RectF r0 = (android.graphics.RectF) r0
            r4.A01 = r0
            r0 = 925(0x39d, float:1.296E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.3sy r0 = X.C67002Mga.A00(r2, r0)
            r4.A09 = r0
            r0 = 440(0x1b8, float:6.17E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r2.getString(r0)
            r4.A0B = r0
            r0 = 924(0x39c, float:1.295E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r2.getString(r0)
            r4.A0O = r0
            r0 = 2233(0x8b9, float:3.129E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.getBoolean(r0)
            r4.A0P = r0
            java.lang.String r0 = "DirectStoryViewerFragment.THUMBNAIL_IMAGE_URL"
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.instagram.common.typedurl.ImageUrl r0 = (com.instagram.common.typedurl.ImageUrl) r0
            r4.A04 = r0
            java.lang.String r0 = "DirectStoryViewerFragment.VIEW_MODE"
            java.lang.String r0 = r2.getString(r0)
            r4.A0D = r0
            r0 = 926(0x39e, float:1.298E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r2.getString(r0)
            r0.getClass()
            r4.A0C = r0
            com.instagram.common.session.UserSession r6 = r4.A03
            X.0Tu r5 = X.0Tu.A05
            r0 = 2342154677073740484(0x20810145000002c4, double:4.058520932352439E-152)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r5, r6, r0)
            boolean r0 = r0.booleanValue()
            r4.A0I = r0
            java.lang.String r0 = "DirectQuickReplyCameraFragment.REPLY_CAM_ARG_IS_REPLY_TO_SELFIE_REACTION"
            boolean r0 = r2.getBoolean(r0)
            r4.A0G = r0
            r1 = 0
            java.lang.String r0 = "DirectReplyCameraFragments.REPLY_CAM_ARG_SHOULD_FORCE_DISABLE_VIDEO"
            boolean r0 = r2.getBoolean(r0, r1)
            r4.A0K = r0
            r0 = 224(0xe0, float:3.14E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r2.getString(r0)
            r4.A0A = r0
            X.3sy r7 = r4.A09
            if (r7 == 0) goto L_0x01a6
            boolean r0 = r7 instanceof com.instagram.model.direct.DirectThreadKey
            if (r0 != 0) goto L_0x01a6
            java.lang.String r10 = r4.A0B
            com.instagram.common.typedurl.ImageUrl r0 = r4.A04
            r0.getClass()
            java.lang.String r9 = r4.A0D
            r9.getClass()
            X.A6k r8 = new X.A6k
            r8.<init>()
            java.lang.String r7 = r0.getUrl()
            int r6 = r0.getWidth()
            int r5 = r0.getHeight()
            com.instagram.model.mediasize.ExtendedImageUrl r0 = new com.instagram.model.mediasize.ExtendedImageUrl
            r0.<init>(r7, r6, r5)
            java.util.List r15 = X.AnonymousClass7TE.A1I(r0)
            r12 = 0
            com.instagram.model.mediasize.ImageInfoImpl r11 = new com.instagram.model.mediasize.ImageInfoImpl
            r13 = r12
            r14 = r12
            r16 = r12
            r11.<init>(r12, r13, r14, r15, r16)
            r8.A00 = r11
            r8.A01 = r10
            r0 = 1
            r8.A03 = r0
            java.lang.String r0 = "replayable"
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x013c
            r8.A02 = r1
        L_0x013c:
            r4.A07 = r8
            com.instagram.model.direct.camera.DirectCameraViewModel r0 = r4.A08
            com.instagram.model.direct.DirectShareTarget r5 = r0.A03
            r5.getClass()
            com.instagram.common.session.UserSession r0 = r4.A03
            java.lang.String r0 = r0.A06
            boolean r0 = r5.A0Y(r0)
            r5 = 1
            r0 = r0 ^ 1
            r4.A0H = r0
            X.A6k r0 = r4.A07
            boolean r0 = r0.A02
            r4.A0E = r0
            java.lang.String r0 = "DirectVisualReplyFragment.REPLY_CAM_ARG_MANUAL_RECIPIENT_VIEW_MODES"
            java.util.ArrayList r2 = r2.getIntegerArrayList(r0)
            if (r2 == 0) goto L_0x019d
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x019d
            r4.A0J = r5
            boolean r0 = r4.A0H
            if (r0 == 0) goto L_0x0177
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            boolean r1 = r2.contains(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0178
        L_0x0177:
            r0 = 0
        L_0x0178:
            r4.A0H = r0
            boolean r0 = r4.A0F
            if (r0 == 0) goto L_0x0189
            java.lang.Integer r0 = java.lang.Integer.valueOf(r5)
            boolean r1 = r2.contains(r0)
            r0 = 1
            if (r1 != 0) goto L_0x018a
        L_0x0189:
            r0 = 0
        L_0x018a:
            r4.A0F = r0
            boolean r0 = r4.A0E
            if (r0 == 0) goto L_0x01a4
            r0 = 2
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r2.contains(r0)
            if (r0 == 0) goto L_0x01a4
        L_0x019b:
            r4.A0E = r5
        L_0x019d:
            r0 = -140683919(0xfffffffff79d5571, float:-6.3822153E33)
            X.AnonymousClass0fD.A09(r0, r3)
            return
        L_0x01a4:
            r5 = 0
            goto L_0x019b
        L_0x01a6:
            java.lang.String r8 = r4.A0C
            java.lang.String r9 = r4.A0B
            com.instagram.common.session.UserSession r5 = r4.A03
            r0 = 232(0xe8, float:3.25E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.String r10 = r2.getString(r0)
            r0 = 231(0xe7, float:3.24E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            int r11 = r2.getInt(r0)
            com.instagram.common.typedurl.ImageUrl r6 = r4.A04
            X.A6k r8 = X.AnonymousClass9z8.A00(r5, r6, r7, r8, r9, r10, r11)
            goto L_0x013c
        L_0x01c8:
            X.28D r1 = X.28D.A5J
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C384899i4.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(286263043);
        int i = requireArguments().getInt("DirectFragment.DIRECT_FRAGMENT_ARGUMENT_THEME");
        if (i != 0) {
            layoutInflater = layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), i));
        }
        View inflate = layoutInflater.inflate(R.layout.direct_quick_camera_fragment_layout, viewGroup, false);
        AnonymousClass0fD.A09(1872248862, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1273598661);
        super.onDestroyView();
        AnonymousClass80Q r0 = this.A05;
        if (r0 != null) {
            r0.A00();
        }
        this.A05 = null;
        unregisterLifecycleListener(this.A06);
        this.A06.onDestroyView();
        this.A06 = null;
        AnonymousClass0fD.A09(-1206769043, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-1495862795);
        C384899i4.super.onPause();
        if (this.A07.A03) {
            AnonymousClass3KG r1 = this.A0L;
            AnonymousClass3KQ r0 = this.A0M;
            r0.getClass();
            r1.A06(r0);
            this.A0L.A04();
        }
        AnonymousClass0fD.A09(-1953756507, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-637518033);
        super.onResume();
        Activity rootActivity = getRootActivity();
        rootActivity.getClass();
        C357628Yy.A00(rootActivity);
        if (this.A07.A00 == null) {
            0wb.A03(__redex_internal_original_name, "Reply Context Media is null");
            getParentFragmentManager().A0c();
        }
        if (this.A07.A03) {
            this.A0L.A03();
            AnonymousClass3KQ A002 = AnonymousClass3KG.A00(new C72178Oxn(this.A03, this.A0N, this.A09, this.A0B, this.A0O, (String) null, this.A0P));
            this.A0M = A002;
            this.A0L.A05(A002);
        }
        AnonymousClass0fD.A09(793697220, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1564290912);
        C384899i4.super.onStart();
        if (getRootActivity() instanceof AnonymousClass2ZP) {
            ((AnonymousClass2ZP) getRootActivity()).Enj(8);
        }
        AnonymousClass0fD.A09(-1345034335, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(1748974869);
        C384899i4.super.onStop();
        if (getRootActivity() instanceof AnonymousClass2ZP) {
            ((AnonymousClass2ZP) getRootActivity()).Enj(0);
        }
        AnonymousClass0fD.A09(-144184214, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        AnonymousClass80C r0 = new AnonymousClass80C();
        this.A06 = r0;
        registerLifecycleListener(r0);
        C41069Anr anr = new C41069Anr((ViewGroup) view.requireViewById(R.id.direct_quick_camera_container), this);
        C226112fe.A0B.A05(requireActivity(), anr);
    }
}
