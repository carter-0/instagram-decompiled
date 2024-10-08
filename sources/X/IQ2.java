package X;

import android.view.View;

public final class IQ2 implements C51898G6o {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public IQ2(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj4;
        this.A01 = obj2;
        this.A02 = obj3;
        this.A03 = obj;
    }

    public final void DZJ() {
        switch (this.A00) {
            case 0:
                Object obj = this.A03;
                if (obj == C247003fc.SHARE_BUTTON) {
                    AnonymousClass3W1 r2 = (AnonymousClass3W1) this.A02;
                    ((C243273Yc) this.A04).A01.BRE().Djj((1Xj) this.A01, r2, "content_notes_nux_primary", r2.getPosition());
                    return;
                } else if (obj == C247003fc.COMMENT_BUTTON) {
                    AnonymousClass3W1 r22 = (AnonymousClass3W1) this.A02;
                    ((C243273Yc) this.A04).A01.BRA().D4g((1Xj) this.A01, r22, r22.getPosition(), false);
                    return;
                } else {
                    return;
                }
            case 1:
                C267324bN r3 = (C267324bN) this.A01;
                C52058GDe gDe = (C52058GDe) this.A02;
                GCV.A00((View) this.A03, r3, gDe, (GCV) this.A04, "content_notes_nux_primary");
                return;
            default:
                return;
        }
    }

    public final void Di1() {
        switch (this.A00) {
            case 0:
                Object obj = this.A03;
                if (obj == C247003fc.SHARE_BUTTON) {
                    AnonymousClass3W1 r2 = (AnonymousClass3W1) this.A02;
                    ((C243273Yc) this.A04).A01.BRE().Djj((1Xj) this.A01, r2, "content_notes_nux_secondary", r2.getPosition());
                    return;
                } else if (obj == C247003fc.COMMENT_BUTTON) {
                    AnonymousClass3W1 r22 = (AnonymousClass3W1) this.A02;
                    ((C243273Yc) this.A04).A01.BRA().D4g((1Xj) this.A01, r22, r22.getPosition(), false);
                    return;
                } else {
                    return;
                }
            case 1:
                C267324bN r3 = (C267324bN) this.A01;
                C52058GDe gDe = (C52058GDe) this.A02;
                GCV.A00((View) this.A03, r3, gDe, (GCV) this.A04, "content_notes_nux_secondary");
                return;
            default:
                return;
        }
    }
}
