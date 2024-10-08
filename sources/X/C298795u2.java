package X;

import com.instagram.model.keyword.Keyword;
import java.util.List;

/* renamed from: X.5u2  reason: invalid class name and case insensitive filesystem */
public final class C298795u2 {
    public C296865qm A00;
    public Keyword A01;
    public Integer A02;
    public String A03 = "";
    public String A04;
    public List A05 = null;

    public C298795u2() {
        Integer num = AnonymousClass05K.A01;
        C296865qm r1 = C296865qm.NOT_A_TOPIC;
        this.A02 = num;
        this.A00 = r1;
        this.A04 = "midscroll_pivot";
    }

    public final Keyword A00() {
        Keyword keyword = this.A01;
        if (keyword != null) {
            return keyword;
        }
        0qQ.A0F("keyword");
        throw AnonymousClass00P.createAndThrow();
    }

    public final Integer A01() {
        if (this.A00 == C296865qm.NOT_A_TOPIC) {
            return AnonymousClass05K.A1F;
        }
        return AnonymousClass05K.A1I;
    }
}
