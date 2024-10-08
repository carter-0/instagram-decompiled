package X;

import com.instagram.api.schemas.IGAIAgentType;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.direct.msys.subtype.MsysThreadSubtype;
import com.instagram.model.direct.threadkey.impl.MsysPendingRecipient;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.List;
import java.util.concurrent.ExecutionException;

/* renamed from: X.6Ea  reason: invalid class name and case insensitive filesystem */
public final class C304566Ea {
    public final 1aU A00;
    public final 1aU A01;
    public final 1aU A02;
    public final UserSession A03;

    public static String A02(C68314NAb nAb, String str) {
        try {
            return (String) nAb.A00(str, (String) null).get();
        } catch (InterruptedException | ExecutionException e) {
            0wb.A03("rxmailbox_get_resolver_id_from_url", 002.A0u("Failed resolve media id from FileURL:", str, " with error: ", e.getMessage()));
            return null;
        }
    }

    public static String A04(C74233PrM prM, C304566Ea r7, Integer num, int i) {
        return C70109NxP.A00(r7.A03, 7, (Integer) null, Integer.valueOf(i), num, ((MsysThreadId) C66996MgU.A02(prM)).A02, (String) null, true);
    }

    public final 1aU A07(AnonymousClass9HR r9, C352218Cl r10, Integer num, Long l, String str, boolean z) {
        return A01(this, r9).A0M(new C72046OvL(this, r10, num, l, str, z)).A0H().A0P(AnonymousClass6F9.A00(C66579MXk.A00(1091)));
    }

    public final 1aU A08(AnonymousClass9HR r12, Integer num, Integer num2, String str, String str2, boolean z) {
        return A01(this, r12).A0M(new C72051OvQ(this, 2FW.A1g, num, num2, (Long) null, str, (String) null, str2, z)).A0H();
    }

    public final 1aU A09(AnonymousClass9HR r8, String str, String str2) {
        return A08(r8, (Integer) null, (Integer) null, str, str2, false);
    }

    public static 1aU A00(C304566Ea r6, MsysPendingRecipient msysPendingRecipient, int i, long j) {
        return 1aU.A01(new Y06(), 1aU.A09(new MessagingUser((IGAIAgentType) null, Long.valueOf(msysPendingRecipient.A01), msysPendingRecipient.A07, msysPendingRecipient.A00, true)), r6.A00).A0M(new C72021Ouv(j, i)).A0P(AnonymousClass6F9.A00("instagram_secure_participant_update_admin_status")).A0H();
    }

    public static 1aU A01(C304566Ea r3, AnonymousClass9HR r4) {
        if (r4 instanceof MsysThreadId) {
            return 1aU.A09(new C66990MgO(r4));
        }
        if (r4 instanceof PIO) {
            PIO pio = (PIO) r4;
            return r3.A06(pio.A01, (String) null, pio.A02);
        }
        throw new IllegalArgumentException("MsysThreadTarget should be either MsysThreadId or MsysPendingRecipients");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002f, code lost:
        if (r1.EJd(new X.C71635OoG(r2, r4)) == false) goto L_0x0031;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String A03(X.C68314NAb r4, byte[] r5) {
        /*
            if (r5 == 0) goto L_0x001a
            X.68J r0 = r4.mMailboxApiHandleMetaProvider     // Catch:{ InterruptedException | ExecutionException -> 0x003b }
            r3 = 0
            X.68L r1 = r0.ASa(r3)     // Catch:{ InterruptedException | ExecutionException -> 0x003b }
            com.facebook.msys.mca.MailboxFutureImpl r2 = new com.facebook.msys.mca.MailboxFutureImpl     // Catch:{ InterruptedException | ExecutionException -> 0x003b }
            r2.<init>(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x003b }
            X.OoQ r0 = new X.OoQ     // Catch:{ InterruptedException | ExecutionException -> 0x003b }
            r0.<init>(r2, r4, r5)     // Catch:{ InterruptedException | ExecutionException -> 0x003b }
            boolean r0 = r1.EJd(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x003b }
            if (r0 != 0) goto L_0x0034
            goto L_0x0031
        L_0x001a:
            X.68J r0 = r4.mMailboxApiHandleMetaProvider     // Catch:{ InterruptedException | ExecutionException -> 0x003b }
            r3 = 0
            X.68L r1 = r0.ASa(r3)     // Catch:{ InterruptedException | ExecutionException -> 0x003b }
            com.facebook.msys.mca.MailboxFutureImpl r2 = new com.facebook.msys.mca.MailboxFutureImpl     // Catch:{ InterruptedException | ExecutionException -> 0x003b }
            r2.<init>(r1)     // Catch:{ InterruptedException | ExecutionException -> 0x003b }
            X.OoG r0 = new X.OoG     // Catch:{ InterruptedException | ExecutionException -> 0x003b }
            r0.<init>(r2, r4)     // Catch:{ InterruptedException | ExecutionException -> 0x003b }
            boolean r0 = r1.EJd(r0)     // Catch:{ InterruptedException | ExecutionException -> 0x003b }
            if (r0 != 0) goto L_0x0034
        L_0x0031:
            r2.cancel(r3)     // Catch:{ InterruptedException | ExecutionException -> 0x003b }
        L_0x0034:
            java.lang.Object r0 = r2.get()     // Catch:{ InterruptedException | ExecutionException -> 0x003b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ InterruptedException | ExecutionException -> 0x003b }
            return r0
        L_0x003b:
            r0 = move-exception
            java.lang.String r1 = "Failed resolve media id from dataBlob with error: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r1 = X.002.A0R(r1, r0)
            java.lang.String r0 = "rxmailbox_get_resolver_id_from_data"
            X.0wb.A03(r0, r1)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C304566Ea.A03(X.NAb, byte[]):java.lang.String");
    }

    public final 1aU A05(long j) {
        return 1aU.A02(new Y07(), this.A02, this.A01).A0M(new C72007Ouh(j)).A0P(AnonymousClass6F9.A00("tam_unmute_thread")).A0H();
    }

    public final 1aU A06(MsysThreadSubtype msysThreadSubtype, String str, List list) {
        return this.A00.A0M(new C72036OvB(this, msysThreadSubtype, str, list)).A0H().A0P(AnonymousClass6F9.A00("create_secure_thread"));
    }

    public C304566Ea(1aU r1, 1aU r2, 1aU r3, UserSession userSession) {
        this.A03 = userSession;
        this.A02 = r1;
        this.A00 = r2;
        this.A01 = r3;
    }
}
