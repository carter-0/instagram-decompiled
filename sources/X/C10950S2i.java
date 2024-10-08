package X;

import android.content.Context;
import android.os.Looper;
import com.facebook.papaya.client.ICallback;
import com.facebook.papaya.client.PapayaJNI;
import com.facebook.papaya.client.engine.IEngineFactory;
import com.facebook.papaya.log.LogSink;
import java.util.Map;

/* renamed from: X.S2i  reason: case insensitive filesystem */
public final class C10950S2i {
    public boolean A00 = false;
    public final Context A01;
    public final ICallback A02;
    public final C10792RyE A03;
    public final LogSink A04;

    public final synchronized void A00() {
        17k.A0F(C51969G9p.A1a(Looper.myLooper(), Looper.getMainLooper()));
        if (!this.A00) {
            C10792RyE ryE = this.A03;
            PapayaJNI.initialize("ig4a", ryE.A04, this.A01, ryE.A00, ryE.A05, ryE.A06, ryE.A01.A00());
            C249803kO it = ryE.A03.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(it);
                PapayaJNI.registerEngine(DbT.A13(A1J), (IEngineFactory) A1J.getValue());
            }
            PapayaJNI.addLogSink("global_log_sink", ryE.A02, this.A04);
            PapayaJNI.setCallback(this.A02);
            this.A00 = true;
        }
    }

    public C10950S2i(Context context, ICallback iCallback, C10792RyE ryE, LogSink logSink) {
        this.A01 = context;
        this.A03 = ryE;
        this.A04 = logSink;
        this.A02 = iCallback;
    }
}
