package X;

import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.69f  reason: invalid class name and case insensitive filesystem */
public final class C3035169f extends 17P implements AnonymousClass605 {
    public final C42043BEv F3W(1E6 r4) {
        0qQ.A0B(r4, 0);
        return F3V(new 1E9(r4, 6, false));
    }

    public final List B4z() {
        return null;
    }

    public final User B9t() {
        throw new UnsupportedOperationException("Please call reconciledWithStore() first to access the 'group' field.");
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.69f, com.facebook.pando.TreeJNI, X.17P] */
    public final C42043BEv F3V(1E9 r7) {
        ArrayList arrayList;
        Class<ImmutablePandoUserDict> cls = ImmutablePandoUserDict.class;
        ImmutableList A08 = A08(-1284365887, cls);
        if (A08 != null) {
            ArrayList<User> arrayList2 = new ArrayList<>(0Yv.A1E(A08, 10));
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                ImmutablePandoUserDict immutablePandoUserDict = (ImmutablePandoUserDict) it.next();
                Parcelable.Creator creator = User.CREATOR;
                0qQ.A0A(immutablePandoUserDict);
                arrayList2.add(1aC.A01(r7, immutablePandoUserDict));
            }
            arrayList = new ArrayList(0Yv.A1E(arrayList2, 10));
            for (User A00 : arrayList2) {
                arrayList.add(r7.A00(A00));
            }
        } else {
            arrayList = null;
        }
        Parcelable.Creator creator2 = User.CREATOR;
        return new C42043BEv(r7.A00(1aC.A01(r7, (ImmutablePandoUserDict) A04(98629247, cls))), getOptionalIntValueByHashCode(665320141), arrayList);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.69f, com.facebook.pando.TreeJNI, X.605] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(CYE.A00(this), this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.69f, com.facebook.pando.TreeJNI] */
    public final Integer BXK() {
        return getOptionalIntValueByHashCode(665320141);
    }
}
