package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.6N9  reason: invalid class name */
public final class AnonymousClass6N9 {
    public final View A00;
    public final FrameLayout A01;
    public final TextView A02;
    public final C273694n2 A03;

    public AnonymousClass6N9(ViewStub viewStub) {
        0qQ.A0B(viewStub, 1);
        View inflate = viewStub.inflate();
        0qQ.A07(inflate);
        this.A00 = inflate;
        View requireViewById = inflate.requireViewById(R.id.netego_bloks_title);
        0qQ.A07(requireViewById);
        this.A02 = (TextView) requireViewById;
        View requireViewById2 = inflate.requireViewById(R.id.netego_bloks_view);
        0qQ.A07(requireViewById2);
        FrameLayout frameLayout = (FrameLayout) requireViewById2;
        this.A01 = frameLayout;
        Context context = frameLayout.getContext();
        0qQ.A07(context);
        C273694n2 r0 = new C273694n2(context);
        this.A03 = r0;
        frameLayout.addView(r0);
    }
}
