package com.instagram.debug.devoptions.signalsplayground.repository.graphql;

import X.1E6;
import X.1Xj;
import X.C16635UyV;
import X.C16637UyZ;
import X.C16639Uyb;
import X.C250673ls;
import X.C391289se;
import X.C391299sf;
import X.C391309sg;
import X.C391419sx;
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
import com.google.common.collect.ImmutableList;

public interface CreatorInspirationSignalsPlaygroundClipsMedia extends C250673ls {

    public interface WearableAttributionInfo extends C250673ls {

        public interface WorldLocationPagesInfo extends C250673ls {
            String getCoverPhoto();

            int getPostCount();

            String getWorldId();

            boolean hasPostCount();
        }

        String getAttributionCtaActionUrl();

        String getAttributionCtaText();

        String getAttributionIconUrl();

        String getAttributionSubtitle();

        String getAttributionTitle();

        String getAttributionTopIconUrl();

        HNB getAttributionType();

        int getIconicCurrentPresence();

        String getIconicHorizonWorldDeeplink();

        String getIconicHorizonWorldId();

        String getIconicHorizonWorldName();

        WorldLocationPagesInfo getWorldLocationPagesInfo();

        boolean hasIconicCurrentPresence();

        boolean hasIsWearableMediaProducer();

        boolean isWearableMediaProducer();
    }

    public interface Attribution extends C250673ls {
        String getName();
    }

    public interface BrandedContentAdsBoostPostTokens extends C250673ls {
        String getAccessToken();
    }

    public interface Caption extends C250673ls {

        public interface User extends C250673ls {

            public interface FanClubInfo extends C250673ls {

                public interface FanConsiderationPageRevampEligiblity extends C250673ls {
                    boolean getShouldShowContentPreview();

                    boolean getShouldShowSocialContext();

                    boolean hasShouldShowContentPreview();

                    boolean hasShouldShowSocialContext();
                }

                boolean getAutosaveToExclusiveHighlight();

                int getConnectedMemberCount();

                String getFanClubId();

                String getFanClubName();

                FanConsiderationPageRevampEligiblity getFanConsiderationPageRevampEligiblity();

                boolean getHasEnoughSubscribersForSsc();

                int getSubscriberCount();

                boolean hasAutosaveToExclusiveHighlight();

                boolean hasConnectedMemberCount();

                boolean hasHasEnoughSubscribersForSsc();

                boolean hasIsFanClubGiftingEligible();

                boolean hasIsFanClubReferralEligible();

                boolean hasSubscriberCount();

                boolean isFanClubGiftingEligible();

                boolean isFanClubReferralEligible();
            }

            public interface FriendshipStatus extends C250673ls {
                boolean getFollowing();

                boolean getOutgoingRequest();

                boolean hasFollowing();

                boolean hasIsBestie();

                boolean hasIsFeedFavorite();

                boolean hasIsRestricted();

                boolean hasOutgoingRequest();

                boolean isBestie();

                boolean isFeedFavorite();

                boolean isRestricted();
            }

            int getAllMediaCount();

            C48110EWc getAllowedCommenterType();

            boolean getCanBoostPost();

            boolean getCanSeeOrganicInsights();

            FanClubInfo getFanClubInfo();

            String getFbidV2();

            boolean getFeedPostReshareDisabled();

            FriendshipStatus getFriendshipStatus();

            String getFullName();

            boolean getHasAnonymousProfilePicture();

            boolean getHasOnboardedToTextPostApp();

            String getId();

            String getInteropMessagingUserFbid();

            long getLatestReelMedia();

            int getLikedClipsCount();

            String getPk();

            String getPkId();

            String getProfilePicId();

            String getProfilePicUrl();

            C16637UyZ getReelAutoArchive();

            boolean getShowAccountTransparencyDetails();

            boolean getShowInsightsTerms();

            int getTextPostAppJoinerNumber();

            int getThirdPartyDownloadsEnabled();

            boolean getTransparencyProductEnabled();

            String getUsername();

            boolean hasAllMediaCount();

            boolean hasCanBoostPost();

            boolean hasCanSeeOrganicInsights();

            boolean hasFeedPostReshareDisabled();

            boolean hasHasAnonymousProfilePicture();

            boolean hasHasOnboardedToTextPostApp();

            boolean hasIsFavorite();

            boolean hasIsPrivate();

            boolean hasIsUnpublished();

            boolean hasIsVerified();

            boolean hasLatestReelMedia();

            boolean hasLikedClipsCount();

            boolean hasShowAccountTransparencyDetails();

            boolean hasShowInsightsTerms();

            boolean hasTextPostAppJoinerNumber();

            boolean hasThirdPartyDownloadsEnabled();

            boolean hasTransparencyProductEnabled();

            boolean isFavorite();

            boolean isPrivate();

            boolean isUnpublished();

            boolean isVerified();
        }

        int getBitFlags();

        String getContentType();

        long getCreatedAt();

        long getCreatedAtUtc();

        boolean getDidReportAsSpam();

        boolean getHasTranslation();

        String getMediaId();

        String getPk();

        int getPrivateReplyStatus();

        boolean getShareEnabled();

        String getStatus();

        String getText();

        int getType();

        User getUser();

        String getUserId();

        boolean hasBitFlags();

        boolean hasCreatedAt();

        boolean hasCreatedAtUtc();

        boolean hasDidReportAsSpam();

        boolean hasHasTranslation();

        boolean hasIsCovered();

        boolean hasIsRankedComment();

        boolean hasPrivateReplyStatus();

        boolean hasShareEnabled();

        boolean hasType();

        boolean isCovered();

        boolean isRankedComment();
    }

    public interface ClipsAttributionInfo extends C250673ls {

        public interface PivotPageHeader extends C250673ls {

            public interface Profile extends C250673ls {
                String getFullName();

                String getId();

                String getPk();

                String getPkId();

                String getProfilePicId();

                String getProfilePicUrl();

                String getUsername();

                boolean hasIsPrivate();

                boolean hasIsVerified();

                boolean isPrivate();

                boolean isVerified();
            }

            String getContentUrl();

            String getDeveloperAppLogoUrl();

            String getMediaCount();

            Profile getProfile();
        }

        String getAttributionAppId();

        String getAttributionAppName();

        PivotPageHeader getPivotPageHeader();
    }

    public interface ClipsMetadata extends C250673ls {

        public interface AchievementsInfo extends C250673ls {
            int getNumEarnedAchievements();

            boolean getShowAchievements();

            boolean hasNumEarnedAchievements();

            boolean hasShowAchievements();
        }

        public interface AdditionalAudioInfo extends C250673ls {

            public interface AudioReattributionInfo extends C250673ls {
                boolean getShouldAllowRestore();

                boolean hasShouldAllowRestore();
            }

            String getAdditionalAudioUsername();

            AudioReattributionInfo getAudioReattributionInfo();
        }

        public interface AssetRecommendationInfo extends C250673ls {

            public interface AssetRecommendations extends C250673ls {
                String getAssetId();

                String getAssetName();

                C391289se getAssetType();

                String getCoverArtworkThumbnailUri();

                String getExtra();
            }

            ImmutableList getAssetRecommendations();
        }

        public interface AudioRankingInfo extends C250673ls {
            String getBestAudioClusterId();
        }

        public interface BrandedContentTagInfo extends C250673ls {
            boolean getCanAddTag();

            boolean hasCanAddTag();
        }

        public interface ContentAppreciationInfo extends C250673ls {

            public interface EntryPointContainer extends C250673ls {

                public interface Comment extends C250673ls {
                    RGO getActionType();
                }

                public interface Pill extends C250673ls {
                    RGO getActionType();

                    int getPriority();

                    boolean hasPriority();
                }

                Comment getComment();

                Pill getPill();
            }

            boolean getEnabled();

            EntryPointContainer getEntryPointContainer();

            boolean hasEnabled();
        }

        public interface ContextualHighlightInfo extends C250673ls {
            String getChainingMediaId();

            C48111EWd getContextualHighlightDestinationType();

            String getContextualHighlightId();

            String getContextualHighlightTitle();

            HN8 getContextualHighlightType();
        }

        public interface MashupInfo extends C250673ls {

            public interface OriginalMedia extends C250673ls {

                public interface User extends C250673ls {
                    int getAllMediaCount();

                    C48110EWc getAllowedCommenterType();

                    String getFbidV2();

                    String getFullName();

                    boolean getHasAnonymousProfilePicture();

                    boolean getHasOnboardedToTextPostApp();

                    String getId();

                    String getInteropMessagingUserFbid();

                    int getLikedClipsCount();

