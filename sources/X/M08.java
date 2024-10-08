package X;

import android.content.DialogInterface;

public final class M08 implements AnonymousClass8LC {
    public final /* synthetic */ C65163LoS A00;

    public M08(C65163LoS loS) {
        this.A00 = loS;
    }

    public final void DFc(boolean z) {
        if (z) {
            this.A00.EEp();
            return;
        }
        0qQ.A0B("failed_to_load_library_filter_fragment", 1);
        0kD.A0C("failed_to_load_library_filter_fragment", "failed_to_load_library_filter_fragment", (Throwable) null);
        this.A00.A0F.A01.A05.A0A((DialogInterface.OnClickListener) null, AnonymousClass05K.A02);
    }
}
