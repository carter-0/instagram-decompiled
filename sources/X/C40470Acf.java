package X;

import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import java.util.List;

/* renamed from: X.Acf  reason: case insensitive filesystem */
public final class C40470Acf implements C332867Wr {
    public final List A00;

    public final boolean AFj(DirectMessageIdentifier directMessageIdentifier) {
        0qQ.A0B(directMessageIdentifier, 0);
        for (C332867Wr AFj : this.A00) {
            if (AFj.AFj(directMessageIdentifier)) {
                return true;
            }
        }
        return false;
    }

    public final boolean CHm(DirectMessageIdentifier directMessageIdentifier, C62320sa r6) {
        0qQ.A0B(directMessageIdentifier, 0);
        for (C332867Wr CHm : this.A00) {
            if (CHm.CHm(directMessageIdentifier, r6)) {
                return true;
            }
        }
        return false;
    }

    public final boolean CHn(DirectMessageIdentifier directMessageIdentifier) {
        0qQ.A0B(directMessageIdentifier, 0);
        for (C332867Wr CHn : this.A00) {
            if (CHn.CHn(directMessageIdentifier)) {
                return true;
            }
        }
        return false;
    }

    public C40470Acf(List list) {
        this.A00 = list;
    }
}
