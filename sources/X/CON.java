package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CON extends 17P implements AnonymousClass3IM {
    public List A00;

    public final List Bzx() {
        return this.A00;
    }

    public final AnonymousClass3IM E8D(1E9 r4) {
        ArrayList arrayList;
        ImmutableList A08 = A08(-1884266413, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            arrayList = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1O(r4, arrayList, it);
            }
        } else {
            arrayList = null;
        }
        this.A00 = arrayList;
        return this;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CON, X.3IM] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44361Cdh.A00(this));
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CON] */
    public final Integer BX3() {
        return getOptionalIntValueByHashCode(-1307793340);
    }

    public final Long BxC() {
        return A0L(1197591881);
    }

    public final String BxD() {
        return A0i(904444871);
    }

    public final String BxE() {
        return A0i(2080666358);
    }

    public final String BxF() {
        return A0i(-168585866);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CON] */
    public final Integer C8c() {
        return getOptionalIntValueByHashCode(-1115199084);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CON] */
    public final Integer C8m() {
        return getOptionalIntValueByHashCode(12722959);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.CON] */
    public final Integer C8n() {
        return getOptionalIntValueByHashCode(1771893180);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.facebook.pando.TreeJNI, X.CON, X.17P] */
    public final AnonymousClass3IL F97(1E9 r13) {
        ArrayList arrayList;
        Integer optionalIntValueByHashCode = getOptionalIntValueByHashCode(-1307793340);
        Long A0L = A0L(1197591881);
        String A0i = A0i(904444871);
        String A0i2 = A0i(2080666358);
        String A0i3 = A0i(-168585866);
        ImmutableList A08 = A08(-1884266413, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1O(r13, A0r, it);
            }
            if (A0r != null) {
                arrayList = AnonymousClass7TG.A0r(A0r);
                Iterator it2 = A0r.iterator();
                while (it2.hasNext()) {
                    C41848B3p.A1V(r13, arrayList, it2);
                }
                return new AnonymousClass3IL(optionalIntValueByHashCode, getOptionalIntValueByHashCode(-1115199084), getOptionalIntValueByHashCode(12722959), getOptionalIntValueByHashCode(1771893180), A0L, A0i, A0i2, A0i3, arrayList);
            }
        }
        arrayList = null;
        return new AnonymousClass3IL(optionalIntValueByHashCode, getOptionalIntValueByHashCode(-1115199084), getOptionalIntValueByHashCode(12722959), getOptionalIntValueByHashCode(1771893180), A0L, A0i, A0i2, A0i3, arrayList);
    }
}
