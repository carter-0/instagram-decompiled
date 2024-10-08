package X;

import com.instagram.unifiedfilter.UnifiedFilterManager;
import kotlinx.serialization.json.JsonArraySerializer;
import kotlinx.serialization.json.JsonElementSerializer;
import kotlinx.serialization.json.JsonLiteralSerializer;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonNullSerializer;
import kotlinx.serialization.json.JsonObjectSerializer;
import kotlinx.serialization.json.JsonPrimitiveSerializer;

/* renamed from: X.Wqo  reason: case insensitive filesystem */
public final class C20404Wqo implements AnonymousClass0eL, C62320sa {
    public final int A00;

    public C20404Wqo(int i) {
        this.A00 = i;
    }

    public final Object invoke() {
        switch (this.A00) {
            case 1:
                return new WT0();
            case 4:
                return new UnifiedFilterManager();
            case 5:
                JsonElementSerializer jsonElementSerializer = JsonElementSerializer.A00;
                return JsonPrimitiveSerializer.A00;
            case 6:
                JsonElementSerializer jsonElementSerializer2 = JsonElementSerializer.A00;
                return JsonNullSerializer.A00;
            case 7:
                JsonElementSerializer jsonElementSerializer3 = JsonElementSerializer.A00;
                return JsonLiteralSerializer.A00;
            case 8:
                JsonElementSerializer jsonElementSerializer4 = JsonElementSerializer.A00;
                return JsonObjectSerializer.A00;
            case 9:
                JsonElementSerializer jsonElementSerializer5 = JsonElementSerializer.A00;
                return JsonArraySerializer.A00;
            case 10:
                AnonymousClass0eM r0 = JsonNull.A01;
                return JsonNullSerializer.A01;
            default:
                return null;
        }
    }
}
