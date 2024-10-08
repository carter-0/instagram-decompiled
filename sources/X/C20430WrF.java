package X;

import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.WrF  reason: case insensitive filesystem */
public abstract class C20430WrF implements C255463uA {
    public final C255463uA A00;
    public final C255463uA A01;

    public final Object deserialize(Decoder decoder) {
        0eP wqY;
        0qQ.A0B(decoder, 0);
        SerialDescriptor descriptor = getDescriptor();
        C2590240b ADI = decoder.ADI(descriptor);
        Object obj = VKP.A00;
        Object obj2 = obj;
        Object obj3 = obj;
        while (true) {
            int ANp = ADI.ANp(getDescriptor());
            if (ANp != -1) {
                if (ANp == 0) {
                    obj2 = ADI.AO5((Object) null, this.A00, getDescriptor(), 0);
                } else if (ANp == 1) {
                    obj3 = ADI.AO5((Object) null, this.A01, getDescriptor(), 1);
                } else {
                    throw new IllegalArgumentException(002.A0O("Invalid index: ", ANp));
                }
            } else if (obj2 == obj) {
                throw new IllegalArgumentException("Element 'key' is missing");
            } else if (obj3 != obj) {
                if (this instanceof C20807WzK) {
                    wqY = new 0eP(obj2, obj3);
                } else {
                    wqY = new C20392WqY(obj2, obj3);
                }
                ADI.AST(descriptor);
                return wqY;
            } else {
                throw new IllegalArgumentException("Element 'value' is missing");
            }
        }
    }

    public final void serialize(Encoder encoder, Object obj) {
        Object key;
        Object value;
        0qQ.A0B(encoder, 0);
        AnonymousClass484 ADJ = encoder.ADJ(getDescriptor());
        SerialDescriptor descriptor = getDescriptor();
        C255463uA r2 = this.A00;
        boolean z = this instanceof C20807WzK;
        if (z) {
            0eP r0 = (0eP) obj;
            0qQ.A0B(r0, 0);
            key = r0.A00;
        } else {
            Map.Entry entry = (Map.Entry) obj;
            0qQ.A0B(entry, 0);
            key = entry.getKey();
        }
        ADJ.AS8(key, r2, descriptor, 0);
        SerialDescriptor descriptor2 = getDescriptor();
        C255463uA r22 = this.A01;
        if (z) {
            0eP r9 = (0eP) obj;
            0qQ.A0B(r9, 0);
            value = r9.A01;
        } else {
            Map.Entry entry2 = (Map.Entry) obj;
            0qQ.A0B(entry2, 0);
            value = entry2.getValue();
        }
        ADJ.AS8(value, r22, descriptor2, 1);
        ADJ.AST(getDescriptor());
    }

    public C20430WrF(C255463uA r1, C255463uA r2) {
        this.A00 = r1;
        this.A01 = r2;
    }
}
