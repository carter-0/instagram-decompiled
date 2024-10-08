package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.TtT  reason: case insensitive filesystem */
public final class C14295TtT implements Runnable {
    public final /* synthetic */ AnonymousClass3AQ A00;
    public final /* synthetic */ ArrayList A01;

    public C14295TtT(AnonymousClass3AQ r1, ArrayList arrayList) {
        this.A00 = r1;
        this.A01 = arrayList;
    }

    public final void run() {
        View view;
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            V4J v4j = (V4J) it.next();
            AnonymousClass3AQ r11 = this.A00;
            C249703kE r0 = v4j.A05;
            View view2 = null;
            if (r0 == null) {
                view = null;
            } else {
                view = r0.itemView;
            }
            C249703kE r02 = v4j.A04;
            if (r02 != null) {
                view2 = r02.itemView;
            }
            if (view != null) {
                ViewPropertyAnimator duration = view.animate().setDuration(r11.A07());
                r11.A02.add(v4j.A05);
                duration.translationX((float) (v4j.A02 - v4j.A00));
                duration.translationY((float) (v4j.A03 - v4j.A01));
                duration.alpha(0.0f).setListener(new C14294TtS(view, duration, v4j, r11, 0)).start();
            }
            if (view2 != null) {
                ViewPropertyAnimator animate = view2.animate();
                r11.A02.add(v4j.A04);
                animate.translationX(0.0f).translationY(0.0f).setDuration(r11.A07()).alpha(1.0f).setListener(new C14294TtS(view2, animate, v4j, r11, 1)).start();
            }
        }
        arrayList.clear();
        this.A00.A03.remove(arrayList);
    }
}
