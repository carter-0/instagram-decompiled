package X;

/* renamed from: X.38j  reason: invalid class name and case insensitive filesystem */
public final class C2376038j extends AnonymousClass1VF {
    public static final C2376038j A00 = new C2376038j();

    public final void migrate(1W6 r2) {
        0qQ.A0B(r2, 0);
        r2.AT6("DELETE FROM SystemIdInfo WHERE work_spec_id IN (SELECT work_spec_id FROM SystemIdInfo LEFT JOIN WorkSpec ON work_spec_id = id WHERE WorkSpec.id IS NULL)");
        r2.AT6("ALTER TABLE `WorkSpec` ADD COLUMN `generation` INTEGER NOT NULL DEFAULT 0");
        r2.AT6("CREATE TABLE IF NOT EXISTS `_new_SystemIdInfo` (\n            `work_spec_id` TEXT NOT NULL, \n            `generation` INTEGER NOT NULL DEFAULT 0, \n            `system_id` INTEGER NOT NULL, \n            PRIMARY KEY(`work_spec_id`, `generation`), \n            FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) \n                ON UPDATE CASCADE ON DELETE CASCADE )");
        r2.AT6("INSERT INTO `_new_SystemIdInfo` (`work_spec_id`,`system_id`) SELECT `work_spec_id`,`system_id` FROM `SystemIdInfo`");
        r2.AT6("DROP TABLE `SystemIdInfo`");
        r2.AT6("ALTER TABLE `_new_SystemIdInfo` RENAME TO `SystemIdInfo`");
    }

    public C2376038j() {
        super(15, 16);
    }
}
