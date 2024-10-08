package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.8q1  reason: invalid class name and case insensitive filesystem */
public final class C366998q1 implements C2365734g {
    public final /* synthetic */ C355048Oj A00;

    public C366998q1(C355048Oj r1) {
        this.A00 = r1;
    }

    public final void DKS(View view) {
        0qQ.A0B(view, 0);
        View requireViewById = view.requireViewById(R.id.post_capture_camera_genai_expand_button);
        0qQ.A0C(requireViewById, "null cannot be cast to non-null type android.widget.ImageView");
        ImageView imageView = (ImageView) requireViewById;
        imageView.setImageResource(R.drawable.instagram_expand_pano_outline_24);
        AnonymousClass3NG r2 = new AnonymousClass3NG(imageView);
        r2.A04 = new C386229kG(this.A00);
        r2.A05 = AnonymousClass05K.A01;
        r2.A00();
    }
}
