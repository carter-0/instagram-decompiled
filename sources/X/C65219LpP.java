package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Set;

/* renamed from: X.LpP  reason: case insensitive filesystem */
public final class C65219LpP implements MVS {
    public LFP A00;
    public final AnonymousClass4DH A01;
    public final 1wn A02 = C64698LgT.A00(this, 55);
    public final UserSession A03;
    public final C3499582p A04;
    public final C3499682q A05;
    public final KO3 A06;
    public final C64584LeQ A07;
    public final C61837KOb A08;
    public final C61845KOj A09;
    public final C66576MXh A0A;
    public final L9K A0B;
    public final LP7 A0C;
    public final KB3 A0D;
    public final String A0E;
    public final boolean A0F = AnonymousClass6SR.A01().A0X;
    public final C62674Kka A0G = C62674Kka.A0M;
    public final AnonymousClass80P A0H = AnonymousClass80P.TAG_PRODUCT;

    public C65219LpP(AnonymousClass4DH r2, UserSession userSession, C3499582p r4, C3499682q r5, KO3 ko3, C64584LeQ leQ, C61837KOb kOb, C61845KOj kOj, C66576MXh mXh, L9K l9k, LP7 lp7, KB3 kb3, String str) {
        0qQ.A0B(userSession, 1);
        C51974G9v.A1S(r2, lp7, kb3, leQ, kOb);
        C51973G9u.A0u(8, l9k, str, r5);
        C51969G9p.A1O(r4, 11, mXh);
        this.A03 = userSession;
        this.A01 = r2;
        this.A0C = lp7;
        this.A0D = kb3;
        this.A07 = leQ;
        this.A08 = kOb;
        this.A09 = kOj;
        this.A0B = l9k;
        this.A0E = str;
        this.A05 = r5;
        this.A04 = r4;
        this.A06 = ko3;
        this.A0A = mXh;
    }

    public final /* synthetic */ void ADm() {
    }

    public final View ANH() {
        RecyclerView recyclerView;
        IgImageView igImageView;
        SpinnerImageView spinnerImageView;
        IgSimpleImageView igSimpleImageView;
        Context requireContext = this.A01.requireContext();
        UserSession userSession = this.A03;
        C3499582p r3 = this.A04;
        LP7 lp7 = this.A0C;
        KO3 ko3 = this.A06;
        C3499682q r4 = this.A05;
        LFP lfp = new LFP(requireContext, userSession, r3, lp7, new C64585LeT(userSession, r3, r4, ko3, lp7, this.A0E, new C59342JFu(this, 19)), LRu.A02(userSession, r4, ko3.A00, lp7));
        this.A00 = lfp;
        Context context = lfp.A00;
        IgLinearLayout igLinearLayout = new IgLinearLayout(context);
        igLinearLayout.setOrientation(1);
        JTS.A0x(igLinearLayout);
        LP7 lp72 = lfp.A01;
        View inflate = LayoutInflater.from(context).inflate(R.layout.tag_products_button, (ViewGroup) null);
        lp72.A01 = inflate;
        lp72.A02 = AnonymousClass7TE.A0d(inflate, R.id.metadata_textview_product);
        lp72.A03 = AnonymousClass7TE.A0d(lp72.A01, R.id.subtitle);
        lp72.A00 = lp72.A01.findViewById(R.id.badge);
        View view = lp72.A01;
        view.getClass();
        lp72.A05 = JTP.A0T(view, R.id.tag_products_row_icon);
        View view2 = lp72.A01;
        view2.getClass();
        lp72.A04 = JTP.A0T(view2, R.id.chevron_icon);
        LE2 le2 = lp72.A0C;
        if (le2 != null) {
            le2.A00(lp72.A01);
        }
        IgSimpleImageView igSimpleImageView2 = lp72.A05;
        if (igSimpleImageView2 != null) {
            igSimpleImageView2.setVisibility(0);
        }
        View view3 = lp72.A00;
        if ((view3 == null || view3.getVisibility() != 0) && (((igImageView = lp72.A06) == null || igImageView.getVisibility() != 0) && (((spinnerImageView = lp72.A08) == null || spinnerImageView.getVisibility() != 0) && (igSimpleImageView = lp72.A04) != null))) {
            igSimpleImageView.setVisibility(0);
        }
        igLinearLayout.addView(lp72.A01);
        View inflate2 = LayoutInflater.from(context).inflate(R.layout.product_suggestions_row, (ViewGroup) null);
        if ((inflate2 instanceof RecyclerView) && (recyclerView = (RecyclerView) inflate2) != null) {
            igLinearLayout.addView(recyclerView);
            lfp.A02.A00(recyclerView);
        }
        return igLinearLayout;
    }

