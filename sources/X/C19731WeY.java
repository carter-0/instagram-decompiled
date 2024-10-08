package X;

import android.view.View;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgSimpleImageView;

/* renamed from: X.WeY  reason: case insensitive filesystem */
public final class C19731WeY implements AnonymousClass8Z3 {
    public final int A00;
    public final Object A01;

    public C19731WeY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DMp() {
        AnonymousClass80U r1;
        switch (this.A00) {
            case 0:
                r1 = ((AZU) this.A01).A0K;
                break;
            case 1:
                C19319WUb wUb = (C19319WUb) this.A01;
                C19319WUb.A00(wUb);
                r1 = wUb.A0M;
                break;
            case 2:
                C19318WUa wUa = (C19318WUa) this.A01;
                C19318WUa.A01(wUa);
                r1 = wUa.A0D;
                break;
            default:
                C65049LmT lmT = (C65049LmT) this.A01;
                IgEditText igEditText = lmT.A02;
                if (igEditText != null) {
                    igEditText.clearFocus();
                    r1 = lmT.A0I;
                    break;
                } else {
                    0qQ.A0F("stickerEditText");
                    throw AnonymousClass00P.createAndThrow();
                }
        }
        r1.E3H(new Object());
    }

    public final void DzC(int i, int i2) {
        View view;
        int i3;
        switch (this.A00) {
            case 1:
                C19319WUb wUb = (C19319WUb) this.A01;
                view = wUb.A07;
                if (view != null) {
                    i3 = ((AnonymousClass87F) wUb.A0S.getValue()).A03.A01;
                    break;
                } else {
                    return;
                }
            case 3:
                C65049LmT lmT = (C65049LmT) this.A01;
                IgSimpleImageView igSimpleImageView = lmT.A03;
                if (igSimpleImageView != null) {
                    igSimpleImageView.setTranslationY((float) (-i));
                    view = AnonymousClass7TE.A0c(lmT.A0N);
                    i3 = AnonymousClass7TG.A02(lmT.A0F) + lmT.A0J.A03.A01;
                    break;
                } else {
                    0qQ.A0F("colorButton");
                    throw AnonymousClass00P.createAndThrow();
                }
            default:
                return;
        }
        0nA.A0T(view, (i3 + i) - AnonymousClass81Y.A00);
    }
}
