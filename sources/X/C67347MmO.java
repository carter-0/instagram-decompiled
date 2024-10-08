package X;

import com.google.common.collect.ImmutableCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.MmO  reason: case insensitive filesystem */
public final class C67347MmO extends 1L8 {
    public List A00;

    public C67347MmO(ImmutableCollection immutableCollection, boolean z) {
        super(immutableCollection, z, true);
        List A0v;
        if (immutableCollection.isEmpty()) {
            A0v = Collections.emptyList();
        } else {
            int size = immutableCollection.size();
            1J2.A00(size, "initialArraySize");
            A0v = DbS.A0v(size);
        }
        for (int i = 0; i < immutableCollection.size(); i++) {
            A0v.add((Object) null);
        }
        this.A00 = A0v;
        A0C();
    }

    public final void A0D() {
        Object obj;
        List<C67604Mqc> list = this.A00;
        if (list != null) {
            int size = list.size();
            1J2.A00(size, "initialArraySize");
            ArrayList A0v = DbS.A0v(size);
            for (C67604Mqc mqc : list) {
                if (mqc != null) {
                    obj = mqc.A00;
                } else {
                    obj = null;
                }
                A0v.add(obj);
            }
            set(Collections.unmodifiableList(A0v));
        }
    }

    public final void A0E(int i, Object obj) {
        List list = this.A00;
        if (list != null) {
            list.set(i, new C67604Mqc(obj));
        }
    }

    public final void A0F(Integer num) {
        C67347MmO.super.A0F(num);
        this.A00 = null;
    }
}
