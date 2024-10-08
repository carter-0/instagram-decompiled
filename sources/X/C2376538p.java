package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.work.impl.WorkDatabase_Impl;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.38p  reason: invalid class name and case insensitive filesystem */
public final class C2376538p extends AnonymousClass1VQ {
    public final /* synthetic */ WorkDatabase_Impl A00;

    public final void onPostMigrate(1W6 r1) {
    }

    public final C21382XZp onValidateSchema(1W6 r43) {
        StringBuilder sb;
        String str;
        StringBuilder sb2;
        String str2;
        HashMap hashMap = new HashMap(2);
        hashMap.put("work_spec_id", new SJE("work_spec_id", "TEXT", (String) null, 1, 1, true));
        String str3 = "TEXT";
        hashMap.put("prerequisite_id", new SJE("prerequisite_id", str3, (String) null, 2, 1, true));
        HashSet hashSet = new HashSet(2);
        List asList = Arrays.asList(new String[]{"work_spec_id"});
        List asList2 = Arrays.asList(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID});
        String A002 = AnonymousClass000.A00(879);
        String str4 = "WorkSpec";
        String str5 = A002;
        hashSet.add(new C39795A9q(str4, A002, str5, asList, asList2));
        hashSet.add(new C39795A9q(str4, A002, str5, Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID})));
        HashSet hashSet2 = new HashSet(2);
        hashSet2.add(new S6D("index_Dependency_work_spec_id", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"}), false));
        hashSet2.add(new S6D("index_Dependency_prerequisite_id", Arrays.asList(new String[]{"prerequisite_id"}), Arrays.asList(new String[]{"ASC"}), false));
        C21501Xd6 xd6 = new C21501Xd6("Dependency", hashMap, hashSet, hashSet2);
        1W6 r1 = r43;
        C21501Xd6 A003 = RS9.A00(r1, "Dependency");
        if (!xd6.equals(A003)) {
            sb2 = new StringBuilder();
            str2 = "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n";
        } else {
            HashMap hashMap2 = new HashMap(30);
            String str6 = str3;
            String str7 = PublicKeyCredentialControllerUtility.JSON_KEY_ID;
            hashMap2.put(str7, new SJE(str7, str6, (String) null, 1, 1, true));
            hashMap2.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, new SJE(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, "INTEGER", (String) null, 0, 1, true));
            String str8 = str6;
            hashMap2.put("worker_class_name", new SJE("worker_class_name", str8, (String) null, 0, 1, true));
            hashMap2.put("input_merger_class_name", new SJE("input_merger_class_name", str8, (String) null, 0, 1, true));
            hashMap2.put("input", new SJE("input", "BLOB", (String) null, 0, 1, true));
            hashMap2.put("output", new SJE("output", "BLOB", (String) null, 0, 1, true));
            String str9 = "INTEGER";
            hashMap2.put("initial_delay", new SJE("initial_delay", str9, (String) null, 0, 1, true));
            hashMap2.put("interval_duration", new SJE("interval_duration", str9, (String) null, 0, 1, true));
            hashMap2.put("flex_duration", new SJE("flex_duration", str9, (String) null, 0, 1, true));
            hashMap2.put("run_attempt_count", new SJE("run_attempt_count", str9, (String) null, 0, 1, true));
            hashMap2.put("backoff_policy", new SJE("backoff_policy", str9, (String) null, 0, 1, true));
            hashMap2.put("backoff_delay_duration", new SJE("backoff_delay_duration", str9, (String) null, 0, 1, true));
            hashMap2.put("last_enqueue_time", new SJE("last_enqueue_time", str9, "-1", 0, 1, true));
            hashMap2.put("minimum_retention_duration", new SJE("minimum_retention_duration", str9, (String) null, 0, 1, true));
            String str10 = str9;
            hashMap2.put("schedule_requested_at", new SJE("schedule_requested_at", str10, (String) null, 0, 1, true));
            hashMap2.put("run_in_foreground", new SJE("run_in_foreground", str10, (String) null, 0, 1, true));
            hashMap2.put("out_of_quota_policy", new SJE("out_of_quota_policy", str10, (String) null, 0, 1, true));
            hashMap2.put("period_count", new SJE("period_count", str10, "0", 0, 1, true));
            hashMap2.put("generation", new SJE("generation", str10, "0", 0, 1, true));
            hashMap2.put("next_schedule_time_override", new SJE("next_schedule_time_override", "INTEGER", "9223372036854775807", 0, 1, true));
            hashMap2.put("next_schedule_time_override_generation", new SJE("next_schedule_time_override_generation", str10, "0", 0, 1, true));
            String str11 = "INTEGER";
            hashMap2.put("stop_reason", new SJE("stop_reason", str11, "-256", 0, 1, true));
            hashMap2.put("required_network_type", new SJE("required_network_type", str11, (String) null, 0, 1, true));
            hashMap2.put("requires_charging", new SJE("requires_charging", str11, (String) null, 0, 1, true));
            hashMap2.put("requires_device_idle", new SJE("requires_device_idle", str11, (String) null, 0, 1, true));
            hashMap2.put("requires_battery_not_low", new SJE("requires_battery_not_low", str11, (String) null, 0, 1, true));
            hashMap2.put("requires_storage_not_low", new SJE("requires_storage_not_low", str11, (String) null, 0, 1, true));
            hashMap2.put("trigger_content_update_delay", new SJE("trigger_content_update_delay", str11, (String) null, 0, 1, true));
            hashMap2.put("trigger_max_content_delay", new SJE("trigger_max_content_delay", str11, (String) null, 0, 1, true));
            hashMap2.put("content_uri_triggers", new SJE("content_uri_triggers", "BLOB", (String) null, 0, 1, true));
            HashSet hashSet3 = new HashSet(0);
            HashSet hashSet4 = new HashSet(2);
            hashSet4.add(new S6D("index_WorkSpec_schedule_requested_at", Arrays.asList(new String[]{"schedule_requested_at"}), Arrays.asList(new String[]{"ASC"}), false));
            hashSet4.add(new S6D("index_WorkSpec_last_enqueue_time", Arrays.asList(new String[]{"last_enqueue_time"}), Arrays.asList(new String[]{"ASC"}), false));
            C21501Xd6 xd62 = new C21501Xd6("WorkSpec", hashMap2, hashSet3, hashSet4);
            C21501Xd6 A004 = RS9.A00(r1, "WorkSpec");
            if (!xd62.equals(A004)) {
                sb = new StringBuilder();
                str = "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n";
            } else {
                HashMap hashMap3 = new HashMap(2);
                String str12 = "TEXT";
                hashMap3.put("tag", new SJE("tag", str12, (String) null, 1, 1, true));
                hashMap3.put("work_spec_id", new SJE("work_spec_id", str12, (String) null, 2, 1, true));
                HashSet hashSet5 = new HashSet(1);
                hashSet5.add(new C39795A9q("WorkSpec", A002, A002, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID})));
                HashSet hashSet6 = new HashSet(1);
                hashSet6.add(new S6D("index_WorkTag_work_spec_id", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"}), false));
                xd6 = new C21501Xd6("WorkTag", hashMap3, hashSet5, hashSet6);
                A003 = RS9.A00(r1, "WorkTag");
                if (!xd6.equals(A003)) {
                    sb2 = new StringBuilder();
                    str2 = "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n";
                } else {
                    HashMap hashMap4 = new HashMap(3);
                    hashMap4.put("work_spec_id", new SJE("work_spec_id", "TEXT", (String) null, 1, 1, true));
                    hashMap4.put("generation", new SJE("generation", str10, "0", 2, 1, true));
                    hashMap4.put("system_id", new SJE("system_id", str10, (String) null, 0, 1, true));
                    HashSet hashSet7 = new HashSet(1);
                    String str13 = A002;
                    hashSet7.add(new C39795A9q("WorkSpec", str13, str13, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID})));
                    xd6 = new C21501Xd6("SystemIdInfo", hashMap4, hashSet7, new HashSet(0));
                    A003 = RS9.A00(r1, "SystemIdInfo");
                    if (!xd6.equals(A003)) {
                        sb2 = new StringBuilder();
                        str2 = "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n";
                    } else {
                        HashMap hashMap5 = new HashMap(2);
                        String str14 = "TEXT";
                        hashMap5.put(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, new SJE(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str14, (String) null, 1, 1, true));
                        hashMap5.put("work_spec_id", new SJE("work_spec_id", str14, (String) null, 2, 1, true));
                        HashSet hashSet8 = new HashSet(1);
                        hashSet8.add(new C39795A9q("WorkSpec", str13, str13, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID})));
                        HashSet hashSet9 = new HashSet(1);
                        hashSet9.add(new S6D("index_WorkName_work_spec_id", Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{"ASC"}), false));
                        xd6 = new C21501Xd6("WorkName", hashMap5, hashSet8, hashSet9);
                        A003 = RS9.A00(r1, "WorkName");
                        if (!xd6.equals(A003)) {
                            sb2 = new StringBuilder();
                            str2 = "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n";
                        } else {
                            HashMap hashMap6 = new HashMap(2);
                            String str15 = "TEXT";
                            hashMap6.put("work_spec_id", new SJE("work_spec_id", str15, (String) null, 1, 1, true));
                            hashMap6.put(ReactProgressBarViewManager.PROP_PROGRESS, new SJE(ReactProgressBarViewManager.PROP_PROGRESS, "BLOB", (String) null, 0, 1, true));
                            HashSet hashSet10 = new HashSet(1);
                            hashSet10.add(new C39795A9q("WorkSpec", A002, str5, Arrays.asList(new String[]{"work_spec_id"}), Arrays.asList(new String[]{PublicKeyCredentialControllerUtility.JSON_KEY_ID})));
                            xd6 = new C21501Xd6("WorkProgress", hashMap6, hashSet10, new HashSet(0));
                            A003 = RS9.A00(r1, "WorkProgress");
                            if (!xd6.equals(A003)) {
                                sb2 = new StringBuilder();
                                str2 = "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n";
                            } else {
                                HashMap hashMap7 = new HashMap(2);
                                hashMap7.put("key", new SJE("key", str15, (String) null, 1, 1, true));
                                hashMap7.put("long_value", new SJE("long_value", "INTEGER", (String) null, 0, 1, false));
                                xd62 = new C21501Xd6("Preference", hashMap7, new HashSet(0), new HashSet(0));
                                A004 = RS9.A00(r1, "Preference");
                                if (xd62.equals(A004)) {
                                    return new C21382XZp(true, (String) null);
                                }
                                sb = new StringBuilder();
                                str = "Preference(androidx.work.impl.model.Preference).\n Expected:\n";
                            }
                        }
                    }
                }
            }
            sb2.append(str);
            sb2.append(xd62);
            sb2.append("\n Found:\n");
            sb2.append(A004);
            return new C21382XZp(false, sb2.toString());
        }
        sb2.append(str2);
        sb2.append(xd6);
        sb2.append("\n Found:\n");
        sb2.append(A003);
        return new C21382XZp(false, sb2.toString());
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2376538p(WorkDatabase_Impl workDatabase_Impl) {
        super(20);
        this.A00 = workDatabase_Impl;
    }

    public final void createAllTables(1W6 r2) {
        r2.AT6("CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.AT6("CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)");
        r2.AT6("CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)");
        r2.AT6("CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `required_network_type` INTEGER NOT NULL, `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))");
        r2.AT6("CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)");
        r2.AT6("CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)");
        r2.AT6("CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.AT6("CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)");
        r2.AT6("CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.AT6("CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.AT6("CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)");
        r2.AT6("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.AT6("CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))");
        r2.AT6(AnonymousClass000.A00(20));
        r2.AT6("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '7d73d21f1bd82c9e5268b6dcf9fde2cb')");
    }

    public final void dropAllTables(1W6 r5) {
        r5.AT6("DROP TABLE IF EXISTS `Dependency`");
        r5.AT6("DROP TABLE IF EXISTS `WorkSpec`");
        r5.AT6("DROP TABLE IF EXISTS `WorkTag`");
        r5.AT6("DROP TABLE IF EXISTS `SystemIdInfo`");
        r5.AT6("DROP TABLE IF EXISTS `WorkName`");
        r5.AT6("DROP TABLE IF EXISTS `WorkProgress`");
        r5.AT6("DROP TABLE IF EXISTS `Preference`");
        WorkDatabase_Impl workDatabase_Impl = this.A00;
        List list = workDatabase_Impl.mCallbacks;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass2NN) workDatabase_Impl.mCallbacks.get(i)).A01(r5);
            }
        }
    }

    public final void onCreate(1W6 r5) {
        WorkDatabase_Impl workDatabase_Impl = this.A00;
        List list = workDatabase_Impl.mCallbacks;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass2NN) workDatabase_Impl.mCallbacks.get(i)).A00(r5);
            }
        }
    }

    public final void onOpen(1W6 r5) {
        WorkDatabase_Impl workDatabase_Impl = this.A00;
        workDatabase_Impl.mDatabase = r5;
        r5.AT6("PRAGMA foreign_keys = ON");
        workDatabase_Impl.internalInitInvalidationTracker(r5);
        List list = workDatabase_Impl.mCallbacks;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((AnonymousClass2NN) workDatabase_Impl.mCallbacks.get(i)).A02(r5);
            }
        }
    }

    public final void onPreMigrate(1W6 r1) {
        1wT.A01(r1);
    }
}
