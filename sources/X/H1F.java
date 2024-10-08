package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.FragmentActivity;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.instagram.android.R;
import com.instagram.api.schemas.WearablesAppAttributionType;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import instagram.features.feed.fragment.ContextualFeedFragment;
import java.util.ArrayList;

public final class H1F extends AnonymousClass4DH implements AnonymousClass4DU, AnonymousClass4DS, C289875eN, C320316sB {
    public static final String __redex_internal_original_name = "RBSPivotPageFragment";
    public View A00;
    public View A01;
    public View A02;
    public View A03;
    public HOM A04;
    public ShimmerFrameLayout A05;
    public C321676uZ A06;
    public IgTextView A07;
    public IgTextView A08;
    public IgTextView A09;
    public IgTextView A0A;
    public RoundedCornerImageView A0B;
    public C320516sV A0C;
    public String A0D;
    public String A0E;
    public boolean A0F;
    public 0wc A0G;
    public IgTextView A0H;
    public CircularImageView A0I;
    public 2el A0J;
    public AnonymousClass2uE A0K;
    public C249763kK A0L;
    public final String A0M = AnonymousClass7TG.A0j();
    public final AnonymousClass0eM A0N = AnonymousClass0eN.A01(C58712IwL.A01(this, 5));
    public final AnonymousClass0eM A0O = C227642jf.A02(this);
    public final AnonymousClass0eM A0P = DbS.A0I(C58712IwL.A01(this, 6), C58712IwL.A01(this, 7), C58690Ivz.A00((Object) null, this, 31), DbS.A0z(C52958GgB.class));
    public final int A0Q = 15;
    public final C229132mt A0R = new ISY(this, 7);

    public final void D04() {
    }

    public final void D3f(View view) {
    }

    public final /* synthetic */ void D3i(User user) {
    }

    public final void DWZ() {
    }

    public final /* synthetic */ void DyE() {
    }

    public final void configureActionBar(2da r3) {
        0qQ.A0B(r3, 0);
        r3.Eu5(C56801ICy.A00(this, 22), true);
        r3.Eom(2131976798);
    }

