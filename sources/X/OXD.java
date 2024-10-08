package X;

import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public abstract class OXD {
    public static final int A00(2EM r2) {
        0qQ.A0B(r2, 0);
        if (r2.equals(C300895y8.A00)) {
            return 2131962447;
        }
        if (r2.equals(AnonymousClass2EU.A00)) {
            return 2131962443;
        }
        if (r2.equals(AnonymousClass2EX.A00)) {
            return 2131962432;
        }
        if (r2.equals(AnonymousClass2EL.A00)) {
            return 2131962439;
        }
        if (r2.equals(C300885y7.A00)) {
            return 2131962434;
        }
        throw C51973G9u.A0g(r2, "Unrecognized inbox mode for viewMode filter title: ", AnonymousClass7TE.A1A());
    }

    public static final Integer A01(2EM r1) {
        int i;
        0qQ.A0B(r1, 0);
        if (r1.equals(C300895y8.A00)) {
            i = R.drawable.instagram_mail_arrow_right_pano_outline_24;
        } else if (r1.equals(AnonymousClass2EU.A00)) {
            i = R.drawable.instagram_mail_check_pano_outline_24;
        } else if (r1.equals(AnonymousClass2EX.A00)) {
            i = R.drawable.instagram_channels_pano_outline_24;
        } else if (r1.equals(AnonymousClass2EL.A00)) {
            i = R.drawable.instagram_folder_pano_outline_24;
        } else if (!r1.equals(C300885y7.A00)) {
            return null;
        } else {
            i = R.drawable.instagram_mail_pano_outline_24;
        }
        return Integer.valueOf(i);
    }

    public static final 0eP A02(UserSession userSession, C69367Nk7 nk7, 2EM r10) {
        0sn r3;
        2EM[] r0;
        0sn A1P;
        C67304Mle[] mleArr;
        C67304Mle mle;
        int A1U = AnonymousClass7TF.A1U(0, nk7, userSession);
        int ordinal = nk7.ordinal();
        if (ordinal != 0) {
            if (ordinal != A1U) {
                if (ordinal == 2) {
                    mleArr = new C67304Mle[6];
                    mleArr[0] = C67304Mle.A0K;
                    mleArr[A1U] = C67304Mle.A0D;
                    mleArr[2] = C67304Mle.A07;
                    mleArr[3] = C67304Mle.A0P;
                    mleArr[4] = C67304Mle.A09;
                    mle = C67304Mle.A0M;
                } else if (ordinal != 3) {
                    r3 = 0sn.A00;
                } else {
                    mleArr = new C67304Mle[6];
                    mleArr[0] = C67304Mle.A0B;
                    mleArr[A1U] = C67304Mle.A06;
                    mleArr[2] = C67304Mle.A0I;
                    mleArr[3] = C67304Mle.A0J;
                    mleArr[4] = C67304Mle.A0L;
                    mle = C67304Mle.A0H;
                }
                mleArr[5] = mle;
                r3 = 0sr.A1P(mleArr);
            } else {
                if (2El.A01(userSession)) {
                    r3 = 0sr.A1P(new C67304Mle[]{C67304Mle.A0O, C67304Mle.A0N, C67304Mle.A0F});
                } else {
                    r3 = AnonymousClass7TE.A1I(C67304Mle.A0O);
                }
                if (0qQ.A0K(r10, AnonymousClass2EU.A00) || 0qQ.A0K(r10, AnonymousClass2EX.A00) || 0qQ.A0K(r10, C300885y7.A00)) {
                    A1P = AnonymousClass7TE.A1I(AnonymousClass2EX.A00);
                }
            }
            A1P = 0sn.A00;
        } else {
            r3 = 0sn.A00;
            if (2El.A0I(userSession)) {
                r0 = new 2EM[]{C300895y8.A00, C300885y7.A00, AnonymousClass2EL.A00};
            } else {
                r0 = new 2EM[]{C300895y8.A00, AnonymousClass2EU.A00};
            }
            A1P = 0sr.A1P(r0);
        }
        return AnonymousClass7TE.A1L(r3, A1P);
    }
}
