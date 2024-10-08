package X;

import android.content.Context;
import android.util.DisplayMetrics;
import com.facebook.distribgw.client.DGWClient;
import com.facebook.distribgw.client.chatd.DGWPluginSessionImpl;
import com.facebook.distribgw.client.msys.DgwNetworkSessionPluginImpl;
import com.facebook.msys.config.infranosqlite.MsysInfraNoSqliteObjectHolder;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxDatabaseCallback;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import com.facebook.msys.mcd.MqttNetworkSessionPlugin;
import com.facebook.msys.mci.AuthData;
import com.facebook.msys.mci.DatabaseConnectionSettings;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.msys.mci.PrivacyContext;
import com.facebook.msys.mci.TraceLogger;
import com.facebook.msys.mci.sqliteholder.SqliteHolder;
import com.facebook.ohai.OhaiPlugin;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.instagram.common.session.UserSession;
import com.instagram.distribgw.client.DGWClientHolder;
import java.util.List;
import java.util.concurrent.ScheduledThreadPoolExecutor;

/* renamed from: X.6Ek  reason: invalid class name */
public final class AnonymousClass6Ek extends MailboxDatabaseCallback {
    public final /* synthetic */ AnonymousClass68F A00;
    public final /* synthetic */ AnonymousClass6Ej A01;
    public final /* synthetic */ C300435xB A02;
    public final /* synthetic */ MailboxDatabaseCallback A03;

    public AnonymousClass6Ek(AnonymousClass68F r1, AnonymousClass6Ej r2, C300435xB r3, MailboxDatabaseCallback mailboxDatabaseCallback) {
        this.A02 = r3;
        this.A00 = r1;
        this.A03 = mailboxDatabaseCallback;
        this.A01 = r2;
    }

    public final boolean onConfig(SqliteHolder sqliteHolder, int i, boolean z, DatabaseConnectionSettings databaseConnectionSettings) {
        boolean z2;
        int i2;
        0fh.A01("Mailbox.DatabaseCallback.onConfig", -1249421343);
        try {
            MailboxDatabaseCallback mailboxDatabaseCallback = this.A03;
            if (mailboxDatabaseCallback != null) {
                z2 = mailboxDatabaseCallback.onConfig(sqliteHolder, i, z, databaseConnectionSettings);
                i2 = 2032341631;
            } else {
                z2 = true;
                i2 = -795237602;
            }
            0fh.A00(i2);
            return z2;
        } catch (Throwable th) {
            0fh.A00(1276426261);
            throw th;
        }
    }

