package X;

import android.content.Context;
import android.graphics.Rect;
import com.instagram.creation.base.CropInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.LinkedList;

public final class KIV extends 0ng {
    public final /* synthetic */ K6A A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KIV(K6A k6a) {
        super(107, 3, false, false);
        this.A00 = k6a;
    }

    public final void run() {
        K6A k6a = this.A00;
        Context context = k6a.getContext();
        if (context != null) {
            File A0s = JTO.A0s(context.getCacheDir(), "icon_zero_frame.jpg");
            int A01 = C63994LHs.A01(context, false);
            C64188LSv.A02(k6a.A06(context), A0s, A01, A01, 50);
            if (A0s.length() > 0) {
                AnonymousClass0eM r5 = k6a.A0O;
                C59953JcJ.A00(AnonymousClass7TE.A0l(r5)).A05(context, A0s.getAbsolutePath());
                C59953JcJ.A00(AnonymousClass7TE.A0l(r5)).A02(context, new CropInfo(new Rect(0, 0, A01, A01), A01, A01), 0, false);
                C64168LRo A002 = C59953JcJ.A00(AnonymousClass7TE.A0l(r5));
                LinkedList<C63805L7l> A003 = C63125Krt.A00(AnonymousClass7TE.A0l(r5));
                ArrayList A1C = AnonymousClass7TE.A1C();
                for (C63805L7l l7l : A003) {
                    AnonymousClass7TF.A1M(A1C, l7l.A00);
                }
                synchronized (A002) {
                    A002.A04(context, (C66436MRq) null, A1C);
                }
            }
        }
    }
}
