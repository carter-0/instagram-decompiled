package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.7Dr  reason: invalid class name and case insensitive filesystem */
public final class C328147Dr implements C328157Ds {
    public final /* synthetic */ C328137Dq A00;

    public C328147Dr(C328137Dq r1) {
        this.A00 = r1;
    }

    public final float Abj() {
        C328137Dq r1 = this.A00;
        View view = r1.A05.getView();
        return -((view.getY() + (((float) view.getHeight()) / 2.0f)) - (((float) r1.A08.getContext().getResources().getDimensionPixelSize(R.dimen.abc_dialog_padding_top_material)) / 2.0f));
    }

    public final void CvC() {
        C332927Wz r3;
        C66645MaE maE = this.A00.A06;
        if (maE != null && (r3 = maE.A01.A01) != null) {
            ((AnonymousClass7Y1) r3).Diz(new MessageIdentifier(maE.A02.A03, (String) null));
        }
    }

    public final void DvS(float f, float f2, float f3, float f4, float f5) {
        AnonymousClass7G7 r0;
        C328137Dq r2 = this.A00;
        C71662eb r1 = r2.A04;
        if (r1.A00() == 0) {
            View A01 = r1.A01();
            A01.setTranslationX(f3 + f2);
            A01.setTranslationY(f4);
            A01.setRotation(f5);
            float f6 = r2.A01 * (1.0f - f);
            C66645MaE maE = r2.A06;
            if (maE != null && (r0 = maE.A00) != null) {
                r0.E0W(f2, f6);
            }
        }
    }
}
