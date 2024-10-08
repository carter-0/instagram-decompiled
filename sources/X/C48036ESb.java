package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;

/* renamed from: X.ESb  reason: case insensitive filesystem */
public final class C48036ESb extends AnonymousClass7AK {
    public final Uri A00;
    public final 0lg A01;

    public final void onClick(View view) {
        Uri uri = this.A00;
        if (uri != null) {
            0kR.A0F(view.getContext(), uri);
            1Q0 r0 = 1Q0.A1z;
            0lg r3 = this.A01;
            0xI A04 = r0.A02(r3).A04();
            A04.A0C("uri_path", uri.getPath());
            DbU.A1R(A04, r3);
        }
    }

    public C48036ESb(Context context, 0lg r3, String str, int i) {
        super(Integer.valueOf(i));
        Uri A002;
        Uri A012 = 0cp.A01(SQU.A00, str);
        if (A012 == null) {
            A002 = null;
        } else {
            A002 = SQU.A00(context, A012);
        }
        this.A00 = A002;
        this.A01 = r3;
    }
}
