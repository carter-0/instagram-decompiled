package X;

import com.facebook.msys.mci.UrlRequest;
import com.facebook.msys.mci.UrlResponse;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.5pI  reason: invalid class name and case insensitive filesystem */
public final class C296005pI extends 1XQ {
    public final UrlResponse A00;
    public final 2ZL A01;

    public C296005pI(UrlRequest urlRequest, 2ZL r9) {
        UrlResponse urlResponse = UrlResponse.$redex_init_class;
        int i = r9.A02;
        List list = r9.A04;
        HashMap hashMap = new HashMap(r4);
        for (1Fn r0 : (1Fn[]) list.toArray(new 1Fn[list.size()])) {
            hashMap.put(r0.A00, r0.A01);
        }
        this.A00 = new UrlResponse(urlRequest, i, hashMap);
        this.A01 = r9;
        this.mStatusCode = i;
    }
}
