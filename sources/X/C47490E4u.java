package X;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.core.content.FileProvider;
import androidx.fragment.app.FragmentActivity;
import com.facebook.common.callercontext.CallerContextable;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.E4u  reason: case insensitive filesystem */
public final class C47490E4u extends AnonymousClass4DH implements AnonymousClass4DR, C227272iw, CallerContextable {
    public static final String __redex_internal_original_name = "AddProfilePhotoFragment";
    public Bitmap A00;
    public C50349FZg A01;
    public UserSession A02;
    public C49652F0j A03;
    public G66 A04;
    public G89 A05;
    public FRN A06;
    public AnonymousClass6ST A07;
    public Boolean A08 = AnonymousClass7TE.A0u();
    public boolean A09;
    public int A0A;
    public EE0 A0B;
    public final G66 A0C = new C50624Fff(this);
    public final G66 A0D = new C50623Ffe(this);
    public final G6P A0E = new C50961Flo(this, 1);
    public final C17950Vih A0F = new Object();

    public final boolean COC() {
        return true;
    }

    public final void configureActionBar(2da r2) {
        r2.Etr(false);
    }

    public final String getModuleName() {
        return "register_flow_add_profile_photo";
    }

    public static void A00(C47490E4u e4u) {
        int i;
        Bitmap bitmap = e4u.A00;
        if (bitmap != null && bitmap.getHeight() < (i = e4u.A0A)) {
            bitmap = 0fO.A00(bitmap, i, i, true);
        }
        e4u.A03.A00 = bitmap;
        e4u.A05.FLE(e4u.requireContext(), e4u.A03);
        e4u.A05.FJp(e4u.requireContext(), e4u.A03);
        e4u.A05.FLz(e4u.requireContext(), e4u.A02, e4u.A03);
    }

    public final void A02() {
        FFL.A00(C48152EZu.A08, this.A02, "upsell_primary_click");
        new C46669Diy((Uri) null, this.A01, 0).execute(new Void[0]);
    }

    public final AnonymousClass0wW getSession() {
        return this.A02;
    }

    public final boolean onBackPressed() {
        C49920FEv.A00(this.A02, (EXD) null, Boolean.valueOf(this.A09), (Integer) null, "profile_photo");
        C17950Vih vih = this.A0F;
        Bundle bundle = this.mArguments;
        if (bundle == null || bundle.getString(AnonymousClass000.A00(928)) == null) {
            return false;
        }
        vih.A00(requireArguments(), new VT3(this.A00, this.A08.booleanValue()));
        return true;
    }

    public static void A01(C47490E4u e4u, boolean z) {
        C51950G8t g8t;
        FragmentActivity requireActivity = e4u.requireActivity();
        if (requireActivity instanceof C51950G8t) {
            g8t = (C51950G8t) requireActivity;
        } else {
            g8t = null;
        }
        if (e4u.A09) {
            requireActivity.finish();
            return;
        }
        C17950Vih vih = e4u.A0F;
        Bundle bundle = e4u.mArguments;
        if (bundle != null && bundle.getString(AnonymousClass000.A00(928)) != null) {
            vih.A01(e4u.requireArguments(), new VT3(e4u.A00, e4u.A08.booleanValue()));
        } else if (g8t != null) {
            g8t.Cm0(z ? 1 : 0);
        } else {
            C49496Ewb A002 = FCJ.A00(e4u.A02);
            if (A002 != null) {
                String str = A002.A01;
                String str2 = A002.A00;
                Bundle bundle2 = e4u.mArguments;
                if (bundle2 == null || bundle2.getString("IgSessionManager.SESSION_TOKEN_KEY") == null) {
                    throw AnonymousClass7TE.A0z("Cannot call from fragment that is not aware of the current user");
                }
                FCJ.A01(e4u.getActivity(), DbX.A0U(e4u), str, str2);
            } else if (!C319606qt.A01(e4u.A02).A0K(e4u.A02.A06)) {
                DbX.A18(e4u.requireArguments(), new E76(), DbY.A0J(e4u.requireActivity(), e4u.A02));
            } else {
                e4u.A06.A00();
            }
        }
    }

