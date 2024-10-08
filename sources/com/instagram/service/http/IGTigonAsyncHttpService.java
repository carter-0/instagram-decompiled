package com.instagram.service.http;

import X.0lg;
import X.0qQ;
import X.1Fn;
import X.1HV;
import X.1Pq;
import X.1QS;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C297685sA;
import X.DbT;
import X.DbV;
import X.Pxf;
import com.facebook.tigon.iface.TigonRequest;
import com.facebook.tigon.javaservice.JavaBackedTigonService;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class IGTigonAsyncHttpService implements JavaBackedTigonService {
    public final 0lg session;

    public IGTigonAsyncHttpService(0lg r2) {
        0qQ.A0B(r2, 1);
        this.session = r2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0056  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void submitHttpRequest(com.facebook.tigon.javaservice.AbstractRequestToken r10, com.facebook.tigon.iface.TigonRequest r11, byte[] r12) {
        /*
            r9 = this;
            r7 = 0
            boolean r6 = X.AnonymousClass7TF.A1U(r7, r10, r11)
            r5 = 2
            X.0qQ.A0B(r12, r5)
            boolean r0 = r10 instanceof com.instagram.service.http.IGTigonAsyncHttpServiceRequestToken
            if (r0 == 0) goto L_0x0074
            com.instagram.service.http.IGTigonAsyncHttpServiceRequestToken r10 = (com.instagram.service.http.IGTigonAsyncHttpServiceRequestToken) r10
            if (r10 == 0) goto L_0x0074
            X.1CO r4 = X.AnonymousClass1CO.A00()
            X.1QS r8 = r9.createHttpRequest(r11, r12)
            X.1QT r2 = new X.1QT
            r2.<init>()
            X.1CE r0 = X.1CE.A05
            r2.A04 = r0
            X.1S0 r0 = X.C64641Rz.A05
            X.0qQ.A08(r0)
            java.lang.Object r0 = r11.getLayerInformation(r0)
            X.1Rt r0 = (X.1Rt) r0
            if (r0 == 0) goto L_0x0071
            java.util.Map r1 = r0.A00
            java.lang.String r0 = "purpose"
            java.lang.String r1 = X.DbT.A11(r0, r1)
            if (r1 == 0) goto L_0x0071
            java.lang.String r0 = "fetch"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0065
            X.1Fe r0 = X.1Fe.A03
        L_0x0044:
            r2.A03 = r0
            java.lang.Integer r3 = X.AnonymousClass05K.A01
            r2.A07 = r3
            X.1QU r2 = r2.A00()
            int r1 = r11.startupStatusOnAdded()
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 == r6) goto L_0x005f
            r0 = r3
            if (r1 == r5) goto L_0x005f
            java.lang.Integer r0 = X.AnonymousClass05K.A0C
            if (r1 == r7) goto L_0x005f
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
        L_0x005f:
            r2.A03 = r0
            r4.A02(r10, r8, r2)
            return
        L_0x0065:
            java.lang.String r0 = "prefetch"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0071
            X.1Fe r0 = X.1Fe.A02
            goto L_0x0044
        L_0x0071:
            X.1Fe r0 = X.1Fe.A04
            goto L_0x0044
        L_0x0074:
            java.lang.String r0 = "TigonRequestToken is not TigonAsyncHttpServiceRequestToken type"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.service.http.IGTigonAsyncHttpService.submitHttpRequest(com.facebook.tigon.javaservice.AbstractRequestToken, com.facebook.tigon.iface.TigonRequest, byte[]):void");
    }

    private final 1QS createHttpRequest(TigonRequest tigonRequest, byte[] bArr) {
        Integer num;
        1Pq r3 = new 1Pq(new 1HV(this.session));
        String method = tigonRequest.method();
        if (method.equals("HEAD")) {
            num = AnonymousClass05K.A00;
        } else if (method.equals("POST")) {
            num = AnonymousClass05K.A01;
        } else if (method.equals("PATCH")) {
            num = AnonymousClass05K.A0C;
        } else if (method.equals("GET")) {
            num = AnonymousClass05K.A0N;
        } else if (method.equals("DELETE")) {
            num = AnonymousClass05K.A0Y;
        } else {
            throw AnonymousClass7TE.A0w(method);
        }
        r3.A01(num);
        r3.A02(tigonRequest.url());
        Map headers = tigonRequest.headers();
        ArrayList A0q = AnonymousClass7TF.A0q(headers, 0);
        Iterator A16 = DbV.A16(headers);
        while (A16.hasNext()) {
            String A18 = AnonymousClass7TE.A18(A16);
            Pxf.A1M(A18, DbT.A11(A18, headers), A0q);
        }
        List list = r3.A06;
        list.clear();
        list.addAll(A0q);
        r3.A00 = new C297685sA(new 1Fn("Content-Type", AnonymousClass000.A00(252)), bArr);
        r3.A05 = tigonRequest.retryable();
        if (tigonRequest.replaySafe()) {
            r3.A04 = true;
        }
        1QS A00 = r3.A00();
        byte b = tigonRequest.httpPriority().A00;
        boolean z = tigonRequest.httpPriority().A01;
        A00.A00 = b;
        A00.A03 = z;
        return A00;
    }
}
