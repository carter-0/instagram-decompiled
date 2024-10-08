package X;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.mediakit.config.MediaKitGalleryFoldersSheetConfig;

/* renamed from: X.K3x  reason: case insensitive filesystem */
public final class C61355K3x extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "MediaKitGalleryFoldersSheetFragment";
    public RecyclerView A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Parcelable parcelable = requireArguments().getParcelable("mk_gallery_folders_argument");
        if (parcelable != null) {
            MediaKitGalleryFoldersSheetConfig mediaKitGalleryFoldersSheetConfig = (MediaKitGalleryFoldersSheetConfig) parcelable;
            FragmentActivity requireActivity = requireActivity();
            AnonymousClass0eM r0 = this.A01;
            r0.getValue();
            int A012 = AnonymousClass8XE.A01(requireActivity);
            C355608Qq r6 = new C355608Qq(requireActivity(), AnonymousClass7TE.A0l(r0), AnonymousClass05K.A00, A012, A012, false);
            RecyclerView A0K = DbX.A0K(view);
            this.A00 = A0K;
            if (A0K != null) {
                A0K.A11(new C60465Jlx(requireContext().getColor(R.color.igds_quick_send_divider_background), AnonymousClass7TG.A02(requireContext())));
                RecyclerView recyclerView = this.A00;
                if (recyclerView != null) {
                    recyclerView.setAdapter(new C60390Jkj(r6, mediaKitGalleryFoldersSheetConfig));
                    return;
                }
            }
            0qQ.A0F("recyclerView");
            throw AnonymousClass00P.createAndThrow();
        }
        throw AnonymousClass7TE.A0z("List of Folder was expected but was null");
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(456696010);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.media_kit_simple_recycler_fragment, viewGroup, false);
        AnonymousClass0fD.A09(924407043, A02);
        return inflate;
    }
}
