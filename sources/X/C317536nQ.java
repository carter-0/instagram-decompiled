package X;

import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.6nQ  reason: invalid class name and case insensitive filesystem */
public final class C317536nQ {
    public final View A00;
    public final View A01;
    public final ImageView A02;

    public C317536nQ(C71662eb r3) {
        View A012 = r3.A01();
        0qQ.A07(A012);
        this.A01 = A012.requireViewById(R.id.question_sticker_container_view);
        this.A02 = (ImageView) A012.requireViewById(R.id.question_sticker_view);
        this.A00 = A012.requireViewById(R.id.question_sticker_response_count_view);
    }
}
