package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.recyclerview.ViewModelListUpdate;
import com.instagram.mediakit.config.MediaKitSectionActionSheetConfig;

public final class K4C extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "MediaKitSectionActionSheetFragment";
    public RecyclerView A00;
    public MediaKitSectionActionSheetConfig A01;
    public final AnonymousClass0eM A02 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String str;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        this.A00 = DbX.A0K(view);
        AnonymousClass2t9 A0U = DbU.A0U(DbV.A0S(this), new C47760EFu(this));
        RecyclerView recyclerView = this.A00;
        if (recyclerView == null) {
            str = "recyclerView";
        } else {
            recyclerView.setAdapter(A0U);
            ViewModelListUpdate A0R = DbS.A0R();
            MediaKitSectionActionSheetConfig mediaKitSectionActionSheetConfig = this.A01;
            if (mediaKitSectionActionSheetConfig == null) {
                str = "sheetConfig";
            } else {
                A0R.A01(mediaKitSectionActionSheetConfig.A00);
                A0U.A05(A0R);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A02);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1077894163);
        K4C.super.onCreate(bundle);
        Parcelable parcelable = requireArguments().getParcelable("mk_section_action_sheet_config");
        if (parcelable != null) {
            this.A01 = (MediaKitSectionActionSheetConfig) parcelable;
            AnonymousClass0fD.A09(-725451622, A022);
            return;
        }
        IllegalStateException A0z = AnonymousClass7TE.A0z("MediaKitSectionActionSheetConfig expected but was null");
        AnonymousClass0fD.A09(-1841301458, A022);
        throw A0z;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-83008321);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.media_kit_simple_recycler_fragment, false);
        AnonymousClass0fD.A09(-1834072066, A022);
        return A0D;
    }
}
