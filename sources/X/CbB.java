package X;

import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.AudioFilterInfoIntf;
import com.instagram.api.schemas.ImmutablePandoOriginalSoundData;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.api.schemas.OriginalSoundConsumptionInfo;
import com.instagram.api.schemas.OriginalSoundConsumptionInfoIntf;
import com.instagram.api.schemas.OriginalSoundData;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfo;
import com.instagram.api.schemas.XpostOriginalSoundFBCreatorInfoImpl;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public abstract class CbB {
    public static OriginalSoundDataIntf A00(OriginalAudioSubtype originalAudioSubtype, OriginalSoundConsumptionInfoIntf originalSoundConsumptionInfoIntf, OriginalSoundDataIntf originalSoundDataIntf, XpostOriginalSoundFBCreatorInfo xpostOriginalSoundFBCreatorInfo, User user, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8, Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        TreeJNI treeJNI;
        XpostOriginalSoundFBCreatorInfoImpl xpostOriginalSoundFBCreatorInfoImpl;
        ArrayList arrayList;
        ArrayList arrayList2;
        TreeUpdaterJNI treeUpdaterJNI = null;
        new 1E9(new 1hu((UserSession) null), 6, false);
        OriginalSoundDataIntf originalSoundDataIntf2 = originalSoundDataIntf;
        Integer num7 = num2;
        Boolean bool9 = bool8;
        Boolean bool10 = bool7;
        Boolean bool11 = bool6;
        Boolean bool12 = bool5;
        Boolean bool13 = bool4;
        Boolean bool14 = bool3;
        Boolean bool15 = bool2;
        Boolean bool16 = bool;
        User user2 = user;
        boolean z6 = z5;
        boolean z7 = z3;
        Integer num8 = num;
        OriginalAudioSubtype originalAudioSubtype2 = originalAudioSubtype;
        boolean z8 = z;
        boolean z9 = z4;
        String str8 = str;
        boolean z10 = z2;
        Integer num9 = num5;
        String str9 = str7;
        String str10 = str6;
        String str11 = str5;
        String str12 = str4;
        String str13 = str3;
        String str14 = str2;
        Integer num10 = num6;
        Integer num11 = num4;
        Integer num12 = num3;
        if (originalSoundDataIntf2 instanceof ImmutablePandoOriginalSoundData) {
            0eP[] r4 = new 0eP[33];
            0eP A1L = AnonymousClass7TE.A1L("allow_creator_to_rename", Boolean.valueOf(z8));
            0eP A1L2 = AnonymousClass7TE.A1L("audio_asset_id", str8);
            0eP A1L3 = AnonymousClass7TE.A1L("audio_asset_start_time_in_ms", num8);
            if (list != null) {
                arrayList = AnonymousClass7TE.A1C();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    AudioFilterInfoIntf audioFilterInfoIntf = (AudioFilterInfoIntf) it.next();
                    if (audioFilterInfoIntf != null) {
                        arrayList.add(audioFilterInfoIntf.FHC());
                    }
                }
            } else {
                arrayList = null;
            }
            0eP A1L4 = AnonymousClass7TE.A1L("audio_filter_infos", arrayList);
            ArrayList A1C = AnonymousClass7TE.A1C();
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf = (OriginalAudioPartMetadataIntf) it2.next();
                if (originalAudioPartMetadataIntf != null) {
                    A1C.add(originalAudioPartMetadataIntf.FHC());
                }
            }
            0eP A1L5 = AnonymousClass7TE.A1L("audio_parts", A1C);
            if (list3 != null) {
                arrayList2 = AnonymousClass7TE.A1C();
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    OriginalAudioPartMetadataIntf originalAudioPartMetadataIntf2 = (OriginalAudioPartMetadataIntf) it3.next();
                    if (originalAudioPartMetadataIntf2 != null) {
                        arrayList2.add(originalAudioPartMetadataIntf2.FHC());
                    }
                }
            } else {
                arrayList2 = null;
            }
            0eP A1L6 = AnonymousClass7TE.A1L("audio_parts_by_filter", arrayList2);
            0eP A1L7 = AnonymousClass7TE.A1L("can_remix_be_shared_to_fb", bool16);
            0eP A1L8 = AnonymousClass7TE.A1L("can_remix_be_shared_to_fb_expansion", bool15);
            0eP A1L9 = AnonymousClass7TE.A1L("consumption_info", originalSoundConsumptionInfoIntf.FHC());
            0eP A1L10 = AnonymousClass7TE.A1L("dash_manifest", str14);
            0eP A1L11 = AnonymousClass7TE.A1L("duration_in_ms", num7);
            0eP A1L12 = AnonymousClass7TE.A1L("formatted_clips_media_count", str13);
            0eP A1L13 = AnonymousClass7TE.A1L("hide_remixing", Boolean.valueOf(z10));
            0eP A1L14 = AnonymousClass7TE.A1L("ig_artist", user2.A08());
            0eP A1L15 = AnonymousClass7TE.A1L("is_audio_automatically_attributed", Boolean.valueOf(z7));
            0eP A1L16 = AnonymousClass7TE.A1L("is_eligible_for_audio_effects", bool14);
            0eP A1L17 = AnonymousClass7TE.A1L("is_eligible_for_vinyl_sticker", bool13);
            0eP A1L18 = AnonymousClass7TE.A1L("is_explicit", Boolean.valueOf(z9));
            0eP A1L19 = AnonymousClass7TE.A1L("is_original_audio_download_eligible", bool12);
            0eP A1L20 = AnonymousClass7TE.A1L("is_reuse_disabled", bool11);
            0eP A1L21 = AnonymousClass7TE.A1L("is_xpost_from_fb", bool10);
            0eP A1L22 = AnonymousClass7TE.A1L("music_canonical_id", str12);
            0eP A1L23 = AnonymousClass7TE.A1L("oa_owner_is_music_artist", bool9);
            0qQ.A0B(originalAudioSubtype2, 0);
            System.arraycopy(new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, A1L6, A1L7, A1L8, A1L9, A1L10, A1L11, A1L12, A1L13, A1L14, A1L15, A1L16, A1L17, A1L18, A1L19, A1L20, A1L21, A1L22, A1L23, AnonymousClass7TE.A1L("original_audio_subtype", originalAudioSubtype2.A00), AnonymousClass7TE.A1L("original_audio_title", str11), AnonymousClass7TE.A1L("original_media_id", str10), AnonymousClass7TE.A1L("overlap_duration_in_ms", num12)}, 0, r4, 0, 27);
            0eP A1L24 = AnonymousClass7TE.A1L("previous_trend_rank", num11);
            0eP A1L25 = AnonymousClass7TE.A1L("progressive_download_url", str9);
            0eP A1L26 = AnonymousClass7TE.A1L("should_mute_audio", Boolean.valueOf(z6));
            0eP A1L27 = AnonymousClass7TE.A1L("time_created", num9);
            0eP A1L28 = AnonymousClass7TE.A1L("trend_rank", num10);
            if (xpostOriginalSoundFBCreatorInfo != null) {
                treeUpdaterJNI = xpostOriginalSoundFBCreatorInfo.FHC();
            }
            System.arraycopy(new 0eP[]{A1L24, A1L25, A1L26, A1L27, A1L28, AnonymousClass7TE.A1L("xpost_fb_creator_info", treeUpdaterJNI)}, 0, r4, 27, 6);
            treeJNI = C41847B3o.A0o(originalSoundDataIntf2, r4);
        } else {
            ArrayList arrayList3 = null;
            1E9 r11 = new 1E9(new 1hu((UserSession) null), 6, false);
            if (list != null) {
                treeUpdaterJNI = AnonymousClass7TF.A0p(list);
                Iterator it4 = list.iterator();
                while (it4.hasNext()) {
                    C41846B3n.A1S(treeUpdaterJNI, it4);
                }
            }
            ArrayList A0p = AnonymousClass7TF.A0p(list2);
            Iterator it5 = list2.iterator();
            while (it5.hasNext()) {
                A0p.add(((OriginalAudioPartMetadataIntf) it5.next()).F7C(r11));
            }
            if (list3 != null) {
                arrayList3 = AnonymousClass7TF.A0p(list3);
                Iterator it6 = list3.iterator();
                while (it6.hasNext()) {
                    arrayList3.add(((OriginalAudioPartMetadataIntf) it6.next()).F7C(r11));
                }
            }
            OriginalSoundConsumptionInfo F7D = originalSoundConsumptionInfoIntf.F7D();
            if (xpostOriginalSoundFBCreatorInfo != null) {
                xpostOriginalSoundFBCreatorInfoImpl = xpostOriginalSoundFBCreatorInfo.FDX();
            } else {
                xpostOriginalSoundFBCreatorInfoImpl = null;
            }
            treeJNI = new OriginalSoundData(originalAudioSubtype2, F7D, xpostOriginalSoundFBCreatorInfoImpl, user2, bool16, bool15, bool14, bool13, bool12, bool11, bool10, bool9, num8, num7, num12, num11, num9, num10, str8, str14, str13, str12, str11, str10, str9, treeUpdaterJNI, A0p, arrayList3, z8, z10, z7, z9, z6);
        }
        return (OriginalSoundDataIntf) treeJNI;
    }
}
