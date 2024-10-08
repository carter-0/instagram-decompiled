package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.save.analytics.SaveToCollectionsParentInsightsHost;
import com.instagram.save.model.SavedCollection;
import com.instagram.ui.widget.selectableview.RoundedCornerCheckMarkSelectableImageView;
import com.instagram.ui.widget.spinner.SpinnerImageView;
import java.util.List;
import java.util.Map;

/* renamed from: X.H1q  reason: case insensitive filesystem */
public final class C54171H1q extends AnonymousClass4DH implements C249763kK, AnonymousClass4DU, AnonymousClass4DR, C262944Gp, C229132mt, C252213ok, JOT {
    public static final String __redex_internal_original_name = "SaveToCollectionsFragment";
    public int A00 = -1;
    public int A01 = -1;
    public ViewStub A02;
    public ViewStub A03;
    public RecyclerView A04;
    public 1Xj A05;
    public AnonymousClass4DU A06;
    public IXC A07;
    public C56561I1p A08;
    public SpinnerImageView A09;
    public Integer A0A;
    public String A0B;
    public String A0C;
    public ImageView A0D;
    public TextView A0E;
    public TextView A0F;
    public AnonymousClass3E6 A0G;
    public String A0H;
    public final C56722I9i A0I = new C56722I9i(this, 5);
    public final AnonymousClass0eM A0J = C58685Ivu.A00(this, 18);
    public final AnonymousClass0eM A0K = C58685Ivu.A00(this, 19);
    public final AnonymousClass0eM A0L = C58685Ivu.A00(this, 20);
    public final AnonymousClass0eM A0M = C58685Ivu.A00(this, 21);
    public final AnonymousClass0eM A0N = C58685Ivu.A00(this, 22);
    public final AnonymousClass0eM A0O = C58685Ivu.A00(this, 23);
    public final AnonymousClass0eM A0P = C227642jf.A02(this);
    public final AnonymousClass0eM A0Q = C58685Ivu.A00(this, 24);

    public final /* synthetic */ void Cv6(float f) {
    }

    public final /* synthetic */ void Cv7(Integer num, float f) {
    }

    public final /* synthetic */ void D4N() {
    }

    public final /* synthetic */ void D4O(Integer num) {
    }

