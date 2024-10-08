package X;

import com.instagram.api.schemas.DirectMediaFallbackUrl;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.AdditionalCandidates;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.model.mediasize.GifUrlImpl;
import com.instagram.model.mediasize.ImageInfoImpl;
import com.instagram.model.mediasize.SpriteSheetInfoCandidates;
import com.instagram.model.mediasize.VideoVersion;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.Nw2  reason: case insensitive filesystem */
public abstract class C70024Nw2 {
    /* JADX WARNING: type inference failed for: r1v0, types: [X.1Xx, java.lang.Object] */
    public static final 1Xj A00(ImageUrl imageUrl, GifUrlImpl gifUrlImpl, String str, String str2) {
        int i;
        1iA r0;
        0qQ.A0B(imageUrl, 1);
        ? obj = new Object();
        obj.A5j = str2;
        obj.A6M = str;
        List list = null;
        if (str != null) {
            i = 1;
        } else {
            i = null;
        }
        obj.A4j = i;
        obj.EZf(new ImageInfoImpl((AdditionalCandidates) null, (SpriteSheetInfoCandidates) null, (SpriteSheetInfoCandidates) null, AnonymousClass7TE.A1I(new ExtendedImageUrl(imageUrl)), (List) null));
        if (gifUrlImpl != null) {
            list = AnonymousClass7TE.A1I(new VideoVersion((DirectMediaFallbackUrl) null, C66581MXm.A0p(gifUrlImpl.A02), (Integer) null, C66581MXm.A0p(gifUrlImpl.A03), (Long) null, (String) null, gifUrlImpl.A09));
        }
        obj.EqT(list);
        obj.A4n = Integer.valueOf(imageUrl.getHeight());
        obj.A4o = Integer.valueOf(imageUrl.getWidth());
        obj.A56 = null;
        if (gifUrlImpl != null) {
            r0 = 1iA.A0a;
        } else {
            r0 = 1iA.A0Q;
        }
        obj.A4m = Integer.valueOf(r0.A00);
        AtomicBoolean atomicBoolean = 1Xj.A0i;
        return 1Xv.A02(obj);
    }
}
