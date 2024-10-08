package X;

import android.graphics.RectF;
import android.view.View;
import com.instagram.android.R;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;

/* renamed from: X.5BC  reason: invalid class name */
public final class AnonymousClass5BC extends C249703kE implements AnonymousClass3N2 {
    public final AnonymousClass5BD A00;
    public final AnonymousClass3N5 A01;

    public final void CI9(float f) {
    }

    public final boolean EtJ() {
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.ui.widget.imageview.PulsingMultiImageView, android.view.View] */
    /* renamed from: AeG */
    public final RectF AhX() {
        return 0nA.A0F(this.A00.A0D);
    }

    public final View AeH() {
        return this.A01.A02.A00();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [com.instagram.ui.widget.imageview.PulsingMultiImageView, android.view.View] */
    public final View AeY() {
        return this.A00.A0D;
    }

    public final View BkN() {
        return this.itemView;
    }

    public final String Bkc() {
        return this.A01.A02.A01;
    }

    public final GradientSpinner Bkt() {
        return this.A00.A0B;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.ui.widget.imageview.PulsingMultiImageView, android.view.View] */
    public final void CLE() {
        this.A00.A0D.setVisibility(4);
    }

    public final void Ei5(AnonymousClass6VJ r2) {
        this.A01.A01 = r2;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.ui.widget.imageview.PulsingMultiImageView, android.view.View] */
    public final void Eu3(AnonymousClass0iw r3) {
        this.A00.A0D.setVisibility(0);
    }

    public AnonymousClass5BC(View view) {
        super(view);
        this.A01 = new AnonymousClass3N5(view);
        this.A00 = new AnonymousClass5BD(view.requireViewById(R.id.avatar_container));
    }
}