                    String getPk();

                    String getPkId();

                    String getProfilePicId();

                    String getProfilePicUrl();

                    C16637UyZ getReelAutoArchive();

                    int getTextPostAppJoinerNumber();

                    int getThirdPartyDownloadsEnabled();

                    String getUsername();

                    boolean hasAllMediaCount();

                    boolean hasHasAnonymousProfilePicture();

                    boolean hasHasOnboardedToTextPostApp();

                    boolean hasIsPrivate();

                    boolean hasIsVerified();

                    boolean hasLikedClipsCount();

                    boolean hasTextPostAppJoinerNumber();

                    boolean hasThirdPartyDownloadsEnabled();

                    boolean isPrivate();

                    boolean isVerified();
                }

                boolean getMashupsAllowed();

                String getMediaType();

                int getNonPrivacyFilteredMashupsMediaCount();

                String getPk();

                String getProductType();

                ImmutableList getSidecarChildMediaIds();

                User getUser();

                boolean hasIsLightWeightCheck();

                boolean hasIsPivotPageAvailable();

                boolean hasMashupsAllowed();

                boolean hasNonPrivacyFilteredMashupsMediaCount();

                boolean isLightWeightCheck();

                boolean isPivotPageAvailable();
            }

            boolean getCanToggleMashupsAllowed();

            boolean getHasBeenMashedUp();

            boolean getHasNonmimicableAdditionalAudio();

            String getMashupType();

            boolean getMashupsAllowed();

            int getNonPrivacyFilteredMashupsMediaCount();

            OriginalMedia getOriginalMedia();

            boolean hasCanToggleMashupsAllowed();

            boolean hasHasBeenMashedUp();

            boolean hasHasNonmimicableAdditionalAudio();

            boolean hasIsCreatorRequestingMashup();

            boolean hasIsLightWeightCheck();

            boolean hasIsPivotPageAvailable();

            boolean hasMashupsAllowed();

            boolean hasNonPrivacyFilteredMashupsMediaCount();

            boolean isCreatorRequestingMashup();

            boolean isLightWeightCheck();

            boolean isPivotPageAvailable();
        }

        public interface MerchandisingPillInfo extends C250673ls {
            int getLoopTime();

            boolean hasLoopTime();
        }

        public interface MusicInfo extends C250673ls {

            public interface MusicAssetInfo extends C250673ls {
                boolean getAllowsSaving();

                String getArtistId();

                String getAudioAssetId();

                String getAudioClusterId();

                String getCoverArtworkThumbnailUri();

                String getCoverArtworkUri();

                String getDashManifest();

                String getDisplayArtist();

                int getDurationInMs();

                String getFastStartProgressiveDownloadUrl();

                boolean getHasLyrics();

                String getId();

                String getIgUsername();

                String getProgressiveDownloadUrl();

                String getSubtitle();

                String getTitle();

                String getWeb30sPreviewDownloadUrl();

                boolean hasAllowsSaving();

                boolean hasDurationInMs();

                boolean hasHasLyrics();

                boolean hasIsExplicit();

                boolean isExplicit();
            }

            public interface MusicConsumptionInfo extends C250673ls {

                public interface IgArtist extends C250673ls {
                    String getFullName();

                    boolean getHasOnboardedToTextPostApp();

                    String getId();

                    String getPk();

                    String getPkId();

                    String getProfilePicId();

                    String getProfilePicUrl();

                    String getUsername();

                    boolean hasHasOnboardedToTextPostApp();

                    boolean hasIsPrivate();

                    boolean hasIsVerified();

                    boolean isPrivate();

                    boolean isVerified();
                }

                boolean getAllowMediaCreationWithMusic();

                int getAudioAssetStartTimeInMs();

                String getDerivedContentId();

                IgArtist getIgArtist();

                int getOverlapDurationInMs();

                String getPlaceholderProfilePicUrl();

                boolean getShouldAllowMusicEditing();

                boolean getShouldMuteAudio();

                String getShouldMuteAudioReason();

                RGN getShouldMuteAudioReasonType();

                int getTrendRank();

                boolean hasAllowMediaCreationWithMusic();

                boolean hasAudioAssetStartTimeInMs();

                boolean hasIsBookmarked();

                boolean hasIsTrendingInClips();

                boolean hasOverlapDurationInMs();

                boolean hasShouldAllowMusicEditing();

                boolean hasShouldMuteAudio();

                boolean hasTrendRank();

                boolean isBookmarked();

                boolean isTrendingInClips();
            }

            MusicAssetInfo getMusicAssetInfo();

            MusicConsumptionInfo getMusicConsumptionInfo();
        }

        public interface OriginalSoundInfo extends C250673ls {

            public interface AudioParts extends C250673ls {
                CreatorInspirationSignalsPlaygroundAudioPartMetadata2 asCreatorInspirationSignalsPlaygroundAudioPartMetadata2();
            }

            public interface AudioPartsByFilter extends C250673ls {
                CreatorInspirationSignalsPlaygroundAudioPartMetadata asCreatorInspirationSignalsPlaygroundAudioPartMetadata();
            }

            public interface ConsumptionInfo extends C250673ls {
                String getShouldMuteAudioReason();

                boolean hasIsBookmarked();

                boolean hasIsTrendingInClips();

                boolean isBookmarked();

                boolean isTrendingInClips();
            }

            public interface IgArtist extends C250673ls {
                String getFullName();

                boolean getHasOnboardedToTextPostApp();

                String getId();

                String getPk();

                String getPkId();

                String getProfilePicId();

                String getProfilePicUrl();

                String getUsername();

                boolean hasHasOnboardedToTextPostApp();

                boolean hasIsPrivate();

                boolean hasIsVerified();

                boolean isPrivate();

                boolean isVerified();
            }

            boolean getAllowCreatorToRename();

            String getAudioAssetId();

            ImmutableList getAudioParts();

            ImmutableList getAudioPartsByFilter();

            boolean getCanRemixBeSharedToFb();

            ConsumptionInfo getConsumptionInfo();

            String getDashManifest();

            int getDurationInMs();

            boolean getHideRemixing();

            IgArtist getIgArtist();

            HN9 getOriginalAudioSubtype();

            String getOriginalAudioTitle();

            String getOriginalMediaId();

            String getProgressiveDownloadUrl();

            boolean getShouldMuteAudio();

            int getTimeCreated();

            int getTrendRank();

            boolean hasAllowCreatorToRename();

            boolean hasCanRemixBeSharedToFb();

            boolean hasDurationInMs();

            boolean hasHideRemixing();

            boolean hasIsAudioAutomaticallyAttributed();

            boolean hasIsExplicit();

            boolean hasIsOriginalAudioDownloadEligible();

            boolean hasIsReuseDisabled();

            boolean hasIsXpostFromFb();

            boolean hasShouldMuteAudio();

            boolean hasTimeCreated();

            boolean hasTrendRank();

            boolean isAudioAutomaticallyAttributed();

            boolean isExplicit();

            boolean isOriginalAudioDownloadEligible();

            boolean isReuseDisabled();

            boolean isXpostFromFb();
        }

        public interface ShoppingInfo extends C250673ls {

            public interface ClipsShoppingCtaBar extends C250673ls {
                double getAnimationTimeSec();

                String getCtaBarType();

                String getDestination();

                String getDominantColor();

                int getDwellTimeSec();

                String getTitle();

                String getToggledDestination();

                String getToggledTitle();

                boolean hasAnimationTimeSec();

                boolean hasDwellTimeSec();
            }

            public interface Merchant extends C250673ls {
                boolean getDisabledSharingProductsToGuides();

                String getId();

                String getPk();

                String getProfilePicUrl();

                String getStorefrontAttributionUsername();

                String getUsername();

                boolean hasDisabledSharingProductsToGuides();

                boolean hasIsVerified();

                boolean isVerified();
            }

            public interface Products extends C250673ls {

                public interface ProductDetails extends C250673ls {

                    public interface AggregatedRating extends C250673ls {
                        int getRatingCount();

                        double getValue();

                        boolean hasRatingCount();

                        boolean hasValue();
                    }

                    public interface ArtsLabels extends C250673ls {

                        public interface Labels extends C250673ls {
                            String getLabelDisplayValue();

                            String getLabelType();
                        }

                        ImmutableList getLabels();
                    }

                    public interface CheckoutProperties extends C250673ls {

                        public interface CurrencyAmount extends C250673ls {
                            String getAmount();

                            String getAmountWithOffset();

                            String getCurrency();

                            int getOffset();

                            boolean hasOffset();
                        }

                        public interface ShippingAndReturn extends C250673ls {

