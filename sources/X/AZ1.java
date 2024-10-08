package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.user.model.User;

public final class AZ1 implements C41815B1v {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public AZ1(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = obj;
    }

    public final void DOX() {
        if (this.A00 != 0) {
            ((C268684dp) this.A02).EE1(this);
            ((C40377AbA) this.A03).A0R.A0m((Drawable) this.A01);
            return;
        }
        C387509mK r5 = (C387509mK) this.A01;
        C369908vW r0 = r5.A03;
        r0.getClass();
        r0.EE1(this);
        if (r5.A05 != null) {
            AnonymousClass87H r4 = r5.A0A;
            if (r4.A0L(r5)) {
                r4.A0F(((Medium) this.A03).A0H);
                C317876nz r02 = C317876nz.A0a;
                C317876nz A002 = C317886o0.A00();
                C369908vW r7 = r5.A03;
                C39890ADo aDo = r5.A0B;
                r4.A0B(r7, (AnonymousClass57C) this.A02, A002, new C310416b1(aDo), true, false);
                r4.A08(r5.A01);
                Context context = r5.A07;
                User A2A = r5.A05.A2A(r5.A08);
                A2A.getClass();
                String id = r5.A05.getId();
                0qQ.A0B(context, 1);
                Resources resources = context.getResources();
                int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
                int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.font_large);
                int A0F = AnonymousClass7TE.A0F(resources);
                C369848vQ r6 = new C369848vQ(context, (Drawable) null, (0qm) null, A2A, (String) null, id, A0F, A0F, dimensionPixelSize, dimensionPixelSize2, A0F, false);
                r5.A04 = r6;
                C369908vW r03 = r5.A03;
                r03.getClass();
                aDo.A06 = new C16336Ut6(r03.getBounds());
                AnonymousClass87H.A01(r6, r4, aDo, false);
            }
        }
    }

    public final void DXr() {
    }
}
