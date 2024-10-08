package X;

import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import java.io.StringWriter;

/* renamed from: X.7z4  reason: invalid class name and case insensitive filesystem */
public final class C348817z4 extends 0Yg implements 0sP {
    public static final C348817z4 A00 = new C348817z4();

    public C348817z4() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        ARCapabilityMinVersionModeling aRCapabilityMinVersionModeling = (ARCapabilityMinVersionModeling) obj;
        0qQ.A0B(aRCapabilityMinVersionModeling, 0);
        StringWriter stringWriter = new StringWriter();
        17W A0A = AnonymousClass15o.A00.A0A(stringWriter);
        AnonymousClass55b.A00(aRCapabilityMinVersionModeling, A0A);
        A0A.close();
        String obj2 = stringWriter.toString();
        0qQ.A07(obj2);
        return obj2;
    }
}
