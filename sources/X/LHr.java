package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

public abstract class LHr {
    public static void A01(AnonymousClass0iw r4, C62932Kok kok, AnonymousClass3Q2 r6, float f) {
        String str;
        MediaFrameLayout mediaFrameLayout = kok.A03;
        mediaFrameLayout.A00 = f;
        String str2 = r6.A33;
        if (str2 != null) {
            kok.A02.setUrl(JTQ.A0G(str2), r4);
        }
        BrandedContentProjectMetadata brandedContentProjectMetadata = r6.A0t;
        boolean z = true;
        if (brandedContentProjectMetadata == null || (str = brandedContentProjectMetadata.A05) == null || str.length() != 0) {
            z = false;
        }
        ViewGroup viewGroup = kok.A00;
        if (z) {
            viewGroup.setVisibility(0);
            kok.A01.setText(2131964389);
            return;
        }
        viewGroup.setVisibility(8);
        U02 u02 = new U02();
        u02.A00 = 50.0f;
        mediaFrameLayout.setOnTouchListener(u02);
        u02.A02 = new C64928LkT((View.OnClickListener) null, mediaFrameLayout, (View) null);
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.Object, X.Kok] */
    public static View A00(ViewGroup viewGroup) {
        View A0C = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.layout_photo_preview);
        ? obj = new Object();
        DbX.A1B(A0C, R.id.preview_image_spinner);
        obj.A03 = (MediaFrameLayout) A0C.requireViewById(R.id.preview_image_frame);
        obj.A02 = DbT.A0b(A0C, R.id.preview_image);
        obj.A00 = DbU.A0C(A0C, R.id.metadata_cta_view);
        obj.A01 = DbU.A0G(A0C, R.id.cta_text);
        A0C.setTag(obj);
        return A0C;
    }
}
