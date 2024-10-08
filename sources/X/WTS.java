package X;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.drawable.GradientDrawable;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import java.util.Map;

public final class WTS implements C231672s5 {
    public final UserSession A00;

    public WTS(UserSession userSession) {
        this.A00 = userSession;
    }

    public final void EF5(Bitmap bitmap, IgImageView igImageView) {
        String url;
        Integer num;
        AnonymousClass7TG.A1N(igImageView, bitmap);
        ImageUrl imageUrl = igImageView.A0C;
        if (imageUrl != null && (url = imageUrl.getUrl()) != null) {
            Map map = C18386Vqm.A00;
            if (!map.containsKey(url) || map.get(url) == null) {
                Matrix matrix = 0oT.A00;
                if (bitmap.getWidth() > bitmap.getHeight()) {
                    num = AnonymousClass05K.A00;
                } else {
                    num = AnonymousClass05K.A01;
                }
                BackgroundGradientColors A002 = 0oT.A00(bitmap, num);
                int i = (int) (0.7f * 255.0f);
                map.put(url, new BackgroundGradientColors(2eL.A06(A002.A01, i), 2eL.A06(A002.A00, i)));
            }
            Object obj = map.get(url);
            if (obj != null) {
                0oT.A02(GradientDrawable.Orientation.BL_TR, igImageView, (BackgroundGradientColors) obj);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }
}
