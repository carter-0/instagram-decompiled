package kotlinx.serialization;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass40R;
import X.AnonymousClass7TG;
import X.C18700Vwy;
import X.C20406Wqq;
import X.C20438Wrg;
import X.C20441Wrj;
import X.C255463uA;
import X.C2591640q;
import X.C360608er;
import X.C62230ry;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class ContextualSerializer implements C255463uA {
    public final C62230ry A00;
    public final List A01;
    public final SerialDescriptor A02;

    public final Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        AnonymousClass40R Bsb = decoder.Bsb();
        C62230ry r1 = this.A00;
        0qQ.A0B(r1, 0);
        Bsb.A00.get(r1);
        C360608er.A01(r1);
        throw AnonymousClass00P.createAndThrow();
    }

    public final SerialDescriptor getDescriptor() {
        return this.A02;
    }

    public ContextualSerializer(C62230ry r6, C255463uA[] r7) {
        this.A00 = r6;
        0qQ.A0B(r7, 0);
        List asList = Arrays.asList(r7);
        0qQ.A07(asList);
        this.A01 = asList;
        C20441Wrj A002 = C18700Vwy.A00("kotlinx.serialization.ContextualSerializer", new C20406Wqq(this, 0), C2591640q.A00, new SerialDescriptor[0]);
        0qQ.A0B(r6, 1);
        this.A02 = new C20438Wrg(r6, A002);
    }

    public final void serialize(Encoder encoder, Object obj) {
        AnonymousClass7TG.A1N(encoder, obj);
        AnonymousClass40R Bsb = encoder.Bsb();
        C62230ry r1 = this.A00;
        0qQ.A0B(r1, 0);
        Bsb.A00.get(r1);
        C360608er.A01(r1);
        throw AnonymousClass00P.createAndThrow();
    }
}
