package X;

import com.facebook.ohai.ohaiconfigprovider.base.OHAIConfig;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;

/* renamed from: X.Vh4  reason: case insensitive filesystem */
public abstract class C17851Vh4 {
    public final 1Uk A00;
    public final 1vo A01;
    public final ExecutorService A02;
    public final Object A03 = new Object();

    public final void A00(X5y x5y) {
        1Uk r11;
        String string;
        OHAIConfig oHAIConfig;
        Object obj = this.A03;
        synchronized (obj) {
            r11 = this.A00;
            string = r11.getString("ohai_config", "");
        }
        X5y x5y2 = x5y;
        try {
            if (!0qQ.A0K(string, "") && (oHAIConfig = (OHAIConfig) C250863mB.A03.A00(string, C20504Wsk.A00)) != null && System.currentTimeMillis() < oHAIConfig.A04 * 1000) {
                x5y2.DoE(oHAIConfig, false);
                return;
            }
        } catch (C66601pa e) {
            0KC.A0F("OHAIConfigFetcherBase", "Failed to parse OHAI Config from local storage", e);
        }
        synchronized (obj) {
            1W3 AR0 = r11.AR0();
            AR0.A06("ohai_config");
            if (!AR0.A0B()) {
                0KC.A0C("OHAIConfigFetcherBase", "Failed to remove OHAI Config from local storage");
            }
        }
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A05(), "IGDirectOHAIConfigsQuery", new 2IS().getParamsCopy(), new 2IS().getParamsCopy(), UQM.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_ohai_configurations", new ArrayList());
        this.A01.ATM(new C19028WHf(x5y2, 0), new C19043WHv(0, x5y2, this), pandoGraphQLRequest, this.A02);
    }

    public C17851Vh4(1Uk r2, 1vo r3, ExecutorService executorService) {
        this.A01 = r3;
        this.A02 = executorService;
        this.A00 = r2;
    }
}
