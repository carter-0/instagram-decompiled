package X;

import android.graphics.Rect;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.Lcy  reason: case insensitive filesystem */
public final class C64497Lcy implements MTO {
    public final /* synthetic */ C64184LSr A00;
    public final /* synthetic */ Runnable A01;

    public C64497Lcy(C64184LSr lSr, Runnable runnable) {
        this.A00 = lSr;
        this.A01 = runnable;
    }

    public final void D7V(Rect rect, ImageUrl imageUrl, String str) {
        this.A00.A00 = new C63830L8l(rect, imageUrl, (String) null, str);
    }

    public final void onFinish() {
        this.A01.run();
    }
}
