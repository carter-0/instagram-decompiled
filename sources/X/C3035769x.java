package X;

import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.69x  reason: invalid class name and case insensitive filesystem */
public final class C3035769x extends 17P implements AnonymousClass60G {
    public final List B3g() {
        return null;
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [com.facebook.pando.TreeJNI, X.69x, X.17P] */
    public final AnonymousClass60F F8G(1E9 r7) {
        ArrayList arrayList;
        ImmutableList A08 = A08(549161688, ImmutablePandoUserDict.class);
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
        return new AnonymousClass60F(getOptionalBooleanValueByHashCode(2122613350), getOptionalIntValueByHashCode(1567799751), A0h(-798298666), A0h(1634460456), arrayList);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.facebook.pando.TreeJNI, X.69x, X.60G] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI(C44287CcV.A00(this), this);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.69x] */
    public final Integer BWw() {
        return getOptionalIntValueByHashCode(1567799751);
    }

    public final String Bhp() {
        return A0h(-798298666);
    }

    public final String Bhu() {
        return A0h(1634460456);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.69x] */
    public final Boolean Bup() {
        return getOptionalBooleanValueByHashCode(2122613350);
    }
}
