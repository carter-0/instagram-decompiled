package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.appcompat.widget.AppCompatSpinner$SavedState;

public class U5e extends Spinner {
    public static final int[] A08 = {16843505};
    public int A00;
    public SpinnerAdapter A01;
    public X9Y A02;
    public WC5 A03;
    public final Context A04;
    public final Rect A05 = new Rect();
    public final C242403Tx A06;
    public final boolean A07;

    public final int A00(Drawable drawable, SpinnerAdapter spinnerAdapter) {
        int i = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int max = Math.max(0, getSelectedItemPosition());
        int min = Math.min(spinnerAdapter.getCount(), max + 15);
        View view = null;
        int i2 = 0;
        for (int A072 = C13988Tno.A07(max, 15 - (min - max), 0); A072 < min; A072++) {
            int itemViewType = spinnerAdapter.getItemViewType(A072);
            if (itemViewType != i) {
                view = null;
                i = itemViewType;
            }
            view = spinnerAdapter.getView(A072, view, this);
            if (view.getLayoutParams() == null) {
                C51968G9o.A1D(view, -2);
            }
            view.measure(makeMeasureSpec, makeMeasureSpec2);
            i2 = Math.max(i2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return i2;
        }
        Rect rect = this.A05;
        drawable.getPadding(rect);
        return i2 + rect.left + rect.right;
    }

    public int getDropDownHorizontalOffset() {
        X9Y x9y = this.A02;
        if (x9y != null) {
            return x9y.BDk();
        }
        return super.getDropDownHorizontalOffset();
    }

    public int getDropDownVerticalOffset() {
        X9Y x9y = this.A02;
        if (x9y != null) {
            return x9y.CDm();
        }
        return super.getDropDownVerticalOffset();
    }

    public int getDropDownWidth() {
        if (this.A02 != null) {
            return this.A00;
        }
        return super.getDropDownWidth();
    }

    public final X9Y getInternalPopup() {
        return this.A02;
    }

    public Drawable getPopupBackground() {
        X9Y x9y = this.A02;
        if (x9y != null) {
            return x9y.Aeg();
        }
        return super.getPopupBackground();
    }

    public Context getPopupContext() {
        return this.A04;
    }

    public CharSequence getPrompt() {
        X9Y x9y = this.A02;
        if (x9y != null) {
            return x9y.BDe();
        }
        return super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        return C13991Tnr.A02(this.A06);
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return C13991Tnr.A03(this.A06);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        AppCompatSpinner$SavedState appCompatSpinner$SavedState = (AppCompatSpinner$SavedState) parcelable;
        super.onRestoreInstanceState(appCompatSpinner$SavedState.getSuperState());
        if (appCompatSpinner$SavedState.A00 && (viewTreeObserver = getViewTreeObserver()) != null) {
            viewTreeObserver.addOnGlobalLayoutListener(new WC9(this, 2));
        }
    }

    public final boolean performClick() {
        X9Y x9y = this.A02;
        if (x9y == null) {
            return super.performClick();
        }
        if (x9y.Cc6()) {
            return true;
        }
        x9y.Etl(getTextDirection(), getTextAlignment());
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.WD0, android.widget.ListAdapter, java.lang.Object] */
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.A07) {
            this.A01 = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        X9Y x9y = this.A02;
        if (x9y != null) {
            Context context = this.A04;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            ? obj = new Object();
            obj.A01 = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                obj.A00 = (ListAdapter) spinnerAdapter;
            }
            if (theme != null && (spinnerAdapter instanceof ThemedSpinnerAdapter)) {
                ThemedSpinnerAdapter themedSpinnerAdapter = (ThemedSpinnerAdapter) spinnerAdapter;
                if (!02S.A00(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                    themedSpinnerAdapter.setDropDownViewTheme(theme);
                }
            }
            x9y.ENu(obj);
        }
    }

