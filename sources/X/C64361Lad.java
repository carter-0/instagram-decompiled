package X;

import com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder;
import com.facebook.cdl.p004native.ContentDeliveryLibraryResultCallback;

/* renamed from: X.Lad  reason: case insensitive filesystem */
public final class C64361Lad implements ContentDeliveryLibraryResultCallback {
    public final /* synthetic */ LiveEditingRawMemoryPointerHolder A00;
    public final /* synthetic */ 0sP A01;

    public final void onError(String str) {
        0qQ.A0B(str, 0);
        this.A01.invoke(new C60797JrS(str));
    }

    public C64361Lad(LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder, 0sP r2) {
        this.A01 = r2;
        this.A00 = liveEditingRawMemoryPointerHolder;
    }

    public final void onSucceed() {
        this.A01.invoke(new C60796JrR(this.A00));
    }
}
