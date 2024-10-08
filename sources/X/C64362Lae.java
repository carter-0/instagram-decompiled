package X;

import com.facebook.cdl.gltfmemorypointerholder.GltfMemoryPointerWrapper;
import com.facebook.cdl.p004native.ContentDeliveryLibraryResultCallback;
import java.util.Map;

/* renamed from: X.Lae  reason: case insensitive filesystem */
public final class C64362Lae implements ContentDeliveryLibraryResultCallback {
    public final /* synthetic */ L7W A00;
    public final /* synthetic */ GltfMemoryPointerWrapper A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ Map A03;
    public final /* synthetic */ 0sP A04;

    public final void onError(String str) {
        0qQ.A0B(str, 0);
        this.A04.invoke(new C60797JrS(str));
        this.A00.A01.A01("generate_avatar_gltf_failure", this.A02, str, this.A03);
    }

    public C64362Lae(L7W l7w, GltfMemoryPointerWrapper gltfMemoryPointerWrapper, String str, Map map, 0sP r5) {
        this.A04 = r5;
        this.A01 = gltfMemoryPointerWrapper;
        this.A00 = l7w;
        this.A02 = str;
        this.A03 = map;
    }

    public final void onSucceed() {
        this.A04.invoke(new C60798JrT(this.A01));
        this.A00.A01.A01("generate_avatar_gltf_complete", this.A02, (String) null, this.A03);
    }
}
