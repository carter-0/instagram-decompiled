package X;

import android.content.Context;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;
import com.instagram.common.session.UserSession;

/* renamed from: X.UhN  reason: case insensitive filesystem */
public final class C15716UhN extends C228042kh {
    public final Context A00;
    public final PromoteData A01;
    public final PromoteState A02;
    public final UserSession A03;

    public final /* bridge */ /* synthetic */ 2YL create() {
        return new C14775U8l(this.A00, this.A01, this.A02, this.A03);
    }

    public C15716UhN(Context context, PromoteData promoteData, PromoteState promoteState, UserSession userSession) {
        this.A00 = context;
        this.A03 = userSession;
        this.A01 = promoteData;
        this.A02 = promoteState;
    }
}
