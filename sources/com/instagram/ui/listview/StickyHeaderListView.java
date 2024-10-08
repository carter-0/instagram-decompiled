package com.instagram.ui.listview;

import X.AnonymousClass0fD;
import X.AnonymousClass4DT;
import X.C227752jr;
import X.C227762js;
import X.C249383je;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;

public class StickyHeaderListView extends FrameLayout {
    public C227762js A00;
    public final Rect A01;
    public final Rect A02;

    private float getContentPosition() {
        C227762js r0 = this.A00;
        if (r0 == null) {
            return 0.0f;
        }
        return r0.A00 - r0.A01;
    }

    public Rect getTopChromeArea() {
        Rect rect = this.A01;
        if (rect.height() == 0) {
            getGlobalVisibleRect(rect);
        }
        Rect rect2 = this.A02;
        rect2.top = rect.top;
        rect2.bottom = rect.top + Math.round(getContentPosition());
        rect2.left = rect.left;
        rect2.right = rect.left + getWidth();
        return rect2;
    }

    public StickyHeaderListView(Context context, AttributeSet attributeSet, C227762js r3) {
        this(context, attributeSet);
        this.A00 = r3;
    }

    private void A00() {
        AnonymousClass4DT A0P;
        FragmentActivity context = getContext();
        int i = C249383je.DEFAULT_FIRST_VISIBLE_ITEM_POSITION;
        C227762js r2 = null;
        if ((context instanceof FragmentActivity) && (A0P = context.getSupportFragmentManager().A0P(R.id.layout_container_main)) != null && C227752jr.A01(A0P)) {
            r2 = A0P.BD0();
        }
        this.A00 = r2;
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(599425621);
        super.onAttachedToWindow();
        A00();
        AnonymousClass0fD.A0D(580546913, A06);
    }

    public final void onFinishInflate() {
        int A06 = AnonymousClass0fD.A06(-1974584638);
        super.onFinishInflate();
        A00();
        AnonymousClass0fD.A0D(47742888, A06);
    }

    public StickyHeaderListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.A02 = new Rect();
        this.A01 = new Rect();
    }
}
