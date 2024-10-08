package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class W50 implements DialogInterface.OnClickListener {
    public final /* synthetic */ DialogInterface.OnDismissListener A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ C255773uh A02;
    public final /* synthetic */ XCI A03;
    public final /* synthetic */ C19201WPh A04;

    public W50(DialogInterface.OnDismissListener onDismissListener, AnonymousClass0iw r2, C255773uh r3, XCI xci, C19201WPh wPh) {
        this.A04 = wPh;
        this.A03 = xci;
        this.A02 = r3;
        this.A00 = onDismissListener;
        this.A01 = r2;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        List BPz;
        C19201WPh wPh = this.A04;
        CharSequence charSequence = C19201WPh.A0W(wPh)[i];
        CharSequence charSequence2 = wPh.A03;
        if (charSequence2 != null && charSequence2.equals(charSequence)) {
            this.A03.DJC();
            0wc r1 = wPh.A0A;
            0qQ.A0B(r1, 0);
            AnonymousClass7TE.A0e(r1, "recommended_user_see_fewer_suggestions_tapped").Cgf();
        } else if (C13988Tno.A1X(wPh.A05, charSequence, 2131972204)) {
            C255773uh r8 = this.A02;
            C270114gD r2 = r8.A0D;
            17k.A07(r2, C273654mx.A00(21));
            if (r2 == null || (BPz = r2.A00.BPz()) == null || BPz.size() != 1) {
                AnonymousClass0iw r6 = this.A01;
                UserSession userSession = wPh.A0B;
                DialogInterface.OnDismissListener onDismissListener = this.A00;
                XCI xci = this.A03;
                DialogInterface dialogInterface2 = C19201WPh.A0X;
                DbW.A1N(xci, 4, dialogInterface2);
                C54029GyE gyE = new C54029GyE();
                gyE.A04 = r8;
                gyE.A02 = r6;
                gyE.A03 = userSession;
                gyE.A00 = onDismissListener;
                gyE.A05 = xci;
                gyE.A01 = dialogInterface2;
                gyE.A0B(wPh.A07, "threads_in_stories_report_bottom_sheet");
            } else {
                C19201WPh.A04(this.A00, this.A01, this.A03, wPh);
            }
        }
        wPh.A01 = null;
    }
}
