package X;

import android.os.Parcelable;
import com.instagram.api.schemas.AudioFilterInfo;
import com.instagram.api.schemas.AudioMetadataLabels;
import com.instagram.api.schemas.AudioMutingInfo;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.music.common.model.MusicConsumptionModelImpl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.3US  reason: invalid class name */
public abstract class AnonymousClass3US {
    public static MusicConsumptionModelImpl parseFromJson(16F r30) {
        String str;
        String str2;
        16F r1 = r30;
        0qQ.A0B(r1, 0);
        try {
            Boolean bool = null;
            if (r1.A11() != 16L.A0D) {
                r1.A0z();
                return null;
            }
            Boolean bool2 = null;
            Integer num = null;
            ArrayList arrayList = null;
            AudioMutingInfo audioMutingInfo = null;
            Boolean bool3 = null;
            String str3 = null;
            ArrayList arrayList2 = null;
            String str4 = null;
            User user = null;
            Boolean bool4 = null;
            Boolean bool5 = null;
            Integer num2 = null;
            String str5 = null;
            Integer num3 = null;
            Boolean bool6 = null;
            String str6 = null;
            MusicMuteAudioReason musicMuteAudioReason = null;
            Boolean bool7 = null;
            Integer num4 = null;
            while (r1.A1J() != 16L.A09) {
                String A0q = r1.A0q();
                r1.A1J();
                if ("allow_media_creation_with_music".equals(A0q)) {
                    bool2 = Boolean.valueOf(r1.A0d());
                } else if ("audio_asset_start_time_in_ms".equals(A0q)) {
                    num = Integer.valueOf(r1.A1D());
                } else if ("audio_filter_infos".equals(A0q)) {
                    if (r1.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r1.A1J() != 16L.A08) {
                            AudioFilterInfo parseFromJson = AAM.parseFromJson(r1);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("audio_muting_info".equals(A0q)) {
                    audioMutingInfo = AnonymousClass3UT.parseFromJson(r1);
                } else if ("contains_lyrics".equals(A0q)) {
                    bool3 = Boolean.valueOf(r1.A0d());
                } else if ("derived_content_id".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r1.A1P();
                    }
                } else if ("display_labels".equals(A0q)) {
                    if (r1.A11() == 16L.A0C) {
                        arrayList2 = new ArrayList();
                        while (r1.A1J() != 16L.A08) {
                            if (r1.A11() == 16L.A0G) {
                                str2 = null;
                            } else {
                                str2 = r1.A1P();
                            }
                            arrayList2.add(C272264kP.A00(str2));
                        }
                    } else {
                        arrayList2 = null;
                    }
                } else if ("formatted_clips_media_count".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r1.A1P();
                    }
                } else if ("ig_artist".equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = 1aC.A00(r1, false);
                } else if ("is_bookmarked".equals(A0q)) {
                    bool4 = Boolean.valueOf(r1.A0d());
                } else if ("is_trending_in_clips".equals(A0q)) {
                    bool5 = Boolean.valueOf(r1.A0d());
                } else if ("overlap_duration_in_ms".equals(A0q)) {
                    num2 = Integer.valueOf(r1.A1D());
                } else if ("placeholder_profile_pic_url".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str5 = null;
                    } else {
                        str5 = r1.A1P();
                    }
                } else if ("previous_trend_rank".equals(A0q)) {
                    num3 = Integer.valueOf(r1.A1D());
                } else if ("should_allow_music_editing".equals(A0q)) {
                    bool6 = Boolean.valueOf(r1.A0d());
                } else if ("should_mute_audio".equals(A0q)) {
                    bool = Boolean.valueOf(r1.A0d());
                } else if ("should_mute_audio_reason".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str6 = null;
                    } else {
                        str6 = r1.A1P();
                    }
                } else if ("should_mute_audio_reason_type".equals(A0q)) {
                    if (r1.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r1.A1P();
                    }
                    musicMuteAudioReason = 1sE.A00(str);
                } else if ("should_render_soundwave".equals(A0q)) {
                    bool7 = Boolean.valueOf(r1.A0d());
                } else if ("trend_rank".equals(A0q)) {
                    num4 = Integer.valueOf(r1.A1D());
                }
                r1.A0z();
            }
            if (str5 == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("placeholder_profile_pic_url", "MusicConsumptionModelImpl");
            } else if (bool == null && (r1 instanceof 0c9)) {
                ((0c9) r1).A03.A00("should_mute_audio", "MusicConsumptionModelImpl");
            } else if (str6 != null || !(r1 instanceof 0c9)) {
                return new MusicConsumptionModelImpl(audioMutingInfo, musicMuteAudioReason, user, bool2, bool3, bool4, bool5, bool6, bool7, num, num2, num3, num4, str3, str4, str5, str6, arrayList, arrayList2, bool.booleanValue());
            } else {
                ((0c9) r1).A03.A00("should_mute_audio_reason", "MusicConsumptionModelImpl");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, MusicConsumptionModelImpl musicConsumptionModelImpl) {
        r2.A0c();
        Boolean bool = musicConsumptionModelImpl.A03;
        if (bool != null) {
            r2.A0S("allow_media_creation_with_music", bool.booleanValue());
        }
        Integer num = musicConsumptionModelImpl.A09;
        if (num != null) {
            r2.A0P("audio_asset_start_time_in_ms", num.intValue());
        }
        List<AudioFilterInfo> list = musicConsumptionModelImpl.A0H;
        if (list != null) {
            16P.A03(r2, "audio_filter_infos");
            for (AudioFilterInfo audioFilterInfo : list) {
                if (audioFilterInfo != null) {
                    AAM.A00(r2, audioFilterInfo);
                }
            }
            r2.A0Y();
        }
        AudioMutingInfo audioMutingInfo = musicConsumptionModelImpl.A00;
        if (audioMutingInfo != null) {
            r2.A0q("audio_muting_info");
            AnonymousClass3UT.A00(r2, audioMutingInfo);
        }
        Boolean bool2 = musicConsumptionModelImpl.A04;
        if (bool2 != null) {
            r2.A0S("contains_lyrics", bool2.booleanValue());
        }
        String str = musicConsumptionModelImpl.A0D;
        if (str != null) {
            r2.A0R("derived_content_id", str);
        }
        List<AudioMetadataLabels> list2 = musicConsumptionModelImpl.A0I;
        if (list2 != null) {
            16P.A03(r2, "display_labels");
            for (AudioMetadataLabels audioMetadataLabels : list2) {
                if (audioMetadataLabels != null) {
                    r2.A0t(audioMetadataLabels.A00);
                }
            }
            r2.A0Y();
        }
        String str2 = musicConsumptionModelImpl.A0E;
        if (str2 != null) {
            r2.A0R("formatted_clips_media_count", str2);
        }
        User user = musicConsumptionModelImpl.A02;
        if (user != null) {
            r2.A0q("ig_artist");
            Parcelable.Creator creator = User.CREATOR;
            1aC.A08(r2, user);
        }
        Boolean bool3 = musicConsumptionModelImpl.A05;
        if (bool3 != null) {
            r2.A0S("is_bookmarked", bool3.booleanValue());
        }
        Boolean bool4 = musicConsumptionModelImpl.A06;
        if (bool4 != null) {
            r2.A0S("is_trending_in_clips", bool4.booleanValue());
        }
        Integer num2 = musicConsumptionModelImpl.A0A;
        if (num2 != null) {
            r2.A0P("overlap_duration_in_ms", num2.intValue());
        }
        String str3 = musicConsumptionModelImpl.A0F;
        if (str3 != null) {
            r2.A0R("placeholder_profile_pic_url", str3);
        }
        Integer num3 = musicConsumptionModelImpl.A0B;
        if (num3 != null) {
            r2.A0P("previous_trend_rank", num3.intValue());
        }
        Boolean bool5 = musicConsumptionModelImpl.A07;
        if (bool5 != null) {
            r2.A0S("should_allow_music_editing", bool5.booleanValue());
        }
        r2.A0S("should_mute_audio", musicConsumptionModelImpl.A0J);
        String str4 = musicConsumptionModelImpl.A0G;
        if (str4 != null) {
            r2.A0R("should_mute_audio_reason", str4);
        }
        MusicMuteAudioReason musicMuteAudioReason = musicConsumptionModelImpl.A01;
        if (musicMuteAudioReason != null) {
            r2.A0R("should_mute_audio_reason_type", musicMuteAudioReason.A00);
        }
        Boolean bool6 = musicConsumptionModelImpl.A08;
        if (bool6 != null) {
            r2.A0S("should_render_soundwave", bool6.booleanValue());
        }
        Integer num4 = musicConsumptionModelImpl.A0C;
        if (num4 != null) {
            r2.A0P("trend_rank", num4.intValue());
        }
        r2.A0Z();
    }
}
