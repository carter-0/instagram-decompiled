package X;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.4qa  reason: invalid class name and case insensitive filesystem */
public final class C275584qa implements Runnable {
    public final /* synthetic */ AnonymousClass3AQ A00;
    public final /* synthetic */ ArrayList A01;

    public C275584qa(AnonymousClass3AQ r1, ArrayList arrayList) {
        this.A00 = r1;
        this.A01 = arrayList;
    }

    public final void run() {
        ArrayList arrayList = this.A01;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C275574qZ r3 = (C275574qZ) it.next();
            AnonymousClass3AQ r8 = this.A00;
            C249703kE r9 = r3.A04;
            int i = r3.A00;
            int i2 = r3.A01;
            int i3 = r3.A02;
            int i4 = r3.A03;
            View view = r9.itemView;
            int i5 = i3 - i;
            int i6 = i4 - i2;
            if (i5 != 0) {
                view.animate().translationX(0.0f);
            }
            if (i6 != 0) {
                view.animate().translationY(0.0f);
            }
            ViewPropertyAnimator animate = view.animate();
            r8.A04.add(r9);
            animate.setDuration(r8.A08()).setListener(new C275594qb(view, animate, r8, r9, i5, i6)).start();
        }
        arrayList.clear();
        this.A00.A05.remove(arrayList);
    }
}
