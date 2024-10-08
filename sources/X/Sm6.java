package X;

import com.facebook.common.downloadondemand.js.interfaces.JsSegmentFetcherModule;
import com.facebook.react.bridge.Callback;

public final class Sm6 implements C13707TfR {
    public final int A00;
    public final Callback A01;
    public final /* synthetic */ JsSegmentFetcherModule A02;

    public Sm6(JsSegmentFetcherModule jsSegmentFetcherModule, Callback callback, int i) {
        this.A02 = jsSegmentFetcherModule;
        this.A00 = i;
        this.A01 = callback;
    }

    public final void Doe(String str) {
        this.A02.registerSegmentInReactContext(this.A00, str, this.A01);
    }

    public final void onFailure(Throwable th) {
        Pxh.A1E(this.A01, JsSegmentFetcherModule.createJsErrorObject(th));
    }
}
