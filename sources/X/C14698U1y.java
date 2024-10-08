package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.facebook.falco.fabric.FFSingletonJNILogger;
import com.facebook.falco.fabric.FFSingletonJNILogger$CollectionControlDecision;
import com.facebook.falco.fabric.FFSingletonJNILogger$CollectionControlDecisionStatus;
import com.facebook.flexiblesampling.SamplingResult;
import com.facebook.proxygen.LigerSamplePolicy;
import java.util.HashMap;

/* renamed from: X.U1y  reason: case insensitive filesystem */
public final class C14698U1y extends Handler {
    public long A00;
    public final int A01 = 3;
    public final int A02 = 2;
    public final VRC A03;
    public final C17193VLx A04;
    public final int A05 = 1;
    public final 01W A06 = new 01W();

    public C14698U1y(Looper looper, VRC vrc, C17193VLx vLx) {
        super(looper);
        this.A03 = vrc;
        this.A04 = vLx;
        sendEmptyMessageDelayed(1, 500);
    }

    public final void handleMessage(Message message) {
        0qQ.A0B(message, 0);
        int i = message.what;
        if (i == this.A01) {
            Object obj = message.obj;
            0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.analytics2.fabric.handler.EventDataWithLatency");
            this.A06.add(obj);
            return;
        }
        int i2 = this.A05;
        if (i == i2) {
            A00();
            sendEmptyMessageDelayed(i2, 500);
        } else if (i == this.A02) {
            A00();
            Object obj2 = message.obj;
            0qQ.A0C(obj2, AnonymousClass000.A00(17));
            this.A00 = AnonymousClass7TE.A0R(obj2);
        }
    }

    private final void A00() {
        while (true) {
            01W r2 = this.A06;
            if (!r2.isEmpty()) {
                1tH r7 = (1tH) r2.removeFirst();
                this.A04.A00.A03(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                C61520nU.A00().A03(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
                0Df r33 = r7.A03;
                HashMap A002 = AnonymousClass50K.A00(r33);
                long j = r7.A01;
                SamplingResult samplingResult = r7.A04;
                if (samplingResult.A04) {
                    long j2 = this.A00;
                    String str = r7.A05;
                    long j3 = r7.A02;
                    VRC vrc = this.A03;
                    long j4 = r7.A00;
                    AnonymousClass1to r22 = vrc.A00;
                    C66741qI r13 = vrc.A01;
                    long j5 = r22.A01(j4).A01;
                    long j6 = r13.A0m;
                    if (j6 != -1) {
                        j5 = Math.min(j6, j5);
                    }
                    Object obj = A002.get("extra");
                    0qQ.A0C(obj, "null cannot be cast to non-null type kotlin.String");
                    long j7 = j2;
                    FFSingletonJNILogger.log(j7, str, j, false, 1, false, j3, j5, (String) obj, r7.A06);
                } else {
                    long j8 = this.A00;
                    String str2 = r7.A05;
                    long j9 = r7.A02;
                    VRC vrc2 = this.A03;
                    long j10 = r7.A00;
                    AnonymousClass1to r23 = vrc2.A00;
                    C66741qI r4 = vrc2.A01;
                    long j11 = r23.A01(j10).A01;
                    long j12 = r4.A0m;
                    if (j12 != -1) {
                        j11 = Math.min(j12, j11);
                    }
                    Object obj2 = A002.get("extra");
                    0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
                    long j13 = j9;
                    long j14 = j11;
                    String str3 = (String) obj2;
                    long j15 = j8;
                    String str4 = str2;
                    long j16 = j;
                    FFSingletonJNILogger.logWithCollectionControlDecision(j15, str4, j16, false, j13, j14, str3, new FFSingletonJNILogger$CollectionControlDecision((long) samplingResult.A00, samplingResult.A03, j, false, FFSingletonJNILogger$CollectionControlDecisionStatus.SUCCESS.mVal), r7.A06);
                }
                r33.A02();
            } else {
                return;
            }
        }
    }
}
