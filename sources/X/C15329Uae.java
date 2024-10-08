package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.reboundviewpager.ReboundViewPager;
import com.instagram.model.reels.Reel;
import com.instagram.model.shopping.featuredproduct.FeaturedProductPermissionStatus;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import com.instagram.util.fragment.IgFragmentFactoryImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Uae  reason: case insensitive filesystem */
public final class C15329Uae extends AnonymousClass4DH implements AnonymousClass4DR, X7v, C20966X6t, C20967X6u, C20930X4v, C20923X4o, XC5, XC6, XC7 {
    public static final String __redex_internal_original_name = "LightboxFragment";
    public int A00;
    public long A01;
    public U4D A02;
    public String A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final AnonymousClass4DU A09 = new Object();
    public final AnonymousClass0eM A0A = C20701WxY.A00(this, 1);
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I;
    public final AnonymousClass0eM A0J;
    public final AnonymousClass0eM A0K;
    public final AnonymousClass0eM A0L;

    public final void DPm(C16272UrZ urZ) {
        int i;
        String string;
        C18778W1d w1d = (C18778W1d) this.A0C.getValue();
        C16272UrZ urZ2 = urZ;
        1Xj r1 = urZ2.A00;
        String str = urZ2.A02;
        String str2 = urZ2.A03;
        int indexOf = this.A04.indexOf(urZ2);
        int size = this.A04.size();
        boolean A042 = A04(this, urZ2);
        boolean z = this.A05;
        0Aj A0e = AnonymousClass7TE.A0e(w1d.A02, "instagram_shopping_lightbox_media_attribution_permalink_click");
        if (A0e.isSampled()) {
            String id = r1.getId();
            if (id != null) {
                A0e.AAJ("item_media_id", id);
                UserSession userSession = w1d.A03;
                User A2A = r1.A2A(userSession);
                if (A2A != null) {
                    A0e.AAJ("item_media_owner_id", A2A.getId());
                    Product product = w1d.A05;
                    C13991Tnr.A17(A0e, product.A0H);
                    String A0j = C13991Tnr.A0j(product);
                    if (A0j == null) {
                        A0j = "";
                    }
                    A0e.AAJ("merchant_id", A0j);
                    C13989Tnp.A1H(A0e, product);
                    C13992Tns.A0j(A0e, str, str2, indexOf);
                    C18778W1d.A02(A0e, w1d, size, A042, z);
                    1Xj r2 = w1d.A04;
                    if (!(r2 == null || r2.A2A(userSession) == null)) {
                        A0e.AAJ("media_owner_id", C13992Tns.A0G(A0e, userSession, r2));
                    }
                    A0e.Cgf();
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        1Xj r22 = urZ2.A01;
        if (!C254423sS.A09(r22)) {
            FragmentActivity requireActivity = requireActivity();
            AnonymousClass0eM r4 = this.A0G;
            C309516Yo A0N = DbX.A0N(requireActivity, r4);
            A0N.A08();
            IgFragmentFactoryImpl.A00();
            String id2 = r22.getId();
            if (id2 != null) {
                F3W f3w = new F3W();
                f3w.A0B = id2;
                f3w.A00 = r1.A15(AnonymousClass7TE.A0l(r4));
                A0N.A0D(f3w.A01());
                A0N.A04();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        C249713kF r8 = C249713kF.A00;
        AnonymousClass0eM r42 = this.A0G;
        UserSession A0l = AnonymousClass7TE.A0l(r42);
        FragmentActivity requireActivity2 = requireActivity();
        C16509Uw6 uw6 = C16509Uw6.FEATURED_PRODUCTS;
        String str3 = C13990Tnq.A0W(this.A0A).A0E;
        int ordinal = r22.BR7().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                i = 2131976403;
            } else if (ordinal != 4) {
                string = "";
            } else {
                i = 2131969659;
            }
            string = getString(i);
        } else {
            i = 2131969399;
            string = getString(i);
        }
        String id3 = r22.getId();
        Integer valueOf = Integer.valueOf(r1.A15(AnonymousClass7TE.A0l(r42)));
        Bundle bundle = new Bundle();
        bundle.putString("media_id", r1.getId());
        bundle.putString("parent_media_id", r22.getId());
        r8.A0i(bundle, requireActivity2, A0l, uw6, valueOf, str3, string, id3, (String) null, (String) null, (String) null);
    }

    public final void Dnj(XC0 xc0, C16274Urb urb) {
        Reel reel = urb.A01;
        AnonymousClass32A r6 = (AnonymousClass32A) this.A0E.getValue();
        AnonymousClass0eM r5 = this.A0A;
        r6.A0C = C13990Tnq.A0W(r5).A0E;
        r6.A05 = new C16165Upq((Activity) requireActivity(), xc0.Beu(), (C230222pE) new FkY(8), AnonymousClass05K.A01);
        r6.A0B = C13990Tnq.A0W(r5).A0E;
        List A1I = AnonymousClass7TE.A1I(reel);
        List A1I2 = AnonymousClass7TE.A1I(reel);
        r6.A06(reel, AnonymousClass3BQ.INSTAGRAM_SHOPPING_PDP_LIGHTBOX, xc0, A1I, A1I2, 0);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        2db.A06(requireActivity(), true);
        View A0b = AnonymousClass7TE.A0b(view, R.id.primary_close_button);
        View A0b2 = AnonymousClass7TE.A0b(view, R.id.white_close_button);
        AnonymousClass0eM r5 = this.A0L;
        if (r5.getValue() instanceof AnonymousClass7HT) {
            C234392xn r52 = (C234392xn) r5.getValue();
            0qQ.A0C(r52, "null cannot be cast to non-null type com.instagram.ui.zoom.MultiGestureZoomableViewController");
            ((AnonymousClass7HT) r52).A0C = new C19784WfR(this);
        }
        this.A02 = new U4D(this.A09, AnonymousClass7TE.A0l(this.A0G), (C18065Vkr) this.A0I.getValue(), this, (C17389VTq) this.A0J.getValue(), (AnonymousClass4UR) this.A0D.getValue());
        ReboundViewPager reboundViewPager = (ReboundViewPager) AnonymousClass7TE.A0b(view, R.id.view_pager);
        reboundViewPager.setAdapter((Adapter) this.A02);
        reboundViewPager.A0R(true, (float) this.A00);
        reboundViewPager.A0P(new C15853Ujd(A0b, A0b2, reboundViewPager, this));
        WBC wbc = new WBC(this, 61);
        AnonymousClass0fU.A00(wbc, A0b);
        AnonymousClass0fU.A00(wbc, A0b2);
        A01(A0b, A0b2, this);
        Dba.A0z(reboundViewPager, (2el) this.A0K.getValue(), this);
        U4D u4d = this.A02;
        if (u4d != null) {
            List list = this.A04;
            0qQ.A0B(list, 0);
            u4d.A02 = list;
            0fE.A00(u4d, 612254867);
        }
        C17534VZn vZn = new C17534VZn(AnonymousClass7TF.A0G(view, R.id.cta_container));
        AnonymousClass0eM r4 = this.A0B;
        DbV.A1F(getViewLifecycleOwner(), ((U90) r4.getValue()).A02, new C74186PqS(49, (Object) this, (Object) vZn), 48);
        AnonymousClass11O.A03(DbV.A0J(this), new C61860pz(new C66186MGx(this, (AnonymousClass4D7) null, 17), ((U90) r4.getValue()).A0E));
    }

    public static final List A00(List list) {
        C46292DTv A032;
        FeaturedProductPermissionStatus featuredProductPermissionStatus;
        ArrayList arrayList = new ArrayList();
        for (Object next : list) {
            C18001Vjd vjd = (C18001Vjd) next;
            Integer num = vjd.A02;
            if (num != AnonymousClass05K.A00) {
                if (num == AnonymousClass05K.A01 && (vjd instanceof C16272UrZ) && (A032 = C254423sS.A03(((C16272UrZ) vjd).A00)) != null) {
                    C74546Pwf Bbg = A032.Bbg();
                    if (Bbg != null) {
                        featuredProductPermissionStatus = Bbg.BzM();
                    } else {
                        featuredProductPermissionStatus = null;
                    }
                    if (featuredProductPermissionStatus != FeaturedProductPermissionStatus.APPROVED) {
                    }
                }
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    public static final void A01(View view, View view2, C15329Uae uae) {
        int A062 = JTT.A06(uae);
        int A0A2 = C13990Tnq.A0A(uae);
        int i = (int) ((1.0f / ((C18001Vjd) uae.A04.get(uae.A00)).A00) * ((float) A062));
        int i2 = 0;
        boolean z = false;
        int i3 = 8;
        if (i < A0A2) {
            z = true;
            i3 = 0;
        }
        view.setVisibility(i3);
        if (!(!z)) {
            i2 = 8;
        }
        view2.setVisibility(i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A02(X.C15329Uae r4) {
        /*
            X.0eM r3 = r4.A0I
            java.lang.Object r1 = r3.getValue()
            X.Vkr r1 = (X.C18065Vkr) r1
            java.lang.String r0 = "scroll"
            r1.A03(r0)
            java.util.List r1 = r4.A04
            int r0 = r4.A00
            java.lang.Object r2 = r1.get(r0)
            X.Vjd r2 = (X.C18001Vjd) r2
            java.lang.Integer r0 = r2.A02
            int r1 = r0.intValue()
            r0 = 1
            if (r1 == r0) goto L_0x0067
            r0 = 4
            if (r1 == r0) goto L_0x005c
            r0 = 5
            if (r1 != r0) goto L_0x004a
            X.Urb r2 = (X.C16274Urb) r2
            X.1Xj r2 = r2.A00
        L_0x002a:
            boolean r0 = r2.CeS()
            if (r0 == 0) goto L_0x004a
            java.lang.Object r0 = r3.getValue()
            X.Vkr r0 = (X.C18065Vkr) r0
        L_0x0036:
            r0.A00(r2)
            X.U4D r1 = r4.A02
            if (r1 == 0) goto L_0x0049
            X.Uw7 r0 = X.Uw7.PREPARING
            r1.A01 = r0
            r1.A00 = r2
            r0 = 1818280790(0x6c60c356, float:1.0868873E27)
            X.0fE.A00(r1, r0)
        L_0x0049:
            return
        L_0x004a:
            X.U4D r2 = r4.A02
            if (r2 == 0) goto L_0x0049
            X.Uw7 r1 = X.Uw7.A02
            r0 = 0
            r2.A01 = r1
            r2.A00 = r0
            r0 = 1818280790(0x6c60c356, float:1.0868873E27)
            X.0fE.A00(r2, r0)
            return
        L_0x005c:
            X.UrY r2 = (X.C16271UrY) r2
            java.lang.Object r0 = r3.getValue()
            X.Vkr r0 = (X.C18065Vkr) r0
            X.1Xj r2 = r2.A00
            goto L_0x0036
        L_0x0067:
            X.UrZ r2 = (X.C16272UrZ) r2
            X.1Xj r2 = r2.A00
            goto L_0x002a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15329Uae.A02(X.Uae):void");
    }

    public static final boolean A04(C15329Uae uae, C18001Vjd vjd) {
        1Xj r2;
        UserSession A0l = AnonymousClass7TE.A0l(uae.A0G);
        String A0q = C13989Tnp.A0q(C13990Tnq.A0W(uae.A0A).A01);
        0qQ.A0A(A0q);
        AnonymousClass7TF.A1B(A0l, 0, A0q);
        Integer num = vjd.A02;
        if (num == AnonymousClass05K.A01) {
            r2 = ((C16272UrZ) vjd).A01;
        } else if (num != AnonymousClass05K.A0j) {
            return false;
        } else {
            r2 = ((C16274Urb) vjd).A00;
        }
        User A2A = r2.A2A(A0l);
        if (A2A == null) {
            return false;
        }
        String id = A2A.getId();
        if (C254423sS.A03(r2) != null || 0qQ.A0K(id, A0q)) {
            return false;
        }
        return true;
    }

    public final void A05(View view, boolean z) {
        if (!this.A06) {
            int i = 0;
            if (z) {
                i = 4;
            }
            DbX.A1D(view, R.id.username_attribution, i);
            DbX.A1D(view, R.id.delimiter_attribution, i);
            DbX.A1D(view, R.id.view_media_attribution, i);
            View view2 = this.mView;
            if (view2 != null) {
                View A0b = AnonymousClass7TE.A0b(view2, R.id.primary_close_button);
                View A0b2 = AnonymousClass7TE.A0b(view2, R.id.white_close_button);
                if (i == 4) {
                    A0b.setVisibility(i);
                    A0b2.setVisibility(i);
                } else {
                    A01(A0b, A0b2, this);
                }
                View A0b3 = AnonymousClass7TE.A0b(view2, R.id.cta_container);
                if (A0b3.getVisibility() == i) {
                    return;
                }
                if (A0b3.getVisibility() == 0) {
                    this.A08 = true;
                    A0b3.setVisibility(4);
                } else if (this.A08) {
                    A0b3.setVisibility(0);
                }
            }
        }
    }

    public final void CuK() {
        ((U90) this.A0B.getValue()).A05(true);
    }

    public final void Czi() {
        ((U90) this.A0B.getValue()).A06(true);
    }

    public final void DPl(C16272UrZ urZ) {
        1Xj r2 = urZ.A00;
        ((C18778W1d) this.A0C.getValue()).A04(r2, urZ.A02, urZ.A03, this.A04.indexOf(urZ), this.A04.size(), A04(this, urZ), this.A05);
        User A2A = r2.A2A(AnonymousClass7TE.A0l(this.A0G));
        if (A2A != null) {
            A03(A2A.getId());
        }
    }

    public final void Dni(C16274Urb urb) {
        1Xj r2 = urb.A00;
        ((C18778W1d) this.A0C.getValue()).A04(r2, urb.A02, urb.A03, this.A04.indexOf(urb), this.A04.size(), A04(this, urb), this.A05);
        User A2A = r2.A2A(AnonymousClass7TE.A0l(this.A0G));
        if (A2A != null) {
            A03(A2A.getId());
        }
    }

    public final void Dx8() {
        ((AnonymousClass4UR) this.A0D.getValue()).A02(C232822uV.A0B);
        C14044Tol tol = ((C18065Vkr) this.A0I.getValue()).A01;
        if (tol != null) {
            tol.A04(-1);
        }
        U4D u4d = this.A02;
        if (u4d != null) {
            0fE.A00(u4d, -1582815345);
        }
    }

    public final void DyR(1Xj r3, C270194gL r4) {
        View view = this.mView;
        if (view != null) {
            view.post(new C20253Wns(r3, this));
        }
    }

    public final void Dz2() {
        String str;
        AnonymousClass0eM r0 = this.A0A;
        User user = C13990Tnq.A0W(r0).A01.A0B;
        String str2 = null;
        if (user != null) {
            str = AnonymousClass3ZA.A00(user);
        } else {
            str = null;
        }
        String str3 = C13990Tnq.A0W(r0).A07;
        if (str3 != null) {
            str2 = C231122qu.A0I(AnonymousClass7TE.A0l(this.A0G), str3);
        }
        if (str != null) {
            C249713kF.A00.A0m(requireActivity(), V1Z.UNKNOWN, V1W.UNKNOWN, V1Y.UNKNOWN, V1X.UNKNOWN, AnonymousClass7TE.A0l(this.A0G), (Long) null, str, C13990Tnq.A0W(r0).A0E, this.A09.getModuleName(), "view_in_cart_cta", (String) null, str2, (String) null, (String) null, C13990Tnq.A0W(r0).A03, C13990Tnq.A0W(r0).A01.A0H, C13990Tnq.A0W(r0).A07, C13990Tnq.A0W(r0).A02, (String) null, (HashMap) null, false);
            return;
        }
        C249713kF.A00.A0p(requireActivity(), V1Z.UNKNOWN, V1W.UNKNOWN, V1Y.UNKNOWN, V1X.UNKNOWN, AnonymousClass7TE.A0l(this.A0G), C13990Tnq.A0W(r0).A0E, this.A09.getModuleName(), "view_in_cart_cta", str2, C13990Tnq.A0W(r0).A07, C13990Tnq.A0W(r0).A02, false);
    }

    public final void FHJ(View view, C253723rH r3, C18001Vjd vjd, C253913rc r5) {
        boolean z = !this.A07;
        this.A07 = z;
        A05(view, z);
    }

    public final String getModuleName() {
        return this.A09.getModuleName();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0G);
    }

    public final boolean onBackPressed() {
        C18778W1d w1d = (C18778W1d) this.A0C.getValue();
        String str = this.A03;
        0qQ.A0B(str, 0);
        0Aj A0e = AnonymousClass7TE.A0e(w1d.A02, "instagram_shopping_lightbox_dismiss");
        if (A0e.isSampled()) {
            A0e.AAJ("source", str);
            Product product = w1d.A05;
            C13991Tnr.A17(A0e, product.A0H);
            String A0j = C13991Tnr.A0j(product);
            if (A0j == null) {
                A0j = "";
            }
            A0e.AAJ("merchant_id", A0j);
            C13989Tnp.A1H(A0e, product);
            C18778W1d.A01(A0e, w1d);
            1Xj r2 = w1d.A04;
            if (r2 != null) {
                UserSession userSession = w1d.A03;
                if (r2.A2A(userSession) != null) {
                    A0e.AAJ("media_owner_id", C13992Tns.A0G(A0e, userSession, r2));
                }
            }
            A0e.Cgf();
        }
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4DU, java.lang.Object] */
    public C15329Uae() {
        C20701WxY wxY = new C20701WxY(this, 2);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C20701WxY(new C20701WxY(this, 6), 7));
        this.A0B = new C227862kA(new C20701WxY(A002, 8), wxY, new C20613Wvu(30, A002, (Object) null), new 0Yh(U90.class));
        this.A0C = C20701WxY.A00(this, 3);
        this.A0D = AnonymousClass1YB.A00(C20661Wwt.A00);
        this.A0E = C20701WxY.A00(this, 4);
        this.A0F = C20701WxY.A00(this, 5);
        this.A0H = C20701WxY.A00(this, 9);
        this.A0I = C20701WxY.A00(this, 10);
        this.A0J = C20701WxY.A00(this, 11);
        this.A0K = AnonymousClass1YB.A00(C20662Wwu.A00);
        this.A0L = C20701WxY.A00(this, 12);
        this.A03 = "back_button";
        this.A04 = new ArrayList();
        this.A0G = C227642jf.A02(this);
    }

    private final void A03(String str) {
        FragmentActivity requireActivity = requireActivity();
        AnonymousClass0eM r0 = this.A0G;
        C309516Yo A0N = DbX.A0N(requireActivity, r0);
        A0N.A08();
        1a1 A022 = C46447Df9.A02();
        UserSession A0l = AnonymousClass7TE.A0l(r0);
        C46474Dfc A012 = C46548Dgp.A01(AnonymousClass7TE.A0l(r0), str, "shopping_lightbox", this.A09.getModuleName());
        A012.A0L = C13990Tnq.A0W(this.A0A).A0E;
        C46474Dfc.A03(A0N, A0l, A022, A012);
    }

    public final void E0Z(View view, C253723rH r14, C18001Vjd vjd, C253913rc r16) {
        AnonymousClass7TG.A1N(vjd, r14);
        AnonymousClass0eM r5 = this.A0L;
        if (((C234392xn) r5.getValue()).isIdle()) {
            C18778W1d w1d = (C18778W1d) this.A0C.getValue();
            String A012 = vjd.A01();
            String str = vjd.A03;
            int indexOf = this.A04.indexOf(vjd);
            int size = this.A04.size();
            boolean A042 = A04(this, vjd);
            boolean z = this.A05;
            0Aj A0e = AnonymousClass7TE.A0e(w1d.A02, "instagram_shopping_lightbox_item_zoom");
            if (A0e.isSampled()) {
                Product product = w1d.A05;
                C13991Tnr.A17(A0e, product.A0H);
                String A0j = C13991Tnr.A0j(product);
                if (A0j == null) {
                    A0j = "";
                }
                A0e.AAJ("merchant_id", A0j);
                C13989Tnp.A1H(A0e, product);
                C13992Tns.A0j(A0e, A012, str, indexOf);
                C18778W1d.A02(A0e, w1d, size, A042, z);
                1Xj r2 = w1d.A04;
                if (r2 != null) {
                    UserSession userSession = w1d.A03;
                    if (r2.A2A(userSession) != null) {
                        A0e.AAJ("media_owner_id", C13992Tns.A0G(A0e, userSession, r2));
                    }
                }
                A0e.Cgf();
            }
            ((C234392xn) r5.getValue()).Exy(view, r14, r16);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: androidx.fragment.app.Fragment} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r23) {
        /*
            r22 = this;
            r0 = -622141391(0xffffffffdaeae031, float:-3.30558228E16)
            int r2 = X.AnonymousClass0fD.A02(r0)
            r3 = r22
            r0 = r23
            X.C15329Uae.super.onCreate(r0)
            X.0eM r7 = r3.A0G
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r7)
            X.0eM r12 = r3.A0A
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r0 = X.C13990Tnq.A0W(r12)
            android.os.Parcelable[] r10 = r0.A0K
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            int r8 = r10.length
            r6 = 0
        L_0x0023:
            if (r6 >= r8) goto L_0x00e2
            r13 = r10[r6]
            com.instagram.shopping.model.pdp.herocarousel.HeroCarouselItemConverter$ParcelableHeroCarouselItemModel r13 = (com.instagram.shopping.model.pdp.herocarousel.HeroCarouselItemConverter$ParcelableHeroCarouselItemModel) r13
            X.1E8 r5 = X.1E7.A00(r11)
            java.lang.Integer r0 = r13.A02
            int r1 = r0.intValue()
            r14 = 0
            if (r1 == r14) goto L_0x00b2
            r0 = 1
            if (r1 == r0) goto L_0x0094
            r0 = 3
            if (r1 == r0) goto L_0x0085
            r0 = 4
            if (r1 == r0) goto L_0x0071
            r0 = 5
            if (r1 != r0) goto L_0x00dc
            java.lang.String r0 = r13.A07
            r0.getClass()
            com.instagram.model.reels.Reel r4 = X.Dba.A0L(r11, r0)
            if (r4 == 0) goto L_0x006e
            java.util.List r5 = r4.A0O(r11)
            if (r5 == 0) goto L_0x006e
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x006e
            java.lang.String r1 = r13.A05
            java.lang.Object r0 = r5.get(r14)
            X.3uh r0 = (X.C255773uh) r0
            X.1Xj r0 = r0.A0b
            r0.getClass()
            X.Urb r13 = new X.Urb
            r13.<init>(r0, r4, r1)
        L_0x006b:
            r9.add(r13)
        L_0x006e:
            int r6 = r6 + 1
            goto L_0x0023
        L_0x0071:
            java.lang.String r0 = r13.A09
            r0.getClass()
            java.lang.String r1 = r13.A05
            X.1Xj r0 = r5.A02(r0)
            r0.getClass()
            X.UrY r13 = new X.UrY
            r13.<init>(r0, r1)
            goto L_0x006b
        L_0x0085:
            com.instagram.model.mediasize.ImageInfo r4 = r13.A00
            r4.getClass()
            java.lang.String r1 = r13.A05
            java.lang.String r0 = r13.A06
            X.Ura r13 = new X.Ura
            r13.<init>(r4, r1, r0)
            goto L_0x006b
        L_0x0094:
            java.lang.String r1 = r13.A09
            r1.getClass()
            java.lang.String r0 = r13.A08
            r0.getClass()
            X.1Xj r4 = r5.A02(r1)
            X.1Xj r1 = r5.A02(r0)
            if (r4 == 0) goto L_0x006e
            if (r1 == 0) goto L_0x006e
            java.lang.String r0 = r13.A05
            X.UrZ r13 = new X.UrZ
            r13.<init>(r4, r1, r0)
            goto L_0x006b
        L_0x00b2:
            java.lang.String r5 = r13.A04
            r5.getClass()
            java.lang.String r4 = r13.A03
            r4.getClass()
            com.instagram.model.shopping.ProductArEffectMetadata r15 = r13.A01
            r15.getClass()
            com.instagram.model.mediasize.ImageInfo r14 = r13.A00
            r14.getClass()
            java.lang.String r1 = r13.A05
            java.lang.String r0 = r13.A06
            r16 = 0
            X.Urd r13 = new X.Urd
            r17 = r1
            r18 = r5
            r19 = r4
            r20 = r0
            r21 = r16
            r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21)
            goto L_0x006b
        L_0x00dc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x00e2:
            java.util.List r0 = A00(r9)
            r3.A04 = r0
            r5 = 0
            int r4 = r0.size()
        L_0x00ed:
            if (r5 >= r4) goto L_0x0109
            java.util.List r0 = r3.A04
            java.lang.Object r0 = r0.get(r5)
            X.Vjd r0 = (X.C18001Vjd) r0
            java.lang.String r1 = r0.A01()
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r0 = X.C13990Tnq.A0W(r12)
            java.lang.String r0 = r0.A06
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x01d8
            r3.A00 = r5
        L_0x0109:
            X.0eM r5 = r3.A0C
            java.lang.Object r8 = r5.getValue()
            X.W1d r8 = (X.C18778W1d) r8
            java.util.List r0 = r3.A04
            int r10 = r0.size()
            int r9 = r3.A00
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r0 = X.C13990Tnq.A0W(r12)
            boolean r4 = r0.A0J
            X.0wc r1 = r8.A02
            java.lang.String r0 = "instagram_shopping_lightbox_entry"
            X.0Aj r6 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r6.isSampled()
            if (r0 == 0) goto L_0x0176
            X.C13991Tnr.A11(r6, r10)
            long r0 = (long) r9
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            java.lang.String r0 = "initial_index"
            r6.A9F(r0, r1)
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            java.lang.String r0 = "is_loading"
            r6.A7p(r0, r1)
            com.instagram.user.model.Product r4 = r8.A05
            java.lang.String r0 = r4.A0H
            X.C13991Tnr.A17(r6, r0)
            java.lang.String r1 = X.C13991Tnr.A0j(r4)
            java.lang.String r0 = ""
            if (r1 != 0) goto L_0x0153
            r1 = r0
        L_0x0153:
            java.lang.String r0 = "merchant_id"
            r6.AAJ(r0, r1)
            X.C13989Tnp.A1H(r6, r4)
            X.C18778W1d.A01(r6, r8)
            X.1Xj r4 = r8.A04
            if (r4 == 0) goto L_0x0173
            com.instagram.common.session.UserSession r1 = r8.A03
            com.instagram.user.model.User r0 = r4.A2A(r1)
            if (r0 == 0) goto L_0x0173
            java.lang.String r1 = X.C13992Tns.A0G(r6, r1, r4)
            java.lang.String r0 = "media_owner_id"
            r6.AAJ(r0, r1)
        L_0x0173:
            r6.Cgf()
        L_0x0176:
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r0 = X.C13990Tnq.A0W(r12)
            boolean r0 = r0.A0J
            if (r0 == 0) goto L_0x01c4
            r0 = 1
            r3.A05 = r0
            long r0 = java.lang.System.currentTimeMillis()
            r3.A01 = r0
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r0 = X.C13990Tnq.A0W(r12)
            com.instagram.user.model.Product r8 = r0.A01
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r0 = X.C13990Tnq.A0W(r12)
            java.lang.String r9 = r0.A09
            android.content.Context r4 = r3.requireContext()
            X.0gy r5 = X.AnonymousClass07i.A00(r3)
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r7)
            java.lang.String r10 = X.C13989Tnp.A0q(r8)
            X.0qQ.A0A(r10)
            r11 = 0
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r0 = X.C13990Tnq.A0W(r12)
            java.lang.String r1 = r0.A0A
            X.WcG r7 = new X.WcG
            r7.<init>(r3)
            com.instagram.shopping.fragment.pdp.lightbox.LightboxArguments r0 = X.C13990Tnq.A0W(r12)
            boolean r0 = r0.A0I
            r12 = r1
            r13 = r0
            X.C17065VGn.A00(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x01bd:
            r0 = 1183226702(0x46869b4e, float:17229.652)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        L_0x01c4:
            java.lang.Object r5 = r5.getValue()
            X.W1d r5 = (X.C18778W1d) r5
            java.util.List r0 = r3.A04
            int r4 = r0.size()
            int r3 = r3.A00
            r0 = 0
            r5.A03(r4, r3, r0)
            goto L_0x01bd
        L_0x01d8:
            int r5 = r5 + 1
            goto L_0x00ed
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15329Uae.onCreate(android.os.Bundle):void");
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(76114054);
        0qQ.A0B(layoutInflater, 0);
        ((C234392xn) this.A0L.getValue()).start();
        View inflate = layoutInflater.inflate(R.layout.lightbox, viewGroup, false);
        AnonymousClass0fD.A09(1408344446, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-1524319473);
        super.onDestroyView();
        ((C234392xn) this.A0L.getValue()).stop();
        this.A02 = null;
        AnonymousClass0fD.A09(-467673420, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(2030758713);
        C15329Uae.super.onPause();
        ((C18065Vkr) this.A0I.getValue()).A02("fragment_paused");
        AnonymousClass0fD.A09(-613425966, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-2089401267);
        super.onResume();
        U90 u90 = (U90) this.A0B.getValue();
        C17936ViR viR = u90.A06;
        AnonymousClass7TF.A1O(viR.A03, viR.A01.A08(U90.A01(u90)));
        A02(this);
        AnonymousClass0fD.A09(-1871946908, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-309585566);
        C15329Uae.super.onStop();
        C17453VWg vWg = (C17453VWg) this.A0F.getValue();
        C230262pI r2 = vWg.A01;
        if (!r2.A07()) {
            ((AnonymousClass2f9) vWg.A02.getValue()).A0L(r2.A04());
            r2.A05();
        }
        AnonymousClass0fD.A09(1105877074, A022);
    }
}
