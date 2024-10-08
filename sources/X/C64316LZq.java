package X;

import android.content.Context;

/* renamed from: X.LZq  reason: case insensitive filesystem */
public final class C64316LZq implements AnonymousClass2gO {
    public C62320sa A00;
    public C62320sa A01;
    public final Context A02;

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C62320sa r0;
        int A022 = DbU.A02((C62502Kgs) obj, 0);
        if (A022 == 1) {
            r0 = this.A00;
        } else if (A022 == 2) {
            r0 = this.A01;
        } else if (A022 == 3) {
            C59689JTv.A0B(this.A02, "video_upload_error");
            return;
        } else {
            return;
        }
        if (r0 != null) {
            r0.invoke();
        }
    }

    public C64316LZq(Context context) {
        this.A02 = context;
    }
}
