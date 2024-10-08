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
import com.facebook.location.platform.api.Location;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;

public final class BroadcastFragmentImpl extends C250663lr implements C250673ls {

    public final class BroadcastOwner extends C250663lr implements C250673ls {

        public final class FriendshipStatus extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                return C41849B3q.A0I(AnonymousClass4LF.A00);
            }

            public FriendshipStatus() {
                super(43595680);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kp A05 = C41847B3o.A05(FriendshipStatus.class, 43595680);
            AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
            AnonymousClass4L7 A0N = C41845B3m.A0N(r1);
            AnonymousClass4LF r0 = AnonymousClass4LF.A00;
            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A05, A0N, C41847B3o.A0F(r0), C41847B3o.A09(r1), C41847B3o.A0c(r0), C41846B3n.A0H(r0), AnonymousClass7TE.A0f(r1, "live_broadcast_id"), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "live_broadcast_visibility"), AnonymousClass7TE.A0f(r1, "live_subscription_status"), C41845B3m.A0E(r1), C41847B3o.A0Z(r1), C41847B3o.A0d(r1), C41845B3m.A0D(r1), C41847B3o.A0A(r1)});
        }

        public BroadcastOwner() {
            super(316186354);
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
                    super(1889822976);
                }
            }

            public final class ProfileContextLinksWithUserIds extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
                    return AnonymousClass7TG.A0U(AnonymousClass4Kz.A00, AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "end"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "start"), C46367Ddj.A00());
                }

                public ProfileContextLinksWithUserIds() {
                    super(-1387524206);
                }
            }

            public final class BiographyWithEntities extends C250663lr implements C250673ls {
                public BiographyWithEntities() {
                    super(-1427899679);
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
                AnonymousClass4Kp A0C = C41845B3m.A0C(BiographyWithEntities.class, AnonymousClass000.A00(524), -1427899679);
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
                System.arraycopy(new AnonymousClass4Kr[]{A0f7, A0f8, A0f9, A0c, A0f10, A0H, AnonymousClass7TE.A0f(r6, Location.LATITUDE), AnonymousClass7TE.A0f(r0, "lead_details_app_id"), AnonymousClass7TE.A0f(r6, "longitude"), AnonymousClass7TE.A0f(r3, "media_count"), AnonymousClass7TE.A0f(r3, "mutual_followers_count"), AnonymousClass7TE.A0f(r0, "page_id"), AnonymousClass7TE.A0f(r0, "page_name"), C41845B3m.A0E(r0), C41847B3o.A0Z(r0), AnonymousClass7TE.A0f(r3, AnonymousClass000.A00(349)), AnonymousClass7TE.A0f(r3, "professional_conversion_suggested_account_type"), AnonymousClass7TE.A0f(r0, "profile_context"), C41845B3m.A0A(AnonymousClass4Ks.A00(), ProfileContextFacepileUsers.class, AnonymousClass000.A00(1714), 1889822976), C41845B3m.A0A(AnonymousClass4Ks.A00(), ProfileContextLinksWithUserIds.class, AnonymousClass000.A00(1715), -1387524206), C41845B3m.A0D(r0), AnonymousClass7TE.A0f(r0, "public_email"), AnonymousClass7TE.A0f(r0, "public_phone_country_code"), AnonymousClass7TE.A0f(r0, "public_phone_number"), AnonymousClass7TE.A0f(r1, "should_show_category"), AnonymousClass7TE.A0f(r1, AnonymousClass000.A00(189)), AnonymousClass7TE.A0f(r1, AnonymousClass000.A00(190))}, 0, r9, 27, 27);
                return C41846B3n.A0N(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r1, AnonymousClass000.A00(191)), C41847B3o.A0B(r3), C41847B3o.A0A(r0), AnonymousClass7TE.A0f(r0, ServerW3CShippingAddressConstants.POSTAL_CODE)}, r9, 0, 54, 4);
            }

            public CharityUser() {
                super(-952963238);
            }
        }

        public final class ConsumptionSheetConfig extends C250663lr implements C250673ls {

            public final class DonationAmountConfig extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
                    return C41846B3n.A0M(AnonymousClass7TE.A0f(r1, "default_selected_donation_value"), AnonymousClass7TE.A0f(r1, "maximum_donation_amount"), AnonymousClass7TE.A0f(r1, "minimum_donation_amount"), AnonymousClass7TE.A0f(r1, "prefill_amount"), AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "user_currency"));
                }

                public DonationAmountConfig() {
                    super(111170091);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "can_viewer_donate");
                AnonymousClass4Kp A0C = C41845B3m.A0C(DonationAmountConfig.class, "donation_amount_config", 111170091);
                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                return C41847B3o.A0j(r2, A0f, A0C, AnonymousClass7TE.A0f(r2, "donation_url"), "privacy_disclaimer");
            }

            public ConsumptionSheetConfig() {
                super(833636886);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            return C41849B3q.A0O(C41845B3m.A0C(CharityUser.class, "charity_user", -952963238), ConsumptionSheetConfig.class, 833636886);
        }

        public CharityInfo() {
            super(567359105);
        }
    }

    public final class Cobroadcasters extends C250663lr implements C250673ls {

        public final class FriendshipStatus extends C250663lr implements C250673ls {
            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(r1, "followed_by"), C41847B3o.A0b(r1), AnonymousClass7TE.A0f(r1, "incoming_request"), C41847B3o.A0P(r1), AnonymousClass7TE.A0f(r1, "is_feed_favorite"), C41847B3o.A0c(r1), AnonymousClass7TE.A0f(r1, "is_restricted"), AnonymousClass7TE.A0f(r1, "is_viewer_unconnected"), AnonymousClass7TE.A0f(r1, "outgoing_request")});
            }

            public FriendshipStatus() {
                super(-946539567);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kp A05 = C41847B3o.A05(FriendshipStatus.class, -946539567);
            AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
            return C41849B3q.A0L(AnonymousClass4LF.A00, r3, A05, C41845B3m.A0N(r3), C41847B3o.A09(r3));
        }

        public Cobroadcasters() {
            super(1138268914);
        }
    }

    public final class DimensionsTyped extends C250663lr implements C250673ls {
        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
            return AnonymousClass7TG.A0V(AnonymousClass7TE.A0g(r0), C41848B3p.A0P(r0), IgReactMediaPickerNativeModule.WIDTH);
        }

        public DimensionsTyped() {
            super(765990647);
        }
    }

    public final class SponsorTags extends C250663lr implements C250673ls {

        public final class Sponsor extends C250663lr implements C250673ls {

            public final class FriendshipStatus extends C250663lr implements C250673ls {
                public final AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0W(AnonymousClass4LF.A00, "following");
                }

                public FriendshipStatus() {
                    super(1137972859);
                }
            }

            public final AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kp A05 = C41847B3o.A05(FriendshipStatus.class, 1137972859);
                AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                return C41849B3q.A0M(AnonymousClass4LF.A00, r3, A05, C41845B3m.A0N(r3), "is_private");
            }

            public Sponsor() {
                super(-715917202);
            }
        }

        public final AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "permission");
            AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A01(), Sponsor.class, "sponsor", -715917202);
            AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
            return C41847B3o.A0j(r2, A0f, A0A, AnonymousClass7TE.A0f(r2, "sponsor_id"), C46367Ddj.A00());
        }

        public SponsorTags() {
            super(-1069294587);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4Kr[] r5 = new AnonymousClass4Kr[32];
        AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
        AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r0, "broadcast_message");
        AnonymousClass4Kp A0C = C41845B3m.A0C(BroadcastOwner.class, "broadcast_owner", 316186354);
        AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r0, "broadcast_prompt");
        AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r0, "broadcast_status");
        AnonymousClass4Kp A0C2 = C41845B3m.A0C(CharityInfo.class, "charity_info", 567359105);
        AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A00(), Cobroadcasters.class, "cobroadcasters", 1138268914);
        AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r0, "cover_frame_url");
        AnonymousClass4L7 A0f5 = AnonymousClass7TE.A0f(r0, "dash_abr_playback_url");
        AnonymousClass4L7 A0f6 = AnonymousClass7TE.A0f(r0, "dash_playback_url");
        AnonymousClass4Kp A0C3 = C41845B3m.A0C(DimensionsTyped.class, "dimensions_typed", 765990647);
        AnonymousClass4LF r1 = AnonymousClass4LF.A00;
        AnonymousClass4L7 A0f7 = AnonymousClass7TE.A0f(r1, "fan_club_subscribe_enabled");
        AnonymousClass4L7 A0f8 = AnonymousClass7TE.A0f(r1, "hide_from_feed_unit");
        AnonymousClass69U r4 = AnonymousClass69U.A00;
        AnonymousClass4L7 A0I = AnonymousClass7TF.A0I(r4);
        AnonymousClass4L7 A0f9 = AnonymousClass7TE.A0f(r1, "internal_only");
        AnonymousClass4L7 A0f10 = AnonymousClass7TE.A0f(r1, C273654mx.A00(318));
        AnonymousClass4L7 A0f11 = AnonymousClass7TE.A0f(r1, C273654mx.A00(319));
        AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
        return C41846B3n.A0N(C41848B3p.A1b(r1, r2, SponsorTags.class, -1069294587), r5, AnonymousClass7TF.A1X(new AnonymousClass4Kr[]{A0f, A0C, A0f2, A0f3, A0C2, A0A, A0f4, A0f5, A0f6, A0C3, A0f7, A0f8, A0I, A0f9, A0f10, A0f11, AnonymousClass7TE.A0f(r2, "is_player_live_trace_enabled"), AnonymousClass7TE.A0f(r1, "is_viewer_comment_allowed"), AnonymousClass7TE.A0f(r4, "live_post_id"), C41847B3o.A0M(r0), AnonymousClass7TE.A0f(r1, "muted"), AnonymousClass7TE.A0f(r0, "organic_tracking_token"), AnonymousClass7TE.A0f(r2, "published_time"), AnonymousClass7TE.A0f(r2, "question_pk"), AnonymousClass7TE.A0f(r2, "ranked_position"), AnonymousClass7TE.A0f(r4, "response_timestamp"), AnonymousClass7TE.A0f(r2, "seen_ranked_position")}, r5) ? 1 : 0, 27, 5);
    }

    public BroadcastFragmentImpl() {
        super(1811615736);
    }
}
