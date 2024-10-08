package X;

import java.util.Arrays;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.3zQ  reason: invalid class name and case insensitive filesystem */
public final class C258653zQ implements C255463uA {
    public final Enum[] A00;
    public final AnonymousClass0eM A01;

    public C258653zQ(String str, Enum[] enumArr) {
        0qQ.A0B(enumArr, 2);
        this.A00 = enumArr;
        this.A01 = AnonymousClass0eN.A01(new C261644Aj(str, this));
    }

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        0qQ.A0B(decoder, 0);
        int ANq = decoder.ANq(getDescriptor());
        if (ANq >= 0) {
            Enum[] enumArr = this.A00;
            if (ANq < enumArr.length) {
                return enumArr[ANq];
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(ANq);
        sb.append(" is not among valid ");
        sb.append(getDescriptor().BsV());
        sb.append(" enum values, values size is ");
        sb.append(this.A00.length);
        throw new IllegalArgumentException(sb.toString());
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        0qQ.A0B(encoder, 0);
        0qQ.A0B(obj, 1);
        Enum[] enumArr = this.A00;
        int A02 = 03t.A02(enumArr, obj);
        if (A02 != -1) {
            SerialDescriptor descriptor = getDescriptor();
            0qQ.A0B(descriptor, 0);
            ((AnonymousClass488) encoder).ASB(descriptor.B0V(A02));
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(obj);
        sb.append(" is not a valid enum ");
        sb.append(getDescriptor().BsV());
        sb.append(Pxd.A00(326));
        String arrays = Arrays.toString(enumArr);
        0qQ.A07(arrays);
        sb.append(arrays);
        throw new IllegalArgumentException(sb.toString());
    }

    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.A01.getValue();
    }

    public final String toString() {
        return 002.A0S("kotlinx.serialization.internal.EnumSerializer<", getDescriptor().BsV(), '>');
    }
}
