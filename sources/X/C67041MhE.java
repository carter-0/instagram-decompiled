package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.MhE  reason: case insensitive filesystem */
public final class C67041MhE {
    public final Context A00;
    public final UserSession A01;
    public final AnonymousClass0vF A02;
    public final 2Dm A03;

    public static final void A00(C254703su r5, C67041MhE mhE) {
        C271374ik r0;
        C271434iq r2;
        AnonymousClass3WR r3;
        UserSession userSession = mhE.A01;
        if (r5.A1f(userSession) && (r0 = r5.A0e) != null && (r2 = r0.A04) != null) {
            if (r2.A0V) {
                r3 = r2.A09;
            } else {
                r3 = null;
            }
            Context context = mhE.A00;
            ExtendedImageUrl A002 = r2.A00(context);
            if (r3 != null && AnonymousClass46O.A00(context, userSession, false)) {
                C256203vO r1 = new C256203vO(r3, "DirectStoryPreloader");
                r1.A02 = 5242880;
                C255593uO.A00(userSession).A01(r1);
            } else if (A002 != null) {
                mhE.A02.ATE(new C67527MpM(A002));
            }
        }
    }

    public final void A01() {
        int i = 0;
        for (AnonymousClass2Ep r2 : this.A03.A0C.A0F(AnonymousClass43A.A00)) {
            C254703su BXx = r2.BXx();
            if (BXx != null) {
                UserSession userSession = this.A01;
                if (!BXx.A1f(userSession)) {
                    continue;
                } else {
                    C271374ik r0 = BXx.A0e;
                    if (r0 == null || !r0.A00()) {
                        A00(BXx, this);
                    } else {
                        String C6C = r2.C6C();
                        if (C6C != null) {
                            String A0g = BXx.A0g();
                            if (A0g != null) {
                                String A0f = BXx.A0f();
                                if (A0f != null) {
                                    C3265077a.A00(userSession, new PF0(this), C6C, A0g, A0f);
                                } else {
                                    throw AnonymousClass7TE.A0z("Required value was null.");
                                }
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                    i++;
                    if (i >= 4) {
                        return;
                    }
                }
            }
        }
    }

    public C67041MhE(UserSession userSession) {
        this.A01 = userSession;
        this.A03 = 1bJ.A00(userSession);
        this.A00 = C51966G9m.A0P(userSession);
        C61620nx A002 = C61610nw.A00();
        A002.A01 = "DirectStoryPreloader";
        this.A02 = new AnonymousClass0vF(A002);
    }

    public final void A02(1P0 r6, 2Eq r7) {
        String CFm = r7.CFm();
        UserSession userSession = this.A01;
        String C6C = r7.C6C();
        if (C6C != null) {
            1NY A0O = DbU.A0O(userSession);
            A0O.A0K("direct_v2/visual_threads/%s/", new Object[]{C6C});
            A0O.A0R(NHP.class, OQL.class);
            if (CFm != null) {
                A0O.A9m("cursor", CFm);
            }
            C66716MbN mbN = new C66716MbN(new C68522NLt(new C73510Pdr(), userSession), DbT.A0T(A0O, "visual_message_return_type", "unseen"));
            mbN.A00(new C68434NHt(r6, userSession, r7.BJy()));
            1ES.A03(mbN);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }
}
