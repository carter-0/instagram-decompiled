package X;

import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.direct.wellbeing.teensafety.safetyinterventions.data.database.SafetyInterventionsDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.7Uw  reason: invalid class name and case insensitive filesystem */
public final class C332397Uw extends AnonymousClass1VQ {
    public final /* synthetic */ SafetyInterventionsDatabase_Impl A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C332397Uw(SafetyInterventionsDatabase_Impl safetyInterventionsDatabase_Impl) {
        super(1);
        this.A00 = safetyInterventionsDatabase_Impl;
    }

    public final void onPostMigrate(1W6 r1) {
    }

    public final C21382XZp onValidateSchema(1W6 r24) {
        StringBuilder sb;
        String str;
        HashMap hashMap = new HashMap(3);
        hashMap.put("intervention_type", new SJE("intervention_type", "TEXT", (String) null, 1, 1, true));
        hashMap.put("total_impressions", new SJE("total_impressions", "INTEGER", "0", 0, 1, true));
        hashMap.put("last_impression_timestamp", new SJE("last_impression_timestamp", "INTEGER", "0", 0, 1, true));
        C21501Xd6 xd6 = new C21501Xd6("global_impression_tracker", hashMap, new HashSet(0), new HashSet(0));
        1W6 r6 = r24;
        C21501Xd6 A002 = RS9.A00(r6, "global_impression_tracker");
        if (!xd6.equals(A002)) {
            sb = new StringBuilder();
            str = "global_impression_tracker(com.instagram.direct.wellbeing.teensafety.safetyinterventions.data.database.SafetyInterventionsGlobalImpressionTrackerEntity).\n Expected:\n";
        } else {
            HashMap hashMap2 = new HashMap(4);
            String str2 = "TEXT";
            hashMap2.put("intervention_type", new SJE("intervention_type", str2, (String) null, 1, 1, true));
            hashMap2.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, new SJE(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2, (String) null, 2, 1, true));
            hashMap2.put("total_impressions", new SJE("total_impressions", "INTEGER", "0", 0, 1, true));
            hashMap2.put("last_impression_timestamp", new SJE("last_impression_timestamp", "INTEGER", "0", 0, 1, true));
            xd6 = new C21501Xd6("user_impression_tracker", hashMap2, new HashSet(0), new HashSet(0));
            A002 = RS9.A00(r6, "user_impression_tracker");
            if (xd6.equals(A002)) {
                return new C21382XZp(true, (String) null);
            }
            sb = new StringBuilder();
            str = "user_impression_tracker(com.instagram.direct.wellbeing.teensafety.safetyinterventions.data.database.SafetyInterventionsUserImpressionTrackerEntity).\n Expected:\n";
        }
        sb.append(str);
        sb.append(xd6);
        sb.append("\n Found:\n");
        sb.append(A002);
        return new C21382XZp(false, sb.toString());
    }

    public final void createAllTables(1W6 r2) {
        r2.AT6("CREATE TABLE IF NOT EXISTS `global_impression_tracker` (`intervention_type` TEXT NOT NULL, `total_impressions` INTEGER NOT NULL DEFAULT 0, `last_impression_timestamp` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`intervention_type`))");
        r2.AT6("CREATE TABLE IF NOT EXISTS `user_impression_tracker` (`intervention_type` TEXT NOT NULL, `user_id` TEXT NOT NULL, `total_impressions` INTEGER NOT NULL DEFAULT 0, `last_impression_timestamp` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`intervention_type`, `user_id`))");
        r2.AT6(AnonymousClass000.A00(20));
        r2.AT6("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6c1551e9233e780b87a9e97472ec020e')");
    }

    public final void dropAllTables(1W6 r3) {
        r3.AT6("DROP TABLE IF EXISTS `global_impression_tracker`");
        r3.AT6("DROP TABLE IF EXISTS `user_impression_tracker`");
        List<AnonymousClass2NN> list = this.A00.mCallbacks;
        if (list != null) {
            for (AnonymousClass2NN A01 : list) {
                A01.A01(r3);
            }
        }
    }

    public final void onCreate(1W6 r3) {
        List<AnonymousClass2NN> list = this.A00.mCallbacks;
        if (list != null) {
            for (AnonymousClass2NN A002 : list) {
                A002.A00(r3);
            }
        }
    }

    public final void onOpen(1W6 r3) {
        SafetyInterventionsDatabase_Impl safetyInterventionsDatabase_Impl = this.A00;
        safetyInterventionsDatabase_Impl.mDatabase = r3;
        safetyInterventionsDatabase_Impl.internalInitInvalidationTracker(r3);
        List<AnonymousClass2NN> list = safetyInterventionsDatabase_Impl.mCallbacks;
        if (list != null) {
            for (AnonymousClass2NN A02 : list) {
                A02.A02(r3);
            }
        }
    }

    public final void onPreMigrate(1W6 r1) {
        1wT.A01(r1);
    }
}
