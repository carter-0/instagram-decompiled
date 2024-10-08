package X;

import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;

/* renamed from: X.HtS  reason: case insensitive filesystem */
public final class C56140HtS {
    public C62320sa A00;
    public boolean A01;
    public final C49726F3q A02;
    public final C55552HjY A03;
    public final 01W A04;
    public final 0sP A05;
    public final boolean A06;

    public final void A00() {
        Window CGd;
        View decorView;
        Object obj;
        G9A g9a = this.A02.A00;
        if (g9a != null && (CGd = g9a.CGd()) != null && (decorView = CGd.getDecorView()) != null) {
            Context context = decorView.getContext();
            if (context != null) {
                obj = context.getSystemService("input_method");
            } else {
                obj = null;
            }
            InputMethodManager inputMethodManager = (InputMethodManager) obj;
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(decorView.getWindowToken(), 0);
            }
        }
    }

    public final void A01(C62320sa r2) {
        if (!this.A06 || !this.A01) {
            r2.invoke();
            return;
        }
        A00();
        this.A00 = C58688Ivx.A00(r2, this, 23);
    }

    public final void A02(0sP r4) {
        if (this.A04.size() <= 1) {
            A01(C58708IwH.A01(this, 10));
            return;
        }
        A01(C58688Ivx.A00(r4, this, 24));
        C51968G9o.A1O(this.A05, false);
    }

    public C56140HtS(C49726F3q f3q, I4X i4x, C55552HjY hjY, String str, 0sP r8) {
        Window CGd;
        View decorView;
        C51974G9v.A1M(str, i4x, r8);
        this.A02 = f3q;
        this.A05 = r8;
        this.A03 = hjY;
        01W r2 = new 01W();
        this.A04 = r2;
        this.A06 = AnonymousClass7TF.A1S(i4x.A01, 48);
        if (i4x.A06) {
            r2.addLast(new C56109Hsw(i4x, str, (String) null));
        }
        C49726F3q f3q2 = this.A02;
        G9A g9a = f3q2.A00;
        if (g9a != null && (CGd = g9a.CGd()) != null && (decorView = CGd.getDecorView()) != null && this.A06) {
            C52952Gg5 gg5 = new C52952Gg5(decorView, f3q2, this);
            AnonymousClass03j.A00(decorView, gg5);
            04a.A01(decorView, gg5);
        }
    }
}
