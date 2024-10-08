package X;

import android.view.ViewStub;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.ui.widget.balloonsview.BalloonsView;

/* renamed from: X.6hg  reason: invalid class name and case insensitive filesystem */
public final class C314116hg {
    public final C252063oV A00;

    public C314116hg(ViewStub viewStub) {
        0qQ.A0B(viewStub, 1);
        this.A00 = 2b1.A01(viewStub, false, false);
    }

    public final void A02(MT2 mt2, String str) {
        0qQ.A0B(str, 0);
        if (C336957fS.A03(str)) {
            A00(this, mt2, C62490Kgf.Emoji, false);
            ((BalloonsView) this.A00.getView()).A01(C336957fS.A00(C336957fS.A02(str), str));
        }
    }

    public static final void A00(C314116hg r2, MT2 mt2, C62490Kgf kgf, boolean z) {
        C252063oV r22 = r2.A00;
        if (!r22.CVM()) {
            r22.getView().setOnTouchListener(C11505SbS.A00);
        }
        BalloonsView balloonsView = (BalloonsView) r22.getView();
        balloonsView.setVisibility(0);
        balloonsView.setOnTouchListener(C11506SbT.A00);
        balloonsView.setBalloonType(kgf);
        balloonsView.A02 = z;
        balloonsView.A00 = new C65779LzX(mt2, balloonsView);
    }

    public final void A01(ImageUrl imageUrl, MT2 mt2) {
        A00(this, mt2, C62490Kgf.Sticker, false);
        ((BalloonsView) this.A00.getView()).A01(imageUrl);
    }
}
