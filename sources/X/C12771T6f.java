package X;

import com.facebook.proxygen.HTTPRequestError;
import com.facebook.proxygen.HTTPRequestHandler;
import com.facebook.proxygen.JniHandler;
import com.facebook.proxygen.NativeReadBuffer;
import com.facebook.proxygen.TraceEventContext;
import com.facebook.proxygen.TraceEventObserver;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.io.IOException;

/* renamed from: X.T6f  reason: case insensitive filesystem */
public final class C12771T6f implements C13667Teb {
    public int A00;
    public boolean A01;
    public final LightweightQuickPerformanceLogger A02;
    public final SRB A03;
    public final S7W A04;

    public C12771T6f(LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger, SRB srb, int i, boolean z) {
        this.A03 = srb;
        this.A04 = new S7W(lightweightQuickPerformanceLogger);
        this.A02 = lightweightQuickPerformanceLogger;
        this.A00 = i;
        this.A01 = z;
    }

    /* JADX WARNING: type inference failed for: r17v0, types: [com.facebook.proxygen.RequestStatsObserver, java.lang.Object, com.facebook.proxygen.TraceEventObserver] */
    public final C13750TgM ExU(1QS r24, 1QU r25, C13846TiM tiM, AnonymousClass0vF r27) {
        SRB.A00();
        HTTPRequestHandler hTTPRequestHandler = new HTTPRequestHandler(this.A00, this.A01);
        C12776T6k t6k = new C12776T6k(hTTPRequestHandler);
        1QS r9 = r24;
        C13846TiM tiM2 = tiM;
        AnonymousClass0vF r12 = r27;
        C12200Sop sop = new C12200Sop(r9, tiM2, r12);
        NativeReadBuffer nativeReadBuffer = new NativeReadBuffer();
        nativeReadBuffer.init();
        ? obj = new Object();
        C12202Sou sou = new C12202Sou(SRB.A0V);
        SRB srb = this.A03;
        1QU r8 = r25;
        S28 s28 = new S28(r8, new C10627RvL(srb.A0B, sou, r8.A03));
        1C5 r15 = srb.A0A;
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A02;
        1QS r19 = r9;
        C12199Soo soo = new C12199Soo(srb.A09, r15, nativeReadBuffer, obj, lightweightQuickPerformanceLogger, r19, tiM2, s28, r12);
        TraceEventContext traceEventContext = new TraceEventContext(new TraceEventObserver[]{obj}, sou);
        JniHandler jniHandler = new JniHandler(hTTPRequestHandler, soo, sop);
        try {
            this.A04.A00(r9, "http_client_send_request");
            srb.A02(hTTPRequestHandler, jniHandler, nativeReadBuffer, traceEventContext, r9, r8.A0D);
            tiM2.Deg();
            return t6k;
        } catch (IOException e) {
            tiM2.DCl(new C8838RCa(new HTTPRequestError(002.A0u("Failed to send Liger request with err msg=", e.getMessage(), ", ex=", e.toString()), HTTPRequestError.HTTPRequestStage.ProcessRequest, HTTPRequestError.ProxygenError.None)));
            return t6k;
        }
    }
}
