package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;
import com.instagram.android.R;

/* renamed from: X.K4p  reason: case insensitive filesystem */
public final class C61371K4p extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "GalleryCoverPhotoPickerFragment";
    public C60134JgF A00;
    public String A01;
    public KB9 A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);

    public final void configureActionBar(2da r8) {
        0qQ.A0B(r8, 0);
        KB9 kb9 = this.A02;
        if (kb9 == null) {
            0qQ.A0F("galleryCoverPhotoPickerController");
            throw AnonymousClass00P.createAndThrow();
        }
        Context context = kb9.A02;
        View ETg = ((2dZ) r8).ETg(R.layout.layout_folder_picker, 2Yu.A0G(context, R.attr.actionBarStartSpacing), 0, true);
        0qQ.A0C(ETg, "null cannot be cast to non-null type com.instagram.ui.widget.trianglespinner.TriangleSpinner");
        Spinner spinner = (Spinner) ETg;
        spinner.setDropDownVerticalOffset(-AnonymousClass3D4.A00(context));
        spinner.setAdapter(kb9.A03);
        spinner.setOnItemSelectedListener(kb9);
        AnonymousClass3JR A0K = DbS.A0K();
        A0K.A06 = R.drawable.instagram_x_pano_outline_24;
        A0K.A05 = 2131956164;
        A0K.A0G = LYD.A01(kb9, 1);
        A0K.A0P = true;
        r8.A8p(new AnonymousClass3Jb(A0K));
    }

    public final String getModuleName() {
        return "gallery_cover_photo_picker_fragment";
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A03);
    }

    public final void onCreate(Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(1802306694);
        C61371K4p.super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            this.A01 = bundle2.getString("ClipsConstants.ARG_CLIPS_SHARE_SHEET_CLIPS_SESSION_ID");
            this.A00 = DbW.A0F(this).A00(C60134JgF.class);
            KB9 kb9 = new KB9(this, AnonymousClass7TE.A0l(this.A03), this);
            this.A02 = kb9;
            registerLifecycleListener(kb9);
            AnonymousClass0fD.A09(-716897470, A022);
            return;
        }
        IllegalStateException A0y = AnonymousClass7TE.A0y();
        AnonymousClass0fD.A09(1371665786, A022);
        throw A0y;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1436287238);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_gallery_cover_photo_picker_fragment, false);
        AnonymousClass0fD.A09(367974193, A022);
        return A0D;
    }
}
