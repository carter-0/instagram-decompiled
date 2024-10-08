package X;

import java.lang.annotation.Annotation;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonClassDiscriminator;

public abstract class VJ9 {
    public static final String A00(SerialDescriptor serialDescriptor, C250863mB r3) {
        0qQ.A0B(serialDescriptor, 0);
        for (Annotation annotation : serialDescriptor.getAnnotations()) {
            if (annotation instanceof JsonClassDiscriminator) {
                return ((JsonClassDiscriminator) annotation).discriminator();
            }
        }
        return r3.A00.A01;
    }
}
