package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.GWr  reason: case insensitive filesystem */
public final class C52540GWr extends C230372pW {
    public final UserSession A00;
    public final C52526GWd A01;
    public final AnonymousClass4DU A02;

    public final /* bridge */ /* synthetic */ void A03(Object obj, Object obj2) {
        String str;
        C296935qt r15 = (C296935qt) obj;
        C52528GWf gWf = (C52528GWf) obj2;
        boolean A1U = AnonymousClass7TF.A1U(0, r15, gWf);
        if (r15 instanceof C52435GSn) {
            C52526GWd gWd = this.A01;
            if (gWd != null) {
                gWd.A03(((C52435GSn) r15).BPf(), this.A02.getModuleName());
            }
            C52536GWn gWn = new C52536GWn(this.A00, (C52435GSn) r15);
            AnonymousClass4DU r9 = this.A02;
            C296905qq r4 = gWf.A01;
            UserSession userSession = gWn.A00;
            if (182.A06(0Tu.A05, userSession, 36315902700097201L)) {
                C52435GSn gSn = gWn.A01;
                1Xj BPf = gSn.BPf();
                C254523sc A022 = C254513sb.A02(userSession, BPf, r9, (C249763kK) null, 0, C51967G9n.A0j(), "impression");
                if (A022 != null) {
                    A022.A09(0);
                    C51972G9s.A1A(A022);
                    A022.A08 = gSn.A00.getPosition();
                    A022.A8B = C231122qu.A0R(userSession, BPf);
                    int i = r4.A02;
                    if (i == A1U) {
                        int i2 = r4.A04;
                        if (i2 == 2) {
                            str = "one_by_two";
                        } else {
                            if (i2 == A1U) {
                                str = "one_by_one";
                            }
                            str = "other";
                        }
                    } else {
                        if (i == 2 && r4.A04 == 2) {
                            str = "two_by_two";
                        }
                        str = "other";
                    }
                    A022.A5O = str;
                    C233822wX.A0A(userSession, A022, BPf);
                    C233822wX.A0D(userSession, A022, BPf, "impression");
                    C233822wX.A0E(userSession, A022, BPf, r9, 0);
                    return;
                }
                return;
            }
            gWn.A01(r9, "impression");
        }
    }

    public final /* bridge */ /* synthetic */ void A04(Object obj, Object obj2) {
        C296935qt r4 = (C296935qt) obj;
        AnonymousClass7TG.A1N(r4, obj2);
        if (r4 instanceof C52435GSn) {
            C52526GWd gWd = this.A01;
            if (gWd != null) {
                gWd.A03(((C52435GSn) r4).BPf(), this.A02.getModuleName());
            }
            new C52536GWn(this.A00, (C52435GSn) r4).A01(this.A02, "sub_impression");
        }
    }

    public C52540GWr(UserSession userSession, C52526GWd gWd, AnonymousClass4DU r5) {
        super(C51972G9s.A0c(userSession), new C52539GWq(userSession));
        this.A00 = userSession;
        this.A02 = r5;
        this.A01 = gWd;
    }
}
