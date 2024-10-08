package X;

import android.os.Parcelable;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.InstagramAudioApplySource;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.user.model.User;
import java.io.IOException;

/* renamed from: X.JUp  reason: case insensitive filesystem */
public abstract class C59707JUp {
    public static AudioOverlayTrack parseFromJson(16F r5) {
        AnonymousClass8IJ r1;
        0qQ.A0B(r5, 0);
        try {
            AudioOverlayTrack audioOverlayTrack = new AudioOverlayTrack();
            if (r5.A11() != 16L.A0D) {
                r5.A0z();
                return null;
            }
            while (r5.A1J() != 16L.A09) {
                String A0q = r5.A0q();
                r5.A1J();
                if ("snippet_start_time_ms".equals(A0q)) {
                    audioOverlayTrack.A03 = r5.A1D();
                } else if ("snippet_duration_ms".equals(A0q)) {
                    audioOverlayTrack.A02 = r5.A1D();
                } else if ("start_time_in_video_ms".equals(A0q)) {
                    audioOverlayTrack.A04 = r5.A1D();
                } else if ("end_time_in_video_ms".equals(A0q)) {
                    audioOverlayTrack.A01 = r5.A1D();
                } else {
                    String str = null;
                    if ("audio_cluster_id".equals(A0q)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        audioOverlayTrack.A0B = str;
                    } else if ("audio_asset_id".equals(A0q)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        audioOverlayTrack.A0A = str;
                    } else if ("original_sound_media_id".equals(A0q)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        audioOverlayTrack.A0E = str;
                    } else if ("music_browser_category".equals(A0q)) {
                        audioOverlayTrack.A09 = LJP.parseFromJson(r5);
                    } else if ("music_asset".equals(A0q)) {
                        audioOverlayTrack.A08 = C59708JUq.parseFromJson(r5);
                    } else if ("downloaded_track".equals(A0q)) {
                        audioOverlayTrack.A06 = C59709JUr.parseFromJson(r5);
                    } else if ("audio_filter".equals(A0q)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        0qQ.A0B(str, 0);
                        try {
                            r1 = AnonymousClass8IJ.valueOf(str);
                        } catch (IllegalArgumentException unused) {
                            r1 = null;
                        }
                        audioOverlayTrack.A05 = r1;
                    } else if ("volume".equals(A0q)) {
                        audioOverlayTrack.A00 = (float) r5.A0U();
                    } else if ("audio_platform_app_id".equals(A0q)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        audioOverlayTrack.A0C = str;
                    } else if ("audio_apply_source".equals(A0q)) {
                        if (r5.A11() != 16L.A0G) {
                            str = r5.A1P();
                        }
                        audioOverlayTrack.A07 = C63346KvT.A00(str);
                    }
                }
                r5.A0z();
            }
            return audioOverlayTrack;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }

    public static void A00(17Z r3, AudioOverlayTrack audioOverlayTrack) {
        r3.A0c();
        r3.A0P("snippet_start_time_ms", audioOverlayTrack.A03);
        r3.A0P("snippet_duration_ms", audioOverlayTrack.A02);
        r3.A0P("start_time_in_video_ms", audioOverlayTrack.A04);
        r3.A0P("end_time_in_video_ms", audioOverlayTrack.A01);
        String str = audioOverlayTrack.A0B;
        if (str != null) {
            r3.A0R("audio_cluster_id", str);
        }
        String str2 = audioOverlayTrack.A0A;
        if (str2 != null) {
            r3.A0R("audio_asset_id", str2);
        }
        String str3 = audioOverlayTrack.A0E;
        if (str3 != null) {
            r3.A0R("original_sound_media_id", str3);
        }
        if (audioOverlayTrack.A09 != null) {
            r3.A0q("music_browser_category");
            LJP.A00(r3, audioOverlayTrack.A09);
        }
        if (audioOverlayTrack.A08 != null) {
            r3.A0q("music_asset");
            MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
            r3.A0c();
            String str4 = musicAssetModel.A0E;
            if (str4 != null) {
                r3.A0R("audio_asset_id", str4);
            }
            String str5 = musicAssetModel.A0B;
            if (str5 != null) {
                r3.A0R("audio_cluster_id", str5);
            }
            String str6 = musicAssetModel.A0H;
            if (str6 != null) {
                r3.A0R("progressive_download_url", str6);
            }
            String str7 = musicAssetModel.A0C;
            if (str7 != null) {
                r3.A0R("dash_manifest", str7);
            }
            if (musicAssetModel.A0J != null) {
                16P.A03(r3, "highlight_start_times_in_ms");
                for (Number number : musicAssetModel.A0J) {
                    if (number != null) {
                        r3.A0g(number.intValue());
                    }
                }
                r3.A0Y();
            }
            String str8 = musicAssetModel.A0I;
            if (str8 != null) {
                r3.A0R(DialogModule.KEY_TITLE, str8);
            }
            if (musicAssetModel.A06 != null) {
                r3.A0q("ig_artist");
                User user = musicAssetModel.A06;
                Parcelable.Creator creator = User.CREATOR;
                1aC.A08(r3, user);
            }
            String str9 = musicAssetModel.A0D;
            if (str9 != null) {
                r3.A0R("display_artist", str9);
            }
            String str10 = musicAssetModel.A0A;
            if (str10 != null) {
                r3.A0R("artist_id", str10);
            }
            if (musicAssetModel.A02 != null) {
                r3.A0q("cover_artwork_uri");
                16h.A01(r3, musicAssetModel.A02);
            }
            if (musicAssetModel.A03 != null) {
                r3.A0q("cover_artwork_thumbnail_uri");
                16h.A01(r3, musicAssetModel.A03);
            }
            r3.A0P("duration_in_ms", musicAssetModel.A00);
            r3.A0S("is_explicit", musicAssetModel.A0S);
            r3.A0S("is_eligible_for_audio_effects", musicAssetModel.A0Q);
            r3.A0S("is_eligible_for_vinyl_sticker", musicAssetModel.A0R);
            r3.A0S("has_lyrics", musicAssetModel.A0O);
            r3.A0S("is_original_sound", musicAssetModel.A0U);
            r3.A0S("allows_saving", musicAssetModel.A0L);
            String str11 = musicAssetModel.A0G;
            if (str11 != null) {
                r3.A0R("original_sound_media_id", str11);
            }
            String str12 = musicAssetModel.A09;
            if (str12 != null) {
                r3.A0R("alacorn_session_id", str12);
            }
            r3.A0S("is_bookmarked", musicAssetModel.A0P);
            r3.A0S("can_remix_be_shared_to_fb", musicAssetModel.A0M);
            r3.A0S("can_remix_be_shared_to_fb_expansion", musicAssetModel.A0N);
            r3.A0S("is_local_audio", musicAssetModel.A0T);
            String str13 = musicAssetModel.A0F;
            if (str13 != null) {
                r3.A0R(AnonymousClass000.A00(48), str13);
            }
            r3.A0Z();
        }
        if (audioOverlayTrack.A06 != null) {
            r3.A0q("downloaded_track");
            DownloadedTrack downloadedTrack = audioOverlayTrack.A06;
            r3.A0c();
            r3.A0R("track_file_path", downloadedTrack.A02);
            r3.A0P("partial_track_start_offset_ms", downloadedTrack.A01);
            r3.A0P("partial_track_duration_offset_ms", downloadedTrack.A00);
            r3.A0Z();
        }
        AnonymousClass8IJ r0 = audioOverlayTrack.A05;
        if (r0 != null) {
            r3.A0R("audio_filter", r0.name());
        }
        r3.A0O("volume", audioOverlayTrack.A00);
        String str14 = audioOverlayTrack.A0C;
        if (str14 != null) {
            r3.A0R("audio_platform_app_id", str14);
        }
        InstagramAudioApplySource instagramAudioApplySource = audioOverlayTrack.A07;
        if (instagramAudioApplySource != null) {
            r3.A0R("audio_apply_source", String.valueOf(instagramAudioApplySource.A00));
        }
        r3.A0Z();
    }
}
