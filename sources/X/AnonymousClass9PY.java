package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.model.direct.camera.DirectCameraViewModel;

/* renamed from: X.9PY  reason: invalid class name */
public final class AnonymousClass9PY extends AnonymousClass4DH implements AnonymousClass4DR, B1Q {
    public static final String __redex_internal_original_name = "DirectQuickReplyCameraFragment";
    public RectF A00;
    public RectF A01;
    public 28D A02;
    public C2366634p A03;
    public AnonymousClass87G A04;
    public UserSession A05;
    public CameraConfiguration A06;
    public AnonymousClass80Q A07;
    public AnonymousClass80C A08;
    public C39719A6k A09;
    public DirectCameraViewModel A0A;
    public C254743sy A0B;
    public String A0C;
    public String A0D;
    public String A0E = "direct_quick_camera_fragment";
    public String A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public MYU A0O;

    public final boolean getCanShowVoiceMessageBar() {
        return false;
    }

    public final void DHb(boolean z) {
        String str;
        if (z != this.A0I) {
            this.A0I = z;
            if (z) {
                str = "direct_gallery";
            } else {
                str = "direct_quick_camera_fragment";
            }
            this.A0E = str;
            if (!this.A0G) {
                this.A0G = true;
                1Jk.A04(this);
            }
            1Jk.A08.A0D(this);
        }
    }

    public final String getModuleName() {
        return this.A0E;
    }

    public final AnonymousClass0wW getSession() {
        return this.A05;
    }

