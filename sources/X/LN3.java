package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.immersive.params.ContentNotesImmersiveCreationUiState;

public final class LN3 {
    public boolean A00;
    public final Activity A01;
    public final 00N A02;
    public final UserSession A03;
    public final AnonymousClass3E6 A04;
    public final ContentNotesImmersiveCreationUiState A05;
    public final L3X A06;
    public final C262224Cq A07;

    public static final boolean A00(LN3 ln3, OI6 oi6) {
        if (!C71106Ock.A00.A04(ln3.A03)) {
            ln3.A02.A04();
            return false;
        }
        AnonymousClass7TE.A1Z(new C66188MGz((Object) oi6, (Object) ln3, (AnonymousClass4D7) null, 33), ln3.A07);
        return true;
    }

    public LN3(Activity activity, 00N r3, UserSession userSession, AnonymousClass3E6 r5, ContentNotesImmersiveCreationUiState contentNotesImmersiveCreationUiState, L3X l3x, C262224Cq r8) {
        C51974G9v.A1M(l3x, r3, r5);
        0qQ.A0B(userSession, 6);
        this.A01 = activity;
        this.A06 = l3x;
        this.A02 = r3;
        this.A04 = r5;
        this.A05 = contentNotesImmersiveCreationUiState;
        this.A03 = userSession;
        this.A07 = r8;
    }
}
