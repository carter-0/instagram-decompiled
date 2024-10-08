package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.common.collect.ImmutableMap;
import com.instagram.android.R;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.Dhd  reason: case insensitive filesystem */
public final class C46597Dhd implements Runnable {
    public final /* synthetic */ AnonymousClass3M3 A00;

    public C46597Dhd(AnonymousClass3M3 r1) {
        this.A00 = r1;
    }

    public final void run() {
        AnonymousClass3M3 r3 = this.A00;
        ImmutableMap immutableMap = AnonymousClass3M3.A0U;
        if (r3.mView != null && r3.getContext() != null) {
            View view = r3.A00;
            if (view == null || view.getParent() != null) {
                Integer num = r3.A0A.A0N;
                if (num != null) {
                    View A0C = DbT.A0C(LayoutInflater.from(r3.getContext()), (ViewGroup) r3.mView, num.intValue());
                    r3.A00 = A0C;
                    ((ViewGroup) r3.mView).addView(A0C);
                    return;
                }
                SpinnerImageView spinnerImageView = new SpinnerImageView(r3.getContext());
                spinnerImageView.setImageResource(R.drawable.spinner_large);
                r3.A00 = spinnerImageView;
                FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
                layoutParams.gravity = 17;
                ((ViewGroup) r3.mView).addView(r3.A00, layoutParams);
            }
        }
    }
}
