package X;

import android.content.Context;
import com.facebook.instagram.msys.InstagramTableToProcedureNameMapRegisterer;
import com.facebook.msys.config.infranosqlite.MsysInfraNoSqliteObjectHolder;
import com.facebook.msys.mca.Mailbox;
import com.facebook.msys.mca.MailboxCallback;
import com.facebook.msys.mca.MailboxConfig;
import com.facebook.msys.mca.MailboxDatabaseCallback;
import com.facebook.msys.mca.SlimMailbox;
import com.facebook.msys.mci.AccountSession;
import com.facebook.msys.mci.DatabaseFileManager;
import com.facebook.msys.mci.DatabaseHealthMonitorFatalErrorCallback;
import com.facebook.msys.mci.NetworkSession;
import com.facebook.msys.mcs.DasmConfigCreator;
import java.io.File;
import java.util.List;

/* renamed from: X.6EM  reason: invalid class name */
public final class AnonymousClass6EM extends AnonymousClass45Y {
    public final /* synthetic */ AnonymousClass68F A00;
    public final /* synthetic */ C300435xB A01;
    public final /* synthetic */ MailboxCallback A02;
    public final /* synthetic */ MailboxDatabaseCallback A03;
    public final /* synthetic */ SlimMailbox A04;
    public final /* synthetic */ DatabaseHealthMonitorFatalErrorCallback A05;
    public final /* synthetic */ String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass6EM(AnonymousClass68F r2, C300435xB r3, MailboxCallback mailboxCallback, MailboxDatabaseCallback mailboxDatabaseCallback, SlimMailbox slimMailbox, DatabaseHealthMonitorFatalErrorCallback databaseHealthMonitorFatalErrorCallback, String str) {
        super("MsysBootstrapper.createMailbox");
        this.A01 = r3;
        this.A00 = r2;
        this.A06 = str;
        this.A04 = slimMailbox;
        this.A05 = databaseHealthMonitorFatalErrorCallback;
        this.A02 = mailboxCallback;
        this.A03 = mailboxDatabaseCallback;
    }

    public final void run() {
        int i;
        String str;
        0fh.A01("MsysBootstrapper.createMailbox", -1595868989);
        C300435xB r2 = this.A01;
        r2.A09();
        AnonymousClass68F r1 = this.A00;
        AnonymousClass692 r6 = r1.A00;
        C300185wg r0 = r6.A01;
        Context context = r0.A01;
        String A0R = 002.A0R(this.A06, ".ephemeral");
        if (new File(A0R).isFile()) {
            DatabaseFileManager.deleteDatabaseFilesForPathNative(A0R);
        }
        SlimMailbox slimMailbox = this.A04;
        MZE.A03(r1, r2, slimMailbox);
        r2.A0D();
        0fh.A01("MsysDatabase.registerDatabaseTableToProcedureNameMappings", -1459923271);
        try {
            C300255wo r5 = r1.A05;
            if (((InstagramTableToProcedureNameMapRegisterer) r5.get()) != null) {
                ((InstagramTableToProcedureNameMapRegisterer) r5.get()).registerMappings();
            }
            0fh.A00(-251466710);
            r2.A0C();
            try {
                NetworkSession A002 = MsysInfraNoSqliteObjectHolder.A00();
                A002.getClass();
                AccountSession accountSession = r6.A02;
                r2.A0B();
                MailboxConfig mailboxConfig = MailboxConfig.$redex_init_class;
                String A003 = AnonymousClass6Eh.A00(context);
                String A022 = r1.A02();
                String str2 = r0.A0E;
                C300355wz r3 = r6.A05;
                boolean z = r3.A05;
                boolean z2 = r3.A06;
                boolean z3 = r3.A07;
                boolean z4 = r3.A01;
                boolean z5 = r3.A02;
                boolean z6 = r3.A03;
                boolean z7 = r3.A04;
                r1.A0b.getClass();
                r1.A0Z.getClass();
                Object obj = r1.A03.get();
                obj.getClass();
                DasmConfigCreator dasmConfigCreator = (DasmConfigCreator) obj;
                List list = (List) r1.A0L.get();
                List list2 = (List) r1.A07.get();
                Object obj2 = r1.A0F.get();
                obj2.getClass();
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                boolean booleanValue2 = ((Boolean) r1.A0O.get()).booleanValue();
                boolean booleanValue3 = ((Boolean) r1.A06.get()).booleanValue();
                synchronized (AnonymousClass1EI.class) {
                }
                boolean z8 = z2;
                boolean z9 = z3;
                boolean z10 = z4;
                boolean z11 = z5;
                boolean z12 = z6;
                boolean z13 = z7;
                DasmConfigCreator dasmConfigCreator2 = dasmConfigCreator;
                List list3 = list;
                List list4 = list2;
                SlimMailbox slimMailbox2 = slimMailbox;
                AccountSession accountSession2 = accountSession;
                String str3 = str2;
                MailboxConfig mailboxConfig2 = new MailboxConfig(slimMailbox2, accountSession2, A002, A003, A022, str3, true, false, z, z8, z9, 500, true, 500, z10, z11, 500, z12, z13, -10000, false, dasmConfigCreator2, list3, list4, false, 2, false, false, booleanValue, booleanValue2, booleanValue3, false, false, MZE.A00(r1, r2, this.A02, this.A03, this.A05), MZE.A01(r1), -1, -1);
                Mailbox mailbox = Mailbox.$redex_init_class;
                r1.A0P.getClass();
                new Mailbox(slimMailbox, false, mailboxConfig2);
                r2.A08();
                0fh.A00(-812128283);
            } catch (RuntimeException e) {
                r2.A0R(e.getClass().getSimpleName());
                MZN A004 = MZN.A00(r0.A09);
                if (e.getMessage() != null) {
                    str = e.getMessage();
                } else {
                    str = "MsysDatabase initialization failed.";
                }
                A004.A03(str);
                throw e;
            } catch (Throwable th) {
                th = th;
                i = 617517669;
                0fh.A00(i);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            i = -328718247;
            0fh.A00(i);
            throw th;
        }
    }
}
