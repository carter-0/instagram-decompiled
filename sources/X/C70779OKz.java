package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;

/* renamed from: X.OKz  reason: case insensitive filesystem */
public final class C70779OKz {
    public final C69368Nk8[] A00 = {C69368Nk8.A06, C69368Nk8.A07, C69368Nk8.A08, C69368Nk8.A09, C69368Nk8.A05};
    public final Context A01;
    public final C226442gp A02;

    public C70779OKz(Context context, C226442gp r7) {
        0qQ.A0B(context, 1);
        this.A01 = context;
        this.A02 = r7;
    }

    public final C70828ONa A00(C69368Nk8 nk8) {
        float f;
        boolean z;
        File file = (File) C226442gp.A00(nk8.A01, nk8.A02).A00();
        if (file == null) {
            return null;
        }
        Uri fromFile = Uri.fromFile(file);
        int ordinal = nk8.ordinal();
        if (ordinal == 0 || ordinal == 4) {
            0qQ.A0A(fromFile);
            f = nk8.A00;
            0qQ.A0B(fromFile, 0);
            z = true;
        } else {
            0qQ.A0A(fromFile);
            f = nk8.A00;
            z = false;
            0qQ.A0B(fromFile, 0);
        }
        return new C70828ONa(fromFile, f, f, f, z);
    }
}
