package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.nux.activity.SignedOutFragmentActivity;
import java.util.List;

/* renamed from: X.E4v  reason: case insensitive filesystem */
public final class C47491E4v extends AnonymousClass4DH implements AnonymousClass4DR, C227272iw, CallerContextable {
    public static final CallerContext A0B = CallerContext.A00(C47491E4v.class);
    public static final String __redex_internal_original_name = "FindFacebookFriendsPromptFragment";
    public TextView A00;
    public C49776F6j A01;
    public FRN A02;
    public EEB A03;
    public EE4 A04;
    public final String A05 = "register_flow_find_friends_facebook_prompt";
    public final AnonymousClass0eM A06 = C227642jf.A02(this);
    public final View.OnClickListener A07 = FP4.A00(this, 11);
    public final 1wn A08 = FXZ.A00(this, 64);
    public final C50960Fln A09 = new C50960Fln(this);
    public final boolean A0A = true;

    public final void onActivityResult(int i, int i2, Intent intent) {
        if (i2 == -1) {
            1KM.A01(intent, DbT.A0X(this.A06), this.A09);
        }
        super.onActivityResult(i, i2, intent);
    }

    public static final void A00(EXN exn, C47491E4v e4v) {
        AnonymousClass0eM r4 = e4v.A06;
        if (2Lv.A00(AnonymousClass7TE.A0l(r4)).A00(A0B, "ig_android_linking_cache_ig_onboarding_find_fb_friends")) {
            A01(e4v);
            return;
        }
        r4.getValue();
        02m r3 = 02m.A0p;
        0qQ.A07(r3);
        r3.markerStart(857802076);
        r3.markerAnnotate(857802076, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, "ig_fb_nux_find_friends");
        C48920EmK.A00().A01(e4v, DbT.A0X(r4), new C51130Fp2(e4v, 8)).A06(exn.A01(), (List) null);
    }

    public final boolean COC() {
        return this.A0A;
    }

    public final String getModuleName() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final boolean onBackPressed() {
        C49920FEv.A00(DbT.A0X(this.A06), (EXD) null, (Boolean) null, (Integer) null, "find_friends_fb");
        return false;
    }

