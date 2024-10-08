package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import java.io.File;

public final class K5Q extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "CutoutStickerCreationFragment";
    public C64965Ll4 A00;
    public Integer A01 = AnonymousClass05K.A02;
    public boolean A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final String getModuleName() {
        return "cutout_sticker_creation";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        String string;
        String str;
        boolean z;
        View view2 = view;
        0qQ.A0B(view2, 0);
        super.onViewCreated(view2, bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null && (string = bundle2.getString("file_path")) != null) {
            File A0t = AnonymousClass7TE.A0t(string);
            0qQ.A0B(A0t, 0);
            Medium A032 = C282665Eg.A03(A0t, 1, 0);
            Bundle bundle3 = this.mArguments;
            String str2 = null;
            if (bundle3 != null) {
                str = bundle3.getString(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            } else {
                str = null;
            }
            this.A01 = C63130Kry.A00(str);
            Bundle bundle4 = this.mArguments;
            if (bundle4 != null) {
                z = bundle4.getBoolean("from_create_btn");
            } else {
                z = false;
            }
            this.A02 = z;
            if (z) {
                DbT.A16(requireContext(), view2, 2Yu.A0H(requireContext(), R.attr.igds_color_media_background));
            }
            FragmentActivity requireActivity = requireActivity();
            ViewStub viewStub = (ViewStub) AnonymousClass7TF.A0G(view2, R.id.cutout_sticker_photo_creation_stub);
            ViewStub viewStub2 = (ViewStub) AnonymousClass7TF.A0G(view2, R.id.cutout_sticker_loading_overlay_view_stub);
            AnonymousClass0eM r3 = this.A03;
            UserSession A0l = AnonymousClass7TE.A0l(r3);
            requireContext().getColor(R.color.black_30_transparent);
            C64957Lkw lkw = new C64957Lkw(requireActivity(), AnonymousClass7TE.A0l(r3), this);
            FragmentActivity requireActivity2 = requireActivity();
            Bundle bundle5 = this.mArguments;
            if (bundle5 != null) {
                str2 = bundle5.getString("source_media_id");
            }
            C64965Ll4 ll4 = new C64965Ll4(requireActivity2, view2, viewStub, viewStub2, this, requireActivity, this, A0l, lkw, AnonymousClass05K.A00, this.A01, str2);
            this.A00 = ll4;
            ll4.A04 = new C61734KJz(A032);
            ll4.E0h();
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final boolean onBackPressed() {
        C64965Ll4 ll4 = this.A00;
        if (ll4 != null) {
            return ll4.CII();
        }
        0qQ.A0F("photoStickerCreationController");
        throw AnonymousClass00P.createAndThrow();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1641574163);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.cutout_sticker_photo_creation_fragment, viewGroup, false);
        AnonymousClass0fD.A09(737112600, A022);
        return inflate;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(-333334947);
        super.onDestroyView();
        C64965Ll4 ll4 = this.A00;
        if (ll4 == null) {
            0qQ.A0F("photoStickerCreationController");
            throw AnonymousClass00P.createAndThrow();
        }
        ll4.close();
        AnonymousClass0fD.A09(-28729459, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(498882009);
        super.onResume();
        JTU.A0p(this, 8);
        C317756nm.A03(requireActivity(), (Fragment) null, AnonymousClass7TE.A0l(this.A03), false, false);
        AnonymousClass0fD.A09(-1173345681, A022);
    }

    public final void onStop() {
        int A022 = AnonymousClass0fD.A02(-1291322818);
        K5Q.super.onStop();
        JTU.A0p(this, 0);
        C317756nm.A02(requireActivity(), this, AnonymousClass7TE.A0l(this.A03), false, false);
        AnonymousClass0fD.A09(-816133752, A022);
    }
}
