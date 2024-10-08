package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;

/* renamed from: X.4ne  reason: invalid class name and case insensitive filesystem */
public final class C274064ne {
    public C252063oV A00;
    public final int A01;
    public final int A02;
    public final View A03;

    public C274064ne(View view) {
        this.A03 = view;
        Context context = view.getContext();
        0qQ.A07(context);
        this.A01 = (int) 0nA.A04(context, 12);
        this.A02 = (int) 0nA.A04(context, 25);
        this.A00 = 2b1.A01(view.requireViewById(R.id.feed_carousel_screenshots_card_stub), false, false);
    }
}
