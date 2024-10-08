package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.base.activity.BaseFragmentActivity;
import com.instagram.wellbeing.limitedprofile.fragment.LimitedCommentsFragment;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;

public final class Wv0 extends HashSet<C247733gp> {
    public final Set A00 = new HashSet();
    public final Integer A01;

    /* renamed from: A01 */
    public final boolean add(C247733gp r2) {
        0qQ.A0B(r2, 0);
        boolean add = super.add(r2);
        if (add) {
            A00();
        }
        return add;
    }

    public final boolean addAll(Collection collection) {
        0qQ.A0B(collection, 0);
        boolean addAll = super.addAll(collection);
        if (addAll) {
            A00();
        }
        return addAll;
    }

    public final boolean removeAll(Collection collection) {
        0qQ.A0B(collection, 0);
        boolean removeAll = super.removeAll(00k.A0k(collection));
        if (removeAll) {
            A00();
        }
        return removeAll;
    }

    public final boolean removeIf(Predicate predicate) {
        0qQ.A0B(predicate, 0);
        boolean removeIf = super.removeIf(predicate);
        if (removeIf) {
            A00();
        }
        return removeIf;
    }

    public final boolean retainAll(Collection collection) {
        0qQ.A0B(collection, 0);
        boolean retainAll = super.retainAll(00k.A0k(collection));
        if (retainAll) {
            A00();
        }
        return retainAll;
    }

    private final void A00() {
        for (VQ1 vq1 : this.A00) {
            Integer num = this.A01;
            LimitedCommentsFragment limitedCommentsFragment = vq1.A00;
            if (limitedCommentsFragment.isAdded() && AnonymousClass05K.A00 == num) {
                FragmentActivity activity = limitedCommentsFragment.getActivity();
                2dZ A0K = DbT.A0K(activity);
                if (activity instanceof BaseFragmentActivity) {
                    A0K.A0T();
                }
            }
        }
    }

    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof C247733gp)) {
            return false;
        }
        return super.contains(obj);
    }

    public final /* bridge */ boolean remove(Object obj) {
        if (!(obj instanceof C247733gp)) {
            return false;
        }
        0qQ.A0B(obj, 0);
        boolean remove = super.remove(obj);
        if (!remove) {
            return remove;
        }
        A00();
        return remove;
    }

    public Wv0(Integer num) {
        this.A01 = num;
    }

    public final void clear() {
        int size = size();
        super.clear();
        if (size != 0) {
            A00();
        }
    }

    public final /* bridge */ int size() {
        return super.size();
    }
}
