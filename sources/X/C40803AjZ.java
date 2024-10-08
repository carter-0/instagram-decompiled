package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.TextureView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerFrameLayout;
import java.util.List;

/* renamed from: X.AjZ  reason: case insensitive filesystem */
public final class C40803AjZ implements Runnable {
    public final /* synthetic */ AnonymousClass8FL A00;

    public C40803AjZ(AnonymousClass8FL r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass8FL r1 = this.A00;
        TextureView textureView = r1.A0D;
        int width = textureView.getWidth();
        int height = textureView.getHeight();
        if (r1.A04 == null) {
            r1.A04 = new AnonymousClass9WQ(width, height);
            Rect A0W = AnonymousClass7TE.A0W();
            RoundedCornerFrameLayout roundedCornerFrameLayout = r1.A0N;
            roundedCornerFrameLayout.getDrawingRect(A0W);
            C3019160o.A01(roundedCornerFrameLayout).offsetDescendantRectToMyCoords(roundedCornerFrameLayout, A0W);
            C16336Ut6 ut6 = new C16336Ut6(A0W);
            r1.A07 = ut6;
            C310416b1 r4 = new C310416b1((AnonymousClass8BH) ut6, (AnonymousClass8DA) null, r1.A0M, AnonymousClass05K.A00, (Integer) null, (Integer) null, (Object) null, (String) null, (List) null, 0.07f, 1.75f, -1.0f, -1.0f, -1.0f, 0, false, false, true, false, true, false, true, true, true, true, true, true, false, false);
            Drawable drawable = r1.A04;
            if (drawable != null) {
                r1.A0J.A0f(drawable, r1.A0E, r4, (String) null, AnonymousClass7TE.A1I(""));
            }
            r1.A02();
        }
        RoundedCornerFrameLayout roundedCornerFrameLayout2 = r1.A0N;
        roundedCornerFrameLayout2.setVisibility(0);
        if (!(r1.A0H.A08.A00 instanceof AnonymousClass80O)) {
            textureView.setVisibility(0);
        } else {
            roundedCornerFrameLayout2.setScaleX(r1.A03);
            roundedCornerFrameLayout2.setScaleY(r1.A03);
            AnonymousClass8FL.A00(r1);
        }
        C294975nL A01 = C294975nL.A01(roundedCornerFrameLayout2, 0);
        A01.A0G();
        A01.A0I(1.0f);
        A01.A0H();
    }
}