    public final void onInit(SqliteHolder sqliteHolder) {
        0fh.A01("Mailbox.DatabaseCallback.onInit", 308444084);
        this.A02.A07();
        0fh.A00(884681565);
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.66t, com.facebook.msys.mca.MailboxFeature] */
    public final void onOpenWithMailbox(boolean z, Mailbox mailbox, Throwable th) {
        String message;
        0fh.A01("Mailbox.DatabaseCallback.onOpen", -1389401408);
        try {
            AnonymousClass6Ej r10 = this.A01;
            boolean z2 = z;
            Mailbox mailbox2 = mailbox;
            Throwable th2 = th;
            if (th != null) {
                if (th2.getMessage() == null) {
                    message = "Error while client opening DB";
                } else {
                    message = th2.getMessage();
                }
                r10.A01.A0R(message);
                MailboxDatabaseCallback mailboxDatabaseCallback = r10.A03;
                if (mailboxDatabaseCallback != null) {
                    mailboxDatabaseCallback.onOpenWithMailbox(z2, mailbox2, th2);
                } else {
                    th = new RuntimeException(002.A0R("Open MSYS database failed:", th2.getMessage()), th2);
                    throw th;
                }
            } else {
                C300435xB r0 = r10.A01;
                C300435xB r42 = r0;
                r0.A0S(z2);
                AnonymousClass68F r4 = r10.A00;
                AnonymousClass692 r6 = r4.A00;
                AuthData authData = r6.A03;
                NetworkSession A002 = MsysInfraNoSqliteObjectHolder.A00();
                A002.getClass();
                AnonymousClass689 r1 = (AnonymousClass689) r4.A0K.get();
                if (r1 != null) {
                    0qQ.A0B(mailbox2, 0);
                    AnonymousClass2HN r02 = r1.A01;
                    if (AnonymousClass2HN.A00()) {
                        double doubleValue = ((Number) r02.A11.A00()).doubleValue();
                        double doubleValue2 = ((Number) r02.A12.A00()).doubleValue();
                        boolean booleanValue = ((Boolean) r02.A13.A00()).booleanValue();
                        double doubleValue3 = ((Number) r02.A10.A00()).doubleValue();
                        boolean booleanValue2 = ((Boolean) r02.A0z.A00()).booleanValue();
                        boolean booleanValue3 = ((Boolean) r02.A1Q.A00()).booleanValue();
                        Mailbox mailbox3 = mailbox2;
                        ((OhaiPlugin) r1.A00.A01(OhaiPlugin.class, C301415zC.A00)).register(mailbox3, "567067343352427", doubleValue, doubleValue2, booleanValue, doubleValue3, booleanValue2, (String) r02.A1H.A00(), booleanValue3, (String) r02.A00.A00(), ((Number) r02.A14.A00()).doubleValue(), false);
                    }
                    if (((Boolean) r02.A0Q.get()).booleanValue()) {
                        UserSession userSession = r1.A00;
                        0Tu r8 = 0Tu.A05;
                        ((DgwNetworkSessionPluginImpl) userSession.A01(DgwNetworkSessionPluginImpl.class, new AnonymousClass9LX(userSession, 10))).register(mailbox2, 1, false, false, true, false, false, 182.A06(r8, userSession, 36311676451947221L), 182.A06(r8, userSession, 36311676452078295L), false);
                    }
                    if (((Boolean) r02.A1O.get()).booleanValue()) {
                        C392919vb r2 = DGWPluginSessionImpl.Companion;
                        DGWClient dGWClient = DGWClientHolder.Companion.A00(r1.A00).client;
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C61560nl.A00().A00;
                        0qQ.A07(scheduledThreadPoolExecutor);
                        boolean booleanValue4 = ((Boolean) r02.A0R.get()).booleanValue();
                        long longValue = ((Number) r02.A0G.get()).longValue();
                        boolean booleanValue5 = ((Boolean) r02.A0F.get()).booleanValue();
                        0qQ.A0B(dGWClient, 0);
                        DGWPluginSessionImpl.registerSessionNative(dGWClient, scheduledThreadPoolExecutor, booleanValue4, longValue, booleanValue5, false);
                    }
                }
                NotificationCenter A003 = C300465xE.A00();
                if (r4.A01() != null) {
                    MqttNetworkSessionPlugin.get().register(r4.A01(), A002, authData, A003, mailbox2, r4.A02(), ((Boolean) r4.A0E.get()).booleanValue(), ((Boolean) r4.A0C.get()).booleanValue(), false, false, ((Boolean) r4.A0B.get()).booleanValue());
                    C300435xB.A00(r6.A01.A08).A06();
                }
                0fh.A01("MsysSync.configureSyncParams", -962755523);
                try {
                    C300185wg r7 = r6.A01;
                    Context context = r7.A01;
                    DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
                    int i = displayMetrics.widthPixels;
                    int i2 = displayMetrics.heightPixels;
                    float f = displayMetrics.density;
                    AnonymousClass681 r03 = AnonymousClass66t.A00;
                    ? mailboxFeature = new MailboxFeature(new C66794Mcg(mailbox2));
                    float f2 = (float) i;
                    Integer valueOf = Integer.valueOf((int) (f2 * 0.5f));
                    float f3 = (float) i2;
                    Integer valueOf2 = Integer.valueOf((int) (0.5f * f3));
                    Integer valueOf3 = Integer.valueOf(i);
                    Integer valueOf4 = Integer.valueOf(i2);
                    Float valueOf5 = Float.valueOf(f);
                    Integer valueOf6 = Integer.valueOf((int) (f2 * 0.3f));
                    Integer valueOf7 = Integer.valueOf((int) (f3 * 0.3f));
                    C300255wo r30 = r4.A0I;
                    Object obj = r30.get();
                    obj.getClass();
                    AnonymousClass68L ASa = mailboxFeature.mMailboxApiHandleMetaProvider.ASa(2);
                    MailboxFutureImpl mailboxFutureImpl = new MailboxFutureImpl(ASa);
                    Float f4 = valueOf5;
                    AnonymousClass66t r17 = mailboxFeature;
                    if (!ASa.EJd(new C3029766v(r17, mailboxFutureImpl, valueOf, valueOf2, valueOf3, valueOf4, f4, valueOf6, valueOf7, 0, (String) obj, (String) r4.A01.get()))) {
                        mailboxFutureImpl.cancel(false);
                    }
                    Object obj2 = r30.get();
                    obj2.getClass();
                    AnonymousClass68L ASa2 = mailboxFeature.mMailboxApiHandleMetaProvider.ASa(2);
                    MailboxFutureImpl mailboxFutureImpl2 = new MailboxFutureImpl(ASa2);
                    if (!ASa2.EJd(new AnonymousClass673(r17, mailboxFutureImpl2, valueOf, valueOf2, valueOf3, valueOf4, f4, valueOf6, valueOf7, (String) obj2))) {
                        mailboxFutureImpl2.cancel(false);
                    }
                    Integer valueOf8 = Integer.valueOf((int) (context.getResources().getDisplayMetrics().density * 60.0f));
                    Integer valueOf9 = Integer.valueOf((int) (context.getResources().getDisplayMetrics().density * 100.0f));
                    AnonymousClass68L ASa3 = mailboxFeature.mMailboxApiHandleMetaProvider.ASa(2);
                    MailboxFutureImpl mailboxFutureImpl3 = new MailboxFutureImpl(ASa3);
                    if (!ASa3.EJd(new AnonymousClass675(mailboxFeature, mailboxFutureImpl3, valueOf8, valueOf9))) {
                        mailboxFutureImpl3.cancel(false);
                    }
                    Object obj3 = r30.get();
                    obj3.getClass();
                    AnonymousClass68L ASa4 = mailboxFeature.mMailboxApiHandleMetaProvider.ASa(2);
                    MailboxFutureImpl mailboxFutureImpl4 = new MailboxFutureImpl(ASa4);
                    if (!ASa4.EJd(new AnonymousClass677(mailboxFeature, mailboxFutureImpl4, valueOf5, (String) obj3))) {
                        mailboxFutureImpl4.cancel(false);
                    }
                    Object obj4 = r30.get();
                    obj4.getClass();
                    AnonymousClass68L ASa5 = mailboxFeature.mMailboxApiHandleMetaProvider.ASa(2);
                    MailboxFutureImpl mailboxFutureImpl5 = new MailboxFutureImpl(ASa5);
                    if (!ASa5.EJd(new AnonymousClass678(mailboxFeature, mailboxFutureImpl5, (String) obj4))) {
                        mailboxFutureImpl5.cancel(false);
                    }
                    Object obj5 = r30.get();
                    obj5.getClass();
                    AnonymousClass68L ASa6 = mailboxFeature.mMailboxApiHandleMetaProvider.ASa(2);
                    MailboxFutureImpl mailboxFutureImpl6 = new MailboxFutureImpl(ASa6);
                    if (!ASa6.EJd(new AnonymousClass67A(mailboxFeature, mailboxFutureImpl6, (String) obj5))) {
                        mailboxFutureImpl6.cancel(false);
                    }
                    QuickPerformanceLogger quickPerformanceLogger = r7.A08;
                    C300435xB.A00(quickPerformanceLogger).A05();
                    0fh.A00(688980843);
                    MailboxCallback mailboxCallback = (MailboxCallback) r4.A0J.get();
                    if (mailboxCallback != null) {
                        0fh.A01("mailboxWillActivateCallback.onCompletion", 816892482);
                        mailboxCallback.onCompletion(mailbox2);
                        0fh.A00(-1162144287);
                    }
                    Execution.executePossiblySync(new AnonymousClass67C(mailbox2), mailbox2.getAccountSession(), 1);
                    C300435xB.A00(quickPerformanceLogger).A0J();
                    r42.A01();
                    TraceLogger.endBootstrapTrace();
                    MZN.A00(r7.A09).A01();
                    String traceIdForAliasId = TraceLogger.getTraceIdForAliasId(34, "system");
                    if (traceIdForAliasId != null) {
                        TraceLogger.log((PrivacyContext) null, 34, (String) null, 87, traceIdForAliasId, (String) null, 0, (List) null);
                    }
                    Object obj6 = r4.A09.get();
                    obj6.getClass();
                    if (((Boolean) obj6).booleanValue()) {
                        TraceLogger.addConfig(21, Long.valueOf(((Long) r4.A0H.get()).longValue()).intValue(), 1, 0);
                    }
                    Object obj7 = r4.A08.get();
                    obj7.getClass();
                    if (((Boolean) obj7).booleanValue()) {
                        TraceLogger.addConfig(22, Long.valueOf(((Long) r4.A0G.get()).longValue()).intValue(), 1, 0);
                    }
                    MailboxDatabaseCallback mailboxDatabaseCallback2 = r10.A03;
                    if (mailboxDatabaseCallback2 != null) {
                        mailboxDatabaseCallback2.onOpenWithMailbox(z2, mailbox2, th2);
                    }
                    MailboxCallback mailboxCallback2 = r10.A02;
                    if (mailboxCallback2 != null) {
                        mailboxCallback2.onCompletion(mailbox2);
                    }
                } catch (Throwable th3) {
                    th = th3;
                    0fh.A00(1051379952);
                }
            }
            0fh.A00(-861612108);
        } catch (Exception e) {
            0KC.A0F("MsysDatabase", "Exception when handling onOpen", e);
            throw e;
        } catch (Throwable th4) {
            0fh.A00(1054685188);
            throw th4;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (r0 != null) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onOpenWithMessageSyncService(boolean r5, com.facebook.msys.mca.MessageSyncService r6, java.lang.Throwable r7) {
        /*
            r4 = this;
            java.lang.String r1 = "MessageSyncService.DatabaseCallback.onOpen"
            r0 = 1922964892(0x729e1d9c, float:6.2636067E30)
            X.0fh.A01(r1, r0)
            X.6Ej r3 = r4.A01     // Catch:{ Exception -> 0x0039 }
            if (r7 == 0) goto L_0x0020
            com.facebook.msys.mca.MailboxDatabaseCallback r0 = r3.A03     // Catch:{ Exception -> 0x0039 }
            if (r0 != 0) goto L_0x002f
            java.lang.String r1 = "Open MSYS database failed:"
            java.lang.String r0 = r7.getMessage()     // Catch:{ Exception -> 0x0039 }
            java.lang.String r1 = X.002.A0R(r1, r0)     // Catch:{ Exception -> 0x0039 }
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0039 }
            r0.<init>(r1, r7)     // Catch:{ Exception -> 0x0039 }
            throw r0     // Catch:{ Exception -> 0x0039 }
        L_0x0020:
            r2 = 1
            X.NBN r1 = new X.NBN     // Catch:{ Exception -> 0x0039 }
            r1.<init>(r6)     // Catch:{ Exception -> 0x0039 }
            com.facebook.msys.mci.AccountSession r0 = r6.mAccountSession     // Catch:{ Exception -> 0x0039 }
            com.facebook.msys.mci.Execution.executePossiblySync(r1, r0, r2)     // Catch:{ Exception -> 0x0039 }
            com.facebook.msys.mca.MailboxDatabaseCallback r0 = r3.A03     // Catch:{ Exception -> 0x0039 }
            if (r0 == 0) goto L_0x0032
        L_0x002f:
            r0.onOpenWithMessageSyncService(r5, r6, r7)     // Catch:{ Exception -> 0x0039 }
        L_0x0032:
            r0 = -955440584(0xffffffffc70d2238, float:-36130.22)
            X.0fh.A00(r0)
            return
        L_0x0039:
            r2 = move-exception
            java.lang.String r1 = "MsysDatabase"
            java.lang.String r0 = "Exception when handling onOpenWithMessageSyncService"
            X.0KC.A0F(r1, r0, r2)     // Catch:{ all -> 0x0042 }
            throw r2     // Catch:{ all -> 0x0042 }
        L_0x0042:
            r1 = move-exception
            r0 = 519654276(0x1ef94b84, float:2.6395133E-20)
            X.0fh.A00(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass6Ek.onOpenWithMessageSyncService(boolean, com.facebook.msys.mca.MessageSyncService, java.lang.Throwable):void");
    }
}
