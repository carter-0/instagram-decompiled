package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.bottombutton.IgdsBottomButtonLayout;
import com.instagram.igds.components.search.IgdsInlineSearchBox;

public final class NJZ extends AnonymousClass4DH implements AnonymousClass4DR, C74332Pt8, C74472PvS {
    public static final String __redex_internal_original_name = "DirectAiStickerTrayFragment";
    public int A00;
    public ConstraintLayout A01;
    public ConstraintLayout A02;
    public RecyclerView A03;
    public IgSimpleImageView A04;
    public IgTextView A05;
    public IgTextView A06;
    public OJY A07;
    public C71083Ob6 A08;
    public IgdsBottomButtonLayout A09;
    public IgdsInlineSearchBox A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public ComposeView A0E;
    public ComposeView A0F;
    public AnonymousClass7L0 A0G;
    public final View.OnClickListener A0H = C71401Ok0.A00(this, 35);
    public final AnonymousClass0eM A0I;
    public final AnonymousClass0eM A0J;
    public final AnonymousClass0eM A0K;
    public final AnonymousClass0eM A0L = C227642jf.A02(this);
    public final View.OnTouchListener A0M = new C71439Oke((Object) this, 4);

    /* JADX WARNING: Removed duplicated region for block: B:16:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.NJZ r15) {
        /*
            r8 = r15
            android.content.Context r6 = r15.requireContext()
            X.0eM r2 = r15.A0L
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r2)
            android.view.View r0 = r15.requireView()
            r1 = 2131427930(0x7f0b025a, float:1.847749E38)
            android.view.View r0 = r0.findViewById(r1)
            r3 = 0
            X.3oV r10 = X.2b1.A01(r0, r3, r3)
            X.O6k r11 = new X.O6k
            r11.<init>(r15)
            android.view.View$OnTouchListener r7 = r15.A0M
            java.lang.String r14 = r15.A0B
            if (r14 != 0) goto L_0x0030
            java.lang.String r0 = "bottomSheetSessionId"
        L_0x0028:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0030:
            android.os.Bundle r4 = r15.requireArguments()
            java.lang.String r0 = "param_extra_initial_search_term"
            java.lang.String r5 = ""
            java.lang.String r15 = X.DbT.A0w(r4, r0, r5)
            android.os.Bundle r4 = r8.requireArguments()
            java.lang.String r0 = "param_extra_entry_point"
            java.lang.String r0 = r4.getString(r0, r5)
            if (r0 == 0) goto L_0x0052
            X.NjK r13 = X.C69319NjK.valueOf(r0)     // Catch:{ IllegalArgumentException -> 0x004f }
            if (r13 != 0) goto L_0x0054
            goto L_0x0052
        L_0x004f:
            X.NjK r13 = X.C69319NjK.UNKNOWN
            goto L_0x0054
        L_0x0052:
            X.NjK r13 = X.C69319NjK.UNKNOWN
        L_0x0054:
            X.0eM r0 = r8.A0J
            java.lang.Object r12 = r0.getValue()
            X.Mtu r12 = (X.C67741Mtu) r12
            X.Ob6 r5 = new X.Ob6
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            r8.A08 = r5
            android.view.View r0 = r8.requireView()
            X.DbY.A10(r0, r1)
            X.0lg r4 = X.DbT.A0X(r2)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317732356494829(0x8106c9002815ed, double:3.0308184097929533E-306)
            boolean r0 = X.182.A06(r2, r4, r0)
            if (r0 != 0) goto L_0x009a
            X.Ob6 r0 = r8.A08
            if (r0 != 0) goto L_0x0082
            java.lang.String r0 = "uiController"
            goto L_0x0028
        L_0x0082:
            java.lang.String r4 = r8.A0C
            X.0qQ.A0B(r4, r3)
            X.OZQ r2 = r0.A0C
            X.0sn r0 = X.0sn.A00
            X.OVz r1 = new X.OVz
            r1.<init>(r4, r0)
            r2.A00 = r1
            X.0sa r0 = r2.A0A
            r0.invoke()
            X.OZQ.A01(r2, r1, r3)
        L_0x009a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NJZ.A00(X.NJZ):void");
    }

    public final void ADi(AnonymousClass7L0 r3) {
        0qQ.A0B(r3, 0);
        this.A0G = r3;
        IgdsInlineSearchBox igdsInlineSearchBox = this.A0A;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A05(r3.A0E);
        }
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A09;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setBackgroundColor(r3.A09);
        }
    }

    public final void DMt() {
        this.A00 = 0;
        ComposeView composeView = this.A0E;
        if (composeView != null) {
            composeView.setTranslationY(0.0f);
        }
        05G r1 = ((C67741Mtu) this.A0J.getValue()).A04;
        C68175N3q n3q = (C68175N3q) r1.getValue();
        HMC hmc = n3q.A01;
        boolean z = n3q.A05;
        String str = n3q.A03;
        String str2 = n3q.A02;
        C45274Ctd ctd = n3q.A00;
        String str3 = n3q.A04;
        AnonymousClass7TF.A1B(hmc, 0, str);
        r1.Epw(new C68175N3q(ctd, hmc, str, str2, str3, z, false));
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A09;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setTranslationY(0.0f);
        }
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A02 = (ConstraintLayout) view.requireViewById(R.id.ai_sticker_tray_container);
        this.A04 = JTP.A0T(view, R.id.ai_sticker_tray_back_button);
        this.A09 = (IgdsBottomButtonLayout) view.requireViewById(R.id.ai_sticker_tray_button);
        this.A06 = DbT.A0a(view, R.id.ai_sticker_tray_title_label);
        this.A05 = DbT.A0a(view, R.id.ai_sticker_tray_body_label);
        this.A0A = (IgdsInlineSearchBox) view.requireViewById(R.id.ai_sticker_search_box);
        this.A0F = (ComposeView) view.requireViewById(R.id.ai_sticker_tray_top_nav_bar);
        this.A0E = (ComposeView) view.requireViewById(R.id.ai_sticker_tray_prompt_bar);
        ConstraintLayout constraintLayout = this.A02;
        if (constraintLayout != null) {
            constraintLayout.setOnTouchListener(this.A0M);
        }
        this.A0B = requireArguments().getString("param_extra_bottom_sheet_session_id", "");
        IgdsInlineSearchBox igdsInlineSearchBox = this.A0A;
        if (igdsInlineSearchBox != null) {
            igdsInlineSearchBox.A02 = new C72722PHc(this, 2);
            igdsInlineSearchBox.setOnEditTextListener(new C73934PmE(this, 0));
        }
        IgdsInlineSearchBox igdsInlineSearchBox2 = this.A0A;
        if (igdsInlineSearchBox2 != null) {
            igdsInlineSearchBox2.setHints(new OKN(requireContext(), AnonymousClass7TE.A0l(this.A0L)).A00(true));
        }
        IgdsInlineSearchBox igdsInlineSearchBox3 = this.A0A;
        if (igdsInlineSearchBox3 != null) {
            igdsInlineSearchBox3.A04();
        }
        C66581MXm.A19(this.A09);
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A09;
        if (igdsBottomButtonLayout != null) {
            AnonymousClass0fU.A00(this.A0H, igdsBottomButtonLayout);
        }
        String string = requireArguments().getString("param_extra_initial_search_term", "");
        this.A0C = string;
        IgdsInlineSearchBox igdsInlineSearchBox4 = this.A0A;
        if (igdsInlineSearchBox4 != null) {
            igdsInlineSearchBox4.A0E.setText(string);
        }
        IgdsInlineSearchBox igdsInlineSearchBox5 = this.A0A;
        if (igdsInlineSearchBox5 != null) {
            igdsInlineSearchBox5.setSelection(DbX.A05(this.A0C));
        }
        AnonymousClass7L0 r2 = this.A0G;
        if (r2 != null) {
            IgdsInlineSearchBox igdsInlineSearchBox6 = this.A0A;
            if (igdsInlineSearchBox6 != null) {
                igdsInlineSearchBox6.A05(r2.A0E);
            }
            IgdsBottomButtonLayout igdsBottomButtonLayout2 = this.A09;
            if (igdsBottomButtonLayout2 != null) {
                igdsBottomButtonLayout2.setBackgroundColor(r2.A09);
            }
        }
        AnonymousClass0eM r7 = this.A0L;
        0lg A0X = DbT.A0X(r7);
        0Tu r6 = 0Tu.A05;
        if (182.A06(r6, A0X, 36317732356494829L)) {
            2YL A0H2 = DbS.A0H(this.A0J);
            Object value = r7.getValue();
            0qQ.A0B(value, 0);
            AnonymousClass7TE.A1Z(new MHI(A0H2, value, (AnonymousClass4D7) null, 3), C318116oQ.A00(A0H2));
            FragmentActivity activity = getActivity();
            if (activity != null) {
                this.A01 = (ConstraintLayout) activity.findViewById(R.id.direct_sticker_tray_root_container_background);
                new C55964HqV(activity, AnonymousClass7TE.A0l(r7), new P32(1, activity, this)).A00(182.A04(r6, DbT.A0X(r7), 36880682309976411L), false);
            }
            A00(this);
            ComposeView composeView = this.A0F;
            if (composeView != null) {
                composeView.setContent(AnonymousClass5PI.A03(new C59110J6s(this, 28), 1914280956));
            }
            ComposeView composeView2 = this.A0E;
            if (composeView2 != null) {
                composeView2.setContent(AnonymousClass5PI.A03(new JG2(6, view, this), -822936460));
                IgdsInlineSearchBox igdsInlineSearchBox7 = this.A0A;
                if (igdsInlineSearchBox7 != null) {
                    igdsInlineSearchBox7.setVisibility(8);
                }
                IgSimpleImageView igSimpleImageView = this.A04;
                if (igSimpleImageView != null) {
                    igSimpleImageView.setVisibility(8);
                }
                IgTextView igTextView = this.A06;
                if (igTextView != null) {
                    igTextView.setVisibility(4);
                }
                IgTextView igTextView2 = this.A05;
                if (igTextView2 != null) {
                    igTextView2.setVisibility(4);
                    return;
                }
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        IgSimpleImageView igSimpleImageView2 = this.A04;
        if (igSimpleImageView2 != null) {
            DbU.A14(requireContext(), igSimpleImageView2, 2Yu.A0B(getContext()));
        }
        IgSimpleImageView igSimpleImageView3 = this.A04;
        if (igSimpleImageView3 != null) {
            C71401Ok0.A01(igSimpleImageView3, 36, this);
        }
        IgTextView igTextView3 = this.A06;
        if (igTextView3 != null) {
            igTextView3.setVisibility(0);
        }
        IgTextView igTextView4 = this.A05;
        if (igTextView4 != null) {
            igTextView4.setVisibility(0);
        }
    }

    public final void DMu(int i) {
        this.A00 = i;
        ComposeView composeView = this.A0E;
        if (composeView != null) {
            composeView.setTranslationY((float) (-i));
        }
        05G r1 = ((C67741Mtu) this.A0J.getValue()).A04;
        C68175N3q n3q = (C68175N3q) r1.getValue();
        HMC hmc = n3q.A01;
        boolean z = n3q.A05;
        String str = n3q.A03;
        String str2 = n3q.A02;
        C45274Ctd ctd = n3q.A00;
        String str3 = n3q.A04;
        DbY.A1S(hmc, str);
        r1.Epw(new C68175N3q(ctd, hmc, str, str2, str3, z, true));
        IgdsBottomButtonLayout igdsBottomButtonLayout = this.A09;
        if (igdsBottomButtonLayout != null) {
            igdsBottomButtonLayout.setTranslationY((float) (-i));
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0L);
    }

    public final boolean isScrolledToTop() {
        if (this.A0D) {
            C71083Ob6 ob6 = this.A08;
            if (ob6 == null) {
                0qQ.A0F("uiController");
                throw AnonymousClass00P.createAndThrow();
            } else if (C2808154f.A03((LinearLayoutManager) ob6.A0F.getValue())) {
                return true;
            } else {
                return false;
            }
        }
        return true;
    }

    public final boolean onBackPressed() {
        OJY ojy = this.A07;
        if (ojy != null) {
            ojy.A00();
        }
        if (182.A06(0Tu.A05, DbT.A0X(this.A0L), 2342171337253862641L)) {
            return false;
        }
        return true;
    }

    public final void onBottomSheetPositionChanged(int i, int i2) {
        C66582MXn.A15(this.A0E, i, i2);
        C66582MXn.A15(this.A09, i, i2);
    }

    public NJZ() {
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73923Pm3(new C73923Pm3(this, 20), 21));
        0Yh A0z = DbS.A0z(C67741Mtu.class);
        this.A0J = DbS.A0I(new C73923Pm3(A002, 22), C73915Plq.A00(this, A002, 47), C73915Plq.A00(A002, (Object) null, 46), A0z);
        this.A0C = "";
        this.A0K = C73923Pm3.A00(this, 16);
        this.A0I = C73923Pm3.A00(this, 15);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(518660958);
        0qQ.A0B(layoutInflater, 0);
        View A0D2 = DbT.A0D(layoutInflater, viewGroup, R.layout.fragment_direct_ai_sticker_picker, false);
        AnonymousClass0fD.A09(564070913, A022);
        return A0D2;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-784340908);
        super.onDestroy();
        this.A07 = null;
        AnonymousClass0fD.A09(668053394, A022);
    }

    public final void onDestroyView() {
        String str;
        int A022 = AnonymousClass0fD.A02(-395622744);
        super.onDestroyView();
        UserSession A0l = AnonymousClass7TE.A0l(this.A0L);
        Integer num = AnonymousClass05K.A0u;
        String str2 = this.A0B;
        if (str2 == null) {
            str = "bottomSheetSessionId";
        } else {
            C71048OaQ.A00(C69447Nlr.AI_STICKER, DbS.A0O(__redex_internal_original_name), A0l, (C69332NjX) null, (Boolean) null, num, AnonymousClass05K.A00, (Integer) null, (String) null, str2);
            this.A02 = null;
            this.A04 = null;
            this.A06 = null;
            this.A05 = null;
            this.A0A = null;
            this.A09 = null;
            this.A01 = null;
            this.A0F = null;
            this.A0E = null;
            this.A03 = null;
            C67741Mtu mtu = (C67741Mtu) this.A0J.getValue();
            mtu.A02.removeCallbacks(mtu.A03);
            if (this.A0D) {
                C71083Ob6 ob6 = this.A08;
                if (ob6 == null) {
                    str = "uiController";
                } else {
                    ob6.A00 = null;
                }
            }
            AnonymousClass0fD.A09(176214085, A022);
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
