package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.screentime.storage.ScreenTimeDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.4xv  reason: invalid class name and case insensitive filesystem */
public final class C279004xv extends AnonymousClass1VQ {
    public final /* synthetic */ ScreenTimeDatabase_Impl A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C279004xv(ScreenTimeDatabase_Impl screenTimeDatabase_Impl) {
        super(1);
        this.A00 = screenTimeDatabase_Impl;
    }

    public final void onPostMigrate(1W6 r1) {
    }

    public final C21382XZp onValidateSchema(1W6 r18) {
        HashMap hashMap = new HashMap(3);
        hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, new SJE(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "INTEGER", (String) null, 1, 1, true));
        String str = "INTEGER";
        hashMap.put("last_sync_time", new SJE("last_sync_time", str, (String) null, 0, 1, true));
        hashMap.put("tia_last_interval_end", new SJE("tia_last_interval_end", str, (String) null, 0, 1, false));
        C21501Xd6 xd6 = new C21501Xd6("screentime_sync", hashMap, new HashSet(0), new HashSet(0));
        C21501Xd6 A002 = RS9.A00(r18, "screentime_sync");
        if (xd6.equals(A002)) {
            return new C21382XZp(true, (String) null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("screentime_sync(com.instagram.screentime.storage.ScreenTimeSyncStateEntity).\n Expected:\n");
        sb.append(xd6);
        sb.append("\n Found:\n");
        sb.append(A002);
        return new C21382XZp(false, sb.toString());
    }

    public final void createAllTables(1W6 r2) {
        r2.AT6("CREATE TABLE IF NOT EXISTS `screentime_sync` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `last_sync_time` INTEGER NOT NULL, `tia_last_interval_end` INTEGER)");
        r2.AT6(AnonymousClass000.A00(20));
        r2.AT6("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'dd0e82fa5800eec1fd75807c74de1575')");
    }

    public final void dropAllTables(1W6 r3) {
        r3.AT6("DROP TABLE IF EXISTS `screentime_sync`");
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
        ScreenTimeDatabase_Impl screenTimeDatabase_Impl = this.A00;
        screenTimeDatabase_Impl.mDatabase = r3;
        screenTimeDatabase_Impl.internalInitInvalidationTracker(r3);
        List<AnonymousClass2NN> list = screenTimeDatabase_Impl.mCallbacks;
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
