package X;

import com.facebook.rtc.views.omnigrid.GridItemType;
import java.util.List;

/* renamed from: X.MuR  reason: case insensitive filesystem */
public final class C67767MuR extends C232322tW {
    public final List A00;
    public final List A01;

    public C67767MuR(List list, List list2) {
        0qQ.A0B(list, 1);
        this.A01 = list;
        this.A00 = list2;
    }

    public final int A02() {
        return this.A00.size();
    }

    public final int A03() {
        return this.A01.size();
    }

    public final boolean A04(int i, int i2) {
        List list = this.A01;
        if (((C68166N3g) list.get(i)).A03 == GridItemType.SELF_VIEW || 0qQ.A0K(list.get(i), this.A00.get(i2))) {
            return true;
        }
        return false;
    }

    public final boolean A05(int i, int i2) {
        return AnonymousClass7TF.A1Q((((C68166N3g) this.A01.get(i)).A02 > ((C68166N3g) this.A00.get(i2)).A02 ? 1 : (((C68166N3g) this.A01.get(i)).A02 == ((C68166N3g) this.A00.get(i2)).A02 ? 0 : -1)));
    }
}