                            public interface ReturnCost extends C250673ls {
                                String getAmount();

                                String getAmountWithOffset();

                                String getCurrency();

                                int getOffset();

                                boolean hasOffset();
                            }

                            public interface ShippingCost extends C250673ls {
                                String getAmount();

                                String getAmountWithOffset();

                                String getCurrency();

                                int getOffset();

                                boolean hasOffset();
                            }

                            ReturnCost getReturnCost();

                            ShippingCost getShippingCost();

                            String getShippingCostStripped();
                        }

                        boolean getCanAddToBag();

                        boolean getCanEnableRestockReminder();

                        boolean getCanShowInventoryQuantity();

                        CurrencyAmount getCurrencyAmount();

                        int getFullInventoryQuantity();

                        boolean getHasFreeShipping();

                        String getIgReferrerFbid();

                        int getInventoryQuantity();

                        boolean getProductGroupHasInventory();

                        String getReceiverId();

                        ShippingAndReturn getShippingAndReturn();

                        int getViewerPurchaseLimit();

                        boolean hasCanAddToBag();

                        boolean hasCanEnableRestockReminder();

                        boolean hasCanShowInventoryQuantity();

                        boolean hasFullInventoryQuantity();

                        boolean hasHasFreeShipping();

                        boolean hasInventoryQuantity();

                        boolean hasIsShopifyMerchant();

                        boolean hasProductGroupHasInventory();

                        boolean hasViewerPurchaseLimit();

                        boolean isShopifyMerchant();
                    }

                    public interface CommerceReviewStatistics extends C250673ls {
                        double getAverageRating();

                        int getReviewCount();

                        boolean hasAverageRating();

                        boolean hasReviewCount();
                    }

                    public interface DiscountInformation extends C250673ls {

                        public interface Discounts extends C250673ls {
                            String getCtaText();

                            String getDescription();

                            String getId();

                            String getName();

                            String getSeeDetailsText();
                        }

                        ImmutableList getDiscounts();
                    }

                    public interface ImageQualityMetadata extends C250673ls {

                        public interface Goodness extends C250673ls {
                            String getId();

                            double getScore();

                            boolean hasScore();
                        }

                        public interface LifestyleBackground extends C250673ls {
                            String getId();

                            double getScore();

                            boolean hasScore();
                        }

                        ImmutableList getGoodness();

                        ImmutableList getLifestyleBackground();
                    }

                    public interface MainImage extends C250673ls {

                        public interface ImageVersions2 extends C250673ls {

                            public interface Candidates extends C250673ls {
                                int getHeight();

                                String getUrl();

                                int getWidth();

                                boolean hasHeight();

                                boolean hasWidth();
                            }

                            ImmutableList getCandidates();
                        }

                        ImageVersions2 getImageVersions2();

                        String getPreview();
                    }

                    public interface Merchant extends C250673ls {
                        boolean getDisabledSharingProductsToGuides();

                        String getId();

                        String getPk();

                        String getProfilePicUrl();

                        String getStorefrontAttributionUsername();

                        String getUsername();

                        boolean hasDisabledSharingProductsToGuides();

                        boolean hasIsVerified();

                        boolean isVerified();
                    }

                    public interface RichTextDescription extends C250673ls {

                        public interface TextWithEntities extends C250673ls {

                            public interface InlineStyleRanges extends C250673ls {
                                int getInlineStyle();

                                int getLength();

                                int getOffset();

                                boolean hasInlineStyle();

                                boolean hasLength();

                                boolean hasOffset();
                            }

                            ImmutableList getInlineStyleRanges();
                        }

                        String getBlockType();

                        int getDepth();

                        TextWithEntities getTextWithEntities();

                        boolean hasDepth();
                    }

                    public interface SellerBadge extends C250673ls {
                        String getDescription();

                        String getName();

                        C48115EWh getType();
                    }

                    public interface ThumbnailImage extends C250673ls {

                        public interface ImageVersions2 extends C250673ls {

                            public interface Candidates extends C250673ls {
                                int getHeight();

                                String getUrl();

                                int getWidth();

                                boolean hasHeight();

                                boolean hasWidth();
                            }

                            ImmutableList getCandidates();
                        }

                        ImageVersions2 getImageVersions2();

                        String getPreview();
                    }

                    public interface VariantValues extends C250673ls {
                        String getId();

                        String getName();

                        String getNormalizedValue();

                        String getValue();

                        C16639Uyb getVisualStyle();

                        boolean hasIsPreselected();

                        boolean isPreselected();
                    }

                    AggregatedRating getAggregatedRating();

                    ArtsLabels getArtsLabels();

                    boolean getCanShareToStory();

                    boolean getCanViewerSeeRnr();

                    CheckoutProperties getCheckoutProperties();

                    C48109EWb getCheckoutStyle();

                    CommerceReviewStatistics getCommerceReviewStatistics();

                    String getCompoundProductId();

                    String getCurrentPrice();

                    String getCurrentPriceAmount();

                    String getCurrentPriceStripped();

                    String getDescription();

                    DiscountInformation getDiscountInformation();

                    String getExternalUrl();

                    String getFullPrice();

                    String getFullPriceAmount();

                    String getFullPriceStripped();

                    boolean getHasVariants();

                    boolean getHasViewerSaved();

                    boolean getIgIsProductEditableOnMobile();

                    ImageQualityMetadata getImageQualityMetadata();

                    MainImage getMainImage();

                    String getMainImageId();

                    Merchant getMerchant();

                    String getName();

                    String getPrice();

                    String getProductId();

                    String getRetailerId();

                    String getReviewStatus();

                    ImmutableList getRichTextDescription();

                    SellerBadge getSellerBadge();

                    RGP getSizeCalibrationScore();

                    ThumbnailImage getThumbnailImage();

                    ImmutableList getVariantValues();

                    boolean hasCanShareToStory();

                    boolean hasCanViewerSeeRnr();

                    boolean hasHasVariants();

                    boolean hasHasViewerSaved();

                    boolean hasIgIsProductEditableOnMobile();

                    boolean hasIsEnteredInDrawing();

                    boolean hasIsInStock();

                    boolean isEnteredInDrawing();

                    boolean isInStock();
                }

                ProductDetails getProductDetails();
            }

            ClipsShoppingCtaBar getClipsShoppingCtaBar();

            Merchant getMerchant();

            ImmutableList getProducts();
        }

        public interface TemplateInfo extends C250673ls {

            public interface AttributionInfo extends C250673ls {
                String getOwnerUsername();

                String getTemplateMediaId();
            }

            public interface EffectsInfo extends C250673ls {

                public interface SegmentEffectsInfo extends C250673ls {
                    long getEffectId();

                    int getSegmentIndex();

                    boolean hasEffectId();

                    boolean hasSegmentIndex();
                }

                ImmutableList getSegmentEffectsInfo();
            }

            public interface SegmentsInfo extends C250673ls {
                long getDurationInMs();

                int getReusableTemplateMediaAssetEndTimeMs();

                int getReusableTemplateMediaAssetStartTimeMs();

                boolean hasDurationInMs();

                boolean hasReusableTemplateMediaAssetEndTimeMs();

                boolean hasReusableTemplateMediaAssetStartTimeMs();
            }

            public interface TimedTextsInfo extends C250673ls {

                public interface TextInfoList extends C250673ls {

                    public interface Colors extends C250673ls {
                        int getCount();

                        String getHexRgbaColor();

                        boolean hasCount();
                    }

                    C16635UyV getAlignment();

                    ImmutableList getColors();

                    double getEndTimeMs();

                    double getFontSize();

                    double getHeight();

                    String getId();

                    double getOffsetX();

                    double getOffsetY();

                    double getRotationDegree();

                    double getScale();

                    double getStartTimeMs();

                    String getText();

                    C391299sf getTextEmphasisMode();

                    C391419sx getTextFormatType();

                    double getWidth();

                    int getZIndex();

                    boolean hasEndTimeMs();

                    boolean hasFontSize();

                    boolean hasHeight();

                    boolean hasIsAnimated();

                    boolean hasOffsetX();

                    boolean hasOffsetY();

                    boolean hasRotationDegree();

                    boolean hasScale();

                    boolean hasStartTimeMs();

                    boolean hasWidth();

                    boolean hasZIndex();

                    int isAnimated();
                }

                ImmutableList getTextInfoList();
            }

            public interface TransitionEffectsInfo extends C250673ls {
                long getDurationInMs();

                int getIndex();

                String getName();

                long getStartTimeInMs();

                boolean hasDurationInMs();

                boolean hasIndex();