    public final void A03(Bitmap bitmap) {
        FBY.A00().A02();
        this.A00 = bitmap;
        this.A03.A00 = bitmap;
        A00(this);
        this.A05.CwD(requireContext(), this.A03);
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [java.lang.Object, X.Ebf] */
    public final void onActivityResult(int i, int i2, Intent intent) {
        C47490E4u e4u;
        File file;
        String A0l;
        super.onActivityResult(i, i2, intent);
        C50349FZg fZg = this.A01;
        AnonymousClass36V r0 = fZg.A01;
        if (r0 != null) {
            r0.onActivityResult(i, i2, intent);
        }
        if (intent != null && i2 == -1) {
            if (i == 2) {
                File file2 = fZg.A03;
                if (file2 != null) {
                    Uri A012 = FFa.A01(intent, file2);
                    0qQ.A07(A012);
                    C50349FZg.A00(A012, fZg);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else if (i == 3) {
                String action = intent.getAction();
                if (action != null) {
                    new C46669Diy(DbT.A09(action), fZg, 1).execute(new Void[0]);
                }
            } else if (!(i != 4 || (e4u = fZg.A02) == null || (file = fZg.A04) == null)) {
                R8F r8f = new R8F();
                ? obj = new Object();
                obj.A00 = e4u;
                obj.A01 = r8f;
                String name = file.getName();
                0qQ.A07(name);
                String str = "";
                synchronized (2RR.class) {
                    if (2RR.A00 == null) {
                        2RR.A04();
                    }
                    if (str.length() == 0 && !DbU.A1a(name, ".")) {
                        str = ".jpg";
                        0wb.A03("PhotoStorage", 002.A0R("Filepath requested without extension. title=", name));
                    }
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append(2RR.A00);
                    A1A.append('/');
                    A1A.append(name);
                    A0l = AnonymousClass7TF.A0l(str, A1A);
                }
                fZg.A04 = new File(A0l);
                Context requireContext = e4u.requireContext();
                ContentResolver contentResolver = requireContext.getContentResolver();
                Uri A002 = FileProvider.A00(requireContext, file);
                0qQ.A07(A002);
                requireContext.revokeUriPermission(A002, 3);
                C290815g0 r2 = new C290815g0(new C13146TNe(4, contentResolver, file, file), 482);
                r2.A00 = new C385899ji(0, intent, obj, fZg);
                1ES.A03(r2);
            }
        }
        1KM.A01(intent, this.A02, this.A0E);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x001f, code lost:
        if (r1.getBoolean(X.C273654mx.A00(2337)) == false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r4) {
        /*
            r3 = this;
            r0 = -1936050066(0xffffffff8c9a386e, float:-2.376142E-31)
            int r2 = X.AnonymousClass0fD.A02(r0)
            X.C47490E4u.super.onCreate(r4)
            com.instagram.common.session.UserSession r0 = X.DbX.A0U(r3)
            r3.A02 = r0
            android.os.Bundle r1 = r3.mArguments
            if (r1 == 0) goto L_0x0021
            r0 = 2337(0x921, float:3.275E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r1 = r1.getBoolean(r0)
            r0 = 1
            if (r1 != 0) goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            r3.A09 = r0
            com.instagram.common.session.UserSession r1 = r3.A02
            X.FZg r0 = new X.FZg
            r0.<init>(r4, r1, r3)
            r3.A01 = r0
            X.EE0 r0 = new X.EE0
            r0.<init>(r3)
            r3.A0B = r0
            android.content.Context r0 = r3.getContext()
            if (r0 == 0) goto L_0x0047
            X.6ST r1 = X.DbW.A0Y(r3)
            r3.A07 = r1
            android.content.Context r0 = r3.requireContext()
            X.DbX.A15(r0, r1)
        L_0x0047:
            r0 = -1701360348(0xffffffff9a974d24, float:-6.2576764E-23)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47490E4u.onCreate(android.os.Bundle):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0077, code lost:
        if (r1.getBoolean(X.AnonymousClass000.A00(3096), true) != false) goto L_0x0079;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008b, code lost:
        if (r1.getBoolean("IS_SIGN_UP_FLOW") == false) goto L_0x008d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009d, code lost:
        if (r1.getBoolean(X.AnonymousClass000.A00(3094), true) != false) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.View onCreateView(android.view.LayoutInflater r16, android.view.ViewGroup r17, android.os.Bundle r18) {
        /*
            r15 = this;
            r0 = 1569902709(0x5d92d075, float:1.32238552E18)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r8 = r15
            com.instagram.common.session.UserSession r1 = r15.A02
            java.lang.String r0 = "profile_photo"
            X.AnonymousClass7TG.A1N(r1, r0)
            X.C49938FFr.A01(r1, r0)
            r0 = 2131628937(0x7f0e1389, float:1.888518E38)
            r4 = r16
            r1 = r17
            android.view.View r6 = X.DbT.A0C(r4, r1, r0)
            android.view.ViewGroup r3 = X.Dba.A04(r6)
            com.instagram.common.session.UserSession r1 = r15.A02
            X.FRN r0 = new X.FRN
            r0.<init>(r15, r15, r1)
            r15.A06 = r0
            android.os.Bundle r0 = r15.mArguments
            boolean r1 = X.FCK.A02(r0, r1)
            r5 = 1
            r0 = 2131628059(0x7f0e101b, float:1.88834E38)
            if (r1 == 0) goto L_0x0039
            r0 = 2131628060(0x7f0e101c, float:1.8883402E38)
        L_0x0039:
            r4.inflate(r0, r3, r5)
            android.content.res.Resources r1 = X.DbV.A05(r15)
            r0 = 2131165281(0x7f070061, float:1.7944775E38)
            int r0 = X.DbS.A03(r1, r0)
            r15.A0A = r0
            X.F3a r4 = new X.F3a
            r4.<init>(r15)
            androidx.fragment.app.FragmentActivity r3 = r15.getActivity()
            boolean r0 = r3 instanceof X.C51950G8t
            if (r0 == 0) goto L_0x00e7
            X.G8t r3 = (X.C51950G8t) r3
        L_0x0058:
            android.os.Bundle r1 = r15.mArguments
            r10 = -1
            if (r1 == 0) goto L_0x0067
            r0 = 3095(0xc17, float:4.337E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r10 = r1.getInt(r0, r10)
        L_0x0067:
            android.os.Bundle r1 = r15.mArguments
            r13 = 0
            if (r1 == 0) goto L_0x0079
            r0 = 3096(0xc18, float:4.338E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r5)
            r14 = 0
            if (r0 == 0) goto L_0x007a
        L_0x0079:
            r14 = 1
        L_0x007a:
            com.instagram.common.session.UserSession r9 = r15.A02
            X.FRN r0 = r15.A06
            androidx.fragment.app.Fragment r0 = r0.A00
            android.os.Bundle r1 = r0.mArguments
            if (r1 == 0) goto L_0x008d
            java.lang.String r0 = "IS_SIGN_UP_FLOW"
            boolean r0 = r1.getBoolean(r0)
            r12 = 1
            if (r0 != 0) goto L_0x008e
        L_0x008d:
            r12 = 0
        L_0x008e:
            android.os.Bundle r1 = r15.mArguments
            if (r1 == 0) goto L_0x009f
            r0 = 3094(0xc16, float:4.336E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r5)
            r11 = 0
            if (r0 == 0) goto L_0x00a0
        L_0x009f:
            r11 = 1
        L_0x00a0:
            android.os.Bundle r1 = r15.mArguments
            if (r1 == 0) goto L_0x00b0
            r0 = 3093(0xc15, float:4.334E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r1.getBoolean(r0, r5)
            if (r0 == 0) goto L_0x00b1
        L_0x00b0:
            r13 = 1
        L_0x00b1:
            X.F0j r7 = new X.F0j
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)
            r15.A03 = r7
            com.instagram.common.session.UserSession r1 = r15.A02
            android.os.Bundle r0 = r15.mArguments
            boolean r0 = X.FCK.A02(r0, r1)
            com.instagram.common.session.UserSession r1 = r15.A02
            if (r0 == 0) goto L_0x00e1
            X.Ffh r0 = new X.Ffh
            r0.<init>(r15, r1, r4, r3)
        L_0x00c9:
            r15.A05 = r0
            X.EE0 r0 = r15.A0B
            if (r0 == 0) goto L_0x00da
            androidx.fragment.app.FragmentActivity r1 = r15.requireActivity()
            com.instagram.base.activity.IgFragmentActivity r1 = (com.instagram.base.activity.IgFragmentActivity) r1
            X.EE0 r0 = r15.A0B
            r1.registerOnActivityResultListener(r0)
        L_0x00da:
            r0 = -15154339(0xffffffffff18c35d, float:-2.0305704E38)
            X.AnonymousClass0fD.A09(r0, r2)
            return r6
        L_0x00e1:
            X.Ffg r0 = new X.Ffg
            r0.<init>(r1, r4, r3)
            goto L_0x00c9
        L_0x00e7:
            r3 = 0
            goto L_0x0058
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C47490E4u.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(1028438202);
        super.onDestroy();
        C50349FZg fZg = this.A01;
        fZg.A02 = null;
        fZg.A00 = null;
        AnonymousClass0fD.A09(1437999379, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-2115344658);
        super.onDestroyView();
        synchronized (FBY.A00()) {
        }
        this.A05.D8T(requireContext(), this.A03);
        if (this.A0B != null) {
            requireActivity().unregisterOnActivityResultListener(this.A0B);
        }
        AnonymousClass0fD.A09(-2009188936, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(1924829688);
        super.onResume();
        A00(this);
        requireContext();
        AnonymousClass0fD.A09(619636078, A022);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        C50349FZg fZg = this.A01;
        0qQ.A0B(bundle, 0);
        C49449Evq evq = fZg.A00;
        if (evq != null) {
            bundle.putParcelable("AddAvatarHelper.IMAGE_METADATA", evq.A01);
        }
        File file = fZg.A04;
        if (file != null) {
            bundle.putString("tempCameraPhotoFile", file.getPath());
        }
        File file2 = fZg.A03;
        if (file2 != null) {
            bundle.putString("tempGalleryPhotoFile", file2.getPath());
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.A05.Dyq(requireContext(), view, this.A03);
        C50349FZg fZg = this.A01;
        C47490E4u e4u = fZg.A02;
        if (e4u != null) {
            fZg.A01 = AnonymousClass36R.A00(e4u.requireContext(), fZg.A07, new C50347FZe(fZg, e4u));
            C49449Evq evq = fZg.A00;
            if (evq != null) {
                e4u.A03(evq.A00);
            }
        }
        FBY A002 = FBY.A00();
        synchronized (A002) {
        }
        synchronized (A002) {
        }
        synchronized (A002) {
        }
        Boolean.FALSE.equals((Object) null);
    }
}
