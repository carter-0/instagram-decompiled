package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import com.instagram.android.R;
import java.util.ArrayList;

public final class WDU implements X9H, C585402a {
    public int A00;
    public Context A01;
    public Context A02;
    public Drawable A03;
    public LayoutInflater A04;
    public LayoutInflater A05;
    public C18932WDk A06;
    public C20936X5e A07;
    public C20869X1v A08;
    public C14736U5y A09;
    public U5s A0A;
    public C20116Wlc A0B;
    public U69 A0C;
    public U5z A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public int A0I;
    public int A0J;
    public final WDQ A0K = new WDQ(this);
    public final SparseBooleanArray A0L = new SparseBooleanArray();

    public final boolean AIC(C18932WDk wDk, C18934WDm wDm) {
        return false;
    }

    public final boolean ATe(C18932WDk wDk, C18934WDm wDm) {
        return false;
    }

    public final boolean A02() {
        C20869X1v x1v;
        C20116Wlc wlc = this.A0B;
        if (wlc == null || (x1v = this.A08) == null) {
            U5z u5z = this.A0D;
            if (u5z == null) {
                return false;
            }
            WDW wdw = u5z.A03;
            if (wdw != null && wdw.Cc6()) {
                u5z.A03.dismiss();
                return true;
            }
        } else {
            ((View) x1v).removeCallbacks(wlc);
            this.A0B = null;
        }
        return true;
    }

    public final boolean A03() {
        WDW wdw;
        U5z u5z = this.A0D;
        if (u5z == null || (wdw = u5z.A03) == null || !wdw.Cc6()) {
            return false;
        }
        return true;
    }

