package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.6rE  reason: invalid class name and case insensitive filesystem */
public final class C319796rE extends C249703kE {
    public final View A00;
    public final ImageView A01;
    public final TextView A02;
    public final CircularImageView A03;
    public final C252063oV A04;
    public final Context A05;

    /* JADX WARNING: type inference failed for: r3v1, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C319796rE(View view) {
        super(view);
        int dimensionPixelSize;
        0qQ.A0B(view, 1);
        this.A00 = view;
        Context context = view.getContext();
        0qQ.A07(context);
        this.A05 = context;
        View findViewById = view.findViewById(R.id.inner_button_view);
        0qQ.A07(findViewById);
        ImageView imageView = (ImageView) findViewById;
        this.A01 = imageView;
        View findViewById2 = view.findViewById(R.id.button_background_view);
        0qQ.A07(findViewById2);
        ? r3 = (CircularImageView) findViewById2;
        this.A03 = r3;
        View findViewById3 = view.findViewById(R.id.label);
        0qQ.A07(findViewById3);
        this.A02 = (TextView) findViewById3;
        this.A04 = 2b1.A01(view.findViewById(R.id.notification), false, false);
        if (C61670oa.A02()) {
            int A0G = 2Yu.A0G(context, R.attr.reelsTrayAvatarInnerSize);
            int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.avatar_reel_ring_size_extra_large);
            Context context2 = imageView.getContext();
            0qQ.A07(context2);
            dimensionPixelSize = AnonymousClass0od.A05(context2, A0G, dimensionPixelSize2);
        } else {
            dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.avatar_reel_ring_size_extra_large);
        }
        0nA.A0V(r3, dimensionPixelSize);
        0nA.A0f(r3, dimensionPixelSize);
    }
}
