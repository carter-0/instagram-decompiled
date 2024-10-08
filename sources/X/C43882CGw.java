package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.CGw  reason: case insensitive filesystem */
public final class C43882CGw extends C298815u5 {
    public String A00;
    public List A01 = 0sn.A00;
    public boolean A02;

    public final List Ao4() {
        List<C41938B7p> list = this.A01;
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (C41938B7p b7p : list) {
            b7p.A02();
            if (b7p.A02().size() != 0) {
                A1C.add(b7p.A01());
            }
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) A1C);
        0qQ.A07(copyOf);
        ArrayList A0r = AnonymousClass7TG.A0r(copyOf);
        Iterator it = copyOf.iterator();
        while (it.hasNext()) {
            A0r.add(C295375o3.A03((AnonymousClass3OA) it.next()));
        }
        List unmodifiableList = Collections.unmodifiableList(A0r);
        0qQ.A07(unmodifiableList);
        return unmodifiableList;
    }

    public final C276114sa BaP() {
        C298855u9 A002 = C276114sa.A00.A00(this.A02);
        A002.A00 = this.A00;
        return A002.A00();
    }

    public final boolean CP6() {
        return true;
    }

    public final String getNextMaxId() {
        return this.A00;
    }

    public final void A01() {
        super.A00();
    }
}
