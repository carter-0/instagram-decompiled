package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductGroup;
import com.instagram.model.shopping.ProductVariantDimension;
import com.instagram.model.shopping.productvariantvalue.ProductVariantVisualStyle;
import com.instagram.ui.widget.spinner.RefreshSpinner;
import com.instagram.user.model.Product;
import java.util.Collections;

public final class UZF extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "GenericThumbnailVariantSelectorFragment";
    public LinearLayout A00;
    public LinearLayout A01;
    public ProductGroup A02;
    public ProductVariantDimension A03;
    public C17868VhL A04;
    public C17454VWh A05;
    public RefreshSpinner A06;
    public RecyclerView A07;
    public boolean A08;
    public final UA4 A09 = new UA4(this);
    public final AnonymousClass0eM A0A = C227642jf.A02(this);
    public final VPF A0B = new VPF(this);

    public final String getModuleName() {
        return "generic_thumbnail_image_variant_selector";
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.07Z, X.UZF, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C17868VhL vhL = this.A04;
        if (vhL == null) {
            0qQ.A0F("controller");
            throw AnonymousClass00P.createAndThrow();
        } else {
            vhL.A00(AnonymousClass07i.A00(this));
        }
    }

    public static final void A00(UZF uzf) {
        String str;
        LinearLayout linearLayout = uzf.A01;
        if (linearLayout == null) {
            str = "errorContainer";
        } else {
            linearLayout.setVisibility(0);
            RefreshSpinner refreshSpinner = uzf.A06;
            if (refreshSpinner == null) {
                str = "refreshSpinner";
            } else {
                refreshSpinner.setVisibility(8);
                LinearLayout linearLayout2 = uzf.A00;
                if (linearLayout2 == null) {
                    str = "contentContainer";
                } else {
                    linearLayout2.setVisibility(8);
                    return;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public static final void A01(UZF uzf, Product product) {
        if (uzf.A08) {
            DbX.A0R(uzf.A0A).A00(new WQI(product));
            DbT.A1K(uzf);
            return;
        }
        C17454VWh vWh = uzf.A05;
        if (vWh != null) {
            C65748Lz2 lz2 = vWh.A02;
            lz2.A00 = product;
            vWh.A00.A0L(lz2);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0A);
    }

    public final void onCreate(Bundle bundle) {
        IllegalStateException illegalStateException;
        int i;
        int A022 = AnonymousClass0fD.A02(-978569719);
        UZF.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            ProductGroup productGroup = (ProductGroup) C320236s2.A00(bundle2, ProductGroup.class, AnonymousClass000.A00(2248));
            this.A02 = productGroup;
            if (productGroup != null) {
                if (!C13988Tno.A1a(productGroup.A02)) {
                    ProductGroup productGroup2 = this.A02;
                    if (productGroup2 != null) {
                        if (((ProductVariantDimension) Collections.unmodifiableList(productGroup2.A02).get(0)).A00 == ProductVariantVisualStyle.THUMBNAIL) {
                            ProductGroup productGroup3 = this.A02;
                            if (productGroup3 != null) {
                                this.A03 = (ProductVariantDimension) Collections.unmodifiableList(productGroup3.A02).get(0);
                                Context requireContext = requireContext();
                                UserSession A0l = AnonymousClass7TE.A0l(this.A0A);
                                ProductGroup productGroup4 = this.A02;
                                if (productGroup4 != null) {
                                    this.A04 = new C17868VhL(requireContext, A0l, productGroup4, this.A0B);
                                    AnonymousClass0fD.A09(-2037501522, A022);
                                    return;
                                }
                            }
                        }
                    }
                }
                illegalStateException = new IllegalStateException("No product variant dimension found with visual style as THUMBNAIL");
                i = -729658797;
            }
            0qQ.A0F("productGroup");
            throw AnonymousClass00P.createAndThrow();
        }
        illegalStateException = AnonymousClass7TE.A0y();
        i = 1565541986;
        AnonymousClass0fD.A09(i, A022);
        throw illegalStateException;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-507315343);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.generic_thumbnail_image_variant_selector_drawer, viewGroup, false);
        this.A00 = (LinearLayout) inflate.findViewById(R.id.layout_content_container);
        this.A01 = (LinearLayout) inflate.findViewById(R.id.layout_error_container);
        this.A06 = inflate.findViewById(R.id.loading_spinner);
        WB0.A00(inflate.requireViewById(R.id.text_try_again), 4, this);
        this.A08 = requireArguments().getBoolean("extra_is_modal");
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            AnonymousClass7TF.A0G(inflate, R.id.text_message).setVisibility(DbW.A01(bundle2.getBoolean(AnonymousClass000.A00(3097)) ? 1 : 0));
            LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
            linearLayoutManager.A0v(true);
            RecyclerView A0I = DbT.A0I(inflate, R.id.variant_selector_recycler_view);
            this.A07 = A0I;
            if (A0I != null) {
                A0I.setLayoutManager(linearLayoutManager);
                RecyclerView recyclerView = this.A07;
                if (recyclerView != null) {
                    JTP.A1D(recyclerView, AnonymousClass7TG.A06(requireContext()), JTR.A05(requireContext()));
                    RecyclerView recyclerView2 = this.A07;
                    if (recyclerView2 != null) {
                        UA4 ua4 = this.A09;
                        recyclerView2.setAdapter(ua4);
                        ua4.A02 = new C19577Wc1(this);
                        AnonymousClass0fD.A09(-780266891, A022);
                        return inflate;
                    }
                }
            }
            0qQ.A0F("recyclerView");
            throw AnonymousClass00P.createAndThrow();
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(194049745, A022);
        throw A0y;
    }
}