    public final boolean onBackPressed() {
        AnonymousClass80Q r0 = this.A07;
        if (r0 == null || !r0.A06()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x00a5, code lost:
        if (r3.A0Y(r13.A05.A06) == false) goto L_0x00a7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r14) {
        /*
            r13 = this;
            r0 = -380106409(0xffffffffe9580957, float:-1.6323255E25)
            int r1 = X.AnonymousClass0fD.A02(r0)
            X.AnonymousClass9PY.super.onCreate(r14)
            android.os.Bundle r2 = r13.requireArguments()
            X.0eM r0 = X.C227642jf.A02(r13)
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r0)
            r13.A05 = r0
            X.9PT r3 = new X.9PT
            r3.<init>(r0)
            r13.A0O = r3
            java.lang.String r0 = "init_camera"
            X.34p r0 = r3.A02(r0)
            r13.A03 = r0
            X.MYU r9 = r13.A0O
            android.content.Context r10 = r13.requireContext()
            com.instagram.common.session.UserSession r0 = r13.A05
            X.2cc r11 = X.C71342cb.A00(r0)
            r14 = 0
            r7 = 0
            r12 = r7
            r9.A0P(r10, r11, r12, r13, r14)
            r0 = 106(0x6a, float:1.49E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r0 = r2.getParcelable(r0)
            r0.getClass()
            com.instagram.model.direct.camera.DirectCameraViewModel r0 = (com.instagram.model.direct.camera.DirectCameraViewModel) r0
            r13.A0A = r0
            r0 = 218(0xda, float:3.05E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            android.os.Parcelable r0 = r2.getParcelable(r0)
            android.graphics.RectF r0 = (android.graphics.RectF) r0
            r13.A01 = r0
            r0 = 437(0x1b5, float:6.12E-43)
            java.lang.String r3 = X.AnonymousClass000.A00(r0)
            java.lang.Object r0 = r2.get(r3)
            boolean r0 = r0 instanceof X.28D
            if (r0 == 0) goto L_0x0148
            java.lang.Object r0 = r2.get(r3)
            X.28D r0 = (X.28D) r0
            r13.A02 = r0
        L_0x006e:
            r0 = 518(0x206, float:7.26E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            android.os.Parcelable r0 = r2.getParcelable(r0)
            com.instagram.creation.cameraconfiguration.CameraConfiguration r0 = (com.instagram.creation.cameraconfiguration.CameraConfiguration) r0
            r13.A06 = r0
            r0 = 516(0x204, float:7.23E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.String r0 = r2.getString(r0, r7)
            r13.A0C = r0
            r0 = 24
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r0 = r2.getParcelable(r0)
            android.graphics.RectF r0 = (android.graphics.RectF) r0
            r13.A00 = r0
            com.instagram.model.direct.camera.DirectCameraViewModel r0 = r13.A0A
            com.instagram.model.direct.DirectShareTarget r3 = r0.A03
            if (r3 == 0) goto L_0x00a7
            com.instagram.common.session.UserSession r0 = r13.A05
            java.lang.String r0 = r0.A06
            boolean r3 = r3.A0Y(r0)
            r0 = 1
            if (r3 != 0) goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            r13.A0L = r0
            com.instagram.common.session.UserSession r5 = r13.A05
            X.0Tu r0 = X.0Tu.A05
            r3 = 2342154677073740484(0x20810145000002c4, double:4.058520932352439E-152)
            java.lang.Boolean r0 = X.AnonymousClass7TF.A0R(r0, r5, r3)
            boolean r0 = r0.booleanValue()
            r13.A0J = r0
            r0 = 926(0x39e, float:1.298E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r2.getString(r0)
            r13.A0F = r0
            r0 = 520(0x208, float:7.29E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r2.getBoolean(r0)
            r13.A0M = r0
            r0 = 545(0x221, float:7.64E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r2.getBoolean(r0)
            r13.A0N = r0
            r0 = 546(0x222, float:7.65E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r2.getBoolean(r0)
            r13.A0K = r0
            r0 = 224(0xe0, float:3.14E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r2.getString(r0)
            r13.A0D = r0
            r0 = 521(0x209, float:7.3E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            boolean r0 = r2.getBoolean(r0)
            r13.A0H = r0
            java.lang.String r9 = r13.A0F
            r0 = 925(0x39d, float:1.296E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r0)
            if (r9 == 0) goto L_0x013b
            r0 = 440(0x1b8, float:6.17E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r10 = r2.getString(r0)
            android.os.Parcelable r8 = r2.getParcelable(r5)
            X.3sy r8 = (X.C254743sy) r8
            com.instagram.common.session.UserSession r6 = r13.A05
            r0 = 232(0xe8, float:3.25E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            java.lang.String r11 = r2.getString(r0)
            r0 = 231(0xe7, float:3.24E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            int r12 = r2.getInt(r0)
            X.A6k r0 = X.AnonymousClass9z8.A00(r6, r7, r8, r9, r10, r11, r12)
            r13.A09 = r0
        L_0x013b:
            r0 = 517(0x205, float:7.24E-43)
            java.lang.String r3 = X.C66579MXk.A00(r0)
            java.lang.String r0 = r2.getString(r3)
            if (r0 == 0) goto L_0x0169
            goto L_0x014e
        L_0x0148:
            X.28D r0 = X.28D.A5J
            r13.A02 = r0
            goto L_0x006e
        L_0x014e:
            com.instagram.common.session.UserSession r4 = r13.A05     // Catch:{ IOException -> 0x0161 }
            java.lang.String r3 = r2.getString(r3)     // Catch:{ IOException -> 0x0161 }
            X.0c5 r0 = X.0c9.A04     // Catch:{ IOException -> 0x0161 }
            X.0c9 r0 = r0.A01(r4, r3)     // Catch:{ IOException -> 0x0161 }
            X.87G r0 = X.D0Y.parseFromJson(r0)     // Catch:{ IOException -> 0x0161 }
            r13.A04 = r0     // Catch:{ IOException -> 0x0161 }
            goto L_0x0169
        L_0x0161:
            r4 = move-exception
            java.lang.String r3 = "deserialize_create_mode_attribution"
            java.lang.String r0 = "Failed to deserialize canvasAttributionElement"
            X.0wb.A06(r3, r0, r4)
        L_0x0169:
            boolean r0 = r2.containsKey(r5)
            if (r0 == 0) goto L_0x0175
            X.3sy r0 = X.C67002Mga.A00(r2, r5)
            r13.A0B = r0
        L_0x0175:
            X.C226132fh.A02()
            r0 = -1
            X.C226112fe.A06 = r0
            X.C226112fe.A05 = r0
            boolean r2 = X.C226112fe.A09
            r0 = 1
            if (r0 == r2) goto L_0x0187
            java.util.WeakHashMap r0 = X.C226112fe.A0C
            r0.clear()
        L_0x0187:
            r0 = -1087654744(0xffffffffbf2bb4a8, float:-0.67072535)
            X.AnonymousClass0fD.A09(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9PY.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1094063899);
        View inflate = layoutInflater.inflate(R.layout.direct_quick_camera_fragment_layout, viewGroup, false);
        AnonymousClass0fD.A09(1903519434, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(481000542);
        super.onDestroyView();
        AnonymousClass80Q r0 = this.A07;
        if (r0 != null) {
            r0.A00();
            this.A07 = null;
        }
        unregisterLifecycleListener(this.A08);
        this.A08.onDestroyView();
        this.A08 = null;
        AnonymousClass0fD.A09(-460219361, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(685566133);
        super.onResume();
        this.A0O.A0J("destination", this.A0E);
        if (!this.A0K) {
            Activity rootActivity = getRootActivity();
            rootActivity.getClass();
            C357628Yy.A00(rootActivity);
        }
        AnonymousClass0fD.A09(1159869657, A022);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (!this.A0K) {
            AnonymousClass2uJ.A03(requireActivity());
        }
        AnonymousClass80C r0 = new AnonymousClass80C();
        this.A08 = r0;
        registerLifecycleListener(r0);
        AnonymousClass9PZ r2 = new AnonymousClass9PZ((ViewGroup) view.requireViewById(R.id.direct_quick_camera_container), this);
        C226112fe.A0B.A05(requireActivity(), r2);
    }
}
