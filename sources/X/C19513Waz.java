package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.ViewStub;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;

/* renamed from: X.Waz  reason: case insensitive filesystem */
public final class C19513Waz implements XC0 {
    public final int A00;
    public final C252063oV A01;
    public final IgImageButton A02;
    public final MediaFrameLayout A03;

    public C19513Waz(Context context, ViewStub viewStub, IgImageButton igImageButton, MediaFrameLayout mediaFrameLayout) {
        0qQ.A0B(viewStub, 4);
        this.A03 = mediaFrameLayout;
        this.A02 = igImageButton;
        this.A01 = 2b1.A00(viewStub);
        this.A00 = context.getColor(2Yu.A04(context));
    }

    public final /* synthetic */ void Eui(boolean z) {
    }

    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(this.A03);
    }

    public final RectF Beu() {
        return 0nA.A0F(this.A03);
    }

    public final void CLk() {
        this.A03.setVisibility(4);
    }

    public final void Ev3() {
        this.A03.setVisibility(0);
    }
}
