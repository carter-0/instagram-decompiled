package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.instagram.common.session.UserSession;
import com.instagram.common.util.gradient.BackgroundGradientColors;
import com.instagram.creation.capture.quickcapture.freetransform.transformmatrix.TransformMatrixConfig;
import com.instagram.filterkit.filter.VideoFilter;
import com.instagram.model.filterkit.TextureAsset;
import java.util.ArrayList;

public abstract class Ky1 {
    /* JADX WARNING: type inference failed for: r9v0, types: [X.VNI, java.lang.Object] */
    public static final C10497RtC A00(Context context, UserSession userSession, AnonymousClass3Q2 r13) {
        Bitmap bitmap;
        String str = r13.A2Q;
        VideoFilter videoFilter = null;
        if (str != null) {
            bitmap = BitmapFactory.decodeFile(str);
        } else {
            bitmap = null;
        }
        AnonymousClass3QG r10 = r13.A1i;
        BackgroundGradientColors backgroundGradientColors = r13.A14;
        TransformMatrixConfig transformMatrixConfig = r13.A16;
        ? obj = new Object();
        obj.A00 = 0qQ.A0K(r13.A2W, "front");
        VideoFilter A00 = C17123VIt.A00(context, bitmap, userSession, backgroundGradientColors, transformMatrixConfig, obj, r10);
        String str2 = r13.A2k;
        if (!(str2 == null || str2.length() == 0)) {
            TextureAsset textureAsset = new TextureAsset("image_overlay", str2);
            ArrayList A1C = AnonymousClass7TE.A1C();
            A1C.add(textureAsset);
            videoFilter = new VideoFilter(context, A1C);
        }
        return new C10497RtC(A00, videoFilter);
    }
}
