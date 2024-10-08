package X;

import android.view.View;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.UserStoryTarget;
import com.instagram.pendingmedia.model.constants.ShareType;

public final class AMY implements View.OnClickListener {
    public final /* synthetic */ C40428Abz A00;

    public AMY(C40428Abz abz) {
        this.A00 = abz;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(-912708433);
        C40428Abz abz = this.A00;
        C39645A3l a3l = abz.A04;
        C15023UKc uKc = abz.A05;
        AnonymousClass80R r3 = a3l.A00;
        r3.A0a.A0D(false);
        String A0c = AnonymousClass7TF.A0c();
        int ordinal = r3.A0o.A02.A01().ordinal();
        if (ordinal == 0) {
            AnonymousClass8K4.A0A(r3.A0c, new LD4((DirectShareTarget) null, (UserStoryTarget) null, ShareType.EXPRESSIVE_QUESTION_STICKER), (C381539bv) null, uKc, (Boolean) null, A0c, (String) null);
        } else if (ordinal == 1) {
            r3.A0g.A0P(new LD4((DirectShareTarget) null, (UserStoryTarget) null, ShareType.EXPRESSIVE_QUESTION_STICKER), (C381779cJ) null, AnonymousClass05K.A00, A0c, (String) null, false);
        } else {
            throw AnonymousClass7TE.A1B("Unknown media type");
        }
        AnonymousClass0fD.A0C(1657714300, A05);
    }
}
