package X;

import com.instagram.model.reels.Reel;
import java.util.Iterator;
import java.util.Set;

/* renamed from: X.Lcu  reason: case insensitive filesystem */
public final class C64493Lcu implements MRU {
    public final /* synthetic */ String A00;

    public C64493Lcu(String str) {
        this.A00 = str;
    }

    public final boolean Esv(Reel reel) {
        String str = this.A00;
        Set A0Q = reel.A0Q();
        0qQ.A07(A0Q);
        Iterator it = A0Q.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (0qQ.A0K(((1Xj) next).A30(), AnonymousClass3VO.A02(str))) {
                if (next == null) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
