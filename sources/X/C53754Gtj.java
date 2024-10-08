package X;

import android.widget.ImageView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.Gtj  reason: case insensitive filesystem */
public final class C53754Gtj extends C251343mx {
    public final C267324bN A00;
    public final UserSession A01;
    public final AnonymousClass0iw A02;
    public final boolean A03;

    public final C251263mp A0X(AnonymousClass3Y5 r13) {
        ExtendedImageUrl A1n;
        0qQ.A0B(r13, 0);
        1Xj r1 = this.A00.A02;
        if (r1 == null || (A1n = r1.A1n(C243803a8.A00(r13))) == null) {
            return null;
        }
        return new GYW(ImageView.ScaleType.FIT_CENTER, (2WX) null, this.A02, A1n, (ImageUrl) null, new C57108IOw(this, 2), (C226632hb) null, (String) null, 3, this.A03, false);
    }

    public C53754Gtj(C267324bN r1, AnonymousClass0iw r2, UserSession userSession, boolean z) {
        AnonymousClass7TG.A1U(userSession, r1, r2);
        this.A01 = userSession;
        this.A00 = r1;
        this.A02 = r2;
        this.A03 = z;
    }
}