    public final String getModuleName() {
        return "ray_ban_stories_pivot_page";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onAttach(Context context) {
        0qQ.A0B(context, 0);
        H1F.super.onAttach(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x00df  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00e3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r14, android.os.Bundle r15) {
        /*
            r13 = this;
            r11 = 0
            X.0qQ.A0B(r14, r11)
            super.onViewCreated(r14, r15)
            java.lang.String r0 = r13.A0D
            if (r0 == 0) goto L_0x0076
            A00(r14, r13)
            android.os.Bundle r1 = r13.requireArguments()
            java.lang.String r0 = "header_title"
            java.lang.String r2 = r1.getString(r0)
            android.os.Bundle r1 = r13.requireArguments()
            java.lang.String r0 = "header_description"
            java.lang.String r6 = r1.getString(r0)
            android.os.Bundle r1 = r13.requireArguments()
            java.lang.String r0 = "header_profile_user_name"
            java.lang.String r5 = r1.getString(r0)
            android.os.Bundle r1 = r13.requireArguments()
            java.lang.String r0 = "header_profile_is_verified"
            boolean r4 = r1.getBoolean(r0)
            android.os.Bundle r1 = r13.requireArguments()
            java.lang.String r0 = "image_url"
            java.lang.String r3 = r1.getString(r0)
            com.instagram.common.ui.base.IgTextView r0 = r13.A0A
            if (r0 != 0) goto L_0x004e
            java.lang.String r6 = "headerTitle"
        L_0x0046:
            X.0qQ.A0F(r6)
        L_0x0049:
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x004e:
            r0.setText(r2)
            android.text.SpannableStringBuilder r2 = X.C51965G9l.A0E()
            r2.append(r5)
            if (r4 == 0) goto L_0x0062
            android.content.Context r1 = r13.requireContext()
            r0 = 1
            X.C244273av.A08(r1, r2, r0)
        L_0x0062:
            com.instagram.common.ui.base.IgTextView r0 = r13.A09
            if (r0 != 0) goto L_0x0069
            java.lang.String r6 = "headerDescription"
            goto L_0x0046
        L_0x0069:
            r0.setText(r6)
            if (r3 == 0) goto L_0x00d3
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r0 = r13.A0B
            if (r0 == 0) goto L_0x00d3
            X.DbV.A1P(r13, r0, r3)
            goto L_0x00d3
        L_0x0076:
            r0 = 2131433809(0x7f0b1951, float:1.8489414E38)
            android.view.View r0 = r14.requireViewById(r0)
            r13.A02 = r0
            X.AnonymousClass7TH.A0R(r0)
            r0 = 2131433541(0x7f0b1845, float:1.848887E38)
            android.view.View r4 = r14.requireViewById(r0)
            r13.A01 = r4
            if (r4 == 0) goto L_0x00d3
            r0 = 2131433732(0x7f0b1904, float:1.8489258E38)
            android.view.View r0 = X.AnonymousClass7TF.A0F(r14, r0)
            androidx.constraintlayout.widget.Guideline r0 = (androidx.constraintlayout.widget.Guideline) r0
            r0.setGuidelineBegin(r11)
            r0 = 2131433542(0x7f0b1846, float:1.8488873E38)
            android.view.View r3 = X.AnonymousClass7TF.A0F(r14, r0)
            androidx.constraintlayout.widget.ConstraintLayout r3 = (androidx.constraintlayout.widget.ConstraintLayout) r3
            X.4gb r2 = new X.4gb
            r2.<init>()
            r2.A0I(r3)
            r1 = 2131442787(0x7f0b3c63, float:1.8507624E38)
            r0 = 4
            r2.A09(r1, r0)
            r2.A0G(r3)
            android.content.res.Resources r0 = X.DbV.A05(r13)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            float r0 = r0.density
            int r0 = (int) r0
            int r3 = r0 * 44
            int r2 = r4.getPaddingLeft()
            int r1 = r4.getPaddingTop()
            int r0 = r4.getPaddingRight()
            r4.setPadding(r2, r1, r0, r3)
            r4.setVisibility(r11)
        L_0x00d3:
            r0 = 2131443508(0x7f0b3f34, float:1.8509086E38)
            android.view.View r0 = r14.requireViewById(r0)
            r13.A00 = r0
            r2 = 0
            if (r0 != 0) goto L_0x00e3
            java.lang.String r6 = "floatingButton"
            goto L_0x0046
        L_0x00e3:
            r1 = 8
            r0.setVisibility(r1)
            r0 = 2131443511(0x7f0b3f37, float:1.8509092E38)
            com.instagram.common.ui.base.IgTextView r0 = X.DbT.A0a(r14, r0)
            r13.A07 = r0
            if (r0 != 0) goto L_0x00f7
            java.lang.String r6 = "floatingButtonLabel"
            goto L_0x0046
        L_0x00f7:
            r0.setVisibility(r1)
            X.0eM r5 = r13.A0O
            com.instagram.common.session.UserSession r4 = X.DbW.A0S(r5, r11)
            r3 = 31799988(0x1e53ab4, float:8.420555E-38)
            java.lang.String r0 = "rbs_pivot_page"
            X.6uZ r1 = new X.6uZ
            r1.<init>(r4, r0, r3)
            r13.A06 = r1
            java.lang.String r6 = "rbsPivotPagePerfLogger"
            android.content.Context r0 = r13.requireContext()
            X.DbY.A0v(r0, r1, r13, r5)
            X.6uZ r1 = r13.A06
            if (r1 == 0) goto L_0x0046
            java.lang.String r0 = r13.A0D
            r1.A0U(r0)
            android.content.Context r0 = r13.requireContext()
            r4 = 3
            androidx.recyclerview.widget.GridLayoutManager r8 = new androidx.recyclerview.widget.GridLayoutManager
            r8.<init>(r0, r4)
            X.6sV r0 = r13.A0C
            java.lang.String r5 = "clipsGridAdapter"
            if (r0 == 0) goto L_0x01d9
            X.C51971G9r.A14(r8, r0)
            X.2mt r9 = r13.A0R
            X.71i r10 = X.C3251771i.A06
            X.71j r7 = new X.71j
            r12 = r11
            r7.<init>(r8, r9, r10, r11, r12)
            r0 = 2131443808(0x7f0b4060, float:1.8509695E38)
            android.view.View r1 = r14.requireViewById(r0)
            r3 = r1
            androidx.recyclerview.widget.RecyclerView r3 = (androidx.recyclerview.widget.RecyclerView) r3
            r3.setLayoutManager(r8)
            r3.A15(r7)
            X.C51972G9s.A13(r13, r3)
            X.6sV r0 = r13.A0C
            if (r0 == 0) goto L_0x01d9
            X.2t9 r0 = r0.A0I
            r3.setAdapter(r0)
            X.0qQ.A07(r1)
            android.view.ViewTreeObserver r1 = r14.getViewTreeObserver()
            X.FPo r0 = new X.FPo
            r0.<init>(r4, r7, r3)
            r1.addOnScrollChangedListener(r0)
            X.2el r0 = r13.A0J
            if (r0 != 0) goto L_0x016e
            java.lang.String r6 = "viewpointManager"
            goto L_0x0046
        L_0x016e:
            X.Dba.A0z(r3, r0, r13)
            X.6sV r1 = r13.A0C
            if (r1 == 0) goto L_0x01d9
            int r0 = r13.A0Q
            r1.A04(r0)
            r0 = 2131443809(0x7f0b4061, float:1.8509697E38)
            android.view.View r0 = r14.requireViewById(r0)
            com.facebook.shimmer.ShimmerFrameLayout r0 = (com.facebook.shimmer.ShimmerFrameLayout) r0
            r13.A05 = r0
            if (r0 != 0) goto L_0x018b
            java.lang.String r6 = "clipsGridShimmerContainer"
            goto L_0x0046
        L_0x018b:
            r0.A02()
            r0 = 2131443696(0x7f0b3ff0, float:1.8509467E38)
            android.view.View r0 = r14.requireViewById(r0)
            r13.A03 = r0
            if (r0 != 0) goto L_0x019d
            java.lang.String r6 = "videoCountShimmer"
            goto L_0x0046
        L_0x019d:
            r0.setVisibility(r11)
            X.0eM r5 = r13.A0P
            java.lang.Object r0 = r5.getValue()
            X.GgB r0 = (X.C52958GgB) r0
            X.2Fk r4 = r0.A00
            X.07Z r3 = r13.getViewLifecycleOwner()
            r0 = 33
            X.J6f r1 = X.C59097J6f.A01(r13, r0)
            r0 = 23
            X.C51969G9p.A15(r3, r4, r1, r0)
            java.lang.Object r0 = r5.getValue()
            X.GgB r0 = (X.C52958GgB) r0
            X.Hov r0 = r0.A02
            X.H34 r1 = r0.A00
            X.0sn r0 = X.0sn.A00
            r1.A04(r2, r2, r0, r11)
            X.6uZ r0 = r13.A06
            if (r0 == 0) goto L_0x0046
            X.34p r0 = r0.A00
            r0.A08(r2)
            X.6uZ r0 = r13.A06
            if (r0 == 0) goto L_0x0046
            r0.D3T()
            return
        L_0x01d9:
            X.0qQ.A0F(r5)
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H1F.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void DWX() {
        0lg A0X = DbT.A0X(this.A0O);
        C54676HOh hOh = C54676HOh.ZOOMED_MEDIA_IMPRESSION;
        HOM hom = this.A04;
        String str = this.A0D;
        String str2 = this.A0E;
        AnonymousClass2uE r0 = this.A0K;
        if (r0 == null) {
            0qQ.A0F("peekMediaController");
            throw AnonymousClass00P.createAndThrow();
        }
        String id = r0.A07().getId();
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0O(this, A0X), "ig_wearables_pivot_page");
        A0e.A8M(hOh, "pivot_page_event_name");
        C51974G9v.A0k(hom, A0e, str, str2, id);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0O);
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public static final void A00(View view, H1F h1f) {
        View view2;
        RoundedCornerImageView roundedCornerImageView;
        String str;
        View requireViewById = view.requireViewById(R.id.header);
        h1f.A02 = requireViewById;
        AnonymousClass7TF.A16(requireViewById);
        h1f.A0A = DbT.A0a(view, R.id.title);
        h1f.A0H = DbT.A0a(view, R.id.username);
        h1f.A08 = DbT.A0a(view, R.id.video_count);
        h1f.A09 = DbT.A0a(view, R.id.description);
        h1f.A0I = (CircularImageView) view.requireViewById(R.id.user_profile_picture);
        IgTextView igTextView = h1f.A0H;
        if (igTextView == null) {
            str = "headerArtist";
        } else {
            igTextView.setVisibility(8);
            ? r0 = h1f.A0I;
            if (r0 == 0) {
                str = "headerProfilePicture";
            } else {
                r0.setVisibility(8);
                ViewStub A0F2 = DbS.A0F(view, R.id.thumbnail_stub);
                if (A0F2 != null) {
                    A0F2.setLayoutResource(R.layout.layout_clips_rounded_corner_thumbnail);
                    view2 = A0F2.inflate();
                    if (!(view2 instanceof RoundedCornerImageView)) {
                        roundedCornerImageView = null;
                    }
                    roundedCornerImageView = (RoundedCornerImageView) view2;
                } else {
                    view2 = view.findViewById(R.id.thumbnail);
                    roundedCornerImageView = (RoundedCornerImageView) view2;
                }
                h1f.A0B = roundedCornerImageView;
                IgTextView igTextView2 = h1f.A08;
                if (igTextView2 == null) {
                    str = "headerCount";
                } else {
                    igTextView2.setTextAppearance(R.style.PrivacyTextStyle);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D46(C267324bN r13, int i) {
        C309516Yo A0N2;
        1Xj A0l = C51968G9o.A0l(r13);
        if (A0l != null) {
            if (!A0l.A5U()) {
                ArrayList A1C = AnonymousClass7TE.A1C();
                C320516sV r0 = this.A0C;
                if (r0 == null) {
                    0qQ.A0F("clipsGridAdapter");
                    throw AnonymousClass00P.createAndThrow();
                }
                for (C320716sp r02 : r0.A01()) {
                    1Xj r03 = r02.A03.A02;
                    if (r03 != null) {
                        C51971G9r.A1M(r03, A1C);
                    }
                }
                A0N2 = DbX.A0N(requireActivity(), this.A0O);
                String string = getString(2131976798);
                String id = A0l.getId();
                ContextualFeedFragment contextualFeedFragment = new ContextualFeedFragment();
                contextualFeedFragment.setArguments(C46424Del.A04((Bundle) null, "Static", string, id, "multimedia_pivot_page_fragment", "ray_ban_stories_pivot_page", (String) null, A1C));
                A0N2.A0B((Bundle) null, contextualFeedFragment);
                A0N2.A08();
            } else if (A0l.A30() != null) {
                F3W A032 = IgFragmentFactoryImpl.A00().A03(String.valueOf(A0l.A30()));
                A0N2 = DbX.A0N(requireActivity(), this.A0O);
                A0N2.A0B((Bundle) null, A032.A01());
            } else {
                return;
            }
            A0N2.A04();
        }
    }

    public final boolean D47(MotionEvent motionEvent, View view, C267324bN r5, int i) {
        AnonymousClass7TG.A1T(r5, view, motionEvent);
        1Xj r1 = r5.A02;
        if (r1 == null) {
            return false;
        }
        AnonymousClass2uE r0 = this.A0K;
        if (r0 != null) {
            return r0.Dsa(motionEvent, view, r1, i);
        }
        0qQ.A0F("peekMediaController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        String str;
        1Xj A022;
        HOM hom;
        WearablesAppAttributionType AdB;
        int A023 = AnonymousClass0fD.A02(-748907857);
        H1F.super.onCreate(bundle);
        AnonymousClass0eM r3 = this.A0O;
        this.A0G = AnonymousClass0kN.A01(this, DbT.A0X(r3));
        this.A0D = requireArguments().getString("source_media_id");
        this.A0E = requireArguments().getString("source_media_surface");
        if (!(this.A0D == null || (A022 = DbX.A0d(r3).A02(this.A0D)) == null)) {
            JSO A0l = C51966G9m.A0l(A022);
            if (!(A0l == null || (AdB = A0l.AdB()) == null)) {
                int ordinal = AdB.ordinal();
                if (ordinal == 2) {
                    hom = HOM.RAY_BAN_META;
                } else if (ordinal == 7) {
                    hom = HOM.RAY_BAN_STORIES;
                }
                this.A04 = hom;
            }
            hom = null;
            this.A04 = hom;
        }
        2el A002 = 2el.A00();
        this.A0J = A002;
        this.A0C = new C320516sV(requireContext(), (C321686ua) null, new C320486sS(1.0f, true, false), this, new C320496sT(AnonymousClass7TE.A0l(r3), A002, this, (String) null), this, AnonymousClass7TE.A0l(r3), (C294875nB) null, (String) null, (String) null, false, false);
        ((C229352nF) this.A0N.getValue()).A02(this.A0M);
        this.A0L = 1L2.A00();
        FragmentActivity requireActivity = requireActivity();
        0hq parentFragmentManager = getParentFragmentManager();
        UserSession A0l2 = AnonymousClass7TE.A0l(r3);
        C249763kK r32 = this.A0L;
        if (r32 == null) {
            str = "pivotPageSessionProvider";
        } else {
            C320516sV r1 = this.A0C;
            if (r1 == null) {
                str = "clipsGridAdapter";
            } else {
                AnonymousClass2uE r11 = new AnonymousClass2uE(requireActivity, this, parentFragmentManager, A0l2, (AnonymousClass57N) null, this, r1, r32, true, true, false);
                r11.A0B = this;
                this.A0K = r11;
                registerLifecycleListener(r11);
                AnonymousClass0fD.A09(1221414843, A023);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1362362805);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_clips_pivot_page_fragment, viewGroup, false);
        AnonymousClass0fD.A09(259001513, A022);
        return inflate;
    }

    public final void onDestroy() {
        int A022 = AnonymousClass0fD.A02(-412415418);
        super.onDestroy();
        ((C229352nF) this.A0N.getValue()).A07(this.A0M);
        AnonymousClass0fD.A09(-258306132, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-805173415);
        H1F.super.onPause();
        this.A0F = false;
        AnonymousClass0fD.A09(-43324888, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(178329378);
        super.onResume();
        0lg A0X = DbT.A0X(this.A0O);
        C54676HOh hOh = C54676HOh.STORE_LINK_IMPRESSION;
        HOM hom = this.A04;
        String str = this.A0D;
        String str2 = this.A0E;
        0Aj A0e = AnonymousClass7TE.A0e(DbX.A0O(this, A0X), "ig_wearables_pivot_page");
        A0e.A8M(hOh, "pivot_page_event_name");
        C51974G9v.A0k(hom, A0e, str, str2, (String) null);
        AnonymousClass0fD.A09(-1210642290, A022);
    }
}
