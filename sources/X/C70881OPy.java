package X;

import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mci.LoggingOption;
import com.facebook.msys.mci.PlatformLogger;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.TraceInfo;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.common.session.UserSession;
import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import com.instagram.model.direct.threadkey.impl.MsysPendingRecipient;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.OPy  reason: case insensitive filesystem */
public abstract class C70881OPy {
    public static final MailboxFutureImpl A00(AnonymousClass67N r30, UserSession userSession, MsysThreadSubtype msysThreadSubtype, String str, List list, 0sP r35) {
        boolean z;
        C71721Opf opf;
        AnonymousClass67N r15 = r30;
        UserSession userSession2 = userSession;
        boolean A1U = AnonymousClass7TF.A1U(0, r15, userSession2);
        boolean A1T = AnonymousClass7TF.A1T(list.size(), 2);
        int i = msysThreadSubtype.A00;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MsysPendingRecipient msysPendingRecipient = (MsysPendingRecipient) it.next();
            A0r.add(0Yt.A06(new 0eP[]{AnonymousClass7TE.A1L("MCAMailboxInstagramSecureMessageParticipantEimuKey", Long.valueOf(msysPendingRecipient.A01)), AnonymousClass7TE.A1L("MCAMailboxInstagramSecureMessageParticipantIgIdKey", msysPendingRecipient.A07), AnonymousClass7TE.A1L("MCAMailboxInstagramSecureMessageParticipantFollowStatusKey", 0), AnonymousClass7TE.A1L("MCAMailboxInstagramSecureMessageParticipantVerificationStatusKey", Integer.valueOf(msysPendingRecipient.A0H ? 1 : 0)), AnonymousClass7TE.A1L("MCAMailboxInstagramSecureMessageParticipantNameKey", msysPendingRecipient.A09)}));
        }
        if (i == A1U || (i == 4 ? !DbX.A1Z(2HM.A00(userSession2).A0I) : i == 5 || i == 3)) {
            z = false;
        } else {
            z = true;
        }
        0sP r1 = r35;
        if (r35 != null) {
            opf = new C71721Opf(19, r1);
        } else {
            opf = null;
        }
        AnonymousClass68L A0F = C66580MXl.A0F(r15, 2);
        MailboxFutureImpl A0G = C66580MXl.A0G(A0F);
        int A00 = C3030067a.A00(A0G);
        TraceInfo A01 = C3030067a.A01(A0G, "MailboxInstagramSecureMessage", "createOptimisticThread");
        LoggingOption loggingOption = new LoggingOption((Integer) null, A01, (Number) null, (String) null, (String) null, (PrivacyContext) null, false, (Number) null);
        A0G.addResultCallback(new C71622Oo2(new LoggingOption[]{loggingOption}));
        if (opf != null) {
            A0G.Eiu(opf);
        }
        if (!A0F.EJd(new C71699OpJ(r15, A0G, loggingOption, str, A0r, A00, i, A1T, z))) {
            A0G.cancel(false);
            C3030067a.A02(A00);
            C3030067a.A03(A01, "MailboxInstagramSecureMessage", "createOptimisticThread");
        }
        PlatformLogger.platformEventLog(5);
        return A0G;
    }

    public static final ListenableFuture A01(AnonymousClass67N r8, UserSession userSession, AnonymousClass9HR r10) {
        AnonymousClass67N r5 = r8;
        UserSession userSession2 = userSession;
        AnonymousClass7TG.A1N(r8, userSession);
        0qQ.A0B(r10, 2);
        if (r10 instanceof MsysThreadId) {
            return new 1Ks(r10);
        }
        if (r10 instanceof PIO) {
            PIO pio = (PIO) r10;
            return C303646Ae.A02(new C71810OrC(new C73930PmA(7), 2), C303606Aa.A00(A00(r5, userSession2, pio.A01, (String) null, pio.A02, (0sP) null)), 1Lf.A01);
        }
        throw AnonymousClass7TE.A0z(C273654mx.A00(1311));
    }
}
