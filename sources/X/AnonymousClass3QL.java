package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.3QL  reason: invalid class name */
public final class AnonymousClass3QL implements Runnable {
    public final /* synthetic */ AnonymousClass3AQ A00;
    public final /* synthetic */ ArrayList A01;

    public AnonymousClass3QL(AnonymousClass3AQ r1, ArrayList arrayList) {
        this.A00 = r1;
        this.A01 = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C249703kE r6 = (C249703kE) it.next();
            AnonymousClass3AQ r5 = this.A00;
            View view = r6.itemView;
            ViewPropertyAnimator animate = view.animate();
            r5.A00.add(r6);
            animate.alpha(1.0f).setDuration(r5.A06()).setListener(new AnonymousClass3QM(view, animate, r5, r6)).start();
        }
        arrayList.clear();
        this.A00.A01.remove(arrayList);
    }
}
