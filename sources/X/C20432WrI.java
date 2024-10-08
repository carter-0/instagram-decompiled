package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.WrI  reason: case insensitive filesystem */
public final class C20432WrI implements C255463uA {
    public static final C20432WrI A00 = new Object();
    public static final SerialDescriptor A01 = new C360598eq(C18700Vwy.A01("Any", new TPI(7), new SerialDescriptor[0]));

    public final Object deserialize(Decoder decoder) {
        return AnonymousClass000.A00(114);
    }

    public final void serialize(Encoder encoder, Object obj) {
        String obj2;
        0qQ.A0B(encoder, 0);
        if (!(encoder instanceof AnonymousClass483)) {
            throw new IllegalArgumentException("This class can be saved only by JSON");
        } else if (obj == null) {
            encoder.AS6();
        } else if (obj instanceof Integer) {
            encoder.AS2(AnonymousClass7TE.A0M(obj));
        } else if (obj instanceof Long) {
            encoder.AS4(AnonymousClass7TE.A0R(obj));
        } else {
            if (obj instanceof String) {
                obj2 = (String) obj;
            } else if (obj instanceof Boolean) {
                encoder.ARs(AnonymousClass7TE.A1a(obj));
                return;
            } else if (obj instanceof Double) {
                encoder.ARw(JTO.A00(obj));
                return;
            } else if (obj instanceof Float) {
                encoder.ARy(AnonymousClass7TE.A04(obj));
                return;
            } else if ((obj instanceof Object[]) || (obj instanceof List)) {
                C20432WrI wrI = A00;
                0qQ.A0B(wrI, 0);
                encoder.AS9(obj, new AnonymousClass409(wrI));
                return;
            } else if (obj instanceof Map) {
                C255453u9 r1 = C255453u9.A01;
                C20432WrI wrI2 = A00;
                AnonymousClass7TF.A1H(r1, wrI2);
                C258613zM r5 = new C258613zM(r1, wrI2);
                Map map = (Map) obj;
                LinkedHashMap A0o = C51975G9x.A0o(map);
                Iterator A0u = AnonymousClass7TF.A0u(map);
                while (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    A0o.put(String.valueOf(A1J.getKey()), A1J.getValue());
                }
                encoder.AS9(A0o, r5);
                return;
            } else {
                obj2 = obj.toString();
            }
            encoder.ASB(obj2);
        }
    }

    public final SerialDescriptor getDescriptor() {
        return A01;
    }
}
