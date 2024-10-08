package X;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import java.util.concurrent.CancellationException;

/* renamed from: X.6lC  reason: invalid class name and case insensitive filesystem */
public final class C316156lC implements AnonymousClass07Z, View.OnAttachStateChangeListener {
    public C262204Co A00;
    public boolean A01;
    public 0h9 A02 = new 0h9(this);
    public final C252063oV A03;
    public final TextView A04;

    public static final void A00(C270184gK r4, C316156lC r5, boolean z) {
        TextView textView;
        int i;
        C252063oV r3 = r5.A03;
        r3.getView().setVisibility(4);
        boolean z2 = false;
        if (r4.A00.A1f.ordinal() >= 6) {
            z2 = true;
        }
        if (!z2 || !z) {
            ((ProgressBar) r3.getView()).setIndeterminate(false);
            textView = r5.A04;
            i = 2131976097;
        } else {
            ((ProgressBar) r3.getView()).setIndeterminate(true);
            textView = r5.A04;
            i = 2131969293;
        }
        textView.setText(i);
        r3.getView().setVisibility(0);
    }

    public final void A01() {
        C262204Co r1 = this.A00;
        if (r1 != null) {
            r1.AG7((CancellationException) null);
        }
        C252063oV r2 = this.A03;
        ((ProgressBar) r2.getView()).setProgress(0);
        r2.getView().setVisibility(8);
    }

    public final AnonymousClass07V getLifecycle() {
        return this.A02;
    }

    public final void onViewAttachedToWindow(View view) {
        this.A02.A0C(07U.A04);
    }

    public final void onViewDetachedFromWindow(View view) {
        this.A02.A0C(07U.A01);
    }

    public C316156lC(TextView textView, C252063oV r3) {
        this.A03 = r3;
        this.A04 = textView;
    }
}
