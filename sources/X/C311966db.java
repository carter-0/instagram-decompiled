package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.ar.core.effectcollection.persistence.room.EffectCollectionDatabase_Impl;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/* renamed from: X.6db  reason: invalid class name and case insensitive filesystem */
public final class C311966db extends AnonymousClass1VQ {
    public final /* synthetic */ EffectCollectionDatabase_Impl A00;

    public final void onPostMigrate(1W6 r1) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C311966db(EffectCollectionDatabase_Impl effectCollectionDatabase_Impl) {
        super(18);
        this.A00 = effectCollectionDatabase_Impl;
    }

    public final void createAllTables(1W6 r2) {
        r2.AT6("CREATE TABLE IF NOT EXISTS `effects` (`effectId` TEXT NOT NULL, `effectPackageId` TEXT, `effectFileId` TEXT NOT NULL, `isDraft` INTEGER NOT NULL, `isNetworkConsentRequired` INTEGER NOT NULL, `isUserSafetyWarningRequired` INTEGER NOT NULL, `usesFlmCapability` INTEGER NOT NULL, `isAnimatedPhotoEffect` INTEGER NOT NULL, `cacheKey` TEXT, `compressionType` TEXT NOT NULL, `title` TEXT NOT NULL, `assetUrl` TEXT NOT NULL, `filesizeBytes` INTEGER NOT NULL, `uncompressedFileSizeBytes` INTEGER NOT NULL, `md5Hash` TEXT, `thumbnailUrl` TEXT NOT NULL, `transparentBackgroundThumbnailUrl` TEXT, `instructionList` TEXT NOT NULL, `restrictionSet` TEXT NOT NULL, `isInternalOnly` INTEGER NOT NULL, `capabilitiesSet` TEXT NOT NULL, `type` TEXT NOT NULL, `badgeState` INTEGER NOT NULL, `attributionId` TEXT, `attributionUserName` TEXT, `attributionProfileImageUrl` TEXT, `capabilityMinVersion` TEXT NOT NULL, `effectInfoUIOptions` TEXT NOT NULL, `effectInfoUISecondaryOptions` TEXT NOT NULL, `saveStatus` INTEGER NOT NULL, `effectManifestJson` TEXT, `previewVideoMedia` TEXT NOT NULL, `effectFileContents` TEXT, `useHandsFree` INTEGER NOT NULL, `handsFreeDurationMs` INTEGER NOT NULL, `isCreativeTool` INTEGER NOT NULL, `creativeToolDescription` TEXT, `isEncrypted` INTEGER NOT NULL, `syncedAt` INTEGER NOT NULL, `shaderPackMetadata` TEXT, `productCapabilities` TEXT NOT NULL, `fanClubId` TEXT, `formattedMediaCount` TEXT, `formattedMediaCountAccessibility` TEXT, `avatarSdkPresetGlb` TEXT, `requiredSdkVersion` TEXT, `bestInstanceId` TEXT, `avatarType` TEXT, PRIMARY KEY(`effectId`))");
        r2.AT6("CREATE TABLE IF NOT EXISTS `effect_collections` (`productId` TEXT NOT NULL, `collectionName` TEXT NOT NULL, `syncedAt` INTEGER NOT NULL, `lastSyncedNextCursor` TEXT, `hasMore` INTEGER NOT NULL, `collectionId` TEXT NOT NULL, PRIMARY KEY(`collectionId`))");
        r2.AT6("CREATE TABLE IF NOT EXISTS `effect_collections_effects` (`collectionId` TEXT NOT NULL, `effectId` TEXT NOT NULL, `order` INTEGER NOT NULL, PRIMARY KEY(`collectionId`, `effectId`))");
        r2.AT6("CREATE INDEX IF NOT EXISTS `index_effect_collections_effects_order` ON `effect_collections_effects` (`order`)");
        r2.AT6(AnonymousClass000.A00(20));
        r2.AT6("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '6f1c5b41dc69a2e390b2e7eb0b9232d4')");
    }

    public final void dropAllTables(1W6 r3) {
        r3.AT6("DROP TABLE IF EXISTS `effects`");
        r3.AT6("DROP TABLE IF EXISTS `effect_collections`");
        r3.AT6("DROP TABLE IF EXISTS `effect_collections_effects`");
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
        EffectCollectionDatabase_Impl effectCollectionDatabase_Impl = this.A00;
        effectCollectionDatabase_Impl.mDatabase = r3;
        effectCollectionDatabase_Impl.internalInitInvalidationTracker(r3);
        List<AnonymousClass2NN> list = effectCollectionDatabase_Impl.mCallbacks;
        if (list != null) {
            for (AnonymousClass2NN A02 : list) {
                A02.A02(r3);
            }
        }
    }

