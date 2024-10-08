package X;

import android.os.Bundle;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCallback;
import com.facebook.browser.lite.ipc.OnShopsLiteCallback;
import java.util.Map;

public final class QJx extends C10980S3o {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QJx(SRY sry, BrowserLiteJSBridgeCall browserLiteJSBridgeCall, BrowserLiteJSBridgeCallback browserLiteJSBridgeCallback) {
        super(sry);
        this.A00 = 4;
        this.A01 = sry;
        this.A03 = browserLiteJSBridgeCall;
        this.A02 = browserLiteJSBridgeCallback;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QJx(Bundle bundle, SRY sry, Map map, int i) {
        super(sry);
        this.A00 = i;
        this.A01 = sry;
        this.A02 = map;
        this.A03 = bundle;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QJx(Bundle bundle, SRY sry, OnShopsLiteCallback onShopsLiteCallback) {
        super(sry);
        this.A00 = 3;
        this.A01 = sry;
        this.A02 = bundle;
        this.A03 = onShopsLiteCallback;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public QJx(Bundle bundle, SRY sry, long[] jArr) {
        super(sry);
        this.A00 = 0;
        this.A01 = sry;
        this.A02 = jArr;
        this.A03 = bundle;
    }
}
