package com.facebook.video.common.playerorigin;

import X.0qQ;
import X.C21055XCg;
import X.SWZ;
import X.XRq;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.common.stringformat.StringFormatUtil;
import com.facebook.proxygen.TraceEventType;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import java.util.Arrays;
import java.util.Locale;

public final class PlayerOrigin implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWZ(65);
    public final String A00;
    public final String A01;
    public volatile String A02;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof PlayerOrigin)) {
            return false;
        }
        PlayerOrigin playerOrigin = (PlayerOrigin) obj;
        return 0qQ.A0K(this.A00, playerOrigin.A00) && 0qQ.A0K(this.A01, playerOrigin.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
    }

    static {
        XRq xRq = XRq.A1E;
        C21055XCg.A1Q(xRq, "actor_profile_video");
        XRq xRq2 = XRq.A1J;
        C21055XCg.A1Q(xRq2, "album_feed");
        C21055XCg.A1Q(XRq.A04, "audio_home");
        C21055XCg.A1Q(XRq.A05, "autodownload");
        C21055XCg.A1Q(XRq.A06, "background_play");
        C21055XCg.A1Q(XRq.A07, "bell_multiple");
        C21055XCg.A1Q(XRq.A09, "biz_disco_feed");
        C21055XCg.A1Q(xRq, "carousel_video");
        C21055XCg.A1Q(xRq, "channel_view");
        C21055XCg.A1Q(XRq.A0D, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT);
        XRq xRq3 = XRq.A0F;
        C21055XCg.A1Q(xRq3, "composer");
        C21055XCg.A1Q(xRq3, "music_attachment");
        C21055XCg.A1Q(xRq, "cultural_moments_share");
        C21055XCg.A1Q(xRq, "cm_promotion");
        C21055XCg.A1Q(XRq.A0I, "unknown");
        C21055XCg.A1Q(XRq.A0K, "direct_inbox_production_video");
        XRq xRq4 = XRq.A0N;
        C21055XCg.A1Q(xRq4, "feed_story");
        C21055XCg.A1Q(xRq4, "event_chevron");
        C21055XCg.A1Q(xRq4, "event_cover_video");
        C21055XCg.A1Q(xRq4, "events_live_cta");
        C21055XCg.A1Q(xRq4, "event_pay_to_access_cta");
        C21055XCg.A1Q(xRq4, "event_tour_cover_video");
        XRq xRq5 = XRq.A1L;
        C21055XCg.A1Q(xRq5, "events_tour_card");
        C21055XCg.A1Q(xRq5, "EVENT_MULTI_EVENTS_CARD");
        XRq xRq6 = XRq.A0P;
        C21055XCg.A1Q(xRq6, "huddle_live_audio");
        C21055XCg.A1Q(XRq.A0Q, "facebook_note");
        XRq xRq7 = XRq.A0Z;
        C21055XCg.A1Q(xRq7, "story_tray");
        C21055XCg.A1Q(xRq, "feed_story");
        C21055XCg.A1Q(xRq, "fb_shorts_native_in_feed_unit");
        C21055XCg.A1Q(xRq, "chevron");
        C21055XCg.A1Q(xRq, "video_inline_pivot");
        C21055XCg.A1Q(xRq, "live_ring");
        C21055XCg.A1Q(xRq, "feed_midcard");
        C21055XCg.A1R(xRq, "multimedia_post", "music_attachment");
        XRq xRq8 = XRq.A1G;
        C21055XCg.A1Q(xRq8, "notifications");
        C21055XCg.A1Q(xRq2, "fullscreen_video_uri");
        XRq xRq9 = XRq.A1u;
        C21055XCg.A1Q(xRq9, "global_search_warion");
        XRq xRq10 = XRq.A1e;
        C21055XCg.A1Q(xRq10, "global_search_warion");
        C21055XCg.A1R(XRq.A0k, "feed_story", "chevron");
        C21055XCg.A1Q(XRq.A1Q, "haptic_sound_effect");
        C21055XCg.A1Q(XRq.A0m, "huddle_live_audio");
        C21055XCg.A1Q(xRq2, "inspiration_camera");
        C21055XCg.A1Q(xRq2, "inspiration_remix");
        XRq xRq11 = XRq.A0o;
        C21055XCg.A1Q(xRq11, "instant_articles");
        C21055XCg.A1Q(xRq11, "shared_video_feed_story");
        C21055XCg.A1Q(XRq.A0p, "instant_experience");
        C21055XCg.A1Q(XRq.A0q, "instant_shopping");
        C21055XCg.A1Q(xRq3, "live_video_composer");
        C21055XCg.A1Q(XRq.A0x, "live_video_end_screen");
        C21055XCg.A1Q(xRq9, "live_linear_video_channel");
        C21055XCg.A1Q(XRq.A0y, "living_room");
        C21055XCg.A1Q(XRq.A10, "living_room_comments");
        XRq xRq12 = XRq.A12;
        C21055XCg.A1Q(xRq12, "living_room_recap_fullscreen");
        C21055XCg.A1Q(xRq12, "living_room_recap_inline");
        C21055XCg.A1R(XRq.A13, "feed_story", "chevron");
        C21055XCg.A1Q(XRq.A0E, "marketplace_tab");
        C21055XCg.A1Q(XRq.A15, "media_gallery");
        C21055XCg.A1Q(xRq2, "media_picker");
        XRq xRq13 = XRq.A16;
        C21055XCg.A1Q(xRq13, "messenger_content_search");
        C21055XCg.A1Q(xRq13, "gif_message");
        C21055XCg.A1Q(XRq.A18, "messenger_kids_threadview_inline");
        C21055XCg.A1Q(xRq13, "media_tray_popup_view");
        C21055XCg.A1Q(xRq13, "media_picker_popup_view");
        C21055XCg.A1Q(xRq13, "direct_viewer_rvp");
        XRq xRq14 = XRq.A1A;
        C21055XCg.A1Q(xRq14, "viewer_rvp");
        C21055XCg.A1Q(xRq14, "stories_grid_autoplay");
        C21055XCg.A1Q(xRq13, "multimedia_editor_preview");
        C21055XCg.A1Q(XRq.A19, "messenger_note");
        C21055XCg.A1Q(xRq13, "media_share_view");
        C21055XCg.A1Q(xRq13, "thread_video_message_view");
        C21055XCg.A1Q(xRq13, "thread_video_message_media_viewer");
        C21055XCg.A1Q(xRq13, "stax_thread_video_message_view");
        C21055XCg.A1Q(xRq13, "stax_thread_video_message_view_groot");
        C21055XCg.A1Q(xRq13, "stax_thread_video_message_media_viewer");
        C21055XCg.A1Q(xRq13, "stax_thread_video_message_media_viewer_groot");
        C21055XCg.A1Q(xRq13, "viewer_rvp_seg");
        C21055XCg.A1Q(xRq14, "viewer_rvp_seg");
        C21055XCg.A1Q(xRq13, "xma_shared_video");
        C21055XCg.A1Q(xRq13, "messenger_discover_tab");
        C21055XCg.A1Q(xRq13, "messenger_selfie_sticker");
        C21055XCg.A1Q(XRq.A1C, "fullscreen");
        C21055XCg.A1Q(XRq.A1D, "native_templates");
        C21055XCg.A1Q(XRq.A1F, "native_templates");
        C21055XCg.A1Q(xRq5, "page_cover_video");
        C21055XCg.A1Q(xRq5, "page_header");
        C21055XCg.A1Q(xRq5, "page_tab_episodes");
        C21055XCg.A1Q(xRq5, "page_tab_home");
        C21055XCg.A1Q(xRq5, "page_tab_playlists");
        C21055XCg.A1Q(xRq5, "page_tab_show_videos");
        C21055XCg.A1Q(xRq5, "page_tab_live_tab");
        C21055XCg.A1Q(xRq5, "channel_tab_videos_card");
        C21055XCg.A1R(xRq5, "video_page_spotlight_unit", "feed_story");
        C21055XCg.A1R(xRq5, "action_channel", "chevron");
        C21055XCg.A1Q(xRq5, "page_video_list_permalink");
        XRq xRq15 = XRq.A1O;
        C21055XCg.A1Q(xRq15, "feed_story");
        C21055XCg.A1Q(xRq15, "faceweb_redirect");
        C21055XCg.A1R(xRq15, "faceweb_redirect_with_thread", "notifications");
        C21055XCg.A1Q(xRq15, TraceEventType.Push);
        C21055XCg.A1Q(XRq.A1P, "multimedia_post");
        XRq xRq16 = XRq.A1r;
        C21055XCg.A1Q(xRq16, "profile_video");
        C21055XCg.A1Q(xRq16, "profile_cover_video");
        C21055XCg.A1Q(xRq16, "profile_cover_video_upload_artwork_preview");
        C21055XCg.A1Q(xRq16, "profile_cover_video_upload_header_preview");
        C21055XCg.A1Q(xRq16, "timeline_video_hub");
        C21055XCg.A1Q(xRq16, "profile_video_preview");
        XRq xRq17 = XRq.A1Z;
        C21055XCg.A1Q(xRq17, "prompt_post");
        C21055XCg.A1Q(xRq17, "prompt_post_mega_nux");
        C21055XCg.A1Q(XRq.A0h, "games_tab");
        C21055XCg.A1Q(XRq.A0g, "games_feed");
        C21055XCg.A1Q(xRq2, "reaction_overlay");
        C21055XCg.A1Q(xRq10, "results_page_mixed_media");
        C21055XCg.A1Q(XRq.A1d, "saved_dashboard");
        C21055XCg.A1Q(xRq10, "results");
        C21055XCg.A1Q(XRq.A1h, "results");
        C21055XCg.A1Q(XRq.A1i, "sharesheet");
        C21055XCg.A1Q(xRq3, "fb_shorts_in_stories_reshare_sticker");
        C21055XCg.A1Q(XRq.A1k, "simple_picker");
        C21055XCg.A1Q(xRq8, "fb_stories_live_notification");
        C21055XCg.A1Q(xRq8, "fb_stories_viewersheet");
        C21055XCg.A1Q(xRq7, "fb_stories_optimistic_video");
        C21055XCg.A1R(xRq7, "fb_stories_tray", "fb_stories_viewersheet");
        C21055XCg.A1Q(xRq7, "fb_stories_viewer");
        C21055XCg.A1Q(XRq.A1p, "unified_camera_roll");
        C21055XCg.A1Q(XRq.A1q, "unknown");
        C21055XCg.A1R(xRq16, "feed_story", "chevron");
        C21055XCg.A1Q(xRq2, "video_album_permalink");
        C21055XCg.A1Q(XRq.A1t, "video_editing_gallery_preview");
        C21055XCg.A1R(xRq9, "notifications", TraceEventType.Push);
        C21055XCg.A1Q(xRq9, "saved_dashboard");
        C21055XCg.A1Q(xRq9, "watchlist");
        C21055XCg.A1Q(xRq9, "watchlist_aggregation");
        C21055XCg.A1Q(xRq9, "more_shows_fragment");
        C21055XCg.A1Q(xRq9, "after_party");
        C21055XCg.A1Q(xRq9, "discover_see_all");
        C21055XCg.A1Q(xRq9, "discover_topic_see_all");
        C21055XCg.A1Q(xRq9, "feed");
        C21055XCg.A1Q(xRq9, "fb_shorts_viewer");
        C21055XCg.A1Q(XRq.A1Y, "fb_shorts_viewer");
        C21055XCg.A1Q(xRq9, "topic_feed");
        C21055XCg.A1Q(xRq9, "topic_music");
        C21055XCg.A1Q(xRq9, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
        C21055XCg.A1Q(xRq9, "entry_point_notifications");
        C21055XCg.A1Q(xRq9, "fb_shorts_native_watch_in_feed_unit");
        C21055XCg.A1Q(xRq, "video_sets");
        C21055XCg.A1Q(xRq9, xRq6.toString());
        C21055XCg.A1Q(XRq.A21, "youth_fullscreen_video");
        C21055XCg.A1Q(xRq, "quick_promotion");
        C21055XCg.A1Q(xRq9, "share_sheet");
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A00, this.A01});
    }

    public final String toString() {
        String str = this.A02;
        if (str == null) {
            String str2 = this.A01;
            if (str2 == null || str2.length() == 0) {
                str = this.A00;
            } else {
                str = StringFormatUtil.formatStrLocaleSafe("%s::%s", this.A00, str2);
                0qQ.A07(str);
            }
            this.A02 = str;
        }
        return str;
    }

    public PlayerOrigin(Parcel parcel) {
        XRq xRq;
        String readString = parcel.readString();
        if (readString != null) {
            XRq[] values = XRq.values();
            int i = 0;
            int length = values.length;
            while (true) {
                if (i >= length) {
                    break;
                }
                xRq = values[i];
                String obj = xRq.toString();
                Locale locale = Locale.getDefault();
                0qQ.A07(locale);
                String lowerCase = readString.toLowerCase(locale);
                0qQ.A07(lowerCase);
                if (0qQ.A0K(obj, lowerCase)) {
                    break;
                }
                i++;
            }
        }
        xRq = XRq.A1q;
        this.A00 = xRq.A00;
        this.A01 = parcel.readString();
    }

    public PlayerOrigin(XRq xRq, String str) {
        String obj = xRq.toString();
        0qQ.A0B(obj, 1);
        this.A00 = obj;
        this.A01 = str;
    }
}
