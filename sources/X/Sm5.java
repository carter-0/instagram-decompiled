package X;

import com.facebook.common.downloadondemand.js.interfaces.JsSegmentFetcherModule;
import com.facebook.react.bridge.Callback;

public final class Sm5 implements C13707TfR {
    public final Callback A00;

    public final void Doe(String str) {
        this.A00.invoke(null, str);
    }

    public final void onFailure(Throwable th) {
        Pxh.A1E(this.A00, JsSegmentFetcherModule.createJsErrorObject(th));
    }

    public Sm5(Callback callback) {
        this.A00 = callback;
    }
}
