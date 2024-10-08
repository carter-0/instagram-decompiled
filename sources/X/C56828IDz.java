package X;

import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.facebookpay.widget.accordion.AccordionView;

/* renamed from: X.IDz  reason: case insensitive filesystem */
public final class C56828IDz implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View A00;
    public final /* synthetic */ ViewGroup A01;
    public final /* synthetic */ AccordionView A02;
    public final /* synthetic */ boolean A03;

    public C56828IDz(View view, ViewGroup viewGroup, AccordionView accordionView, boolean z) {
        this.A02 = accordionView;
        this.A00 = view;
        this.A01 = viewGroup;
        this.A03 = z;
    }

    public final void onGlobalLayout() {
        AccordionView accordionView = this.A02;
        C51967G9n.A0y(accordionView, this);
        View view = this.A00;
        int measuredHeight = view.getMeasuredHeight();
        ViewGroup viewGroup = this.A01;
        viewGroup.measure(View.MeasureSpec.makeMeasureSpec(view.getWidth(), SN3.MAX_SIGNED_POWER_OF_TWO), View.MeasureSpec.makeMeasureSpec(view.getHeight(), 0));
        int measuredHeight2 = viewGroup.getMeasuredHeight() + (accordionView.A0A * 2);
        ValueAnimator duration = ValueAnimator.ofInt(new int[]{measuredHeight, measuredHeight2}).setDuration((long) ((((double) Math.abs(measuredHeight2 - measuredHeight)) * 1.5d) / ((double) AnonymousClass7TF.A0E(view.getContext()).density)));
        viewGroup.getLayoutParams().height = viewGroup.getMeasuredHeight();
        AccordionView.A00(accordionView, this.A03);
        I84.A01(duration, view, 1);
        duration.addListener(new C52777GcU(1, viewGroup, view));
        duration.start();
    }
}
