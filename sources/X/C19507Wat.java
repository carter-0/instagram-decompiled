package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.Wat  reason: case insensitive filesystem */
public final class C19507Wat implements AnonymousClass3N3 {
    public final CircularImageView A00;
    public final GradientSpinner A01;

    public final boolean EtJ() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final RectF AeG() {
        return 0nA.A0F(this.A00);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final View AeY() {
        return this.A00;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final /* synthetic */ RectF AhX() {
        return 0nA.A0F(this.A00);
    }

    public final GradientSpinner Bkt() {
        return this.A01;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void CLE() {
        this.A00.setVisibility(4);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void Eu3(AnonymousClass0iw r3) {
        this.A00.setVisibility(0);
    }

    public C19507Wat(CircularImageView circularImageView, GradientSpinner gradientSpinner) {
        AnonymousClass7TG.A1O(circularImageView, gradientSpinner);
        this.A00 = circularImageView;
        this.A01 = gradientSpinner;
    }
}
