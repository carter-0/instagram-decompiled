package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.Map;

/* renamed from: X.4si  reason: invalid class name and case insensitive filesystem */
public final class C276134si extends AnonymousClass475 {
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C276134si(String str) {
        super(str);
        0qQ.A0B(str, 1);
        this.A00 = str;
    }

    public final int A00() {
        return 4;
    }

    public final Map A01() {
        return 0se.A0M(new 0eP(DevServerEntity.COLUMN_DESCRIPTION, this.A00));
    }

    public final void A02(StringBuilder sb) {
        sb.append(this.A00);
    }
}
