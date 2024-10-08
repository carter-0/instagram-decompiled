package androidx.appcompat.widget;

import X.03D;
import X.AnonymousClass03B;
import X.AnonymousClass03K;
import X.AnonymousClass0fD;
import X.AnonymousClass2X5;
import X.AnonymousClass2Z3;
import X.AnonymousClass3Tj;
import X.AnonymousClass972;
import X.C13988Tno;
import X.C13989Tnp;
import X.C13990Tnq;
import X.C13991Tnr;
import X.C14161Tqz;
import X.C14708U2s;
import X.C14728U4w;
import X.C17914Vi5;
import X.C18887WAz;
import X.C18932WDk;
import X.C19900WhV;
import X.C20821Wzv;
import X.C20825Wzz;
import X.C20936X5e;
import X.C20939X5h;
import X.C3021161q;
import X.C66581MXm;
import X.DbS;
import X.SN3;
import X.U3h;
import X.U5l;
import X.W0U;
import X.WDG;
import X.WDM;
import X.WDS;
import X.WDU;
import X.WDZ;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.customview.view.AbsSavedState;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Iterator;

public class Toolbar extends ViewGroup implements AnonymousClass03B {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public View A08;
    public ImageButton A09;
    public ImageView A0A;
    public TextView A0B;
    public TextView A0C;
    public AnonymousClass2X5 A0D;
    public ActionMenuView A0E;
    public C17914Vi5 A0F;
    public WDS A0G;
    public C20825Wzz A0H;
    public CharSequence A0I;
    public CharSequence A0J;
    public ArrayList A0K;
    public boolean A0L;
    public int A0M;
    public int A0N;
    public int A0O;
    public int A0P;
    public Context A0Q;
    public ColorStateList A0R;
    public ColorStateList A0S;
    public Drawable A0T;
    public ImageButton A0U;
    public OnBackInvokedCallback A0V;
    public OnBackInvokedDispatcher A0W;
    public C20936X5e A0X;
    public WDU A0Y;
    public WDZ A0Z;
    public CharSequence A0a;
    public boolean A0b;
    public boolean A0c;
    public boolean A0d;
    public final 03D A0e;
    public final Runnable A0f;
    public final ArrayList A0g;
    public final C20821Wzv A0h;
    public final ArrayList A0i;
    public final int[] A0j;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Toolbar(android.content.Context r15, android.util.AttributeSet r16, int r17) {
        /*
            r14 = this;
            r10 = r14
            r7 = r15
            r9 = r16
            r12 = r17
            r14.<init>(r15, r9, r12)
            r0 = 8388627(0x800013, float:1.175497E-38)
            r14.A01 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r14.A0i = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r14.A0g = r0
            r1 = 2
            int[] r0 = new int[r1]
            r14.A0j = r0
            X.WhU r2 = new X.WhU
            r2.<init>(r14)
            X.03D r0 = new X.03D
            r0.<init>(r2)
            r14.A0e = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r14.A0K = r0
            X.WDX r0 = new X.WDX
            r0.<init>(r14)
            r14.A0h = r0
            X.WhW r0 = new X.WhW
            r0.<init>(r14)
            r14.A0f = r0
            android.content.Context r3 = r14.getContext()
            int[] r11 = X.AnonymousClass2Z3.A0O
            r13 = 0
            X.2Yi r2 = X.2Yi.A00(r3, r9, r11, r12, r13)
            android.content.res.TypedArray r8 = r2.A02
            X.03v.A06(r7, r8, r9, r10, r11, r12, r13)
            r0 = 28
            int r0 = r8.getResourceId(r0, r13)
            r14.A07 = r0
            r0 = 19
            int r0 = r8.getResourceId(r0, r13)
            r14.A02 = r0
            int r0 = r14.A01
            int r0 = r8.getInteger(r13, r0)
            r14.A01 = r0
            r0 = 48
            int r0 = r8.getInteger(r1, r0)
            r14.A00 = r0
            r0 = 22
            int r4 = r8.getDimensionPixelOffset(r0, r13)
            r1 = 27
            boolean r0 = r8.hasValue(r1)
            if (r0 == 0) goto L_0x0084
            int r4 = r8.getDimensionPixelOffset(r1, r4)
        L_0x0084:
            r14.A03 = r4
            r14.A06 = r4
            r14.A04 = r4
            r14.A05 = r4
            r0 = 25
            r1 = -1
            int r0 = r8.getDimensionPixelOffset(r0, r1)
            if (r0 < 0) goto L_0x0097
            r14.A05 = r0
        L_0x0097:
            r0 = 24
            int r0 = r8.getDimensionPixelOffset(r0, r1)
            if (r0 < 0) goto L_0x00a1
            r14.A04 = r0
        L_0x00a1:
            r0 = 26
            int r0 = r8.getDimensionPixelOffset(r0, r1)
            if (r0 < 0) goto L_0x00ab
            r14.A06 = r0
        L_0x00ab:
            r0 = 23
            int r0 = r8.getDimensionPixelOffset(r0, r1)
            if (r0 < 0) goto L_0x00b5
            r14.A03 = r0
        L_0x00b5:
            r0 = 13
            int r0 = r8.getDimensionPixelSize(r0, r1)
            r14.A0O = r0
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = 9
            int r7 = r8.getDimensionPixelOffset(r0, r6)
            r0 = 5
            int r5 = r8.getDimensionPixelOffset(r0, r6)
            r0 = 7
            int r4 = r8.getDimensionPixelSize(r0, r13)
            r0 = 8
            int r1 = r8.getDimensionPixelSize(r0, r13)
            X.Vi5 r0 = r14.A0F
            if (r0 != 0) goto L_0x00e0
            X.Vi5 r0 = new X.Vi5
            r0.<init>()
            r14.A0F = r0
        L_0x00e0:
            r0.A06 = r13
            if (r4 == r6) goto L_0x00e8
            r0.A01 = r4
            r0.A03 = r4
        L_0x00e8:
            if (r1 == r6) goto L_0x00ee
            r0.A02 = r1
            r0.A04 = r1
        L_0x00ee:
            if (r7 != r6) goto L_0x00f2
            if (r5 == r6) goto L_0x00f5
        L_0x00f2:
            r0.A00(r7, r5)
        L_0x00f5:
            r0 = 10
            int r0 = r8.getDimensionPixelOffset(r0, r6)
            r14.A0N = r0
            r0 = 6
            int r0 = r8.getDimensionPixelOffset(r0, r6)
            r14.A0M = r0
            r0 = 4
            android.graphics.drawable.Drawable r0 = r2.A02(r0)
            r14.A0T = r0
            r0 = 3
            java.lang.CharSequence r0 = r8.getText(r0)
            r14.A0a = r0
            r0 = 21
            java.lang.CharSequence r1 = r8.getText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0121
            r14.setTitle((java.lang.CharSequence) r1)
        L_0x0121:
            r0 = 18
            java.lang.CharSequence r1 = r8.getText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0130
            r14.setSubtitle((java.lang.CharSequence) r1)
        L_0x0130:
            r14.A0Q = r3
            r0 = 17
            int r0 = r8.getResourceId(r0, r13)
            r14.setPopupTheme(r0)
            r0 = 16
            android.graphics.drawable.Drawable r0 = r2.A02(r0)
            if (r0 == 0) goto L_0x0146
            r14.setNavigationIcon((android.graphics.drawable.Drawable) r0)
        L_0x0146:
            r0 = 15
            java.lang.CharSequence r1 = r8.getText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x0155
            r14.setNavigationContentDescription((java.lang.CharSequence) r1)
        L_0x0155:
            r0 = 11
            android.graphics.drawable.Drawable r0 = r2.A02(r0)
            if (r0 == 0) goto L_0x0160
            r14.setLogo((android.graphics.drawable.Drawable) r0)
        L_0x0160:
            r0 = 12
            java.lang.CharSequence r1 = r8.getText(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r1)
            if (r0 != 0) goto L_0x016f
            r14.setLogoDescription((java.lang.CharSequence) r1)
        L_0x016f:
            r1 = 29
            boolean r0 = r8.hasValue(r1)
            if (r0 == 0) goto L_0x017e
            android.content.res.ColorStateList r0 = r2.A01(r1)
            r14.setTitleTextColor((android.content.res.ColorStateList) r0)
        L_0x017e:
            r1 = 20
            boolean r0 = r8.hasValue(r1)
            if (r0 == 0) goto L_0x018d
            android.content.res.ColorStateList r0 = r2.A01(r1)
            r14.setSubtitleTextColor((android.content.res.ColorStateList) r0)
        L_0x018d:
            r1 = 14
            boolean r0 = r8.hasValue(r1)
            if (r0 == 0) goto L_0x01a4
            int r2 = r8.getResourceId(r1, r13)
            android.view.MenuInflater r1 = r14.getMenuInflater()
            android.view.Menu r0 = r14.getMenu()
            r1.inflate(r2, r0)
        L_0x01a4:
            r8.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public class SavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C14161Tqz(1);
        public int A00;
        public boolean A01;

        public final void writeToParcel(Parcel parcel, int i) {
            Toolbar.super.writeToParcel(parcel, i);
            parcel.writeInt(this.A00);
            parcel.writeInt(this.A01 ? 1 : 0);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.ViewGroup$MarginLayoutParams, X.U3h] */
    /* JADX WARNING: type inference failed for: r1v1, types: [android.view.ViewGroup$MarginLayoutParams, X.U5l, X.U3h] */
    /* JADX WARNING: type inference failed for: r1v2, types: [android.view.ViewGroup$MarginLayoutParams, X.U3h] */
    /* JADX WARNING: type inference failed for: r1v4, types: [android.view.ViewGroup$MarginLayoutParams, X.U5l, X.U3h] */
    public static final U5l A04(ViewGroup.LayoutParams layoutParams) {
        int i;
        U5l u5l;
        if (layoutParams instanceof U5l) {
            U5l u5l2 = (U5l) layoutParams;
            ? marginLayoutParams = new ViewGroup.MarginLayoutParams(u5l2);
            marginLayoutParams.A00 = 0;
            marginLayoutParams.A00 = u5l2.A00;
            marginLayoutParams.A00 = 0;
            i = u5l2.A00;
            u5l = marginLayoutParams;
        } else if (layoutParams instanceof U3h) {
            U3h u3h = (U3h) layoutParams;
            ? marginLayoutParams2 = new ViewGroup.MarginLayoutParams(u3h);
            marginLayoutParams2.A00 = 0;
            marginLayoutParams2.A00 = u3h.A00;
            i = 0;
            u5l = marginLayoutParams2;
        } else if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams3 = (ViewGroup.MarginLayoutParams) layoutParams;
            ? marginLayoutParams4 = new ViewGroup.MarginLayoutParams(marginLayoutParams3);
            marginLayoutParams4.A00 = 0;
            marginLayoutParams4.A00 = 0;
            marginLayoutParams4.leftMargin = marginLayoutParams3.leftMargin;
            marginLayoutParams4.topMargin = marginLayoutParams3.topMargin;
            marginLayoutParams4.rightMargin = marginLayoutParams3.rightMargin;
            marginLayoutParams4.bottomMargin = marginLayoutParams3.bottomMargin;
            return marginLayoutParams4;
        } else {
            ? marginLayoutParams5 = new ViewGroup.MarginLayoutParams(layoutParams);
            i = 0;
            marginLayoutParams5.A00 = 0;
            u5l = marginLayoutParams5;
        }
        u5l.A00 = i;
        return u5l;
    }

