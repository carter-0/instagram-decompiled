package X;

import com.facebook.rsys.tslog.gen.GetTslogEngineCallback;
import com.facebook.rsys.tslog.gen.TslogEngineApi;
import com.instagram.rtc.rsys.tslog.IgRadioTsLoggerEngine;

/* renamed from: X.NDi  reason: case insensitive filesystem */
public final class C68371NDi extends GetTslogEngineCallback {
    public final /* synthetic */ NDl A00;

    public final void onEngineCreated(TslogEngineApi tslogEngineApi) {
        0qQ.A0B(tslogEngineApi, 0);
        NDl nDl = this.A00;
        OET oet = new OET(nDl.A02, tslogEngineApi, nDl.A03);
        IgRadioTsLoggerEngine igRadioTsLoggerEngine = oet.A00;
        if (igRadioTsLoggerEngine != null) {
            igRadioTsLoggerEngine.start();
        }
        nDl.A01 = oet;
    }

    public C68371NDi(NDl nDl) {
        this.A00 = nDl;
    }
}
