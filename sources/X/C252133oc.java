package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.reels.persistence.room.UserReelMediaDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.3oc  reason: invalid class name and case insensitive filesystem */
public final class C252133oc extends AnonymousClass1VQ {
    public final /* synthetic */ UserReelMediaDatabase_Impl A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C252133oc(UserReelMediaDatabase_Impl userReelMediaDatabase_Impl) {
        super(2);
        this.A00 = userReelMediaDatabase_Impl;
    }

    public final void onPostMigrate(1W6 r1) {
    }

    public final C21382XZp onValidateSchema(1W6 r18) {
        HashMap hashMap = new HashMap(4);
        hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, new SJE(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "TEXT", (String) null, 1, 1, true));
        hashMap.put("media_ids", new SJE("media_ids", "TEXT", (String) null, 0, 1, true));
        hashMap.put("data", new SJE("data", "BLOB", (String) null, 0, 1, true));
        hashMap.put("stored_time", new SJE("stored_time", "INTEGER", (String) null, 0, 1, true));
        HashSet hashSet = new HashSet(0);
        HashSet hashSet2 = new HashSet(1);
        hashSet2.add(new S6D("index_user_reel_medias_stored_time", Arrays.asList(new String[]{"stored_time"}), Arrays.asList(new String[]{"ASC"}), false));
        C21501Xd6 xd6 = new C21501Xd6("user_reel_medias", hashMap, hashSet, hashSet2);
        C21501Xd6 A002 = RS9.A00(r18, "user_reel_medias");
        if (xd6.equals(A002)) {
            return new C21382XZp(true, (String) null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("user_reel_medias(com.instagram.reels.persistence.room.UserReelMediaEntity).\n Expected:\n");
        sb.append(xd6);
        sb.append("\n Found:\n");
        sb.append(A002);
        return new C21382XZp(false, sb.toString());
    }

    public final void createAllTables(1W6 r2) {
        r2.AT6("CREATE TABLE IF NOT EXISTS `user_reel_medias` (`id` TEXT NOT NULL, `media_ids` TEXT NOT NULL, `data` BLOB NOT NULL, `stored_time` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        r2.AT6("CREATE INDEX IF NOT EXISTS `index_user_reel_medias_stored_time` ON `user_reel_medias` (`stored_time`)");
        r2.AT6(AnonymousClass000.A00(20));
        r2.AT6("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '16bbe00e7a8a4894043a3e227f3a0164')");
    }

    public final void dropAllTables(1W6 r3) {
        r3.AT6("DROP TABLE IF EXISTS `user_reel_medias`");
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
        UserReelMediaDatabase_Impl userReelMediaDatabase_Impl = this.A00;
        userReelMediaDatabase_Impl.mDatabase = r3;
        userReelMediaDatabase_Impl.internalInitInvalidationTracker(r3);
        List<AnonymousClass2NN> list = userReelMediaDatabase_Impl.mCallbacks;
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
