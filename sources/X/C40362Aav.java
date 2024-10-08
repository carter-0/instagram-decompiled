package X;

import android.app.Activity;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Aav  reason: case insensitive filesystem */
public final class C40362Aav implements C41818B1y {
    public final /* synthetic */ AnonymousClass8K4 A00;
    public final /* synthetic */ C352218Cl A01;

    public C40362Aav(AnonymousClass8K4 r1, C352218Cl r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void Ddm(boolean z, String str) {
        AnonymousClass9U5 r2 = new AnonymousClass9U5(str);
        C352218Cl r3 = this.A01;
        List singletonList = Collections.singletonList(r3.A05());
        0qQ.A0B(singletonList, 0);
        r2.A0A = singletonList;
        r2.A04 = r3.A0T;
        r2.A01 = r3.A0O;
        r2.A05 = r3.A0W;
        r2.A02 = r3.A0P;
        r2.A03 = r3.A0Q;
        r2.A07 = r3.A0c;
        r2.A06 = r3.A0b;
        r2.A00 = r3.A0K;
        r2.A0B = true;
        AnonymousClass8VQ.A04(this.A00.A0D, r2);
    }

    public final void Dgl(boolean z, String str) {
        String str2;
        AnonymousClass8K4 r3 = this.A00;
        02m r2 = 02m.A0p;
        short s = 3;
        if (z) {
            s = 2;
        }
        r2.markerEnd(18948745, s);
        AnonymousClass7TF.A1N(r3.A0l);
        int i = 2131961740;
        if (z) {
            i = 2131969418;
        }
        Activity activity = r3.A0A;
        if (z) {
            str2 = null;
        } else {
            str2 = "save_to_gallery_failed";
        }
        C59689JTv.A0F(activity, str2, i);
    }
}