                boolean hasStartTimeInMs();
            }

            AttributionInfo getAttributionInfo();

            EffectsInfo getEffectsInfo();

            int getMinNumSegments();

            ImmutableList getSegmentsInfo();

            long getTemplateClipsMediaId();

            TimedTextsInfo getTimedTextsInfo();

            ImmutableList getTransitionEffectsInfo();

            boolean hasMinNumSegments();

            boolean hasTemplateClipsMediaId();
        }

        AchievementsInfo getAchievementsInfo();

        AdditionalAudioInfo getAdditionalAudioInfo();

        AssetRecommendationInfo getAssetRecommendationInfo();

        AudioRankingInfo getAudioRankingInfo();

        UyX getAudioType();

        BrandedContentTagInfo getBrandedContentTagInfo();

        String getClipsCreationEntryPoint();

        ContentAppreciationInfo getContentAppreciationInfo();

        ContextualHighlightInfo getContextualHighlightInfo();

        boolean getDisableUseInClipsClientCache();

        MashupInfo getMashupInfo();

        MerchandisingPillInfo getMerchandisingPillInfo();

        String getMusicCanonicalId();

        MusicInfo getMusicInfo();

        OriginalSoundInfo getOriginalSoundInfo();

        int getProfessionalClipsUpsellType();

        String getReusableTextAttributeString();

        ShoppingInfo getShoppingInfo();

        boolean getShowAchievements();

        boolean getShowTips();

        TemplateInfo getTemplateInfo();

        boolean hasDisableUseInClipsClientCache();

        boolean hasIsFanClubPromoVideo();

        boolean hasIsPublicChatWelcomeVideo();

        boolean hasIsSharedToFb();

        boolean hasProfessionalClipsUpsellType();

        boolean hasShowAchievements();

        boolean hasShowTips();

        boolean isFanClubPromoVideo();

        boolean isPublicChatWelcomeVideo();

        boolean isSharedToFb();
    }

    public interface CoauthorProducers extends C250673ls {
        String getFullName();

        boolean getHasOnboardedToTextPostApp();

        String getId();

        String getPk();

        String getPkId();

        String getProfilePicId();

        String getProfilePicUrl();

        String getUsername();

        boolean hasHasOnboardedToTextPostApp();

        boolean hasIsPrivate();

        boolean hasIsVerified();

        boolean isPrivate();

        boolean isVerified();
    }

    public interface CommentInformTreatment extends C250673ls {
        boolean getShouldHaveInformTreatment();

        String getText();

        boolean hasShouldHaveInformTreatment();
    }

    public interface CreativeConfig extends C250673ls {

        public interface CreationToolInfo extends C250673ls {
            int getAppearanceEffect();

            int getCameraTool();

            String getColorFilters();

            double getDurationSelectorSeconds();

            double getSpeedSelector();

            double getTimerSelectorSeconds();

            boolean hasAppearanceEffect();

            boolean hasCameraTool();

            boolean hasDurationSelectorSeconds();

            boolean hasSpeedSelector();

            boolean hasTimerSelectorSeconds();
        }

        public interface EffectConfigs extends C250673ls {

            public interface AttributionUser extends C250673ls {

                public interface ProfilePicture extends C250673ls {
                    String getUri();
                }

                String getInstagramUserId();

                ProfilePicture getProfilePicture();

                String getUsername();
            }

            public interface ThumbnailImage extends C250673ls {
                String getUri();
            }

            AttributionUser getAttributionUser();

            String getEffectId();

            String getFailureCode();

            String getFailureReason();

            String getId();

            String getName();

            String getSaveStatus();

            ThumbnailImage getThumbnailImage();

            String getTitle();

            boolean hasIsAgeRestricted();

            boolean isAgeRestricted();
        }

        String getCaptureType();

        ImmutableList getCreationToolInfo();

        ImmutableList getEffectConfigs();
    }

    public interface FacepileTopLikers extends C250673ls {
        String getFullName();

        String getId();

        String getPk();

        String getPkId();

        String getProfilePicId();

        String getProfilePicUrl();

        String getUsername();

        boolean hasIsPrivate();

        boolean hasIsVerified();

        boolean isPrivate();

        boolean isVerified();
    }

    public interface FundraiserTag extends C250673ls {
        String getBeneficiaryName();

        String getBeneficiaryUsername();

        boolean getCanViewerDonate();

        boolean getCanViewerRemoveFundraiserTag();

        String getContextualTitleStr();

        String getFormattedAmountRaised();

        String getFormattedFundraiserProgressInfoText();

        String getFormattedGoalAmount();

        String getFundraiserId();

        String getFundraiserOwnerUsername();

        String getFundraiserTitle();

        XRK getFundraiserType();

        String getProgressStr();

        boolean getShowFundraiserOwnerAttribution();

        String getThumbnailDisplayUrl();

        boolean hasCanViewerDonate();

        boolean hasCanViewerRemoveFundraiserTag();

        boolean hasIsMediaOwnerFundraiserOwner();

        boolean hasShowFundraiserOwnerAttribution();

        boolean isMediaOwnerFundraiserOwner();
    }

    public interface IgtvSeriesInfo extends C250673ls {
        boolean getHasCoverPhoto();

        String getId();

        int getNumEpisodes();

        String getTitle();

        boolean hasHasCoverPhoto();

        boolean hasNumEpisodes();
    }

    public interface IgtvShoppingInfo extends C250673ls {

        public interface ClipsShoppingCtaBar extends C250673ls {
            double getAnimationTimeSec();

            String getCtaBarType();

            String getDestination();

            String getDominantColor();

            int getDwellTimeSec();

            String getTitle();

            String getToggledDestination();

            String getToggledTitle();

            boolean hasAnimationTimeSec();

            boolean hasDwellTimeSec();
        }

        public interface Merchant extends C250673ls {
            boolean getDisabledSharingProductsToGuides();

            String getId();

            String getPk();

            String getProfilePicUrl();

            String getUsername();

            boolean hasDisabledSharingProductsToGuides();

            boolean hasIsVerified();

            boolean isVerified();
        }

        public interface Products extends C250673ls {

            public interface ProductDetails extends C250673ls {

                public interface AggregatedRating extends C250673ls {
                    int getRatingCount();

                    double getValue();

                    boolean hasRatingCount();

                    boolean hasValue();
                }

                public interface ArtsLabels extends C250673ls {

                    public interface Labels extends C250673ls {
                        String getLabelDisplayValue();

                        String getLabelType();
                    }

                    ImmutableList getLabels();
                }

                public interface CheckoutProperties extends C250673ls {

                    public interface CurrencyAmount extends C250673ls {
                        String getAmount();

                        String getAmountWithOffset();

                        String getCurrency();

                        int getOffset();

                        boolean hasOffset();
                    }

                    public interface ShippingAndReturn extends C250673ls {

                        public interface ShippingCost extends C250673ls {
                            String getAmount();

                            String getAmountWithOffset();

                            String getCurrency();

                            int getOffset();

                            boolean hasOffset();
                        }

                        ShippingCost getShippingCost();

                        String getShippingCostStripped();
                    }

                    boolean getCanAddToBag();

                    boolean getCanEnableRestockReminder();

                    boolean getCanShowInventoryQuantity();

                    CurrencyAmount getCurrencyAmount();

                    int getFullInventoryQuantity();

                    boolean getHasFreeShipping();

                    String getIgReferrerFbid();

                    int getInventoryQuantity();

                    boolean getProductGroupHasInventory();

                    String getReceiverId();

                    ShippingAndReturn getShippingAndReturn();

                    int getViewerPurchaseLimit();

                    boolean hasCanAddToBag();

                    boolean hasCanEnableRestockReminder();

                    boolean hasCanShowInventoryQuantity();

                    boolean hasFullInventoryQuantity();

                    boolean hasHasFreeShipping();

                    boolean hasInventoryQuantity();

                    boolean hasIsShopifyMerchant();

                    boolean hasProductGroupHasInventory();

                    boolean hasViewerPurchaseLimit();

                    boolean isShopifyMerchant();
                }

                public interface CommerceReviewStatistics extends C250673ls {
                    double getAverageRating();

                    int getReviewCount();

                    boolean hasAverageRating();

                    boolean hasReviewCount();
                }

                public interface DiscountInformation extends C250673ls {

                    public interface Discounts extends C250673ls {
                        String getCtaText();

                        String getDescription();

                        String getId();

                        String getName();

                        String getSeeDetailsText();
                    }

                    ImmutableList getDiscounts();
                }

                public interface ImageQualityMetadata extends C250673ls {

                    public interface Goodness extends C250673ls {
                        String getId();

