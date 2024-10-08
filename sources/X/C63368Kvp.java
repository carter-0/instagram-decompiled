package X;

import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.BrandedContentProjectMetadata;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.common.gallery.metadata.ImmersiveMediaFields;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import com.instagram.pendingmedia.model.BrandedContentTag;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

/* renamed from: X.Kvp  reason: case insensitive filesystem */
public abstract class C63368Kvp {
    public static final LBT A00(AnonymousClass3Q2 r62) {
        List list;
        String str;
        List list2;
        List list3;
        AnonymousClass3Q2 r2 = r62;
        0qQ.A0B(r2, 0);
        BrandedContentGatingInfo brandedContentGatingInfo = null;
        if (r2.A0v != null) {
            BrandedContentGatingInfo brandedContentGatingInfo2 = null;
            BrandedContentProjectMetadata brandedContentProjectMetadata = null;
            BrandedContentTag brandedContentTag = null;
            List list4 = null;
            boolean z = false;
            Boolean bool = null;
            List list5 = null;
            MediaUploadMetadata mediaUploadMetadata = new MediaUploadMetadata((ImmersiveMediaFields) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, false);
            C279294yP r16 = C279294yP.NONE;
            String str2 = r2.A2Z;
            C272044k0 r622 = r2.A0u;
            int i = r2.A0K;
            List list6 = r2.A4G;
            0qQ.A0B(list6, 0);
            ClipInfo clipInfo = r2.A1N;
            0qQ.A0B(clipInfo, 0);
            double d = (double) r2.A05;
            boolean z2 = r2.A5F;
            boolean z3 = r2.A62;
            AnonymousClass3QG r4 = r2.A1i;
            0qQ.A0B(r4, 0);
            C273884nL r22 = r2.A1a;
            HashMap hashMap = r2.A44;
            HashMap hashMap2 = r2.A46;
            String str3 = r2.A2W;
            MusicOverlayStickerModel musicOverlayStickerModel = r2.A1J;
            String str4 = r2.A3C;
            A6E a6e = r2.A18;
            if (a6e != null) {
                list5 = a6e.A02;
            }
            MediaGenAIDetectionMethod mediaGenAIDetectionMethod = r2.A0w;
            boolean A0o = r2.A0o();
            if (r2.A5i) {
                bool = AnonymousClass7TE.A0v();
            }
            List list7 = r2.A4C;
            if (list7 != null) {
                list4 = list7;
            }
            BrandedContentTag A08 = r2.A08();
            if (A08 != null) {
                brandedContentTag = A08;
            }
            BrandedContentGatingInfo brandedContentGatingInfo3 = r2.A0s;
            if (brandedContentGatingInfo3 != null && (r2.A5i || r2.A0t != null || r2.A0p() || r2.A0x() || r2.A0v())) {
                brandedContentGatingInfo2 = brandedContentGatingInfo3;
            }
            BrandedContentProjectMetadata brandedContentProjectMetadata2 = r2.A0t;
            if (brandedContentProjectMetadata2 != null) {
                brandedContentProjectMetadata = brandedContentProjectMetadata2;
            }
            if (r2.A51) {
                z = true;
            }
            String str5 = r2.A3L;
            if (str5 != null) {
                List A0o2 = DbW.A0o(str5, "/");
                if (!A0o2.isEmpty()) {
                    ListIterator A18 = C51968G9o.A18(A0o2);
                    while (true) {
                        if (A18.hasPrevious()) {
                            if (DbX.A06(A18) != 0) {
                                list3 = DbX.A0y(A0o2, A18);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                list3 = 0sn.A00;
                list3.toArray(new String[0]);
            }
            return C59794JYn.A00(r16, (AnonymousClass9J6) null, (C61069Jw7) null, brandedContentGatingInfo2, brandedContentProjectMetadata, r622, mediaGenAIDetectionMethod, mediaUploadMetadata, (AnonymousClass3QO) null, (InstagramAudioApplySource) null, musicOverlayStickerModel, brandedContentTag, clipInfo, r22, (C63739L4x) null, r4, bool, (Boolean) null, (Boolean) null, (Boolean) null, (String) null, str3, str2, (String) null, (String) null, str4, (String) null, (String) null, r2.A3J, hashMap, hashMap2, list4, list6, list5, d, r2.A0G, r2.A0H, i, z, false, z2, false, false, z3, A0o);
        }
        BrandedContentProjectMetadata brandedContentProjectMetadata3 = null;
        BrandedContentTag brandedContentTag2 = null;
        List list8 = null;
        boolean z4 = false;
        String str6 = null;
        boolean z5 = false;
        boolean z6 = null;
        AnonymousClass3QO r222 = null;
        String str7 = r2.A2Z;
        C272044k0 r623 = r2.A0u;
        int i2 = r2.A0K;
        List list9 = r2.A4G;
        0qQ.A0B(list9, 0);
        ClipInfo clipInfo2 = r2.A1N;
        0qQ.A0B(clipInfo2, 0);
        double d2 = (double) r2.A05;
        boolean z7 = r2.A5F;
        boolean z8 = r2.A62;
        AnonymousClass3QG r6 = r2.A1i;
        0qQ.A0B(r6, 0);
        C273884nL r27 = r2.A1a;
        HashMap hashMap3 = r2.A44;
        HashMap hashMap4 = r2.A46;
        String str8 = r2.A2W;
        MusicOverlayStickerModel musicOverlayStickerModel2 = r2.A1J;
        AnonymousClass9J6 r60 = r2.A0k;
        Boolean valueOf = Boolean.valueOf(r2.A67);
        String str9 = r2.A3C;
        Boolean bool2 = r2.A1z;
        String str10 = r2.A2P;
        InstagramAudioApplySource instagramAudioApplySource = r2.A1I;
        String str11 = r2.A3D;
        C61069Jw7 jw7 = r2.A0n;
        boolean z9 = r2.A5e;
        String str12 = r2.A3E;
        String str13 = r2.A32;
        boolean z10 = r2.A5A;
        MediaUploadMetadata mediaUploadMetadata2 = r2.A13;
        0qQ.A0B(mediaUploadMetadata2, 0);
        A6E a6e2 = r2.A18;
        if (a6e2 != null) {
            list = a6e2.A02;
        } else {
            list = null;
        }
        MediaGenAIDetectionMethod mediaGenAIDetectionMethod2 = r2.A0w;
        C63739L4x l4x = r2.A1c;
        Boolean bool3 = r2.A1x;
        C279294yP r42 = r2.A0h;
        if (r42 == null) {
            r42 = C279294yP.NONE;
        }
        AnonymousClass3QO r1 = r2.A1F;
        if (r1 != null && r1 != AnonymousClass3QO.FAN_CLUB) {
            r222 = r1;
        } else if (r1 == AnonymousClass3QO.FAN_CLUB && (str = r2.A2q) != null) {
            z5 = true;
            str6 = str;
        }
        boolean A0o3 = r2.A0o();
        if (r2.A5i) {
            z6 = true;
        }
        List list10 = r2.A4C;
        if (list10 != null) {
            list8 = list10;
        }
        BrandedContentTag A082 = r2.A08();
        if (A082 != null) {
            brandedContentTag2 = A082;
        }
        BrandedContentGatingInfo brandedContentGatingInfo4 = r2.A0s;
        if (brandedContentGatingInfo4 != null && (r2.A5i || r2.A0t != null || r2.A0p() || r2.A0x() || r2.A0v())) {
            brandedContentGatingInfo = brandedContentGatingInfo4;
        }
        BrandedContentProjectMetadata brandedContentProjectMetadata4 = r2.A0t;
        if (brandedContentProjectMetadata4 != null) {
            brandedContentProjectMetadata3 = brandedContentProjectMetadata4;
        }
        if (r2.A51) {
            z4 = true;
        }
        String str14 = r2.A3L;
        if (str14 != null) {
            List A0o4 = DbW.A0o(str14, "/");
            if (!A0o4.isEmpty()) {
                ListIterator A182 = C51968G9o.A18(A0o4);
                while (true) {
                    if (A182.hasPrevious()) {
                        if (DbX.A06(A182) != 0) {
                            list2 = DbX.A0y(A0o4, A182);
                            break;
                        }
                    } else {
                        break;
                    }
                }
                list2.toArray(new String[0]);
            }
            list2 = 0sn.A00;
            list2.toArray(new String[0]);
        }
        return C59794JYn.A00(r42, r60, jw7, brandedContentGatingInfo, brandedContentProjectMetadata3, r623, mediaGenAIDetectionMethod2, mediaUploadMetadata2, r222, instagramAudioApplySource, musicOverlayStickerModel2, brandedContentTag2, clipInfo2, r27, l4x, r6, z6, bool3, bool2, valueOf, str10, str8, str7, str6, str13, str9, str11, str12, r2.A3J, hashMap3, hashMap4, list8, list9, list, d2, r2.A0G, r2.A0H, i2, z4, z10, z7, z5, z9, z8, A0o3);
    }
}
