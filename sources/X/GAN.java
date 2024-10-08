package X;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import java.lang.ref.WeakReference;

public final class GAN implements JR0, AnonymousClass2hP {
    public AnonymousClass49S A00;
    public final WeakReference A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final boolean CFf(Rect rect, Rect rect2, Rect rect3) {
        0qQ.A0B(rect, 0);
        0qQ.A0B(rect2, 1);
        0qQ.A0B(rect3, 2);
        View view = (View) this.A01.get();
        if (view != null) {
            Point point = new Point();
            if (!view.isShown()) {
                rect.setEmpty();
                rect2.setEmpty();
            } else if (!view.getGlobalVisibleRect(rect, point) || !rect.intersect(rect3)) {
                rect2.setEmpty();
                rect.setEmpty();
                return false;
            } else {
                int i = point.x;
                rect2.set(i, point.y, i + view.getWidth(), point.y + view.getHeight());
                return true;
            }
        }
        return false;
    }

    public final String Apg() {
        return this.A02;
    }

    public final AnonymousClass49S Apm() {
        return this.A00;
    }

    public final String B9x() {
        return this.A02;
    }

    public final String BRt() {
        return this.A03;
    }

    public final AnonymousClass2hP BWQ() {
        return this;
    }

    public final Context getContext() {
        View view = (View) this.A01.get();
        if (view != null) {
            return view.getContext();
        }
        return null;
    }

    public final String getModuleName() {
        return this.A04;
    }

    public GAN(View view, AnonymousClass49S r3, String str, String str2, String str3) {
        AnonymousClass7TG.A1R(str2, str3);
        this.A00 = r3;
        this.A03 = str;
        this.A04 = str2;
        this.A02 = str3;
        this.A01 = C51965G9l.A0v(view);
    }
}
