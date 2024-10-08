package com.instagram.service.http;

import X.0KC;
import X.0dV;
import X.0qQ;
import X.1Qd;
import X.2ZD;
import X.C9850RiP;
import X.JTU;
import X.Pxe;
import com.facebook.jni.HybridData;
import com.facebook.tigon.iface.TigonErrorCode;
import com.facebook.tigon.javaservice.AbstractRequestToken;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;

public final class IGTigonAsyncHttpServiceRequestToken extends AbstractRequestToken implements 1Qd {
    public static final C9850RiP Companion = new Object();
    public final String GRAPHQL_IG_TIGON_ERROR_DOMAIN = "GraphqlIGTigonErrorDomain";
    public final String TAG = "IGTigonAsyncHttpServiceRequestToken";
    public boolean aborted;
    public 2ZD responseInfo;
    public final ByteArrayOutputStream responseStream = Pxe.A0b();
    public int statusCode;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IGTigonAsyncHttpServiceRequestToken(HybridData hybridData) {
        super(hybridData);
        0qQ.A0B(hybridData, 1);
    }

    private final native void failure(int i, String str, int i2, String str2);

    private final native void success(int i, String[] strArr, long j, byte[] bArr);

    public void cancel() {
    }

    public void changeHttpPriority(byte b, boolean z) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0062, code lost:
        if (r7 == null) goto L_0x0064;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onComplete() {
        /*
            r11 = this;
            r5 = r11
            X.2ZD r3 = r11.responseInfo
            java.lang.String r2 = ""
            if (r3 == 0) goto L_0x001d
            int r1 = r3.A01
            r0 = 200(0xc8, float:2.8E-43)
            if (r1 < r0) goto L_0x0011
            r0 = 300(0x12c, float:4.2E-43)
            if (r1 < r0) goto L_0x001d
        L_0x0011:
            com.facebook.tigon.iface.TigonErrorCode r0 = com.facebook.tigon.iface.TigonErrorCode.NONE
            int r1 = r0.value
            java.lang.String r0 = r11.GRAPHQL_IG_TIGON_ERROR_DOMAIN
            int r4 = r11.statusCode
        L_0x0019:
            r11.failure(r1, r0, r4, r2)
            return
        L_0x001d:
            boolean r0 = r11.aborted
            r4 = 0
            if (r0 != 0) goto L_0x0057
            if (r3 == 0) goto L_0x0064
            java.util.List r0 = r3.A03
            java.util.List r1 = java.util.Collections.unmodifiableList(r0)
            if (r1 == 0) goto L_0x0064
            int r0 = r1.size()
            int r0 = r0 * 2
            java.util.ArrayList r3 = X.DbS.A0v(r0)
            java.util.Iterator r2 = r1.iterator()
        L_0x003a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x005e
            java.lang.Object r1 = r2.next()
            X.1Fn r1 = (X.1Fn) r1
            java.lang.String r0 = r1.A00
            X.0qQ.A06(r0)
            r3.add(r0)
            java.lang.String r0 = r1.A01
            X.0qQ.A06(r0)
            r3.add(r0)
            goto L_0x003a
        L_0x0057:
            com.facebook.tigon.iface.TigonErrorCode r0 = com.facebook.tigon.iface.TigonErrorCode.NONE
            int r1 = r0.value
            java.lang.String r0 = r11.GRAPHQL_IG_TIGON_ERROR_DOMAIN
            goto L_0x0019
        L_0x005e:
            java.lang.String[] r7 = X.Pxf.A1a(r3, r4)
            if (r7 != 0) goto L_0x0066
        L_0x0064:
            java.lang.String[] r7 = new java.lang.String[r4]
        L_0x0066:
            int r6 = r11.statusCode
            java.io.ByteArrayOutputStream r0 = r11.responseStream
            int r0 = r0.size()
            long r8 = (long) r0
            java.io.ByteArrayOutputStream r0 = r11.responseStream
            byte[] r10 = r0.toByteArray()
            X.0qQ.A07(r10)
            r5.success(r6, r7, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.service.http.IGTigonAsyncHttpServiceRequestToken.onComplete():void");
    }

    public void onFailed(IOException iOException) {
        0qQ.A0B(iOException, 0);
        0KC.A0F(this.TAG, "Exception found during request", iOException);
        failure(TigonErrorCode.NONE.value, this.GRAPHQL_IG_TIGON_ERROR_DOMAIN, 0, iOException.toString());
    }

    public void onNewData(ByteBuffer byteBuffer) {
        0qQ.A0B(byteBuffer, 0);
        if (!this.aborted) {
            try {
                JTU.A1I(this.responseStream, byteBuffer);
            } catch (Exception e) {
                0KC.A0F(this.TAG, "Exception while writing response stream", e);
                this.aborted = true;
            }
        }
    }

    public void onResponseStarted(2ZD r2) {
        0qQ.A0B(r2, 0);
        this.statusCode = r2.A01;
        this.responseInfo = r2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.RiP] */
    static {
        0dV.A0C("igtigonasynchttpservice-jni");
    }
}
