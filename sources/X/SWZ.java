package X;

import android.graphics.RectF;
import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.CellInfo;
import android.text.TextUtils;
import com.facebook.android.maps.model.CameraPosition;
import com.facebook.blescan.parcelable.ParcelableBleScanResult;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.facebook.cellinfo.parcelable.ParcelableGeneralCellInfo;
import com.facebook.iabadscontext.IABBwPayPalExtension;
import com.facebook.iabadscontext.IABDummyContext;
import com.facebook.iabadscontext.IABPostClickPersonalizationDataExtension;
import com.facebook.iabadscontext.IABWatchAndBrowseWebToWAExtension;
import com.facebook.iabadscontext.IabAdCreativeOptimizationConfigByType;
import com.facebook.iabadscontext.IgPromoAdsExtension;
import com.facebook.iabadscontext.IgPromoAdsPromoCode;
import com.facebook.iabadscontext.MessagingExtensionType;
import com.facebook.iabadscontext.MetaCheckoutExperienceType;
import com.facebook.iabadscontext.PaymentConfig;
import com.facebook.iabadscontext.ReceiverInfo;
import com.facebook.iabbwpextension.IABBwPContext;
import com.facebook.iabbwpextension.IABBwPExtension;
import com.facebook.iabeventlogging.model.IABChangeViewModeEvent;
import com.facebook.iabeventlogging.model.IABCopyLinkEvent;
import com.facebook.iabeventlogging.model.IABDropPixelsEvent;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABFirstContentfulPaintEvent;
import com.facebook.iabeventlogging.model.IABFirstPauseEvent;
import com.facebook.iabeventlogging.model.IABHistoryDataWriterEvent;
import com.facebook.iabeventlogging.model.IABHistoryEvent;
import com.facebook.iabeventlogging.model.IABHistoryInteractionEvent;
import com.facebook.iabeventlogging.model.IABIPAMatchKeyEvent;
import com.facebook.iabeventlogging.model.IABLandingPageFinishedEvent;
import com.facebook.iabeventlogging.model.IABLandingPageInteractiveEvent;
import com.facebook.iabeventlogging.model.IABLandingPageStartedEvent;
import com.facebook.iabeventlogging.model.IABLandingPageViewEndedEvent;
import com.facebook.iabeventlogging.model.IABLaunchEvent;
import com.facebook.iabeventlogging.model.IABNonViewableEvent;
import com.facebook.iabeventlogging.model.IABOpenExternalEvent;
import com.facebook.iabeventlogging.model.IABOpenSecureInfoPopupEvent;
import com.facebook.iabeventlogging.model.IABReactivatePixelsEvent;
import com.facebook.iabeventlogging.model.IABRefreshEvent;
import com.facebook.iabeventlogging.model.IABReportStartEvent;
import com.facebook.iabeventlogging.model.IABScreenshotImpressionEvent;
import com.facebook.iabeventlogging.model.IABShareEvent;
import com.facebook.iabeventlogging.model.IABUnifiedEvent;
import com.facebook.iabeventlogging.model.IABViewableEvent;
import com.facebook.iabeventlogging.model.IABWebviewEndEvent;
import com.facebook.interstitial.triggers.InterstitialTrigger;
import com.facebook.interstitial.triggers.InterstitialTriggerContext;
import com.facebook.location.logging.MaxImpressionsPerInterval;
import com.facebook.location.parcelable.ParcelableCoordinates;
import com.facebook.location.parcelable.ParcelableFbLocationContinuousListenerParams;
import com.facebook.location.parcelable.ParcelableFbLocationOperationParams;
import com.facebook.location.parcelable.ParcelableGeofenceResult;
import com.facebook.location.parcelable.ParcelableImmutableLocation;
import com.facebook.location.signalpackage.ParcelableVisitStateAlgorithmVersion;
import com.facebook.location.signalpackage.parcelable.ParcelableActivityRecognitionResult;
import com.facebook.location.signalpackage.parcelable.ParcelableDetectedActivity;
import com.facebook.location.signalpackage.parcelable.ParcelableLocationSignalPackage;
import com.facebook.locationsharing.core.models.Address;
import com.facebook.locationsharing.core.models.LiveLocationSession;
import com.facebook.locationsharing.core.models.LiveLocationSharer;
import com.facebook.locationsharing.core.models.LocationSharingPresenterState;
import com.facebook.locationsharing.core.models.Place;
import com.facebook.locationsharing.core.models.PointOfInterest;
import com.facebook.locationsharing.core.models.PointOfInterestViewModel;
import com.facebook.login.LoginClient$Request;
import com.facebook.login.LoginClient$Result;
import com.facebook.maps.delegate.common.interfaces.MapOptions;
import com.facebook.mqtt.service.ipc.SubscriptionParcelable;
import com.facebook.neko.directinstall.installer.DirectInstallDownloadEvent;
import com.facebook.oxygen.preloads.integration.install.bottomsheet.BottomSheetFeatures;
import com.facebook.pando.TreeJNI;
import com.facebook.pando.TreeParcelable;
import com.facebook.privacy.zone.api.ZonedValue;
import com.facebook.privacy.zone.policy.ZonePolicy;
import com.facebook.push.constants.PushProperty;
import com.facebook.push.fbpushtokencommon.RegisterPushTokenParams;
import com.facebook.pushlite.model.PushInfraMetaData;
import com.facebook.reportaproblem.base.bugreport.file.BugReportFile;
import com.facebook.rti.mqtt.protocol.messages.GqlsTopicExtraInfo;
import com.facebook.sensors.parcelable.ParcelableSensorEventClone;
import com.facebook.smartcapture.camera.DialogTexts;
import com.facebook.smartcapture.camera.sizesetter.FixedSizes;
import com.facebook.smartcapture.camera.sizesetter.Size;
import com.facebook.smartcapture.capture.DefaultEvidenceRecorderProvider;
import com.facebook.smartcapture.capture.SelfieEvidence;
import com.facebook.smartcapture.config.ChallengeProvider;
import com.facebook.smartcapture.download.IgVoltronAndNmlModulesDownloader;
import com.facebook.smartcapture.flow.IdCaptureConfig;
import com.facebook.smartcapture.flow.SelfieCaptureConfig;
import com.facebook.smartcapture.ig.logging.IgSmartCaptureLoggerProvider;
import com.facebook.smartcapture.ui.consent.ResolvedConsentTextsProvider;
import com.facebook.spherical.model.PanoBounds;
import com.facebook.ui.emoji.model.BasicEmoji;
import com.facebook.ui.emoji.model.DrawableBackedEmoji;
import com.facebook.ui.emoji.model.Emoji;
import com.facebook.ui.emoji.model.EmojiSet;
import com.facebook.video.common.playerorigin.PlayerOrigin;
import com.facebook.video.heroplayer.ipc.FirstDataSegmentCacheCheckEndEvent;
import com.facebook.video.heroplayer.ipc.FirstDataSegmentCacheCheckStartEvent;
import com.facebook.video.heroplayer.ipc.PrefetchTaskDataFetchCompletedEvent;
import com.facebook.video.heroplayer.ipc.PrefetchTaskDataFetchIssuedEvent;
import com.facebook.video.heroplayer.ipc.SpatialAudioFocusParams;
import com.facebook.video.heroplayer.ipc.VideoProtocolProps;
import com.facebook.videolite.transcoder.base.SphericalMetadata;
import com.facebook.wearable.applinks.AppLinkDeviceConnectionStatus;
import com.facebook.wearable.applinks.AppLinkDeviceHardwareState;
import com.facebook.wearable.applinks.AppLinkDeviceMountState;
import com.facebook.wearable.applinks.AppLinkDevicePeakPowerState;
import com.facebook.wifiscan.parcelable.ParcelableWifiScanResult;
import com.facebookpay.apm.APMConfigurationImpl;
import com.facebookpay.bloks.nativeprops.APMBloksNativeProps;
import com.facebookpay.common.models.CurrencyAmount;
import com.facebookpay.common.models.Distance;
import com.facebookpay.common.models.ErrorDialogContent;
import com.facebookpay.common.recyclerview.adapteritems.APMButtonsItem;
import com.facebookpay.common.recyclerview.adapteritems.AnonCheckoutPuxLink;
import com.facebookpay.common.recyclerview.adapteritems.AnonCheckoutToggleItem;
import com.facebookpay.common.recyclerview.adapteritems.AutoAdvanceButtonItem;
import com.facebookpay.common.recyclerview.adapteritems.CheckoutOptionalityItem;
import com.facebookpay.common.recyclerview.adapteritems.ConfirmationPaymentSectionItem;
import com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellItem;
import com.facebookpay.common.recyclerview.adapteritems.ConfirmationProductUpsellSectionHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.EmailOptInItem;
import com.facebookpay.common.recyclerview.adapteritems.IncentiveItem;
import com.facebookpay.common.recyclerview.adapteritems.IncentiveSummaryItem;
import com.facebookpay.common.recyclerview.adapteritems.InlineBackButtonItem;
import com.facebookpay.common.recyclerview.adapteritems.InlineFormItem;
import com.facebookpay.common.recyclerview.adapteritems.InvisibleHeaderItem;
import com.facebookpay.common.recyclerview.adapteritems.PayButtonItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxAccordionItem;
import com.facebookpay.common.recyclerview.adapteritems.PuxBannerItem;
import com.facebookpay.expresscheckout.models.APMConfiguration;
import com.facebookpay.form.fragment.model.FormParams;
import com.google.common.collect.ImmutableList;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.NoSuchElementException;
import org.webrtc.EglBase14Impl;

