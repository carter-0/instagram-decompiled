package X;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.model.DirectThreadThemeInfo;

public final class H13 extends AnonymousClass4DH implements C252213ok {
    public static final String __redex_internal_original_name = "AiThemesFragment";
    public I6F A00;
    public boolean A01;
    public int A02;
    public C254743sy A03;
    public boolean A04;
    public final AnonymousClass0eM A05 = AnonymousClass1YB.A00(new C58672Ivh(this, 39));
    public final AnonymousClass0eM A06 = AnonymousClass1YB.A00(new C58672Ivh(this, 40));
    public final AnonymousClass0eM A07 = C227642jf.A02(this);
    public final AnonymousClass0eM A08 = DbS.A0I(new C58672Ivh(this, 42), new C58672Ivh(this, 43), new C58717IwQ(38, (Object) null, this), DbS.A0z(C53032GhN.class));
    public final AnonymousClass3E6 A09 = AnonymousClass3E4.A01(this, false, true);

    public final String getModuleName() {
        return "aithemes_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A03 = (C254743sy) C320236s2.A00(requireArguments(), Object.class, AnonymousClass000.A00(15));
        this.A02 = requireArguments().getInt(AnonymousClass000.A00(32));
        this.A04 = requireArguments().getBoolean(AnonymousClass000.A00(218));
        this.A01 = requireArguments().getBoolean("is_ai_theme_set");
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHJ((Object) viewLifecycleOwner, (Object) r3, (Object) this, (AnonymousClass4D7) null, 48), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final String A00(H13 h13) {
        boolean A002 = C56496HzS.A00((C56496HzS) h13.A05.getValue());
        C53032GhN A0i = C51968G9o.A0i(h13);
        if (!A002) {
            return A0i.A01();
        }
        AnonymousClass0Ud r1 = A0i.A0I;
        Integer num = ((C53390GnN) r1.getValue()).A02;
        if (num != null) {
            return C53390GnN.A00(r1, num.intValue()).A06;
        }
        return null;
    }

    public static final String A01(H13 h13) {
        boolean A002 = C56496HzS.A00((C56496HzS) h13.A05.getValue());
        C53032GhN A0i = C51968G9o.A0i(h13);
        if (!A002) {
            return A0i.A01();
        }
        AnonymousClass0Ud r1 = A0i.A0I;
        Integer num = ((C53390GnN) r1.getValue()).A02;
        if (num != null) {
            return C53390GnN.A00(r1, num.intValue()).A07;
        }
        return null;
    }

    public static final void A03(H13 h13, DirectThreadThemeInfo directThreadThemeInfo) {
        Intent intent = new Intent();
        intent.putExtra("theme_id", directThreadThemeInfo.A0o);
        intent.putExtra(AnonymousClass000.A00(1128), directThreadThemeInfo.A0l);
        DbX.A17(intent, h13);
        DbT.A1K(h13);
    }

    public final AnonymousClass0wW getSession() {
        return DbS.A0T(this.A07);
    }

    public static final void A02(H13 h13) {
        String str;
        String A012 = C51968G9o.A0i(h13).A01();
        if (A012 != null) {
            I6F i6f = h13.A00;
            if (i6f == null) {
                str = "aiThemesLogger";
            } else {
                0Aj A0e = AnonymousClass7TE.A0e(i6f.A01, C66579MXk.A00(794));
                if (A0e.isSampled()) {
                    A0e.AAJ(C66579MXk.A00(981), A012);
                    I6F.A01(I6F.A00(i6f.A03), A0e, i6f, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                    A0e.A8M(C54670HOb.AI_THEME_LOADING, "minor_entry_point");
                    I6F.A02(A0e, i6f);
                }
                UserSession A0l = AnonymousClass7TE.A0l(h13.A07);
                C254743sy r1 = h13.A03;
                if (r1 == null) {
                    str = "threadKey";
                } else {
                    C66671Mae.A0G(A0l, r1, A012, h13.A04);
                    h13.requireActivity().setResult(-1);
                    DbT.A1K(h13);
                    return;
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public static final void A04(H13 h13, DirectThreadThemeInfo directThreadThemeInfo, boolean z) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString(C66579MXk.A00(201), directThreadThemeInfo.A0o);
        C254743sy r1 = h13.A03;
        if (r1 == null) {
            0qQ.A0F("threadKey");
            throw AnonymousClass00P.createAndThrow();
        }
        A0a.putParcelable(AnonymousClass000.A00(15), (Parcelable) r1);
        A0a.putParcelable(C66579MXk.A00(199), directThreadThemeInfo);
        A0a.putInt(AnonymousClass000.A00(32), h13.A02);
        A0a.putSerializable(C66579MXk.A00(200), AnonymousClass05K.A0C);
        NJ3 nj3 = new NJ3();
        nj3.setArguments(A0a);
        0qQ.A0C(nj3, C66579MXk.A00(999));
        nj3.A0D = new IR1(h13, directThreadThemeInfo, z);
        C309516Yo r12 = (C309516Yo) h13.A06.getValue();
        r12.A0D(nj3);
        r12.A0A = C66579MXk.A00(214);
        r12.A04();
    }

    public final void DMr(int i, boolean z) {
        Object value;
        C53390GnN gnN;
        C53032GhN A0i = C51968G9o.A0i(this);
        float A012 = 0nA.A01(requireContext(), (float) i);
        05G r5 = A0i.A0H;
        do {
            value = r5.getValue();
            gnN = (C53390GnN) value;
        } while (!r5.AIY(value, C53390GnN.A01(gnN.A01, gnN.A02, gnN.A03, A012, gnN.A04)));
    }

    public final void afterOnCreate(Bundle bundle) {
        FragmentActivity activity;
        Window window;
        super.afterOnCreate(bundle);
        if (Build.VERSION.SDK_INT >= 30 && (activity = getActivity()) != null && (window = activity.getWindow()) != null) {
            window.addFlags(512);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-953282398);
        String string = requireArguments().getString(AnonymousClass000.A00(219), "undefined");
        boolean A0K = 0qQ.A0K(string, "ugc");
        1Av A0h = DbX.A0h(this.A07);
        AnonymousClass7TF.A1J(A0h, A0h.A08, 1Av.A8a, 431, true);
        0wc A012 = AnonymousClass0kN.A01(this, getSession());
        String string2 = requireArguments().getString("theme_type", "UNDEFINED");
        0qQ.A07(string2);
        0qQ.A0A(string);
        String string3 = requireArguments().getString(C66579MXk.A00(1015));
        C254743sy r8 = (C254743sy) C320236s2.A00(requireArguments(), Object.class, AnonymousClass000.A00(15));
        C51972G9s.A1C(r8, string);
        this.A00 = new I6F(A012, r8, string2, string3, string);
        ComposeView A002 = GTX.A00(this, AnonymousClass5PI.A04(new J73(13, this, A0K), 1830296582, true));
        AnonymousClass0fD.A09(465072701, A022);
        return A002;
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-555589651);
        super.onResume();
        AnonymousClass3E6 r1 = this.A09;
        r1.DmJ(requireActivity());
        r1.A9Y(this);
        AnonymousClass0fD.A09(-1856399898, A022);
    }
}
