package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.transition.Transition;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.BaseAdapter;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.U5w  reason: case insensitive filesystem */
public final class C14734U5w extends WDW implements X9H, PopupWindow.OnDismissListener, View.OnKeyListener {
    public int A00 = 0;
    public int A01;
    public int A02 = 0;
    public int A03;
    public int A04;
    public View A05;
    public View A06;
    public ViewTreeObserver A07;
    public PopupWindow.OnDismissListener A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public C20936X5e A0E;
    public final int A0F;
    public final int A0G;
    public final Context A0H;
    public final Handler A0I;
    public final ViewTreeObserver.OnGlobalLayoutListener A0J = new WC9(this, 0);
    public final C20940X5i A0K = new C18923WDa(this);
    public final List A0L = new ArrayList();
    public final List A0M = new ArrayList();
    public final int A0N;
    public final View.OnAttachStateChangeListener A0O = new W8J(this, 0);
    public final boolean A0P;

    public final boolean AVm() {
        return false;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.WDV, X.U6W] */
    public static void A00(C14734U5w u5w, C18932WDk wDk) {
        VUG vug;
        View view;
        Rect rect;
        int i;
        U4C u4c;
        int i2;
        int firstVisiblePosition;
        C14734U5w u5w2 = u5w;
        Context context = u5w2.A0H;
        LayoutInflater from = LayoutInflater.from(context);
        C18932WDk wDk2 = wDk;
        U4C u4c2 = new U4C(from, wDk2, R.layout.abc_cascading_menu_item_layout, u5w2.A0P);
        if (!u5w2.Cc6() && u5w2.A09) {
            u4c2.A01 = true;
        } else if (u5w2.Cc6()) {
            int size = wDk2.size();
            boolean z = false;
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    break;
                }
                MenuItem item = wDk2.getItem(i3);
                if (item.isVisible() && item.getIcon() != null) {
                    z = true;
                    break;
                }
                i3++;
            }
            u4c2.A01 = z;
        }
        int A012 = WDW.A01(context, u4c2, u5w2.A0N);
        ? wdv = new WDV(context, (AttributeSet) null, u5w2.A0F, u5w2.A0G);
        wdv.A00 = u5w2.A0K;
        wdv.A07 = u5w2;
        PopupWindow popupWindow = wdv.A09;
        popupWindow.setOnDismissListener(u5w2);
        wdv.A06 = u5w2.A05;
        wdv.A00 = u5w2.A00;
        wdv.A0D = true;
        popupWindow.setFocusable(true);
        popupWindow.setInputMethodMode(2);
        wdv.ENu(u4c2);
        wdv.A00(A012);
        wdv.A00 = u5w2.A00;
        List list = u5w2.A0M;
        if (list.size() > 0) {
            vug = (VUG) list.get(DbT.A02(list, 1));
            C18932WDk wDk3 = vug.A01;
            int size2 = wDk3.size();
            int i4 = 0;
            while (true) {
                if (i4 >= size2) {
                    break;
                }
                MenuItem item2 = wDk3.getItem(i4);
                if (!item2.hasSubMenu() || wDk2 != item2.getSubMenu()) {
                    i4++;
                } else {
                    U5Q u5q = vug.A02.A0A;
                    ListAdapter adapter = u5q.getAdapter();
                    int i5 = 0;
                    if (adapter instanceof HeaderViewListAdapter) {
                        HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
                        i2 = headerViewListAdapter.getHeadersCount();
                        u4c = (U4C) headerViewListAdapter.getWrappedAdapter();
                    } else {
                        u4c = (U4C) adapter;
                        i2 = 0;
                    }
                    int count = u4c.getCount();
                    while (true) {
                        if (i5 >= count) {
                            break;
                        } else if (item2 != u4c.getItem(i5)) {
                            i5++;
                        } else if (i5 != -1 && (firstVisiblePosition = (i5 + i2) - u5q.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < u5q.getChildCount()) {
                            view = u5q.getChildAt(firstVisiblePosition);
                        }
                    }
                }
            }
            view = null;
        } else {
            vug = null;
            view = null;
        }
        if (view != null) {
            wdv.A01();
            popupWindow.setEnterTransition((Transition) null);
            U5Q u5q2 = ((VUG) list.get(DbT.A02(list, 1))).A02.A0A;
            int[] iArr = new int[2];
            u5q2.getLocationOnScreen(iArr);
            Rect rect2 = new Rect();
            u5w2.A06.getWindowVisibleDisplayFrame(rect2);
            if (u5w2.A01 != 1 ? iArr[0] - A012 >= 0 : iArr[0] + u5q2.getWidth() + A012 > rect2.right) {
                i = 0;
            } else {
                i = 1;
            }
            u5w2.A01 = i;
            wdv.A06 = view;
            if ((u5w2.A00 & 5) == 5) {
                if (i == 0) {
                    A012 = view.getWidth();
                }
                wdv.A01 = A012;
                wdv.A0F = true;
                wdv.A0E = true;
                wdv.Eq2(0);
            } else if (i != 0) {
                A012 = view.getWidth();
                wdv.A01 = A012;
                wdv.A0F = true;
                wdv.A0E = true;
                wdv.Eq2(0);
            }
            A012 = -A012;
            wdv.A01 = A012;
            wdv.A0F = true;
            wdv.A0E = true;
            wdv.Eq2(0);
        } else {
            if (u5w2.A0A) {
                wdv.A01 = u5w2.A03;
            }
            if (u5w2.A0B) {
                wdv.Eq2(u5w2.A04);
            }
            Rect rect3 = u5w2.A00;
            if (rect3 != null) {
                rect = new Rect(rect3);
            } else {
                rect = null;
            }
            wdv.A05 = rect;
        }
        list.add(new VUG(wDk2, wdv, u5w2.A01));
        wdv.show();
        U5Q u5q3 = wdv.A0A;
        u5q3.setOnKeyListener(u5w2);
        if (vug == null && u5w2.A0D && wDk2.A05 != null) {
            View inflate = from.inflate(R.layout.abc_popup_menu_header_item_layout, u5q3, false);
            TextView A0d = AnonymousClass7TE.A0d(inflate, 16908310);
            inflate.setEnabled(false);
            A0d.setText(wDk2.A05);
            u5q3.addHeaderView(inflate, (Object) null, false);
            wdv.show();
        }
    }

    public final U5Q BN8() {
        List list = this.A0M;
        if (list.isEmpty()) {
            return null;
        }
        return ((VUG) C66582MXn.A0r(list)).A02.A0A;
    }

    public final boolean Cc6() {
        List list = this.A0M;
        if (list.size() <= 0 || !((VUG) list.get(0)).A02.A09.isShowing()) {
            return false;
        }
        return true;
    }

    public final void D4F(C18932WDk wDk, boolean z) {
        List list = this.A0M;
        int size = list.size();
        int i = 0;
        while (i < size) {
            if (wDk != ((VUG) list.get(i)).A01) {
                i++;
            } else if (i >= 0) {
                int i2 = i + 1;
                if (i2 < list.size()) {
                    ((VUG) list.get(i2)).A01.A0C(false);
                }
                VUG vug = (VUG) list.remove(i);
                vug.A01.A0B(this);
                if (this.A0C) {
                    PopupWindow popupWindow = vug.A02.A09;
                    popupWindow.setExitTransition((Transition) null);
                    popupWindow.setAnimationStyle(0);
                }
                vug.A02.dismiss();
                int size2 = list.size();
                if (size2 > 0) {
                    this.A01 = ((VUG) list.get(size2 - 1)).A00;
                } else {
                    int i3 = 1;
                    if (this.A05.getLayoutDirection() == 1) {
                        i3 = 0;
                    }
                    this.A01 = i3;
                    if (size2 == 0) {
                        dismiss();
                        C20936X5e x5e = this.A0E;
                        if (x5e != null) {
                            x5e.D4F(wDk, true);
                        }
                        ViewTreeObserver viewTreeObserver = this.A07;
                        if (viewTreeObserver != null) {
                            if (viewTreeObserver.isAlive()) {
                                this.A07.removeGlobalOnLayoutListener(this.A0J);
                            }
                            this.A07 = null;
                        }
                        this.A06.removeOnAttachStateChangeListener(this.A0O);
                        this.A08.onDismiss();
                        return;
                    }
                }
                if (z) {
                    ((VUG) list.get(0)).A01.A0C(false);
                    return;
                }
                return;
            } else {
                return;
            }
        }
    }

    public final boolean Dnx(C14733U5v u5v) {
        Iterator it = this.A0M.iterator();
        while (true) {
            if (it.hasNext()) {
                VUG vug = (VUG) it.next();
                if (u5v == vug.A01) {
                    vug.A02.A0A.requestFocus();
                    break;
                }
            } else if (!u5v.hasVisibleItems()) {
                return false;
            } else {
                u5v.A07(this.A0H, this);
                if (Cc6()) {
                    A00(this, u5v);
                } else {
                    this.A0L.add(u5v);
                }
                C20936X5e x5e = this.A0E;
                if (x5e != null) {
                    x5e.DVR(u5v);
                    return true;
                }
            }
        }
        return true;
    }

    public final void EQJ(C20936X5e x5e) {
        this.A0E = x5e;
    }

    public final void FKm(boolean z) {
        for (VUG vug : this.A0M) {
            ListAdapter adapter = vug.A02.A0A.getAdapter();
            if (adapter instanceof HeaderViewListAdapter) {
                adapter = ((HeaderViewListAdapter) adapter).getWrappedAdapter();
            }
            0fE.A00((BaseAdapter) adapter, 1673239182);
        }
    }

    public final void dismiss() {
        List list = this.A0M;
        int size = list.size();
        if (size > 0) {
            VUG[] vugArr = (VUG[]) list.toArray(new VUG[size]);
            while (true) {
                size--;
                if (size >= 0) {
                    VUG vug = vugArr[size];
                    if (vug.A02.A09.isShowing()) {
                        vug.A02.dismiss();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void onDismiss() {
        List list = this.A0M;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            VUG vug = (VUG) list.get(i);
            if (!vug.A02.A09.isShowing()) {
                vug.A01.A0C(false);
                return;
            }
        }
    }

    public C14734U5w(Context context, View view, int i, int i2, boolean z) {
        this.A0H = context;
        this.A05 = view;
        this.A0F = i;
        this.A0G = i2;
        this.A0P = z;
        this.A09 = false;
        this.A01 = view.getLayoutDirection() == 1 ? 0 : 1;
        Resources resources = context.getResources();
        this.A0N = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.A0I = new Handler();
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void show() {
        if (!Cc6()) {
            List<C18932WDk> list = this.A0L;
            for (C18932WDk A002 : list) {
                A00(this, A002);
            }
            list.clear();
            View view = this.A05;
            this.A06 = view;
            if (view != null) {
                boolean A1a = DbW.A1a(this.A07);
                ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
                this.A07 = viewTreeObserver;
                if (A1a) {
                    viewTreeObserver.addOnGlobalLayoutListener(this.A0J);
                }
                this.A06.addOnAttachStateChangeListener(this.A0O);
            }
        }
    }
}
