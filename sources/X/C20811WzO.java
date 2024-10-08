package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonArray;

/* renamed from: X.WzO  reason: case insensitive filesystem */
public final class C20811WzO extends C20816WzU {
    public int A00 = -1;
    public final JsonArray A01;
    public final int A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20811WzO(C250863mB r2, JsonArray jsonArray) {
        super((String) null, r2, jsonArray);
        0qQ.A0B(jsonArray, 2);
        this.A01 = jsonArray;
        this.A02 = jsonArray.size();
    }

    public final int ANp(SerialDescriptor serialDescriptor) {
        int i = this.A00;
        if (i >= this.A02 - 1) {
            return -1;
        }
        int i2 = i + 1;
        this.A00 = i2;
        return i2;
    }
}
