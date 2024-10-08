package X;

import java.io.File;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* renamed from: X.WrL  reason: case insensitive filesystem */
public final class C20435WrL implements C255463uA {
    public static final C20435WrL A00 = new Object();
    public static final SerialDescriptor A01 = C18700Vwy.A02("File", C255493uD.A00);

    public final SerialDescriptor getDescriptor() {
        return A01;
    }

    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        String str;
        File file = (File) obj;
        0qQ.A0B(encoder, 0);
        if (file == null || (str = file.getPath()) == null) {
            str = "";
        }
        encoder.ASB(str);
    }

    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        String A0l = C13991Tnr.A0l(decoder);
        if (A0l.length() == 0) {
            return null;
        }
        return new File(A0l);
    }
}