    private void A06() {
        if (this.A0E == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext(), (AttributeSet) null);
            this.A0E = actionMenuView;
            actionMenuView.setPopupTheme(this.A0P);
            ActionMenuView actionMenuView2 = this.A0E;
            actionMenuView2.A05 = this.A0h;
            actionMenuView2.setMenuCallbacks(this.A0X, new WDM(this));
            U5l u5l = new U5l();
            u5l.A00 = 8388613 | (this.A00 & 112);
            this.A0E.setLayoutParams(u5l);
            A09(this.A0E, false);
        }
    }

    private void A07() {
        if (this.A0U == null) {
            this.A0U = new C14728U4w(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            U5l u5l = new U5l();
            u5l.A00 = 8388611 | (this.A00 & 112);
            this.A0U.setLayoutParams(u5l);
        }
    }

    private boolean A0C(View view) {
        if (view == null || view.getParent() != this || view.getVisibility() == 8) {
            return false;
        }
        return true;
    }

    private ArrayList getCurrentMenuItems() {
        ArrayList arrayList = new ArrayList();
        Menu menu = getMenu();
        for (int i = 0; i < menu.size(); i++) {
            arrayList.add(menu.getItem(i));
        }
        return arrayList;
    }

    public final void A0D() {
        if (this.A09 == null) {
            C14728U4w u4w = new C14728U4w(getContext(), (AttributeSet) null, R.attr.toolbarNavigationButtonStyle);
            this.A09 = u4w;
            u4w.setImageDrawable(this.A0T);
            this.A09.setContentDescription(this.A0a);
            U5l u5l = new U5l();
            u5l.A00 = 8388611 | (this.A00 & 112);
            u5l.A00 = 2;
            this.A09.setLayoutParams(u5l);
            this.A09.setOnClickListener(new C18887WAz(this, 2));
        }
    }

    public final void A0E() {
        Iterator it = this.A0K.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        Menu menu = getMenu();
        ArrayList currentMenuItems = getCurrentMenuItems();
        this.A0e.A01(menu, getMenuInflater());
        ArrayList currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.A0K = currentMenuItems2;
    }

    public final void A0F() {
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher A002 = W0U.A00(this);
            WDS wds = this.A0G;
            if (wds == null || wds.A01 == null || A002 == null || !isAttachedToWindow() || !this.A0b) {
                OnBackInvokedDispatcher onBackInvokedDispatcher = this.A0W;
                if (onBackInvokedDispatcher != null) {
                    W0U.A03(onBackInvokedDispatcher, this.A0V);
                    A002 = null;
                } else {
                    return;
                }
            } else if (this.A0W == null) {
                WDG wdg = this.A0V;
                if (wdg == null) {
                    wdg = W0U.A01(new C19900WhV(this));
                    this.A0V = wdg;
                }
                W0U.A02(A002, wdg);
            } else {
                return;
            }
            this.A0W = A002;
        }
    }

    public final void addMenuProvider(AnonymousClass03K r3) {
        03D r1 = this.A0e;
        r1.A02.add(r3);
        r1.A00.run();
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new U5l();
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.A09;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.A09;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        C17914Vi5 vi5 = this.A0F;
        if (vi5 == null) {
            return 0;
        }
        if (vi5.A07) {
            return vi5.A03;
        }
        return vi5.A04;
    }

    public int getContentInsetEndWithActions() {
        int i = this.A0M;
        if (i == Integer.MIN_VALUE) {
            return getContentInsetEnd();
        }
        return i;
    }

    public int getContentInsetLeft() {
        C17914Vi5 vi5 = this.A0F;
        if (vi5 != null) {
            return vi5.A03;
        }
        return 0;
    }

    public int getContentInsetRight() {
        C17914Vi5 vi5 = this.A0F;
        if (vi5 != null) {
            return vi5.A04;
        }
        return 0;
    }

    public int getContentInsetStart() {
        C17914Vi5 vi5 = this.A0F;
        if (vi5 == null) {
            return 0;
        }
        if (vi5.A07) {
            return vi5.A04;
        }
        return vi5.A03;
    }

    public int getContentInsetStartWithNavigation() {
        int i = this.A0N;
        if (i == Integer.MIN_VALUE) {
            return getContentInsetStart();
        }
        return i;
    }

    public int getCurrentContentInsetEnd() {
        C18932WDk wDk;
        ActionMenuView actionMenuView = this.A0E;
        if (actionMenuView == null || (wDk = actionMenuView.A03) == null || !wDk.hasVisibleItems()) {
            return getContentInsetEnd();
        }
        return Math.max(getContentInsetEnd(), Math.max(this.A0M, 0));
    }

    public Drawable getLogo() {
        ImageView imageView = this.A0A;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.A0A;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public View getNavButtonView() {
        return this.A0U;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.A0U;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.A0U;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public WDU getOuterActionMenuPresenter() {
        return this.A0Y;
    }

    public Context getPopupContext() {
        return this.A0Q;
    }

    public int getPopupTheme() {
        return this.A0P;
    }

    public CharSequence getSubtitle() {
        return this.A0I;
    }

    public final TextView getSubtitleTextView() {
        return this.A0B;
    }

    public CharSequence getTitle() {
        return this.A0J;
    }

    public int getTitleMarginBottom() {
        return this.A03;
    }

    public int getTitleMarginEnd() {
        return this.A04;
    }

    public int getTitleMarginStart() {
        return this.A05;
    }

    public int getTitleMarginTop() {
        return this.A06;
    }

    public final TextView getTitleTextView() {
        return this.A0C;
    }

    public C20939X5h getWrapper() {
        WDZ wdz = this.A0Z;
        if (wdz != null) {
            return wdz;
        }
        WDZ wdz2 = new WDZ(this, true);
        this.A0Z = wdz2;
        return wdz2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0272 A[LOOP:1: B:99:0x0270->B:100:0x0272, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x028f A[LOOP:2: B:102:0x028d->B:103:0x028f, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x02cb  */
    /* JADX WARNING: Removed duplicated region for block: B:111:0x02d7 A[LOOP:3: B:110:0x02d5->B:111:0x02d7, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0121  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0190 A[LOOP:0: B:64:0x018e->B:65:0x0190, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01a3  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x022c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onLayout(boolean r22, int r23, int r24, int r25, int r26) {
        /*
            r21 = this;
            r8 = r21
            int r1 = r8.getLayoutDirection()
            r0 = 1
            r5 = 0
            boolean r20 = X.AnonymousClass7TF.A1S(r1, r0)
            int r19 = r8.getWidth()
            int r3 = r8.getHeight()
            int r10 = r8.getPaddingLeft()
            int r18 = r8.getPaddingRight()
            int r1 = r8.getPaddingTop()
            int r17 = r8.getPaddingBottom()
            int r11 = r19 - r18
            int[] r7 = r8.A0j
            r7[r0] = r5
            r7[r5] = r5
            int r0 = r8.getMinimumHeight()
            if (r0 < 0) goto L_0x0264
            int r2 = r26 - r24
            int r9 = java.lang.Math.min(r0, r2)
        L_0x0038:
            android.widget.ImageButton r0 = r8.A0U
            boolean r0 = r8.A0C(r0)
            if (r0 == 0) goto L_0x0260
            android.widget.ImageButton r0 = r8.A0U
            if (r20 == 0) goto L_0x025b
            int r12 = r8.A02(r0, r7, r11, r9)
            r6 = r10
        L_0x0049:
            android.widget.ImageButton r0 = r8.A09
            boolean r0 = r8.A0C(r0)
            if (r0 == 0) goto L_0x0059
            android.widget.ImageButton r0 = r8.A09
            if (r20 == 0) goto L_0x0255
            int r12 = r8.A02(r0, r7, r12, r9)
        L_0x0059:
            androidx.appcompat.widget.ActionMenuView r0 = r8.A0E
            boolean r0 = r8.A0C(r0)
            if (r0 == 0) goto L_0x0069
            androidx.appcompat.widget.ActionMenuView r0 = r8.A0E
            if (r20 == 0) goto L_0x024f
            int r6 = r8.A01(r0, r7, r6, r9)
        L_0x0069:
            int r4 = r8.getCurrentContentInsetLeft()
            int r2 = r8.getCurrentContentInsetRight()
            int r0 = X.C13988Tno.A07(r4, r6, r5)
            r7[r5] = r0
            int r0 = r11 - r12
            int r0 = X.C13988Tno.A07(r2, r0, r5)
            r16 = 1
            r7[r16] = r0
            int r6 = java.lang.Math.max(r6, r4)
            int r11 = r11 - r2
            int r11 = java.lang.Math.min(r12, r11)
            android.view.View r0 = r8.A08
            boolean r0 = r8.A0C(r0)
            if (r0 == 0) goto L_0x009a
            android.view.View r0 = r8.A08
            if (r20 == 0) goto L_0x0249
            int r11 = r8.A02(r0, r7, r11, r9)
        L_0x009a:
            android.widget.ImageView r0 = r8.A0A
            boolean r0 = r8.A0C(r0)
            if (r0 == 0) goto L_0x00aa
            android.widget.ImageView r0 = r8.A0A
            if (r20 == 0) goto L_0x0243
            int r11 = r8.A02(r0, r7, r11, r9)
        L_0x00aa:
            android.widget.TextView r0 = r8.A0C
            boolean r15 = r8.A0C(r0)
            android.widget.TextView r0 = r8.A0B
            boolean r14 = r8.A0C(r0)
            if (r15 == 0) goto L_0x00ca
            android.widget.TextView r0 = r8.A0C
            android.view.ViewGroup$MarginLayoutParams r2 = X.DbS.A0D(r0)
            int r5 = r2.topMargin
            android.widget.TextView r0 = r8.A0C
            int r0 = r0.getMeasuredHeight()
            int r5 = r5 + r0
            int r0 = r2.bottomMargin
            int r5 = r5 + r0
        L_0x00ca:
            if (r14 == 0) goto L_0x00df
            android.widget.TextView r0 = r8.A0B
            android.view.ViewGroup$MarginLayoutParams r4 = X.DbS.A0D(r0)
            int r2 = r4.topMargin
            android.widget.TextView r0 = r8.A0B
            int r0 = r0.getMeasuredHeight()
            int r2 = r2 + r0
            int r0 = r4.bottomMargin
            int r2 = r2 + r0
            int r5 = r5 + r2
        L_0x00df:
            if (r15 != 0) goto L_0x023c
            if (r14 == 0) goto L_0x0182
            android.widget.TextView r2 = r8.A0B
        L_0x00e5:
            android.widget.TextView r0 = r8.A0B
        L_0x00e7:
            android.view.ViewGroup$MarginLayoutParams r13 = X.DbS.A0D(r2)
            android.view.ViewGroup$MarginLayoutParams r12 = X.DbS.A0D(r0)
            if (r15 == 0) goto L_0x00f9
            android.widget.TextView r0 = r8.A0C
            int r0 = r0.getMeasuredWidth()
            if (r0 > 0) goto L_0x0103
        L_0x00f9:
            if (r14 == 0) goto L_0x0238
            android.widget.TextView r0 = r8.A0B
            int r0 = r0.getMeasuredWidth()
            if (r0 <= 0) goto L_0x0238
        L_0x0103:
            int r0 = r8.A01
            r2 = r0 & 112(0x70, float:1.57E-43)
            r0 = 48
            if (r2 == r0) goto L_0x022c
            r0 = 80
            if (r2 == r0) goto L_0x0220
            int r0 = r3 - r1
            int r0 = r0 - r17
            int r0 = r0 - r5
            int r4 = r0 / 2
            int r2 = r13.topMargin
            int r0 = r8.A06
            int r2 = r2 + r0
            if (r4 >= r2) goto L_0x0208
            r4 = r2
        L_0x011e:
            int r1 = r1 + r4
        L_0x011f:
            if (r20 == 0) goto L_0x01a3
            if (r16 == 0) goto L_0x01a1
            int r4 = r8.A05
        L_0x0125:
            r3 = 1
            r0 = r7[r3]
            int r4 = r4 - r0
            r2 = 0
            int r0 = java.lang.Math.max(r2, r4)
            int r11 = r11 - r0
            int r0 = -r4
            int r0 = java.lang.Math.max(r2, r0)
            r7[r3] = r0
            if (r15 == 0) goto L_0x019f
            android.widget.TextView r0 = r8.A0C
            android.view.ViewGroup$MarginLayoutParams r3 = X.DbS.A0D(r0)
            android.widget.TextView r0 = r8.A0C
            int r0 = r0.getMeasuredWidth()
            int r4 = r11 - r0
            android.widget.TextView r0 = r8.A0C
            int r2 = r0.getMeasuredHeight()
            int r2 = r2 + r1
            android.widget.TextView r0 = r8.A0C
            r0.layout(r4, r1, r11, r2)
            int r0 = r8.A04
            int r4 = r4 - r0
            int r0 = r3.bottomMargin
            int r1 = r2 + r0
        L_0x0159:
            if (r14 == 0) goto L_0x019d
            android.widget.TextView r0 = r8.A0B
            android.view.ViewGroup$MarginLayoutParams r0 = X.DbS.A0D(r0)
            int r0 = r0.topMargin
            int r1 = r1 + r0
            android.widget.TextView r0 = r8.A0B
            int r0 = r0.getMeasuredWidth()
            int r3 = r11 - r0
            android.widget.TextView r0 = r8.A0B
            int r2 = r0.getMeasuredHeight()
            int r2 = r2 + r1
            android.widget.TextView r0 = r8.A0B
            r0.layout(r3, r1, r11, r2)
            int r0 = r8.A04
            int r0 = r11 - r0
        L_0x017c:
            if (r16 == 0) goto L_0x0182
            int r11 = java.lang.Math.min(r4, r0)
        L_0x0182:
            r5 = 0
        L_0x0183:
            java.util.ArrayList r4 = r8.A0i
            r0 = 3
            r8.A0A(r4, r0)
            int r2 = r4.size()
            r1 = 0
        L_0x018e:
            if (r1 >= r2) goto L_0x0267
            java.lang.Object r0 = r4.get(r1)
            android.view.View r0 = (android.view.View) r0
            int r6 = r8.A01(r0, r7, r6, r9)
            int r1 = r1 + 1
            goto L_0x018e
        L_0x019d:
            r0 = r11
            goto L_0x017c
        L_0x019f:
            r4 = r11
            goto L_0x0159
        L_0x01a1:
            r4 = 0
            goto L_0x0125
        L_0x01a3:
            if (r16 == 0) goto L_0x0205
            int r2 = r8.A05
            r5 = 0
        L_0x01a8:
            r0 = r7[r5]
            int r2 = r2 - r0
            int r0 = java.lang.Math.max(r5, r2)
            int r6 = r6 + r0
            int r0 = -r2
            int r0 = java.lang.Math.max(r5, r0)
            r7[r5] = r0
            if (r15 == 0) goto L_0x0203
            android.widget.TextView r0 = r8.A0C
            android.view.ViewGroup$MarginLayoutParams r3 = X.DbS.A0D(r0)
            android.widget.TextView r0 = r8.A0C
            int r4 = r0.getMeasuredWidth()
            int r4 = r4 + r6
            android.widget.TextView r0 = r8.A0C
            int r2 = r0.getMeasuredHeight()
            int r2 = r2 + r1
            android.widget.TextView r0 = r8.A0C
            r0.layout(r6, r1, r4, r2)
            int r0 = r8.A04
            int r4 = r4 + r0
            int r0 = r3.bottomMargin
            int r1 = r2 + r0
        L_0x01d9:
            if (r14 == 0) goto L_0x0201
            android.widget.TextView r0 = r8.A0B
            android.view.ViewGroup$MarginLayoutParams r0 = X.DbS.A0D(r0)
            int r0 = r0.topMargin
            int r1 = r1 + r0
            android.widget.TextView r0 = r8.A0B
            int r3 = r0.getMeasuredWidth()
            int r3 = r3 + r6
            android.widget.TextView r0 = r8.A0B
            int r2 = r0.getMeasuredHeight()
            int r2 = r2 + r1
            android.widget.TextView r0 = r8.A0B
            r0.layout(r6, r1, r3, r2)
            int r0 = r8.A04
            int r3 = r3 + r0
        L_0x01fa:
            if (r16 == 0) goto L_0x0183
            int r6 = java.lang.Math.max(r4, r3)
            goto L_0x0183
        L_0x0201:
            r3 = r6
            goto L_0x01fa
        L_0x0203:
            r4 = r6
            goto L_0x01d9
        L_0x0205:
            r5 = 0
            r2 = 0
            goto L_0x01a8
        L_0x0208:
            int r3 = r3 - r17
            int r3 = r3 - r5
            int r3 = r3 - r4
            int r3 = r3 - r1
            int r0 = r13.bottomMargin
            int r2 = r8.A03
            int r0 = r0 + r2
            if (r3 >= r0) goto L_0x011e
            int r0 = r12.bottomMargin
            int r0 = r0 + r2
            int r0 = r0 - r3
            int r4 = r4 - r0
            r0 = 0
            int r4 = java.lang.Math.max(r0, r4)
            goto L_0x011e
        L_0x0220:
            int r3 = r3 - r17
            int r0 = r12.bottomMargin
            int r3 = r3 - r0
            int r0 = r8.A03
            int r3 = r3 - r0
            int r1 = r3 - r5
            goto L_0x011f
        L_0x022c:
            int r1 = r8.getPaddingTop()
            int r0 = r13.topMargin
            int r1 = r1 + r0
            int r0 = r8.A06
            int r1 = r1 + r0
            goto L_0x011f
        L_0x0238:
            r16 = 0
            goto L_0x0103
        L_0x023c:
            android.widget.TextView r2 = r8.A0C
            if (r14 != 0) goto L_0x00e5
            r0 = r2
            goto L_0x00e7
        L_0x0243:
            int r6 = r8.A01(r0, r7, r6, r9)
            goto L_0x00aa
        L_0x0249:
            int r6 = r8.A01(r0, r7, r6, r9)
            goto L_0x009a
        L_0x024f:
            int r12 = r8.A02(r0, r7, r12, r9)
            goto L_0x0069
        L_0x0255:
            int r6 = r8.A01(r0, r7, r6, r9)
            goto L_0x0059
        L_0x025b:
            int r6 = r8.A01(r0, r7, r10, r9)
            goto L_0x0261
        L_0x0260:
            r6 = r10
        L_0x0261:
            r12 = r11
            goto L_0x0049
        L_0x0264:
            r9 = 0
            goto L_0x0038
        L_0x0267:
            r0 = 5
            r8.A0A(r4, r0)
            int r2 = r4.size()
            r1 = 0
        L_0x0270:
            if (r1 >= r2) goto L_0x027f
            java.lang.Object r0 = r4.get(r1)
            android.view.View r0 = (android.view.View) r0
            int r11 = r8.A02(r0, r7, r11, r9)
            int r1 = r1 + 1
            goto L_0x0270
        L_0x027f:
            r0 = 1
            r8.A0A(r4, r0)
            r2 = r7[r5]
            r1 = r7[r0]
            int r13 = r4.size()
            r12 = 0
            r3 = 0
        L_0x028d:
            if (r12 >= r13) goto L_0x02be
            java.lang.Object r14 = r4.get(r12)
            android.view.View r14 = (android.view.View) r14
            android.view.ViewGroup$MarginLayoutParams r15 = X.DbS.A0D(r14)
            int r0 = r15.leftMargin
            int r0 = r0 - r2
            int r15 = r15.rightMargin
            int r15 = r15 - r1
            int r17 = java.lang.Math.max(r5, r0)
            int r16 = java.lang.Math.max(r5, r15)
            int r0 = -r0
            int r2 = java.lang.Math.max(r5, r0)
            int r0 = -r15
            int r1 = java.lang.Math.max(r5, r0)
            int r0 = r14.getMeasuredWidth()
            int r17 = r17 + r0
            int r17 = r17 + r16
            int r3 = r3 + r17
            int r12 = r12 + 1
            goto L_0x028d
        L_0x02be:
            int r19 = r19 - r10
            int r19 = r19 - r18
            int r0 = r19 / 2
            int r10 = r10 + r0
            int r0 = r3 / 2
            int r10 = r10 - r0
            int r3 = r3 + r10
            if (r10 < r6) goto L_0x02d1
            r6 = r10
            if (r3 <= r11) goto L_0x02d1
            int r3 = r3 - r11
            int r6 = r10 - r3
        L_0x02d1:
            int r1 = r4.size()
        L_0x02d5:
            if (r5 >= r1) goto L_0x02e4
            java.lang.Object r0 = r4.get(r5)
            android.view.View r0 = (android.view.View) r0
            int r6 = r8.A01(r0, r7, r6, r9)
            int r5 = r5 + 1
            goto L_0x02d5
        L_0x02e4:
            r4.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onLayout(boolean, int, int, int, int):void");
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int[] iArr = this.A0j;
        char A1V = C66581MXm.A1V(getLayoutDirection());
        int i9 = 0;
        char c = A1V ^ 1;
        int i10 = i;
        int i11 = i2;
        if (A0C(this.A0U)) {
            A08(this.A0U, i10, 0, i11, this.A0O);
            i3 = C13991Tnr.A01(this.A0U, this.A0U.getMeasuredWidth());
            int measuredHeight = this.A0U.getMeasuredHeight();
            ViewGroup.MarginLayoutParams A0D2 = DbS.A0D(this.A0U);
            i4 = Math.max(0, measuredHeight + A0D2.topMargin + A0D2.bottomMargin);
            i5 = C13988Tno.A0A(this.A0U, 0);
        } else {
            i3 = 0;
            i4 = 0;
            i5 = 0;
        }
        if (A0C(this.A09)) {
            A08(this.A09, i10, 0, i11, this.A0O);
            i3 = C13991Tnr.A01(this.A09, this.A09.getMeasuredWidth());
            int measuredHeight2 = this.A09.getMeasuredHeight();
            ViewGroup.MarginLayoutParams A0D3 = DbS.A0D(this.A09);
            i4 = Math.max(i4, measuredHeight2 + A0D3.topMargin + A0D3.bottomMargin);
            i5 = C13988Tno.A0A(this.A09, i5);
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int max = Math.max(currentContentInsetStart, i3);
        iArr[A1V] = C13988Tno.A07(currentContentInsetStart, i3, 0);
        if (A0C(this.A0E)) {
            A08(this.A0E, i10, max, i11, this.A0O);
            i6 = C13991Tnr.A01(this.A0E, this.A0E.getMeasuredWidth());
            int measuredHeight3 = this.A0E.getMeasuredHeight();
            ViewGroup.MarginLayoutParams A0D4 = DbS.A0D(this.A0E);
            i4 = Math.max(i4, measuredHeight3 + A0D4.topMargin + A0D4.bottomMargin);
            i5 = C13988Tno.A0A(this.A0E, i5);
        } else {
            i6 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int max2 = max + Math.max(currentContentInsetEnd, i6);
        iArr[c] = C13988Tno.A07(currentContentInsetEnd, i6, 0);
        if (A0C(this.A08)) {
            max2 += A03(this.A08, iArr, i10, max2, i11, 0);
            int measuredHeight4 = this.A08.getMeasuredHeight();
            ViewGroup.MarginLayoutParams A0D5 = DbS.A0D(this.A08);
            i4 = Math.max(i4, measuredHeight4 + A0D5.topMargin + A0D5.bottomMargin);
            i5 = C13988Tno.A0A(this.A08, i5);
        }
        if (A0C(this.A0A)) {
            max2 += A03(this.A0A, iArr, i10, max2, i11, 0);
            int measuredHeight5 = this.A0A.getMeasuredHeight();
            ViewGroup.MarginLayoutParams A0D6 = DbS.A0D(this.A0A);
            i4 = Math.max(i4, measuredHeight5 + A0D6.topMargin + A0D6.bottomMargin);
            i5 = C13988Tno.A0A(this.A0A, i5);
        }
        int childCount = getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (((U5l) childAt.getLayoutParams()).A00 == 0 && A0C(childAt)) {
                max2 += A03(childAt, iArr, i10, max2, i11, 0);
                int measuredHeight6 = childAt.getMeasuredHeight();
                ViewGroup.MarginLayoutParams A0D7 = DbS.A0D(childAt);
                i4 = Math.max(i4, measuredHeight6 + A0D7.topMargin + A0D7.bottomMargin);
                i5 = C13988Tno.A0A(childAt, i5);
            }
        }
        int i13 = this.A06 + this.A03;
        int i14 = this.A05 + this.A04;
        if (A0C(this.A0C)) {
            A03(this.A0C, iArr, i10, max2 + i14, i11, i13);
            i7 = C13991Tnr.A01(this.A0C, this.A0C.getMeasuredWidth());
            int measuredHeight7 = this.A0C.getMeasuredHeight();
            ViewGroup.MarginLayoutParams A0D8 = DbS.A0D(this.A0C);
            i8 = measuredHeight7 + A0D8.topMargin + A0D8.bottomMargin;
            i5 = C13988Tno.A0A(this.A0C, i5);
        } else {
            i7 = 0;
            i8 = 0;
        }
        if (A0C(this.A0B)) {
            i7 = Math.max(i7, A03(this.A0B, iArr, i10, max2 + i14, i11, i8 + i13));
            int measuredHeight8 = this.A0B.getMeasuredHeight();
            ViewGroup.MarginLayoutParams A0D9 = DbS.A0D(this.A0B);
            i8 += measuredHeight8 + A0D9.topMargin + A0D9.bottomMargin;
            i5 = C13988Tno.A0A(this.A0B, i5);
        }
        int max3 = Math.max(i4, i8);
        int A0E2 = max2 + i7 + C13989Tnp.A0E(this);
        int A0H2 = max3 + C13989Tnp.A0H(this);
        int resolveSizeAndState = View.resolveSizeAndState(Math.max(A0E2, getSuggestedMinimumWidth()), i10, -16777216 & i5);
        int resolveSizeAndState2 = View.resolveSizeAndState(Math.max(A0H2, getSuggestedMinimumHeight()), i11, i5 << 16);
        if (this.A0L) {
            int childCount2 = getChildCount();
            int i15 = 0;
            while (true) {
                if (i15 >= childCount2) {
                    break;
                }
                View childAt2 = getChildAt(i15);
                if (A0C(childAt2) && childAt2.getMeasuredWidth() > 0 && childAt2.getMeasuredHeight() > 0) {
                    break;
                }
                i15++;
            }
        }
        i9 = resolveSizeAndState2;
        setMeasuredDimension(resolveSizeAndState, i9);
    }

    public final void onRestoreInstanceState(Parcelable parcelable) {
        C18932WDk wDk;
        MenuItem findItem;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.A00);
        ActionMenuView actionMenuView = this.A0E;
        if (actionMenuView != null) {
            wDk = actionMenuView.A03;
        } else {
            wDk = null;
        }
        int i = savedState.A00;
        if (!(i == 0 || this.A0G == null || wDk == null || (findItem = wDk.findItem(i)) == null)) {
            findItem.expandActionView();
        }
        if (savedState.A01) {
            Runnable runnable = this.A0f;
            removeCallbacks(runnable);
            post(runnable);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        if (r1 == false) goto L_0x0028;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.os.Parcelable onSaveInstanceState() {
        /*
            r3 = this;
            android.os.Parcelable$Creator r0 = androidx.appcompat.widget.Toolbar.SavedState.CREATOR
            android.os.Parcelable r0 = super.onSaveInstanceState()
            androidx.appcompat.widget.Toolbar$SavedState r2 = new androidx.appcompat.widget.Toolbar$SavedState
            r2.<init>(r0)
            X.WDS r0 = r3.A0G
            if (r0 == 0) goto L_0x0019
            X.WDm r0 = r0.A01
            if (r0 == 0) goto L_0x0019
            int r0 = r0.getItemId()
            r2.A00 = r0
        L_0x0019:
            androidx.appcompat.widget.ActionMenuView r0 = r3.A0E
            if (r0 == 0) goto L_0x0028
            X.WDU r0 = r0.A04
            if (r0 == 0) goto L_0x0028
            boolean r1 = r0.A03()
            r0 = 1
            if (r1 != 0) goto L_0x0029
        L_0x0028:
            r0 = 0
        L_0x0029:
            r2.A01 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onSaveInstanceState():android.os.Parcelable");
    }

    public final void removeMenuProvider(AnonymousClass03K r2) {
        this.A0e.A02(r2);
    }

    public void setBackInvokedCallbackEnabled(boolean z) {
        if (this.A0b != z) {
            this.A0b = z;
            A0F();
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            A0D();
            this.A09.setImageDrawable(drawable);
            return;
        }
        ImageButton imageButton = this.A09;
        if (imageButton != null) {
            imageButton.setImageDrawable(this.A0T);
        }
    }

    public void setCollapsible(boolean z) {
        this.A0L = z;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i) {
        if (i < 0) {
            i = AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        if (i != this.A0M) {
            this.A0M = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i) {
        if (i < 0) {
            i = AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        if (i != this.A0N) {
            this.A0N = i;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            ImageView imageView = this.A0A;
            if (imageView == null) {
                imageView = new C3021161q(getContext(), (AttributeSet) null, 0);
                this.A0A = imageView;
            }
            if (!A0B(imageView)) {
                A09(this.A0A, true);
            }
        } else {
            ImageView imageView2 = this.A0A;
            if (imageView2 != null && A0B(imageView2)) {
                removeView(this.A0A);
                this.A0g.remove(this.A0A);
            }
        }
        ImageView imageView3 = this.A0A;
        if (imageView3 != null) {
            imageView3.setImageDrawable(drawable);
        }
    }

    public void setMenu(C18932WDk wDk, WDU wdu) {
        if (wDk != null || this.A0E != null) {
            A06();
            C18932WDk wDk2 = this.A0E.A03;
            if (wDk2 != wDk) {
                if (wDk2 != null) {
                    wDk2.A0B(this.A0Y);
                    wDk2.A0B(this.A0G);
                }
                if (this.A0G == null) {
                    this.A0G = new WDS(this);
                }
                wdu.A0E = true;
                Context context = this.A0Q;
                if (wDk != null) {
                    wDk.A07(context, wdu);
                    wDk.A07(this.A0Q, this.A0G);
                } else {
                    wdu.CMm(context, (C18932WDk) null);
                    this.A0G.CMm(this.A0Q, (C18932WDk) null);
                    wdu.FKm(true);
                    this.A0G.FKm(true);
                }
                this.A0E.setPopupTheme(this.A0P);
                this.A0E.setPresenter(wdu);
                this.A0Y = wdu;
                A0F();
            }
        }
    }

    public void setMenuCallbacks(C20936X5e x5e, AnonymousClass2X5 r3) {
        this.A0X = x5e;
        this.A0D = r3;
        ActionMenuView actionMenuView = this.A0E;
        if (actionMenuView != null) {
            actionMenuView.setMenuCallbacks(x5e, r3);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            A07();
            if (!A0B(this.A0U)) {
                A09(this.A0U, true);
            }
        } else {
            ImageButton imageButton = this.A0U;
            if (imageButton != null && A0B(imageButton)) {
                removeView(this.A0U);
                this.A0g.remove(this.A0U);
            }
        }
        ImageButton imageButton2 = this.A0U;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setOnMenuItemClickListener(C20825Wzz wzz) {
        this.A0H = wzz;
    }

    public void setPopupTheme(int i) {
        Context contextThemeWrapper;
        if (this.A0P != i) {
            this.A0P = i;
            if (i == 0) {
                contextThemeWrapper = getContext();
            } else {
                contextThemeWrapper = new ContextThemeWrapper(getContext(), i);
            }
            this.A0Q = contextThemeWrapper;
        }
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.A0R = colorStateList;
        TextView textView = this.A0B;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitleMarginBottom(int i) {
        this.A03 = i;
        requestLayout();
    }

    public void setTitleMarginEnd(int i) {
        this.A04 = i;
        requestLayout();
    }

    public void setTitleMarginStart(int i) {
        this.A05 = i;
        requestLayout();
    }

    public void setTitleMarginTop(int i) {
        this.A06 = i;
        requestLayout();
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.A0S = colorStateList;
        TextView textView = this.A0C;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0029, code lost:
        if (r1 != 80) goto L_0x002b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private int A00(android.view.View r9, int r10) {
        /*
            r8 = this;
            android.view.ViewGroup$LayoutParams r6 = r9.getLayoutParams()
            X.U3h r6 = (X.U3h) r6
            int r7 = r9.getMeasuredHeight()
            r5 = 0
            if (r10 <= 0) goto L_0x0052
            int r0 = r7 - r10
            int r3 = r0 / 2
        L_0x0011:
            int r0 = r6.A00
            r1 = r0 & 112(0x70, float:1.57E-43)
            r0 = 16
            if (r1 == r0) goto L_0x002b
            r0 = 48
            if (r1 == r0) goto L_0x0054
            r2 = 80
            if (r1 == r2) goto L_0x0059
            int r0 = r8.A01
            r1 = r0 & 112(0x70, float:1.57E-43)
            r0 = 48
            if (r1 == r0) goto L_0x0054
            if (r1 == r2) goto L_0x0059
        L_0x002b:
            int r1 = r8.getPaddingTop()
            int r4 = r8.getPaddingBottom()
            int r3 = r8.getHeight()
            int r0 = r3 - r1
            int r0 = r0 - r4
            int r0 = r0 - r7
            int r2 = r0 / 2
            int r0 = r6.topMargin
            if (r2 >= r0) goto L_0x0044
            r2 = r0
        L_0x0042:
            int r1 = r1 + r2
            return r1
        L_0x0044:
            int r3 = r3 - r4
            int r3 = r3 - r7
            int r3 = r3 - r2
            int r3 = r3 - r1
            int r0 = r6.bottomMargin
            if (r3 >= r0) goto L_0x0042
            int r0 = r0 - r3
            int r2 = X.C13988Tno.A07(r2, r0, r5)
            goto L_0x0042
        L_0x0052:
            r3 = 0
            goto L_0x0011
        L_0x0054:
            int r1 = r8.getPaddingTop()
            goto L_0x0061
        L_0x0059:
            int r1 = X.C13989Tnp.A0F(r8)
            int r1 = r1 - r7
            int r0 = r6.bottomMargin
            int r1 = r1 - r0
        L_0x0061:
            int r1 = r1 - r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.A00(android.view.View, int):int");
    }

    private int A01(View view, int[] iArr, int i, int i2) {
        ViewGroup.MarginLayoutParams A0D2 = DbS.A0D(view);
        int i3 = A0D2.leftMargin - iArr[0];
        int max = i + Math.max(0, i3);
        iArr[0] = Math.max(0, -i3);
        int A002 = A00(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max, A002, max + measuredWidth, view.getMeasuredHeight() + A002);
        return max + measuredWidth + A0D2.rightMargin;
    }

    private int A02(View view, int[] iArr, int i, int i2) {
        ViewGroup.MarginLayoutParams A0D2 = DbS.A0D(view);
        int i3 = A0D2.rightMargin - iArr[1];
        int max = i - Math.max(0, i3);
        iArr[1] = Math.max(0, -i3);
        int A002 = A00(view, i2);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(max - measuredWidth, A002, max, view.getMeasuredHeight() + A002);
        return max - (measuredWidth + A0D2.leftMargin);
    }

    private int A03(View view, int[] iArr, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams A0D2 = DbS.A0D(view);
        int i5 = A0D2.leftMargin - iArr[0];
        int i6 = A0D2.rightMargin - iArr[1];
        int max = Math.max(0, i5) + Math.max(0, i6);
        iArr[0] = Math.max(0, -i5);
        iArr[1] = Math.max(0, -i6);
        view.measure(ViewGroup.getChildMeasureSpec(i, C13989Tnp.A0E(this) + max + i2, A0D2.width), ViewGroup.getChildMeasureSpec(i3, C13988Tno.A0B(A0D2, C13989Tnp.A0H(this)) + i4, A0D2.height));
        return view.getMeasuredWidth() + max;
    }

    private void A05() {
        A06();
        ActionMenuView actionMenuView = this.A0E;
        if (actionMenuView.A03 == null) {
            C18932WDk wDk = (C18932WDk) actionMenuView.getMenu();
            WDS wds = this.A0G;
            if (wds == null) {
                wds = new WDS(this);
                this.A0G = wds;
            }
            this.A0E.setExpandedActionViewsExclusive(true);
            wDk.A07(this.A0Q, wds);
            A0F();
        }
    }

    private void A08(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams A0D2 = DbS.A0D(view);
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i, C13989Tnp.A0E(this) + A0D2.leftMargin + A0D2.rightMargin + i2, A0D2.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i3, C13988Tno.A0B(A0D2, C13989Tnp.A0H(this)), A0D2.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i4 >= 0) {
            if (mode != 0) {
                i4 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i4);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i4, SN3.MAX_SIGNED_POWER_OF_TWO);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    private void A09(View view, boolean z) {
        U5l u5l;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            u5l = new U5l();
        } else if (!checkLayoutParams(layoutParams)) {
            u5l = A04(layoutParams);
        } else {
            u5l = (U5l) layoutParams;
        }
        u5l.A00 = 1;
        if (!z || this.A08 == null) {
            addView(view, u5l);
            return;
        }
        view.setLayoutParams(u5l);
        this.A0g.add(view);
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x004e A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0085 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0A(java.util.List r10, int r11) {
        /*
            r9 = this;
            int r0 = r9.getLayoutDirection()
            r7 = 0
            r6 = 1
            boolean r1 = X.AnonymousClass7TF.A1S(r0, r6)
            int r5 = r9.getChildCount()
            int r0 = r9.getLayoutDirection()
            int r8 = android.view.Gravity.getAbsoluteGravity(r11, r0)
            r10.clear()
            if (r1 == 0) goto L_0x0053
            int r5 = r5 - r6
        L_0x001c:
            if (r5 < 0) goto L_0x008a
            android.view.View r4 = r9.getChildAt(r5)
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            X.U5l r1 = (X.U5l) r1
            int r0 = r1.A00
            if (r0 != 0) goto L_0x004e
            boolean r0 = r9.A0C(r4)
            if (r0 == 0) goto L_0x004e
            int r0 = r1.A00
            int r3 = r9.getLayoutDirection()
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r3)
            r2 = r0 & 7
            if (r2 == r6) goto L_0x0051
            r1 = 3
            if (r2 == r1) goto L_0x0051
            r0 = 5
            if (r2 == r0) goto L_0x0051
            if (r3 != r6) goto L_0x0049
            r1 = 5
        L_0x0049:
            if (r1 != r8) goto L_0x004e
            r10.add(r4)
        L_0x004e:
            int r5 = r5 + -1
            goto L_0x001c
        L_0x0051:
            r1 = r2
            goto L_0x0049
        L_0x0053:
            if (r7 >= r5) goto L_0x008a
            android.view.View r4 = r9.getChildAt(r7)
            android.view.ViewGroup$LayoutParams r1 = r4.getLayoutParams()
            X.U5l r1 = (X.U5l) r1
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0085
            boolean r0 = r9.A0C(r4)
            if (r0 == 0) goto L_0x0085
            int r0 = r1.A00
            int r3 = r9.getLayoutDirection()
            int r0 = android.view.Gravity.getAbsoluteGravity(r0, r3)
            r2 = r0 & 7
            if (r2 == r6) goto L_0x0088
            r1 = 3
            if (r2 == r1) goto L_0x0088
            r0 = 5
            if (r2 == r0) goto L_0x0088
            if (r3 != r6) goto L_0x0080
            r1 = 5
        L_0x0080:
            if (r1 != r8) goto L_0x0085
            r10.add(r4)
        L_0x0085:
            int r7 = r7 + 1
            goto L_0x0053
        L_0x0088:
            r1 = r2
            goto L_0x0080
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.A0A(java.util.List, int):void");
    }

    private boolean A0B(View view) {
        if (view.getParent() == this || this.A0g.contains(view)) {
            return true;
        }
        return false;
    }

    private MenuInflater getMenuInflater() {
        return new C14708U2s(getContext());
    }

    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!super.checkLayoutParams(layoutParams) || !(layoutParams instanceof U5l)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, X.U5l, X.U3h] */
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ? marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.A00 = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AnonymousClass2Z3.A01);
        marginLayoutParams.A00 = obtainStyledAttributes.getInt(0, 0);
        obtainStyledAttributes.recycle();
        marginLayoutParams.A00 = 0;
        return marginLayoutParams;
    }

    public int getCurrentContentInsetLeft() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetEnd();
        }
        return getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        if (getLayoutDirection() == 1) {
            return getCurrentContentInsetStart();
        }
        return getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        Drawable navigationIcon = getNavigationIcon();
        int contentInsetStart = getContentInsetStart();
        if (navigationIcon != null) {
            return Math.max(contentInsetStart, Math.max(this.A0N, 0));
        }
        return contentInsetStart;
    }

    public Menu getMenu() {
        A05();
        return this.A0E.getMenu();
    }

    public Drawable getOverflowIcon() {
        A05();
        return this.A0E.getOverflowIcon();
    }

    public void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(2028022362);
        super.onAttachedToWindow();
        A0F();
        AnonymousClass0fD.A0D(651836385, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-1211236323);
        super.onDetachedFromWindow();
        removeCallbacks(this.A0f);
        A0F();
        AnonymousClass0fD.A0D(-1912923680, A062);
    }

    public final boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.A0c = false;
        }
        if (!this.A0c) {
            boolean onHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9) {
                if (!onHoverEvent) {
                    this.A0c = true;
                }
                return true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.A0c = false;
            return true;
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002a, code lost:
        if (r0 != Integer.MIN_VALUE) goto L_0x002c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onRtlPropertiesChanged(int r5) {
        /*
            r4 = this;
            super.onRtlPropertiesChanged(r5)
            X.Vi5 r3 = r4.A0F
            if (r3 != 0) goto L_0x000e
            X.Vi5 r3 = new X.Vi5
            r3.<init>()
            r4.A0F = r3
        L_0x000e:
            boolean r2 = X.C66581MXm.A1V(r5)
            boolean r0 = r3.A07
            if (r2 == r0) goto L_0x002e
            r3.A07 = r2
            boolean r0 = r3.A06
            if (r0 == 0) goto L_0x003a
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == 0) goto L_0x002f
            int r0 = r3.A00
            if (r0 != r1) goto L_0x0026
            int r0 = r3.A01
        L_0x0026:
            r3.A03 = r0
            int r0 = r3.A05
        L_0x002a:
            if (r0 == r1) goto L_0x003e
        L_0x002c:
            r3.A04 = r0
        L_0x002e:
            return
        L_0x002f:
            int r0 = r3.A05
            if (r0 != r1) goto L_0x0035
            int r0 = r3.A01
        L_0x0035:
            r3.A03 = r0
            int r0 = r3.A00
            goto L_0x002a
        L_0x003a:
            int r0 = r3.A01
            r3.A03 = r0
        L_0x003e:
            int r0 = r3.A02
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.Toolbar.onRtlPropertiesChanged(int):void");
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A052 = AnonymousClass0fD.A05(-1722082724);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.A0d = false;
        }
        if (!this.A0d) {
            boolean onTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0) {
                if (!onTouchEvent) {
                    this.A0d = true;
                }
                AnonymousClass0fD.A0C(-2074026522, A052);
                return true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.A0d = false;
        }
        AnonymousClass0fD.A0C(-2074026522, A052);
        return true;
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            A0D();
        }
        ImageButton imageButton = this.A09;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence) && this.A0A == null) {
            this.A0A = new C3021161q(getContext(), (AttributeSet) null, 0);
        }
        ImageView imageView = this.A0A;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            A07();
        }
        ImageButton imageButton = this.A0U;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            this.A0U.setTooltipText(charSequence);
        }
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        A07();
        this.A0U.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        A05();
        this.A0E.setOverflowIcon(drawable);
    }

    public void setSubtitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.A0B;
        if (!isEmpty) {
            if (textView == null) {
                Context context = getContext();
                AnonymousClass3Tj r0 = new AnonymousClass3Tj(context, (AttributeSet) null);
                this.A0B = r0;
                r0.setSingleLine();
                this.A0B.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.A02;
                if (i != 0) {
                    this.A0B.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A0R;
                if (colorStateList != null) {
                    this.A0B.setTextColor(colorStateList);
                }
            }
            if (!A0B(this.A0B)) {
                A09(this.A0B, true);
            }
        } else if (textView != null && A0B(textView)) {
            removeView(this.A0B);
            this.A0g.remove(this.A0B);
        }
        TextView textView2 = this.A0B;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A0I = charSequence;
    }

    public void setTitle(CharSequence charSequence) {
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        TextView textView = this.A0C;
        if (!isEmpty) {
            if (textView == null) {
                Context context = getContext();
                AnonymousClass3Tj r0 = new AnonymousClass3Tj(context, (AttributeSet) null);
                this.A0C = r0;
                r0.setSingleLine();
                this.A0C.setEllipsize(TextUtils.TruncateAt.END);
                int i = this.A07;
                if (i != 0) {
                    this.A0C.setTextAppearance(context, i);
                }
                ColorStateList colorStateList = this.A0S;
                if (colorStateList != null) {
                    this.A0C.setTextColor(colorStateList);
                }
            }
            if (!A0B(this.A0C)) {
                A09(this.A0C, true);
            }
        } else if (textView != null && A0B(textView)) {
            removeView(this.A0C);
            this.A0g.remove(this.A0C);
        }
        TextView textView2 = this.A0C;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.A0J = charSequence;
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return A04(layoutParams);
    }

    public void setCollapseContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getContext().getText(i);
        } else {
            charSequence = null;
        }
        setCollapseContentDescription(charSequence);
    }

    public void setCollapseIcon(int i) {
        setCollapseIcon(C13990Tnq.A0E(this, i));
    }

    public void setLogo(int i) {
        setLogo(C13990Tnq.A0E(this, i));
    }

    public void setLogoDescription(int i) {
        setLogoDescription(getContext().getText(i));
    }

    public void setNavigationContentDescription(int i) {
        CharSequence charSequence;
        if (i != 0) {
            charSequence = getContext().getText(i);
        } else {
            charSequence = null;
        }
        setNavigationContentDescription(charSequence);
    }

    public void setNavigationIcon(int i) {
        setNavigationIcon(C13990Tnq.A0E(this, i));
    }

    public void setSubtitle(int i) {
        setSubtitle(getContext().getText(i));
    }

    public void setSubtitleTextColor(int i) {
        setSubtitleTextColor(ColorStateList.valueOf(i));
    }

    public void setTitle(int i) {
        setTitle(getContext().getText(i));
    }

    public void setTitleTextColor(int i) {
        setTitleTextColor(ColorStateList.valueOf(i));
    }

    public Toolbar(Context context) {
        this(context, (AttributeSet) null);
    }
}
