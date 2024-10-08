package X;

import java.util.Map;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.40f  reason: invalid class name and case insensitive filesystem */
public abstract class C2590540f implements C255463uA {
    public abstract C62230ry A01();

    public C255483uC A02(String str, C2590240b r6) {
        0sP r2;
        C255483uC r1;
        AnonymousClass40R Bsb = r6.Bsb();
        C62230ry A01 = A01();
        0qQ.A0B(A01, 0);
        Map map = (Map) Bsb.A03.get(A01);
        if (map != null && (r1 = (C255483uC) map.get(str)) != null) {
            return r1;
        }
        Object obj = Bsb.A01.get(A01);
        if (!0u4.A07(1, obj) || (r2 = (0sP) obj) == null) {
            return null;
        }
        return (C255483uC) r2.invoke(str);
    }

    public C255473uB A03(Object obj, Encoder encoder) {
        0sP r2;
        C255473uB r1;
        AnonymousClass40R r5 = ((AnonymousClass487) encoder).A07;
        0Yh A01 = A01();
        0qQ.A0B(A01, 0);
        if (0q1.A02(A01.A00, obj)) {
            Map map = (Map) r5.A04.get(A01);
            if (map != null && (r1 = (C255473uB) map.get(new 0Yh(obj.getClass()))) != null) {
                return r1;
            }
            Object obj2 = r5.A02.get(A01);
            if (0u4.A07(1, obj2) && (r2 = (0sP) obj2) != null) {
                return (C255473uB) r2.invoke(obj);
            }
        }
        return null;
    }

    public final Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor descriptor = getDescriptor();
        C2590240b ADI = decoder.ADI(descriptor);
        String str = null;
        Object obj = null;
        while (true) {
            int ANp = ADI.ANp(getDescriptor());
            if (ANp != -1) {
                if (ANp == 0) {
                    str = ADI.AOA(getDescriptor(), ANp);
                } else if (ANp != 1) {
                    if (str == null) {
                        str = "unknown class";
                    }
                    throw new IllegalArgumentException(002.A07(ANp, "Invalid index in polymorphic deserialization of ", str, "\n Expected 0, 1 or DECODE_DONE(-1), but found "));
                } else if (str != null) {
                    obj = ADI.AO5((Object) null, C18282Vp2.A00(str, ADI, this), getDescriptor(), 1);
                } else {
                    throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                }
            } else if (obj != null) {
                ADI.AST(descriptor);
                return obj;
            } else {
                throw new IllegalArgumentException(002.A0R("Polymorphic value has not been read for class ", str));
            }
        }
    }

    public final void serialize(Encoder encoder, Object obj) {
        0qQ.A0B(encoder, 0);
        0qQ.A0B(obj, 1);
        C255473uB A01 = C18282Vp2.A01(obj, encoder, this);
        SerialDescriptor descriptor = getDescriptor();
        AnonymousClass484 ADJ = encoder.ADJ(descriptor);
        ADJ.ASC(A01.getDescriptor().BsV(), getDescriptor(), 0);
        ADJ.AS8(obj, A01, getDescriptor(), 1);
        ADJ.AST(descriptor);
    }
}
