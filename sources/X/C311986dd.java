package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.6dd  reason: invalid class name and case insensitive filesystem */
public final class C311986dd extends 1Vf {
    public final /* synthetic */ C311976dc A00;

    public final String createQuery() {
        return "INSERT OR REPLACE INTO `effects` (`effectId`,`effectPackageId`,`effectFileId`,`isDraft`,`isNetworkConsentRequired`,`isUserSafetyWarningRequired`,`usesFlmCapability`,`isAnimatedPhotoEffect`,`cacheKey`,`compressionType`,`title`,`assetUrl`,`filesizeBytes`,`uncompressedFileSizeBytes`,`md5Hash`,`thumbnailUrl`,`transparentBackgroundThumbnailUrl`,`instructionList`,`restrictionSet`,`isInternalOnly`,`capabilitiesSet`,`type`,`badgeState`,`attributionId`,`attributionUserName`,`attributionProfileImageUrl`,`capabilityMinVersion`,`effectInfoUIOptions`,`effectInfoUISecondaryOptions`,`saveStatus`,`effectManifestJson`,`previewVideoMedia`,`effectFileContents`,`useHandsFree`,`handsFreeDurationMs`,`isCreativeTool`,`creativeToolDescription`,`isEncrypted`,`syncedAt`,`shaderPackMetadata`,`productCapabilities`,`fanClubId`,`formattedMediaCount`,`formattedMediaCountAccessibility`,`avatarSdkPresetGlb`,`requiredSdkVersion`,`bestInstanceId`,`avatarType`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C311986dd(C251983oI r1, C311976dc r2) {
        super(r1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ void bind(AnonymousClass1WV r8, Object obj) {
        String str;
        String str2;
        String str3;
        C346147ug r9 = (C346147ug) obj;
        r8.ADh(1, r9.A0L);
        String str4 = r9.A0N;
        if (str4 == null) {
            r8.ADb(2);
        } else {
            r8.ADh(2, str4);
        }
        r8.ADh(3, r9.A0K);
        r8.ADa(4, r9.A0g ? 1 : 0);
        r8.ADa(5, r9.A0j ? 1 : 0);
        r8.ADa(6, r9.A00 ? 1 : 0);
        r8.ADa(7, r9.A0l ? 1 : 0);
        r8.ADa(8, r9.A0e ? 1 : 0);
        String str5 = r9.A0H;
        if (str5 == null) {
            r8.ADb(9);
        } else {
            r8.ADh(9, str5);
        }
        r8.ADh(10, r9.A0I);
        r8.ADh(11, r9.A0U);
        r8.ADh(12, r9.A0B);
        r8.ADa(13, r9.A04);
        r8.ADa(14, r9.A06);
        String str6 = r9.A0R;
        if (str6 == null) {
            r8.ADb(15);
        } else {
            r8.ADh(15, str6);
        }
        String url = r9.A09.getUrl();
        if (url == null) {
            r8.ADb(16);
        } else {
            r8.ADh(16, url);
        }
        ImageUrl imageUrl = r9.A0A;
        if (imageUrl != null) {
            str = imageUrl.getUrl();
        } else {
            str = null;
        }
        if (str == null) {
            r8.ADb(17);
        } else {
            r8.ADh(17, str);
        }
        r8.ADh(18, 00k.A0P("␞", "", "", r9.A0a, C348807z3.A00));
        r8.ADh(19, 00k.A0P(",", "", "", r9.A0d, (0sP) null));
        r8.ADa(20, r9.A0i ? 1 : 0);
        r8.ADh(21, 00k.A0P(",", "", "", r9.A0c, (0sP) null));
        r8.ADh(22, r9.A0V);
        r8.ADa(23, (long) r9.A01);
        String str7 = r9.A0C;
        if (str7 == null) {
            r8.ADb(24);
        } else {
            r8.ADh(24, str7);
        }
        String str8 = r9.A0D;
        if (str8 == null) {
            r8.ADb(25);
        } else {
            r8.ADh(25, str8);
        }
        ImageUrl imageUrl2 = r9.A07;
        if (imageUrl2 != null) {
            str2 = imageUrl2.getUrl();
        } else {
            str2 = null;
        }
        if (str2 == null) {
            r8.ADb(26);
        } else {
            r8.ADh(26, str2);
        }
        r8.ADh(27, 00k.A0P("␞", "", "", r9.A0W, C348817z4.A00));
        r8.ADh(28, 00k.A0P(",", "", "", r9.A0Y, (0sP) null));
        r8.ADh(29, 00k.A0P(",", "", "", r9.A0Z, (0sP) null));
        r8.ADa(30, (long) r9.A03);
        String str9 = r9.A0M;
        if (str9 == null) {
            r8.ADb(31);
        } else {
            r8.ADh(31, str9);
        }
        String url2 = r9.A08.getUrl();
        if (url2 == null) {
            r8.ADb(32);
        } else {
            r8.ADh(32, url2);
        }
        List list = r9.A0X;
        if (list != null) {
            str3 = 00k.A0P("␞", "", "", list, C348827z5.A00);
        } else {
            str3 = null;
        }
        if (str3 == null) {
            r8.ADb(33);
        } else {
            r8.ADh(33, str3);
        }
        r8.ADa(34, r9.A0k ? 1 : 0);
        r8.ADa(35, (long) r9.A02);
        r8.ADa(36, r9.A0f ? 1 : 0);
        String str10 = r9.A0J;
        if (str10 == null) {
            r8.ADb(37);
        } else {
            r8.ADh(37, str10);
        }
        r8.ADa(38, r9.A0h ? 1 : 0);
        r8.ADa(39, r9.A05);
        String str11 = r9.A0T;
        if (str11 == null) {
            r8.ADb(40);
        } else {
            r8.ADh(40, str11);
        }
        r8.ADh(41, 00k.A0P(",", "", "", r9.A0b, (0sP) null));
        String str12 = r9.A0O;
        if (str12 == null) {
            r8.ADb(42);
        } else {
            r8.ADh(42, str12);
        }
        String str13 = r9.A0P;
        if (str13 == null) {
            r8.ADb(43);
        } else {
            r8.ADh(43, str13);
        }
        String str14 = r9.A0Q;
        if (str14 == null) {
            r8.ADb(44);
        } else {
            r8.ADh(44, str14);
        }
        String str15 = r9.A0E;
        if (str15 == null) {
            r8.ADb(45);
        } else {
            r8.ADh(45, str15);
        }
        String str16 = r9.A0S;
        if (str16 == null) {
            r8.ADb(46);
        } else {
            r8.ADh(46, str16);
        }
        String str17 = r9.A0G;
        if (str17 == null) {
            r8.ADb(47);
        } else {
            r8.ADh(47, str17);
        }
        String str18 = r9.A0F;
        if (str18 == null) {
            r8.ADb(48);
        } else {
            r8.ADh(48, str18);
        }
    }
}
