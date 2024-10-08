package androidx.appcompat.view.menu;

import X.2Yi;
import X.AnonymousClass0fD;
import X.C18932WDk;
import X.C18934WDm;
import X.C20868X1u;
import X.C20869X1v;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, C20868X1u, C20869X1v {
    public static final int[] A01 = {16842964, 16843049};
    public C18932WDk A00;

    public final void CN4(C18932WDk wDk) {
        this.A00 = wDk;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [X.WDm, android.view.MenuItem] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CNz(X.C18934WDm r4) {
        /*
            r3 = this;
            X.WDk r2 = r3.A00
            r1 = 0
            r0 = 0
            boolean r0 = r2.A0I(r4, r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ExpandedMenuView.CNz(X.WDm):boolean");
    }

    public int getWindowAnimations() {
        return 0;
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        2Yi A002 = 2Yi.A00(context, attributeSet, A01, i, 0);
        TypedArray typedArray = A002.A02;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(A002.A02(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(A002.A02(1));
        }
        typedArray.recycle();
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(1976257305);
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
        AnonymousClass0fD.A0D(-1898944034, A06);
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        CNz((C18934WDm) getAdapter().getItem(i));
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }
}
