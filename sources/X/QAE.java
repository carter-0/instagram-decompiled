package X;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

public class QAE extends AnonymousClass0lB implements C249423jl {
    public 2X1 A00;
    public final AnonymousClass034 A01;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public QAE(android.content.Context r6, int r7) {
        /*
            r5 = this;
            r0 = r7
            if (r7 != 0) goto L_0x0015
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r1 = 2130969252(0x7f0402a4, float:1.754718E38)
            r0 = 1
            r2.resolveAttribute(r1, r3, r0)
            int r0 = r3.resourceId
        L_0x0015:
            r5.<init>(r6, r0)
            X.SdD r0 = new X.SdD
            r0.<init>(r5)
            r5.A01 = r0
            X.2X1 r4 = r5.A04()
            if (r7 != 0) goto L_0x0037
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            android.content.res.Resources$Theme r2 = r6.getTheme()
            r1 = 2130969252(0x7f0402a4, float:1.754718E38)
            r0 = 1
            r2.resolveAttribute(r1, r3, r0)
            int r7 = r3.resourceId
        L_0x0037:
            r0 = r4
            X.2X4 r0 = (X.2X4) r0
            r0.A03 = r7
            r0 = 0
            r4.A0L(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.QAE.<init>(android.content.Context, int):void");
    }

    public final 2X1 A04() {
        2X1 r0 = this.A00;
        if (r0 != null) {
            return r0;
        }
        boolean z = 2X1.A05;
        boolean z2 = 2X4.A0p;
        2X4 r02 = new 2X4(getContext(), getWindow(), this, this);
        this.A00 = r02;
        return r02;
    }

    private void A01() {
        C71362ch.A01(getWindow().getDecorView(), this);
        C71372cj.A01(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        0qQ.A0B(decorView, 0);
        decorView.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, this);
    }

    public final boolean A05(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A04().A0N(view, layoutParams);
    }

    public final void dismiss() {
        super.dismiss();
        A04().A0J();
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        getWindow().getDecorView();
        AnonymousClass034 r1 = this.A01;
        if (r1 != null) {
            return r1.superDispatchKeyEvent(keyEvent);
        }
        return false;
    }

    public final View findViewById(int i) {
        2X4 A04 = A04();
        2X4.A0C(A04);
        return A04.A0A.findViewById(i);
    }

    public final void invalidateOptionsMenu() {
        A04().A0I();
    }

    public void onCreate(Bundle bundle) {
        2X4 A04 = A04();
        LayoutInflater from = LayoutInflater.from(A04.A0l);
        if (from.getFactory() == null) {
            from.setFactory2(A04);
        } else {
            from.getFactory2();
        }
        super.onCreate(bundle);
        A04().A0L(bundle);
    }

    public final void onStop() {
        super.onStop();
        2X4 A04 = A04();
        2X4.A0D(A04);
        C16747V4e v4e = A04.A0E;
        if (v4e != null) {
            v4e.A0E(false);
        }
    }

    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        A01();
        A04().A0O(view, layoutParams);
    }

    public final void setTitle(int i) {
        super.setTitle(i);
        A04().A0P(getContext().getString(i));
    }

    public void setContentView(int i) {
        A01();
        A04().A0K(i);
    }

    public void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        A04().A0P(charSequence);
    }

    public void setContentView(View view) {
        A01();
        A04().A0M(view);
    }
}
