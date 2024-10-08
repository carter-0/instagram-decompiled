package X;

import android.view.View;
import android.view.ViewTreeObserver;
import com.instagram.android.R;

public final class WCC implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public WCC(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj2;
        this.A03 = obj;
    }

    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        boolean isAlive;
        boolean isAlive2;
        switch (this.A00) {
            case 0:
                View view = (View) this.A01;
                ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
                VUN vun = (VUN) this.A02;
                viewTreeObserver2.removeOnGlobalLayoutListener(vun.A01);
                U6C u6c = ((C15637Ug3) this.A03).A01;
                if (u6c == null) {
                    0qQ.A0F("parametricSlider");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    u6c.A02(vun, view.getHeight());
                    return;
                }
            case 1:
                try {
                    ((Runnable) this.A01).run();
                    if ((!isAlive && viewTreeObserver == null) || !isAlive2) {
                        throw new IllegalArgumentException("Given null or dead view tree observer.");
                    }
                    return;
                } finally {
                    viewTreeObserver = (ViewTreeObserver) this.A02;
                    if ((viewTreeObserver.isAlive() || (viewTreeObserver = ((View) this.A03).getViewTreeObserver()) != null) && viewTreeObserver.isAlive()) {
                        viewTreeObserver.removeOnGlobalLayoutListener(this);
                        throw th;
                    } else {
                        IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Given null or dead view tree observer.");
                    }
                }
            default:
                View view2 = (View) this.A02;
                if (view2.getLayoutParams().height != -2) {
                    JTQ.A0w(view2, -1, -2);
                    return;
                }
                int height = view2.getHeight();
                C51967G9n.A0y(view2, this);
                C15670Ugb ugb = (C15670Ugb) this.A03;
                C15670Ugb.A00(ugb, height);
                C66581MXm.A1A(view2, -1);
                View findViewById = ((View) this.A01).findViewById(R.id.row_feed_comment_textview_layout);
                if (findViewById != null) {
                    findViewById.addOnLayoutChangeListener(new WBV(height, 1, ugb, findViewById));
                    return;
                }
                return;
        }
    }
}
