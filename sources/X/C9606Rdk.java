package X;

import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.List;

/* renamed from: X.Rdk  reason: case insensitive filesystem */
public abstract class C9606Rdk {
    public static C11354SOn A00(Context context, File file, boolean z) {
        C7232Q0d A02 = SRj.A02(context, Uri.fromFile(file).toString(), z);
        if (A02 == null) {
            return null;
        }
        C11354SOn A00 = C11354SOn.A00(A02, C11326SNc.A05, (List) null);
        A00.A01 = (int) A02.A06;
        return A00;
    }
}
