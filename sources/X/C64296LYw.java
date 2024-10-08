package X;

import android.view.ViewTreeObserver;
import android.widget.TextView;

/* renamed from: X.LYw  reason: case insensitive filesystem */
public final class C64296LYw implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ TextView A02;

    public C64296LYw(TextView textView, int i, int i2) {
        this.A02 = textView;
        this.A01 = i;
        this.A00 = i2;
    }

    public final void onGlobalLayout() {
        TextView textView = this.A02;
        C51967G9n.A0y(textView, this);
        textView.setY((float) ((this.A01 - this.A00) - textView.getHeight()));
    }
}