    public static final void A01(C47491E4v e4v) {
        C51950G8t A002 = C49047EoR.A00(e4v);
        if (A002 != null) {
            A002.Cm0(1);
            return;
        }
        FRN frn = e4v.A02;
        if (frn == null) {
            0qQ.A0F("nuxHelper");
            throw AnonymousClass00P.createAndThrow();
        } else {
            frn.A01();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(538908435);
        C47491E4v.super.onActivityCreated(bundle);
        try {
            SignedOutFragmentActivity requireActivity = requireActivity();
            0qQ.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.nux.activity.SignedOutFragmentActivity");
            requireActivity.A0Z();
        } catch (ClassCastException unused) {
        }
        AnonymousClass0fD.A09(940600058, A022);
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.F6j] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(139894342);
        C47491E4v.super.onCreate(bundle);
        this.A01 = new Object();
        this.A04 = new EE4(this);
        DbX.A0R(this.A06).A01(this.A08, FWF.class);
        AnonymousClass0fD.A09(1987730881, A022);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009a, code lost:
        if (r0 == false) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0069, code lost:
        if (r0 == false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r13, android.view.ViewGroup r14, android.os.Bundle r15) {
        /*
            r12 = this;
            r0 = -1218553359(0xffffffffb75e59f1, float:-1.3253172E-5)
            int r4 = X.AnonymousClass0fD.A02(r0)
            r5 = 0
            X.0qQ.A0B(r13, r5)
            r0 = 2131628937(0x7f0e1389, float:1.888518E38)
            android.view.View r3 = X.DbT.A0C(r13, r14, r0)
            X.0qQ.A07(r3)
            android.view.ViewGroup r1 = X.Dba.A04(r3)
            r0 = 2131628055(0x7f0e1017, float:1.8883392E38)
            r6 = 1
            r13.inflate(r0, r1, r6)
            X.0eM r7 = r12.A06
            X.0lg r8 = X.DbT.A0X(r7)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36329826981790045(0x8111c90000415d, double:3.038467099530795E-306)
            boolean r11 = X.182.A06(r2, r8, r0)
            r0 = 2131430607(0x7f0b0ccf, float:1.848292E38)
            android.widget.TextView r9 = X.AnonymousClass7TG.A0R(r3, r0)
            r8 = 2131962460(0x7f132a5c, float:1.9561646E38)
            r0 = 18304240082753881(0x41079c00041959, double:1.8946196980779393E-307)
            boolean r0 = X.1AW.A06(r2, r0)
            if (r0 == 0) goto L_0x0049
            r8 = 2131962461(0x7f132a5d, float:1.9561648E38)
        L_0x0049:
            r0 = 18867190035972478(0x43079c0001017e, double:2.117127083848536E-307)
            java.lang.String r10 = X.1AW.A04(r2, r0)
            int r1 = r10.hashCode()
            r0 = -685173882(0xffffffffd7291386, float:-1.85901318E14)
            if (r1 == r0) goto L_0x019b
            r0 = 1252973282(0x4aaedae2, float:5729649.0)
            if (r1 != r0) goto L_0x006b
            java.lang.String r0 = "find_facebook_friends"
            boolean r0 = r10.equals(r0)
            r1 = 2131961897(0x7f132829, float:1.9560504E38)
        L_0x0069:
            if (r0 != 0) goto L_0x006e
        L_0x006b:
            r1 = 2131961896(0x7f132828, float:1.9560502E38)
        L_0x006e:
            r0 = 2131432829(0x7f0b157d, float:1.8487426E38)
            android.view.View r10 = X.AnonymousClass7TF.A0F(r3, r0)
            com.instagram.igds.components.headline.IgdsHeadline r10 = (com.instagram.igds.components.headline.IgdsHeadline) r10
            r10.setHeadline((int) r1)
            r0 = 18867190036038015(0x43079c0002017f, double:2.1171270838744395E-307)
            java.lang.String r2 = X.1AW.A04(r2, r0)
            int r1 = r2.hashCode()
            r0 = -1782573099(0xffffffff95c017d5, float:-7.758578E-26)
            if (r1 == r0) goto L_0x0190
            r0 = 1985393832(0x7656b4a8, float:1.0886872E33)
            if (r1 != r0) goto L_0x009c
            java.lang.String r0 = "improve_suggestions"
            boolean r0 = r2.equals(r0)
            r1 = 2131961895(0x7f132827, float:1.95605E38)
        L_0x009a:
            if (r0 != 0) goto L_0x009f
        L_0x009c:
            r1 = 2131961893(0x7f132825, float:1.9560496E38)
        L_0x009f:
            r10.setBody((int) r1)
            r0 = 2131441529(0x7f0b3779, float:1.8505072E38)
            android.widget.TextView r0 = X.DbU.A0G(r3, r0)
            r12.A00 = r0
            X.0lg r2 = X.DbT.A0X(r7)
            X.DiE r1 = X.C46634DiE.A0f
            X.EEB r0 = new X.EEB
            r0.<init>(r2, r12, r1)
            r12.A03 = r0
            r12.registerLifecycleListener(r0)
            if (r11 == 0) goto L_0x0188
            r0 = 2131437194(0x7f0b268a, float:1.849628E38)
            X.DbT.A1F(r3, r0, r5)
        L_0x00c3:
            r0 = 12
            X.FP4 r2 = X.FP4.A00(r12, r0)
            r1 = 0
            if (r11 != 0) goto L_0x0122
            X.0lg r0 = X.DbT.A0X(r7)
            boolean r0 = X.C61670oa.A0I(r0)
            if (r0 != 0) goto L_0x0122
            r9.setCompoundDrawables(r1, r1, r1, r1)
            r9.setText(r8)
            X.AnonymousClass4Ed.A04(r9)
            r0 = 2131430597(0x7f0b0cc5, float:1.84829E38)
            android.view.View r1 = r3.requireViewById(r0)
            android.view.View$OnClickListener r0 = r12.A07
            X.AnonymousClass0fU.A00(r0, r1)
            r0 = 2131441424(0x7f0b3710, float:1.850486E38)
            android.view.View r0 = X.AnonymousClass7TF.A0G(r3, r0)
            X.AnonymousClass0fU.A00(r2, r0)
        L_0x00f5:
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r7)
            X.FRN r0 = new X.FRN
            r0.<init>(r12, r12, r1)
            r12.A02 = r0
            X.0lg r1 = X.DbT.A0X(r7)
            java.lang.String r0 = "find_friends_fb"
            X.C49938FFr.A01(r1, r0)
            androidx.fragment.app.FragmentActivity r1 = r12.requireActivity()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity"
            X.0qQ.A0C(r1, r0)
            com.instagram.base.activity.IgFragmentActivity r1 = (com.instagram.base.activity.IgFragmentActivity) r1
            X.EE4 r0 = r12.A04
            if (r0 != 0) goto L_0x01a6
            java.lang.String r0 = "nuxCalFragmentLifecycleListener"
            X.0qQ.A0F(r0)
            X.00P r1 = X.AnonymousClass00P.createAndThrow()
            throw r1
        L_0x0122:
            r0 = 2131430597(0x7f0b0cc5, float:1.84829E38)
            int r1 = X.Dbb.A03(r3, r0)
            r0 = 2131441424(0x7f0b3710, float:1.850486E38)
            X.DbT.A1F(r3, r0, r1)
            r0 = 2131427572(0x7f0b00f4, float:1.8476764E38)
            android.view.View r9 = r3.requireViewById(r0)
            X.61u r9 = (X.C3021461u) r9
            r9.setVisibility(r5)
            android.content.Context r6 = r9.getContext()
            java.lang.String r1 = r6.getString(r8)
            android.view.View$OnClickListener r0 = r12.A07
            r9.setPrimaryAction(r1, r0)
            r0 = 2131973923(0x7f135723, float:1.9584896E38)
            java.lang.String r0 = r6.getString(r0)
            r9.setSecondaryAction(r0, r2)
            r0 = 2131432880(0x7f0b15b0, float:1.848753E38)
            android.view.View r2 = X.AnonymousClass7TF.A0G(r3, r0)
            android.view.ViewGroup$LayoutParams r1 = r2.getLayoutParams()
            java.lang.String r0 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            if (r1 == 0) goto L_0x01bb
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r1.bottomMargin = r5
            r1.leftMargin = r5
            r1.rightMargin = r5
            r2.setLayoutParams(r1)
            android.view.ViewGroup$LayoutParams r2 = r10.getLayoutParams()
            if (r2 == 0) goto L_0x01c3
            android.view.ViewGroup$MarginLayoutParams r2 = (android.view.ViewGroup.MarginLayoutParams) r2
            android.content.res.Resources r1 = X.DbV.A05(r12)
            r0 = 2131165747(0x7f070233, float:1.794572E38)
            int r0 = r1.getDimensionPixelSize(r0)
            r2.leftMargin = r0
            r2.rightMargin = r0
            r10.setLayoutParams(r2)
            goto L_0x00f5
        L_0x0188:
            r0 = 2131237298(0x7f0819b2, float:1.8090843E38)
            r10.EZe(r0, r6)
            goto L_0x00c3
        L_0x0190:
            java.lang.String r0 = "find_people_you_know"
            boolean r0 = r2.equals(r0)
            r1 = 2131961894(0x7f132826, float:1.9560498E38)
            goto L_0x009a
        L_0x019b:
            java.lang.String r0 = "get_suggestions"
            boolean r0 = r10.equals(r0)
            r1 = 2131961898(0x7f13282a, float:1.9560506E38)
            goto L_0x0069
        L_0x01a6:
            r1.registerOnActivityResultListener(r0)
            X.0lg r2 = X.DbT.A0X(r7)
            X.EZu r1 = X.C48152EZu.A0I
            java.lang.String r0 = "upsell_impressions"
            X.FFL.A00(r1, r2, r0)
            r0 = -2121564492(0xffffffff818b7eb4, float:-5.1242346E-38)
            X.AnonymousClass0fD.A09(r0, r4)
            return r3
        L_0x01bb:
            java.lang.NullPointerException r1 = X.AnonymousClass7TE.A11(r0)
            r0 = 1703666302(0x658be27e, float:8.257337E22)
            goto L_0x01ca
        L_0x01c3:
            java.lang.NullPointerException r1 = X.AnonymousClass7TE.A11(r0)
            r0 = -66285069(0xfffffffffc0c91f3, float:-2.919527E36)
        L_0x01ca:
            X.AnonymousClass0fD.A09(r0, r4)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47491E4v.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroyView() {
        String str;
        int A022 = AnonymousClass0fD.A02(-338016907);
        super.onDestroyView();
        EEB eeb = this.A03;
        if (eeb == null) {
            str = "bigBlueTokenHelper";
        } else {
            unregisterLifecycleListener(eeb);
            this.A00 = null;
            IgFragmentActivity requireActivity = requireActivity();
            0qQ.A0C(requireActivity, "null cannot be cast to non-null type com.instagram.base.activity.BaseFragmentActivity");
            IgFragmentActivity igFragmentActivity = requireActivity;
            EE4 ee4 = this.A04;
            if (ee4 == null) {
                str = "nuxCalFragmentLifecycleListener";
            } else {
                igFragmentActivity.unregisterOnActivityResultListener(ee4);
                1wn r2 = this.A08;
                if (r2 != null) {
                    DbX.A0R(this.A06).A02(r2, FWF.class);
                }
                AnonymousClass0fD.A09(339205178, A022);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(1187621379);
        SignedOutFragmentActivity activity = getActivity();
        if (activity instanceof SignedOutFragmentActivity) {
            activity.A07 = true;
        }
        C47491E4v.super.onPause();
        AnonymousClass0fD.A09(-2029966663, A022);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.instagram.nux.activity.SignedOutFragmentActivity, android.app.Activity] */
    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-1373638557);
        FragmentActivity activity = getActivity();
        if (activity instanceof SignedOutFragmentActivity) {
            ? r1 = (SignedOutFragmentActivity) activity;
            r1.A07 = false;
            Window window = r1.getWindow();
            if (window != null) {
                window.setSoftInputMode(3);
            }
        }
        super.onResume();
        AnonymousClass0fD.A09(-306571730, A022);
    }

    public final void configureActionBar(2da r1) {
        Dba.A1G(r1);
    }
}
