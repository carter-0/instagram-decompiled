package X;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgView;
import com.instagram.feed.opencarousel.reviewpage.viewmodel.OpenCarouselReviewPageViewModel$fetchSubmission$2;
import com.instagram.igds.components.button.IgdsButton;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* renamed from: X.H1w  reason: case insensitive filesystem */
public final class C54176H1w extends C227812jx implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "OpenCarouselReviewPageGridViewFragment";
    public LRh A00;
    public IgdsButton A01;
    public IgdsButton A02;
    public IgdsButton A03;
    public View A04;
    public IgView A05;
    public IgView A06;
    public C14190TrU A07;
    public C324356z9 A08;
    public H19 A09;
    public final C229132mt A0A;
    public final String A0B = C273654mx.A00(864);
    public final AnonymousClass0eM A0C = C227642jf.A02(this);
    public final AnonymousClass0eM A0D;
    public final C57414IaK A0E;

    private final void A01(IgView igView, IgdsButton igdsButton, String str) {
        if (igdsButton != null) {
            igdsButton.setEnabled(false);
        }
        if (igView != null) {
            igView.setVisibility(0);
            AnonymousClass0fU.A00(new IB2(str, this, 1), igView);
        }
    }

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131969006);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A04 = view.findViewById(R.id.bottom_button_container);
        IgdsButton igdsButton = (IgdsButton) view.findViewById(R.id.delete_button);
        if (igdsButton != null) {
            C56802ICz.A01(igdsButton, 3, this);
        } else {
            igdsButton = null;
        }
        this.A03 = igdsButton;
        IgdsButton igdsButton2 = (IgdsButton) view.findViewById(R.id.accept_button);
        if (igdsButton2 != null) {
            AnonymousClass0fU.A00(new ID2(24, (Object) igdsButton2, (Object) this), igdsButton2);
        } else {
            igdsButton2 = null;
        }
        this.A01 = igdsButton2;
        this.A05 = (IgView) view.findViewById(R.id.accept_button_click_overlay);
        this.A06 = (IgView) view.findViewById(R.id.remove_button_click_overlay);
        A03(this);
        ((C54224H3t) getAdapter()).A0C();
        C238133Ar scrollingViewProxy = getScrollingViewProxy();
        C14190TrU trU = this.A07;
        if (trU == null) {
            0qQ.A0F("autoLoadMoreHelper");
            throw AnonymousClass00P.createAndThrow();
        }
        scrollingViewProxy.AAD(trU);
        07U r3 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(new MHE(viewLifecycleOwner, r3, this, (AnonymousClass4D7) null, 28), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    public static final void A00(IgView igView, IgdsButton igdsButton) {
        if (igdsButton != null) {
            igdsButton.setEnabled(true);
        }
        if (igView != null) {
            igView.setVisibility(8);
            igView.setOnClickListener((View.OnClickListener) null);
        }
    }

    public static final void A02(C54176H1w h1w) {
        IgdsButton igdsButton;
        String string;
        int A052 = DbS.A05(((GMQ) G9w.A0Z(h1w.A0D).A04.getValue()).A06);
        if (A052 == 0) {
            IgdsButton igdsButton2 = h1w.A03;
            if (igdsButton2 != null) {
                igdsButton2.setText(DbV.A05(h1w).getString(2131968978));
            }
            igdsButton = h1w.A01;
            if (igdsButton != null) {
                string = DbV.A05(h1w).getString(2131968974);
            }
            A03(h1w);
            ((C54224H3t) h1w.getAdapter()).A0C();
        }
        IgdsButton igdsButton3 = h1w.A03;
        if (igdsButton3 != null) {
            igdsButton3.setText(DbV.A05(h1w).getString(2131968975, AnonymousClass7TF.A1b(A052)));
        }
        igdsButton = h1w.A01;
        if (igdsButton != null) {
            string = DbV.A05(h1w).getString(2131968973, AnonymousClass7TF.A1b(A052));
        }
        A03(h1w);
        ((C54224H3t) h1w.getAdapter()).A0C();
        igdsButton.setText(string);
        A03(h1w);
        ((C54224H3t) h1w.getAdapter()).A0C();
    }

    public static final void A03(C54176H1w h1w) {
        IgdsButton igdsButton;
        IgView igView;
        int i;
        AnonymousClass0eM r1 = h1w.A0C;
        int A042 = DbS.A04(0Tu.A05, DbY.A0R(r1), 36601754249007433L);
        AnonymousClass0eM r2 = h1w.A0D;
        if (DbS.A05(((GMQ) G9w.A0Z(r2).A04.getValue()).A06) == 0) {
            i = 2131968988;
            h1w.A01(h1w.A06, h1w.A03, DbU.A0m(h1w, 2131968988));
            igdsButton = h1w.A01;
            igView = h1w.A05;
        } else if (DbS.A05(((GMQ) G9w.A0Z(r2).A04.getValue()).A06) > A042) {
            A00(h1w.A06, h1w.A03);
            IgdsButton igdsButton2 = h1w.A01;
            IgView igView2 = h1w.A05;
            String string = h1w.getString(2131968950, AnonymousClass7TF.A1b(A042));
            0qQ.A07(string);
            h1w.A01(igView2, igdsButton2, string);
            return;
        } else {
            int A052 = G9w.A0Z(r2).A00 + DbS.A05(((GMQ) G9w.A0Z(r2).A04.getValue()).A06);
            int A002 = C56645I6a.A00(AnonymousClass7TE.A0l(r1));
            A00(h1w.A06, h1w.A03);
            igdsButton = h1w.A01;
            igView = h1w.A05;
            if (A052 > A002) {
                i = 2131968949;
            } else {
                A00(igView, igdsButton);
                return;
            }
        }
        h1w.A01(igView, igdsButton, DbU.A0m(h1w, i));
    }

    public static final void A04(C54176H1w h1w) {
        C53039GhV A0Z = G9w.A0Z(h1w.A0D);
        if (((GMQ) A0Z.A04.getValue()).A01 == C54662HMt.ALL && A0Z.A06() && !AnonymousClass7TE.A1b(((C54224H3t) h1w.getAdapter()).A01.A01)) {
            DbT.A1J(h1w);
        }
    }

    public static final void A06(C54176H1w h1w, boolean z, boolean z2) {
        Object value;
        GMQ gmq;
        C54176H1w h1w2 = h1w;
        AnonymousClass0eM r1 = h1w2.A0D;
        Object obj = C53039GhV.A00(r1).A04;
        Integer num = AnonymousClass05K.A01;
        if (obj != num) {
            boolean z3 = z2;
            if (z2 || !G9w.A0Z(r1).A06()) {
                C53039GhV A0Z = G9w.A0Z(r1);
                C324356z9 r13 = h1w2.A08;
                if (r13 == null) {
                    C51965G9l.A16();
                    throw AnonymousClass00P.createAndThrow();
                }
                05G r3 = A0Z.A04;
                do {
                    value = r3.getValue();
                    gmq = (GMQ) value;
                } while (!r3.AIY(value, GMQ.A00(gmq, (1Xj) null, (C54662HMt) null, num, 00k.A0T(ITL.A00, (Collection) gmq.A02), (List) null, (List) null, (Map) null, 93)));
                AnonymousClass7TE.A1Z(new OpenCarouselReviewPageViewModel$fetchSubmission$2(r13, A0Z, (AnonymousClass4D7) null, z3, z), C318116oQ.A00(A0Z));
            }
        }
    }

    public final String getModuleName() {
        return this.A0B;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public C54176H1w() {
        C58178Ini ini = new C58178Ini(this, 21);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C58178Ini(new C58178Ini(this, 18), 19));
        this.A0D = DbS.A0I(new C58178Ini(A002, 20), ini, new C58186Inq(2, (Object) null, A002), DbS.A0z(C53039GhV.class));
        this.A0E = new C57414IaK(this, 2);
        this.A0A = new ISY(this, 0);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004a, code lost:
        if (X.DbS.A05(((X.GMQ) X.G9w.A0Z(r1).A04.getValue()).A06) < X.DbS.A04(X.0Tu.A05, X.DbY.A0R(r9.A0C), 36601754248941896L)) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(X.C54176H1w r9, java.lang.String r10, java.lang.String r11, boolean r12) {
        /*
            androidx.fragment.app.FragmentActivity r4 = r9.getActivity()
            if (r4 == 0) goto L_0x0067
            com.instagram.util.fragment.IgFragmentFactoryImpl r0 = com.instagram.util.fragment.IgFragmentFactoryImpl.A00()
            X.F3W r6 = r0.A03(r10)
            java.lang.String r0 = r9.A0B
            r6.A0E = r0
            r7 = 1
            r6.A0N = r7
            r6.A07 = r11
            if (r12 == 0) goto L_0x0050
            r6.A0L = r7
            X.0eM r1 = r9.A0D
            X.GhV r0 = X.G9w.A0Z(r1)
            boolean r8 = r0.A07(r10)
            if (r8 != 0) goto L_0x004c
            X.GhV r0 = X.G9w.A0Z(r1)
            X.05G r0 = r0.A04
            java.lang.Object r0 = r0.getValue()
            X.GMQ r0 = (X.GMQ) r0
            java.lang.Object r0 = r0.A06
            int r5 = X.DbS.A05(r0)
            X.0eM r0 = r9.A0C
            X.0lg r3 = X.DbY.A0R(r0)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36601754248941896(0x82091a002a1148, double:3.210434998240842E-306)
            int r0 = X.DbS.A04(r2, r3, r0)
            if (r5 >= r0) goto L_0x0050
        L_0x004c:
            r6.A0R = r7
            r6.A0Q = r8
        L_0x0050:
            X.0eM r0 = r9.A0C
            X.0lg r3 = X.DbT.A0X(r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r1 = r6.A00()
            java.lang.String r0 = "single_media_feed"
            X.6W8 r1 = X.DbV.A0Y(r4, r1, r3, r2, r0)
            r0 = 15583(0x3cdf, float:2.1836E-41)
            r1.A0A(r4, r0)
        L_0x0067:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54176H1w.A05(X.H1w, java.lang.String, java.lang.String, boolean):void");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        String string;
        super.onActivityResult(i, i2, intent);
        if (i == 15583 && i2 == -1) {
            boolean z = true;
            if (intent != null) {
                Bundle extras = intent.getExtras();
                if (extras == null || !extras.getBoolean(AnonymousClass000.A00(3123))) {
                    z = false;
                }
                Bundle extras2 = intent.getExtras();
                if (extras2 != null && (string = extras2.getString(AnonymousClass000.A00(3124))) != null) {
                    AnonymousClass0eM r4 = this.A0D;
                    if (z != G9w.A0Z(r4).A07(string)) {
                        C273674n0 r2 = ((C54224H3t) getAdapter()).A01;
                        Number A14 = C51966G9m.A14(string, r2.A03);
                        if (A14 != null) {
                            1Xj r3 = (1Xj) r2.A01.get(A14.intValue());
                            if (r3 != null) {
                                LRh lRh = this.A00;
                                if (lRh != null) {
                                    lRh.A05(C54689HOu.OPEN_CAROUSEL_GRID_VIEW_PREVIEW_SELECT, r3.A2n());
                                }
                                G9w.A0Z(r4).A04(AnonymousClass7TE.A0l(this.A0C), r3);
                            }
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [X.07Z, X.H1w, X.2jx, androidx.fragment.app.Fragment, java.lang.Object] */
    public final void onCreate(Bundle bundle) {
        int i;
        int A022 = AnonymousClass0fD.A02(1191440736);
        super.onCreate(bundle);
        Context context = getContext();
        if (context == null) {
            i = 424320304;
        } else {
            AnonymousClass0eM r1 = this.A0C;
            LRh lRh = new LRh(AnonymousClass7TE.A0l(r1), context);
            lRh.A00 = requireArguments().getString("viewer_session_id");
            this.A00 = lRh;
            UserSession A0l = AnonymousClass7TE.A0l(r1);
            C57414IaK iaK = this.A0E;
            setAdapter(new C54224H3t(context, this, A0l, G9w.A0Z(this.A0D), this.A00, AnonymousClass32Q.A00, iaK, new C58142In8(this, 65)));
            this.A08 = C51970G9q.A0g(context, this, AnonymousClass7TE.A0l(r1));
            int i2 = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
            this.A07 = new C14190TrU(AnonymousClass7TE.A0l(r1), this.A0A, AnonymousClass05K.A01, 6);
            A06(this, true, false);
            i = 1329439300;
        }
        AnonymousClass0fD.A09(i, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1816830650);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.open_carousel_grid_review_page_layout, viewGroup, false);
        IgdsButton igdsButton = (IgdsButton) inflate.requireViewById(R.id.filter_button);
        igdsButton.A02(C273084lx.END, R.drawable.instagram_chevron_down_pano_filled_12);
        igdsButton.setIconPadding(igdsButton.getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material));
        C56802ICz.A01(igdsButton, 2, this);
        this.A02 = igdsButton;
        H19 h19 = new H19();
        Bundle A0a = AnonymousClass7TE.A0a();
        C227642jf.A04(A0a, AnonymousClass7TE.A0l(this.A0C));
        h19.setArguments(A0a);
        this.A09 = h19;
        0s1 A0C2 = DbW.A0C(this);
        A0C2.A09(h19, R.id.header_container);
        A0C2.A0K();
        AnonymousClass0fD.A09(26665132, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-408040842);
        super.onDestroyView();
        this.A04 = null;
        this.A03 = null;
        this.A01 = null;
        this.A05 = null;
        this.A06 = null;
        this.A09 = null;
        this.A02 = null;
        AnonymousClass0fD.A09(85183150, A022);
    }
}
