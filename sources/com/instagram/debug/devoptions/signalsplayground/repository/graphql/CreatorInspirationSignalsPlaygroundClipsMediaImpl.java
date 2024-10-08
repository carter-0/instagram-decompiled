package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.1Xj;
import X.1Xv;
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
import X.C16635UyV;
import X.C16637UyZ;
import X.C16639Uyb;
import X.C250663lr;
import X.C284275Lw;
import X.C342787pA;
import X.C391289se;
import X.C391299sf;
import X.C391309sg;
import X.C391419sx;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import X.C41848B3p;
import X.C41849B3q;
import X.C48109EWb;
import X.C48110EWc;
import X.C48111EWd;
import X.C48113EWf;
import X.C48115EWh;
import X.C48119EWl;
import X.C62604Kib;
import X.HN8;
import X.HN9;
import X.HNA;
import X.HNB;
import X.RGN;
import X.RGO;
import X.RGP;
import X.UyW;
import X.UyX;
import X.XRK;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeJNI;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.facebook.react.modules.intent.IntentModule;
import com.facebookpay.offsite.models.message.ServerW3CShippingAddressConstants;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMedia;
import com.instagram.feed.media.ImmutablePandoMediaDict;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import com.instagram.realtimeclient.GraphQLSubscriptionID;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class CreatorInspirationSignalsPlaygroundClipsMediaImpl extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia {
    public static final Companion Companion = new Object();
    public static final int TYPE_TAG = -879418459;

    public final class WearableAttributionInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 211516579;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return WearableAttributionInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final class WorldLocationPagesInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo.WorldLocationPagesInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -1560223820;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return WorldLocationPagesInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public int getPostCount() {
                return getCoercedIntField(1, "post_count");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public String getCoverPhoto() {
                return A07("cover_photo");
            }

            public String getWorldId() {
                return A09("world_id");
            }

            public boolean hasPostCount() {
                return hasFieldValue("post_count");
            }

            public AnonymousClass4Kx modelSelectionSet() {
                return C13992Tns.A07();
            }

            public WorldLocationPagesInfo(int i) {
                super(i);
            }

            public WorldLocationPagesInfo() {
                super(TYPE_TAG);
            }
        }

        public String getAttributionCtaActionUrl() {
            return C41847B3o.A1A(this, "attribution_cta_action_url", 0);
        }

        public String getAttributionCtaText() {
            return C41847B3o.A1A(this, "attribution_cta_text", 1);
        }

        public String getAttributionIconUrl() {
            return C41847B3o.A1A(this, "attribution_icon_url", 2);
        }

        public String getAttributionSubtitle() {
            return C41847B3o.A1A(this, "attribution_subtitle", 3);
        }

        public String getAttributionTitle() {
            return C41847B3o.A1A(this, "attribution_title", 4);
        }

        public String getAttributionTopIconUrl() {
            return C41847B3o.A1A(this, "attribution_top_icon_url", 5);
        }

        public int getIconicCurrentPresence() {
            return getCoercedIntField(7, "iconic_current_presence");
        }

        public boolean hasIsWearableMediaProducer() {
            return true;
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public HNB getAttributionType() {
            return (HNB) getOptionalEnumField(6, "attribution_type", HNB.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        }

        public String getIconicHorizonWorldDeeplink() {
            return A0D("iconic_horizon_world_deeplink");
        }

        public String getIconicHorizonWorldId() {
            return getOptionalStringField(9, "iconic_horizon_world_id");
        }

        public String getIconicHorizonWorldName() {
            return getOptionalStringField(10, "iconic_horizon_world_name");
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo.WorldLocationPagesInfo getWorldLocationPagesInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo.WorldLocationPagesInfo) getOptionalTreeField(12, "world_location_pages_info", WorldLocationPagesInfo.class, WorldLocationPagesInfo.TYPE_TAG);
        }

        public boolean hasIconicCurrentPresence() {
            return hasFieldValue("iconic_current_presence");
        }

        public boolean isWearableMediaProducer() {
            return getRequiredBooleanField(11, "is_wearable_media_producer");
        }

        public AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4L7 A0D = C13991Tnr.A0D();
            AnonymousClass4L7 A0E = C13991Tnr.A0E();
            AnonymousClass4L7 A0F = C13991Tnr.A0F();
            AnonymousClass4L7 A0G = C13991Tnr.A0G();
            AnonymousClass4L7 A0H = C13991Tnr.A0H();
            AnonymousClass4L7 A0B = C13991Tnr.A0B();
            AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
            return new AnonymousClass4Kx(new AnonymousClass4Kr[]{A0D, A0E, A0F, A0G, A0H, A0B, new AnonymousClass4L7(r1, "attribution_type"), C13991Tnr.A0C(), new AnonymousClass4L7(r1, "iconic_horizon_world_deeplink"), new AnonymousClass4L7(r1, "iconic_horizon_world_id"), new AnonymousClass4L7(r1, "iconic_horizon_world_name"), C13991Tnr.A0I(), new AnonymousClass4Kp(WorldLocationPagesInfo.class, "world_location_pages_info", WorldLocationPagesInfo.TYPE_TAG)});
        }

        public WearableAttributionInfo(int i) {
            super(i);
        }

        public WearableAttributionInfo() {
            super(TYPE_TAG);
        }
    }

    public final class Attribution extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.Attribution {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 881551846;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return Attribution.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public String getName() {
            return C41847B3o.A1A(this, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, 0);
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public Attribution(int i) {
            super(i);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0W(C41845B3m.A0P(), PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        }

        public Attribution() {
            super(TYPE_TAG);
        }
    }

    public final class BrandedContentAdsBoostPostTokens extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.BrandedContentAdsBoostPostTokens {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -870181937;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return BrandedContentAdsBoostPostTokens.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public String getAccessToken() {
            return C41847B3o.A1A(this, "access_token", 0);
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public BrandedContentAdsBoostPostTokens(int i) {
            super(i);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0W(C41845B3m.A0P(), "access_token");
        }

        public BrandedContentAdsBoostPostTokens() {
            super(TYPE_TAG);
        }
    }

    public final class Caption extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.Caption {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1606269373;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return Caption.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final class User extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -1040939645;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return User.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public final class FanClubInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -121929847;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return FanClubInfo.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public final class FanConsiderationPageRevampEligiblity extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo.FanConsiderationPageRevampEligiblity {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -1605469106;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return FanConsiderationPageRevampEligiblity.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public boolean getShouldShowContentPreview() {
                        return getRequiredBooleanField(0, "should_show_content_preview");
                    }

                    public boolean getShouldShowSocialContext() {
                        return getRequiredBooleanField(1, "should_show_social_context");
                    }

                    public boolean hasShouldShowContentPreview() {
                        return true;
                    }

                    public boolean hasShouldShowSocialContext() {
                        return true;
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4LF r0 = AnonymousClass4LF.A00;
                        return AnonymousClass7TG.A0V(AnonymousClass7TE.A0g(r0), C41848B3p.A0I(r0), "should_show_social_context");
                    }

                    public FanConsiderationPageRevampEligiblity(int i) {
                        super(i);
                    }

                    public FanConsiderationPageRevampEligiblity() {
                        super(TYPE_TAG);
                    }
                }

                public boolean getAutosaveToExclusiveHighlight() {
                    return getCoercedBooleanField(0, "autosave_to_exclusive_highlight");
                }

                public int getConnectedMemberCount() {
                    return getCoercedIntField(1, "connected_member_count");
                }

                public boolean getHasEnoughSubscribersForSsc() {
                    return getCoercedBooleanField(5, "has_enough_subscribers_for_ssc");
                }

                public boolean isFanClubGiftingEligible() {
                    return getCoercedBooleanField(6, "is_fan_club_gifting_eligible");
                }

                public boolean isFanClubReferralEligible() {
                    return getCoercedBooleanField(7, "is_fan_club_referral_eligible");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public String getFanClubId() {
                    return A09("fan_club_id");
                }

                public String getFanClubName() {
                    return A0A("fan_club_name");
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo.FanConsiderationPageRevampEligiblity getFanConsiderationPageRevampEligiblity() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo.FanConsiderationPageRevampEligiblity) getOptionalTreeField(4, "fan_consideration_page_revamp_eligiblity", FanConsiderationPageRevampEligiblity.class, FanConsiderationPageRevampEligiblity.TYPE_TAG);
                }

                public int getSubscriberCount() {
                    return getCoercedIntField(8, "subscriber_count");
                }

                public boolean hasAutosaveToExclusiveHighlight() {
                    return hasFieldValue("autosave_to_exclusive_highlight");
                }

                public boolean hasConnectedMemberCount() {
                    return hasFieldValue("connected_member_count");
                }

                public boolean hasHasEnoughSubscribersForSsc() {
                    return hasFieldValue("has_enough_subscribers_for_ssc");
                }

                public boolean hasIsFanClubGiftingEligible() {
                    return hasFieldValue("is_fan_club_gifting_eligible");
                }

                public boolean hasIsFanClubReferralEligible() {
                    return hasFieldValue("is_fan_club_referral_eligible");
                }

                public boolean hasSubscriberCount() {
                    return hasFieldValue("subscriber_count");
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4LF r4 = AnonymousClass4LF.A00;
                    AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r4, "autosave_to_exclusive_highlight");
                    AnonymousClass4L8 r3 = AnonymousClass4L8.A00;
                    AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r3, "connected_member_count");
                    AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, AnonymousClass7TE.A0f(r1, "fan_club_id"), AnonymousClass7TE.A0f(r1, "fan_club_name"), C41845B3m.A0C(FanConsiderationPageRevampEligiblity.class, "fan_consideration_page_revamp_eligiblity", FanConsiderationPageRevampEligiblity.TYPE_TAG), AnonymousClass7TE.A0f(r4, "has_enough_subscribers_for_ssc"), AnonymousClass7TE.A0f(r4, "is_fan_club_gifting_eligible"), AnonymousClass7TE.A0f(r4, "is_fan_club_referral_eligible"), AnonymousClass7TE.A0f(r3, "subscriber_count")});
                }

                public FanClubInfo(int i) {
                    super(i);
                }

                public FanClubInfo() {
                    super(TYPE_TAG);
                }
            }

            public final class FriendshipStatus extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FriendshipStatus {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 719449629;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return FriendshipStatus.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public boolean getFollowing() {
                    return getCoercedBooleanField(0, "following");
                }

                public boolean getOutgoingRequest() {
                    return getCoercedBooleanField(4, "outgoing_request");
                }

                public boolean isBestie() {
                    return getCoercedBooleanField(1, "is_bestie");
                }

                public boolean isFeedFavorite() {
                    return getCoercedBooleanField(2, "is_feed_favorite");
                }

                public boolean isRestricted() {
                    return getCoercedBooleanField(3, "is_restricted");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public boolean hasFollowing() {
                    return hasFieldValue("following");
                }

                public boolean hasIsBestie() {
                    return hasFieldValue("is_bestie");
                }

                public boolean hasIsFeedFavorite() {
                    return hasFieldValue("is_feed_favorite");
                }

                public boolean hasIsRestricted() {
                    return hasFieldValue("is_restricted");
                }

                public boolean hasOutgoingRequest() {
                    return hasFieldValue("outgoing_request");
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4LF r5 = AnonymousClass4LF.A00;
                    return C41846B3n.A0M(C41847B3o.A0b(r5), C41847B3o.A0P(r5), AnonymousClass7TE.A0f(r5, "is_feed_favorite"), AnonymousClass7TE.A0f(r5, "is_restricted"), AnonymousClass7TE.A0f(r5, "outgoing_request"));
                }

                public FriendshipStatus(int i) {
                    super(i);
                }

                public FriendshipStatus() {
                    super(TYPE_TAG);
                }
            }

            public int getAllMediaCount() {
                return getCoercedIntField(0, "all_media_count");
            }

            public boolean getCanBoostPost() {
                return getCoercedBooleanField(2, "can_boost_post");
            }

            public boolean getCanSeeOrganicInsights() {
                return getCoercedBooleanField(3, "can_see_organic_insights");
            }

            public boolean getFeedPostReshareDisabled() {
                return getCoercedBooleanField(6, "feed_post_reshare_disabled");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public C48110EWc getAllowedCommenterType() {
                return (C48110EWc) getOptionalEnumField(1, "allowed_commenter_type", C48110EWc.A02);
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo getFanClubInfo() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FanClubInfo) getOptionalTreeField(4, "fan_club_info", FanClubInfo.class, FanClubInfo.TYPE_TAG);
            }

            public String getFbidV2() {
                return A0C("fbid_v2");
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FriendshipStatus getFriendshipStatus() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User.FriendshipStatus) getOptionalTreeField(7, "friendship_status", FriendshipStatus.class, FriendshipStatus.TYPE_TAG);
            }

            public String getFullName() {
                return A0D("full_name");
            }

            public boolean getHasAnonymousProfilePicture() {
                return getCoercedBooleanField(9, "has_anonymous_profile_picture");
            }

            public boolean getHasOnboardedToTextPostApp() {
                return getCoercedBooleanField(10, "has_onboarded_to_text_post_app");
            }

            public String getId() {
                return getOptionalStringField(11, "strong_id__");
            }

            public String getInteropMessagingUserFbid() {
                return getOptionalStringField(12, "interop_messaging_user_fbid");
            }

            public long getLatestReelMedia() {
                return getCoercedTimeField(17, "latest_reel_media");
            }

            public int getLikedClipsCount() {
                return getCoercedIntField(18, "liked_clips_count");
            }

            public String getPk() {
                return getOptionalStringField(19, "pk");
            }

            public String getPkId() {
                return getOptionalStringField(20, "pk_id");
            }

            public String getProfilePicId() {
                return getOptionalStringField(21, "profile_pic_id");
            }

            public String getProfilePicUrl() {
                return getOptionalStringField(22, "profile_pic_url");
            }

            public C16637UyZ getReelAutoArchive() {
                return (C16637UyZ) getOptionalEnumField(23, "reel_auto_archive", C16637UyZ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            }

            public boolean getShowAccountTransparencyDetails() {
                return getCoercedBooleanField(24, "show_account_transparency_details");
            }

            public boolean getShowInsightsTerms() {
                return getCoercedBooleanField(25, "show_insights_terms");
            }

            public int getTextPostAppJoinerNumber() {
                return getCoercedIntField(26, "text_post_app_joiner_number");
            }

            public int getThirdPartyDownloadsEnabled() {
                return getCoercedIntField(27, "third_party_downloads_enabled");
            }

            public boolean getTransparencyProductEnabled() {
                return getCoercedBooleanField(28, "transparency_product_enabled");
            }

            public String getUsername() {
                return C41847B3o.A19(this, 29);
            }

            public boolean hasAllMediaCount() {
                return hasFieldValue("all_media_count");
            }

            public boolean hasCanBoostPost() {
                return hasFieldValue("can_boost_post");
            }

            public boolean hasCanSeeOrganicInsights() {
                return hasFieldValue("can_see_organic_insights");
            }

            public boolean hasFeedPostReshareDisabled() {
                return hasFieldValue("feed_post_reshare_disabled");
            }

            public boolean hasHasAnonymousProfilePicture() {
                return hasFieldValue("has_anonymous_profile_picture");
            }

            public boolean hasHasOnboardedToTextPostApp() {
                return hasFieldValue("has_onboarded_to_text_post_app");
            }

            public boolean hasIsFavorite() {
                return hasFieldValue("is_favorite");
            }

            public boolean hasIsPrivate() {
                return hasFieldValue("is_private");
            }

            public boolean hasIsUnpublished() {
                return hasFieldValue("is_unpublished");
            }

            public boolean hasLatestReelMedia() {
                return hasFieldValue("latest_reel_media");
            }

            public boolean hasLikedClipsCount() {
                return hasFieldValue("liked_clips_count");
            }

            public boolean hasShowAccountTransparencyDetails() {
                return hasFieldValue("show_account_transparency_details");
            }

            public boolean hasShowInsightsTerms() {
                return hasFieldValue("show_insights_terms");
            }

            public boolean hasTextPostAppJoinerNumber() {
                return hasFieldValue("text_post_app_joiner_number");
            }

            public boolean hasThirdPartyDownloadsEnabled() {
                return hasFieldValue("third_party_downloads_enabled");
            }

            public boolean hasTransparencyProductEnabled() {
                return hasFieldValue("transparency_product_enabled");
            }

            public boolean isFavorite() {
                return getCoercedBooleanField(13, "is_favorite");
            }

            public boolean isPrivate() {
                return getCoercedBooleanField(14, "is_private");
            }

            public boolean isUnpublished() {
                return getCoercedBooleanField(15, "is_unpublished");
            }

            public boolean isVerified() {
                return C41847B3o.A1b(this, 16);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kr[] r4 = new AnonymousClass4Kr[30];
                AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "all_media_count");
                AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r3, "allowed_commenter_type");
                AnonymousClass4LF r0 = AnonymousClass4LF.A00;
                return C41846B3n.A0N(new AnonymousClass4Kr[]{C41847B3o.A0B(r1), AnonymousClass7TE.A0f(r0, "transparency_product_enabled"), C41847B3o.A0T(r3)}, r4, AnonymousClass7TF.A1X(new AnonymousClass4Kr[]{A0f, A0f2, AnonymousClass7TE.A0f(r0, "can_boost_post"), AnonymousClass7TE.A0f(r0, "can_see_organic_insights"), C41845B3m.A0C(FanClubInfo.class, "fan_club_info", FanClubInfo.TYPE_TAG), C41847B3o.A0a(r3), AnonymousClass7TE.A0f(r0, "feed_post_reshare_disabled"), C41847B3o.A05(FriendshipStatus.class, FriendshipStatus.TYPE_TAG), C41845B3m.A0N(r3), C41847B3o.A0E(r0), C41847B3o.A0F(r0), AnonymousClass7TF.A0I(r3), C41847B3o.A09(r3), AnonymousClass7TE.A0f(r0, "is_favorite"), C41847B3o.A0c(r0), AnonymousClass7TE.A0f(r0, "is_unpublished"), C41846B3n.A0H(r0), C41847B3o.A07(), AnonymousClass7TE.A0f(r1, "liked_clips_count"), C41845B3m.A0E(r3), C41847B3o.A0Z(r3), C41847B3o.A0d(r3), C41845B3m.A0D(r3), AnonymousClass7TE.A0f(r3, "reel_auto_archive"), AnonymousClass7TE.A0f(r0, "show_account_transparency_details"), AnonymousClass7TE.A0f(r0, "show_insights_terms"), AnonymousClass7TE.A0f(r1, "text_post_app_joiner_number")}, r4) ? 1 : 0, 27, 3);
            }

            public User(int i) {
                super(i);
            }

            public boolean hasIsVerified() {
                return C41847B3o.A1a(this);
            }

            public User() {
                super(TYPE_TAG);
            }
        }

        public int getBitFlags() {
            return getCoercedIntField(0, "bit_flags");
        }

        public long getCreatedAt() {
            return getCoercedTimeField(2, "created_at");
        }

        public long getCreatedAtUtc() {
            return getCoercedTimeField(3, "created_at_utc");
        }

        public boolean getDidReportAsSpam() {
            return getCoercedBooleanField(4, "did_report_as_spam");
        }

        public boolean getHasTranslation() {
            return getCoercedBooleanField(5, "has_translation");
        }

        public boolean isCovered() {
            return getCoercedBooleanField(6, "is_covered");
        }

        public boolean isRankedComment() {
            return getCoercedBooleanField(7, "is_ranked_comment");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public String getContentType() {
            return A08(TraceFieldType.ContentType);
        }

        public String getMediaId() {
            return A0D("media_id");
        }

        public String getPk() {
            return C41847B3o.A1A(this, "strong_id__", 9);
        }

        public int getPrivateReplyStatus() {
            return getCoercedIntField(10, "private_reply_status");
        }

        public boolean getShareEnabled() {
            return getCoercedBooleanField(11, "share_enabled");
        }

        public String getStatus() {
            return getOptionalStringField(12, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS);
        }

        public String getText() {
            return C41845B3m.A0l(this, 13);
        }

        public int getType() {
            return getCoercedIntField(14, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User getUser() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.Caption.User) getOptionalTreeField(15, PublicKeyCredentialControllerUtility.JSON_KEY_USER, User.class, User.TYPE_TAG);
        }

        public String getUserId() {
            return getOptionalStringField(16, CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID);
        }

        public boolean hasBitFlags() {
            return hasFieldValue("bit_flags");
        }

        public boolean hasCreatedAt() {
            return hasFieldValue("created_at");
        }

        public boolean hasCreatedAtUtc() {
            return hasFieldValue("created_at_utc");
        }

        public boolean hasDidReportAsSpam() {
            return hasFieldValue("did_report_as_spam");
        }

        public boolean hasHasTranslation() {
            return hasFieldValue("has_translation");
        }

        public boolean hasIsCovered() {
            return hasFieldValue("is_covered");
        }

        public boolean hasIsRankedComment() {
            return hasFieldValue("is_ranked_comment");
        }

        public boolean hasPrivateReplyStatus() {
            return hasFieldValue("private_reply_status");
        }

        public boolean hasShareEnabled() {
            return hasFieldValue("share_enabled");
        }

        public boolean hasType() {
            return hasFieldValue(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
            AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r0, "bit_flags");
            AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
            AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r2, TraceFieldType.ContentType);
            AnonymousClass69U r3 = AnonymousClass69U.A00;
            AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r3, "created_at");
            AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r3, "created_at_utc");
            AnonymousClass4LF r32 = AnonymousClass4LF.A00;
            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, A0f3, A0f4, AnonymousClass7TE.A0f(r32, "did_report_as_spam"), AnonymousClass7TE.A0f(r32, "has_translation"), AnonymousClass7TE.A0f(r32, "is_covered"), AnonymousClass7TE.A0f(r32, "is_ranked_comment"), C41847B3o.A0M(r2), C41846B3n.A0B(r2), AnonymousClass7TE.A0f(r0, "private_reply_status"), AnonymousClass7TE.A0f(r32, "share_enabled"), C41845B3m.A0L(r2), C41846B3n.A0F(r2), C41845B3m.A0H(r0), C41845B3m.A0B(User.class, User.TYPE_TAG), C41845B3m.A0M(r2)});
        }

        public Caption(int i) {
            super(i);
        }

        public Caption() {
            super(TYPE_TAG);
        }
    }

    public final class ClipsAttributionInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -736244262;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return ClipsAttributionInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final class PivotPageHeader extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 1893051914;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return PivotPageHeader.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public final class Profile extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader.Profile {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 692143738;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return Profile.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public String getProfilePicId() {
                    return getOptionalStringField(6, "profile_pic_id");
                }

                public String getProfilePicUrl() {
                    return getOptionalStringField(7, "profile_pic_url");
                }

                public boolean isPrivate() {
                    return getCoercedBooleanField(2, "is_private");
                }

                public boolean isVerified() {
                    return C41847B3o.A1b(this, 3);
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public String getFullName() {
                    return A07("full_name");
                }

                public String getId() {
                    return A08("strong_id__");
                }

                public String getPk() {
                    return A0B("pk");
                }

                public String getPkId() {
                    return A0C("pk_id");
                }

                public boolean hasIsPrivate() {
                    return hasFieldValue("is_private");
                }

                public Profile(int i) {
                    super(i);
                }

                public String getUsername() {
                    return A0D(AnonymousClass9PN.A00());
                }

                public boolean hasIsVerified() {
                    return C41847B3o.A1a(this);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return C41849B3q.A0A();
                }

                public Profile() {
                    super(TYPE_TAG);
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public String getContentUrl() {
                return A07("content_url");
            }

            public String getDeveloperAppLogoUrl() {
                return A08("developer_app_logo_url");
            }

            public String getMediaCount() {
                return A09("media_count");
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader.Profile getProfile() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader.Profile) getOptionalTreeField(3, "profile", Profile.class, Profile.TYPE_TAG);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                return C41846B3n.A0L(AnonymousClass7TE.A0f(r1, "content_url"), AnonymousClass7TE.A0f(r1, "developer_app_logo_url"), AnonymousClass7TE.A0f(r1, "media_count"), C41845B3m.A0C(Profile.class, "profile", Profile.TYPE_TAG));
            }

            public PivotPageHeader(int i) {
                super(i);
            }

            public PivotPageHeader() {
                super(TYPE_TAG);
            }
        }

        public String getAttributionAppId() {
            return C41847B3o.A1A(this, "attribution_app_id", 0);
        }

        public String getAttributionAppName() {
            return C41847B3o.A1A(this, "attribution_app_name", 1);
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo.PivotPageHeader getPivotPageHeader() {
            C250663lr requiredTreeField = getRequiredTreeField(2, "pivot_page_header", PivotPageHeader.class, PivotPageHeader.TYPE_TAG);
            0qQ.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.ClipsAttributionInfo.PivotPageHeader");
            return (PivotPageHeader) requiredTreeField;
        }

        public AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
            AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "attribution_app_id");
            AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "attribution_app_name");
            int i = PivotPageHeader.TYPE_TAG;
            return C41846B3n.A0K(A0f, A0f2, C41845B3m.A0A(AnonymousClass4Ks.A01(), PivotPageHeader.class, "pivot_page_header", i));
        }

        public ClipsAttributionInfo(int i) {
            super(i);
        }

        public ClipsAttributionInfo() {
            super(TYPE_TAG);
        }
    }

    public final class ClipsMetadata extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1399434244;

        public final class AchievementsInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AchievementsInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -379737106;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return AchievementsInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public int getNumEarnedAchievements() {
                return getCoercedIntField(0, "num_earned_achievements");
            }

            public boolean getShowAchievements() {
                return getCoercedBooleanField(1, "show_achievements");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public boolean hasNumEarnedAchievements() {
                return hasFieldValue("num_earned_achievements");
            }

            public boolean hasShowAchievements() {
                return hasFieldValue("show_achievements");
            }

            public AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0V(AnonymousClass4LF.A00, AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "num_earned_achievements"), "show_achievements");
            }

            public AchievementsInfo(int i) {
                super(i);
            }

            public AchievementsInfo() {
                super(TYPE_TAG);
            }
        }

        public final class AdditionalAudioInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AdditionalAudioInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -795159955;

            public final class AudioReattributionInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AdditionalAudioInfo.AudioReattributionInfo {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -135472697;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return AudioReattributionInfo.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public boolean getShouldAllowRestore() {
                    return getRequiredBooleanField(0, "should_allow_restore");
                }

                public boolean hasShouldAllowRestore() {
                    return true;
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public AudioReattributionInfo(int i) {
                    super(i);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0W(C41846B3n.A0J(), "should_allow_restore");
                }

                public AudioReattributionInfo() {
                    super(TYPE_TAG);
                }
            }

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return AdditionalAudioInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public String getAdditionalAudioUsername() {
                return A07("additional_audio_username");
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AdditionalAudioInfo.AudioReattributionInfo getAudioReattributionInfo() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AdditionalAudioInfo.AudioReattributionInfo) A02(AudioReattributionInfo.class, "audio_reattribution_info", AudioReattributionInfo.TYPE_TAG);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                return C41847B3o.A0m(AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "additional_audio_username"), AudioReattributionInfo.class, "audio_reattribution_info", AudioReattributionInfo.TYPE_TAG);
            }

            public AdditionalAudioInfo(int i) {
                super(i);
            }

            public AdditionalAudioInfo() {
                super(TYPE_TAG);
            }
        }

        public final class AssetRecommendationInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AssetRecommendationInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 846516070;

            public final class AssetRecommendations extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AssetRecommendationInfo.AssetRecommendations {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 1199335979;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return AssetRecommendations.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public String getAssetId() {
                    return C41847B3o.A1A(this, "asset_id", 0);
                }

                public String getAssetName() {
                    return C41847B3o.A1A(this, "asset_name", 1);
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public C391289se getAssetType() {
                    return (C391289se) C41847B3o.A10(this, C391289se.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "asset_type", 2);
                }

                public String getCoverArtworkThumbnailUri() {
                    return A0A("cover_artwork_thumbnail_uri");
                }

                public String getExtra() {
                    return A0B("extra");
                }

                public AssetRecommendations(int i) {
                    super(i);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return C41849B3q.A00();
                }

                public AssetRecommendations() {
                    super(TYPE_TAG);
                }
            }

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return AssetRecommendationInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public ImmutableList getAssetRecommendations() {
                return A06(AssetRecommendations.class, "asset_recommendations", AssetRecommendations.TYPE_TAG);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                int i = AssetRecommendations.TYPE_TAG;
                return AnonymousClass7TG.A0T(AnonymousClass4Ks.A02(), AssetRecommendations.class, "asset_recommendations", i);
            }

            public AssetRecommendationInfo(int i) {
                super(i);
            }

            public AssetRecommendationInfo() {
                super(TYPE_TAG);
            }
        }

        public final class AudioRankingInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AudioRankingInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 166580598;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return AudioRankingInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public String getBestAudioClusterId() {
                return A07("best_audio_cluster_id");
            }

            public AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0W(AnonymousClass4Kz.A00, "best_audio_cluster_id");
            }

            public AudioRankingInfo(int i) {
                super(i);
            }

            public AudioRankingInfo() {
                super(TYPE_TAG);
            }
        }

        public final class BrandedContentTagInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.BrandedContentTagInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 328029074;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return BrandedContentTagInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public boolean getCanAddTag() {
                return getRequiredBooleanField(0, "can_add_tag");
            }

            public boolean hasCanAddTag() {
                return true;
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public BrandedContentTagInfo(int i) {
                super(i);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0W(C41846B3n.A0J(), "can_add_tag");
            }

            public BrandedContentTagInfo() {
                super(TYPE_TAG);
            }
        }

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return ClipsMetadata.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final class ContentAppreciationInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 256258402;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return ContentAppreciationInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public final class EntryPointContainer extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 14967407;

                public final class Comment extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer.Comment {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -517283309;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return Comment.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public RGO getActionType() {
                        return (RGO) C41847B3o.A10(this, RGO.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "action_type", 0);
                    }

                    public Comment(int i) {
                        super(i);
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0W(C41845B3m.A0P(), "action_type");
                    }

                    public Comment() {
                        super(TYPE_TAG);
                    }
                }

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return EntryPointContainer.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public final class Pill extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer.Pill {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -203081011;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return Pill.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public int getPriority() {
                        return getRequiredIntField(1, "priority");
                    }

                    public boolean hasPriority() {
                        return true;
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public RGO getActionType() {
                        return (RGO) C41847B3o.A10(this, RGO.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "action_type", 0);
                    }

                    public Pill(int i) {
                        super(i);
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0V(C41845B3m.A0R(), AnonymousClass7TE.A0f(C41845B3m.A0P(), "action_type"), "priority");
                    }

                    public Pill() {
                        super(TYPE_TAG);
                    }
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer.Comment getComment() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer.Comment) A03(Comment.class, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, Comment.TYPE_TAG);
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer.Pill getPill() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer.Pill) A02(Pill.class, "pill", Pill.TYPE_TAG);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return C41847B3o.A0m(C41845B3m.A0C(Comment.class, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_COMMENT, Comment.TYPE_TAG), Pill.class, "pill", Pill.TYPE_TAG);
                }

                public EntryPointContainer(int i) {
                    super(i);
                }

                public EntryPointContainer() {
                    super(TYPE_TAG);
                }
            }

            public boolean getEnabled() {
                return getRequiredBooleanField(0, "enabled");
            }

            public boolean hasEnabled() {
                return true;
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer getEntryPointContainer() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo.EntryPointContainer) A02(EntryPointContainer.class, "entry_point_container", EntryPointContainer.TYPE_TAG);
            }

            public ContentAppreciationInfo(int i) {
                super(i);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                return C41847B3o.A0m(AnonymousClass7TE.A0f(C41846B3n.A0J(), "enabled"), EntryPointContainer.class, "entry_point_container", EntryPointContainer.TYPE_TAG);
            }

            public ContentAppreciationInfo() {
                super(TYPE_TAG);
            }
        }

        public final class ContextualHighlightInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContextualHighlightInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -1643218500;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return ContextualHighlightInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public String getContextualHighlightId() {
                return C41847B3o.A1A(this, "contextual_highlight_id", 1);
            }

            public String getContextualHighlightTitle() {
                return C41847B3o.A1A(this, "contextual_highlight_title", 2);
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public String getChainingMediaId() {
                return A0B("chaining_media_id");
            }

            public C48111EWd getContextualHighlightDestinationType() {
                return (C48111EWd) getOptionalEnumField(0, "contextual_highlight_destination_type", C48111EWd.A02);
            }

            public HN8 getContextualHighlightType() {
                return (HN8) C41847B3o.A10(this, HN8.A02, "contextual_highlight_type", 3);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r5 = AnonymousClass4Kz.A00;
                return C41846B3n.A0M(AnonymousClass7TE.A0f(r5, "contextual_highlight_destination_type"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r5), "contextual_highlight_id"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r5), "contextual_highlight_title"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r5), "contextual_highlight_type"), AnonymousClass7TE.A0f(r5, "chaining_media_id"));
            }

            public ContextualHighlightInfo(int i) {
                super(i);
            }

            public ContextualHighlightInfo() {
                super(TYPE_TAG);
            }
        }

        public final class MashupInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 624224444;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return MashupInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public final class OriginalMedia extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 510906542;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return OriginalMedia.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public final class User extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 138223931;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return User.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public int getAllMediaCount() {
                        return getCoercedIntField(0, "all_media_count");
                    }

                    public boolean getHasAnonymousProfilePicture() {
                        return getCoercedBooleanField(4, "has_anonymous_profile_picture");
                    }

                    public boolean getHasOnboardedToTextPostApp() {
                        return getCoercedBooleanField(5, "has_onboarded_to_text_post_app");
                    }

                    public String getId() {
                        return getOptionalStringField(6, "strong_id__");
                    }

                    public String getInteropMessagingUserFbid() {
                        return getOptionalStringField(7, "interop_messaging_user_fbid");
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public C48110EWc getAllowedCommenterType() {
                        return (C48110EWc) getOptionalEnumField(1, "allowed_commenter_type", C48110EWc.A02);
                    }

                    public String getFbidV2() {
                        return A09("fbid_v2");
                    }

                    public String getFullName() {
                        return A0A("full_name");
                    }

                    public int getLikedClipsCount() {
                        return getCoercedIntField(10, "liked_clips_count");
                    }

                    public String getPk() {
                        return getOptionalStringField(11, "pk");
                    }

                    public String getPkId() {
                        return getOptionalStringField(12, "pk_id");
                    }

                    public String getProfilePicId() {
                        return getOptionalStringField(13, "profile_pic_id");
                    }

                    public String getProfilePicUrl() {
                        return getOptionalStringField(14, "profile_pic_url");
                    }

                    public C16637UyZ getReelAutoArchive() {
                        return (C16637UyZ) getOptionalEnumField(15, "reel_auto_archive", C16637UyZ.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    }

                    public int getTextPostAppJoinerNumber() {
                        return getCoercedIntField(16, "text_post_app_joiner_number");
                    }

                    public int getThirdPartyDownloadsEnabled() {
                        return getCoercedIntField(17, "third_party_downloads_enabled");
                    }

                    public String getUsername() {
                        return C41847B3o.A19(this, 18);
                    }

                    public boolean hasAllMediaCount() {
                        return hasFieldValue("all_media_count");
                    }

                    public boolean hasHasAnonymousProfilePicture() {
                        return hasFieldValue("has_anonymous_profile_picture");
                    }

                    public boolean hasHasOnboardedToTextPostApp() {
                        return hasFieldValue("has_onboarded_to_text_post_app");
                    }

                    public boolean hasIsPrivate() {
                        return hasFieldValue("is_private");
                    }

                    public boolean hasLikedClipsCount() {
                        return hasFieldValue("liked_clips_count");
                    }

                    public boolean hasTextPostAppJoinerNumber() {
                        return hasFieldValue("text_post_app_joiner_number");
                    }

                    public boolean hasThirdPartyDownloadsEnabled() {
                        return hasFieldValue("third_party_downloads_enabled");
                    }

                    public boolean isPrivate() {
                        return getCoercedBooleanField(8, "is_private");
                    }

                    public boolean isVerified() {
                        return C41847B3o.A1b(this, 9);
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
                        AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r0, "all_media_count");
                        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                        AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r1, "allowed_commenter_type");
                        AnonymousClass4L7 A0a = C41847B3o.A0a(r1);
                        AnonymousClass4L7 A0N = C41845B3m.A0N(r1);
                        AnonymousClass4LF r2 = AnonymousClass4LF.A00;
                        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, A0a, A0N, C41847B3o.A0E(r2), C41847B3o.A0F(r2), AnonymousClass7TF.A0I(r1), C41847B3o.A09(r1), C41847B3o.A0c(r2), C41846B3n.A0H(r2), AnonymousClass7TE.A0f(r0, "liked_clips_count"), C41845B3m.A0E(r1), C41847B3o.A0Z(r1), C41847B3o.A0d(r1), C41845B3m.A0D(r1), AnonymousClass7TE.A0f(r1, "reel_auto_archive"), AnonymousClass7TE.A0f(r0, "text_post_app_joiner_number"), C41847B3o.A0B(r0), C41847B3o.A0T(r1)});
                    }

                    public User(int i) {
                        super(i);
                    }

                    public boolean hasIsVerified() {
                        return C41847B3o.A1a(this);
                    }

                    public User() {
                        super(TYPE_TAG);
                    }
                }

                public boolean getMashupsAllowed() {
                    return getCoercedBooleanField(2, "mashups_allowed");
                }

                public int getNonPrivacyFilteredMashupsMediaCount() {
                    return getCoercedIntField(4, "non_privacy_filtered_mashups_media_count");
                }

                public String getPk() {
                    return C41847B3o.A1A(this, "pk", 5);
                }

                public String getProductType() {
                    return getOptionalStringField(6, "product_type");
                }

                public ImmutableList getSidecarChildMediaIds() {
                    return getCoercedCompactedTimeListField(7, "sidecar_child_media_ids");
                }

                public boolean hasIsPivotPageAvailable() {
                    return true;
                }

                public boolean isLightWeightCheck() {
                    return getCoercedBooleanField(0, "is_light_weight_check");
                }

                public boolean isPivotPageAvailable() {
                    return getRequiredBooleanField(1, "is_pivot_page_available");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public String getMediaType() {
                    return A0A("media_type");
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia.User getUser() {
                    C250663lr requiredTreeField = getRequiredTreeField(8, PublicKeyCredentialControllerUtility.JSON_KEY_USER, User.class, User.TYPE_TAG);
                    0qQ.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.ClipsMetadata.MashupInfo.OriginalMedia.User");
                    return (User) requiredTreeField;
                }

                public boolean hasIsLightWeightCheck() {
                    return hasFieldValue("is_light_weight_check");
                }

                public boolean hasMashupsAllowed() {
                    return hasFieldValue("mashups_allowed");
                }

                public boolean hasNonPrivacyFilteredMashupsMediaCount() {
                    return hasFieldValue("non_privacy_filtered_mashups_media_count");
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                    AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "is_light_weight_check");
                    AnonymousClass4L7 A0W = C41848B3p.A0W(r1);
                    AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r1, "mashups_allowed");
                    AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
                    AnonymousClass4L7 A0O = C41845B3m.A0O(r0);
                    AnonymousClass4L7 A0A = C41848B3p.A0A();
                    AnonymousClass4L7 A0B = C41846B3n.A0B(r0);
                    AnonymousClass4L7 A0I = C41846B3n.A0I(r0);
                    AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(new AnonymousClass4L5(C41845B3m.A0Q()), "sidecar_child_media_ids");
                    int i = User.TYPE_TAG;
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0W, A0f2, A0O, A0A, A0B, A0I, A0f3, C41845B3m.A0A(AnonymousClass4Ks.A01(), User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, i)});
                }

                public OriginalMedia(int i) {
                    super(i);
                }

                public OriginalMedia() {
                    super(TYPE_TAG);
                }
            }

            public boolean getCanToggleMashupsAllowed() {
                return getRequiredBooleanField(0, "can_toggle_mashups_allowed");
            }

            public boolean getHasBeenMashedUp() {
                return getRequiredBooleanField(1, "has_been_mashed_up");
            }

            public boolean getHasNonmimicableAdditionalAudio() {
                return getCoercedBooleanField(2, "has_nonmimicable_additional_audio");
            }

            public String getMashupType() {
                return getOptionalStringField(6, "mashup_type");
            }

            public boolean getMashupsAllowed() {
                return getRequiredBooleanField(7, "mashups_allowed");
            }

            public boolean hasCanToggleMashupsAllowed() {
                return true;
            }

            public boolean hasHasBeenMashedUp() {
                return true;
            }

            public boolean hasIsCreatorRequestingMashup() {
                return true;
            }

            public boolean hasIsPivotPageAvailable() {
                return true;
            }

            public boolean hasMashupsAllowed() {
                return true;
            }

            public boolean isCreatorRequestingMashup() {
                return getRequiredBooleanField(3, "is_creator_requesting_mashup");
            }

            public boolean isLightWeightCheck() {
                return getCoercedBooleanField(4, "is_light_weight_check");
            }

            public boolean isPivotPageAvailable() {
                return getRequiredBooleanField(5, "is_pivot_page_available");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public int getNonPrivacyFilteredMashupsMediaCount() {
                return getCoercedIntField(8, "non_privacy_filtered_mashups_media_count");
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia getOriginalMedia() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo.OriginalMedia) getOptionalTreeField(9, "original_media", OriginalMedia.class, OriginalMedia.TYPE_TAG);
            }

            public boolean hasHasNonmimicableAdditionalAudio() {
                return hasFieldValue("has_nonmimicable_additional_audio");
            }

            public boolean hasIsLightWeightCheck() {
                return hasFieldValue("is_light_weight_check");
            }

            public boolean hasNonPrivacyFilteredMashupsMediaCount() {
                return hasFieldValue("non_privacy_filtered_mashups_media_count");
            }

            public AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4LF r2 = AnonymousClass4LF.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "can_toggle_mashups_allowed"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "has_been_mashed_up"), AnonymousClass7TE.A0f(r2, "has_nonmimicable_additional_audio"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "is_creator_requesting_mashup"), AnonymousClass7TE.A0f(r2, "is_light_weight_check"), C41848B3p.A0W(r2), AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "mashup_type"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "mashups_allowed"), C41848B3p.A0A(), C41845B3m.A0C(OriginalMedia.class, "original_media", OriginalMedia.TYPE_TAG)});
            }

            public MashupInfo(int i) {
                super(i);
            }

            public MashupInfo() {
                super(TYPE_TAG);
            }
        }

        public final class MerchandisingPillInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MerchandisingPillInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -206373002;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return MerchandisingPillInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public int getLoopTime() {
                return getRequiredIntField(0, "loop_time");
            }

            public boolean hasLoopTime() {
                return true;
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public MerchandisingPillInfo(int i) {
                super(i);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0W(C41845B3m.A0R(), "loop_time");
            }

            public MerchandisingPillInfo() {
                super(TYPE_TAG);
            }
        }

        public final class MusicInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -2011387909;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return MusicInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public final class MusicAssetInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -905756826;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return MusicAssetInfo.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public boolean getAllowsSaving() {
                    return getRequiredBooleanField(0, "allows_saving");
                }

                public String getCoverArtworkUri() {
                    return C41847B3o.A1A(this, "cover_artwork_uri", 5);
                }

                public String getDashManifest() {
                    return getOptionalStringField(6, "dash_manifest");
                }

                public String getDisplayArtist() {
                    return getOptionalStringField(7, "display_artist");
                }

                public boolean hasAllowsSaving() {
                    return true;
                }

                public boolean hasIsExplicit() {
                    return true;
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public String getArtistId() {
                    return A08("artist_id");
                }

                public String getAudioAssetId() {
                    return A09("audio_asset_id");
                }

                public String getAudioClusterId() {
                    return A0A("audio_cluster_id");
                }

                public String getCoverArtworkThumbnailUri() {
                    return A0B("cover_artwork_thumbnail_uri");
                }

                public int getDurationInMs() {
                    return getCoercedIntField(8, "duration_in_ms");
                }

                public String getFastStartProgressiveDownloadUrl() {
                    return getOptionalStringField(9, "fast_start_progressive_download_url");
                }

                public boolean getHasLyrics() {
                    return getCoercedBooleanField(10, "has_lyrics");
                }

                public String getId() {
                    return C41847B3o.A1A(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, 11);
                }

                public String getIgUsername() {
                    return getOptionalStringField(12, "ig_username");
                }

                public String getProgressiveDownloadUrl() {
                    return getOptionalStringField(14, "progressive_download_url");
                }

                public String getSubtitle() {
                    return getOptionalStringField(15, "subtitle");
                }

                public String getTitle() {
                    return getOptionalStringField(16, DialogModule.KEY_TITLE);
                }

                public String getWeb30sPreviewDownloadUrl() {
                    return getOptionalStringField(17, "web_30s_preview_download_url");
                }

                public boolean hasDurationInMs() {
                    return hasFieldValue("duration_in_ms");
                }

                public boolean hasHasLyrics() {
                    return hasFieldValue("has_lyrics");
                }

                public boolean isExplicit() {
                    return getRequiredBooleanField(13, "is_explicit");
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4LF r2 = AnonymousClass4LF.A00;
                    AnonymousClass4L7 A0X = C41848B3p.A0X(r2);
                    AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0X, AnonymousClass7TE.A0f(r0, "artist_id"), AnonymousClass7TE.A0f(r0, "audio_asset_id"), AnonymousClass7TE.A0f(r0, "audio_cluster_id"), AnonymousClass7TE.A0f(r0, "cover_artwork_thumbnail_uri"), C41848B3p.A0Z(r0), AnonymousClass7TE.A0f(r0, "dash_manifest"), AnonymousClass7TE.A0f(r0, "display_artist"), C41847B3o.A0C(AnonymousClass4L8.A00), AnonymousClass7TE.A0f(r0, "fast_start_progressive_download_url"), AnonymousClass7TE.A0f(r2, "has_lyrics"), C41846B3n.A09(r0), AnonymousClass7TE.A0f(r0, "ig_username"), C41848B3p.A0K(r2), AnonymousClass7TE.A0f(r0, "progressive_download_url"), C41847B3o.A0O(r0), C41845B3m.A0I(r0), AnonymousClass7TE.A0f(r0, "web_30s_preview_download_url")});
                }

                public MusicAssetInfo(int i) {
                    super(i);
                }

                public MusicAssetInfo() {
                    super(TYPE_TAG);
                }
            }

            public final class MusicConsumptionInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -1837756642;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return MusicConsumptionInfo.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public final class IgArtist extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo.IgArtist {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -934720494;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return IgArtist.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public boolean getHasOnboardedToTextPostApp() {
                        return getCoercedBooleanField(1, "has_onboarded_to_text_post_app");
                    }

                    public String getPkId() {
                        return getOptionalStringField(6, "pk_id");
                    }

                    public String getProfilePicId() {
                        return getOptionalStringField(7, "profile_pic_id");
                    }

                    public boolean isPrivate() {
                        return getCoercedBooleanField(3, "is_private");
                    }

                    public boolean isVerified() {
                        return C41847B3o.A1b(this, 4);
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public String getFullName() {
                        return A07("full_name");
                    }

                    public String getId() {
                        return A09("strong_id__");
                    }

                    public String getPk() {
                        return A0C("pk");
                    }

                    public String getProfilePicUrl() {
                        return A0D("profile_pic_url");
                    }

                    public String getUsername() {
                        return C41847B3o.A19(this, 9);
                    }

                    public boolean hasHasOnboardedToTextPostApp() {
                        return hasFieldValue("has_onboarded_to_text_post_app");
                    }

                    public boolean hasIsPrivate() {
                        return hasFieldValue("is_private");
                    }

                    public IgArtist(int i) {
                        super(i);
                    }

                    public boolean hasIsVerified() {
                        return C41847B3o.A1a(this);
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        return C41849B3q.A02();
                    }

                    public IgArtist() {
                        super(TYPE_TAG);
                    }
                }

                public boolean getAllowMediaCreationWithMusic() {
                    return getCoercedBooleanField(0, "allow_media_creation_with_music");
                }

                public int getAudioAssetStartTimeInMs() {
                    return getCoercedIntField(1, "audio_asset_start_time_in_ms");
                }

                public int getOverlapDurationInMs() {
                    return getCoercedIntField(6, "overlap_duration_in_ms");
                }

                public String getPlaceholderProfilePicUrl() {
                    return C41847B3o.A1A(this, "placeholder_profile_pic_url", 7);
                }

                public boolean hasShouldMuteAudio() {
                    return true;
                }

                public boolean isBookmarked() {
                    return getCoercedBooleanField(4, "is_bookmarked");
                }

                public boolean isTrendingInClips() {
                    return getCoercedBooleanField(5, "is_trending_in_clips");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public String getDerivedContentId() {
                    return A09("derived_content_id");
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo.IgArtist getIgArtist() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo.IgArtist) getOptionalTreeField(3, "ig_artist", IgArtist.class, IgArtist.TYPE_TAG);
                }

                public boolean getShouldAllowMusicEditing() {
                    return getCoercedBooleanField(8, "should_allow_music_editing");
                }

                public boolean getShouldMuteAudio() {
                    return getRequiredBooleanField(9, "should_mute_audio");
                }

                public String getShouldMuteAudioReason() {
                    return C41847B3o.A1A(this, "should_mute_audio_reason", 10);
                }

                public RGN getShouldMuteAudioReasonType() {
                    return (RGN) getOptionalEnumField(11, "should_mute_audio_reason_type", RGN.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                }

                public int getTrendRank() {
                    return getCoercedIntField(12, "trend_rank");
                }

                public boolean hasAllowMediaCreationWithMusic() {
                    return hasFieldValue("allow_media_creation_with_music");
                }

                public boolean hasAudioAssetStartTimeInMs() {
                    return hasFieldValue("audio_asset_start_time_in_ms");
                }

                public boolean hasIsBookmarked() {
                    return hasFieldValue("is_bookmarked");
                }

                public boolean hasIsTrendingInClips() {
                    return hasFieldValue("is_trending_in_clips");
                }

                public boolean hasOverlapDurationInMs() {
                    return hasFieldValue("overlap_duration_in_ms");
                }

                public boolean hasShouldAllowMusicEditing() {
                    return hasFieldValue("should_allow_music_editing");
                }

                public boolean hasTrendRank() {
                    return hasFieldValue("trend_rank");
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4LF r3 = AnonymousClass4LF.A00;
                    AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r3, "allow_media_creation_with_music");
                    AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
                    AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r1, "audio_asset_start_time_in_ms");
                    AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, AnonymousClass7TE.A0f(r2, "derived_content_id"), C41845B3m.A0C(IgArtist.class, "ig_artist", IgArtist.TYPE_TAG), AnonymousClass7TE.A0f(r3, "is_bookmarked"), AnonymousClass7TE.A0f(r3, "is_trending_in_clips"), AnonymousClass7TE.A0f(r1, "overlap_duration_in_ms"), C41848B3p.A0N(r2), AnonymousClass7TE.A0f(r3, "should_allow_music_editing"), C41848B3p.A0f(r3), C41848B3p.A0e(r2), AnonymousClass7TE.A0f(r2, "should_mute_audio_reason_type"), AnonymousClass7TE.A0f(r1, "trend_rank")});
                }

                public MusicConsumptionInfo(int i) {
                    super(i);
                }

                public MusicConsumptionInfo() {
                    super(TYPE_TAG);
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicAssetInfo getMusicAssetInfo() {
                C250663lr A05 = A05(MusicAssetInfo.class, "music_asset_info", MusicAssetInfo.TYPE_TAG);
                0qQ.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.ClipsMetadata.MusicInfo.MusicAssetInfo");
                return (MusicAssetInfo) A05;
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo.MusicConsumptionInfo getMusicConsumptionInfo() {
                C250663lr requiredTreeField = getRequiredTreeField(1, "music_consumption_info", MusicConsumptionInfo.class, MusicConsumptionInfo.TYPE_TAG);
                0qQ.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.ClipsMetadata.MusicInfo.MusicConsumptionInfo");
                return (MusicConsumptionInfo) requiredTreeField;
            }

            public AnonymousClass4Kx modelSelectionSet() {
                int i = MusicAssetInfo.TYPE_TAG;
                C284275Lw A01 = AnonymousClass4Ks.A01();
                int i2 = MusicConsumptionInfo.TYPE_TAG;
                return C41847B3o.A0i(AnonymousClass4Ks.A01(), C41845B3m.A0A(A01, MusicAssetInfo.class, "music_asset_info", i), MusicConsumptionInfo.class, "music_consumption_info", i2);
            }

            public MusicInfo(int i) {
                super(i);
            }

            public MusicInfo() {
                super(TYPE_TAG);
            }
        }

        public final class OriginalSoundInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 1303107027;

            public final class AudioParts extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.AudioParts {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 670235839;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return AudioParts.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public CreatorInspirationSignalsPlaygroundAudioPartMetadata2 asCreatorInspirationSignalsPlaygroundAudioPartMetadata2() {
                    return (CreatorInspirationSignalsPlaygroundAudioPartMetadata2) A01(CreatorInspirationSignalsPlaygroundAudioPartMetadata2Impl.class, CreatorInspirationSignalsPlaygroundAudioPartMetadata2Impl.TYPE_TAG);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0X(CreatorInspirationSignalsPlaygroundAudioPartMetadata2Impl.class, "CreatorInspirationSignalsPlaygroundAudioPartMetadata2", CreatorInspirationSignalsPlaygroundAudioPartMetadata2Impl.TYPE_TAG);
                }

                public AudioParts(int i) {
                    super(i);
                }

                public AudioParts() {
                    super(TYPE_TAG);
                }
            }

            public final class AudioPartsByFilter extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.AudioPartsByFilter {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -690018489;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return AudioPartsByFilter.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public CreatorInspirationSignalsPlaygroundAudioPartMetadata asCreatorInspirationSignalsPlaygroundAudioPartMetadata() {
                    return (CreatorInspirationSignalsPlaygroundAudioPartMetadata) A01(CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.class, CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.TYPE_TAG);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0X(CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.class, "CreatorInspirationSignalsPlaygroundAudioPartMetadata", CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.TYPE_TAG);
                }

                public AudioPartsByFilter(int i) {
                    super(i);
                }

                public AudioPartsByFilter() {
                    super(TYPE_TAG);
                }
            }

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return OriginalSoundInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public final class ConsumptionInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.ConsumptionInfo {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 251423850;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return ConsumptionInfo.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public String getShouldMuteAudioReason() {
                    return C41847B3o.A1A(this, "should_mute_audio_reason", 2);
                }

                public boolean hasIsBookmarked() {
                    return true;
                }

                public boolean hasIsTrendingInClips() {
                    return true;
                }

                public boolean isBookmarked() {
                    return getRequiredBooleanField(0, "is_bookmarked");
                }

                public boolean isTrendingInClips() {
                    return getRequiredBooleanField(1, "is_trending_in_clips");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public ConsumptionInfo(int i) {
                    super(i);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return C41848B3p.A0y();
                }

                public ConsumptionInfo() {
                    super(TYPE_TAG);
                }
            }

            public final class IgArtist extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.IgArtist {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -881274254;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return IgArtist.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public boolean getHasOnboardedToTextPostApp() {
                    return getCoercedBooleanField(1, "has_onboarded_to_text_post_app");
                }

                public String getPkId() {
                    return getOptionalStringField(6, "pk_id");
                }

                public String getProfilePicId() {
                    return getOptionalStringField(7, "profile_pic_id");
                }

                public boolean isPrivate() {
                    return getCoercedBooleanField(3, "is_private");
                }

                public boolean isVerified() {
                    return C41847B3o.A1b(this, 4);
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public String getFullName() {
                    return A07("full_name");
                }

                public String getId() {
                    return A09("strong_id__");
                }

                public String getPk() {
                    return A0C("pk");
                }

                public String getProfilePicUrl() {
                    return A0D("profile_pic_url");
                }

                public String getUsername() {
                    return C41847B3o.A19(this, 9);
                }

                public boolean hasHasOnboardedToTextPostApp() {
                    return hasFieldValue("has_onboarded_to_text_post_app");
                }

                public boolean hasIsPrivate() {
                    return hasFieldValue("is_private");
                }

                public IgArtist(int i) {
                    super(i);
                }

                public boolean hasIsVerified() {
                    return C41847B3o.A1a(this);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return C41849B3q.A02();
                }

                public IgArtist() {
                    super(TYPE_TAG);
                }
            }

            public boolean getAllowCreatorToRename() {
                return getRequiredBooleanField(0, "allow_creator_to_rename");
            }

            public String getAudioAssetId() {
                return C41847B3o.A1A(this, "audio_asset_id", 1);
            }

            public boolean getCanRemixBeSharedToFb() {
                return getCoercedBooleanField(4, "can_remix_be_shared_to_fb");
            }

            public String getDashManifest() {
                return C41847B3o.A1A(this, "dash_manifest", 6);
            }

            public int getDurationInMs() {
                return getCoercedIntField(7, "duration_in_ms");
            }

            public boolean hasAllowCreatorToRename() {
                return true;
            }

            public boolean hasHideRemixing() {
                return true;
            }

            public boolean hasIsAudioAutomaticallyAttributed() {
                return true;
            }

            public boolean hasIsExplicit() {
                return true;
            }

            public boolean hasShouldMuteAudio() {
                return true;
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public ImmutableList getAudioParts() {
                return getRequiredCompactedTreeListField(2, "audio_parts", AudioParts.class, AudioParts.TYPE_TAG);
            }

            public ImmutableList getAudioPartsByFilter() {
                return getRequiredCompactedTreeListField(3, "audio_parts_by_filter", AudioPartsByFilter.class, AudioPartsByFilter.TYPE_TAG);
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.ConsumptionInfo getConsumptionInfo() {
                C250663lr requiredTreeField = getRequiredTreeField(5, "consumption_info", ConsumptionInfo.class, ConsumptionInfo.TYPE_TAG);
                0qQ.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.ClipsMetadata.OriginalSoundInfo.ConsumptionInfo");
                return (ConsumptionInfo) requiredTreeField;
            }

            public boolean getHideRemixing() {
                return getRequiredBooleanField(8, "hide_remixing");
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo.IgArtist getIgArtist() {
                C250663lr requiredTreeField = getRequiredTreeField(9, "ig_artist", IgArtist.class, IgArtist.TYPE_TAG);
                0qQ.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.ClipsMetadata.OriginalSoundInfo.IgArtist");
                return (IgArtist) requiredTreeField;
            }

            public HN9 getOriginalAudioSubtype() {
                return (HN9) C41847B3o.A10(this, HN9.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "original_audio_subtype", 15);
            }

            public String getOriginalAudioTitle() {
                return C41847B3o.A1A(this, "original_audio_title", 16);
            }

            public String getOriginalMediaId() {
                return C41847B3o.A1A(this, "original_media_id", 17);
            }

            public String getProgressiveDownloadUrl() {
                return C41847B3o.A1A(this, "progressive_download_url", 18);
            }

            public boolean getShouldMuteAudio() {
                return getRequiredBooleanField(19, "should_mute_audio");
            }

            public int getTimeCreated() {
                return getCoercedIntField(20, "time_created");
            }

            public int getTrendRank() {
                return getCoercedIntField(21, "trend_rank");
            }

            public boolean hasCanRemixBeSharedToFb() {
                return hasFieldValue("can_remix_be_shared_to_fb");
            }

            public boolean hasDurationInMs() {
                return hasFieldValue("duration_in_ms");
            }

            public boolean hasIsOriginalAudioDownloadEligible() {
                return hasFieldValue("is_original_audio_download_eligible");
            }

            public boolean hasIsReuseDisabled() {
                return hasFieldValue("is_reuse_disabled");
            }

            public boolean hasIsXpostFromFb() {
                return hasFieldValue("is_xpost_from_fb");
            }

            public boolean hasTimeCreated() {
                return hasFieldValue("time_created");
            }

            public boolean hasTrendRank() {
                return hasFieldValue("trend_rank");
            }

            public boolean isAudioAutomaticallyAttributed() {
                return getRequiredBooleanField(10, "is_audio_automatically_attributed");
            }

            public boolean isExplicit() {
                return getRequiredBooleanField(11, "is_explicit");
            }

            public boolean isOriginalAudioDownloadEligible() {
                return getCoercedBooleanField(12, "is_original_audio_download_eligible");
            }

            public boolean isReuseDisabled() {
                return getCoercedBooleanField(13, "is_reuse_disabled");
            }

            public boolean isXpostFromFb() {
                return getCoercedBooleanField(14, "is_xpost_from_fb");
            }

            public AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4LF r0 = AnonymousClass4LF.A00;
                AnonymousClass4L7 A0n = C41848B3p.A0n(r0);
                AnonymousClass4Kz r5 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0a = C41848B3p.A0a(r5);
                AnonymousClass4Kp A08 = C41848B3p.A08(AudioParts.class, AudioParts.TYPE_TAG);
                int i = AudioPartsByFilter.TYPE_TAG;
                AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A02(), AudioPartsByFilter.class, "audio_parts_by_filter", i);
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r0, "can_remix_be_shared_to_fb");
                AnonymousClass4Kp A05 = C41848B3p.A05(ConsumptionInfo.class, ConsumptionInfo.TYPE_TAG);
                AnonymousClass4L7 A0j = C41848B3p.A0j(r5);
                AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0n, A0a, A08, A0A, A0f, A05, A0j, C41847B3o.A0C(r1), C41848B3p.A0l(r0), C41848B3p.A06(IgArtist.class, IgArtist.TYPE_TAG), C41848B3p.A0M(r0), C41848B3p.A0K(r0), AnonymousClass7TE.A0f(r0, "is_original_audio_download_eligible"), AnonymousClass7TE.A0f(r0, "is_reuse_disabled"), AnonymousClass7TE.A0f(r0, "is_xpost_from_fb"), C41848B3p.A0i(r5), C41848B3p.A0U(r5), C41848B3p.A0J(r5), C41848B3p.A0R(r5), C41848B3p.A0f(r0), AnonymousClass7TE.A0f(r1, "time_created"), AnonymousClass7TE.A0f(r1, "trend_rank")});
            }

            public OriginalSoundInfo(int i) {
                super(i);
            }

            public OriginalSoundInfo() {
                super(TYPE_TAG);
            }
        }

        public final class ShoppingInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 1502720119;

            public final class ClipsShoppingCtaBar extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.ClipsShoppingCtaBar {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -1469020760;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return ClipsShoppingCtaBar.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public double getAnimationTimeSec() {
                    return getCoercedDoubleField(0, "animation_time_sec");
                }

                public int getDwellTimeSec() {
                    return getCoercedIntField(4, "dwell_time_sec");
                }

                public String getToggledDestination() {
                    return getOptionalStringField(6, "toggled_destination");
                }

                public String getToggledTitle() {
                    return getOptionalStringField(7, "toggled_title");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public String getCtaBarType() {
                    return A08("cta_bar_type");
                }

                public String getDestination() {
                    return A09("destination");
                }

                public String getDominantColor() {
                    return A0A("dominant_color");
                }

                public String getTitle() {
                    return A0C(DialogModule.KEY_TITLE);
                }

                public boolean hasAnimationTimeSec() {
                    return hasFieldValue("animation_time_sec");
                }

                public boolean hasDwellTimeSec() {
                    return hasFieldValue("dwell_time_sec");
                }

                public ClipsShoppingCtaBar(int i) {
                    super(i);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return C41849B3q.A01();
                }

                public ClipsShoppingCtaBar() {
                    super(TYPE_TAG);
                }
            }

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return ShoppingInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public final class Merchant extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Merchant {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -1960773715;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return Merchant.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public boolean getDisabledSharingProductsToGuides() {
                    return getCoercedBooleanField(0, "disabled_sharing_products_to_guides");
                }

                public String getUsername() {
                    return C41847B3o.A19(this, 6);
                }

                public boolean isVerified() {
                    return C41847B3o.A1b(this, 2);
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public String getId() {
                    return A08("strong_id__");
                }

                public String getPk() {
                    return A0A("pk");
                }

                public String getProfilePicUrl() {
                    return A0B("profile_pic_url");
                }

                public String getStorefrontAttributionUsername() {
                    return A0C("storefront_attribution_username");
                }

                public boolean hasDisabledSharingProductsToGuides() {
                    return hasFieldValue("disabled_sharing_products_to_guides");
                }

                public Merchant(int i) {
                    super(i);
                }

                public boolean hasIsVerified() {
                    return C41847B3o.A1a(this);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return C41849B3q.A0B();
                }

                public Merchant() {
                    super(TYPE_TAG);
                }
            }

            public final class Products extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 1601450224;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return Products.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public final class ProductDetails extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -456596536;

                    public final class AggregatedRating extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.AggregatedRating {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 1513041188;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return AggregatedRating.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public int getRatingCount() {
                            return getCoercedIntField(0, "rating_count");
                        }

                        public double getValue() {
                            return getCoercedDoubleField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public boolean hasRatingCount() {
                            return hasFieldValue("rating_count");
                        }

                        public boolean hasValue() {
                            return hasFieldValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                        }

                        public AggregatedRating(int i) {
                            super(i);
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0V(C342787pA.A00, C41847B3o.A06(), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                        }

                        public AggregatedRating() {
                            super(TYPE_TAG);
                        }
                    }

                    public final class ArtsLabels extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ArtsLabels {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -698412464;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return ArtsLabels.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public final class Labels extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ArtsLabels.Labels {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = 1226809924;

                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return Labels.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            public String getLabelDisplayValue() {
                                return A07("label_display_value");
                            }

                            public String getLabelType() {
                                return A08("label_type");
                            }

                            public AnonymousClass4Kx modelSelectionSet() {
                                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                                return AnonymousClass7TG.A0V(r2, AnonymousClass7TE.A0f(r2, "label_display_value"), "label_type");
                            }

                            public Labels(int i) {
                                super(i);
                            }

                            public Labels() {
                                super(TYPE_TAG);
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public ImmutableList getLabels() {
                            return getOptionalCompactedTreeListField(0, "labels", Labels.class, Labels.TYPE_TAG);
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            int i = Labels.TYPE_TAG;
                            return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Labels.class, "labels", i);
                        }

                        public ArtsLabels(int i) {
                            super(i);
                        }

                        public ArtsLabels() {
                            super(TYPE_TAG);
                        }
                    }

                    public final class CheckoutProperties extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -1680796727;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return CheckoutProperties.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public final class CurrencyAmount extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.CurrencyAmount {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -770900763;

                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return CurrencyAmount.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            public String getAmount() {
                                return A07("amount");
                            }

                            public String getAmountWithOffset() {
                                return A08("amount_with_offset");
                            }

                            public String getCurrency() {
                                return A09("currency");
                            }

                            public boolean hasOffset() {
                                return hasFieldValue("offset");
                            }

                            public CurrencyAmount(int i) {
                                super(i);
                            }

                            public int getOffset() {
                                return C41847B3o.A02(this);
                            }

                            public AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A0v();
                            }

                            public CurrencyAmount() {
                                super(TYPE_TAG);
                            }
                        }

                        public final class ShippingAndReturn extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -1184522475;

                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return ShippingAndReturn.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            public final class ReturnCost extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ReturnCost {
                                public static final Companion Companion = new Object();
                                public static final int TYPE_TAG = -1676463092;

                                public final class Companion {
                                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                                    }

                                    public final int getTYPE_TAG() {
                                        return ReturnCost.TYPE_TAG;
                                    }

                                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                    }

                                    public Companion() {
                                    }
                                }

                                public static final int getTYPE_TAG() {
                                    return TYPE_TAG;
                                }

                                public String getAmount() {
                                    return A07("amount");
                                }

                                public String getAmountWithOffset() {
                                    return A08("amount_with_offset");
                                }

                                public String getCurrency() {
                                    return A09("currency");
                                }

                                public boolean hasOffset() {
                                    return hasFieldValue("offset");
                                }

                                public ReturnCost(int i) {
                                    super(i);
                                }

                                public int getOffset() {
                                    return C41847B3o.A02(this);
                                }

                                public AnonymousClass4Kx modelSelectionSet() {
                                    return C41848B3p.A0v();
                                }

                                public ReturnCost() {
                                    super(TYPE_TAG);
                                }
                            }

                            public final class ShippingCost extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ShippingCost {
                                public static final Companion Companion = new Object();
                                public static final int TYPE_TAG = -1242952738;

                                public final class Companion {
                                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                                    }

                                    public final int getTYPE_TAG() {
                                        return ShippingCost.TYPE_TAG;
                                    }

                                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                    }

                                    public Companion() {
                                    }
                                }

                                public static final int getTYPE_TAG() {
                                    return TYPE_TAG;
                                }

                                public String getAmount() {
                                    return A07("amount");
                                }

                                public String getAmountWithOffset() {
                                    return A08("amount_with_offset");
                                }

                                public String getCurrency() {
                                    return A09("currency");
                                }

                                public boolean hasOffset() {
                                    return hasFieldValue("offset");
                                }

                                public ShippingCost(int i) {
                                    super(i);
                                }

                                public int getOffset() {
                                    return C41847B3o.A02(this);
                                }

                                public AnonymousClass4Kx modelSelectionSet() {
                                    return C41848B3p.A0v();
                                }

                                public ShippingCost() {
                                    super(TYPE_TAG);
                                }
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ReturnCost getReturnCost() {
                                return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ReturnCost) A03(ReturnCost.class, "return_cost", ReturnCost.TYPE_TAG);
                            }

                            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ShippingCost getShippingCost() {
                                return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ShippingCost) A02(ShippingCost.class, "shipping_cost", ShippingCost.TYPE_TAG);
                            }

                            public String getShippingCostStripped() {
                                return A09("shipping_cost_stripped");
                            }

                            public AnonymousClass4Kx modelSelectionSet() {
                                return AnonymousClass7TG.A0U(AnonymousClass4Kz.A00, C41845B3m.A0C(ReturnCost.class, "return_cost", ReturnCost.TYPE_TAG), C41845B3m.A0C(ShippingCost.class, "shipping_cost", ShippingCost.TYPE_TAG), "shipping_cost_stripped");
                            }

                            public ShippingAndReturn(int i) {
                                super(i);
                            }

                            public ShippingAndReturn() {
                                super(TYPE_TAG);
                            }
                        }

                        public boolean getCanAddToBag() {
                            return getCoercedBooleanField(0, "can_add_to_bag");
                        }

                        public boolean getCanEnableRestockReminder() {
                            return getCoercedBooleanField(1, "can_enable_restock_reminder");
                        }

                        public boolean getCanShowInventoryQuantity() {
                            return getCoercedBooleanField(2, "can_show_inventory_quantity");
                        }

                        public int getFullInventoryQuantity() {
                            return getCoercedIntField(4, "full_inventory_quantity");
                        }

                        public boolean getHasFreeShipping() {
                            return getCoercedBooleanField(5, "has_free_shipping");
                        }

                        public String getIgReferrerFbid() {
                            return getOptionalStringField(6, "ig_referrer_fbid");
                        }

                        public int getInventoryQuantity() {
                            return getCoercedIntField(7, "inventory_quantity");
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.CurrencyAmount getCurrencyAmount() {
                            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.CurrencyAmount) getOptionalTreeField(3, "currency_amount", CurrencyAmount.class, CurrencyAmount.TYPE_TAG);
                        }

                        public boolean getProductGroupHasInventory() {
                            return getCoercedBooleanField(9, "product_group_has_inventory");
                        }

                        public String getReceiverId() {
                            return getOptionalStringField(10, "receiver_id");
                        }

                        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn getShippingAndReturn() {
                            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn) getOptionalTreeField(11, "shipping_and_return", ShippingAndReturn.class, ShippingAndReturn.TYPE_TAG);
                        }

                        public int getViewerPurchaseLimit() {
                            return getCoercedIntField(12, "viewer_purchase_limit");
                        }

                        public boolean hasCanAddToBag() {
                            return hasFieldValue("can_add_to_bag");
                        }

                        public boolean hasCanEnableRestockReminder() {
                            return hasFieldValue("can_enable_restock_reminder");
                        }

                        public boolean hasCanShowInventoryQuantity() {
                            return hasFieldValue("can_show_inventory_quantity");
                        }

                        public boolean hasFullInventoryQuantity() {
                            return hasFieldValue("full_inventory_quantity");
                        }

                        public boolean hasHasFreeShipping() {
                            return hasFieldValue("has_free_shipping");
                        }

                        public boolean hasInventoryQuantity() {
                            return hasFieldValue("inventory_quantity");
                        }

                        public boolean hasIsShopifyMerchant() {
                            return hasFieldValue("is_shopify_merchant");
                        }

                        public boolean hasProductGroupHasInventory() {
                            return hasFieldValue("product_group_has_inventory");
                        }

                        public boolean hasViewerPurchaseLimit() {
                            return hasFieldValue("viewer_purchase_limit");
                        }

                        public boolean isShopifyMerchant() {
                            return getCoercedBooleanField(8, "is_shopify_merchant");
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            AnonymousClass4LF r3 = AnonymousClass4LF.A00;
                            AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r3, "can_add_to_bag");
                            AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r3, "can_enable_restock_reminder");
                            AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r3, "can_show_inventory_quantity");
                            AnonymousClass4Kp A0C = C41845B3m.A0C(CurrencyAmount.class, "currency_amount", CurrencyAmount.TYPE_TAG);
                            AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
                            AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r2, "full_inventory_quantity");
                            AnonymousClass4L7 A0f5 = AnonymousClass7TE.A0f(r3, "has_free_shipping");
                            AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, A0f3, A0C, A0f4, A0f5, AnonymousClass7TE.A0f(r1, "ig_referrer_fbid"), AnonymousClass7TE.A0f(r2, "inventory_quantity"), AnonymousClass7TE.A0f(r3, "is_shopify_merchant"), AnonymousClass7TE.A0f(r3, "product_group_has_inventory"), AnonymousClass7TE.A0f(r1, "receiver_id"), C41845B3m.A0C(ShippingAndReturn.class, "shipping_and_return", ShippingAndReturn.TYPE_TAG), AnonymousClass7TE.A0f(r2, "viewer_purchase_limit")});
                        }

                        public CheckoutProperties(int i) {
                            super(i);
                        }

                        public CheckoutProperties() {
                            super(TYPE_TAG);
                        }
                    }

                    public final class CommerceReviewStatistics extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CommerceReviewStatistics {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -2052810183;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return CommerceReviewStatistics.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public double getAverageRating() {
                            return getCoercedDoubleField(0, "average_rating");
                        }

                        public int getReviewCount() {
                            return getCoercedIntField(1, "review_count");
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public boolean hasAverageRating() {
                            return hasFieldValue("average_rating");
                        }

                        public boolean hasReviewCount() {
                            return hasFieldValue("review_count");
                        }

                        public CommerceReviewStatistics(int i) {
                            super(i);
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0V(AnonymousClass4L8.A00, C41848B3p.A0B(), "review_count");
                        }

                        public CommerceReviewStatistics() {
                            super(TYPE_TAG);
                        }
                    }

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return ProductDetails.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public final class DiscountInformation extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.DiscountInformation {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 2141381936;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return DiscountInformation.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public final class Discounts extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.DiscountInformation.Discounts {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -374764815;

                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return Discounts.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            public String getId() {
                                return C41847B3o.A1A(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, 2);
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            public String getCtaText() {
                                return A07("cta_text");
                            }

                            public String getDescription() {
                                return A08(DevServerEntity.COLUMN_DESCRIPTION);
                            }

                            public String getName() {
                                return A0A(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                            }

                            public String getSeeDetailsText() {
                                return A0B("see_details_text");
                            }

                            public Discounts(int i) {
                                super(i);
                            }

                            public AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A12();
                            }

                            public Discounts() {
                                super(TYPE_TAG);
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public ImmutableList getDiscounts() {
                            return getOptionalCompactedTreeListField(0, "discounts", Discounts.class, Discounts.TYPE_TAG);
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            int i = Discounts.TYPE_TAG;
                            return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Discounts.class, "discounts", i);
                        }

                        public DiscountInformation(int i) {
                            super(i);
                        }

                        public DiscountInformation() {
                            super(TYPE_TAG);
                        }
                    }

                    public final class ImageQualityMetadata extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ImageQualityMetadata {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 1995545465;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return ImageQualityMetadata.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public final class Goodness extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ImageQualityMetadata.Goodness {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = 1048020663;

                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return Goodness.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            public double getScore() {
                                return getCoercedDoubleField(1, "score");
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            public String getId() {
                                return A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                            }

                            public boolean hasScore() {
                                return hasFieldValue("score");
                            }

                            public Goodness(int i) {
                                super(i);
                            }

                            public AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A0r();
                            }

                            public Goodness() {
                                super(TYPE_TAG);
                            }
                        }

                        public final class LifestyleBackground extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ImageQualityMetadata.LifestyleBackground {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -1088568239;

                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return LifestyleBackground.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            public double getScore() {
                                return getCoercedDoubleField(1, "score");
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            public String getId() {
                                return A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                            }

                            public boolean hasScore() {
                                return hasFieldValue("score");
                            }

                            public LifestyleBackground(int i) {
                                super(i);
                            }

                            public AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A0r();
                            }

                            public LifestyleBackground() {
                                super(TYPE_TAG);
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public ImmutableList getGoodness() {
                            return getOptionalCompactedTreeListField(0, "goodness", Goodness.class, Goodness.TYPE_TAG);
                        }

                        public ImmutableList getLifestyleBackground() {
                            return getOptionalCompactedTreeListField(1, "lifestyle_background", LifestyleBackground.class, LifestyleBackground.TYPE_TAG);
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            int i = LifestyleBackground.TYPE_TAG;
                            return C41847B3o.A0i(AnonymousClass4Ks.A00(), C41848B3p.A07(Goodness.class, Goodness.TYPE_TAG), LifestyleBackground.class, "lifestyle_background", i);
                        }

                        public ImageQualityMetadata(int i) {
                            super(i);
                        }

                        public ImageQualityMetadata() {
                            super(TYPE_TAG);
                        }
                    }

                    public final class MainImage extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.MainImage {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -773941500;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return MainImage.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public final class ImageVersions2 extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2 {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -1272297607;

                            public final class Candidates extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2.Candidates {
                                public static final Companion Companion = new Object();
                                public static final int TYPE_TAG = 1751902548;

                                public final class Companion {
                                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                                    }

                                    public final int getTYPE_TAG() {
                                        return Candidates.TYPE_TAG;
                                    }

                                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                    }

                                    public Companion() {
                                    }
                                }

                                public static final int getTYPE_TAG() {
                                    return TYPE_TAG;
                                }

                                public String getUrl() {
                                    return A08("url");
                                }

                                public int getWidth() {
                                    return A00(IgReactMediaPickerNativeModule.WIDTH);
                                }

                                public boolean hasHeight() {
                                    return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
                                }

                                public boolean hasWidth() {
                                    return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
                                }

                                public Candidates(int i) {
                                    super(i);
                                }

                                public int getHeight() {
                                    return C41847B3o.A01(this);
                                }

                                public AnonymousClass4Kx modelSelectionSet() {
                                    return C41848B3p.A0s();
                                }

                                public Candidates() {
                                    super(TYPE_TAG);
                                }
                            }

                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return ImageVersions2.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            public ImmutableList getCandidates() {
                                return getOptionalCompactedTreeListField(0, "candidates", Candidates.class, Candidates.TYPE_TAG);
                            }

                            public AnonymousClass4Kx modelSelectionSet() {
                                int i = Candidates.TYPE_TAG;
                                return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Candidates.class, "candidates", i);
                            }

                            public ImageVersions2(int i) {
                                super(i);
                            }

                            public ImageVersions2() {
                                super(TYPE_TAG);
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2 getImageVersions2() {
                            C250663lr A05 = A05(ImageVersions2.class, "image_versions2", ImageVersions2.TYPE_TAG);
                            0qQ.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.ClipsMetadata.ShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2");
                            return (ImageVersions2) A05;
                        }

                        public String getPreview() {
                            return A08("preview");
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            int i = ImageVersions2.TYPE_TAG;
                            return C41848B3p.A13(AnonymousClass4Ks.A01(), ImageVersions2.class, i);
                        }

                        public MainImage(int i) {
                            super(i);
                        }

                        public MainImage() {
                            super(TYPE_TAG);
                        }
                    }

                    public final class Merchant extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.Merchant {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 1982642153;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return Merchant.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public boolean getDisabledSharingProductsToGuides() {
                            return getCoercedBooleanField(0, "disabled_sharing_products_to_guides");
                        }

                        public String getUsername() {
                            return C41847B3o.A19(this, 6);
                        }

                        public boolean isVerified() {
                            return C41847B3o.A1b(this, 2);
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public String getId() {
                            return A08("strong_id__");
                        }

                        public String getPk() {
                            return A0A("pk");
                        }

                        public String getProfilePicUrl() {
                            return A0B("profile_pic_url");
                        }

                        public String getStorefrontAttributionUsername() {
                            return A0C("storefront_attribution_username");
                        }

                        public boolean hasDisabledSharingProductsToGuides() {
                            return hasFieldValue("disabled_sharing_products_to_guides");
                        }

                        public Merchant(int i) {
                            super(i);
                        }

                        public boolean hasIsVerified() {
                            return C41847B3o.A1a(this);
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            return C41849B3q.A0B();
                        }

                        public Merchant() {
                            super(TYPE_TAG);
                        }
                    }

                    public final class RichTextDescription extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.RichTextDescription {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 1156939697;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return RichTextDescription.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public final class TextWithEntities extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.RichTextDescription.TextWithEntities {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -559730731;

                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return TextWithEntities.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            public final class InlineStyleRanges extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.RichTextDescription.TextWithEntities.InlineStyleRanges {
                                public static final Companion Companion = new Object();
                                public static final int TYPE_TAG = 1964789413;

                                public final class Companion {
                                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                                    }

                                    public final int getTYPE_TAG() {
                                        return InlineStyleRanges.TYPE_TAG;
                                    }

                                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                    }

                                    public Companion() {
                                    }
                                }

                                public int getInlineStyle() {
                                    return getCoercedIntField(0, "inline_style");
                                }

                                public int getLength() {
                                    return getCoercedIntField(1, "length");
                                }

                                public static final int getTYPE_TAG() {
                                    return TYPE_TAG;
                                }

                                public int getOffset() {
                                    return A00("offset");
                                }

                                public boolean hasInlineStyle() {
                                    return hasFieldValue("inline_style");
                                }

                                public boolean hasLength() {
                                    return hasFieldValue("length");
                                }

                                public boolean hasOffset() {
                                    return hasFieldValue("offset");
                                }

                                public InlineStyleRanges(int i) {
                                    super(i);
                                }

                                public AnonymousClass4Kx modelSelectionSet() {
                                    return C41848B3p.A0t();
                                }

                                public InlineStyleRanges() {
                                    super(TYPE_TAG);
                                }
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            public ImmutableList getInlineStyleRanges() {
                                return getOptionalCompactedTreeListField(0, "inline_style_ranges", InlineStyleRanges.class, InlineStyleRanges.TYPE_TAG);
                            }

                            public AnonymousClass4Kx modelSelectionSet() {
                                int i = InlineStyleRanges.TYPE_TAG;
                                return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), InlineStyleRanges.class, "inline_style_ranges", i);
                            }

                            public TextWithEntities(int i) {
                                super(i);
                            }

                            public TextWithEntities() {
                                super(TYPE_TAG);
                            }
                        }

                        public int getDepth() {
                            return getCoercedIntField(1, "depth");
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public String getBlockType() {
                            return A07("block_type");
                        }

                        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.RichTextDescription.TextWithEntities getTextWithEntities() {
                            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.RichTextDescription.TextWithEntities) A04(TextWithEntities.class, "text_with_entities", TextWithEntities.TYPE_TAG);
                        }

                        public boolean hasDepth() {
                            return hasFieldValue("depth");
                        }

                        public RichTextDescription(int i) {
                            super(i);
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            return C41847B3o.A0k(C41848B3p.A0F(), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "depth"), TextWithEntities.class, "text_with_entities", TextWithEntities.TYPE_TAG);
                        }

                        public RichTextDescription() {
                            super(TYPE_TAG);
                        }
                    }

                    public final class SellerBadge extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.SellerBadge {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 1961261768;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return SellerBadge.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public String getDescription() {
                            return A07(DevServerEntity.COLUMN_DESCRIPTION);
                        }

                        public String getName() {
                            return A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                        }

                        public C48115EWh getType() {
                            return (C48115EWh) getOptionalEnumField(2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C48115EWh.A02);
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                            return AnonymousClass7TG.A0U(r3, C41847B3o.A0U(r3), C41845B3m.A0G(r3), PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                        }

                        public SellerBadge(int i) {
                            super(i);
                        }

                        public SellerBadge() {
                            super(TYPE_TAG);
                        }
                    }

                    public final class ThumbnailImage extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ThumbnailImage {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 1472342914;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return ThumbnailImage.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public final class ImageVersions2 extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2 {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -2097145300;

                            public final class Candidates extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2.Candidates {
                                public static final Companion Companion = new Object();
                                public static final int TYPE_TAG = 2008878682;

                                public final class Companion {
                                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                                    }

                                    public final int getTYPE_TAG() {
                                        return Candidates.TYPE_TAG;
                                    }

                                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                    }

                                    public Companion() {
                                    }
                                }

                                public static final int getTYPE_TAG() {
                                    return TYPE_TAG;
                                }

                                public String getUrl() {
                                    return A08("url");
                                }

                                public int getWidth() {
                                    return A00(IgReactMediaPickerNativeModule.WIDTH);
                                }

                                public boolean hasHeight() {
                                    return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
                                }

                                public boolean hasWidth() {
                                    return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
                                }

                                public Candidates(int i) {
                                    super(i);
                                }

                                public int getHeight() {
                                    return C41847B3o.A01(this);
                                }

                                public AnonymousClass4Kx modelSelectionSet() {
                                    return C41848B3p.A0s();
                                }

                                public Candidates() {
                                    super(TYPE_TAG);
                                }
                            }

                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return ImageVersions2.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            public ImmutableList getCandidates() {
                                return getOptionalCompactedTreeListField(0, "candidates", Candidates.class, Candidates.TYPE_TAG);
                            }

                            public AnonymousClass4Kx modelSelectionSet() {
                                int i = Candidates.TYPE_TAG;
                                return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Candidates.class, "candidates", i);
                            }

                            public ImageVersions2(int i) {
                                super(i);
                            }

                            public ImageVersions2() {
                                super(TYPE_TAG);
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2 getImageVersions2() {
                            C250663lr A05 = A05(ImageVersions2.class, "image_versions2", ImageVersions2.TYPE_TAG);
                            0qQ.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2");
                            return (ImageVersions2) A05;
                        }

                        public String getPreview() {
                            return A08("preview");
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            int i = ImageVersions2.TYPE_TAG;
                            return C41848B3p.A13(AnonymousClass4Ks.A01(), ImageVersions2.class, i);
                        }

                        public ThumbnailImage(int i) {
                            super(i);
                        }

                        public ThumbnailImage() {
                            super(TYPE_TAG);
                        }
                    }

                    public final class VariantValues extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.VariantValues {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 74565734;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return VariantValues.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public String getId() {
                            return C41847B3o.A1A(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, 0);
                        }

                        public String getName() {
                            return C41847B3o.A1A(this, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, 2);
                        }

                        public String getValue() {
                            return C41847B3o.A1A(this, IntentModule.EXTRA_MAP_KEY_FOR_VALUE, 4);
                        }

                        public boolean hasIsPreselected() {
                            return true;
                        }

                        public boolean isPreselected() {
                            return getRequiredBooleanField(1, "is_preselected");
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public String getNormalizedValue() {
                            return A0A("normalized_value");
                        }

                        public C16639Uyb getVisualStyle() {
                            return (C16639Uyb) C41847B3o.A10(this, C16639Uyb.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "visual_style", 5);
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                            return C41849B3q.A0G(r1, AnonymousClass7TE.A0g(r1));
                        }

                        public VariantValues(int i) {
                            super(i);
                        }

                        public VariantValues() {
                            super(TYPE_TAG);
                        }
                    }

                    public boolean getCanShareToStory() {
                        return getCoercedBooleanField(2, "can_share_to_story");
                    }

                    public boolean getCanViewerSeeRnr() {
                        return getCoercedBooleanField(3, "can_viewer_see_rnr");
                    }

                    public String getCompoundProductId() {
                        return getOptionalStringField(7, "compound_product_id");
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.AggregatedRating getAggregatedRating() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.AggregatedRating) A03(AggregatedRating.class, "aggregated_rating", AggregatedRating.TYPE_TAG);
                    }

                    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ArtsLabels getArtsLabels() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ArtsLabels) A02(ArtsLabels.class, "arts_labels", ArtsLabels.TYPE_TAG);
                    }

                    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties getCheckoutProperties() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CheckoutProperties) getOptionalTreeField(4, "checkout_properties", CheckoutProperties.class, CheckoutProperties.TYPE_TAG);
                    }

                    public C48109EWb getCheckoutStyle() {
                        return (C48109EWb) getOptionalEnumField(5, "checkout_style", C48109EWb.A02);
                    }

                    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CommerceReviewStatistics getCommerceReviewStatistics() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.CommerceReviewStatistics) getOptionalTreeField(6, "commerce_review_statistics", CommerceReviewStatistics.class, CommerceReviewStatistics.TYPE_TAG);
                    }

                    public String getCurrentPrice() {
                        return A0D("current_price");
                    }

                    public String getCurrentPriceAmount() {
                        return getOptionalStringField(9, "current_price_amount");
                    }

                    public String getCurrentPriceStripped() {
                        return getOptionalStringField(10, "current_price_stripped");
                    }

                    public String getDescription() {
                        return getOptionalStringField(11, DevServerEntity.COLUMN_DESCRIPTION);
                    }

                    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.DiscountInformation getDiscountInformation() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.DiscountInformation) getOptionalTreeField(12, "discount_information", DiscountInformation.class, DiscountInformation.TYPE_TAG);
                    }

                    public String getExternalUrl() {
                        return getOptionalStringField(13, "external_url");
                    }

                    public String getFullPrice() {
                        return getOptionalStringField(14, "full_price");
                    }

                    public String getFullPriceAmount() {
                        return getOptionalStringField(15, "full_price_amount");
                    }

                    public String getFullPriceStripped() {
                        return getOptionalStringField(16, "full_price_stripped");
                    }

                    public boolean getHasVariants() {
                        return getCoercedBooleanField(17, "has_variants");
                    }

                    public boolean getHasViewerSaved() {
                        return getCoercedBooleanField(18, "has_viewer_saved");
                    }

                    public boolean getIgIsProductEditableOnMobile() {
                        return getCoercedBooleanField(19, "ig_is_product_editable_on_mobile");
                    }

                    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ImageQualityMetadata getImageQualityMetadata() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ImageQualityMetadata) getOptionalTreeField(20, "image_quality_metadata", ImageQualityMetadata.class, ImageQualityMetadata.TYPE_TAG);
                    }

                    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.MainImage getMainImage() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.MainImage) getOptionalTreeField(23, "main_image", MainImage.class, MainImage.TYPE_TAG);
                    }

                    public String getMainImageId() {
                        return getOptionalStringField(24, "main_image_id");
                    }

                    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.Merchant getMerchant() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.Merchant) getOptionalTreeField(25, "merchant", Merchant.class, Merchant.TYPE_TAG);
                    }

                    public String getName() {
                        return getOptionalStringField(26, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    }

                    public String getPrice() {
                        return getOptionalStringField(27, "price");
                    }

                    public String getProductId() {
                        return getOptionalStringField(28, "product_id");
                    }

                    public String getRetailerId() {
                        return getOptionalStringField(29, "retailer_id");
                    }

                    public String getReviewStatus() {
                        return getOptionalStringField(30, "review_status");
                    }

                    public ImmutableList getRichTextDescription() {
                        return getOptionalCompactedTreeListField(31, "rich_text_description", RichTextDescription.class, RichTextDescription.TYPE_TAG);
                    }

                    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.SellerBadge getSellerBadge() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.SellerBadge) getOptionalTreeField(32, "seller_badge", SellerBadge.class, SellerBadge.TYPE_TAG);
                    }

                    public RGP getSizeCalibrationScore() {
                        return (RGP) getOptionalEnumField(33, "size_calibration_score", RGP.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                    }

                    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ThumbnailImage getThumbnailImage() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails.ThumbnailImage) getOptionalTreeField(34, "thumbnail_image", ThumbnailImage.class, ThumbnailImage.TYPE_TAG);
                    }

                    public ImmutableList getVariantValues() {
                        return getOptionalCompactedTreeListField(35, "variant_values", VariantValues.class, VariantValues.TYPE_TAG);
                    }

                    public boolean hasCanShareToStory() {
                        return hasFieldValue("can_share_to_story");
                    }

                    public boolean hasCanViewerSeeRnr() {
                        return hasFieldValue("can_viewer_see_rnr");
                    }

                    public boolean hasHasVariants() {
                        return hasFieldValue("has_variants");
                    }

                    public boolean hasHasViewerSaved() {
                        return hasFieldValue("has_viewer_saved");
                    }

                    public boolean hasIgIsProductEditableOnMobile() {
                        return hasFieldValue("ig_is_product_editable_on_mobile");
                    }

                    public boolean hasIsEnteredInDrawing() {
                        return hasFieldValue("is_entered_in_drawing");
                    }

                    public boolean hasIsInStock() {
                        return hasFieldValue("is_in_stock");
                    }

                    public boolean isEnteredInDrawing() {
                        return getCoercedBooleanField(21, "is_entered_in_drawing");
                    }

                    public boolean isInStock() {
                        return getCoercedBooleanField(22, "is_in_stock");
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4Kr[] r5 = new AnonymousClass4Kr[36];
                        AnonymousClass4Kp A0C = C41845B3m.A0C(AggregatedRating.class, "aggregated_rating", AggregatedRating.TYPE_TAG);
                        AnonymousClass4Kp A0C2 = C41845B3m.A0C(ArtsLabels.class, "arts_labels", ArtsLabels.TYPE_TAG);
                        AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                        AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "can_share_to_story");
                        AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r1, "can_viewer_see_rnr");
                        AnonymousClass4Kp A0C3 = C41845B3m.A0C(CheckoutProperties.class, "checkout_properties", CheckoutProperties.TYPE_TAG);
                        AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
                        boolean A1X = AnonymousClass7TF.A1X(new AnonymousClass4Kr[]{A0C, A0C2, A0f, A0f2, A0C3, AnonymousClass7TE.A0f(r0, "checkout_style"), C41845B3m.A0C(CommerceReviewStatistics.class, "commerce_review_statistics", CommerceReviewStatistics.TYPE_TAG), AnonymousClass7TE.A0f(r0, "compound_product_id"), AnonymousClass7TE.A0f(r0, "current_price"), AnonymousClass7TE.A0f(r0, "current_price_amount"), AnonymousClass7TE.A0f(r0, "current_price_stripped"), C41847B3o.A0U(r0), C41845B3m.A0C(DiscountInformation.class, "discount_information", DiscountInformation.TYPE_TAG), C41847B3o.A0f(r0), AnonymousClass7TE.A0f(r0, "full_price"), AnonymousClass7TE.A0f(r0, "full_price_amount"), AnonymousClass7TE.A0f(r0, "full_price_stripped"), C41847B3o.A0e(r1), C41846B3n.A0E(r1), AnonymousClass7TE.A0f(r1, "ig_is_product_editable_on_mobile"), C41845B3m.A0C(ImageQualityMetadata.class, "image_quality_metadata", ImageQualityMetadata.TYPE_TAG), AnonymousClass7TE.A0f(r1, "is_entered_in_drawing"), C41847B3o.A0W(r1), C41845B3m.A0C(MainImage.class, "main_image", MainImage.TYPE_TAG), AnonymousClass7TE.A0f(r0, "main_image_id"), C41845B3m.A0C(Merchant.class, "merchant", Merchant.TYPE_TAG), C41845B3m.A0G(r0)}, r5);
                        AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r0, "price");
                        AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r0, "product_id");
                        AnonymousClass4L7 A0f5 = AnonymousClass7TE.A0f(r0, "retailer_id");
                        AnonymousClass4L7 A0f6 = AnonymousClass7TE.A0f(r0, "review_status");
                        int i = RichTextDescription.TYPE_TAG;
                        AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A00(), RichTextDescription.class, "rich_text_description", i);
                        AnonymousClass4Kp A0C4 = C41845B3m.A0C(SellerBadge.class, "seller_badge", SellerBadge.TYPE_TAG);
                        AnonymousClass4L7 A0f7 = AnonymousClass7TE.A0f(r0, "size_calibration_score");
                        AnonymousClass4Kp A0C5 = C41845B3m.A0C(ThumbnailImage.class, "thumbnail_image", ThumbnailImage.TYPE_TAG);
                        int i2 = VariantValues.TYPE_TAG;
                        return C41846B3n.A0N(new AnonymousClass4Kr[]{A0f3, A0f4, A0f5, A0f6, A0A, A0C4, A0f7, A0C5, C41845B3m.A0A(AnonymousClass4Ks.A00(), VariantValues.class, "variant_values", i2)}, r5, A1X ? 1 : 0, 27, 9);
                    }

                    public ProductDetails(int i) {
                        super(i);
                    }

                    public ProductDetails() {
                        super(TYPE_TAG);
                    }
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails getProductDetails() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Products.ProductDetails) A03(ProductDetails.class, "product_details", ProductDetails.TYPE_TAG);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0Y(ProductDetails.class, "product_details", ProductDetails.TYPE_TAG);
                }

                public Products(int i) {
                    super(i);
                }

                public Products() {
                    super(TYPE_TAG);
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.ClipsShoppingCtaBar getClipsShoppingCtaBar() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.ClipsShoppingCtaBar) A03(ClipsShoppingCtaBar.class, "clips_shopping_cta_bar", ClipsShoppingCtaBar.TYPE_TAG);
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Merchant getMerchant() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo.Merchant) A02(Merchant.class, "merchant", Merchant.TYPE_TAG);
            }

            public ImmutableList getProducts() {
                return getOptionalCompactedTreeListField(2, "products", Products.class, Products.TYPE_TAG);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kp A0C = C41845B3m.A0C(ClipsShoppingCtaBar.class, "clips_shopping_cta_bar", ClipsShoppingCtaBar.TYPE_TAG);
                AnonymousClass4Kp A0C2 = C41845B3m.A0C(Merchant.class, "merchant", Merchant.TYPE_TAG);
                int i = Products.TYPE_TAG;
                return C41846B3n.A0K(A0C, A0C2, C41845B3m.A0A(AnonymousClass4Ks.A00(), Products.class, "products", i));
            }

            public ShoppingInfo(int i) {
                super(i);
            }

            public ShoppingInfo() {
                super(TYPE_TAG);
            }
        }

        public final class TemplateInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 50521029;

            public final class AttributionInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.AttributionInfo {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -695420975;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return AttributionInfo.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public String getOwnerUsername() {
                    return C41847B3o.A1A(this, "owner_username", 0);
                }

                public String getTemplateMediaId() {
                    return C41847B3o.A1A(this, "template_media_id", 1);
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TG.A0V(AnonymousClass7TE.A0g(r0), C41848B3p.A0H(r0), "template_media_id");
                }

                public AttributionInfo(int i) {
                    super(i);
                }

                public AttributionInfo() {
                    super(TYPE_TAG);
                }
            }

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return TemplateInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public final class EffectsInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.EffectsInfo {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -1897423163;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return EffectsInfo.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public final class SegmentEffectsInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.EffectsInfo.SegmentEffectsInfo {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 447439558;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return SegmentEffectsInfo.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public long getEffectId() {
                        return getRequiredTimeField(0, "effect_id");
                    }

                    public int getSegmentIndex() {
                        return getRequiredIntField(1, "segment_index");
                    }

                    public boolean hasEffectId() {
                        return true;
                    }

                    public boolean hasSegmentIndex() {
                        return true;
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public SegmentEffectsInfo(int i) {
                        super(i);
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0V(C41845B3m.A0R(), AnonymousClass7TE.A0f(C41845B3m.A0Q(), "effect_id"), "segment_index");
                    }

                    public SegmentEffectsInfo() {
                        super(TYPE_TAG);
                    }
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public ImmutableList getSegmentEffectsInfo() {
                    return getOptionalCompactedTreeListField(0, "segment_effects_info", SegmentEffectsInfo.class, SegmentEffectsInfo.TYPE_TAG);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    int i = SegmentEffectsInfo.TYPE_TAG;
                    return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), SegmentEffectsInfo.class, "segment_effects_info", i);
                }

                public EffectsInfo(int i) {
                    super(i);
                }

                public EffectsInfo() {
                    super(TYPE_TAG);
                }
            }

            public final class SegmentsInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.SegmentsInfo {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -1965321405;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return SegmentsInfo.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public long getDurationInMs() {
                    return getRequiredTimeField(0, "duration_in_ms");
                }

                public int getReusableTemplateMediaAssetEndTimeMs() {
                    return getCoercedIntField(1, "reusable_template_media_asset_end_time_ms");
                }

                public boolean hasDurationInMs() {
                    return true;
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public int getReusableTemplateMediaAssetStartTimeMs() {
                    return A00("reusable_template_media_asset_start_time_ms");
                }

                public boolean hasReusableTemplateMediaAssetEndTimeMs() {
                    return hasFieldValue("reusable_template_media_asset_end_time_ms");
                }

                public boolean hasReusableTemplateMediaAssetStartTimeMs() {
                    return hasFieldValue("reusable_template_media_asset_start_time_ms");
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4L7 A0g = C41848B3p.A0g(AnonymousClass69U.A00);
                    AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
                    return AnonymousClass7TG.A0U(r2, A0g, AnonymousClass7TE.A0f(r2, "reusable_template_media_asset_end_time_ms"), "reusable_template_media_asset_start_time_ms");
                }

                public SegmentsInfo(int i) {
                    super(i);
                }

                public SegmentsInfo() {
                    super(TYPE_TAG);
                }
            }

            public final class TimedTextsInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -502198144;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return TimedTextsInfo.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public final class TextInfoList extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -1427806528;

                    public final class Colors extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo.TextInfoList.Colors {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -156043867;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return Colors.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public int getCount() {
                            return getRequiredIntField(0, "count");
                        }

                        public String getHexRgbaColor() {
                            return C41847B3o.A1A(this, "hex_rgba_color", 1);
                        }

                        public boolean hasCount() {
                            return true;
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public Colors(int i) {
                            super(i);
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0V(C41845B3m.A0P(), AnonymousClass7TE.A0f(C41845B3m.A0R(), "count"), "hex_rgba_color");
                        }

                        public Colors() {
                            super(TYPE_TAG);
                        }
                    }

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return TextInfoList.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public double getEndTimeMs() {
                        return getRequiredDoubleField(2, "end_time_ms");
                    }

                    public double getFontSize() {
                        return getRequiredDoubleField(3, "font_size");
                    }

                    public double getHeight() {
                        return getRequiredDoubleField(4, IgReactMediaPickerNativeModule.HEIGHT);
                    }

                    public String getId() {
                        return C41847B3o.A1A(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, 5);
                    }

                    public double getOffsetX() {
                        return getRequiredDoubleField(7, "offset_x");
                    }

                    public boolean hasEndTimeMs() {
                        return true;
                    }

                    public boolean hasFontSize() {
                        return true;
                    }

                    public boolean hasHeight() {
                        return true;
                    }

                    public boolean hasIsAnimated() {
                        return true;
                    }

                    public boolean hasOffsetX() {
                        return true;
                    }

                    public boolean hasOffsetY() {
                        return true;
                    }

                    public boolean hasRotationDegree() {
                        return true;
                    }

                    public boolean hasScale() {
                        return true;
                    }

                    public boolean hasStartTimeMs() {
                        return true;
                    }

                    public boolean hasWidth() {
                        return true;
                    }

                    public boolean hasZIndex() {
                        return true;
                    }

                    public int isAnimated() {
                        return getRequiredIntField(6, "is_animated");
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public C16635UyV getAlignment() {
                        return (C16635UyV) C41847B3o.A10(this, C16635UyV.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "alignment", 0);
                    }

                    public ImmutableList getColors() {
                        return getRequiredCompactedTreeListField(1, "colors", Colors.class, Colors.TYPE_TAG);
                    }

                    public double getOffsetY() {
                        return getRequiredDoubleField(8, "offset_y");
                    }

                    public double getRotationDegree() {
                        return getRequiredDoubleField(9, "rotation_degree");
                    }

                    public double getScale() {
                        return getRequiredDoubleField(10, "scale");
                    }

                    public double getStartTimeMs() {
                        return getRequiredDoubleField(11, "start_time_ms");
                    }

                    public String getText() {
                        return C41847B3o.A1A(this, "text", 12);
                    }

                    public C391299sf getTextEmphasisMode() {
                        return (C391299sf) C41847B3o.A10(this, C391299sf.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "text_emphasis_mode", 13);
                    }

                    public C391419sx getTextFormatType() {
                        return (C391419sx) C41847B3o.A10(this, C391419sx.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "text_format_type", 14);
                    }

                    public double getWidth() {
                        return getRequiredDoubleField(15, IgReactMediaPickerNativeModule.WIDTH);
                    }

                    public int getZIndex() {
                        return getRequiredIntField(16, "z_index");
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
                        AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r4), "alignment");
                        int i = Colors.TYPE_TAG;
                        AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A02(), Colors.class, "colors", i);
                        C342787pA r3 = C342787pA.A00;
                        AnonymousClass4L7 A0V = C41847B3o.A0V(AnonymousClass7TE.A0g(r3));
                        AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r3), "font_size");
                        AnonymousClass4L7 A0P = C41848B3p.A0P(r3);
                        AnonymousClass4L7 A09 = C41846B3n.A09(r4);
                        AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
                        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0A, A0V, A0f2, A0P, A09, AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "is_animated"), C41848B3p.A0S(r3), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r3), "offset_y"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r3), "rotation_degree"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r3), "scale"), C41847B3o.A0G(AnonymousClass7TE.A0g(r3)), C41846B3n.A0A(r4), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r4), "text_emphasis_mode"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r4), "text_format_type"), C41845B3m.A0J(AnonymousClass7TE.A0g(r3)), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "z_index")});
                    }

                    public TextInfoList(int i) {
                        super(i);
                    }

                    public TextInfoList() {
                        super(TYPE_TAG);
                    }
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public ImmutableList getTextInfoList() {
                    return A06(TextInfoList.class, "text_info_list", TextInfoList.TYPE_TAG);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    int i = TextInfoList.TYPE_TAG;
                    return AnonymousClass7TG.A0T(AnonymousClass4Ks.A02(), TextInfoList.class, "text_info_list", i);
                }

                public TimedTextsInfo(int i) {
                    super(i);
                }

                public TimedTextsInfo() {
                    super(TYPE_TAG);
                }
            }

            public final class TransitionEffectsInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TransitionEffectsInfo {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -71381185;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return TransitionEffectsInfo.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public long getDurationInMs() {
                    return getRequiredTimeField(0, "duration_in_ms");
                }

                public int getIndex() {
                    return getCoercedIntField(1, "index");
                }

                public String getName() {
                    return C41847B3o.A1A(this, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, 2);
                }

                public long getStartTimeInMs() {
                    return getRequiredTimeField(3, "start_time_in_ms");
                }

                public boolean hasDurationInMs() {
                    return true;
                }

                public boolean hasStartTimeInMs() {
                    return true;
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public boolean hasIndex() {
                    return hasFieldValue("index");
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass69U r5 = AnonymousClass69U.A00;
                    return C41847B3o.A0j(AnonymousClass7TE.A0g(r5), C41848B3p.A0g(r5), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "index"), C41846B3n.A0C(AnonymousClass4Kz.A00), "start_time_in_ms");
                }

                public TransitionEffectsInfo(int i) {
                    super(i);
                }

                public TransitionEffectsInfo() {
                    super(TYPE_TAG);
                }
            }

            public long getTemplateClipsMediaId() {
                return getRequiredTimeField(4, "template_clips_media_id");
            }

            public boolean hasTemplateClipsMediaId() {
                return true;
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.AttributionInfo getAttributionInfo() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.AttributionInfo) A03(AttributionInfo.class, "attribution_info", AttributionInfo.TYPE_TAG);
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.EffectsInfo getEffectsInfo() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.EffectsInfo) A02(EffectsInfo.class, "effects_info", EffectsInfo.TYPE_TAG);
            }

            public int getMinNumSegments() {
                return A00("min_num_segments");
            }

            public ImmutableList getSegmentsInfo() {
                return getRequiredCompactedTreeListField(3, "segments_info", SegmentsInfo.class, SegmentsInfo.TYPE_TAG);
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo getTimedTextsInfo() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo.TimedTextsInfo) getOptionalTreeField(5, "timed_texts_info", TimedTextsInfo.class, TimedTextsInfo.TYPE_TAG);
            }

            public ImmutableList getTransitionEffectsInfo() {
                return getOptionalCompactedTreeListField(6, "transition_effects_info", TransitionEffectsInfo.class, TransitionEffectsInfo.TYPE_TAG);
            }

            public boolean hasMinNumSegments() {
                return hasFieldValue("min_num_segments");
            }

            public AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kp A0C = C41845B3m.A0C(AttributionInfo.class, "attribution_info", AttributionInfo.TYPE_TAG);
                AnonymousClass4Kp A0C2 = C41845B3m.A0C(EffectsInfo.class, "effects_info", EffectsInfo.TYPE_TAG);
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "min_num_segments");
                int i = SegmentsInfo.TYPE_TAG;
                AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A02(), SegmentsInfo.class, "segments_info", i);
                AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(C41845B3m.A0Q(), "template_clips_media_id");
                AnonymousClass4Kp A0C3 = C41845B3m.A0C(TimedTextsInfo.class, "timed_texts_info", TimedTextsInfo.TYPE_TAG);
                int i2 = TransitionEffectsInfo.TYPE_TAG;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0C, A0C2, A0f, A0A, A0f2, A0C3, C41845B3m.A0A(AnonymousClass4Ks.A00(), TransitionEffectsInfo.class, "transition_effects_info", i2)});
            }

            public TemplateInfo(int i) {
                super(i);
            }

            public TemplateInfo() {
                super(TYPE_TAG);
            }
        }

        public String getClipsCreationEntryPoint() {
            return getOptionalStringField(6, "clips_creation_entry_point");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AchievementsInfo getAchievementsInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AchievementsInfo) A03(AchievementsInfo.class, "achievements_info", AchievementsInfo.TYPE_TAG);
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AdditionalAudioInfo getAdditionalAudioInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AdditionalAudioInfo) A02(AdditionalAudioInfo.class, "additional_audio_info", AdditionalAudioInfo.TYPE_TAG);
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AssetRecommendationInfo getAssetRecommendationInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AssetRecommendationInfo) A04(AssetRecommendationInfo.class, "asset_recommendation_info", AssetRecommendationInfo.TYPE_TAG);
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AudioRankingInfo getAudioRankingInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.AudioRankingInfo) getOptionalTreeField(3, "audio_ranking_info", AudioRankingInfo.class, AudioRankingInfo.TYPE_TAG);
        }

        public UyX getAudioType() {
            return (UyX) getOptionalEnumField(4, "audio_type", UyX.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.BrandedContentTagInfo getBrandedContentTagInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.BrandedContentTagInfo) getOptionalTreeField(5, "branded_content_tag_info", BrandedContentTagInfo.class, BrandedContentTagInfo.TYPE_TAG);
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo getContentAppreciationInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContentAppreciationInfo) getOptionalTreeField(7, "content_appreciation_info", ContentAppreciationInfo.class, ContentAppreciationInfo.TYPE_TAG);
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContextualHighlightInfo getContextualHighlightInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ContextualHighlightInfo) getOptionalTreeField(8, "contextual_highlight_info", ContextualHighlightInfo.class, ContextualHighlightInfo.TYPE_TAG);
        }

        public boolean getDisableUseInClipsClientCache() {
            return getCoercedBooleanField(9, "disable_use_in_clips_client_cache");
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo getMashupInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MashupInfo) getOptionalTreeField(13, "mashup_info", MashupInfo.class, MashupInfo.TYPE_TAG);
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MerchandisingPillInfo getMerchandisingPillInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MerchandisingPillInfo) getOptionalTreeField(14, "merchandising_pill_info", MerchandisingPillInfo.class, MerchandisingPillInfo.TYPE_TAG);
        }

        public String getMusicCanonicalId() {
            return getOptionalStringField(15, "music_canonical_id");
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo getMusicInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.MusicInfo) getOptionalTreeField(16, "music_info", MusicInfo.class, MusicInfo.TYPE_TAG);
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo getOriginalSoundInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.OriginalSoundInfo) getOptionalTreeField(17, "original_sound_info", OriginalSoundInfo.class, OriginalSoundInfo.TYPE_TAG);
        }

        public int getProfessionalClipsUpsellType() {
            return getCoercedIntField(18, "professional_clips_upsell_type");
        }

        public String getReusableTextAttributeString() {
            return getOptionalStringField(19, "reusable_text_attribute_string");
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo getShoppingInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.ShoppingInfo) getOptionalTreeField(20, "shopping_info", ShoppingInfo.class, ShoppingInfo.TYPE_TAG);
        }

        public boolean getShowAchievements() {
            return getCoercedBooleanField(21, "show_achievements");
        }

        public boolean getShowTips() {
            return getCoercedBooleanField(22, "show_tips");
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo getTemplateInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata.TemplateInfo) getOptionalTreeField(23, "template_info", TemplateInfo.class, TemplateInfo.TYPE_TAG);
        }

        public boolean hasDisableUseInClipsClientCache() {
            return hasFieldValue("disable_use_in_clips_client_cache");
        }

        public boolean hasIsFanClubPromoVideo() {
            return hasFieldValue("is_fan_club_promo_video");
        }

        public boolean hasIsPublicChatWelcomeVideo() {
            return hasFieldValue("is_public_chat_welcome_video");
        }

        public boolean hasIsSharedToFb() {
            return hasFieldValue("is_shared_to_fb");
        }

        public boolean hasProfessionalClipsUpsellType() {
            return hasFieldValue("professional_clips_upsell_type");
        }

        public boolean hasShowAchievements() {
            return hasFieldValue("show_achievements");
        }

        public boolean hasShowTips() {
            return hasFieldValue("show_tips");
        }

        public boolean isFanClubPromoVideo() {
            return getCoercedBooleanField(10, "is_fan_club_promo_video");
        }

        public boolean isPublicChatWelcomeVideo() {
            return getCoercedBooleanField(11, "is_public_chat_welcome_video");
        }

        public boolean isSharedToFb() {
            return getCoercedBooleanField(12, "is_shared_to_fb");
        }

        public AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kp A0C = C41845B3m.A0C(AchievementsInfo.class, "achievements_info", AchievementsInfo.TYPE_TAG);
            AnonymousClass4Kp A0C2 = C41845B3m.A0C(AdditionalAudioInfo.class, "additional_audio_info", AdditionalAudioInfo.TYPE_TAG);
            AnonymousClass4Kp A0C3 = C41845B3m.A0C(AssetRecommendationInfo.class, "asset_recommendation_info", AssetRecommendationInfo.TYPE_TAG);
            AnonymousClass4Kp A0C4 = C41845B3m.A0C(AudioRankingInfo.class, "audio_ranking_info", AudioRankingInfo.TYPE_TAG);
            AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
            AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "audio_type");
            AnonymousClass4Kp A0C5 = C41845B3m.A0C(BrandedContentTagInfo.class, "branded_content_tag_info", BrandedContentTagInfo.TYPE_TAG);
            AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r1, "clips_creation_entry_point");
            AnonymousClass4Kp A0C6 = C41845B3m.A0C(ContentAppreciationInfo.class, "content_appreciation_info", ContentAppreciationInfo.TYPE_TAG);
            AnonymousClass4Kp A0C7 = C41845B3m.A0C(ContextualHighlightInfo.class, "contextual_highlight_info", ContextualHighlightInfo.TYPE_TAG);
            AnonymousClass4LF r0 = AnonymousClass4LF.A00;
            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0C, A0C2, A0C3, A0C4, A0f, A0C5, A0f2, A0C6, A0C7, AnonymousClass7TE.A0f(r0, "disable_use_in_clips_client_cache"), AnonymousClass7TE.A0f(r0, "is_fan_club_promo_video"), AnonymousClass7TE.A0f(r0, "is_public_chat_welcome_video"), AnonymousClass7TE.A0f(r0, "is_shared_to_fb"), C41845B3m.A0C(MashupInfo.class, "mashup_info", MashupInfo.TYPE_TAG), C41845B3m.A0C(MerchandisingPillInfo.class, "merchandising_pill_info", MerchandisingPillInfo.TYPE_TAG), AnonymousClass7TE.A0f(r1, "music_canonical_id"), C41845B3m.A0C(MusicInfo.class, "music_info", MusicInfo.TYPE_TAG), C41845B3m.A0C(OriginalSoundInfo.class, "original_sound_info", OriginalSoundInfo.TYPE_TAG), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "professional_clips_upsell_type"), AnonymousClass7TE.A0f(r1, "reusable_text_attribute_string"), C41845B3m.A0C(ShoppingInfo.class, "shopping_info", ShoppingInfo.TYPE_TAG), AnonymousClass7TE.A0f(r0, "show_achievements"), AnonymousClass7TE.A0f(r0, "show_tips"), C41845B3m.A0C(TemplateInfo.class, "template_info", TemplateInfo.TYPE_TAG)});
        }

        public ClipsMetadata(int i) {
            super(i);
        }

        public ClipsMetadata() {
            super(TYPE_TAG);
        }
    }

    public final class CoauthorProducers extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.CoauthorProducers {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -1985484072;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return CoauthorProducers.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public boolean getHasOnboardedToTextPostApp() {
            return getCoercedBooleanField(1, "has_onboarded_to_text_post_app");
        }

        public String getPkId() {
            return getOptionalStringField(6, "pk_id");
        }

        public String getProfilePicId() {
            return getOptionalStringField(7, "profile_pic_id");
        }

        public boolean isPrivate() {
            return getCoercedBooleanField(3, "is_private");
        }

        public boolean isVerified() {
            return C41847B3o.A1b(this, 4);
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public String getFullName() {
            return A07("full_name");
        }

        public String getId() {
            return A09("strong_id__");
        }

        public String getPk() {
            return A0C("pk");
        }

        public String getProfilePicUrl() {
            return A0D("profile_pic_url");
        }

        public String getUsername() {
            return C41847B3o.A19(this, 9);
        }

        public boolean hasHasOnboardedToTextPostApp() {
            return hasFieldValue("has_onboarded_to_text_post_app");
        }

        public boolean hasIsPrivate() {
            return hasFieldValue("is_private");
        }

        public CoauthorProducers(int i) {
            super(i);
        }

        public boolean hasIsVerified() {
            return C41847B3o.A1a(this);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            return C41849B3q.A02();
        }

        public CoauthorProducers() {
            super(TYPE_TAG);
        }
    }

    public final class CommentInformTreatment extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.CommentInformTreatment {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1520671882;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return CommentInformTreatment.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public boolean getShouldHaveInformTreatment() {
            return getRequiredBooleanField(0, "should_have_inform_treatment");
        }

        public String getText() {
            return C41847B3o.A1A(this, "text", 1);
        }

        public boolean hasShouldHaveInformTreatment() {
            return true;
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public CommentInformTreatment(int i) {
            super(i);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0V(C41845B3m.A0P(), AnonymousClass7TE.A0f(C41846B3n.A0J(), "should_have_inform_treatment"), "text");
        }

        public CommentInformTreatment() {
            super(TYPE_TAG);
        }
    }

    public final class Companion {
        public static /* synthetic */ void getTYPE_TAG$annotations() {
        }

        public final int getTYPE_TAG() {
            return CreatorInspirationSignalsPlaygroundClipsMediaImpl.TYPE_TAG;
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        public Companion() {
        }
    }

    public final class CreativeConfig extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1648337249;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return CreativeConfig.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final class CreationToolInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.CreationToolInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 1546691690;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return CreationToolInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public int getAppearanceEffect() {
                return getRequiredIntField(0, "appearance_effect");
            }

            public int getCameraTool() {
                return getRequiredIntField(1, "camera_tool");
            }

            public String getColorFilters() {
                return C41847B3o.A1A(this, "color_filters", 2);
            }

            public double getDurationSelectorSeconds() {
                return getCoercedDoubleField(3, "duration_selector_seconds");
            }

            public double getSpeedSelector() {
                return getCoercedDoubleField(4, "speed_selector");
            }

            public double getTimerSelectorSeconds() {
                return getCoercedDoubleField(5, "timer_selector_seconds");
            }

            public boolean hasAppearanceEffect() {
                return true;
            }

            public boolean hasCameraTool() {
                return true;
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public boolean hasDurationSelectorSeconds() {
                return hasFieldValue("duration_selector_seconds");
            }

            public boolean hasSpeedSelector() {
                return hasFieldValue("speed_selector");
            }

            public boolean hasTimerSelectorSeconds() {
                return hasFieldValue("timer_selector_seconds");
            }

            public CreationToolInfo(int i) {
                super(i);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                return C41849B3q.A0C();
            }

            public CreationToolInfo() {
                super(TYPE_TAG);
            }
        }

        public final class EffectConfigs extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 81273071;

            public final class AttributionUser extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs.AttributionUser {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 1102210384;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return AttributionUser.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public final class ProfilePicture extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs.AttributionUser.ProfilePicture {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 250896392;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return ProfilePicture.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public String getUri() {
                        return A07("uri");
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0W(AnonymousClass4Kz.A00, "uri");
                    }

                    public ProfilePicture(int i) {
                        super(i);
                    }

                    public ProfilePicture() {
                        super(TYPE_TAG);
                    }
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public String getInstagramUserId() {
                    return A07("instagram_user_id");
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs.AttributionUser.ProfilePicture getProfilePicture() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs.AttributionUser.ProfilePicture) A02(ProfilePicture.class, "profile_picture", ProfilePicture.TYPE_TAG);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TG.A0U(r4, AnonymousClass7TE.A0f(r4, "instagram_user_id"), C41845B3m.A0C(ProfilePicture.class, "profile_picture", ProfilePicture.TYPE_TAG), AnonymousClass9PN.A00());
                }

                public AttributionUser(int i) {
                    super(i);
                }

                public String getUsername() {
                    return A09(AnonymousClass9PN.A00());
                }

                public AttributionUser() {
                    super(TYPE_TAG);
                }
            }

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return EffectConfigs.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public final class ThumbnailImage extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs.ThumbnailImage {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -298164445;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return ThumbnailImage.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public String getUri() {
                    return A07("uri");
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0W(AnonymousClass4Kz.A00, "uri");
                }

                public ThumbnailImage(int i) {
                    super(i);
                }

                public ThumbnailImage() {
                    super(TYPE_TAG);
                }
            }

            public String getId() {
                return C41847B3o.A1A(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, 4);
            }

            public String getName() {
                return C41847B3o.A1A(this, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, 6);
            }

            public String getSaveStatus() {
                return C41847B3o.A1A(this, "save_status", 7);
            }

            public boolean isAgeRestricted() {
                return getCoercedBooleanField(5, "is_age_restricted");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs.AttributionUser getAttributionUser() {
                C250663lr A05 = A05(AttributionUser.class, "attribution_user", AttributionUser.TYPE_TAG);
                0qQ.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.CreativeConfig.EffectConfigs.AttributionUser");
                return (AttributionUser) A05;
            }

            public String getEffectId() {
                return A08("effect_id");
            }

            public String getFailureCode() {
                return A09("failure_code");
            }

            public String getFailureReason() {
                return A0A(TraceFieldType.FailureReason);
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs.ThumbnailImage getThumbnailImage() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig.EffectConfigs.ThumbnailImage) getOptionalTreeField(8, "thumbnail_image", ThumbnailImage.class, ThumbnailImage.TYPE_TAG);
            }

            public String getTitle() {
                return getOptionalStringField(9, DialogModule.KEY_TITLE);
            }

            public boolean hasIsAgeRestricted() {
                return hasFieldValue("is_age_restricted");
            }

            public AnonymousClass4Kx modelSelectionSet() {
                int i = AttributionUser.TYPE_TAG;
                AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A01(), AttributionUser.class, "attribution_user", i);
                AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0A, AnonymousClass7TE.A0f(r3, "effect_id"), AnonymousClass7TE.A0f(r3, "failure_code"), AnonymousClass7TE.A0f(r3, TraceFieldType.FailureReason), C41846B3n.A09(r3), AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "is_age_restricted"), C41846B3n.A0C(r3), C41848B3p.A0L(r3), C41845B3m.A0C(ThumbnailImage.class, "thumbnail_image", ThumbnailImage.TYPE_TAG), C41845B3m.A0I(r3)});
            }

            public EffectConfigs(int i) {
                super(i);
            }

            public EffectConfigs() {
                super(TYPE_TAG);
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public String getCaptureType() {
            return A07("capture_type");
        }

        public ImmutableList getCreationToolInfo() {
            return getOptionalCompactedTreeListField(1, "creation_tool_info", CreationToolInfo.class, CreationToolInfo.TYPE_TAG);
        }

        public ImmutableList getEffectConfigs() {
            return getOptionalCompactedTreeListField(2, "effect_configs", EffectConfigs.class, EffectConfigs.TYPE_TAG);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(AnonymousClass4Kz.A00, "capture_type");
            int i = CreationToolInfo.TYPE_TAG;
            AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A00(), CreationToolInfo.class, "creation_tool_info", i);
            int i2 = EffectConfigs.TYPE_TAG;
            return C41846B3n.A0K(A0f, A0A, C41845B3m.A0A(AnonymousClass4Ks.A00(), EffectConfigs.class, "effect_configs", i2));
        }

        public CreativeConfig(int i) {
            super(i);
        }

        public CreativeConfig() {
            super(TYPE_TAG);
        }
    }

    public final class FacepileTopLikers extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.FacepileTopLikers {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -1163259431;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return FacepileTopLikers.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public String getProfilePicId() {
            return getOptionalStringField(6, "profile_pic_id");
        }

        public String getProfilePicUrl() {
            return getOptionalStringField(7, "profile_pic_url");
        }

        public boolean isPrivate() {
            return getCoercedBooleanField(2, "is_private");
        }

        public boolean isVerified() {
            return C41847B3o.A1b(this, 3);
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public String getFullName() {
            return A07("full_name");
        }

        public String getId() {
            return A08("strong_id__");
        }

        public String getPk() {
            return A0B("pk");
        }

        public String getPkId() {
            return A0C("pk_id");
        }

        public boolean hasIsPrivate() {
            return hasFieldValue("is_private");
        }

        public FacepileTopLikers(int i) {
            super(i);
        }

        public String getUsername() {
            return A0D(AnonymousClass9PN.A00());
        }

        public boolean hasIsVerified() {
            return C41847B3o.A1a(this);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            return C41849B3q.A0A();
        }

        public FacepileTopLikers() {
            super(TYPE_TAG);
        }
    }

    public final class FundraiserTag extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -1902318741;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return FundraiserTag.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public boolean getCanViewerDonate() {
            return getCoercedBooleanField(2, "can_viewer_donate");
        }

        public boolean getCanViewerRemoveFundraiserTag() {
            return getCoercedBooleanField(3, "can_viewer_remove_fundraiser_tag");
        }

        public String getFormattedFundraiserProgressInfoText() {
            return getOptionalStringField(6, "formatted_fundraiser_progress_info_text");
        }

        public String getFormattedGoalAmount() {
            return getOptionalStringField(7, "formatted_goal_amount");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public String getBeneficiaryName() {
            return A07("beneficiary_name");
        }

        public String getBeneficiaryUsername() {
            return A08("beneficiary_username");
        }

        public String getContextualTitleStr() {
            return A0B("contextual_title_str");
        }

        public String getFormattedAmountRaised() {
            return A0C("formatted_amount_raised");
        }

        public String getFundraiserId() {
            return A0D("fundraiser_id");
        }

        public String getFundraiserOwnerUsername() {
            return getOptionalStringField(9, "fundraiser_owner_username");
        }

        public String getFundraiserTitle() {
            return getOptionalStringField(10, "fundraiser_title");
        }

        public XRK getFundraiserType() {
            return (XRK) getOptionalEnumField(11, "fundraiser_type", XRK.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        }

        public String getProgressStr() {
            return getOptionalStringField(13, "progress_str");
        }

        public boolean getShowFundraiserOwnerAttribution() {
            return getCoercedBooleanField(14, "show_fundraiser_owner_attribution");
        }

        public String getThumbnailDisplayUrl() {
            return getOptionalStringField(15, "thumbnail_display_url");
        }

        public boolean hasCanViewerDonate() {
            return hasFieldValue("can_viewer_donate");
        }

        public boolean hasCanViewerRemoveFundraiserTag() {
            return hasFieldValue("can_viewer_remove_fundraiser_tag");
        }

        public boolean hasIsMediaOwnerFundraiserOwner() {
            return hasFieldValue("is_media_owner_fundraiser_owner");
        }

        public boolean hasShowFundraiserOwnerAttribution() {
            return hasFieldValue("show_fundraiser_owner_attribution");
        }

        public boolean isMediaOwnerFundraiserOwner() {
            return getCoercedBooleanField(12, "is_media_owner_fundraiser_owner");
        }

        public AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
            AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r0, "beneficiary_name");
            AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r0, "beneficiary_username");
            AnonymousClass4LF r1 = AnonymousClass4LF.A00;
            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, AnonymousClass7TE.A0f(r1, "can_viewer_donate"), AnonymousClass7TE.A0f(r1, "can_viewer_remove_fundraiser_tag"), AnonymousClass7TE.A0f(r0, "contextual_title_str"), AnonymousClass7TE.A0f(r0, "formatted_amount_raised"), AnonymousClass7TE.A0f(r0, "formatted_fundraiser_progress_info_text"), AnonymousClass7TE.A0f(r0, "formatted_goal_amount"), AnonymousClass7TE.A0f(r0, "fundraiser_id"), AnonymousClass7TE.A0f(r0, "fundraiser_owner_username"), AnonymousClass7TE.A0f(r0, "fundraiser_title"), AnonymousClass7TE.A0f(r0, "fundraiser_type"), AnonymousClass7TE.A0f(r1, "is_media_owner_fundraiser_owner"), AnonymousClass7TE.A0f(r0, "progress_str"), AnonymousClass7TE.A0f(r1, "show_fundraiser_owner_attribution"), AnonymousClass7TE.A0f(r0, "thumbnail_display_url")});
        }

        public FundraiserTag(int i) {
            super(i);
        }

        public FundraiserTag() {
            super(TYPE_TAG);
        }
    }

    public final class IgtvSeriesInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvSeriesInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1712175069;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return IgtvSeriesInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public boolean getHasCoverPhoto() {
            return getRequiredBooleanField(0, "has_cover_photo");
        }

        public String getId() {
            return C41847B3o.A1A(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, 1);
        }

        public int getNumEpisodes() {
            return getRequiredIntField(2, "num_episodes");
        }

        public String getTitle() {
            return C41847B3o.A1A(this, DialogModule.KEY_TITLE, 3);
        }

        public boolean hasHasCoverPhoto() {
            return true;
        }

        public boolean hasNumEpisodes() {
            return true;
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public IgtvSeriesInfo(int i) {
            super(i);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(C41846B3n.A0J(), "has_cover_photo");
            AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
            return C41847B3o.A0j(AnonymousClass7TE.A0g(r4), A0f, C41846B3n.A09(r4), AnonymousClass7TE.A0f(C41845B3m.A0R(), "num_episodes"), DialogModule.KEY_TITLE);
        }

        public IgtvSeriesInfo() {
            super(TYPE_TAG);
        }
    }

    public final class IgtvShoppingInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1621764238;

        public final class ClipsShoppingCtaBar extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.ClipsShoppingCtaBar {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 1534300329;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return ClipsShoppingCtaBar.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public double getAnimationTimeSec() {
                return getCoercedDoubleField(0, "animation_time_sec");
            }

            public int getDwellTimeSec() {
                return getCoercedIntField(4, "dwell_time_sec");
            }

            public String getToggledDestination() {
                return getOptionalStringField(6, "toggled_destination");
            }

            public String getToggledTitle() {
                return getOptionalStringField(7, "toggled_title");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public String getCtaBarType() {
                return A08("cta_bar_type");
            }

            public String getDestination() {
                return A09("destination");
            }

            public String getDominantColor() {
                return A0A("dominant_color");
            }

            public String getTitle() {
                return A0C(DialogModule.KEY_TITLE);
            }

            public boolean hasAnimationTimeSec() {
                return hasFieldValue("animation_time_sec");
            }

            public boolean hasDwellTimeSec() {
                return hasFieldValue("dwell_time_sec");
            }

            public ClipsShoppingCtaBar(int i) {
                super(i);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                return C41849B3q.A01();
            }

            public ClipsShoppingCtaBar() {
                super(TYPE_TAG);
            }
        }

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return IgtvShoppingInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final class Merchant extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Merchant {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 320826530;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return Merchant.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public boolean getDisabledSharingProductsToGuides() {
                return getCoercedBooleanField(0, "disabled_sharing_products_to_guides");
            }

            public boolean isVerified() {
                return C41847B3o.A1b(this, 2);
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public String getId() {
                return A08("strong_id__");
            }

            public String getPk() {
                return A0A("pk");
            }

            public String getProfilePicUrl() {
                return A0B("profile_pic_url");
            }

            public boolean hasDisabledSharingProductsToGuides() {
                return hasFieldValue("disabled_sharing_products_to_guides");
            }

            public Merchant(int i) {
                super(i);
            }

            public String getUsername() {
                return A0C(AnonymousClass9PN.A00());
            }

            public boolean hasIsVerified() {
                return C41847B3o.A1a(this);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                return C41849B3q.A04();
            }

            public Merchant() {
                super(TYPE_TAG);
            }
        }

        public final class Products extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -1787573575;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return Products.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public final class ProductDetails extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -1359139002;

                public final class AggregatedRating extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.AggregatedRating {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -1885043071;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return AggregatedRating.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public int getRatingCount() {
                        return getCoercedIntField(0, "rating_count");
                    }

                    public double getValue() {
                        return getCoercedDoubleField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public boolean hasRatingCount() {
                        return hasFieldValue("rating_count");
                    }

                    public boolean hasValue() {
                        return hasFieldValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                    }

                    public AggregatedRating(int i) {
                        super(i);
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0V(C342787pA.A00, C41847B3o.A06(), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                    }

                    public AggregatedRating() {
                        super(TYPE_TAG);
                    }
                }

                public final class ArtsLabels extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ArtsLabels {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -1592089914;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return ArtsLabels.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public final class Labels extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ArtsLabels.Labels {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 1529944581;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return Labels.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public String getLabelDisplayValue() {
                            return A07("label_display_value");
                        }

                        public String getLabelType() {
                            return A08("label_type");
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                            return AnonymousClass7TG.A0V(r2, AnonymousClass7TE.A0f(r2, "label_display_value"), "label_type");
                        }

                        public Labels(int i) {
                            super(i);
                        }

                        public Labels() {
                            super(TYPE_TAG);
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public ImmutableList getLabels() {
                        return getOptionalCompactedTreeListField(0, "labels", Labels.class, Labels.TYPE_TAG);
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        int i = Labels.TYPE_TAG;
                        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Labels.class, "labels", i);
                    }

                    public ArtsLabels(int i) {
                        super(i);
                    }

                    public ArtsLabels() {
                        super(TYPE_TAG);
                    }
                }

                public final class CheckoutProperties extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -2088610911;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return CheckoutProperties.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public final class CurrencyAmount extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.CurrencyAmount {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -204789975;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return CurrencyAmount.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public String getAmount() {
                            return A07("amount");
                        }

                        public String getAmountWithOffset() {
                            return A08("amount_with_offset");
                        }

                        public String getCurrency() {
                            return A09("currency");
                        }

                        public boolean hasOffset() {
                            return hasFieldValue("offset");
                        }

                        public CurrencyAmount(int i) {
                            super(i);
                        }

                        public int getOffset() {
                            return C41847B3o.A02(this);
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            return C41848B3p.A0v();
                        }

                        public CurrencyAmount() {
                            super(TYPE_TAG);
                        }
                    }

                    public final class ShippingAndReturn extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 864452211;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return ShippingAndReturn.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public final class ShippingCost extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ShippingCost {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -1312496822;

                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return ShippingCost.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            public String getAmount() {
                                return A07("amount");
                            }

                            public String getAmountWithOffset() {
                                return A08("amount_with_offset");
                            }

                            public String getCurrency() {
                                return A09("currency");
                            }

                            public boolean hasOffset() {
                                return hasFieldValue("offset");
                            }

                            public ShippingCost(int i) {
                                super(i);
                            }

                            public int getOffset() {
                                return C41847B3o.A02(this);
                            }

                            public AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A0v();
                            }

                            public ShippingCost() {
                                super(TYPE_TAG);
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ShippingCost getShippingCost() {
                            return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn.ShippingCost) A03(ShippingCost.class, "shipping_cost", ShippingCost.TYPE_TAG);
                        }

                        public String getShippingCostStripped() {
                            return A08("shipping_cost_stripped");
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0V(AnonymousClass4Kz.A00, C41845B3m.A0C(ShippingCost.class, "shipping_cost", ShippingCost.TYPE_TAG), "shipping_cost_stripped");
                        }

                        public ShippingAndReturn(int i) {
                            super(i);
                        }

                        public ShippingAndReturn() {
                            super(TYPE_TAG);
                        }
                    }

                    public boolean getCanAddToBag() {
                        return getCoercedBooleanField(0, "can_add_to_bag");
                    }

                    public boolean getCanEnableRestockReminder() {
                        return getCoercedBooleanField(1, "can_enable_restock_reminder");
                    }

                    public boolean getCanShowInventoryQuantity() {
                        return getCoercedBooleanField(2, "can_show_inventory_quantity");
                    }

                    public int getFullInventoryQuantity() {
                        return getCoercedIntField(4, "full_inventory_quantity");
                    }

                    public boolean getHasFreeShipping() {
                        return getCoercedBooleanField(5, "has_free_shipping");
                    }

                    public String getIgReferrerFbid() {
                        return getOptionalStringField(6, "ig_referrer_fbid");
                    }

                    public int getInventoryQuantity() {
                        return getCoercedIntField(7, "inventory_quantity");
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.CurrencyAmount getCurrencyAmount() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.CurrencyAmount) getOptionalTreeField(3, "currency_amount", CurrencyAmount.class, CurrencyAmount.TYPE_TAG);
                    }

                    public boolean getProductGroupHasInventory() {
                        return getCoercedBooleanField(9, "product_group_has_inventory");
                    }

                    public String getReceiverId() {
                        return getOptionalStringField(10, "receiver_id");
                    }

                    public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn getShippingAndReturn() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties.ShippingAndReturn) getOptionalTreeField(11, "shipping_and_return", ShippingAndReturn.class, ShippingAndReturn.TYPE_TAG);
                    }

                    public int getViewerPurchaseLimit() {
                        return getCoercedIntField(12, "viewer_purchase_limit");
                    }

                    public boolean hasCanAddToBag() {
                        return hasFieldValue("can_add_to_bag");
                    }

                    public boolean hasCanEnableRestockReminder() {
                        return hasFieldValue("can_enable_restock_reminder");
                    }

                    public boolean hasCanShowInventoryQuantity() {
                        return hasFieldValue("can_show_inventory_quantity");
                    }

                    public boolean hasFullInventoryQuantity() {
                        return hasFieldValue("full_inventory_quantity");
                    }

                    public boolean hasHasFreeShipping() {
                        return hasFieldValue("has_free_shipping");
                    }

                    public boolean hasInventoryQuantity() {
                        return hasFieldValue("inventory_quantity");
                    }

                    public boolean hasIsShopifyMerchant() {
                        return hasFieldValue("is_shopify_merchant");
                    }

                    public boolean hasProductGroupHasInventory() {
                        return hasFieldValue("product_group_has_inventory");
                    }

                    public boolean hasViewerPurchaseLimit() {
                        return hasFieldValue("viewer_purchase_limit");
                    }

                    public boolean isShopifyMerchant() {
                        return getCoercedBooleanField(8, "is_shopify_merchant");
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4LF r3 = AnonymousClass4LF.A00;
                        AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r3, "can_add_to_bag");
                        AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r3, "can_enable_restock_reminder");
                        AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r3, "can_show_inventory_quantity");
                        AnonymousClass4Kp A0C = C41845B3m.A0C(CurrencyAmount.class, "currency_amount", CurrencyAmount.TYPE_TAG);
                        AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
                        AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r2, "full_inventory_quantity");
                        AnonymousClass4L7 A0f5 = AnonymousClass7TE.A0f(r3, "has_free_shipping");
                        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, A0f3, A0C, A0f4, A0f5, AnonymousClass7TE.A0f(r1, "ig_referrer_fbid"), AnonymousClass7TE.A0f(r2, "inventory_quantity"), AnonymousClass7TE.A0f(r3, "is_shopify_merchant"), AnonymousClass7TE.A0f(r3, "product_group_has_inventory"), AnonymousClass7TE.A0f(r1, "receiver_id"), C41845B3m.A0C(ShippingAndReturn.class, "shipping_and_return", ShippingAndReturn.TYPE_TAG), AnonymousClass7TE.A0f(r2, "viewer_purchase_limit")});
                    }

                    public CheckoutProperties(int i) {
                        super(i);
                    }

                    public CheckoutProperties() {
                        super(TYPE_TAG);
                    }
                }

                public final class CommerceReviewStatistics extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CommerceReviewStatistics {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 1657497215;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return CommerceReviewStatistics.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public double getAverageRating() {
                        return getCoercedDoubleField(0, "average_rating");
                    }

                    public int getReviewCount() {
                        return getCoercedIntField(1, "review_count");
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public boolean hasAverageRating() {
                        return hasFieldValue("average_rating");
                    }

                    public boolean hasReviewCount() {
                        return hasFieldValue("review_count");
                    }

                    public CommerceReviewStatistics(int i) {
                        super(i);
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0V(AnonymousClass4L8.A00, C41848B3p.A0B(), "review_count");
                    }

                    public CommerceReviewStatistics() {
                        super(TYPE_TAG);
                    }
                }

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return ProductDetails.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public final class DiscountInformation extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.DiscountInformation {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -1740040758;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return DiscountInformation.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public final class Discounts extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.DiscountInformation.Discounts {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -1246871306;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return Discounts.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public String getId() {
                            return C41847B3o.A1A(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, 2);
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public String getCtaText() {
                            return A07("cta_text");
                        }

                        public String getDescription() {
                            return A08(DevServerEntity.COLUMN_DESCRIPTION);
                        }

                        public String getName() {
                            return A0A(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                        }

                        public String getSeeDetailsText() {
                            return A0B("see_details_text");
                        }

                        public Discounts(int i) {
                            super(i);
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            return C41848B3p.A12();
                        }

                        public Discounts() {
                            super(TYPE_TAG);
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public ImmutableList getDiscounts() {
                        return getOptionalCompactedTreeListField(0, "discounts", Discounts.class, Discounts.TYPE_TAG);
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        int i = Discounts.TYPE_TAG;
                        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Discounts.class, "discounts", i);
                    }

                    public DiscountInformation(int i) {
                        super(i);
                    }

                    public DiscountInformation() {
                        super(TYPE_TAG);
                    }
                }

                public final class ImageQualityMetadata extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ImageQualityMetadata {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 740251614;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return ImageQualityMetadata.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public final class Goodness extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ImageQualityMetadata.Goodness {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 865516424;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return Goodness.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public double getScore() {
                            return getCoercedDoubleField(1, "score");
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public String getId() {
                            return A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        }

                        public boolean hasScore() {
                            return hasFieldValue("score");
                        }

                        public Goodness(int i) {
                            super(i);
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            return C41848B3p.A0r();
                        }

                        public Goodness() {
                            super(TYPE_TAG);
                        }
                    }

                    public final class LifestyleBackground extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ImageQualityMetadata.LifestyleBackground {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -1906728408;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return LifestyleBackground.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public double getScore() {
                            return getCoercedDoubleField(1, "score");
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public String getId() {
                            return A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        }

                        public boolean hasScore() {
                            return hasFieldValue("score");
                        }

                        public LifestyleBackground(int i) {
                            super(i);
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            return C41848B3p.A0r();
                        }

                        public LifestyleBackground() {
                            super(TYPE_TAG);
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public ImmutableList getGoodness() {
                        return getOptionalCompactedTreeListField(0, "goodness", Goodness.class, Goodness.TYPE_TAG);
                    }

                    public ImmutableList getLifestyleBackground() {
                        return getOptionalCompactedTreeListField(1, "lifestyle_background", LifestyleBackground.class, LifestyleBackground.TYPE_TAG);
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        int i = LifestyleBackground.TYPE_TAG;
                        return C41847B3o.A0i(AnonymousClass4Ks.A00(), C41848B3p.A07(Goodness.class, Goodness.TYPE_TAG), LifestyleBackground.class, "lifestyle_background", i);
                    }

                    public ImageQualityMetadata(int i) {
                        super(i);
                    }

                    public ImageQualityMetadata() {
                        super(TYPE_TAG);
                    }
                }

                public final class MainImage extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.MainImage {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 1051943642;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return MainImage.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public final class ImageVersions2 extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2 {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -619820846;

                        public final class Candidates extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2.Candidates {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = 1482530109;

                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return Candidates.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            public String getUrl() {
                                return A08("url");
                            }

                            public int getWidth() {
                                return A00(IgReactMediaPickerNativeModule.WIDTH);
                            }

                            public boolean hasHeight() {
                                return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
                            }

                            public boolean hasWidth() {
                                return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
                            }

                            public Candidates(int i) {
                                super(i);
                            }

                            public int getHeight() {
                                return C41847B3o.A01(this);
                            }

                            public AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A0s();
                            }

                            public Candidates() {
                                super(TYPE_TAG);
                            }
                        }

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return ImageVersions2.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public ImmutableList getCandidates() {
                            return getOptionalCompactedTreeListField(0, "candidates", Candidates.class, Candidates.TYPE_TAG);
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            int i = Candidates.TYPE_TAG;
                            return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Candidates.class, "candidates", i);
                        }

                        public ImageVersions2(int i) {
                            super(i);
                        }

                        public ImageVersions2() {
                            super(TYPE_TAG);
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2 getImageVersions2() {
                        C250663lr A05 = A05(ImageVersions2.class, "image_versions2", ImageVersions2.TYPE_TAG);
                        0qQ.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.IgtvShoppingInfo.Products.ProductDetails.MainImage.ImageVersions2");
                        return (ImageVersions2) A05;
                    }

                    public String getPreview() {
                        return A08("preview");
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        int i = ImageVersions2.TYPE_TAG;
                        return C41848B3p.A13(AnonymousClass4Ks.A01(), ImageVersions2.class, i);
                    }

                    public MainImage(int i) {
                        super(i);
                    }

                    public MainImage() {
                        super(TYPE_TAG);
                    }
                }

                public final class Merchant extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.Merchant {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -674047041;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return Merchant.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public boolean getDisabledSharingProductsToGuides() {
                        return getCoercedBooleanField(0, "disabled_sharing_products_to_guides");
                    }

                    public boolean isVerified() {
                        return C41847B3o.A1b(this, 2);
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public String getId() {
                        return A08("strong_id__");
                    }

                    public String getPk() {
                        return A0A("pk");
                    }

                    public String getProfilePicUrl() {
                        return A0B("profile_pic_url");
                    }

                    public boolean hasDisabledSharingProductsToGuides() {
                        return hasFieldValue("disabled_sharing_products_to_guides");
                    }

                    public Merchant(int i) {
                        super(i);
                    }

                    public String getUsername() {
                        return A0C(AnonymousClass9PN.A00());
                    }

                    public boolean hasIsVerified() {
                        return C41847B3o.A1a(this);
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        return C41849B3q.A04();
                    }

                    public Merchant() {
                        super(TYPE_TAG);
                    }
                }

                public final class ThumbnailImage extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ThumbnailImage {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -1228205993;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return ThumbnailImage.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public final class ImageVersions2 extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2 {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 525772768;

                        public final class Candidates extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2.Candidates {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -792584176;

                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return Candidates.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            public String getUrl() {
                                return A08("url");
                            }

                            public int getWidth() {
                                return A00(IgReactMediaPickerNativeModule.WIDTH);
                            }

                            public boolean hasHeight() {
                                return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
                            }

                            public boolean hasWidth() {
                                return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
                            }

                            public Candidates(int i) {
                                super(i);
                            }

                            public int getHeight() {
                                return C41847B3o.A01(this);
                            }

                            public AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A0s();
                            }

                            public Candidates() {
                                super(TYPE_TAG);
                            }
                        }

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return ImageVersions2.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public ImmutableList getCandidates() {
                            return getOptionalCompactedTreeListField(0, "candidates", Candidates.class, Candidates.TYPE_TAG);
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            int i = Candidates.TYPE_TAG;
                            return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Candidates.class, "candidates", i);
                        }

                        public ImageVersions2(int i) {
                            super(i);
                        }

                        public ImageVersions2() {
                            super(TYPE_TAG);
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2 getImageVersions2() {
                        C250663lr A05 = A05(ImageVersions2.class, "image_versions2", ImageVersions2.TYPE_TAG);
                        0qQ.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.IgtvShoppingInfo.Products.ProductDetails.ThumbnailImage.ImageVersions2");
                        return (ImageVersions2) A05;
                    }

                    public String getPreview() {
                        return A08("preview");
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        int i = ImageVersions2.TYPE_TAG;
                        return C41848B3p.A13(AnonymousClass4Ks.A01(), ImageVersions2.class, i);
                    }

                    public ThumbnailImage(int i) {
                        super(i);
                    }

                    public ThumbnailImage() {
                        super(TYPE_TAG);
                    }
                }

                public final class VariantValues extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.VariantValues {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -1698068769;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return VariantValues.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public String getId() {
                        return C41847B3o.A1A(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, 0);
                    }

                    public String getName() {
                        return C41847B3o.A1A(this, PublicKeyCredentialControllerUtility.JSON_KEY_NAME, 2);
                    }

                    public String getValue() {
                        return C41847B3o.A1A(this, IntentModule.EXTRA_MAP_KEY_FOR_VALUE, 4);
                    }

                    public boolean hasIsPreselected() {
                        return true;
                    }

                    public boolean isPreselected() {
                        return getRequiredBooleanField(1, "is_preselected");
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public String getNormalizedValue() {
                        return A0A("normalized_value");
                    }

                    public C16639Uyb getVisualStyle() {
                        return (C16639Uyb) C41847B3o.A10(this, C16639Uyb.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "visual_style", 5);
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                        return C41849B3q.A0G(r1, AnonymousClass7TE.A0g(r1));
                    }

                    public VariantValues(int i) {
                        super(i);
                    }

                    public VariantValues() {
                        super(TYPE_TAG);
                    }
                }

                public boolean getCanShareToStory() {
                    return getCoercedBooleanField(2, "can_share_to_story");
                }

                public boolean getCanViewerSeeRnr() {
                    return getCoercedBooleanField(3, "can_viewer_see_rnr");
                }

                public String getCompoundProductId() {
                    return getOptionalStringField(7, "compound_product_id");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.AggregatedRating getAggregatedRating() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.AggregatedRating) A03(AggregatedRating.class, "aggregated_rating", AggregatedRating.TYPE_TAG);
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ArtsLabels getArtsLabels() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ArtsLabels) A02(ArtsLabels.class, "arts_labels", ArtsLabels.TYPE_TAG);
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties getCheckoutProperties() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CheckoutProperties) getOptionalTreeField(4, "checkout_properties", CheckoutProperties.class, CheckoutProperties.TYPE_TAG);
                }

                public C48109EWb getCheckoutStyle() {
                    return (C48109EWb) getOptionalEnumField(5, "checkout_style", C48109EWb.A02);
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CommerceReviewStatistics getCommerceReviewStatistics() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.CommerceReviewStatistics) getOptionalTreeField(6, "commerce_review_statistics", CommerceReviewStatistics.class, CommerceReviewStatistics.TYPE_TAG);
                }

                public String getCurrentPrice() {
                    return A0D("current_price");
                }

                public String getCurrentPriceAmount() {
                    return getOptionalStringField(9, "current_price_amount");
                }

                public String getCurrentPriceStripped() {
                    return getOptionalStringField(10, "current_price_stripped");
                }

                public String getDescription() {
                    return getOptionalStringField(11, DevServerEntity.COLUMN_DESCRIPTION);
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.DiscountInformation getDiscountInformation() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.DiscountInformation) getOptionalTreeField(12, "discount_information", DiscountInformation.class, DiscountInformation.TYPE_TAG);
                }

                public String getExternalUrl() {
                    return getOptionalStringField(13, "external_url");
                }

                public String getFullPrice() {
                    return getOptionalStringField(14, "full_price");
                }

                public String getFullPriceAmount() {
                    return getOptionalStringField(15, "full_price_amount");
                }

                public String getFullPriceStripped() {
                    return getOptionalStringField(16, "full_price_stripped");
                }

                public boolean getHasVariants() {
                    return getCoercedBooleanField(17, "has_variants");
                }

                public boolean getHasViewerSaved() {
                    return getCoercedBooleanField(18, "has_viewer_saved");
                }

                public boolean getIgIsProductEditableOnMobile() {
                    return getCoercedBooleanField(19, "ig_is_product_editable_on_mobile");
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ImageQualityMetadata getImageQualityMetadata() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ImageQualityMetadata) getOptionalTreeField(20, "image_quality_metadata", ImageQualityMetadata.class, ImageQualityMetadata.TYPE_TAG);
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.MainImage getMainImage() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.MainImage) getOptionalTreeField(23, "main_image", MainImage.class, MainImage.TYPE_TAG);
                }

                public String getMainImageId() {
                    return getOptionalStringField(24, "main_image_id");
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.Merchant getMerchant() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.Merchant) getOptionalTreeField(25, "merchant", Merchant.class, Merchant.TYPE_TAG);
                }

                public String getName() {
                    return getOptionalStringField(26, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                }

                public String getPrice() {
                    return getOptionalStringField(27, "price");
                }

                public String getProductId() {
                    return getOptionalStringField(28, "product_id");
                }

                public String getRetailerId() {
                    return getOptionalStringField(29, "retailer_id");
                }

                public String getReviewStatus() {
                    return getOptionalStringField(30, "review_status");
                }

                public RGP getSizeCalibrationScore() {
                    return (RGP) getOptionalEnumField(31, "size_calibration_score", RGP.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ThumbnailImage getThumbnailImage() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails.ThumbnailImage) getOptionalTreeField(32, "thumbnail_image", ThumbnailImage.class, ThumbnailImage.TYPE_TAG);
                }

                public ImmutableList getVariantValues() {
                    return getOptionalCompactedTreeListField(33, "variant_values", VariantValues.class, VariantValues.TYPE_TAG);
                }

                public boolean hasCanShareToStory() {
                    return hasFieldValue("can_share_to_story");
                }

                public boolean hasCanViewerSeeRnr() {
                    return hasFieldValue("can_viewer_see_rnr");
                }

                public boolean hasHasVariants() {
                    return hasFieldValue("has_variants");
                }

                public boolean hasHasViewerSaved() {
                    return hasFieldValue("has_viewer_saved");
                }

                public boolean hasIgIsProductEditableOnMobile() {
                    return hasFieldValue("ig_is_product_editable_on_mobile");
                }

                public boolean hasIsEnteredInDrawing() {
                    return hasFieldValue("is_entered_in_drawing");
                }

                public boolean hasIsInStock() {
                    return hasFieldValue("is_in_stock");
                }

                public boolean isEnteredInDrawing() {
                    return getCoercedBooleanField(21, "is_entered_in_drawing");
                }

                public boolean isInStock() {
                    return getCoercedBooleanField(22, "is_in_stock");
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kr[] r5 = new AnonymousClass4Kr[34];
                    AnonymousClass4Kp A0C = C41845B3m.A0C(AggregatedRating.class, "aggregated_rating", AggregatedRating.TYPE_TAG);
                    AnonymousClass4Kp A0C2 = C41845B3m.A0C(ArtsLabels.class, "arts_labels", ArtsLabels.TYPE_TAG);
                    AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                    AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "can_share_to_story");
                    AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r1, "can_viewer_see_rnr");
                    AnonymousClass4Kp A0C3 = C41845B3m.A0C(CheckoutProperties.class, "checkout_properties", CheckoutProperties.TYPE_TAG);
                    AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
                    boolean A1X = AnonymousClass7TF.A1X(new AnonymousClass4Kr[]{A0C, A0C2, A0f, A0f2, A0C3, AnonymousClass7TE.A0f(r0, "checkout_style"), C41845B3m.A0C(CommerceReviewStatistics.class, "commerce_review_statistics", CommerceReviewStatistics.TYPE_TAG), AnonymousClass7TE.A0f(r0, "compound_product_id"), AnonymousClass7TE.A0f(r0, "current_price"), AnonymousClass7TE.A0f(r0, "current_price_amount"), AnonymousClass7TE.A0f(r0, "current_price_stripped"), C41847B3o.A0U(r0), C41845B3m.A0C(DiscountInformation.class, "discount_information", DiscountInformation.TYPE_TAG), C41847B3o.A0f(r0), AnonymousClass7TE.A0f(r0, "full_price"), AnonymousClass7TE.A0f(r0, "full_price_amount"), AnonymousClass7TE.A0f(r0, "full_price_stripped"), C41847B3o.A0e(r1), C41846B3n.A0E(r1), AnonymousClass7TE.A0f(r1, "ig_is_product_editable_on_mobile"), C41845B3m.A0C(ImageQualityMetadata.class, "image_quality_metadata", ImageQualityMetadata.TYPE_TAG), AnonymousClass7TE.A0f(r1, "is_entered_in_drawing"), C41847B3o.A0W(r1), C41845B3m.A0C(MainImage.class, "main_image", MainImage.TYPE_TAG), AnonymousClass7TE.A0f(r0, "main_image_id"), C41845B3m.A0C(Merchant.class, "merchant", Merchant.TYPE_TAG), C41845B3m.A0G(r0)}, r5);
                    AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r0, "price");
                    AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r0, "product_id");
                    AnonymousClass4L7 A0f5 = AnonymousClass7TE.A0f(r0, "retailer_id");
                    AnonymousClass4L7 A0f6 = AnonymousClass7TE.A0f(r0, "review_status");
                    AnonymousClass4L7 A0f7 = AnonymousClass7TE.A0f(r0, "size_calibration_score");
                    AnonymousClass4Kp A0C4 = C41845B3m.A0C(ThumbnailImage.class, "thumbnail_image", ThumbnailImage.TYPE_TAG);
                    int i = VariantValues.TYPE_TAG;
                    return C41846B3n.A0N(new AnonymousClass4Kr[]{A0f3, A0f4, A0f5, A0f6, A0f7, A0C4, C41845B3m.A0A(AnonymousClass4Ks.A00(), VariantValues.class, "variant_values", i)}, r5, A1X ? 1 : 0, 27, 7);
                }

                public ProductDetails(int i) {
                    super(i);
                }

                public ProductDetails() {
                    super(TYPE_TAG);
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails getProductDetails() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Products.ProductDetails) A03(ProductDetails.class, "product_details", ProductDetails.TYPE_TAG);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0Y(ProductDetails.class, "product_details", ProductDetails.TYPE_TAG);
            }

            public Products(int i) {
                super(i);
            }

            public Products() {
                super(TYPE_TAG);
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.ClipsShoppingCtaBar getClipsShoppingCtaBar() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.ClipsShoppingCtaBar) A03(ClipsShoppingCtaBar.class, "clips_shopping_cta_bar", ClipsShoppingCtaBar.TYPE_TAG);
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Merchant getMerchant() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo.Merchant) A02(Merchant.class, "merchant", Merchant.TYPE_TAG);
        }

        public ImmutableList getProducts() {
            return getOptionalCompactedTreeListField(2, "products", Products.class, Products.TYPE_TAG);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kp A0C = C41845B3m.A0C(ClipsShoppingCtaBar.class, "clips_shopping_cta_bar", ClipsShoppingCtaBar.TYPE_TAG);
            AnonymousClass4Kp A0C2 = C41845B3m.A0C(Merchant.class, "merchant", Merchant.TYPE_TAG);
            int i = Products.TYPE_TAG;
            return C41846B3n.A0K(A0C, A0C2, C41845B3m.A0A(AnonymousClass4Ks.A00(), Products.class, "products", i));
        }

        public IgtvShoppingInfo(int i) {
            super(i);
        }

        public IgtvShoppingInfo() {
            super(TYPE_TAG);
        }
    }

    public final class ImageVersions2 extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2 {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -2040132517;

        public final class AdditionalCandidates extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 1971959079;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return AdditionalCandidates.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public final class FirstFrame extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.FirstFrame {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -843967344;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return FirstFrame.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public int getWidth() {
                    return getCoercedIntField(3, IgReactMediaPickerNativeModule.WIDTH);
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public String getScansProfile() {
                    return A08("scans_profile");
                }

                public String getUrl() {
                    return A09("url");
                }

                public boolean hasHeight() {
                    return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
                }

                public boolean hasWidth() {
                    return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
                }

                public FirstFrame(int i) {
                    super(i);
                }

                public int getHeight() {
                    return C41847B3o.A01(this);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return C41848B3p.A0o();
                }

                public FirstFrame() {
                    super(TYPE_TAG);
                }
            }

            public final class IgtvFirstFrame extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.IgtvFirstFrame {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -1932761430;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return IgtvFirstFrame.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public int getWidth() {
                    return getCoercedIntField(3, IgReactMediaPickerNativeModule.WIDTH);
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public String getScansProfile() {
                    return A08("scans_profile");
                }

                public String getUrl() {
                    return A09("url");
                }

                public boolean hasHeight() {
                    return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
                }

                public boolean hasWidth() {
                    return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
                }

                public IgtvFirstFrame(int i) {
                    super(i);
                }

                public int getHeight() {
                    return C41847B3o.A01(this);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return C41848B3p.A0o();
                }

                public IgtvFirstFrame() {
                    super(TYPE_TAG);
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.FirstFrame getFirstFrame() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.FirstFrame) A03(FirstFrame.class, "first_frame", FirstFrame.TYPE_TAG);
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.IgtvFirstFrame getIgtvFirstFrame() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates.IgtvFirstFrame) A02(IgtvFirstFrame.class, "igtv_first_frame", IgtvFirstFrame.TYPE_TAG);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                return C41847B3o.A0m(C41845B3m.A0C(FirstFrame.class, "first_frame", FirstFrame.TYPE_TAG), IgtvFirstFrame.class, "igtv_first_frame", IgtvFirstFrame.TYPE_TAG);
            }

            public AdditionalCandidates(int i) {
                super(i);
            }

            public AdditionalCandidates() {
                super(TYPE_TAG);
            }
        }

        public final class Candidates extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.Candidates {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 1407270378;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return Candidates.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public int getWidth() {
                return getCoercedIntField(3, IgReactMediaPickerNativeModule.WIDTH);
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public String getScansProfile() {
                return A08("scans_profile");
            }

            public String getUrl() {
                return A09("url");
            }

            public boolean hasHeight() {
                return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
            }

            public boolean hasWidth() {
                return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
            }

            public Candidates(int i) {
                super(i);
            }

            public int getHeight() {
                return C41847B3o.A01(this);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                return C41848B3p.A0o();
            }

            public Candidates() {
                super(TYPE_TAG);
            }
        }

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return ImageVersions2.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final class ScrubberSpritesheetInfoCandidates extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 848710674;

            public final class Default extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 227858889;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return Default.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public int getFileSizeKb() {
                    return getCoercedIntField(0, "file_size_kb");
                }

                public int getMaxThumbnailsPerSprite() {
                    return getCoercedIntField(1, "max_thumbnails_per_sprite");
                }

                public int getSpriteHeight() {
                    return getCoercedIntField(3, "sprite_height");
                }

                public int getSpriteWidth() {
                    return getCoercedIntField(4, "sprite_width");
                }

                public double getThumbnailDuration() {
                    return getCoercedDoubleField(5, "thumbnail_duration");
                }

                public int getThumbnailHeight() {
                    return getCoercedIntField(6, "thumbnail_height");
                }

                public int getThumbnailWidth() {
                    return getCoercedIntField(7, "thumbnail_width");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public int getRenderedWidth() {
                    return A00("rendered_width");
                }

                public int getThumbnailsPerRow() {
                    return getCoercedIntField(8, "thumbnails_per_row");
                }

                public int getTotalThumbnailNumPerSprite() {
                    return getCoercedIntField(9, "total_thumbnail_num_per_sprite");
                }

                public double getVideoLength() {
                    return getCoercedDoubleField(10, "video_length");
                }

                public boolean hasFileSizeKb() {
                    return hasFieldValue("file_size_kb");
                }

                public boolean hasMaxThumbnailsPerSprite() {
                    return hasFieldValue("max_thumbnails_per_sprite");
                }

                public boolean hasRenderedWidth() {
                    return hasFieldValue("rendered_width");
                }

                public boolean hasSpriteHeight() {
                    return hasFieldValue("sprite_height");
                }

                public boolean hasSpriteWidth() {
                    return hasFieldValue("sprite_width");
                }

                public boolean hasThumbnailDuration() {
                    return hasFieldValue("thumbnail_duration");
                }

                public boolean hasThumbnailHeight() {
                    return hasFieldValue("thumbnail_height");
                }

                public boolean hasThumbnailWidth() {
                    return hasFieldValue("thumbnail_width");
                }

                public boolean hasThumbnailsPerRow() {
                    return hasFieldValue("thumbnails_per_row");
                }

                public boolean hasTotalThumbnailNumPerSprite() {
                    return hasFieldValue("total_thumbnail_num_per_sprite");
                }

                public boolean hasVideoLength() {
                    return hasFieldValue("video_length");
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return C13992Tns.A09();
                }

                public Default(int i) {
                    super(i);
                }

                public Default() {
                    super(TYPE_TAG);
                }
            }

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return ScrubberSpritesheetInfoCandidates.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default getDefault() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates.Default) A03(Default.class, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, Default.TYPE_TAG);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0Y(Default.class, GraphQLSubscriptionID.INAPP_NOTIFICATION_TYPE_DEFAULT, Default.TYPE_TAG);
            }

            public ScrubberSpritesheetInfoCandidates(int i) {
                super(i);
            }

            public ScrubberSpritesheetInfoCandidates() {
                super(TYPE_TAG);
            }
        }

        public boolean getSmartThumbnailEnabled() {
            return getCoercedBooleanField(3, "smart_thumbnail_enabled");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates getAdditionalCandidates() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.AdditionalCandidates) A03(AdditionalCandidates.class, "additional_candidates", AdditionalCandidates.TYPE_TAG);
        }

        public ImmutableList getCandidates() {
            return getOptionalCompactedTreeListField(1, "candidates", Candidates.class, Candidates.TYPE_TAG);
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates getScrubberSpritesheetInfoCandidates() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2.ScrubberSpritesheetInfoCandidates) A04(ScrubberSpritesheetInfoCandidates.class, "scrubber_spritesheet_info_candidates", ScrubberSpritesheetInfoCandidates.TYPE_TAG);
        }

        public boolean hasSmartThumbnailEnabled() {
            return hasFieldValue("smart_thumbnail_enabled");
        }

        public AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kp A0C = C41845B3m.A0C(AdditionalCandidates.class, "additional_candidates", AdditionalCandidates.TYPE_TAG);
            int i = Candidates.TYPE_TAG;
            return C41847B3o.A0j(AnonymousClass4LF.A00, A0C, C41845B3m.A0A(AnonymousClass4Ks.A00(), Candidates.class, "candidates", i), C41845B3m.A0C(ScrubberSpritesheetInfoCandidates.class, "scrubber_spritesheet_info_candidates", ScrubberSpritesheetInfoCandidates.TYPE_TAG), "smart_thumbnail_enabled");
        }

        public ImageVersions2(int i) {
            super(i);
        }

        public ImageVersions2() {
            super(TYPE_TAG);
        }
    }

    public final class InvitedCoauthorProducers extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.InvitedCoauthorProducers {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1086627578;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return InvitedCoauthorProducers.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public boolean getHasOnboardedToTextPostApp() {
            return getCoercedBooleanField(1, "has_onboarded_to_text_post_app");
        }

        public String getPkId() {
            return getOptionalStringField(6, "pk_id");
        }

        public String getProfilePicId() {
            return getOptionalStringField(7, "profile_pic_id");
        }

        public boolean isPrivate() {
            return getCoercedBooleanField(3, "is_private");
        }

        public boolean isVerified() {
            return C41847B3o.A1b(this, 4);
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public String getFullName() {
            return A07("full_name");
        }

        public String getId() {
            return A09("strong_id__");
        }

        public String getPk() {
            return A0C("pk");
        }

        public String getProfilePicUrl() {
            return A0D("profile_pic_url");
        }

        public String getUsername() {
            return C41847B3o.A19(this, 9);
        }

        public boolean hasHasOnboardedToTextPostApp() {
            return hasFieldValue("has_onboarded_to_text_post_app");
        }

        public boolean hasIsPrivate() {
            return hasFieldValue("is_private");
        }

        public InvitedCoauthorProducers(int i) {
            super(i);
        }

        public boolean hasIsVerified() {
            return C41847B3o.A1a(this);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            return C41849B3q.A02();
        }

        public InvitedCoauthorProducers() {
            super(TYPE_TAG);
        }
    }

    public final class Location extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.Location {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 610333350;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return Location.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public long getFacebookPlacesId() {
            return getCoercedTimeField(3, "facebook_places_id");
        }

        public boolean getHasViewerSaved() {
            return getCoercedBooleanField(4, "has_viewer_saved");
        }

        public double getLat() {
            return getCoercedDoubleField(6, "lat");
        }

        public double getLng() {
            return getCoercedDoubleField(7, "lng");
        }

        public boolean isEligibleForGuides() {
            return getCoercedBooleanField(5, "is_eligible_for_guides");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public String getAddress() {
            return A07("address");
        }

        public String getCity() {
            return A08(ServerW3CShippingAddressConstants.CITY);
        }

        public String getExternalSource() {
            return A09("external_source");
        }

        public String getName() {
            return A0D(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
        }

        public long getPk() {
            return getCoercedTimeField(9, "pk");
        }

        public String getShortName() {
            return getOptionalStringField(10, "short_name");
        }

        public boolean hasFacebookPlacesId() {
            return hasFieldValue("facebook_places_id");
        }

        public boolean hasHasViewerSaved() {
            return hasFieldValue("has_viewer_saved");
        }

        public boolean hasIsEligibleForGuides() {
            return hasFieldValue("is_eligible_for_guides");
        }

        public boolean hasLat() {
            return hasFieldValue("lat");
        }

        public boolean hasLng() {
            return hasFieldValue("lng");
        }

        public boolean hasPk() {
            return hasFieldValue("pk");
        }

        public AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
            return C41849B3q.A0K(r0, r0);
        }

        public Location(int i) {
            super(i);
        }

        public Location() {
            super(TYPE_TAG);
        }
    }

    public final class MashupInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.MashupInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -1592277675;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return MashupInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public boolean getCanToggleMashupsAllowed() {
            return getRequiredBooleanField(0, "can_toggle_mashups_allowed");
        }

        public boolean getHasBeenMashedUp() {
            return getRequiredBooleanField(1, "has_been_mashed_up");
        }

        public boolean getHasNonmimicableAdditionalAudio() {
            return getCoercedBooleanField(2, "has_nonmimicable_additional_audio");
        }

        public boolean getMashupsAllowed() {
            return getRequiredBooleanField(6, "mashups_allowed");
        }

        public boolean hasCanToggleMashupsAllowed() {
            return true;
        }

        public boolean hasHasBeenMashedUp() {
            return true;
        }

        public boolean hasIsCreatorRequestingMashup() {
            return true;
        }

        public boolean hasIsPivotPageAvailable() {
            return true;
        }

        public boolean hasMashupsAllowed() {
            return true;
        }

        public boolean isCreatorRequestingMashup() {
            return getRequiredBooleanField(3, "is_creator_requesting_mashup");
        }

        public boolean isLightWeightCheck() {
            return getCoercedBooleanField(4, "is_light_weight_check");
        }

        public boolean isPivotPageAvailable() {
            return getRequiredBooleanField(5, "is_pivot_page_available");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public boolean hasHasNonmimicableAdditionalAudio() {
            return hasFieldValue("has_nonmimicable_additional_audio");
        }

        public boolean hasIsLightWeightCheck() {
            return hasFieldValue("is_light_weight_check");
        }

        public MashupInfo(int i) {
            super(i);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            return C41849B3q.A03();
        }

        public MashupInfo() {
            super(TYPE_TAG);
        }
    }

    public final class MediaAppreciationSettings extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.MediaAppreciationSettings {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1529877378;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return MediaAppreciationSettings.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public C48113EWf getGiftCountVisibility() {
            return (C48113EWf) C41847B3o.A10(this, C48113EWf.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "gift_count_visibility", 0);
        }

        public C391309sg getMediaGiftingState() {
            return (C391309sg) C41847B3o.A10(this, C391309sg.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "media_gifting_state", 1);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
            return AnonymousClass7TG.A0V(AnonymousClass7TE.A0g(r3), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r3), "gift_count_visibility"), "media_gifting_state");
        }

        public MediaAppreciationSettings(int i) {
            super(i);
        }

        public MediaAppreciationSettings() {
            super(TYPE_TAG);
        }
    }

    public final class MediaCroppingInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1432586607;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return MediaCroppingInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final class FeedPreviewCrop extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.FeedPreviewCrop {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -782546297;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return FeedPreviewCrop.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public double getCropBottom() {
                return getRequiredDoubleField(0, "crop_bottom");
            }

            public double getCropLeft() {
                return getRequiredDoubleField(1, "crop_left");
            }

            public double getCropRight() {
                return getRequiredDoubleField(2, "crop_right");
            }

            public double getCropTop() {
                return getRequiredDoubleField(3, "crop_top");
            }

            public boolean hasCropBottom() {
                return true;
            }

            public boolean hasCropLeft() {
                return true;
            }

            public boolean hasCropRight() {
                return true;
            }

            public boolean hasCropTop() {
                return true;
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public FeedPreviewCrop(int i) {
                super(i);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                return C41849B3q.A0D();
            }

            public FeedPreviewCrop() {
                super(TYPE_TAG);
            }
        }

        public final class SquareCrop extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.SquareCrop {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 564079321;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return SquareCrop.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public double getCropBottom() {
                return getRequiredDoubleField(0, "crop_bottom");
            }

            public double getCropLeft() {
                return getRequiredDoubleField(1, "crop_left");
            }

            public double getCropRight() {
                return getRequiredDoubleField(2, "crop_right");
            }

            public double getCropTop() {
                return getRequiredDoubleField(3, "crop_top");
            }

            public boolean hasCropBottom() {
                return true;
            }

            public boolean hasCropLeft() {
                return true;
            }

            public boolean hasCropRight() {
                return true;
            }

            public boolean hasCropTop() {
                return true;
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public SquareCrop(int i) {
                super(i);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                return C41849B3q.A0D();
            }

            public SquareCrop() {
                super(TYPE_TAG);
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.FeedPreviewCrop getFeedPreviewCrop() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.FeedPreviewCrop) A03(FeedPreviewCrop.class, "feed_preview_crop", FeedPreviewCrop.TYPE_TAG);
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.SquareCrop getSquareCrop() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo.SquareCrop) A02(SquareCrop.class, "square_crop", SquareCrop.TYPE_TAG);
        }

        public String getStrongId() {
            return A09("strong_id__");
        }

        public AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0U(AnonymousClass4Kz.A00, C41845B3m.A0C(FeedPreviewCrop.class, "feed_preview_crop", FeedPreviewCrop.TYPE_TAG), C41845B3m.A0C(SquareCrop.class, "square_crop", SquareCrop.TYPE_TAG), "strong_id__");
        }

        public MediaCroppingInfo(int i) {
            super(i);
        }

        public MediaCroppingInfo() {
            super(TYPE_TAG);
        }
    }

    public final class MediaNotice extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.MediaNotice {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -557796809;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return MediaNotice.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public UyW getNoticeIcon() {
            return (UyW) getOptionalEnumField(0, "notice_icon", UyW.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        }

        public String getNoticeSubText() {
            return A08("notice_sub_text");
        }

        public String getNoticeText() {
            return A09("notice_text");
        }

        public String getNoticeUrl() {
            return A0A("notice_url");
        }

        public AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
            return C41847B3o.A0j(r4, AnonymousClass7TE.A0f(r4, "notice_icon"), AnonymousClass7TE.A0f(r4, "notice_sub_text"), AnonymousClass7TE.A0f(r4, "notice_text"), "notice_url");
        }

        public MediaNotice(int i) {
            super(i);
        }

        public MediaNotice() {
            super(TYPE_TAG);
        }
    }

    public final class MediaOverlayInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1386701942;

        public final class Buttons extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -980890725;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return Buttons.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public final class Icon extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons.Icon {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -1351520668;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return Icon.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public int getIconGlyph() {
                    return getCoercedIntField(0, "icon_glyph");
                }

                public int getIconType() {
                    return getCoercedIntField(1, "icon_type");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public String getName() {
                    return A09(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                }

                public boolean hasIconGlyph() {
                    return hasFieldValue("icon_glyph");
                }

                public boolean hasIconType() {
                    return hasFieldValue("icon_type");
                }

                public Icon(int i) {
                    super(i);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return C41848B3p.A11();
                }

                public Icon() {
                    super(TYPE_TAG);
                }
            }

            public final class TextColor extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons.TextColor {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -989789208;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return TextColor.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public String getDark() {
                    return C41847B3o.A1A(this, "dark", 0);
                }

                public String getLight() {
                    return C41847B3o.A1A(this, "light", 1);
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
                    return AnonymousClass7TG.A0V(AnonymousClass7TE.A0g(r0), C41848B3p.A0O(r0), "light");
                }

                public TextColor(int i) {
                    super(i);
                }

                public TextColor() {
                    super(TYPE_TAG);
                }
            }

            public int getAction() {
                return getCoercedIntField(0, "action");
            }

            public boolean getHasChevron() {
                return getCoercedBooleanField(3, "has_chevron");
            }

            public String getSecondaryText() {
                return getOptionalStringField(6, "secondary_text");
            }

            public String getText() {
                return C41845B3m.A0l(this, 7);
            }

            public boolean isTextCentered() {
                return getCoercedBooleanField(5, "is_text_centered");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public String getActionUrl() {
                return A08("action_url");
            }

            public int getButtonType() {
                return A00("button_type");
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons.Icon getIcon() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons.Icon) getOptionalTreeField(4, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, Icon.class, Icon.TYPE_TAG);
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons.TextColor getTextColor() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Buttons.TextColor) getOptionalTreeField(8, "text_color", TextColor.class, TextColor.TYPE_TAG);
            }

            public boolean hasAction() {
                return hasFieldValue("action");
            }

            public boolean hasButtonType() {
                return hasFieldValue("button_type");
            }

            public boolean hasHasChevron() {
                return hasFieldValue("has_chevron");
            }

            public boolean hasIsTextCentered() {
                return hasFieldValue("is_text_centered");
            }

            public AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "action");
                AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r4, "action_url");
                AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r1, "button_type");
                AnonymousClass4LF r3 = AnonymousClass4LF.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, A0f3, AnonymousClass7TE.A0f(r3, "has_chevron"), C41845B3m.A0C(Icon.class, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, Icon.TYPE_TAG), AnonymousClass7TE.A0f(r3, "is_text_centered"), AnonymousClass7TE.A0f(r4, "secondary_text"), C41846B3n.A0F(r4), C41845B3m.A0C(TextColor.class, "text_color", TextColor.TYPE_TAG)});
            }

            public Buttons(int i) {
                super(i);
            }

            public Buttons() {
                super(TYPE_TAG);
            }
        }

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return MediaOverlayInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final class Icon extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Icon {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -33690457;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return Icon.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public int getIconGlyph() {
                return getCoercedIntField(0, "icon_glyph");
            }

            public int getIconType() {
                return getCoercedIntField(1, "icon_type");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public String getName() {
                return A09(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            }

            public boolean hasIconGlyph() {
                return hasFieldValue("icon_glyph");
            }

            public boolean hasIconType() {
                return hasFieldValue("icon_type");
            }

            public Icon(int i) {
                super(i);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                return C41848B3p.A11();
            }

            public Icon() {
                super(TYPE_TAG);
            }
        }

        public int getMisinformationType() {
            return getCoercedIntField(3, "misinformation_type");
        }

        public int getOverlayAppliedTimestamp() {
            return getCoercedIntField(4, "overlay_applied_timestamp");
        }

        public int getOverlayLayout() {
            return getCoercedIntField(5, "overlay_layout");
        }

        public String getOverlayType() {
            return getOptionalStringField(6, "overlay_type");
        }

        public String getSessionId() {
            return getOptionalStringField(7, AnonymousClass9PN.A01());
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public ImmutableList getButtons() {
            return getOptionalCompactedTreeListField(0, "buttons", Buttons.class, Buttons.TYPE_TAG);
        }

        public String getDescription() {
            return A08(DevServerEntity.COLUMN_DESCRIPTION);
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Icon getIcon() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo.Icon) A04(Icon.class, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, Icon.TYPE_TAG);
        }

        public String getSubCategory() {
            return A0D("sub_category");
        }

        public String getTitle() {
            return getOptionalStringField(9, DialogModule.KEY_TITLE);
        }

        public boolean hasMisinformationType() {
            return hasFieldValue("misinformation_type");
        }

        public boolean hasOverlayAppliedTimestamp() {
            return hasFieldValue("overlay_applied_timestamp");
        }

        public boolean hasOverlayLayout() {
            return hasFieldValue("overlay_layout");
        }

        public AnonymousClass4Kx modelSelectionSet() {
            int i = Buttons.TYPE_TAG;
            AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A00(), Buttons.class, "buttons", i);
            AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
            AnonymousClass4L7 A0U = C41847B3o.A0U(r1);
            AnonymousClass4Kp A0C = C41845B3m.A0C(Icon.class, PublicKeyCredentialControllerUtility.JSON_KEY_ICON, Icon.TYPE_TAG);
            AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0A, A0U, A0C, AnonymousClass7TE.A0f(r2, "misinformation_type"), AnonymousClass7TE.A0f(r2, "overlay_applied_timestamp"), AnonymousClass7TE.A0f(r2, "overlay_layout"), AnonymousClass7TE.A0f(r1, "overlay_type"), AnonymousClass7TE.A0f(r1, AnonymousClass9PN.A01()), AnonymousClass7TE.A0f(r1, "sub_category"), C41845B3m.A0I(r1)});
        }

        public MediaOverlayInfo(int i) {
            super(i);
        }

        public MediaOverlayInfo() {
            super(TYPE_TAG);
        }
    }

    public final class MusicMetadata extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -1054330615;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return MusicMetadata.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final class OriginalSoundInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 2046091653;

            public final class AudioParts extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.AudioParts {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -1347119813;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return AudioParts.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public CreatorInspirationSignalsPlaygroundAudioPartMetadata asCreatorInspirationSignalsPlaygroundAudioPartMetadata() {
                    return (CreatorInspirationSignalsPlaygroundAudioPartMetadata) A01(CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.class, CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.TYPE_TAG);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0X(CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.class, "CreatorInspirationSignalsPlaygroundAudioPartMetadata", CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.TYPE_TAG);
                }

                public AudioParts(int i) {
                    super(i);
                }

                public AudioParts() {
                    super(TYPE_TAG);
                }
            }

            public final class AudioPartsByFilter extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.AudioPartsByFilter {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 105011133;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return AudioPartsByFilter.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public CreatorInspirationSignalsPlaygroundAudioPartMetadata asCreatorInspirationSignalsPlaygroundAudioPartMetadata() {
                    return (CreatorInspirationSignalsPlaygroundAudioPartMetadata) A01(CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.class, CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.TYPE_TAG);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0X(CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.class, "CreatorInspirationSignalsPlaygroundAudioPartMetadata", CreatorInspirationSignalsPlaygroundAudioPartMetadataImpl.TYPE_TAG);
                }

                public AudioPartsByFilter(int i) {
                    super(i);
                }

                public AudioPartsByFilter() {
                    super(TYPE_TAG);
                }
            }

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return OriginalSoundInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public final class ConsumptionInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.ConsumptionInfo {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -636896919;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return ConsumptionInfo.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public String getShouldMuteAudioReason() {
                    return C41847B3o.A1A(this, "should_mute_audio_reason", 2);
                }

                public boolean hasIsBookmarked() {
                    return true;
                }

                public boolean hasIsTrendingInClips() {
                    return true;
                }

                public boolean isBookmarked() {
                    return getRequiredBooleanField(0, "is_bookmarked");
                }

                public boolean isTrendingInClips() {
                    return getRequiredBooleanField(1, "is_trending_in_clips");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public ConsumptionInfo(int i) {
                    super(i);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return C41848B3p.A0y();
                }

                public ConsumptionInfo() {
                    super(TYPE_TAG);
                }
            }

            public final class IgArtist extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.IgArtist {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 1273598757;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return IgArtist.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public String getProfilePicId() {
                    return getOptionalStringField(6, "profile_pic_id");
                }

                public String getProfilePicUrl() {
                    return getOptionalStringField(7, "profile_pic_url");
                }

                public boolean isPrivate() {
                    return getCoercedBooleanField(2, "is_private");
                }

                public boolean isVerified() {
                    return C41847B3o.A1b(this, 3);
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public String getFullName() {
                    return A07("full_name");
                }

                public String getId() {
                    return A08("strong_id__");
                }

                public String getPk() {
                    return A0B("pk");
                }

                public String getPkId() {
                    return A0C("pk_id");
                }

                public boolean hasIsPrivate() {
                    return hasFieldValue("is_private");
                }

                public IgArtist(int i) {
                    super(i);
                }

                public String getUsername() {
                    return A0D(AnonymousClass9PN.A00());
                }

                public boolean hasIsVerified() {
                    return C41847B3o.A1a(this);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return C41849B3q.A0A();
                }

                public IgArtist() {
                    super(TYPE_TAG);
                }
            }

            public boolean getAllowCreatorToRename() {
                return getRequiredBooleanField(0, "allow_creator_to_rename");
            }

            public String getAudioAssetId() {
                return C41847B3o.A1A(this, "audio_asset_id", 1);
            }

            public boolean getCanRemixBeSharedToFb() {
                return getCoercedBooleanField(4, "can_remix_be_shared_to_fb");
            }

            public String getDashManifest() {
                return C41847B3o.A1A(this, "dash_manifest", 6);
            }

            public int getDurationInMs() {
                return getCoercedIntField(7, "duration_in_ms");
            }

            public boolean hasAllowCreatorToRename() {
                return true;
            }

            public boolean hasHideRemixing() {
                return true;
            }

            public boolean hasIsAudioAutomaticallyAttributed() {
                return true;
            }

            public boolean hasIsExplicit() {
                return true;
            }

            public boolean hasShouldMuteAudio() {
                return true;
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public ImmutableList getAudioParts() {
                return getRequiredCompactedTreeListField(2, "audio_parts", AudioParts.class, AudioParts.TYPE_TAG);
            }

            public ImmutableList getAudioPartsByFilter() {
                return getRequiredCompactedTreeListField(3, "audio_parts_by_filter", AudioPartsByFilter.class, AudioPartsByFilter.TYPE_TAG);
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.ConsumptionInfo getConsumptionInfo() {
                C250663lr requiredTreeField = getRequiredTreeField(5, "consumption_info", ConsumptionInfo.class, ConsumptionInfo.TYPE_TAG);
                0qQ.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.MusicMetadata.OriginalSoundInfo.ConsumptionInfo");
                return (ConsumptionInfo) requiredTreeField;
            }

            public boolean getHideRemixing() {
                return getRequiredBooleanField(8, "hide_remixing");
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo.IgArtist getIgArtist() {
                C250663lr requiredTreeField = getRequiredTreeField(9, "ig_artist", IgArtist.class, IgArtist.TYPE_TAG);
                0qQ.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.MusicMetadata.OriginalSoundInfo.IgArtist");
                return (IgArtist) requiredTreeField;
            }

            public HN9 getOriginalAudioSubtype() {
                return (HN9) C41847B3o.A10(this, HN9.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "original_audio_subtype", 15);
            }

            public String getOriginalAudioTitle() {
                return C41847B3o.A1A(this, "original_audio_title", 16);
            }

            public String getOriginalMediaId() {
                return C41847B3o.A1A(this, "original_media_id", 17);
            }

            public String getProgressiveDownloadUrl() {
                return C41847B3o.A1A(this, "progressive_download_url", 18);
            }

            public boolean getShouldMuteAudio() {
                return getRequiredBooleanField(19, "should_mute_audio");
            }

            public int getTimeCreated() {
                return getCoercedIntField(20, "time_created");
            }

            public int getTrendRank() {
                return getCoercedIntField(21, "trend_rank");
            }

            public boolean hasCanRemixBeSharedToFb() {
                return hasFieldValue("can_remix_be_shared_to_fb");
            }

            public boolean hasDurationInMs() {
                return hasFieldValue("duration_in_ms");
            }

            public boolean hasIsOriginalAudioDownloadEligible() {
                return hasFieldValue("is_original_audio_download_eligible");
            }

            public boolean hasIsReuseDisabled() {
                return hasFieldValue("is_reuse_disabled");
            }

            public boolean hasIsXpostFromFb() {
                return hasFieldValue("is_xpost_from_fb");
            }

            public boolean hasTimeCreated() {
                return hasFieldValue("time_created");
            }

            public boolean hasTrendRank() {
                return hasFieldValue("trend_rank");
            }

            public boolean isAudioAutomaticallyAttributed() {
                return getRequiredBooleanField(10, "is_audio_automatically_attributed");
            }

            public boolean isExplicit() {
                return getRequiredBooleanField(11, "is_explicit");
            }

            public boolean isOriginalAudioDownloadEligible() {
                return getCoercedBooleanField(12, "is_original_audio_download_eligible");
            }

            public boolean isReuseDisabled() {
                return getCoercedBooleanField(13, "is_reuse_disabled");
            }

            public boolean isXpostFromFb() {
                return getCoercedBooleanField(14, "is_xpost_from_fb");
            }

            public AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4LF r0 = AnonymousClass4LF.A00;
                AnonymousClass4L7 A0n = C41848B3p.A0n(r0);
                AnonymousClass4Kz r5 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0a = C41848B3p.A0a(r5);
                AnonymousClass4Kp A08 = C41848B3p.A08(AudioParts.class, AudioParts.TYPE_TAG);
                int i = AudioPartsByFilter.TYPE_TAG;
                AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A02(), AudioPartsByFilter.class, "audio_parts_by_filter", i);
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r0, "can_remix_be_shared_to_fb");
                AnonymousClass4Kp A05 = C41848B3p.A05(ConsumptionInfo.class, ConsumptionInfo.TYPE_TAG);
                AnonymousClass4L7 A0j = C41848B3p.A0j(r5);
                AnonymousClass4L8 r1 = AnonymousClass4L8.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0n, A0a, A08, A0A, A0f, A05, A0j, C41847B3o.A0C(r1), C41848B3p.A0l(r0), C41848B3p.A06(IgArtist.class, IgArtist.TYPE_TAG), C41848B3p.A0M(r0), C41848B3p.A0K(r0), AnonymousClass7TE.A0f(r0, "is_original_audio_download_eligible"), AnonymousClass7TE.A0f(r0, "is_reuse_disabled"), AnonymousClass7TE.A0f(r0, "is_xpost_from_fb"), C41848B3p.A0i(r5), C41848B3p.A0U(r5), C41848B3p.A0J(r5), C41848B3p.A0R(r5), C41848B3p.A0f(r0), AnonymousClass7TE.A0f(r1, "time_created"), AnonymousClass7TE.A0f(r1, "trend_rank")});
            }

            public OriginalSoundInfo(int i) {
                super(i);
            }

            public OriginalSoundInfo() {
                super(TYPE_TAG);
            }
        }

        public String getMusicCanonicalId() {
            return C41847B3o.A1A(this, "music_canonical_id", 1);
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public UyX getAudioType() {
            return (UyX) getOptionalEnumField(0, "audio_type", UyX.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo getOriginalSoundInfo() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata.OriginalSoundInfo) A04(OriginalSoundInfo.class, "original_sound_info", OriginalSoundInfo.TYPE_TAG);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
            return C41847B3o.A0k(AnonymousClass7TE.A0f(r1, "audio_type"), C41848B3p.A0d(r1), OriginalSoundInfo.class, "original_sound_info", OriginalSoundInfo.TYPE_TAG);
        }

        public MusicMetadata(int i) {
            super(i);
        }

        public MusicMetadata() {
            super(TYPE_TAG);
        }
    }

    public final class OrganicCtaInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.OrganicCtaInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -1405423150;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return OrganicCtaInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public String getCtaTitle() {
            return C41847B3o.A1A(this, "cta_title", 1);
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public String getCtaSubtitle() {
            return A07("cta_subtitle");
        }

        public C62604Kib getCtaType() {
            return (C62604Kib) C41847B3o.A10(this, C62604Kib.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "cta_type", 2);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
            return AnonymousClass7TG.A0U(AnonymousClass7TE.A0g(r1), AnonymousClass7TE.A0f(r1, "cta_subtitle"), C41848B3p.A0T(r1), "cta_type");
        }

        public OrganicCtaInfo(int i) {
            super(i);
        }

        public OrganicCtaInfo() {
            super(TYPE_TAG);
        }
    }

    public final class ProductTags extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 260944321;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return ProductTags.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final class In extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 796933152;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return In.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public final class Product extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = -1736247688;

                public final class AggregatedRating extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.AggregatedRating {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 1994026379;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return AggregatedRating.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public int getRatingCount() {
                        return getCoercedIntField(0, "rating_count");
                    }

                    public double getValue() {
                        return getCoercedDoubleField(1, IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public boolean hasRatingCount() {
                        return hasFieldValue("rating_count");
                    }

                    public boolean hasValue() {
                        return hasFieldValue(IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                    }

                    public AggregatedRating(int i) {
                        super(i);
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0V(C342787pA.A00, C41847B3o.A06(), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
                    }

                    public AggregatedRating() {
                        super(TYPE_TAG);
                    }
                }

                public final class ArtsLabels extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ArtsLabels {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 1648138857;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return ArtsLabels.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public final class Labels extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ArtsLabels.Labels {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -1260668162;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return Labels.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public String getLabelDisplayValue() {
                            return A07("label_display_value");
                        }

                        public String getLabelType() {
                            return A08("label_type");
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                            return AnonymousClass7TG.A0V(r2, AnonymousClass7TE.A0f(r2, "label_display_value"), "label_type");
                        }

                        public Labels(int i) {
                            super(i);
                        }

                        public Labels() {
                            super(TYPE_TAG);
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public ImmutableList getLabels() {
                        return getOptionalCompactedTreeListField(0, "labels", Labels.class, Labels.TYPE_TAG);
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        int i = Labels.TYPE_TAG;
                        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Labels.class, "labels", i);
                    }

                    public ArtsLabels(int i) {
                        super(i);
                    }

                    public ArtsLabels() {
                        super(TYPE_TAG);
                    }
                }

                public final class CheckoutProperties extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 586985188;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return CheckoutProperties.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public final class CurrencyAmount extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.CurrencyAmount {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -258945771;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return CurrencyAmount.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public String getAmount() {
                            return A07("amount");
                        }

                        public String getAmountWithOffset() {
                            return A08("amount_with_offset");
                        }

                        public String getCurrency() {
                            return A09("currency");
                        }

                        public boolean hasOffset() {
                            return hasFieldValue("offset");
                        }

                        public CurrencyAmount(int i) {
                            super(i);
                        }

                        public int getOffset() {
                            return C41847B3o.A02(this);
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            return C41848B3p.A0v();
                        }

                        public CurrencyAmount() {
                            super(TYPE_TAG);
                        }
                    }

                    public final class ShippingAndReturn extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 176533538;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return ShippingAndReturn.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public final class ReturnCost extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn.ReturnCost {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = 169023367;

                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return ReturnCost.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            public String getAmount() {
                                return A07("amount");
                            }

                            public String getAmountWithOffset() {
                                return A08("amount_with_offset");
                            }

                            public String getCurrency() {
                                return A09("currency");
                            }

                            public boolean hasOffset() {
                                return hasFieldValue("offset");
                            }

                            public ReturnCost(int i) {
                                super(i);
                            }

                            public int getOffset() {
                                return C41847B3o.A02(this);
                            }

                            public AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A0v();
                            }

                            public ReturnCost() {
                                super(TYPE_TAG);
                            }
                        }

                        public final class ShippingCost extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn.ShippingCost {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -435033297;

                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return ShippingCost.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            public String getAmount() {
                                return A07("amount");
                            }

                            public String getAmountWithOffset() {
                                return A08("amount_with_offset");
                            }

                            public String getCurrency() {
                                return A09("currency");
                            }

                            public boolean hasOffset() {
                                return hasFieldValue("offset");
                            }

                            public ShippingCost(int i) {
                                super(i);
                            }

                            public int getOffset() {
                                return C41847B3o.A02(this);
                            }

                            public AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A0v();
                            }

                            public ShippingCost() {
                                super(TYPE_TAG);
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn.ReturnCost getReturnCost() {
                            return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn.ReturnCost) A03(ReturnCost.class, "return_cost", ReturnCost.TYPE_TAG);
                        }

                        public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn.ShippingCost getShippingCost() {
                            return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn.ShippingCost) A02(ShippingCost.class, "shipping_cost", ShippingCost.TYPE_TAG);
                        }

                        public String getShippingCostStripped() {
                            return A09("shipping_cost_stripped");
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            return AnonymousClass7TG.A0U(AnonymousClass4Kz.A00, C41845B3m.A0C(ReturnCost.class, "return_cost", ReturnCost.TYPE_TAG), C41845B3m.A0C(ShippingCost.class, "shipping_cost", ShippingCost.TYPE_TAG), "shipping_cost_stripped");
                        }

                        public ShippingAndReturn(int i) {
                            super(i);
                        }

                        public ShippingAndReturn() {
                            super(TYPE_TAG);
                        }
                    }

                    public boolean getCanAddToBag() {
                        return getCoercedBooleanField(0, "can_add_to_bag");
                    }

                    public boolean getCanEnableRestockReminder() {
                        return getCoercedBooleanField(1, "can_enable_restock_reminder");
                    }

                    public int getFullInventoryQuantity() {
                        return getCoercedIntField(3, "full_inventory_quantity");
                    }

                    public boolean getHasFreeShipping() {
                        return getCoercedBooleanField(4, "has_free_shipping");
                    }

                    public int getInventoryQuantity() {
                        return getCoercedIntField(6, "inventory_quantity");
                    }

                    public boolean isShopifyMerchant() {
                        return getCoercedBooleanField(7, "is_shopify_merchant");
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.CurrencyAmount getCurrencyAmount() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.CurrencyAmount) A04(CurrencyAmount.class, "currency_amount", CurrencyAmount.TYPE_TAG);
                    }

                    public String getIgReferrerFbid() {
                        return A0C("ig_referrer_fbid");
                    }

                    public boolean getProductGroupHasInventory() {
                        return getCoercedBooleanField(8, "product_group_has_inventory");
                    }

                    public String getReceiverId() {
                        return getOptionalStringField(9, "receiver_id");
                    }

                    public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn getShippingAndReturn() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties.ShippingAndReturn) getOptionalTreeField(10, "shipping_and_return", ShippingAndReturn.class, ShippingAndReturn.TYPE_TAG);
                    }

                    public int getViewerPurchaseLimit() {
                        return getCoercedIntField(11, "viewer_purchase_limit");
                    }

                    public boolean hasCanAddToBag() {
                        return hasFieldValue("can_add_to_bag");
                    }

                    public boolean hasCanEnableRestockReminder() {
                        return hasFieldValue("can_enable_restock_reminder");
                    }

                    public boolean hasFullInventoryQuantity() {
                        return hasFieldValue("full_inventory_quantity");
                    }

                    public boolean hasHasFreeShipping() {
                        return hasFieldValue("has_free_shipping");
                    }

                    public boolean hasInventoryQuantity() {
                        return hasFieldValue("inventory_quantity");
                    }

                    public boolean hasIsShopifyMerchant() {
                        return hasFieldValue("is_shopify_merchant");
                    }

                    public boolean hasProductGroupHasInventory() {
                        return hasFieldValue("product_group_has_inventory");
                    }

                    public boolean hasViewerPurchaseLimit() {
                        return hasFieldValue("viewer_purchase_limit");
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4LF r2 = AnonymousClass4LF.A00;
                        AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r2, "can_add_to_bag");
                        AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r2, "can_enable_restock_reminder");
                        AnonymousClass4Kp A0C = C41845B3m.A0C(CurrencyAmount.class, "currency_amount", CurrencyAmount.TYPE_TAG);
                        AnonymousClass4L8 r3 = AnonymousClass4L8.A00;
                        AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r3, "full_inventory_quantity");
                        AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r2, "has_free_shipping");
                        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                        return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, A0C, A0f3, A0f4, AnonymousClass7TE.A0f(r1, "ig_referrer_fbid"), AnonymousClass7TE.A0f(r3, "inventory_quantity"), AnonymousClass7TE.A0f(r2, "is_shopify_merchant"), AnonymousClass7TE.A0f(r2, "product_group_has_inventory"), AnonymousClass7TE.A0f(r1, "receiver_id"), C41845B3m.A0C(ShippingAndReturn.class, "shipping_and_return", ShippingAndReturn.TYPE_TAG), AnonymousClass7TE.A0f(r3, "viewer_purchase_limit")});
                    }

                    public CheckoutProperties(int i) {
                        super(i);
                    }

                    public CheckoutProperties() {
                        super(TYPE_TAG);
                    }
                }

                public final class CommerceReviewStatistics extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CommerceReviewStatistics {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 1987092231;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return CommerceReviewStatistics.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public double getAverageRating() {
                        return getCoercedDoubleField(0, "average_rating");
                    }

                    public int getReviewCount() {
                        return getCoercedIntField(1, "review_count");
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public boolean hasAverageRating() {
                        return hasFieldValue("average_rating");
                    }

                    public boolean hasReviewCount() {
                        return hasFieldValue("review_count");
                    }

                    public CommerceReviewStatistics(int i) {
                        super(i);
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        return AnonymousClass7TG.A0V(AnonymousClass4L8.A00, C41848B3p.A0B(), "review_count");
                    }

                    public CommerceReviewStatistics() {
                        super(TYPE_TAG);
                    }
                }

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return Product.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public final class DiscountInformation extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.DiscountInformation {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -1281192883;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return DiscountInformation.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public final class Discounts extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.DiscountInformation.Discounts {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -1049786104;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return Discounts.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public String getId() {
                            return C41847B3o.A1A(this, PublicKeyCredentialControllerUtility.JSON_KEY_ID, 2);
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public String getCtaText() {
                            return A07("cta_text");
                        }

                        public String getDescription() {
                            return A08(DevServerEntity.COLUMN_DESCRIPTION);
                        }

                        public String getName() {
                            return A0A(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                        }

                        public String getSeeDetailsText() {
                            return A0B("see_details_text");
                        }

                        public Discounts(int i) {
                            super(i);
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            return C41848B3p.A12();
                        }

                        public Discounts() {
                            super(TYPE_TAG);
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public ImmutableList getDiscounts() {
                        return getOptionalCompactedTreeListField(0, "discounts", Discounts.class, Discounts.TYPE_TAG);
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        int i = Discounts.TYPE_TAG;
                        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Discounts.class, "discounts", i);
                    }

                    public DiscountInformation(int i) {
                        super(i);
                    }

                    public DiscountInformation() {
                        super(TYPE_TAG);
                    }
                }

                public final class ImageQualityMetadata extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ImageQualityMetadata {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -43509148;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return ImageQualityMetadata.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public final class Goodness extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ImageQualityMetadata.Goodness {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 2077816305;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return Goodness.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public double getScore() {
                            return getCoercedDoubleField(1, "score");
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public String getId() {
                            return A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        }

                        public boolean hasScore() {
                            return hasFieldValue("score");
                        }

                        public Goodness(int i) {
                            super(i);
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            return C41848B3p.A0r();
                        }

                        public Goodness() {
                            super(TYPE_TAG);
                        }
                    }

                    public final class LifestyleBackground extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ImageQualityMetadata.LifestyleBackground {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 1644851718;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return LifestyleBackground.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public double getScore() {
                            return getCoercedDoubleField(1, "score");
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public String getId() {
                            return A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                        }

                        public boolean hasScore() {
                            return hasFieldValue("score");
                        }

                        public LifestyleBackground(int i) {
                            super(i);
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            return C41848B3p.A0r();
                        }

                        public LifestyleBackground() {
                            super(TYPE_TAG);
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public ImmutableList getGoodness() {
                        return getOptionalCompactedTreeListField(0, "goodness", Goodness.class, Goodness.TYPE_TAG);
                    }

                    public ImmutableList getLifestyleBackground() {
                        return getOptionalCompactedTreeListField(1, "lifestyle_background", LifestyleBackground.class, LifestyleBackground.TYPE_TAG);
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        int i = LifestyleBackground.TYPE_TAG;
                        return C41847B3o.A0i(AnonymousClass4Ks.A00(), C41848B3p.A07(Goodness.class, Goodness.TYPE_TAG), LifestyleBackground.class, "lifestyle_background", i);
                    }

                    public ImageQualityMetadata(int i) {
                        super(i);
                    }

                    public ImageQualityMetadata() {
                        super(TYPE_TAG);
                    }
                }

                public final class MainImage extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.MainImage {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = -1340235326;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return MainImage.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public final class ImageVersions2 extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.MainImage.ImageVersions2 {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = 1124116630;

                        public final class Candidates extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.MainImage.ImageVersions2.Candidates {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -2111316906;

                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return Candidates.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            public String getUrl() {
                                return A08("url");
                            }

                            public int getWidth() {
                                return A00(IgReactMediaPickerNativeModule.WIDTH);
                            }

                            public boolean hasHeight() {
                                return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
                            }

                            public boolean hasWidth() {
                                return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
                            }

                            public Candidates(int i) {
                                super(i);
                            }

                            public int getHeight() {
                                return C41847B3o.A01(this);
                            }

                            public AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A0s();
                            }

                            public Candidates() {
                                super(TYPE_TAG);
                            }
                        }

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return ImageVersions2.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public ImmutableList getCandidates() {
                            return getOptionalCompactedTreeListField(0, "candidates", Candidates.class, Candidates.TYPE_TAG);
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            int i = Candidates.TYPE_TAG;
                            return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Candidates.class, "candidates", i);
                        }

                        public ImageVersions2(int i) {
                            super(i);
                        }

                        public ImageVersions2() {
                            super(TYPE_TAG);
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.MainImage.ImageVersions2 getImageVersions2() {
                        C250663lr A05 = A05(ImageVersions2.class, "image_versions2", ImageVersions2.TYPE_TAG);
                        0qQ.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.ProductTags.In.Product.MainImage.ImageVersions2");
                        return (ImageVersions2) A05;
                    }

                    public String getPreview() {
                        return A08("preview");
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        int i = ImageVersions2.TYPE_TAG;
                        return C41848B3p.A13(AnonymousClass4Ks.A01(), ImageVersions2.class, i);
                    }

                    public MainImage(int i) {
                        super(i);
                    }

                    public MainImage() {
                        super(TYPE_TAG);
                    }
                }

                public final class Merchant extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.Merchant {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 772960972;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return Merchant.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public boolean getDisabledSharingProductsToGuides() {
                        return getCoercedBooleanField(0, "disabled_sharing_products_to_guides");
                    }

                    public String getUsername() {
                        return C41847B3o.A19(this, 6);
                    }

                    public boolean isVerified() {
                        return C41847B3o.A1b(this, 2);
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public String getId() {
                        return A08("strong_id__");
                    }

                    public String getPk() {
                        return A0A("pk");
                    }

                    public String getProfilePicUrl() {
                        return A0B("profile_pic_url");
                    }

                    public String getStorefrontAttributionUsername() {
                        return A0C("storefront_attribution_username");
                    }

                    public boolean hasDisabledSharingProductsToGuides() {
                        return hasFieldValue("disabled_sharing_products_to_guides");
                    }

                    public Merchant(int i) {
                        super(i);
                    }

                    public boolean hasIsVerified() {
                        return C41847B3o.A1a(this);
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        return C41849B3q.A0B();
                    }

                    public Merchant() {
                        super(TYPE_TAG);
                    }
                }

                public final class RichTextDescription extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.RichTextDescription {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 1948255702;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return RichTextDescription.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public final class TextWithEntities extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.RichTextDescription.TextWithEntities {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -322251666;

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return TextWithEntities.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public final class InlineStyleRanges extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.RichTextDescription.TextWithEntities.InlineStyleRanges {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = 245676503;

                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return InlineStyleRanges.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            public int getInlineStyle() {
                                return getCoercedIntField(0, "inline_style");
                            }

                            public int getLength() {
                                return getCoercedIntField(1, "length");
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            public int getOffset() {
                                return A00("offset");
                            }

                            public boolean hasInlineStyle() {
                                return hasFieldValue("inline_style");
                            }

                            public boolean hasLength() {
                                return hasFieldValue("length");
                            }

                            public boolean hasOffset() {
                                return hasFieldValue("offset");
                            }

                            public InlineStyleRanges(int i) {
                                super(i);
                            }

                            public AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A0t();
                            }

                            public InlineStyleRanges() {
                                super(TYPE_TAG);
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public ImmutableList getInlineStyleRanges() {
                            return getOptionalCompactedTreeListField(0, "inline_style_ranges", InlineStyleRanges.class, InlineStyleRanges.TYPE_TAG);
                        }

                        public String getText() {
                            return A08("text");
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            int i = InlineStyleRanges.TYPE_TAG;
                            return AnonymousClass7TG.A0V(AnonymousClass4Kz.A00, C41845B3m.A0A(AnonymousClass4Ks.A00(), InlineStyleRanges.class, "inline_style_ranges", i), "text");
                        }

                        public TextWithEntities(int i) {
                            super(i);
                        }

                        public TextWithEntities() {
                            super(TYPE_TAG);
                        }
                    }

                    public int getDepth() {
                        return getCoercedIntField(1, "depth");
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public String getBlockType() {
                        return A07("block_type");
                    }

                    public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.RichTextDescription.TextWithEntities getTextWithEntities() {
                        return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.RichTextDescription.TextWithEntities) A04(TextWithEntities.class, "text_with_entities", TextWithEntities.TYPE_TAG);
                    }

                    public boolean hasDepth() {
                        return hasFieldValue("depth");
                    }

                    public RichTextDescription(int i) {
                        super(i);
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        return C41847B3o.A0k(C41848B3p.A0F(), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "depth"), TextWithEntities.class, "text_with_entities", TextWithEntities.TYPE_TAG);
                    }

                    public RichTextDescription() {
                        super(TYPE_TAG);
                    }
                }

                public final class SellerBadge extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.SellerBadge {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 1525513323;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return SellerBadge.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public String getDescription() {
                        return A07(DevServerEntity.COLUMN_DESCRIPTION);
                    }

                    public String getName() {
                        return A08(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                    }

                    public C48115EWh getType() {
                        return (C48115EWh) getOptionalEnumField(2, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, C48115EWh.A02);
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                        return AnonymousClass7TG.A0U(r3, C41847B3o.A0U(r3), C41845B3m.A0G(r3), PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    }

                    public SellerBadge(int i) {
                        super(i);
                    }

                    public SellerBadge() {
                        super(TYPE_TAG);
                    }
                }

                public final class ThumbnailImage extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ThumbnailImage {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 168849196;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return ThumbnailImage.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public final class ImageVersions2 extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ThumbnailImage.ImageVersions2 {
                        public static final Companion Companion = new Object();
                        public static final int TYPE_TAG = -331877511;

                        public final class Candidates extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ThumbnailImage.ImageVersions2.Candidates {
                            public static final Companion Companion = new Object();
                            public static final int TYPE_TAG = -1670524483;

                            public final class Companion {
                                public static /* synthetic */ void getTYPE_TAG$annotations() {
                                }

                                public final int getTYPE_TAG() {
                                    return Candidates.TYPE_TAG;
                                }

                                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                                }

                                public Companion() {
                                }
                            }

                            public static final int getTYPE_TAG() {
                                return TYPE_TAG;
                            }

                            public String getUrl() {
                                return A08("url");
                            }

                            public int getWidth() {
                                return A00(IgReactMediaPickerNativeModule.WIDTH);
                            }

                            public boolean hasHeight() {
                                return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
                            }

                            public boolean hasWidth() {
                                return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
                            }

                            public Candidates(int i) {
                                super(i);
                            }

                            public int getHeight() {
                                return C41847B3o.A01(this);
                            }

                            public AnonymousClass4Kx modelSelectionSet() {
                                return C41848B3p.A0s();
                            }

                            public Candidates() {
                                super(TYPE_TAG);
                            }
                        }

                        public final class Companion {
                            public static /* synthetic */ void getTYPE_TAG$annotations() {
                            }

                            public final int getTYPE_TAG() {
                                return ImageVersions2.TYPE_TAG;
                            }

                            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                            }

                            public Companion() {
                            }
                        }

                        public static final int getTYPE_TAG() {
                            return TYPE_TAG;
                        }

                        public ImmutableList getCandidates() {
                            return getOptionalCompactedTreeListField(0, "candidates", Candidates.class, Candidates.TYPE_TAG);
                        }

                        public AnonymousClass4Kx modelSelectionSet() {
                            int i = Candidates.TYPE_TAG;
                            return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), Candidates.class, "candidates", i);
                        }

                        public ImageVersions2(int i) {
                            super(i);
                        }

                        public ImageVersions2() {
                            super(TYPE_TAG);
                        }
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ThumbnailImage.ImageVersions2 getImageVersions2() {
                        C250663lr A05 = A05(ImageVersions2.class, "image_versions2", ImageVersions2.TYPE_TAG);
                        0qQ.A0C(A05, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.ProductTags.In.Product.ThumbnailImage.ImageVersions2");
                        return (ImageVersions2) A05;
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        int i = ImageVersions2.TYPE_TAG;
                        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A01(), ImageVersions2.class, "image_versions2", i);
                    }

                    public ThumbnailImage(int i) {
                        super(i);
                    }

                    public ThumbnailImage() {
                        super(TYPE_TAG);
                    }
                }

                public boolean getCanShareToStory() {
                    return getCoercedBooleanField(2, "can_share_to_story");
                }

                public boolean getCanViewerSeeRnr() {
                    return getCoercedBooleanField(3, "can_viewer_see_rnr");
                }

                public String getCompoundProductId() {
                    return getOptionalStringField(7, "compound_product_id");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.AggregatedRating getAggregatedRating() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.AggregatedRating) A03(AggregatedRating.class, "aggregated_rating", AggregatedRating.TYPE_TAG);
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ArtsLabels getArtsLabels() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ArtsLabels) A02(ArtsLabels.class, "arts_labels", ArtsLabels.TYPE_TAG);
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties getCheckoutProperties() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CheckoutProperties) getOptionalTreeField(4, "checkout_properties", CheckoutProperties.class, CheckoutProperties.TYPE_TAG);
                }

                public C48109EWb getCheckoutStyle() {
                    return (C48109EWb) getOptionalEnumField(5, "checkout_style", C48109EWb.A02);
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CommerceReviewStatistics getCommerceReviewStatistics() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.CommerceReviewStatistics) getOptionalTreeField(6, "commerce_review_statistics", CommerceReviewStatistics.class, CommerceReviewStatistics.TYPE_TAG);
                }

                public String getCurrentPrice() {
                    return A0D("current_price");
                }

                public String getCurrentPriceAmount() {
                    return getOptionalStringField(9, "current_price_amount");
                }

                public String getCurrentPriceStripped() {
                    return getOptionalStringField(10, "current_price_stripped");
                }

                public String getDescription() {
                    return getOptionalStringField(11, DevServerEntity.COLUMN_DESCRIPTION);
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.DiscountInformation getDiscountInformation() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.DiscountInformation) getOptionalTreeField(12, "discount_information", DiscountInformation.class, DiscountInformation.TYPE_TAG);
                }

                public String getExternalUrl() {
                    return getOptionalStringField(13, "external_url");
                }

                public String getFullPrice() {
                    return getOptionalStringField(14, "full_price");
                }

                public String getFullPriceAmount() {
                    return getOptionalStringField(15, "full_price_amount");
                }

                public String getFullPriceStripped() {
                    return getOptionalStringField(16, "full_price_stripped");
                }

                public boolean getHasVariants() {
                    return getCoercedBooleanField(17, "has_variants");
                }

                public boolean getHasViewerSaved() {
                    return getCoercedBooleanField(18, "has_viewer_saved");
                }

                public boolean getIgIsProductEditableOnMobile() {
                    return getCoercedBooleanField(19, "ig_is_product_editable_on_mobile");
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ImageQualityMetadata getImageQualityMetadata() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ImageQualityMetadata) getOptionalTreeField(20, "image_quality_metadata", ImageQualityMetadata.class, ImageQualityMetadata.TYPE_TAG);
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.MainImage getMainImage() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.MainImage) getOptionalTreeField(23, "main_image", MainImage.class, MainImage.TYPE_TAG);
                }

                public String getMainImageId() {
                    return getOptionalStringField(24, "main_image_id");
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.Merchant getMerchant() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.Merchant) getOptionalTreeField(25, "merchant", Merchant.class, Merchant.TYPE_TAG);
                }

                public String getName() {
                    return getOptionalStringField(26, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                }

                public String getPrice() {
                    return getOptionalStringField(27, "price");
                }

                public String getProductId() {
                    return getOptionalStringField(28, "product_id");
                }

                public String getRetailerId() {
                    return getOptionalStringField(29, "retailer_id");
                }

                public String getReviewStatus() {
                    return getOptionalStringField(30, "review_status");
                }

                public ImmutableList getRichTextDescription() {
                    return getOptionalCompactedTreeListField(31, "rich_text_description", RichTextDescription.class, RichTextDescription.TYPE_TAG);
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.SellerBadge getSellerBadge() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.SellerBadge) getOptionalTreeField(32, "seller_badge", SellerBadge.class, SellerBadge.TYPE_TAG);
                }

                public RGP getSizeCalibrationScore() {
                    return (RGP) getOptionalEnumField(33, "size_calibration_score", RGP.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ThumbnailImage getThumbnailImage() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product.ThumbnailImage) getOptionalTreeField(34, "thumbnail_image", ThumbnailImage.class, ThumbnailImage.TYPE_TAG);
                }

                public boolean hasCanShareToStory() {
                    return hasFieldValue("can_share_to_story");
                }

                public boolean hasCanViewerSeeRnr() {
                    return hasFieldValue("can_viewer_see_rnr");
                }

                public boolean hasHasVariants() {
                    return hasFieldValue("has_variants");
                }

                public boolean hasHasViewerSaved() {
                    return hasFieldValue("has_viewer_saved");
                }

                public boolean hasIgIsProductEditableOnMobile() {
                    return hasFieldValue("ig_is_product_editable_on_mobile");
                }

                public boolean hasIsEnteredInDrawing() {
                    return hasFieldValue("is_entered_in_drawing");
                }

                public boolean hasIsInStock() {
                    return hasFieldValue("is_in_stock");
                }

                public boolean isEnteredInDrawing() {
                    return getCoercedBooleanField(21, "is_entered_in_drawing");
                }

                public boolean isInStock() {
                    return getCoercedBooleanField(22, "is_in_stock");
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kr[] r5 = new AnonymousClass4Kr[35];
                    AnonymousClass4Kp A0C = C41845B3m.A0C(AggregatedRating.class, "aggregated_rating", AggregatedRating.TYPE_TAG);
                    AnonymousClass4Kp A0C2 = C41845B3m.A0C(ArtsLabels.class, "arts_labels", ArtsLabels.TYPE_TAG);
                    AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                    AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "can_share_to_story");
                    AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r1, "can_viewer_see_rnr");
                    AnonymousClass4Kp A0C3 = C41845B3m.A0C(CheckoutProperties.class, "checkout_properties", CheckoutProperties.TYPE_TAG);
                    AnonymousClass4Kz r0 = AnonymousClass4Kz.A00;
                    boolean A1X = AnonymousClass7TF.A1X(new AnonymousClass4Kr[]{A0C, A0C2, A0f, A0f2, A0C3, AnonymousClass7TE.A0f(r0, "checkout_style"), C41845B3m.A0C(CommerceReviewStatistics.class, "commerce_review_statistics", CommerceReviewStatistics.TYPE_TAG), AnonymousClass7TE.A0f(r0, "compound_product_id"), AnonymousClass7TE.A0f(r0, "current_price"), AnonymousClass7TE.A0f(r0, "current_price_amount"), AnonymousClass7TE.A0f(r0, "current_price_stripped"), C41847B3o.A0U(r0), C41845B3m.A0C(DiscountInformation.class, "discount_information", DiscountInformation.TYPE_TAG), C41847B3o.A0f(r0), AnonymousClass7TE.A0f(r0, "full_price"), AnonymousClass7TE.A0f(r0, "full_price_amount"), AnonymousClass7TE.A0f(r0, "full_price_stripped"), C41847B3o.A0e(r1), C41846B3n.A0E(r1), AnonymousClass7TE.A0f(r1, "ig_is_product_editable_on_mobile"), C41845B3m.A0C(ImageQualityMetadata.class, "image_quality_metadata", ImageQualityMetadata.TYPE_TAG), AnonymousClass7TE.A0f(r1, "is_entered_in_drawing"), C41847B3o.A0W(r1), C41845B3m.A0C(MainImage.class, "main_image", MainImage.TYPE_TAG), AnonymousClass7TE.A0f(r0, "main_image_id"), C41845B3m.A0C(Merchant.class, "merchant", Merchant.TYPE_TAG), C41845B3m.A0G(r0)}, r5);
                    AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r0, "price");
                    AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r0, "product_id");
                    AnonymousClass4L7 A0f5 = AnonymousClass7TE.A0f(r0, "retailer_id");
                    AnonymousClass4L7 A0f6 = AnonymousClass7TE.A0f(r0, "review_status");
                    int i = RichTextDescription.TYPE_TAG;
                    return C41846B3n.A0N(new AnonymousClass4Kr[]{A0f3, A0f4, A0f5, A0f6, C41845B3m.A0A(AnonymousClass4Ks.A00(), RichTextDescription.class, "rich_text_description", i), C41845B3m.A0C(SellerBadge.class, "seller_badge", SellerBadge.TYPE_TAG), AnonymousClass7TE.A0f(r0, "size_calibration_score"), C41845B3m.A0C(ThumbnailImage.class, "thumbnail_image", ThumbnailImage.TYPE_TAG)}, r5, A1X ? 1 : 0, 27, 8);
                }

                public Product(int i) {
                    super(i);
                }

                public Product() {
                    super(TYPE_TAG);
                }
            }

            public int getDestination() {
                return getCoercedIntField(0, "destination");
            }

            public boolean isRemovable() {
                return getCoercedBooleanField(1, "is_removable");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product getProduct() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags.In.Product) A04(Product.class, "product", Product.TYPE_TAG);
            }

            public boolean hasDestination() {
                return hasFieldValue("destination");
            }

            public boolean hasIsRemovable() {
                return hasFieldValue("is_removable");
            }

            public AnonymousClass4Kx modelSelectionSet() {
                return C41847B3o.A0k(AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "destination"), AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "is_removable"), Product.class, "product", Product.TYPE_TAG);
            }

            public In(int i) {
                super(i);
            }

            public In() {
                super(TYPE_TAG);
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public ImmutableList getIn() {
            return getOptionalCompactedTreeListField(0, "in", In.class, In.TYPE_TAG);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            int i = In.TYPE_TAG;
            return AnonymousClass7TG.A0T(AnonymousClass4Ks.A00(), In.class, "in", i);
        }

        public ProductTags(int i) {
            super(i);
        }

        public ProductTags() {
            super(TYPE_TAG);
        }
    }

    public final class Senders extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.Senders {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 71278224;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return Senders.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public String getProfilePicUrl() {
            return A08("profile_pic_url");
        }

        public AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
            return AnonymousClass7TG.A0V(r2, AnonymousClass7TF.A0I(r2), "profile_pic_url");
        }

        public Senders(int i) {
            super(i);
        }

        public String getId() {
            return C41845B3m.A0k(this);
        }

        public Senders() {
            super(TYPE_TAG);
        }
    }

    public final class SharingFrictionInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.SharingFrictionInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1112720082;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return SharingFrictionInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public boolean getShouldHaveSharingFriction() {
            return getRequiredBooleanField(0, "should_have_sharing_friction");
        }

        public boolean hasShouldHaveSharingFriction() {
            return true;
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public SharingFrictionInfo(int i) {
            super(i);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0W(C41846B3n.A0J(), "should_have_sharing_friction");
        }

        public SharingFrictionInfo() {
            super(TYPE_TAG);
        }
    }

    public final class SocialContext extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.SocialContext {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1497203581;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return SocialContext.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final class SocialContextFacepileUsers extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.SocialContext.SocialContextFacepileUsers {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 1776589540;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return SocialContextFacepileUsers.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public String getProfilePicId() {
                return getOptionalStringField(6, "profile_pic_id");
            }

            public String getProfilePicUrl() {
                return getOptionalStringField(7, "profile_pic_url");
            }

            public boolean isPrivate() {
                return getCoercedBooleanField(2, "is_private");
            }

            public boolean isVerified() {
                return C41847B3o.A1b(this, 3);
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public String getFullName() {
                return A07("full_name");
            }

            public String getId() {
                return A08("strong_id__");
            }

            public String getPk() {
                return A0B("pk");
            }

            public String getPkId() {
                return A0C("pk_id");
            }

            public boolean hasIsPrivate() {
                return hasFieldValue("is_private");
            }

            public SocialContextFacepileUsers(int i) {
                super(i);
            }

            public String getUsername() {
                return A0D(AnonymousClass9PN.A00());
            }

            public boolean hasIsVerified() {
                return C41847B3o.A1a(this);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                return C41849B3q.A0A();
            }

            public SocialContextFacepileUsers() {
                super(TYPE_TAG);
            }
        }

        public int getSocialContextUsersCount() {
            return getRequiredIntField(2, "social_context_users_count");
        }

        public boolean hasSocialContextUsersCount() {
            return true;
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public ImmutableList getSocialContextFacepileUsers() {
            return A06(SocialContextFacepileUsers.class, "social_context_facepile_users", SocialContextFacepileUsers.TYPE_TAG);
        }

        public HNA getSocialContextType() {
            return (HNA) C41847B3o.A10(this, HNA.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "social_context_type", 1);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            int i = SocialContextFacepileUsers.TYPE_TAG;
            return AnonymousClass7TG.A0U(C41845B3m.A0R(), C41845B3m.A0A(AnonymousClass4Ks.A02(), SocialContextFacepileUsers.class, "social_context_facepile_users", i), AnonymousClass7TE.A0f(C41845B3m.A0P(), "social_context_type"), "social_context_users_count");
        }

        public SocialContext(int i) {
            super(i);
        }

        public SocialContext() {
            super(TYPE_TAG);
        }
    }

    public final class SponsorTags extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -488033090;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return SponsorTags.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final class Sponsor extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags.Sponsor {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -537744653;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return Sponsor.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public boolean getHasOnboardedToTextPostApp() {
                return getCoercedBooleanField(1, "has_onboarded_to_text_post_app");
            }

            public String getPk() {
                return getOptionalStringField(6, "pk");
            }

            public String getPkId() {
                return getOptionalStringField(7, "pk_id");
            }

            public boolean isPrivate() {
                return getCoercedBooleanField(3, "is_private");
            }

            public boolean isUnpublished() {
                return getCoercedBooleanField(4, "is_unpublished");
            }

            public boolean isVerified() {
                return C41847B3o.A1b(this, 5);
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public String getFullName() {
                return A07("full_name");
            }

            public String getId() {
                return A09("strong_id__");
            }

            public String getProfilePicId() {
                return A0D("profile_pic_id");
            }

            public String getProfilePicUrl() {
                return getOptionalStringField(9, "profile_pic_url");
            }

            public String getUsername() {
                return C41847B3o.A19(this, 10);
            }

            public boolean hasHasOnboardedToTextPostApp() {
                return hasFieldValue("has_onboarded_to_text_post_app");
            }

            public boolean hasIsPrivate() {
                return hasFieldValue("is_private");
            }

            public boolean hasIsUnpublished() {
                return hasFieldValue("is_unpublished");
            }

            public AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0N = C41845B3m.A0N(r2);
                AnonymousClass4LF r1 = AnonymousClass4LF.A00;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0N, C41847B3o.A0F(r1), AnonymousClass7TF.A0I(r2), C41847B3o.A0c(r1), AnonymousClass7TE.A0f(r1, "is_unpublished"), C41846B3n.A0H(r1), C41845B3m.A0E(r2), C41847B3o.A0Z(r2), C41847B3o.A0d(r2), C41845B3m.A0D(r2), C41847B3o.A0T(r2)});
            }

            public Sponsor(int i) {
                super(i);
            }

            public boolean hasIsVerified() {
                return C41847B3o.A1a(this);
            }

            public Sponsor() {
                super(TYPE_TAG);
            }
        }

        public boolean getPermission() {
            return getCoercedBooleanField(1, "permission");
        }

        public boolean isPending() {
            return getCoercedBooleanField(0, "is_pending");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.SponsorTags.Sponsor getSponsor() {
            C250663lr requiredTreeField = getRequiredTreeField(2, "sponsor", Sponsor.class, Sponsor.TYPE_TAG);
            0qQ.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.SponsorTags.Sponsor");
            return (Sponsor) requiredTreeField;
        }

        public boolean hasIsPending() {
            return hasFieldValue("is_pending");
        }

        public boolean hasPermission() {
            return hasFieldValue("permission");
        }

        public AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4LF r1 = AnonymousClass4LF.A00;
            AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "is_pending");
            AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r1, "permission");
            int i = Sponsor.TYPE_TAG;
            return C41846B3n.A0K(A0f, A0f2, C41845B3m.A0A(AnonymousClass4Ks.A01(), Sponsor.class, "sponsor", i));
        }

        public SponsorTags(int i) {
            super(i);
        }

        public SponsorTags() {
            super(TYPE_TAG);
        }
    }

    public final class StoryPolls extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1045589405;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return StoryPolls.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final class PollSticker extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -52606389;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return PollSticker.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public final class Tallies extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker.Tallies {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 954228534;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return Tallies.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public int getCount() {
                    return getCoercedIntField(0, "count");
                }

                public double getFontSize() {
                    return getCoercedDoubleField(1, "font_size");
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public String getText() {
                    return A09("text");
                }

                public boolean hasCount() {
                    return hasFieldValue("count");
                }

                public boolean hasFontSize() {
                    return hasFieldValue("font_size");
                }

                public Tallies(int i) {
                    super(i);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return AnonymousClass7TG.A0U(AnonymousClass4Kz.A00, C41846B3n.A03(), AnonymousClass7TE.A0f(C342787pA.A00, "font_size"), "text");
                }

                public Tallies() {
                    super(TYPE_TAG);
                }
            }

            public boolean getFinished() {
                return getCoercedBooleanField(1, "finished");
            }

            public String getPollType() {
                return getOptionalStringField(6, "poll_type");
            }

            public String getQuestion() {
                return getOptionalStringField(7, "question");
            }

            public boolean isMultiOptionPoll() {
                return getCoercedBooleanField(3, "is_multi_option_poll");
            }

            public boolean isSharedResult() {
                return getCoercedBooleanField(4, "is_shared_result");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public String getColor() {
                return A07("color");
            }

            public String getId() {
                return A09(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            }

            public String getPollId() {
                return A0C("poll_id");
            }

            public ImmutableList getTallies() {
                return getOptionalCompactedTreeListField(8, "tallies", Tallies.class, Tallies.TYPE_TAG);
            }

            public boolean getViewerCanVote() {
                return getCoercedBooleanField(9, "viewer_can_vote");
            }

            public int getViewerVote() {
                return getCoercedIntField(10, "viewer_vote");
            }

            public boolean hasFinished() {
                return hasFieldValue("finished");
            }

            public boolean hasIsMultiOptionPoll() {
                return hasFieldValue("is_multi_option_poll");
            }

            public boolean hasIsSharedResult() {
                return hasFieldValue("is_shared_result");
            }

            public boolean hasViewerCanVote() {
                return hasFieldValue("viewer_can_vote");
            }

            public boolean hasViewerVote() {
                return hasFieldValue("viewer_vote");
            }

            public AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r1, "color");
                AnonymousClass4LF r4 = AnonymousClass4LF.A00;
                AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r4, "finished");
                AnonymousClass4L7 A0I = AnonymousClass7TF.A0I(r1);
                AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r4, "is_multi_option_poll");
                AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r4, "is_shared_result");
                AnonymousClass4L7 A0f5 = AnonymousClass7TE.A0f(r1, "poll_id");
                AnonymousClass4L7 A0f6 = AnonymousClass7TE.A0f(r1, "poll_type");
                AnonymousClass4L7 A0f7 = AnonymousClass7TE.A0f(r1, "question");
                int i = Tallies.TYPE_TAG;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0f, A0f2, A0I, A0f3, A0f4, A0f5, A0f6, A0f7, C41845B3m.A0A(AnonymousClass4Ks.A00(), Tallies.class, "tallies", i), AnonymousClass7TE.A0f(r4, "viewer_can_vote"), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "viewer_vote")});
            }

            public PollSticker(int i) {
                super(i);
            }

            public PollSticker() {
                super(TYPE_TAG);
            }
        }

        public double getEndTimeMs() {
            return getCoercedDoubleField(0, "end_time_ms");
        }

        public double getHeight() {
            return getCoercedDoubleField(1, IgReactMediaPickerNativeModule.HEIGHT);
        }

        public double getRotation() {
            return getCoercedDoubleField(7, "rotation");
        }

        public int isHidden() {
            return getCoercedIntField(3, "is_hidden");
        }

        public int isPinned() {
            return getCoercedIntField(4, "is_pinned");
        }

        public int isSticker() {
            return getCoercedIntField(5, "is_sticker");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker getPollSticker() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.StoryPolls.PollSticker) getOptionalTreeField(6, "poll_sticker", PollSticker.class, PollSticker.TYPE_TAG);
        }

        public double getStartTimeMs() {
            return getCoercedDoubleField(8, "start_time_ms");
        }

        public double getWidth() {
            return getCoercedDoubleField(9, IgReactMediaPickerNativeModule.WIDTH);
        }

        public double getX() {
            return getCoercedDoubleField(10, "x");
        }

        public double getY() {
            return getCoercedDoubleField(11, "y");
        }

        public double getZ() {
            return getCoercedDoubleField(12, "z");
        }

        public boolean hasEndTimeMs() {
            return hasFieldValue("end_time_ms");
        }

        public boolean hasHeight() {
            return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
        }

        public boolean hasIsFbSticker() {
            return hasFieldValue("is_fb_sticker");
        }

        public boolean hasIsHidden() {
            return hasFieldValue("is_hidden");
        }

        public boolean hasIsPinned() {
            return hasFieldValue("is_pinned");
        }

        public boolean hasIsSticker() {
            return hasFieldValue("is_sticker");
        }

        public boolean hasRotation() {
            return hasFieldValue("rotation");
        }

        public boolean hasStartTimeMs() {
            return hasFieldValue("start_time_ms");
        }

        public boolean hasWidth() {
            return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
        }

        public boolean hasX() {
            return hasFieldValue("x");
        }

        public boolean hasY() {
            return hasFieldValue("y");
        }

        public boolean hasZ() {
            return hasFieldValue("z");
        }

        public int isFbSticker() {
            return A00("is_fb_sticker");
        }

        public AnonymousClass4Kx modelSelectionSet() {
            C342787pA r3 = C342787pA.A00;
            AnonymousClass4L7 A0V = C41847B3o.A0V(r3);
            AnonymousClass4L7 A0K = C41845B3m.A0K(r3);
            AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0V, A0K, C41847B3o.A0D(r0), C41847B3o.A0Q(r0), C41847B3o.A0R(r0), C41847B3o.A0S(r0), C41845B3m.A0C(PollSticker.class, "poll_sticker", PollSticker.TYPE_TAG), C41847B3o.A0N(r3), C41847B3o.A0G(r3), C41845B3m.A0J(r3), C41847B3o.A0H(r3), C41847B3o.A0I(r3), C41847B3o.A0Y(r3)});
        }

        public StoryPolls(int i) {
            super(i);
        }

        public StoryPolls() {
            super(TYPE_TAG);
        }
    }

    public final class StorySliders extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1521320246;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return StorySliders.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final class SliderSticker extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders.SliderSticker {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -1020754219;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return SliderSticker.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public double getSliderVoteAverage() {
                return getCoercedDoubleField(5, "slider_vote_average");
            }

            public int getSliderVoteCount() {
                return getCoercedIntField(6, "slider_vote_count");
            }

            public String getTextColor() {
                return getOptionalStringField(7, "text_color");
            }

            public boolean isInteractiveMusicSticker() {
                return getCoercedBooleanField(2, "is_interactive_music_sticker");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public String getBackgroundColor() {
                return A07("background_color");
            }

            public String getEmoji() {
                return A08("emoji");
            }

            public String getQuestion() {
                return A0A("question");
            }

            public String getSliderId() {
                return A0B("slider_id");
            }

            public boolean getViewerCanVote() {
                return getCoercedBooleanField(8, "viewer_can_vote");
            }

            public boolean hasIsInteractiveMusicSticker() {
                return hasFieldValue("is_interactive_music_sticker");
            }

            public boolean hasSliderVoteAverage() {
                return hasFieldValue("slider_vote_average");
            }

            public boolean hasSliderVoteCount() {
                return hasFieldValue("slider_vote_count");
            }

            public boolean hasViewerCanVote() {
                return hasFieldValue("viewer_can_vote");
            }

            public SliderSticker(int i) {
                super(i);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                return C41849B3q.A05();
            }

            public SliderSticker() {
                super(TYPE_TAG);
            }
        }

        public double getEndTimeMs() {
            return getCoercedDoubleField(0, "end_time_ms");
        }

        public double getHeight() {
            return getCoercedDoubleField(1, IgReactMediaPickerNativeModule.HEIGHT);
        }

        public double getRotation() {
            return getCoercedDoubleField(6, "rotation");
        }

        public int isHidden() {
            return getCoercedIntField(3, "is_hidden");
        }

        public int isPinned() {
            return getCoercedIntField(4, "is_pinned");
        }

        public int isSticker() {
            return getCoercedIntField(5, "is_sticker");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders.SliderSticker getSliderSticker() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.StorySliders.SliderSticker) getOptionalTreeField(7, "slider_sticker", SliderSticker.class, SliderSticker.TYPE_TAG);
        }

        public double getStartTimeMs() {
            return getCoercedDoubleField(8, "start_time_ms");
        }

        public double getWidth() {
            return getCoercedDoubleField(9, IgReactMediaPickerNativeModule.WIDTH);
        }

        public double getX() {
            return getCoercedDoubleField(10, "x");
        }

        public double getY() {
            return getCoercedDoubleField(11, "y");
        }

        public double getZ() {
            return getCoercedDoubleField(12, "z");
        }

        public boolean hasEndTimeMs() {
            return hasFieldValue("end_time_ms");
        }

        public boolean hasHeight() {
            return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
        }

        public boolean hasIsFbSticker() {
            return hasFieldValue("is_fb_sticker");
        }

        public boolean hasIsHidden() {
            return hasFieldValue("is_hidden");
        }

        public boolean hasIsPinned() {
            return hasFieldValue("is_pinned");
        }

        public boolean hasIsSticker() {
            return hasFieldValue("is_sticker");
        }

        public boolean hasRotation() {
            return hasFieldValue("rotation");
        }

        public boolean hasStartTimeMs() {
            return hasFieldValue("start_time_ms");
        }

        public boolean hasWidth() {
            return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
        }

        public boolean hasX() {
            return hasFieldValue("x");
        }

        public boolean hasY() {
            return hasFieldValue("y");
        }

        public boolean hasZ() {
            return hasFieldValue("z");
        }

        public int isFbSticker() {
            return A00("is_fb_sticker");
        }

        public AnonymousClass4Kx modelSelectionSet() {
            C342787pA r3 = C342787pA.A00;
            AnonymousClass4L7 A0V = C41847B3o.A0V(r3);
            AnonymousClass4L7 A0K = C41845B3m.A0K(r3);
            AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0V, A0K, C41847B3o.A0D(r0), C41847B3o.A0Q(r0), C41847B3o.A0R(r0), C41847B3o.A0S(r0), C41847B3o.A0N(r3), C41845B3m.A0C(SliderSticker.class, "slider_sticker", SliderSticker.TYPE_TAG), C41847B3o.A0G(r3), C41845B3m.A0J(r3), C41847B3o.A0H(r3), C41847B3o.A0I(r3), C41847B3o.A0Y(r3)});
        }

        public StorySliders(int i) {
            super(i);
        }

        public StorySliders() {
            super(TYPE_TAG);
        }
    }

    public final class UpcomingEvent extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1189174786;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return UpcomingEvent.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final class Owner extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent.Owner {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 695869281;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return Owner.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public String getPk() {
                return A08("pk");
            }

            public AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                return AnonymousClass7TG.A0V(r2, AnonymousClass7TF.A0I(r2), "pk");
            }

            public Owner(int i) {
                super(i);
            }

            public String getId() {
                return C41845B3m.A0k(this);
            }

            public Owner() {
                super(TYPE_TAG);
            }
        }

        public long getEndTime() {
            return getCoercedTimeField(0, "end_time");
        }

        public String getId() {
            return C41847B3o.A1A(this, "strong_id__", 1);
        }

        public boolean getReminderEnabled() {
            return getRequiredBooleanField(3, "reminder_enabled");
        }

        public long getStartTime() {
            return getRequiredTimeField(4, TraceFieldType.StartTime);
        }

        public String getTitle() {
            return C41847B3o.A1A(this, DialogModule.KEY_TITLE, 6);
        }

        public boolean hasReminderEnabled() {
            return true;
        }

        public boolean hasStartTime() {
            return true;
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent.Owner getOwner() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent.Owner) A04(Owner.class, "owner", Owner.TYPE_TAG);
        }

        public String getStrongId() {
            return A0C("strong_id__");
        }

        public C48119EWl getUpcomingEventIdType() {
            return (C48119EWl) C41847B3o.A10(this, C48119EWl.UNSET_OR_UNRECOGNIZED_ENUM_VALUE, "upcoming_event_id_type", 7);
        }

        public boolean hasEndTime() {
            return hasFieldValue("end_time");
        }

        public AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass69U r6 = AnonymousClass69U.A00;
            AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r6, "end_time");
            AnonymousClass4Kz r4 = AnonymousClass4Kz.A00;
            return C41849B3q.A0F(r6, r4, A0f, C41846B3n.A09(r4), C41845B3m.A0C(Owner.class, "owner", Owner.TYPE_TAG));
        }

        public UpcomingEvent(int i) {
            super(i);
        }

        public UpcomingEvent() {
            super(TYPE_TAG);
        }
    }

    public final class User extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.User {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1222124418;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return User.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public CreatorInspirationSignalsPlaygroundTestUser asCreatorInspirationSignalsPlaygroundTestUser() {
            return (CreatorInspirationSignalsPlaygroundTestUser) A01(CreatorInspirationSignalsPlaygroundTestUserImpl.class, CreatorInspirationSignalsPlaygroundTestUserImpl.TYPE_TAG);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0X(CreatorInspirationSignalsPlaygroundTestUserImpl.class, "CreatorInspirationSignalsPlaygroundTestUser", CreatorInspirationSignalsPlaygroundTestUserImpl.TYPE_TAG);
        }

        public User(int i) {
            super(i);
        }

        public User() {
            super(TYPE_TAG);
        }
    }

    public final class Usertags extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.Usertags {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = -1340760331;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return Usertags.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final class In extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -2067737728;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return In.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public final class User extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 970400371;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return User.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public final class FriendshipStatus extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus {
                    public static final Companion Companion = new Object();
                    public static final int TYPE_TAG = 537553227;

                    public final class Companion {
                        public static /* synthetic */ void getTYPE_TAG$annotations() {
                        }

                        public final int getTYPE_TAG() {
                            return FriendshipStatus.TYPE_TAG;
                        }

                        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                        }

                        public Companion() {
                        }
                    }

                    public boolean getBlocking() {
                        return getCoercedBooleanField(0, "blocking");
                    }

                    public boolean getFollowedBy() {
                        return getCoercedBooleanField(1, "followed_by");
                    }

                    public boolean getFollowing() {
                        return getCoercedBooleanField(2, "following");
                    }

                    public boolean getIncomingRequest() {
                        return getCoercedBooleanField(3, "incoming_request");
                    }

                    public boolean isBestie() {
                        return getCoercedBooleanField(4, "is_bestie");
                    }

                    public boolean isFeedFavorite() {
                        return getCoercedBooleanField(5, "is_feed_favorite");
                    }

                    public boolean isPrivate() {
                        return getCoercedBooleanField(6, "is_private");
                    }

                    public boolean isRestricted() {
                        return getCoercedBooleanField(7, "is_restricted");
                    }

                    public static final int getTYPE_TAG() {
                        return TYPE_TAG;
                    }

                    public boolean getMuting() {
                        return getCoercedBooleanField(8, "muting");
                    }

                    public boolean getOutgoingRequest() {
                        return getCoercedBooleanField(9, "outgoing_request");
                    }

                    public boolean hasBlocking() {
                        return hasFieldValue("blocking");
                    }

                    public boolean hasFollowedBy() {
                        return hasFieldValue("followed_by");
                    }

                    public boolean hasFollowing() {
                        return hasFieldValue("following");
                    }

                    public boolean hasIncomingRequest() {
                        return hasFieldValue("incoming_request");
                    }

                    public boolean hasIsBestie() {
                        return hasFieldValue("is_bestie");
                    }

                    public boolean hasIsFeedFavorite() {
                        return hasFieldValue("is_feed_favorite");
                    }

                    public boolean hasIsPrivate() {
                        return hasFieldValue("is_private");
                    }

                    public boolean hasIsRestricted() {
                        return hasFieldValue("is_restricted");
                    }

                    public boolean hasMuting() {
                        return hasFieldValue("muting");
                    }

                    public boolean hasOutgoingRequest() {
                        return hasFieldValue("outgoing_request");
                    }

                    public FriendshipStatus(int i) {
                        super(i);
                    }

                    public AnonymousClass4Kx modelSelectionSet() {
                        return C41849B3q.A07();
                    }

                    public FriendshipStatus() {
                        super(TYPE_TAG);
                    }
                }

                public boolean getHasOnboardedToTextPostApp() {
                    return getCoercedBooleanField(2, "has_onboarded_to_text_post_app");
                }

                public String getPk() {
                    return getOptionalStringField(6, "pk");
                }

                public String getPkId() {
                    return getOptionalStringField(7, "pk_id");
                }

                public boolean isPrivate() {
                    return getCoercedBooleanField(4, "is_private");
                }

                public boolean isVerified() {
                    return C41847B3o.A1b(this, 5);
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus getFriendshipStatus() {
                    return (CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User.FriendshipStatus) A03(FriendshipStatus.class, "friendship_status", FriendshipStatus.TYPE_TAG);
                }

                public String getFullName() {
                    return A08("full_name");
                }

                public String getId() {
                    return A0A("strong_id__");
                }

                public String getProfilePicId() {
                    return A0D("profile_pic_id");
                }

                public String getProfilePicUrl() {
                    return getOptionalStringField(9, "profile_pic_url");
                }

                public String getUsername() {
                    return C41847B3o.A19(this, 10);
                }

                public boolean hasHasOnboardedToTextPostApp() {
                    return hasFieldValue("has_onboarded_to_text_post_app");
                }

                public boolean hasIsPrivate() {
                    return hasFieldValue("is_private");
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    AnonymousClass4Kp A05 = C41847B3o.A05(FriendshipStatus.class, FriendshipStatus.TYPE_TAG);
                    AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
                    AnonymousClass4L7 A0N = C41845B3m.A0N(r1);
                    AnonymousClass4LF r0 = AnonymousClass4LF.A00;
                    return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A05, A0N, C41847B3o.A0F(r0), AnonymousClass7TF.A0I(r1), C41847B3o.A0c(r0), C41846B3n.A0H(r0), C41845B3m.A0E(r1), C41847B3o.A0Z(r1), C41847B3o.A0d(r1), C41845B3m.A0D(r1), C41847B3o.A0T(r1)});
                }

                public User(int i) {
                    super(i);
                }

                public boolean hasIsVerified() {
                    return C41847B3o.A1a(this);
                }

                public User() {
                    super(TYPE_TAG);
                }
            }

            public boolean getShowCategoryOfUser() {
                return getCoercedBooleanField(0, "show_category_of_user");
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User getUser() {
                return (CreatorInspirationSignalsPlaygroundClipsMedia.Usertags.In.User) A02(User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, User.TYPE_TAG);
            }

            public boolean hasShowCategoryOfUser() {
                return hasFieldValue("show_category_of_user");
            }

            public AnonymousClass4Kx modelSelectionSet() {
                return C41847B3o.A0m(AnonymousClass7TE.A0f(AnonymousClass4LF.A00, "show_category_of_user"), User.class, PublicKeyCredentialControllerUtility.JSON_KEY_USER, User.TYPE_TAG);
            }

            public In(int i) {
                super(i);
            }

            public In() {
                super(TYPE_TAG);
            }
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public ImmutableList getIn() {
            return A06(In.class, "in", In.TYPE_TAG);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            int i = In.TYPE_TAG;
            return AnonymousClass7TG.A0T(AnonymousClass4Ks.A02(), In.class, "in", i);
        }

        public Usertags(int i) {
            super(i);
        }

        public Usertags() {
            super(TYPE_TAG);
        }
    }

    public final class VideoVersions extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.VideoVersions {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 1875779970;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return VideoVersions.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public int getWidth() {
            return getCoercedIntField(4, IgReactMediaPickerNativeModule.WIDTH);
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public String getId() {
            return A08(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        }

        public int getType() {
            return A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        }

        public String getUrl() {
            return A0A("url");
        }

        public boolean hasHeight() {
            return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
        }

        public boolean hasType() {
            return hasFieldValue(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
        }

        public boolean hasWidth() {
            return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
        }

        public VideoVersions(int i) {
            super(i);
        }

        public int getHeight() {
            return C41847B3o.A01(this);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            return C41847B3o.A0g();
        }

        public VideoVersions() {
            super(TYPE_TAG);
        }
    }

    public final class VisualCommentReplyStickerInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 963301183;

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return VisualCommentReplyStickerInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final class VcrSticker extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 97836346;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return VcrSticker.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public final class OriginalCommentAuthor extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker.OriginalCommentAuthor {
                public static final Companion Companion = new Object();
                public static final int TYPE_TAG = 1163556531;

                public final class Companion {
                    public static /* synthetic */ void getTYPE_TAG$annotations() {
                    }

                    public final int getTYPE_TAG() {
                        return OriginalCommentAuthor.TYPE_TAG;
                    }

                    public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                    }

                    public Companion() {
                    }
                }

                public boolean getHasOnboardedToTextPostApp() {
                    return getCoercedBooleanField(1, "has_onboarded_to_text_post_app");
                }

                public String getPkId() {
                    return getOptionalStringField(6, "pk_id");
                }

                public String getProfilePicId() {
                    return getOptionalStringField(7, "profile_pic_id");
                }

                public boolean isPrivate() {
                    return getCoercedBooleanField(3, "is_private");
                }

                public boolean isVerified() {
                    return C41847B3o.A1b(this, 4);
                }

                public static final int getTYPE_TAG() {
                    return TYPE_TAG;
                }

                public String getFullName() {
                    return A07("full_name");
                }

                public String getId() {
                    return A09("strong_id__");
                }

                public String getPk() {
                    return A0C("pk");
                }

                public String getProfilePicUrl() {
                    return A0D("profile_pic_url");
                }

                public String getUsername() {
                    return C41847B3o.A19(this, 9);
                }

                public boolean hasHasOnboardedToTextPostApp() {
                    return hasFieldValue("has_onboarded_to_text_post_app");
                }

                public boolean hasIsPrivate() {
                    return hasFieldValue("is_private");
                }

                public OriginalCommentAuthor(int i) {
                    super(i);
                }

                public boolean hasIsVerified() {
                    return C41847B3o.A1a(this);
                }

                public AnonymousClass4Kx modelSelectionSet() {
                    return C41849B3q.A02();
                }

                public OriginalCommentAuthor() {
                    super(TYPE_TAG);
                }
            }

            public boolean getCanViewerLinkBackToOriginalMediaFromVcr() {
                return getRequiredBooleanField(0, "can_viewer_link_back_to_original_media_from_vcr");
            }

            public double getEndTimeMs() {
                return getCoercedDoubleField(2, "end_time_ms");
            }

            public String getOriginalCommentId() {
                return C41847B3o.A1A(this, "original_comment_id", 4);
            }

            public String getOriginalCommentText() {
                return C41847B3o.A1A(this, "original_comment_text", 5);
            }

            public String getOriginalMediaId() {
                return C41847B3o.A1A(this, "original_media_id", 6);
            }

            public String getStartBackgroundColor() {
                return getOptionalStringField(7, "start_background_color");
            }

            public boolean hasCanViewerLinkBackToOriginalMediaFromVcr() {
                return true;
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public String getEndBackgroundColor() {
                return A08("end_background_color");
            }

            public CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker.OriginalCommentAuthor getOriginalCommentAuthor() {
                C250663lr requiredTreeField = getRequiredTreeField(3, "original_comment_author", OriginalCommentAuthor.class, OriginalCommentAuthor.TYPE_TAG);
                0qQ.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.VisualCommentReplyStickerInfo.VcrSticker.OriginalCommentAuthor");
                return (OriginalCommentAuthor) requiredTreeField;
            }

            public double getStartTimeMs() {
                return getCoercedDoubleField(8, "start_time_ms");
            }

            public String getTextColor() {
                return getOptionalStringField(9, "text_color");
            }

            public boolean hasEndTimeMs() {
                return hasFieldValue("end_time_ms");
            }

            public boolean hasStartTimeMs() {
                return hasFieldValue("start_time_ms");
            }

            public VcrSticker(int i) {
                super(i);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4L7 A09 = C41848B3p.A09();
                AnonymousClass4Kz r2 = AnonymousClass4Kz.A00;
                AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r2, "end_background_color");
                C342787pA r5 = C342787pA.A00;
                AnonymousClass4L7 A0V = C41847B3o.A0V(r5);
                int i = OriginalCommentAuthor.TYPE_TAG;
                return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A09, A0f, A0V, C41845B3m.A0A(AnonymousClass4Ks.A01(), OriginalCommentAuthor.class, "original_comment_author", i), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "original_comment_id"), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r2), "original_comment_text"), C41848B3p.A0J(r2), AnonymousClass7TE.A0f(r2, "start_background_color"), C41847B3o.A0G(r5), AnonymousClass7TE.A0f(r2, "text_color")});
            }

            public VcrSticker() {
                super(TYPE_TAG);
            }
        }

        public double getEndTimeMs() {
            return getCoercedDoubleField(0, "end_time_ms");
        }

        public double getHeight() {
            return getCoercedDoubleField(1, IgReactMediaPickerNativeModule.HEIGHT);
        }

        public double getRotation() {
            return getCoercedDoubleField(6, "rotation");
        }

        public double getStartTimeMs() {
            return getCoercedDoubleField(7, "start_time_ms");
        }

        public int isHidden() {
            return getCoercedIntField(3, "is_hidden");
        }

        public int isPinned() {
            return getCoercedIntField(4, "is_pinned");
        }

        public int isSticker() {
            return getCoercedIntField(5, "is_sticker");
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker getVcrSticker() {
            return (CreatorInspirationSignalsPlaygroundClipsMedia.VisualCommentReplyStickerInfo.VcrSticker) getOptionalTreeField(8, "vcr_sticker", VcrSticker.class, VcrSticker.TYPE_TAG);
        }

        public double getWidth() {
            return getCoercedDoubleField(9, IgReactMediaPickerNativeModule.WIDTH);
        }

        public double getX() {
            return getCoercedDoubleField(10, "x");
        }

        public double getY() {
            return getCoercedDoubleField(11, "y");
        }

        public double getZ() {
            return getCoercedDoubleField(12, "z");
        }

        public boolean hasEndTimeMs() {
            return hasFieldValue("end_time_ms");
        }

        public boolean hasHeight() {
            return hasFieldValue(IgReactMediaPickerNativeModule.HEIGHT);
        }

        public boolean hasIsFbSticker() {
            return hasFieldValue("is_fb_sticker");
        }

        public boolean hasIsHidden() {
            return hasFieldValue("is_hidden");
        }

        public boolean hasIsPinned() {
            return hasFieldValue("is_pinned");
        }

        public boolean hasIsSticker() {
            return hasFieldValue("is_sticker");
        }

        public boolean hasRotation() {
            return hasFieldValue("rotation");
        }

        public boolean hasStartTimeMs() {
            return hasFieldValue("start_time_ms");
        }

        public boolean hasWidth() {
            return hasFieldValue(IgReactMediaPickerNativeModule.WIDTH);
        }

        public boolean hasX() {
            return hasFieldValue("x");
        }

        public boolean hasY() {
            return hasFieldValue("y");
        }

        public boolean hasZ() {
            return hasFieldValue("z");
        }

        public int isFbSticker() {
            return A00("is_fb_sticker");
        }

        public AnonymousClass4Kx modelSelectionSet() {
            C342787pA r3 = C342787pA.A00;
            AnonymousClass4L7 A0V = C41847B3o.A0V(r3);
            AnonymousClass4L7 A0K = C41845B3m.A0K(r3);
            AnonymousClass4L8 r0 = AnonymousClass4L8.A00;
            return AnonymousClass7TE.A0h(new AnonymousClass4Kr[]{A0V, A0K, C41847B3o.A0D(r0), C41847B3o.A0Q(r0), C41847B3o.A0R(r0), C41847B3o.A0S(r0), C41847B3o.A0N(r3), C41847B3o.A0G(r3), C41845B3m.A0C(VcrSticker.class, "vcr_sticker", VcrSticker.TYPE_TAG), C41845B3m.A0J(r3), C41847B3o.A0H(r3), C41847B3o.A0I(r3), C41847B3o.A0Y(r3)});
        }

        public VisualCommentReplyStickerInfo(int i) {
            super(i);
        }

        public VisualCommentReplyStickerInfo() {
            super(TYPE_TAG);
        }
    }

    public final class VisualRepliesInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.VisualRepliesInfo {
        public static final Companion Companion = new Object();
        public static final int TYPE_TAG = 725946755;

        public final class CommentInfo extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.VisualRepliesInfo.CommentInfo {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = 668313176;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return CommentInfo.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public String getCommentId() {
                return C41847B3o.A1A(this, "comment_id", 0);
            }

            public String getCommenterUsername() {
                return C41847B3o.A1A(this, "commenter_username", 1);
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public AnonymousClass4Kx modelSelectionSet() {
                AnonymousClass4Kz r3 = AnonymousClass4Kz.A00;
                return AnonymousClass7TG.A0V(AnonymousClass7TE.A0g(r3), AnonymousClass7TE.A0f(AnonymousClass7TE.A0g(r3), "comment_id"), "commenter_username");
            }

            public CommentInfo(int i) {
                super(i);
            }

            public CommentInfo() {
                super(TYPE_TAG);
            }
        }

        public final class Companion {
            public static /* synthetic */ void getTYPE_TAG$annotations() {
            }

            public final int getTYPE_TAG() {
                return VisualRepliesInfo.TYPE_TAG;
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            }

            public Companion() {
            }
        }

        public final class OriginalMedia extends C250663lr implements CreatorInspirationSignalsPlaygroundClipsMedia.VisualRepliesInfo.OriginalMedia {
            public static final Companion Companion = new Object();
            public static final int TYPE_TAG = -636376882;

            public final class Companion {
                public static /* synthetic */ void getTYPE_TAG$annotations() {
                }

                public final int getTYPE_TAG() {
                    return OriginalMedia.TYPE_TAG;
                }

                public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                }

                public Companion() {
                }
            }

            public String getPk() {
                return C41847B3o.A1A(this, "pk", 0);
            }

            public static final int getTYPE_TAG() {
                return TYPE_TAG;
            }

            public OriginalMedia(int i) {
                super(i);
            }

            public AnonymousClass4Kx modelSelectionSet() {
                return AnonymousClass7TG.A0W(C41845B3m.A0P(), "pk");
            }

            public OriginalMedia() {
                super(TYPE_TAG);
            }
        }

        public boolean getCanViewerLinkBackToOriginalMediaFromVcr() {
            return getRequiredBooleanField(0, "can_viewer_link_back_to_original_media_from_vcr");
        }

        public boolean hasCanViewerLinkBackToOriginalMediaFromVcr() {
            return true;
        }

        public static final int getTYPE_TAG() {
            return TYPE_TAG;
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.VisualRepliesInfo.CommentInfo getCommentInfo() {
            C250663lr requiredTreeField = getRequiredTreeField(1, "comment_info", CommentInfo.class, CommentInfo.TYPE_TAG);
            0qQ.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.VisualRepliesInfo.CommentInfo");
            return (CommentInfo) requiredTreeField;
        }

        public CreatorInspirationSignalsPlaygroundClipsMedia.VisualRepliesInfo.OriginalMedia getOriginalMedia() {
            C250663lr requiredTreeField = getRequiredTreeField(2, "original_media", OriginalMedia.class, OriginalMedia.TYPE_TAG);
            0qQ.A0C(requiredTreeField, "null cannot be cast to non-null type com.instagram.debug.devoptions.signalsplayground.repository.graphql.CreatorInspirationSignalsPlaygroundClipsMediaImpl.VisualRepliesInfo.OriginalMedia");
            return (OriginalMedia) requiredTreeField;
        }

        public VisualRepliesInfo(int i) {
            super(i);
        }

        public AnonymousClass4Kx modelSelectionSet() {
            AnonymousClass4L7 A09 = C41848B3p.A09();
            int i = CommentInfo.TYPE_TAG;
            AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A01(), CommentInfo.class, "comment_info", i);
            int i2 = OriginalMedia.TYPE_TAG;
            return C41846B3n.A0K(A09, A0A, C41845B3m.A0A(AnonymousClass4Ks.A01(), OriginalMedia.class, "original_media", i2));
        }

        public VisualRepliesInfo() {
            super(TYPE_TAG);
        }
    }

    public 1Xj asApiTypeModel(1E6 r5) {
        0qQ.A0B(r5, 0);
        1Xv r0 = 1Xj.A0h;
        TreeJNI reinterpret = reinterpret(ImmutablePandoMediaDict.class);
        0qQ.A07(reinterpret);
        return 1Xv.A00(new 1E9(r5, 6, false), (ImmutablePandoMediaDict) reinterpret);
    }

    public 1Xj asRestModel__DO_NOT_USE(1E6 r5) {
        0qQ.A0B(r5, 0);
        1Xv r0 = 1Xj.A0h;
        TreeJNI reinterpret = reinterpret(ImmutablePandoMediaDict.class);
        0qQ.A07(reinterpret);
        return 1Xv.A01(new 1E9(r5, 6, false), (ImmutablePandoMediaDict) reinterpret);
    }

    public boolean getAreRemixesCrosspostable() {
        return getCoercedBooleanField(1, "are_remixes_crosspostable");
    }

    public String getBoostedBySponsor() {
        return getOptionalStringField(6, "boosted_by_sponsor");
    }

    public String getBoostedStatus() {
        return getOptionalStringField(7, "boosted_status");
    }

    public static final int getTYPE_TAG() {
        return TYPE_TAG;
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.Attribution getAttribution() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.Attribution) A04(Attribution.class, "attribution", Attribution.TYPE_TAG);
    }

    public String getAudience() {
        return A0A("audience");
    }

    public String getBoostUnavailableIdentifier() {
        return A0B("boost_unavailable_identifier");
    }

    public String getBoostUnavailableReason() {
        return A0C("boost_unavailable_reason");
    }

    public ImmutableList getBrandedContentAdsBoostPostTokens() {
        return getOptionalCompactedTreeListField(8, "branded_content_ads_boost_post_tokens", BrandedContentAdsBoostPostTokens.class, BrandedContentAdsBoostPostTokens.TYPE_TAG);
    }

    public boolean getCanSeeInsightsAsBrand() {
        return getCoercedBooleanField(9, "can_see_insights_as_brand");
    }

    public boolean getCanViewerReshare() {
        return getCoercedBooleanField(10, "can_viewer_reshare");
    }

    public boolean getCanViewerSave() {
        return getCoercedBooleanField(11, "can_viewer_save");
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.Caption getCaption() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.Caption) getOptionalTreeField(12, "caption", Caption.class, Caption.TYPE_TAG);
    }

    public boolean getCaptionIsEdited() {
        return getCoercedBooleanField(13, "caption_is_edited");
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo getClipsAttributionInfo() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsAttributionInfo) getOptionalTreeField(14, "clips_attribution_info", ClipsAttributionInfo.class, ClipsAttributionInfo.TYPE_TAG);
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata getClipsMetadata() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.ClipsMetadata) getOptionalTreeField(16, "clips_metadata", ClipsMetadata.class, ClipsMetadata.TYPE_TAG);
    }

    public ImmutableList getClipsTabPinnedUserIds() {
        return getOptionalCompactedStringListField(15, "clips_tab_pinned_user_ids");
    }

    public boolean getCoauthorProducerCanSeeOrganicInsights() {
        return getCoercedBooleanField(17, "coauthor_producer_can_see_organic_insights");
    }

    public ImmutableList getCoauthorProducers() {
        return getOptionalCompactedTreeListField(18, "coauthor_producers", CoauthorProducers.class, CoauthorProducers.TYPE_TAG);
    }

    public String getCode() {
        return getOptionalStringField(19, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
    }

    public int getCommentCount() {
        return getCoercedIntField(20, "comment_count");
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.CommentInformTreatment getCommentInformTreatment() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.CommentInformTreatment) getOptionalTreeField(21, "comment_inform_treatment", CommentInformTreatment.class, CommentInformTreatment.TYPE_TAG);
    }

    public boolean getCommentingDisabledForViewer() {
        return getCoercedBooleanField(22, "commenting_disabled_for_viewer");
    }

    public boolean getCommentsDisabled() {
        return getCoercedBooleanField(23, "comments_disabled");
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig getCreativeConfig() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.CreativeConfig) getOptionalTreeField(24, "creative_config", CreativeConfig.class, CreativeConfig.TYPE_TAG);
    }

    public int getDeletedReason() {
        return getCoercedIntField(25, "deleted_reason");
    }

    public long getDeviceTimestamp() {
        return getCoercedTimeField(26, "device_timestamp");
    }

    public String getDominantColor() {
        return getOptionalStringField(27, "dominant_color");
    }

    public boolean getEnableWaist() {
        return getCoercedBooleanField(28, "enable_waist");
    }

    public ImmutableList getFacepileTopLikers() {
        return getOptionalCompactedTreeListField(29, "facepile_top_likers", FacepileTopLikers.class, FacepileTopLikers.TYPE_TAG);
    }

    public int getFbLikeCount() {
        return getCoercedIntField(30, "fb_like_count");
    }

    public int getFbPlayCount() {
        return getCoercedIntField(31, "fb_play_count");
    }

    public int getFilterType() {
        return getCoercedIntField(32, "filter_type");
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag getFundraiserTag() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.FundraiserTag) getOptionalTreeField(33, "fundraiser_tag", FundraiserTag.class, FundraiserTag.TYPE_TAG);
    }

    public boolean getHasAudio() {
        return getCoercedBooleanField(34, "has_audio");
    }

    public boolean getHasDelayedMetadata() {
        return getCoercedBooleanField(35, "has_delayed_metadata");
    }

    public boolean getHasHiddenComments() {
        return getCoercedBooleanField(36, "has_hidden_comments");
    }

    public boolean getHasLiked() {
        return getCoercedBooleanField(37, "has_liked");
    }

    public boolean getHasMoreComments() {
        return getCoercedBooleanField(38, "has_more_comments");
    }

    public boolean getHasReshares() {
        return getCoercedBooleanField(39, "has_reshares");
    }

    public int getHasSharedToFb() {
        return getCoercedIntField(40, "has_shared_to_fb");
    }

    public boolean getHasViewerSaved() {
        return getCoercedBooleanField(41, "has_viewer_saved");
    }

    public boolean getHideViewAllCommentEntrypoint() {
        return getCoercedBooleanField(42, "hide_view_all_comment_entrypoint");
    }

    public String getId() {
        return C41847B3o.A1A(this, "strong_id__", 43);
    }

    public boolean getIgMediaSharingDisabled() {
        return getCoercedBooleanField(44, "ig_media_sharing_disabled");
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvSeriesInfo getIgtvSeriesInfo() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvSeriesInfo) getOptionalTreeField(45, "igtv_series_info", IgtvSeriesInfo.class, IgtvSeriesInfo.TYPE_TAG);
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo getIgtvShoppingInfo() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.IgtvShoppingInfo) getOptionalTreeField(46, "igtv_shopping_info", IgtvShoppingInfo.class, IgtvShoppingInfo.TYPE_TAG);
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2 getImageVersions2() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.ImageVersions2) getOptionalTreeField(47, "image_versions2", ImageVersions2.class, ImageVersions2.TYPE_TAG);
    }

    public ImmutableList getInvitedCoauthorProducers() {
        return getOptionalCompactedTreeListField(48, "invited_coauthor_producers", InvitedCoauthorProducers.class, InvitedCoauthorProducers.TYPE_TAG);
    }

    public double getLat() {
        return getCoercedDoubleField(62, "lat");
    }

    public boolean getLikeAndViewCountsDisabled() {
        return getCoercedBooleanField(63, "like_and_view_counts_disabled");
    }

    public int getLikeCount() {
        return getCoercedIntField(64, "like_count");
    }

    public double getLng() {
        return getCoercedDoubleField(65, "lng");
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.Location getLocation() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.Location) getOptionalTreeField(66, "location", Location.class, Location.TYPE_TAG);
    }

    public String getLoggingInfoToken() {
        return getOptionalStringField(67, "logging_info_token");
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.MashupInfo getMashupInfo() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.MashupInfo) getOptionalTreeField(68, "mashup_info", MashupInfo.class, MashupInfo.TYPE_TAG);
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.MediaAppreciationSettings getMediaAppreciationSettings() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.MediaAppreciationSettings) getOptionalTreeField(69, "media_appreciation_settings", MediaAppreciationSettings.class, MediaAppreciationSettings.TYPE_TAG);
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo getMediaCroppingInfo() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.MediaCroppingInfo) getOptionalTreeField(70, "media_cropping_info", MediaCroppingInfo.class, MediaCroppingInfo.TYPE_TAG);
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.MediaNotice getMediaNotice() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.MediaNotice) getOptionalTreeField(71, "media_notice", MediaNotice.class, MediaNotice.TYPE_TAG);
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo getMediaOverlayInfo() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.MediaOverlayInfo) getOptionalTreeField(72, "media_overlay_info", MediaOverlayInfo.class, MediaOverlayInfo.TYPE_TAG);
    }

    public int getMediaType() {
        return getCoercedIntField(73, "media_type");
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata getMusicMetadata() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.MusicMetadata) getOptionalTreeField(74, "music_metadata", MusicMetadata.class, MusicMetadata.TYPE_TAG);
    }

    public String getNextMaxId() {
        return getOptionalStringField(75, "next_max_id");
    }

    public int getNumberOfQualities() {
        return getCoercedIntField(76, "number_of_qualities");
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.OrganicCtaInfo getOrganicCtaInfo() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.OrganicCtaInfo) getOptionalTreeField(77, "organic_cta_info", OrganicCtaInfo.class, OrganicCtaInfo.TYPE_TAG);
    }

    public C62604Kib getOrganicCtaType() {
        return (C62604Kib) getOptionalEnumField(78, "organic_cta_type", C62604Kib.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
    }

    public String getOrganicTrackingToken() {
        return getOptionalStringField(79, "organic_tracking_token");
    }

    public int getOriginalHeight() {
        return getCoercedIntField(80, "original_height");
    }

    public boolean getOriginalMediaHasVisualReplyMedia() {
        return getCoercedBooleanField(81, "original_media_has_visual_reply_media");
    }

    public int getOriginalWidth() {
        return getCoercedIntField(82, "original_width");
    }

    public boolean getPhotoOfYou() {
        return getCoercedBooleanField(83, "photo_of_you");
    }

    public int getPlayCount() {
        return getCoercedIntField(84, "play_count");
    }

    public String getPreview() {
        return getOptionalStringField(85, "preview");
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags getProductTags() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.ProductTags) getOptionalTreeField(86, "product_tags", ProductTags.class, ProductTags.TYPE_TAG);
    }

    public String getProductType() {
        return getOptionalStringField(87, "product_type");
    }

    public boolean getProfileGridControlEnabled() {
        return getCoercedBooleanField(88, "profile_grid_control_enabled");
    }

    public int getReshareCount() {
        return getCoercedIntField(89, "reshare_count");
    }

    public ImmutableList getSenders() {
        return getOptionalCompactedTreeListField(90, "senders", Senders.class, Senders.TYPE_TAG);
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.SharingFrictionInfo getSharingFrictionInfo() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.SharingFrictionInfo) getOptionalTreeField(91, "sharing_friction_info", SharingFrictionInfo.class, SharingFrictionInfo.TYPE_TAG);
    }

    public String getShopRoutingUserId() {
        return getOptionalStringField(92, "shop_routing_user_id");
    }

    public ImmutableList getSocialContext() {
        return getOptionalCompactedTreeListField(93, "social_context", SocialContext.class, SocialContext.TYPE_TAG);
    }

    public ImmutableList getSponsorTags() {
        return getOptionalCompactedTreeListField(94, "sponsor_tags", SponsorTags.class, SponsorTags.TYPE_TAG);
    }

    public ImmutableList getStoryPolls() {
        return getOptionalCompactedTreeListField(95, "story_polls", StoryPolls.class, StoryPolls.TYPE_TAG);
    }

    public ImmutableList getStorySliders() {
        return getOptionalCompactedTreeListField(96, "story_sliders", StorySliders.class, StorySliders.TYPE_TAG);
    }

    public boolean getSubscribeCtaVisible() {
        return getCoercedBooleanField(97, "subscribe_cta_visible");
    }

    public String getSubscriptionMediaVisibility() {
        return getOptionalStringField(98, "subscription_media_visibility");
    }

    public long getTakenAt() {
        return getCoercedTimeField(99, "taken_at");
    }

    public String getTitle() {
        return getOptionalStringField(100, DialogModule.KEY_TITLE);
    }

    public ImmutableList getTopLikers() {
        return getOptionalCompactedStringListField(115, "top_likers");
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent getUpcomingEvent() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.UpcomingEvent) getOptionalTreeField(101, "upcoming_event", UpcomingEvent.class, UpcomingEvent.TYPE_TAG);
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.User getUser() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.User) getOptionalTreeField(102, PublicKeyCredentialControllerUtility.JSON_KEY_USER, User.class, User.TYPE_TAG);
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.Usertags getUsertags() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.Usertags) getOptionalTreeField(103, "usertags", Usertags.class, Usertags.TYPE_TAG);
    }

    public String getVideoCodec() {
        return getOptionalStringField(104, "video_codec");
    }

    public String getVideoDashManifest() {
        return getOptionalStringField(105, "video_dash_manifest");
    }

    public double getVideoDuration() {
        return getCoercedDoubleField(106, "video_duration");
    }

    public double getVideoSubtitlesConfidence() {
        return getCoercedDoubleField(107, "video_subtitles_confidence");
    }

    public String getVideoSubtitlesUri() {
        return getOptionalStringField(108, "video_subtitles_uri");
    }

    public ImmutableList getVideoVersions() {
        return getOptionalCompactedTreeListField(109, "video_versions", VideoVersions.class, VideoVersions.TYPE_TAG);
    }

    public int getViewCount() {
        return getCoercedIntField(110, "view_count");
    }

    public int getViewStateItemType() {
        return getCoercedIntField(111, "view_state_item_type");
    }

    public ImmutableList getVisualCommentReplyStickerInfo() {
        return getOptionalCompactedTreeListField(112, "visual_comment_reply_sticker_info", VisualCommentReplyStickerInfo.class, VisualCommentReplyStickerInfo.TYPE_TAG);
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.VisualRepliesInfo getVisualRepliesInfo() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.VisualRepliesInfo) getOptionalTreeField(113, "visual_replies_info", VisualRepliesInfo.class, VisualRepliesInfo.TYPE_TAG);
    }

    public CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo getWearableAttributionInfo() {
        return (CreatorInspirationSignalsPlaygroundClipsMedia.WearableAttributionInfo) A03(WearableAttributionInfo.class, "wearable_attribution_info", WearableAttributionInfo.TYPE_TAG);
    }

    public String getXpostDenyReason() {
        return getOptionalStringField(114, "xpost_deny_reason");
    }

    public boolean hasAreRemixesCrosspostable() {
        return hasFieldValue("are_remixes_crosspostable");
    }

    public boolean hasCanSeeInsightsAsBrand() {
        return hasFieldValue("can_see_insights_as_brand");
    }

    public boolean hasCanViewerReshare() {
        return hasFieldValue("can_viewer_reshare");
    }

    public boolean hasCanViewerSave() {
        return hasFieldValue("can_viewer_save");
    }

    public boolean hasCaptionIsEdited() {
        return hasFieldValue("caption_is_edited");
    }

    public boolean hasCoauthorProducerCanSeeOrganicInsights() {
        return hasFieldValue("coauthor_producer_can_see_organic_insights");
    }

    public boolean hasCommentCount() {
        return hasFieldValue("comment_count");
    }

    public boolean hasCommentingDisabledForViewer() {
        return hasFieldValue("commenting_disabled_for_viewer");
    }

    public boolean hasCommentsDisabled() {
        return hasFieldValue("comments_disabled");
    }

    public boolean hasDeletedReason() {
        return hasFieldValue("deleted_reason");
    }

    public boolean hasDeviceTimestamp() {
        return hasFieldValue("device_timestamp");
    }

    public boolean hasEnableWaist() {
        return hasFieldValue("enable_waist");
    }

    public boolean hasFbLikeCount() {
        return hasFieldValue("fb_like_count");
    }

    public boolean hasFbPlayCount() {
        return hasFieldValue("fb_play_count");
    }

    public boolean hasFilterType() {
        return hasFieldValue("filter_type");
    }

    public boolean hasHasAudio() {
        return hasFieldValue("has_audio");
    }

    public boolean hasHasDelayedMetadata() {
        return hasFieldValue("has_delayed_metadata");
    }

    public boolean hasHasHiddenComments() {
        return hasFieldValue("has_hidden_comments");
    }

    public boolean hasHasLiked() {
        return hasFieldValue("has_liked");
    }

    public boolean hasHasMoreComments() {
        return hasFieldValue("has_more_comments");
    }

    public boolean hasHasReshares() {
        return hasFieldValue("has_reshares");
    }

    public boolean hasHasSharedToFb() {
        return hasFieldValue("has_shared_to_fb");
    }

    public boolean hasHasViewerSaved() {
        return hasFieldValue("has_viewer_saved");
    }

    public boolean hasHideViewAllCommentEntrypoint() {
        return hasFieldValue("hide_view_all_comment_entrypoint");
    }

    public boolean hasIgMediaSharingDisabled() {
        return hasFieldValue("ig_media_sharing_disabled");
    }

    public boolean hasIsArtistPick() {
        return hasFieldValue("is_artist_pick");
    }

    public boolean hasIsCommentsGifComposerEnabled() {
        return hasFieldValue("is_comments_gif_composer_enabled");
    }

    public boolean hasIsCurrentlyPromotingBySponsor() {
        return hasFieldValue("is_currently_promoting_by_sponsor");
    }

    public boolean hasIsDashEligible() {
        return hasFieldValue("is_dash_eligible");
    }

    public boolean hasIsFbOnly() {
        return hasFieldValue("is_fb_only");
    }

    public boolean hasIsInProfileGrid() {
        return hasFieldValue("is_in_profile_grid");
    }

    public boolean hasIsInternalOnly() {
        return hasFieldValue("is_internal_only");
    }

    public boolean hasIsOrganicProductTaggingEligible() {
        return hasFieldValue("is_organic_product_tagging_eligible");
    }

    public boolean hasIsPaidPartnership() {
        return hasFieldValue("is_paid_partnership");
    }

    public boolean hasIsPostLive() {
        return hasFieldValue("is_post_live");
    }

    public boolean hasIsThirdPartyDownloadsEligible() {
        return hasFieldValue("is_third_party_downloads_eligible");
    }

    public boolean hasIsUnifiedVideo() {
        return hasFieldValue("is_unified_video");
    }

    public boolean hasIsVisualReplyCommenterNoticeEnabled() {
        return hasFieldValue("is_visual_reply_commenter_notice_enabled");
    }

    public boolean hasLat() {
        return hasFieldValue("lat");
    }

    public boolean hasLikeAndViewCountsDisabled() {
        return hasFieldValue("like_and_view_counts_disabled");
    }

    public boolean hasLikeCount() {
        return hasFieldValue("like_count");
    }

    public boolean hasLng() {
        return hasFieldValue("lng");
    }

    public boolean hasMediaType() {
        return hasFieldValue("media_type");
    }

    public boolean hasNumberOfQualities() {
        return hasFieldValue("number_of_qualities");
    }

    public boolean hasOriginalHeight() {
        return hasFieldValue("original_height");
    }

    public boolean hasOriginalMediaHasVisualReplyMedia() {
        return hasFieldValue("original_media_has_visual_reply_media");
    }

    public boolean hasOriginalWidth() {
        return hasFieldValue("original_width");
    }

    public boolean hasPhotoOfYou() {
        return hasFieldValue("photo_of_you");
    }

    public boolean hasPlayCount() {
        return hasFieldValue("play_count");
    }

    public boolean hasProfileGridControlEnabled() {
        return hasFieldValue("profile_grid_control_enabled");
    }

    public boolean hasReshareCount() {
        return hasFieldValue("reshare_count");
    }

    public boolean hasSubscribeCtaVisible() {
        return hasFieldValue("subscribe_cta_visible");
    }

    public boolean hasTakenAt() {
        return hasFieldValue("taken_at");
    }

    public boolean hasVideoDuration() {
        return hasFieldValue("video_duration");
    }

    public boolean hasVideoSubtitlesConfidence() {
        return hasFieldValue("video_subtitles_confidence");
    }

    public boolean hasViewCount() {
        return hasFieldValue("view_count");
    }

    public boolean hasViewStateItemType() {
        return hasFieldValue("view_state_item_type");
    }

    public boolean isArtistPick() {
        return getCoercedBooleanField(49, "is_artist_pick");
    }

    public boolean isCommentsGifComposerEnabled() {
        return getCoercedBooleanField(50, "is_comments_gif_composer_enabled");
    }

    public boolean isCurrentlyPromotingBySponsor() {
        return getCoercedBooleanField(51, "is_currently_promoting_by_sponsor");
    }

    public int isDashEligible() {
        return getCoercedIntField(52, "is_dash_eligible");
    }

    public boolean isFbOnly() {
        return getCoercedBooleanField(53, "is_fb_only");
    }

    public boolean isInProfileGrid() {
        return getCoercedBooleanField(54, "is_in_profile_grid");
    }

    public boolean isInternalOnly() {
        return getCoercedBooleanField(55, "is_internal_only");
    }

    public boolean isOrganicProductTaggingEligible() {
        return getCoercedBooleanField(56, "is_organic_product_tagging_eligible");
    }

    public boolean isPaidPartnership() {
        return getCoercedBooleanField(57, "is_paid_partnership");
    }

    public boolean isPostLive() {
        return getCoercedBooleanField(58, "is_post_live");
    }

    public boolean isThirdPartyDownloadsEligible() {
        return getCoercedBooleanField(59, "is_third_party_downloads_eligible");
    }

    public boolean isUnifiedVideo() {
        return getCoercedBooleanField(60, "is_unified_video");
    }

    public boolean isVisualReplyCommenterNoticeEnabled() {
        return getCoercedBooleanField(61, "is_visual_reply_commenter_notice_enabled");
    }

    public AnonymousClass4Kx modelSelectionSet() {
        AnonymousClass4Kr[] r10 = new AnonymousClass4Kr[116];
        AnonymousClass4Kp A0C = C41845B3m.A0C(WearableAttributionInfo.class, "wearable_attribution_info", WearableAttributionInfo.TYPE_TAG);
        AnonymousClass4LF r0 = AnonymousClass4LF.A00;
        AnonymousClass4L7 A0f = AnonymousClass7TE.A0f(r0, "are_remixes_crosspostable");
        AnonymousClass4Kp A0C2 = C41845B3m.A0C(Attribution.class, "attribution", Attribution.TYPE_TAG);
        AnonymousClass4Kz r1 = AnonymousClass4Kz.A00;
        AnonymousClass4L7 A0f2 = AnonymousClass7TE.A0f(r1, "audience");
        AnonymousClass4L7 A0f3 = AnonymousClass7TE.A0f(r1, "boost_unavailable_identifier");
        AnonymousClass4L7 A0f4 = AnonymousClass7TE.A0f(r1, "boost_unavailable_reason");
        AnonymousClass4L7 A0f5 = AnonymousClass7TE.A0f(r1, "boosted_by_sponsor");
        AnonymousClass4L7 A0f6 = AnonymousClass7TE.A0f(r1, "boosted_status");
        int i = BrandedContentAdsBoostPostTokens.TYPE_TAG;
        AnonymousClass4Kp A0A = C41845B3m.A0A(AnonymousClass4Ks.A00(), BrandedContentAdsBoostPostTokens.class, "branded_content_ads_boost_post_tokens", i);
        AnonymousClass4L7 A0f7 = AnonymousClass7TE.A0f(r0, "can_see_insights_as_brand");
        AnonymousClass4L7 A0f8 = AnonymousClass7TE.A0f(r0, "can_viewer_reshare");
        AnonymousClass4L7 A0f9 = AnonymousClass7TE.A0f(r0, "can_viewer_save");
        AnonymousClass4Kp A0C3 = C41845B3m.A0C(Caption.class, "caption", Caption.TYPE_TAG);
        AnonymousClass4L7 A0f10 = AnonymousClass7TE.A0f(r0, "caption_is_edited");
        AnonymousClass4Kp A0C4 = C41845B3m.A0C(ClipsAttributionInfo.class, "clips_attribution_info", ClipsAttributionInfo.TYPE_TAG);
        AnonymousClass4L7 A0f11 = AnonymousClass7TE.A0f(AnonymousClass4Kz.A00(), "clips_tab_pinned_user_ids");
        AnonymousClass4Kp A0C5 = C41845B3m.A0C(ClipsMetadata.class, "clips_metadata", ClipsMetadata.TYPE_TAG);
        AnonymousClass4L7 A0f12 = AnonymousClass7TE.A0f(r0, "coauthor_producer_can_see_organic_insights");
        int i2 = CoauthorProducers.TYPE_TAG;
        AnonymousClass4Kp A0A2 = C41845B3m.A0A(AnonymousClass4Ks.A00(), CoauthorProducers.class, "coauthor_producers", i2);
        AnonymousClass4L7 A0f13 = AnonymousClass7TE.A0f(r1, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE);
        AnonymousClass4L8 r2 = AnonymousClass4L8.A00;
        AnonymousClass4L7 A0f14 = AnonymousClass7TE.A0f(r2, "comment_count");
        AnonymousClass4Kp A0C6 = C41845B3m.A0C(CommentInformTreatment.class, "comment_inform_treatment", CommentInformTreatment.TYPE_TAG);
        AnonymousClass4L7 A0f15 = AnonymousClass7TE.A0f(r0, "commenting_disabled_for_viewer");
        AnonymousClass4L7 A0f16 = AnonymousClass7TE.A0f(r0, "comments_disabled");
        AnonymousClass4Kp A0C7 = C41845B3m.A0C(CreativeConfig.class, "creative_config", CreativeConfig.TYPE_TAG);
        AnonymousClass4L7 A0f17 = AnonymousClass7TE.A0f(r2, "deleted_reason");
        AnonymousClass69U r11 = AnonymousClass69U.A00;
        System.arraycopy(new AnonymousClass4Kr[]{A0C, A0f, A0C2, A0f2, A0f3, A0f4, A0f5, A0f6, A0A, A0f7, A0f8, A0f9, A0C3, A0f10, A0C4, A0f11, A0C5, A0f12, A0A2, A0f13, A0f14, A0C6, A0f15, A0f16, A0C7, A0f17, AnonymousClass7TE.A0f(r11, "device_timestamp")}, 0, r10, 0, 27);
        AnonymousClass4L7 A0f18 = AnonymousClass7TE.A0f(r1, "dominant_color");
        AnonymousClass4L7 A0f19 = AnonymousClass7TE.A0f(r0, "enable_waist");
        int i3 = FacepileTopLikers.TYPE_TAG;
        AnonymousClass4Kp A0A3 = C41845B3m.A0A(AnonymousClass4Ks.A00(), FacepileTopLikers.class, "facepile_top_likers", i3);
        AnonymousClass4L7 A0f20 = AnonymousClass7TE.A0f(r2, "fb_like_count");
        AnonymousClass4L7 A0f21 = AnonymousClass7TE.A0f(r2, "fb_play_count");
        AnonymousClass4L7 A0f22 = AnonymousClass7TE.A0f(r2, "filter_type");
        AnonymousClass4Kp A0C8 = C41845B3m.A0C(FundraiserTag.class, "fundraiser_tag", FundraiserTag.TYPE_TAG);
        AnonymousClass4L7 A0f23 = AnonymousClass7TE.A0f(r0, "has_audio");
        AnonymousClass4L7 A0f24 = AnonymousClass7TE.A0f(r0, "has_delayed_metadata");
        AnonymousClass4L7 A0f25 = AnonymousClass7TE.A0f(r0, "has_hidden_comments");
        AnonymousClass4L7 A0f26 = AnonymousClass7TE.A0f(r0, "has_liked");
        AnonymousClass4L7 A0f27 = AnonymousClass7TE.A0f(r0, "has_more_comments");
        AnonymousClass4L7 A0f28 = AnonymousClass7TE.A0f(r0, "has_reshares");
        AnonymousClass4L7 A0f29 = AnonymousClass7TE.A0f(r2, "has_shared_to_fb");
        AnonymousClass4L7 A0E = C41846B3n.A0E(r0);
        AnonymousClass4L7 A0f30 = AnonymousClass7TE.A0f(r0, "hide_view_all_comment_entrypoint");
        AnonymousClass4L7 A09 = C41846B3n.A09(r1);
        AnonymousClass4L7 A0f31 = AnonymousClass7TE.A0f(r0, "ig_media_sharing_disabled");
        AnonymousClass4Kp A0C9 = C41845B3m.A0C(IgtvSeriesInfo.class, "igtv_series_info", IgtvSeriesInfo.TYPE_TAG);
        AnonymousClass4Kp A0C10 = C41845B3m.A0C(IgtvShoppingInfo.class, "igtv_shopping_info", IgtvShoppingInfo.TYPE_TAG);
        AnonymousClass4Kp A0C11 = C41845B3m.A0C(ImageVersions2.class, "image_versions2", ImageVersions2.TYPE_TAG);
        int i4 = InvitedCoauthorProducers.TYPE_TAG;
        System.arraycopy(new AnonymousClass4Kr[]{A0f18, A0f19, A0A3, A0f20, A0f21, A0f22, A0C8, A0f23, A0f24, A0f25, A0f26, A0f27, A0f28, A0f29, A0E, A0f30, A09, A0f31, A0C9, A0C10, A0C11, C41845B3m.A0A(AnonymousClass4Ks.A00(), InvitedCoauthorProducers.class, "invited_coauthor_producers", i4), AnonymousClass7TE.A0f(r0, "is_artist_pick"), AnonymousClass7TE.A0f(r0, "is_comments_gif_composer_enabled"), AnonymousClass7TE.A0f(r0, "is_currently_promoting_by_sponsor"), AnonymousClass7TE.A0f(r2, "is_dash_eligible"), AnonymousClass7TE.A0f(r0, "is_fb_only")}, 0, r10, 27, 27);
        AnonymousClass4L7 A0f32 = AnonymousClass7TE.A0f(r0, "is_in_profile_grid");
        AnonymousClass4L7 A0f33 = AnonymousClass7TE.A0f(r0, "is_internal_only");
        AnonymousClass4L7 A0f34 = AnonymousClass7TE.A0f(r0, "is_organic_product_tagging_eligible");
        AnonymousClass4L7 A0f35 = AnonymousClass7TE.A0f(r0, "is_paid_partnership");
        AnonymousClass4L7 A0f36 = AnonymousClass7TE.A0f(r0, "is_post_live");
        AnonymousClass4L7 A0f37 = AnonymousClass7TE.A0f(r0, "is_third_party_downloads_eligible");
        AnonymousClass4L7 A0f38 = AnonymousClass7TE.A0f(r0, "is_unified_video");
        AnonymousClass4L7 A0f39 = AnonymousClass7TE.A0f(r0, "is_visual_reply_commenter_notice_enabled");
        C342787pA r7 = C342787pA.A00;
        System.arraycopy(new AnonymousClass4Kr[]{A0f32, A0f33, A0f34, A0f35, A0f36, A0f37, A0f38, A0f39, AnonymousClass7TE.A0f(r7, "lat"), AnonymousClass7TE.A0f(r0, "like_and_view_counts_disabled"), AnonymousClass7TE.A0f(r2, "like_count"), AnonymousClass7TE.A0f(r7, "lng"), C41845B3m.A0C(Location.class, "location", Location.TYPE_TAG), AnonymousClass7TE.A0f(r1, "logging_info_token"), C41845B3m.A0C(MashupInfo.class, "mashup_info", MashupInfo.TYPE_TAG), C41845B3m.A0C(MediaAppreciationSettings.class, "media_appreciation_settings", MediaAppreciationSettings.TYPE_TAG), C41845B3m.A0C(MediaCroppingInfo.class, "media_cropping_info", MediaCroppingInfo.TYPE_TAG), C41845B3m.A0C(MediaNotice.class, "media_notice", MediaNotice.TYPE_TAG), C41845B3m.A0C(MediaOverlayInfo.class, "media_overlay_info", MediaOverlayInfo.TYPE_TAG), C41845B3m.A0O(r2), C41845B3m.A0C(MusicMetadata.class, "music_metadata", MusicMetadata.TYPE_TAG), AnonymousClass7TE.A0f(r1, "next_max_id"), AnonymousClass7TE.A0f(r2, "number_of_qualities"), C41845B3m.A0C(OrganicCtaInfo.class, "organic_cta_info", OrganicCtaInfo.TYPE_TAG), AnonymousClass7TE.A0f(r1, "organic_cta_type"), AnonymousClass7TE.A0f(r1, "organic_tracking_token"), AnonymousClass7TE.A0f(r2, "original_height")}, 0, r10, 54, 27);
        AnonymousClass4L7 A0f40 = AnonymousClass7TE.A0f(r0, "original_media_has_visual_reply_media");
        AnonymousClass4L7 A0f41 = AnonymousClass7TE.A0f(r2, "original_width");
        AnonymousClass4L7 A0f42 = AnonymousClass7TE.A0f(r0, "photo_of_you");
        AnonymousClass4L7 A0f43 = AnonymousClass7TE.A0f(r2, "play_count");
        AnonymousClass4L7 A0f44 = AnonymousClass7TE.A0f(r1, "preview");
        AnonymousClass4Kp A0C12 = C41845B3m.A0C(ProductTags.class, "product_tags", ProductTags.TYPE_TAG);
        AnonymousClass4L7 A0I = C41846B3n.A0I(r1);
        AnonymousClass4L7 A0f45 = AnonymousClass7TE.A0f(r0, "profile_grid_control_enabled");
        AnonymousClass4L7 A0f46 = AnonymousClass7TE.A0f(r2, "reshare_count");
        int i5 = Senders.TYPE_TAG;
        AnonymousClass4Kp A0A4 = C41845B3m.A0A(AnonymousClass4Ks.A00(), Senders.class, "senders", i5);
        AnonymousClass4Kp A0C13 = C41845B3m.A0C(SharingFrictionInfo.class, "sharing_friction_info", SharingFrictionInfo.TYPE_TAG);
        AnonymousClass4L7 A0f47 = AnonymousClass7TE.A0f(r1, "shop_routing_user_id");
        int i6 = SocialContext.TYPE_TAG;
        AnonymousClass4Kp A0A5 = C41845B3m.A0A(AnonymousClass4Ks.A00(), SocialContext.class, "social_context", i6);
        int i7 = SponsorTags.TYPE_TAG;
        AnonymousClass4Kp A0A6 = C41845B3m.A0A(AnonymousClass4Ks.A00(), SponsorTags.class, "sponsor_tags", i7);
        int i8 = StoryPolls.TYPE_TAG;
        AnonymousClass4Kp A0A7 = C41845B3m.A0A(AnonymousClass4Ks.A00(), StoryPolls.class, "story_polls", i8);
        int i9 = StorySliders.TYPE_TAG;
        System.arraycopy(new AnonymousClass4Kr[]{A0f40, A0f41, A0f42, A0f43, A0f44, A0C12, A0I, A0f45, A0f46, A0A4, A0C13, A0f47, A0A5, A0A6, A0A7, C41845B3m.A0A(AnonymousClass4Ks.A00(), StorySliders.class, "story_sliders", i9), AnonymousClass7TE.A0f(r0, "subscribe_cta_visible"), AnonymousClass7TE.A0f(r1, "subscription_media_visibility"), AnonymousClass7TE.A0f(r11, "taken_at"), C41845B3m.A0I(r1), C41845B3m.A0C(UpcomingEvent.class, "upcoming_event", UpcomingEvent.TYPE_TAG), C41845B3m.A0B(User.class, User.TYPE_TAG), C41845B3m.A0C(Usertags.class, "usertags", Usertags.TYPE_TAG), AnonymousClass7TE.A0f(r1, "video_codec"), AnonymousClass7TE.A0f(r1, "video_dash_manifest"), AnonymousClass7TE.A0f(r7, "video_duration"), AnonymousClass7TE.A0f(r7, "video_subtitles_confidence")}, 0, r10, 81, 27);
        AnonymousClass4L7 A0f48 = AnonymousClass7TE.A0f(r1, "video_subtitles_uri");
        int i10 = VideoVersions.TYPE_TAG;
        AnonymousClass4Kp A0A8 = C41845B3m.A0A(AnonymousClass4Ks.A00(), VideoVersions.class, "video_versions", i10);
        AnonymousClass4L7 A0f49 = AnonymousClass7TE.A0f(r2, "view_count");
        AnonymousClass4L7 A0f50 = AnonymousClass7TE.A0f(r2, "view_state_item_type");
        int i11 = VisualCommentReplyStickerInfo.TYPE_TAG;
        return C41846B3n.A0N(new AnonymousClass4Kr[]{A0f48, A0A8, A0f49, A0f50, C41845B3m.A0A(AnonymousClass4Ks.A00(), VisualCommentReplyStickerInfo.class, "visual_comment_reply_sticker_info", i11), C41845B3m.A0C(VisualRepliesInfo.class, "visual_replies_info", VisualRepliesInfo.TYPE_TAG), AnonymousClass7TE.A0f(r1, "xpost_deny_reason"), AnonymousClass7TE.A0f(AnonymousClass4Kz.A00(), "top_likers")}, r10, 0, 108, 8);
    }

    public CreatorInspirationSignalsPlaygroundClipsMediaImpl(int i) {
        super(i);
    }

    public CreatorInspirationSignalsPlaygroundClipsMediaImpl() {
        super(TYPE_TAG);
    }
}
