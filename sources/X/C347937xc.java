package X;

/* renamed from: X.7xc  reason: invalid class name and case insensitive filesystem */
public final class C347937xc implements C347947xd {
    public static final C347937xc A00 = new Object();
    public static final C347957xe A01;
    public static final C347957xe A02;
    public static final C347957xe A03;
    public static final C347957xe A04;
    public static final C347957xe A05;
    public static final C347957xe A06;
    public static final C347957xe A07;
    public static final C347957xe A08;
    public static final C347957xe A09;
    public static final C347957xe A0A;
    public static final C347957xe[] A0B;
    public static final String[] A0C = {"gallery_media_metadata"};

    /* JADX WARNING: type inference failed for: r0v11, types: [X.7xc, java.lang.Object] */
    static {
        C347957xe r8 = new C347957xe(1, "083c91286b5271b7f187fb0a353f72c2ccc374c6", new String[]{"CREATE TABLE gallery_media_metadata (\nid TEXT PRIMARY KEY NOT NULL,\nscanner_versions TEXT,\nfeature_name TEXT,\nlocality TEXT,\nsub_admin_area TEXT,\ncountry_name TEXT,\nvisual_embeddings TEXT,\nface_count INTEGER DEFAULT(0),\nfaces_json TEXT,\ngroup_scan_id INTEGER DEFAULT(-1),\ngroup_id INTEGER DEFAULT(-1)\n)"});
        A09 = r8;
        C347957xe r9 = new C347957xe(2, "b556a00e0a5977a698a08f349235af69c09203ae", new String[]{"ALTER TABLE gallery_media_metadata ADD ocn_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD ocv_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD person_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD smiling_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD food_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD nature_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD landmark_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD top_concept INTEGER DEFAULT(-1)", "ALTER TABLE gallery_media_metadata ADD top_concept_score REAL DEFAULT(0)"});
        A05 = r9;
        C347957xe r10 = new C347957xe(3, "af5cc50d8ae1bce9bafe081571f1aba0435127bb", new String[]{"ALTER TABLE gallery_media_metadata ADD aesthetic_score REAL DEFAULT(0)"});
        A06 = r10;
        C347957xe r11 = new C347957xe(4, "2aa35f54399381d98405d8e58fa72ef6fabea513", new String[]{"ALTER TABLE gallery_media_metadata ADD blur_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD document_score REAL DEFAULT(0)"});
        A07 = r11;
        C347957xe r12 = new C347957xe(5, "da822d65ff9cfcde28bfdae01cae3eb3369aa3c7", new String[]{"ALTER TABLE gallery_media_metadata ADD pet_score REAL DEFAULT(0)"});
        A08 = r12;
        C347957xe r13 = new C347957xe(6, "89925ddc219159c80e423a137397e1bb3b814426", new String[]{"ALTER TABLE gallery_media_metadata ADD highlight_start_ms INTEGER DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD highlight_duration_ms INTEGER DEFAULT(0)"});
        A04 = r13;
        C347957xe r14 = new C347957xe(7, "3c2ad996f96b9e5c19426a9a019f106f5d616cd0", new String[]{"ALTER TABLE gallery_media_metadata ADD date_sec INTEGER DEFAULT(0)", "UPDATE gallery_media_metadata SET date_sec = strftime('%s', 'now')"});
        A03 = r14;
        C347957xe r15 = new C347957xe(8, "11ddddf7ea6eda560658324f65a68f315adff5a9", new String[]{"BEGIN TRANSACTION", "CREATE TABLE temp_gallery_media_metadata AS\nSELECT id, scanner_versions, feature_name, locality, sub_admin_area, country_name, visual_embeddings, ocn_score, ocv_score, person_score, food_score, nature_score, landmark_score, aesthetic_score, blur_score, document_score, pet_score, date_sec\nFROM gallery_media_metadata", "DROP TABLE gallery_media_metadata", "ALTER TABLE temp_gallery_media_metadata RENAME TO gallery_media_metadata", "COMMIT"});
        A0A = r15;
        C347957xe r4 = new C347957xe(9, "32058a9b59412435b9a737869178f40b70f7e4e5", new String[]{"ALTER TABLE gallery_media_metadata ADD plant_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD sports_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD vehicle_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD water_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD outdoors_score REAL DEFAULT(0)", "ALTER TABLE gallery_media_metadata ADD event_score REAL DEFAULT(0)"});
        A02 = r4;
        C347957xe r1 = new C347957xe(10, "a4fd8ee38e0bdfcdde36b8bea677ae49cc245312", new String[]{"ALTER TABLE gallery_media_metadata ADD admin_area TEXT DEFAULT ''"});
        A01 = r1;
        A0B = new C347957xe[]{r8, r9, r10, r11, r12, r13, r14, r15, r4, r1};
    }

    public final String getName() {
        return "gallery_media_metadata";
    }

    public final C347957xe[] BT1() {
        return A0B;
    }

    public final String[] C3q() {
        return A0C;
    }
}
