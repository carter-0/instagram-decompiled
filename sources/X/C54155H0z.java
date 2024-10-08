package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.base.activity.IgFragmentActivity;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.quickpromotion.intf.QPTooltipAnchor;

/* renamed from: X.H0z  reason: case insensitive filesystem */
public final class C54155H0z extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "SchoolTabFragment";
    public C54672HOd A00 = C54672HOd.PROFILE_BIO;
    public String A01;
    public final IO7 A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;

    public final void configureActionBar(2da r5) {
        0qQ.A0B(r5, 0);
        r5.setTitle(this.A01);
        r5.Eu4(true);
        if (AnonymousClass7TF.A1Z(this.A0E)) {
            AnonymousClass3JR A0K = DbS.A0K();
            A0K.A06 = R.drawable.instagram_settings_pano_outline_24;
            A0K.A05 = 2131965849;
            A0K.A0G = ID1.A00(this, 5);
            A0K.A0N = true;
            r5.AA3(new AnonymousClass3Jb(A0K));
            AnonymousClass3JR A0K2 = DbS.A0K();
            A0K2.A06 = R.drawable.instagram_direct_pano_outline_24;
            A0K2.A05 = 2131964479;
            A0K2.A0G = ID1.A00(this, 4);
            A0K2.A0N = true;
            View A0P = C51970G9q.A0P(A0K2, r5);
            if (this.A01.length() > 0) {
                ((C230882qT) this.A08.getValue()).A00(A0P, QPTooltipAnchor.SCHOOL_DIRECTORY_INVITE_AIRPLANE, (2bu) this.A07.getValue());
                return;
            }
            return;
        }
        r5.ErD(ID1.A00(this, 3), R.drawable.instagram_more_vertical_pano_outline_24).setColorFilter(AnonymousClass37O.A00(2Yu.A0F(getContext(), R.attr.textColorPrimary)));
    }

    public final String getModuleName() {
        return "schooltab_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C51966G9m.A0z(this.A0A).A04(this.A00, C54684HOp.DIRECTORY);
        07U r2 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MH5(r2, this, viewLifecycleOwner, (AnonymousClass4D7) null, 44), AnonymousClass07a.A00(viewLifecycleOwner));
        ((2bu) this.A07.getValue()).Dh3();
    }

    public static final void A00(C54155H0z h0z) {
        1xC r5 = 1xC.A01;
        C310336ap A0a = DbS.A0a();
        A0a.A0D = DbW.A0h(h0z.requireActivity(), h0z.A01, 2131972098);
        A0a.A0R = true;
        DbY.A1K(r5, A0a);
        DbT.A1J(h0z);
    }

    public static final void A01(C54155H0z h0z) {
        Bundle A0a = AnonymousClass7TE.A0a();
        DbV.A0Y(h0z.requireActivity(), A0a, DbT.A0X(h0z.A0B), ModalActivity.class, "school_settings").A0A(h0z.requireActivity(), 7001);
    }

    public static final void A02(C54155H0z h0z) {
        C49731F3w A082 = 1as.A04.A02.A08(AnonymousClass7TE.A0l(h0z.A0B), 2FW.A1W, "schooltab_fragment");
        A082.A01 = new IR4();
        A082.A06("as");
        A082.A01();
        DirectShareSheetFragment A002 = A082.A00();
        AnonymousClass37D A0g = DbV.A0g(h0z, AnonymousClass37D.A00);
        if (A0g != null) {
            A0g.A0J(A002);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0B);
    }

    public final boolean onBackPressed() {
        C51966G9m.A0z(this.A0A).A05(this.A00, C54684HOp.DIRECTORY);
        return false;
    }

    public C54155H0z() {
        C20608Wvp wvp = new C20608Wvp(this, 21);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20608Wvp(new C20608Wvp(this, 16), 17));
        this.A0F = DbS.A0I(new C20608Wvp(A002, 18), wvp, new C58691Iw0(39, (Object) null, A002), DbS.A0z(C53025GhG.class));
        this.A01 = "";
        this.A06 = AnonymousClass0eN.A01(new C20608Wvp(this, 6));
        this.A0E = AnonymousClass0eN.A01(new C20608Wvp(this, 20));
        this.A05 = AnonymousClass1YB.A00(new C20608Wvp(this, 5));
        this.A04 = AnonymousClass1YB.A00(new C20608Wvp(this, 4));
        this.A0C = AnonymousClass1YB.A00(new C20608Wvp(this, 15));
        this.A03 = AnonymousClass1YB.A00(C58494Isp.A00);
        this.A08 = AnonymousClass1YB.A00(new C20608Wvp(this, 12));
        this.A07 = AnonymousClass1YB.A00(new C20608Wvp(this, 11));
        this.A02 = new IO7(this, 1);
        this.A0D = AnonymousClass0eN.A01(new C20608Wvp(this, 19));
        this.A09 = AnonymousClass0eN.A01(new C20608Wvp(this, 13));
        this.A0A = AnonymousClass0eN.A01(new C20608Wvp(this, 14));
        this.A0B = C227642jf.A02(this);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-816246407);
        C54155H0z.super.onCreate(bundle);
        IgFragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof BaseFragmentActivity) {
            requireActivity.registerOnActivityResultListener(this.A02);
        }
        ((C53025GhG) this.A0F.getValue()).A01(0);
        AnonymousClass0fD.A09(-1334209165, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(897603333);
        ComposeView A0H = DbV.A0H(this, new C59343JFv(this, 48), 599289769);
        AnonymousClass0fD.A09(-1345555394, A022);
        return A0H;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(989673599);
        super.onDestroy();
        IgFragmentActivity requireActivity = requireActivity();
        if (requireActivity instanceof BaseFragmentActivity) {
            requireActivity.unregisterOnActivityResultListener(this.A02);
        }
        AnonymousClass0fD.A09(1960744287, A022);
    }
}
