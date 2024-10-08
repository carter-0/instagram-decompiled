package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ARx  reason: case insensitive filesystem */
public final class C40109ARx implements C371938zO, C41801B1g {
    public final List A00 = AnonymousClass7TE.A1C();

    public final List EzQ(Bundle bundle) {
        List list = this.A00;
        ArrayList A0U = 00k.A0U(list);
        list.clear();
        return A0U;
    }

    public final void FMz(List list, List list2) {
        0qQ.A0B(list, 0);
        0qQ.A0B(list2, 1);
        Bundle A0P = AnonymousClass7TG.A0P("commandType", AnonymousClass05K.A01, AnonymousClass7TF.A0x("serviceType", 37));
        A0P.putFloatArray("timings", 00k.A0w(list));
        A0P.putFloatArray("amplitudes", 00k.A0w(list2));
        this.A00.add(A0P);
    }

    public final void FN0() {
        AnonymousClass7TH.A0d(AnonymousClass05K.A00, this.A00, AnonymousClass7TF.A0x("serviceType", 37));
    }

    public final void cancel() {
        AnonymousClass7TH.A0d(AnonymousClass05K.A0C, this.A00, AnonymousClass7TF.A0x("serviceType", 37));
    }
}
