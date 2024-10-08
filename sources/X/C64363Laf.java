package X;

import com.facebook.cdl.gltfmemorypointerholder.LiveEditingRawMemoryPointerHolder;
import com.facebook.cdl.p004native.ContentDeliveryLibraryResultCallback;
import java.util.Map;

/* renamed from: X.Laf  reason: case insensitive filesystem */
public final class C64363Laf implements ContentDeliveryLibraryResultCallback {
    public final /* synthetic */ L7W A00;
    public final /* synthetic */ LiveEditingRawMemoryPointerHolder A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ 0sP A04;

    public final void onError(String str) {
        0qQ.A0B(str, 0);
        this.A04.invoke(new C60797JrS(str));
        this.A00.A01.A01("generate_color_ramps_failure", this.A02, str, this.A03);
    }

    public C64363Laf(L7W l7w, LiveEditingRawMemoryPointerHolder liveEditingRawMemoryPointerHolder, String str, Map map, 0sP r5) {
        this.A04 = r5;
        this.A01 = liveEditingRawMemoryPointerHolder;
        this.A00 = l7w;
        this.A02 = str;
        this.A03 = map;
    }

    public final void onSucceed() {
        this.A04.invoke(new C60796JrR(this.A01));
        this.A00.A01.A01("generate_color_ramps_complete", this.A02, (String) null, this.A03);
    }
}
