package X;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.comments.mvvm.data.MediaCommentListRepository;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.DirectThreadThemeInfo;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import java.util.LinkedHashMap;

/* renamed from: X.K6q  reason: case insensitive filesystem */
public final class C61419K6q extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "BroadcastChannelRepliesListFullScreenFragment";
    public C63854L9j A00;
    public NIE A01;
    public final AnonymousClass0eM A02 = JTQ.A0l(this, 33);
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04 = JTQ.A0l(this, 34);
    public final AnonymousClass0eM A05;
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;

    public final String getModuleName() {
        return AnonymousClass000.A00(98);
    }

    public final boolean isOrganicEligible() {
        return false;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        View view2 = view;
        0qQ.A0B(view2, 0);
        BaseFragmentActivity requireActivity = requireActivity();
        0qQ.A0C(requireActivity, C66579MXk.A00(7));
        2dZ AYJ = requireActivity.AYJ();
        if (AYJ != null) {
            AYJ.Etr(true);
        }
        AnonymousClass0eM r2 = this.A06;
        UserSession A0l = AnonymousClass7TE.A0l(r2);
        FragmentActivity requireActivity2 = requireActivity();
        Context requireContext = requireContext();
        DirectThreadThemeInfo directThreadThemeInfo = ((C70804OLz) this.A02.getValue()).A02;
        View rootView = view2.getRootView();
        0qQ.A07(rootView);
        this.A00 = new C63854L9j(requireContext, rootView, requireActivity2, A0l, directThreadThemeInfo);
        View A0b = AnonymousClass7TE.A0b(view2, R.id.main_list_view);
        FragmentActivity requireActivity3 = requireActivity();
        r2.getValue();
        AnonymousClass0eM r5 = this.A07;
        C64300LZa lZa = new C64300LZa(requireActivity3, view2, (C60314JjH) r5.getValue(), this);
        this.mLifecycleRegistry.A09(lZa);
        UserSession A0l2 = AnonymousClass7TE.A0l(r2);
        C60314JjH jjH = (C60314JjH) r5.getValue();
        C63854L9j l9j = this.A00;
        if (l9j != null) {
            C65275LqU lqU = new C65275LqU(this, A0l2, lZa, jjH, l9j.A00.A07);
            C334297b2 r9 = new C334297b2((C333777a7) ((C60314JjH) r5.getValue()).A06.A03.getValue(), AnonymousClass7TE.A0l(r2), this);
            r9.A00(A0b, AnonymousClass3DZ.A00(this));
            07U r6 = 07U.A05;
            AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
            AnonymousClass7TE.A1Z(new C59700JUh(viewLifecycleOwner, r6, this, lZa, r9, A0b, this, lqU, (AnonymousClass4D7) null, 10), AnonymousClass07a.A00(viewLifecycleOwner));
            C63854L9j l9j2 = this.A00;
            if (l9j2 != null) {
                FragmentActivity fragmentActivity = l9j2.A03;
                View findViewById = fragmentActivity.findViewById(R.id.layout_container_parent);
                if (findViewById instanceof CoordinatorLayout) {
                    ((CoordinatorLayout) findViewById).setStatusBarBackground((Drawable) null);
                }
                DirectThreadThemeInfo directThreadThemeInfo2 = l9j2.A05;
                if (directThreadThemeInfo2 != null) {
                    boolean A002 = AnonymousClass3HA.A00(l9j2.A01);
                    if (A002) {
                        str = directThreadThemeInfo2.A0i;
                    } else {
                        str = directThreadThemeInfo2.A0l;
                    }
                    if (str != null) {
                        0nY.A00().ATE(new C3256273j(fragmentActivity, new C40452AcN(l9j2, directThreadThemeInfo2, A002), str));
                    }
                }
                super.onViewCreated(view2, bundle);
                return;
            }
        }
        0qQ.A0F("themeHelper");
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A06);
    }

    public final boolean onBackPressed() {
        NIE nie = this.A01;
        if (nie == null || !nie.isVisible() || nie.A02.A0G) {
            return false;
        }
        nie.onBackPressed();
        DbT.A1K(this);
        return true;
    }

    public C61419K6q() {
        C73657PhW phW = new C73657PhW(this, 38);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73657PhW(new C73657PhW(this, 35), 36));
        this.A07 = DbS.A0I(new C73657PhW(A002, 37), phW, new C73664Phd(26, A002, (Object) null), DbS.A0z(C60314JjH.class));
        this.A05 = AnonymousClass1YB.A00(C66253MKo.A00);
        this.A03 = AnonymousClass1YB.A00(C66252MKn.A00);
        this.A06 = C227642jf.A02(this);
    }

    public final void configureActionBar(2da r13) {
        boolean A1T = JTU.A1T(r13);
        AnonymousClass0eM r4 = this.A06;
        View ETj = r13.ETj(AnonymousClass7TE.A0l(r4), R.layout.direct_thread_action_bar_left_aligned, A1T ? 1 : 0, A1T);
        C63854L9j l9j = this.A00;
        String str = null;
        if (l9j == null) {
            0qQ.A0F("themeHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(l9j.A00.A04.A00);
        r13.ENd(gradientDrawable);
        GradientSpinnerAvatarView A0j = DbX.A0j(ETj, R.id.avatar_container);
        new C330087Lj(DbV.A0T(ETj, R.id.group_photo_faceswarm_stub, A1T), A0j).Eu3(this);
        AnonymousClass0eM r5 = this.A02;
        A0j.A0F((AnonymousClass9IV) null, this, DbS.A0V(((C70804OLz) r5.getValue()).A0B));
        A0j.setGradientSpinnerVisible(A1T);
        String str2 = ((C70804OLz) r5.getValue()).A03;
        if (str2 != null) {
            AnonymousClass0fU.A00(new LXK(str2, this, 12), A0j);
        }
        TextView A0R = AnonymousClass7TG.A0R(ETj, R.id.thread_title);
        Context context = getContext();
        if (context != null) {
            str = context.getString(2131959330);
        }
        A0R.setText(str);
        TextView textView = (TextView) AnonymousClass7TF.A0G(ETj, R.id.reply_message_quote);
        if (((C70804OLz) r5.getValue()).A08.length() > 0) {
            Context requireContext = requireContext();
            String str3 = ((C70804OLz) r5.getValue()).A08;
            boolean z = ((C70804OLz) r5.getValue()).A0G;
            textView.setVisibility(A1T);
            if (!z) {
                textView.setText(str3);
            } else {
                textView.post(new C73352PbB(requireContext, textView, this, str3));
            }
        } else {
            textView.setVisibility(8);
            if (((C70804OLz) r5.getValue()).A08.length() == 0) {
                if (182.A06(0Tu.A05, DbT.A0X(r4), 36319407395708248L)) {
                    07U r8 = 07U.A05;
                    AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
                    AnonymousClass7TE.A1Z(new MHF(viewLifecycleOwner, textView, r8, this, (AnonymousClass4D7) null, 22), AnonymousClass07a.A00(viewLifecycleOwner));
                }
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(807580083);
        C61419K6q.super.onCreate(bundle);
        C60314JjH jjH = (C60314JjH) this.A07.getValue();
        C318136oS A002 = C318116oQ.A00(jjH);
        C66162MFz mFz = new C66162MFz(jjH, (AnonymousClass4D7) null, 25);
        19B r7 = 19B.A00;
        1Eo.A05(r7, mFz, A002);
        C53335GmL gmL = jjH.A03;
        if (gmL.A0e && gmL.A0O) {
            jjH.A05.A0E();
        }
        C333747a3 r2 = jjH.A04;
        String str = gmL.A0E;
        0qQ.A0B(str, 0);
        AnonymousClass9JD r5 = (AnonymousClass9JD) r2.A00.A00.get(str);
        if (r5 != null) {
            String str2 = r5.A02;
            if (str2 != null) {
                MediaCommentListRepository mediaCommentListRepository = jjH.A05;
                C73949PmT pmT = new C73949PmT(jjH, r5, str2, 27);
                1Eo.A05(r7, new MH4((AnonymousClass4D7) null, (Object) pmT, (Object) mediaCommentListRepository, 15), mediaCommentListRepository.A01);
            }
            jjH.A0C.Epw(new P0f((CharSequence) r5.A01));
        }
        AnonymousClass0fD.A09(560380873, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-670984166);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_replies_list_full_screen_view, viewGroup, false);
        AnonymousClass0fD.A09(-1774119076, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-807422633);
        super.onDestroy();
        if (((C70804OLz) this.A02.getValue()).A00 != null) {
            Bundle A0a = AnonymousClass7TE.A0a();
            getParentFragmentManager().A0z(AnonymousClass000.A00(3881), A0a);
        }
        C63854L9j l9j = this.A00;
        if (l9j == null) {
            0qQ.A0F("themeHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        l9j.A02.setBackground(new ColorDrawable(AnonymousClass7TF.A03(l9j.A01, R.attr.backgroundColorPrimary)));
        AnonymousClass0fD.A09(826666764, A022);
    }

    public final void onDestroyView() {
        C242243Te r0;
        int A022 = AnonymousClass0fD.A02(896611708);
        LSm lSm = (LSm) this.A04.getValue();
        AnonymousClass2Ep A002 = LSm.A00(lSm);
        if (!(A002 == null || (r0 = ((AnonymousClass3U9) A002).A01.A0s) == null)) {
            LinkedHashMap A072 = 0Yt.A07(new 0eP[]{LSm.A02(lSm), LSm.A03(lSm, r0, A002)});
            DbZ.A0R(lSm.A04).A0W("leave_comments_sheet", "tap", "comments_sheet", "comments_view", A002.C6C(), A002.C6k(), A072, A002.AdN());
        }
        super.onDestroyView();
        AnonymousClass0fD.A09(1460630114, A022);
    }
}
