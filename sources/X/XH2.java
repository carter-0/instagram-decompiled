package X;

import com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.ArmadilloExpressEncryptedBackupDatabase_Impl;
import com.instagram.gallery.suggestions.database.SuggestionsDatabase_Impl;
import com.instagram.igtv.persistence.IGTVDatabase_Impl;
import java.util.Iterator;
import java.util.List;

public final class XH2 extends AnonymousClass1VQ {
    public final int A00;
    public final Object A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XH2(ArmadilloExpressEncryptedBackupDatabase_Impl armadilloExpressEncryptedBackupDatabase_Impl) {
        super(17);
        this.A00 = 1;
        this.A01 = armadilloExpressEncryptedBackupDatabase_Impl;
    }

    public static SJE A00(String str, String str2, String str3, boolean z) {
        return new SJE(str, str2, str3, z ? 1 : 0, 1, z);
    }

    public static List A01(XH2 xh2, 1W6 r1) {
        C251983oI r0 = (C251983oI) xh2.A01;
        r0.mDatabase = r1;
        r0.internalInitInvalidationTracker(r1);
        return r0.mCallbacks;
    }

    public final void createAllTables(1W6 r2) {
        String str;
        switch (this.A00) {
            case 0:
                r2.AT6("CREATE TABLE IF NOT EXISTS `bff_ranked_user_model` (`igid` TEXT NOT NULL, `entity_type` TEXT NOT NULL, `score` REAL NOT NULL, `username` TEXT, `profile_picture_url` TEXT, PRIMARY KEY(`igid`))");
                C21053XCe.A0m(r2, "CREATE TABLE IF NOT EXISTS `call_recipients_ranked_user_model` (`igid` TEXT NOT NULL, `entity_type` TEXT NOT NULL, `score` REAL NOT NULL, `username` TEXT, `profile_picture_url` TEXT, PRIMARY KEY(`igid`))");
                str = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '9fa95391669f185532ef5e2f5dc372b1')";
                break;
            case 1:
                r2.AT6("CREATE TABLE IF NOT EXISTS `messages_table` (`thread_jid` INTEGER NOT NULL, `sender_jid` INTEGER NOT NULL, `item_id` TEXT NOT NULL, `payload` TEXT NOT NULL, `payload_blob` BLOB, `hidden` INTEGER NOT NULL, `shh` INTEGER NOT NULL, `offline_threading_id` TEXT NOT NULL, `message_expiration_ts_sec` INTEGER, `hidden_ts_sec` INTEGER, `message_deletion_ts_sec` INTEGER, PRIMARY KEY(`thread_jid`, `item_id`))");
                r2.AT6("CREATE INDEX IF NOT EXISTS `index_messages_table_item_id` ON `messages_table` (`item_id`)");
                r2.AT6("CREATE INDEX IF NOT EXISTS `index_messages_table_offline_threading_id` ON `messages_table` (`offline_threading_id`)");
                r2.AT6("CREATE INDEX IF NOT EXISTS `index_messages_table_message_expiration_ts_sec` ON `messages_table` (`message_expiration_ts_sec`)");
                r2.AT6("CREATE INDEX IF NOT EXISTS `index_messages_table_hidden_ts_sec` ON `messages_table` (`hidden_ts_sec`)");
                r2.AT6("CREATE TABLE IF NOT EXISTS `message_deletes_table` (`thread_jid` INTEGER NOT NULL, `sender_jid` INTEGER NOT NULL, `item_id` TEXT NOT NULL, `target_item_id` TEXT NOT NULL, `payload` TEXT NOT NULL, `payload_blob` BLOB, `offline_threading_id` TEXT NOT NULL, PRIMARY KEY(`thread_jid`, `item_id`))");
                r2.AT6("CREATE INDEX IF NOT EXISTS `index_message_deletes_table_thread_jid_target_item_id` ON `message_deletes_table` (`thread_jid`, `target_item_id`)");
                r2.AT6("CREATE INDEX IF NOT EXISTS `index_message_deletes_table_offline_threading_id` ON `message_deletes_table` (`offline_threading_id`)");
                C21056XCh.A0F(r2, "CREATE TABLE IF NOT EXISTS `message_updates_table` (`thread_jid` INTEGER NOT NULL, `sender_jid` INTEGER NOT NULL, `item_id` TEXT NOT NULL, `target_item_id` TEXT NOT NULL, `payload` TEXT NOT NULL, `payload_blob` BLOB, `offline_threading_id` TEXT NOT NULL, `hidden_ts_sec` INTEGER, PRIMARY KEY(`thread_jid`, `item_id`))");
                r2.AT6("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
                str = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '3c770570a042c4d5015e1ab84459d331')";
                break;
            case 2:
                r2.AT6("CREATE TABLE IF NOT EXISTS `security_alert` (`id` TEXT NOT NULL, `user_id` TEXT NOT NULL, `crypto_mailbox_type` INTEGER NOT NULL, `device_change_type` INTEGER NOT NULL, `device_id` INTEGER NOT NULL, `created_timestamp_ms` INTEGER, `first_read_timestamp_ms` INTEGER, `model` TEXT, `platform` TEXT, `location` TEXT, `activity_feed_read_timestamp_ms` INTEGER, `latitude` REAL, `longitude` REAL, `is_confirm` INTEGER NOT NULL DEFAULT 0, PRIMARY KEY(`id`))");
                r2.AT6("CREATE INDEX IF NOT EXISTS `index_security_alert_user_id` ON `security_alert` (`user_id`)");
                r2.AT6("CREATE INDEX IF NOT EXISTS `index_security_alert_device_id` ON `security_alert` (`device_id`)");
                r2.AT6("CREATE TABLE IF NOT EXISTS `participant_device_change` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `user_id` TEXT NOT NULL, `participantUserId` INTEGER NOT NULL, `device_name` TEXT, `device_change_type` INTEGER NOT NULL, `device_change_timestamp_ms` INTEGER NOT NULL, `should_display_device_change_admin_message` INTEGER NOT NULL, `is_interop_participant` INTEGER NOT NULL)");
                C21053XCe.A0m(r2, "CREATE INDEX IF NOT EXISTS `index_participant_device_change_id` ON `participant_device_change` (`id`)");
                str = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '8a33cd745df9f5bcd6b94548c17b2894')";
                break;
            case 3:
                r2.AT6("CREATE TABLE IF NOT EXISTS `suggestions` (`suggestion_id` TEXT NOT NULL, `title` TEXT NOT NULL, `subtitle` TEXT NOT NULL, `concept` TEXT NOT NULL, `start_time` INTEGER NOT NULL, `end_time` INTEGER NOT NULL, `suggestion_mode` TEXT NOT NULL, `trip` INTEGER, `location` TEXT, PRIMARY KEY(`suggestion_id`))");
                C21053XCe.A0m(r2, "CREATE TABLE IF NOT EXISTS `suggestion_medium` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `medium_id` TEXT NOT NULL, `suggestion_id` TEXT NOT NULL, FOREIGN KEY(`suggestion_id`) REFERENCES `suggestions`(`suggestion_id`) ON UPDATE NO ACTION ON DELETE CASCADE )");
                str = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1ff21b556f1ac0738d52f2ae83a7be4f')";
                break;
            case 4:
                C21053XCe.A0m(r2, "CREATE TABLE IF NOT EXISTS `drafts` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `is_uploading` INTEGER NOT NULL DEFAULT 0, `video_path` TEXT NOT NULL DEFAULT '', `video_orig_rotation` INTEGER NOT NULL DEFAULT 0, `video_orig_width` INTEGER NOT NULL DEFAULT 0, `video_orig_height` INTEGER NOT NULL DEFAULT 0, `duration` INTEGER NOT NULL DEFAULT 0, `title` TEXT NOT NULL DEFAULT '', `description` TEXT NOT NULL DEFAULT '', `series_id` TEXT, `is_unified_video` INTEGER NOT NULL DEFAULT 0, `filter_id` INTEGER NOT NULL DEFAULT 0, `filter_strength` INTEGER NOT NULL DEFAULT 100, `post_crop_aspect_ratio` REAL NOT NULL DEFAULT 0, `is_landscape_surface` INTEGER NOT NULL DEFAULT 0, `is_over_image_custom` INTEGER NOT NULL DEFAULT 0, `cover_image_file_path` TEXT DEFAULT '', `cover_image_width` INTEGER NOT NULL DEFAULT 0, `cover_image_height` INTEGER NOT NULL DEFAULT 0, `cover_image_video_time_mx` INTEGER NOT NULL DEFAULT 0, `is_cover_image_fram_video_edited` INTEGER NOT NULL DEFAULT 0, `is_preview_enabled` INTEGER NOT NULL DEFAULT 0, `preview_crop_coords` TEXT, `profile_crop_coords` TEXT, `is_internal` INTEGER NOT NULL DEFAULT 0, `group_destination_user_id` TEXT, `share_to_facebook` INTEGER NOT NULL DEFAULT 0, `are_captions_enabled` INTEGER NOT NULL DEFAULT 0, `are_comments_disabled` INTEGER NOT NULL DEFAULT 0, `is_funded_content_deal` INTEGER NOT NULL DEFAULT 0, `is_like_and_view_counts_disabled` INTEGER NOT NULL DEFAULT 0, `is_paid_partnership` INTEGER NOT NULL DEFAULT 0, `branded_content_info` TEXT, `partner_boost_enabled` INTEGER NOT NULL DEFAULT 0, `shopping_info` TEXT, `created_timestamp` INTEGER NOT NULL DEFAULT 0, `last_modified_timestamp` INTEGER NOT NULL DEFAULT 0)");
                str = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'fa0f0287d6550153fc6cd9d504c3a72d')";
                break;
            case 5:
                C21053XCe.A0m(r2, "CREATE TABLE IF NOT EXISTS `qs_realtime_signals` (`signal_id` TEXT NOT NULL, `signal_type` TEXT NOT NULL, `item_id` TEXT NOT NULL, `item_type` TEXT NOT NULL, `surface_type` TEXT NOT NULL, `container_module` TEXT NOT NULL, `inventory_source` TEXT NOT NULL, `signal_status` TEXT NOT NULL, `timestamp` INTEGER NOT NULL, `signal_data` BLOB NOT NULL, `meta_idad_id` TEXT, `meta_idcampaign_id` TEXT, `meta_idapp_id` TEXT, `meta_idpage_id` TEXT, `meta_idactor_id` TEXT, `meta_idmedia_id` TEXT, PRIMARY KEY(`signal_id`))");
                str = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6b331a521c9eacb44b168743dbfa0089')";
                break;
            default:
                C21053XCe.A0m(r2, "CREATE TABLE IF NOT EXISTS `suggested_users` (`user_id` TEXT NOT NULL, `impression_timestamps` TEXT NOT NULL, `last_timestamp` TEXT NOT NULL, PRIMARY KEY(`user_id`))");
                str = "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '89d395671163a6d305db059df658b0ce')";
                break;
        }
        r2.AT6(str);
    }

    public final void dropAllTables(1W6 r3) {
        switch (this.A00) {
            case 0:
                r3.AT6("DROP TABLE IF EXISTS `bff_ranked_user_model`");
                r3.AT6("DROP TABLE IF EXISTS `call_recipients_ranked_user_model`");
                List list = ((C251983oI) this.A01).mCallbacks;
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C21055XCg.A0b(r3, it);
                    }
                    return;
                }
                return;
            case 1:
                r3.AT6("DROP TABLE IF EXISTS `messages_table`");
                r3.AT6("DROP TABLE IF EXISTS `message_deletes_table`");
                r3.AT6("DROP TABLE IF EXISTS `message_updates_table`");
                List list2 = ((C251983oI) this.A01).mCallbacks;
                if (list2 != null) {
                    Iterator it2 = list2.iterator();
                    while (it2.hasNext()) {
                        C21055XCg.A0b(r3, it2);
                    }
                    return;
                }
                return;
            case 2:
                r3.AT6("DROP TABLE IF EXISTS `security_alert`");
                r3.AT6("DROP TABLE IF EXISTS `participant_device_change`");
                List list3 = ((C251983oI) this.A01).mCallbacks;
                if (list3 != null) {
                    Iterator it3 = list3.iterator();
                    while (it3.hasNext()) {
                        C21055XCg.A0b(r3, it3);
                    }
                    return;
                }
                return;
            case 3:
                r3.AT6("DROP TABLE IF EXISTS `suggestions`");
                r3.AT6("DROP TABLE IF EXISTS `suggestion_medium`");
                List list4 = ((C251983oI) this.A01).mCallbacks;
                if (list4 != null) {
                    Iterator it4 = list4.iterator();
                    while (it4.hasNext()) {
                        C21055XCg.A0b(r3, it4);
                    }
                    return;
                }
                return;
            case 4:
                r3.AT6("DROP TABLE IF EXISTS `drafts`");
                List list5 = ((C251983oI) this.A01).mCallbacks;
                if (list5 != null) {
                    Iterator it5 = list5.iterator();
                    while (it5.hasNext()) {
                        C21055XCg.A0b(r3, it5);
                    }
                    return;
                }
                return;
            case 5:
                r3.AT6("DROP TABLE IF EXISTS `qs_realtime_signals`");
                List list6 = ((C251983oI) this.A01).mCallbacks;
                if (list6 != null) {
                    Iterator it6 = list6.iterator();
                    while (it6.hasNext()) {
                        C21055XCg.A0b(r3, it6);
                    }
                    return;
                }
                return;
            default:
                r3.AT6("DROP TABLE IF EXISTS `suggested_users`");
                List list7 = ((C251983oI) this.A01).mCallbacks;
                if (list7 != null) {
                    Iterator it7 = list7.iterator();
                    while (it7.hasNext()) {
                        C21055XCg.A0b(r3, it7);
                    }
                    return;
                }
                return;
        }
    }

    public final void onCreate(1W6 r3) {
        int i = this.A00;
        List list = ((C251983oI) this.A01).mCallbacks;
        switch (i) {
            case 0:
                if (list != null) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        C21053XCe.A0n(r3, it);
                    }
                    return;
                }
                return;
            case 1:
                if (list != null) {
                    Iterator it2 = list.iterator();
                    while (it2.hasNext()) {
                        C21053XCe.A0n(r3, it2);
                    }
                    return;
                }
                return;
            case 2:
                if (list != null) {
                    Iterator it3 = list.iterator();
                    while (it3.hasNext()) {
                        C21053XCe.A0n(r3, it3);
                    }
                    return;
                }
                return;
            case 3:
                if (list != null) {
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        C21053XCe.A0n(r3, it4);
                    }
                    return;
                }
                return;
            case 4:
                if (list != null) {
                    Iterator it5 = list.iterator();
                    while (it5.hasNext()) {
                        C21053XCe.A0n(r3, it5);
                    }
                    return;
                }
                return;
            case 5:
                if (list != null) {
                    Iterator it6 = list.iterator();
                    while (it6.hasNext()) {
                        C21053XCe.A0n(r3, it6);
                    }
                    return;
                }
                return;
            default:
                if (list != null) {
                    Iterator it7 = list.iterator();
                    while (it7.hasNext()) {
                        C21053XCe.A0n(r3, it7);
                    }
                    return;
                }
                return;
        }
    }

    public final void onOpen(1W6 r3) {
        switch (this.A00) {
            case 0:
                List A012 = A01(this, r3);
                if (A012 != null) {
                    Iterator it = A012.iterator();
                    while (it.hasNext()) {
                        C21053XCe.A0o(r3, it);
                    }
                    return;
                }
                return;
            case 1:
                List A013 = A01(this, r3);
                if (A013 != null) {
                    Iterator it2 = A013.iterator();
                    while (it2.hasNext()) {
                        C21053XCe.A0o(r3, it2);
                    }
                    return;
                }
                return;
            case 2:
                List A014 = A01(this, r3);
                if (A014 != null) {
                    Iterator it3 = A014.iterator();
                    while (it3.hasNext()) {
                        C21053XCe.A0o(r3, it3);
                    }
                    return;
                }
                return;
            case 3:
                C251983oI r1 = (C251983oI) this.A01;
                r1.mDatabase = r3;
                r3.AT6("PRAGMA foreign_keys = ON");
                r1.internalInitInvalidationTracker(r3);
                List list = r1.mCallbacks;
                if (list != null) {
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        C21053XCe.A0o(r3, it4);
                    }
                    return;
                }
                return;
            case 4:
                List A015 = A01(this, r3);
                if (A015 != null) {
                    Iterator it5 = A015.iterator();
                    while (it5.hasNext()) {
                        C21053XCe.A0o(r3, it5);
                    }
                    return;
                }
                return;
            case 5:
                List A016 = A01(this, r3);
                if (A016 != null) {
                    Iterator it6 = A016.iterator();
                    while (it6.hasNext()) {
                        C21053XCe.A0o(r3, it6);
                    }
                    return;
                }
                return;
            default:
                List A017 = A01(this, r3);
                if (A017 != null) {
                    Iterator it7 = A017.iterator();
                    while (it7.hasNext()) {
                        C21053XCe.A0o(r3, it7);
                    }
                    return;
                }
                return;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x04fb, code lost:
        r1.append(r0);
        r1.append(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x004b, code lost:
        r1.append(r0);
        r1.append(r8);
        r25 = "\n Found:\n";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x005e, code lost:
        return new X.C21382XZp(r3, X.AnonymousClass7TG.A0m(r12, r25, r1));
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C21382XZp onValidateSchema(X.1W6 r27) {
        /*
            r26 = this;
            r0 = r26
            int r0 = r0.A00
            r2 = r27
            switch(r0) {
                case 0: goto L_0x005f;
                case 1: goto L_0x0104;
                case 2: goto L_0x031e;
                case 3: goto L_0x047e;
                case 4: goto L_0x0557;
                case 5: goto L_0x06d8;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = 3
            java.util.HashMap r7 = X.C21053XCe.A0h(r0)
            java.lang.String r0 = "user_id"
            java.lang.String r4 = "TEXT"
            r6 = 1
            r5 = 0
            X.C21055XCg.A1T(r0, r4, r7)
            r0 = 3340(0xd0c, float:4.68E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r3 = X.C21056XCh.A0U(r0, r4, r7)
            r0 = 3495(0xda7, float:4.898E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.SJE r0 = X.C21055XCg.A05(r1, r4, r5, r3)
            java.util.HashSet r4 = X.C21055XCg.A0X(r1, r0, r7, r3)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r3)
            java.lang.String r0 = "suggested_users"
            X.Xd6 r8 = new X.Xd6
            r8.<init>(r0, r7, r4, r1)
            X.Xd6 r12 = X.RS9.A00(r2, r0)
            boolean r0 = r8.equals(r12)
            if (r0 != 0) goto L_0x0792
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "suggested_users(com.instagram.suggestedusers.database.SuggestedUserEntity).\n Expected:\n"
        L_0x004b:
            r1.append(r0)
            r1.append(r8)
            java.lang.String r25 = "\n Found:\n"
        L_0x0053:
            r0 = r25
            java.lang.String r0 = X.AnonymousClass7TG.A0m(r12, r0, r1)
            X.XZp r1 = new X.XZp
            r1.<init>(r3, r0)
            return r1
        L_0x005f:
            r16 = 5
            java.util.HashMap r15 = X.C21053XCe.A0h(r16)
            java.lang.String r14 = "igid"
            java.lang.String r9 = "TEXT"
            r7 = 1
            r0 = 0
            X.C21055XCg.A1T(r14, r9, r15)
            java.lang.String r11 = "entity_type"
            r3 = 0
            r6 = 0
            X.SJE r0 = X.C21055XCg.A05(r11, r9, r0, r3)
            r15.put(r11, r0)
            java.lang.String r10 = "score"
            java.lang.String r8 = "REAL"
            X.SJE r0 = X.C21055XCg.A05(r10, r8, r6, r3)
            r15.put(r10, r0)
            r4 = 61
            r1 = 8
            r0 = 3
            java.lang.String r4 = X.MYM.A00(r4, r1, r0)
            X.SJE r0 = A00(r4, r9, r6, r3)
            r15.put(r4, r0)
            r0 = 40
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.SJE r0 = A00(r1, r9, r6, r3)
            java.util.HashSet r12 = X.C21055XCg.A0X(r1, r0, r15, r3)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r3)
            java.lang.String r0 = "bff_ranked_user_model"
            X.Xd6 r13 = new X.Xd6
            r13.<init>(r0, r15, r12, r5)
            X.Xd6 r12 = X.RS9.A00(r2, r0)
            boolean r0 = r13.equals(r12)
            java.lang.String r25 = "\n Found:\n"
            if (r0 != 0) goto L_0x00c2
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "bff_ranked_user_model(com.instagram.copresence.repository.persistence.RankedUserBFFDao.RankedUserBFF).\n Expected:\n"
            goto L_0x04fb
        L_0x00c2:
            java.util.HashMap r5 = X.C21053XCe.A0h(r16)
            X.C21055XCg.A1T(r14, r9, r5)
            X.SJE r0 = X.C21055XCg.A05(r11, r9, r6, r3)
            r5.put(r11, r0)
            X.SJE r0 = X.C21055XCg.A05(r10, r8, r6, r3)
            r5.put(r10, r0)
            X.SJE r0 = A00(r4, r9, r6, r3)
            r5.put(r4, r0)
            X.SJE r0 = A00(r1, r9, r6, r3)
            java.util.HashSet r4 = X.C21055XCg.A0X(r1, r0, r5, r3)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r3)
            java.lang.String r0 = "call_recipients_ranked_user_model"
            X.Xd6 r13 = new X.Xd6
            r13.<init>(r0, r5, r4, r1)
            X.Xd6 r12 = X.RS9.A00(r2, r0)
            boolean r0 = r13.equals(r12)
            if (r0 != 0) goto L_0x0798
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "call_recipients_ranked_user_model(com.instagram.copresence.repository.persistence.RankedUserCallRecipientsDao.RankedUserCallRecipients).\n Expected:\n"
            goto L_0x04fb
        L_0x0104:
            r0 = 11
            java.util.HashMap r4 = X.C21053XCe.A0h(r0)
            java.lang.String r24 = "thread_jid"
            java.lang.String r10 = "INTEGER"
            r7 = 0
            r0 = r24
            X.C21055XCg.A1T(r0, r10, r4)
            java.lang.String r11 = "sender_jid"
            r0 = 0
            X.SJE r0 = X.C21055XCg.A05(r11, r10, r7, r0)
            r4.put(r11, r0)
            java.lang.String r9 = "item_id"
            java.lang.String r8 = "TEXT"
            r23 = 1
            r22 = 2
            r0 = r22
            X.SJE r0 = X.C21055XCg.A05(r9, r8, r7, r0)
            r4.put(r9, r0)
            java.lang.String r6 = "payload"
            boolean r3 = X.C21056XCh.A0U(r6, r8, r4)
            r0 = 5112(0x13f8, float:7.163E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            java.lang.String r21 = "BLOB"
            r0 = r21
            X.SJE r0 = A00(r1, r0, r7, r3)
            r4.put(r1, r0)
            java.lang.String r5 = "hidden"
            X.SJE r0 = X.C21055XCg.A05(r5, r10, r7, r3)
            r4.put(r5, r0)
            java.lang.String r5 = "shh"
            X.SJE r0 = X.C21055XCg.A05(r5, r10, r7, r3)
            r4.put(r5, r0)
            r0 = 726(0x2d6, float:1.017E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r0)
            X.SJE r0 = X.C21055XCg.A05(r5, r8, r7, r3)
            r4.put(r5, r0)
            r0 = 5048(0x13b8, float:7.074E-42)
            java.lang.String r14 = X.AnonymousClass000.A00(r0)
            X.SJE r0 = A00(r14, r10, r7, r3)
            r4.put(r14, r0)
            r0 = 4844(0x12ec, float:6.788E-42)
            java.lang.String r20 = X.AnonymousClass000.A00(r0)
            r0 = r20
            X.SJE r12 = A00(r0, r10, r7, r3)
            r4.put(r0, r12)
            r0 = 5047(0x13b7, float:7.072E-42)
            java.lang.String r12 = X.AnonymousClass000.A00(r0)
            X.SJE r0 = A00(r12, r10, r7, r3)
            java.util.HashSet r16 = X.C21055XCg.A0X(r12, r0, r4, r3)
            r19 = 4
            java.util.HashSet r12 = new java.util.HashSet
            r0 = r19
            r12.<init>(r0)
            java.util.List r13 = X.C21053XCe.A0k(r9)
            java.lang.String r18 = "ASC"
            java.util.List r0 = X.C21053XCe.A0k(r18)
            java.lang.String r15 = "index_messages_table_item_id"
            X.C21055XCg.A1U(r15, r12, r13, r0, r3)
            java.util.List r13 = X.C21053XCe.A0k(r5)
            java.util.List r0 = X.C21053XCe.A0k(r18)
            java.lang.String r15 = "index_messages_table_offline_threading_id"
            X.C21055XCg.A1U(r15, r12, r13, r0, r3)
            java.util.List r14 = X.C21053XCe.A0k(r14)
            java.util.List r13 = X.C21053XCe.A0k(r18)
            java.lang.String r0 = "index_messages_table_message_expiration_ts_sec"
            X.C21055XCg.A1U(r0, r12, r14, r13, r3)
            java.util.List r14 = X.C21053XCe.A0k(r20)
            java.util.List r13 = X.C21053XCe.A0k(r18)
            java.lang.String r0 = "index_messages_table_hidden_ts_sec"
            X.C21055XCg.A1U(r0, r12, r14, r13, r3)
            java.lang.String r14 = "messages_table"
            X.Xd6 r13 = new X.Xd6
            r0 = r16
            r13.<init>(r14, r4, r0, r12)
            X.Xd6 r12 = X.RS9.A00(r2, r14)
            boolean r0 = r13.equals(r12)
            java.lang.String r25 = "\n Found:\n"
            if (r0 != 0) goto L_0x01eb
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "messages_table(com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.MessagesDao.Message).\n Expected:\n"
            goto L_0x04fb
        L_0x01eb:
            r0 = 7
            java.util.HashMap r12 = X.C21053XCe.A0h(r0)
            r0 = r24
            X.C21055XCg.A1T(r0, r10, r12)
            X.SJE r0 = X.C21055XCg.A05(r11, r10, r7, r3)
            r12.put(r11, r0)
            r0 = r22
            X.SJE r0 = X.C21055XCg.A05(r9, r8, r7, r0)
            r12.put(r9, r0)
            r0 = 4088(0xff8, float:5.729E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            X.SJE r0 = X.C21055XCg.A05(r4, r8, r7, r3)
            r12.put(r4, r0)
            X.SJE r0 = X.C21055XCg.A05(r6, r8, r7, r3)
            r12.put(r6, r0)
            r0 = r21
            X.SJE r0 = A00(r1, r0, r7, r3)
            r12.put(r1, r0)
            X.SJE r0 = X.C21055XCg.A05(r5, r8, r7, r3)
            java.util.HashSet r17 = X.C21055XCg.A0X(r5, r0, r12, r3)
            java.util.HashSet r16 = new java.util.HashSet
            r13 = r22
            r0 = r16
            r0.<init>(r13)
            r0 = r24
            java.lang.String[] r0 = new java.lang.String[]{r0, r4}
            java.util.List r14 = java.util.Arrays.asList(r0)
            r13 = r18
            java.lang.String[] r0 = new java.lang.String[]{r13, r13}
            java.util.List r0 = java.util.Arrays.asList(r0)
            java.lang.String r15 = "index_message_deletes_table_thread_jid_target_item_id"
            r13 = r0
            r0 = r16
            X.C21055XCg.A1U(r15, r0, r14, r13, r3)
            java.util.List r13 = X.C21053XCe.A0k(r5)
            java.util.List r0 = X.C21053XCe.A0k(r18)
            java.lang.String r15 = "index_message_deletes_table_offline_threading_id"
            r14 = r13
            r13 = r0
            r0 = r16
            X.C21055XCg.A1U(r15, r0, r14, r13, r3)
            java.lang.String r15 = "message_deletes_table"
            X.Xd6 r13 = new X.Xd6
            r14 = r17
            r13.<init>(r15, r12, r14, r0)
            X.Xd6 r12 = X.RS9.A00(r2, r15)
            boolean r0 = r13.equals(r12)
            if (r0 != 0) goto L_0x027b
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "message_deletes_table(com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.MessageDeletesDao.MessageDelete).\n Expected:\n"
            goto L_0x04fb
        L_0x027b:
            r0 = 8
            java.util.HashMap r12 = X.C21053XCe.A0h(r0)
            r0 = r24
            X.C21055XCg.A1T(r0, r10, r12)
            X.SJE r0 = X.C21055XCg.A05(r11, r10, r7, r3)
            r12.put(r11, r0)
            r0 = r22
            X.SJE r0 = X.C21055XCg.A05(r9, r8, r7, r0)
            r12.put(r9, r0)
            X.SJE r0 = X.C21055XCg.A05(r4, r8, r7, r3)
            r12.put(r4, r0)
            X.SJE r0 = X.C21055XCg.A05(r6, r8, r7, r3)
            r12.put(r6, r0)
            r0 = r21
            X.SJE r0 = A00(r1, r0, r7, r3)
            r12.put(r1, r0)
            X.SJE r0 = X.C21055XCg.A05(r5, r8, r7, r3)
            r12.put(r5, r0)
            r0 = r20
            X.SJE r1 = A00(r0, r10, r7, r3)
            java.util.HashSet r8 = X.C21055XCg.A0X(r0, r1, r12, r3)
            java.util.HashSet r6 = new java.util.HashSet
            r0 = r19
            r6.<init>(r0)
            r0 = r24
            java.lang.String[] r0 = new java.lang.String[]{r0, r4}
            java.util.List r9 = java.util.Arrays.asList(r0)
            r1 = r18
            java.lang.String[] r0 = new java.lang.String[]{r1, r1}
            java.util.List r1 = java.util.Arrays.asList(r0)
            java.lang.String r0 = "index_message_updates_table_thread_jid_target_item_id"
            X.C21055XCg.A1U(r0, r6, r9, r1, r3)
            java.util.List r4 = X.C21053XCe.A0k(r4)
            java.util.List r1 = X.C21053XCe.A0k(r18)
            java.lang.String r0 = "index_message_updates_table_target_item_id"
            X.C21055XCg.A1U(r0, r6, r4, r1, r3)
            java.util.List r4 = X.C21053XCe.A0k(r5)
            java.util.List r1 = X.C21053XCe.A0k(r18)
            java.lang.String r0 = "index_message_updates_table_offline_threading_id"
            X.C21055XCg.A1U(r0, r6, r4, r1, r3)
            java.util.List r4 = X.C21053XCe.A0k(r20)
            java.util.List r1 = X.C21053XCe.A0k(r18)
            java.lang.String r0 = "index_message_updates_table_hidden_ts_sec"
            X.C21055XCg.A1U(r0, r6, r4, r1, r3)
            java.lang.String r0 = "message_updates_table"
            X.Xd6 r13 = new X.Xd6
            r13.<init>(r0, r12, r8, r6)
            X.Xd6 r12 = X.RS9.A00(r2, r0)
            boolean r0 = r13.equals(r12)
            if (r0 != 0) goto L_0x079e
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "message_updates_table(com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.MessageUpdatesDao.MessageUpdate).\n Expected:\n"
            goto L_0x04fb
        L_0x031e:
            r0 = 14
            java.util.HashMap r14 = X.C21053XCe.A0h(r0)
            java.lang.String r4 = "id"
            java.lang.String r10 = "TEXT"
            r8 = 1
            r11 = 0
            X.C21055XCg.A1T(r4, r10, r14)
            java.lang.String r1 = "user_id"
            r0 = 0
            X.SJE r0 = X.C21055XCg.A05(r1, r10, r11, r0)
            r14.put(r1, r0)
            r0 = 4676(0x1244, float:6.552E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r5 = "INTEGER"
            boolean r3 = X.C21056XCh.A0U(r0, r5, r14)
            r0 = 753(0x2f1, float:1.055E-42)
            java.lang.String r6 = X.C66579MXk.A00(r0)
            r7 = 0
            X.SJE r0 = X.C21055XCg.A05(r6, r5, r11, r3)
            r14.put(r6, r0)
            java.lang.String r15 = X.C66955Mfo.A01()
            X.SJE r0 = X.C21055XCg.A05(r15, r5, r11, r3)
            r14.put(r15, r0)
            r0 = 4666(0x123a, float:6.538E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            X.SJE r0 = A00(r9, r5, r11, r3)
            r14.put(r9, r0)
            r0 = 4786(0x12b2, float:6.707E-42)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            X.SJE r0 = A00(r9, r5, r11, r3)
            r14.put(r9, r0)
            java.lang.String r9 = "model"
            X.SJE r0 = A00(r9, r10, r11, r3)
            r14.put(r9, r0)
            java.lang.String r9 = "platform"
            X.SJE r0 = A00(r9, r10, r11, r3)
            r14.put(r9, r0)
            java.lang.String r9 = "location"
            X.SJE r0 = A00(r9, r10, r11, r3)
            r14.put(r9, r0)
            r0 = 240(0xf0, float:3.36E-43)
            java.lang.String r9 = X.AnonymousClass000.A00(r0)
            X.SJE r0 = A00(r9, r5, r11, r3)
            r14.put(r9, r0)
            java.lang.String r9 = "latitude"
            java.lang.String r11 = "REAL"
            X.SJE r0 = A00(r9, r11, r7, r3)
            r14.put(r9, r0)
            java.lang.String r9 = "longitude"
            X.SJE r0 = A00(r9, r11, r7, r3)
            r14.put(r9, r0)
            java.lang.String r9 = "is_confirm"
            java.lang.String r0 = "0"
            X.SJE r0 = X.C21055XCg.A05(r9, r5, r0, r3)
            java.util.HashSet r12 = X.C21055XCg.A0X(r9, r0, r14, r3)
            r0 = 2
            java.util.HashSet r11 = new java.util.HashSet
            r11.<init>(r0)
            java.util.List r13 = X.C21053XCe.A0k(r1)
            java.lang.String r16 = "ASC"
            java.util.List r9 = X.C21053XCe.A0k(r16)
            java.lang.String r0 = "index_security_alert_user_id"
            X.C21055XCg.A1U(r0, r11, r13, r9, r3)
            java.util.List r13 = X.C21053XCe.A0k(r15)
            java.util.List r9 = X.C21053XCe.A0k(r16)
            java.lang.String r0 = "index_security_alert_device_id"
            X.C21055XCg.A1U(r0, r11, r13, r9, r3)
            java.lang.String r0 = "security_alert"
            X.Xd6 r13 = new X.Xd6
            r13.<init>(r0, r14, r12, r11)
            X.Xd6 r12 = X.RS9.A00(r2, r0)
            boolean r0 = r13.equals(r12)
            java.lang.String r25 = "\n Found:\n"
            if (r0 != 0) goto L_0x03fb
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "security_alert(com.instagram.direct.securityalert.data.room.SecurityAlertEntity).\n Expected:\n"
            goto L_0x04fb
        L_0x03fb:
            r0 = 8
            java.util.HashMap r9 = X.C21053XCe.A0h(r0)
            X.C21055XCg.A1T(r4, r5, r9)
            X.SJE r0 = X.C21055XCg.A05(r1, r10, r7, r3)
            r9.put(r1, r0)
            r0 = 1031(0x407, float:1.445E-42)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            X.SJE r0 = X.C21055XCg.A05(r1, r5, r7, r3)
            r9.put(r1, r0)
            r0 = 1273(0x4f9, float:1.784E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.SJE r0 = A00(r1, r10, r7, r3)
            r9.put(r1, r0)
            X.SJE r0 = X.C21055XCg.A05(r6, r5, r7, r3)
            r9.put(r6, r0)
            r0 = 752(0x2f0, float:1.054E-42)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            X.SJE r0 = X.C21055XCg.A05(r1, r5, r7, r3)
            r9.put(r1, r0)
            r0 = 1135(0x46f, float:1.59E-42)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            X.SJE r0 = X.C21055XCg.A05(r1, r5, r7, r3)
            r9.put(r1, r0)
            r0 = 929(0x3a1, float:1.302E-42)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            X.SJE r0 = X.C21055XCg.A05(r1, r5, r7, r3)
            java.util.HashSet r6 = X.C21055XCg.A0X(r1, r0, r9, r3)
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>(r8)
            java.util.List r4 = X.C21053XCe.A0k(r4)
            java.util.List r1 = X.C21053XCe.A0k(r16)
            java.lang.String r0 = "index_participant_device_change_id"
            X.C21055XCg.A1U(r0, r5, r4, r1, r3)
            java.lang.String r0 = "participant_device_change"
            X.Xd6 r13 = new X.Xd6
            r13.<init>(r0, r9, r6, r5)
            X.Xd6 r12 = X.RS9.A00(r2, r0)
            boolean r0 = r13.equals(r12)
            if (r0 != 0) goto L_0x07a6
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "participant_device_change(com.instagram.direct.securityalert.data.room.ParticipantDeviceChangeEntity).\n Expected:\n"
            goto L_0x04fb
        L_0x047e:
            r0 = 9
            java.util.HashMap r7 = X.C21053XCe.A0h(r0)
            r0 = 5302(0x14b6, float:7.43E-42)
            java.lang.String r8 = X.AnonymousClass000.A00(r0)
            java.lang.String r6 = "TEXT"
            r5 = 0
            X.C21055XCg.A1T(r8, r6, r7)
            java.lang.String r0 = "title"
            boolean r3 = X.C21056XCh.A0U(r0, r6, r7)
            java.lang.String r1 = "subtitle"
            r4 = 1
            X.SJE r0 = X.C21055XCg.A05(r1, r6, r5, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "concept"
            X.SJE r0 = X.C21055XCg.A05(r1, r6, r5, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "start_time"
            java.lang.String r9 = "INTEGER"
            X.SJE r0 = X.C21055XCg.A05(r1, r9, r5, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "end_time"
            X.SJE r0 = X.C21055XCg.A05(r1, r9, r5, r3)
            r7.put(r1, r0)
            r0 = 4073(0xfe9, float:5.707E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.SJE r0 = X.C21055XCg.A05(r1, r6, r5, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "trip"
            X.SJE r0 = A00(r1, r9, r5, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "location"
            X.SJE r0 = A00(r1, r6, r5, r3)
            java.util.HashSet r1 = X.C21055XCg.A0X(r1, r0, r7, r3)
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>(r3)
            java.lang.String r10 = "suggestions"
            X.Xd6 r13 = new X.Xd6
            r13.<init>(r10, r7, r1, r0)
            X.Xd6 r12 = X.RS9.A00(r2, r10)
            boolean r0 = r13.equals(r12)
            java.lang.String r25 = "\n Found:\n"
            if (r0 != 0) goto L_0x0503
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "suggestions(com.instagram.gallery.suggestions.database.SuggestionEntity).\n Expected:\n"
        L_0x04fb:
            r1.append(r0)
            r1.append(r13)
            goto L_0x0053
        L_0x0503:
            r0 = 3
            java.util.HashMap r7 = X.C21053XCe.A0h(r0)
            java.lang.String r0 = "id"
            X.C21055XCg.A1T(r0, r9, r7)
            java.lang.String r1 = "medium_id"
            X.SJE r0 = X.C21055XCg.A05(r1, r6, r5, r3)
            r7.put(r1, r0)
            X.SJE r0 = X.C21055XCg.A05(r8, r6, r5, r3)
            java.util.HashSet r6 = X.C21055XCg.A0X(r8, r0, r7, r4)
            java.util.List r13 = X.C21053XCe.A0k(r8)
            java.util.List r14 = X.C21053XCe.A0k(r8)
            r0 = 879(0x36f, float:1.232E-42)
            java.lang.String r11 = X.AnonymousClass000.A00(r0)
            r0 = 2374(0x946, float:3.327E-42)
            java.lang.String r12 = X.AnonymousClass000.A00(r0)
            X.A9q r9 = new X.A9q
            r9.<init>(r10, r11, r12, r13, r14)
            r6.add(r9)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r3)
            java.lang.String r0 = "suggestion_medium"
            X.Xd6 r13 = new X.Xd6
            r13.<init>(r0, r7, r6, r1)
            X.Xd6 r12 = X.RS9.A00(r2, r0)
            boolean r0 = r13.equals(r12)
            if (r0 != 0) goto L_0x07ac
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "suggestion_medium(com.instagram.gallery.suggestions.database.SuggestionMediumEntity).\n Expected:\n"
            goto L_0x04fb
        L_0x0557:
            r0 = 37
            java.util.HashMap r7 = X.C21053XCe.A0h(r0)
            java.lang.String r0 = "id"
            java.lang.String r8 = "INTEGER"
            r6 = 1
            X.C21055XCg.A1T(r0, r8, r7)
            java.lang.String r1 = "is_uploading"
            r3 = 0
            java.lang.String r4 = "0"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "video_path"
            java.lang.String r9 = "TEXT"
            java.lang.String r10 = "''"
            X.SJE r0 = X.C21055XCg.A05(r1, r9, r10, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "video_orig_rotation"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "video_orig_width"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "video_orig_height"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "duration"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "title"
            X.SJE r0 = X.C21055XCg.A05(r1, r9, r10, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "description"
            X.SJE r0 = X.C21055XCg.A05(r1, r9, r10, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "series_id"
            r5 = 0
            X.SJE r0 = A00(r1, r9, r5, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "is_unified_video"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "filter_id"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "filter_strength"
            java.lang.String r0 = "100"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r0, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "post_crop_aspect_ratio"
            java.lang.String r0 = "REAL"
            X.SJE r0 = X.C21055XCg.A05(r1, r0, r4, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "is_landscape_surface"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "is_over_image_custom"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "cover_image_file_path"
            X.SJE r0 = A00(r1, r9, r10, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "cover_image_width"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "cover_image_height"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "cover_image_video_time_mx"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "is_cover_image_fram_video_edited"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "is_preview_enabled"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "preview_crop_coords"
            X.SJE r0 = A00(r1, r9, r5, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "profile_crop_coords"
            X.SJE r0 = A00(r1, r9, r5, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "is_internal"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "group_destination_user_id"
            X.SJE r0 = A00(r1, r9, r5, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "share_to_facebook"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "are_captions_enabled"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "are_comments_disabled"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "is_funded_content_deal"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "is_like_and_view_counts_disabled"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            r7.put(r1, r0)
            r0 = 314(0x13a, float:4.4E-43)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "branded_content_info"
            X.SJE r0 = A00(r1, r9, r5, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "partner_boost_enabled"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "shopping_info"
            X.SJE r0 = A00(r1, r9, r5, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "created_timestamp"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "last_modified_timestamp"
            X.SJE r0 = X.C21055XCg.A05(r1, r8, r4, r3)
            java.util.HashSet r4 = X.C21055XCg.A0X(r1, r0, r7, r3)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r3)
            java.lang.String r0 = "drafts"
            X.Xd6 r8 = new X.Xd6
            r8.<init>(r0, r7, r4, r1)
            X.Xd6 r12 = X.RS9.A00(r2, r0)
            boolean r0 = r8.equals(r12)
            if (r0 != 0) goto L_0x07b2
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "drafts(com.instagram.igtv.persistence.draft.IGTVDraftEntity).\n Expected:\n"
            goto L_0x004b
        L_0x06d8:
            r0 = 16
            java.util.HashMap r7 = X.C21053XCe.A0h(r0)
            java.lang.String r0 = "signal_id"
            java.lang.String r4 = "TEXT"
            r6 = 1
            r5 = 0
            X.C21055XCg.A1T(r0, r4, r7)
            java.lang.String r0 = "signal_type"
            boolean r3 = X.C21056XCh.A0U(r0, r4, r7)
            java.lang.String r1 = "item_id"
            X.SJE r0 = X.C21055XCg.A05(r1, r4, r5, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "item_type"
            X.SJE r0 = X.C21055XCg.A05(r1, r4, r5, r3)
            r7.put(r1, r0)
            r0 = 172(0xac, float:2.41E-43)
            java.lang.String r1 = X.C66579MXk.A00(r0)
            X.SJE r0 = X.C21055XCg.A05(r1, r4, r5, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "container_module"
            X.SJE r0 = X.C21055XCg.A05(r1, r4, r5, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "inventory_source"
            X.SJE r0 = X.C21055XCg.A05(r1, r4, r5, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "signal_status"
            X.SJE r0 = X.C21055XCg.A05(r1, r4, r5, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "timestamp"
            java.lang.String r0 = "INTEGER"
            X.SJE r0 = X.C21055XCg.A05(r1, r0, r5, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "signal_data"
            java.lang.String r0 = "BLOB"
            X.SJE r0 = X.C21055XCg.A05(r1, r0, r5, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "meta_idad_id"
            X.SJE r0 = A00(r1, r4, r5, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "meta_idcampaign_id"
            X.SJE r0 = A00(r1, r4, r5, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "meta_idapp_id"
            X.SJE r0 = A00(r1, r4, r5, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "meta_idpage_id"
            X.SJE r0 = A00(r1, r4, r5, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "meta_idactor_id"
            X.SJE r0 = A00(r1, r4, r5, r3)
            r7.put(r1, r0)
            java.lang.String r1 = "meta_idmedia_id"
            X.SJE r0 = A00(r1, r4, r5, r3)
            java.util.HashSet r4 = X.C21055XCg.A0X(r1, r0, r7, r3)
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>(r3)
            java.lang.String r0 = "qs_realtime_signals"
            X.Xd6 r8 = new X.Xd6
            r8.<init>(r0, r7, r4, r1)
            X.Xd6 r12 = X.RS9.A00(r2, r0)
            boolean r0 = r8.equals(r12)
            if (r0 != 0) goto L_0x07b8
            java.lang.StringBuilder r1 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "qs_realtime_signals(com.instagram.sponsored.asyncads.requestpathsignals.persistence.room.QSRealtimeSignalEntity).\n Expected:\n"
            goto L_0x004b
        L_0x0792:
            X.XZp r1 = new X.XZp
            r1.<init>(r6, r5)
            return r1
        L_0x0798:
            X.XZp r1 = new X.XZp
            r1.<init>(r7, r6)
            return r1
        L_0x079e:
            X.XZp r1 = new X.XZp
            r0 = r23
            r1.<init>(r0, r7)
            return r1
        L_0x07a6:
            X.XZp r1 = new X.XZp
            r1.<init>(r8, r7)
            return r1
        L_0x07ac:
            X.XZp r1 = new X.XZp
            r1.<init>(r4, r5)
            return r1
        L_0x07b2:
            X.XZp r1 = new X.XZp
            r1.<init>(r6, r5)
            return r1
        L_0x07b8:
            X.XZp r1 = new X.XZp
            r1.<init>(r6, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XH2.onValidateSchema(X.1W6):X.XZp");
    }

    public final void onPostMigrate(1W6 r1) {
    }

    public final void onPreMigrate(1W6 r1) {
        1wT.A01(r1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XH2(Object obj, int i, int i2) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XH2(Object obj, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XH2(SuggestionsDatabase_Impl suggestionsDatabase_Impl) {
        super(3);
        this.A00 = 3;
        this.A01 = suggestionsDatabase_Impl;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XH2(IGTVDatabase_Impl iGTVDatabase_Impl) {
        super(15);
        this.A00 = 4;
        this.A01 = iGTVDatabase_Impl;
    }
}