    public final boolean A04() {
        C18932WDk wDk;
        if (!this.A0G || A03() || (wDk = this.A06) == null || this.A08 == null || this.A0B != null) {
            return false;
        }
        wDk.A04();
        if (wDk.A08.isEmpty()) {
            return false;
        }
        C20116Wlc wlc = new C20116Wlc(new U5z(this.A01, this.A0C, this.A06, this), this);
        this.A0B = wlc;
        ((View) this.A08).post(wlc);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0103, code lost:
        if (r15 != false) goto L_0x00cf;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean AVm() {
        /*
            r18 = this;
            r13 = r18
            X.WDk r0 = r13.A06
            r17 = 0
            r15 = 0
            if (r0 == 0) goto L_0x004c
            java.util.ArrayList r12 = r0.A03()
            int r11 = r12.size()
        L_0x0011:
            int r10 = r13.A00
            int r9 = r13.A0I
            int r8 = android.view.View.MeasureSpec.makeMeasureSpec(r15, r15)
            X.X1v r7 = r13.A08
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            r3 = 0
            r6 = 0
            r5 = 0
            r2 = 0
        L_0x0021:
            if (r3 >= r11) goto L_0x0050
            java.lang.Object r4 = r12.get(r3)
            X.WDm r4 = (X.C18934WDm) r4
            int r0 = r4.A05
            r1 = 2
            r0 = r0 & 2
            if (r0 != r1) goto L_0x0040
            int r5 = r5 + 1
        L_0x0032:
            boolean r0 = r13.A0E
            if (r0 == 0) goto L_0x003d
            boolean r0 = r4.isActionViewExpanded()
            if (r0 == 0) goto L_0x003d
            r10 = 0
        L_0x003d:
            int r3 = r3 + 1
            goto L_0x0021
        L_0x0040:
            int r0 = r4.A05
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x004a
            int r2 = r2 + 1
            goto L_0x0032
        L_0x004a:
            r6 = 1
            goto L_0x0032
        L_0x004c:
            r12 = r17
            r11 = 0
            goto L_0x0011
        L_0x0050:
            boolean r0 = r13.A0G
            if (r0 == 0) goto L_0x005b
            if (r6 != 0) goto L_0x0059
            int r2 = r2 + r5
            if (r2 <= r10) goto L_0x005b
        L_0x0059:
            int r10 = r10 + -1
        L_0x005b:
            int r10 = r10 - r5
            android.util.SparseBooleanArray r6 = r13.A0L
            r6.clear()
            r5 = 0
            r16 = 0
        L_0x0064:
            if (r5 >= r11) goto L_0x0106
            java.lang.Object r4 = r12.get(r5)
            X.WDm r4 = (X.C18934WDm) r4
            int r0 = r4.A05
            r1 = 2
            r0 = r0 & 2
            if (r0 != r1) goto L_0x0099
            r0 = r17
            android.view.View r0 = r13.A00(r0, r7, r4)
            r0.measure(r8, r8)
            int r0 = r0.getMeasuredWidth()
            int r9 = r9 - r0
            if (r16 != 0) goto L_0x0085
            r16 = r0
        L_0x0085:
            int r1 = r4.getGroupId()
            r0 = 1
            if (r1 == 0) goto L_0x008f
            r6.put(r1, r0)
        L_0x008f:
            int r0 = r4.A02
            r0 = r0 | 32
            r4.A02 = r0
        L_0x0095:
            int r5 = r5 + 1
            r15 = 0
            goto L_0x0064
        L_0x0099:
            int r0 = r4.A05
            r1 = 1
            r0 = r0 & 1
            if (r0 != r1) goto L_0x00d1
            int r14 = r4.getGroupId()
            boolean r2 = r6.get(r14)
            if (r10 > 0) goto L_0x00ac
            if (r2 == 0) goto L_0x00d1
        L_0x00ac:
            if (r9 <= 0) goto L_0x00dc
            r0 = r17
            android.view.View r0 = r13.A00(r0, r7, r4)
            r0.measure(r8, r8)
            int r0 = r0.getMeasuredWidth()
            int r9 = r9 - r0
            if (r16 != 0) goto L_0x00c0
            r16 = r0
        L_0x00c0:
            int r0 = r9 + r16
            boolean r0 = X.AnonymousClass7TF.A1R(r0)
            r15 = r0 & 1
            if (r15 == 0) goto L_0x00dc
            if (r14 == 0) goto L_0x00dc
            r6.put(r14, r1)
        L_0x00cf:
            int r10 = r10 + -1
        L_0x00d1:
            int r1 = r4.A02
            r0 = r1 & -33
            if (r15 == 0) goto L_0x00d9
            r0 = r1 | 32
        L_0x00d9:
            r4.A02 = r0
            goto L_0x0095
        L_0x00dc:
            if (r2 == 0) goto L_0x0103
            r3 = 0
            r6.put(r14, r3)
        L_0x00e2:
            if (r3 >= r5) goto L_0x0103
            java.lang.Object r2 = r12.get(r3)
            X.WDm r2 = (X.C18934WDm) r2
            int r0 = r2.getGroupId()
            if (r0 != r14) goto L_0x0100
            int r0 = r2.A02
            r1 = 32
            r0 = r0 & 32
            if (r0 != r1) goto L_0x00fa
            int r10 = r10 + 1
        L_0x00fa:
            int r0 = r2.A02
            r0 = r0 & -33
            r2.A02 = r0
        L_0x0100:
            int r3 = r3 + 1
            goto L_0x00e2
        L_0x0103:
            if (r15 == 0) goto L_0x00d1
            goto L_0x00cf
        L_0x0106:
            r0 = 1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WDU.AVm():boolean");
    }

    public final void CMm(Context context, C18932WDk wDk) {
        this.A01 = context;
        this.A04 = LayoutInflater.from(context);
        this.A06 = wDk;
        Resources resources = context.getResources();
        if (!this.A0H) {
            this.A0G = true;
        }
        this.A0J = AnonymousClass7TF.A0E(context).widthPixels / 2;
        this.A00 = C16748V4h.A00(context);
        int i = this.A0J;
        if (this.A0G) {
            if (this.A0C == null) {
                U69 u69 = new U69(this.A02, this);
                this.A0C = u69;
                if (this.A0F) {
                    u69.setImageDrawable(this.A03);
                    this.A03 = null;
                    this.A0F = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.A0C.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i -= this.A0C.getMeasuredWidth();
        } else {
            this.A0C = null;
        }
        this.A0I = i;
        resources.getDisplayMetrics();
    }

    public final void EQJ(C20936X5e x5e) {
        this.A07 = x5e;
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [X.U6Q, android.view.ViewGroup$LayoutParams, android.widget.LinearLayout$LayoutParams] */
    public final void FKm(boolean z) {
        ArrayList arrayList;
        C20869X1v x1v;
        int size;
        C18934WDm wDm;
        ViewGroup viewGroup = (ViewGroup) this.A08;
        if (viewGroup != null) {
            C18932WDk wDk = this.A06;
            int i = 0;
            if (wDk != null) {
                wDk.A04();
                ArrayList A032 = this.A06.A03();
                int size2 = A032.size();
                int i2 = 0;
                for (int i3 = 0; i3 < size2; i3++) {
                    C18934WDm wDm2 = (C18934WDm) A032.get(i3);
                    if ((wDm2.A02 & 32) == 32) {
                        View childAt = viewGroup.getChildAt(i2);
                        if (childAt instanceof C20937X5f) {
                            wDm = ((C20937X5f) childAt).getItemData();
                        } else {
                            wDm = null;
                        }
                        View A002 = A00(childAt, viewGroup, wDm2);
                        if (wDm2 != wDm) {
                            A002.setPressed(false);
                            A002.jumpDrawablesToCurrentState();
                        }
                        if (A002 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) A002.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(A002);
                            }
                            ((ViewGroup) this.A08).addView(A002, i2);
                        }
                        i2++;
                    }
                }
                i = i2;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.A0C) {
                    i++;
                } else {
                    viewGroup.removeViewAt(i);
                }
            }
        }
        ((View) this.A08).requestLayout();
        C18932WDk wDk2 = this.A06;
        if (wDk2 != null) {
            wDk2.A04();
            ArrayList arrayList2 = wDk2.A06;
            int size3 = arrayList2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                AnonymousClass02c r0 = ((C18934WDm) arrayList2.get(i4)).A0C;
                if (r0 != null) {
                    r0.A00 = this;
                }
            }
        }
        C18932WDk wDk3 = this.A06;
        if (wDk3 != null) {
            wDk3.A04();
            arrayList = wDk3.A08;
        } else {
            arrayList = null;
        }
        if (!this.A0G || arrayList == null || ((size = arrayList.size()) != 1 ? size <= 0 : !(!((C18934WDm) arrayList.get(0)).isActionViewExpanded()))) {
            U69 u69 = this.A0C;
            if (u69 != null && u69.getParent() == (x1v = this.A08)) {
                ((ViewGroup) x1v).removeView(this.A0C);
            }
        } else {
            U69 u692 = this.A0C;
            if (u692 == null) {
                u692 = new U69(this.A02, this);
                this.A0C = u692;
            }
            ViewGroup viewGroup3 = (ViewGroup) u692.getParent();
            if (viewGroup3 != this.A08) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.A0C);
                }
                U69 u693 = this.A0C;
                ? layoutParams = new LinearLayout.LayoutParams(-2, -2);
                layoutParams.A04 = false;
                layoutParams.gravity = 16;
                layoutParams.A04 = true;
                ((ViewGroup) this.A08).addView(u693, layoutParams);
            }
        }
        ((ActionMenuView) this.A08).A06 = this.A0G;
    }

    public WDU(Context context) {
        this.A02 = context;
        this.A05 = LayoutInflater.from(context);
    }

    public final View A00(View view, ViewGroup viewGroup, C18934WDm wDm) {
        View actionView = wDm.getActionView();
        if (actionView == null || wDm.A02()) {
            if (!(view instanceof C20937X5f)) {
                view = DbT.A0C(this.A05, viewGroup, R.layout.abc_action_menu_item_layout);
            }
            C20937X5f x5f = (C20937X5f) view;
            x5f.CN5(wDm, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) x5f;
            actionMenuItemView.A01 = (ActionMenuView) this.A08;
            U5s u5s = this.A0A;
            if (u5s == null) {
                u5s = new U5s(this);
                this.A0A = u5s;
            }
            actionMenuItemView.A00 = u5s;
            actionView = (View) x5f;
        }
        actionView.setVisibility(DbW.A00(wDm.isActionViewExpanded() ? 1 : 0));
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!(layoutParams instanceof U6Q)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    public final void A01() {
        WDW wdw;
        A02();
        C14736U5y u5y = this.A09;
        if (u5y != null && (wdw = u5y.A03) != null && wdw.Cc6()) {
            u5y.A03.dismiss();
        }
    }

    public final void D4F(C18932WDk wDk, boolean z) {
        A01();
        C20936X5e x5e = this.A07;
        if (x5e != null) {
            x5e.D4F(wDk, z);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x006d, code lost:
        if (r0.Cc6() != false) goto L_0x006f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean Dnx(X.C14733U5v r8) {
        /*
            r7 = this;
            boolean r0 = r8.hasVisibleItems()
            r5 = 0
            if (r0 == 0) goto L_0x00a1
            r0 = r8
        L_0x0008:
            X.WDk r2 = r0.A00
            X.WDk r1 = r7.A06
            if (r2 == r1) goto L_0x0013
            X.WDk r0 = r0.A00
            X.U5v r0 = (X.C14733U5v) r0
            goto L_0x0008
        L_0x0013:
            android.view.MenuItem r4 = r0.getItem()
            X.X1v r3 = r7.A08
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            if (r3 == 0) goto L_0x00a1
            int r2 = r3.getChildCount()
            r1 = 0
        L_0x0022:
            if (r1 >= r2) goto L_0x00a1
            android.view.View r6 = r3.getChildAt(r1)
            boolean r0 = r6 instanceof X.C20937X5f
            if (r0 == 0) goto L_0x009e
            r0 = r6
            X.X5f r0 = (X.C20937X5f) r0
            X.WDm r0 = r0.getItemData()
            if (r0 != r4) goto L_0x009e
            if (r6 == 0) goto L_0x00a1
            android.view.MenuItem r0 = r8.getItem()
            r0.getItemId()
            int r4 = r8.size()
            r2 = 0
        L_0x0043:
            r3 = 1
            if (r2 >= r4) goto L_0x0057
            android.view.MenuItem r1 = r8.getItem(r2)
            boolean r0 = r1.isVisible()
            if (r0 == 0) goto L_0x009b
            android.graphics.drawable.Drawable r0 = r1.getIcon()
            if (r0 == 0) goto L_0x009b
            r5 = 1
        L_0x0057:
            android.content.Context r0 = r7.A01
            X.U5y r1 = new X.U5y
            r1.<init>(r0, r6, r8, r7)
            r7.A09 = r1
            r1.A05 = r5
            X.WDW r0 = r1.A03
            if (r0 == 0) goto L_0x0077
            r0.A02(r5)
            boolean r0 = r0.Cc6()
            if (r0 == 0) goto L_0x0077
        L_0x006f:
            X.X5e r0 = r7.A07
            if (r0 == 0) goto L_0x0076
            r0.DVR(r8)
        L_0x0076:
            return r3
        L_0x0077:
            android.view.View r0 = r1.A01
            if (r0 != 0) goto L_0x0083
            java.lang.String r1 = "MenuPopupHelper cannot be used without an anchor"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x0083:
            X.WDW r2 = r1.A00()
            r1 = 0
            boolean r0 = r2 instanceof X.C14735U5x
            if (r0 == 0) goto L_0x0095
            r0 = r2
            X.U5x r0 = (X.C14735U5x) r0
            r0.A07 = r1
        L_0x0091:
            r2.show()
            goto L_0x006f
        L_0x0095:
            r0 = r2
            X.U5w r0 = (X.C14734U5w) r0
            r0.A0D = r1
            goto L_0x0091
        L_0x009b:
            int r2 = r2 + 1
            goto L_0x0043
        L_0x009e:
            int r1 = r1 + 1
            goto L_0x0022
        L_0x00a1:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.WDU.Dnx(X.U5v):boolean");
    }
}
