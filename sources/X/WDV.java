package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import java.lang.reflect.Method;

public class WDV implements X8C {
    public static Method A0N;
    public static Method A0O;
    public int A00 = 0;
    public int A01;
    public int A02;
    public int A03 = -2;
    public Context A04;
    public Rect A05;
    public View A06;
    public AdapterView.OnItemClickListener A07;
    public ListAdapter A08;
    public PopupWindow A09;
    public U5Q A0A;
    public Runnable A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public DataSetObserver A0G;
    public final Rect A0H = new Rect();
    public final Handler A0I;
    public final C18908WCc A0J = new C18908WCc(this);
    public final C19895WhQ A0K = new C19895WhQ(this);
    public final C19894WhP A0L = new C19894WhP(this);
    public final C18893WBk A0M = new C18893WBk(this);

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                A0N = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", new Class[]{Boolean.TYPE});
            } catch (NoSuchMethodException unused) {
            }
            try {
                A0O = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", new Class[]{Rect.class});
            } catch (NoSuchMethodException unused2) {
            }
        }
    }

    public final void A00(int i) {
        Drawable background = this.A09.getBackground();
        if (background != null) {
            Rect rect = this.A0H;
            background.getPadding(rect);
            this.A03 = rect.left + rect.right + i;
            return;
        }
        this.A03 = i;
    }

    public final Drawable Aeg() {
        return this.A09.getBackground();
    }

    public final int BDk() {
        return this.A01;
    }

    public final U5Q BN8() {
        return this.A0A;
    }

    public final int CDm() {
        if (!this.A0C) {
            return 0;
        }
        return this.A02;
    }

    public final boolean Cc6() {
        return this.A09.isShowing();
    }

    public void ENu(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.A0G;
        if (dataSetObserver == null) {
            this.A0G = new U0S(this);
        } else {
            ListAdapter listAdapter2 = this.A08;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.A08 = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.A0G);
        }
        U5Q u5q = this.A0A;
        if (u5q != null) {
            u5q.setAdapter(this.A08);
        }
    }

    public final void EPV(Drawable drawable) {
        this.A09.setBackgroundDrawable(drawable);
    }

    public final void EZI(int i) {
        this.A01 = i;
    }

    public final void Eq2(int i) {
        this.A02 = i;
        this.A0C = true;
    }

    public final void dismiss() {
        PopupWindow popupWindow = this.A09;
        popupWindow.dismiss();
        popupWindow.setContentView((View) null);
        this.A0A = null;
        this.A0I.removeCallbacks(this.A0K);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0086, code lost:
        if (r2 != -1) goto L_0x0088;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void show() {
        /*
            r17 = this;
            r3 = r17
            X.U5Q r0 = r3.A0A
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = -1
            r2 = 1
            r8 = 0
            if (r0 != 0) goto L_0x0189
            android.content.Context r9 = r3.A04
            X.WhO r0 = new X.WhO
            r0.<init>(r3)
            r3.A0B = r0
            boolean r0 = r3.A0D
            r6 = r0 ^ 1
            r4 = r3
            boolean r0 = r3 instanceof X.U6W
            if (r0 == 0) goto L_0x0182
            X.U6W r4 = (X.U6W) r4
            X.U6M r1 = new X.U6M
            r1.<init>(r9, r6)
            r1.A00 = r4
        L_0x0026:
            r3.A0A = r1
            android.widget.ListAdapter r0 = r3.A08
            r1.setAdapter(r0)
            X.U5Q r1 = r3.A0A
            android.widget.AdapterView$OnItemClickListener r0 = r3.A07
            r1.setOnItemClickListener(r0)
            X.U5Q r0 = r3.A0A
            r0.setFocusable(r2)
            X.U5Q r0 = r3.A0A
            r0.setFocusableInTouchMode(r2)
            X.U5Q r1 = r3.A0A
            X.WCh r0 = new X.WCh
            r0.<init>(r3, r8)
            r1.setOnItemSelectedListener(r0)
            X.U5Q r1 = r3.A0A
            X.WCc r0 = r3.A0J
            r1.setOnScrollListener(r0)
            X.U5Q r0 = r3.A0A
            r10 = 0
            android.widget.PopupWindow r11 = r3.A09
            r11.setContentView(r0)
        L_0x0057:
            android.graphics.drawable.Drawable r0 = r11.getBackground()
            android.graphics.Rect r8 = r3.A0H
            if (r0 == 0) goto L_0x017c
            r0.getPadding(r8)
            int r1 = r8.top
            int r0 = r8.bottom
            int r9 = r1 + r0
            boolean r0 = r3.A0C
            if (r0 != 0) goto L_0x006f
            int r0 = -r1
            r3.A02 = r0
        L_0x006f:
            int r1 = r11.getInputMethodMode()
            r0 = 2
            if (r1 == r0) goto L_0x0077
            r2 = 0
        L_0x0077:
            android.view.View r1 = r3.A06
            int r0 = r3.A02
            int r6 = r11.getMaxAvailableHeight(r1, r0, r2)
            int r2 = r3.A03
            r4 = -2
            if (r2 == r4) goto L_0x016c
            r7 = 1073741824(0x40000000, float:2.0)
            if (r2 == r5) goto L_0x016c
        L_0x0088:
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r7)
            X.U5Q r0 = r3.A0A
            int r1 = r0.A00(r1, r6)
            if (r1 <= 0) goto L_0x00a3
            X.U5Q r0 = r3.A0A
            int r2 = r0.getPaddingTop()
            X.U5Q r0 = r3.A0A
            int r0 = r0.getPaddingBottom()
            int r2 = r2 + r0
            int r9 = r9 + r2
            r10 = r9
        L_0x00a3:
            int r1 = r1 + r10
            r11.getInputMethodMode()
            r0 = 1002(0x3ea, float:1.404E-42)
            r11.setWindowLayoutType(r0)
            boolean r0 = r11.isShowing()
            r6 = 1
            if (r0 == 0) goto L_0x00de
            android.view.View r0 = r3.A06
            boolean r0 = r0.isAttachedToWindow()
            if (r0 == 0) goto L_0x00d4
            int r15 = r3.A03
            if (r15 != r5) goto L_0x00d5
            r15 = -1
        L_0x00c0:
            r11.setOutsideTouchable(r6)
            android.view.View r12 = r3.A06
            int r13 = r3.A01
            int r14 = r3.A02
            if (r15 >= 0) goto L_0x00cc
            r15 = -1
        L_0x00cc:
            if (r1 >= 0) goto L_0x00cf
            r1 = -1
        L_0x00cf:
            r16 = r1
            r11.update(r12, r13, r14, r15, r16)
        L_0x00d4:
            return
        L_0x00d5:
            if (r15 != r4) goto L_0x00c0
            android.view.View r0 = r3.A06
            int r15 = r0.getWidth()
            goto L_0x00c0
        L_0x00de:
            int r0 = r3.A03
            if (r0 != r5) goto L_0x00f4
            r0 = -1
        L_0x00e3:
            r11.setWidth(r0)
            r11.setHeight(r1)
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 28
            if (r4 > r2) goto L_0x0109
            java.lang.reflect.Method r1 = A0N
            if (r1 == 0) goto L_0x010c
            goto L_0x00fd
        L_0x00f4:
            if (r0 != r4) goto L_0x00e3
            android.view.View r0 = r3.A06
            int r0 = r0.getWidth()
            goto L_0x00e3
        L_0x00fd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)     // Catch:{ Exception -> 0x010c }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ Exception -> 0x010c }
            r1.invoke(r11, r0)     // Catch:{ Exception -> 0x010c }
            goto L_0x010c
        L_0x0109:
            X.C18083VlD.A01(r11)
        L_0x010c:
            r11.setOutsideTouchable(r6)
            X.WBk r0 = r3.A0M
            r11.setTouchInterceptor(r0)
            boolean r0 = r3.A0F
            if (r0 == 0) goto L_0x011d
            boolean r0 = r3.A0E
            r11.setOverlapAnchor(r0)
        L_0x011d:
            if (r4 > r2) goto L_0x012d
            java.lang.reflect.Method r1 = A0O
            if (r1 == 0) goto L_0x013b
            android.graphics.Rect r0 = r3.A05     // Catch:{ Exception -> 0x0133 }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ Exception -> 0x0133 }
            r1.invoke(r11, r0)     // Catch:{ Exception -> 0x0133 }
            goto L_0x013b
        L_0x012d:
            android.graphics.Rect r0 = r3.A05
            X.C18083VlD.A00(r0, r11)
            goto L_0x013b
        L_0x0133:
            r2 = move-exception
            java.lang.String r1 = "ListPopupWindow"
            java.lang.String r0 = "Could not invoke setEpicenterBounds on PopupWindow"
            android.util.Log.e(r1, r0, r2)
        L_0x013b:
            android.view.View r4 = r3.A06
            int r2 = r3.A01
            int r1 = r3.A02
            int r0 = r3.A00
            r11.showAsDropDown(r4, r2, r1, r0)
            X.U5Q r0 = r3.A0A
            r0.setSelection(r5)
            boolean r0 = r3.A0D
            if (r0 == 0) goto L_0x0157
            X.U5Q r0 = r3.A0A
            boolean r0 = r0.isInTouchMode()
            if (r0 == 0) goto L_0x0160
        L_0x0157:
            X.U5Q r0 = r3.A0A
            if (r0 == 0) goto L_0x0160
            r0.A07 = r6
            r0.requestLayout()
        L_0x0160:
            boolean r0 = r3.A0D
            if (r0 != 0) goto L_0x00d4
            android.os.Handler r1 = r3.A0I
            X.WhP r0 = r3.A0L
            r1.post(r0)
            return
        L_0x016c:
            android.content.Context r0 = r3.A04
            android.util.DisplayMetrics r0 = X.AnonymousClass7TF.A0E(r0)
            int r2 = r0.widthPixels
            int r1 = r8.left
            int r0 = r8.right
            int r1 = r1 + r0
            int r2 = r2 - r1
            goto L_0x0088
        L_0x017c:
            r8.setEmpty()
            r9 = 0
            goto L_0x006f
        L_0x0182:
            X.U5Q r1 = new X.U5Q
            r1.<init>(r9, r6)
            goto L_0x0026
        L_0x0189:
            android.widget.PopupWindow r11 = r3.A09
            r11.getContentView()
            r10 = 0
            goto L_0x0057
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WDV.show():void");
    }

    public WDV(Context context, AttributeSet attributeSet, int i, int i2) {
        this.A04 = context;
        this.A0I = new Handler(context.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2Z3.A0E, i, i2);
        this.A01 = obtainStyledAttributes.getDimensionPixelOffset(0, 0);
        int dimensionPixelOffset = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.A02 = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.A0C = true;
        }
        obtainStyledAttributes.recycle();
        PopupWindow popupWindow = new PopupWindow(context, attributeSet, i, i2);
        2Yi A002 = 2Yi.A00(context, attributeSet, AnonymousClass2Z3.A0I, i, i2);
        TypedArray typedArray = A002.A02;
        if (typedArray.hasValue(2)) {
            popupWindow.setOverlapAnchor(typedArray.getBoolean(2, false));
        }
        popupWindow.setBackgroundDrawable(A002.A02(0));
        typedArray.recycle();
        this.A09 = popupWindow;
        popupWindow.setInputMethodMode(1);
    }
}
