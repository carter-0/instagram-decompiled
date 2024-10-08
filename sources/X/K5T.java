package X;

import android.app.Activity;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import com.instagram.android.R;
import com.instagram.arlink.fragment.NametagController;
import com.instagram.common.session.UserSession;

public final class K5T extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "NametagFragment";
    public RectF A00;
    public C343537qN A01;
    public NametagController A02;
    public C64126LOx A03;
    public LOV A04;
    public EWD A05;
    public AnonymousClass3E6 A06;
    public AnonymousClass80C A07;
    public String A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public final AnonymousClass0eM A0D = C227642jf.A02(this);

    public final String getModuleName() {
        return "nametag";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        ViewGroup viewGroup = (ViewGroup) AnonymousClass7TF.A0G(view2, R.id.nametag_container);
        AnonymousClass80C r5 = new AnonymousClass80C();
        registerLifecycleListener(r5);
        Activity rootActivity = getRootActivity();
        0qQ.A0A(rootActivity);
        UserSession A0l = AnonymousClass7TE.A0l(this.A0D);
        String str2 = this.A0A;
        if (str2 == null) {
            str = Dbg.A01();
        } else {
            String str3 = this.A08;
            String str4 = this.A09;
            if (str4 == null) {
                str = "userId";
            } else {
                RectF rectF = this.A00;
                boolean z = this.A0C;
                boolean A1W = AnonymousClass7TF.A1W(this.A05, EWD.DOGFOOD_ASSISTANT);
                LOV lov = this.A04;
                if (lov == null) {
                    str = "selfiePhotoManager";
                } else {
                    C64126LOx lOx = this.A03;
                    if (lOx == null) {
                        str = "backgroundImageManager";
                    } else {
                        AnonymousClass3E6 r1 = this.A06;
                        if (r1 == null) {
                            str = "keyboardHeightChangeDetector";
                        } else {
                            String str5 = str3;
                            String str6 = str2;
                            AnonymousClass80C r18 = r5;
                            AnonymousClass3E6 r17 = r1;
                            this.A02 = new NametagController(rootActivity, rectF, viewGroup, lOx, lov, this, this, A0l, r17, r18, str6, str5, str4, z, A1W, this.A0B);
                            this.A07 = r5;
                            this.A0C = false;
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0D);
    }

    public final boolean onBackPressed() {
        NametagController nametagController = this.A02;
        if (nametagController == null || !nametagController.A05()) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v26, types: [X.7qN, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0122  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0077  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r9) {
        /*
            r8 = this;
            r0 = -864497071(0xffffffffcc78d251, float:-6.5227076E7)
            int r5 = X.AnonymousClass0fD.A02(r0)
            X.K5T.super.onCreate(r9)
            android.os.Bundle r2 = r8.requireArguments()
            X.0eM r3 = r8.A0D
            com.instagram.common.session.UserSession r0 = X.AnonymousClass7TE.A0l(r3)
            X.C63058Kqn.A00(r0)
            r0 = 988(0x3dc, float:1.384E-42)
            java.lang.String r7 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.containsKey(r7)
            r6 = 0
            if (r0 == 0) goto L_0x010a
            r0 = 987(0x3db, float:1.383E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.containsKey(r4)
            if (r0 == 0) goto L_0x010a
            r0 = 989(0x3dd, float:1.386E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.containsKey(r1)
            if (r0 == 0) goto L_0x010a
            java.lang.String r0 = r2.getString(r7, r6)
            r8.A0A = r0
            java.lang.String r0 = r2.getString(r4)
            r8.A08 = r0
            java.lang.String r0 = "0"
            java.lang.String r0 = r2.getString(r1, r0)
        L_0x004e:
            r8.A09 = r0
            r0 = 221(0xdd, float:3.1E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            r6 = 0
            boolean r0 = r2.getBoolean(r0, r6)
            r8.A0B = r0
            r0 = 2379(0x94b, float:3.334E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            android.os.Parcelable r0 = r2.getParcelable(r0)
            android.graphics.RectF r0 = (android.graphics.RectF) r0
            r8.A00 = r0
            r0 = 2378(0x94a, float:3.332E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.io.Serializable r0 = r2.getSerializable(r0)
            if (r0 == 0) goto L_0x0122
            X.EWD r0 = (X.EWD) r0
            r8.A05 = r0
            r0 = 2380(0x94c, float:3.335E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r2.getBoolean(r0, r6)
            if (r0 == 0) goto L_0x0098
            X.1Av r4 = X.DbX.A0h(r3)
            X.0s0 r2 = r4.A44
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 102(0x66, float:1.43E-43)
            boolean r0 = X.AnonymousClass7TG.A1a(r4, r2, r1, r0)
            if (r0 == 0) goto L_0x0098
            r6 = 1
        L_0x0098:
            r8.A0C = r6
            android.content.Context r2 = r8.requireContext()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            X.LOV r0 = new X.LOV
            r0.<init>(r2, r8, r1)
            r8.A04 = r0
            android.content.Context r2 = r8.requireContext()
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r3)
            X.LOx r0 = new X.LOx
            r0.<init>(r2, r8, r1)
            r8.A03 = r0
            r3.getValue()
            X.7qN r0 = new X.7qN
            r0.<init>()
            r8.A01 = r0
            X.1Av r6 = X.DbX.A0h(r3)
            r4 = 1
            X.0s0 r2 = r6.A43
            X.0YZ[] r1 = X.1Av.A8a
            r0 = 101(0x65, float:1.42E-43)
            X.AnonymousClass7TF.A1J(r6, r2, r1, r0, r4)
            X.7qN r0 = r8.A01
            if (r0 == 0) goto L_0x00e6
            android.content.Context r2 = r8.requireContext()
            java.lang.String r1 = "android.permission.CAMERA"
            java.lang.ref.WeakReference r0 = X.1DL.A00
            X.02K.A00(r2, r1)
            android.content.Context r0 = r8.requireContext()
            X.C2604245p.A03(r0)
        L_0x00e6:
            r0 = 0
            X.3E5 r0 = X.AnonymousClass3E4.A01(r8, r0, r0)
            r8.A06 = r0
            X.1Av r4 = X.DbX.A0h(r3)
            X.0lg r3 = X.DbT.A0X(r3)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36877808976789647(0x83042c0028008f, double:3.385013119714927E-306)
            java.lang.String r0 = X.182.A04(r2, r3, r0)
            r4.A0u(r0)
            r0 = -606948386(0xffffffffdbd2b3de, float:-1.18615022E17)
            X.AnonymousClass0fD.A09(r0, r5)
            return
        L_0x010a:
            X.0eE r0 = X.AnonymousClass0t1.A01
            com.instagram.user.model.User r1 = X.DbX.A0l(r0, r3)
            java.lang.String r0 = r1.getUsername()
            r8.A0A = r0
            java.lang.String r0 = r1.getFullName()
            r8.A08 = r0
            java.lang.String r0 = r1.getId()
            goto L_0x004e
        L_0x0122:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 1546048048(0x5c26d230, float:1.87823799E17)
            X.AnonymousClass0fD.A09(r0, r5)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K5T.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-227650954);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.nametag_fragment_layout, viewGroup, false);
        AnonymousClass0fD.A09(-1119421440, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-383818236);
        super.onDestroy();
        1Q9.A01("instagram_nametag").A08();
        AnonymousClass0fD.A09(-932101942, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(351735999);
        super.onDestroyView();
        unregisterLifecycleListener(this.A07);
        AnonymousClass80C r0 = this.A07;
        if (r0 != null) {
            r0.onDestroyView();
        }
        this.A07 = null;
        AnonymousClass0fD.A09(-1101982293, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1019405916);
        super.onResume();
        Dbc.A0q(this, 8);
        AnonymousClass0fD.A09(2076737403, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(-78296061);
        K5T.super.onStart();
        AnonymousClass3E6 r0 = this.A06;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        JTP.A17(this, r0);
        AnonymousClass0fD.A09(1356407061, A022);
    }

    public final void onStop() {
        Window window;
        int A022 = AnonymousClass0fD.A02(467056526);
        K5T.super.onStop();
        AnonymousClass3E6 r0 = this.A06;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.onStop();
        Activity rootActivity = getRootActivity();
        if (rootActivity == null || (window = rootActivity.getWindow()) == null) {
            IllegalStateException A0y = AnonymousClass7TE.A0y();
            AnonymousClass0fD.A09(-1753015846, A022);
            throw A0y;
        }
        2db.A07(window.getDecorView(), window, true);
        Dbc.A0q(this, 0);
        AnonymousClass0fD.A09(1790343534, A022);
    }
}