                        double getScore();

                        boolean hasScore();
                    }

                    public interface LifestyleBackground extends C250673ls {
                        String getId();

                        double getScore();

                        boolean hasScore();
                    }

                    ImmutableList getGoodness();

                    ImmutableList getLifestyleBackground();
                }

                public interface MainImage extends C250673ls {

                    public interface ImageVersions2 extends C250673ls {

                        public interface Candidates extends C250673ls {
                            int getHeight();

                            String getUrl();

                            int getWidth();

                            boolean hasHeight();

                            boolean hasWidth();
                        }

                        ImmutableList getCandidates();
                    }

                    ImageVersions2 getImageVersions2();

                    String getPreview();
                }

                public interface Merchant extends C250673ls {
                    boolean getDisabledSharingProductsToGuides();

                    String getId();

                    String getPk();

                    String getProfilePicUrl();

                    String getUsername();

                    boolean hasDisabledSharingProductsToGuides();

                    boolean hasIsVerified();

                    boolean isVerified();
                }

                public interface ThumbnailImage extends C250673ls {

                    public interface ImageVersions2 extends C250673ls {

                        public interface Candidates extends C250673ls {
                            int getHeight();

                            String getUrl();

                            int getWidth();

                            boolean hasHeight();

                            boolean hasWidth();
                        }

                        ImmutableList getCandidates();
                    }

                    ImageVersions2 getImageVersions2();

                    String getPreview();
                }

                public interface VariantValues extends C250673ls {
                    String getId();

                    String getName();

                    String getNormalizedValue();

                    String getValue();

                    C16639Uyb getVisualStyle();

                    boolean hasIsPreselected();

                    boolean isPreselected();
                }

                AggregatedRating getAggregatedRating();

                ArtsLabels getArtsLabels();

                boolean getCanShareToStory();

                boolean getCanViewerSeeRnr();

                CheckoutProperties getCheckoutProperties();

                C48109EWb getCheckoutStyle();

                CommerceReviewStatistics getCommerceReviewStatistics();

                String getCompoundProductId();

                String getCurrentPrice();

                String getCurrentPriceAmount();

                String getCurrentPriceStripped();

                String getDescription();

                DiscountInformation getDiscountInformation();

                String getExternalUrl();

                String getFullPrice();

                String getFullPriceAmount();

                String getFullPriceStripped();

                boolean getHasVariants();

                boolean getHasViewerSaved();

                boolean getIgIsProductEditableOnMobile();

                ImageQualityMetadata getImageQualityMetadata();

                MainImage getMainImage();

                String getMainImageId();

                Merchant getMerchant();

                String getName();

                String getPrice();

                String getProductId();

                String getRetailerId();

                String getReviewStatus();

                RGP getSizeCalibrationScore();

                ThumbnailImage getThumbnailImage();

                ImmutableList getVariantValues();

                boolean hasCanShareToStory();

                boolean hasCanViewerSeeRnr();

                boolean hasHasVariants();

                boolean hasHasViewerSaved();

                boolean hasIgIsProductEditableOnMobile();

                boolean hasIsEnteredInDrawing();

                boolean hasIsInStock();

                boolean isEnteredInDrawing();

                boolean isInStock();
            }

            ProductDetails getProductDetails();
        }

        ClipsShoppingCtaBar getClipsShoppingCtaBar();

        Merchant getMerchant();

        ImmutableList getProducts();
    }

    public interface ImageVersions2 extends C250673ls {

        public interface AdditionalCandidates extends C250673ls {

            public interface FirstFrame extends C250673ls {
                int getHeight();

                String getScansProfile();

                String getUrl();

                int getWidth();

                boolean hasHeight();

                boolean hasWidth();
            }

            public interface IgtvFirstFrame extends C250673ls {
                int getHeight();

                String getScansProfile();

                String getUrl();

                int getWidth();

                boolean hasHeight();

                boolean hasWidth();
            }

            FirstFrame getFirstFrame();

            IgtvFirstFrame getIgtvFirstFrame();
        }

        public interface Candidates extends C250673ls {
            int getHeight();

            String getScansProfile();

            String getUrl();

            int getWidth();

            boolean hasHeight();

            boolean hasWidth();
        }

        public interface ScrubberSpritesheetInfoCandidates extends C250673ls {

            public interface Default extends C250673ls {
                int getFileSizeKb();

                int getMaxThumbnailsPerSprite();

                int getRenderedWidth();

                int getSpriteHeight();

                int getSpriteWidth();

                double getThumbnailDuration();

                int getThumbnailHeight();

                int getThumbnailWidth();

                int getThumbnailsPerRow();

                int getTotalThumbnailNumPerSprite();

                double getVideoLength();

                boolean hasFileSizeKb();

                boolean hasMaxThumbnailsPerSprite();

                boolean hasRenderedWidth();

                boolean hasSpriteHeight();

                boolean hasSpriteWidth();

                boolean hasThumbnailDuration();

                boolean hasThumbnailHeight();

                boolean hasThumbnailWidth();

                boolean hasThumbnailsPerRow();

                boolean hasTotalThumbnailNumPerSprite();

                boolean hasVideoLength();
            }

            Default getDefault();
        }

        AdditionalCandidates getAdditionalCandidates();

        ImmutableList getCandidates();

        ScrubberSpritesheetInfoCandidates getScrubberSpritesheetInfoCandidates();

        boolean getSmartThumbnailEnabled();

        boolean hasSmartThumbnailEnabled();
    }

    public interface InvitedCoauthorProducers extends C250673ls {
        String getFullName();

        boolean getHasOnboardedToTextPostApp();

        String getId();

        String getPk();

        String getPkId();

        String getProfilePicId();

        String getProfilePicUrl();

        String getUsername();

        boolean hasHasOnboardedToTextPostApp();

        boolean hasIsPrivate();

        boolean hasIsVerified();

        boolean isPrivate();

        boolean isVerified();
    }

    public interface Location extends C250673ls {
        String getAddress();

        String getCity();

        String getExternalSource();

        long getFacebookPlacesId();

        boolean getHasViewerSaved();

        double getLat();

        double getLng();

        String getName();

        long getPk();

        String getShortName();

        boolean hasFacebookPlacesId();

        boolean hasHasViewerSaved();

        boolean hasIsEligibleForGuides();

        boolean hasLat();

        boolean hasLng();

        boolean hasPk();

        boolean isEligibleForGuides();
    }

    public interface MashupInfo extends C250673ls {
        boolean getCanToggleMashupsAllowed();

        boolean getHasBeenMashedUp();

        boolean getHasNonmimicableAdditionalAudio();

        boolean getMashupsAllowed();

        boolean hasCanToggleMashupsAllowed();

        boolean hasHasBeenMashedUp();

        boolean hasHasNonmimicableAdditionalAudio();

        boolean hasIsCreatorRequestingMashup();

        boolean hasIsLightWeightCheck();

        boolean hasIsPivotPageAvailable();

        boolean hasMashupsAllowed();

        boolean isCreatorRequestingMashup();

        boolean isLightWeightCheck();

        boolean isPivotPageAvailable();
    }

    public interface MediaAppreciationSettings extends C250673ls {
        C48113EWf getGiftCountVisibility();

        C391309sg getMediaGiftingState();
    }

    public interface MediaCroppingInfo extends C250673ls {

        public interface FeedPreviewCrop extends C250673ls {
            double getCropBottom();

            double getCropLeft();

            double getCropRight();

            double getCropTop();

            boolean hasCropBottom();

            boolean hasCropLeft();

            boolean hasCropRight();

            boolean hasCropTop();
        }

        public interface SquareCrop extends C250673ls {
            double getCropBottom();

            double getCropLeft();

            double getCropRight();

            double getCropTop();

            boolean hasCropBottom();

            boolean hasCropLeft();

            boolean hasCropRight();

            boolean hasCropTop();
        }

        FeedPreviewCrop getFeedPreviewCrop();

        SquareCrop getSquareCrop();

        String getStrongId();
    }

    public interface MediaNotice extends C250673ls {
        UyW getNoticeIcon();

        String getNoticeSubText();

        String getNoticeText();

        String getNoticeUrl();
    }

    public interface MediaOverlayInfo extends C250673ls {

        public interface Buttons extends C250673ls {

            public interface Icon extends C250673ls {
                int getIconGlyph();

                int getIconType();

                String getName();

                boolean hasIconGlyph();

                boolean hasIconType();
            }

            public interface TextColor extends C250673ls {
                String getDark();

                String getLight();
            }

            int getAction();

            String getActionUrl();

            int getButtonType();

