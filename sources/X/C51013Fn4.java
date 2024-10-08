package X;

import com.instagram.model.direct.DirectShareTarget;
import java.util.Set;

/* renamed from: X.Fn4  reason: case insensitive filesystem */
public final class C51013Fn4 implements G6Y {
    public final /* synthetic */ C50423FbW A00;

    public C51013Fn4(C50423FbW fbW) {
        this.A00 = fbW;
    }

    public final void DpQ(String str) {
        C50423FbW fbW = this.A00;
        DirectShareTarget directShareTarget = fbW.A00;
        if (directShareTarget != null) {
            String str2 = directShareTarget.A0J;
            if (str2 == null) {
                str2 = "";
            }
            if (str.equalsIgnoreCase(str2)) {
                Set set = fbW.A09;
                String A09 = directShareTarget.A09();
                0qQ.A07(A09);
                set.add(A09);
            }
            ((C49916FEq) fbW.A06.A01).A05.Dbj(directShareTarget);
        }
    }
}
