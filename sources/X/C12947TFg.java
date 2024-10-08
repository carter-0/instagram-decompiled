package X;

import com.facebook.catalyst.modules.storage.AsyncStorageModule;
import com.facebook.react.bridge.Callback;

/* renamed from: X.TFg  reason: case insensitive filesystem */
public final /* synthetic */ class C12947TFg implements Runnable {
    public final /* synthetic */ AsyncStorageModule A00;
    public final /* synthetic */ Callback A01;

    public /* synthetic */ C12947TFg(AsyncStorageModule asyncStorageModule, Callback callback) {
        this.A00 = asyncStorageModule;
        this.A01 = callback;
    }

    public final void run() {
        this.A00.m15lambda$clear$4$comfacebookcatalystmodulesstorageAsyncStorageModule(this.A01);
    }
}
