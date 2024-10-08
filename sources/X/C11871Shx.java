package X;

import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.util.List;

/* renamed from: X.Shx  reason: case insensitive filesystem */
public final class C11871Shx implements C13691Tf9 {
    public final C10366Rr3 A00;

    public final /* bridge */ /* synthetic */ C13796ThF ANe(C11856Shi shi, Object obj, int i, int i2) {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource(SL7.A00((InputStream) obj)), new SVd(shi, i, i2));
        if (decodeDrawable instanceof AnimatedImageDrawable) {
            return new C11907Sig((AnimatedImageDrawable) decodeDrawable);
        }
        throw JTO.A0u(AnonymousClass7TG.A0m(decodeDrawable, "Received unexpected drawable type for animated webp, failing: ", AnonymousClass7TE.A1A()));
    }

    public final /* bridge */ /* synthetic */ boolean CJU(C11856Shi shi, Object obj) {
        C10366Rr3 rr3 = this.A00;
        List list = rr3.A01;
        return AnonymousClass7TF.A1W(SKE.A01(rr3.A00, (InputStream) obj, list), ImageHeaderParser$ImageType.ANIMATED_WEBP);
    }

    public C11871Shx(C10366Rr3 rr3) {
        this.A00 = rr3;
    }
}
