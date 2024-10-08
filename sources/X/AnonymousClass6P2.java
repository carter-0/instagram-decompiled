package X;

import android.view.View;
import android.widget.TextView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;

/* renamed from: X.6P2  reason: invalid class name */
public final class AnonymousClass6P2 {
    public View A00;
    public View A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public RoundedCornerImageView A05;
    public RoundedCornerImageView A06;
    public RoundedCornerImageView A07;
    public final C252063oV A08;

    /* JADX WARNING: type inference failed for: r0v2, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v6, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: type inference failed for: r0v8, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    public final void A00() {
        String str;
        this.A08.getView().setVisibility(8);
        ? r0 = this.A07;
        if (r0 != 0) {
            r0.setVisibility(8);
            ? r02 = this.A06;
            if (r02 != 0) {
                r02.setVisibility(8);
                ? r03 = this.A05;
                if (r03 != 0) {
                    r03.setVisibility(8);
                    return;
                }
                str = "productImage";
            } else {
                str = "productImageBottom";
            }
        } else {
            str = "productImageTop";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public AnonymousClass6P2(C252063oV r2) {
        this.A08 = r2;
        r2.EeU(new AnonymousClass6P3(this));
    }
}
