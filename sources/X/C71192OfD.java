package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.OfD  reason: case insensitive filesystem */
public final class C71192OfD implements DialogInterface.OnClickListener {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public C71192OfD(int i, int i2, int i3, Object obj, Object obj2, Object obj3) {
        this.A00 = i3;
        this.A03 = obj2;
        this.A01 = i;
        this.A02 = i2;
        this.A04 = obj3;
        this.A05 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C55969Hqa hqa;
        switch (this.A00) {
            case 0:
                C71011OYj oYj = (C71011OYj) this.A03;
                int i2 = this.A01;
                int i3 = this.A02;
                C254743sy r4 = (C254743sy) this.A04;
                C74485Pvf pvf = (C74485Pvf) this.A05;
                if (i2 == 0 && i3 != 29) {
                    oYj.A03.Cfp(r4);
                    pvf.DNF();
                    return;
                } else if (!(r4 instanceof MsysThreadId)) {
                    Context context = oYj.A00;
                    UserSession userSession = oYj.A02;
                    AnonymousClass7TG.A1N(context, userSession);
                    new C67100MiK(context, userSession).A03(r4, AnonymousClass05K.A0C);
                    pvf.D84();
                    return;
                } else {
                    return;
                }
            case 1:
                hqa = (C55969Hqa) this.A05;
                break;
            default:
                hqa = (C55969Hqa) this.A05;
                AnonymousClass0eM r3 = hqa.A02;
                CharSequence charSequence = ((CharSequence[]) r3.getValue())[i];
                Context context2 = hqa.A00;
                if (!0qQ.A0K(charSequence, AnonymousClass7TE.A16(context2, 2131972043))) {
                    if (0qQ.A0K(((CharSequence[]) r3.getValue())[i], AnonymousClass7TE.A16(context2, 2131972029))) {
                        hqa.A01.EDh((1Xj) this.A03, (AnonymousClass3W1) this.A04, this.A01, this.A02);
                        return;
                    }
                    return;
                }
                break;
        }
        hqa.A01.FJA((1Xj) this.A03, (AnonymousClass3W1) this.A04, this.A01, this.A02);
    }
}
