package X;

import android.view.View;
import android.view.ViewParent;
import androidx.core.view.ViewKt;
import com.instagram.android.R;
import java.util.ArrayList;

/* renamed from: X.4qc  reason: invalid class name and case insensitive filesystem */
public abstract class C275604qc {
    public static final void A01(View view) {
        0qQ.A0B(view, 0);
        C275614qd A03 = AnonymousClass2YZ.A03(new ViewKt.allViews.1(view, (AnonymousClass4D7) null));
        while (A03.hasNext()) {
            ArrayList arrayList = A00((View) A03.next()).A00;
            0qQ.A0B(arrayList, 0);
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                ((AnonymousClass5Oq) arrayList.get(size)).Dcz();
            }
        }
    }

    public static final boolean A02(View view) {
        Boolean bool;
        for (ViewParent viewParent : 2YX.A02(view.getParent(), 02r.A00)) {
            if (viewParent instanceof View) {
                View view2 = (View) viewParent;
                0qQ.A0B(view2, 0);
                Object tag = view2.getTag(R.id.is_pooling_container_tag);
                if ((tag instanceof Boolean) && (bool = (Boolean) tag) != null && bool.booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final C275624qe A00(View view) {
        C275624qe r0 = (C275624qe) view.getTag(R.id.pooling_container_listener_holder_tag);
        if (r0 != null) {
            return r0;
        }
        C275624qe r02 = new C275624qe();
        view.setTag(R.id.pooling_container_listener_holder_tag, r02);
        return r02;
    }
}
