package X;

import android.content.Context;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.session.UserSession;
import java.io.File;

public final class CTE extends 1vI {
    public static final void A00(UserSession userSession, String str) {
        Integer num;
        String str2;
        Integer[] A00 = AnonymousClass05K.A00(10);
        int length = A00.length;
        int i = 0;
        while (true) {
            if (i < length) {
                num = A00[i];
                switch (num.intValue()) {
                    case 1:
                        str2 = "author_self_add";
                        break;
                    case 2:
                        str2 = "reach_to_max_media_limit";
                        break;
                    case 3:
                        str2 = "reach_to_max_pending_media_limit";
                        break;
                    case 4:
                        str2 = "reach_to_max_submitted_media_per_user";
                        break;
                    case 5:
                        str2 = "fail_macsa_check";
                        break;
                    case 6:
                        str2 = "fail_experiment_check";
                        break;
                    case 7:
                        str2 = "Transcode not finished yet.";
                        break;
                    case 8:
                        str2 = "viewer_not_follow_private_author";
                        break;
                    case 9:
                        str2 = "unknown";
                        break;
                    default:
                        str2 = "not_open_carousel_post";
                        break;
                }
                if (!str2.equals(str)) {
                    i++;
                }
            } else {
                num = AnonymousClass05K.A1I;
            }
        }
        if (7 - num.intValue() != 0) {
            AnonymousClass1Nd.A00(userSession).A00(new C45959DGo(num));
        }
    }

    public final 1Xj Dou(Context context, AnonymousClass1XT r14, UserSession userSession, AnonymousClass3Q2 r16) {
        Object r6;
        String str;
        AnonymousClass3Q2 r4 = r16;
        boolean A1Z = AnonymousClass7TG.A1Z(userSession, r4);
        0qQ.A0C(r14, AnonymousClass000.A00(1638));
        1Xj r2 = ((K1X) r14).A00;
        if (r2 != null) {
            String BYJ = r2.A0C.BYJ();
            if (BYJ != null) {
                A00(userSession, BYJ);
            } else {
                if (182.A06(0Tu.A05, userSession, 2342163288486125753L) && (str = r4.A3V) != null) {
                    try {
                        File file = new File(str);
                        if (file.exists()) {
                            file.delete();
                        }
                    } catch (Exception unused) {
                    }
                }
                AnonymousClass48Z A1i = r2.A1i(userSession);
                if (A1i != null) {
                    1Xy r42 = r2.A0C;
                    Boolean BC3 = A1i.BC3();
                    Boolean CYY = A1i.CYY();
                    Boolean CYs = A1i.CYs();
                    Boolean Ca7 = A1i.Ca7();
                    A1i.BVa();
                    Boolean valueOf = Boolean.valueOf(A1Z);
                    if (A1i instanceof CRL) {
                        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
                        r6 = C41847B3o.A0o(A1i, new 0eP[]{AnonymousClass7TE.A1L(AnonymousClass000.A00(626), BC3), AnonymousClass7TE.A1L("is_open_carousel", CYY), AnonymousClass7TE.A1L("is_parent_media", CYs), AnonymousClass7TE.A1L("is_prompt_page", Ca7), AnonymousClass7TE.A1L(AnonymousClass000.A00(711), valueOf)});
                    } else {
                        r6 = new AnonymousClass4JR(BC3, CYY, CYs, Ca7, valueOf);
                    }
                    r42.Eeg((AnonymousClass48Z) r6);
                    return r2;
                }
            }
            return r2;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final K1X E1q(2ZL r3, UserSession userSession) {
        AnonymousClass7TG.A1N(userSession, r3);
        K1X E1q = CTE.super.E1q(r3, userSession);
        String errorMessage = E1q.getErrorMessage();
        if (errorMessage != null) {
            A00(userSession, errorMessage);
        }
        return E1q;
    }
}
