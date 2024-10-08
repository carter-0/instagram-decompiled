package X;

import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.util.Map;

/* renamed from: X.3n8  reason: invalid class name and case insensitive filesystem */
public final class C251453n8 extends 2UD {
    public final String A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C251453n8(long j, String str, String str2) {
        super(j, str);
        0qQ.A0B(str2, 3);
        this.A00 = str2;
    }

    public final int A00() {
        return 0;
    }

    public final String A03() {
        return "undefined";
    }

    public final void A05(StringBuilder sb) {
        0qQ.A0B(sb, 0);
        sb.append(this.A00);
        sb.append("|");
    }

    public final String A01() {
        return 002.A0S("undefined(", this.A00, ')');
    }

    public final String A02() {
        return 002.A0S("user interacted with the app (", this.A00, ')');
    }

    public final Map A04() {
        return 0se.A0M(new 0eP(DevServerEntity.COLUMN_DESCRIPTION, this.A00));
    }
}