    public void setDropDownHorizontalOffset(int i) {
        X9Y x9y = this.A02;
        if (x9y != null) {
            x9y.EZJ(i);
            x9y.EZI(i);
            return;
        }
        super.setDropDownHorizontalOffset(i);
    }

    public void setDropDownVerticalOffset(int i) {
        X9Y x9y = this.A02;
        if (x9y != null) {
            x9y.Eq2(i);
        } else {
            super.setDropDownVerticalOffset(i);
        }
    }

    public void setDropDownWidth(int i) {
        if (this.A02 != null) {
            this.A00 = i;
        } else {
            super.setDropDownWidth(i);
        }
    }

    public void setPopupBackgroundDrawable(Drawable drawable) {
        X9Y x9y = this.A02;
        if (x9y != null) {
            x9y.EPV(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    public void setPopupBackgroundResource(int i) {
        setPopupBackgroundDrawable(C323656xt.A00(this.A04, i));
    }

    public void setPrompt(CharSequence charSequence) {
        X9Y x9y = this.A02;
        if (x9y != null) {
            x9y.EhJ(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C242403Tx r0 = this.A06;
        if (r0 != null) {
            r0.A05(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C242403Tx r0 = this.A06;
        if (r0 != null) {
            r0.A06(mode);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x004e, code lost:
        if (r1 == null) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public U5e(android.content.Context r11, android.util.AttributeSet r12, int r13) {
        /*
            r10 = this;
            r6 = 2130971206(0x7f040a46, float:1.7551144E38)
            r5 = 0
            r10.<init>(r11, r12, r6)
            android.graphics.Rect r0 = new android.graphics.Rect
            r0.<init>()
            r10.A05 = r0
            X.C13988Tno.A0z(r10)
            int[] r7 = X.AnonymousClass2Z3.A0L
            r4 = 0
            android.content.res.TypedArray r3 = r11.obtainStyledAttributes(r12, r7, r6, r4)
            X.3Tx r0 = new X.3Tx
            r0.<init>(r10)
            r10.A06 = r0
            r0 = 4
            int r1 = r3.getResourceId(r0, r4)
            if (r1 == 0) goto L_0x0031
            X.3n1 r0 = new X.3n1
            r0.<init>((android.content.Context) r11, (int) r1)
            r10.A04 = r0
        L_0x002d:
            r0 = -1
            if (r13 != r0) goto L_0x0053
            goto L_0x0034
        L_0x0031:
            r10.A04 = r11
            goto L_0x002d
        L_0x0034:
            int[] r0 = A08     // Catch:{ Exception -> 0x0053, all -> 0x004c }
            android.content.res.TypedArray r1 = r11.obtainStyledAttributes(r12, r0, r6, r4)     // Catch:{ Exception -> 0x0053, all -> 0x004c }
            boolean r0 = r1.hasValue(r4)     // Catch:{ Exception -> 0x004e, all -> 0x0045 }
            if (r0 == 0) goto L_0x0050
            int r13 = r1.getInt(r4, r4)     // Catch:{ Exception -> 0x004e, all -> 0x0045 }
            goto L_0x0050
        L_0x0045:
            r0 = move-exception
            if (r1 == 0) goto L_0x004d
            r1.recycle()
            throw r0
        L_0x004c:
            r0 = move-exception
        L_0x004d:
            throw r0
        L_0x004e:
            if (r1 == 0) goto L_0x0053
        L_0x0050:
            r1.recycle()
        L_0x0053:
            r2 = 1
            if (r13 == 0) goto L_0x00c3
            if (r13 != r2) goto L_0x0093
            android.content.Context r0 = r10.A04
            X.U6V r1 = new X.U6V
            r1.<init>(r0, r12, r10)
            android.content.Context r9 = r10.A04
            android.content.res.TypedArray r7 = r9.obtainStyledAttributes(r12, r7, r6, r4)
            r8 = 3
            r0 = -2
            int r0 = r7.getLayoutDimension(r8, r0)
            r10.A00 = r0
            boolean r0 = r7.hasValue(r2)
            if (r0 == 0) goto L_0x00be
            int r0 = r7.getResourceId(r2, r4)
            if (r0 == 0) goto L_0x00be
            android.graphics.drawable.Drawable r0 = X.C323656xt.A00(r9, r0)
        L_0x007d:
            r1.EPV(r0)
            r0 = 2
            java.lang.String r0 = r3.getString(r0)
            r1.A02 = r0
            r7.recycle()
            r10.A02 = r1
            X.U6P r0 = new X.U6P
            r0.<init>(r10, r1, r10)
            r10.A03 = r0
        L_0x0093:
            java.lang.CharSequence[] r4 = r3.getTextArray(r4)
            if (r4 == 0) goto L_0x00aa
            r0 = 17367048(0x1090008, float:2.5162948E-38)
            android.widget.ArrayAdapter r1 = new android.widget.ArrayAdapter
            r1.<init>(r11, r0, r4)
            r0 = 2131629571(0x7f0e1603, float:1.8886467E38)
            r1.setDropDownViewResource(r0)
            r10.setAdapter((android.widget.SpinnerAdapter) r1)
        L_0x00aa:
            r3.recycle()
            r10.A07 = r2
            android.widget.SpinnerAdapter r0 = r10.A01
            if (r0 == 0) goto L_0x00b8
            r10.setAdapter((android.widget.SpinnerAdapter) r0)
            r10.A01 = r5
        L_0x00b8:
            X.3Tx r0 = r10.A06
            r0.A07(r12, r6)
            return
        L_0x00be:
            android.graphics.drawable.Drawable r0 = r7.getDrawable(r2)
            goto L_0x007d
        L_0x00c3:
            X.W5V r1 = new X.W5V
            r1.<init>(r10)
            r10.A02 = r1
            r0 = 2
            java.lang.String r0 = r3.getString(r0)
            r1.A01 = r0
            goto L_0x0093
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U5e.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C242403Tx r0 = this.A06;
        if (r0 != null) {
            r0.A02();
        }
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-876323291);
        super.onDetachedFromWindow();
        X9Y x9y = this.A02;
        if (x9y != null && x9y.Cc6()) {
            x9y.dismiss();
        }
        AnonymousClass0fD.A0D(152169190, A062);
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (this.A02 != null && View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), A00(getBackground(), getAdapter())), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.view.View$BaseSavedState, android.os.Parcelable, androidx.appcompat.widget.AppCompatSpinner$SavedState] */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0012, code lost:
        if (r1 == false) goto L_0x0014;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r3 = this;
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.appcompat.widget.AppCompatSpinner$SavedState r2 = new androidx.appcompat.widget.AppCompatSpinner$SavedState
            r2.<init>(r0)
            X.X9Y r0 = r3.A02
            if (r0 == 0) goto L_0x0014
            boolean r1 = r0.Cc6()
            r0 = 1
            if (r1 != 0) goto L_0x0015
        L_0x0014:
            r0 = 0
        L_0x0015:
            r2.A00 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U5e.onSaveInstanceState():android.os.Parcelable");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        int A052 = AnonymousClass0fD.A05(-455843648);
        WC5 wc5 = this.A03;
        if (wc5 == null || !wc5.onTouch(this, motionEvent)) {
            onTouchEvent = super.onTouchEvent(motionEvent);
            i = -93545254;
        } else {
            onTouchEvent = true;
            i = 1183333584;
        }
        AnonymousClass0fD.A0C(i, A052);
        return onTouchEvent;
    }

    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C242403Tx r0 = this.A06;
        if (r0 != null) {
            r0.A03();
        }
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C242403Tx r0 = this.A06;
        if (r0 != null) {
            r0.A04(i);
        }
    }
}
