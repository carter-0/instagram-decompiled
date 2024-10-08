package com.google.android.material.datepicker;

import X.03v;
import X.0fE;
import X.AnonymousClass0fD;
import X.AnonymousClass34S;
import X.AnonymousClass7TE;
import X.AnonymousClass972;
import X.C10811RyX;
import X.C298035sl;
import X.C66581MXm;
import X.Pxf;
import X.Pxj;
import X.Q9C;
import X.QC7;
import X.QCH;
import X.U7N;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Adapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ListAdapter;
import com.instagram.android.R;
import java.util.Calendar;
import java.util.Iterator;

public final class MaterialCalendarGridView extends GridView {
    public final Calendar A00;
    public final boolean A01;

    public final void onDraw(Canvas canvas) {
        Object obj;
        int A002;
        int left;
        int A003;
        int left2;
        int i;
        int width;
        Canvas canvas2 = canvas;
        super.onDraw(canvas2);
        Q9C q9c = (Q9C) super.getAdapter();
        DateSelector dateSelector = q9c.A03;
        C10811RyX ryX = q9c.A00;
        Month month = q9c.A04;
        Long A02 = q9c.getItem(month.A00());
        int A004 = month.A00();
        int i2 = month.A01;
        Long A022 = q9c.getItem((A004 + i2) - 1);
        Iterator it = dateSelector.Brq().iterator();
        while (it.hasNext()) {
            AnonymousClass34S r0 = (AnonymousClass34S) it.next();
            Object obj2 = r0.A00;
            if (!(obj2 == null || (obj = r0.A01) == null)) {
                long A0R = AnonymousClass7TE.A0R(obj2);
                long A0R2 = AnonymousClass7TE.A0R(obj);
                if (!(A02 == null || A022 == null)) {
                    long longValue = A022.longValue();
                    if (A0R <= longValue) {
                        long longValue2 = A02.longValue();
                        if (A0R2 >= longValue2) {
                            boolean A1V = C66581MXm.A1V(getLayoutDirection());
                            if (A0R < longValue2) {
                                A002 = month.A00();
                                if (A002 % month.A02 == 0) {
                                    left = 0;
                                } else {
                                    View childAt = getChildAt(A002 - 1);
                                    if (!A1V) {
                                        left = childAt.getRight();
                                    } else {
                                        left = childAt.getLeft();
                                    }
                                }
                            } else {
                                Calendar calendar = this.A00;
                                calendar.setTimeInMillis(A0R);
                                A002 = month.A00() + (calendar.get(5) - 1);
                                View childAt2 = getChildAt(A002);
                                left = childAt2.getLeft() + (childAt2.getWidth() / 2);
                            }
                            if (A0R2 > longValue) {
                                A003 = Math.min((month.A00() + i2) - 1, getChildCount() - 1);
                                if ((A003 + 1) % month.A02 == 0) {
                                    left2 = getWidth();
                                } else {
                                    View childAt3 = getChildAt(A003);
                                    if (!A1V) {
                                        left2 = childAt3.getRight();
                                    } else {
                                        left2 = childAt3.getLeft();
                                    }
                                }
                            } else {
                                Calendar calendar2 = this.A00;
                                calendar2.setTimeInMillis(A0R2);
                                A003 = month.A00() + (calendar2.get(5) - 1);
                                View childAt4 = getChildAt(A003);
                                left2 = childAt4.getLeft() + (childAt4.getWidth() / 2);
                            }
                            int itemId = (int) q9c.getItemId(A003);
                            for (int itemId2 = (int) q9c.getItemId(A002); itemId2 <= itemId; itemId2++) {
                                int numColumns = getNumColumns() * itemId2;
                                int numColumns2 = (getNumColumns() + numColumns) - 1;
                                View childAt5 = getChildAt(numColumns);
                                int top = childAt5.getTop();
                                Rect rect = ryX.A01.A00;
                                int i3 = top + rect.top;
                                int bottom = childAt5.getBottom() - rect.bottom;
                                if (!A1V) {
                                    i = left;
                                    if (numColumns > A002) {
                                        i = 0;
                                    }
                                    if (A003 <= numColumns2) {
                                        width = left2;
                                    }
                                    width = getWidth();
                                } else {
                                    int i4 = left2;
                                    if (A003 > numColumns2) {
                                        i4 = 0;
                                    }
                                    if (numColumns <= A002) {
                                        width = left;
                                    }
                                    width = getWidth();
                                }
                                canvas2.drawRect((float) i, (float) i3, (float) width, (float) bottom, ryX.A00);
                            }
                        }
                    }
                }
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        if (this.A01) {
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(16777215, AnonymousClass972.MUTABLE_FLAG_MASK));
            getLayoutParams().height = getMeasuredHeight();
            return;
        }
        super.onMeasure(i, i2);
    }

    public final void setAdapter(ListAdapter listAdapter) {
        if (listAdapter instanceof Q9C) {
            super.setAdapter(listAdapter);
            return;
        }
        throw Pxf.A0X("%1$s must have its Adapter set to a %2$s", new Object[]{MaterialCalendarGridView.class.getCanonicalName(), Q9C.class.getCanonicalName()});
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.A00 = Pxj.A0u();
        Context context2 = getContext();
        if (QC7.A01(context2)) {
            setNextFocusLeftId(R.id.cancel_button);
            setNextFocusRightId(R.id.confirm_button);
        }
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(C298035sl.A00(context2, QCH.class.getCanonicalName(), R.attr.materialCalendarStyle), new int[]{R.attr.nestedScrollable});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        this.A01 = z;
        03v.A0B(this, new U7N(this, 4));
    }

    public final Q9C A00() {
        return (Q9C) super.getAdapter();
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(331470910);
        super.onAttachedToWindow();
        0fE.A00((BaseAdapter) super.getAdapter(), -1683200808);
        AnonymousClass0fD.A0D(1802301946, A06);
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        boolean z2;
        int A002;
        int A06 = AnonymousClass0fD.A06(-1236514159);
        if (z) {
            if (i == 33) {
                Month month = ((Q9C) super.getAdapter()).A04;
                A002 = (month.A00() + month.A01) - 1;
            } else if (i == 130) {
                A002 = ((Q9C) super.getAdapter()).A04.A00();
            } else {
                z2 = true;
                super.onFocusChanged(z2, i, rect);
            }
            setSelection(A002);
        } else {
            z2 = false;
            super.onFocusChanged(z2, i, rect);
        }
        AnonymousClass0fD.A0D(-668309057, A06);
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (super.onKeyDown(i, keyEvent)) {
            if (getSelectedItemPosition() != -1 && getSelectedItemPosition() < ((Q9C) super.getAdapter()).A04.A00()) {
                if (19 == i) {
                    setSelection(((Q9C) super.getAdapter()).A04.A00());
                }
            }
            return true;
        }
        return false;
    }

    public final void setSelection(int i) {
        if (i < ((Q9C) super.getAdapter()).A04.A00()) {
            i = ((Q9C) super.getAdapter()).A04.A00();
        }
        super.setSelection(i);
    }

    public MaterialCalendarGridView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final /* bridge */ /* synthetic */ void setAdapter(Adapter adapter) {
        setAdapter((ListAdapter) adapter);
    }

    public MaterialCalendarGridView(Context context) {
        this(context, (AttributeSet) null);
    }
}
