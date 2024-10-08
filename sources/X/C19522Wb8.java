package X;

import android.content.Context;
import java.util.List;

/* renamed from: X.Wb8  reason: case insensitive filesystem */
public final class C19522Wb8 implements G7K {
    public final /* synthetic */ C19200WPg A00;

    public final void Dje(List list) {
        0qQ.A0B(list, 0);
        C19200WPg wPg = this.A00;
        boolean A1a = AnonymousClass7TE.A1a(list.get(0));
        Context context = wPg.A02;
        C290815g0 A02 = C59730JVo.A02(context, wPg.A07, wPg.A0A, C19200WPg.__redex_internal_original_name, true, A1a);
        A02.A00 = new KH1((Object) wPg, 16);
        SQH.A02(wPg.A04);
        1ES.A00(context, wPg.A05, A02);
    }

    public final void onCancel() {
    }

    public C19522Wb8(C19200WPg wPg) {
        this.A00 = wPg;
    }
}
