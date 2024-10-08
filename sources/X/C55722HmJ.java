package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.instagram.android.R;

/* renamed from: X.HmJ  reason: case insensitive filesystem */
public final class C55722HmJ {
    public AnonymousClass6NS A00;
    public final FrameLayout A01;
    public final C273694n2 A02;

    public C55722HmJ(ViewGroup viewGroup, View view) {
        Context context = viewGroup.getContext();
        0qQ.A0B(context, 1);
        C273694n2 r1 = new C273694n2(context);
        this.A02 = r1;
        FrameLayout frameLayout = (FrameLayout) view.requireViewById(R.id.netego_bloks_view);
        this.A01 = frameLayout;
        frameLayout.addView(r1);
    }
}
