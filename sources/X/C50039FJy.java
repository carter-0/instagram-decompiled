package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;

/* renamed from: X.FJy  reason: case insensitive filesystem */
public final class C50039FJy implements DialogInterface.OnShowListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;

    public C50039FJy(Object obj, Object obj2, String str, int i) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = str;
    }

    public final void onShow(DialogInterface dialogInterface) {
        if (this.A00 != 0) {
            0wc r3 = (0wc) this.A01;
            String str = ((UserSession) this.A02).A06;
            String str2 = this.A03;
            0qQ.A0B(r3, 0);
            FEM.A00(r3, str, str2, Pxd.A00(207));
            return;
        }
        UserSession userSession = (UserSession) this.A02;
        AnonymousClass9PQ.A06((AnonymousClass0iw) this.A01, userSession, AnonymousClass05K.A00, this.A03);
        0xa A0q = AnonymousClass7TE.A0q(userSession);
        AnonymousClass7TG.A1M(A0q, "meta_gallery_recents_nux_impression_count", DbT.A00(A0q, "meta_gallery_recents_nux_impression_count") + 1);
    }
}
