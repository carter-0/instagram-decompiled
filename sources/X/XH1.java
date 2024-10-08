package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.feed.media.flashmedia.persistence.MediaDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class XH1 extends AnonymousClass1VQ {
    public final /* synthetic */ MediaDatabase_Impl A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public XH1(MediaDatabase_Impl mediaDatabase_Impl) {
        super(2);
        this.A00 = mediaDatabase_Impl;
    }

    public final void onPostMigrate(1W6 r1) {
    }

    public final C21382XZp onValidateSchema(1W6 r11) {
        HashMap A0h = C21053XCe.A0h(5);
        C21055XCg.A1T(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "TEXT", A0h);
        A0h.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C21055XCg.A05(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, "TEXT", (String) null, 2));
        boolean A0U = C21056XCh.A0U("data", "BLOB", A0h);
        A0h.put("stored_time", C21055XCg.A05("stored_time", "INTEGER", (String) null, A0U ? 1 : 0));
        HashSet A0X = C21055XCg.A0X("ranking_score", C21055XCg.A05("ranking_score", "REAL", (String) null, A0U), A0h, A0U);
        HashSet hashSet = new HashSet(1);
        C21055XCg.A1U("index_medias_stored_time", hashSet, C21053XCe.A0k("stored_time"), C21053XCe.A0k("ASC"), A0U);
        C21501Xd6 xd6 = new C21501Xd6("medias", A0h, A0X, hashSet);
        C21501Xd6 A002 = RS9.A00(r11, "medias");
        if (xd6.equals(A002)) {
            return new C21382XZp(true, (String) null);
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("medias(com.instagram.feed.media.flashmedia.persistence.MediaEntity).\n Expected:\n");
        A1A.append(xd6);
        return new C21382XZp(A0U, AnonymousClass7TG.A0m(A002, "\n Found:\n", A1A));
    }

    public final void createAllTables(1W6 r2) {
        r2.AT6("CREATE TABLE IF NOT EXISTS `medias` (`id` TEXT NOT NULL, `type` TEXT NOT NULL, `data` BLOB NOT NULL, `stored_time` INTEGER NOT NULL, `ranking_score` REAL NOT NULL, PRIMARY KEY(`id`, `type`))");
        C21053XCe.A0m(r2, "CREATE INDEX IF NOT EXISTS `index_medias_stored_time` ON `medias` (`stored_time`)");
        r2.AT6("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '96087c341bf499711f9b60c1264a4b2c')");
    }

    public final void dropAllTables(1W6 r3) {
        r3.AT6("DROP TABLE IF EXISTS `medias`");
        List list = this.A00.mCallbacks;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C21055XCg.A0b(r3, it);
            }
        }
    }

    public final void onCreate(1W6 r3) {
        List list = this.A00.mCallbacks;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C21053XCe.A0n(r3, it);
            }
        }
    }

    public final void onOpen(1W6 r3) {
        MediaDatabase_Impl mediaDatabase_Impl = this.A00;
        mediaDatabase_Impl.mDatabase = r3;
        mediaDatabase_Impl.internalInitInvalidationTracker(r3);
        List list = mediaDatabase_Impl.mCallbacks;
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C21053XCe.A0o(r3, it);
            }
        }
    }

    public final void onPreMigrate(1W6 r1) {
        1wT.A01(r1);
    }
}
