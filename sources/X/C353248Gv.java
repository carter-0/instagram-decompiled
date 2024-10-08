package X;

import com.facebook.models.IgModelLoader;
import com.facebook.models.ModelLoaderCallbacks;
import com.facebook.models.ModelMetadata;
import com.google.common.util.concurrent.SettableFuture;
import java.io.IOException;

/* renamed from: X.8Gv  reason: invalid class name and case insensitive filesystem */
public final class C353248Gv implements ModelLoaderCallbacks {
    public final /* synthetic */ IgModelLoader A00;
    public final /* synthetic */ SettableFuture A01;

    public C353248Gv(IgModelLoader igModelLoader, SettableFuture settableFuture) {
        this.A00 = igModelLoader;
        this.A01 = settableFuture;
    }

    public final void onError(String str) {
        Class cls = IgModelLoader.TAG;
        0KC.A0A(IgModelLoader.class, "Failed to resolve ModelMetadata: %s", new Object[]{str});
        this.A01.setException(new IOException(str));
    }

    public final void onResult(ModelMetadata modelMetadata) {
        this.A01.set(modelMetadata);
    }
}
