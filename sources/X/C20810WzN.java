package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonElement;

/* renamed from: X.WzN  reason: case insensitive filesystem */
public final class C20810WzN extends C20816WzU {
    public final JsonElement A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20810WzN(String str, C250863mB r4, JsonElement jsonElement) {
        super(str, r4, jsonElement);
        0qQ.A0B(jsonElement, 2);
        this.A00 = jsonElement;
        this.A01.add("primitive");
    }

    public final int ANp(SerialDescriptor serialDescriptor) {
        return 0;
    }
}
