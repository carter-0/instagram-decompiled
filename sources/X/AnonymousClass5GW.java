package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.notifications.persistence.room.IgNotificationsDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.5GW  reason: invalid class name */
public final class AnonymousClass5GW extends AnonymousClass1VQ {
    public final /* synthetic */ IgNotificationsDatabase_Impl A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass5GW(IgNotificationsDatabase_Impl igNotificationsDatabase_Impl) {
        super(4);
        this.A00 = igNotificationsDatabase_Impl;
    }

    public final void onPostMigrate(1W6 r1) {
    }

    public final C21382XZp onValidateSchema(1W6 r29) {
        StringBuilder sb;
        String str;
        HashMap hashMap = new HashMap(7);
        hashMap.put("push_id", new SJE("push_id", "TEXT", (String) null, 1, 1, true));
        hashMap.put("uuid", new SJE("uuid", "TEXT", (String) null, 0, 1, true));
        String str2 = "TEXT";
        hashMap.put("recipient_id", new SJE("recipient_id", str2, (String) null, 0, 1, true));
        hashMap.put("category", new SJE("category", str2, (String) null, 0, 1, true));
        hashMap.put("timestamp", new SJE("timestamp", "INTEGER", (String) null, 0, 1, true));
        hashMap.put("is_rendered", new SJE("is_rendered", "INTEGER", (String) null, 0, 1, true));
        String str3 = "data";
        hashMap.put("data", new SJE(str3, "BLOB", (String) null, 0, 1, true));
        HashSet hashSet = new HashSet(0);
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new S6D("index_ignotifications_uuid", Arrays.asList(new String[]{"uuid"}), Arrays.asList(new String[]{"ASC"}), false));
        hashSet2.add(new S6D("index_ignotifications_timestamp", Arrays.asList(new String[]{"timestamp"}), Arrays.asList(new String[]{"ASC"}), false));
        C21501Xd6 xd6 = new C21501Xd6("ignotifications", hashMap, hashSet, hashSet2);
        1W6 r8 = r29;
        C21501Xd6 A002 = RS9.A00(r8, "ignotifications");
        if (!xd6.equals(A002)) {
            sb = new StringBuilder();
            str = "ignotifications(com.instagram.notifications.persistence.room.IgNotificationEntity).\n Expected:\n";
        } else {
            HashMap hashMap2 = new HashMap(9);
            String str4 = "TEXT";
            hashMap2.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, new SJE(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str4, (String) null, 1, 1, true));
            hashMap2.put(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, new SJE(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str4, (String) null, 0, 1, true));
            String str5 = "INTEGER";
            hashMap2.put("notification_type", new SJE("notification_type", str5, (String) null, 0, 1, true));
            hashMap2.put("timestamp", new SJE("timestamp", str5, (String) null, 0, 1, true));
            hashMap2.put("first_impression_timestamp", new SJE("first_impression_timestamp", str5, (String) null, 0, 1, false));
            hashMap2.put("impression_count", new SJE("impression_count", str5, (String) null, 0, 1, true));
            hashMap2.put("priority_section_eligibility", new SJE("priority_section_eligibility", str5, (String) null, 0, 1, true));
            hashMap2.put("major_app_version", new SJE("major_app_version", str5, (String) null, 0, 1, true));
            hashMap2.put("data", new SJE(str3, "BLOB", (String) null, 0, 1, true));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(1);
            hashSet4.add(new S6D("index_newfeedstory_timestamp", Arrays.asList(new String[]{"timestamp"}), Arrays.asList(new String[]{"ASC"}), false));
            xd6 = new C21501Xd6("newfeedstory", hashMap2, hashSet3, hashSet4);
            A002 = RS9.A00(r8, "newfeedstory");
            if (xd6.equals(A002)) {
                return new C21382XZp(true, (String) null);
            }
            sb = new StringBuilder();
            str = "newfeedstory(com.instagram.notifications.persistence.room.NewsfeedStoryEntity).\n Expected:\n";
        }
        sb.append(str);
        sb.append(xd6);
        sb.append("\n Found:\n");
        sb.append(A002);
        return new C21382XZp(false, sb.toString());
    }

    public final void createAllTables(1W6 r2) {
        r2.AT6("CREATE TABLE IF NOT EXISTS `ignotifications` (`push_id` TEXT NOT NULL, `uuid` TEXT NOT NULL, `recipient_id` TEXT NOT NULL, `category` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `is_rendered` INTEGER NOT NULL, `data` BLOB NOT NULL, PRIMARY KEY(`push_id`))");
        r2.AT6("CREATE INDEX IF NOT EXISTS `index_ignotifications_uuid` ON `ignotifications` (`uuid`)");
        r2.AT6("CREATE INDEX IF NOT EXISTS `index_ignotifications_timestamp` ON `ignotifications` (`timestamp`)");
        r2.AT6("CREATE TABLE IF NOT EXISTS `newfeedstory` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `notification_type` INTEGER NOT NULL, `timestamp` INTEGER NOT NULL, `first_impression_timestamp` INTEGER, `impression_count` INTEGER NOT NULL, `priority_section_eligibility` INTEGER NOT NULL, `major_app_version` INTEGER NOT NULL, `data` BLOB NOT NULL, PRIMARY KEY(`id`))");
        r2.AT6("CREATE INDEX IF NOT EXISTS `index_newfeedstory_timestamp` ON `newfeedstory` (`timestamp`)");
        r2.AT6(AnonymousClass000.A00(20));
        r2.AT6("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86dceb4730e308a832277a98aef7c261')");
    }

    public final void dropAllTables(1W6 r3) {
        r3.AT6("DROP TABLE IF EXISTS `ignotifications`");
        r3.AT6("DROP TABLE IF EXISTS `newfeedstory`");
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
        IgNotificationsDatabase_Impl igNotificationsDatabase_Impl = this.A00;
        igNotificationsDatabase_Impl.mDatabase = r3;
        igNotificationsDatabase_Impl.internalInitInvalidationTracker(r3);
        List<AnonymousClass2NN> list = igNotificationsDatabase_Impl.mCallbacks;
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
