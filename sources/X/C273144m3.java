package X;

import android.graphics.Rect;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.4m3  reason: invalid class name and case insensitive filesystem */
public final class C273144m3 implements ViewTreeObserver.OnPreDrawListener {
    public final UserSession A00;
    public final WeakReference A01;
    public final WeakReference A02;
    public final WeakReference A03;
    public final WeakReference A04;
    public final WeakReference A05;
    public final boolean A06;

    public final boolean onPreDraw() {
        View view = (View) this.A03.get();
        if (view != null) {
            view.getViewTreeObserver().removeOnPreDrawListener(this);
            TouchDelegate touchDelegate = view.getTouchDelegate();
            if (touchDelegate != null) {
                List list = ((AnonymousClass479) touchDelegate).A00;
                list.clear();
                View view2 = (View) this.A04.get();
                View view3 = (View) this.A02.get();
                if (!(view2 == null || view3 == null)) {
                    Rect rect = new Rect();
                    view2.getHitRect(rect);
                    rect.top = 0;
                    rect.right = view.getRight();
                    if (this.A06) {
                        Rect rect2 = new Rect();
                        view3.getHitRect(rect2);
                        rect2.bottom = view.getHeight();
                    } else {
                        rect.bottom = view.getHeight();
                    }
                    list.add(new TouchDelegate(rect, view2));
                }
                View view4 = (View) this.A01.get();
                View view5 = (View) this.A05.get();
                if (!(view4 == null || view5 == null)) {
                    Rect rect3 = new Rect();
                    view5.getHitRect(rect3);
                    list.add(new TouchDelegate(rect3, view4));
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        return true;
    }

    public C273144m3(View view, View view2, ViewGroup viewGroup, TextView textView, TextView textView2, UserSession userSession, boolean z) {
        this.A00 = userSession;
        this.A03 = new WeakReference(viewGroup);
        this.A04 = new WeakReference(textView);
        this.A02 = new WeakReference(textView2);
        this.A01 = new WeakReference(view);
        this.A05 = new WeakReference(view2);
        this.A06 = z;
    }
}