    public final C62674Kka B1s() {
        return this.A0G;
    }

    public final AnonymousClass80P BHl() {
        return this.A0H;
    }

    public final void CsQ() {
        Integer num;
        int intValue;
        C61845KOj kOj = this.A09;
        C262224Cq r3 = kOj.A05;
        JV6 jv6 = new JV6((Object) kOj, (AnonymousClass4D7) null, 19, false);
        19B r5 = 19B.A00;
        1Eo.A05(r5, jv6, r3);
        KO3 ko3 = this.A06;
        AnonymousClass3Q2 r0 = ko3.A00;
        if (r0 != null) {
            UserSession userSession = this.A03;
            1iA r8 = r0.A1G;
            ArrayList arrayList = r0.A41;
            C3499682q r7 = this.A05;
            if (LRu.A01(userSession, r7, r8, "ProductTagFeedRowItem", arrayList) && 182.A06(0Tu.A05, userSession, 36310345010249754L)) {
                L9K l9k = this.A0B;
                02m r9 = l9k.A01;
                0qQ.A06(r9);
                Set set = l9k.A03;
                0qQ.A0B(set, 2);
                if (set.contains(37358359)) {
                    r9.markerEnd(37358359, 111);
                }
                set.add(37358359);
                r9.markerStart(37358359);
                r9.markerAnnotate(37358359, "input_type", l9k.A02);
                r9.markerAnnotate(37358359, "media_count", l9k.A00);
                if (C64191LSy.A00(r7, true) <= 3) {
                    AnonymousClass3Q2 A042 = ko3.A04();
                    C61837KOb kOb = this.A08;
                    kOj.A0A(this.A01, A042, l9k, kOb.A04, kOb.A00);
                }
            }
        }
        LFP lfp = this.A00;
        if (lfp != null) {
            lfp.A01();
            0eE r92 = AnonymousClass0t1.A01;
            UserSession userSession2 = this.A03;
            User A012 = r92.A01(userSession2);
            boolean A1W = C51970G9q.A1W(A012.A0U().indexOf(C367098qB.POST_DISCOUNT_TAG), -1);
            User A013 = r92.A01(userSession2);
            boolean A1W2 = C51970G9q.A1W(A013.A0U().indexOf(C367098qB.POST_PRODUCT_COLLECTION_TAG), -1);
            if (A1W || A1W2) {
                num = AnonymousClass05K.A0C;
            } else if (LTZ.A0K(userSession2, false)) {
                num = AnonymousClass05K.A0u;
            } else {
                num = AnonymousClass05K.A00;
            }
            AnonymousClass4DH r72 = this.A01;
            if (r72.mView != null) {
                LFP lfp2 = this.A00;
                if (lfp2 != null) {
                    if (lfp2.A01.A04() && (this.A0F || (((intValue = num.intValue()) == 1 || intValue == 2 || intValue == 6) && this.A0D.A01(num)))) {
                        KB3 kb3 = this.A0D;
                        View requireView = r72.requireView();
                        LFP lfp3 = this.A00;
                        if (lfp3 != null) {
                            View view = lfp3.A01.A01;
                            if (view != null) {
                                kb3.A00(r72.requireActivity(), requireView, view, num);
                            } else {
                                throw AnonymousClass7TE.A0y();
                            }
                        }
                    }
                }
            }
            07U r32 = 07U.A05;
            AnonymousClass07Z viewLifecycleOwner = r72.getViewLifecycleOwner();
            AnonymousClass07Z A0I = JTP.A0I(r72, r5, MHO.A03(viewLifecycleOwner, r32, this, (AnonymousClass4D7) null, 39), AnonymousClass07a.A00(viewLifecycleOwner));
            1Eo.A05(r5, MHO.A03(A0I, r32, this, (AnonymousClass4D7) null, 40), AnonymousClass07a.A00(A0I));
            r72.mLifecycleRegistry.A09(new C64302LZc(this, 2));
            return;
        }
        0qQ.A0F("tagProductsSection");
        throw AnonymousClass00P.createAndThrow();
    }
}
