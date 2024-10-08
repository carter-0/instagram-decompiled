package X;

import com.facebook.catalyst.modules.storage.AsyncStorageModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;

public final /* synthetic */ class TIX implements Runnable {
    public final /* synthetic */ AsyncStorageModule A00;
    public final /* synthetic */ Callback A01;
    public final /* synthetic */ ReadableArray A02;

    public /* synthetic */ TIX(AsyncStorageModule asyncStorageModule, Callback callback, ReadableArray readableArray) {
        this.A00 = asyncStorageModule;
        this.A01 = callback;
        this.A02 = readableArray;
    }

    public final void run() {
        this.A00.m17lambda$multiGet$0$comfacebookcatalystmodulesstorageAsyncStorageModule(this.A01, this.A02);
    }
}
