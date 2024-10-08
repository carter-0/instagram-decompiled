package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class CQU extends 17P implements AnonymousClass3IS {
    public List A00;

    public final List BPz() {
        return this.A00;
    }

    public final AnonymousClass3IS E9S(1E9 r4) {
        ArrayList arrayList;
        ImmutableList A08 = A08(-8666270, ImmutablePandoMediaDict.class);
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

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, X.3IS, X.CQU] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, C44540Cga.A00(this));
    }

    public final String AtD() {
        return A0i(-816382095);
    }

    public final String BVq() {
        return A0i(-1594628439);
    }

    public final String Bir() {
        return A0j(1174739785);
    }

    public final String C80() {
        return A0i(-434821051);
    }

    public final String C9L() {
        return C41847B3o.A1B(this);
    }

    public final AnonymousClass3IR FCs(1E9 r12) {
        ArrayList arrayList;
        String A0i = A0i(-816382095);
        String A0i2 = A0i(-815905284);
        String A0e = A0e();
        ImmutableList A08 = A08(-8666270, ImmutablePandoMediaDict.class);
        if (A08 != null) {
            ArrayList A0r = AnonymousClass7TG.A0r(A08);
            Iterator it = A08.iterator();
            while (it.hasNext()) {
                C41847B3o.A1O(r12, A0r, it);
            }
            if (A0r != null) {
                arrayList = AnonymousClass7TG.A0r(A0r);
                Iterator it2 = A0r.iterator();
                while (it2.hasNext()) {
                    C41848B3p.A1V(r12, arrayList, it2);
                }
                return new AnonymousClass3IR(A0i, A0i2, A0e, A0i(-1594628439), A0j(1174739785), A0i(-434821051), C41847B3o.A1B(this), arrayList);
            }
        }
        arrayList = null;
        return new AnonymousClass3IR(A0i, A0i2, A0e, A0i(-1594628439), A0j(1174739785), A0i(-434821051), C41847B3o.A1B(this), arrayList);
    }

    public final String getCtaText() {
        return A0i(-815905284);
    }

    public final String getId() {
        return A0e();
    }
}
