package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.odin.features.persistence.room.ig4a.IgRoomExampleDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.4Ak  reason: invalid class name and case insensitive filesystem */
public final class C261654Ak extends AnonymousClass1VQ {
    public final /* synthetic */ IgRoomExampleDatabase_Impl A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C261654Ak(IgRoomExampleDatabase_Impl igRoomExampleDatabase_Impl) {
        super(1);
        this.A00 = igRoomExampleDatabase_Impl;
    }

    public final void onPostMigrate(1W6 r1) {
    }

    public final void createAllTables(1W6 r2) {
        r2.AT6("CREATE TABLE IF NOT EXISTS `examples` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `example_id` TEXT NOT NULL, `use_case` TEXT NOT NULL, `use_case_version` TEXT NOT NULL, `model_version` INTEGER NOT NULL, `label` INTEGER NOT NULL, `features` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `label_timestamp` INTEGER NOT NULL, `context` TEXT NOT NULL)");
        r2.AT6(AnonymousClass000.A00(20));
        r2.AT6("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '473251c2ba832c8fe881158dd000e9e1')");
    }

    public final void dropAllTables(1W6 r3) {
        r3.AT6("DROP TABLE IF EXISTS `examples`");
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
        IgRoomExampleDatabase_Impl igRoomExampleDatabase_Impl = this.A00;
        igRoomExampleDatabase_Impl.mDatabase = r3;
        igRoomExampleDatabase_Impl.internalInitInvalidationTracker(r3);
        List<AnonymousClass2NN> list = igRoomExampleDatabase_Impl.mCallbacks;
        if (list != null) {
            for (AnonymousClass2NN A02 : list) {
                A02.A02(r3);
            }
        }
    }

    public final C21382XZp onValidateSchema(1W6 r19) {
        HashMap hashMap = new HashMap(10);
        hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, new SJE(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "INTEGER", (String) null, 1, 1, true));
        hashMap.put("example_id", new SJE("example_id", "TEXT", (String) null, 0, 1, true));
        hashMap.put("use_case", new SJE("use_case", "TEXT", (String) null, 0, 1, true));
        hashMap.put("use_case_version", new SJE("use_case_version", "TEXT", (String) null, 0, 1, true));
        String str = "INTEGER";
        hashMap.put("model_version", new SJE("model_version", str, (String) null, 0, 1, true));
        hashMap.put("label", new SJE("label", str, (String) null, 0, 1, true));
        hashMap.put("features", new SJE("features", "TEXT", (String) null, 0, 1, true));
        hashMap.put("timestamp", new SJE("timestamp", str, (String) null, 0, 1, true));
        hashMap.put("label_timestamp", new SJE("label_timestamp", str, (String) null, 0, 1, true));
        hashMap.put("context", new SJE("context", "TEXT", (String) null, 0, 1, true));
        C21501Xd6 xd6 = new C21501Xd6("examples", hashMap, new HashSet(0), new HashSet(0));
        C21501Xd6 A002 = RS9.A00(r19, "examples");
        if (xd6.equals(A002)) {
            return new C21382XZp(true, (String) null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("examples(com.facebook.odin.features.persistence.room.ExampleEntity).\n Expected:\n");
        sb.append(xd6);
        sb.append("\n Found:\n");
        sb.append(A002);
        return new C21382XZp(false, sb.toString());
    }

    public final void onPreMigrate(1W6 r1) {
        1wT.A01(r1);
    }
}
