package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.igtv.uploadflow.IGTVUploadActivity;

public final class KTV extends K6u implements AnonymousClass4DU {
    public static final String __redex_internal_original_name = "IGTVUploadCreateSeriesFragment";
    public boolean A00 = true;
    public boolean A01;
    public FragmentActivity A02;
    public final AnonymousClass0eM A03 = C66299MMi.A01(this, 11);
    public final AnonymousClass0eM A04 = C66299MMi.A00(this, new C66299MMi(this, 12), new C73666Phf(18, (Object) null, this), DbS.A0z(C60266JiN.class), 13);

    public final String getModuleName() {
        return "igtv_upload_create_series_fragment";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [java.lang.Object, X.LZi] */
    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        C63064Kqt.A00(this, new Object());
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1253495361);
        super.onCreate(bundle);
        this.A00 = getActivity() instanceof IGTVUploadActivity;
        this.A02 = requireActivity();
        AnonymousClass0fD.A09(-1376484923, A022);
    }
}
