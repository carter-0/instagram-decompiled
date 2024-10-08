package kotlinx.serialization;

import X.0Yh;
import X.0eO;
import X.0qQ;
import X.0sn;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass7TG;
import X.C20405Wqp;
import X.C2590540f;
import X.C62230ry;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class PolymorphicSerializer extends C2590540f {
    public List A00 = 0sn.A00;
    public final C62230ry A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A00(0eO.A03, new C20405Wqp(this, 13));

    public static PolymorphicSerializer A00(Class cls) {
        Annotation[] annotationArr = new Annotation[0];
        PolymorphicSerializer polymorphicSerializer = new PolymorphicSerializer(new 0Yh(cls));
        0qQ.A0B(annotationArr, 0);
        List asList = Arrays.asList(annotationArr);
        0qQ.A07(asList);
        polymorphicSerializer.A00 = asList;
        return polymorphicSerializer;
    }

    public final C62230ry A01() {
        return this.A01;
    }

    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.A02.getValue();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("kotlinx.serialization.PolymorphicSerializer(baseClass: ");
        return AnonymousClass7TG.A0n(this.A01, sb);
    }

    public PolymorphicSerializer(C62230ry r4) {
        this.A01 = r4;
    }
}
