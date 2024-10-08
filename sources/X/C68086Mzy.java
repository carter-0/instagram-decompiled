package X;

import com.instagram.direct.armadilloexpress.encryptedbackup.fakereverb.MessageDeletesDao;
import com.instagram.react.modules.base.IgReactQEModule;

/* renamed from: X.Mzy  reason: case insensitive filesystem */
public final class C68086Mzy extends AnonymousClass1VF {
    public final int A00;

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        r0 = 15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0031, code lost:
        r0 = 12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0009, code lost:
        super(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0018, code lost:
        r0 = 14;
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C68086Mzy(int r3) {
        /*
            r2 = this;
            r2.A00 = r3
            switch(r3) {
                case 0: goto L_0x000d;
                case 1: goto L_0x0010;
                case 2: goto L_0x0013;
                case 3: goto L_0x0016;
                case 4: goto L_0x001b;
                case 5: goto L_0x0020;
                case 6: goto L_0x0025;
                case 7: goto L_0x002a;
                case 8: goto L_0x002f;
                case 9: goto L_0x0034;
                case 10: goto L_0x0013;
                case 11: goto L_0x0039;
                default: goto L_0x0005;
            }
        L_0x0005:
            r1 = 9
            r0 = 10
        L_0x0009:
            r2.<init>(r1, r0)
            return
        L_0x000d:
            r1 = 13
            goto L_0x0031
        L_0x0010:
            r1 = 13
            goto L_0x0018
        L_0x0013:
            r1 = 14
            goto L_0x0022
        L_0x0016:
            r1 = 15
        L_0x0018:
            r0 = 14
            goto L_0x0009
        L_0x001b:
            r1 = 15
            r0 = 16
            goto L_0x0009
        L_0x0020:
            r1 = 16
        L_0x0022:
            r0 = 15
            goto L_0x0009
        L_0x0025:
            r1 = 16
            r0 = 17
            goto L_0x0009
        L_0x002a:
            r1 = 10
            r0 = 11
            goto L_0x0009
        L_0x002f:
            r1 = 11
        L_0x0031:
            r0 = 12
            goto L_0x0009
        L_0x0034:
            r1 = 12
            r0 = 13
            goto L_0x0009
        L_0x0039:
            r1 = 7
            r0 = 8
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68086Mzy.<init>(int):void");
    }

    public final void migrate(1W6 r4) {
        String str;
        switch (this.A00) {
            case 0:
                0qQ.A0B(r4, 0);
                r4.AT6("ALTER TABLE messages_table ADD COLUMN thread_id TEXT NOT NULL DEFAULT ``");
                r4.AT6("ALTER TABLE message_updates_table ADD COLUMN thread_id TEXT NOT NULL DEFAULT ``");
                r4.AT6("ALTER TABLE message_deletes_table ADD COLUMN thread_id TEXT NOT NULL DEFAULT ``");
                r4.AT6("CREATE INDEX IF NOT EXISTS `index_messages_table_thread_id` \n  ON `messages_table` (`thread_id`)");
                r4.AT6("CREATE INDEX IF NOT EXISTS `index_messages_table_thread_id_item_id` \n  ON `messages_table` (`thread_id`, `item_id`)");
                r4.AT6("CREATE INDEX IF NOT EXISTS `index_message_updates_table_thread_id_item_id` \n  ON `message_updates_table` (`thread_id`, `item_id`)");
                r4.AT6("CREATE INDEX IF NOT EXISTS `index_message_updates_table_thread_id_target_item_id` \n  ON `message_updates_table` (`thread_id`, `target_item_id`)");
                r4.AT6("CREATE INDEX IF NOT EXISTS `index_message_deletes_table_thread_id_item_id` \n  ON `message_deletes_table` (`thread_id`, `item_id`)");
                str = "CREATE INDEX IF NOT EXISTS `index_message_deletes_table_thread_id_target_item_id` \n  ON `message_deletes_table` (`thread_id`, `target_item_id`)";
                break;
            case 1:
                0qQ.A0B(r4, 0);
                String format = String.format("ALTER TABLE %s ADD COLUMN `payload_blob` BLOB", C66581MXm.A1b(O4C.MESSAGES_TABLE_NAME, 1));
                0qQ.A07(format);
                r4.AT6(format);
                r4.AT6(JTR.A14("ALTER TABLE %s ADD COLUMN `payload_blob` BLOB", new Object[]{O4B.MESSAGE_UPDATES_TABLE}, 1));
                str = JTR.A14("ALTER TABLE %s ADD COLUMN `payload_blob` BLOB", new Object[]{MessageDeletesDao.MESSAGE_DELETES_TABLE}, 1);
                break;
            case 2:
                0qQ.A0B(r4, 0);
                r4.AT6("DELETE FROM `messages_table`\nWHERE shh == 3 OR payload LIKE '%\"is_dual_send\":true%' ");
                str = "UPDATE `messages_table` SET shh = 1 \nWHERE shh = 0 AND payload LIKE '%\"product_type\":\"SHH_MODE\"%'  ";
                break;
            case 4:
                0qQ.A0B(r4, 0);
                r4.AT6("DELETE FROM `messages_table` WHERE payload_blob IS NULL");
                r4.AT6("DELETE FROM `message_updates_table` WHERE payload_blob IS NULL");
                str = "DELETE FROM `message_deletes_table` WHERE payload_blob IS NULL";
                break;
            case 6:
                0qQ.A0B(r4, 0);
                str = "ALTER TABLE `messages_table` ADD COLUMN `message_deletion_ts_sec` INTEGER DEFAULT NULL";
                break;
            case 7:
                0qQ.A0B(r4, 0);
                str = "ALTER TABLE drafts ADD COLUMN partner_boost_enabled INTEGER NOT NULL DEFAULT 0";
                break;
            case 8:
                0qQ.A0B(r4, 0);
                str = "ALTER TABLE drafts ADD COLUMN is_unified_video INTEGER NOT NULL DEFAULT 0";
                break;
            case 9:
                0qQ.A0B(r4, 0);
                r4.AT6("ALTER TABLE drafts ADD COLUMN filter_id INTEGER NOT NULL DEFAULT 0");
                str = "ALTER TABLE drafts ADD COLUMN filter_strength INTEGER NOT NULL DEFAULT 100";
                break;
            case 10:
                0qQ.A0B(r4, 0);
                str = "ALTER TABLE drafts ADD COLUMN group_destination_user_id TEXT";
                break;
            case 11:
                0qQ.A0B(r4, 0);
                r4.AT6("ALTER TABLE drafts ADD COLUMN shopping_info TEXT");
                str = "DROP TABLE IF EXISTS shopping";
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                0qQ.A0B(r4, 0);
                r4.AT6("CREATE TABLE drafts_temp(`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `is_uploading` INTEGER NOT NULL DEFAULT 0, `video_path` TEXT NOT NULL DEFAULT '', `video_orig_rotation` INTEGER NOT NULL DEFAULT 0, `video_orig_width` INTEGER NOT NULL DEFAULT 0, `video_orig_height` INTEGER NOT NULL DEFAULT 0, `duration` INTEGER NOT NULL DEFAULT 0, `title` TEXT NOT NULL DEFAULT '', `description` TEXT NOT NULL DEFAULT '', `series_id` TEXT, `post_crop_aspect_ratio` REAL NOT NULL DEFAULT 0, `is_landscape_surface` INTEGER NOT NULL DEFAULT 0, `is_over_image_custom` INTEGER NOT NULL DEFAULT 0, `cover_image_file_path` TEXT DEFAULT '', `cover_image_width` INTEGER NOT NULL DEFAULT 0, `cover_image_height` INTEGER NOT NULL DEFAULT 0, `cover_image_video_time_mx` INTEGER NOT NULL DEFAULT 0, `is_cover_image_fram_video_edited` INTEGER NOT NULL DEFAULT 0, `is_preview_enabled` INTEGER NOT NULL DEFAULT 0, `preview_crop_coords` TEXT, `profile_crop_coords` TEXT, `is_internal` INTEGER NOT NULL DEFAULT 0, `share_to_facebook` INTEGER NOT NULL DEFAULT 0, `are_captions_enabled` INTEGER NOT NULL DEFAULT 0, `are_comments_disabled` INTEGER NOT NULL DEFAULT 0, `is_funded_content_deal` INTEGER NOT NULL DEFAULT 0, `shopping_info` TEXT, `created_timestamp` INTEGER NOT NULL DEFAULT 0, `last_modified_timestamp` INTEGER NOT NULL DEFAULT 0)");
                r4.AT6("INSERT INTO drafts_temp SELECT id, is_uploading, video_path, video_orig_rotation, video_orig_width, video_orig_height, duration, title, description, series_id, post_crop_aspect_ratio, is_landscape_surface, is_over_image_custom, cover_image_file_path, cover_image_width, cover_image_height, cover_image_video_time_mx, is_cover_image_fram_video_edited, is_preview_enabled, preview_crop_coords, profile_crop_coords, is_internal, share_to_facebook, are_captions_enabled, are_comments_disabled, is_funded_content_deal, shopping_info, created_timestamp, last_modified_timestamp FROM drafts");
                r4.AT6("DROP TABLE drafts");
                r4.AT6("ALTER TABLE drafts_temp RENAME TO drafts");
                r4.AT6("ALTER TABLE drafts ADD COLUMN branded_content_info TEXT");
                str = "ALTER TABLE drafts ADD COLUMN is_paid_partnership INTEGER NOT NULL DEFAULT 0";
                break;
            default:
                return;
        }
        r4.AT6(str);
    }
}
