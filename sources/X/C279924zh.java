package X;

import com.instagram.direct.inbox.notes.persistence.NotesRoomDb_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.4zh  reason: invalid class name and case insensitive filesystem */
public final class C279924zh extends AnonymousClass1VQ {
    public final /* synthetic */ NotesRoomDb_Impl A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C279924zh(NotesRoomDb_Impl notesRoomDb_Impl) {
        super(1);
        this.A00 = notesRoomDb_Impl;
    }

    public final void onPostMigrate(1W6 r1) {
    }

    public final C21382XZp onValidateSchema(1W6 r16) {
        HashMap hashMap = new HashMap(5);
        hashMap.put("entity_id", new SJE("entity_id", "TEXT", (String) null, 1, 1, true));
        hashMap.put("data", new SJE("data", "BLOB", (String) null, 0, 1, true));
        hashMap.put("entity_index", new SJE("entity_index", "INTEGER", (String) null, 0, 1, true));
        hashMap.put("entity_type", new SJE("entity_type", "INTEGER", (String) null, 0, 1, true));
        hashMap.put("stored_time", new SJE("stored_time", "INTEGER", (String) null, 0, 1, true));
        HashSet hashSet = new HashSet(0);
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new S6D("index_note_entities_data_stored_time", Arrays.asList(new String[]{"stored_time"}), Arrays.asList(new String[]{"ASC"}), false));
        C21501Xd6 xd6 = new C21501Xd6("note_entities_data", hashMap, hashSet, hashSet2);
        C21501Xd6 A002 = RS9.A00(r16, "note_entities_data");
        if (xd6.equals(A002)) {
            return new C21382XZp(true, (String) null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("note_entities_data(com.instagram.direct.inbox.notes.persistence.NoteEntity).\n Expected:\n");
        sb.append(xd6);
        sb.append("\n Found:\n");
        sb.append(A002);
        return new C21382XZp(false, sb.toString());
    }

    public final void createAllTables(1W6 r2) {
        r2.AT6("CREATE TABLE IF NOT EXISTS `note_entities_data` (`entity_id` TEXT NOT NULL, `data` BLOB NOT NULL, `entity_index` INTEGER NOT NULL, `entity_type` INTEGER NOT NULL, `stored_time` INTEGER NOT NULL, PRIMARY KEY(`entity_id`))");
        r2.AT6("CREATE INDEX IF NOT EXISTS `index_note_entities_data_stored_time` ON `note_entities_data` (`stored_time`)");
        r2.AT6(AnonymousClass000.A00(20));
        r2.AT6("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '64b9cc273fc8ab43807f96b6e89205d1')");
    }

    public final void dropAllTables(1W6 r3) {
        r3.AT6("DROP TABLE IF EXISTS `note_entities_data`");
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
        NotesRoomDb_Impl notesRoomDb_Impl = this.A00;
        notesRoomDb_Impl.mDatabase = r3;
        notesRoomDb_Impl.internalInitInvalidationTracker(r3);
        List<AnonymousClass2NN> list = notesRoomDb_Impl.mCallbacks;
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
