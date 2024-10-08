package X;

import android.view.View;
import android.view.ViewStub;

/* renamed from: X.Abx  reason: case insensitive filesystem */
public final class C40426Abx implements C351948Bb {
    public View A00;
    public final ViewStub A01;
    public final String A02;

    public C40426Abx(ViewStub viewStub, String str) {
        0qQ.A0B(viewStub, 1);
        this.A01 = viewStub;
        this.A02 = str;
    }

    public final void Ejs(boolean z) {
    }

    public final void EQQ(boolean z) {
        View[] viewArr = new View[1];
        View view = this.A00;
        if (z) {
            if (view != null) {
                viewArr[0] = view;
                C294975nL.A04((C295005nO) null, viewArr, true);
                return;
            }
        } else if (view != null) {
            viewArr[0] = view;
            C294975nL.A05(viewArr, true);
            return;
        }
        0qQ.A0F("cameraHeader");
        throw AnonymousClass00P.createAndThrow();
    }
}
