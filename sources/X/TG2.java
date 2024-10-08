package X;

import com.facebook.react.bridge.CatalystInstance;
import com.facebook.react.bridge.CatalystInstanceImpl;
import com.facebook.react.bridge.ReactMarker;
import com.facebook.react.bridge.queue.MessageQueueThread;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;

public final /* synthetic */ class TG2 implements Runnable {
    public final /* synthetic */ SSW A00;
    public final /* synthetic */ QZK A01;

    public /* synthetic */ TG2(SSW ssw, QZK qzk) {
        this.A00 = ssw;
        this.A01 = qzk;
    }

    public final void run() {
        SSW ssw = this.A00;
        QZK qzk = this.A01;
        try {
            ReactMarker.logMarker(RH1.A1K);
            ReactMarker.logMarker(RH1.A1m);
            0fc.A01(8192, "setupReactContext", -1122308870);
            Set<C13774Tgp> set = ssw.A0F;
            synchronized (set) {
                synchronized (ssw.A0B) {
                    0Sd.A00(qzk);
                    ssw.A0G = qzk;
                }
                CatalystInstance A012 = qzk.A01();
                0Sd.A00(A012);
                CatalystInstanceImpl catalystInstanceImpl = (CatalystInstanceImpl) A012;
                0Sd.A03(!catalystInstanceImpl.mInitialized, "This catalyst instance has already been initialized");
                0Sd.A03(catalystInstanceImpl.mAcceptCalls, "RunJSBundle hasn't completed.");
                catalystInstanceImpl.mInitialized = true;
                catalystInstanceImpl.mNativeModulesQueueThread.runOnQueue(new TCD(catalystInstanceImpl));
                CopyOnWriteArrayList copyOnWriteArrayList = ssw.A07.A00;
                if (!copyOnWriteArrayList.contains(A012)) {
                    copyOnWriteArrayList.add(A012);
                }
                ReactMarker.logMarker(RH1.A05);
                for (C13774Tgp A02 : set) {
                    SSW.A02(ssw, A02);
                }
                ReactMarker.logMarker(RH1.A04);
            }
            Collection collection = ssw.A0D;
            C18773W0w.A01(new C13023TIf(ssw, qzk, (C13428TaF[]) collection.toArray(new C13428TaF[collection.size()])));
            TAT tat = new TAT();
            MessageQueueThread messageQueueThread = qzk.A03;
            0Sd.A00(messageQueueThread);
            messageQueueThread.runOnQueue(tat);
            qzk.A0D(new TAU());
            0fc.A00(8192, -1133743366);
            ReactMarker.logMarker(RH1.A1l);
            ReactMarker.logMarker(RH1.A1W);
        } catch (Exception e) {
            ssw.A0A.handleException(e);
            throw null;
        }
    }
}
