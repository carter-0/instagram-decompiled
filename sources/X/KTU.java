package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.igtv.widget.TitleDescriptionEditor;

public final class KTU extends K6u {
    public static final String __redex_internal_original_name = "IGTVUploadEditSeriesFragment";
    public String A00;
    public String A01;
    public String A02;
    public final AnonymousClass0eM A03 = C66299MMi.A01(this, 14);

    public final String getModuleName() {
        return "igtv_upload_edit_series_fragment";
    }

    public final boolean isOrganicEligible() {
        return true;
    }

    public final boolean isSponsoredEligible() {
        return false;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        String str2 = this.A01;
        if (str2 == null) {
            str = "originalTitle";
        } else {
            TitleDescriptionEditor titleDescriptionEditor = this.A03;
            if (titleDescriptionEditor != null) {
                titleDescriptionEditor.setTitleText(str2);
                String str3 = this.A00;
                if (str3 == null) {
                    str = "originalDescription";
                } else {
                    TitleDescriptionEditor titleDescriptionEditor2 = this.A03;
                    if (titleDescriptionEditor2 != null) {
                        titleDescriptionEditor2.setDescriptionText(str3);
                        return;
                    }
                }
            }
            str = "titleDescriptionEditor";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(991018162);
        super.onCreate(bundle);
        Bundle requireArguments = requireArguments();
        this.A02 = requireArguments.getString("igtv_series_id_arg", "");
        this.A01 = requireArguments.getString("igtv_series_name_arg", "");
        this.A00 = requireArguments.getString("igtv_series_description_arg", "");
        AnonymousClass0fD.A09(842712912, A022);
    }
}
