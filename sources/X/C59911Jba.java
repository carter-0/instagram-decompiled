package X;

import com.instagram.api.schemas.MusicProduct;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.constants.ShareType;
import java.util.List;

/* renamed from: X.Jba  reason: case insensitive filesystem */
public abstract /* synthetic */ class C59911Jba {
    public static boolean A00(AnonymousClass3Q2 r2) {
        return AnonymousClass7TF.A1V(C59923Jbm.A00.A02(r2.A4b));
    }

    public static boolean A01(AnonymousClass3Q2 r2) {
        boolean z;
        List list;
        String str = r2.A2k;
        if (str != null) {
            z = JTQ.A1Z(str);
        } else {
            z = false;
        }
        if (z || ((list = r2.A4a) != null && list.size() > 0)) {
            return true;
        }
        return false;
    }

    public static boolean A02(AnonymousClass3Q2 r3) {
        MusicOverlayStickerModel A02 = C59923Jbm.A00.A02(r3.A4b);
        if (A02 == null) {
            return false;
        }
        MusicProduct musicProduct = A02.A02;
        if (musicProduct != null && musicProduct != MusicProduct.CLIPS_CAMERA_FORMAT_V2 && !C14245TsS.A01(musicProduct)) {
            return true;
        }
        if (r3.A0E() == ShareType.CLIPS || !r3.A5j) {
            return false;
        }
        return true;
    }
}
