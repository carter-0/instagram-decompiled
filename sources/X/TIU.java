package X;

import com.facebook.catalyst.modules.storage.AsyncStorageModule;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableArray;

public final /* synthetic */ class TIU implements Runnable {
    public final /* synthetic */ AsyncStorageModule A00;
    public final /* synthetic */ Callback A01;
    public final /* synthetic */ ReadableArray A02;

    public /* synthetic */ TIU(AsyncStorageModule asyncStorageModule, Callback callback, ReadableArray readableArray) {
        this.A00 = asyncStorageModule;
        this.A01 = callback;
        this.A02 = readableArray;
    }

    public final void run() {
        this.A00.m20lambda$multiSet$1$comfacebookcatalystmodulesstorageAsyncStorageModule(this.A01, this.A02);
    }
}
