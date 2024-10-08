package X;

import com.facebook.catalyst.modules.storage.AsyncStorageModule;
import com.facebook.react.bridge.Callback;

/* renamed from: X.TFh  reason: case insensitive filesystem */
public final /* synthetic */ class C12948TFh implements Runnable {
    public final /* synthetic */ AsyncStorageModule A00;
    public final /* synthetic */ Callback A01;

    public /* synthetic */ C12948TFh(AsyncStorageModule asyncStorageModule, Callback callback) {
        this.A00 = asyncStorageModule;
        this.A01 = callback;
    }

    public final void run() {
        this.A00.m16lambda$getAllKeys$5$comfacebookcatalystmodulesstorageAsyncStorageModule(this.A01);
    }
}
