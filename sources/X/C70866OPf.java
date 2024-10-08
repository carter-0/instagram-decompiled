package X;

import android.graphics.PointF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OPf  reason: case insensitive filesystem */
public abstract class C70866OPf {
    public static final View A00(PointF pointF, RecyclerView recyclerView) {
        0qQ.A0B(recyclerView, 0);
        int[] iArr = new int[2];
        recyclerView.getLocationOnScreen(iArr);
        return recyclerView.A0U(pointF.x - ((float) iArr[0]), pointF.y - ((float) iArr[1]));
    }

    public static final C70740OJl A01(View view, RecyclerView recyclerView, boolean z) {
        List list;
        View view2;
        View[] viewArr;
        ArrayList A0q = AnonymousClass7TF.A0q(recyclerView, 0);
        C249703kE A0Y = recyclerView.A0Y(view);
        if (A0Y != null) {
            int childCount = recyclerView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C249703kE A0Y2 = recyclerView.A0Y(recyclerView.getChildAt(i));
                if (!(A0Y2 == null || A0Y2 == A0Y)) {
                    View view3 = null;
                    if (A0Y2 instanceof AnonymousClass7EZ) {
                        AnonymousClass7EZ r8 = (AnonymousClass7EZ) A0Y2;
                        View BJd = r8.A0M.BJd();
                        AnonymousClass7EA r0 = r8.A0P;
                        if (r0 != null) {
                            view3 = r0.BJd();
                        }
                        viewArr = new View[]{BJd, view3};
                    } else if (A0Y2 instanceof AnonymousClass7AS) {
                        AnonymousClass7AS r82 = (AnonymousClass7AS) A0Y2;
                        C328007Db r02 = r82.A00;
                        if (r02 != null) {
                            view2 = r02.BJd();
                        } else {
                            view2 = null;
                        }
                        View BJd2 = r82.A01.BJd();
                        AnonymousClass7EA r03 = r82.A0J;
                        if (r03 != null) {
                            view3 = r03.BJd();
                        }
                        viewArr = new View[]{view2, BJd2, view3};
                    } else {
                        if ((A0Y2 instanceof C3256873s) || (A0Y2 instanceof AnonymousClass7PH) || (A0Y2 instanceof C67976My0)) {
                            list = 0sn.A00;
                        } else {
                            list = AnonymousClass7TE.A1I(A0Y2.itemView);
                        }
                        A0q.addAll(list);
                    }
                    0qQ.A0B(viewArr, 0);
                    list = 03t.A0I(viewArr);
                    A0q.addAll(list);
                }
            }
        }
        if (A0q.isEmpty()) {
            return null;
        }
        Iterator it = A0q.iterator();
        while (it.hasNext()) {
            View A0H = JTO.A0H(it);
            if (z) {
                C66581MXm.A0C(A0H, 0.55f).start();
            } else {
                A0H.setAlpha(0.55f);
            }
        }
        return new C70740OJl(A0q);
    }
}
