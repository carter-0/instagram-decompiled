package com.instagram.reels.api;

import X.AnonymousClass000;
import X.AnonymousClass4Kp;
import X.AnonymousClass4Kr;
import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L7;
import X.AnonymousClass4L8;
import X.AnonymousClass4LF;
import X.AnonymousClass69U;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C13991Tnr;
import X.C13992Tns;
import X.C250663lr;
import X.C250673ls;
import X.C273654mx;
import X.C342787pA;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import X.C41848B3p;
import X.C41849B3q;
import X.C46367Ddj;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.location.platform.api.Location;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;

public final class ReelDictFragmentImpl extends C250663lr implements C250673ls {

    public final class Broadcast extends C250663lr implements C250673ls {

        public final class BroadcastOwner extends C250663lr implements C250673ls {

            public final class FriendshipStatus extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    return C41849B3q.A0I(AnonymousClass4LF.A00);
                }

                public FriendshipStatus() {
                    super(-104084263);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kp A05 = C41847B3o.A05(FriendshipStatus.class, -104084263);
                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0N = C41845B3m.A0N(r2);
                AnonymousClass4L7 A09 = C41847B3o.A09(r2);
                AnonymousClass4LF r0 = AnonymousClass4LF.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A05, A0N, A09, C41847B3o.A0c(r0), C41846B3n.A0H(r0), AnonymousClass7TE.A0f(r2, "live_broadcast_id"), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "live_broadcast_visibility"), AnonymousClass7TE.A0f(r2, "live_subscription_status"), C41845B3m.A0E(r2), C41847B3o.A0Z(r2), C41847B3o.A0d(r2), C41845B3m.A0D(r2), C41847B3o.A0A(r2)});
            }

            public BroadcastOwner() {
                super(352478546);
            }
        }

        public final class CharityInfo extends C250663lr implements C250673ls {

            public final class CharityUser extends C250663lr implements C250673ls {

                public final class ProfileContextFacepileUsers extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
                        return C41849B3q.A0M(AnonymousClass4LF.A00, r4, C41845B3m.A0N(r4), AnonymousClass7TF.A0I(r4), "is_private");
                    }

                    public ProfileContextFacepileUsers() {
                        super(-1383456762);
                    }
                }

                public final class ProfileContextLinksWithUserIds extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
                        return AnonymousClass7TG.A0U(AnonymousClass4Kz.A00, AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "end"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "start"), C46367Ddj.A00());
                    }

                    public ProfileContextLinksWithUserIds() {
                        super(519578026);
                    }
                }

                public final class BiographyWithEntities extends C250663lr implements C250673ls {
                    public BiographyWithEntities() {
                        super(-1723951537);
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0W(C41845B3m.A0P(), "raw_text");
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kr[] r9 = new AnonymousClass4Kr[58];
                    AnonymousClass4L8 r3 = AnonymousClass4L8.A00;
                    AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r3, "account_type");
                    AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
                    AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r0, "address_street");
                    AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r0, "ads_page_id");
                    AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r0, "ads_page_name");
                    AnonymousClass4L7 A0f5 = AnonymousClass7TE.A0f(r0, "biography");
                    AnonymousClass4Kp A0C = C41845B3m.A0C(BiographyWithEntities.class, AnonymousClass000.A00(524), -1723951537);
                    AnonymousClass4L7 A0f6 = AnonymousClass7TE.A0f(r0, "business_contact_method");
                    AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                    System.arraycopy(new AnonymousClass4Kr[]{A0f, A0f2, A0f3, A0f4, A0f5, A0C, A0f6, AnonymousClass7TE.A0f(r1, "can_hide_category"), AnonymousClass7TE.A0f(r1, "can_hide_public_contacts"), AnonymousClass7TE.A0f(r0, "category"), AnonymousClass7TE.A0f(r0, "category_id"), AnonymousClass7TE.A0f(r0, "city_id"), AnonymousClass7TE.A0f(r0, "city_name"), AnonymousClass7TE.A0f(r0, "contact_phone_number"), AnonymousClass7TE.A0f(r0, "direct_messaging"), AnonymousClass7TE.A0f(r0, AnonymousClass000.A00(592)), AnonymousClass7TE.A0f(r0, "external_lynx_url"), C41847B3o.A0f(r0), AnonymousClass7TE.A0f(r0, "fb_page_call_to_action_id"), C41847B3o.A0a(r0), AnonymousClass7TE.A0f(r3, "follower_count"), AnonymousClass7TE.A0f(r3, "following_count"), C41845B3m.A0N(r0), C41847B3o.A0E(r1), AnonymousClass7TE.A0f(r0, "instagram_location_id"), AnonymousClass7TE.A0f(r1, "is_business"), AnonymousClass7TE.A0f(r1, "is_call_to_action_enabled")}, 0, r9, 0, 27);
                    AnonymousClass4L7 A0f7 = AnonymousClass7TE.A0f(r1, "is_category_tappable");
                    AnonymousClass4L7 A0f8 = AnonymousClass7TE.A0f(r1, "is_eligible_for_lead_center");
                    AnonymousClass4L7 A0f9 = AnonymousClass7TE.A0f(r1, AnonymousClass000.A00(1510));
                    AnonymousClass4L7 A0c = C41847B3o.A0c(r1);
                    AnonymousClass4L7 A0f10 = AnonymousClass7TE.A0f(r1, "is_profile_audio_call_enabled");
                    AnonymousClass4L7 A0H = C41846B3n.A0H(r1);
                    C342787pA r6 = C342787pA.A00;
                    System.arraycopy(new AnonymousClass4Kr[]{A0f7, A0f8, A0f9, A0c, A0f10, A0H, AnonymousClass7TE.A0f(r6, Location.LATITUDE), AnonymousClass7TE.A0f(r0, "lead_details_app_id"), AnonymousClass7TE.A0f(r6, "longitude"), AnonymousClass7TE.A0f(r3, "media_count"), AnonymousClass7TE.A0f(r3, "mutual_followers_count"), AnonymousClass7TE.A0f(r0, "page_id"), AnonymousClass7TE.A0f(r0, "page_name"), C41845B3m.A0E(r0), C41847B3o.A0Z(r0), AnonymousClass7TE.A0f(r3, AnonymousClass000.A00(349)), AnonymousClass7TE.A0f(r3, "professional_conversion_suggested_account_type"), AnonymousClass7TE.A0f(r0, "profile_context"), C41845B3m.A0A(AnonymousClass4Ks.A00(), ProfileContextFacepileUsers.class, AnonymousClass000.A00(1714), -1383456762), C41845B3m.A0A(AnonymousClass4Ks.A00(), ProfileContextLinksWithUserIds.class, AnonymousClass000.A00(1715), 519578026), C41845B3m.A0D(r0), AnonymousClass7TE.A0f(r0, "public_email"), AnonymousClass7TE.A0f(r0, "public_phone_country_code"), AnonymousClass7TE.A0f(r0, "public_phone_number"), AnonymousClass7TE.A0f(r1, "should_show_category"), AnonymousClass7TE.A0f(r1, AnonymousClass000.A00(189)), AnonymousClass7TE.A0f(r1, AnonymousClass000.A00(190))}, 0, r9, 27, 27);
                    return C41846B3n.A0N(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r1, AnonymousClass000.A00(191)), C41847B3o.A0B(r3), C41847B3o.A0A(r0), AnonymousClass7TE.A0f(r0, ServerW3CShippingAddressConstants.POSTAL_CODE)}, r9, 0, 54, 4);
                }

                public CharityUser() {
                    super(-1476001275);
                }
            }

            public final class ConsumptionSheetConfig extends C250663lr implements C250673ls {

                public final class DonationAmountConfig extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
                        return C41846B3n.A0M(AnonymousClass7TE.A0f(r1, "default_selected_donation_value"), AnonymousClass7TE.A0f(r1, "maximum_donation_amount"), AnonymousClass7TE.A0f(r1, "minimum_donation_amount"), AnonymousClass7TE.A0f(r1, "prefill_amount"), AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "user_currency"));
                    }

                    public DonationAmountConfig() {
                        super(480398586);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "can_viewer_donate");
                    AnonymousClass4Kp A0C = C41845B3m.A0C(DonationAmountConfig.class, "donation_amount_config", 480398586);
                    AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                    return C41847B3o.A0j(r2, A0f, A0C, AnonymousClass7TE.A0f(r2, "donation_url"), "privacy_disclaimer");
                }

                public ConsumptionSheetConfig() {
                    super(-1250465070);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return C41849B3q.A0O(C41845B3m.A0C(CharityUser.class, "charity_user", -1476001275), ConsumptionSheetConfig.class, -1250465070);
            }

            public CharityInfo() {
                super(-1436190821);
            }
        }

        public final class Cobroadcasters extends C250663lr implements C250673ls {

            public final class FriendshipStatus extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r1, "followed_by"), C41847B3o.A0b(r1), AnonymousClass7TE.A0f(r1, "incoming_request"), C41847B3o.A0P(r1), AnonymousClass7TE.A0f(r1, "is_feed_favorite"), C41847B3o.A0c(r1), AnonymousClass7TE.A0f(r1, "is_restricted"), AnonymousClass7TE.A0f(r1, "is_viewer_unconnected"), AnonymousClass7TE.A0f(r1, "outgoing_request")});
                }

                public FriendshipStatus() {
                    super(-2063363395);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kp A05 = C41847B3o.A05(FriendshipStatus.class, -2063363395);
                AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                return C41849B3q.A0L(AnonymousClass4LF.A00, r3, A05, C41845B3m.A0N(r3), C41847B3o.A09(r3));
            }

            public Cobroadcasters() {
                super(792071924);
            }
        }

        public final class DimensionsTyped extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
                return AnonymousClass7TG.A0V(AnonymousClass7TE.A0g(r0), C41848B3p.A0P(r0), IgReactMediaPickerNativeModule.WIDTH);
            }

            public DimensionsTyped() {
                super(-1689621017);
            }
        }

        public final class SponsorTags extends C250663lr implements C250673ls {

            public final class Sponsor extends C250663lr implements C250673ls {

                public final class FriendshipStatus extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0W(AnonymousClass4LF.A00, "following");
                    }

                    public FriendshipStatus() {
                        super(1511530499);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kp A05 = C41847B3o.A05(FriendshipStatus.class, 1511530499);
                    AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                    return C41849B3q.A0M(AnonymousClass4LF.A00, r3, A05, C41845B3m.A0N(r3), "is_private");
                }

                public Sponsor() {
                    super(1191525572);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "permission");
                AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A01(), Sponsor.class, "sponsor", 1191525572);
                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                return C41847B3o.A0j(r2, A0f, A0A, AnonymousClass7TE.A0f(r2, "sponsor_id"), C46367Ddj.A00());
            }

            public SponsorTags() {
                super(-752856442);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kr[] r5 = new AnonymousClass4Kr[32];
            AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
            AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r0, "broadcast_message");
            AnonymousClass4Kp A0C = C41845B3m.A0C(BroadcastOwner.class, "broadcast_owner", 352478546);
            AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r0, "broadcast_prompt");
            AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r0, "broadcast_status");
            AnonymousClass4Kp A0C2 = C41845B3m.A0C(CharityInfo.class, "charity_info", -1436190821);
            AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A00(), Cobroadcasters.class, "cobroadcasters", 792071924);
            AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r0, "cover_frame_url");
            AnonymousClass4L7 A0f5 = AnonymousClass7TE.A0f(r0, "dash_abr_playback_url");
            AnonymousClass4L7 A0f6 = AnonymousClass7TE.A0f(r0, "dash_playback_url");
            AnonymousClass4Kp A0C3 = C41845B3m.A0C(DimensionsTyped.class, "dimensions_typed", -1689621017);
            AnonymousClass4LF r1 = AnonymousClass4LF.A00;
            AnonymousClass4L7 A0f7 = AnonymousClass7TE.A0f(r1, "fan_club_subscribe_enabled");
            AnonymousClass4L7 A0f8 = AnonymousClass7TE.A0f(r1, "hide_from_feed_unit");
            AnonymousClass69U r4 = AnonymousClass69U.A00;
            AnonymousClass4L7 A0I = AnonymousClass7TF.A0I(r4);
            AnonymousClass4L7 A0f9 = AnonymousClass7TE.A0f(r1, "internal_only");
            AnonymousClass4L7 A0f10 = AnonymousClass7TE.A0f(r1, C273654mx.A00(318));
            AnonymousClass4L7 A0f11 = AnonymousClass7TE.A0f(r1, C273654mx.A00(319));
            AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
            return C41846B3n.A0N(C41848B3p.A1b(r1, r2, SponsorTags.class, -752856442), r5, AnonymousClass7TF.A1X(new AnonymousClass4Kr[]{A0f, A0C, A0f2, A0f3, A0C2, A0A, A0f4, A0f5, A0f6, A0C3, A0f7, A0f8, A0I, A0f9, A0f10, A0f11, AnonymousClass7TE.A0f(r2, "is_player_live_trace_enabled"), AnonymousClass7TE.A0f(r1, "is_viewer_comment_allowed"), AnonymousClass7TE.A0f(r4, "live_post_id"), C41847B3o.A0M(r0), AnonymousClass7TE.A0f(r1, "muted"), AnonymousClass7TE.A0f(r0, "organic_tracking_token"), AnonymousClass7TE.A0f(r2, "published_time"), AnonymousClass7TE.A0f(r2, "question_pk"), AnonymousClass7TE.A0f(r2, "ranked_position"), AnonymousClass7TE.A0f(r4, "response_timestamp"), AnonymousClass7TE.A0f(r2, "seen_ranked_position")}, r5) ? 1 : 0, 27, 5);
        }

        public Broadcast() {
            super(-1287870522);
        }
    }

    public final class HypeCommenterList extends C250663lr implements C250673ls {
        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
            return AnonymousClass7TG.A0V(r2, C41845B3m.A0E(r2), "profile_pic_url");
        }

        public HypeCommenterList() {
            super(-431464446);
        }
    }

    public final class Items extends C250663lr implements C250673ls {

        public final class MessageShare extends C250663lr implements C250673ls {

            public final class JoinChatSticker extends C250663lr implements C250673ls {

                public final class PartialRenderInfo extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                        AnonymousClass4L7 r4 = new AnonymousClass4L7(r2, "background_color_hex");
                        C342787pA r3 = C342787pA.A00;
                        return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r4, new AnonymousClass4L7(r3, "button_height_pct"), new AnonymousClass4L7(r3, "button_x"), new AnonymousClass4L7(r3, "button_y"), new AnonymousClass4L7(AnonymousClass4LF.A00, "is_dark_mode"), new AnonymousClass4L7(r3, "label_height_pct"), new AnonymousClass4L7(r3, "label_width_pct"), new AnonymousClass4L7(r3, "padding_pct"), new AnonymousClass4L7(r2, "text_color_hex")});
                    }

                    public PartialRenderInfo() {
                        super(964974663);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
                    AnonymousClass4L7 r4 = new AnonymousClass4L7(r2, "active_member_count");
                    AnonymousClass4L7 r5 = new AnonymousClass4L7(r2, "audience_type");
                    AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                    return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r4, r5, new AnonymousClass4L7(r1, "chat_type"), new AnonymousClass4L7(r2, "connected_member_count"), new AnonymousClass4L7(r1, "group_image_uri"), new AnonymousClass4L7(r2, "member_count"), new AnonymousClass4L7(r1, "member_status"), new AnonymousClass4Kp(PartialRenderInfo.class, "partial_render_info", 964974663), new AnonymousClass4L7(r1, "sticker_type"), new AnonymousClass4L7(r1, "story_chat_id"), new AnonymousClass4L7(r1, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID), new AnonymousClass4L7(r1, DialogModule.KEY_TITLE)});
                }

                public JoinChatSticker() {
                    super(-169915905);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                C342787pA r2 = C342787pA.A00;
                AnonymousClass4L7 r4 = new AnonymousClass4L7(r2, "end_time_ms");
                AnonymousClass4L7 r5 = new AnonymousClass4L7(r2, IgReactMediaPickerNativeModule.HEIGHT);
                AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
                return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r4, r5, new AnonymousClass4L7(r1, "is_fb_sticker"), new AnonymousClass4L7(r1, "is_hidden"), new AnonymousClass4L7(r1, "is_pinned"), new AnonymousClass4L7(r1, "is_sticker"), new AnonymousClass4Kp(JoinChatSticker.class, "join_chat_sticker", -169915905), new AnonymousClass4L7(r2, "rotation"), new AnonymousClass4L7(r2, "start_time_ms"), new AnonymousClass4L7(r2, IgReactMediaPickerNativeModule.WIDTH), new AnonymousClass4L7(r2, "x"), new AnonymousClass4L7(r2, "y"), new AnonymousClass4L7(r2, "z")});
            }

            public MessageShare() {
                super(-723637346);
            }
        }

        public final class StoryChats extends C250663lr implements C250673ls {

            public final class JoinChatSticker extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
                    AnonymousClass4L7 r3 = new AnonymousClass4L7(r2, "active_member_count");
                    AnonymousClass4L7 r4 = new AnonymousClass4L7(r2, "audience_type");
                    AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                    return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r3, r4, new AnonymousClass4L7(r1, "chat_type"), new AnonymousClass4L7(r2, "connected_member_count"), new AnonymousClass4L7(r1, "group_image_uri"), new AnonymousClass4L7(r2, "member_count"), new AnonymousClass4L7(r1, "member_status"), new AnonymousClass4L7(r1, "sticker_type"), new AnonymousClass4L7(r1, "story_chat_id"), new AnonymousClass4L7(r1, ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID), new AnonymousClass4L7(r1, DialogModule.KEY_TITLE)});
                }

                public JoinChatSticker() {
                    super(190256903);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                C342787pA r2 = C342787pA.A00;
                AnonymousClass4L7 r4 = new AnonymousClass4L7(r2, "end_time_ms");
                AnonymousClass4L7 r5 = new AnonymousClass4L7(r2, IgReactMediaPickerNativeModule.HEIGHT);
                AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
                return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r4, r5, new AnonymousClass4L7(r1, "is_fb_sticker"), new AnonymousClass4L7(r1, "is_hidden"), new AnonymousClass4L7(r1, "is_pinned"), new AnonymousClass4L7(r1, "is_sticker"), new AnonymousClass4Kp(JoinChatSticker.class, "join_chat_sticker", 190256903), new AnonymousClass4L7(r2, "rotation"), new AnonymousClass4L7(r2, "start_time_ms"), new AnonymousClass4L7(r2, IgReactMediaPickerNativeModule.WIDTH), new AnonymousClass4L7(r2, "x"), new AnonymousClass4L7(r2, "y"), new AnonymousClass4L7(r2, "z")});
            }

            public StoryChats() {
                super(-183260748);
            }
        }

        public final class WearableAttributionInfo extends C250663lr implements C250673ls {

            public final class WorldLocationPagesInfo extends C250663lr implements C250673ls {
                public WorldLocationPagesInfo() {
                    super(-1921586090);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return C13992Tns.A07();
                }
            }

            public WearableAttributionInfo() {
                super(-835453027);
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4L7 A0D = C13991Tnr.A0D();
                AnonymousClass4L7 A0E = C13991Tnr.A0E();
                AnonymousClass4L7 A0F = C13991Tnr.A0F();
                AnonymousClass4L7 A0G = C13991Tnr.A0G();
                AnonymousClass4L7 A0H = C13991Tnr.A0H();
                AnonymousClass4L7 A0B = C13991Tnr.A0B();
                AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                return new AnonymousClass4Kx(new AnonymousClass4Kr[]{A0D, A0E, A0F, A0G, A0H, A0B, new AnonymousClass4L7(r1, "attribution_type"), C13991Tnr.A0C(), new AnonymousClass4L7(r1, "iconic_horizon_world_deeplink"), new AnonymousClass4L7(r1, "iconic_horizon_world_id"), new AnonymousClass4L7(r1, "iconic_horizon_world_name"), C13991Tnr.A0I(), new AnonymousClass4Kp(WorldLocationPagesInfo.class, "world_location_pages_info", -1921586090)});
            }
        }

        public final class AvatarStickers extends C250663lr implements C250673ls {

            public final class AuthorAvatarSticker extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r5 = AnonymousClass4Kz.A00;
                    return C41846B3n.A0M(AnonymousClass7TE.A0f(r5, "accessibility_label"), AnonymousClass7TE.A0f(r5, "avatar_sticker_id"), AnonymousClass7TE.A0f(r5, AnonymousClass000.A00(2970)), AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "has_avatar"), C41845B3m.A0O(r5));
                }

                public AuthorAvatarSticker() {
                    super(34471897);
                }
            }

            public final class ViewerAvatarSticker extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r5 = AnonymousClass4Kz.A00;
                    return C41846B3n.A0M(AnonymousClass7TE.A0f(r5, "accessibility_label"), AnonymousClass7TE.A0f(r5, "avatar_sticker_id"), AnonymousClass7TE.A0f(r5, AnonymousClass000.A00(2970)), AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "has_avatar"), C41845B3m.A0O(r5));
                }

                public ViewerAvatarSticker() {
                    super(-461730718);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kp A0C = C41845B3m.A0C(AuthorAvatarSticker.class, C273654mx.A00(121), 34471897);
                AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, AnonymousClass000.A00(1127));
                C342787pA r3 = C342787pA.A00;
                AnonymousClass4L7 A0V = C41847B3o.A0V(r3);
                AnonymousClass4L7 A0K = C41845B3m.A0K(r3);
                AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0C, A0f, A0V, A0K, C41847B3o.A0D(r0), C41847B3o.A0Q(r0), C41847B3o.A0R(r0), C41847B3o.A0S(r0), C41847B3o.A0N(r3), C41847B3o.A0G(r3), C41845B3m.A0M(r1), C41845B3m.A0C(ViewerAvatarSticker.class, C273654mx.A00(195), -461730718), C41845B3m.A0J(r3), C41847B3o.A0H(r3), C41847B3o.A0I(r3), C41847B3o.A0Y(r3)});
            }

            public AvatarStickers() {
                super(1430707362);
            }
        }

        public final class Caption extends C250663lr implements C250673ls {

            public final class User extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                    AnonymousClass4L7 A0a = C41847B3o.A0a(r1);
                    AnonymousClass4L7 A0N = C41845B3m.A0N(r1);
                    AnonymousClass4LF r0 = AnonymousClass4LF.A00;
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0a, A0N, C41847B3o.A0F(r0), AnonymousClass7TF.A0I(r1), C41847B3o.A0c(r0), C41846B3n.A0H(r0), C41845B3m.A0E(r1), C41847B3o.A0Z(r1), C41847B3o.A0d(r1), C41845B3m.A0D(r1), C41847B3o.A0A(r1)});
                }

                public User() {
                    super(1594490624);
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
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, A0f3, A0f4, AnonymousClass7TE.A0f(r32, "did_report_as_spam"), AnonymousClass7TE.A0f(r32, "has_translation"), AnonymousClass7TE.A0f(r32, "is_covered"), AnonymousClass7TE.A0f(r32, "is_ranked_comment"), C41847B3o.A0M(r2), C41846B3n.A0B(r2), AnonymousClass7TE.A0f(r0, "private_reply_status"), AnonymousClass7TE.A0f(r32, "share_enabled"), C41845B3m.A0L(r2), C41846B3n.A0F(r2), C41845B3m.A0H(r0), C41845B3m.A0B(User.class, 1594490624), C41845B3m.A0M(r2)});
            }

            public Caption() {
                super(1738176537);
            }
        }

        public final class CreateModeAttribution extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                return AnonymousClass7TG.A0V(r2, C41845B3m.A0G(r2), PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
            }

            public CreateModeAttribution() {
                super(553993658);
            }
        }

        public final class CreativeConfig extends C250663lr implements C250673ls {

            public final class AttributionUser extends C250663lr implements C250673ls {

                public final class ProfilePicture extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0W(AnonymousClass4Kz.A00, "uri");
                    }

                    public ProfilePicture() {
                        super(1086316257);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r5 = AnonymousClass4Kz.A00;
                    return C41847B3o.A0j(r5, AnonymousClass7TF.A0I(r5), AnonymousClass7TE.A0f(r5, "instagram_user_id"), C41845B3m.A0C(ProfilePicture.class, "profile_picture", 1086316257), C46367Ddj.A00());
                }

                public AttributionUser() {
                    super(-869327792);
                }
            }

            public final class EffectPreview extends C250663lr implements C250673ls {

                public final class AttributionUser extends C250663lr implements C250673ls {

                    public final class ProfilePicture extends C250663lr implements C250673ls {
                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0W(AnonymousClass4Kz.A00, "uri");
                        }

                        public ProfilePicture() {
                            super(2021721948);
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
                        return AnonymousClass7TG.A0U(r4, AnonymousClass7TE.A0f(r4, "instagram_user_id"), C41845B3m.A0C(ProfilePicture.class, "profile_picture", 2021721948), C46367Ddj.A00());
                    }

                    public AttributionUser() {
                        super(-1732906056);
                    }
                }

                public final class ThumbnailImage extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0W(AnonymousClass4Kz.A00, "uri");
                    }

                    public ThumbnailImage() {
                        super(380471457);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A01(), AttributionUser.class, "attribution_user", -1732906056);
                    AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0A, AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "attribution_user_id"), C41846B3n.A09(r2), AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "is_age_restricted"), C41846B3n.A0C(r2), C41848B3p.A0L(r2), C41845B3m.A0C(ThumbnailImage.class, "thumbnail_image", 380471457)});
                }

                public EffectPreview() {
                    super(-661650572);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kp A0C = C41845B3m.A0C(AttributionUser.class, "attribution_user", -869327792);
                AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0C, AnonymousClass7TE.A0f(r1, "attribution_user_id"), AnonymousClass7TE.A0f(r1, "camera_facing"), AnonymousClass7TE.A0f(r1, "capture_type"), C41845B3m.A0C(EffectPreview.class, "effect_preview", -661650572), AnonymousClass7TE.A0f(r1, "expressive_format"), AnonymousClass7TE.A0f(r1, "face_effect_id"), AnonymousClass7TE.A0f(r1, TraceFieldType.FailureReason), AnonymousClass7TE.A0f(r1, "format_variant"), AnonymousClass7TE.A0f(r1, "persisted_effect_metadata_json"), AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "should_render_try_it_on")});
            }

            public CreativeConfig() {
                super(-1412038795);
            }
        }

        public final class CutoutStickers extends C250663lr implements C250673ls {

            public final class StickerCreator extends C250663lr implements C250673ls {
                public StickerCreator() {
                    super(640653028);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4L7 A0H = C41846B3n.A0H(C41846B3n.A0J());
                    AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TG.A0U(AnonymousClass7TE.A0g(r0), A0H, C41845B3m.A0D(r0), C46367Ddj.A00());
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A09 = C41846B3n.A09(r3);
                AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "image_height");
                AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r1, "image_width");
                AnonymousClass4LF r2 = AnonymousClass4LF.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A09, A0f, A0f2, AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "is_save_allowed"), AnonymousClass7TE.A0f(r2, "is_saved"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r3), "media_url"), C41845B3m.A0C(StickerCreator.class, "sticker_creator", 640653028), AnonymousClass7TE.A0f(r3, "sticker_creator_username"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r3), "sticker_type")});
            }

            public CutoutStickers() {
                super(541101271);
            }
        }

        public final class FundraiserTag extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0W(AnonymousClass4LF.A00, "has_standalone_fundraiser");
            }

            public FundraiserTag() {
                super(-1168266768);
            }
        }

        public final class HighlightsInfo extends C250663lr implements C250673ls {

            public final class AddedTo extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TG.A0V(r2, AnonymousClass7TE.A0f(r2, "reel_id"), DialogModule.KEY_TITLE);
                }

                public AddedTo() {
                    super(798626745);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), AddedTo.class, "added_to", 798626745);
            }

            public HighlightsInfo() {
                super(2008070795);
            }
        }

        public final class ImageVersions2 extends C250663lr implements C250673ls {

            public final class Candidates extends C250663lr implements C250673ls {
                public Candidates() {
                    super(-1792090534);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return C41848B3p.A0o();
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Candidates.class, "candidates", -1792090534);
            }

            public ImageVersions2() {
                super(1160869604);
            }
        }

        public final class Location extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
                return C41849B3q.A0K(r0, r0);
            }

            public Location() {
                super(66513659);
            }
        }

        public final class MediaNotice extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
                return C41847B3o.A0j(r4, AnonymousClass7TE.A0f(r4, "notice_icon"), AnonymousClass7TE.A0f(r4, "notice_sub_text"), AnonymousClass7TE.A0f(r4, "notice_text"), "notice_url");
            }

            public MediaNotice() {
                super(-1028618178);
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
                        super(-549312618);
                    }
                }

                public final class Icon extends C250663lr implements C250673ls {
                    public Icon() {
                        super(-1085172641);
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
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, A0f3, AnonymousClass7TE.A0f(r3, "has_chevron"), C41845B3m.A0C(Icon.class, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, -1085172641), AnonymousClass7TE.A0f(r3, "is_text_centered"), C41846B3n.A0F(r4), C41845B3m.A0C(TextColor.class, "text_color", -549312618)});
                }

                public Buttons() {
                    super(-413400341);
                }
            }

            public final class Icon extends C250663lr implements C250673ls {
                public Icon() {
                    super(2035147208);
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return C41848B3p.A11();
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A00(), Buttons.class, "buttons", -413400341);
                AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0A, C41847B3o.A0U(r3), C41845B3m.A0C(Icon.class, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, 2035147208), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "overlay_layout"), AnonymousClass7TE.A0f(r3, "overlay_type"), AnonymousClass7TE.A0f(r3, C46367Ddj.A01(9, 10, 65)), AnonymousClass7TE.A0f(r3, "sub_category"), C41845B3m.A0I(r3)});
            }

            public MediaOverlayInfo() {
                super(1074865333);
            }
        }

        public final class Owner extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0V(AnonymousClass4Kz.A00, C41847B3o.A0c(AnonymousClass4LF.A00), "pk");
            }

            public Owner() {
                super(-479067746);
            }
        }

        public final class PreviewComments extends C250663lr implements C250673ls {

            public final class User extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
                    return C41849B3q.A0L(AnonymousClass4LF.A00, r4, C41847B3o.A0a(r4), C41845B3m.A0N(r4), AnonymousClass7TF.A0I(r4));
                }

                public User() {
                    super(1928631243);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r0, "bit_flags");
                AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r0, "comment_like_count");
                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r2, TraceFieldType.ContentType);
                AnonymousClass69U r3 = AnonymousClass69U.A00;
                AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r3, "created_at");
                AnonymousClass4L7 A0f5 = AnonymousClass7TE.A0f(r3, "created_at_utc");
                AnonymousClass4LF r32 = AnonymousClass4LF.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, A0f3, A0f4, A0f5, AnonymousClass7TE.A0f(r32, "did_report_as_spam"), AnonymousClass7TE.A0f(r32, "has_liked_comment"), AnonymousClass7TE.A0f(r32, "is_covered"), AnonymousClass7TE.A0f(r32, "is_ranked_comment"), C41847B3o.A0M(r2), C41846B3n.A0B(r2), AnonymousClass7TE.A0f(r0, "restricted_status"), AnonymousClass7TE.A0f(r32, "share_enabled"), C41845B3m.A0L(r2), C41846B3n.A0F(r2), C41845B3m.A0H(r0), C41845B3m.A0B(User.class, 1928631243), C41845B3m.A0M(r2)});
            }

            public PreviewComments() {
                super(746537752);
            }
        }

        public final class ReelMentions extends C250663lr implements C250673ls {

            public final class User extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
                    AnonymousClass4L7 A0N = C41845B3m.A0N(r4);
                    AnonymousClass4LF r2 = AnonymousClass4LF.A00;
                    return C41849B3q.A0M(r2, r4, A0N, C41847B3o.A0F(r2), "is_private");
                }

                public User() {
                    super(-855916344);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "display_type");
                C342787pA r2 = C342787pA.A00;
                AnonymousClass4L7 A0V = C41847B3o.A0V(r2);
                AnonymousClass4L7 A0K = C41845B3m.A0K(r2);
                AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0V, A0K, C41847B3o.A0D(r0), C41847B3o.A0Q(r0), C41847B3o.A0R(r0), C41847B3o.A0S(r0), C41847B3o.A0N(r2), C41847B3o.A0G(r2), C41845B3m.A0B(User.class, -855916344), C41845B3m.A0J(r2), C41847B3o.A0H(r2), C41847B3o.A0I(r2), C41847B3o.A0Y(r2)});
            }

            public ReelMentions() {
                super(951731133);
            }
        }

        public final class ResharedStoryMediaAuthor extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0N = C41845B3m.A0N(r4);
                AnonymousClass4LF r2 = AnonymousClass4LF.A00;
                return C41849B3q.A0M(r2, r4, A0N, C41847B3o.A0F(r2), "is_private");
            }

            public ResharedStoryMediaAuthor() {
                super(-414886132);
            }
        }

        public final class SharingFrictionInfo extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                return AnonymousClass7TG.A0U(C41846B3n.A0J(), AnonymousClass7TE.A0f(r1, "bloks_app_url"), AnonymousClass7TE.A0f(r1, "sharing_friction_payload"), "should_have_sharing_friction");
            }

            public SharingFrictionInfo() {
                super(-1440033722);
            }
        }

        public final class SponsorTags extends C250663lr implements C250673ls {

            public final class Sponsor extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
                    AnonymousClass4L7 A0N = C41845B3m.A0N(r4);
                    AnonymousClass4LF r2 = AnonymousClass4LF.A00;
                    return C41849B3q.A0M(r2, r4, A0N, C41847B3o.A0c(r2), "is_unpublished");
                }

                public Sponsor() {
                    super(817138476);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                return C41846B3n.A0K(AnonymousClass7TE.A0f(r1, "is_pending"), AnonymousClass7TE.A0f(r1, "permission"), C41845B3m.A0A(AnonymousClass4Ks.A01(), Sponsor.class, "sponsor", 817138476));
            }

            public SponsorTags() {
                super(-891254607);
            }
        }

        public final class StoryAppAttribution extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r1, "app_action_text"), AnonymousClass7TE.A0f(r1, "app_icon_url"), AnonymousClass7TE.A0f(r1, "content_url"), AnonymousClass7TF.A0I(r1), AnonymousClass7TE.A0f(r1, "link"), C41845B3m.A0G(r1), AnonymousClass7TE.A0f(r1, "preview_url")});
            }

            public StoryAppAttribution() {
                super(-2033629245);
            }
        }

        public final class StoryBloksTappables extends C250663lr implements C250673ls {

            public final class BloksTappableSticker extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r1, "accessibility_hint"), AnonymousClass7TE.A0f(r1, "action_tooltip_text"), AnonymousClass7TE.A0f(r1, "bloks_app"), AnonymousClass7TF.A0I(r1), AnonymousClass7TE.A0f(r1, "nux_tooltip_text"), AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "should_preload"), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "show_tooltip_count")});
                }

                public BloksTappableSticker() {
                    super(-130919761);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kp A0C = C41845B3m.A0C(BloksTappableSticker.class, C273654mx.A00(125), -130919761);
                C342787pA r2 = C342787pA.A00;
                return C41849B3q.A0N(r2, r2, A0C, C41847B3o.A0V(r2), IgReactMediaPickerNativeModule.HEIGHT);
            }

            public StoryBloksTappables() {
                super(1325027243);
            }
        }

        public final class StoryComments extends C250663lr implements C250673ls {

            public final class User extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                    AnonymousClass4L7 A0a = C41847B3o.A0a(r2);
                    AnonymousClass4L7 A0N = C41845B3m.A0N(r2);
                    AnonymousClass4L7 A0I = AnonymousClass7TF.A0I(r2);
                    AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                    AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "is_mentionable");
                    AnonymousClass4L7 A0c = C41847B3o.A0c(r1);
                    AnonymousClass4L7 A0H = C41846B3n.A0H(r1);
                    AnonymousClass69U r12 = AnonymousClass69U.A00;
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0a, A0N, A0I, A0f, A0c, A0H, AnonymousClass7TE.A0f(r12, "latest_besties_reel_media"), AnonymousClass7TE.A0f(r12, "latest_reel_media"), C41845B3m.A0E(r2), C41847B3o.A0Z(r2), C41847B3o.A0d(r2), C41845B3m.A0D(r2), C41847B3o.A0A(r2)});
                }

                public User() {
                    super(1941640338);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "bit_flags");
                AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r1, "comment_like_count");
                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r2, TraceFieldType.ContentType);
                AnonymousClass69U r3 = AnonymousClass69U.A00;
                AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r3, "created_at");
                AnonymousClass4L7 A0f5 = AnonymousClass7TE.A0f(r3, "created_at_utc");
                AnonymousClass4LF r0 = AnonymousClass4LF.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, A0f3, A0f4, A0f5, AnonymousClass7TE.A0f(r0, "did_report_as_spam"), AnonymousClass7TE.A0f(r0, "has_liked_comment"), AnonymousClass7TE.A0f(r0, "has_translation"), AnonymousClass7TE.A0f(r2, "inline_composer_display_condition"), AnonymousClass7TE.A0f(r0, "is_covered"), AnonymousClass7TE.A0f(r0, "is_ranked_comment"), C41847B3o.A0M(r2), C41846B3n.A0B(r2), AnonymousClass7TE.A0f(r1, "private_reply_status"), AnonymousClass7TE.A0f(r1, "restricted_status"), AnonymousClass7TE.A0f(r0, "share_enabled"), C41845B3m.A0L(r2), C41846B3n.A0F(r2), C41845B3m.A0H(r1), C41845B3m.A0B(User.class, 1941640338), C41845B3m.A0M(r2)});
            }

            public StoryComments() {
                super(274044089);
            }
        }

        public final class StoryCountdowns extends C250663lr implements C250673ls {

            public final class CountdownSticker extends C250663lr implements C250673ls {

                public final class Attribution extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                        AnonymousClass4L7 A0N = C41845B3m.A0N(r1);
                        AnonymousClass4LF r0 = AnonymousClass4LF.A00;
                        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0N, C41847B3o.A0c(r0), C41846B3n.A0H(r0), C41845B3m.A0E(r1), C41847B3o.A0Z(r1), C41847B3o.A0d(r1), C41845B3m.A0D(r1), C41847B3o.A0A(r1)});
                    }

                    public Attribution() {
                        super(711582787);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kp A0C = C41845B3m.A0C(Attribution.class, "attribution", 711582787);
                    AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                    AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r2, "countdown_id");
                    AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r2, "digit_card_color");
                    AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r2, "digit_color");
                    AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r2, "end_background_color");
                    AnonymousClass4L7 A0f5 = AnonymousClass7TE.A0f(AnonymousClass69U.A00, "end_ts");
                    AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0C, A0f, A0f2, A0f3, A0f4, A0f5, AnonymousClass7TE.A0f(r1, "following_enabled"), AnonymousClass7TE.A0f(r1, "is_owner"), AnonymousClass7TE.A0f(r2, "start_background_color"), C41846B3n.A0F(r2), AnonymousClass7TE.A0f(r2, "text_color"), AnonymousClass7TE.A0f(r1, "viewer_is_following")});
                }

                public CountdownSticker() {
                    super(536610003);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kp A0C = C41845B3m.A0C(CountdownSticker.class, AnonymousClass000.A00(572), 536610003);
                C342787pA r2 = C342787pA.A00;
                return C41849B3q.A0N(r2, r2, A0C, C41847B3o.A0V(r2), IgReactMediaPickerNativeModule.HEIGHT);
            }

            public StoryCountdowns() {
                super(1812374435);
            }
        }

        public final class StoryCta extends C250663lr implements C250673ls {

            public final class Links extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r2, "androidClass"), AnonymousClass7TE.A0f(r2, "callToActionTitle"), AnonymousClass7TE.A0f(r2, "deeplinkUri"), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "linkType"), AnonymousClass7TE.A0f(r2, "package"), AnonymousClass7TE.A0f(r2, "tapAndHoldContext"), AnonymousClass7TE.A0f(r2, "webUri")});
                }

                public Links() {
                    super(-1056912735);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Links.class, "links", -1056912735);
            }

            public StoryCta() {
                super(-879968258);
            }
        }

        public final class StoryFbCommunities extends C250663lr implements C250673ls {

            public final class FbCommunitySticker extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r1, "fb_entity_author_id"), AnonymousClass7TE.A0f(r1, "fb_entity_id"), AnonymousClass7TE.A0f(r1, "fb_entity_subtype"), AnonymousClass7TE.A0f(r1, "fb_entity_type"), AnonymousClass7TE.A0f(r1, "fb_entity_url"), AnonymousClass7TE.A0f(r1, "fb_reshare_session_id"), AnonymousClass7TE.A0f(r1, "mib_extid")});
                }

                public FbCommunitySticker() {
                    super(1131460743);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                C342787pA r4 = C342787pA.A00;
                return C41849B3q.A0N(r4, r4, C41847B3o.A0V(r4), C41845B3m.A0C(FbCommunitySticker.class, AnonymousClass000.A00(1344), 1131460743), IgReactMediaPickerNativeModule.HEIGHT);
            }

            public StoryFbCommunities() {
                super(1849673978);
            }
        }

        public final class StoryFbTags extends C250663lr implements C250673ls {

            public final class FbTagSticker extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
                    return C41847B3o.A0j(r4, AnonymousClass7TE.A0f(r4, "fb_tag_id"), AnonymousClass7TE.A0f(r4, "fb_tag_name"), AnonymousClass7TE.A0f(r4, "fb_tag_type"), "fb_tag_url");
                }

                public FbTagSticker() {
                    super(-1204535087);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                C342787pA r4 = C342787pA.A00;
                return C41849B3q.A0N(r4, r4, C41847B3o.A0V(r4), C41845B3m.A0C(FbTagSticker.class, AnonymousClass000.A00(1346), -1204535087), IgReactMediaPickerNativeModule.HEIGHT);
            }

            public StoryFbTags() {
                super(1624663772);
            }
        }

        public final class StoryFeedMedia extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r2, "clips_creation_entry_point");
                C342787pA r1 = C342787pA.A00;
                AnonymousClass4L7 A0V = C41847B3o.A0V(r1);
                AnonymousClass4L7 A0K = C41845B3m.A0K(r1);
                AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0V, A0K, C41847B3o.A0D(r0), C41847B3o.A0Q(r0), C41847B3o.A0R(r0), C41847B3o.A0S(r0), AnonymousClass7TE.A0f(r2, "media_code"), AnonymousClass7TE.A0f(r2, "media_compound_str"), C41847B3o.A0M(r2), C41846B3n.A0I(r2), C41847B3o.A0N(r1), C41847B3o.A0G(r1), C41845B3m.A0J(r1), C41847B3o.A0H(r1), C41847B3o.A0I(r1), C41847B3o.A0Y(r1)});
            }

            public StoryFeedMedia() {
                super(-494019661);
            }
        }

        public final class StoryHashtags extends C250663lr implements C250673ls {

            public final class Hashtag extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TG.A0V(r2, AnonymousClass7TF.A0I(r2), PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                }

                public Hashtag() {
                    super(-620068380);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                C342787pA r4 = C342787pA.A00;
                return C41849B3q.A0N(r4, r4, C41847B3o.A0V(r4), C41845B3m.A0C(Hashtag.class, "hashtag", -620068380), IgReactMediaPickerNativeModule.HEIGHT);
            }

            public StoryHashtags() {
                super(-806900063);
            }
        }

        public final class StoryLinkStickers extends C250663lr implements C250673ls {

            public final class StoryLink extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                    return new AnonymousClass4Kx(new AnonymousClass4Kr[]{new AnonymousClass4L7(r2, "click_id"), new AnonymousClass4L7(r2, "display_url"), new AnonymousClass4L7(AnonymousClass4LF.A00, "is_universal_link"), new AnonymousClass4L7(r2, "link_title"), new AnonymousClass4L7(r2, "link_type"), new AnonymousClass4L7(r2, "url")});
                }

                public StoryLink() {
                    super(2071480910);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                C342787pA r3 = C342787pA.A00;
                AnonymousClass4L7 A0V = C41847B3o.A0V(r3);
                AnonymousClass4L7 A0K = C41845B3m.A0K(r3);
                AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0V, A0K, C41847B3o.A0D(r0), C41847B3o.A0Q(r0), C41847B3o.A0R(r0), C41847B3o.A0S(r0), C41847B3o.A0N(r3), C41847B3o.A0G(r3), C41845B3m.A0C(StoryLink.class, "story_link", 2071480910), C41845B3m.A0J(r3), C41847B3o.A0H(r3), C41847B3o.A0I(r3), C41847B3o.A0Y(r3)});
            }

            public StoryLinkStickers() {
                super(1735711371);
            }
        }

        public final class StoryLocations extends C250663lr implements C250673ls {

            public final class Location extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                    AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r2, "address");
                    AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r2, ServerW3CShippingAddressConstants.CITY);
                    AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r2, "external_source");
                    AnonymousClass69U r3 = AnonymousClass69U.A00;
                    AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r3, "facebook_places_id");
                    AnonymousClass4L7 A0E = C41846B3n.A0E(AnonymousClass4LF.A00);
                    C342787pA r1 = C342787pA.A00;
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, A0f3, A0f4, A0E, AnonymousClass7TE.A0f(r1, "lat"), AnonymousClass7TE.A0f(r1, "lng"), C41845B3m.A0G(r2), C41845B3m.A0E(r3), AnonymousClass7TE.A0f(r2, "short_name")});
                }

                public Location() {
                    super(172057865);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                C342787pA r3 = C342787pA.A00;
                AnonymousClass4L7 A0V = C41847B3o.A0V(r3);
                AnonymousClass4L7 A0K = C41845B3m.A0K(r3);
                AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0V, A0K, C41847B3o.A0D(r0), C41847B3o.A0Q(r0), C41847B3o.A0R(r0), C41847B3o.A0S(r0), C41845B3m.A0C(Location.class, "location", 172057865), C41847B3o.A0N(r3), C41847B3o.A0G(r3), C41845B3m.A0J(r3), C41847B3o.A0H(r3), C41847B3o.A0I(r3), C41847B3o.A0Y(r3)});
            }

            public StoryLocations() {
                super(-1445930825);
            }
        }

        public final class StoryMusicLyricStickers extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                C342787pA r0 = C342787pA.A00;
                return C41849B3q.A0J(r0, r0);
            }

            public StoryMusicLyricStickers() {
                super(-1128324902);
            }
        }

        public final class StoryMusicPickStickers extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                C342787pA r0 = C342787pA.A00;
                return C41849B3q.A0J(r0, r0);
            }

            public StoryMusicPickStickers() {
                super(-345036116);
            }
        }

        public final class StoryMusicStickers extends C250663lr implements C250673ls {

            public final class MusicAssetInfo extends C250663lr implements C250673ls {

                public final class IgArtist extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
                        AnonymousClass4L7 A0N = C41845B3m.A0N(r4);
                        AnonymousClass4LF r2 = AnonymousClass4LF.A00;
                        return C41849B3q.A0M(r2, r4, A0N, C41847B3o.A0F(r2), "is_private");
                    }

                    public IgArtist() {
                        super(1638750556);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kr[] r6 = new AnonymousClass4Kr[29];
                    AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                    AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "allow_media_creation_with_music");
                    AnonymousClass4L7 A0X = C41848B3p.A0X(r1);
                    AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
                    AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r0, "audio_asset_id");
                    AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
                    return C41846B3n.A0N(new AnonymousClass4Kr[]{C41847B3o.A0O(r0), C41845B3m.A0I(r0)}, r6, AnonymousClass7TF.A1X(new AnonymousClass4Kr[]{A0f, A0X, A0f2, AnonymousClass7TE.A0f(r2, "audio_asset_start_time_in_ms"), AnonymousClass7TE.A0f(r0, "audio_cluster_id"), AnonymousClass7TE.A0f(r0, "cover_artwork_thumbnail_uri"), C41848B3p.A0Z(r0), AnonymousClass7TE.A0f(r0, "dash_manifest"), AnonymousClass7TE.A0f(r0, "display_artist"), C41847B3o.A0C(r2), AnonymousClass7TE.A0f(r0, "fast_start_progressive_download_url"), AnonymousClass7TE.A0f(r1, "has_lyrics"), C41846B3n.A09(r0), C41845B3m.A0C(IgArtist.class, "ig_artist", 1638750556), AnonymousClass7TE.A0f(r0, "ig_username"), AnonymousClass7TE.A0f(r1, "is_bookmarked"), AnonymousClass7TE.A0f(r1, "is_eligible_for_audio_effects"), C41848B3p.A0K(r1), AnonymousClass7TE.A0f(r1, "is_trending_in_clips"), AnonymousClass7TE.A0f(r2, "overlap_duration_in_ms"), C41848B3p.A0N(r0), AnonymousClass7TE.A0f(r0, "progressive_download_url"), AnonymousClass7TE.A0f(r1, "should_allow_music_editing"), C41848B3p.A0f(r1), C41848B3p.A0e(r0), AnonymousClass7TE.A0f(r0, "should_mute_audio_reason_type"), AnonymousClass7TE.A0f(r1, "should_render_soundwave")}, r6) ? 1 : 0, 27, 2);
                }

                public MusicAssetInfo() {
                    super(1689659352);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "attribution");
                AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r1, "display_type");
                C342787pA r3 = C342787pA.A00;
                AnonymousClass4L7 A0V = C41847B3o.A0V(r3);
                AnonymousClass4L7 A0K = C41845B3m.A0K(r3);
                AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, A0V, A0K, C41847B3o.A0D(r0), C41847B3o.A0Q(r0), C41847B3o.A0R(r0), C41847B3o.A0S(r0), C41845B3m.A0C(MusicAssetInfo.class, "music_asset_info", 1689659352), C41847B3o.A0N(r3), C41847B3o.A0G(r3), C41845B3m.A0J(r3), C41847B3o.A0H(r3), C41847B3o.A0I(r3), C41847B3o.A0Y(r3)});
            }

            public StoryMusicStickers() {
                super(1781247519);
            }
        }

        public final class StoryNotifyMeStickers extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                C342787pA r0 = C342787pA.A00;
                return C41849B3q.A0J(r0, r0);
            }

            public StoryNotifyMeStickers() {
                super(-1342338805);
            }
        }

        public final class StoryPolaroidStickers extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "attribution");
                C342787pA r2 = C342787pA.A00;
                AnonymousClass4L7 A0V = C41847B3o.A0V(r2);
                AnonymousClass4L7 A0K = C41845B3m.A0K(r2);
                AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0V, A0K, C41847B3o.A0D(r0), C41847B3o.A0Q(r0), C41847B3o.A0R(r0), C41847B3o.A0S(r0), AnonymousClass7TE.A0f(AnonymousClass4LF.A00, AnonymousClass000.A00(1771)), C41847B3o.A0N(r2), C41847B3o.A0G(r2), C41845B3m.A0J(r2), C41847B3o.A0H(r2), C41847B3o.A0I(r2), C41847B3o.A0Y(r2)});
            }

            public StoryPolaroidStickers() {
                super(-960165815);
            }
        }

        public final class StoryPollVoterInfos extends C250663lr implements C250673ls {

            public final class Voters extends C250663lr implements C250673ls {

                public final class User extends C250663lr implements C250673ls {

                    public final class FriendshipStatus extends C250663lr implements C250673ls {
                        public final AnonymousClass4Kx modelSelectionSet() {
                            AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{C41847B3o.A0b(r1), AnonymousClass7TE.A0f(r1, "incoming_request"), C41847B3o.A0P(r1), AnonymousClass7TE.A0f(r1, "is_feed_favorite"), C41847B3o.A0c(r1), AnonymousClass7TE.A0f(r1, "is_restricted"), AnonymousClass7TE.A0f(r1, "is_viewer_unconnected"), AnonymousClass7TE.A0f(r1, "outgoing_request")});
                        }

                        public FriendshipStatus() {
                            super(1057932182);
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4Kp A05 = C41847B3o.A05(FriendshipStatus.class, 1057932182);
                        AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                        AnonymousClass4L7 A0N = C41845B3m.A0N(r3);
                        AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                        return C41849B3q.A0L(r1, r3, A05, A0N, C41847B3o.A0F(r1));
                    }

                    public User() {
                        super(-620244925);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "seen");
                    AnonymousClass4L8 r3 = AnonymousClass4L8.A00;
                    return C41847B3o.A0j(r3, A0f, AnonymousClass7TE.A0f(r3, "ts"), C41845B3m.A0B(User.class, -620244925), "vote");
                }

                public Voters() {
                    super(-870327857);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(AnonymousClass69U.A00, "latest_poll_vote_time");
                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                return C41846B3n.A0M(A0f, AnonymousClass7TE.A0f(r2, "max_id"), AnonymousClass7TE.A0f(C41846B3n.A0J(), "more_available"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "poll_id"), C41845B3m.A0A(AnonymousClass4Ks.A02(), Voters.class, "voters", -870327857));
            }

            public StoryPollVoterInfos() {
                super(1919487332);
            }
        }

        public final class StoryPolls extends C250663lr implements C250673ls {

            public final class PollSticker extends C250663lr implements C250673ls {

                public final class Tallies extends C250663lr implements C250673ls {
                    public Tallies() {
                        super(-1259412606);
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0U(AnonymousClass4Kz.A00, C41846B3n.A03(), AnonymousClass7TE.A0f(C342787pA.A00, "font_size"), "text");
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                    AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "color");
                    AnonymousClass4LF r2 = AnonymousClass4LF.A00;
                    AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r2, "finished");
                    AnonymousClass4L7 A0I = AnonymousClass7TF.A0I(r1);
                    AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r2, "is_multi_option_poll");
                    AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r2, "is_shared_result");
                    AnonymousClass4L7 A0f5 = AnonymousClass7TE.A0f(r1, "poll_id");
                    AnonymousClass4L7 A0f6 = AnonymousClass7TE.A0f(r1, "poll_type");
                    AnonymousClass4L7 A0f7 = AnonymousClass7TE.A0f(r1, "question");
                    AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A00(), Tallies.class, "tallies", -1259412606);
                    AnonymousClass4L8 r12 = AnonymousClass4L8.A00;
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, A0I, A0f3, A0f4, A0f5, A0f6, A0f7, A0A, AnonymousClass7TE.A0f(r12, "total_votes"), AnonymousClass7TE.A0f(r2, "viewer_can_vote"), AnonymousClass7TE.A0f(r12, "viewer_vote")});
                }

                public PollSticker() {
                    super(-1350854074);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                C342787pA r3 = C342787pA.A00;
                AnonymousClass4L7 A0V = C41847B3o.A0V(r3);
                AnonymousClass4L7 A0K = C41845B3m.A0K(r3);
                AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0V, A0K, C41847B3o.A0D(r0), C41847B3o.A0Q(r0), C41847B3o.A0R(r0), C41847B3o.A0S(r0), C41845B3m.A0C(PollSticker.class, "poll_sticker", -1350854074), C41847B3o.A0N(r3), C41847B3o.A0G(r3), C41845B3m.A0J(r3), C41847B3o.A0H(r3), C41847B3o.A0I(r3), C41847B3o.A0Y(r3)});
            }

            public StoryPolls() {
                super(944635915);
            }
        }

        public final class StoryPrompts extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                C342787pA r0 = C342787pA.A00;
                return C41849B3q.A0J(r0, r0);
            }

            public StoryPrompts() {
                super(-742243212);
            }
        }

        public final class StoryQuestionResponderInfos extends C250663lr implements C250673ls {

            public final class QuestionAuthor extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
                    AnonymousClass4L7 A0N = C41845B3m.A0N(r4);
                    AnonymousClass4LF r2 = AnonymousClass4LF.A00;
                    return C41849B3q.A0M(r2, r4, A0N, C41847B3o.A0F(r2), "is_private");
                }

                public QuestionAuthor() {
                    super(-778580446);
                }
            }

            public final class Responders extends C250663lr implements C250673ls {

                public final class MediaResponse extends C250663lr implements C250673ls {

                    public final class FundraiserTag extends C250663lr implements C250673ls {
                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0W(AnonymousClass4LF.A00, "has_standalone_fundraiser");
                        }

                        public FundraiserTag() {
                            super(27761879);
                        }
                    }

                    public final class ImageVersions2 extends C250663lr implements C250673ls {

                        public final class Candidates extends C250663lr implements C250673ls {
                            public Candidates() {
                                super(1602039694);
                            }

                            public final AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A0o();
                            }
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Candidates.class, "candidates", 1602039694);
                        }

                        public ImageVersions2() {
                            super(-2080823011);
                        }
                    }

                    public final class Owner extends C250663lr implements C250673ls {

                        public final class FriendshipStatus extends C250663lr implements C250673ls {
                            public final AnonymousClass4Kx modelSelectionSet() {
                                AnonymousClass4LF r4 = AnonymousClass4LF.A00;
                                return C41847B3o.A0j(r4, C41847B3o.A0b(r4), C41847B3o.A0P(r4), AnonymousClass7TE.A0f(r4, "is_feed_favorite"), "is_restricted");
                            }

                            public FriendshipStatus() {
                                super(119156860);
                            }
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                            AnonymousClass4L7 A0a = C41847B3o.A0a(r3);
                            AnonymousClass4LF r0 = AnonymousClass4LF.A00;
                            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0a, AnonymousClass7TE.A0f(r0, "feed_post_reshare_disabled"), C41847B3o.A05(FriendshipStatus.class, 119156860), C41845B3m.A0N(r3), C41847B3o.A0E(r0), AnonymousClass7TF.A0I(r3), AnonymousClass7TE.A0f(r0, "is_favorite"), C41847B3o.A0c(r0), AnonymousClass7TE.A0f(r0, "is_unpublished"), C41846B3n.A0H(r0), C41845B3m.A0E(r3), C41847B3o.A0Z(r3), C41847B3o.A0d(r3), C41845B3m.A0D(r3), AnonymousClass7TE.A0f(r0, "show_account_transparency_details"), C41847B3o.A0B(AnonymousClass4L8.A00), AnonymousClass7TE.A0f(r0, "transparency_product_enabled"), C41847B3o.A0A(r3)});
                        }

                        public Owner() {
                            super(1964457550);
                        }
                    }

                    public final class User extends C250663lr implements C250673ls {

                        public final class FriendshipStatus extends C250663lr implements C250673ls {
                            public final AnonymousClass4Kx modelSelectionSet() {
                                AnonymousClass4LF r4 = AnonymousClass4LF.A00;
                                return C41847B3o.A0j(r4, C41847B3o.A0b(r4), C41847B3o.A0P(r4), AnonymousClass7TE.A0f(r4, "is_feed_favorite"), "is_restricted");
                            }

                            public FriendshipStatus() {
                                super(654964020);
                            }
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                            AnonymousClass4L7 A0a = C41847B3o.A0a(r3);
                            AnonymousClass4LF r0 = AnonymousClass4LF.A00;
                            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0a, AnonymousClass7TE.A0f(r0, "feed_post_reshare_disabled"), C41847B3o.A05(FriendshipStatus.class, 654964020), C41845B3m.A0N(r3), C41847B3o.A0E(r0), AnonymousClass7TF.A0I(r3), AnonymousClass7TE.A0f(r0, "is_favorite"), C41847B3o.A0c(r0), AnonymousClass7TE.A0f(r0, "is_unpublished"), C41846B3n.A0H(r0), C41845B3m.A0E(r3), C41847B3o.A0Z(r3), C41847B3o.A0d(r3), C41845B3m.A0D(r3), AnonymousClass7TE.A0f(r0, "show_account_transparency_details"), C41847B3o.A0B(AnonymousClass4L8.A00), AnonymousClass7TE.A0f(r0, "transparency_product_enabled"), C41847B3o.A0A(r3)});
                        }

                        public User() {
                            super(1031892506);
                        }
                    }

                    public final class CommentInformTreatment extends C250663lr implements C250673ls {
                        public CommentInformTreatment() {
                            super(1815097531);
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0V(C41845B3m.A0P(), AnonymousClass7TE.A0f(C41846B3n.A0J(), "should_have_inform_treatment"), "text");
                        }
                    }

                    public final class GenAiDetectionMethod extends C250663lr implements C250673ls {
                        public GenAiDetectionMethod() {
                            super(-1771599217);
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0W(C41845B3m.A0P(), "detection_method");
                        }
                    }

                    public final class SharingFrictionInfo extends C250663lr implements C250673ls {
                        public SharingFrictionInfo() {
                            super(-721977371);
                        }

                        public final AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0W(C41846B3n.A0J(), "should_have_sharing_friction");
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4Kr[] r7 = new AnonymousClass4Kr[63];
                        AnonymousClass4LF r0 = AnonymousClass4LF.A00;
                        AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r0, "can_see_insights_as_brand");
                        AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r0, "can_view_more_preview_comments");
                        AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r0, "can_viewer_save");
                        AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r0, "caption_is_edited");
                        AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                        AnonymousClass4L7 A0f5 = AnonymousClass7TE.A0f(r2, "client_cache_key");
                        AnonymousClass4L7 A0f6 = AnonymousClass7TE.A0f(r2, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
                        AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
                        AnonymousClass4L7 A0f7 = AnonymousClass7TE.A0f(r1, "comment_count");
                        AnonymousClass4Kp A0C = C41845B3m.A0C(CommentInformTreatment.class, "comment_inform_treatment", 1815097531);
                        AnonymousClass4L7 A0f8 = AnonymousClass7TE.A0f(r0, "comment_threading_enabled");
                        AnonymousClass4L7 A0f9 = AnonymousClass7TE.A0f(r2, "commerciality_status");
                        AnonymousClass4L7 A0f10 = AnonymousClass7TE.A0f(r1, "deleted_reason");
                        AnonymousClass69U r8 = AnonymousClass69U.A00;
                        System.arraycopy(new AnonymousClass4Kr[]{A0f, A0f2, A0f3, A0f4, A0f5, A0f6, A0f7, A0C, A0f8, A0f9, A0f10, AnonymousClass7TE.A0f(r8, "device_timestamp"), AnonymousClass7TE.A0f(r0, "enable_media_notes_production"), AnonymousClass7TE.A0f(r0, "explore_hide_comments"), AnonymousClass7TE.A0f(r1, "fb_aggregated_comment_count"), AnonymousClass7TE.A0f(r1, "fb_aggregated_like_count"), AnonymousClass7TE.A0f(r2, "fbid"), AnonymousClass7TE.A0f(r1, "filter_type"), C41845B3m.A0C(FundraiserTag.class, "fundraiser_tag", 27761879), C41845B3m.A0C(GenAiDetectionMethod.class, "gen_ai_detection_method", -1771599217), AnonymousClass7TE.A0f(r0, "has_delayed_metadata"), AnonymousClass7TE.A0f(r0, "has_high_risk_gen_ai_inform_treatment"), AnonymousClass7TE.A0f(r0, "has_liked"), AnonymousClass7TE.A0f(r0, "has_more_comments"), AnonymousClass7TE.A0f(r0, "has_privately_liked"), AnonymousClass7TE.A0f(r1, "has_shared_to_fb"), AnonymousClass7TE.A0f(r0, "hide_view_all_comment_entrypoint")}, 0, r7, 0, 27);
                        System.arraycopy(new AnonymousClass4Kr[]{AnonymousClass7TF.A0I(r2), AnonymousClass7TE.A0f(r0, "ig_media_sharing_disabled"), C41845B3m.A0C(ImageVersions2.class, "image_versions2", -2080823011), AnonymousClass7TE.A0f(r2, "integrity_review_decision"), AnonymousClass7TE.A0f(r0, "is_auto_created"), AnonymousClass7TE.A0f(r0, "is_comments_gif_composer_enabled"), AnonymousClass7TE.A0f(r0, "is_cutout_sticker_allowed"), AnonymousClass7TE.A0f(r0, "is_in_profile_grid"), AnonymousClass7TE.A0f(r0, AnonymousClass000.A00(1520)), AnonymousClass7TE.A0f(r0, "is_organic_product_tagging_eligible"), AnonymousClass7TE.A0f(r0, "is_paid_partnership"), AnonymousClass7TE.A0f(r0, "is_post_live_clips_media"), AnonymousClass7TE.A0f(r0, "is_reshare_of_text_post_app_media_in_ig"), AnonymousClass7TE.A0f(r0, "is_tagged_media_shared_to_viewer_profile_grid"), AnonymousClass7TE.A0f(r0, "is_unified_video"), AnonymousClass7TE.A0f(r0, "is_visual_reply_commenter_notice_enabled"), AnonymousClass7TE.A0f(r0, "like_and_view_counts_disabled"), AnonymousClass7TE.A0f(r1, "like_count"), AnonymousClass7TE.A0f(r1, "max_num_visible_preview_comments"), C41845B3m.A0O(r1), AnonymousClass7TE.A0f(r2, "mezql_token"), AnonymousClass7TE.A0f(r2, "organic_tracking_token"), AnonymousClass7TE.A0f(r1, "original_height"), AnonymousClass7TE.A0f(r0, "original_media_has_visual_reply_media"), AnonymousClass7TE.A0f(r1, "original_width"), C41845B3m.A0C(Owner.class, "owner", 1964457550), C41845B3m.A0E(r2)}, 0, r7, 27, 27);
                        return C41846B3n.A0N(new AnonymousClass4Kr[]{C41846B3n.A0I(r2), AnonymousClass7TE.A0f(r0, "profile_grid_control_enabled"), C41845B3m.A0C(SharingFrictionInfo.class, "sharing_friction_info", -721977371), AnonymousClass7TE.A0f(r0, "should_request_ads"), AnonymousClass7TE.A0f(r0, "should_show_author_pog_for_tagged_media_shared_to_profile_grid"), AnonymousClass7TE.A0f(r0, "subscribe_cta_visible"), AnonymousClass7TE.A0f(r8, "taken_at"), C41845B3m.A0B(User.class, 1031892506), AnonymousClass7TE.A0f(r0, "viewer_can_request_mention")}, r7, 0, 54, 9);
                    }

                    public MediaResponse() {
                        super(1458145975);
                    }
                }

                public final class User extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
                        AnonymousClass4L7 A0N = C41845B3m.A0N(r4);
                        AnonymousClass4LF r2 = AnonymousClass4LF.A00;
                        return C41849B3q.A0M(r2, r4, A0N, C41847B3o.A0F(r2), "is_private");
                    }

                    public User() {
                        super(601516879);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4LF r4 = AnonymousClass4LF.A00;
                    AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r4), "has_shared_response");
                    AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, C41846B3n.A09(r3), C41845B3m.A0C(MediaResponse.class, "media_response", 1458145975), AnonymousClass7TE.A0f(r3, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r3), "response_type"), AnonymousClass7TE.A0f(r4, "seen"), AnonymousClass7TE.A0f(r4, "should_enable_reply_creation"), AnonymousClass7TE.A0f(C41845B3m.A0R(), "ts"), C41845B3m.A0A(AnonymousClass4Ks.A01(), User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, 601516879)});
                }

                public Responders() {
                    super(1539067568);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r4), "background_color");
                AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(AnonymousClass69U.A00, "latest_question_response_time");
                AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r4, "max_id");
                AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(C41846B3n.A0J(), "more_available");
                AnonymousClass4L7 A0f5 = AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r4), "question");
                AnonymousClass4Kp A0C = C41845B3m.A0C(QuestionAuthor.class, "question_author", -778580446);
                AnonymousClass4L7 A0f6 = AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r4), "question_id");
                AnonymousClass4L8 r5 = AnonymousClass4L8.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, A0f3, A0f4, A0f5, A0C, A0f6, AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r5), "question_response_count"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r4), "question_type"), C41845B3m.A0A(AnonymousClass4Ks.A02(), Responders.class, "responders", 1539067568), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r4), "text_color"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r5), "unanswered_response_count")});
            }

            public StoryQuestionResponderInfos() {
                super(-1333062854);
            }
        }

        public final class StoryQuestions extends C250663lr implements C250673ls {

            public final class QuestionSticker extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r1, "background_color"), C41847B3o.A0M(r1), C41845B3m.A0D(r1), AnonymousClass7TE.A0f(r1, "question"), AnonymousClass7TE.A0f(r1, "question_id"), AnonymousClass7TE.A0f(r1, "question_type"), AnonymousClass7TE.A0f(r1, "text_color"), AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "viewer_can_interact")});
                }

                public QuestionSticker() {
                    super(-2016706875);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                C342787pA r3 = C342787pA.A00;
                AnonymousClass4L7 A0V = C41847B3o.A0V(r3);
                AnonymousClass4L7 A0K = C41845B3m.A0K(r3);
                AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0V, A0K, C41847B3o.A0D(r0), C41847B3o.A0Q(r0), C41847B3o.A0R(r0), C41847B3o.A0S(r0), C41845B3m.A0C(QuestionSticker.class, "question_sticker", -2016706875), C41847B3o.A0N(r3), C41847B3o.A0G(r3), C41845B3m.A0J(r3), C41847B3o.A0H(r3), C41847B3o.A0I(r3), C41847B3o.A0Y(r3)});
            }

            public StoryQuestions() {
                super(1928418458);
            }
        }

        public final class StoryQuizParticipantInfos extends C250663lr implements C250673ls {

            public final class Participants extends C250663lr implements C250673ls {

                public final class User extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
                        AnonymousClass4L7 A0N = C41845B3m.A0N(r4);
                        AnonymousClass4LF r2 = AnonymousClass4LF.A00;
                        return C41849B3q.A0M(r2, r4, A0N, C41847B3o.A0F(r2), "is_private");
                    }

                    public User() {
                        super(-260195190);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
                    return C41847B3o.A0k(AnonymousClass7TE.A0f(r1, "answer"), AnonymousClass7TE.A0f(r1, "ts"), User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, -260195190);
                }

                public Participants() {
                    super(1804556723);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r6 = AnonymousClass4Kz.A00;
                return C41847B3o.A0j(r6, AnonymousClass7TE.A0f(r6, "max_id"), AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "more_available"), C41845B3m.A0A(AnonymousClass4Ks.A00(), Participants.class, "participants", 1804556723), "quiz_id");
            }

            public StoryQuizParticipantInfos() {
                super(796566849);
            }
        }

        public final class StoryQuizs extends C250663lr implements C250673ls {

            public final class QuizSticker extends C250663lr implements C250673ls {

                public final class Tallies extends C250663lr implements C250673ls {
                    public final AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0V(AnonymousClass4Kz.A00, new AnonymousClass4L7(AnonymousClass4L8.A00, "count"), "text");
                    }

                    public Tallies() {
                        super(-301622276);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4L8 r4 = AnonymousClass4L8.A00;
                    AnonymousClass4L7 r7 = new AnonymousClass4L7(r4, "correct_answer");
                    AnonymousClass4Kz r5 = AnonymousClass4Kz.A00;
                    AnonymousClass4L7 r8 = new AnonymousClass4L7(r5, "end_background_color");
                    AnonymousClass4LF r3 = AnonymousClass4LF.A00;
                    return new AnonymousClass4Kx(new AnonymousClass4Kr[]{r7, r8, new AnonymousClass4L7(r3, "finished"), AnonymousClass7TF.A0I(r5), new AnonymousClass4L7(r5, "question"), new AnonymousClass4L7(r5, "quiz_id"), new AnonymousClass4L7(r5, "start_background_color"), new AnonymousClass4Kp(AnonymousClass4Ks.A00(), Tallies.class, "tallies", -301622276), new AnonymousClass4L7(r5, "text_color"), new AnonymousClass4L7(r4, "viewer_answer"), new AnonymousClass4L7(r3, "viewer_can_answer")});
                }

                public QuizSticker() {
                    super(-1046731501);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                C342787pA r3 = C342787pA.A00;
                AnonymousClass4L7 A0V = C41847B3o.A0V(r3);
                AnonymousClass4L7 A0K = C41845B3m.A0K(r3);
                AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0V, A0K, C41847B3o.A0D(r0), C41847B3o.A0Q(r0), C41847B3o.A0R(r0), C41847B3o.A0S(r0), C41845B3m.A0C(QuizSticker.class, AnonymousClass000.A00(1737), -1046731501), C41847B3o.A0N(r3), C41847B3o.A0G(r3), C41845B3m.A0J(r3), C41847B3o.A0H(r3), C41847B3o.A0I(r3), C41847B3o.A0Y(r3)});
            }

            public StoryQuizs() {
                super(-459007500);
            }
        }

        public final class StoryReactionStickers extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                C342787pA r0 = C342787pA.A00;
                return C41849B3q.A0J(r0, r0);
            }

            public StoryReactionStickers() {
                super(-598481575);
            }
        }

        public final class StorySecretStickers extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "caption");
                C342787pA r2 = C342787pA.A00;
                return C41849B3q.A0N(r2, r2, A0f, C41847B3o.A0V(r2), IgReactMediaPickerNativeModule.HEIGHT);
            }

            public StorySecretStickers() {
                super(-1245515935);
            }
        }

        public final class StorySliderVoterInfos extends C250663lr implements C250673ls {

            public final class Voters extends C250663lr implements C250673ls {

                public final class User extends C250663lr implements C250673ls {

                    public final class FriendshipStatus extends C250663lr implements C250673ls {
                        public final AnonymousClass4Kx modelSelectionSet() {
                            AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{C41847B3o.A0b(r1), AnonymousClass7TE.A0f(r1, "incoming_request"), C41847B3o.A0P(r1), AnonymousClass7TE.A0f(r1, "is_feed_favorite"), C41847B3o.A0c(r1), AnonymousClass7TE.A0f(r1, "is_restricted"), AnonymousClass7TE.A0f(r1, "outgoing_request")});
                        }

                        public FriendshipStatus() {
                            super(1329613952);
                        }
                    }

                    public final AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4Kp A05 = C41847B3o.A05(FriendshipStatus.class, 1329613952);
                        AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                        AnonymousClass4L7 A0N = C41845B3m.A0N(r3);
                        AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                        return C41849B3q.A0L(r1, r3, A05, A0N, C41847B3o.A0F(r1));
                    }

                    public User() {
                        super(-955720906);
                    }
                }

                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0U(C342787pA.A00, AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "ts"), C41845B3m.A0B(User.class, -955720906), "vote");
                }

                public Voters() {
                    super(1962518823);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "latest_slider_vote_time");
                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                return C41846B3n.A0M(A0f, AnonymousClass7TE.A0f(r2, "max_id"), AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "more_available"), AnonymousClass7TE.A0f(r2, "slider_id"), C41845B3m.A0A(AnonymousClass4Ks.A00(), Voters.class, "voters", 1962518823));
            }

            public StorySliderVoterInfos() {
                super(10225162);
            }
        }

        public final class StorySliders extends C250663lr implements C250673ls {

            public final class SliderSticker extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
                    AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r4, "background_color");
                    AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r4, "emoji");
                    AnonymousClass4LF r3 = AnonymousClass4LF.A00;
                    AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r3, "is_interactive_music_sticker");
                    AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r4, "question");
                    AnonymousClass4L7 A0f5 = AnonymousClass7TE.A0f(r4, "slider_id");
                    C342787pA r2 = C342787pA.A00;
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, A0f3, A0f4, A0f5, AnonymousClass7TE.A0f(r2, "slider_vote_average"), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "slider_vote_count"), AnonymousClass7TE.A0f(r4, "text_color"), AnonymousClass7TE.A0f(r3, "viewer_can_vote"), AnonymousClass7TE.A0f(r2, "viewer_vote")});
                }

                public SliderSticker() {
                    super(1607602238);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                C342787pA r3 = C342787pA.A00;
                AnonymousClass4L7 A0V = C41847B3o.A0V(r3);
                AnonymousClass4L7 A0K = C41845B3m.A0K(r3);
                AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0V, A0K, C41847B3o.A0D(r0), C41847B3o.A0Q(r0), C41847B3o.A0R(r0), C41847B3o.A0S(r0), C41847B3o.A0N(r3), C41845B3m.A0C(SliderSticker.class, "slider_sticker", 1607602238), C41847B3o.A0G(r3), C41845B3m.A0J(r3), C41847B3o.A0H(r3), C41847B3o.A0I(r3), C41847B3o.A0Y(r3)});
            }

            public StorySliders() {
                super(275921863);
            }
        }

        public final class StorySoundOn extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                C342787pA r4 = C342787pA.A00;
                return C41849B3q.A0N(AnonymousClass4Kz.A00, r4, C41847B3o.A0V(r4), C41845B3m.A0K(r4), PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            }

            public StorySoundOn() {
                super(1043285335);
            }
        }

        public final class StorySubscriptionsStickers extends C250663lr implements C250673ls {

            public final class SubscriptionSticker extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TG.A0U(r3, AnonymousClass7TE.A0f(r3, "creator_id"), AnonymousClass7TE.A0f(r3, "creator_profile_pic_url"), "creator_username");
                }

                public SubscriptionSticker() {
                    super(-1917783624);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                C342787pA r3 = C342787pA.A00;
                AnonymousClass4L7 A0V = C41847B3o.A0V(r3);
                AnonymousClass4L7 A0K = C41845B3m.A0K(r3);
                AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0V, A0K, C41847B3o.A0D(r0), C41847B3o.A0Q(r0), C41847B3o.A0R(r0), C41847B3o.A0S(r0), C41847B3o.A0N(r3), C41847B3o.A0G(r3), C41845B3m.A0C(SubscriptionSticker.class, "subscription_sticker", -1917783624), C41845B3m.A0J(r3), C41847B3o.A0H(r3), C41847B3o.A0I(r3), C41847B3o.A0Y(r3)});
            }

            public StorySubscriptionsStickers() {
                super(-1358197362);
            }
        }

        public final class StoryUpcomingEvents extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r2, "display_type");
                C342787pA r1 = C342787pA.A00;
                AnonymousClass4L7 A0V = C41847B3o.A0V(r1);
                AnonymousClass4L7 A0K = C41845B3m.A0K(r1);
                AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0V, A0K, C41847B3o.A0D(r0), C41847B3o.A0Q(r0), C41847B3o.A0R(r0), C41847B3o.A0S(r0), C41847B3o.A0M(r2), C41847B3o.A0N(r1), AnonymousClass7TE.A0f(r2, "source"), C41847B3o.A0G(r1), AnonymousClass7TE.A0f(r2, "thumbnail_url"), C41845B3m.A0J(r1), C41847B3o.A0H(r1), C41847B3o.A0I(r1), C41847B3o.A0Y(r1)});
            }

            public StoryUpcomingEvents() {
                super(93990493);
            }
        }

        public final class TextPostShareToIgStoryStickers extends C250663lr implements C250673ls {

            public final class TextPostShareToIgStorySticker extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TG.A0U(r3, AnonymousClass7TE.A0f(r3, "attribution_app_id"), AnonymousClass7TE.A0f(r3, "attribution_app_name"), "attribution_url");
                }

                public TextPostShareToIgStorySticker() {
                    super(1398276011);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                C342787pA r3 = C342787pA.A00;
                AnonymousClass4L7 A0V = C41847B3o.A0V(r3);
                AnonymousClass4L7 A0K = C41845B3m.A0K(r3);
                AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0V, A0K, C41847B3o.A0D(r0), C41847B3o.A0Q(r0), C41847B3o.A0R(r0), C41847B3o.A0S(r0), C41847B3o.A0N(r3), C41847B3o.A0G(r3), C41845B3m.A0C(TextPostShareToIgStorySticker.class, "text_post_share_to_ig_story_sticker", 1398276011), C41845B3m.A0J(r3), C41847B3o.A0H(r3), C41847B3o.A0I(r3), C41847B3o.A0Y(r3)});
            }

            public TextPostShareToIgStoryStickers() {
                super(-1877923736);
            }
        }

        public final class User extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0V(AnonymousClass4Kz.A00, C41847B3o.A0c(AnonymousClass4LF.A00), "pk");
            }

            public User() {
                super(-1710828246);
            }
        }

        public final class Viewers extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0N = C41845B3m.A0N(r4);
                AnonymousClass4LF r2 = AnonymousClass4LF.A00;
                return C41849B3q.A0M(r2, r4, A0N, C41847B3o.A0F(r2), "is_private");
            }

            public Viewers() {
                super(1143495483);
            }
        }

        public final class VisualCommentReplyStickerInfo extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                C342787pA r0 = C342787pA.A00;
                return C41849B3q.A0J(r0, r0);
            }

            public VisualCommentReplyStickerInfo() {
                super(-904733244);
            }
        }

        public final class Attribution extends C250663lr implements C250673ls {
            public Attribution() {
                super(570016792);
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0W(C41845B3m.A0P(), PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            }
        }

        public final class GenAiDetectionMethod extends C250663lr implements C250673ls {
            public GenAiDetectionMethod() {
                super(-1293419483);
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0W(C41845B3m.A0P(), "detection_method");
            }
        }

        public final class VideoVersions extends C250663lr implements C250673ls {
            public VideoVersions() {
                super(-357370442);
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                return C41847B3o.A0g();
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kr[] r9 = new AnonymousClass4Kr[169];
            AnonymousClass4Kz r6 = AnonymousClass4Kz.A00;
            AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r6, "ad_action");
            AnonymousClass69U r10 = AnonymousClass69U.A00;
            AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r10, "archive_story_deletion_ts");
            AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r10, "archived_media_timestamp");
            AnonymousClass4Kp A0C = C41845B3m.A0C(Attribution.class, "attribution", 570016792);
            AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r6, "attribution_content_url");
            AnonymousClass4L7 A0f5 = AnonymousClass7TE.A0f(r6, "audience");
            AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A00(), AvatarStickers.class, "avatar_stickers", 1430707362);
            AnonymousClass4LF r0 = AnonymousClass4LF.A00;
            AnonymousClass4L7 A0f6 = AnonymousClass7TE.A0f(r0, "blur_polaroid_sticker");
            AnonymousClass4L7 A0f7 = AnonymousClass7TE.A0f(r0, "blur_secret_story");
            AnonymousClass4L7 A0f8 = AnonymousClass7TE.A0f(r6, "boost_unavailable_identifier");
            AnonymousClass4L7 A0f9 = AnonymousClass7TE.A0f(r6, "boost_unavailable_reason");
            AnonymousClass4L7 A0f10 = AnonymousClass7TE.A0f(r6, "boosted_status");
            AnonymousClass4L7 A0f11 = AnonymousClass7TE.A0f(r0, "can_hype");
            AnonymousClass4L7 A0f12 = AnonymousClass7TE.A0f(r0, "can_mention_back");
            AnonymousClass4L7 A0f13 = AnonymousClass7TE.A0f(r0, "can_mention_share");
            AnonymousClass4L7 A0f14 = AnonymousClass7TE.A0f(r0, "can_play_spotify_audio");
            AnonymousClass4L7 A0f15 = AnonymousClass7TE.A0f(r0, "can_reply");
            AnonymousClass4L7 A0f16 = AnonymousClass7TE.A0f(r0, "can_reshare");
            AnonymousClass4L7 A0f17 = AnonymousClass7TE.A0f(r0, "can_see_insights_as_brand");
            AnonymousClass4L7 A0f18 = AnonymousClass7TE.A0f(r0, "can_send_prompt");
            AnonymousClass4L7 A0f19 = AnonymousClass7TE.A0f(r0, "can_view_more_preview_comments");
            AnonymousClass4L7 A0f20 = AnonymousClass7TE.A0f(r0, "can_viewer_save");
            AnonymousClass4Kp A0C2 = C41845B3m.A0C(WearableAttributionInfo.class, "wearable_attribution_info", -835453027);
            AnonymousClass4Kp A0C3 = C41845B3m.A0C(Caption.class, "caption", 1738176537);
            AnonymousClass4L7 A0f21 = AnonymousClass7TE.A0f(r0, "caption_is_edited");
            C342787pA r11 = C342787pA.A00;
            System.arraycopy(new AnonymousClass4Kr[]{A0f, A0f2, A0f3, A0C, A0f4, A0f5, A0A, A0f6, A0f7, A0f8, A0f9, A0f10, A0f11, A0f12, A0f13, A0f14, A0f15, A0f16, A0f17, A0f18, A0f19, A0f20, A0C2, A0C3, A0f21, AnonymousClass7TE.A0f(r11, "caption_position"), AnonymousClass7TE.A0f(r6, "client_cache_key")}, 0, r9, 0, 27);
            AnonymousClass4L7 A0f22 = AnonymousClass7TE.A0f(r6, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
            AnonymousClass4L7 A0f23 = AnonymousClass7TE.A0f(r0, "collapse_comments");
            AnonymousClass4L8 r5 = AnonymousClass4L8.A00;
            System.arraycopy(new AnonymousClass4Kr[]{A0f22, A0f23, AnonymousClass7TE.A0f(r5, "comment_count"), AnonymousClass7TE.A0f(r0, "comment_threading_enabled"), AnonymousClass7TE.A0f(r0, "commenting_disabled_for_viewer"), AnonymousClass7TE.A0f(r6, "commerciality_status"), C41845B3m.A0C(CreateModeAttribution.class, "create_mode_attribution", 553993658), C41845B3m.A0C(CreativeConfig.class, "creative_config", -1412038795), C41845B3m.A0A(AnonymousClass4Ks.A00(), CutoutStickers.class, "cutout_stickers", 541101271), AnonymousClass7TE.A0f(r5, "deleted_reason"), AnonymousClass7TE.A0f(r10, "device_timestamp"), AnonymousClass7TE.A0f(r0, "enable_media_notes_production"), AnonymousClass7TE.A0f(r10, "expiring_at"), AnonymousClass7TE.A0f(r0, "explore_hide_comments"), AnonymousClass7TE.A0f(r5, "fb_aggregated_comment_count"), AnonymousClass7TE.A0f(r5, "fb_aggregated_like_count"), AnonymousClass7TE.A0f(r5, "fb_viewer_count"), AnonymousClass7TE.A0f(r6, "fbid"), AnonymousClass7TE.A0f(r5, "filter_type"), C41845B3m.A0C(FundraiserTag.class, "fundraiser_tag", -1168266768), C41845B3m.A0C(GenAiDetectionMethod.class, "gen_ai_detection_method", -1293419483), AnonymousClass7TE.A0f(r0, "has_audio"), AnonymousClass7TE.A0f(r0, "has_delayed_metadata"), AnonymousClass7TE.A0f(r0, "has_high_risk_gen_ai_inform_treatment"), AnonymousClass7TE.A0f(r0, "has_liked"), AnonymousClass7TE.A0f(r0, "has_more_comments"), AnonymousClass7TE.A0f(r0, "has_privately_liked")}, 0, r9, 27, 27);
            System.arraycopy(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r5, "has_shared_to_fb"), AnonymousClass7TE.A0f(r5, "has_shared_to_fb_dating"), AnonymousClass7TE.A0f(r0, "has_translation"), AnonymousClass7TE.A0f(r0, "hide_view_all_comment_entrypoint"), C41845B3m.A0C(HighlightsInfo.class, "highlights_info", 2008070795), C41846B3n.A09(r6), AnonymousClass7TE.A0f(r0, "ig_media_sharing_disabled"), C41845B3m.A0C(ImageVersions2.class, "image_versions2", 1160869604), AnonymousClass7TE.A0f(r5, AnonymousClass000.A00(3335)), AnonymousClass7TE.A0f(r6, "integrity_review_decision"), AnonymousClass7TE.A0f(r0, "is_auto_created"), AnonymousClass7TE.A0f(r0, "is_comments_gif_composer_enabled"), AnonymousClass7TE.A0f(r0, "is_currently_promoting_by_sponsor"), AnonymousClass7TE.A0f(r0, "is_cutout_sticker_allowed"), AnonymousClass7TE.A0f(r5, "is_dash_eligible"), AnonymousClass7TE.A0f(r0, AnonymousClass000.A00(3430)), AnonymousClass7TE.A0f(r0, "is_first_take"), AnonymousClass7TE.A0f(r0, "is_from_discovery_surface"), AnonymousClass7TE.A0f(r0, "is_in_profile_grid"), AnonymousClass7TE.A0f(r0, AnonymousClass000.A00(1520)), AnonymousClass7TE.A0f(r0, "is_organic_product_tagging_eligible"), AnonymousClass7TE.A0f(r0, "is_paid_partnership"), AnonymousClass7TE.A0f(r0, "is_post_live_clips_media"), AnonymousClass7TE.A0f(r0, "is_reel_media"), AnonymousClass7TE.A0f(r0, "is_reshare_of_text_post_app_media_in_ig"), AnonymousClass7TE.A0f(r0, "is_rollcall_v2"), AnonymousClass7TE.A0f(r0, "is_superlative")}, 0, r9, 54, 27);
            System.arraycopy(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r0, "is_tagged_media_shared_to_viewer_profile_grid"), AnonymousClass7TE.A0f(r0, "is_terminal_video_segment"), AnonymousClass7TE.A0f(r0, "is_unified_video"), AnonymousClass7TE.A0f(r0, "is_visual_reply_commenter_notice_enabled"), AnonymousClass7TE.A0f(r11, "lat"), AnonymousClass7TE.A0f(r0, "like_and_view_counts_disabled"), AnonymousClass7TE.A0f(r6, "link_text"), AnonymousClass7TE.A0f(r11, "lng"), C41845B3m.A0C(Location.class, "location", 66513659), AnonymousClass7TE.A0f(r5, "max_num_visible_preview_comments"), C41845B3m.A0C(MediaNotice.class, "media_notice", -1028618178), C41845B3m.A0C(MediaOverlayInfo.class, "media_overlay_info", 1074865333), C41845B3m.A0O(r5), AnonymousClass7TE.A0f(r0, "mention_sharing_enabled"), C41845B3m.A0A(AnonymousClass4Ks.A00(), MessageShare.class, "message_share", -723637346), AnonymousClass7TE.A0f(r6, "mezql_token"), AnonymousClass7TE.A0f(r6, "next_max_id"), AnonymousClass7TE.A0f(r5, "number_of_qualities"), AnonymousClass7TE.A0f(r6, "organic_tracking_token"), AnonymousClass7TE.A0f(r5, "original_height"), AnonymousClass7TE.A0f(r0, "original_media_has_visual_reply_media"), AnonymousClass7TE.A0f(r5, "original_width"), C41845B3m.A0C(Owner.class, "owner", -479067746), C41846B3n.A0B(r6), AnonymousClass7TE.A0f(r6, "preview"), C41845B3m.A0A(AnonymousClass4Ks.A00(), PreviewComments.class, "preview_comments", 746537752), C41846B3n.A0I(r6)}, 0, r9, 81, 27);
            System.arraycopy(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r0, "profile_grid_control_enabled"), C41845B3m.A0A(AnonymousClass4Ks.A00(), ReelMentions.class, "reel_mentions", 951731133), C41845B3m.A0C(ResharedStoryMediaAuthor.class, "reshared_story_media_author", -414886132), AnonymousClass7TE.A0f(r6, AnonymousClass000.A00(3940)), C41845B3m.A0C(SharingFrictionInfo.class, "sharing_friction_info", -1440033722), AnonymousClass7TE.A0f(r0, "should_request_ads"), AnonymousClass7TE.A0f(r0, "should_show_author_pog_for_tagged_media_shared_to_profile_grid"), AnonymousClass7TE.A0f(r0, "show_one_tap_fb_share_tooltip"), AnonymousClass7TE.A0f(r5, "source_type"), C41845B3m.A0A(AnonymousClass4Ks.A00(), SponsorTags.class, "sponsor_tags", -891254607), AnonymousClass7TE.A0f(r0, "sticker_translations_enabled"), C41845B3m.A0C(StoryAppAttribution.class, "story_app_attribution", -2033629245), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryBloksTappables.class, "story_bloks_tappables", 1325027243), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryChats.class, "story_chats", -183260748), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryComments.class, "story_comments", 274044089), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryCountdowns.class, "story_countdowns", 1812374435), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryCta.class, "story_cta", -879968258), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryFbCommunities.class, "story_fb_communities", 1849673978), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryFbTags.class, "story_fb_tags", 1624663772), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryFeedMedia.class, "story_feed_media", -494019661), AnonymousClass7TE.A0f(r0, "story_has_likes"), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryHashtags.class, "story_hashtags", -806900063), AnonymousClass7TE.A0f(r0, "story_is_saved_to_archive"), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryLinkStickers.class, "story_link_stickers", 1735711371), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryLocations.class, "story_locations", -1445930825), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryMusicLyricStickers.class, "story_music_lyric_stickers", -1128324902), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryMusicPickStickers.class, "story_music_pick_stickers", -345036116)}, 0, r9, 108, 27);
            System.arraycopy(new AnonymousClass4Kr[]{C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryMusicStickers.class, "story_music_stickers", 1781247519), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryNotifyMeStickers.class, "story_notify_me_stickers", -1342338805), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryPolaroidStickers.class, "story_polaroid_stickers", -960165815), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryPollVoterInfos.class, "story_poll_voter_infos", 1919487332), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryPolls.class, "story_polls", 944635915), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryPrompts.class, "story_prompts", -742243212), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryQuestionResponderInfos.class, "story_question_responder_infos", -1333062854), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryQuestions.class, "story_questions", 1928418458), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryQuizParticipantInfos.class, "story_quiz_participant_infos", 796566849), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryQuizs.class, "story_quizs", -459007500), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryReactionStickers.class, "story_reaction_stickers", -598481575), C41845B3m.A0A(AnonymousClass4Ks.A00(), StorySecretStickers.class, "story_secret_stickers", -1245515935), C41845B3m.A0A(AnonymousClass4Ks.A00(), StorySliderVoterInfos.class, "story_slider_voter_infos", 10225162), C41845B3m.A0A(AnonymousClass4Ks.A00(), StorySliders.class, "story_sliders", 275921863), C41845B3m.A0A(AnonymousClass4Ks.A00(), StorySoundOn.class, "story_sound_on", 1043285335), C41845B3m.A0A(AnonymousClass4Ks.A00(), StorySubscriptionsStickers.class, "story_subscriptions_stickers", -1358197362), C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryUpcomingEvents.class, "story_upcoming_events", 93990493), AnonymousClass7TE.A0f(r0, "subscribe_cta_visible"), AnonymousClass7TE.A0f(r0, "supports_reel_reactions"), AnonymousClass7TE.A0f(r10, "taken_at"), C41845B3m.A0A(AnonymousClass4Ks.A00(), TextPostShareToIgStoryStickers.class, "text_post_share_to_ig_story_stickers", -1877923736), AnonymousClass7TE.A0f(r5, AnonymousClass000.A00(1895)), AnonymousClass7TE.A0f(r5, "total_viewer_count"), C41845B3m.A0B(User.class, -1710828246), AnonymousClass7TE.A0f(r6, "video_codec"), AnonymousClass7TE.A0f(r6, "video_dash_manifest"), AnonymousClass7TE.A0f(r11, "video_duration")}, 0, r9, 135, 27);
            return C41846B3n.A0N(new AnonymousClass4Kr[]{C41845B3m.A0A(AnonymousClass4Ks.A00(), VideoVersions.class, "video_versions", -357370442), AnonymousClass7TE.A0f(r0, "viewer_can_request_mention"), AnonymousClass7TE.A0f(r5, "viewer_count"), AnonymousClass7TE.A0f(r6, "viewer_cursor"), C41845B3m.A0A(AnonymousClass4Ks.A00(), Viewers.class, "viewers", 1143495483), C41845B3m.A0A(AnonymousClass4Ks.A00(), VisualCommentReplyStickerInfo.class, "visual_comment_reply_sticker_info", -904733244), AnonymousClass7TE.A0f(r6, "xpost_deny_reason")}, r9, 0, 162, 7);
        }

        public Items() {
            super(1879368680);
        }
    }

    public final class Owner extends C250663lr implements C250673ls {
        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r5 = AnonymousClass4Kz.A00;
            return C41846B3n.A0M(C41845B3m.A0H(r5), C41846B3n.A0B(r5), C41845B3m.A0G(r5), C41845B3m.A0D(r5), AnonymousClass7TE.A0f(r5, "profile_pic_username"));
        }

        public Owner() {
            super(1734381089);
        }
    }

    public final class RankerScores extends C250663lr implements C250673ls {
        public final AnonymousClass4Kx modelSelectionSet() {
            C342787pA r3 = C342787pA.A00;
            return AnonymousClass7TG.A0U(r3, AnonymousClass7TE.A0f(r3, "fp"), AnonymousClass7TE.A0f(r3, "ptap"), "vm");
        }

        public RankerScores() {
            super(2078155233);
        }
    }

    public final class User extends C250663lr implements C250673ls {

        public final class FriendshipStatus extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r1, "blocking"), AnonymousClass7TE.A0f(r1, "followed_by"), C41847B3o.A0b(r1), AnonymousClass7TE.A0f(r1, "incoming_request"), C41847B3o.A0P(r1), AnonymousClass7TE.A0f(r1, "is_eligible_to_subscribe"), AnonymousClass7TE.A0f(r1, "is_feed_favorite"), AnonymousClass7TE.A0f(r1, "is_muting_reel"), C41847B3o.A0c(r1), AnonymousClass7TE.A0f(r1, "is_restricted"), AnonymousClass7TE.A0f(r1, "is_viewer_unconnected"), AnonymousClass7TE.A0f(r1, "muting"), AnonymousClass7TE.A0f(r1, "outgoing_request"), AnonymousClass7TE.A0f(r1, "subscribed")});
            }

            public FriendshipStatus() {
                super(-1273067572);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
            AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, AnonymousClass000.A00(1133));
            AnonymousClass4Kp A05 = C41847B3o.A05(FriendshipStatus.class, -1273067572);
            AnonymousClass4L7 A0N = C41845B3m.A0N(r1);
            AnonymousClass4L7 A09 = C41847B3o.A09(r1);
            AnonymousClass4LF r2 = AnonymousClass4LF.A00;
            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A05, A0N, A09, AnonymousClass7TE.A0f(r2, AnonymousClass000.A00(3429)), C41847B3o.A0c(r2), C41846B3n.A0H(r2), AnonymousClass7TE.A0f(r1, "live_broadcast_id"), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "live_broadcast_visibility"), AnonymousClass7TE.A0f(r1, "live_subscription_status"), C41845B3m.A0E(r1), C41847B3o.A0Z(r1), C41847B3o.A0d(r1), C41845B3m.A0D(r1), C41847B3o.A0A(r1)});
        }

        public User() {
            super(1225606407);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4Kr[] r6 = new AnonymousClass4Kr[30];
        AnonymousClass4LF r0 = AnonymousClass4LF.A00;
        AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r0, "birthday_badge_enabled");
        AnonymousClass4Kp A0C = C41845B3m.A0C(Broadcast.class, "broadcast", -1287870522);
        AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r0, "can_react_with_avatar");
        AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r0, "can_reply");
        AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r0, "can_reshare");
        AnonymousClass69U r1 = AnonymousClass69U.A00;
        AnonymousClass4L7 A0f5 = AnonymousClass7TE.A0f(r1, "expiring_at");
        AnonymousClass4L7 A0f6 = AnonymousClass7TE.A0f(r0, "has_besties_media");
        AnonymousClass4L7 A0f7 = AnonymousClass7TE.A0f(r0, "has_fan_club_media");
        AnonymousClass4L7 A0f8 = AnonymousClass7TE.A0f(r0, "has_video");
        AnonymousClass4L7 A0f9 = AnonymousClass7TE.A0f(r0, "hide_from_feed_unit");
        AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A00(), HypeCommenterList.class, "hype_commenter_list", -431464446);
        AnonymousClass4Kz r7 = AnonymousClass4Kz.A00;
        AnonymousClass4L7 A09 = C41846B3n.A09(r7);
        AnonymousClass4L7 A0f10 = AnonymousClass7TE.A0f(r0, "is_cacheable");
        AnonymousClass4L7 A0f11 = AnonymousClass7TE.A0f(r0, "is_nux");
        AnonymousClass4Kp A0A2 = C41845B3m.A0A(AnonymousClass4Ks.A00(), Items.class, DialogModule.KEY_ITEMS, 1879368680);
        AnonymousClass4L7 A0f12 = AnonymousClass7TE.A0f(C342787pA.A00, "latest_besties_reel_media");
        AnonymousClass4L7 A0f13 = AnonymousClass7TE.A0f(r1, "latest_reel_media");
        AnonymousClass4L8 r12 = AnonymousClass4L8.A00;
        return C41846B3n.A0N(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r12, "story_duration_secs"), C41845B3m.A0B(User.class, 1225606407), C41845B3m.A0C(Owner.class, "owner", 1734381089)}, r6, AnonymousClass7TF.A1X(new AnonymousClass4Kr[]{A0f, A0C, A0f2, A0f3, A0f4, A0f5, A0f6, A0f7, A0f8, A0f9, A0A, A09, A0f10, A0f11, A0A2, A0f12, A0f13, AnonymousClass7TE.A0f(r12, "media_count"), AnonymousClass7TE.A0f(r0, "muted"), AnonymousClass7TE.A0f(r12, "prefetch_count"), AnonymousClass7TE.A0f(r12, "ranked_position"), C41845B3m.A0C(RankerScores.class, "ranker_scores", 2078155233), AnonymousClass7TE.A0f(r7, "reel_type"), AnonymousClass7TE.A0f(r12, "seen"), AnonymousClass7TE.A0f(r12, "seen_ranked_position"), AnonymousClass7TE.A0f(r0, "should_prefetch"), AnonymousClass7TE.A0f(r0, "show_fan_club_stories_teaser")}, r6) ? 1 : 0, 27, 3);
    }

    public ReelDictFragmentImpl() {
        super(1884166355);
    }
}
