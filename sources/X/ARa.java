package X;

import com.facebook.cameracore.mediapipeline.arengineservices.modules.DynamicServiceModule;
import java.util.AbstractCollection;

public final class ARa implements B2O {
    public final C371628yi A00;

    public static void A00(C371628yi r2, C3502583y r3, 0Gb r4, AbstractCollection abstractCollection) {
        abstractCollection.add(new DynamicServiceModule(new ARa(r2), r3, r4));
    }

    public final String BTw() {
        C371628yi r2 = this.A00;
        String str = r2.A01;
        if (str != null) {
            return str;
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("Invalid configuration key: ");
        A1A.append(r2);
        throw AnonymousClass7TE.A0w(AnonymousClass7TF.A0l(" Please set moduleClassName in ServiceTypeKey constructor, or use a valid ServiceTypeKey.", A1A));
    }

    public final C312446eR Bsn() {
        return this.A00.A00;
    }

    public final boolean CUp(C371698yt r3) {
        if (r3 == null || !C371698yt.A01(r3, this.A00)) {
            return false;
        }
        return true;
    }

    public ARa(C371628yi r1) {
        this.A00 = r1;
    }
}
