package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.U5x  reason: case insensitive filesystem */
public final class C14735U5x extends WDW implements X9H, PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, View.OnKeyListener {
    public int A00;
    public int A01 = 0;
    public View A02;
    public View A03;
    public ViewTreeObserver A04;
    public PopupWindow.OnDismissListener A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public C20936X5e A09;
    public final int A0A;
    public final Context A0B;
    public final View.OnAttachStateChangeListener A0C = new W8J(this, 1);
    public final ViewTreeObserver.OnGlobalLayoutListener A0D = new WC9(this, 1);
    public final U4C A0E;
    public final C18932WDk A0F;
    public final U6W A0G;
    public final int A0H;
    public final int A0I;
    public final boolean A0J;

    public final boolean AVm() {
        return false;
    }

    public final void FKm(boolean z) {
        this.A06 = false;
        U4C u4c = this.A0E;
        if (u4c != null) {
            0fE.A00(u4c, 1956355386);
        }
    }

    public final void onDismiss() {
        this.A08 = true;
        this.A0F.close();
        ViewTreeObserver viewTreeObserver = this.A04;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.A04 = this.A03.getViewTreeObserver();
            }
            this.A04.removeGlobalOnLayoutListener(this.A0D);
            this.A04 = null;
        }
        this.A03.removeOnAttachStateChangeListener(this.A0C);
        PopupWindow.OnDismissListener onDismissListener = this.A05;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final U5Q BN8() {
        return this.A0G.A0A;
    }

    public final boolean Cc6() {
        if (this.A08 || !this.A0G.A09.isShowing()) {
            return false;
        }
        return true;
    }

    public final void D4F(C18932WDk wDk, boolean z) {
        if (wDk == this.A0F) {
            dismiss();
            C20936X5e x5e = this.A09;
            if (x5e != null) {
                x5e.D4F(wDk, z);
            }
        }
    }

    public final boolean Dnx(C14733U5v u5v) {
        C14733U5v u5v2 = u5v;
        if (!u5v2.hasVisibleItems()) {
            return false;
        }
        C18018Vju vju = new C18018Vju(this.A0B, this.A03, u5v2, this.A0H, this.A0I, this.A0J);
        C20936X5e x5e = this.A09;
        vju.A04 = x5e;
        WDW wdw = vju.A03;
        if (wdw != null) {
            wdw.EQJ(x5e);
        }
        int size = u5v2.size();
        boolean z = false;
        int i = 0;
        while (true) {
            if (i >= size) {
                break;
            }
            MenuItem item = u5v2.getItem(i);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i++;
        }
        vju.A05 = z;
        WDW wdw2 = vju.A03;
        if (wdw2 != null) {
            wdw2.A02(z);
        }
        vju.A02 = this.A05;
        this.A05 = null;
        this.A0F.A0C(false);
        U6W u6w = this.A0G;
        int i2 = u6w.A01;
        int CDm = u6w.CDm();
        if ((Gravity.getAbsoluteGravity(this.A01, this.A02.getLayoutDirection()) & 7) == 5) {
            i2 += this.A02.getWidth();
        }
        WDW wdw3 = vju.A03;
        if (wdw3 == null || !wdw3.Cc6()) {
            if (vju.A01 == null) {
                return false;
            }
            WDW A002 = vju.A00();
            boolean z2 = A002 instanceof C14735U5x;
            if (z2) {
                ((C14735U5x) A002).A07 = true;
            } else {
                ((C14734U5w) A002).A0D = true;
            }
            if ((Gravity.getAbsoluteGravity(vju.A00, vju.A01.getLayoutDirection()) & 7) == 5) {
                i2 -= vju.A01.getWidth();
            }
            if (z2) {
                ((C14735U5x) A002).A0G.A01 = i2;
            } else {
                C14734U5w u5w = (C14734U5w) A002;
                u5w.A0A = true;
                u5w.A03 = i2;
            }
            if (z2) {
                ((C14735U5x) A002).A0G.Eq2(CDm);
            } else {
                C14734U5w u5w2 = (C14734U5w) A002;
                u5w2.A0B = true;
                u5w2.A04 = CDm;
            }
            int A032 = (int) ((C13989Tnp.A03(vju.A08) * 48.0f) / 2.0f);
            A002.A00 = new Rect(i2 - A032, CDm - A032, i2 + A032, CDm + A032);
            A002.show();
        }
        C20936X5e x5e2 = this.A09;
        if (x5e2 != null) {
            x5e2.DVR(u5v2);
        }
        return true;
    }

    public final void EQJ(C20936X5e x5e) {
        this.A09 = x5e;
    }

    /* JADX WARNING: type inference failed for: r0v9, types: [X.WDV, X.U6W] */
    public C14735U5x(Context context, View view, C18932WDk wDk, int i, int i2, boolean z) {
        this.A0B = context;
        this.A0F = wDk;
        this.A0J = z;
        this.A0E = new U4C(LayoutInflater.from(context), wDk, R.layout.abc_popup_menu_item_layout, z);
        this.A0H = i;
        this.A0I = i2;
        Resources resources = context.getResources();
        this.A0A = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(R.dimen.abc_config_prefDialogWidth));
        this.A02 = view;
        this.A0G = new WDV(context, (AttributeSet) null, i, i2);
        wDk.A07(context, this);
    }

    public final void dismiss() {
        if (Cc6()) {
            this.A0G.dismiss();
        }
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    public final void show() {
        View view;
        Rect rect;
        if (Cc6()) {
            return;
        }
        if (this.A08 || (view = this.A02) == null) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
        this.A03 = view;
        U6W u6w = this.A0G;
        PopupWindow popupWindow = u6w.A09;
        popupWindow.setOnDismissListener(this);
        u6w.A07 = this;
        u6w.A0D = true;
        popupWindow.setFocusable(true);
        View view2 = this.A03;
        boolean A1a = DbW.A1a(this.A04);
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.A04 = viewTreeObserver;
        if (A1a) {
            viewTreeObserver.addOnGlobalLayoutListener(this.A0D);
        }
        view2.addOnAttachStateChangeListener(this.A0C);
        u6w.A06 = view2;
        u6w.A00 = this.A01;
        if (!this.A06) {
            this.A00 = WDW.A01(this.A0B, this.A0E, this.A0A);
            this.A06 = true;
        }
        u6w.A00(this.A00);
        popupWindow.setInputMethodMode(2);
        Rect rect2 = this.A00;
        if (rect2 != null) {
            rect = new Rect(rect2);
        } else {
            rect = null;
        }
        u6w.A05 = rect;
        u6w.show();
        U5Q u5q = u6w.A0A;
        u5q.setOnKeyListener(this);
        if (this.A07) {
            C18932WDk wDk = this.A0F;
            if (wDk.A05 != null) {
                View inflate = LayoutInflater.from(this.A0B).inflate(R.layout.abc_popup_menu_header_item_layout, u5q, false);
                TextView A0d = AnonymousClass7TE.A0d(inflate, 16908310);
                if (A0d != null) {
                    A0d.setText(wDk.A05);
                }
                inflate.setEnabled(false);
                u5q.addHeaderView(inflate, (Object) null, false);
            }
        }
        u6w.ENu(this.A0E);
        u6w.show();
    }
}