public final class SWZ implements Parcelable.Creator {
    public final int A00;

    public SWZ(int i) {
        this.A00 = i;
    }

    public static ZonedValue A00(Parcel parcel, Object obj) {
        Parcelable.Creator creator = IABEvent.CREATOR;
        0qQ.A0B(obj, 0);
        ZonedValue zonedValue = (ZonedValue) parcel.readParcelable(ZonedValue.class.getClassLoader());
        if (zonedValue == null) {
            return new ZonedValue(ZonePolicy.A05, "");
        }
        return zonedValue;
    }

    public static SWZ A01(int i) {
        return new SWZ(i);
    }

    /* JADX WARNING: type inference failed for: r7v25, types: [java.lang.Object, X.RQi] */
    /* JADX WARNING: type inference failed for: r7v38, types: [com.facebook.maps.delegate.common.interfaces.MapOptions, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r7v39, types: [com.facebook.mqtt.service.ipc.SubscriptionParcelable, java.lang.Object] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object createFromParcel;
        Object createFromParcel2;
        Integer num;
        RIX rix;
        RIX rix2;
        C391449t6 r12;
        RFY rfy;
        RIg rIg;
        RIg rIg2;
        C391409su r122;
        Integer num2;
        Long valueOf;
        Long valueOf2;
        Integer num3;
        Long A0T;
        Integer num4;
        Enum valueOf3;
        Integer num5;
        ClassLoader classLoader;
        Long A0T2;
        Integer num6;
        Integer A12;
        C8911RFe valueOf4;
        C8911RFe valueOf5;
        Boolean valueOf6;
        C276164sm r8;
        ImmutableList A01;
        ImmutableList A012;
        ImmutableList A013;
        Integer A122;
        ImmutableList copyOf;
        Integer A123;
        Float valueOf7;
        Integer A124;
        ImmutableList A014;
        C8942RGk valueOf8;
        Parcel parcel2 = parcel;
        switch (this.A00) {
            case 0:
                boolean z = true;
                boolean A1P = AnonymousClass7TF.A1P(C41848B3p.A00(parcel2));
                if (parcel2.readInt() == 0) {
                    z = false;
                }
                return new IABBwPayPalExtension(parcel2.readString(), parcel2.readString(), A1P, z);
            case 1:
                0qQ.A0B(parcel2, 0);
                return new IABDummyContext(parcel2.createStringArrayList());
            case 2:
                int A002 = C41848B3p.A00(parcel2);
                ArrayList A0v = DbS.A0v(A002);
                for (int i = 0; i != A002; i++) {
                    if (parcel2.readInt() == 0) {
                        createFromParcel = null;
                    } else {
                        createFromParcel = IabAdCreativeOptimizationConfigByType.CREATOR.createFromParcel(parcel2);
                    }
                    A0v.add(createFromParcel);
                }
                return new IABPostClickPersonalizationDataExtension(A0v);
            case 3:
                0qQ.A0B(parcel2, 0);
                return new IABWatchAndBrowseWebToWAExtension((MessagingExtensionType) MessagingExtensionType.CREATOR.createFromParcel(parcel2));
            case 4:
                return new IabAdCreativeOptimizationConfigByType(C41848B3p.A1D(parcel2), parcel2.readString());
            case 5:
                String A1D = C41848B3p.A1D(parcel2);
                int readInt = parcel2.readInt();
                ArrayList A0v2 = DbS.A0v(readInt);
                for (int i2 = 0; i2 != readInt; i2 = JTT.A04(parcel2, IgPromoAdsPromoCode.CREATOR, A0v2, i2)) {
                }
                return new IgPromoAdsExtension(A0v2, Pxi.A1P(parcel2), A1D, parcel2.readString());
            case 6:
                return new IgPromoAdsPromoCode(C41848B3p.A1D(parcel2), parcel2.readString());
            case 7:
                return MessagingExtensionType.valueOf(C41848B3p.A1D(parcel2));
            case 8:
                return MetaCheckoutExperienceType.valueOf(C41848B3p.A1D(parcel2));
            case 9:
                0qQ.A0B(parcel2, 0);
                return new PaymentConfig(parcel2.createStringArrayList(), parcel2.readString());
            case 10:
                return new ReceiverInfo(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.createStringArrayList());
            case 11:
                0qQ.A0B(parcel2, 0);
                ImmutableList immutableList = (ImmutableList) parcel2.readSerializable();
                ArrayList<String> createStringArrayList = parcel2.createStringArrayList();
                if (parcel2.readInt() == 0) {
                    createFromParcel2 = null;
                } else {
                    createFromParcel2 = IABBwPExtension.CREATOR.createFromParcel(parcel2);
                }
                return new IABBwPContext((IABBwPExtension) createFromParcel2, immutableList, createStringArrayList);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                String A1D2 = C41848B3p.A1D(parcel2);
                if (A1D2.equals("UNSET_OR_UNRECOGNIZED_ENUM_VALUE")) {
                    num = AnonymousClass05K.A00;
                } else if (A1D2.equals("CUSTOM_IAB_FOR_1P")) {
                    num = AnonymousClass05K.A01;
                } else if (A1D2.equals("CUSTOM_IAB_FOR_DTC")) {
                    num = AnonymousClass05K.A0C;
                } else if (A1D2.equals("STANDARD_IAB")) {
                    num = AnonymousClass05K.A0N;
                } else {
                    throw AnonymousClass7TE.A0w(A1D2);
                }
                return new IABBwPExtension(num, parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readInt());
            case 13:
                C8945RGn rGn = (C8945RGn) C8945RGn.A01.get(parcel2.readString());
                if (rGn == null) {
                    rGn = C8945RGn.EMPTY;
                }
                String readString = parcel2.readString();
                long readLong = parcel2.readLong();
                long readLong2 = parcel2.readLong();
                switch (rGn.ordinal()) {
                    case 0:
                        return IABWebviewEndEvent.A00(parcel2, readString, readLong, readLong2);
                    case 1:
                        Parcelable.Creator creator = IABEvent.CREATOR;
                        ZonedValue zonedValue = (ZonedValue) C41847B3o.A03(parcel2, ZonedValue.class);
                        if (zonedValue == null) {
                            zonedValue = new ZonedValue(ZonePolicy.A05, "");
                        }
                        long readLong3 = parcel2.readLong();
                        String readString2 = parcel2.readString();
                        long readLong4 = parcel2.readLong();
                        ArrayList A0v3 = DbS.A0v(r4);
                        for (int i3 : parcel2.createIntArray()) {
                            switch (i3) {
                                case 1:
                                    rfy = RFY.IAB_META_CHECKOUT_SDK;
                                    break;
                                case 2:
                                    rfy = RFY.IAB_META_CHECKOUT_SCA;
                                    break;
                                case 3:
                                    rfy = RFY.IAB_META_CHECKOUT_FIRMLY;
                                    break;
                                case 4:
                                    rfy = RFY.IAB_STICKY_UTM_PARAMS;
                                    break;
                                case 5:
                                    rfy = RFY.IAB_META_CHECKOUT_METAPAYMENTS_SDK;
                                    break;
                                case 6:
                                    rfy = RFY.IAB_WATCH_AND_BROWSE_WEB_TO_WA;
                                    break;
                                case 7:
                                    rfy = RFY.IAB_NO_ADS_CONTEXT;
                                    break;
                                case 8:
                                    rfy = RFY.IAB_AUTOFILL_ADS_PERSONALIZATION;
                                    break;
                                case 9:
                                    rfy = RFY.IAB_PAYPAL_CHECKOUT;
                                    break;
                                default:
                                    rfy = RFY.UNSET_OR_UNRECOGNIZED_ENUM_VALUE;
                                    break;
                            }
                            A0v3.add(rfy);
                        }
                        return new IABLaunchEvent((IabCommonTrait) C41847B3o.A03(parcel2, IabCommonTrait.class), (IABViewModeLaunchConfig) C41847B3o.A03(parcel2, IABViewModeLaunchConfig.class), zonedValue, readString, readString2, parcel2.readString(), A0v3, readLong, readLong2, readLong3, readLong4);
                    case 2:
                        return new IABLandingPageStartedEvent(A00(parcel2, readString), readString, readLong, readLong2, AnonymousClass7TF.A1S(parcel2.readByte(), 1));
                    case 3:
                        return new IABLandingPageInteractiveEvent(A00(parcel2, readString), readString, parcel2.readString(), parcel2.readString(), parcel2.readInt(), parcel2.readInt(), readLong, readLong2, parcel2.readLong(), AnonymousClass7TF.A1S(parcel2.readByte(), 1));
                    case 4:
                        ZonedValue A003 = A00(parcel2, readString);
                        String readString3 = parcel2.readString();
                        ArrayList readArrayList = parcel2.readArrayList(RFY.class.getClassLoader());
                        if (readArrayList == null) {
                            readArrayList = null;
                        }
                        return new IABLandingPageFinishedEvent(A003, readString, readString3, readArrayList, readLong, readLong2);
                    case 5:
                        return new IABLandingPageViewEndedEvent(A00(parcel2, readString), readString, readLong, readLong2);
                    case 6:
                        Parcelable.Creator creator2 = IABEvent.CREATOR;
                        return new IABOpenExternalEvent(readString, parcel2.readString(), parcel2.readString(), readLong, readLong2);
                    case 7:
                        Parcelable.Creator creator3 = IABEvent.CREATOR;
                        return new IABCopyLinkEvent(readLong, readString, readLong2, parcel2.readString());
                    case 8:
                        return new IABEvent(C8945RGn.IAB_OPEN_MENU, readString, readLong, readLong2);
                    case 9:
                        Parcelable.Creator creator4 = IABEvent.CREATOR;
                        0qQ.A0B(readString, 0);
                        String readString4 = parcel2.readString();
                        String readString5 = parcel2.readString();
                        if (readString5 == null) {
                            readString5 = NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED;
                        }
                        RIk valueOf9 = RIk.valueOf(readString5);
                        String readString6 = parcel2.readString();
                        if (readString6 == null) {
                            readString6 = "";
                        }
                        return new IABScreenshotImpressionEvent(valueOf9, readString, readString4, readString6, readLong);
                    case 10:
                        Parcelable.Creator creator5 = IABEvent.CREATOR;
                        return new IABShareEvent(readString, parcel2.readString(), parcel2.readString(), readLong, readLong2);
                    case 11:
                        Parcelable.Creator creator6 = IABEvent.CREATOR;
                        String readString7 = parcel2.readString();
                        ZonedValue zonedValue2 = (ZonedValue) C41847B3o.A03(parcel2, ZonedValue.class);
                        String readString8 = parcel2.readString();
                        String str = "";
                        String str2 = str;
                        if (readString7 != null) {
                            str2 = readString7;
                        }
                        if (zonedValue2 == null) {
                            zonedValue2 = new ZonedValue(ZonePolicy.A05, str);
                        }
                        if (readString8 != null) {
                            str = readString8;
                        }
                        return new IABReportStartEvent(zonedValue2, readString, str2, str, readLong, readLong2);
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        Parcelable.Creator creator7 = IABEvent.CREATOR;
                        return new IABRefreshEvent(readLong, readString, readLong2, parcel2.readString());
                    case 13:
                        Parcelable.Creator creator8 = IABEvent.CREATOR;
                        long readLong5 = parcel2.readLong();
                        long readLong6 = parcel2.readLong();
                        long readLong7 = parcel2.readLong();
                        long readLong8 = parcel2.readLong();
                        long readLong9 = parcel2.readLong();
                        long readLong10 = parcel2.readLong();
                        long readLong11 = parcel2.readLong();
                        return new IABFirstPauseEvent((ZonedValue) C41847B3o.A03(parcel2, ZonedValue.class), readString, parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readArrayList(ArrayList.class.getClassLoader()), parcel2.readInt(), parcel2.readInt(), parcel2.readInt(), parcel2.readInt(), readLong, readLong2, readLong5, readLong6, readLong7, readLong8, readLong9, readLong10, readLong11, parcel2.readLong(), parcel2.readLong(), parcel2.readLong(), AnonymousClass7TF.A1S(parcel2.readByte(), 1), Pxj.A1W(parcel2));
                    case 14:
                        Parcelable.Creator creator9 = IABEvent.CREATOR;
                        String readString9 = parcel2.readString();
                        String readString10 = parcel2.readString();
                        if (readString9 == null) {
                            readString9 = "";
                        }
                        if (readString10 == null) {
                            readString10 = "";
                        }
                        return new IABDropPixelsEvent(readString, readString9, readString10, readLong, readLong2);
                    case 15:
                        Parcelable.Creator creator10 = IABEvent.CREATOR;
                        String readString11 = parcel2.readString();
                        String readString12 = parcel2.readString();
                        if (readString11 == null) {
                            readString11 = "";
                        }
                        if (readString12 == null) {
                            readString12 = "";
                        }
                        return new IABReactivatePixelsEvent(readString, readString11, readString12, readLong, readLong2);
                    case 16:
                        Parcelable.Creator creator11 = IABEvent.CREATOR;
                        return new IABOpenSecureInfoPopupEvent(readLong, readString, AnonymousClass7TF.A1S(parcel2.readByte(), 1), readLong2);
                    case 17:
                        Parcelable.Creator creator12 = IABEvent.CREATOR;
                        String[] createStringArray = parcel2.createStringArray();
                        if (createStringArray == null) {
                            createStringArray = new String[0];
                        }
                        long readLong12 = parcel2.readLong();
                        long readLong13 = parcel2.readLong();
                        long readLong14 = parcel2.readLong();
                        boolean A1X = C41848B3p.A1X(parcel2);
                        Long l = null;
                        if (readLong12 == -1) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(readLong12);
                        }
                        if (readLong13 == -1) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Long.valueOf(readLong13);
                        }
                        if (readLong14 != -1) {
                            l = Long.valueOf(readLong14);
                        }
                        return new IABHistoryEvent(valueOf, valueOf2, l, readString, createStringArray, readLong, readLong2, A1X);
                    case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                        Parcelable.Creator creator13 = IABEvent.CREATOR;
                        String readString13 = parcel2.readString();
                        long readLong15 = parcel2.readLong();
                        long readLong16 = parcel2.readLong();
                        String readString14 = parcel2.readString();
                        if (readString13 == null) {
                            readString13 = "";
                        }
                        return new IABHistoryDataWriterEvent(readString, readString13, readString14, readLong, readLong2, readLong15, readLong16);
                    case 19:
                        Parcelable.Creator creator14 = IABEvent.CREATOR;
                        String readString15 = parcel2.readString();
                        String readString16 = parcel2.readString();
                        if (readString16 == null) {
                            readString16 = "";
                        }
                        if (readString15 != null) {
                            if (readString15.equals("SETTINGS_CLEAR_ERROR")) {
                                num3 = AnonymousClass05K.A00;
                            } else if (readString15.equals("SETTINGS_CLEAR_CANCEL_CLICKED")) {
                                num3 = AnonymousClass05K.A01;
                            } else if (readString15.equals("SETTINGS_CLEAR_CLICKED")) {
                                num3 = AnonymousClass05K.A0C;
                            } else if (readString15.equals("SETTINGS_CLEAR_CONFIRM_CLICKED")) {
                                num3 = AnonymousClass05K.A0N;
                            } else if (readString15.equals("SETTINGS_DATA_POLICY_CLICKED")) {
                                num3 = AnonymousClass05K.A0Y;
                            } else if (readString15.equals("SETTINGS_LINK_HISTORY_SWITCH_TOGGLED_OFF_CLICKED")) {
                                num3 = AnonymousClass05K.A0j;
                            } else if (readString15.equals("SETTINGS_LINK_HISTORY_SWITCH_TOGGLED_ON_CLICKED")) {
                                num3 = AnonymousClass05K.A0u;
                            } else if (readString15.equals("VIEW_LINK_HISTORY_OVERFLOW_ITEM_CLICKED")) {
                                num3 = AnonymousClass05K.A15;
                            } else if (readString15.equals("VIEW_LINK_HISTORY_FOOTER_ICON_CLICKED")) {
                                num3 = AnonymousClass05K.A1F;
                            } else if (readString15.equals("OPT_IN_UI_SHOW")) {
                                num3 = AnonymousClass05K.A1I;
                            } else if (readString15.equals("OPT_IN_NUX_UI_SKIP")) {
                                num3 = AnonymousClass05K.A02;
                            } else if (readString15.equals("TOOLTIP_SHOWN")) {
                                num3 = AnonymousClass05K.A03;
                            } else if (readString15.equals("TOOLTIP_DISMISSED")) {
                                num3 = AnonymousClass05K.A04;
                            } else if (readString15.equals("OPT_IN_UI_STATUS_READ_STARTED")) {
                                num3 = AnonymousClass05K.A05;
                            } else if (readString15.equals("OPT_IN_UI_STATUS_READ_FINISHED")) {
                                num3 = AnonymousClass05K.A06;
                            } else if (readString15.equals("OPT_IN_UI_STATUS_READ_ERROR")) {
                                num3 = AnonymousClass05K.A07;
                            } else if (readString15.equals("HISTORY_WRITE_STARTED")) {
                                num3 = AnonymousClass05K.A08;
                            } else if (readString15.equals("HISTORY_WRITE_FINISHED")) {
                                num3 = AnonymousClass05K.A09;
                            } else if (readString15.equals("HISTORY_WRITE_ERROR")) {
                                num3 = AnonymousClass05K.A0A;
                            } else if (!readString15.equals("INCORRECT_TYPE")) {
                                throw AnonymousClass7TE.A0w(readString15);
                            }
                            return new IABHistoryInteractionEvent(num3, readString, readString16, readLong, readLong2);
                        }
                        num3 = AnonymousClass05K.A0B;
                        return new IABHistoryInteractionEvent(num3, readString, readString16, readLong, readLong2);
                    case 20:
                        ZonedValue A004 = A00(parcel2, readString);
                        long readLong17 = parcel2.readLong();
                        String readString17 = parcel2.readString();
                        long readLong18 = parcel2.readLong();
                        try {
                            RIg[] values = RIg.values();
                            int length = values.length;
                            for (int i4 = 0; i4 < length; i4++) {
                                rIg = values[i4];
                                Long valueOf10 = Long.valueOf(rIg.A00);
                                if (valueOf10 != null && valueOf10.longValue() == readLong18) {
                                    return new IABViewableEvent(rIg, A004, readString, readString17, readLong, readLong2, readLong17);
                                }
                            }
                            throw new NoSuchElementException(C273654mx.A00(5));
                        } catch (NoSuchElementException unused) {
                            0KC.A0E("IABViewableEvent", "IABNVSource enums read from parcel are not valid, this should never happen!");
                            rIg = null;
                        }
                        break;
                    case 21:
                        ZonedValue A005 = A00(parcel2, readString);
                        long readLong19 = parcel2.readLong();
                        long readLong20 = parcel2.readLong();
                        try {
                            RIg[] values2 = RIg.values();
                            int length2 = values2.length;
                            for (int i5 = 0; i5 < length2; i5++) {
                                rIg2 = values2[i5];
                                Long valueOf11 = Long.valueOf(rIg2.A00);
                                if (valueOf11 != null && valueOf11.longValue() == readLong20) {
                                    return new IABNonViewableEvent(rIg2, A005, readString, readLong, readLong2, readLong19);
                                }
                            }
                            throw new NoSuchElementException(C273654mx.A00(5));
                        } catch (NoSuchElementException unused2) {
                            0KC.A0E("IABNonViewableEvent", "IABNVSource enums read from parcel are not valid, this should never happen!");
                            rIg2 = null;
                        }
                        break;
                    case 22:
                        Parcelable.Creator creator15 = IABEvent.CREATOR;
                        0qQ.A0B(readString, 0);
                        try {
                            String readString18 = parcel2.readString();
                            String str3 = "";
                            if (readString18 == null) {
                                readString18 = str3;
                            }
                            String readString19 = parcel2.readString();
                            if (readString19 == null) {
                                readString19 = str3;
                            }
                            String readString20 = parcel2.readString();
                            if (readString20 != null) {
                                str3 = readString20;
                            }
                            rix2 = RIX.valueOf(readString18);
                            rix = RIX.valueOf(readString19);
                            r12 = C391449t6.valueOf(str3);
                        } catch (IllegalArgumentException unused3) {
                            0KC.A0E("IABChangeViewModeEvent", "View mode enums read from parcel are not valid, this should never happen");
                            rix = RIX.FULL_SCREEN;
                            r12 = C391449t6.AUTO;
                            rix2 = rix;
                        }
                        return new IABChangeViewModeEvent(r12, rix2, rix, readString, parcel2.readString(), readLong, readLong2);
                    case 23:
                        Parcelable.Creator creator16 = IABEvent.CREATOR;
                        0qQ.A0B(readString, 0);
                        String readString21 = parcel2.readString();
                        String readString22 = parcel2.readString();
                        String readString23 = parcel2.readString();
                        long readLong21 = parcel2.readLong();
                        long readLong22 = parcel2.readLong();
                        String readString24 = parcel2.readString();
                        if (readString21 != null && readString22 != null && readString23 != null && readString24 != null) {
                            return new IABIPAMatchKeyEvent(readString, readString24, new AnonymousClass59G(readString21, readString22, readString23), readLong, readLong2, readLong21, readLong22);
                        }
                        throw AnonymousClass7TE.A15("IABIPAMatchKeyEvent missing required fields");
                    case 24:
                        Parcelable.Creator creator17 = IABEvent.CREATOR;
                        0qQ.A0B(readString, 0);
                        return new IABFirstContentfulPaintEvent(readString, readLong, readLong2);
                    case 25:
                        Parcelable.Creator creator18 = IABEvent.CREATOR;
                        int i6 = 0;
                        0qQ.A0B(readString, 0);
                        String readString25 = parcel2.readString();
                        String readString26 = parcel2.readString();
                        String readString27 = parcel2.readString();
                        C391409su[] values3 = C391409su.values();
                        int length3 = values3.length;
                        int i7 = 0;
                        while (true) {
                            if (i6 < length3) {
                                r122 = values3[i6];
                                if (!0qQ.A0K(r122.name(), readString25)) {
                                    i6++;
                                }
                            } else {
                                r122 = C391409su.A1i;
                            }
                        }
                        Integer[] A006 = AnonymousClass05K.A00(5);
                        int length4 = A006.length;
                        while (true) {
                            if (i7 < length4) {
                                num2 = A006[i7];
                                if (!0qQ.A0K(RVW.A00(num2), readString26)) {
                                    i7++;
                                }
                            } else {
                                num2 = AnonymousClass05K.A0Y;
                            }
                        }
                        return new IABUnifiedEvent(r122, num2, readString, readString27, readLong, readLong2);
                    default:
                        return IABEvent.A04;
                }
            case 14:
                0qQ.A0B(parcel2, 0);
                return new InterstitialTrigger(parcel2);
            case 15:
                0qQ.A0B(parcel2, 0);
                return new InterstitialTriggerContext(parcel2);
            case 16:
                return new MaxImpressionsPerInterval(parcel2);
            case 17:
                return new ParcelableCoordinates(parcel2);
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                Integer A0S = Pxi.A0S(parcel2, 4);
                long readLong23 = parcel2.readLong();
                long readLong24 = parcel2.readLong();
                float readFloat = parcel2.readFloat();
                long readLong25 = parcel2.readLong();
                if (parcel2.readByte() == 0) {
                    A0T = null;
                } else {
                    A0T = Pxi.A0T(parcel2);
                }
                return new C10774Rxt(A0S, A0T, readFloat, readLong23, readLong24, readLong25);
            case 19:
                String readString28 = parcel2.readString();
                if (readString28.equals("LOW_POWER")) {
                    num4 = AnonymousClass05K.A00;
                } else if (readString28.equals("BALANCED_POWER_AND_ACCURACY")) {
                    num4 = AnonymousClass05K.A01;
                } else if (readString28.equals("HIGH_ACCURACY")) {
                    num4 = AnonymousClass05K.A0C;
                } else {
                    throw AnonymousClass7TE.A0w(readString28);
                }
                Long l2 = null;
                long readLong26 = parcel2.readLong();
                float readFloat2 = parcel2.readFloat();
                long readLong27 = parcel2.readLong();
                Float f = null;
                if (parcel2.readInt() != 0) {
                    l2 = Pxi.A0T(parcel2);
                }
                if (parcel2.readInt() != 0) {
                    f = Float.valueOf(parcel2.readFloat());
                }
                return new C10815Ryb(f, num4, l2, readFloat2, parcel2.readFloat(), readLong26, parcel2.readLong(), parcel2.readLong(), readLong27);
            case 20:
                return new ParcelableGeofenceResult(parcel2);
            case 21:
                Parcelable A03 = C41847B3o.A03(parcel2, Location.class);
                A03.getClass();
                Location location = (Location) A03;
                byte readByte = parcel2.readByte();
                boolean z2 = false;
                if (readByte != 0) {
                    z2 = true;
                    if (readByte != 1) {
                        valueOf6 = null;
                        return new C276164sm(location, valueOf6);
                    }
                }
                valueOf6 = Boolean.valueOf(z2);
                return new C276164sm(location, valueOf6);
            case 22:
                Integer A0k = C51967G9n.A0k();
                ? obj = new Object();
                obj.A01 = "";
                obj.A03 = "";
                obj.A02 = "";
                obj.A00 = A0k;
                String readString29 = parcel2.readString();
                if (readString29 != null) {
                    obj.A01 = readString29;
                }
                String readString30 = parcel2.readString();
                if (readString30 != null) {
                    obj.A03 = readString30;
                }
                String readString31 = parcel2.readString();
                if (readString31 != null) {
                    obj.A02 = readString31;
                }
                obj.A00 = C41847B3o.A12(parcel2);
                return obj;
            case 23:
                long readLong28 = parcel2.readLong();
                long readLong29 = parcel2.readLong();
                ArrayList A1C = AnonymousClass7TE.A1C();
                parcel2.readTypedList(A1C, ParcelableDetectedActivity.CREATOR);
                return new C10546Ru0(A1C, readLong28, readLong29);
            case 24:
                return new C10400Rrc(parcel2.readInt(), parcel2.readInt());
            case 25:
                if (parcel2.readByte() == 0) {
                    r8 = null;
                } else {
                    double readDouble = parcel2.readDouble();
                    double readDouble2 = parcel2.readDouble();
                    Boolean bool = null;
                    Location location2 = new Location((String) null);
                    location2.setLatitude(readDouble);
                    location2.setLongitude(readDouble2);
                    String readString32 = parcel2.readString();
                    if (readString32 != null) {
                        location2.setProvider(readString32);
                    }
                    if (parcel2.readByte() != 0) {
                        long readLong30 = parcel2.readLong();
                        if (Long.valueOf(readLong30) != null) {
                            17k.A0E(AnonymousClass7TF.A1P((readLong30 > 0 ? 1 : (readLong30 == 0 ? 0 : -1))));
                            location2.setTime(readLong30);
                        }
                    }
                    if (parcel2.readByte() != 0) {
                        long readLong31 = parcel2.readLong();
                        if (Long.valueOf(readLong31) != null) {
                            17k.A0E(AnonymousClass7TF.A1P((readLong31 > 0 ? 1 : (readLong31 == 0 ? 0 : -1))));
                            location2.setElapsedRealtimeNanos(readLong31);
                        }
                    }
                    if (parcel2.readByte() != 0) {
                        float readFloat3 = parcel2.readFloat();
                        if (Float.valueOf(readFloat3) != null) {
                            location2.setAccuracy(readFloat3);
                        }
                    }
                    if (parcel2.readByte() != 0) {
                        double readDouble3 = parcel2.readDouble();
                        if (Double.valueOf(readDouble3) != null) {
                            location2.setAltitude(readDouble3);
                        }
                    }
                    if (parcel2.readByte() != 0) {
                        float readFloat4 = parcel2.readFloat();
                        if (Float.valueOf(readFloat4) != null) {
                            location2.setBearing(readFloat4);
                        }
                    }
                    if (parcel2.readByte() != 0) {
                        float readFloat5 = parcel2.readFloat();
                        if (Float.valueOf(readFloat5) != null) {
                            location2.setSpeed(readFloat5);
                        }
                    }
                    location2.setExtras(parcel2.readBundle());
                    Boolean A007 = SKP.A00(parcel2);
                    if (A007 != null) {
                        bool = A007;
                    }
                    r8 = new C276164sm(location2, bool);
                }
                String readString33 = parcel2.readString();
                Boolean A008 = SKP.A00(parcel2);
                C11379SQr sQr = (C11379SQr) C41847B3o.A03(parcel2, ParcelableWifiScanResult.class);
                ArrayList createTypedArrayList = parcel2.createTypedArrayList(ParcelableWifiScanResult.CREATOR);
                if (createTypedArrayList == null) {
                    A01 = null;
                } else {
                    A01 = PzX.A01(PzX.A00(createTypedArrayList), 9);
                }
                Boolean A009 = SKP.A00(parcel2);
                C21455XbI xbI = (C21455XbI) C41847B3o.A03(parcel2, ParcelableGeneralCellInfo.class);
                ArrayList createTypedArrayList2 = parcel2.createTypedArrayList(CellInfo.CREATOR);
                ArrayList createTypedArrayList3 = parcel2.createTypedArrayList(ParcelableBleScanResult.CREATOR);
                if (createTypedArrayList3 == null) {
                    A012 = null;
                } else {
                    A012 = PzX.A01(PzX.A00(createTypedArrayList3), 2);
                }
                Boolean A0010 = SKP.A00(parcel2);
                ArrayList createTypedArrayList4 = parcel2.createTypedArrayList(ParcelableActivityRecognitionResult.CREATOR);
                if (createTypedArrayList4 == null) {
                    A013 = null;
                } else {
                    A013 = PzX.A01(PzX.A00(createTypedArrayList4), 6);
                }
                if (parcel2.readByte() == 0) {
                    A122 = null;
                } else {
                    A122 = C41847B3o.A12(parcel2);
                }
                ArrayList createTypedArrayList5 = parcel2.createTypedArrayList(ParcelableSensorEventClone.CREATOR);
                if (createTypedArrayList5 == null) {
                    copyOf = null;
                } else {
                    PzX A02 = PzX.A00(createTypedArrayList5).A02(new C12608Szs(4, (0sP) C13363TWx.A00));
                    copyOf = ImmutableList.copyOf((Iterable) A02.A00.A05(A02));
                }
                String readString34 = parcel2.readString();
                String readString35 = parcel2.readString();
                String readString36 = parcel2.readString();
                Boolean A0011 = SKP.A00(parcel2);
                String readString37 = parcel2.readString();
                if (parcel2.readByte() == 0) {
                    A123 = null;
                } else {
                    A123 = C41847B3o.A12(parcel2);
                }
                if (parcel2.readByte() == 0) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Float.valueOf(parcel2.readFloat());
                }
                if (parcel2.readByte() == 0) {
                    A124 = null;
                } else {
                    A124 = C41847B3o.A12(parcel2);
                }
                ArrayList createTypedArrayList6 = parcel2.createTypedArrayList(ParcelableVisitStateAlgorithmVersion.CREATOR);
                if (createTypedArrayList6 == null) {
                    A014 = null;
                } else {
                    A014 = PzX.A01(PzX.A00(createTypedArrayList6), 4);
                }
                return ParcelableLocationSignalPackage.A00(new SG0(xbI, r8, sQr, A0010, A008, A0011, A009, valueOf7, A123, A124, A122, readString34, readString35, readString33, readString37, readString36, A013, A012, createTypedArrayList2, copyOf, A014, A01));
            case 26:
                return new Address(parcel2);
            case 27:
                return new LiveLocationSession(parcel2);
            case 28:
                return new LiveLocationSharer(parcel2);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new com.facebook.locationsharing.core.models.Location(parcel2);
            case 30:
                return new LocationSharingPresenterState(parcel2);
            case 31:
                return new Place(parcel2);
            case 32:
                return new PointOfInterest(parcel2);
            case 33:
                return new PointOfInterestViewModel(parcel2);
            case 34:
                return new LoginClient$Request(parcel2);
            case 35:
                return new LoginClient$Result(parcel2);
            case 36:
                ? obj2 = new Object();
                obj2.A02 = 1;
                obj2.A0E = true;
                obj2.A0J = true;
                obj2.A0C = true;
                obj2.A01 = 2.0f;
                obj2.A00 = 21.0f;
                obj2.A05 = C16652Uyo.UNKNOWN;
                obj2.A03 = C69419Nl1.BOTTOM_RIGHT;
                obj2.A04 = (CameraPosition) C41847B3o.A03(parcel2, CameraPosition.class);
                obj2.A09 = Pxg.A1U(parcel2);
                obj2.A02 = parcel2.readInt();
                obj2.A0D = Pxg.A1U(parcel2);
                obj2.A0E = Pxg.A1U(parcel2);
                obj2.A0G = Pxg.A1U(parcel2);
                obj2.A0H = Pxg.A1U(parcel2);
                obj2.A0I = Pxg.A1U(parcel2);
                obj2.A0J = Pxg.A1U(parcel2);
                obj2.A0C = Pxg.A1U(parcel2);
                obj2.A07 = parcel2.readString();
                obj2.A01 = parcel2.readFloat();
                obj2.A00 = parcel2.readFloat();
                obj2.A08 = parcel2.readString();
                obj2.A06 = parcel2.readString();
                Class cls = C16652Uyo.class;
                String readString38 = parcel2.readString();
                if (readString38 == null) {
                    valueOf3 = null;
                } else {
                    valueOf3 = Enum.valueOf(cls, readString38);
                }
                obj2.A05 = (C16652Uyo) valueOf3;
                obj2.A03 = C69419Nl1.A00(parcel2.readString());
                obj2.A0B = Pxg.A1U(parcel2);
                obj2.A0F = Pxg.A1U(parcel2);
                obj2.A0A = Pxg.A1U(parcel2);
                return obj2;
            case 37:
                0qQ.A0B(parcel2, 0);
                ? obj3 = new Object();
                obj3.A01 = "";
                String readString39 = parcel2.readString();
                if (readString39 == null) {
                    readString39 = "";
                }
                obj3.A01 = readString39;
                obj3.A00 = parcel2.readInt();
                return obj3;
            case 38:
                return new DirectInstallDownloadEvent(parcel2);
            case 39:
                String A1D3 = C41848B3p.A1D(parcel2);
                if (A1D3.equals("SHOW_ALWAYS")) {
                    num5 = AnonymousClass05K.A00;
                } else if (A1D3.equals("SHOW_NO_WIFI")) {
                    num5 = AnonymousClass05K.A01;
                } else {
                    throw AnonymousClass7TE.A0w(A1D3);
                }
                return new BottomSheetFeatures(num5);
            case 40:
                try {
                    TreeJNI A0012 = TreeParcelable.A00(parcel2);
                    if (A0012 != null) {
                        return new TreeParcelable(A0012);
                    }
                    return null;
                } catch (Exception e) {
                    0KC.A0Q("TreeParcelable::Creator", "Failed to create Parcelable for the given Pando tree: %s", new Object[]{e.toString()});
                    return null;
                }
            case Seq.NULL_REFNUM /*41*/:
                String A1D4 = C41848B3p.A1D(parcel2);
                if (A1D4 != null) {
                    if (!A1D4.equals("NULL")) {
                        classLoader = Class.forName(A1D4).getClassLoader();
                    } else {
                        classLoader = null;
                    }
                    Object readValue = parcel2.readValue(classLoader);
                    Parcelable A032 = C41847B3o.A03(parcel2, ZonePolicy.class);
                    if (A032 != null) {
                        ZonePolicy zonePolicy = (ZonePolicy) A032;
                        String readString40 = parcel2.readString();
                        if (readString40 != null) {
                            return new ZonedValue(zonePolicy, readValue, readString40);
                        }
                        throw AnonymousClass7TE.A0w("Required value was null.");
                    }
                    throw AnonymousClass7TE.A0w("Required value was null.");
                }
                throw AnonymousClass7TE.A0z("Required value was null.");
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return ZonePolicy.valueOf(C41848B3p.A1D(parcel2));
            case 43:
                0qQ.A0B(parcel2, 0);
                return new PushProperty(parcel2);
            case 44:
                0qQ.A0B(parcel2, 0);
                return new RegisterPushTokenParams(parcel2);
            case 45:
                0qQ.A0B(parcel2, 0);
                C250863mB r1 = PushInfraMetaData.A09;
                String readString41 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    A0T2 = null;
                } else {
                    A0T2 = Pxi.A0T(parcel2);
                }
                return new PushInfraMetaData(A0T2, readString41, parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 46:
                return new BugReportFile(parcel2);
            case 47:
                return new GqlsTopicExtraInfo(parcel2);
            case 48:
                C10678RwH rwH = new C10678RwH(new float[parcel2.readInt()], C41848B3p.A00(parcel2), parcel2.readInt(), parcel2.readLong());
                parcel2.readFloatArray(rwH.A03);
                return rwH;
            case 49:
                return new DialogTexts(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                0qQ.A0B(parcel2, 0);
                Parcelable.Creator creator19 = Size.CREATOR;
                return new FixedSizes((Size) creator19.createFromParcel(parcel2), (Size) creator19.createFromParcel(parcel2), C41848B3p.A1X(parcel2));
            case 51:
                return new Size(C41848B3p.A00(parcel2), parcel2.readInt());
            case 52:
                0qQ.A0B(parcel2, 0);
                DefaultEvidenceRecorderProvider defaultEvidenceRecorderProvider = new DefaultEvidenceRecorderProvider();
                defaultEvidenceRecorderProvider.A04 = parcel2.readString();
                defaultEvidenceRecorderProvider.A01 = parcel2.readLong();
                defaultEvidenceRecorderProvider.A05 = parcel2.readString();
                parcel2.readStringList(defaultEvidenceRecorderProvider.A06);
                defaultEvidenceRecorderProvider.A00 = parcel2.readInt();
                defaultEvidenceRecorderProvider.A03 = Pxi.A0S(parcel2, 3);
                defaultEvidenceRecorderProvider.A02 = (RectF) C41847B3o.A03(parcel2, RectF.class);
                return defaultEvidenceRecorderProvider;
            case 53:
                return new SelfieEvidence(parcel2);
            case 54:
                0qQ.A0B(parcel2, 0);
                return new ChallengeProvider(parcel2);
            case 55:
                0qQ.A0B(parcel2, 0);
                return new IgVoltronAndNmlModulesDownloader(parcel2);
            case 56:
                return new IdCaptureConfig(parcel2);
            case 57:
                return new SelfieCaptureConfig(parcel2);
            case 58:
                0qQ.A0B(parcel2, 0);
                return new IgSmartCaptureLoggerProvider(parcel2);
            case 59:
                0qQ.A0B(parcel2, 0);
                EnumMap enumMap = new EnumMap(C8899REr.class);
                A02(parcel2, C8899REr.CONSENT_GRANTED_MESSAGE, enumMap);
                A02(parcel2, C8899REr.CONSENT_GRANTED_DETAILS, enumMap);
                A02(parcel2, C8899REr.CONSENT_WITHDRAWN_MESSAGE, enumMap);
                A02(parcel2, C8899REr.CONSENT_WITHDRAWN_DETAILS, enumMap);
                A02(parcel2, C8899REr.BOTTOM_SHEET_TITLE, enumMap);
                A02(parcel2, C8899REr.BOTTOM_SHEET_BODY1, enumMap);
                A02(parcel2, C8899REr.BOTTOM_SHEET_BODY2, enumMap);
                A02(parcel2, C8899REr.BOTTOM_SHEET_CONTINUE, enumMap);
                A02(parcel2, C8899REr.BOTTOM_SHEET_TOGGLE_TEXT, enumMap);
                A02(parcel2, C8899REr.BOTTOM_SHEET_LEARN_MORE, enumMap);
                A02(parcel2, C8899REr.DATA_INFORMATION_TITLE, enumMap);
                A02(parcel2, C8899REr.DATA_INFORMATION_BODY, enumMap);
                A02(parcel2, C8899REr.DATA_INFORMATION_FIRST_SECTION_TITLE, enumMap);
                A02(parcel2, C8899REr.DATA_INFORMATION_FIRST_SECTION_BODY1, enumMap);
                A02(parcel2, C8899REr.DATA_INFORMATION_FIRST_SECTION_BODY2, enumMap);
                A02(parcel2, C8899REr.DATA_INFORMATION_SECOND_SECTION_TITLE, enumMap);
                A02(parcel2, C8899REr.DATA_INFORMATION_SECOND_SECTION_BODY, enumMap);
                return new ResolvedConsentTextsProvider(new C10856RzH(enumMap));
            case 60:
                return new PanoBounds(parcel2);
            case 61:
                return new BasicEmoji(parcel2);
            case 62:
                return new DrawableBackedEmoji(parcel2);
            case 63:
                return new EmojiSet(parcel2);
            case 64:
                return new EmojiSet.Metadata(parcel2);
            case 65:
                0qQ.A0B(parcel2, 0);
                return new PlayerOrigin(parcel2);
            case 66:
                return new FirstDataSegmentCacheCheckEndEvent(parcel2);
            case 67:
                return new FirstDataSegmentCacheCheckStartEvent(parcel2);
            case 68:
                return new PrefetchTaskDataFetchCompletedEvent(parcel2);
            case 69:
                return new PrefetchTaskDataFetchIssuedEvent(parcel2);
            case 70:
                return new SpatialAudioFocusParams(parcel2);
            case 71:
                return new VideoProtocolProps(parcel2);
            case 72:
                return new SphericalMetadata(parcel2);
            case 73:
                return AppLinkDeviceConnectionStatus.values()[parcel2.readInt()];
            case 74:
                return AppLinkDeviceHardwareState.values()[parcel2.readInt()];
            case 75:
                return AppLinkDeviceMountState.values()[parcel2.readInt()];
            case 76:
                return AppLinkDevicePeakPowerState.values()[parcel2.readInt()];
            case 77:
                long readLong32 = parcel2.readLong();
                Class<Integer> cls2 = Integer.class;
                return new C11379SQr((Boolean) Pxi.A0U(parcel2, Boolean.class), (Integer) Pxi.A0U(parcel2, cls2), (Integer) Pxi.A0U(parcel2, cls2), (Integer) Pxi.A0U(parcel2, cls2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readInt(), readLong32);
            case 78:
                0qQ.A0B(parcel2, 0);
                AnonymousClass2E0.A0J();
                TreeJNI A0013 = TreeParcelable.A00(parcel2);
                0qQ.A0C(A0013, "null cannot be cast to non-null type com.facebookpay.bloks.graphql.FBPayBloksComponent");
                return new APMConfigurationImpl((C13925TlT) A0013);
            case 79:
                return new APMBloksNativeProps(C41848B3p.A1D(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 80:
                return new CurrencyAmount(C41848B3p.A1D(parcel2), parcel2.readString());
            case 81:
                0qQ.A0B(parcel2, 0);
                double readDouble4 = parcel2.readDouble();
                String readString42 = parcel2.readString();
                if (readString42.equals("MILES")) {
                    num6 = AnonymousClass05K.A00;
                } else if (readString42.equals("KILOMETERS")) {
                    num6 = AnonymousClass05K.A01;
                } else {
                    throw AnonymousClass7TE.A0w(readString42);
                }
                return new Distance(num6, readDouble4);
            case 82:
                String A1D5 = C41848B3p.A1D(parcel2);
                String readString43 = parcel2.readString();
                Class<ErrorDialogContent> cls3 = ErrorDialogContent.class;
                C10576RuV ruV = (C10576RuV) Pxi.A0U(parcel2, cls3);
                C10576RuV ruV2 = (C10576RuV) Pxi.A0U(parcel2, cls3);
                Integer num7 = null;
                if (parcel2.readInt() == 0) {
                    A12 = null;
                } else {
                    A12 = C41847B3o.A12(parcel2);
                }
                Integer A0C = Dbc.A0C(parcel2);
                if (parcel2.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    valueOf4 = C8911RFe.valueOf(parcel2.readString());
                }
                if (parcel2.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    valueOf5 = C8911RFe.valueOf(parcel2.readString());
                }
                Integer A0C2 = Dbc.A0C(parcel2);
                if (parcel2.readInt() != 0) {
                    String readString44 = parcel2.readString();
                    if (readString44.equals("USER_CANCELLATION")) {
                        num7 = AnonymousClass05K.A00;
                    } else if (readString44.equals("SYSTEM_ERROR")) {
                        num7 = AnonymousClass05K.A01;
                    } else if (readString44.equals("CHECKOUT_ERROR_RISK")) {
                        num7 = AnonymousClass05K.A0C;
                    } else if (readString44.equals("PAYMENT_REQUEST_CANCELLED")) {
                        num7 = AnonymousClass05K.A0N;
                    } else if (readString44.equals("USER_OPTIONALITY_SELECTION")) {
                        num7 = AnonymousClass05K.A0Y;
                    } else if (readString44.equals("INTERNAL_ERROR")) {
                        num7 = AnonymousClass05K.A0j;
                    } else {
                        throw AnonymousClass7TE.A0w(readString44);
                    }
                }
                return new ErrorDialogContent(valueOf4, valueOf5, ruV, ruV2, A12, A0C, A0C2, num7, A1D5, readString43);
            case 83:
                Class<APMButtonsItem> cls4 = APMButtonsItem.class;
                return new APMButtonsItem((APMBloksNativeProps) C41847B3o.A03(parcel2, cls4), Pxj.A0W(parcel2), (APMConfiguration) C41847B3o.A03(parcel2, cls4), JTU.A0U(parcel2));
            case 84:
                return new AnonCheckoutPuxLink((C7X) Pxi.A0U(parcel2, AnonCheckoutPuxLink.class), Pxj.A0W(parcel2), C41848B3p.A1X(parcel2));
            case 85:
                Class<AnonCheckoutToggleItem> cls5 = AnonCheckoutToggleItem.class;
                return new AnonCheckoutToggleItem((C7X) Pxi.A0U(parcel2, cls5), (C7X) Pxi.A0U(parcel2, cls5), Pxj.A0W(parcel2), C41848B3p.A1X(parcel2));
            case 86:
                return new AutoAdvanceButtonItem(Pxj.A0W(parcel2), parcel2.readInt());
            case 87:
                return new CheckoutOptionalityItem(Pxj.A0W(parcel2), parcel2.readString());
            case 88:
                return new ConfirmationPaymentSectionItem(Pxj.A0W(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 89:
                return new ConfirmationProductUpsellItem(Pxj.A0W(parcel2), parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 90:
                return new ConfirmationProductUpsellSectionHeaderItem(Pxj.A0W(parcel2), parcel2.readString());
            case 91:
                return new EmailOptInItem((C7X) Pxi.A0U(parcel2, EmailOptInItem.class), Pxj.A0W(parcel2), parcel2.readString(), C41848B3p.A1X(parcel2), C41848B3p.A1X(parcel2));
            case 92:
                return new IncentiveItem(Pxj.A0W(parcel2), parcel2.createStringArrayList(), parcel2.readInt(), C41848B3p.A1X(parcel2));
            case 93:
                return new IncentiveSummaryItem(Pxj.A0W(parcel2), parcel2.createStringArrayList(), parcel2.readInt());
            case 94:
                return new InlineBackButtonItem(Pxj.A0W(parcel2), parcel2.readString());
            case 95:
                return new InlineFormItem(Pxj.A0W(parcel2), (FormParams) C41847B3o.A03(parcel2, InlineFormItem.class), parcel2.readString());
            case 96:
                return new InvisibleHeaderItem(Pxj.A0W(parcel2));
            case 97:
                return new PayButtonItem((CurrencyAmount) C41847B3o.A03(parcel2, PayButtonItem.class), Pxj.A0W(parcel2), parcel2.readString(), C41848B3p.A1X(parcel2));
            case 98:
                RH6 A0W = Pxj.A0W(parcel2);
                Class<PuxAccordionItem> cls6 = PuxAccordionItem.class;
                SUj sUj = (SUj) Pxi.A0U(parcel2, cls6);
                int readInt2 = parcel2.readInt();
                ArrayList A0v4 = DbS.A0v(readInt2);
                for (int i8 = 0; i8 != readInt2; i8++) {
                    A0v4.add(Pxi.A0U(parcel2, cls6));
                }
                return new PuxAccordionItem(A0W, (C10781Ry2) Pxi.A0U(parcel2, cls6), sUj, A0v4, C41848B3p.A1X(parcel2));
            default:
                RH6 A0W2 = Pxj.A0W(parcel2);
                String readString45 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    valueOf8 = null;
                } else {
                    valueOf8 = C8942RGk.valueOf(parcel2.readString());
                }
                return new PuxBannerItem((C7X) Pxi.A0U(parcel2, PuxBannerItem.class), A0W2, valueOf8, (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel2), readString45, C41848B3p.A1X(parcel2));
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new IABBwPayPalExtension[i];
            case 1:
                return new IABDummyContext[i];
            case 2:
                return new IABPostClickPersonalizationDataExtension[i];
            case 3:
                return new IABWatchAndBrowseWebToWAExtension[i];
            case 4:
                return new IabAdCreativeOptimizationConfigByType[i];
            case 5:
                return new IgPromoAdsExtension[i];
            case 6:
                return new IgPromoAdsPromoCode[i];
            case 7:
                return new MessagingExtensionType[i];
            case 8:
                return new MetaCheckoutExperienceType[i];
            case 9:
                return new PaymentConfig[i];
            case 10:
                return new ReceiverInfo[i];
            case 11:
                return new IABBwPContext[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new IABBwPExtension[i];
            case 13:
                return new IABEvent[i];
            case 14:
                return new InterstitialTrigger[i];
            case 15:
                return new InterstitialTriggerContext[i];
            case 16:
                return new MaxImpressionsPerInterval[i];
            case 17:
                return new ParcelableCoordinates[i];
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return new ParcelableFbLocationContinuousListenerParams[i];
            case 19:
                return new ParcelableFbLocationOperationParams[i];
            case 20:
                return new ParcelableGeofenceResult[i];
            case 21:
                return new ParcelableImmutableLocation[i];
            case 22:
                return new ParcelableVisitStateAlgorithmVersion[i];
            case 23:
                return new ParcelableActivityRecognitionResult[i];
            case 24:
                return new ParcelableDetectedActivity[i];
            case 25:
                return new ParcelableLocationSignalPackage[i];
            case 26:
                return new Address[i];
            case 27:
                return new LiveLocationSession[i];
            case 28:
                return new LiveLocationSharer[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new com.facebook.locationsharing.core.models.Location[i];
            case 30:
                return new LocationSharingPresenterState[i];
            case 31:
                return new Place[i];
            case 32:
                return new PointOfInterest[i];
            case 33:
                return new PointOfInterestViewModel[i];
            case 34:
                return new LoginClient$Request[i];
            case 35:
                return new LoginClient$Result[i];
            case 36:
                return new MapOptions[i];
            case 37:
                return new SubscriptionParcelable[i];
            case 38:
                return new DirectInstallDownloadEvent[i];
            case 39:
                return new BottomSheetFeatures[i];
            case 40:
                return new TreeParcelable[i];
            case Seq.NULL_REFNUM /*41*/:
                return new ZonedValue[i];
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new ZonePolicy[i];
            case 43:
                return new PushProperty[i];
            case 44:
                return new RegisterPushTokenParams[i];
            case 45:
                return new PushInfraMetaData[i];
            case 46:
                return new BugReportFile[i];
            case 47:
                return new GqlsTopicExtraInfo[i];
            case 48:
                return new ParcelableSensorEventClone[i];
            case 49:
                return new DialogTexts[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new FixedSizes[i];
            case 51:
                return new Size[i];
            case 52:
                return new DefaultEvidenceRecorderProvider[i];
            case 53:
                return new SelfieEvidence[i];
            case 54:
                return new ChallengeProvider[i];
            case 55:
                return new IgVoltronAndNmlModulesDownloader[i];
            case 56:
                return new IdCaptureConfig[i];
            case 57:
                return new SelfieCaptureConfig[i];
            case 58:
                return new IgSmartCaptureLoggerProvider[i];
            case 59:
                return new ResolvedConsentTextsProvider[i];
            case 60:
                return new PanoBounds[i];
            case 63:
                return new EmojiSet[i];
            case 64:
                return new EmojiSet.Metadata[i];
            case 65:
                return new PlayerOrigin[i];
            case 66:
                return new FirstDataSegmentCacheCheckEndEvent[i];
            case 67:
                return new FirstDataSegmentCacheCheckStartEvent[i];
            case 68:
                return new PrefetchTaskDataFetchCompletedEvent[i];
            case 69:
                return new PrefetchTaskDataFetchIssuedEvent[i];
            case 70:
                return new SpatialAudioFocusParams[i];
            case 71:
                return new VideoProtocolProps[i];
            case 72:
                return new SphericalMetadata[i];
            case 73:
                return new AppLinkDeviceConnectionStatus[i];
            case 74:
                return new AppLinkDeviceHardwareState[i];
            case 75:
                return new AppLinkDeviceMountState[i];
            case 76:
                return new AppLinkDevicePeakPowerState[i];
            case 77:
                return new ParcelableWifiScanResult[i];
            case 78:
                return new APMConfiguration[i];
            case 79:
                return new APMBloksNativeProps[i];
            case 80:
                return new CurrencyAmount[i];
            case 81:
                return new Distance[i];
            case 82:
                return new ErrorDialogContent[i];
            case 83:
                return new APMButtonsItem[i];
            case 84:
                return new AnonCheckoutPuxLink[i];
            case 85:
                return new AnonCheckoutToggleItem[i];
            case 86:
                return new AutoAdvanceButtonItem[i];
            case 87:
                return new CheckoutOptionalityItem[i];
            case 88:
                return new ConfirmationPaymentSectionItem[i];
            case 89:
                return new ConfirmationProductUpsellItem[i];
            case 90:
                return new ConfirmationProductUpsellSectionHeaderItem[i];
            case 91:
                return new EmailOptInItem[i];
            case 92:
                return new IncentiveItem[i];
            case 93:
                return new IncentiveSummaryItem[i];
            case 94:
                return new InlineBackButtonItem[i];
            case 95:
                return new InlineFormItem[i];
            case 96:
                return new InvisibleHeaderItem[i];
            case 97:
                return new PayButtonItem[i];
            case 98:
                return new PuxAccordionItem[i];
            case 99:
                return new PuxBannerItem[i];
            default:
                return new Emoji[i];
        }
    }

    public static void A02(Parcel parcel, Object obj, AbstractMap abstractMap) {
        abstractMap.put(obj, parcel.readString());
    }
}
