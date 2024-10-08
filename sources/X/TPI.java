package X;

import com.google.common.util.concurrent.ListenableFuture;
import kotlinx.serialization.json.JsonElementSerializer;

public final class TPI implements AnonymousClass0eL, 0sP {
    public final int A00;

    public TPI(int i) {
        this.A00 = i;
    }

    public final Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                AnonymousClass34S r4 = (AnonymousClass34S) obj;
                r4.getClass();
                Object obj2 = r4.A00;
                obj2.getClass();
                ListenableFuture A03 = C255183ti.A03(C11097S9y.A00(obj2));
                S4g s4g = (S4g) r4.A01;
                C12507Svd svd = new C12507Svd(C12507Svd.A03, A03);
                if (s4g == null) {
                    return svd;
                }
                s4g.A01(new C11605Sd8(svd));
                return svd;
            case 1:
                return obj;
            case 2:
                if (obj == null) {
                    return new NullPointerException();
                }
                return null;
            case 4:
                AnonymousClass7TG.A1I(0wj.A01, "IAB BrowserLiteCallbackService fetch link history error.", (Throwable) obj, 817903741);
                break;
            case 5:
                return null;
            case 6:
                return new GRE((String) obj).A02;
            case 8:
                C17912Vi3 vi3 = (C17912Vi3) obj;
                JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
                0qQ.A0B(vi3, 0);
                C20437Wrf wrf = new C20437Wrf(new C20404Wqo(5));
                String A002 = AnonymousClass000.A00(4366);
                0sn r2 = 0sn.A00;
                vi3.A00(A002, r2, wrf);
                vi3.A00("JsonNull", r2, new C20437Wrf(new C20404Wqo(6)));
                vi3.A00("JsonLiteral", r2, new C20437Wrf(new C20404Wqo(7)));
                vi3.A00("JsonObject", r2, new C20437Wrf(new C20404Wqo(8)));
                vi3.A00("JsonArray", r2, new C20437Wrf(new C20404Wqo(9)));
                break;
        }
        return C60340gF.A00;
    }
}
