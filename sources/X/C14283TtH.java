package X;

import android.os.Build;
import android.view.ViewGroup;
import com.instagram.android.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.TtH  reason: case insensitive filesystem */
public abstract class C14283TtH {
    public static ArrayList A00 = new ArrayList();
    public static C14284TtI A01 = new UF4();
    public static ThreadLocal A02 = new ThreadLocal();

    public static 0yf A00() {
        0yf r1;
        ThreadLocal threadLocal = A02;
        Reference reference = (Reference) threadLocal.get();
        if (reference != null && (r1 = (0yf) reference.get()) != null) {
            return r1;
        }
        01r r12 = new 01r(0);
        threadLocal.set(new WeakReference(r12));
        return r12;
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.view.ViewTreeObserver$OnPreDrawListener, X.TtM, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public static UF9 A01(ViewGroup viewGroup, C14284TtI ttI) {
        ArrayList arrayList = A00;
        if (arrayList.contains(viewGroup) || !viewGroup.isLaidOut() || Build.VERSION.SDK_INT < 34) {
            return null;
        }
        if (ttI.A0a()) {
            arrayList.add(viewGroup);
            C14284TtI A06 = ttI.clone();
            UF5 uf5 = new UF5();
            uf5.A0e(A06);
            A03(viewGroup, uf5);
            viewGroup.setTag(R.id.transition_current_scene, (Object) null);
            ? obj = new Object();
            obj.A01 = uf5;
            obj.A00 = viewGroup;
            viewGroup.addOnAttachStateChangeListener(obj);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(obj);
            viewGroup.invalidate();
            return uf5.A05();
        }
        throw new IllegalArgumentException("The Transition must support seeking.");
    }

    /* JADX WARNING: type inference failed for: r1v2, types: [android.view.ViewTreeObserver$OnPreDrawListener, X.TtM, java.lang.Object, android.view.View$OnAttachStateChangeListener] */
    public static void A02(ViewGroup viewGroup, C14284TtI ttI) {
        ArrayList arrayList = A00;
        if (!arrayList.contains(viewGroup) && viewGroup.isLaidOut()) {
            arrayList.add(viewGroup);
            if (ttI == null) {
                ttI = A01;
            }
            C14284TtI A06 = ttI.clone();
            A03(viewGroup, A06);
            viewGroup.setTag(R.id.transition_current_scene, (Object) null);
            ? obj = new Object();
            obj.A01 = A06;
            obj.A00 = viewGroup;
            viewGroup.addOnAttachStateChangeListener(obj);
            viewGroup.getViewTreeObserver().addOnPreDrawListener(obj);
        }
    }

    public static void A03(ViewGroup viewGroup, C14284TtI ttI) {
        AbstractCollection abstractCollection = (AbstractCollection) A00().get(viewGroup);
        if (abstractCollection != null && abstractCollection.size() > 0) {
            Iterator it = abstractCollection.iterator();
            while (it.hasNext()) {
                ((C14284TtI) it.next()).A0O(viewGroup);
            }
        }
        ttI.A0T(viewGroup, true);
        viewGroup.getTag(R.id.transition_current_scene);
    }
}
