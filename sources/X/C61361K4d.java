package X;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.contentnotes.domain.immersivereply.ContentNotesImmersiveReplyContent;
import com.instagram.contentnotes.ui.immersivereply.ImmersiveReplyControlMenuViewBinder;
import com.instagram.ui.text.backinterceptedittext.BackInterceptEditText;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;

/* renamed from: X.K4d  reason: case insensitive filesystem */
public final class C61361K4d extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ContentNotesImmersiveReplyFragment";
    public C63890LAt A00;
    public final AnonymousClass0iw A01;
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;
    public final AnonymousClass0eM A05 = MMC.A00(this, 30);
    public final AnonymousClass0eM A06;
    public final AnonymousClass0eM A07;
    public final AnonymousClass0eM A08;
    public final AnonymousClass0eM A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D = C227642jf.A02(this);
    public final AnonymousClass0eM A0E;

    public static final void A02(C61361K4d k4d) {
        AnonymousClass0xx A0J;
        0sL mh4;
        C61361K4d k4d2 = k4d;
        C63890LAt lAt = k4d.A00;
        if (lAt == null || !C71106Ock.A00.A04(AnonymousClass7TE.A0l(k4d.A0D))) {
            JTS.A0z(k4d);
            return;
        }
        String str = C60299Jix.A00(k4d).A02.A08;
        0qQ.A0B(str, 0);
        L3X l3x = new L3X((C53016Gh7) k4d.A08.getValue(), str);
        04k A002 = C586203k.A00(lAt.A02);
        if (A002 == null || !A002.A00.A0I(8)) {
            A0J = DbV.A0J(k4d);
            mh4 = new MH4(l3x, k4d2, lAt, (AnonymousClass4D7) null, 33);
        } else {
            FragmentActivity activity = k4d.getActivity();
            if (activity != null) {
                A0J = DbV.A0J(k4d);
                mh4 = new MHG(lAt, activity, k4d2, l3x, (AnonymousClass4D7) null, 43);
            } else {
                return;
            }
        }
        AnonymousClass7TE.A1Z(mh4, A0J);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        View view2;
        String A0e;
        long j;
        View view3 = view;
        0qQ.A0B(view3, 0);
        super.onViewCreated(view3, bundle);
        View A0G = AnonymousClass7TF.A0G(view3, R.id.immersive_reply_fragment);
        LY1.A00(A0G, 55, this);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            view2 = activity.findViewById(R.id.layout_container_parent);
        } else {
            view2 = null;
        }
        C71106Ock ock = C71106Ock.A00;
        AnonymousClass0eM r38 = this.A0D;
        if (!ock.A04(AnonymousClass7TE.A0l(r38))) {
            int A032 = AnonymousClass7TF.A03(getContext(), R.attr.igds_color_dimmer);
            if (view2 != null) {
                view2.setBackgroundColor(A032);
            }
        }
        View A0G2 = AnonymousClass7TF.A0G(view3, R.id.immersive_reply_three_dot_menu);
        ImmersiveReplyControlMenuViewBinder immersiveReplyControlMenuViewBinder = (ImmersiveReplyControlMenuViewBinder) this.A03.getValue();
        UserSession userSession = immersiveReplyControlMenuViewBinder.A02;
        0Tu r15 = 0Tu.A05;
        if (!182.A06(r15, userSession, 36323161193917372L)) {
            A0G2.setVisibility(8);
        } else {
            A0G2.setVisibility(0);
            AnonymousClass0fU.A00(new LY8(32, A0G2, immersiveReplyControlMenuViewBinder), A0G2);
        }
        BackInterceptEditText backInterceptEditText = (BackInterceptEditText) AnonymousClass7TF.A0G(view3, R.id.reply_edit_text);
        boolean z = C60299Jix.A00(this).A0F;
        Resources A052 = DbV.A05(this);
        if (z) {
            A0e = A052.getString(2131956639);
        } else {
            A0e = AnonymousClass7TF.A0e(A052, C60299Jix.A00(this).A06, 2131956640);
        }
        backInterceptEditText.setHint(A0e);
        backInterceptEditText.setOnBackCallback(new MMC(this, 32));
        backInterceptEditText.addTextChangedListener(new LWS(AnonymousClass7TE.A0l(r38), C60299Jix.A00(this)));
        View A0G3 = AnonymousClass7TF.A0G(view3, R.id.reply_note_bubble);
        Object value = this.A0B.getValue();
        07U r29 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass0xx A002 = AnonymousClass07a.A00(viewLifecycleOwner);
        C59703JUk jUk = new C59703JUk(value, (Object) this, (Object) A0G3, (Object) r29, (Object) viewLifecycleOwner, (AnonymousClass4D7) null, 28);
        19B r8 = 19B.A00;
        1Eo.A05(r8, jUk, A002);
        View A0G4 = AnonymousClass7TF.A0G(view3, R.id.reply_mimicry_bubble);
        View A0G5 = AnonymousClass7TF.A0G(view3, R.id.immersive_reply_container);
        TextView textView = (TextView) AnonymousClass7TF.A0G(view3, R.id.context_text_view);
        View A0G6 = AnonymousClass7TF.A0G(view3, R.id.group_reply_recipients_container);
        View findViewById = A0G5.findViewById(R.id.note_quick_reply_message_container);
        ViewGroup viewGroup = (ViewGroup) AnonymousClass7TF.A0G(view3, R.id.quick_emoji_reply_container);
        0qQ.A0A(findViewById);
        C63890LAt lAt = new C63890LAt(view2, A0G, A0G5, A0G3, textView, findViewById, A0G4, A0G6, backInterceptEditText);
        this.A00 = lAt;
        C64898Ljy ljy = new C64898Ljy(this, AnonymousClass7TE.A0l(r38), (C63609Kzx) A00(this).A07.getValue(), lAt, DbV.A0J(this), C60299Jix.A00(this).A0G, C60299Jix.A00(this).A0H);
        AnonymousClass07Z viewLifecycleOwner2 = getViewLifecycleOwner();
        1Eo.A05(r8, new C59703JUk((Object) ljy, (Object) this, (Object) A0G4, (Object) r29, (Object) viewLifecycleOwner2, (AnonymousClass4D7) null, 27), AnonymousClass07a.A00(viewLifecycleOwner2));
        C63693L3d l3d = (C63693L3d) this.A06.getValue();
        ContentNotesImmersiveReplyContent A003 = C60299Jix.A00(this);
        boolean A1U = AnonymousClass7TF.A1U(0, textView, A003);
        if (A003.A0F) {
            textView.setVisibility(8);
        } else {
            String str = A003.A06;
            if (str.length() == 0) {
                str = A003.A0A;
            }
            String A0w = DbV.A0w(textView.getResources(), str, A003.A09, 2131956659);
            0qQ.A07(A0w);
            SpannableStringBuilder A0C2 = DbS.A0C(A0w);
            A0C2.setSpan(new C62139Kas(l3d, 2Yu.A0F(textView.getContext(), R.attr.textColorOnMedia)), 0, DbX.A05(str), 33);
            DbX.A1G(textView, SpannableString.valueOf(A0C2));
        }
        boolean z2 = C60299Jix.A00(this).A0F;
        0lg A0X = DbT.A0X(r38);
        if (z2) {
            0qQ.A0B(A0X, 0);
            j = 36328263614741674L;
        } else {
            0qQ.A0B(A0X, 0);
            j = 36323161194376131L;
        }
        if (182.A06(r15, A0X, j)) {
            Object value2 = this.A0A.getValue();
            int dimensionPixelSize = DbV.A05(this).getDimensionPixelSize(R.dimen.asset_picker_section_title_horizontal_padding);
            int A012 = DbY.A01(requireContext());
            UserSession A0l = AnonymousClass7TE.A0l(r38);
            AnonymousClass7TF.A1D(viewGroup, 0, A0l);
            viewGroup.setVisibility(0);
            C71100Oca.A03(viewGroup, this, A0l, new C66200MIh(value2, 18), dimensionPixelSize, A012);
            LWP.A00(backInterceptEditText, viewGroup, A1U ? 1 : 0);
        }
        ViewGroup A0I = DbX.A0I(view3, R.id.row_thread_composer_send_button_container);
        Object value3 = this.A0C.getValue();
        0qQ.A0B(A0I, 0);
        AnonymousClass0fU.A00(LYA.A00(backInterceptEditText, A0I, value3, 6), A0I);
        C308476Uk r7 = new C308476Uk(A0I);
        Context A0S = AnonymousClass7TE.A0S(A0I);
        r7.A00(1QE.A0B(A0S, (1QG) null).getDefaultColor(), false);
        r7.A02.getDrawable().setTint(1QE.A0C(A0S, (1QG) null).getDefaultColor());
        backInterceptEditText.addTextChangedListener(new C71273OhE(r7, A1U));
        AnonymousClass07Z viewLifecycleOwner3 = getViewLifecycleOwner();
        1Eo.A05(r8, new MH4(r29, this, viewLifecycleOwner3, (AnonymousClass4D7) null, 32), AnonymousClass07a.A00(viewLifecycleOwner3));
        IgBouncyUfiButtonImageView igBouncyUfiButtonImageView = (IgBouncyUfiButtonImageView) AnonymousClass7TF.A0F(view3, R.id.note_like_button);
        if (C60299Jix.A00(this).A0F) {
            igBouncyUfiButtonImageView.setVisibility(8);
        } else {
            C72379P3s p3s = new C72379P3s(this, 0);
            C60299Jix A004 = A00(this);
            05G r12 = A004.A0B;
            AnonymousClass4JK r13 = A004.A02;
            ContentNotesImmersiveReplyContent contentNotesImmersiveReplyContent = A004.A03;
            AnonymousClass7TF.A1O(r12, r13.A05(contentNotesImmersiveReplyContent.A02.A08, contentNotesImmersiveReplyContent.A07));
            1Eo.A05(r8, new MG7(A004, (AnonymousClass4D7) null, 41), C318116oQ.A00(A004));
            ((C63939LEc) this.A07.getValue()).A01((IgSimpleImageView) null, igBouncyUfiButtonImageView);
            07U r23 = 07U.A04;
            AnonymousClass07Z viewLifecycleOwner4 = getViewLifecycleOwner();
            1Eo.A05(r8, new C59703JUk((Object) p3s, (Object) this, (Object) igBouncyUfiButtonImageView, (Object) r23, (Object) viewLifecycleOwner4, (AnonymousClass4D7) null, 26), AnonymousClass07a.A00(viewLifecycleOwner4));
            backInterceptEditText.addTextChangedListener(new C16305UsY(0, igBouncyUfiButtonImageView, this));
        }
        if (C60299Jix.A00(this).A0F) {
            View view4 = A0G6;
            view4.setVisibility(0);
            RecyclerView A0I2 = DbT.A0I(view4, R.id.group_reply_recipients_recycler_view);
            Context context = A0I2.getContext();
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(context);
            linearLayoutManager.A1o(0);
            A0I2.setLayoutManager(linearLayoutManager);
            JTP.A1D(A0I2, 0, JTR.A05(context));
            A0I2.setAdapter((2Rw) AnonymousClass7TE.A14(((L3Z) this.A04.getValue()).A01));
            A0I2.setVisibility(0);
        }
        int i = 8;
        if (C71106Ock.A01()) {
            C64903Lk3 lk3 = new C64903Lk3(AnonymousClass7TE.A0l(r38), C60299Jix.A00(this).A01, (LD2) A00(this).A04.getValue(), lAt, new C63965LFq(requireActivity(), C60299Jix.A00(this).A0H), C60299Jix.A00(this).A0F);
            View view5 = lAt.A07;
            if (!C60299Jix.A00(this).A0F) {
                i = 4;
            }
            view5.setVisibility(i);
            if (ock.A04(AnonymousClass7TE.A0l(r38))) {
                lAt.A06.setVisibility(4);
            }
            lAt.A08.requestFocus();
            C63119Krn.A00(lAt.A02, lAt.A00, (AnonymousClass3E6) AnonymousClass7TE.A14(this.A05), lk3);
            new C586704n(DbV.A0G(this).getDecorView(), DbV.A0G(this)).A00.A03(8);
        } else {
            View view6 = lAt.A07;
            if (!C60299Jix.A00(this).A0F) {
                i = 0;
            }
            view6.setVisibility(i);
            View view7 = lAt.A02;
            View view8 = lAt.A01;
            AnonymousClass3E6 r4 = (AnonymousClass3E6) AnonymousClass7TE.A14(this.A05);
            C58727Iwa iwa = new C58727Iwa(this, 8);
            0qQ.A0B(r4, 2);
            view8.requestFocus();
            r4.A9Y(new WTX(0, view7, iwa));
            C69979NvJ.A00(lAt.A08);
            1Eo.A05(r8, new MG7(this, (AnonymousClass4D7) null, 42), DbV.A0J(this));
        }
        DbX.A0R(r38).A00(new AnonymousClass3EJ(JTQ.A0H(this.A02).A08));
        AnonymousClass07Z viewLifecycleOwner5 = getViewLifecycleOwner();
        07U r11 = r29;
        AnonymousClass07Z A0I3 = JTP.A0I(this, r8, new MH4(r11, this, viewLifecycleOwner5, (AnonymousClass4D7) null, 34), AnonymousClass07a.A00(viewLifecycleOwner5));
        1Eo.A05(r8, new MH4(r11, this, A0I3, (AnonymousClass4D7) null, 35), AnonymousClass07a.A00(A0I3));
    }

    public static final C60299Jix A00(C61361K4d k4d) {
        return (C60299Jix) k4d.A0E.getValue();
    }

    public static final AnonymousClass2kQ A01(C61361K4d k4d) {
        AnonymousClass0eM r3 = k4d.A02;
        return C227942kP.A01(JTQ.A0H(r3).A04, ((ContentNotesImmersiveReplyContent) r3.getValue()).A0D, ((ContentNotesImmersiveReplyContent) r3.getValue()).A0E);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0D);
    }

    public C61361K4d() {
        MMC mmc = new MMC(this, 42);
        MMC mmc2 = new MMC(this, 39);
        0eO r6 = 0eO.A02;
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r6, new MMC(mmc2, 40));
        this.A0E = DbS.A0I(new MMC(A002, 41), mmc, new GNG(35, (Object) null, A002), DbS.A0z(C60299Jix.class));
        this.A02 = C51975G9x.A0r(this, AnonymousClass000.A00(3636), r6, 28);
        this.A09 = MMC.A00(this, 34);
        this.A0B = MMC.A00(this, 36);
        this.A03 = MMC.A00(this, 28);
        this.A06 = MMC.A00(this, 31);
        this.A07 = AnonymousClass1YB.A00(MK2.A00);
        this.A0C = MMC.A00(this, 37);
        this.A0A = MMC.A00(this, 35);
        this.A04 = MMC.A00(this, 29);
        this.A08 = DbS.A0I(new MMC(this, 38), new MMC(this, 33), new GNG(34, (Object) null, this), DbS.A0z(C53016Gh7.class));
        this.A01 = DbS.A0O(__redex_internal_original_name);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1219971196);
        C61361K4d.super.onCreate(bundle);
        JTP.A17(this, (AnonymousClass3E6) AnonymousClass7TE.A14(this.A05));
        ((C53016Gh7) this.A08.getValue()).A00(JTQ.A0H(this.A02).A08);
        AnonymousClass0fD.A09(-1761642376, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(911930905);
        0qQ.A0B(layoutInflater, 0);
        C71106Ock.A00.A03(getActivity(), AnonymousClass7TE.A0l(this.A0D), C60299Jix.A00(this).A0H);
        View inflate = layoutInflater.inflate(R.layout.content_notes_immersive_reply_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1973851314, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-1633050650);
        if (!((C63872LAb) A00(this).A08.getValue()).A01 && !C71106Ock.A00.A04(AnonymousClass7TE.A0l(this.A0D))) {
            ((C53016Gh7) this.A08.getValue()).A01(JTQ.A0H(this.A02).A08, (String) null);
        }
        super.onDestroy();
        AnonymousClass0fD.A09(-651286905, A022);
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-2127023854);
        this.A00 = null;
        super.onDestroyView();
        AnonymousClass0fD.A09(-1494675934, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-243049877);
        super.onResume();
        if (C60299Jix.A01(this).A01) {
            C63890LAt lAt = this.A00;
            if (lAt != null) {
                C69979NvJ.A00(lAt.A08);
            }
            C60299Jix.A01(this).A01 = false;
        }
        AnonymousClass0fD.A09(-490838786, A022);
    }
}
