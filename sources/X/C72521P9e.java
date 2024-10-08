package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.Arrays;

/* renamed from: X.P9e  reason: case insensitive filesystem */
public final class C72521P9e implements AnonymousClass7YG {
    public final Activity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final OJa A03;
    public final OT9 A04;
    public final C332257Ug A05;
    public final AnonymousClass0eK A06;
    public final AnonymousClass0eM A07 = C73909Plk.A00(this, 35);
    public final AnonymousClass7SN A08;
    public final AnonymousClass0eK A09;

    public C72521P9e(Activity activity, AnonymousClass0iw r3, UserSession userSession, OJa oJa, OT9 ot9, C332257Ug r7, AnonymousClass7SN r8, AnonymousClass0eK r9, AnonymousClass0eK r10) {
        C51974G9v.A0d(3, r9, r10, r3, oJa);
        C51973G9u.A0t(7, ot9, r8, r7);
        this.A02 = userSession;
        this.A00 = activity;
        this.A06 = r9;
        this.A09 = r10;
        this.A01 = r3;
        this.A03 = oJa;
        this.A04 = ot9;
        this.A08 = r8;
        this.A05 = r7;
    }

    public final void EGD(MessageIdentifier messageIdentifier, boolean z) {
        String str;
        boolean z2;
        String str2;
        P27 p27;
        String str3;
        Long l;
        boolean z3;
        String str4;
        this.A08.CLU();
        C254743sy r3 = (C254743sy) this.A09.get();
        MessageIdentifier messageIdentifier2 = messageIdentifier;
        if (z) {
            0qQ.A0A(r3);
            AnonymousClass0eK r7 = this.A06;
            String BsP = C66582MXn.A0W(r7).BsP(messageIdentifier2);
            if (BsP != null) {
                C254763t0 BN3 = C66582MXn.A0d(r7).BN3();
                C333517Zg A0V = C66580MXl.A0V(r7);
                String str5 = messageIdentifier2.A01;
                boolean CYZ = A0V.CYZ(str5);
                if (!(r3 instanceof MsysThreadId)) {
                    return;
                }
                if (CYZ) {
                    OT9 ot9 = this.A04;
                    UserSession userSession = this.A02;
                    C254703su A002 = OT9.A00(ot9, str5, "DirectThreadFragment.reportMessage", true);
                    if (A002 != null) {
                        str3 = A002.A0g();
                        l = Long.valueOf(AnonymousClass7TE.A0P(A002.C7c()));
                        z3 = AnonymousClass7TF.A1R(A002.A01);
                    } else {
                        str3 = null;
                        l = null;
                        z3 = false;
                    }
                    Activity activity = this.A00;
                    MsysThreadId msysThreadId = (MsysThreadId) r3;
                    0qQ.A0B(msysThreadId, 0);
                    String valueOf = String.valueOf(msysThreadId.A00);
                    AnonymousClass0iw r6 = this.A01;
                    C70453O7e o7e = (C70453O7e) this.A07.getValue();
                    if (BN3 != null) {
                        str4 = BN3.A00;
                    } else {
                        str4 = null;
                    }
                    C71128OdR.A02(activity, r6, userSession, o7e, l, (String) null, BsP, valueOf, str4, str3, false, true, true, z3);
                    return;
                }
                Object obj = r7.get();
                if (!(obj instanceof P27) || (p27 = (P27) obj) == null) {
                    z2 = false;
                } else {
                    z2 = p27.A00.A03(messageIdentifier2);
                }
                Activity activity2 = this.A00;
                UserSession userSession2 = this.A02;
                MsysThreadId msysThreadId2 = (MsysThreadId) r3;
                0qQ.A0B(msysThreadId2, 0);
                String valueOf2 = String.valueOf(msysThreadId2.A00);
                AnonymousClass0iw r32 = this.A01;
                C70453O7e o7e2 = (C70453O7e) this.A07.getValue();
                if (BN3 != null) {
                    str2 = BN3.A00;
                } else {
                    str2 = null;
                }
                C71128OdR.A02(activity2, r32, userSession2, o7e2, (Long) null, str5, BsP, valueOf2, str2, (String) null, false, true, true, z2);
            }
        } else if (r3 instanceof MsysThreadId) {
            MsysThreadId msysThreadId3 = (MsysThreadId) r3;
            AnonymousClass0eK r72 = this.A06;
            Object obj2 = r72.get();
            0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.direct.fragment.thread.infra.msys.MsysClientInfra");
            String str6 = messageIdentifier2.A01;
            AnonymousClass7LQ Bjv = ((P27) obj2).Bjv(str6);
            if (Bjv == null) {
                String BsP2 = C66582MXn.A0W(r72).BsP(messageIdentifier2);
                Object obj3 = r72.get();
                0qQ.A0C(obj3, "null cannot be cast to non-null type com.instagram.direct.fragment.thread.infra.msys.MsysClientInfra");
                boolean A032 = ((P27) obj3).A00.A03(messageIdentifier2);
                if (BsP2 != null) {
                    Activity activity3 = this.A00;
                    UserSession userSession3 = this.A02;
                    0qQ.A0B(msysThreadId3, 0);
                    Activity activity4 = activity3;
                    C71128OdR.A02(activity4, this.A01, userSession3, (C70453O7e) this.A07.getValue(), (Long) null, str6, BsP2, String.valueOf(msysThreadId3.A00), (String) null, (String) null, C66582MXn.A0d(r72).CVr(), true, false, A032);
                    return;
                }
                return;
            }
            C254703su r1 = Bjv.A0e;
            String A0g = r1.A0g();
            String str7 = r1.A1u;
            0qQ.A07(str7);
            C254793t3 r12 = Bjv.A0G.A0P;
            if (r12 != null) {
                str = C66580MXl.A0x(r12);
            } else {
                str = null;
            }
            if (A0g == null || str == null) {
                this.A03.A00(002.A0R("DirectThreadFragment.reportMessage", ": null_direct_threadkey"));
                0wb.A04("ThreadKey is null", "DirectThreadFragment.reportMessage", 1);
                return;
            }
            C71128OdR.A02(this.A00, this.A01, this.A02, (C70453O7e) this.A07.getValue(), (Long) null, A0g, str7, str, (String) null, (String) null, Bjv.A0G.A0y, false, false, false);
        } else {
            0qQ.A0A(r3);
            AnonymousClass7S7 A0d = C66582MXn.A0d(this.A06);
            AnonymousClass7SD C6Q = A0d.C6Q();
            Integer Btd = A0d.Btd();
            if (Btd == null || Btd.intValue() != 4) {
                UserSession userSession4 = this.A02;
                0qQ.A0A(C6Q);
                if (!C308556Us.A0B(userSession4, C6Q, r3 instanceof DirectThreadKey) && !C331077Pk.A02.A03(userSession4, C6Q.A0H)) {
                    A00(this, messageIdentifier2);
                    return;
                }
            }
            DirectThreadKey A033 = C66647MaG.A03(r3);
            UserSession userSession5 = this.A02;
            String str8 = A033.A00;
            if (str8 != null) {
                String str9 = messageIdentifier2.A01;
                C74188PqU pqU = new C74188PqU(13, (Object) messageIdentifier2, (Object) A033, (Object) this);
                C61480nO A003 = 0nY.A00();
                0qQ.A07(A003);
                A003.ATE(new NSP(userSession5, str8, str9, pqU));
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public static final void A00(C72521P9e p9e, MessageIdentifier messageIdentifier) {
        C72521P9e p9e2 = p9e;
        AnonymousClass0eK r6 = p9e2.A06;
        if (C66582MXn.A0d(r6).AlE().A00(C376179Gx.PSEUDO_REPORT_MESSAGE)) {
            OT9 ot9 = p9e2.A04;
            UserSession userSession = p9e2.A02;
            C254703su A002 = OT9.A00(ot9, messageIdentifier.A01, "DirectThreadFragment.reportMessage", true);
            if (A002 != null) {
                DirectMessageIdentifier directMessageIdentifier = A002.A13;
                if (directMessageIdentifier == null || (A002 = OT9.A00(ot9, directMessageIdentifier.A01, "DirectThreadFragment.reportMessage", true)) != null) {
                    String A0g = A002.A0g();
                    AnonymousClass7S7 A0d = C66582MXn.A0d(r6);
                    if (A0g == null || A002.A1u == null || !A0d.CdE()) {
                        p9e2.A03.A00(002.A0R("DirectThreadFragment.reportMessage", ": null_direct_threadkey"));
                        0wb.A04("ThreadKey is null", "DirectThreadFragment.reportMessage", 1);
                        return;
                    }
                    C71128OdR.A02(p9e2.A00, p9e2.A01, userSession, (C70453O7e) p9e2.A07.getValue(), (Long) null, A0g, A002.A1u, A0d.C6C(), (String) null, (String) null, A0d.CVr(), false, false, AnonymousClass7TF.A1R(A002.A01));
                    if (C66580MXl.A05(A0d) == 29) {
                        C313756gx A003 = C313746gw.A00(userSession);
                        String C6C = A0d.C6C();
                        String C6k = A0d.C6k();
                        1Ln A0J = DbT.A0J(A003);
                        if (DbT.A1Y(A0J)) {
                            DbW.A17(A0J, A003);
                            DbV.A1M(A0J, "user_initiate_message_report");
                            C66581MXm.A1J(A0J, "message_options");
                            A0J.A0i(C66583MXo.A0e(A0J, "instagram", C6C, C6k));
                            A0J.A0w(AnonymousClass7TF.A0w("mid", A0g));
                            A0J.Cgf();
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        String format = String.format("Capability id: %s(%d)", Arrays.copyOf(C51968G9o.A1Z("PSEUDO_REPORT_MESSAGE", -17), 2));
        0qQ.A07(format);
        0wb.A03("pseudo_capability_disabled", format);
    }
}
