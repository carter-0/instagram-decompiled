package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.database.ContentFilterDictionaryDatabase_Impl;
import com.instagram.realtimeclient.RealtimeSubscription;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.92S  reason: invalid class name */
public final class AnonymousClass92S extends AnonymousClass1VQ {
    public final /* synthetic */ ContentFilterDictionaryDatabase_Impl A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass92S(ContentFilterDictionaryDatabase_Impl contentFilterDictionaryDatabase_Impl) {
        super(1);
        this.A00 = contentFilterDictionaryDatabase_Impl;
    }

    public final void onPostMigrate(1W6 r1) {
    }

    public final void createAllTables(1W6 r2) {
        r2.AT6("CREATE TABLE IF NOT EXISTS `content_filter_dictionary_metadata` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `dictionary_key` TEXT NOT NULL, `name` TEXT NOT NULL, `language` TEXT NOT NULL, `editable` INTEGER NOT NULL, `type` INTEGER NOT NULL, `strategy_id` INTEGER NOT NULL, `loadedVersion` TEXT NOT NULL DEFAULT '', `latestVersion` TEXT NOT NULL DEFAULT '', `supportsVersioning` INTEGER NOT NULL DEFAULT 1)");
        r2.AT6("CREATE UNIQUE INDEX IF NOT EXISTS `index_content_filter_dictionary_metadata_dictionary_key` ON `content_filter_dictionary_metadata` (`dictionary_key`)");
        r2.AT6("CREATE TABLE IF NOT EXISTS `content_filter_dictionary_entries` (`dictionary_id` INTEGER NOT NULL, `pattern` TEXT NOT NULL, PRIMARY KEY(`dictionary_id`, `pattern`), FOREIGN KEY(`dictionary_id`) REFERENCES `content_filter_dictionary_metadata`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        r2.AT6("CREATE TABLE IF NOT EXISTS `content_filter_dictionary_client_availability` (`dictionary_id` INTEGER NOT NULL, `client_id` INTEGER NOT NULL, PRIMARY KEY(`dictionary_id`, `client_id`), FOREIGN KEY(`dictionary_id`) REFERENCES `content_filter_dictionary_metadata`(`id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
        r2.AT6(AnonymousClass000.A00(20));
        r2.AT6("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9914a74bbddde2b9b1a1ca667c5e7298')");
    }

    public final void dropAllTables(1W6 r3) {
        r3.AT6("DROP TABLE IF EXISTS `content_filter_dictionary_metadata`");
        r3.AT6("DROP TABLE IF EXISTS `content_filter_dictionary_entries`");
        r3.AT6("DROP TABLE IF EXISTS `content_filter_dictionary_client_availability`");
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
        ContentFilterDictionaryDatabase_Impl contentFilterDictionaryDatabase_Impl = this.A00;
        contentFilterDictionaryDatabase_Impl.mDatabase = r3;
        r3.AT6("PRAGMA foreign_keys = ON");
        contentFilterDictionaryDatabase_Impl.internalInitInvalidationTracker(r3);
        List<AnonymousClass2NN> list = contentFilterDictionaryDatabase_Impl.mCallbacks;
        if (list != null) {
            for (AnonymousClass2NN A02 : list) {
                A02.A02(r3);
            }
        }
    }

    public final C21382XZp onValidateSchema(1W6 r28) {
        StringBuilder sb;
        String str;
        HashMap hashMap = new HashMap(10);
        hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, new SJE(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "INTEGER", (String) null, 1, 1, true));
        hashMap.put("dictionary_key", new SJE("dictionary_key", "TEXT", (String) null, 0, 1, true));
        hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, new SJE(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "TEXT", (String) null, 0, 1, true));
        hashMap.put("language", new SJE("language", "TEXT", (String) null, 0, 1, true));
        String str2 = "INTEGER";
        hashMap.put("editable", new SJE("editable", str2, (String) null, 0, 1, true));
        hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, new SJE(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str2, (String) null, 0, 1, true));
        hashMap.put("strategy_id", new SJE("strategy_id", str2, (String) null, 0, 1, true));
        hashMap.put("loadedVersion", new SJE("loadedVersion", "TEXT", "''", 0, 1, true));
        hashMap.put("latestVersion", new SJE("latestVersion", "TEXT", "''", 0, 1, true));
        String str3 = "INTEGER";
        hashMap.put("supportsVersioning", new SJE("supportsVersioning", str3, RealtimeSubscription.GRAPHQL_MQTT_VERSION, 0, 1, true));
        HashSet hashSet = new HashSet(0);
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new S6D("index_content_filter_dictionary_metadata_dictionary_key", Arrays.asList(new String[]{"dictionary_key"}), Arrays.asList(new String[]{"ASC"}), true));
        String A002 = C273654mx.A00(2197);
        C21501Xd6 xd6 = new C21501Xd6(A002, hashMap, hashSet, hashSet2);
        1W6 r5 = r28;
        C21501Xd6 A003 = RS9.A00(r5, A002);
        if (!xd6.equals(A003)) {
            sb = new StringBuilder();
            str = "content_filter_dictionary_metadata(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.database.ContentFilterDictionaryMetadataEntity).\n Expected:\n";
        } else {
            HashMap hashMap2 = new HashMap(2);
            hashMap2.put("dictionary_id", new SJE("dictionary_id", str3, (String) null, 1, 1, true));
            hashMap2.put("pattern", new SJE("pattern", "TEXT", (String) null, 2, 1, true));
            HashSet hashSet3 = new HashSet(1);
            List asList = Arrays.asList(new String[]{"dictionary_id"});
            List asList2 = Arrays.asList(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID});
            String A004 = AnonymousClass000.A00(879);
            String A005 = AnonymousClass000.A00(2374);
            hashSet3.add(new C39795A9q(A002, A004, A005, asList, asList2));
            HashSet hashSet4 = new HashSet(0);
            String A006 = C273654mx.A00(2196);
            xd6 = new C21501Xd6(A006, hashMap2, hashSet3, hashSet4);
            A003 = RS9.A00(r5, A006);
            if (!xd6.equals(A003)) {
                sb = new StringBuilder();
                str = "content_filter_dictionary_entries(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.database.ContentFilterDictionaryEntriesEntity).\n Expected:\n";
            } else {
                HashMap hashMap3 = new HashMap(2);
                String str4 = "INTEGER";
                hashMap3.put("dictionary_id", new SJE("dictionary_id", str4, (String) null, 1, 1, true));
                hashMap3.put("client_id", new SJE("client_id", str4, (String) null, 2, 1, true));
                HashSet hashSet5 = new HashSet(1);
                hashSet5.add(new C39795A9q(A002, A004, A005, Arrays.asList(new String[]{"dictionary_id"}), Arrays.asList(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID})));
                HashSet hashSet6 = new HashSet(0);
                String A007 = C273654mx.A00(2195);
                xd6 = new C21501Xd6(A007, hashMap3, hashSet5, hashSet6);
                A003 = RS9.A00(r5, A007);
                if (xd6.equals(A003)) {
                    return new C21382XZp(true, (String) null);
                }
                sb = new StringBuilder();
                str = "content_filter_dictionary_client_availability(com.instagram.direct.wellbeing.safetyecosystem.contentfilter.dictionary.database.ContentFilterDictionaryClientAvailabilityEntity).\n Expected:\n";
            }
        }
        sb.append(str);
        sb.append(xd6);
        sb.append("\n Found:\n");
        sb.append(A003);
        return new C21382XZp(false, sb.toString());
    }

    public final void onPreMigrate(1W6 r1) {
        1wT.A01(r1);
    }
}
