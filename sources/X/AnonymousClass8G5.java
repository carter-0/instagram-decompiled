package X;

import android.view.View;

/* renamed from: X.8G5  reason: invalid class name */
public final class AnonymousClass8G5 implements View.OnClickListener {
    public final /* synthetic */ AnonymousClass8G2 A00;

    public AnonymousClass8G5(AnonymousClass8G2 r1) {
        this.A00 = r1;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-1018258201);
        AnonymousClass8G2 r2 = this.A00;
        String str = r2.A03;
        if (str != null) {
            C371648yk r0 = r2.A00;
            if (r0 != null) {
                r0.onTextEditComplete(str);
            }
            r2.A00 = null;
        }
        AnonymousClass8G2.A00(r2);
        AnonymousClass0fD.A0C(-1580810426, A05);
    }
}
