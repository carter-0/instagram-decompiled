package com.instagram.debug.devoptions.sandboxselector;

import X.0qQ;
import X.1V8;
import X.1VA;
import X.AnonymousClass1V7;
import X.AnonymousClass1VF;
import com.instagram.common.session.UserSession;
import com.instagram.roomdb.IgRoomDatabase;
import kotlin.jvm.internal.DefaultConstructorMarker;

public abstract class DevServerDatabase extends IgRoomDatabase {
    public static final Companion Companion = new Object();

    public final class Companion implements AnonymousClass1V7 {
        public 1VA config(1VA r2) {
            0qQ.A0B(r2, 0);
            r2.A01();
            r2.A03(new AnonymousClass1VF[]{DevServerDatabaseKt.MIGRATION_1_2});
            return r2;
        }

        public /* synthetic */ String dbFilename(UserSession userSession) {
            return 1V8.A00(userSession, this);
        }

        public String dbFilenamePrefix() {
            return "dev_servers";
        }

        public /* synthetic */ boolean deleteDatabase(UserSession userSession) {
            return 1V8.A01(userSession, this);
        }

        public boolean isWorkAllowedOnStartup() {
            return false;
        }

        public int queryIgRunnableId() {
            return 290966940;
        }

        public int transactionIgRunnableId() {
            return 693276343;
        }

        public /* synthetic */ int workPriority() {
            return 3;
        }

        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }
    }

    public abstract DevServerDao devServerDao();
}
