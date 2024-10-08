package com.instagram.ui.emptystaterow;

import X.2Yu;
import X.AnonymousClass730;
import X.AnonymousClass972;
import X.C320156rr;
import X.C322776wO;
import X.C3253572b;
import X.C3254972u;
import X.C71382cm;
import X.C71622eP;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.instagram.android.R;
import java.util.HashMap;

public class EmptyStateView extends NestedScrollView {
    public C320156rr A00;
    public final HashMap A01;
    public final View A02;

    public EmptyStateView(Context context) {
        this(context, (AttributeSet) null);
    }

    public static void A00(Context context, TypedArray typedArray, C3253572b r5) {
        r5.A02 = typedArray.getResourceId(8, 0);
        r5.A01 = typedArray.getColor(2, -1);
        r5.A0D = C71622eP.A00(context, typedArray, 15);
        r5.A07 = C71622eP.A00(context, typedArray, 14);
        r5.A0C = C71622eP.A00(context, typedArray, 1);
        r5.A0M = typedArray.getBoolean(12, false);
    }

    public final void A0H() {
        Object obj = this.A01.get(this.A00);
        obj.getClass();
        AnonymousClass730 r1 = new AnonymousClass730(this.A02);
        C320156rr r0 = this.A00;
        r0.getClass();
        C3254972u.A02((C3253572b) obj, r1, r0);
    }

    public final void A0I() {
        A0P(C320156rr.EMPTY);
    }

    public final void A0J() {
        A0P(C320156rr.ERROR);
    }

    public final void A0K() {
        A0P(C320156rr.GONE);
    }

    public final void A0L() {
        A0P(C320156rr.LOADING);
    }

    public final void A0M(int i) {
        for (C3253572b r1 : this.A01.values()) {
            r1.A00 = i;
            if (i == 0) {
                r1.A0E = true;
            }
        }
    }

    public final void A0N(View.OnClickListener onClickListener, C320156rr r4) {
        HashMap hashMap = this.A01;
        if (hashMap.containsKey(r4)) {
            ((C3253572b) hashMap.get(r4)).A05 = onClickListener;
        }
    }

    public final void A0O(C322776wO r3, C320156rr r4) {
        HashMap hashMap = this.A01;
        if (hashMap.get(r4) != null) {
            ((C3253572b) hashMap.get(r4)).A06 = r3;
        }
    }

    public final void A0P(C320156rr r2) {
        C320156rr r0 = this.A00;
        this.A00 = r2;
        if (r0 != r2) {
            A0H();
        }
    }

    public final void A0R(C320156rr r2, int i) {
        Object obj = this.A01.get(r2);
        obj.getClass();
        ((C3253572b) obj).A02 = i;
    }

    public final void A0U(C320156rr r2, String str) {
        Object obj = this.A01.get(r2);
        obj.getClass();
        ((C3253572b) obj).A0C = str;
    }

    public final void A0V(C320156rr r2, String str) {
        Object obj = this.A01.get(r2);
        obj.getClass();
        ((C3253572b) obj).A07 = str;
    }

    public final void A0W(C320156rr r2, String str) {
        Object obj = this.A01.get(r2);
        obj.getClass();
        ((C3253572b) obj).A0D = str;
    }

    public int getEmptyStateViewWrappedHeight() {
        View view = this.A02;
        view.measure(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), AnonymousClass972.MUTABLE_FLAG_MASK), 0);
        return view.getMeasuredHeight();
    }

    public final void A0Q(C320156rr r2, int i) {
        A0U(r2, getResources().getString(i));
    }

    public final void A0S(C320156rr r2, int i) {
        A0V(r2, getResources().getString(i));
    }

    public final void A0T(C320156rr r2, int i) {
        A0W(r2, getResources().getString(i));
    }

    public EmptyStateView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        HashMap hashMap = new HashMap();
        this.A01 = hashMap;
        C320156rr r9 = C320156rr.EMPTY;
        hashMap.put(r9, new C3253572b());
        C320156rr r8 = C320156rr.LOADING;
        hashMap.put(r8, new C3253572b());
        C320156rr r1 = C320156rr.ERROR;
        hashMap.put(r1, new C3253572b());
        hashMap.put(C320156rr.GONE, new C3253572b());
        C320156rr r4 = C320156rr.NOT_LOADED;
        hashMap.put(r4, new C3253572b());
        setFillViewport(true);
        View A002 = C3254972u.A00(context, this);
        this.A02 = A002;
        addView(A002);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C71382cm.A0V, 0, 0);
        Context context2 = getContext();
        A002.setBackgroundColor(obtainStyledAttributes.getColor(0, context2.getColor(2Yu.A0H(context2, R.attr.backgroundColorSecondary))));
        Object obj = hashMap.get(r9);
        obj.getClass();
        C3253572b r6 = (C3253572b) obj;
        A00(context, obtainStyledAttributes, r6);
        Object obj2 = hashMap.get(r8);
        obj2.getClass();
        C3253572b r7 = (C3253572b) obj2;
        r7.A0D = C71622eP.A00(context, obtainStyledAttributes, 11);
        r7.A07 = C71622eP.A00(context, obtainStyledAttributes, 10);
        r7.A0C = C71622eP.A00(context, obtainStyledAttributes, 9);
        r6.A0M = obtainStyledAttributes.getBoolean(12, false);
        Object obj3 = hashMap.get(r1);
        obj3.getClass();
        C3253572b r12 = (C3253572b) obj3;
        r12.A02 = obtainStyledAttributes.getResourceId(5, 0);
        r6.A01 = obtainStyledAttributes.getColor(4, -1);
        r12.A0D = C71622eP.A00(context, obtainStyledAttributes, 7);
        r12.A07 = C71622eP.A00(context, obtainStyledAttributes, 6);
        r12.A0C = C71622eP.A00(context, obtainStyledAttributes, 3);
        r6.A0M = obtainStyledAttributes.getBoolean(12, false);
        Object obj4 = hashMap.get(r4);
        obj4.getClass();
        A00(context, obtainStyledAttributes, (C3253572b) obj4);
        A0P(C320156rr.values()[obtainStyledAttributes.getInt(13, 0)]);
        obtainStyledAttributes.recycle();
    }

    public EmptyStateView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
