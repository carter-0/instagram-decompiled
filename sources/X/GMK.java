package X;

import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.domain.uistate.SocialContextBubbleUiState;
import java.util.List;

public abstract class GMK {
    public static final long A00(UserSession userSession, int i) {
        0Tu A0J = DbS.A0J(userSession, 1);
        return 182.A01(A0J, userSession, 36602127909524025L) + (((long) i) * 182.A01(A0J, userSession, 36602127909392951L));
    }

    public static final Integer A01(C246653ex r3) {
        AnonymousClass4Ji r2;
        SocialContextBubbleUiState socialContextBubbleUiState;
        AnonymousClass4Jf r22;
        List list;
        0qQ.A0B(r3, 0);
        int intValue = r3.A02.intValue();
        if (intValue == 0) {
            return null;
        }
        if (intValue == 1) {
            AnonymousClass4Jg r23 = r3.A01;
            if (!(r23 instanceof AnonymousClass4Jf) || (r22 = (AnonymousClass4Jf) r23) == null || (list = r22.A00) == null) {
                r2 = null;
            } else {
                r2 = (AnonymousClass4Ji) 00k.A0J(list);
            }
            if (!(r2 instanceof SocialContextBubbleUiState) || (socialContextBubbleUiState = (SocialContextBubbleUiState) r2) == null) {
                return null;
            }
            return socialContextBubbleUiState.A05;
        }
        throw new RuntimeException();
    }

    public static final boolean A02(UserSession userSession, C246653ex r4) {
        0qQ.A0B(userSession, 1);
        int intValue = r4.A02.intValue();
        if (intValue == 0) {
            return 182.A06(0Tu.A05, userSession, 36320652932096714L);
        }
        if (intValue == 1) {
            return AnonymousClass7TF.A1W(r4.A04, AnonymousClass05K.A00);
        }
        throw AnonymousClass7TE.A1K();
    }

    public static final boolean A03(UserSession userSession, C246653ex r5) {
        AnonymousClass4Ji r3;
        SocialContextBubbleUiState socialContextBubbleUiState;
        AnonymousClass4Jf r32;
        List list;
        boolean A1U = AnonymousClass7TF.A1U(0, r5, userSession);
        int intValue = r5.A02.intValue();
        if (intValue == 0) {
            return 182.A06(0Tu.A05, userSession, 36320652937995008L);
        }
        if (intValue == A1U) {
            AnonymousClass4Jg r33 = r5.A01;
            Integer num = null;
            if (!(r33 instanceof AnonymousClass4Jf) || (r32 = (AnonymousClass4Jf) r33) == null || (list = r32.A00) == null) {
                r3 = null;
            } else {
                r3 = (AnonymousClass4Ji) 00k.A0J(list);
            }
            if ((r3 instanceof SocialContextBubbleUiState) && (socialContextBubbleUiState = (SocialContextBubbleUiState) r3) != null) {
                num = socialContextBubbleUiState.A05;
            }
            if (num != AnonymousClass05K.A0C) {
                return false;
            }
            return true;
        }
        throw AnonymousClass7TE.A1K();
    }

    public static final boolean A04(C246653ex r3) {
        int intValue = r3.A02.intValue();
        if (intValue == 0) {
            return true;
        }
        if (intValue != 1) {
            throw AnonymousClass7TE.A1K();
        } else if (A01(r3) == AnonymousClass05K.A00) {
            return false;
        } else {
            return true;
        }
    }
}
