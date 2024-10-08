package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.Wau  reason: case insensitive filesystem */
public final class C19508Wau implements AnonymousClass3N3 {
    public final RectF A00;
    public final CircularImageView A01;
    public final GradientSpinner A02;
    public final /* synthetic */ C67681MsJ A03;

    public final boolean EtJ() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public C19508Wau(C67681MsJ msJ) {
        this.A03 = msJ;
        ? r0 = msJ.A03;
        this.A01 = r0;
        this.A00 = 0nA.A0F(r0);
        this.A02 = msJ.A04;
    }

    public final RectF AeG() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final /* bridge */ /* synthetic */ View AeY() {
        return this.A01;
    }

    public final /* synthetic */ RectF AhX() {
        return this.A00;
    }

    public final GradientSpinner Bkt() {
        return this.A02;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void CLE() {
        this.A03.A03.setVisibility(4);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void Eu3(AnonymousClass0iw r3) {
        this.A03.A03.setVisibility(0);
    }
}
