package X;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.WrH  reason: case insensitive filesystem */
public final class C20431WrH implements C255463uA {
    public final C255463uA A00;
    public final C255463uA A01;
    public final C255463uA A02;
    public final SerialDescriptor A03 = C18700Vwy.A01("X.59G", new C20406Wqq(this, 5), new SerialDescriptor[0]);

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        SerialDescriptor serialDescriptor = this.A03;
        C2590240b ADI = decoder.ADI(serialDescriptor);
        Object obj = VKP.A00;
        Object obj2 = obj;
        Object obj3 = obj;
        Object obj4 = obj;
        while (true) {
            int ANp = ADI.ANp(serialDescriptor);
            if (ANp == -1) {
                ADI.AST(serialDescriptor);
                if (obj2 == obj) {
                    throw new IllegalArgumentException("Element 'first' is missing");
                } else if (obj3 == obj) {
                    throw new IllegalArgumentException("Element 'second' is missing");
                } else if (obj4 != obj) {
                    return new AnonymousClass59G(obj2, obj3, obj4);
                } else {
                    throw new IllegalArgumentException("Element 'third' is missing");
                }
            } else if (ANp == 0) {
                obj2 = ADI.AO5((Object) null, this.A00, serialDescriptor, 0);
            } else if (ANp == 1) {
                obj3 = ADI.AO5((Object) null, this.A01, serialDescriptor, 1);
            } else if (ANp == 2) {
                obj4 = ADI.AO5((Object) null, this.A02, serialDescriptor, 2);
            } else {
                throw new IllegalArgumentException(002.A0O(AnonymousClass000.A00(2520), ANp));
            }
        }
    }

    public final SerialDescriptor getDescriptor() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        AnonymousClass59G r8 = (AnonymousClass59G) obj;
        boolean A1U = AnonymousClass7TF.A1U(0, encoder, r8);
        SerialDescriptor serialDescriptor = this.A03;
        AnonymousClass484 ADJ = encoder.ADJ(serialDescriptor);
        ADJ.AS8(r8.A00, this.A00, serialDescriptor, 0);
        ADJ.AS8(r8.A01, this.A01, serialDescriptor, A1U ? 1 : 0);
        ADJ.AS8(r8.A02, this.A02, serialDescriptor, 2);
        ADJ.AST(serialDescriptor);
    }

    public C20431WrH(C255463uA r4, C255463uA r5, C255463uA r6) {
        this.A00 = r4;
        this.A01 = r5;
        this.A02 = r6;
    }
}
