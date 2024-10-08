package X;

import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonObject;

/* renamed from: X.WzS  reason: case insensitive filesystem */
public final class C20814WzS extends C20815WzT {
    public int A00 = -1;
    public final int A01;
    public final List A02;
    public final JsonObject A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20814WzS(C250863mB r2, JsonObject jsonObject) {
        super((String) null, (SerialDescriptor) null, r2, jsonObject);
        0qQ.A0B(jsonObject, 2);
        this.A03 = jsonObject;
        List A0a = 00k.A0a(jsonObject.keySet());
        this.A02 = A0a;
        this.A01 = A0a.size() * 2;
    }
}