            boolean getHasChevron();

            Icon getIcon();

            String getSecondaryText();

            String getText();

            TextColor getTextColor();

            boolean hasAction();

            boolean hasButtonType();

            boolean hasHasChevron();

            boolean hasIsTextCentered();

            boolean isTextCentered();
        }

        public interface Icon extends C250673ls {
            int getIconGlyph();

            int getIconType();

            String getName();

            boolean hasIconGlyph();

            boolean hasIconType();
        }

        ImmutableList getButtons();

        String getDescription();

        Icon getIcon();

        int getMisinformationType();

        int getOverlayAppliedTimestamp();

        int getOverlayLayout();

        String getOverlayType();

        String getSessionId();

        String getSubCategory();

        String getTitle();

        boolean hasMisinformationType();

        boolean hasOverlayAppliedTimestamp();

        boolean hasOverlayLayout();
    }

    public interface MusicMetadata extends C250673ls {

        public interface OriginalSoundInfo extends C250673ls {

            public interface AudioParts extends C250673ls {
                CreatorInspirationSignalsPlaygroundAudioPartMetadata asCreatorInspirationSignalsPlaygroundAudioPartMetadata();
            }

            public interface AudioPartsByFilter extends C250673ls {
                CreatorInspirationSignalsPlaygroundAudioPartMetadata asCreatorInspirationSignalsPlaygroundAudioPartMetadata();
            }

            public interface ConsumptionInfo extends C250673ls {
                String getShouldMuteAudioReason();

                boolean hasIsBookmarked();

                boolean hasIsTrendingInClips();

                boolean isBookmarked();

                boolean isTrendingInClips();
            }

            public interface IgArtist extends C250673ls {
                String getFullName();

                String getId();

                String getPk();

                String getPkId();

                String getProfilePicId();

                String getProfilePicUrl();

                String getUsername();

                boolean hasIsPrivate();

                boolean hasIsVerified();

                boolean isPrivate();

                boolean isVerified();
            }

            boolean getAllowCreatorToRename();

            String getAudioAssetId();

            ImmutableList getAudioParts();

            ImmutableList getAudioPartsByFilter();

            boolean getCanRemixBeSharedToFb();

            ConsumptionInfo getConsumptionInfo();

            String getDashManifest();

            int getDurationInMs();

            boolean getHideRemixing();

            IgArtist getIgArtist();

            HN9 getOriginalAudioSubtype();

            String getOriginalAudioTitle();

            String getOriginalMediaId();

            String getProgressiveDownloadUrl();

            boolean getShouldMuteAudio();

            int getTimeCreated();

            int getTrendRank();

            boolean hasAllowCreatorToRename();

            boolean hasCanRemixBeSharedToFb();

            boolean hasDurationInMs();

            boolean hasHideRemixing();

            boolean hasIsAudioAutomaticallyAttributed();

            boolean hasIsExplicit();

            boolean hasIsOriginalAudioDownloadEligible();

            boolean hasIsReuseDisabled();

            boolean hasIsXpostFromFb();

            boolean hasShouldMuteAudio();

            boolean hasTimeCreated();

            boolean hasTrendRank();

            boolean isAudioAutomaticallyAttributed();

            boolean isExplicit();

            boolean isOriginalAudioDownloadEligible();

            boolean isReuseDisabled();

            boolean isXpostFromFb();
        }

        UyX getAudioType();

        String getMusicCanonicalId();

        OriginalSoundInfo getOriginalSoundInfo();
    }

    public interface OrganicCtaInfo extends C250673ls {
        String getCtaSubtitle();

        String getCtaTitle();

        C62604Kib getCtaType();
    }

    public interface ProductTags extends C250673ls {

        public interface In extends C250673ls {

            public interface Product extends C250673ls {

                public interface AggregatedRating extends C250673ls {
                    int getRatingCount();

                    double getValue();

                    boolean hasRatingCount();

                    boolean hasValue();
                }

                public interface ArtsLabels extends C250673ls {

                    public interface Labels extends C250673ls {
                        String getLabelDisplayValue();

                        String getLabelType();
                    }

                    ImmutableList getLabels();
                }

                public interface CheckoutProperties extends C250673ls {

                    public interface CurrencyAmount extends C250673ls {
                        String getAmount();

                        String getAmountWithOffset();

                        String getCurrency();

                        int getOffset();

                        boolean hasOffset();
                    }

                    public interface ShippingAndReturn extends C250673ls {

                        public interface ReturnCost extends C250673ls {
                            String getAmount();

                            String getAmountWithOffset();

                            String getCurrency();

                            int getOffset();

                            boolean hasOffset();
                        }

                        public interface ShippingCost extends C250673ls {
                            String getAmount();

                            String getAmountWithOffset();

                            String getCurrency();

                            int getOffset();

                            boolean hasOffset();
                        }

                        ReturnCost getReturnCost();

                        ShippingCost getShippingCost();

                        String getShippingCostStripped();
                    }

                    boolean getCanAddToBag();

                    boolean getCanEnableRestockReminder();

                    CurrencyAmount getCurrencyAmount();

                    int getFullInventoryQuantity();

                    boolean getHasFreeShipping();

                    String getIgReferrerFbid();

                    int getInventoryQuantity();

                    boolean getProductGroupHasInventory();

                    String getReceiverId();

                    ShippingAndReturn getShippingAndReturn();

                    int getViewerPurchaseLimit();

                    boolean hasCanAddToBag();

                    boolean hasCanEnableRestockReminder();

                    boolean hasFullInventoryQuantity();

                    boolean hasHasFreeShipping();

                    boolean hasInventoryQuantity();

                    boolean hasIsShopifyMerchant();

                    boolean hasProductGroupHasInventory();

                    boolean hasViewerPurchaseLimit();

                    boolean isShopifyMerchant();
                }

                public interface CommerceReviewStatistics extends C250673ls {
                    double getAverageRating();

                    int getReviewCount();

                    boolean hasAverageRating();

                    boolean hasReviewCount();
                }

                public interface DiscountInformation extends C250673ls {

                    public interface Discounts extends C250673ls {
                        String getCtaText();

                        String getDescription();

                        String getId();

                        String getName();

                        String getSeeDetailsText();
                    }

                    ImmutableList getDiscounts();
                }

                public interface ImageQualityMetadata extends C250673ls {

                    public interface Goodness extends C250673ls {
                        String getId();

                        double getScore();

                        boolean hasScore();
                    }

                    public interface LifestyleBackground extends C250673ls {
                        String getId();

                        double getScore();

                        boolean hasScore();
                    }

                    ImmutableList getGoodness();

                    ImmutableList getLifestyleBackground();
                }

                public interface MainImage extends C250673ls {

                    public interface ImageVersions2 extends C250673ls {

                        public interface Candidates extends C250673ls {
                            int getHeight();

                            String getUrl();

                            int getWidth();

                            boolean hasHeight();

                            boolean hasWidth();
                        }

                        ImmutableList getCandidates();
                    }

                    ImageVersions2 getImageVersions2();

                    String getPreview();
                }

                public interface Merchant extends C250673ls {
                    boolean getDisabledSharingProductsToGuides();

                    String getId();

                    String getPk();

                    String getProfilePicUrl();

                    String getStorefrontAttributionUsername();

                    String getUsername();

                    boolean hasDisabledSharingProductsToGuides();

                    boolean hasIsVerified();

                    boolean isVerified();
                }

                public interface RichTextDescription extends C250673ls {

                    public interface TextWithEntities extends C250673ls {

                        public interface InlineStyleRanges extends C250673ls {
                            int getInlineStyle();

                            int getLength();

                            int getOffset();

                            boolean hasInlineStyle();

                            boolean hasLength();

                            boolean hasOffset();
                        }

                        ImmutableList getInlineStyleRanges();

                        String getText();
                    }

                    String getBlockType();

                    int getDepth();

                    TextWithEntities getTextWithEntities();

                    boolean hasDepth();
                }

                public interface SellerBadge extends C250673ls {
                    String getDescription();

                    String getName();

                    C48115EWh getType();
                }

                public interface ThumbnailImage extends C250673ls {

                    public interface ImageVersions2 extends C250673ls {

                        public interface Candidates extends C250673ls {
                            int getHeight();

                            String getUrl();

                            int getWidth();

                            boolean hasHeight();

                            boolean hasWidth();
                        }

                        ImmutableList getCandidates();
                    }

                    ImageVersions2 getImageVersions2();
                }

                AggregatedRating getAggregatedRating();

                ArtsLabels getArtsLabels();

                boolean getCanShareToStory();

