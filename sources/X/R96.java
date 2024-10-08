package X;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.apache.http.Header;

public final class R96 extends C8804RAf {
    public final /* synthetic */ int A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ C12199Soo A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ Header[] A04;

    public R96(C12199Soo soo, String str, Header[] headerArr, int i, long j) {
        this.A02 = soo;
        this.A01 = j;
        this.A04 = headerArr;
        this.A00 = i;
        this.A03 = str;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [java.lang.Object, X.2ZD] */
    public final void run() {
        C12199Soo soo = this.A02;
        S7W s7w = soo.A0A;
        1QS r6 = soo.A08;
        s7w.A03(r6, "response_headers_received", this.A01, TimeUnit.NANOSECONDS);
        Header[] headerArr = this.A04;
        Map map = soo.A03;
        ArrayList A002 = C12199Soo.A00(map, headerArr);
        try {
            1HW r2 = r6.A05;
            if (r2 != null) {
                r2.FJR(r6.A09, Collections.unmodifiableMap(map));
            }
            C13846TiM tiM = soo.A02;
            int i = this.A00;
            String str = this.A03;
            int i2 = r6.A04;
            ? obj = new Object();
            obj.A01 = i;
            obj.A02 = str;
            obj.A00 = i2;
            obj.A03 = A002;
            tiM.Df9(obj);
        } catch (IOException | IllegalStateException e) {
            0wb.A07("LigerAsyncInterface_resp", e);
        }
    }

    public final String toString() {
        return Pxf.A0l("LigerAsyncResponseHandler.onResponse: ", this.A02.A08.A09);
    }
}
