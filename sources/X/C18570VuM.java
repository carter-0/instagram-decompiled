package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.VuM  reason: case insensitive filesystem */
public final class C18570VuM {
    public 1Xj A00;
    public Uw7 A01;
    public C16276Urd A02;
    public Integer A03;
    public Map A04;
    public final Map A05;

    public final void A00(UserSession userSession, Product product, List list) {
        this.A05.put(W1L.A00(userSession, product), list);
    }

    public C18570VuM(W1L w1l) {
        this.A01 = Uw7.A02;
        HashMap hashMap = new HashMap();
        this.A05 = hashMap;
        this.A03 = null;
        this.A04 = new HashMap();
        this.A01 = w1l.A01;
        this.A00 = w1l.A00;
        hashMap.putAll(w1l.A05);
        this.A03 = w1l.A03;
        this.A04 = w1l.A04;
        this.A02 = w1l.A02;
    }

    public C18570VuM() {
        this.A01 = Uw7.A02;
        this.A05 = new HashMap();
        this.A03 = null;
        this.A04 = new HashMap();
    }
}
