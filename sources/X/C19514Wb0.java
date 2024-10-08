package X;

import android.graphics.RectF;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.Wb0  reason: case insensitive filesystem */
public final class C19514Wb0 implements XC0 {
    public final ImageView A00;
    public final VWP A01;
    public final C17533VZm A02;
    public final VYU A03;

    public final /* synthetic */ void Eui(boolean z) {
    }

    /* renamed from: Beu */
    public final RectF AhX() {
        return 0nA.A0F(this.A02.A01);
    }

    public final void CLk() {
        this.A02.A01.setVisibility(4);
    }

    public final void Ev3() {
        this.A02.A01.setVisibility(0);
    }

    public C19514Wb0(View view, int i) {
        this.A02 = new C17533VZm(view, i);
        this.A01 = new VWP(view, R.id.container);
        this.A00 = DbX.A0J(view, R.id.featured_product_overflow_button);
        this.A03 = new VYU(DbX.A0I(view, R.id.hero_carousel_media_overlay));
    }
}
