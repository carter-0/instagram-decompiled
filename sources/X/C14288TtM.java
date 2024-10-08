package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.TtM  reason: case insensitive filesystem */
public final class C14288TtM implements View.OnAttachStateChangeListener, ViewTreeObserver.OnPreDrawListener {
    public ViewGroup A00;
    public C14284TtI A01;

    public final void onViewAttachedToWindow(View view) {
    }

    public final boolean onPreDraw() {
        ViewGroup viewGroup = this.A00;
        C13988Tno.A12(viewGroup, this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = C14283TtH.A00;
        ViewGroup viewGroup2 = this.A00;
        if (arrayList.remove(viewGroup2)) {
            0yf A002 = C14283TtH.A00();
            AbstractCollection abstractCollection = (AbstractCollection) A002.get(viewGroup2);
            ArrayList arrayList2 = null;
            if (abstractCollection == null) {
                abstractCollection = new ArrayList();
                A002.put(viewGroup2, abstractCollection);
            } else if (abstractCollection.size() > 0) {
                arrayList2 = new ArrayList(abstractCollection);
            }
            C14284TtI ttI = this.A01;
            abstractCollection.add(ttI);
            ttI.A0A(new UF3(0, A002, this));
            ttI.A0T(viewGroup2, false);
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    ((C14284TtI) it.next()).A0P(viewGroup2);
                }
            }
            ttI.A0R(viewGroup2);
        }
        return true;
    }

    public final void onViewDetachedFromWindow(View view) {
        ViewGroup viewGroup = this.A00;
        C13988Tno.A12(viewGroup, this);
        viewGroup.removeOnAttachStateChangeListener(this);
        ArrayList arrayList = C14283TtH.A00;
        ViewGroup viewGroup2 = this.A00;
        arrayList.remove(viewGroup2);
        AbstractCollection abstractCollection = (AbstractCollection) C14283TtH.A00().get(viewGroup2);
        if (abstractCollection != null && abstractCollection.size() > 0) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                ((C14284TtI) it.next()).A0P(viewGroup2);
            }
        }
        C14284TtI ttI = this.A01;
        ttI.A0C.A02.clear();
        ttI.A0C.A00.clear();
        ttI.A0C.A03.A07();
    }
}
