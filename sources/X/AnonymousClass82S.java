package X;

import java.util.LinkedList;
import org.json.JSONObject;

/* renamed from: X.82S  reason: invalid class name */
public final class AnonymousClass82S {
    public B2P A00;
    public final LinkedList A01 = new LinkedList();

    public final void A00(JSONObject jSONObject) {
        B2P b2p = this.A00;
        if (b2p == null || !b2p.isAlive()) {
            this.A01.add(jSONObject);
        } else {
            b2p.enqueueEvent(jSONObject);
        }
    }
}