    public final C21382XZp onValidateSchema(1W6 r25) {
        StringBuilder sb;
        String str;
        HashMap hashMap = new HashMap(48);
        hashMap.put("effectId", new SJE("effectId", "TEXT", (String) null, 1, 1, true));
        hashMap.put("effectPackageId", new SJE("effectPackageId", "TEXT", (String) null, 0, 1, false));
        hashMap.put("effectFileId", new SJE("effectFileId", "TEXT", (String) null, 0, 1, true));
        hashMap.put("isDraft", new SJE("isDraft", "INTEGER", (String) null, 0, 1, true));
        hashMap.put("isNetworkConsentRequired", new SJE("isNetworkConsentRequired", "INTEGER", (String) null, 0, 1, true));
        hashMap.put("isUserSafetyWarningRequired", new SJE("isUserSafetyWarningRequired", "INTEGER", (String) null, 0, 1, true));
        hashMap.put("usesFlmCapability", new SJE("usesFlmCapability", "INTEGER", (String) null, 0, 1, true));
        hashMap.put("isAnimatedPhotoEffect", new SJE("isAnimatedPhotoEffect", "INTEGER", (String) null, 0, 1, true));
        String str2 = "TEXT";
        hashMap.put("cacheKey", new SJE("cacheKey", str2, (String) null, 0, 1, false));
        hashMap.put("compressionType", new SJE("compressionType", str2, (String) null, 0, 1, true));
        hashMap.put(DialogModule.KEY_TITLE, new SJE(DialogModule.KEY_TITLE, str2, (String) null, 0, 1, true));
        hashMap.put("assetUrl", new SJE("assetUrl", str2, (String) null, 0, 1, true));
        String str3 = "INTEGER";
        hashMap.put("filesizeBytes", new SJE("filesizeBytes", str3, (String) null, 0, 1, true));
        hashMap.put("uncompressedFileSizeBytes", new SJE("uncompressedFileSizeBytes", str3, (String) null, 0, 1, true));
        String str4 = "TEXT";
        hashMap.put("md5Hash", new SJE("md5Hash", str4, (String) null, 0, 1, false));
        hashMap.put("thumbnailUrl", new SJE("thumbnailUrl", str4, (String) null, 0, 1, true));
        hashMap.put("transparentBackgroundThumbnailUrl", new SJE("transparentBackgroundThumbnailUrl", str4, (String) null, 0, 1, false));
        hashMap.put("instructionList", new SJE("instructionList", str4, (String) null, 0, 1, true));
        hashMap.put("restrictionSet", new SJE("restrictionSet", str4, (String) null, 0, 1, true));
        hashMap.put("isInternalOnly", new SJE("isInternalOnly", "INTEGER", (String) null, 0, 1, true));
        String str5 = "TEXT";
        hashMap.put("capabilitiesSet", new SJE("capabilitiesSet", str5, (String) null, 0, 1, true));
        hashMap.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, new SJE(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str5, (String) null, 0, 1, true));
        hashMap.put("badgeState", new SJE("badgeState", "INTEGER", (String) null, 0, 1, true));
        String str6 = "TEXT";
        hashMap.put("attributionId", new SJE("attributionId", str6, (String) null, 0, 1, false));
        hashMap.put("attributionUserName", new SJE("attributionUserName", str6, (String) null, 0, 1, false));
        hashMap.put("attributionProfileImageUrl", new SJE("attributionProfileImageUrl", str6, (String) null, 0, 1, false));
        hashMap.put("capabilityMinVersion", new SJE("capabilityMinVersion", str6, (String) null, 0, 1, true));
        hashMap.put("effectInfoUIOptions", new SJE("effectInfoUIOptions", str6, (String) null, 0, 1, true));
        hashMap.put("effectInfoUISecondaryOptions", new SJE("effectInfoUISecondaryOptions", str6, (String) null, 0, 1, true));
        hashMap.put("saveStatus", new SJE("saveStatus", "INTEGER", (String) null, 0, 1, true));
        String str7 = "TEXT";
        hashMap.put("effectManifestJson", new SJE("effectManifestJson", str7, (String) null, 0, 1, false));
        hashMap.put("previewVideoMedia", new SJE("previewVideoMedia", str7, (String) null, 0, 1, true));
        hashMap.put("effectFileContents", new SJE("effectFileContents", str7, (String) null, 0, 1, false));
        String str8 = "INTEGER";
        hashMap.put("useHandsFree", new SJE("useHandsFree", str8, (String) null, 0, 1, true));
        hashMap.put("handsFreeDurationMs", new SJE("handsFreeDurationMs", str8, (String) null, 0, 1, true));
        hashMap.put("isCreativeTool", new SJE("isCreativeTool", str8, (String) null, 0, 1, true));
        hashMap.put("creativeToolDescription", new SJE("creativeToolDescription", "TEXT", (String) null, 0, 1, false));
        String str9 = "INTEGER";
        hashMap.put("isEncrypted", new SJE("isEncrypted", str9, (String) null, 0, 1, true));
        hashMap.put("syncedAt", new SJE("syncedAt", str9, (String) null, 0, 1, true));
        String str10 = "TEXT";
        hashMap.put("shaderPackMetadata", new SJE("shaderPackMetadata", str10, (String) null, 0, 1, false));
        hashMap.put("productCapabilities", new SJE("productCapabilities", str10, (String) null, 0, 1, true));
        hashMap.put("fanClubId", new SJE("fanClubId", str10, (String) null, 0, 1, false));
        hashMap.put("formattedMediaCount", new SJE("formattedMediaCount", str10, (String) null, 0, 1, false));
        hashMap.put("formattedMediaCountAccessibility", new SJE("formattedMediaCountAccessibility", str10, (String) null, 0, 1, false));
        hashMap.put("avatarSdkPresetGlb", new SJE("avatarSdkPresetGlb", str10, (String) null, 0, 1, false));
        hashMap.put("requiredSdkVersion", new SJE("requiredSdkVersion", str10, (String) null, 0, 1, false));
        hashMap.put("bestInstanceId", new SJE("bestInstanceId", str10, (String) null, 0, 1, false));
        hashMap.put("avatarType", new SJE("avatarType", str10, (String) null, 0, 1, false));
        C21501Xd6 xd6 = new C21501Xd6("effects", hashMap, new HashSet(0), new HashSet(0));
        1W6 r6 = r25;
        C21501Xd6 A002 = RS9.A00(r6, "effects");
        if (!xd6.equals(A002)) {
            sb = new StringBuilder();
            str = "effects(com.instagram.ar.core.effectcollection.persistence.room.CameraAREffectEntity).\n Expected:\n";
        } else {
            HashMap hashMap2 = new HashMap(6);
            hashMap2.put("productId", new SJE("productId", str10, (String) null, 0, 1, true));
            hashMap2.put("collectionName", new SJE("collectionName", str10, (String) null, 0, 1, true));
            hashMap2.put("syncedAt", new SJE("syncedAt", "INTEGER", (String) null, 0, 1, true));
            hashMap2.put("lastSyncedNextCursor", new SJE("lastSyncedNextCursor", "TEXT", (String) null, 0, 1, false));
            hashMap2.put("hasMore", new SJE("hasMore", "INTEGER", (String) null, 0, 1, true));
            String str11 = "collectionId";
            String str12 = "TEXT";
            hashMap2.put("collectionId", new SJE(str11, str12, (String) null, 1, 1, true));
            xd6 = new C21501Xd6("effect_collections", hashMap2, new HashSet(0), new HashSet(0));
            A002 = RS9.A00(r6, "effect_collections");
            if (!xd6.equals(A002)) {
                sb = new StringBuilder();
                str = "effect_collections(com.instagram.ar.core.effectcollection.persistence.room.EffectCollectionEntity).\n Expected:\n";
            } else {
                HashMap hashMap3 = new HashMap(3);
                hashMap3.put("collectionId", new SJE(str11, str12, (String) null, 1, 1, true));
                hashMap3.put("effectId", new SJE("effectId", str12, (String) null, 2, 1, true));
                hashMap3.put("order", new SJE("order", "INTEGER", (String) null, 0, 1, true));
                HashSet hashSet = new HashSet(0);
                HashSet hashSet2 = new HashSet(1);
                hashSet2.add(new S6D("index_effect_collections_effects_order", Arrays.asList(new String[]{"order"}), Arrays.asList(new String[]{"ASC"}), false));
                xd6 = new C21501Xd6("effect_collections_effects", hashMap3, hashSet, hashSet2);
                A002 = RS9.A00(r6, "effect_collections_effects");
                if (xd6.equals(A002)) {
                    return new C21382XZp(true, (String) null);
                }
                sb = new StringBuilder();
                str = "effect_collections_effects(com.instagram.ar.core.effectcollection.persistence.room.EffectCollectionCameraAREffectCrossRefEntity).\n Expected:\n";
            }
        }
        sb.append(str);
        sb.append(xd6);
        sb.append("\n Found:\n");
        sb.append(A002);
        return new C21382XZp(false, sb.toString());
    }

    public final void onPreMigrate(1W6 r1) {
        1wT.A01(r1);
    }
}
