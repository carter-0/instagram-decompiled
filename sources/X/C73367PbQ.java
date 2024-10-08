package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.prioritizedverticallayout.IgPrioritizedVerticalLayout;

/* renamed from: X.PbQ  reason: case insensitive filesystem */
public final class C73367PbQ implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ IgTextView A01;
    public final /* synthetic */ OZT A02;
    public final /* synthetic */ boolean A03;

    public C73367PbQ(View view, IgTextView igTextView, OZT ozt, boolean z) {
        this.A03 = z;
        this.A00 = view;
        this.A01 = igTextView;
        this.A02 = ozt;
    }

    public final void run() {
        IgTextView igTextView;
        ViewGroup.LayoutParams layoutParams;
        String A002;
        int i;
        if (this.A03) {
            boolean z = this.A00 instanceof IgPrioritizedVerticalLayout;
            igTextView = this.A01;
            if (z) {
                layoutParams = igTextView.getLayoutParams();
                A002 = "null cannot be cast to non-null type com.instagram.common.ui.widget.prioritizedverticallayout.IgPrioritizedVerticalLayout.LayoutParams";
            } else {
                i = 8;
                igTextView.setVisibility(i);
            }
        } else {
            igTextView = this.A01;
            layoutParams = igTextView.getLayoutParams();
            A002 = AnonymousClass000.A00(1);
        }
        0qQ.A0C(layoutParams, A002);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        marginLayoutParams.topMargin = (this.A00.getTop() - igTextView.getHeight()) - DbY.A01(this.A02.A06);
        igTextView.setLayoutParams(marginLayoutParams);
        i = 0;
        igTextView.setVisibility(i);
    }
}