    public final void D4S(SavedCollection savedCollection) {
        SavedCollection savedCollection2 = savedCollection;
        0qQ.A0B(savedCollection, 0);
        1Xj r5 = this.A05;
        if (r5 != null) {
            boolean A0K2 = 0qQ.A0K(savedCollection.A0F, C54665HMw.EMPTY_PRODUCT_AUTO_COLLECTION.A01);
            String str = "delegate";
            C56561I1p i1p = this.A08;
            if (A0K2) {
                if (i1p != null) {
                    int i = this.A00;
                    int i2 = this.A01;
                    ((2Rw) this.A0J.getValue()).getItemCount();
                    if (this.A0B == null) {
                        str = "navigationType";
                    } else {
                        i1p.A01(this, r5, i, i2);
                    }
                }
            } else if (i1p != null) {
                i1p.A02(this, r5, savedCollection2, this.A0H, this.A00, this.A01);
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
        DbT.A1J(this);
    }

    public final /* synthetic */ void DHB(Integer num) {
    }

    public final /* synthetic */ void DYG(int i, int i2) {
    }

    public final /* synthetic */ void Dx6(C61065Jw3 jw3) {
    }

    public final String getModuleName() {
        return "save_to_collections_tray";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        AnonymousClass3E6 r0 = this.A0G;
        if (r0 == null) {
            str = "keyboardHeightChangeDetector";
        } else {
            r0.A9Y(this);
            A01(this);
            A03(this, AnonymousClass05K.A00);
            TextView textView = this.A0F;
            if (textView == null) {
                str = "actionButton";
            } else {
                C56802ICz.A01(textView, 49, this);
                2cc A002 = C71342cb.A00(DbT.A0X(this.A0P));
                AnonymousClass4DU r1 = this.A06;
                if (r1 == null) {
                    str = "parentInsightsHost";
                } else {
                    A002.A0D(r1, (String) null, getParentFragmentManager().A0M());
                    if (this.A05 == null && AnonymousClass06S.A01(getParentFragmentManager())) {
                        DbX.A1J(this);
                        return;
                    }
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A00(C54171H1q h1q) {
        String str;
        TextView textView = h1q.A0E;
        if (textView == null) {
            str = "actionBarTitle";
        } else {
            textView.setText(2131972578);
            ImageView imageView = h1q.A0D;
            if (imageView == null) {
                str = "createCollectionButton";
            } else {
                imageView.setVisibility(0);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(C54171H1q h1q) {
        String str;
        C53078GiB giB = (C53078GiB) h1q.A0J.getValue();
        giB.A06.clear();
        giB.notifyDataSetChanged();
        ImageView imageView = h1q.A0D;
        if (imageView == null) {
            str = "createCollectionButton";
        } else {
            imageView.setVisibility(8);
            SpinnerImageView spinnerImageView = h1q.A09;
            if (spinnerImageView == null) {
                str = "loadingSpinner";
            } else {
                spinnerImageView.setLoadingStatus(C255943uy.LOADING);
                IXC ixc = h1q.A07;
                if (ixc == null) {
                    str = "savedCollectionsFetcher";
                } else {
                    ixc.A02(true, true);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A02(C54171H1q h1q) {
        String str;
        ExtendedImageUrl A1m;
        RecyclerView recyclerView = h1q.A04;
        if (recyclerView == null) {
            str = "recyclerView";
        } else {
            recyclerView.setVisibility(8);
            AnonymousClass7TE.A0c(h1q.A0O).setVisibility(0);
            AnonymousClass0eM r4 = h1q.A0M;
            TextView textView = (TextView) r4.getValue();
            textView.setVisibility(0);
            textView.addTextChangedListener(h1q.A0I);
            textView.requestFocus();
            0nA.A0Q(AnonymousClass7TE.A0c(r4));
            1Xj r1 = h1q.A05;
            if (r1 == null || (A1m = r1.A1m(R.dimen.fbpay_ui_text_button_width)) == null) {
                ((RoundedCornerCheckMarkSelectableImageView) h1q.A0N.getValue()).A02();
            } else {
                ((RoundedCornerCheckMarkSelectableImageView) h1q.A0N.getValue()).setUrl(A1m, h1q);
            }
            TextView textView2 = h1q.A0E;
            if (textView2 == null) {
                str = "actionBarTitle";
            } else {
                textView2.setText(2131968265);
                ImageView imageView = h1q.A0D;
                if (imageView == null) {
                    str = "createCollectionButton";
                } else {
                    imageView.setVisibility(8);
                    DbW.A1R(h1q.A0Q, 0);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void ACw() {
        IXC ixc = this.A07;
        if (ixc == null) {
            0qQ.A0F("savedCollectionsFetcher");
            throw AnonymousClass00P.createAndThrow();
        } else {
            ixc.A01();
        }
    }

    public final void DMr(int i, boolean z) {
        if (z) {
            ViewGroup A002 = C3019160o.A00(requireView());
            if (A002 != null) {
                C294975nL A003 = C294975nL.A00(A002);
                A003.A0G();
                C294975nL A0A2 = A003.A0A();
                A0A2.A0K((float) (-i));
                A0A2.A0H();
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0P);
    }

    public final boolean isOrganicEligible() {
        AnonymousClass4DU r0 = this.A06;
        if (r0 != null) {
            return r0.isOrganicEligible();
        }
        0qQ.A0F("parentInsightsHost");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean isSponsoredEligible() {
        AnonymousClass4DU r0 = this.A06;
        if (r0 != null) {
            return r0.isSponsoredEligible();
        }
        0qQ.A0F("parentInsightsHost");
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A03(C54171H1q h1q, Integer num) {
        int i;
        int A072;
        int intValue = num.intValue();
        if (intValue != 0) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, C51965G9l.A0D(h1q.requireContext().getColor(R.color.blue_6)));
            stateListDrawable.addState(new int[0], C51965G9l.A0D(h1q.requireContext().getColor(R.color.badge_color)));
            TextView textView = h1q.A0F;
            if (textView != null) {
                textView.setBackground(stateListDrawable);
            }
            0qQ.A0F("actionButton");
            throw AnonymousClass00P.createAndThrow();
        }
        TextView textView2 = h1q.A0F;
        if (textView2 != null) {
            DbU.A11(h1q.requireContext(), textView2, 2Yu.A0H(h1q.requireContext(), R.attr.elevatedBackgroundDrawable));
        }
        0qQ.A0F("actionButton");
        throw AnonymousClass00P.createAndThrow();
        TextView textView3 = h1q.A0F;
        if (textView3 != null) {
            if (intValue != 0) {
                i = 2131960992;
            } else {
                i = 2131954722;
            }
            textView3.setText(i);
            Context requireContext = h1q.requireContext();
            Context requireContext2 = h1q.requireContext();
            if (intValue != 0) {
                A072 = R.color.design_dark_default_color_on_background;
            } else {
                A072 = 2Yu.A07(requireContext2);
            }
            DbT.A17(requireContext, textView3, A072);
            h1q.A0A = num;
            return;
        }
        0qQ.A0F("actionButton");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void D9d() {
        DbS.A1D(this);
    }

    public final String getSessionId() {
        return C320236s2.A01(requireArguments(), C273654mx.A00(113));
    }

    public final boolean onBackPressed() {
        DbS.A1D(this);
        AnonymousClass3E6 r0 = this.A0G;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.EEH(this);
        return false;
    }

    /* JADX WARNING: type inference failed for: r14v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.H1q] */
    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1892283705);
        C54171H1q.super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        AnonymousClass0eM r5 = this.A0P;
        this.A05 = DbX.A0d(r5).A02(requireArguments.getString(C273654mx.A00(1371)));
        this.A00 = requireArguments.getInt(C273654mx.A00(1369));
        this.A01 = requireArguments.getInt(C273654mx.A00(1374));
        this.A06 = (AnonymousClass4DU) C320236s2.A00(requireArguments, SaveToCollectionsParentInsightsHost.class, C273654mx.A00(1373));
        this.A0H = requireArguments.getString(C273654mx.A00(1370));
        this.A0B = C320236s2.A01(requireArguments, C273654mx.A00(1372));
        AnonymousClass4DU r4 = this.A06;
        C249763kK r3 = null;
        if (r4 == null) {
            0qQ.A0F("parentInsightsHost");
            throw AnonymousClass00P.createAndThrow();
        }
        UserSession A0l = AnonymousClass7TE.A0l(r5);
        if (requireArguments.getString(C273654mx.A00(113)) != null) {
            r3 = this;
        }
        this.A08 = new C56561I1p(this, A0l, r4, r3);
        List A002 = I7Q.A00(AnonymousClass7TE.A0l(r5), this.A05, AnonymousClass7TE.A1I(C54665HMw.MEDIA), this.A00);
        this.A07 = new IXC(requireContext(), AnonymousClass07i.A00(this), this, AnonymousClass7TE.A0l(r5), new IXB(this, 3), A002, 0sn.A00, (Map) null);
        this.A0G = AnonymousClass3E4.A01(this, false, false);
        AnonymousClass0fD.A09(1889391701, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(488631097);
        0qQ.A0B(layoutInflater, 0);
        C54171H1q.super.onCreateView(layoutInflater, viewGroup, bundle);
        View inflate = layoutInflater.inflate(R.layout.save_to_collections, viewGroup, false);
        this.A0E = DbU.A0G(inflate, R.id.save_to_collection_action_bar_title);
        ImageView A0F2 = DbU.A0F(inflate, R.id.save_to_collection_new_collection_button);
        C56802ICz.A01(A0F2, 47, this);
        this.A0D = A0F2;
        this.A03 = DbU.A0D(inflate, R.id.save_to_collection_back_button_stub);
        this.A09 = DbX.A0k(inflate);
        RecyclerView A0I2 = DbT.A0I(inflate, R.id.save_to_collections_recycler_view);
        Resources resources = A0I2.getResources();
        A0I2.A11(new AnonymousClass3V7(resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding), resources.getDimensionPixelSize(R.dimen.ab_test_media_thumbnail_preview_item_internal_padding)));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 0, false);
        A0I2.setLayoutManager(linearLayoutManager);
        A0I2.setAdapter((2Rw) this.A0J.getValue());
        A0I2.A15(new C3251871j(linearLayoutManager, this, C3251771i.A08, false, false));
        this.A04 = A0I2;
        this.A02 = DbU.A0D(inflate, R.id.save_to_collections_new_collection_stub);
        this.A0F = DbU.A0G(inflate, R.id.save_to_collection_action_button);
        AnonymousClass0fD.A09(1880016218, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1423784706);
        super.onDestroyView();
        DbS.A1D(this);
        AnonymousClass3E6 r0 = this.A0G;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.EEH(this);
        AnonymousClass0fD.A09(1997921489, A022);
    }

    public final void onPause() {
        int A022 = AnonymousClass0fD.A02(-2021788650);
        C54171H1q.super.onPause();
        DbS.A1D(this);
        AnonymousClass0fD.A09(-571056941, A022);
    }

    public final void onStart() {
        int A022 = AnonymousClass0fD.A02(1492165030);
        C54171H1q.super.onStart();
        AnonymousClass3E6 r1 = this.A0G;
        if (r1 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r1.DmJ(requireActivity());
        AnonymousClass0fD.A09(-1239199531, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(789260951);
        C54171H1q.super.onStop();
        AnonymousClass3E6 r0 = this.A0G;
        if (r0 == null) {
            0qQ.A0F("keyboardHeightChangeDetector");
            throw AnonymousClass00P.createAndThrow();
        }
        r0.onStop();
        AnonymousClass0fD.A09(-1424461682, A022);
    }
}
