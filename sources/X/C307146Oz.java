package X;

import android.view.View;
import com.instagram.android.R;

/* renamed from: X.6Oz  reason: invalid class name and case insensitive filesystem */
public final class C307146Oz {
    public AnonymousClass6PD A00;
    public final View A01;
    public final AnonymousClass6P6 A02;
    public final AnonymousClass6P0 A03;
    public final AnonymousClass6P4 A04;
    public final AnonymousClass6P2 A05;

    public C307146Oz(View view) {
        this.A01 = view;
        this.A03 = new AnonymousClass6P0(2b1.A01(view.requireViewById(R.id.popularity_proof_stub), false, false), AnonymousClass05K.A01);
        this.A05 = new AnonymousClass6P2(2b1.A01(view.requireViewById(R.id.product_thumbnail_stub), false, false));
        this.A04 = new AnonymousClass6P4(2b1.A01(view.requireViewById(R.id.product_pill_stub), false, false));
        this.A02 = new AnonymousClass6P6(2b1.A01(view.requireViewById(R.id.afi_footer_stub), false, false));
    }
}
