package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.ar.core.discovery.minigallery.persistence.room.MiniGalleryDatabase_Impl;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.86N  reason: invalid class name */
public final class AnonymousClass86N extends AnonymousClass1VQ {
    public final /* synthetic */ MiniGalleryDatabase_Impl A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass86N(MiniGalleryDatabase_Impl miniGalleryDatabase_Impl) {
        super(2);
        this.A00 = miniGalleryDatabase_Impl;
    }

    public final void onPostMigrate(1W6 r1) {
    }

    public final C21382XZp onValidateSchema(1W6 r21) {
        HashMap hashMap = new HashMap(6);
        hashMap.put("miniGallerySurface", new SJE("miniGallerySurface", "TEXT", (String) null, 0, 1, true));
        hashMap.put("categoryId", new SJE("categoryId", "TEXT", (String) null, 0, 1, true));
        hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, new SJE(PublicKeyCredentialControllerUtility.JSON_KEY_DISPLAY_NAME, "TEXT", (String) null, 0, 1, true));
        hashMap.put("syncedAt", new SJE("syncedAt", "INTEGER", (String) null, 0, 1, true));
        hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_ID, new SJE(PublicKeyCredentialControllerUtility.JSON_KEY_ID, "TEXT", (String) null, 1, 1, true));
        hashMap.put("isDefaultCategory", new SJE("isDefaultCategory", "INTEGER", (String) null, 0, 1, true));
        C21501Xd6 xd6 = new C21501Xd6("mini_gallery_categories", hashMap, new HashSet(0), new HashSet(0));
        C21501Xd6 A002 = RS9.A00(r21, "mini_gallery_categories");
        if (xd6.equals(A002)) {
            return new C21382XZp(true, (String) null);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("mini_gallery_categories(com.instagram.ar.core.discovery.minigallery.persistence.room.MiniGalleryCategoryEntity).\n Expected:\n");
        sb.append(xd6);
        sb.append("\n Found:\n");
        sb.append(A002);
        return new C21382XZp(false, sb.toString());
    }

    public final void createAllTables(1W6 r2) {
        r2.AT6("CREATE TABLE IF NOT EXISTS `mini_gallery_categories` (`miniGallerySurface` TEXT NOT NULL, `categoryId` TEXT NOT NULL, `displayName` TEXT NOT NULL, `syncedAt` INTEGER NOT NULL, `id` TEXT NOT NULL, `isDefaultCategory` INTEGER NOT NULL, PRIMARY KEY(`id`))");
        r2.AT6(AnonymousClass000.A00(20));
        r2.AT6("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c8b02299555e0e46bf298e63f085303e')");
    }

    public final void dropAllTables(1W6 r3) {
        r3.AT6("DROP TABLE IF EXISTS `mini_gallery_categories`");
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
        MiniGalleryDatabase_Impl miniGalleryDatabase_Impl = this.A00;
        miniGalleryDatabase_Impl.mDatabase = r3;
        miniGalleryDatabase_Impl.internalInitInvalidationTracker(r3);
        List<AnonymousClass2NN> list = miniGalleryDatabase_Impl.mCallbacks;
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
