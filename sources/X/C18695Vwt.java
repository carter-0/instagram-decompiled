package X;

import android.content.Context;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.ImageInfo;
import com.instagram.user.model.Product;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.Vwt  reason: case insensitive filesystem */
public abstract class C18695Vwt {
    public static final Dc2 A00(Context context, MVB mvb, W0O w0o) {
        ExtendedImageUrl extendedImageUrl;
        ImageInfo imageInfo;
        0qQ.A0B(w0o, 1);
        C310336ap r2 = new C310336ap();
        DbS.A19(context, r2, 2131952453);
        r2.A0L = true;
        r2.A01 = CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
        DbW.A0q(context, r2, 2131973841);
        r2.A0A = mvb;
        Product A03 = w0o.A03();
        if (A03 == null || (imageInfo = A03.A08) == null) {
            extendedImageUrl = null;
        } else {
            extendedImageUrl = 1iI.A03(imageInfo);
        }
        if (!C253833rU.A02(extendedImageUrl)) {
            r2.A09 = extendedImageUrl;
            r2.A03();
        }
        Dc2 A00 = r2.A00();
        1xC.A01.A00(new AnonymousClass3GP(A00));
        return A00;
    }

    public static final void A01(Context context) {
        A02(AnonymousClass7TE.A16(context, 2131952357), 0, "add_to_cart_network_error");
    }

    public static final void A02(String str, int i, String str2) {
        DbY.A1S(str, str2);
        C310336ap A0X = DbV.A0X();
        A0X.A0H = str2;
        A0X.A0D = str;
        A0X.A02 = i;
        DbY.A1K(1xC.A01, A0X);
    }
}
