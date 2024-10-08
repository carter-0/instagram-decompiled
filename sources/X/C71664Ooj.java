package X;

import com.facebook.encryptedbackups.mca.MailboxEncryptedBackupsJNI;
import com.facebook.messengerencryptedbackupsdirect.mca.MailboxMessengerEncryptedBackupsDirectJNI;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mca.MailboxNullable;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.util.NotificationScope;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.Ooj  reason: case insensitive filesystem */
public final class C71664Ooj implements MailboxCallback {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C71664Ooj(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A04 = obj4;
    }

    public final /* bridge */ /* synthetic */ void onCompletion(Object obj) {
        boolean z;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                AccountSession accountSession = (AccountSession) obj2;
                String A0u = C66580MXl.A0u(NAX.A00, 338);
                NotificationScope A012 = C71734Opu.A01(C66580MXl.A0H(accountSession), this, A0u, 8);
                C66580MXl.A1N(A012, this.A03, A0u);
                MailboxEncryptedBackupsJNI.dispatchVOOOOOOO(27, accountSession, this.A02, (Object) null, this.A04, (Object) null, (Object) null, A012);
                return;
            case 1:
                MailboxFeature.safeDispatchToDbConnectionAndResolve((Mailbox) obj2, (MailboxFutureImpl) this.A03, false, 0, 1, (NotificationScope) null, (PrivacyContext) this.A04, "MCAMailboxInstagramPresence", "OnDemandFetchPresence", C71726Opk.A00(this, 17));
                return;
            case 2:
                AccountSession accountSession2 = (AccountSession) obj2;
                String A0u2 = C66580MXl.A0u(NAP.A00, 5);
                NotificationScope A013 = C71734Opu.A01(C66580MXl.A0H(accountSession2), this, A0u2, 30);
                C66580MXl.A1N(A013, this.A02, A0u2);
                MailboxMessengerEncryptedBackupsDirectJNI.dispatchVOOOO(2, accountSession2, this.A03, this.A04, A013);
                return;
            case 3:
                AnonymousClass67Z r5 = (AnonymousClass67Z) this.A02;
                OMq oMq = (OMq) this.A03;
                MailboxNullable mailboxNullable = (MailboxNullable) obj2;
                Object obj3 = mailboxNullable.value;
                if (obj3 == null || C66580MXl.A04((C301345z0) obj3) <= 0) {
                    r5.A02(new C72176Oxl(AnonymousClass7TE.A15("Receiver fetch response not found")));
                    if (oMq != null) {
                        z = false;
                    }
                    r5.A00();
                    return;
                }
                C301345z0 r10 = (C301345z0) mailboxNullable.value;
                0qQ.A0B(r10, 0);
                ImmutableList.Builder builder = new ImmutableList.Builder();
                int A042 = C66580MXl.A04(r10);
                for (int i = 0; i < A042; i++) {
                    String A0v = C66580MXl.A0v(r10, i, 0);
                    0qQ.A07(A0v);
                    builder.add(new OE4(A0v, r10.mResultSet.getNullableInteger(i, 2), C66581MXm.A0t(r10, i)));
                }
                C66990MgO.A00(r5, DbZ.A0K(builder));
                if (oMq != null) {
                    z = true;
                }
                r5.A00();
                return;
                02m r3 = oMq.A01;
                int i2 = oMq.A00;
                r3.markerPoint(20132336, i2, "preview_load_completed");
                r3.markerAnnotate(20132336, i2, "preview_load_has_results", z);
                r3.markerEnd(20132336, i2, 2);
                r5.A00();
                return;
            case 4:
                AnonymousClass5HJ r52 = ((C72931PPp) this.A04).A00;
                AnonymousClass69F A002 = AnonymousClass69E.A00(r52.A0j);
                Long l = r52.A0K;
                0qQ.A07(l);
                A002.Clr(l.longValue(), "handle_push_notification_with_configs");
                Long l2 = r52.A0K;
                0qQ.A07(l2);
                A002.DUc(l2.longValue());
                int intValue = ((Number) obj2).intValue();
                UserSession userSession = (UserSession) this.A03;
                AnonymousClass6ED.A00(userSession).A03(intValue, false);
                if (intValue != 4) {
                    C296405q0.A00.A01(userSession, (HashMap) this.A02);
                }
                ((0Jv) this.A01).AId((Object) null);
                return;
            default:
                return;
        }
    }
}
