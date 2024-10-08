package com.instagram.creator.inspiration.repository.graphql;

import X.AnonymousClass4Kp;
import X.AnonymousClass4Kr;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L5;
import X.AnonymousClass4L7;
import X.AnonymousClass4L8;
import X.AnonymousClass4LF;
import X.AnonymousClass69U;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.AnonymousClass9PN;
import X.C13991Tnr;
import X.C13992Tns;
import X.C250663lr;
import X.C250673ls;
import X.C284275Lw;
import X.C342787pA;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import X.C41848B3p;
import X.C41849B3q;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;

public final class IGCreatorInspirationHubMediaFragmentImpl extends C250663lr implements C250673ls {

    public final class WearableAttributionInfo extends C250663lr implements C250673ls {

        public final class WorldLocationPagesInfo extends C250663lr implements C250673ls {
            public WorldLocationPagesInfo() {
                super(-44862278);
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return C13992Tns.A07();
            }
        }

        public WearableAttributionInfo() {
            super(902323482);
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4L7 A0D = C13991Tnr.A0D();
            AnonymousClass4L7 A0E = C13991Tnr.A0E();
            AnonymousClass4L7 A0F = C13991Tnr.A0F();
            AnonymousClass4L7 A0G = C13991Tnr.A0G();
            AnonymousClass4L7 A0H = C13991Tnr.A0H();
            AnonymousClass4L7 A0B = C13991Tnr.A0B();
            AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
            return new AnonymousClass4Kx(new AnonymousClass4Kr[]{A0D, A0E, A0F, A0G, A0H, A0B, new AnonymousClass4L7(r1, "attribution_type"), C13991Tnr.A0C(), new AnonymousClass4L7(r1, "iconic_horizon_world_deeplink"), new AnonymousClass4L7(r1, "iconic_horizon_world_id"), new AnonymousClass4L7(r1, "iconic_horizon_world_name"), C13991Tnr.A0I(), new AnonymousClass4Kp(WorldLocationPagesInfo.class, "world_location_pages_info", -44862278)});
        }
    }

    public final class Caption extends C250663lr implements C250673ls {

        public final class User extends C250663lr implements C250673ls {

            public final class FanClubInfo extends C250663lr implements C250673ls {

                public final class FanConsiderationPageRevampEligiblity extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4LF r0 = AnonymousClass4LF.A00;
                        return AnonymousClass7TG.A0V(AnonymousClass7TE.A0g(r0), C41848B3p.A0I(r0), "should_show_social_context");
                    }

