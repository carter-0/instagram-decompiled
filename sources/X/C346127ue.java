package X;

import android.database.Cursor;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.typedurl.SimpleImageUrl;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;

/* renamed from: X.7ue  reason: invalid class name and case insensitive filesystem */
public final class C346127ue implements Callable {
    public final /* synthetic */ 1WY A00;
    public final /* synthetic */ C311976dc A01;

    public C346127ue(1WY r1, C311976dc r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        String str;
        String str2;
        String str3;
        String str4;
        SimpleImageUrl simpleImageUrl;
        IllegalStateException illegalStateException;
        String str5;
        SimpleImageUrl simpleImageUrl2;
        String str6;
        String str7;
        String str8;
        SimpleImageUrl simpleImageUrl3;
        String str9;
        String str10;
        SimpleImageUrl simpleImageUrl4;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        String str19;
        String str20;
        C251983oI r2 = this.A01.A07;
        1WY r0 = this.A00;
        1WY r108 = r0;
        Cursor A002 = 1wT.A00(r2, r0, false);
        try {
            int A012 = 1Wd.A01(A002, "effectId");
            int A013 = 1Wd.A01(A002, "effectPackageId");
            int A014 = 1Wd.A01(A002, "effectFileId");
            int A015 = 1Wd.A01(A002, "isDraft");
            int A016 = 1Wd.A01(A002, "isNetworkConsentRequired");
            int A017 = 1Wd.A01(A002, "isUserSafetyWarningRequired");
            int A018 = 1Wd.A01(A002, "usesFlmCapability");
            int A019 = 1Wd.A01(A002, "isAnimatedPhotoEffect");
            int A0110 = 1Wd.A01(A002, "cacheKey");
            int A0111 = 1Wd.A01(A002, "compressionType");
            int A0112 = 1Wd.A01(A002, DialogModule.KEY_TITLE);
            int A0113 = 1Wd.A01(A002, "assetUrl");
            int A0114 = 1Wd.A01(A002, "filesizeBytes");
            int A0115 = 1Wd.A01(A002, "uncompressedFileSizeBytes");
            int A0116 = 1Wd.A01(A002, "md5Hash");
            int A0117 = 1Wd.A01(A002, "thumbnailUrl");
            int A0118 = 1Wd.A01(A002, "transparentBackgroundThumbnailUrl");
            int A0119 = 1Wd.A01(A002, "instructionList");
            int A0120 = 1Wd.A01(A002, "restrictionSet");
            int A0121 = 1Wd.A01(A002, "isInternalOnly");
            int A0122 = 1Wd.A01(A002, "capabilitiesSet");
            int A0123 = 1Wd.A01(A002, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            int A0124 = 1Wd.A01(A002, "badgeState");
            int A0125 = 1Wd.A01(A002, "attributionId");
            int A0126 = 1Wd.A01(A002, "attributionUserName");
            int A0127 = 1Wd.A01(A002, "attributionProfileImageUrl");
            int A0128 = 1Wd.A01(A002, "capabilityMinVersion");
            int A0129 = 1Wd.A01(A002, "effectInfoUIOptions");
            int A0130 = 1Wd.A01(A002, "effectInfoUISecondaryOptions");
            int A0131 = 1Wd.A01(A002, "saveStatus");
            int A0132 = 1Wd.A01(A002, "effectManifestJson");
            int A0133 = 1Wd.A01(A002, "previewVideoMedia");
            int A0134 = 1Wd.A01(A002, "effectFileContents");
            int A0135 = 1Wd.A01(A002, "useHandsFree");
            int A0136 = 1Wd.A01(A002, "handsFreeDurationMs");
            int A0137 = 1Wd.A01(A002, "isCreativeTool");
            int A0138 = 1Wd.A01(A002, "creativeToolDescription");
            int A0139 = 1Wd.A01(A002, "isEncrypted");
            int A0140 = 1Wd.A01(A002, "syncedAt");
            int A0141 = 1Wd.A01(A002, "shaderPackMetadata");
            int A0142 = 1Wd.A01(A002, "productCapabilities");
            int A0143 = 1Wd.A01(A002, "fanClubId");
            int A0144 = 1Wd.A01(A002, "formattedMediaCount");
            int A0145 = 1Wd.A01(A002, "formattedMediaCountAccessibility");
            int A0146 = 1Wd.A01(A002, "avatarSdkPresetGlb");
            int A0147 = 1Wd.A01(A002, "requiredSdkVersion");
            int A0148 = 1Wd.A01(A002, "bestInstanceId");
            int A0149 = 1Wd.A01(A002, "avatarType");
            ArrayList arrayList = new ArrayList(A002.getCount());
            while (A002.moveToNext()) {
                String string = A002.getString(A012);
                if (A002.isNull(A013)) {
                    str = null;
                } else {
                    str = A002.getString(A013);
                }
                String string2 = A002.getString(A014);
                boolean z = false;
                if (A002.getInt(A015) != 0) {
                    z = true;
                }
                boolean z2 = false;
                if (A002.getInt(A016) != 0) {
                    z2 = true;
                }
                boolean z3 = false;
                if (A002.getInt(A017) != 0) {
                    z3 = true;
                }
                boolean z4 = false;
                if (A002.getInt(A018) != 0) {
                    z4 = true;
                }
                boolean z5 = false;
                if (A002.getInt(A019) != 0) {
                    z5 = true;
                }
                if (A002.isNull(A0110)) {
                    str2 = null;
                } else {
                    str2 = A002.getString(A0110);
                }
                String string3 = A002.getString(A0111);
                String string4 = A002.getString(A0112);
                String string5 = A002.getString(A0113);
                long j = A002.getLong(A0114);
                long j2 = A002.getLong(A0115);
                if (A002.isNull(A0116)) {
                    str3 = null;
                } else {
                    str3 = A002.getString(A0116);
                }
                if (A002.isNull(A0117)) {
                    str4 = null;
                } else {
                    str4 = A002.getString(A0117);
                }
                if (str4 != null) {
                    simpleImageUrl = new SimpleImageUrl(str4);
                } else {
                    simpleImageUrl = null;
                }
                if (simpleImageUrl != null) {
                    if (A002.isNull(A0118)) {
                        str5 = null;
                    } else {
                        str5 = A002.getString(A0118);
                    }
                    if (str5 != null) {
                        simpleImageUrl2 = new SimpleImageUrl(str5);
                    } else {
                        simpleImageUrl2 = null;
                    }
                    List A02 = C346137uf.A02(A002.getString(A0119));
                    Set A04 = C346137uf.A04(A002.getString(A0120));
                    boolean z6 = false;
                    if (A002.getInt(A0121) != 0) {
                        z6 = true;
                    }
                    Set A042 = C346137uf.A04(A002.getString(A0122));
                    String string6 = A002.getString(A0123);
                    int i = A002.getInt(A0124);
                    if (A002.isNull(A0125)) {
                        str6 = null;
                    } else {
                        str6 = A002.getString(A0125);
                    }
                    if (A002.isNull(A0126)) {
                        str7 = null;
                    } else {
                        str7 = A002.getString(A0126);
                    }
                    if (A002.isNull(A0127)) {
                        str8 = null;
                    } else {
                        str8 = A002.getString(A0127);
                    }
                    if (str8 != null) {
                        simpleImageUrl3 = new SimpleImageUrl(str8);
                    } else {
                        simpleImageUrl3 = null;
                    }
                    List A003 = C346137uf.A00(A002.getString(A0128));
                    List A03 = C346137uf.A03(A002.getString(A0129));
                    List A032 = C346137uf.A03(A002.getString(A0130));
                    int i2 = A002.getInt(A0131);
                    if (A002.isNull(A0132)) {
                        str9 = null;
                    } else {
                        str9 = A002.getString(A0132);
                    }
                    if (A002.isNull(A0133)) {
                        str10 = null;
                    } else {
                        str10 = A002.getString(A0133);
                    }
                    if (str10 != null) {
                        simpleImageUrl4 = new SimpleImageUrl(str10);
                    } else {
                        simpleImageUrl4 = null;
                    }
                    if (simpleImageUrl4 != null) {
                        if (A002.isNull(A0134)) {
                            str11 = null;
                        } else {
                            str11 = A002.getString(A0134);
                        }
                        List A0150 = C346137uf.A01(str11);
                        boolean z7 = false;
                        if (A002.getInt(A0135) != 0) {
                            z7 = true;
                        }
                        int i3 = A002.getInt(A0136);
                        boolean z8 = false;
                        if (A002.getInt(A0137) != 0) {
                            z8 = true;
                        }
                        if (A002.isNull(A0138)) {
                            str12 = null;
                        } else {
                            str12 = A002.getString(A0138);
                        }
                        boolean z9 = false;
                        if (A002.getInt(A0139) != 0) {
                            z9 = true;
                        }
                        long j3 = A002.getLong(A0140);
                        if (A002.isNull(A0141)) {
                            str13 = null;
                        } else {
                            str13 = A002.getString(A0141);
                        }
                        List A033 = C346137uf.A03(A002.getString(A0142));
                        if (A002.isNull(A0143)) {
                            str14 = null;
                        } else {
                            str14 = A002.getString(A0143);
                        }
                        if (A002.isNull(A0144)) {
                            str15 = null;
                        } else {
                            str15 = A002.getString(A0144);
                        }
                        if (A002.isNull(A0145)) {
                            str16 = null;
                        } else {
                            str16 = A002.getString(A0145);
                        }
                        if (A002.isNull(A0146)) {
                            str17 = null;
                        } else {
                            str17 = A002.getString(A0146);
                        }
                        if (A002.isNull(A0147)) {
                            str18 = null;
                        } else {
                            str18 = A002.getString(A0147);
                        }
                        if (A002.isNull(A0148)) {
                            str19 = null;
                        } else {
                            str19 = A002.getString(A0148);
                        }
                        if (A002.isNull(A0149)) {
                            str20 = null;
                        } else {
                            str20 = A002.getString(A0149);
                        }
                        arrayList.add(new C346147ug(simpleImageUrl, simpleImageUrl2, simpleImageUrl3, simpleImageUrl4, string, str, string2, str2, string3, string4, string5, str3, string6, str6, str7, str9, str12, str13, str14, str15, str16, str17, str18, str19, str20, A02, A003, A03, A032, A0150, A033, A04, A042, i, i2, i3, j, j2, j3, z, z2, z3, z4, z5, z6, z7, z8, z9));
                    } else {
                        illegalStateException = new IllegalStateException("Expected NON-NULL 'com.instagram.common.typedurl.ImageUrl', but it was NULL.");
                    }
                } else {
                    illegalStateException = new IllegalStateException("Expected NON-NULL 'com.instagram.common.typedurl.ImageUrl', but it was NULL.");
                }
                throw illegalStateException;
            }
            return arrayList;
        } finally {
            A002.close();
            r108.A00();
        }
    }
}
