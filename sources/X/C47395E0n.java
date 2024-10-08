package X;

import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.android.R;
import com.instagram.igds.components.headline.IgdsHeadline;

/* renamed from: X.E0n  reason: case insensitive filesystem */
public final class C47395E0n extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "ContextualPromoBottomSheetContentFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final String getModuleName() {
        return "BottomsheetPromoContentFragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Bundle requireArguments = requireArguments();
        String string = requireArguments.getString(DialogModule.KEY_TITLE);
        String string2 = requireArguments.getString("body");
        Bitmap bitmap = (Bitmap) requireArguments.getParcelable("illustration");
        IgdsHeadline igdsHeadline = (IgdsHeadline) AnonymousClass7TF.A0F(view, R.id.promo_headline);
        if (string != null) {
            igdsHeadline.setHeadline((CharSequence) string);
        }
        if (string2 != null) {
            igdsHeadline.setBody((CharSequence) string2);
        }
        if (bitmap != null) {
            igdsHeadline.setCircularImageBitmap(bitmap);
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(473729015);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_bottomsheet_promo_content_fragment, false);
        AnonymousClass0fD.A09(-469354566, A02);
        return A0D;
    }
}
