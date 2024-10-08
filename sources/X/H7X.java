package X;

import android.content.Context;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;

public final class H7X extends IgFrameLayout {
    public GW3 A00;
    public final Context A01;
    public final C53308Glu A02;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0014, code lost:
        r1 = r6.A01;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void setIcon(com.instagram.common.ui.base.IgFrameLayout r7) {
        /*
            r6 = this;
            X.Glu r5 = r6.A02
            java.lang.String r2 = r5.A06
            if (r2 == 0) goto L_0x0033
            r0 = 0
            android.view.View r4 = r7.getChildAt(r0)
            boolean r0 = r4 instanceof com.instagram.common.ui.base.IgTextView
            r3 = 0
            if (r0 == 0) goto L_0x0033
            android.widget.TextView r4 = (android.widget.TextView) r4
            if (r4 == 0) goto L_0x0033
            android.content.Context r1 = r6.A01
            android.graphics.drawable.Drawable r2 = X.C14091Tpi.A02(r1, r2)
            if (r2 == 0) goto L_0x0033
            int r0 = r5.A01
            int r1 = r1.getColor(r0)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_IN
            X.C51969G9p.A12(r0, r2, r1)
            boolean r0 = r5.A08
            if (r0 == 0) goto L_0x0034
            r4.setCompoundDrawablesWithIntrinsicBounds(r3, r3, r2, r3)
        L_0x002e:
            int r0 = r5.A02
            r4.setCompoundDrawablePadding(r0)
        L_0x0033:
            return
        L_0x0034:
            r4.setCompoundDrawablesWithIntrinsicBounds(r2, r3, r3, r3)
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: X.H7X.setIcon(com.instagram.common.ui.base.IgFrameLayout):void");
    }

    public H7X(Context context, C53308Glu glu) {
        super(context);
        IgFrameLayout igFrameLayout;
        TextView textView;
        this.A01 = context;
        this.A02 = glu;
        GW3 gw3 = new GW3(context);
        C53308Glu glu2 = this.A02;
        gw3.setLabel(glu2.A07);
        View childAt = gw3.getChildAt(0);
        if ((childAt instanceof IgFrameLayout) && (igFrameLayout = (IgFrameLayout) childAt) != null) {
            Drawable drawable = context.getDrawable(glu2.A00);
            RectF rectF = 0nA.A01;
            igFrameLayout.setBackground(drawable);
            Integer num = glu2.A05;
            if (num != null) {
                0nA.A0f(igFrameLayout, num.intValue());
            }
            0nA.A0j(igFrameLayout, 0, 0, 0, 0);
            0nA.A0d(igFrameLayout, 0);
            0nA.A0U(igFrameLayout, glu2.A03);
            View childAt2 = igFrameLayout.getChildAt(0);
            if ((childAt2 instanceof IgTextView) && (textView = (TextView) childAt2) != null) {
                textView.setTextAppearance(glu2.A04);
                textView.setGravity(16);
            }
            setIcon(igFrameLayout);
        }
        this.A00 = gw3;
        addView(gw3);
    }
}
