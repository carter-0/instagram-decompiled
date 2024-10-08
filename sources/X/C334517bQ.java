package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.7bQ  reason: invalid class name and case insensitive filesystem */
public final class C334517bQ implements View.OnLayoutChangeListener {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C334347b7 A01;
    public final /* synthetic */ IgFrameLayout A02;

    public C334517bQ(Context context, C334347b7 r2, IgFrameLayout igFrameLayout) {
        this.A02 = igFrameLayout;
        this.A01 = r2;
        this.A00 = context;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        IgFrameLayout igFrameLayout = this.A02;
        ComposerAutoCompleteTextView composerAutoCompleteTextView = this.A01.A0B;
        Context context = this.A00;
        0qQ.A0A(context);
        int A002 = AnonymousClass3D4.A00(context);
        if (igFrameLayout.getMeasuredHeight() > 0) {
            int measuredHeight = ((igFrameLayout.getMeasuredHeight() - igFrameLayout.getPaddingTop()) - igFrameLayout.getPaddingBottom()) + A002;
            if (measuredHeight < 0) {
                measuredHeight = 0;
            }
            composerAutoCompleteTextView.setDropDownHeight(measuredHeight);
        }
    }
}
