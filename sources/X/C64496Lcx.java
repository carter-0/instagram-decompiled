package X;

import android.graphics.Rect;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Lcx  reason: case insensitive filesystem */
public final class C64496Lcx implements MTO {
    public final /* synthetic */ LNo A00;
    public final /* synthetic */ MTO A01;

    public C64496Lcx(LNo lNo, MTO mto) {
        this.A00 = lNo;
        this.A01 = mto;
    }

    public final void D7V(Rect rect, ImageUrl imageUrl, String str) {
        this.A00.A00 = null;
        this.A01.D7V(rect, imageUrl, str);
    }

    public final void onFinish() {
        this.A01.onFinish();
    }
}
