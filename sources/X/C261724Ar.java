package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.odin.signals.persistence.roomimpl.ig4a.RoomSignalsDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.4Ar  reason: invalid class name and case insensitive filesystem */
public final class C261724Ar extends AnonymousClass1VQ {
    public final /* synthetic */ RoomSignalsDatabase_Impl A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C261724Ar(RoomSignalsDatabase_Impl roomSignalsDatabase_Impl) {
        super(1);
        this.A00 = roomSignalsDatabase_Impl;
    }

    public final void onPostMigrate(1W6 r1) {
    }

    public final void createAllTables(1W6 r2) {
        r2.AT6("CREATE TABLE IF NOT EXISTS `signals` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `signal_id` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `signal_component_id` INTEGER, `context` TEXT, `type` INTEGER NOT NULL, `long_value` INTEGER, `float_value` REAL, `text_value` TEXT, `expiration_timestamp` INTEGER NOT NULL)");
        r2.AT6("CREATE INDEX IF NOT EXISTS `index_signals_signal_id` ON `signals` (`signal_id`)");
        r2.AT6("CREATE INDEX IF NOT EXISTS `index_signals_timestamp` ON `signals` (`timestamp`)");
        r2.AT6(AnonymousClass000.A00(20));
        r2.AT6("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'eead9bda19a66b723cc9e635c2c65732')");
    }

    public final void dropAllTables(1W6 r3) {
        r3.AT6("DROP TABLE IF EXISTS `signals`");
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
        RoomSignalsDatabase_Impl roomSignalsDatabase_Impl = this.A00;
        roomSignalsDatabase_Impl.mDatabase = r3;
        roomSignalsDatabase_Impl.internalInitInvalidationTracker(r3);
        List<AnonymousClass2NN> list = roomSignalsDatabase_Impl.mCallbacks;
        if (list != null) {
            for (AnonymousClass2NN A02 : list) {
                A02.A02(r3);
            }
        }
    }

    public final C21382XZp onValidateSchema(1W6 r25) {
        HashMap hashMap = new HashMap(10);
        hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, new SJE(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "INTEGER", (String) null, 1, 1, true));
        hashMap.put("signal_id", new SJE("signal_id", "TEXT", (String) null, 0, 1, true));
        String str = "INTEGER";
        hashMap.put("timestamp", new SJE("timestamp", str, (String) null, 0, 1, true));
        hashMap.put("signal_component_id", new SJE("signal_component_id", str, (String) null, 0, 1, false));
        hashMap.put("context", new SJE("context", "TEXT", (String) null, 0, 1, false));
        String str2 = "INTEGER";
        hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, new SJE(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2, (String) null, 0, 1, true));
        hashMap.put("long_value", new SJE("long_value", str2, (String) null, 0, 1, false));
        hashMap.put("float_value", new SJE("float_value", "REAL", (String) null, 0, 1, false));
        hashMap.put("text_value", new SJE("text_value", "TEXT", (String) null, 0, 1, false));
        hashMap.put("expiration_timestamp", new SJE("expiration_timestamp", "INTEGER", (String) null, 0, 1, true));
        HashSet hashSet = new HashSet(0);
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new S6D("index_signals_signal_id", Arrays.asList(new String[]{"signal_id"}), Arrays.asList(new String[]{"ASC"}), false));
        hashSet2.add(new S6D("index_signals_timestamp", Arrays.asList(new String[]{"timestamp"}), Arrays.asList(new String[]{"ASC"}), false));
        C21501Xd6 xd6 = new C21501Xd6("signals", hashMap, hashSet, hashSet2);
        C21501Xd6 A002 = RS9.A00(r25, "signals");
        if (xd6.equals(A002)) {
            return new C21382XZp(true, (String) null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("signals(com.facebook.odin.signals.persistence.roomimpl.SignalEntity).\n Expected:\n");
        sb.append(xd6);
        sb.append("\n Found:\n");
        sb.append(A002);
        return new C21382XZp(false, sb.toString());
    }

    public final void onPreMigrate(1W6 r1) {
        1wT.A01(r1);
    }
}
