package X;

import android.content.Context;
import com.facebook.msys.config.infranosqlite.MsysInfraNoSqliteObjectHolder;
import com.facebook.msys.dasm.DasmSupportHelper;
import com.facebook.msys.mca.MailboxMessengerMediaSendManagerConfig;
import com.facebook.msys.mca.SlimMailbox;
import com.facebook.msys.mci.Database;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.NotificationCenter;
import com.facebook.msys.mci.SqlUtils;
import com.facebook.quicklog.QuickPerformanceLogger;
import java.io.File;
import java.io.IOException;

public abstract class MZE {
    public static String A00;

    /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|3|4|5|6|9|10) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x003c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.facebook.msys.mca.MailboxDatabaseConfig A00(X.AnonymousClass68F r27, X.C300435xB r28, com.facebook.msys.mca.MailboxCallback r29, com.facebook.msys.mca.MailboxDatabaseCallback r30, com.facebook.msys.mci.DatabaseHealthMonitorFatalErrorCallback r31) {
        /*
            r1 = r27
            X.692 r6 = r1.A00
            X.5wg r0 = r6.A01
            android.content.Context r2 = r0.A01
            java.lang.String r10 = r6.A09
            java.io.File r7 = X.AnonymousClass7TE.A0t(r10)
            X.65w r5 = r6.A00
            com.facebook.quicklog.QuickPerformanceLogger r3 = r0.A08
            X.5xB r0 = X.C300435xB.A00(r3)
            X.6Ei r4 = new X.6Ei
            r4.<init>(r5, r0)
            com.facebook.msys.mci.AuthData r0 = r6.A03
            java.lang.String r5 = r0.getFacebookUserID()
            r8 = r28
            java.lang.String r0 = "msys_database_health_"
            java.lang.String r0 = X.002.A0R(r0, r5)     // Catch:{ SecurityException -> 0x0041 }
            java.io.File r5 = r2.getDatabasePath(r0)     // Catch:{ SecurityException -> 0x0041 }
            java.io.File r0 = r5.getParentFile()     // Catch:{ SecurityException -> 0x0041 }
            r0.getClass()     // Catch:{ SecurityException -> 0x0041 }
            r0.mkdirs()     // Catch:{ SecurityException -> 0x0041 }
            java.lang.String r11 = r5.getCanonicalPath()     // Catch:{ IOException -> 0x003c }
            goto L_0x0045
        L_0x003c:
            java.lang.String r11 = r5.getAbsolutePath()     // Catch:{ SecurityException -> 0x0041 }
            goto L_0x0045
        L_0x0041:
            r8.A0A()
            r11 = 0
        L_0x0045:
            X.6Ej r0 = new X.6Ej
            r9 = r29
            r5 = r30
            r0.<init>(r1, r8, r9, r5)
            X.6Ek r14 = new X.6Ek
            r14.<init>(r1, r0, r8, r5)
            com.facebook.msys.mca.MailboxDatabaseConfig r0 = com.facebook.msys.mca.MailboxDatabaseConfig.$redex_init_class
            X.693 r0 = r6.A06
            java.util.Map r12 = r0.A00
            r15 = 1
            r16 = 0
            X.5wo r0 = r1.A0A
            java.lang.Object r0 = r0.get()
            r0.getClass()
            boolean r18 = X.AnonymousClass7TE.A1a(r0)
            java.lang.Boolean r0 = r1.A0Q
            r0.getClass()
            java.lang.Boolean r0 = r1.A0V
            r0.getClass()
            java.lang.Integer r0 = r1.A0c
            r0.getClass()
            java.lang.Integer r0 = r1.A0d
            r0.getClass()
            r23 = -1
            com.facebook.msys.mci.Database$SchemaDeployer r1 = r4.Bbq()
            r7.exists()
            X.5xB r0 = X.C300435xB.A00(r3)
            X.6El r3 = new X.6El
            r3.<init>(r2, r0, r1)
            X.6Em r2 = new X.6Em
            r2.<init>(r4)
            X.6En r1 = new X.6En
            r1.<init>(r4)
            X.6Eo r0 = new X.6Eo
            r0.<init>(r4)
            com.facebook.msys.mci.Database$VirtualTableModuleRegistrator r30 = r4.CFU()
            com.facebook.msys.mca.MailboxDatabaseConfig r9 = new com.facebook.msys.mca.MailboxDatabaseConfig
            r13 = r31
            r17 = r16
            r19 = r16
            r20 = r16
            r21 = r16
            r22 = r16
            r24 = r16
            r25 = r15
            r26 = r3
            r27 = r2
            r28 = r1
            r29 = r0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: X.MZE.A00(X.68F, X.5xB, com.facebook.msys.mca.MailboxCallback, com.facebook.msys.mca.MailboxDatabaseCallback, com.facebook.msys.mci.DatabaseHealthMonitorFatalErrorCallback):com.facebook.msys.mca.MailboxDatabaseConfig");
    }

    public static MailboxMessengerMediaSendManagerConfig A01(AnonymousClass68F r6) {
        String str;
        String str2;
        File cacheDir = r6.A00.A01.A01.getCacheDir();
        MailboxMessengerMediaSendManagerConfig mailboxMessengerMediaSendManagerConfig = MailboxMessengerMediaSendManagerConfig.$redex_init_class;
        try {
            str = cacheDir.getCanonicalPath();
        } catch (IOException unused) {
            str = cacheDir.getAbsolutePath();
        }
        try {
            str2 = cacheDir.getCanonicalPath();
        } catch (IOException unused2) {
            str2 = cacheDir.getAbsolutePath();
        }
        return new MailboxMessengerMediaSendManagerConfig(str, str2, 262144000, 262144000, (Integer) null);
    }

    public static SlimMailbox A02(AnonymousClass68F r6) {
        AnonymousClass692 r2 = r6.A00;
        C300435xB A002 = C300435xB.A00(r2.A01.A08);
        0fh.A01("MsysBootstrapper.SlimMailbox.Create", -1403554724);
        A002.A0H();
        SlimMailbox slimMailbox = SlimMailbox.$redex_init_class;
        SlimMailbox slimMailbox2 = new SlimMailbox(r2.A02, C300465xE.A00(), r6.A02(), new MZO());
        A002.A0G();
        0fh.A00(766861128);
        return slimMailbox2;
    }

    public static void A03(AnonymousClass68F r24, C300435xB r25, SlimMailbox slimMailbox) {
        String A01;
        C249563jz r0;
        C249563jz r02;
        0fh.A01("MsysBootstrapper.configureInfra", 435002070);
        AnonymousClass68F r5 = r24;
        try {
            AnonymousClass692 r7 = r5.A00;
            C300185wg r4 = r7.A01;
            Context context = r4.A01;
            DasmSupportHelper.initialize(context);
            NotificationCenter A002 = C300465xE.A00();
            QuickPerformanceLogger quickPerformanceLogger = r4.A08;
            C300435xB.A00(quickPerformanceLogger).A0F();
            SlimMailbox slimMailbox2 = slimMailbox;
            slimMailbox2.mAccountSession.injectNetworkSession(C300395x4.A00(r4, A002));
            synchronized (AnonymousClass6Ef.class) {
                try {
                    SqlUtils.disableSqliteMemoryStatus();
                    if (r7.A0C) {
                        boolean z = true;
                        if (Execution.getExecutionContext() != 1) {
                            z = false;
                        }
                        AnonymousClass62U.A00(z);
                        C300395x4.A02(r4);
                        String str = r7.A09;
                        File A0t = AnonymousClass7TE.A0t(str);
                        AnonymousClass6Ei r1 = new AnonymousClass6Ei(r7.A00, C300435xB.A00(quickPerformanceLogger));
                        C304606Em r2 = null;
                        if (!r7.A0A) {
                            r2 = new C304606Em(r1);
                        }
                        String facebookUserID = r7.A03.getFacebookUserID();
                        Database.SchemaDeployer BWV = r1.BWV();
                        A0t.exists();
                        AnonymousClass6El r15 = new AnonymousClass6El(context, C300435xB.A00(quickPerformanceLogger), BWV);
                        0fh.A01("MsysBootstrapper.SlimMailbox.DeployEarlyDatabaseConnection", -2005266312);
                        r25.A0N();
                        MsysInfraNoSqliteObjectHolder.A00();
                        slimMailbox2.deployEarlyDatabaseConnection(facebookUserID, str, r5.A00(), r15, r2, false, r7.A06.A00, false, false, false, false, false, true);
                        r25.A0M();
                        0fh.A00(-154474788);
                    }
                    A01 = C300395x4.A01(r4);
                } catch (Throwable th) {
                    th = th;
                    throw th;
                }
            }
            A00 = A01;
            Object obj = r5.A0F.get();
            obj.getClass();
            boolean A1a = AnonymousClass7TE.A1a(obj);
            Class<C249563jz> cls = C249563jz.class;
            synchronized (cls) {
                r0 = C249563jz.A01;
            }
            if (r0 == null) {
                synchronized (cls) {
                    if (C249563jz.A01 == null) {
                        C249563jz.A01 = new C249563jz(context);
                    }
                }
            }
            synchronized (cls) {
                r02 = C249563jz.A01;
            }
            if (r02 != null) {
                r02.A00.edit().putBoolean("vault_enabled", A1a).apply();
            }
            0fh.A00(369012725);
        } catch (Throwable th2) {
            0fh.A00(-60431781);
            throw th2;
        }
    }
}
