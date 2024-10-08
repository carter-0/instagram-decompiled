package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.maps.ui.IgStaticMapView;
import com.instagram.ui.igeditseekbar.IgEditSeekBar;
import java.util.List;

public final class UYz extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "PromoteCreateAudienceLocationsLocalFragmentV2";
    public View A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public WGU A04;
    public IgSimpleImageView A05;
    public IgSimpleImageView A06;
    public IgdsSwitch A07;
    public IgStaticMapView A08;
    public final View.OnClickListener A09 = new WBB(this, 14);
    public final View.OnClickListener A0A = new WBB(this, 15);
    public final X3O A0B = new C19169WOb(this);
    public final AnonymousClass0eM A0C = C227642jf.A02(this);
    public final AnonymousClass0eM A0D = new C227862kA(new C20702WxZ(this, 13), new C20702WxZ(this, 14), new C41566AwY(23, (Object) null, this), new 0Yh(U92.class));

    public final String getModuleName() {
        return "promote_create_audience_locations_local";
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.07Z, androidx.fragment.app.Fragment, java.lang.Object, X.UYz, X.4DH] */
    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A08 = (IgStaticMapView) view.requireViewById(R.id.map_view);
        IgdsSwitch igdsSwitch = (IgdsSwitch) view.requireViewById(R.id.switch_button);
        this.A07 = igdsSwitch;
        if (igdsSwitch == null) {
            str = "useCurrentLocationSwitch";
        } else {
            igdsSwitch.A07 = new WYN(this, 6);
            View requireViewById = view.requireViewById(R.id.custom_address_entry);
            this.A00 = requireViewById;
            if (requireViewById == null) {
                str = "customAddressEntry";
            } else {
                AnonymousClass0fU.A00(this.A0A, requireViewById);
                this.A03 = DbU.A0G(view, R.id.custom_address_title);
                this.A01 = DbU.A0G(view, R.id.custom_address);
                this.A02 = DbU.A0G(view, R.id.custom_address_edit_button);
                this.A05 = (IgSimpleImageView) view.requireViewById(R.id.custom_address_chevron_icon);
                IgSimpleImageView igSimpleImageView = (IgSimpleImageView) view.requireViewById(R.id.custom_address_cross_icon);
                this.A06 = igSimpleImageView;
                if (igSimpleImageView == null) {
                    str = "customAddressCrossIcon";
                } else {
                    AnonymousClass0fU.A00(this.A09, igSimpleImageView);
                    int A062 = 0nA.A06(requireContext());
                    int A042 = JTO.A04((float) A062, 1.5f);
                    IgStaticMapView igStaticMapView = this.A08;
                    if (igStaticMapView == null) {
                        str = "mapView";
                    } else {
                        JTP.A14(igStaticMapView, A062, A042);
                        Context A0S = AnonymousClass7TE.A0S(view);
                        C17567VaL vaL = new C17567VaL(view, "radius_slider");
                        List A032 = W2x.A03(requireContext());
                        int i = ((U92) this.A0D.getValue()).A0A().A01;
                        VMV vmv = new VMV(this);
                        IgEditSeekBar igEditSeekBar = vaL.A03;
                        igEditSeekBar.setActiveColor(AnonymousClass7TF.A03(A0S, R.attr.igds_color_controls));
                        igEditSeekBar.setShouldOverrideVisualValue(true);
                        igEditSeekBar.setOverrideVisualValueList(A032);
                        C14724U4o.A00(igEditSeekBar, W2x.A02, i);
                        igEditSeekBar.setOnSliderChangeListener(new C65761LzF(vmv, 0));
                        MG7.A01(this, AnonymousClass07a.A00(this), 11);
                        return;
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A0C);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-705043533);
        UYz.super.onCreate(bundle);
        this.A04 = JTU.A0D(this.A0C);
        AnonymousClass0fD.A09(-1394587323, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1563700551);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.promote_create_audience_locations_local_view, viewGroup, false);
        AnonymousClass0fD.A09(-1581145658, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1601089790);
        super.onDestroyView();
        AnonymousClass0fD.A09(-2135580422, A022);
    }
}
