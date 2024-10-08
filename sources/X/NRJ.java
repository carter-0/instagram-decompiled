package X;

import com.google.common.collect.ImmutableList;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;

public final class NRJ extends 0ng {
    public final /* synthetic */ NMI A00;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.1qK, java.lang.Object] */
    public final void run() {
        OyN oyN = (OyN) this.A00.A01;
        if (oyN.A05 == null) {
            AnonymousClass4kA r4 = oyN.A0C;
            String A13 = DbV.A13(r4, r4.A0P, AnonymousClass4kA.A0c, 3);
            if (A13 != null) {
                try {
                    O6L parseFromJson = C69916NuI.parseFromJson(16P.A00(A13));
                    if (parseFromJson != null) {
                        oyN.A06(ImmutableList.copyOf((Collection) Collections.unmodifiableList(parseFromJson.A00)));
                    }
                } catch (IOException e) {
                    0wb.A06("IceBreakerSettingManager", "Error while parsing icebreaker collection model", e);
                }
            }
        }
        oyN.A06 = false;
        oyN.A0A.A00(new Object());
        oyN.A00 = null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NRJ(NMI nmi) {
        super(551546154);
        this.A00 = nmi;
    }
}
