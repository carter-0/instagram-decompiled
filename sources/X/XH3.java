package X;

public final class XH3 extends AnonymousClass1VF {
    public final int A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public XH3(int r3) {
        /*
            r2 = this;
            r2.A00 = r3
            switch(r3) {
                case 0: goto L_0x000d;
                case 1: goto L_0x0010;
                case 2: goto L_0x0015;
                case 3: goto L_0x001a;
                default: goto L_0x0005;
            }
        L_0x0005:
            r1 = 8
            r0 = 9
        L_0x0009:
            r2.<init>(r1, r0)
            return
        L_0x000d:
            r1 = 12
            goto L_0x0012
        L_0x0010:
            r1 = 14
        L_0x0012:
            r0 = 13
            goto L_0x0009
        L_0x0015:
            r1 = 17
            r0 = 16
            goto L_0x0009
        L_0x001a:
            r1 = 13
            r0 = 14
            goto L_0x0009
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XH3.<init>(int):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00b6, code lost:
        X.0wb.A03(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b9, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0019, code lost:
        r3.AT6(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006e, code lost:
        r3.AT6(r0);
        r3.AT6("INSERT INTO `temp_message_deletes`\n(`thread_jid`, `sender_jid`, `item_id`, `target_item_id`, \n`payload`, `offline_threading_id`)\nSELECT `thread_jid`, `sender_jid`, `item_id`, `target_item_id`, \n`payload`, `offline_threading_id`\n FROM message_deletes_table");
        r3.AT6("DROP TABLE message_deletes_table");
        r3.AT6("ALTER TABLE `temp_message_deletes` RENAME TO message_deletes_table");
        r3.AT6("CREATE INDEX IF NOT EXISTS `index_message_deletes_table_thread_jid_target_item_id` ON `message_deletes_table` (`thread_jid`, `target_item_id`)");
        r0 = "CREATE INDEX IF NOT EXISTS `index_message_deletes_table_offline_threading_id` ON `message_deletes_table` (`offline_threading_id`)";
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void migrate(X.1W6 r3) {
        /*
            r2 = this;
            int r1 = r2.A00
            r0 = 0
            switch(r1) {
                case 0: goto L_0x001d;
                case 1: goto L_0x0046;
                case 2: goto L_0x0088;
                case 3: goto L_0x0098;
                default: goto L_0x0006;
            }
        L_0x0006:
            X.0qQ.A0B(r3, r0)
            java.lang.String r0 = "SELECT * FROM drafts"
            android.database.Cursor r1 = r3.E5k(r0)
            java.lang.String r0 = "are_comments_disabled"
            int r0 = r1.getColumnIndex(r0)
            if (r0 >= 0) goto L_0x00b2
            java.lang.String r0 = "ALTER TABLE drafts ADD COLUMN are_comments_disabled INTEGER NOT NULL DEFAULT 0"
        L_0x0019:
            r3.AT6(r0)
            return
        L_0x001d:
            X.0qQ.A0B(r3, r0)
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS `temp_messages_table` \n(`thread_jid` INTEGER NOT NULL, \n`sender_jid` INTEGER NOT NULL, \n`item_id` TEXT NOT NULL, \n`payload` TEXT NOT NULL, \n`hidden` INTEGER NOT NULL, \n`shh` INTEGER NOT NULL, \n`offline_threading_id` TEXT NOT NULL, \n`message_expiration_ts_sec` INTEGER, \n`hidden_ts_sec` INTEGER, \nPRIMARY KEY(`thread_jid`, `item_id`))"
            r3.AT6(r0)
            java.lang.String r0 = "          INSERT INTO `temp_messages_table`\n          (`thread_jid`, `sender_jid`, `item_id`, `payload`, `hidden`, `shh`, \n          `offline_threading_id`, `message_expiration_ts_sec`, `hidden_ts_sec`)\n          SELECT `thread_jid`, `sender_jid`, `item_id`, `payload`, `hidden`, `shh`, \n          `offline_threading_id`, `message_expiration_ts_sec`, `hidden_ts_sec`\n          FROM messages_table"
            A00(r3, r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS `index_messages_table_hidden_ts_sec` ON `messages_table` (`hidden_ts_sec`)"
            r3.AT6(r0)
            java.lang.String r0 = "          CREATE TABLE IF NOT EXISTS `temp_message_updates` \n          (`thread_jid` INTEGER NOT NULL, \n          `sender_jid` INTEGER NOT NULL, \n          `item_id` TEXT NOT NULL, \n          `target_item_id` TEXT NOT NULL, \n          `payload` TEXT NOT NULL, \n          `offline_threading_id` TEXT NOT NULL, \n          `hidden_ts_sec` INTEGER, \n          PRIMARY KEY(`thread_jid`, `item_id`))"
            r3.AT6(r0)
            java.lang.String r0 = "INSERT INTO `temp_message_updates`\n(`thread_jid`, `sender_jid`, `item_id`, `target_item_id`, \n`payload`, `offline_threading_id`, `hidden_ts_sec`)\nSELECT `thread_jid`, `sender_jid`, `item_id`, `target_item_id`, \n`payload`, `offline_threading_id`, `hidden_ts_sec`\nFROM message_updates_table"
            r3.AT6(r0)
            java.lang.String r0 = "DROP TABLE message_updates_table"
            r3.AT6(r0)
            java.lang.String r0 = "ALTER TABLE `temp_message_updates` RENAME TO message_updates_table"
            X.C21056XCh.A0F(r3, r0)
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS `temp_message_deletes` \n(`thread_jid` INTEGER NOT NULL, \n`sender_jid` INTEGER NOT NULL, \n`item_id` TEXT NOT NULL, \n`target_item_id` TEXT NOT NULL, \n`payload` TEXT NOT NULL, \n`offline_threading_id` TEXT NOT NULL, \nPRIMARY KEY(`thread_jid`, `item_id`))"
            goto L_0x006e
        L_0x0046:
            X.0qQ.A0B(r3, r0)
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS `temp_messages_table` (\n`thread_jid` INTEGER NOT NULL, \n`sender_jid` INTEGER NOT NULL, \n`item_id` TEXT NOT NULL, \n`payload` TEXT NOT NULL, \n`hidden` INTEGER NOT NULL, \n`shh` INTEGER NOT NULL, \n`offline_threading_id` TEXT NOT NULL, \n`message_expiration_ts_sec` INTEGER, \n`hidden_ts_sec` INTEGER, \nPRIMARY KEY(`thread_jid`, `item_id`))"
            r3.AT6(r0)
            java.lang.String r0 = "          INSERT INTO `temp_messages_table`\n          (`thread_jid`, `sender_jid`, `item_id`, `payload`, `hidden`, `shh`, \n          `offline_threading_id`, `message_expiration_ts_sec`, `hidden_ts_sec`)\n          SELECT `thread_jid`, `sender_jid`, `item_id`, `payload`, `hidden`, `shh`, \n          `offline_threading_id`, `message_expiration_ts_sec`, `hidden_ts_sec`\n          FROM messages_table"
            A00(r3, r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS `index_messages_table_hidden_ts_sec` ON `messages_table` (`hidden_ts_sec`)"
            r3.AT6(r0)
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS `temp_message_updates` (\n`thread_jid` INTEGER NOT NULL, \n`sender_jid` INTEGER NOT NULL, \n`item_id` TEXT NOT NULL, \n`target_item_id` TEXT NOT NULL, \n`payload` TEXT NOT NULL, \n`offline_threading_id` TEXT NOT NULL, \n`hidden_ts_sec` INTEGER, \nPRIMARY KEY(`thread_jid`, `item_id`))"
            r3.AT6(r0)
            java.lang.String r0 = "INSERT INTO `temp_message_updates`\n(`thread_jid`, `sender_jid`, `item_id`, `target_item_id`, \n`payload`, `offline_threading_id`, `hidden_ts_sec`)\nSELECT `thread_jid`, `sender_jid`, `item_id`, `target_item_id`, \n`payload`, `offline_threading_id`, `hidden_ts_sec`\nFROM message_updates_table"
            r3.AT6(r0)
            java.lang.String r0 = "DROP TABLE message_updates_table"
            r3.AT6(r0)
            java.lang.String r0 = "ALTER TABLE `temp_message_updates` RENAME TO message_updates_table"
            X.C21056XCh.A0F(r3, r0)
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS `temp_message_deletes` (\n`thread_jid` INTEGER NOT NULL, \n`sender_jid` INTEGER NOT NULL, \n`item_id` TEXT NOT NULL, \n`target_item_id` TEXT NOT NULL, \n`payload` TEXT NOT NULL, \n`offline_threading_id` TEXT NOT NULL, \nPRIMARY KEY(`thread_jid`, `item_id`))"
        L_0x006e:
            r3.AT6(r0)
            java.lang.String r0 = "INSERT INTO `temp_message_deletes`\n(`thread_jid`, `sender_jid`, `item_id`, `target_item_id`, \n`payload`, `offline_threading_id`)\nSELECT `thread_jid`, `sender_jid`, `item_id`, `target_item_id`, \n`payload`, `offline_threading_id`\n FROM message_deletes_table"
            r3.AT6(r0)
            java.lang.String r0 = "DROP TABLE message_deletes_table"
            r3.AT6(r0)
            java.lang.String r0 = "ALTER TABLE `temp_message_deletes` RENAME TO message_deletes_table"
            r3.AT6(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS `index_message_deletes_table_thread_jid_target_item_id` ON `message_deletes_table` (`thread_jid`, `target_item_id`)"
            r3.AT6(r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS `index_message_deletes_table_offline_threading_id` ON `message_deletes_table` (`offline_threading_id`)"
            goto L_0x0019
        L_0x0088:
            X.0qQ.A0B(r3, r0)
            java.lang.String r0 = "CREATE TABLE IF NOT EXISTS `temp_messages_table` (\n`thread_jid` INTEGER NOT NULL, \n`sender_jid` INTEGER NOT NULL, \n`item_id` TEXT NOT NULL, \n`payload` TEXT NOT NULL, \n`payload_blob` BLOB,\n`hidden` INTEGER NOT NULL, \n`shh` INTEGER NOT NULL, \n`offline_threading_id` TEXT NOT NULL, \n`message_expiration_ts_sec` INTEGER, \n`hidden_ts_sec` INTEGER, \nPRIMARY KEY(`thread_jid`, `item_id`))"
            r3.AT6(r0)
            java.lang.String r0 = "          INSERT INTO `temp_messages_table`\n          (`thread_jid`, `sender_jid`, `item_id`, `payload`, `payload_blob`, `hidden`, `shh`, \n          `offline_threading_id`, `message_expiration_ts_sec`, `hidden_ts_sec`)\n          SELECT `thread_jid`, `sender_jid`, `item_id`, `payload`, `payload_blob` , `hidden`, `shh`, \n          `offline_threading_id`, `message_expiration_ts_sec`, `hidden_ts_sec`\n          FROM messages_table"
            A00(r3, r0)
            java.lang.String r0 = "CREATE INDEX IF NOT EXISTS `index_messages_table_hidden_ts_sec` ON `messages_table` (`hidden_ts_sec`)"
            goto L_0x0019
        L_0x0098:
            X.0qQ.A0B(r3, r0)
            java.lang.String r0 = "SELECT * FROM drafts"
            android.database.Cursor r1 = r3.E5k(r0)
            java.lang.String r0 = "is_like_and_view_counts_disabled"
            int r0 = r1.getColumnIndex(r0)
            if (r0 >= 0) goto L_0x00ad
            java.lang.String r0 = "ALTER TABLE drafts ADD COLUMN is_like_and_view_counts_disabled INTEGER NOT NULL DEFAULT 0"
            goto L_0x0019
        L_0x00ad:
            java.lang.String r1 = "igtv_db_skip_13_14_migration"
            java.lang.String r0 = "skipping adding is_like_and_view_counts_disabled column since it already exist"
            goto L_0x00b6
        L_0x00b2:
            java.lang.String r1 = "igtv_db_skip_8_9_migration"
            java.lang.String r0 = "skipping adding are_comments_disabled column since it already exist"
        L_0x00b6:
            X.0wb.A03(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.XH3.migrate(X.1W6):void");
    }

    public static void A00(1W6 r1, String str) {
        r1.AT6(str);
        r1.AT6("DROP TABLE messages_table");
        r1.AT6("ALTER TABLE `temp_messages_table` RENAME TO messages_table");
        r1.AT6("CREATE INDEX IF NOT EXISTS `index_messages_table_item_id` ON `messages_table` (`item_id`)");
        r1.AT6("CREATE INDEX IF NOT EXISTS `index_messages_table_offline_threading_id` ON `messages_table` (`offline_threading_id`)");
        r1.AT6("CREATE INDEX IF NOT EXISTS `index_messages_table_message_expiration_ts_sec` ON `messages_table` (`message_expiration_ts_sec`)");
    }
}
