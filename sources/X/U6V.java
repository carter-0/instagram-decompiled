package X;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.instagram.android.R;

public final class U6V extends WDV implements X9Y {
    public int A00;
    public ListAdapter A01;
    public CharSequence A02;
    public final Rect A03 = new Rect();
    public final /* synthetic */ U5e A04;

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0064  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01() {
        /*
            r9 = this;
            android.widget.PopupWindow r2 = r9.A09
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            r3 = 0
            X.U5e r5 = r9.A04
            android.graphics.Rect r7 = r5.A05
            if (r0 == 0) goto L_0x0078
            r0.getPadding(r7)
            int r1 = r5.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L_0x0074
            int r3 = r7.right
        L_0x0019:
            int r8 = r5.getPaddingLeft()
            int r4 = r5.getPaddingRight()
            int r6 = r5.getWidth()
            int r1 = r5.A00
            r0 = -2
            if (r1 != r0) goto L_0x0069
            android.widget.ListAdapter r1 = r9.A01
            android.widget.SpinnerAdapter r1 = (android.widget.SpinnerAdapter) r1
            android.graphics.drawable.Drawable r0 = r2.getBackground()
            int r2 = r5.A00(r0, r1)
            android.content.res.Resources r0 = X.DbU.A05(r5)
            android.util.DisplayMetrics r0 = r0.getDisplayMetrics()
            int r1 = r0.widthPixels
            int r0 = r7.left
            int r1 = r1 - r0
            int r0 = r7.right
            int r1 = r1 - r0
            if (r2 <= r1) goto L_0x0049
            r2 = r1
        L_0x0049:
            int r0 = r6 - r8
            int r0 = X.C13988Tno.A07(r0, r4, r2)
        L_0x004f:
            r9.A00(r0)
        L_0x0052:
            int r1 = r5.getLayoutDirection()
            r0 = 1
            if (r1 != r0) goto L_0x0064
            int r6 = r6 - r4
            int r0 = r9.A03
            int r6 = r6 - r0
            int r0 = r9.A00
            int r6 = r6 - r0
        L_0x0060:
            int r3 = r3 + r6
            r9.A01 = r3
            return
        L_0x0064:
            int r0 = r9.A00
            int r6 = r8 + r0
            goto L_0x0060
        L_0x0069:
            r0 = -1
            if (r1 != r0) goto L_0x0070
            int r0 = r6 - r8
            int r0 = r0 - r4
            goto L_0x004f
        L_0x0070:
            r9.A00(r1)
            goto L_0x0052
        L_0x0074:
            int r0 = r7.left
            int r3 = -r0
            goto L_0x0019
        L_0x0078:
            r7.right = r3
            r7.left = r3
            goto L_0x0019
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U6V.A01():void");
    }

    public final CharSequence BDe() {
        return this.A02;
    }

    public final void EZJ(int i) {
        this.A00 = i;
    }

    public final void EhJ(CharSequence charSequence) {
        this.A02 = charSequence;
    }

    public final void Etl(int i, int i2) {
        ViewTreeObserver viewTreeObserver;
        PopupWindow popupWindow = this.A09;
        boolean isShowing = popupWindow.isShowing();
        A01();
        popupWindow.setInputMethodMode(2);
        show();
        U5Q u5q = this.A0A;
        u5q.setChoiceMode(1);
        u5q.setTextDirection(i);
        u5q.setTextAlignment(i2);
        U5e u5e = this.A04;
        int selectedItemPosition = u5e.getSelectedItemPosition();
        U5Q u5q2 = this.A0A;
        if (popupWindow.isShowing() && u5q2 != null) {
            u5q2.A07 = false;
            u5q2.setSelection(selectedItemPosition);
            if (u5q2.getChoiceMode() != 0) {
                u5q2.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = u5e.getViewTreeObserver()) != null) {
            WC9 wc9 = new WC9(this, 3);
            viewTreeObserver.addOnGlobalLayoutListener(wc9);
            popupWindow.setOnDismissListener(new LZN(0, wc9, this));
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public U6V(Context context, AttributeSet attributeSet, U5e u5e) {
        super(context, attributeSet, R.attr.spinnerStyle, 0);
        this.A04 = u5e;
        this.A06 = u5e;
        this.A0D = true;
        this.A09.setFocusable(true);
        this.A07 = new C11530Sbr(1, this, u5e);
    }

    public final void ENu(ListAdapter listAdapter) {
        super.ENu(listAdapter);
        this.A01 = listAdapter;
    }
}
