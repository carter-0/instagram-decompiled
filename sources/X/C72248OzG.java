package X;

import android.view.View;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.OzG  reason: case insensitive filesystem */
public final class C72248OzG implements C2365734g {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C72248OzG(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final /* bridge */ /* synthetic */ void DKS(View view) {
        switch (this.A00) {
            case 0:
                0qQ.A0B(view, 0);
                C68067MzY mzY = new C68067MzY(view);
                ((C68025Myr) this.A01).A01 = mzY;
                ((C68590NOm) this.A02).A03.A07.D77(mzY);
                return;
            case 1:
                0qQ.A0B(view, 0);
                NOW now = (NOW) this.A02;
                C68065MzW mzW = new C68065MzW(view, now.A00);
                ((C68063MzU) this.A01).A00 = mzW;
                now.A03.A01.A00(mzW);
                for (IgdsButton igdsButton : mzW.A0B) {
                    igdsButton.setIconPadding(AnonymousClass7TE.A0C(igdsButton.getResources()));
                }
                return;
            default:
                return;
        }
    }
}
