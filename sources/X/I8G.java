package X;

import android.content.DialogInterface;
import java.util.List;

public final class I8G implements DialogInterface.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ IXL A01;
    public final /* synthetic */ String A02;

    public I8G(IXL ixl, String str, int i) {
        this.A01 = ixl;
        this.A02 = str;
        this.A00 = i;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        IXL ixl = this.A01;
        H5L h5l = (H5L) ixl.A01;
        C56669I6y.A01(h5l.A03.requireContext(), h5l.A04, h5l.A05, h5l.A0E, (Runnable) null, this.A02, (List) ixl.A02, this.A00);
        h5l.A02();
    }
}
