package X;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.MapSerializer;

/* renamed from: X.RwZ  reason: case insensitive filesystem */
public final class C10695RwZ {
    public JsonSerializer A00;
    public MapSerializer A01;
    public final C13901TjO A02;
    public final C8208QkH A03;

    public C10695RwZ(C13901TjO tjO, JsonSerializer jsonSerializer, C8208QkH qkH) {
        this.A03 = qkH;
        this.A02 = tjO;
        this.A00 = jsonSerializer;
        if (jsonSerializer instanceof MapSerializer) {
            this.A01 = (MapSerializer) jsonSerializer;
        }
    }
}