                boolean getCanViewerSeeRnr();

                CheckoutProperties getCheckoutProperties();

                C48109EWb getCheckoutStyle();

                CommerceReviewStatistics getCommerceReviewStatistics();

                String getCompoundProductId();

                String getCurrentPrice();

                String getCurrentPriceAmount();

                String getCurrentPriceStripped();

                String getDescription();

                DiscountInformation getDiscountInformation();

                String getExternalUrl();

                String getFullPrice();

                String getFullPriceAmount();

                String getFullPriceStripped();

                boolean getHasVariants();

                boolean getHasViewerSaved();

                boolean getIgIsProductEditableOnMobile();

                ImageQualityMetadata getImageQualityMetadata();

                MainImage getMainImage();

                String getMainImageId();

                Merchant getMerchant();

                String getName();

                String getPrice();

                String getProductId();

                String getRetailerId();

                String getReviewStatus();

                ImmutableList getRichTextDescription();

                SellerBadge getSellerBadge();

                RGP getSizeCalibrationScore();

                ThumbnailImage getThumbnailImage();

                boolean hasCanShareToStory();

                boolean hasCanViewerSeeRnr();

                boolean hasHasVariants();

                boolean hasHasViewerSaved();

                boolean hasIgIsProductEditableOnMobile();

                boolean hasIsEnteredInDrawing();

                boolean hasIsInStock();

                boolean isEnteredInDrawing();

                boolean isInStock();
            }

            int getDestination();

            Product getProduct();

            boolean hasDestination();

            boolean hasIsRemovable();

            boolean isRemovable();
        }

        ImmutableList getIn();
    }

    public interface Senders extends C250673ls {
        String getId();

        String getProfilePicUrl();
    }

    public interface SharingFrictionInfo extends C250673ls {
        boolean getShouldHaveSharingFriction();

        boolean hasShouldHaveSharingFriction();
    }

    public interface SocialContext extends C250673ls {

        public interface SocialContextFacepileUsers extends C250673ls {
            String getFullName();

            String getId();

            String getPk();

            String getPkId();

            String getProfilePicId();

            String getProfilePicUrl();

            String getUsername();

            boolean hasIsPrivate();

            boolean hasIsVerified();

            boolean isPrivate();

            boolean isVerified();
        }

        ImmutableList getSocialContextFacepileUsers();

        HNA getSocialContextType();

        int getSocialContextUsersCount();

        boolean hasSocialContextUsersCount();
    }

    public interface SponsorTags extends C250673ls {

        public interface Sponsor extends C250673ls {
            String getFullName();

            boolean getHasOnboardedToTextPostApp();

            String getId();

            String getPk();

            String getPkId();

            String getProfilePicId();

            String getProfilePicUrl();

            String getUsername();

            boolean hasHasOnboardedToTextPostApp();

            boolean hasIsPrivate();

            boolean hasIsUnpublished();

            boolean hasIsVerified();

            boolean isPrivate();

            boolean isUnpublished();

            boolean isVerified();
        }

        boolean getPermission();

        Sponsor getSponsor();

        boolean hasIsPending();

        boolean hasPermission();

        boolean isPending();
    }

    public interface StoryPolls extends C250673ls {

        public interface PollSticker extends C250673ls {

            public interface Tallies extends C250673ls {
                int getCount();

                double getFontSize();

                String getText();

                boolean hasCount();

                boolean hasFontSize();
            }

            String getColor();

            boolean getFinished();

            String getId();

            String getPollId();

            String getPollType();

            String getQuestion();

            ImmutableList getTallies();

            boolean getViewerCanVote();

            int getViewerVote();

            boolean hasFinished();

            boolean hasIsMultiOptionPoll();

            boolean hasIsSharedResult();

            boolean hasViewerCanVote();

            boolean hasViewerVote();

            boolean isMultiOptionPoll();

            boolean isSharedResult();
        }

        double getEndTimeMs();

        double getHeight();

        PollSticker getPollSticker();

        double getRotation();

        double getStartTimeMs();

        double getWidth();

        double getX();

        double getY();

        double getZ();

        boolean hasEndTimeMs();

        boolean hasHeight();

        boolean hasIsFbSticker();

        boolean hasIsHidden();

        boolean hasIsPinned();

        boolean hasIsSticker();

        boolean hasRotation();

        boolean hasStartTimeMs();

        boolean hasWidth();

        boolean hasX();

        boolean hasY();

        boolean hasZ();

        int isFbSticker();

        int isHidden();

        int isPinned();

        int isSticker();
    }

    public interface StorySliders extends C250673ls {

        public interface SliderSticker extends C250673ls {
            String getBackgroundColor();

            String getEmoji();

            String getQuestion();

            String getSliderId();

            double getSliderVoteAverage();

            int getSliderVoteCount();

            String getTextColor();

            boolean getViewerCanVote();

            boolean hasIsInteractiveMusicSticker();

            boolean hasSliderVoteAverage();

            boolean hasSliderVoteCount();

            boolean hasViewerCanVote();

            boolean isInteractiveMusicSticker();
        }

        double getEndTimeMs();

        double getHeight();

        double getRotation();

        SliderSticker getSliderSticker();

        double getStartTimeMs();

        double getWidth();

        double getX();

        double getY();

        double getZ();

        boolean hasEndTimeMs();

        boolean hasHeight();

        boolean hasIsFbSticker();

        boolean hasIsHidden();

        boolean hasIsPinned();

        boolean hasIsSticker();

        boolean hasRotation();

        boolean hasStartTimeMs();

        boolean hasWidth();

        boolean hasX();

        boolean hasY();

        boolean hasZ();

        int isFbSticker();

        int isHidden();

        int isPinned();

        int isSticker();
    }

    public interface UpcomingEvent extends C250673ls {

        public interface Owner extends C250673ls {
            String getId();

            String getPk();
        }

        long getEndTime();

        String getId();

        Owner getOwner();

        boolean getReminderEnabled();

        long getStartTime();

        String getStrongId();

        String getTitle();

        C48119EWl getUpcomingEventIdType();

        boolean hasEndTime();

        boolean hasReminderEnabled();

        boolean hasStartTime();
    }

    public interface User extends C250673ls {
        CreatorInspirationSignalsPlaygroundTestUser asCreatorInspirationSignalsPlaygroundTestUser();
    }

    public interface Usertags extends C250673ls {

        public interface In extends C250673ls {

            public interface User extends C250673ls {

                public interface FriendshipStatus extends C250673ls {
                    boolean getBlocking();

                    boolean getFollowedBy();

                    boolean getFollowing();

                    boolean getIncomingRequest();

                    boolean getMuting();

                    boolean getOutgoingRequest();

                    boolean hasBlocking();

                    boolean hasFollowedBy();

                    boolean hasFollowing();

                    boolean hasIncomingRequest();

                    boolean hasIsBestie();

                    boolean hasIsFeedFavorite();

                    boolean hasIsPrivate();

                    boolean hasIsRestricted();

                    boolean hasMuting();

                    boolean hasOutgoingRequest();

                    boolean isBestie();

                    boolean isFeedFavorite();

                    boolean isPrivate();

                    boolean isRestricted();
                }

                FriendshipStatus getFriendshipStatus();

                String getFullName();

                boolean getHasOnboardedToTextPostApp();

                String getId();

                String getPk();

                String getPkId();

                String getProfilePicId();

                String getProfilePicUrl();

                String getUsername();

                boolean hasHasOnboardedToTextPostApp();

                boolean hasIsPrivate();

                boolean hasIsVerified();

                boolean isPrivate();

                boolean isVerified();
            }

            boolean getShowCategoryOfUser();

            User getUser();

            boolean hasShowCategoryOfUser();
        }

        ImmutableList getIn();
    }

    public interface VideoVersions extends C250673ls {
        int getHeight();

        String getId();

        int getType();

        String getUrl();

        int getWidth();

        boolean hasHeight();

        boolean hasType();

        boolean hasWidth();
    }

    public interface VisualCommentReplyStickerInfo extends C250673ls {

        public interface VcrSticker extends C250673ls {

            public interface OriginalCommentAuthor extends C250673ls {
                String getFullName();

                boolean getHasOnboardedToTextPostApp();

                String getId();

                String getPk();

                String getPkId();

                String getProfilePicId();

                String getProfilePicUrl();

                String getUsername();

                boolean hasHasOnboardedToTextPostApp();

                boolean hasIsPrivate();

                boolean hasIsVerified();

                boolean isPrivate();

                boolean isVerified();
            }

            boolean getCanViewerLinkBackToOriginalMediaFromVcr();

            String getEndBackgroundColor();

