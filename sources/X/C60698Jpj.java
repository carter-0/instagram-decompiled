package X;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.util.Map;

/* renamed from: X.Jpj  reason: case insensitive filesystem */
public final class C60698Jpj extends C249703kE implements C348257y9 {
    public Medium A00;
    public final View A01;
    public final TextView A02;
    public final ImageView A03;

    public final void DLY(Medium medium, String str) {
    }

    public final boolean CWP(Medium medium) {
        0qQ.A0B(medium, 0);
        Medium medium2 = this.A00;
        if (medium2 != null) {
            return medium.equals(medium2);
        }
        0qQ.A0F("medium");
        throw AnonymousClass00P.createAndThrow();
    }

    public C60698Jpj(View view) {
        super(view);
        this.A01 = view;
        this.A03 = DbX.A0J(view, R.id.mk_folder_media);
        this.A02 = AnonymousClass7TG.A0R(view, R.id.mk_folder_title);
    }

    public final void DrQ(Bitmap bitmap, Medium medium, boolean z) {
        DbY.A1S(medium, bitmap);
        String valueOf = String.valueOf(medium.A05);
        Map map = AnonymousClass8XE.A00;
        BackgroundGradientColors backgroundGradientColors = (BackgroundGradientColors) map.get(valueOf);
        if (backgroundGradientColors == null) {
            backgroundGradientColors = 0oT.A01(bitmap, AnonymousClass05K.A00);
            map.put(valueOf, backgroundGradientColors);
        }
        medium.A0H = backgroundGradientColors;
        ImageView imageView = this.A03;
        imageView.setImageMatrix(AnonymousClass8XE.A03(medium.A07, bitmap.getWidth(), bitmap.getHeight(), imageView.getWidth(), imageView.getHeight()));
        imageView.setImageBitmap(bitmap);
    }
}
