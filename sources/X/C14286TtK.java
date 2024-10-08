package X;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.TtK  reason: case insensitive filesystem */
public final class C14286TtK {
    public View A00;
    public final ArrayList A01 = new ArrayList();
    public final Map A02 = new HashMap();

    public final boolean equals(Object obj) {
        if (obj instanceof C14286TtK) {
            C14286TtK ttK = (C14286TtK) obj;
            if (this.A00 != ttK.A00 || !this.A02.equals(ttK.A02)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0K(this.A00) + this.A02.hashCode();
    }

    public final String toString() {
        StringBuilder A0n = AnonymousClass7TF.A0n(002.A0g("TransitionValues@", Integer.toHexString(hashCode()), ":\n"));
        A0n.append("    view = ");
        A0n.append(this.A00);
        String A0R = 002.A0R(AnonymousClass7TF.A0l("\n", A0n), "    values:");
        Map map = this.A02;
        Iterator A16 = DbV.A16(map);
        while (A16.hasNext()) {
            String A18 = AnonymousClass7TE.A18(A16);
            StringBuilder A0n2 = AnonymousClass7TF.A0n(A0R);
            A0n2.append("    ");
            A0n2.append(A18);
            A0n2.append(": ");
            A0n2.append(map.get(A18));
            A0R = AnonymousClass7TF.A0l("\n", A0n2);
        }
        return A0R;
    }

    public C14286TtK(View view) {
        this.A00 = view;
    }

    @Deprecated
    public C14286TtK() {
    }
}
