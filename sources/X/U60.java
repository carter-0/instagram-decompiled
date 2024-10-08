package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import com.google.android.material.textfield.TextInputLayout;
import com.instagram.android.R;
import java.util.Locale;

public final class U60 extends U47 {
    public final Rect A00 = new Rect();
    public final AccessibilityManager A01;
    public final WDV A02;

    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.A01;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.A02.show();
        }
    }

    public U60(Context context, AttributeSet attributeSet) {
        super(C297835sR.A00(context, attributeSet, R.attr.autoCompleteTextViewStyle, 0), attributeSet, R.attr.autoCompleteTextViewStyle);
        Context context2 = getContext();
        TypedArray A002 = C297855sT.A00(context2, attributeSet, C297865sU.A0I, new int[0], R.attr.autoCompleteTextViewStyle, 2132018439);
        if (A002.hasValue(0) && A002.getInt(0, 0) == 0) {
            setKeyListener((KeyListener) null);
        }
        this.A01 = (AccessibilityManager) context2.getSystemService("accessibility");
        WDV wdv = new WDV(context2, (AttributeSet) null, R.attr.listPopupWindowStyle, 0);
        this.A02 = wdv;
        wdv.A0D = true;
        PopupWindow popupWindow = wdv.A09;
        popupWindow.setFocusable(true);
        wdv.A06 = this;
        popupWindow.setInputMethodMode(2);
        wdv.ENu(getAdapter());
        wdv.A07 = new C18910WCe(this, 2);
        A002.recycle();
    }

    public static void A00(U60 u60, Object obj) {
        u60.setText(u60.convertSelectionToString(obj), false);
    }

    public CharSequence getHint() {
        ViewParent parent = getParent();
        while (true) {
            if (parent == null) {
                break;
            } else if (parent instanceof TextInputLayout) {
                TextInputLayout textInputLayout = (TextInputLayout) parent;
                if (textInputLayout != null && textInputLayout.A0S) {
                    return textInputLayout.getHint();
                }
            } else {
                parent = parent.getParent();
            }
        }
        return super.getHint();
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(-1092605867);
        super.onAttachedToWindow();
        ViewParent parent = getParent();
        while (true) {
            if (parent == null) {
                break;
            } else if (parent instanceof TextInputLayout) {
                TextInputLayout textInputLayout = (TextInputLayout) parent;
                if (textInputLayout != null && textInputLayout.A0S && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
                    setHint("");
                }
            } else {
                parent = parent.getParent();
            }
        }
        AnonymousClass0fD.A0D(-1693425961, A06);
    }

    public final void onMeasure(int i, int i2) {
        TextInputLayout textInputLayout;
        int i3;
        int selectedItemPosition;
        int A06 = AnonymousClass0fD.A06(-1918274620);
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            ViewParent parent = getParent();
            while (true) {
                if (parent == null) {
                    textInputLayout = null;
                    break;
                } else if (parent instanceof TextInputLayout) {
                    textInputLayout = (TextInputLayout) parent;
                    break;
                } else {
                    parent = parent.getParent();
                }
            }
            int i4 = 0;
            if (adapter == null || textInputLayout == null) {
                i3 = 0;
            } else {
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                WDV wdv = this.A02;
                PopupWindow popupWindow = wdv.A09;
                if (!popupWindow.isShowing()) {
                    selectedItemPosition = -1;
                } else {
                    selectedItemPosition = wdv.A0A.getSelectedItemPosition();
                }
                int min = Math.min(adapter.getCount(), Math.max(0, selectedItemPosition) + 15);
                View view = null;
                int i5 = 0;
                for (int max = Math.max(0, min - 15); max < min; max++) {
                    int itemViewType = adapter.getItemViewType(max);
                    if (itemViewType != i4) {
                        view = null;
                        i4 = itemViewType;
                    }
                    view = adapter.getView(max, view, textInputLayout);
                    if (view.getLayoutParams() == null) {
                        C51968G9o.A1D(view, -2);
                    }
                    view.measure(makeMeasureSpec, makeMeasureSpec2);
                    i5 = Math.max(i5, view.getMeasuredWidth());
                }
                Drawable background = popupWindow.getBackground();
                if (background != null) {
                    Rect rect = this.A00;
                    background.getPadding(rect);
                    i5 += rect.left + rect.right;
                }
                i3 = i5 + textInputLayout.A1D.getMeasuredWidth();
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, i3), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
        AnonymousClass0fD.A0D(-212555100, A06);
    }

    public void setAdapter(ListAdapter listAdapter) {
        super.setAdapter(listAdapter);
        this.A02.ENu(getAdapter());
    }
}
