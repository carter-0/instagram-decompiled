package X;

import android.os.Bundle;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.arads.ArAdsUIModel;

public final class WUI implements C66445MRz {
    public final /* synthetic */ C17943ViY A00;
    public final /* synthetic */ ArAdsUIModel A01;

    public WUI(C17943ViY viY, ArAdsUIModel arAdsUIModel) {
        this.A00 = viY;
        this.A01 = arAdsUIModel;
    }

    public final void Dqr(TargetViewSizeProvider targetViewSizeProvider) {
        C17943ViY viY = this.A00;
        ArAdsUIModel arAdsUIModel = this.A01;
        Bundle bundle = new Bundle();
        bundle.putSerializable("camera_entry_point", viY.A09);
        bundle.putString("effect_id", viY.A0C);
        bundle.putString(AnonymousClass000.A00(4093), viY.A0D);
        bundle.putString("encoded_token", viY.A0B);
        bundle.putString("ad_impression_client_token", viY.A01);
        bundle.putParcelable("ads_ui_model", arAdsUIModel);
        bundle.putString("device_position", viY.A02);
        bundle.putString("media_id", viY.A03);
        bundle.putString(DatePickerDialogModule.ARG_MODE, viY.A04);
        bundle.putParcelable("ar_ads_target_view_size_provider", targetViewSizeProvider);
        AnonymousClass6W8 A02 = AnonymousClass6W8.A02(viY.A08, bundle, viY.A0A, TransparentModalActivity.class, "ar_ads_camera");
        Dbc.A0y(A02);
        11Z.A02(new C20182Wmg(viY, A02));
    }
}
