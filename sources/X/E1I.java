package X;

import android.content.ContentResolver;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.io.IOException;

public final class E1I extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "BirthdayMockDialogWithFullScreenOverlayFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return C273654mx.A00(562);
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, java.lang.Object] */
    public final void onViewCreated(View view, Bundle bundle) {
        ContentResolver contentResolver;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        ImageView A0G = DbS.A0G(view, R.id.full_screen_overlay_imageview);
        Context requireContext = requireContext();
        0qQ.A0A(A0G);
        0qQ.A0B(A0G, 1);
        Drawable drawable = requireContext.getDrawable(R.drawable.ig_birthday_celebrations_confetti_fullscreen_gradient_dogfooding);
        0qQ.A07(drawable);
        A0G.setImageDrawable(drawable);
        C240943Ng.A01(A0G.getDrawable());
        IgImageView findViewById = view.findViewById(R.id.mock_dialog_circular_imageview);
        Bundle requireArguments = requireArguments();
        if (!requireArguments.isEmpty()) {
            String A002 = AnonymousClass000.A00(2108);
            if (requireArguments.getString(A002) != null) {
                String string = requireArguments.getString(A002);
                C320236s2.A03(requireArguments, string, A002);
                Uri A09 = DbT.A09(string);
                try {
                    Context context = getContext();
                    if (context != null) {
                        contentResolver = context.getContentResolver();
                    } else {
                        contentResolver = null;
                    }
                    findViewById.setImageBitmap(MediaStore.Images.Media.getBitmap(contentResolver, A09));
                } catch (IOException unused) {
                    DbU.A1S(this, findViewById, DbX.A0l(AnonymousClass0t1.A01, this.A00));
                }
                ? r1 = (CircularImageView) view.findViewById(R.id.mock_dialog_overlay_circular_imageview);
                Context requireContext2 = requireContext();
                0qQ.A0A(r1);
                C240943Ng.A00(requireContext2, r1);
                C240943Ng.A01(r1.getDrawable());
                AnonymousClass0fU.A00(new FP9((Object) this, 53), view.findViewById(R.id.mock_dialog_primary_button));
            }
        }
        DbU.A1S(this, findViewById, DbX.A0l(AnonymousClass0t1.A01, this.A00));
        ? r12 = (CircularImageView) view.findViewById(R.id.mock_dialog_overlay_circular_imageview);
        Context requireContext22 = requireContext();
        0qQ.A0A(r12);
        C240943Ng.A00(requireContext22, r12);
        C240943Ng.A01(r12.getDrawable());
        AnonymousClass0fU.A00(new FP9((Object) this, 53), view.findViewById(R.id.mock_dialog_primary_button));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final void onCreate(Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1006644866);
        E1I.super.onCreate(bundle);
        AnonymousClass0fD.A09(-350308647, A02);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(-1280458042);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.mock_dialog_with_full_screen_overlay_fragment, viewGroup, false);
        AnonymousClass0fD.A09(1235981375, A02);
        return inflate;
    }
}
