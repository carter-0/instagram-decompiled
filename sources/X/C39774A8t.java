package X;

import android.view.ViewStub;
import kotlin.Deprecated;

@Deprecated(message = "")
/* renamed from: X.A8t  reason: case insensitive filesystem */
public final class C39774A8t {
    public AnonymousClass9Y2 A00;
    public C340037kb A01;
    public final ViewStub A02;
    public final C340027ka A03;

    public final void A00(String str) {
        AnonymousClass9Y2 r0;
        QLA C8U = this.A03.C8U();
        if ((C8U == null || !C8U.A0b) && (r0 = this.A00) != null) {
            r0.setTitle(str);
        }
    }

    public C39774A8t(ViewStub viewStub, C340027ka r2, C340037kb r3) {
        this.A01 = r3;
        this.A03 = r2;
        this.A02 = viewStub;
    }
}
