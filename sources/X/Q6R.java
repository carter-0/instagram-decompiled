package X;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.Arrays;
import java.util.List;

public final class Q6R extends SQLiteOpenHelper {
    public static final String A02 = 002.A0e("INSERT INTO global_log_event_state VALUES (", ")", System.currentTimeMillis());
    public static final C13458Tal A03;
    public static final C13458Tal A04;
    public static final C13458Tal A05;
    public static final C13458Tal A06;
    public static final C13458Tal A07;
    public static final List A08;
    public boolean A00 = false;
    public final int A01;

    public Q6R(Context context, String str, int i) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, i);
        this.A01 = i;
    }

    public static void A00(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3;
        int i4 = i;
        List list = A08;
        int i5 = i2;
        if (i2 > list.size()) {
            throw AnonymousClass7TE.A0w(002.A0z("Migration from ", " to ", " was requested, but cannot be performed. Only ", " migrations are provided", i4, i5, list.size()));
        }
        while (i4 < i2) {
            switch (((SwB) ((C13458Tal) list.get(i4))).A00) {
                case 0:
                    AnonymousClass0fa.A00(872293847);
                    sQLiteDatabase.execSQL("CREATE TABLE events (_id INTEGER PRIMARY KEY, context_id INTEGER NOT NULL, transport_name TEXT NOT NULL, timestamp_ms INTEGER NOT NULL, uptime_ms INTEGER NOT NULL, payload BLOB NOT NULL, code INTEGER, num_attempts INTEGER NOT NULL,FOREIGN KEY (context_id) REFERENCES transport_contexts(_id) ON DELETE CASCADE)");
                    AnonymousClass0fa.A00(964444809);
                    AnonymousClass0fa.A00(-1679059122);
                    sQLiteDatabase.execSQL("CREATE TABLE event_metadata (_id INTEGER PRIMARY KEY, event_id INTEGER NOT NULL, name TEXT NOT NULL, value TEXT NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE)");
                    AnonymousClass0fa.A00(1888224200);
                    AnonymousClass0fa.A00(141164158);
                    sQLiteDatabase.execSQL("CREATE TABLE transport_contexts (_id INTEGER PRIMARY KEY, backend_name TEXT NOT NULL, priority INTEGER NOT NULL, next_request_ms INTEGER NOT NULL)");
                    AnonymousClass0fa.A00(-1482004662);
                    AnonymousClass0fa.A00(1766862321);
                    sQLiteDatabase.execSQL("CREATE INDEX events_backend_id on events(context_id)");
                    AnonymousClass0fa.A00(-1863147334);
                    AnonymousClass0fa.A00(1787604563);
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority on transport_contexts(backend_name, priority)");
                    i3 = 293994338;
                    break;
                case 1:
                    AnonymousClass0fa.A00(-2002349610);
                    sQLiteDatabase.execSQL("ALTER TABLE transport_contexts ADD COLUMN extras BLOB");
                    AnonymousClass0fa.A00(1053140000);
                    AnonymousClass0fa.A00(174688346);
                    sQLiteDatabase.execSQL("CREATE UNIQUE INDEX contexts_backend_priority_extras on transport_contexts(backend_name, priority, extras)");
                    AnonymousClass0fa.A00(1721799102);
                    AnonymousClass0fa.A00(435458980);
                    sQLiteDatabase.execSQL("DROP INDEX contexts_backend_priority");
                    i3 = -1863413454;
                    break;
                case 2:
                    AnonymousClass0fa.A00(-1382456598);
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN payload_encoding TEXT");
                    i3 = -911584786;
                    break;
                case 3:
                    AnonymousClass0fa.A00(-323555290);
                    sQLiteDatabase.execSQL("ALTER TABLE events ADD COLUMN inline BOOLEAN NOT NULL DEFAULT 1");
                    AnonymousClass0fa.A00(121802160);
                    AnonymousClass0fa.A00(-947564199);
                    sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
                    AnonymousClass0fa.A00(-742929006);
                    AnonymousClass0fa.A00(-1829333376);
                    sQLiteDatabase.execSQL("CREATE TABLE event_payloads (sequence_num INTEGER NOT NULL, event_id INTEGER NOT NULL, bytes BLOB NOT NULL,FOREIGN KEY (event_id) REFERENCES events(_id) ON DELETE CASCADE,PRIMARY KEY (sequence_num, event_id))");
                    i3 = -821582309;
                    break;
                default:
                    AnonymousClass0fa.A00(1927104977);
                    sQLiteDatabase.execSQL("CREATE TABLE log_event_dropped (log_source VARCHAR(45) NOT NULL,reason INTEGER NOT NULL,events_dropped_count BIGINT NOT NULL,PRIMARY KEY(log_source, reason))");
                    AnonymousClass0fa.A00(2112923525);
                    AnonymousClass0fa.A00(305138947);
                    sQLiteDatabase.execSQL("CREATE TABLE global_log_event_state (last_metrics_upload_ms BIGINT PRIMARY KEY)");
                    AnonymousClass0fa.A00(1889578299);
                    String str = A02;
                    AnonymousClass0fa.A00(-1983275286);
                    sQLiteDatabase.execSQL(str);
                    i3 = -708043933;
                    break;
            }
            AnonymousClass0fa.A00(i3);
            i4++;
        }
    }

    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        this.A00 = true;
        sQLiteDatabase.rawQuery("PRAGMA busy_timeout=0;", new String[0]).close();
        sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
    }

    static {
        SwB swB = new SwB(0);
        A03 = swB;
        SwB swB2 = new SwB(1);
        A04 = swB2;
        SwB swB3 = new SwB(2);
        A05 = swB3;
        SwB swB4 = new SwB(3);
        A06 = swB4;
        SwB swB5 = new SwB(4);
        A07 = swB5;
        A08 = Arrays.asList(new C13458Tal[]{swB, swB2, swB3, swB4, swB5});
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        int i = this.A01;
        if (!this.A00) {
            onConfigure(sQLiteDatabase);
        }
        A00(sQLiteDatabase, 0, i);
    }

    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.A00) {
            onConfigure(sQLiteDatabase);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (!this.A00) {
            onConfigure(sQLiteDatabase);
        }
        A00(sQLiteDatabase, i, i2);
    }

    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        AnonymousClass0fa.A00(-28667001);
        sQLiteDatabase.execSQL("DROP TABLE events");
        AnonymousClass0fa.A00(-530818950);
        AnonymousClass0fa.A00(232898197);
        sQLiteDatabase.execSQL("DROP TABLE event_metadata");
        AnonymousClass0fa.A00(1035748864);
        AnonymousClass0fa.A00(1646431583);
        sQLiteDatabase.execSQL("DROP TABLE transport_contexts");
        AnonymousClass0fa.A00(-807325544);
        AnonymousClass0fa.A00(-1421196070);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS event_payloads");
        AnonymousClass0fa.A00(-132062322);
        AnonymousClass0fa.A00(1944392383);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS log_event_dropped");
        AnonymousClass0fa.A00(-521031876);
        AnonymousClass0fa.A00(412213073);
        sQLiteDatabase.execSQL("DROP TABLE IF EXISTS global_log_event_state");
        AnonymousClass0fa.A00(-1915604761);
        if (!this.A00) {
            onConfigure(sQLiteDatabase);
        }
        A00(sQLiteDatabase, 0, i2);
    }
}
