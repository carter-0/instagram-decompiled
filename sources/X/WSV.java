package X;

import android.text.SpannableStringBuilder;
import com.instagram.common.typedurl.ImageUrl;

public final class WSV implements C232262tL {
    public final SpannableStringBuilder A00;
    public final ImageUrl A01;
    public final ImageUrl A02;
    public final Integer A03;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01.toString();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        WSV wsv = (WSV) obj;
        0qQ.A0B(wsv, 0);
        if (!2PP.A00(this.A00, wsv.A00) || !0qQ.A0K(this.A01, wsv.A01)) {
            return false;
        }
        ImageUrl imageUrl = this.A02;
        ImageUrl imageUrl2 = wsv.A02;
        if (imageUrl == null) {
            if (imageUrl2 == null) {
                return true;
            }
            return false;
        } else if (imageUrl.equals(imageUrl2)) {
            return true;
        } else {
            return false;
        }
    }

    public WSV(SpannableStringBuilder spannableStringBuilder, ImageUrl imageUrl, ImageUrl imageUrl2, Integer num) {
        this.A00 = spannableStringBuilder;
        this.A01 = imageUrl;
        this.A02 = imageUrl2;
        this.A03 = num;
    }
}