            double getEndTimeMs();

            OriginalCommentAuthor getOriginalCommentAuthor();

            String getOriginalCommentId();

            String getOriginalCommentText();

            String getOriginalMediaId();

            String getStartBackgroundColor();

            double getStartTimeMs();

            String getTextColor();

            boolean hasCanViewerLinkBackToOriginalMediaFromVcr();

            boolean hasEndTimeMs();

            boolean hasStartTimeMs();
        }

        double getEndTimeMs();

        double getHeight();

        double getRotation();

        double getStartTimeMs();

        VcrSticker getVcrSticker();

        double getWidth();

        double getX();

        double getY();

        double getZ();

        boolean hasEndTimeMs();

        boolean hasHeight();

        boolean hasIsFbSticker();

        boolean hasIsHidden();

        boolean hasIsPinned();

        boolean hasIsSticker();

        boolean hasRotation();

        boolean hasStartTimeMs();

        boolean hasWidth();

        boolean hasX();

        boolean hasY();

        boolean hasZ();

        int isFbSticker();

        int isHidden();

        int isPinned();

        int isSticker();
    }

    public interface VisualRepliesInfo extends C250673ls {

        public interface CommentInfo extends C250673ls {
            String getCommentId();

            String getCommenterUsername();
        }

        public interface OriginalMedia extends C250673ls {
            String getPk();
        }

        boolean getCanViewerLinkBackToOriginalMediaFromVcr();

        CommentInfo getCommentInfo();

        OriginalMedia getOriginalMedia();

        boolean hasCanViewerLinkBackToOriginalMediaFromVcr();
    }

    1Xj asApiTypeModel(1E6 r1);

    1Xj asRestModel__DO_NOT_USE(1E6 r1);

    boolean getAreRemixesCrosspostable();

    Attribution getAttribution();

    String getAudience();

    String getBoostUnavailableIdentifier();

    String getBoostUnavailableReason();

    String getBoostedBySponsor();

    String getBoostedStatus();

    ImmutableList getBrandedContentAdsBoostPostTokens();

    boolean getCanSeeInsightsAsBrand();

    boolean getCanViewerReshare();

    boolean getCanViewerSave();

    Caption getCaption();

    boolean getCaptionIsEdited();

    ClipsAttributionInfo getClipsAttributionInfo();

    ClipsMetadata getClipsMetadata();

    ImmutableList getClipsTabPinnedUserIds();

    boolean getCoauthorProducerCanSeeOrganicInsights();

    ImmutableList getCoauthorProducers();

    String getCode();

    int getCommentCount();

    CommentInformTreatment getCommentInformTreatment();

    boolean getCommentingDisabledForViewer();

    boolean getCommentsDisabled();

    CreativeConfig getCreativeConfig();

    int getDeletedReason();

    long getDeviceTimestamp();

    String getDominantColor();

    boolean getEnableWaist();

    ImmutableList getFacepileTopLikers();

    int getFbLikeCount();

    int getFbPlayCount();

    int getFilterType();

    FundraiserTag getFundraiserTag();

    boolean getHasAudio();

    boolean getHasDelayedMetadata();

    boolean getHasHiddenComments();

    boolean getHasLiked();

    boolean getHasMoreComments();

    boolean getHasReshares();

    int getHasSharedToFb();

    boolean getHasViewerSaved();

    boolean getHideViewAllCommentEntrypoint();

    String getId();

    boolean getIgMediaSharingDisabled();

    IgtvSeriesInfo getIgtvSeriesInfo();

    IgtvShoppingInfo getIgtvShoppingInfo();

    ImageVersions2 getImageVersions2();

    ImmutableList getInvitedCoauthorProducers();

    double getLat();

    boolean getLikeAndViewCountsDisabled();

    int getLikeCount();

    double getLng();

    Location getLocation();

    String getLoggingInfoToken();

    MashupInfo getMashupInfo();

    MediaAppreciationSettings getMediaAppreciationSettings();

    MediaCroppingInfo getMediaCroppingInfo();

    MediaNotice getMediaNotice();

    MediaOverlayInfo getMediaOverlayInfo();

    int getMediaType();

    MusicMetadata getMusicMetadata();

    String getNextMaxId();

    int getNumberOfQualities();

    OrganicCtaInfo getOrganicCtaInfo();

    C62604Kib getOrganicCtaType();

    String getOrganicTrackingToken();

    int getOriginalHeight();

    boolean getOriginalMediaHasVisualReplyMedia();

    int getOriginalWidth();

    boolean getPhotoOfYou();

    int getPlayCount();

    String getPreview();

    ProductTags getProductTags();

    String getProductType();

    boolean getProfileGridControlEnabled();

    int getReshareCount();

    ImmutableList getSenders();

    SharingFrictionInfo getSharingFrictionInfo();

    String getShopRoutingUserId();

    ImmutableList getSocialContext();

    ImmutableList getSponsorTags();

    ImmutableList getStoryPolls();

    ImmutableList getStorySliders();

    boolean getSubscribeCtaVisible();

    String getSubscriptionMediaVisibility();

    long getTakenAt();

    String getTitle();

    ImmutableList getTopLikers();

    UpcomingEvent getUpcomingEvent();

    User getUser();

    Usertags getUsertags();

    String getVideoCodec();

    String getVideoDashManifest();

    double getVideoDuration();

    double getVideoSubtitlesConfidence();

    String getVideoSubtitlesUri();

    ImmutableList getVideoVersions();

    int getViewCount();

    int getViewStateItemType();

    ImmutableList getVisualCommentReplyStickerInfo();

    VisualRepliesInfo getVisualRepliesInfo();

    WearableAttributionInfo getWearableAttributionInfo();

    String getXpostDenyReason();

    boolean hasAreRemixesCrosspostable();

    boolean hasCanSeeInsightsAsBrand();

    boolean hasCanViewerReshare();

    boolean hasCanViewerSave();

    boolean hasCaptionIsEdited();

    boolean hasCoauthorProducerCanSeeOrganicInsights();

    boolean hasCommentCount();

    boolean hasCommentingDisabledForViewer();

    boolean hasCommentsDisabled();

    boolean hasDeletedReason();

    boolean hasDeviceTimestamp();

    boolean hasEnableWaist();

    boolean hasFbLikeCount();

    boolean hasFbPlayCount();

    boolean hasFilterType();

    boolean hasHasAudio();

    boolean hasHasDelayedMetadata();

    boolean hasHasHiddenComments();

    boolean hasHasLiked();

    boolean hasHasMoreComments();

    boolean hasHasReshares();

    boolean hasHasSharedToFb();

    boolean hasHasViewerSaved();

    boolean hasHideViewAllCommentEntrypoint();

    boolean hasIgMediaSharingDisabled();

    boolean hasIsArtistPick();

    boolean hasIsCommentsGifComposerEnabled();

    boolean hasIsCurrentlyPromotingBySponsor();

    boolean hasIsDashEligible();

    boolean hasIsFbOnly();

    boolean hasIsInProfileGrid();

    boolean hasIsInternalOnly();

    boolean hasIsOrganicProductTaggingEligible();

    boolean hasIsPaidPartnership();

    boolean hasIsPostLive();

    boolean hasIsThirdPartyDownloadsEligible();

    boolean hasIsUnifiedVideo();

    boolean hasIsVisualReplyCommenterNoticeEnabled();

    boolean hasLat();

    boolean hasLikeAndViewCountsDisabled();

    boolean hasLikeCount();

    boolean hasLng();

    boolean hasMediaType();

    boolean hasNumberOfQualities();

    boolean hasOriginalHeight();

    boolean hasOriginalMediaHasVisualReplyMedia();

    boolean hasOriginalWidth();

    boolean hasPhotoOfYou();

    boolean hasPlayCount();

    boolean hasProfileGridControlEnabled();

    boolean hasReshareCount();

    boolean hasSubscribeCtaVisible();

    boolean hasTakenAt();

    boolean hasVideoDuration();

    boolean hasVideoSubtitlesConfidence();

    boolean hasViewCount();

    boolean hasViewStateItemType();

    boolean isArtistPick();

    boolean isCommentsGifComposerEnabled();

    boolean isCurrentlyPromotingBySponsor();

    int isDashEligible();

    boolean isFbOnly();

    boolean isInProfileGrid();

    boolean isInternalOnly();

    boolean isOrganicProductTaggingEligible();

    boolean isPaidPartnership();

    boolean isPostLive();

    boolean isThirdPartyDownloadsEligible();

    boolean isUnifiedVideo();

    boolean isVisualReplyCommenterNoticeEnabled();
}
