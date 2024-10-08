package X;

import android.os.Parcelable;
import com.instagram.api.schemas.AudioFilterInfo;
import com.instagram.api.schemas.MusicCanonicalType;
import com.instagram.api.schemas.OriginalAudioPartMetadata;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.53d  reason: invalid class name */
public abstract class AnonymousClass53d {
    public static OriginalAudioPartMetadata parseFromJson(16F r34) {
        String str;
        16F r8 = r34;
        0qQ.A0B(r8, 0);
        try {
            Integer num = null;
            if (r8.A11() != 16L.A0D) {
                r8.A0z();
                return null;
            }
            Integer num2 = null;
            Boolean bool = null;
            ArrayList arrayList = null;
            Boolean bool2 = null;
            MusicCanonicalType musicCanonicalType = null;
            String str2 = null;
            String str3 = null;
            Integer num3 = null;
            User user = null;
            Boolean bool3 = null;
            String str4 = null;
            SimpleImageUrl simpleImageUrl = null;
            while (r8.A1J() != 16L.A09) {
                String A0q = r8.A0q();
                r8.A1J();
                if ("audio_filter_infos".equals(A0q)) {
                    if (r8.A11() == 16L.A0C) {
                        arrayList = new ArrayList();
                        while (r8.A1J() != 16L.A08) {
                            AudioFilterInfo parseFromJson = AAM.parseFromJson(r8);
                            if (parseFromJson != null) {
                                arrayList.add(parseFromJson);
                            }
                        }
                    } else {
                        arrayList = null;
                    }
                } else if ("audio_start_time_in_ms".equals(A0q)) {
                    num = Integer.valueOf(r8.A1D());
                } else if ("audio_type".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str = null;
                    } else {
                        str = r8.A1P();
                    }
                    musicCanonicalType = (MusicCanonicalType) MusicCanonicalType.A01.get(str);
                    if (musicCanonicalType == null) {
                        musicCanonicalType = MusicCanonicalType.A06;
                    }
                } else if ("display_artist".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str2 = null;
                    } else {
                        str2 = r8.A1P();
                    }
                } else if ("display_title".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str3 = null;
                    } else {
                        str3 = r8.A1P();
                    }
                } else if ("duration_in_ms".equals(A0q)) {
                    num2 = Integer.valueOf(r8.A1D());
                } else if ("ig_artist".equals(A0q)) {
                    Parcelable.Creator creator = User.CREATOR;
                    user = 1aC.A00(r8, false);
                } else if ("is_bookmarked".equals(A0q)) {
                    bool = Boolean.valueOf(r8.A0d());
                } else if ("is_eligible_for_audio_effects".equals(A0q)) {
                    bool3 = Boolean.valueOf(r8.A0d());
                } else if ("is_explicit".equals(A0q)) {
                    bool2 = Boolean.valueOf(r8.A0d());
                } else if ("music_canonical_id".equals(A0q)) {
                    if (r8.A11() == 16L.A0G) {
                        str4 = null;
                    } else {
                        str4 = r8.A1P();
                    }
                } else if ("parent_start_time_in_ms".equals(A0q)) {
                    num3 = Integer.valueOf(r8.A1D());
                } else if ("thumbnail_uri".equals(A0q)) {
                    simpleImageUrl = 16h.A00(r8);
                }
                r8.A0z();
            }
            if (num == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("audio_start_time_in_ms", "OriginalAudioPartMetadata");
            } else if (musicCanonicalType == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("audio_type", "OriginalAudioPartMetadata");
            } else if (str2 == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("display_artist", "OriginalAudioPartMetadata");
            } else if (str3 == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("display_title", "OriginalAudioPartMetadata");
            } else if (num2 == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("duration_in_ms", "OriginalAudioPartMetadata");
            } else if (bool == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("is_bookmarked", "OriginalAudioPartMetadata");
            } else if (bool2 == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("is_explicit", "OriginalAudioPartMetadata");
            } else if (str4 == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("music_canonical_id", "OriginalAudioPartMetadata");
            } else if (num3 == null && (r8 instanceof 0c9)) {
                ((0c9) r8).A03.A00("parent_start_time_in_ms", "OriginalAudioPartMetadata");
            } else if (simpleImageUrl != null || !(r8 instanceof 0c9)) {
                return new OriginalAudioPartMetadata(musicCanonicalType, simpleImageUrl, user, bool3, str2, str3, str4, arrayList, num.intValue(), num2.intValue(), num3.intValue(), bool.booleanValue(), bool2.booleanValue());
            } else {
                ((0c9) r8).A03.A00("thumbnail_uri", "OriginalAudioPartMetadata");
            }
            throw AnonymousClass00P.createAndThrow();
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }

    public static void A00(17Z r2, OriginalAudioPartMetadata originalAudioPartMetadata) {
        r2.A0c();
        List<AudioFilterInfo> list = originalAudioPartMetadata.A0A;
        if (list != null) {
            16P.A03(r2, "audio_filter_infos");
            for (AudioFilterInfo audioFilterInfo : list) {
                if (audioFilterInfo != null) {
                    AAM.A00(r2, audioFilterInfo);
                }
            }
            r2.A0Y();
        }
        r2.A0P("audio_start_time_in_ms", originalAudioPartMetadata.A00);
        MusicCanonicalType musicCanonicalType = originalAudioPartMetadata.A03;
        if (musicCanonicalType != null) {
            r2.A0R("audio_type", musicCanonicalType.A00);
        }
        String str = originalAudioPartMetadata.A07;
        if (str != null) {
            r2.A0R("display_artist", str);
        }
        String str2 = originalAudioPartMetadata.A08;
        if (str2 != null) {
            r2.A0R("display_title", str2);
        }
        r2.A0P("duration_in_ms", originalAudioPartMetadata.A01);
        User user = originalAudioPartMetadata.A05;
        if (user != null) {
            r2.A0q("ig_artist");
            Parcelable.Creator creator = User.CREATOR;
            1aC.A08(r2, user);
        }
        r2.A0S("is_bookmarked", originalAudioPartMetadata.A0B);
        Boolean bool = originalAudioPartMetadata.A06;
        if (bool != null) {
            r2.A0S("is_eligible_for_audio_effects", bool.booleanValue());
        }
        r2.A0S("is_explicit", originalAudioPartMetadata.A0C);
        String str3 = originalAudioPartMetadata.A09;
        if (str3 != null) {
            r2.A0R("music_canonical_id", str3);
        }
        r2.A0P("parent_start_time_in_ms", originalAudioPartMetadata.A02);
        ImageUrl imageUrl = originalAudioPartMetadata.A04;
        if (imageUrl != null) {
            r2.A0q("thumbnail_uri");
            16h.A01(r2, imageUrl);
        }
        r2.A0Z();
    }
}
