package X;

import android.content.Context;
import java.util.HashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: X.SHv  reason: case insensitive filesystem */
public final class C11261SHv {
    public Context A00;
    public C13886Tj9 A01;
    public C13724Tfu A02;
    public C7255Q1d A03;
    public C13588TdG A04;
    public STP A05;
    public C13725Tfv A06;
    public C13589TdH A07;
    public C13590TdI A08;
    public C13780Tgv A09;
    public C13804ThT A0A;
    public C13781Tgw A0B;
    public C10862RzN A0C;
    public C13598TdQ A0D;
    public ExecutorService A0E;

    /* JADX WARNING: type inference failed for: r0v5, types: [X.Tgv, X.Srl, java.lang.Object] */
    public static void A00(Context context, C10683RwN rwN, C11261SHv sHv, C10862RzN rzN) {
        sHv.A0C = rzN;
        sHv.A00 = context;
        sHv.A05 = null;
        sHv.A07 = rwN.A00;
        sHv.A0E = Executors.newCachedThreadPool();
        sHv.A0A = rwN.A03;
        sHv.A08 = rwN.A01;
        C7235Q0h q0h = Q12.A00;
        ? obj = new Object();
        obj.A00 = q0h;
        sHv.A09 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v14, types: [X.Q1d, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v22, types: [X.Ti9, X.Sra, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v24, types: [java.lang.Object, X.TdG] */
    /* JADX WARNING: type inference failed for: r0v27, types: [X.Tgw, java.lang.Object] */
    public final C10848Rz8 A01() {
        this.A00.getClass();
        this.A0C.getClass();
        this.A07.getClass();
        this.A0E.getClass();
        this.A0A.getClass();
        this.A08.getClass();
        if (this.A0B == null) {
            this.A0B = new Object();
        }
        if (this.A06 == null) {
            this.A06 = new C12322SrS(this.A00);
        }
        if (this.A02 == null) {
            this.A02 = C9935Rjo.A00;
        }
        if (this.A04 == null) {
            this.A04 = new Object();
        }
        if (this.A01 != null) {
            SQv sQv = new SQv(this.A0C);
            C10862RzN rzN = this.A0C;
            C13834Ti9 ti9 = rzN.A07;
            C11354SOn sOn = rzN.A06;
            C13886Tj9 tj9 = this.A01;
            HashMap hashMap = new HashMap(2);
            hashMap.put(C273654mx.A00(2385), "TranscodeUtilsParams");
            hashMap.put("waterfall_id", AnonymousClass7TF.A0b());
            C10939S1u s1u = new C10939S1u(tj9, sOn, hashMap);
            ? obj = new Object();
            obj.A01 = ti9;
            obj.A00 = s1u;
            sQv.A07 = obj;
            this.A0C = new C10862RzN(sQv);
        }
        if (this.A0D == null) {
            this.A0D = new C12374SsN(new C7257Q1f(), this.A0B);
        }
        if (this.A03 == null) {
            this.A03 = new Object();
        }
        return new C10848Rz8(this);
    }
}