                    public FanConsiderationPageRevampEligiblity() {
                        super(751031677);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4LF r4 = AnonymousClass4LF.A00;
                    AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r4, "autosave_to_exclusive_highlight");
                    AnonymousClass4L8 r3 = AnonymousClass4L8.A00;
                    AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r3, "connected_member_count");
                    AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, AnonymousClass7TE.A0f(r1, "fan_club_id"), AnonymousClass7TE.A0f(r1, "fan_club_name"), C41845B3m.A0C(FanConsiderationPageRevampEligiblity.class, "fan_consideration_page_revamp_eligiblity", 751031677), AnonymousClass7TE.A0f(r4, "has_enough_subscribers_for_ssc"), AnonymousClass7TE.A0f(r4, "is_fan_club_gifting_eligible"), AnonymousClass7TE.A0f(r4, "is_fan_club_referral_eligible"), AnonymousClass7TE.A0f(r3, "subscriber_count")});
                }

                public FanClubInfo() {
                    super(1472574098);
                }
            }

            public final class FriendshipStatus extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4LF r5 = AnonymousClass4LF.A00;
                    return C41846B3n.A0M(C41847B3o.A0b(r5), C41847B3o.A0P(r5), AnonymousClass7TE.A0f(r5, "is_feed_favorite"), AnonymousClass7TE.A0f(r5, "is_restricted"), AnonymousClass7TE.A0f(r5, "outgoing_request"));
                }

                public FriendshipStatus() {
                    super(2079458760);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kr[] r4 = new AnonymousClass4Kr[30];
                AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "all_media_count");
                AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r3, "allowed_commenter_type");
                AnonymousClass4LF r0 = AnonymousClass4LF.A00;
                return C41846B3n.A0N(new AnonymousClass4Kr[]{C41847B3o.A0B(r1), AnonymousClass7TE.A0f(r0, "transparency_product_enabled"), C41847B3o.A0T(r3)}, r4, AnonymousClass7TF.A1X(new AnonymousClass4Kr[]{A0f, A0f2, AnonymousClass7TE.A0f(r0, "can_boost_post"), AnonymousClass7TE.A0f(r0, "can_see_organic_insights"), C41845B3m.A0C(FanClubInfo.class, "fan_club_info", 1472574098), C41847B3o.A0a(r3), AnonymousClass7TE.A0f(r0, "feed_post_reshare_disabled"), C41847B3o.A05(FriendshipStatus.class, 2079458760), C41845B3m.A0N(r3), C41847B3o.A0E(r0), C41847B3o.A0F(r0), AnonymousClass7TF.A0I(r3), C41847B3o.A09(r3), AnonymousClass7TE.A0f(r0, "is_favorite"), C41847B3o.A0c(r0), AnonymousClass7TE.A0f(r0, "is_unpublished"), C41846B3n.A0H(r0), C41847B3o.A07(), AnonymousClass7TE.A0f(r1, "liked_clips_count"), C41845B3m.A0E(r3), C41847B3o.A0Z(r3), C41847B3o.A0d(r3), C41845B3m.A0D(r3), AnonymousClass7TE.A0f(r3, "reel_auto_archive"), AnonymousClass7TE.A0f(r0, "show_account_transparency_details"), AnonymousClass7TE.A0f(r0, "show_insights_terms"), AnonymousClass7TE.A0f(r1, "text_post_app_joiner_number")}, r4) ? 1 : 0, 27, 3);
            }

            public User() {
                super(338412514);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
            AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r0, "bit_flags");
            AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
            AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r2, TraceFieldType.ContentType);
            AnonymousClass69U r3 = AnonymousClass69U.A00;
            AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r3, "created_at");
            AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r3, "created_at_utc");
            AnonymousClass4LF r32 = AnonymousClass4LF.A00;
            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, A0f3, A0f4, AnonymousClass7TE.A0f(r32, "did_report_as_spam"), AnonymousClass7TE.A0f(r32, "has_translation"), AnonymousClass7TE.A0f(r32, "is_covered"), AnonymousClass7TE.A0f(r32, "is_ranked_comment"), C41847B3o.A0M(r2), C41846B3n.A0B(r2), AnonymousClass7TE.A0f(r0, "private_reply_status"), AnonymousClass7TE.A0f(r32, "share_enabled"), C41845B3m.A0L(r2), C41846B3n.A0F(r2), C41845B3m.A0H(r0), C41845B3m.A0B(User.class, 338412514), C41845B3m.A0M(r2)});
        }

        public Caption() {
            super(-1124539568);
        }
    }

    public final class ClipsAttributionInfo extends C250663lr implements C250673ls {

        public final class PivotPageHeader extends C250663lr implements C250673ls {

            public final class Profile extends C250663lr implements C250673ls {
                public Profile() {
                    super(1051381315);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return C41849B3q.A0A();
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                return C41846B3n.A0L(AnonymousClass7TE.A0f(r1, "content_url"), AnonymousClass7TE.A0f(r1, "developer_app_logo_url"), AnonymousClass7TE.A0f(r1, "media_count"), C41845B3m.A0C(Profile.class, "profile", 1051381315));
            }

            public PivotPageHeader() {
                super(-967452884);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
            return C41846B3n.A0K(AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "attribution_app_id"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "attribution_app_name"), C41845B3m.A0A(AnonymousClass4Ks.A01(), PivotPageHeader.class, "pivot_page_header", -967452884));
        }

        public ClipsAttributionInfo() {
            super(-1386663628);
        }
    }

    public final class ClipsMetadata extends C250663lr implements C250673ls {

        public final class AchievementsInfo extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0V(AnonymousClass4LF.A00, AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "num_earned_achievements"), "show_achievements");
            }

            public AchievementsInfo() {
                super(-1505901106);
            }
        }

        public final class AdditionalAudioInfo extends C250663lr implements C250673ls {

            public final class AudioReattributionInfo extends C250663lr implements C250673ls {
                public AudioReattributionInfo() {
                    super(988271537);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0W(C41846B3n.A0J(), "should_allow_restore");
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return C41847B3o.A0m(AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "additional_audio_username"), AudioReattributionInfo.class, "audio_reattribution_info", 988271537);
            }

            public AdditionalAudioInfo() {
                super(-834512998);
            }
        }

        public final class AssetRecommendationInfo extends C250663lr implements C250673ls {

            public final class AssetRecommendations extends C250663lr implements C250673ls {
                public AssetRecommendations() {
                    super(730856145);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return C41849B3q.A00();
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0T(AnonymousClass4Ks.A02(), AssetRecommendations.class, "asset_recommendations", 730856145);
            }

            public AssetRecommendationInfo() {
                super(-2127221804);
            }
        }

        public final class AudioRankingInfo extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0W(AnonymousClass4Kz.A00, "best_audio_cluster_id");
            }

            public AudioRankingInfo() {
                super(-315841822);
            }
        }

        public final class ContextualHighlightInfo extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r5 = AnonymousClass4Kz.A00;
                return C41846B3n.A0M(AnonymousClass7TE.A0f(r5, "contextual_highlight_destination_type"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r5), "contextual_highlight_id"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r5), "contextual_highlight_title"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r5), "contextual_highlight_type"), AnonymousClass7TE.A0f(r5, "chaining_media_id"));
            }

            public ContextualHighlightInfo() {
                super(-578466862);
            }
        }

        public final class MashupInfo extends C250663lr implements C250673ls {

            public final class OriginalMedia extends C250663lr implements C250673ls {

                public final class User extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
                        AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r0, "all_media_count");
                        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                        AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r1, "allowed_commenter_type");
                        AnonymousClass4L7 A0a = C41847B3o.A0a(r1);
                        AnonymousClass4L7 A0N = C41845B3m.A0N(r1);
                        AnonymousClass4LF r2 = AnonymousClass4LF.A00;
                        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, A0a, A0N, C41847B3o.A0E(r2), C41847B3o.A0F(r2), AnonymousClass7TF.A0I(r1), C41847B3o.A09(r1), C41847B3o.A0c(r2), C41846B3n.A0H(r2), AnonymousClass7TE.A0f(r0, "liked_clips_count"), C41845B3m.A0E(r1), C41847B3o.A0Z(r1), C41847B3o.A0d(r1), C41845B3m.A0D(r1), AnonymousClass7TE.A0f(r1, "reel_auto_archive"), AnonymousClass7TE.A0f(r0, "text_post_app_joiner_number"), C41847B3o.A0B(r0), C41847B3o.A0T(r1)});
                    }

                    public User() {
                        super(1631574768);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                    AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "is_light_weight_check");
                    AnonymousClass4L7 A0W = C41848B3p.A0W(r1);
                    AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r1, "mashups_allowed");
                    AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0W, A0f2, C41845B3m.A0O(r0), C41848B3p.A0A(), C41846B3n.A0B(r0), C41846B3n.A0I(r0), AnonymousClass7TE.A0f(new AnonymousClass4L5(C41845B3m.A0Q()), "sidecar_child_media_ids"), C41845B3m.A0A(AnonymousClass4Ks.A01(), User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, 1631574768)});
                }

                public OriginalMedia() {
                    super(-1116631869);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4LF r2 = AnonymousClass4LF.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "can_toggle_mashups_allowed"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "has_been_mashed_up"), AnonymousClass7TE.A0f(r2, "has_nonmimicable_additional_audio"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "is_creator_requesting_mashup"), AnonymousClass7TE.A0f(r2, "is_light_weight_check"), C41848B3p.A0W(r2), AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "mashup_type"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "mashups_allowed"), C41848B3p.A0A(), C41845B3m.A0C(OriginalMedia.class, "original_media", -1116631869)});
            }

            public MashupInfo() {
                super(-437099657);
            }
        }

        public final class MusicInfo extends C250663lr implements C250673ls {

            public final class MusicAssetInfo extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4LF r2 = AnonymousClass4LF.A00;
                    AnonymousClass4L7 A0X = C41848B3p.A0X(r2);
                    AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0X, AnonymousClass7TE.A0f(r0, "artist_id"), AnonymousClass7TE.A0f(r0, "audio_asset_id"), AnonymousClass7TE.A0f(r0, "audio_cluster_id"), AnonymousClass7TE.A0f(r0, "cover_artwork_thumbnail_uri"), C41848B3p.A0Z(r0), AnonymousClass7TE.A0f(r0, "dash_manifest"), AnonymousClass7TE.A0f(r0, "display_artist"), C41847B3o.A0C(AnonymousClass4L8.A00), AnonymousClass7TE.A0f(r0, "fast_start_progressive_download_url"), AnonymousClass7TE.A0f(r2, "has_lyrics"), C41846B3n.A09(r0), AnonymousClass7TE.A0f(r0, "ig_username"), C41848B3p.A0K(r2), AnonymousClass7TE.A0f(r0, "progressive_download_url"), C41847B3o.A0O(r0), C41845B3m.A0I(r0), AnonymousClass7TE.A0f(r0, "web_30s_preview_download_url")});
                }

                public MusicAssetInfo() {
                    super(282201490);
                }
            }

            public final class MusicConsumptionInfo extends C250663lr implements C250673ls {

                public final class IgArtist extends C250663lr implements C250673ls {
                    public IgArtist() {
                        super(735319379);
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return C41849B3q.A02();
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4LF r3 = AnonymousClass4LF.A00;
                    AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r3, "allow_media_creation_with_music");
                    AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
                    AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r1, "audio_asset_start_time_in_ms");
                    AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, AnonymousClass7TE.A0f(r2, "derived_content_id"), C41845B3m.A0C(IgArtist.class, "ig_artist", 735319379), AnonymousClass7TE.A0f(r3, "is_bookmarked"), AnonymousClass7TE.A0f(r3, "is_trending_in_clips"), AnonymousClass7TE.A0f(r1, "overlap_duration_in_ms"), C41848B3p.A0N(r2), AnonymousClass7TE.A0f(r3, "should_allow_music_editing"), C41848B3p.A0f(r3), C41848B3p.A0e(r2), AnonymousClass7TE.A0f(r2, "should_mute_audio_reason_type"), AnonymousClass7TE.A0f(r1, "trend_rank")});
                }

                public MusicConsumptionInfo() {
                    super(671346287);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                C284275Lw A01 = AnonymousClass4Ks.A01();
                return C41847B3o.A0i(AnonymousClass4Ks.A01(), C41845B3m.A0A(A01, MusicAssetInfo.class, "music_asset_info", 282201490), MusicConsumptionInfo.class, "music_consumption_info", 671346287);
            }

            public MusicInfo() {
                super(507945270);
            }
        }

        public final class OriginalSoundInfo extends C250663lr implements C250673ls {

            public final class AudioParts extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0X(IGCreatorInspirationAudioPartMetaData2Impl.class, "IGCreatorInspirationAudioPartMetaData2", 787776735);
                }

                public AudioParts() {
                    super(-1899833205);
                }
            }

            public final class AudioPartsByFilter extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0X(IGCreatorInspirationAudioPartMetaData2Impl.class, "IGCreatorInspirationAudioPartMetaData2", 787776735);
                }

                public AudioPartsByFilter() {
                    super(68663422);
                }
            }

            public final class ConsumptionInfo extends C250663lr implements C250673ls {
                public ConsumptionInfo() {
                    super(-1073567508);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return C41848B3p.A0y();
                }
            }

            public final class IgArtist extends C250663lr implements C250673ls {
                public IgArtist() {
                    super(-2105112141);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return C41849B3q.A02();
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4LF r0 = AnonymousClass4LF.A00;
                AnonymousClass4L7 A0n = C41848B3p.A0n(r0);
                AnonymousClass4Kz r5 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0a = C41848B3p.A0a(r5);
                AnonymousClass4Kp A08 = C41848B3p.A08(AudioParts.class, -1899833205);
                AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A02(), AudioPartsByFilter.class, "audio_parts_by_filter", 68663422);
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r0, "can_remix_be_shared_to_fb");
                AnonymousClass4Kp A05 = C41848B3p.A05(ConsumptionInfo.class, -1073567508);
                AnonymousClass4L7 A0j = C41848B3p.A0j(r5);
                AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0n, A0a, A08, A0A, A0f, A05, A0j, C41847B3o.A0C(r1), C41848B3p.A0l(r0), C41848B3p.A06(IgArtist.class, -2105112141), C41848B3p.A0M(r0), C41848B3p.A0K(r0), AnonymousClass7TE.A0f(r0, "is_original_audio_download_eligible"), AnonymousClass7TE.A0f(r0, "is_reuse_disabled"), AnonymousClass7TE.A0f(r0, "is_xpost_from_fb"), C41848B3p.A0i(r5), C41848B3p.A0U(r5), C41848B3p.A0J(r5), C41848B3p.A0R(r5), C41848B3p.A0f(r0), AnonymousClass7TE.A0f(r1, "time_created"), AnonymousClass7TE.A0f(r1, "trend_rank")});
            }

            public OriginalSoundInfo() {
                super(-747633578);
            }
        }

        public final class ShoppingInfo extends C250663lr implements C250673ls {

            public final class Products extends C250663lr implements C250673ls {

                public final class ProductDetails extends C250663lr implements C250673ls {

                    public final class ArtsLabels extends C250663lr implements C250673ls {

                        public final class Labels extends C250663lr implements C250673ls {
                            public final AnonymousClass4Kx modelSelectionSet() {
                                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                                return AnonymousClass7TG.A0V(r2, AnonymousClass7TE.A0f(r2, "label_display_value"), "label_type");
                            }

                            public Labels() {
                                super(2071948517);
                            }
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Labels.class, "labels", 2071948517);
                        }

                        public ArtsLabels() {
                            super(-468304245);
                        }
                    }

                    public final class CheckoutProperties extends C250663lr implements C250673ls {

                        public final class ShippingAndReturn extends C250663lr implements C250673ls {

                            public final class ReturnCost extends C250663lr implements C250673ls {
                                public ReturnCost() {
                                    super(-529821838);
                                }

                                public final AnonymousClass4Kx modelSelectionSet() {
                                    return C41848B3p.A0v();
                                }
                            }

                            public final class ShippingCost extends C250663lr implements C250673ls {
                                public ShippingCost() {
                                    super(1721806929);
                                }

                                public final AnonymousClass4Kx modelSelectionSet() {
                                    return C41848B3p.A0v();
                                }
                            }

                            public final AnonymousClass4Kx modelSelectionSet() {
                                return AnonymousClass7TG.A0U(AnonymousClass4Kz.A00, C41845B3m.A0C(ReturnCost.class, "return_cost", -529821838), C41845B3m.A0C(ShippingCost.class, "shipping_cost", 1721806929), "shipping_cost_stripped");
                            }

                            public ShippingAndReturn() {
                                super(1923890966);
                            }
                        }

                        public final class CurrencyAmount extends C250663lr implements C250673ls {
                            public CurrencyAmount() {
                                super(1315071659);
                            }

                            public final AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A0v();
                            }
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            AnonymousClass4LF r3 = AnonymousClass4LF.A00;
                            AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r3, "can_add_to_bag");
                            AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r3, "can_enable_restock_reminder");
                            AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r3, "can_show_inventory_quantity");
                            AnonymousClass4Kp A0C = C41845B3m.A0C(CurrencyAmount.class, "currency_amount", 1315071659);
                            AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
                            AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r2, "full_inventory_quantity");
                            AnonymousClass4L7 A0f5 = AnonymousClass7TE.A0f(r3, "has_free_shipping");
                            AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, A0f3, A0C, A0f4, A0f5, AnonymousClass7TE.A0f(r1, "ig_referrer_fbid"), AnonymousClass7TE.A0f(r2, "inventory_quantity"), AnonymousClass7TE.A0f(r3, "is_shopify_merchant"), AnonymousClass7TE.A0f(r3, "product_group_has_inventory"), AnonymousClass7TE.A0f(r1, "receiver_id"), C41845B3m.A0C(ShippingAndReturn.class, "shipping_and_return", 1923890966), AnonymousClass7TE.A0f(r2, "viewer_purchase_limit")});
                        }

                        public CheckoutProperties() {
                            super(265533295);
                        }
                    }

                    public final class DiscountInformation extends C250663lr implements C250673ls {

                        public final class Discounts extends C250663lr implements C250673ls {
                            public Discounts() {
                                super(264810640);
                            }

                            public final AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A12();
                            }
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Discounts.class, "discounts", 264810640);
                        }

                        public DiscountInformation() {
                            super(1633349070);
                        }
                    }

                    public final class ImageQualityMetadata extends C250663lr implements C250673ls {

                        public final class Goodness extends C250663lr implements C250673ls {
                            public Goodness() {
                                super(396635980);
                            }

                            public final AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A0r();
                            }
                        }

                        public final class LifestyleBackground extends C250663lr implements C250673ls {
                            public LifestyleBackground() {
                                super(-442933711);
                            }

                            public final AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A0r();
                            }
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return C41847B3o.A0i(AnonymousClass4Ks.A00(), C41848B3p.A07(Goodness.class, 396635980), LifestyleBackground.class, "lifestyle_background", -442933711);
                        }

                        public ImageQualityMetadata() {
                            super(670623938);
                        }
                    }

                    public final class MainImage extends C250663lr implements C250673ls {

                        public final class ImageVersions2 extends C250663lr implements C250673ls {

                            public final class Candidates extends C250663lr implements C250673ls {
                                public Candidates() {
                                    super(-1980360399);
                                }

                                public final AnonymousClass4Kx modelSelectionSet() {
                                    return C41848B3p.A0s();
                                }
                            }

                            public final AnonymousClass4Kx modelSelectionSet() {
                                return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Candidates.class, "candidates", -1980360399);
                            }

                            public ImageVersions2() {
                                super(-1034338397);
                            }
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return C41848B3p.A13(AnonymousClass4Ks.A01(), ImageVersions2.class, -1034338397);
                        }

                        public MainImage() {
                            super(2002283420);
                        }
                    }

                    public final class SellerBadge extends C250663lr implements C250673ls {
                        public final AnonymousClass4Kx modelSelectionSet() {
                            AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                            return AnonymousClass7TG.A0U(r3, C41847B3o.A0U(r3), C41845B3m.A0G(r3), PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                        }

                        public SellerBadge() {
                            super(2076909370);
                        }
                    }

                    public final class ThumbnailImage extends C250663lr implements C250673ls {

                        public final class ImageVersions2 extends C250663lr implements C250673ls {

                            public final class Candidates extends C250663lr implements C250673ls {
                                public Candidates() {
                                    super(847116207);
                                }

                                public final AnonymousClass4Kx modelSelectionSet() {
                                    return C41848B3p.A0s();
                                }
                            }

                            public final AnonymousClass4Kx modelSelectionSet() {
                                return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Candidates.class, "candidates", 847116207);
                            }

                            public ImageVersions2() {
                                super(1113823927);
                            }
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return C41848B3p.A13(AnonymousClass4Ks.A01(), ImageVersions2.class, 1113823927);
                        }

                        public ThumbnailImage() {
                            super(1514521186);
                        }
                    }

                    public final class VariantValues extends C250663lr implements C250673ls {
                        public final AnonymousClass4Kx modelSelectionSet() {
                            AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                            return C41849B3q.A0G(r1, AnonymousClass7TE.A0g(r1));
                        }

                        public VariantValues() {
                            super(-779067202);
                        }
                    }

                    public final class AggregatedRating extends C250663lr implements C250673ls {
                        public AggregatedRating() {
                            super(1026222342);
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0V(C342787pA.A00, C41847B3o.A06(), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                        }
                    }

                    public final class CommerceReviewStatistics extends C250663lr implements C250673ls {
                        public CommerceReviewStatistics() {
                            super(-1779381681);
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0V(AnonymousClass4L8.A00, C41848B3p.A0B(), "review_count");
                        }
                    }

                    public final class Merchant extends C250663lr implements C250673ls {
                        public Merchant() {
                            super(134389647);
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return C41849B3q.A0B();
                        }
                    }

                    public final class RichTextDescription extends C250663lr implements C250673ls {

                        public final class TextWithEntities extends C250663lr implements C250673ls {

                            public final class InlineStyleRanges extends C250663lr implements C250673ls {
                                public InlineStyleRanges() {
                                    super(1783811154);
                                }

                                public final AnonymousClass4Kx modelSelectionSet() {
                                    return C41848B3p.A0t();
                                }
                            }

                            public final AnonymousClass4Kx modelSelectionSet() {
                                return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), InlineStyleRanges.class, "inline_style_ranges", 1783811154);
                            }

                            public TextWithEntities() {
                                super(-602356593);
                            }
                        }

                        public RichTextDescription() {
                            super(-2078199768);
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return C41847B3o.A0k(C41848B3p.A0F(), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "depth"), TextWithEntities.class, "text_with_entities", -602356593);
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4Kr[] r5 = new AnonymousClass4Kr[36];
                        AnonymousClass4Kp A0C = C41845B3m.A0C(AggregatedRating.class, "aggregated_rating", 1026222342);
                        AnonymousClass4Kp A0C2 = C41845B3m.A0C(ArtsLabels.class, "arts_labels", -468304245);
                        AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                        AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "can_share_to_story");
                        AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r1, "can_viewer_see_rnr");
                        AnonymousClass4Kp A0C3 = C41845B3m.A0C(CheckoutProperties.class, "checkout_properties", 265533295);
                        AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
                        boolean A1X = AnonymousClass7TF.A1X(new AnonymousClass4Kr[]{A0C, A0C2, A0f, A0f2, A0C3, AnonymousClass7TE.A0f(r0, "checkout_style"), C41845B3m.A0C(CommerceReviewStatistics.class, "commerce_review_statistics", -1779381681), AnonymousClass7TE.A0f(r0, "compound_product_id"), AnonymousClass7TE.A0f(r0, "current_price"), AnonymousClass7TE.A0f(r0, "current_price_amount"), AnonymousClass7TE.A0f(r0, "current_price_stripped"), C41847B3o.A0U(r0), C41845B3m.A0C(DiscountInformation.class, "discount_information", 1633349070), C41847B3o.A0f(r0), AnonymousClass7TE.A0f(r0, "full_price"), AnonymousClass7TE.A0f(r0, "full_price_amount"), AnonymousClass7TE.A0f(r0, "full_price_stripped"), C41847B3o.A0e(r1), C41846B3n.A0E(r1), AnonymousClass7TE.A0f(r1, "ig_is_product_editable_on_mobile"), C41845B3m.A0C(ImageQualityMetadata.class, "image_quality_metadata", 670623938), AnonymousClass7TE.A0f(r1, "is_entered_in_drawing"), C41847B3o.A0W(r1), C41845B3m.A0C(MainImage.class, "main_image", 2002283420), AnonymousClass7TE.A0f(r0, "main_image_id"), C41845B3m.A0C(Merchant.class, "merchant", 134389647), C41845B3m.A0G(r0)}, r5);
                        return C41846B3n.A0N(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r0, "price"), AnonymousClass7TE.A0f(r0, "product_id"), AnonymousClass7TE.A0f(r0, "retailer_id"), AnonymousClass7TE.A0f(r0, "review_status"), C41845B3m.A0A(AnonymousClass4Ks.A00(), RichTextDescription.class, "rich_text_description", -2078199768), C41845B3m.A0C(SellerBadge.class, "seller_badge", 2076909370), AnonymousClass7TE.A0f(r0, "size_calibration_score"), C41845B3m.A0C(ThumbnailImage.class, "thumbnail_image", 1514521186), C41845B3m.A0A(AnonymousClass4Ks.A00(), VariantValues.class, "variant_values", -779067202)}, r5, A1X ? 1 : 0, 27, 9);
                    }

                    public ProductDetails() {
                        super(153540260);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0Y(ProductDetails.class, "product_details", 153540260);
                }

                public Products() {
                    super(-1669046954);
                }
            }

            public final class ClipsShoppingCtaBar extends C250663lr implements C250673ls {
                public ClipsShoppingCtaBar() {
                    super(-1947806971);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return C41849B3q.A01();
                }
            }

            public final class Merchant extends C250663lr implements C250673ls {
                public Merchant() {
                    super(-303384016);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return C41849B3q.A0B();
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return C41846B3n.A0K(C41845B3m.A0C(ClipsShoppingCtaBar.class, "clips_shopping_cta_bar", -1947806971), C41845B3m.A0C(Merchant.class, "merchant", -303384016), C41845B3m.A0A(AnonymousClass4Ks.A00(), Products.class, "products", -1669046954));
            }

            public ShoppingInfo() {
                super(1010508766);
            }
        }

        public final class TemplateInfo extends C250663lr implements C250673ls {

            public final class AttributionInfo extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TG.A0V(AnonymousClass7TE.A0g(r0), C41848B3p.A0H(r0), "template_media_id");
                }

                public AttributionInfo() {
                    super(597683070);
                }
            }

            public final class EffectsInfo extends C250663lr implements C250673ls {

                public final class SegmentEffectsInfo extends C250663lr implements C250673ls {
                    public SegmentEffectsInfo() {
                        super(346735400);
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0V(C41845B3m.A0R(), AnonymousClass7TE.A0f(C41845B3m.A0Q(), "effect_id"), "segment_index");
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), SegmentEffectsInfo.class, "segment_effects_info", 346735400);
                }

                public EffectsInfo() {
                    super(361046775);
                }
            }

            public final class SegmentsInfo extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4L7 A0g = C41848B3p.A0g(AnonymousClass69U.A00);
                    AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
                    return AnonymousClass7TG.A0U(r2, A0g, AnonymousClass7TE.A0f(r2, "reusable_template_media_asset_end_time_ms"), "reusable_template_media_asset_start_time_ms");
                }

                public SegmentsInfo() {
                    super(634424224);
                }
            }

            public final class TimedTextsInfo extends C250663lr implements C250673ls {

                public final class TextInfoList extends C250663lr implements C250673ls {

                    public final class Colors extends C250663lr implements C250673ls {
                        public Colors() {
                            super(991841531);
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0V(C41845B3m.A0P(), AnonymousClass7TE.A0f(C41845B3m.A0R(), "count"), "hex_rgba_color");
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
                        AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r4), "alignment");
                        AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A02(), Colors.class, "colors", 991841531);
                        C342787pA r3 = C342787pA.A00;
                        AnonymousClass4L7 A0V = C41847B3o.A0V(AnonymousClass7TE.A0g(r3));
                        AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r3), "font_size");
                        AnonymousClass4L7 A0P = C41848B3p.A0P(r3);
                        AnonymousClass4L7 A09 = C41846B3n.A09(r4);
                        AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
                        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0A, A0V, A0f2, A0P, A09, AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "is_animated"), C41848B3p.A0S(r3), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r3), "offset_y"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r3), "rotation_degree"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r3), "scale"), C41847B3o.A0G(AnonymousClass7TE.A0g(r3)), C41846B3n.A0A(r4), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r4), "text_emphasis_mode"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r4), "text_format_type"), C41845B3m.A0J(AnonymousClass7TE.A0g(r3)), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "z_index")});
                    }

                    public TextInfoList() {
                        super(1078649871);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0T(AnonymousClass4Ks.A02(), TextInfoList.class, "text_info_list", 1078649871);
                }

                public TimedTextsInfo() {
                    super(-1892800233);
                }
            }

            public final class TransitionEffectsInfo extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass69U r5 = AnonymousClass69U.A00;
                    return C41847B3o.A0j(AnonymousClass7TE.A0g(r5), C41848B3p.A0g(r5), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "index"), C41846B3n.A0C(AnonymousClass4Kz.A00), "start_time_in_ms");
                }

                public TransitionEffectsInfo() {
                    super(152748491);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{C41845B3m.A0C(AttributionInfo.class, "attribution_info", 597683070), C41845B3m.A0C(EffectsInfo.class, "effects_info", 361046775), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "min_num_segments"), C41845B3m.A0A(AnonymousClass4Ks.A02(), SegmentsInfo.class, "segments_info", 634424224), AnonymousClass7TE.A0f(C41845B3m.A0Q(), "template_clips_media_id"), C41845B3m.A0C(TimedTextsInfo.class, "timed_texts_info", -1892800233), C41845B3m.A0A(AnonymousClass4Ks.A00(), TransitionEffectsInfo.class, "transition_effects_info", 152748491)});
            }

            public TemplateInfo() {
                super(2027560565);
            }
        }

        public final class BrandedContentTagInfo extends C250663lr implements C250673ls {
            public BrandedContentTagInfo() {
                super(-54798333);
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0W(C41846B3n.A0J(), "can_add_tag");
            }
        }

        public final class ContentAppreciationInfo extends C250663lr implements C250673ls {

            public final class EntryPointContainer extends C250663lr implements C250673ls {

                public final class Comment extends C250663lr implements C250673ls {
                    public Comment() {
                        super(892502199);
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0W(C41845B3m.A0P(), "action_type");
                    }
                }

                public final class Pill extends C250663lr implements C250673ls {
                    public Pill() {
                        super(-550748069);
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0V(C41845B3m.A0R(), AnonymousClass7TE.A0f(C41845B3m.A0P(), "action_type"), "priority");
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return C41847B3o.A0m(C41845B3m.A0C(Comment.class, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, 892502199), Pill.class, "pill", -550748069);
                }

                public EntryPointContainer() {
                    super(1950604942);
                }
            }

            public ContentAppreciationInfo() {
                super(1845344782);
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return C41847B3o.A0m(AnonymousClass7TE.A0f(C41846B3n.A0J(), "enabled"), EntryPointContainer.class, "entry_point_container", 1950604942);
            }
        }

        public final class MerchandisingPillInfo extends C250663lr implements C250673ls {
            public MerchandisingPillInfo() {
                super(141750581);
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0W(C41845B3m.A0R(), "loop_time");
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kp A0C = C41845B3m.A0C(AchievementsInfo.class, "achievements_info", -1505901106);
            AnonymousClass4Kp A0C2 = C41845B3m.A0C(AdditionalAudioInfo.class, "additional_audio_info", -834512998);
            AnonymousClass4Kp A0C3 = C41845B3m.A0C(AssetRecommendationInfo.class, "asset_recommendation_info", -2127221804);
            AnonymousClass4Kp A0C4 = C41845B3m.A0C(AudioRankingInfo.class, "audio_ranking_info", -315841822);
            AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
            AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "audio_type");
            AnonymousClass4Kp A0C5 = C41845B3m.A0C(BrandedContentTagInfo.class, "branded_content_tag_info", -54798333);
            AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r1, "clips_creation_entry_point");
            AnonymousClass4Kp A0C6 = C41845B3m.A0C(ContentAppreciationInfo.class, "content_appreciation_info", 1845344782);
            AnonymousClass4Kp A0C7 = C41845B3m.A0C(ContextualHighlightInfo.class, "contextual_highlight_info", -578466862);
            AnonymousClass4LF r0 = AnonymousClass4LF.A00;
            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0C, A0C2, A0C3, A0C4, A0f, A0C5, A0f2, A0C6, A0C7, AnonymousClass7TE.A0f(r0, "disable_use_in_clips_client_cache"), AnonymousClass7TE.A0f(r0, "is_fan_club_promo_video"), AnonymousClass7TE.A0f(r0, "is_public_chat_welcome_video"), AnonymousClass7TE.A0f(r0, "is_shared_to_fb"), C41845B3m.A0C(MashupInfo.class, "mashup_info", -437099657), C41845B3m.A0C(MerchandisingPillInfo.class, "merchandising_pill_info", 141750581), AnonymousClass7TE.A0f(r1, "music_canonical_id"), C41845B3m.A0C(MusicInfo.class, "music_info", 507945270), C41845B3m.A0C(OriginalSoundInfo.class, "original_sound_info", -747633578), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "professional_clips_upsell_type"), AnonymousClass7TE.A0f(r1, "reusable_text_attribute_string"), C41845B3m.A0C(ShoppingInfo.class, "shopping_info", 1010508766), AnonymousClass7TE.A0f(r0, "show_achievements"), AnonymousClass7TE.A0f(r0, "show_tips"), C41845B3m.A0C(TemplateInfo.class, "template_info", 2027560565)});
        }

        public ClipsMetadata() {
            super(1286400893);
        }
    }

    public final class CreativeConfig extends C250663lr implements C250673ls {

        public final class EffectConfigs extends C250663lr implements C250673ls {

            public final class AttributionUser extends C250663lr implements C250673ls {

                public final class ProfilePicture extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0W(AnonymousClass4Kz.A00, "uri");
                    }

                    public ProfilePicture() {
                        super(-1589362664);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TG.A0U(r4, AnonymousClass7TE.A0f(r4, "instagram_user_id"), C41845B3m.A0C(ProfilePicture.class, "profile_picture", -1589362664), AnonymousClass9PN.A00());
                }

                public AttributionUser() {
                    super(-639986063);
                }
            }

            public final class ThumbnailImage extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0W(AnonymousClass4Kz.A00, "uri");
                }

                public ThumbnailImage() {
                    super(1202402159);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A01(), AttributionUser.class, "attribution_user", -639986063);
                AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0A, AnonymousClass7TE.A0f(r3, "effect_id"), AnonymousClass7TE.A0f(r3, "failure_code"), AnonymousClass7TE.A0f(r3, TraceFieldType.FailureReason), C41846B3n.A09(r3), AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "is_age_restricted"), C41846B3n.A0C(r3), C41848B3p.A0L(r3), C41845B3m.A0C(ThumbnailImage.class, "thumbnail_image", 1202402159), C41845B3m.A0I(r3)});
            }

            public EffectConfigs() {
                super(-1264863273);
            }
        }

        public final class CreationToolInfo extends C250663lr implements C250673ls {
            public CreationToolInfo() {
                super(1697907996);
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return C41849B3q.A0C();
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return C41846B3n.A0K(AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "capture_type"), C41845B3m.A0A(AnonymousClass4Ks.A00(), CreationToolInfo.class, "creation_tool_info", 1697907996), C41845B3m.A0A(AnonymousClass4Ks.A00(), EffectConfigs.class, "effect_configs", -1264863273));
        }

        public CreativeConfig() {
            super(-1418630075);
        }
    }

    public final class FundraiserTag extends C250663lr implements C250673ls {
        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
            AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r0, "beneficiary_name");
            AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r0, "beneficiary_username");
            AnonymousClass4LF r1 = AnonymousClass4LF.A00;
            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, AnonymousClass7TE.A0f(r1, "can_viewer_donate"), AnonymousClass7TE.A0f(r1, "can_viewer_remove_fundraiser_tag"), AnonymousClass7TE.A0f(r0, "contextual_title_str"), AnonymousClass7TE.A0f(r0, "formatted_amount_raised"), AnonymousClass7TE.A0f(r0, "formatted_fundraiser_progress_info_text"), AnonymousClass7TE.A0f(r0, "formatted_goal_amount"), AnonymousClass7TE.A0f(r0, "fundraiser_id"), AnonymousClass7TE.A0f(r0, "fundraiser_owner_username"), AnonymousClass7TE.A0f(r0, "fundraiser_title"), AnonymousClass7TE.A0f(r0, "fundraiser_type"), AnonymousClass7TE.A0f(r1, "is_media_owner_fundraiser_owner"), AnonymousClass7TE.A0f(r0, "progress_str"), AnonymousClass7TE.A0f(r1, "show_fundraiser_owner_attribution"), AnonymousClass7TE.A0f(r0, "thumbnail_display_url")});
        }

        public FundraiserTag() {
            super(-932643220);
        }
    }

    public final class IgtvShoppingInfo extends C250663lr implements C250673ls {

        public final class Products extends C250663lr implements C250673ls {

            public final class ProductDetails extends C250663lr implements C250673ls {

                public final class ArtsLabels extends C250663lr implements C250673ls {

                    public final class Labels extends C250663lr implements C250673ls {
                        public final AnonymousClass4Kx modelSelectionSet() {
                            AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                            return AnonymousClass7TG.A0V(r2, AnonymousClass7TE.A0f(r2, "label_display_value"), "label_type");
                        }

                        public Labels() {
                            super(-679319413);
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Labels.class, "labels", -679319413);
                    }

                    public ArtsLabels() {
                        super(2117433730);
                    }
                }

                public final class CheckoutProperties extends C250663lr implements C250673ls {

                    public final class ShippingAndReturn extends C250663lr implements C250673ls {

                        public final class ShippingCost extends C250663lr implements C250673ls {
                            public ShippingCost() {
                                super(-1177773906);
                            }

                            public final AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A0v();
                            }
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0V(AnonymousClass4Kz.A00, C41845B3m.A0C(ShippingCost.class, "shipping_cost", -1177773906), "shipping_cost_stripped");
                        }

                        public ShippingAndReturn() {
                            super(422028036);
                        }
                    }

                    public final class CurrencyAmount extends C250663lr implements C250673ls {
                        public CurrencyAmount() {
                            super(926628604);
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return C41848B3p.A0v();
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4LF r3 = AnonymousClass4LF.A00;
                        AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r3, "can_add_to_bag");
                        AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r3, "can_enable_restock_reminder");
                        AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r3, "can_show_inventory_quantity");
                        AnonymousClass4Kp A0C = C41845B3m.A0C(CurrencyAmount.class, "currency_amount", 926628604);
                        AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
                        AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r2, "full_inventory_quantity");
                        AnonymousClass4L7 A0f5 = AnonymousClass7TE.A0f(r3, "has_free_shipping");
                        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, A0f3, A0C, A0f4, A0f5, AnonymousClass7TE.A0f(r1, "ig_referrer_fbid"), AnonymousClass7TE.A0f(r2, "inventory_quantity"), AnonymousClass7TE.A0f(r3, "is_shopify_merchant"), AnonymousClass7TE.A0f(r3, "product_group_has_inventory"), AnonymousClass7TE.A0f(r1, "receiver_id"), C41845B3m.A0C(ShippingAndReturn.class, "shipping_and_return", 422028036), AnonymousClass7TE.A0f(r2, "viewer_purchase_limit")});
                    }

                    public CheckoutProperties() {
                        super(-36177335);
                    }
                }

                public final class DiscountInformation extends C250663lr implements C250673ls {

                    public final class Discounts extends C250663lr implements C250673ls {
                        public Discounts() {
                            super(1868475267);
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return C41848B3p.A12();
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Discounts.class, "discounts", 1868475267);
                    }

                    public DiscountInformation() {
                        super(-1945008516);
                    }
                }

                public final class ImageQualityMetadata extends C250663lr implements C250673ls {

                    public final class Goodness extends C250663lr implements C250673ls {
                        public Goodness() {
                            super(201808100);
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return C41848B3p.A0r();
                        }
                    }

                    public final class LifestyleBackground extends C250663lr implements C250673ls {
                        public LifestyleBackground() {
                            super(447702031);
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return C41848B3p.A0r();
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return C41847B3o.A0i(AnonymousClass4Ks.A00(), C41848B3p.A07(Goodness.class, 201808100), LifestyleBackground.class, "lifestyle_background", 447702031);
                    }

                    public ImageQualityMetadata() {
                        super(2013971276);
                    }
                }

                public final class MainImage extends C250663lr implements C250673ls {

                    public final class ImageVersions2 extends C250663lr implements C250673ls {

                        public final class Candidates extends C250663lr implements C250673ls {
                            public Candidates() {
                                super(957741652);
                            }

                            public final AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A0s();
                            }
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Candidates.class, "candidates", 957741652);
                        }

                        public ImageVersions2() {
                            super(887136400);
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return C41848B3p.A13(AnonymousClass4Ks.A01(), ImageVersions2.class, 887136400);
                    }

                    public MainImage() {
                        super(-1133909976);
                    }
                }

                public final class ThumbnailImage extends C250663lr implements C250673ls {

                    public final class ImageVersions2 extends C250663lr implements C250673ls {

                        public final class Candidates extends C250663lr implements C250673ls {
                            public Candidates() {
                                super(1515073760);
                            }

                            public final AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A0s();
                            }
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Candidates.class, "candidates", 1515073760);
                        }

                        public ImageVersions2() {
                            super(-183635373);
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return C41848B3p.A13(AnonymousClass4Ks.A01(), ImageVersions2.class, -183635373);
                    }

                    public ThumbnailImage() {
                        super(-907194521);
                    }
                }

                public final class VariantValues extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                        return C41849B3q.A0G(r1, AnonymousClass7TE.A0g(r1));
                    }

                    public VariantValues() {
                        super(657761586);
                    }
                }

                public final class AggregatedRating extends C250663lr implements C250673ls {
                    public AggregatedRating() {
                        super(1565531026);
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0V(C342787pA.A00, C41847B3o.A06(), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                    }
                }

                public final class CommerceReviewStatistics extends C250663lr implements C250673ls {
                    public CommerceReviewStatistics() {
                        super(-412182047);
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0V(AnonymousClass4L8.A00, C41848B3p.A0B(), "review_count");
                    }
                }

                public final class Merchant extends C250663lr implements C250673ls {
                    public Merchant() {
                        super(1750234820);
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return C41849B3q.A04();
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kr[] r5 = new AnonymousClass4Kr[34];
                    AnonymousClass4Kp A0C = C41845B3m.A0C(AggregatedRating.class, "aggregated_rating", 1565531026);
                    AnonymousClass4Kp A0C2 = C41845B3m.A0C(ArtsLabels.class, "arts_labels", 2117433730);
                    AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                    AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "can_share_to_story");
                    AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r1, "can_viewer_see_rnr");
                    AnonymousClass4Kp A0C3 = C41845B3m.A0C(CheckoutProperties.class, "checkout_properties", -36177335);
                    AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
                    boolean A1X = AnonymousClass7TF.A1X(new AnonymousClass4Kr[]{A0C, A0C2, A0f, A0f2, A0C3, AnonymousClass7TE.A0f(r0, "checkout_style"), C41845B3m.A0C(CommerceReviewStatistics.class, "commerce_review_statistics", -412182047), AnonymousClass7TE.A0f(r0, "compound_product_id"), AnonymousClass7TE.A0f(r0, "current_price"), AnonymousClass7TE.A0f(r0, "current_price_amount"), AnonymousClass7TE.A0f(r0, "current_price_stripped"), C41847B3o.A0U(r0), C41845B3m.A0C(DiscountInformation.class, "discount_information", -1945008516), C41847B3o.A0f(r0), AnonymousClass7TE.A0f(r0, "full_price"), AnonymousClass7TE.A0f(r0, "full_price_amount"), AnonymousClass7TE.A0f(r0, "full_price_stripped"), C41847B3o.A0e(r1), C41846B3n.A0E(r1), AnonymousClass7TE.A0f(r1, "ig_is_product_editable_on_mobile"), C41845B3m.A0C(ImageQualityMetadata.class, "image_quality_metadata", 2013971276), AnonymousClass7TE.A0f(r1, "is_entered_in_drawing"), C41847B3o.A0W(r1), C41845B3m.A0C(MainImage.class, "main_image", -1133909976), AnonymousClass7TE.A0f(r0, "main_image_id"), C41845B3m.A0C(Merchant.class, "merchant", 1750234820), C41845B3m.A0G(r0)}, r5);
                    return C41846B3n.A0N(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r0, "price"), AnonymousClass7TE.A0f(r0, "product_id"), AnonymousClass7TE.A0f(r0, "retailer_id"), AnonymousClass7TE.A0f(r0, "review_status"), AnonymousClass7TE.A0f(r0, "size_calibration_score"), C41845B3m.A0C(ThumbnailImage.class, "thumbnail_image", -907194521), C41845B3m.A0A(AnonymousClass4Ks.A00(), VariantValues.class, "variant_values", 657761586)}, r5, A1X ? 1 : 0, 27, 7);
                }

                public ProductDetails() {
                    super(888176544);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0Y(ProductDetails.class, "product_details", 888176544);
            }

            public Products() {
                super(858162943);
            }
        }

        public final class ClipsShoppingCtaBar extends C250663lr implements C250673ls {
            public ClipsShoppingCtaBar() {
                super(1223230687);
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return C41849B3q.A01();
            }
        }

        public final class Merchant extends C250663lr implements C250673ls {
            public Merchant() {
                super(1130877779);
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return C41849B3q.A04();
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return C41846B3n.A0K(C41845B3m.A0C(ClipsShoppingCtaBar.class, "clips_shopping_cta_bar", 1223230687), C41845B3m.A0C(Merchant.class, "merchant", 1130877779), C41845B3m.A0A(AnonymousClass4Ks.A00(), Products.class, "products", 858162943));
        }

        public IgtvShoppingInfo() {
            super(373545021);
        }
    }

    public final class ImageVersions2 extends C250663lr implements C250673ls {

        public final class ScrubberSpritesheetInfoCandidates extends C250663lr implements C250673ls {

            public final class Default extends C250663lr implements C250673ls {
                public Default() {
                    super(-1553998852);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return C13992Tns.A09();
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0Y(Default.class, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, -1553998852);
            }

            public ScrubberSpritesheetInfoCandidates() {
                super(-897228425);
            }
        }

        public final class AdditionalCandidates extends C250663lr implements C250673ls {

            public final class FirstFrame extends C250663lr implements C250673ls {
                public FirstFrame() {
                    super(-37256028);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return C41848B3p.A0o();
                }
            }

            public final class IgtvFirstFrame extends C250663lr implements C250673ls {
                public IgtvFirstFrame() {
                    super(1575924043);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return C41848B3p.A0o();
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return C41847B3o.A0m(C41845B3m.A0C(FirstFrame.class, "first_frame", -37256028), IgtvFirstFrame.class, "igtv_first_frame", 1575924043);
            }

            public AdditionalCandidates() {
                super(1580196258);
            }
        }

        public final class Candidates extends C250663lr implements C250673ls {
            public Candidates() {
                super(1422214717);
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return C41848B3p.A0o();
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return C41847B3o.A0j(AnonymousClass4LF.A00, C41845B3m.A0C(AdditionalCandidates.class, "additional_candidates", 1580196258), C41845B3m.A0A(AnonymousClass4Ks.A00(), Candidates.class, "candidates", 1422214717), C41845B3m.A0C(ScrubberSpritesheetInfoCandidates.class, "scrubber_spritesheet_info_candidates", -897228425), "smart_thumbnail_enabled");
        }

        public ImageVersions2() {
            super(761365765);
        }
    }

    public final class Location extends C250663lr implements C250673ls {
        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
            return C41849B3q.A0K(r0, r0);
        }

        public Location() {
            super(-179372203);
        }
    }

    public final class MediaAppreciationSettings extends C250663lr implements C250673ls {
        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
            return AnonymousClass7TG.A0V(AnonymousClass7TE.A0g(r3), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r3), "gift_count_visibility"), "media_gifting_state");
        }

        public MediaAppreciationSettings() {
            super(-752317743);
        }
    }

    public final class MediaCroppingInfo extends C250663lr implements C250673ls {

        public final class FeedPreviewCrop extends C250663lr implements C250673ls {
            public FeedPreviewCrop() {
                super(-1005032501);
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return C41849B3q.A0D();
            }
        }

        public final class SquareCrop extends C250663lr implements C250673ls {
            public SquareCrop() {
                super(-1815381215);
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return C41849B3q.A0D();
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0U(AnonymousClass4Kz.A00, C41845B3m.A0C(FeedPreviewCrop.class, "feed_preview_crop", -1005032501), C41845B3m.A0C(SquareCrop.class, "square_crop", -1815381215), "strong_id__");
        }

        public MediaCroppingInfo() {
            super(1799661485);
        }
    }

    public final class MediaNotice extends C250663lr implements C250673ls {
        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
            return C41847B3o.A0j(r4, AnonymousClass7TE.A0f(r4, "notice_icon"), AnonymousClass7TE.A0f(r4, "notice_sub_text"), AnonymousClass7TE.A0f(r4, "notice_text"), "notice_url");
        }

        public MediaNotice() {
            super(1440148420);
        }
    }

    public final class MediaOverlayInfo extends C250663lr implements C250673ls {

        public final class Buttons extends C250663lr implements C250673ls {

            public final class TextColor extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TG.A0V(AnonymousClass7TE.A0g(r0), C41848B3p.A0O(r0), "light");
                }

                public TextColor() {
                    super(1032136720);
                }
            }

            public final class Icon extends C250663lr implements C250673ls {
                public Icon() {
                    super(-800735994);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return C41848B3p.A11();
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "action");
                AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r4, "action_url");
                AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r1, "button_type");
                AnonymousClass4LF r3 = AnonymousClass4LF.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, A0f3, AnonymousClass7TE.A0f(r3, "has_chevron"), C41845B3m.A0C(Icon.class, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, -800735994), AnonymousClass7TE.A0f(r3, "is_text_centered"), AnonymousClass7TE.A0f(r4, "secondary_text"), C41846B3n.A0F(r4), C41845B3m.A0C(TextColor.class, "text_color", 1032136720)});
            }

            public Buttons() {
                super(1822921403);
            }
        }

        public final class Icon extends C250663lr implements C250673ls {
            public Icon() {
                super(-25144965);
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return C41848B3p.A11();
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A00(), Buttons.class, "buttons", 1822921403);
            AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
            AnonymousClass4L7 A0U = C41847B3o.A0U(r1);
            AnonymousClass4Kp A0C = C41845B3m.A0C(Icon.class, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, -25144965);
            AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0A, A0U, A0C, AnonymousClass7TE.A0f(r2, "misinformation_type"), AnonymousClass7TE.A0f(r2, "overlay_applied_timestamp"), AnonymousClass7TE.A0f(r2, "overlay_layout"), AnonymousClass7TE.A0f(r1, "overlay_type"), AnonymousClass7TE.A0f(r1, AnonymousClass9PN.A01()), AnonymousClass7TE.A0f(r1, "sub_category"), C41845B3m.A0I(r1)});
        }

        public MediaOverlayInfo() {
            super(1622059795);
        }
    }

    public final class MusicMetadata extends C250663lr implements C250673ls {

        public final class OriginalSoundInfo extends C250663lr implements C250673ls {

            public final class AudioParts extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0X(IGCreatorInspirationAudioPartMetaDataImpl.class, "IGCreatorInspirationAudioPartMetaData", -930788774);
                }

                public AudioParts() {
                    super(1707031608);
                }
            }

            public final class AudioPartsByFilter extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0X(IGCreatorInspirationAudioPartMetaDataImpl.class, "IGCreatorInspirationAudioPartMetaData", -930788774);
                }

                public AudioPartsByFilter() {
                    super(1813278850);
                }
            }

            public final class ConsumptionInfo extends C250663lr implements C250673ls {
                public ConsumptionInfo() {
                    super(-1245112650);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return C41848B3p.A0y();
                }
            }

            public final class IgArtist extends C250663lr implements C250673ls {
                public IgArtist() {
                    super(1426649261);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return C41849B3q.A0A();
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4LF r0 = AnonymousClass4LF.A00;
                AnonymousClass4L7 A0n = C41848B3p.A0n(r0);
                AnonymousClass4Kz r5 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0a = C41848B3p.A0a(r5);
                AnonymousClass4Kp A08 = C41848B3p.A08(AudioParts.class, 1707031608);
                AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A02(), AudioPartsByFilter.class, "audio_parts_by_filter", 1813278850);
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r0, "can_remix_be_shared_to_fb");
                AnonymousClass4Kp A05 = C41848B3p.A05(ConsumptionInfo.class, -1245112650);
                AnonymousClass4L7 A0j = C41848B3p.A0j(r5);
                AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0n, A0a, A08, A0A, A0f, A05, A0j, C41847B3o.A0C(r1), C41848B3p.A0l(r0), C41848B3p.A06(IgArtist.class, 1426649261), C41848B3p.A0M(r0), C41848B3p.A0K(r0), AnonymousClass7TE.A0f(r0, "is_original_audio_download_eligible"), AnonymousClass7TE.A0f(r0, "is_reuse_disabled"), AnonymousClass7TE.A0f(r0, "is_xpost_from_fb"), C41848B3p.A0i(r5), C41848B3p.A0U(r5), C41848B3p.A0J(r5), C41848B3p.A0R(r5), C41848B3p.A0f(r0), AnonymousClass7TE.A0f(r1, "time_created"), AnonymousClass7TE.A0f(r1, "trend_rank")});
            }

            public OriginalSoundInfo() {
                super(-1112590746);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
            return C41847B3o.A0k(AnonymousClass7TE.A0f(r1, "audio_type"), C41848B3p.A0d(r1), OriginalSoundInfo.class, "original_sound_info", -1112590746);
        }

        public MusicMetadata() {
            super(834659846);
        }
    }

    public final class OrganicCtaInfo extends C250663lr implements C250673ls {
        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
            return AnonymousClass7TG.A0U(AnonymousClass7TE.A0g(r1), AnonymousClass7TE.A0f(r1, "cta_subtitle"), C41848B3p.A0T(r1), "cta_type");
        }

        public OrganicCtaInfo() {
            super(1072429620);
        }
    }

    public final class ProductTags extends C250663lr implements C250673ls {

        public final class In extends C250663lr implements C250673ls {

            public final class Product extends C250663lr implements C250673ls {

                public final class ArtsLabels extends C250663lr implements C250673ls {

                    public final class Labels extends C250663lr implements C250673ls {
                        public final AnonymousClass4Kx modelSelectionSet() {
                            AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                            return AnonymousClass7TG.A0V(r2, AnonymousClass7TE.A0f(r2, "label_display_value"), "label_type");
                        }

                        public Labels() {
                            super(-1542455229);
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Labels.class, "labels", -1542455229);
                    }

                    public ArtsLabels() {
                        super(-1582250498);
                    }
                }

                public final class CheckoutProperties extends C250663lr implements C250673ls {

                    public final class ShippingAndReturn extends C250663lr implements C250673ls {

                        public final class ReturnCost extends C250663lr implements C250673ls {
                            public ReturnCost() {
                                super(329086421);
                            }

                            public final AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A0v();
                            }
                        }

                        public final class ShippingCost extends C250663lr implements C250673ls {
                            public ShippingCost() {
                                super(838033820);
                            }

                            public final AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A0v();
                            }
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0U(AnonymousClass4Kz.A00, C41845B3m.A0C(ReturnCost.class, "return_cost", 329086421), C41845B3m.A0C(ShippingCost.class, "shipping_cost", 838033820), "shipping_cost_stripped");
                        }

                        public ShippingAndReturn() {
                            super(1344393291);
                        }
                    }

                    public final class CurrencyAmount extends C250663lr implements C250673ls {
                        public CurrencyAmount() {
                            super(1093892995);
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return C41848B3p.A0v();
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4LF r2 = AnonymousClass4LF.A00;
                        AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r2, "can_add_to_bag");
                        AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r2, "can_enable_restock_reminder");
                        AnonymousClass4Kp A0C = C41845B3m.A0C(CurrencyAmount.class, "currency_amount", 1093892995);
                        AnonymousClass4L8 r3 = AnonymousClass4L8.A00;
                        AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r3, "full_inventory_quantity");
                        AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r2, "has_free_shipping");
                        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, A0C, A0f3, A0f4, AnonymousClass7TE.A0f(r1, "ig_referrer_fbid"), AnonymousClass7TE.A0f(r3, "inventory_quantity"), AnonymousClass7TE.A0f(r2, "is_shopify_merchant"), AnonymousClass7TE.A0f(r2, "product_group_has_inventory"), AnonymousClass7TE.A0f(r1, "receiver_id"), C41845B3m.A0C(ShippingAndReturn.class, "shipping_and_return", 1344393291), AnonymousClass7TE.A0f(r3, "viewer_purchase_limit")});
                    }

                    public CheckoutProperties() {
                        super(275762095);
                    }
                }

                public final class DiscountInformation extends C250663lr implements C250673ls {

                    public final class Discounts extends C250663lr implements C250673ls {
                        public Discounts() {
                            super(1428220110);
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return C41848B3p.A12();
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Discounts.class, "discounts", 1428220110);
                    }

                    public DiscountInformation() {
                        super(-690407014);
                    }
                }

                public final class ImageQualityMetadata extends C250663lr implements C250673ls {

                    public final class Goodness extends C250663lr implements C250673ls {
                        public Goodness() {
                            super(887454022);
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return C41848B3p.A0r();
                        }
                    }

                    public final class LifestyleBackground extends C250663lr implements C250673ls {
                        public LifestyleBackground() {
                            super(1325716489);
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return C41848B3p.A0r();
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return C41847B3o.A0i(AnonymousClass4Ks.A00(), C41848B3p.A07(Goodness.class, 887454022), LifestyleBackground.class, "lifestyle_background", 1325716489);
                    }

                    public ImageQualityMetadata() {
                        super(-1978587525);
                    }
                }

                public final class MainImage extends C250663lr implements C250673ls {

                    public final class ImageVersions2 extends C250663lr implements C250673ls {

                        public final class Candidates extends C250663lr implements C250673ls {
                            public Candidates() {
                                super(785627215);
                            }

                            public final AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A0s();
                            }
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Candidates.class, "candidates", 785627215);
                        }

                        public ImageVersions2() {
                            super(-2077122898);
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return C41848B3p.A13(AnonymousClass4Ks.A01(), ImageVersions2.class, -2077122898);
                    }

                    public MainImage() {
                        super(-2094311366);
                    }
                }

                public final class SellerBadge extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                        return AnonymousClass7TG.A0U(r3, C41847B3o.A0U(r3), C41845B3m.A0G(r3), PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    }

                    public SellerBadge() {
                        super(692148500);
                    }
                }

                public final class ThumbnailImage extends C250663lr implements C250673ls {

                    public final class ImageVersions2 extends C250663lr implements C250673ls {

                        public final class Candidates extends C250663lr implements C250673ls {
                            public Candidates() {
                                super(1877240561);
                            }

                            public final AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A0s();
                            }
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Candidates.class, "candidates", 1877240561);
                        }

                        public ImageVersions2() {
                            super(-105661540);
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), ImageVersions2.class, "image_versions2", -105661540);
                    }

                    public ThumbnailImage() {
                        super(-1251109576);
                    }
                }

                public final class AggregatedRating extends C250663lr implements C250673ls {
                    public AggregatedRating() {
                        super(-257790802);
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0V(C342787pA.A00, C41847B3o.A06(), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                    }
                }

                public final class CommerceReviewStatistics extends C250663lr implements C250673ls {
                    public CommerceReviewStatistics() {
                        super(1370918289);
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0V(AnonymousClass4L8.A00, C41848B3p.A0B(), "review_count");
                    }
                }

                public final class Merchant extends C250663lr implements C250673ls {
                    public Merchant() {
                        super(1665563444);
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return C41849B3q.A0B();
                    }
                }

                public final class RichTextDescription extends C250663lr implements C250673ls {

                    public final class TextWithEntities extends C250663lr implements C250673ls {

                        public final class InlineStyleRanges extends C250663lr implements C250673ls {
                            public InlineStyleRanges() {
                                super(66929577);
                            }

                            public final AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A0t();
                            }
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0V(AnonymousClass4Kz.A00, C41845B3m.A0A(AnonymousClass4Ks.A00(), InlineStyleRanges.class, "inline_style_ranges", 66929577), "text");
                        }

                        public TextWithEntities() {
                            super(-349891082);
                        }
                    }

                    public RichTextDescription() {
                        super(1247883843);
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return C41847B3o.A0k(C41848B3p.A0F(), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "depth"), TextWithEntities.class, "text_with_entities", -349891082);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kr[] r5 = new AnonymousClass4Kr[35];
                    AnonymousClass4Kp A0C = C41845B3m.A0C(AggregatedRating.class, "aggregated_rating", -257790802);
                    AnonymousClass4Kp A0C2 = C41845B3m.A0C(ArtsLabels.class, "arts_labels", -1582250498);
                    AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                    AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "can_share_to_story");
                    AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r1, "can_viewer_see_rnr");
                    AnonymousClass4Kp A0C3 = C41845B3m.A0C(CheckoutProperties.class, "checkout_properties", 275762095);
                    AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
                    boolean A1X = AnonymousClass7TF.A1X(new AnonymousClass4Kr[]{A0C, A0C2, A0f, A0f2, A0C3, AnonymousClass7TE.A0f(r0, "checkout_style"), C41845B3m.A0C(CommerceReviewStatistics.class, "commerce_review_statistics", 1370918289), AnonymousClass7TE.A0f(r0, "compound_product_id"), AnonymousClass7TE.A0f(r0, "current_price"), AnonymousClass7TE.A0f(r0, "current_price_amount"), AnonymousClass7TE.A0f(r0, "current_price_stripped"), C41847B3o.A0U(r0), C41845B3m.A0C(DiscountInformation.class, "discount_information", -690407014), C41847B3o.A0f(r0), AnonymousClass7TE.A0f(r0, "full_price"), AnonymousClass7TE.A0f(r0, "full_price_amount"), AnonymousClass7TE.A0f(r0, "full_price_stripped"), C41847B3o.A0e(r1), C41846B3n.A0E(r1), AnonymousClass7TE.A0f(r1, "ig_is_product_editable_on_mobile"), C41845B3m.A0C(ImageQualityMetadata.class, "image_quality_metadata", -1978587525), AnonymousClass7TE.A0f(r1, "is_entered_in_drawing"), C41847B3o.A0W(r1), C41845B3m.A0C(MainImage.class, "main_image", -2094311366), AnonymousClass7TE.A0f(r0, "main_image_id"), C41845B3m.A0C(Merchant.class, "merchant", 1665563444), C41845B3m.A0G(r0)}, r5);
                    return C41846B3n.A0N(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r0, "price"), AnonymousClass7TE.A0f(r0, "product_id"), AnonymousClass7TE.A0f(r0, "retailer_id"), AnonymousClass7TE.A0f(r0, "review_status"), C41845B3m.A0A(AnonymousClass4Ks.A00(), RichTextDescription.class, "rich_text_description", 1247883843), C41845B3m.A0C(SellerBadge.class, "seller_badge", 692148500), AnonymousClass7TE.A0f(r0, "size_calibration_score"), C41845B3m.A0C(ThumbnailImage.class, "thumbnail_image", -1251109576)}, r5, A1X ? 1 : 0, 27, 8);
                }

                public Product() {
                    super(362729596);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return C41847B3o.A0k(AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "destination"), AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "is_removable"), Product.class, "product", 362729596);
            }

            public In() {
                super(352334585);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), In.class, "in", 352334585);
        }

        public ProductTags() {
            super(528440028);
        }
    }

    public final class Senders extends C250663lr implements C250673ls {
        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
            return AnonymousClass7TG.A0V(r2, AnonymousClass7TF.A0I(r2), "profile_pic_url");
        }

        public Senders() {
            super(1823249918);
        }
    }

    public final class SocialContext extends C250663lr implements C250673ls {

        public final class SocialContextFacepileUsers extends C250663lr implements C250673ls {
            public SocialContextFacepileUsers() {
                super(-1787290593);
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return C41849B3q.A0A();
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0U(C41845B3m.A0R(), C41845B3m.A0A(AnonymousClass4Ks.A02(), SocialContextFacepileUsers.class, "social_context_facepile_users", -1787290593), AnonymousClass7TE.A0f(C41845B3m.A0P(), "social_context_type"), "social_context_users_count");
        }

        public SocialContext() {
            super(1950405335);
        }
    }

    public final class SponsorTags extends C250663lr implements C250673ls {

        public final class Sponsor extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0N = C41845B3m.A0N(r2);
                AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0N, C41847B3o.A0F(r1), AnonymousClass7TF.A0I(r2), C41847B3o.A0c(r1), AnonymousClass7TE.A0f(r1, "is_unpublished"), C41846B3n.A0H(r1), C41845B3m.A0E(r2), C41847B3o.A0Z(r2), C41847B3o.A0d(r2), C41845B3m.A0D(r2), C41847B3o.A0T(r2)});
            }

            public Sponsor() {
                super(-385232615);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4LF r1 = AnonymousClass4LF.A00;
            return C41846B3n.A0K(AnonymousClass7TE.A0f(r1, "is_pending"), AnonymousClass7TE.A0f(r1, "permission"), C41845B3m.A0A(AnonymousClass4Ks.A01(), Sponsor.class, "sponsor", -385232615));
        }

        public SponsorTags() {
            super(-685622952);
        }
    }

    public final class StoryPolls extends C250663lr implements C250673ls {

        public final class PollSticker extends C250663lr implements C250673ls {

            public final class Tallies extends C250663lr implements C250673ls {
                public Tallies() {
                    super(-166415889);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0U(AnonymousClass4Kz.A00, C41846B3n.A03(), AnonymousClass7TE.A0f(C342787pA.A00, "font_size"), "text");
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "color");
                AnonymousClass4LF r4 = AnonymousClass4LF.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, AnonymousClass7TE.A0f(r4, "finished"), AnonymousClass7TF.A0I(r1), AnonymousClass7TE.A0f(r4, "is_multi_option_poll"), AnonymousClass7TE.A0f(r4, "is_shared_result"), AnonymousClass7TE.A0f(r1, "poll_id"), AnonymousClass7TE.A0f(r1, "poll_type"), AnonymousClass7TE.A0f(r1, "question"), C41845B3m.A0A(AnonymousClass4Ks.A00(), Tallies.class, "tallies", -166415889), AnonymousClass7TE.A0f(r4, "viewer_can_vote"), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "viewer_vote")});
            }

            public PollSticker() {
                super(1827418953);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            C342787pA r3 = C342787pA.A00;
            AnonymousClass4L7 A0V = C41847B3o.A0V(r3);
            AnonymousClass4L7 A0K = C41845B3m.A0K(r3);
            AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0V, A0K, C41847B3o.A0D(r0), C41847B3o.A0Q(r0), C41847B3o.A0R(r0), C41847B3o.A0S(r0), C41845B3m.A0C(PollSticker.class, "poll_sticker", 1827418953), C41847B3o.A0N(r3), C41847B3o.A0G(r3), C41845B3m.A0J(r3), C41847B3o.A0H(r3), C41847B3o.A0I(r3), C41847B3o.A0Y(r3)});
        }

        public StoryPolls() {
            super(-527904654);
        }
    }

    public final class StorySliders extends C250663lr implements C250673ls {

        public final class SliderSticker extends C250663lr implements C250673ls {
            public SliderSticker() {
                super(1345389362);
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return C41849B3q.A05();
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            C342787pA r3 = C342787pA.A00;
            AnonymousClass4L7 A0V = C41847B3o.A0V(r3);
            AnonymousClass4L7 A0K = C41845B3m.A0K(r3);
            AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0V, A0K, C41847B3o.A0D(r0), C41847B3o.A0Q(r0), C41847B3o.A0R(r0), C41847B3o.A0S(r0), C41847B3o.A0N(r3), C41845B3m.A0C(SliderSticker.class, "slider_sticker", 1345389362), C41847B3o.A0G(r3), C41845B3m.A0J(r3), C41847B3o.A0H(r3), C41847B3o.A0I(r3), C41847B3o.A0Y(r3)});
        }

        public StorySliders() {
            super(-777735069);
        }
    }

    public final class UpcomingEvent extends C250663lr implements C250673ls {

        public final class Owner extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                return AnonymousClass7TG.A0V(r2, AnonymousClass7TF.A0I(r2), "pk");
            }

            public Owner() {
                super(-17358591);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass69U r6 = AnonymousClass69U.A00;
            AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r6, "end_time");
            AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
            return C41849B3q.A0F(r6, r4, A0f, C41846B3n.A09(r4), C41845B3m.A0C(Owner.class, "owner", -17358591));
        }

        public UpcomingEvent() {
            super(383191972);
        }
    }

    public final class User extends C250663lr implements C250673ls {
        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0X(UserInfoFragmentImpl.class, "UserInfoFragment", 1766112135);
        }

        public User() {
            super(-892337361);
        }
    }

    public final class Usertags extends C250663lr implements C250673ls {

        public final class In extends C250663lr implements C250673ls {

            public final class User extends C250663lr implements C250673ls {

                public final class FriendshipStatus extends C250663lr implements C250673ls {
                    public FriendshipStatus() {
                        super(1688825071);
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return C41849B3q.A07();
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kp A05 = C41847B3o.A05(FriendshipStatus.class, 1688825071);
                    AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                    AnonymousClass4L7 A0N = C41845B3m.A0N(r1);
                    AnonymousClass4LF r0 = AnonymousClass4LF.A00;
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A05, A0N, C41847B3o.A0F(r0), AnonymousClass7TF.A0I(r1), C41847B3o.A0c(r0), C41846B3n.A0H(r0), C41845B3m.A0E(r1), C41847B3o.A0Z(r1), C41847B3o.A0d(r1), C41845B3m.A0D(r1), C41847B3o.A0T(r1)});
                }

                public User() {
                    super(-775977040);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return C41847B3o.A0m(AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "show_category_of_user"), User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, -775977040);
            }

            public In() {
                super(1572066514);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0T(AnonymousClass4Ks.A02(), In.class, "in", 1572066514);
        }

        public Usertags() {
            super(-617248319);
        }
    }

    public final class VisualCommentReplyStickerInfo extends C250663lr implements C250673ls {

        public final class VcrSticker extends C250663lr implements C250673ls {

            public final class OriginalCommentAuthor extends C250663lr implements C250673ls {
                public OriginalCommentAuthor() {
                    super(370745647);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return C41849B3q.A02();
                }
            }

            public VcrSticker() {
                super(-1305770986);
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4L7 A09 = C41848B3p.A09();
                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r2, "end_background_color");
                C342787pA r5 = C342787pA.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A09, A0f, C41847B3o.A0V(r5), C41845B3m.A0A(AnonymousClass4Ks.A01(), OriginalCommentAuthor.class, "original_comment_author", 370745647), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "original_comment_id"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "original_comment_text"), C41848B3p.A0J(r2), AnonymousClass7TE.A0f(r2, "start_background_color"), C41847B3o.A0G(r5), AnonymousClass7TE.A0f(r2, "text_color")});
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            C342787pA r3 = C342787pA.A00;
            AnonymousClass4L7 A0V = C41847B3o.A0V(r3);
            AnonymousClass4L7 A0K = C41845B3m.A0K(r3);
            AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0V, A0K, C41847B3o.A0D(r0), C41847B3o.A0Q(r0), C41847B3o.A0R(r0), C41847B3o.A0S(r0), C41847B3o.A0N(r3), C41847B3o.A0G(r3), C41845B3m.A0C(VcrSticker.class, "vcr_sticker", -1305770986), C41845B3m.A0J(r3), C41847B3o.A0H(r3), C41847B3o.A0I(r3), C41847B3o.A0Y(r3)});
        }

        public VisualCommentReplyStickerInfo() {
            super(827870414);
        }
    }

    public final class VisualRepliesInfo extends C250663lr implements C250673ls {

        public final class CommentInfo extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                return AnonymousClass7TG.A0V(AnonymousClass7TE.A0g(r3), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r3), "comment_id"), "commenter_username");
            }

            public CommentInfo() {
                super(-30759456);
            }
        }

        public final class OriginalMedia extends C250663lr implements C250673ls {
            public OriginalMedia() {
                super(1738064409);
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0W(C41845B3m.A0P(), "pk");
            }
        }

        public VisualRepliesInfo() {
            super(-1718272272);
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return C41846B3n.A0K(C41848B3p.A09(), C41845B3m.A0A(AnonymousClass4Ks.A01(), CommentInfo.class, "comment_info", -30759456), C41845B3m.A0A(AnonymousClass4Ks.A01(), OriginalMedia.class, "original_media", 1738064409));
        }
    }

    public final class Attribution extends C250663lr implements C250673ls {
        public Attribution() {
            super(-453222363);
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0W(C41845B3m.A0P(), PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        }
    }

    public final class BrandedContentAdsBoostPostTokens extends C250663lr implements C250673ls {
        public BrandedContentAdsBoostPostTokens() {
            super(-1779248114);
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0W(C41845B3m.A0P(), "access_token");
        }
    }

    public final class CoauthorProducers extends C250663lr implements C250673ls {
        public CoauthorProducers() {
            super(-2078556405);
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return C41849B3q.A02();
        }
    }

    public final class CommentInformTreatment extends C250663lr implements C250673ls {
        public CommentInformTreatment() {
            super(1191698692);
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0V(C41845B3m.A0P(), AnonymousClass7TE.A0f(C41846B3n.A0J(), "should_have_inform_treatment"), "text");
        }
    }

    public final class FacepileTopLikers extends C250663lr implements C250673ls {
        public FacepileTopLikers() {
            super(1191545262);
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return C41849B3q.A0A();
        }
    }

    public final class IgtvSeriesInfo extends C250663lr implements C250673ls {
        public IgtvSeriesInfo() {
            super(-1425622768);
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(C41846B3n.A0J(), "has_cover_photo");
            AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
            return C41847B3o.A0j(AnonymousClass7TE.A0g(r4), A0f, C41846B3n.A09(r4), AnonymousClass7TE.A0f(C41845B3m.A0R(), "num_episodes"), DialogModule.KEY_TITLE);
        }
    }

    public final class InvitedCoauthorProducers extends C250663lr implements C250673ls {
        public InvitedCoauthorProducers() {
            super(1522785089);
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return C41849B3q.A02();
        }
    }

    public final class MashupInfo extends C250663lr implements C250673ls {
        public MashupInfo() {
            super(-881217032);
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return C41849B3q.A03();
        }
    }

    public final class SharingFrictionInfo extends C250663lr implements C250673ls {
        public SharingFrictionInfo() {
            super(-971875588);
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0W(C41846B3n.A0J(), "should_have_sharing_friction");
        }
    }

    public final class VideoVersions extends C250663lr implements C250673ls {
        public VideoVersions() {
            super(-1292252653);
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return C41847B3o.A0g();
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4Kr[] r10 = new AnonymousClass4Kr[116];
        AnonymousClass4Kp A0C = C41845B3m.A0C(WearableAttributionInfo.class, "wearable_attribution_info", 902323482);
        AnonymousClass4LF r0 = AnonymousClass4LF.A00;
        AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r0, "are_remixes_crosspostable");
        AnonymousClass4Kp A0C2 = C41845B3m.A0C(Attribution.class, "attribution", -453222363);
        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
        AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r1, "audience");
        AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r1, "boost_unavailable_identifier");
        AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r1, "boost_unavailable_reason");
        AnonymousClass4L7 A0f5 = AnonymousClass7TE.A0f(r1, "boosted_by_sponsor");
        AnonymousClass4L7 A0f6 = AnonymousClass7TE.A0f(r1, "boosted_status");
        AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A00(), BrandedContentAdsBoostPostTokens.class, "branded_content_ads_boost_post_tokens", -1779248114);
        AnonymousClass4L7 A0f7 = AnonymousClass7TE.A0f(r0, "can_see_insights_as_brand");
        AnonymousClass4L7 A0f8 = AnonymousClass7TE.A0f(r0, "can_viewer_reshare");
        AnonymousClass4L7 A0f9 = AnonymousClass7TE.A0f(r0, "can_viewer_save");
        AnonymousClass4Kp A0C3 = C41845B3m.A0C(Caption.class, "caption", -1124539568);
        AnonymousClass4L7 A0f10 = AnonymousClass7TE.A0f(r0, "caption_is_edited");
        AnonymousClass4Kp A0C4 = C41845B3m.A0C(ClipsAttributionInfo.class, "clips_attribution_info", -1386663628);
        AnonymousClass4L7 A0f11 = AnonymousClass7TE.A0f(AnonymousClass4Kz.A00(), "clips_tab_pinned_user_ids");
        AnonymousClass4Kp A0C5 = C41845B3m.A0C(ClipsMetadata.class, "clips_metadata", 1286400893);
        AnonymousClass4L7 A0f12 = AnonymousClass7TE.A0f(r0, "coauthor_producer_can_see_organic_insights");
        AnonymousClass4Kp A0A2 = C41845B3m.A0A(AnonymousClass4Ks.A00(), CoauthorProducers.class, "coauthor_producers", -2078556405);
        AnonymousClass4L7 A0f13 = AnonymousClass7TE.A0f(r1, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
        AnonymousClass4L7 A0f14 = AnonymousClass7TE.A0f(r2, "comment_count");
        AnonymousClass4Kp A0C6 = C41845B3m.A0C(CommentInformTreatment.class, "comment_inform_treatment", 1191698692);
        AnonymousClass4L7 A0f15 = AnonymousClass7TE.A0f(r0, "commenting_disabled_for_viewer");
        AnonymousClass4L7 A0f16 = AnonymousClass7TE.A0f(r0, "comments_disabled");
        AnonymousClass4Kp A0C7 = C41845B3m.A0C(CreativeConfig.class, "creative_config", -1418630075);
        AnonymousClass4L7 A0f17 = AnonymousClass7TE.A0f(r2, "deleted_reason");
        AnonymousClass69U r11 = AnonymousClass69U.A00;
        System.arraycopy(new AnonymousClass4Kr[]{A0C, A0f, A0C2, A0f2, A0f3, A0f4, A0f5, A0f6, A0A, A0f7, A0f8, A0f9, A0C3, A0f10, A0C4, A0f11, A0C5, A0f12, A0A2, A0f13, A0f14, A0C6, A0f15, A0f16, A0C7, A0f17, AnonymousClass7TE.A0f(r11, "device_timestamp")}, 0, r10, 0, 27);
        System.arraycopy(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r1, "dominant_color"), AnonymousClass7TE.A0f(r0, "enable_waist"), C41845B3m.A0A(AnonymousClass4Ks.A00(), FacepileTopLikers.class, "facepile_top_likers", 1191545262), AnonymousClass7TE.A0f(r2, "fb_like_count"), AnonymousClass7TE.A0f(r2, "fb_play_count"), AnonymousClass7TE.A0f(r2, "filter_type"), C41845B3m.A0C(FundraiserTag.class, "fundraiser_tag", -932643220), AnonymousClass7TE.A0f(r0, "has_audio"), AnonymousClass7TE.A0f(r0, "has_delayed_metadata"), AnonymousClass7TE.A0f(r0, "has_hidden_comments"), AnonymousClass7TE.A0f(r0, "has_liked"), AnonymousClass7TE.A0f(r0, "has_more_comments"), AnonymousClass7TE.A0f(r0, "has_reshares"), AnonymousClass7TE.A0f(r2, "has_shared_to_fb"), C41846B3n.A0E(r0), AnonymousClass7TE.A0f(r0, "hide_view_all_comment_entrypoint"), C41846B3n.A09(r1), AnonymousClass7TE.A0f(r0, "ig_media_sharing_disabled"), C41845B3m.A0C(IgtvSeriesInfo.class, "igtv_series_info", -1425622768), C41845B3m.A0C(IgtvShoppingInfo.class, "igtv_shopping_info", 373545021), C41845B3m.A0C(ImageVersions2.class, "image_versions2", 761365765), C41845B3m.A0A(AnonymousClass4Ks.A00(), InvitedCoauthorProducers.class, "invited_coauthor_producers", 1522785089), AnonymousClass7TE.A0f(r0, "is_artist_pick"), AnonymousClass7TE.A0f(r0, "is_comments_gif_composer_enabled"), AnonymousClass7TE.A0f(r0, "is_currently_promoting_by_sponsor"), AnonymousClass7TE.A0f(r2, "is_dash_eligible"), AnonymousClass7TE.A0f(r0, "is_fb_only")}, 0, r10, 27, 27);
        AnonymousClass4L7 A0f18 = AnonymousClass7TE.A0f(r0, "is_in_profile_grid");
        AnonymousClass4L7 A0f19 = AnonymousClass7TE.A0f(r0, "is_internal_only");
        AnonymousClass4L7 A0f20 = AnonymousClass7TE.A0f(r0, "is_organic_product_tagging_eligible");
        AnonymousClass4L7 A0f21 = AnonymousClass7TE.A0f(r0, "is_paid_partnership");
        AnonymousClass4L7 A0f22 = AnonymousClass7TE.A0f(r0, "is_post_live");
        AnonymousClass4L7 A0f23 = AnonymousClass7TE.A0f(r0, "is_third_party_downloads_eligible");
        AnonymousClass4L7 A0f24 = AnonymousClass7TE.A0f(r0, "is_unified_video");
        AnonymousClass4L7 A0f25 = AnonymousClass7TE.A0f(r0, "is_visual_reply_commenter_notice_enabled");
        C342787pA r7 = C342787pA.A00;
        System.arraycopy(new AnonymousClass4Kr[]{A0f18, A0f19, A0f20, A0f21, A0f22, A0f23, A0f24, A0f25, AnonymousClass7TE.A0f(r7, "lat"), AnonymousClass7TE.A0f(r0, "like_and_view_counts_disabled"), AnonymousClass7TE.A0f(r2, "like_count"), AnonymousClass7TE.A0f(r7, "lng"), C41845B3m.A0C(Location.class, "location", -179372203), AnonymousClass7TE.A0f(r1, "logging_info_token"), C41845B3m.A0C(MashupInfo.class, "mashup_info", -881217032), C41845B3m.A0C(MediaAppreciationSettings.class, "media_appreciation_settings", -752317743), C41845B3m.A0C(MediaCroppingInfo.class, "media_cropping_info", 1799661485), C41845B3m.A0C(MediaNotice.class, "media_notice", 1440148420), C41845B3m.A0C(MediaOverlayInfo.class, "media_overlay_info", 1622059795), C41845B3m.A0O(r2), C41845B3m.A0C(MusicMetadata.class, "music_metadata", 834659846), AnonymousClass7TE.A0f(r1, "next_max_id"), AnonymousClass7TE.A0f(r2, "number_of_qualities"), C41845B3m.A0C(OrganicCtaInfo.class, "organic_cta_info", 1072429620), AnonymousClass7TE.A0f(r1, "organic_cta_type"), AnonymousClass7TE.A0f(r1, "organic_tracking_token"), AnonymousClass7TE.A0f(r2, "original_height")}, 0, r10, 54, 27);
        System.arraycopy(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r0, "original_media_has_visual_reply_media"), AnonymousClass7TE.A0f(r2, "original_width"), AnonymousClass7TE.A0f(r0, "photo_of_you"), AnonymousClass7TE.A0f(r2, "play_count"), AnonymousClass7TE.A0f(r1, "preview"), C41845B3m.A0C(ProductTags.class, "product_tags", 528440028), C41846B3n.A0I(r1), AnonymousClass7TE.A0f(r0, "profile_grid_control_enabled"), AnonymousClass7TE.A0f(r2, "reshare_count"), C41845B3m.A0A(AnonymousClass4Ks.A00(), Senders.class, "senders", 1823249918), C41845B3m.A0C(SharingFrictionInfo.class, "sharing_friction_info", -971875588), AnonymousClass7TE.A0f(r1, "shop_routing_user_id"), C41845B3m.A0A(AnonymousClass4Ks.A00(), SocialContext.class, "social_context", 1950405335), C41845B3m.A0A(AnonymousClass4Ks.A00(), SponsorTags.class, "sponsor_tags", -685622952), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryPolls.class, "story_polls", -527904654), C41845B3m.A0A(AnonymousClass4Ks.A00(), StorySliders.class, "story_sliders", -777735069), AnonymousClass7TE.A0f(r0, "subscribe_cta_visible"), AnonymousClass7TE.A0f(r1, "subscription_media_visibility"), AnonymousClass7TE.A0f(r11, "taken_at"), C41845B3m.A0I(r1), C41845B3m.A0C(UpcomingEvent.class, "upcoming_event", 383191972), C41845B3m.A0B(User.class, -892337361), C41845B3m.A0C(Usertags.class, "usertags", -617248319), AnonymousClass7TE.A0f(r1, "video_codec"), AnonymousClass7TE.A0f(r1, "video_dash_manifest"), AnonymousClass7TE.A0f(r7, "video_duration"), AnonymousClass7TE.A0f(r7, "video_subtitles_confidence")}, 0, r10, 81, 27);
        return C41846B3n.A0N(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r1, "video_subtitles_uri"), C41845B3m.A0A(AnonymousClass4Ks.A00(), VideoVersions.class, "video_versions", -1292252653), AnonymousClass7TE.A0f(r2, "view_count"), AnonymousClass7TE.A0f(r2, "view_state_item_type"), C41845B3m.A0A(AnonymousClass4Ks.A00(), VisualCommentReplyStickerInfo.class, "visual_comment_reply_sticker_info", 827870414), C41845B3m.A0C(VisualRepliesInfo.class, "visual_replies_info", -1718272272), AnonymousClass7TE.A0f(r1, "xpost_deny_reason"), AnonymousClass7TE.A0f(AnonymousClass4Kz.A00(), "top_likers")}, r10, 0, 108, 8);
    }

    public IGCreatorInspirationHubMediaFragmentImpl() {
        super(-1290013599);
    }
}
