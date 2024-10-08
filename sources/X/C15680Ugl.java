package X;

import android.content.Context;
import android.view.View;
import android.view.animation.Animation;
import android.widget.FrameLayout;

/* renamed from: X.Ugl  reason: case insensitive filesystem */
public final class C15680Ugl extends C252233om {
    public final AnonymousClass357 A00;

    public final void onDestroyView() {
        AnonymousClass357 r2 = this.A00;
        View view = r2.A02;
        if (view != null) {
            view.setOnClickListener((View.OnClickListener) null);
        }
        r2.A02 = null;
    }

    public C15680Ugl(Context context, View.OnClickListener onClickListener, FrameLayout frameLayout, float f, int i) {
        View.OnClickListener onClickListener2 = onClickListener;
        AnonymousClass357 r2 = new AnonymousClass357(context, onClickListener2, context.getString(i), -1, DbW.A1X(context));
        this.A00 = r2;
        if (r2.A02 == null) {
            r2.A06(frameLayout);
        }
        this.A00.A05((Animation) null);
        View view = r2.A02;
        if (view != null) {
            view.setAlpha(f);
        }
    }
}
