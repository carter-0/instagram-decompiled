package X;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Sbe  reason: case insensitive filesystem */
public final class C11517Sbe implements ViewTreeObserver.OnPreDrawListener {
    public final WeakReference A00;

    public final boolean onPreDraw() {
        int i;
        int i2;
        Log.isLoggable("ViewTarget", 2);
        C11193SEt sEt = (C11193SEt) this.A00.get();
        if (sEt == null) {
            return true;
        }
        List list = sEt.A02;
        if (list.isEmpty()) {
            return true;
        }
        View view = sEt.A01;
        int paddingLeft = view.getPaddingLeft() + view.getPaddingRight();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = 0;
        }
        int A002 = C11193SEt.A00(sEt, view.getWidth(), i, paddingLeft);
        int paddingTop = view.getPaddingTop() + view.getPaddingBottom();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        if (layoutParams2 != null) {
            i2 = layoutParams2.height;
        } else {
            i2 = 0;
        }
        int A003 = C11193SEt.A00(sEt, view.getHeight(), i2, paddingTop);
        if (A002 <= 0 && A002 != Integer.MIN_VALUE) {
            return true;
        }
        if (A003 <= 0 && A003 != Integer.MIN_VALUE) {
            return true;
        }
        Iterator A16 = Pxg.A16(list);
        while (A16.hasNext()) {
            ((C11990Sk9) A16.next()).A03(A002, A003);
        }
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(sEt.A00);
        }
        sEt.A00 = null;
        list.clear();
        return true;
    }

    public C11517Sbe(C11193SEt sEt) {
        this.A00 = C51965G9l.A0v(sEt);
    }
}
