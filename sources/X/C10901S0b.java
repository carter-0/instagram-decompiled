package X;

import com.instagram.fbpay.graphql.FBPayIGGraphQLQueryExecutor;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.S0b  reason: case insensitive filesystem */
public final class C10901S0b {
    public final AnonymousClass0eM A00 = AnonymousClass0eN.A01(TUR.A00);

    public final C8294Qna A00(S4g s4g, QNI qni, String str) {
        DbY.A1S(s4g, str);
        try {
            C12123SnM snM = (C12123SnM) C41847B3o.A16(S8Y.class);
            2IS r2 = snM.A00;
            r2.A00(qni, "input");
            snM.A01 = true;
            r2.A04("payment_product_id", str);
            snM.A02 = true;
            return C8294Qna.A00(s4g, (FBPayIGGraphQLQueryExecutor) this.A00.getValue(), snM.build(), C12602Szb.A00);
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            throw C41845B3m.A0j(e);
        }
    }
}
