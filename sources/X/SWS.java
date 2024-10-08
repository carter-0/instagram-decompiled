package X;

import android.os.Parcelable;
import com.facebook.android.instantexperiences.payment.CanShowPaymentModuleJSBridgeCall;
import com.facebook.android.instantexperiences.payment.CanShowPaymentModuleJSBridgeCallResult;
import com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCall;
import com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCallResult;
import com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestErrorCall;
import com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestSuccessCall;
import com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestUnknownCall;
import com.facebook.android.maps.model.CameraPosition;
import com.facebook.android.maps.model.LatLng;
import com.facebook.android.maps.model.LatLngBounds;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.avatar.autogen.download.IgModelDownloader;
import com.facebook.avatar.autogen.flow.AESelfieCaptureConfig;
import com.facebook.blescan.parcelable.ParcelableBleScanResult;
import com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy;
import com.facebook.browser.lite.extensions.autofill.model.AutofillData;
import com.facebook.browser.lite.extensions.autofill.model.AutofillSettings;
import com.facebook.browser.lite.extensions.commercecheckout.constant.MetaCheckoutRequest;
import com.facebook.browser.lite.extensions.commercecheckout.models.CommerceMetaCheckoutLogEventRequest;
import com.facebook.browser.lite.extensions.commercecheckout.models.DisclaimerText;
import com.facebook.browser.lite.extensions.igcallextension.IGCallExtensionModel;
import com.facebook.browser.lite.extensions.igleadformextension.IGLeadFormExtensionModel;
import com.facebook.browser.lite.extensions.whatsapp.CTWABrowserCTAExtensionModel;
import com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall;
import com.facebook.browser.lite.ipc.IABExtensionEventHandlerPayload;
import com.facebook.browser.lite.ipc.IABExtensionStatesHandlerPayload;
import com.facebook.browser.lite.ipc.PrefetchCacheEntry;
import com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig;
import com.facebook.businessextension.jscalls.InitJSBridgeCallData;
import com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCallData;
import com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCallData;
import com.facebook.cameracore.ardelivery.model.AREffectAsyncAsset;
import com.facebook.cameracore.ardelivery.model.ARRequestEffect;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.detector.DefectDetectorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenGraphFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ExternalRenderFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapAlphaFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BasicAdjustTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BlurTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BoxBlurTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BrightnessTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.ChromaticAberrationTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.FadeOutTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.FlareTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.GlitchTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.LinearGradientTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.PanFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.ScreenBlendWithColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.SpinTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.TintTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.TransformTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.WarpTransitionFilter;
import com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.cellinfo.parcelable.ParcelableCdmaCellInfo;
import com.facebook.cellinfo.parcelable.ParcelableGeneralCellInfo;
import com.facebook.common.gcmcompat.OneoffTask;
import com.facebook.common.gcmcompat.PeriodicTask;
import com.facebook.common.math.matrix.Matrix3;
import com.facebook.common.parcels.ParcelableBoolean;
import com.facebook.common.payments.model.Address;
import com.facebook.common.payments.paymentmethods.model.AdditionalFields;
import com.facebook.common.payments.paymentmethods.model.CreditCard;
import com.facebook.common.payments.paymentmethods.model.NewCreditCard;
import com.facebook.common.payments.paymentmethods.model.NewPayPal;
import com.facebook.common.payments.paymentmethods.model.PayPalBillingAgreement;
import com.facebook.common.util.Either;
import com.facebook.common.util.ParcelablePair;
import com.facebook.common.util.Quartet;
import com.facebook.common.util.Triplet;
import com.facebook.dsp.core.ColorData;
import com.facebook.dsp.core.OpacityData;
import com.facebook.exoplayer.ipc.RendererContext;
import com.facebook.exoplayer.ipc.VideoCacheStatus;
import com.facebook.exoplayer.ipc.VideoPlayerServiceEvent;
import com.facebook.facedetection.amlfacetracker.SelfieFaceTrackerProvider;
import com.facebook.fbpay.hub.p2pwidget.api.FbPayP2pFriend;
import com.facebook.fbpay.hub.p2pwidget.api.FbPayP2pWidgetSendRequest;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.graphql.error.GraphQLError;
import com.facebook.graphql.modelutil.parcel.ModelParcelHelper$LazyHolder;
import com.facebook.graphql.modelutil.parcel.TreeParcelable;
import com.facebook.http.interfaces.RequestPriority;
import com.facebook.http.protocol.ApiErrorResult;
import com.facebook.iabadscontext.Availability;
import com.facebook.iabadscontext.CheckoutSetupPayload;
import com.facebook.iabadscontext.DisclaimerBodyUrlRanges;
import com.facebook.iabadscontext.IABAdsBwIntegrationExtension;
import com.facebook.iabadscontext.IABAdsContext;
import com.facebook.iabadscontext.IABAdsMetaCheckoutDataExtension;
import com.facebook.iabadscontext.IABAdsMetaCheckoutPaymentsSDKDataExtension;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

public final class SWS implements Parcelable.Creator {
    public final int A00;

    public SWS(int i) {
        this.A00 = i;
    }

    public static SWS A00(int i) {
        return new SWS(i);
    }

    /* JADX WARNING: type inference failed for: r8v5, types: [com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestCall, com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v6, types: [com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestCall, com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v7, types: [com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestCall, com.facebook.android.instantexperiences.jscall.InstantExperiencesJSBridgeCall, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v25, types: [com.facebook.browser.lite.ipc.IABExtensionEventHandlerPayload, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v26, types: [com.facebook.browser.lite.ipc.IABExtensionStatesHandlerPayload, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v27, types: [java.lang.Object, com.facebook.browser.lite.ipc.PrefetchCacheEntry] */
    /* JADX WARNING: type inference failed for: r8v42, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FitTransformParams, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v43, types: [com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v66, types: [com.facebook.common.gcmcompat.Task, com.facebook.common.gcmcompat.OneoffTask, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v67, types: [com.facebook.common.gcmcompat.Task, java.lang.Object, com.facebook.common.gcmcompat.PeriodicTask] */
    /* JADX WARNING: type inference failed for: r8v82, types: [com.facebook.exoplayer.ipc.VideoCacheStatus, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v86, types: [com.facebook.fbservice.service.OperationResult, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v97, types: [java.lang.Object, com.facebook.exoplayer.ipc.VpsPrefetchCacheEvictEvent] */
    /* JADX WARNING: type inference failed for: r8v99, types: [com.facebook.exoplayer.ipc.VpsPrefetchStartEvent, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v101, types: [com.facebook.exoplayer.ipc.VpsManifestParseErrorEvent, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v105, types: [com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x09c8, code lost:
        r0.setDataPosition(r6 + r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:422:0x09cc, code lost:
        return r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r25) {
        /*
            r24 = this;
            r0 = r24
            int r1 = r0.A00
            r0 = r25
            switch(r1) {
                case 0: goto L_0x0b76;
                case 1: goto L_0x0b70;
                case 2: goto L_0x0b6a;
                case 3: goto L_0x0b64;
                case 4: goto L_0x0b58;
                case 5: goto L_0x0b4c;
                case 6: goto L_0x0b40;
                case 7: goto L_0x0b3a;
                case 8: goto L_0x0b34;
                case 9: goto L_0x0b2e;
                case 10: goto L_0x0b28;
                case 11: goto L_0x0b16;
                case 12: goto L_0x0b10;
                case 13: goto L_0x0af6;
                case 14: goto L_0x0036;
                case 15: goto L_0x0af0;
                case 16: goto L_0x0ac6;
                case 17: goto L_0x0a9e;
                case 18: goto L_0x0a1a;
                case 19: goto L_0x0a08;
                case 20: goto L_0x09fe;
                case 21: goto L_0x09f4;
                case 22: goto L_0x09ea;
                case 23: goto L_0x09e4;
                case 24: goto L_0x0968;
                case 25: goto L_0x08e0;
                case 26: goto L_0x08c2;
                case 27: goto L_0x08bc;
                case 28: goto L_0x08b6;
                case 29: goto L_0x08b0;
                case 30: goto L_0x08aa;
                case 31: goto L_0x08a4;
                case 32: goto L_0x089e;
                case 33: goto L_0x0898;
                case 34: goto L_0x0892;
                case 35: goto L_0x088c;
                case 36: goto L_0x087c;
                case 37: goto L_0x0837;
                case 38: goto L_0x07dc;
                case 39: goto L_0x07ba;
                case 40: goto L_0x07a2;
                case 41: goto L_0x076c;
                case 42: goto L_0x074e;
                case 43: goto L_0x0730;
                case 44: goto L_0x0712;
                case 45: goto L_0x06ec;
                case 46: goto L_0x06ce;
                case 47: goto L_0x06b0;
                case 48: goto L_0x0692;
                case 49: goto L_0x0674;
                case 50: goto L_0x0656;
                case 51: goto L_0x0638;
                case 52: goto L_0x061a;
                case 53: goto L_0x05f4;
                case 54: goto L_0x05d6;
                case 55: goto L_0x05b8;
                case 56: goto L_0x059a;
                case 57: goto L_0x057c;
                case 58: goto L_0x055e;
                case 59: goto L_0x0558;
                case 60: goto L_0x0552;
                case 61: goto L_0x054c;
                case 62: goto L_0x052c;
                case 63: goto L_0x04ee;
                case 64: goto L_0x04dc;
                case 65: goto L_0x04c4;
                case 66: goto L_0x04ba;
                case 67: goto L_0x0b7c;
                case 68: goto L_0x04b4;
                case 69: goto L_0x04ae;
                case 70: goto L_0x04a8;
                case 71: goto L_0x04a2;
                case 72: goto L_0x049c;
                case 73: goto L_0x0496;
                case 74: goto L_0x0482;
                case 75: goto L_0x0472;
                case 76: goto L_0x046c;
                case 77: goto L_0x0458;
                case 78: goto L_0x044a;
                case 79: goto L_0x043c;
                case 80: goto L_0x0436;
                case 81: goto L_0x0424;
                case 82: goto L_0x011d;
                case 83: goto L_0x041e;
                case 84: goto L_0x0418;
                case 85: goto L_0x0412;
                case 86: goto L_0x02bd;
                case 87: goto L_0x02b7;
                case 88: goto L_0x02b1;
                case 89: goto L_0x001f;
                case 90: goto L_0x0298;
                case 91: goto L_0x0292;
                case 92: goto L_0x0280;
                case 93: goto L_0x0256;
                case 94: goto L_0x0244;
                case 95: goto L_0x0221;
                case 96: goto L_0x017e;
                case 97: goto L_0x0060;
                case 98: goto L_0x004e;
                default: goto L_0x0009;
            }
        L_0x0009:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            android.os.Parcelable$Creator r1 = com.facebook.iabadscontext.CheckoutSetupPayload.CREATOR
            java.lang.Object r1 = r1.createFromParcel(r0)
            com.facebook.iabadscontext.CheckoutSetupPayload r1 = (com.facebook.iabadscontext.CheckoutSetupPayload) r1
            java.lang.String r0 = r0.readString()
            com.facebook.iabadscontext.IABAdsMetaCheckoutPaymentsSDKDataExtension r8 = new com.facebook.iabadscontext.IABAdsMetaCheckoutPaymentsSDKDataExtension
            r8.<init>(r1, r0)
        L_0x001e:
            return r8
        L_0x001f:
            r8 = 0
            if (r25 == 0) goto L_0x001e
            java.lang.String r3 = r0.readString()     // Catch:{ Exception -> 0x0b99 }
            java.lang.String r1 = "default"
            boolean r1 = r1.equals(r3)     // Catch:{ Exception -> 0x0b99 }
            if (r1 == 0) goto L_0x0032
            java.lang.String r3 = r0.readString()     // Catch:{ Exception -> 0x0b99 }
        L_0x0032:
            if (r3 == 0) goto L_0x001e
            goto L_0x0b86
        L_0x0036:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy r8 = new com.facebook.browser.lite.bridge.BrowserLiteJSBridgeProxy
            r8.<init>()
            java.lang.String r1 = r0.readString()
            if (r1 == 0) goto L_0x001e
            r8.A01 = r1
            android.os.Bundle r0 = r0.readBundle()
            r8.A00 = r0
            return r8
        L_0x004e:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            android.os.Parcelable$Creator r1 = com.facebook.iabadscontext.MetaCheckoutExperienceType.CREATOR
            java.lang.Object r0 = r1.createFromParcel(r0)
            com.facebook.iabadscontext.MetaCheckoutExperienceType r0 = (com.facebook.iabadscontext.MetaCheckoutExperienceType) r0
            com.facebook.iabadscontext.IABAdsMetaCheckoutDataExtension r8 = new com.facebook.iabadscontext.IABAdsMetaCheckoutDataExtension
            r8.<init>(r0)
            return r8
        L_0x0060:
            int r1 = X.C41848B3p.A00(r0)
            r12 = 0
            if (r1 != 0) goto L_0x0092
            r18 = r12
        L_0x0069:
            java.io.Serializable r2 = r0.readSerializable()
            com.google.common.collect.ImmutableList r2 = (com.google.common.collect.ImmutableList) r2
            java.lang.String r19 = r0.readString()
            int r6 = r0.readInt()
            java.util.LinkedHashMap r3 = X.DbS.A0x(r6)
            r5 = 0
        L_0x007c:
            if (r5 == r6) goto L_0x0097
            java.lang.String r1 = r0.readString()
            X.RFY r4 = X.RFY.valueOf(r1)
            android.os.Parcelable$Creator r1 = com.facebook.iabadscontext.DisclaimerText.CREATOR
            java.lang.Object r1 = r1.createFromParcel(r0)
            r3.put(r4, r1)
            int r5 = r5 + 1
            goto L_0x007c
        L_0x0092:
            java.lang.Integer r18 = X.C41847B3o.A12(r0)
            goto L_0x0069
        L_0x0097:
            java.lang.String r20 = r0.readString()
            java.util.ArrayList r22 = r0.createStringArrayList()
            android.os.Parcelable$Creator r1 = com.facebook.iabadscontext.IABAdsMetaCheckoutDataExtension.CREATOR
            java.lang.Object r10 = r1.createFromParcel(r0)
            com.facebook.iabadscontext.IABAdsMetaCheckoutDataExtension r10 = (com.facebook.iabadscontext.IABAdsMetaCheckoutDataExtension) r10
            java.lang.Class<com.facebook.iabadscontext.IABAdsContext> r1 = com.facebook.iabadscontext.IABAdsContext.class
            android.os.Parcelable r1 = X.C41847B3o.A03(r0, r1)
            com.facebook.iabbwpextension.IABBwPExtension r1 = (com.facebook.iabbwpextension.IABBwPExtension) r1
            int r4 = r0.readInt()
            if (r4 != 0) goto L_0x0116
            r15 = r12
        L_0x00b6:
            com.facebook.iabadscontext.IgPromoAdsExtension r15 = (com.facebook.iabadscontext.IgPromoAdsExtension) r15
            int r4 = r0.readInt()
            if (r4 != 0) goto L_0x010f
            r11 = r12
        L_0x00bf:
            com.facebook.iabadscontext.IABAdsMetaCheckoutPaymentsSDKDataExtension r11 = (com.facebook.iabadscontext.IABAdsMetaCheckoutPaymentsSDKDataExtension) r11
            int r4 = r0.readInt()
            if (r4 != 0) goto L_0x0108
            r14 = r12
        L_0x00c8:
            com.facebook.iabadscontext.IABWatchAndBrowseWebToWAExtension r14 = (com.facebook.iabadscontext.IABWatchAndBrowseWebToWAExtension) r14
            int r4 = r0.readInt()
            if (r4 != 0) goto L_0x0101
            r9 = r12
        L_0x00d1:
            com.facebook.iabadscontext.IABAdsBwIntegrationExtension r9 = (com.facebook.iabadscontext.IABAdsBwIntegrationExtension) r9
            int r4 = r0.readInt()
            if (r4 != 0) goto L_0x00fa
            r13 = r12
        L_0x00da:
            com.facebook.iabadscontext.IABPostClickPersonalizationDataExtension r13 = (com.facebook.iabadscontext.IABPostClickPersonalizationDataExtension) r13
            int r4 = r0.readInt()
            if (r4 == 0) goto L_0x00e8
            android.os.Parcelable$Creator r4 = com.facebook.iabadscontext.IABBwPayPalExtension.CREATOR
            java.lang.Object r12 = r4.createFromParcel(r0)
        L_0x00e8:
            com.facebook.iabadscontext.IABBwPayPalExtension r12 = (com.facebook.iabadscontext.IABBwPayPalExtension) r12
            java.lang.String r21 = r0.readString()
            com.facebook.iabadscontext.IABAdsContext r8 = new com.facebook.iabadscontext.IABAdsContext
            r16 = r1
            r17 = r2
            r23 = r3
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23)
            return r8
        L_0x00fa:
            android.os.Parcelable$Creator r4 = com.facebook.iabadscontext.IABPostClickPersonalizationDataExtension.CREATOR
            java.lang.Object r13 = r4.createFromParcel(r0)
            goto L_0x00da
        L_0x0101:
            android.os.Parcelable$Creator r4 = com.facebook.iabadscontext.IABAdsBwIntegrationExtension.CREATOR
            java.lang.Object r9 = r4.createFromParcel(r0)
            goto L_0x00d1
        L_0x0108:
            android.os.Parcelable$Creator r4 = com.facebook.iabadscontext.IABWatchAndBrowseWebToWAExtension.CREATOR
            java.lang.Object r14 = r4.createFromParcel(r0)
            goto L_0x00c8
        L_0x010f:
            android.os.Parcelable$Creator r4 = com.facebook.iabadscontext.IABAdsMetaCheckoutPaymentsSDKDataExtension.CREATOR
            java.lang.Object r11 = r4.createFromParcel(r0)
            goto L_0x00bf
        L_0x0116:
            android.os.Parcelable$Creator r4 = com.facebook.iabadscontext.IgPromoAdsExtension.CREATOR
            java.lang.Object r15 = r4.createFromParcel(r0)
            goto L_0x00b6
        L_0x011d:
            int r3 = r0.readInt()
            android.util.SparseArray r2 = X.RFX.A01
            java.lang.Object r1 = r2.get(r3)
            if (r1 == 0) goto L_0x0177
            java.lang.Object r1 = r2.get(r3)
            X.RFX r1 = (X.RFX) r1
            int r1 = r1.ordinal()
            switch(r1) {
                case 1: goto L_0x016b;
                case 2: goto L_0x0136;
                case 3: goto L_0x0136;
                case 4: goto L_0x0136;
                case 5: goto L_0x0165;
                case 6: goto L_0x0159;
                case 7: goto L_0x0153;
                case 8: goto L_0x013f;
                case 9: goto L_0x013d;
                default: goto L_0x0136;
            }
        L_0x0136:
            java.lang.String r0 = "Unknown event type"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r0)
            throw r1
        L_0x013d:
            r8 = 0
            return r8
        L_0x013f:
            com.facebook.exoplayer.ipc.VpsManifestParseErrorEvent r8 = new com.facebook.exoplayer.ipc.VpsManifestParseErrorEvent
            r8.<init>()
            java.lang.String r1 = r0.readString()
            r8.A01 = r1
            java.io.Serializable r0 = r0.readSerializable()
            java.lang.Exception r0 = (java.lang.Exception) r0
            r8.A00 = r0
            return r8
        L_0x0153:
            com.facebook.exoplayer.ipc.VpsVideoCacheDatabaseFullEvent r8 = new com.facebook.exoplayer.ipc.VpsVideoCacheDatabaseFullEvent
            r8.<init>(r0)
            return r8
        L_0x0159:
            com.facebook.exoplayer.ipc.VpsPrefetchStartEvent r8 = new com.facebook.exoplayer.ipc.VpsPrefetchStartEvent
            r8.<init>()
            java.lang.String r0 = r0.readString()
            r8.A00 = r0
            return r8
        L_0x0165:
            com.facebook.exoplayer.ipc.VpsCacheErrorEvent r8 = new com.facebook.exoplayer.ipc.VpsCacheErrorEvent
            r8.<init>(r0)
            return r8
        L_0x016b:
            com.facebook.exoplayer.ipc.VpsPrefetchCacheEvictEvent r8 = new com.facebook.exoplayer.ipc.VpsPrefetchCacheEvictEvent
            r8.<init>()
            java.lang.String r0 = r0.readString()
            r8.A00 = r0
            return r8
        L_0x0177:
            java.lang.String r0 = "Invalid EventType value"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r0)
            throw r1
        L_0x017e:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.lang.String r3 = "UNSET_OR_UNRECOGNIZED_ENUM_VALUE"
            boolean r1 = r2.equals(r3)
            if (r1 == 0) goto L_0x01f5
            java.lang.Integer r9 = X.AnonymousClass05K.A00
        L_0x018c:
            java.lang.String r2 = r0.readString()
            boolean r1 = r2.equals(r3)
            if (r1 == 0) goto L_0x01c9
            java.lang.Integer r10 = X.AnonymousClass05K.A00
        L_0x0198:
            java.lang.String r13 = r0.readString()
            int r1 = r0.readInt()
            r11 = 0
            if (r1 != 0) goto L_0x01c4
            r12 = r11
        L_0x01a4:
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            int r1 = r0.readInt()
            if (r1 == 0) goto L_0x01b6
            java.lang.Integer r11 = X.C41847B3o.A12(r0)
        L_0x01b6:
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            com.facebook.iabadscontext.IABAdsBwIntegrationExtension r8 = new com.facebook.iabadscontext.IABAdsBwIntegrationExtension
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r8
        L_0x01c4:
            java.lang.Long r12 = X.Pxi.A0T(r0)
            goto L_0x01a4
        L_0x01c9:
            java.lang.String r1 = "AMAZON"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01d4
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            goto L_0x0198
        L_0x01d4:
            java.lang.String r1 = "JEST_E2E_AMAZON"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01df
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
            goto L_0x0198
        L_0x01df:
            java.lang.String r1 = "SHOPEE_TH"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x01ea
            java.lang.Integer r10 = X.AnonymousClass05K.A0N
            goto L_0x0198
        L_0x01ea:
            java.lang.String r1 = "WALMART"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0217
            java.lang.Integer r10 = X.AnonymousClass05K.A0Y
            goto L_0x0198
        L_0x01f5:
            java.lang.String r1 = "CUSTOM_IAB_FOR_1P_BWP"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0200
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            goto L_0x018c
        L_0x0200:
            java.lang.String r1 = "STANDARD_IAB"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x020b
            java.lang.Integer r9 = X.AnonymousClass05K.A0C
            goto L_0x018c
        L_0x020b:
            java.lang.String r1 = "BWI_STANDARD_IAB"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x021c
            java.lang.Integer r9 = X.AnonymousClass05K.A0N
            goto L_0x018c
        L_0x0217:
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r2)
            throw r1
        L_0x021c:
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r2)
            throw r1
        L_0x0221:
            java.lang.String r5 = X.C41848B3p.A1D(r0)
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0232
            r3 = 0
        L_0x022c:
            com.facebook.iabadscontext.DisclaimerText r8 = new com.facebook.iabadscontext.DisclaimerText
            r8.<init>(r5, r3)
            return r8
        L_0x0232:
            int r4 = r0.readInt()
            java.util.ArrayList r3 = X.DbS.A0v(r4)
            r2 = 0
        L_0x023b:
            if (r2 == r4) goto L_0x022c
            android.os.Parcelable$Creator r1 = com.facebook.iabadscontext.DisclaimerBodyUrlRanges.CREATOR
            int r2 = X.JTT.A04(r0, r1, r3, r2)
            goto L_0x023b
        L_0x0244:
            int r2 = X.C41848B3p.A00(r0)
            int r1 = r0.readInt()
            java.lang.String r0 = r0.readString()
            com.facebook.iabadscontext.DisclaimerBodyUrlRanges r8 = new com.facebook.iabadscontext.DisclaimerBodyUrlRanges
            r8.<init>(r2, r1, r0)
            return r8
        L_0x0256:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            android.os.Parcelable$Creator r1 = com.facebook.iabadscontext.PaymentConfig.CREATOR
            java.lang.Object r3 = r1.createFromParcel(r0)
            com.facebook.iabadscontext.PaymentConfig r3 = (com.facebook.iabadscontext.PaymentConfig) r3
            android.os.Parcelable$Creator r1 = com.facebook.iabadscontext.Availability.CREATOR
            java.lang.Object r2 = r1.createFromParcel(r0)
            com.facebook.iabadscontext.Availability r2 = (com.facebook.iabadscontext.Availability) r2
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0279
            r0 = 0
        L_0x0271:
            com.facebook.iabadscontext.ReceiverInfo r0 = (com.facebook.iabadscontext.ReceiverInfo) r0
            com.facebook.iabadscontext.CheckoutSetupPayload r8 = new com.facebook.iabadscontext.CheckoutSetupPayload
            r8.<init>(r2, r3, r0)
            return r8
        L_0x0279:
            android.os.Parcelable$Creator r1 = com.facebook.iabadscontext.ReceiverInfo.CREATOR
            java.lang.Object r0 = r1.createFromParcel(r0)
            goto L_0x0271
        L_0x0280:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            boolean r1 = X.C41848B3p.A1X(r0)
            java.util.ArrayList r0 = r0.createStringArrayList()
            com.facebook.iabadscontext.Availability r8 = new com.facebook.iabadscontext.Availability
            r8.<init>(r0, r1)
            return r8
        L_0x0292:
            com.facebook.http.protocol.ApiErrorResult r8 = new com.facebook.http.protocol.ApiErrorResult
            r8.<init>(r0)
            return r8
        L_0x0298:
            java.lang.String r1 = r0.readString()
            com.facebook.http.interfaces.RequestPriority r8 = com.facebook.http.interfaces.RequestPriority.valueOf(r1)     // Catch:{ IllegalArgumentException -> 0x02a1 }
            return r8
        L_0x02a1:
            java.lang.Class<com.facebook.http.interfaces.RequestPriority> r2 = com.facebook.http.interfaces.RequestPriority.class
            com.facebook.http.interfaces.RequestPriority r8 = com.facebook.http.interfaces.RequestPriority.A00
            java.lang.String r0 = "NON_INTERACTIVE"
            java.lang.Object[] r1 = new java.lang.Object[]{r1, r0}
            java.lang.String r0 = "Do not recognize priority %s. Defaulting to %s."
            X.0KC.A09(r2, r0, r1)
            return r8
        L_0x02b1:
            com.facebook.graphql.modelutil.parcel.ModelParcelHelper$LazyHolder r8 = new com.facebook.graphql.modelutil.parcel.ModelParcelHelper$LazyHolder
            r8.<init>((android.os.Parcel) r0)
            return r8
        L_0x02b7:
            com.facebook.graphql.error.GraphQLError r8 = new com.facebook.graphql.error.GraphQLError
            r8.<init>(r0)
            return r8
        L_0x02bd:
            com.facebook.fbservice.service.OperationResult r8 = new com.facebook.fbservice.service.OperationResult
            r8.<init>()
            boolean r1 = X.C41848B3p.A1X(r0)
            r8.A05 = r1
            java.lang.String r1 = r0.readString()
            r8.A03 = r1
            java.lang.ClassLoader r1 = X.Pxf.A0W(r8)
            android.os.Bundle r1 = r0.readBundle(r1)
            r8.A00 = r1
            java.lang.String r2 = r0.readString()
            java.lang.String r1 = "NO_ERROR"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x02f7
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x02e6:
            r8.A01 = r1
            java.lang.String r1 = r0.readString()
            r8.A02 = r1
            java.io.Serializable r0 = r0.readSerializable()
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r8.A04 = r0
            return r8
        L_0x02f7:
            java.lang.String r1 = "API_ERROR"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0302
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x02e6
        L_0x0302:
            java.lang.String r1 = "HTTP_400_AUTHENTICATION"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x030d
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x02e6
        L_0x030d:
            java.lang.String r1 = "HTTP_400_OTHER"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0318
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            goto L_0x02e6
        L_0x0318:
            java.lang.String r1 = "HTTP_500_CLASS"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0323
            java.lang.Integer r1 = X.AnonymousClass05K.A0Y
            goto L_0x02e6
        L_0x0323:
            java.lang.String r1 = "CONNECTION_FAILURE"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x032e
            java.lang.Integer r1 = X.AnonymousClass05K.A0j
            goto L_0x02e6
        L_0x032e:
            java.lang.String r1 = "ORCA_SERVICE_UNKNOWN_OPERATION"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0339
            java.lang.Integer r1 = X.AnonymousClass05K.A0u
            goto L_0x02e6
        L_0x0339:
            java.lang.String r1 = "ORCA_SERVICE_IPC_FAILURE"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0344
            java.lang.Integer r1 = X.AnonymousClass05K.A15
            goto L_0x02e6
        L_0x0344:
            java.lang.String r1 = "OUT_OF_MEMORY"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x034f
            java.lang.Integer r1 = X.AnonymousClass05K.A1F
            goto L_0x02e6
        L_0x034f:
            java.lang.String r1 = "OTHER"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x035a
            java.lang.Integer r1 = X.AnonymousClass05K.A1I
            goto L_0x02e6
        L_0x035a:
            java.lang.String r1 = "CANCELLED"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0365
            java.lang.Integer r1 = X.AnonymousClass05K.A02
            goto L_0x02e6
        L_0x0365:
            java.lang.String r1 = "CACHE_DISK_ERROR"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0371
            java.lang.Integer r1 = X.AnonymousClass05K.A03
            goto L_0x02e6
        L_0x0371:
            java.lang.String r1 = "MQTT_SEND_FAILURE"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x037d
            java.lang.Integer r1 = X.AnonymousClass05K.A04
            goto L_0x02e6
        L_0x037d:
            java.lang.String r1 = "WORK_AUTH_FAILED"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0389
            java.lang.Integer r1 = X.AnonymousClass05K.A05
            goto L_0x02e6
        L_0x0389:
            java.lang.String r1 = "WORK_AUTH_COMMUNITY_ID_REQUIRED"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0395
            java.lang.Integer r1 = X.AnonymousClass05K.A06
            goto L_0x02e6
        L_0x0395:
            java.lang.String r1 = "DATE_ERROR"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x03a1
            java.lang.Integer r1 = X.AnonymousClass05K.A07
            goto L_0x02e6
        L_0x03a1:
            java.lang.String r1 = "SEGMENTED_TRANSCODE_ERROR"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x03ad
            java.lang.Integer r1 = X.AnonymousClass05K.A08
            goto L_0x02e6
        L_0x03ad:
            java.lang.String r1 = "STREAMING_UPLOAD_ERROR"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x03b9
            java.lang.Integer r1 = X.AnonymousClass05K.A09
            goto L_0x02e6
        L_0x03b9:
            java.lang.String r1 = "PHASE_ONE_TRANSCODING_ERROR"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x03c5
            java.lang.Integer r1 = X.AnonymousClass05K.A0A
            goto L_0x02e6
        L_0x03c5:
            java.lang.String r1 = "UNREACHABLE_STATEMENT_ERROR"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x03d1
            java.lang.Integer r1 = X.AnonymousClass05K.A0B
            goto L_0x02e6
        L_0x03d1:
            java.lang.String r1 = "TAGGING_ERROR"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x03dd
            java.lang.Integer r1 = X.AnonymousClass05K.A0D
            goto L_0x02e6
        L_0x03dd:
            java.lang.String r1 = "ORCA_STALE_WEB_DATA"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x03e9
            java.lang.Integer r1 = X.AnonymousClass05K.A0E
            goto L_0x02e6
        L_0x03e9:
            java.lang.String r1 = "LASSO_LOGIN_UNAVAILABLE_IN_COUNTRY"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x03f5
            java.lang.Integer r1 = X.AnonymousClass05K.A0F
            goto L_0x02e6
        L_0x03f5:
            java.lang.String r1 = "LASSO_SHARE_SHEET__MESSAGE_LIMIT_EXCEEDED"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0401
            java.lang.Integer r1 = X.AnonymousClass05K.A0G
            goto L_0x02e6
        L_0x0401:
            java.lang.String r1 = "API_EC_USER_CHECKPOINT"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x040d
            java.lang.Integer r1 = X.AnonymousClass05K.A0H
            goto L_0x02e6
        L_0x040d:
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r2)
            throw r1
        L_0x0412:
            com.facebook.fbpay.hub.p2pwidget.api.FbPayP2pWidgetSendRequest r8 = new com.facebook.fbpay.hub.p2pwidget.api.FbPayP2pWidgetSendRequest
            r8.<init>(r0)
            return r8
        L_0x0418:
            com.facebook.fbpay.hub.p2pwidget.api.FbPayP2pFriend r8 = new com.facebook.fbpay.hub.p2pwidget.api.FbPayP2pFriend
            r8.<init>(r0)
            return r8
        L_0x041e:
            com.facebook.facedetection.amlfacetracker.SelfieFaceTrackerProvider r8 = new com.facebook.facedetection.amlfacetracker.SelfieFaceTrackerProvider
            r8.<init>()
            return r8
        L_0x0424:
            com.facebook.exoplayer.ipc.VideoCacheStatus r8 = new com.facebook.exoplayer.ipc.VideoCacheStatus
            r8.<init>()
            java.lang.String r1 = r0.readString()
            r8.A00 = r1
            boolean r0 = X.Pxg.A1U(r0)
            r8.A01 = r0
            return r8
        L_0x0436:
            com.facebook.exoplayer.ipc.RendererContext r8 = new com.facebook.exoplayer.ipc.RendererContext
            r8.<init>(r0)
            return r8
        L_0x043c:
            float r1 = X.Pxi.A02(r0)
            float r0 = r0.readFloat()
            com.facebook.dsp.core.OpacityData r8 = new com.facebook.dsp.core.OpacityData
            r8.<init>(r1, r0)
            return r8
        L_0x044a:
            int r1 = X.C41848B3p.A00(r0)
            int r0 = r0.readInt()
            com.facebook.dsp.core.ColorData r8 = new com.facebook.dsp.core.ColorData
            r8.<init>(r1, r0)
            return r8
        L_0x0458:
            java.lang.Class<X.RV3> r3 = X.RV3.class
            java.lang.Object r2 = X.Pxi.A0U(r0, r3)
            java.lang.Object r1 = X.Pxi.A0U(r0, r3)
            java.lang.Object r0 = X.Pxi.A0U(r0, r3)
            com.facebook.common.util.Triplet r8 = new com.facebook.common.util.Triplet
            r8.<init>(r2, r1, r0)
            return r8
        L_0x046c:
            com.facebook.common.util.Quartet r8 = new com.facebook.common.util.Quartet
            r8.<init>(r0)
            return r8
        L_0x0472:
            java.lang.Class<X.RV3> r2 = X.RV3.class
            java.lang.Object r1 = X.Pxi.A0U(r0, r2)
            java.lang.Object r0 = X.Pxi.A0U(r0, r2)
            com.facebook.common.util.ParcelablePair r8 = new com.facebook.common.util.ParcelablePair
            r8.<init>(r1, r0)
            return r8
        L_0x0482:
            java.lang.Class<X.SKK> r1 = X.SKK.class
            java.lang.Object r2 = X.Pxi.A0U(r0, r1)
            java.lang.Object r1 = X.Pxi.A0U(r0, r1)
            boolean r0 = X.Pxg.A1U(r0)
            com.facebook.common.util.Either r8 = new com.facebook.common.util.Either
            r8.<init>(r2, r1, r0)
            return r8
        L_0x0496:
            com.facebook.common.payments.paymentmethods.model.PayPalBillingAgreement r8 = new com.facebook.common.payments.paymentmethods.model.PayPalBillingAgreement
            r8.<init>(r0)
            return r8
        L_0x049c:
            com.facebook.common.payments.paymentmethods.model.NewPayPal r8 = new com.facebook.common.payments.paymentmethods.model.NewPayPal
            r8.<init>(r0)
            return r8
        L_0x04a2:
            com.facebook.common.payments.paymentmethods.model.NewCreditCard r8 = new com.facebook.common.payments.paymentmethods.model.NewCreditCard
            r8.<init>(r0)
            return r8
        L_0x04a8:
            com.facebook.common.payments.paymentmethods.model.CreditCard r8 = new com.facebook.common.payments.paymentmethods.model.CreditCard
            r8.<init>(r0)
            return r8
        L_0x04ae:
            com.facebook.common.payments.paymentmethods.model.AdditionalFields r8 = new com.facebook.common.payments.paymentmethods.model.AdditionalFields
            r8.<init>(r0)
            return r8
        L_0x04b4:
            com.facebook.common.payments.model.Address r8 = new com.facebook.common.payments.model.Address
            r8.<init>(r0)
            return r8
        L_0x04ba:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.facebook.common.math.matrix.Matrix3 r8 = new com.facebook.common.math.matrix.Matrix3
            r8.<init>(r0)
            return r8
        L_0x04c4:
            com.facebook.common.gcmcompat.PeriodicTask r8 = new com.facebook.common.gcmcompat.PeriodicTask
            r8.<init>(r0)
            long r1 = r0.readLong()
            r8.A01 = r1
            long r2 = r0.readLong()
            long r0 = r8.A01
            long r0 = java.lang.Math.min(r2, r0)
            r8.A00 = r0
            return r8
        L_0x04dc:
            com.facebook.common.gcmcompat.OneoffTask r8 = new com.facebook.common.gcmcompat.OneoffTask
            r8.<init>(r0)
            long r1 = r0.readLong()
            r8.A01 = r1
            long r0 = r0.readLong()
            r8.A00 = r0
            return r8
        L_0x04ee:
            java.lang.String r10 = r0.readString()
            java.lang.String r11 = r0.readString()
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            byte r1 = r0.readByte()
            boolean r18 = X.AnonymousClass7TF.A1P(r1)
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            java.lang.String r16 = r0.readString()
            java.lang.String r17 = r0.readString()
            byte r1 = r0.readByte()
            boolean r19 = X.AnonymousClass7TF.A1P(r1)
            java.lang.Class<com.facebook.cellinfo.parcelable.ParcelableCdmaCellInfo> r1 = com.facebook.cellinfo.parcelable.ParcelableCdmaCellInfo.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            X.XnC r9 = (X.XnC) r9
            com.facebook.cellinfo.parcelable.ParcelableGeneralCellInfo r8 = new com.facebook.cellinfo.parcelable.ParcelableGeneralCellInfo
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            return r8
        L_0x052c:
            int r11 = r0.readInt()
            int r12 = r0.readInt()
            int r13 = r0.readInt()
            java.lang.Class<java.lang.Double> r1 = java.lang.Double.class
            java.lang.Object r9 = X.Pxi.A0U(r0, r1)
            java.lang.Double r9 = (java.lang.Double) r9
            java.lang.Object r10 = X.Pxi.A0U(r0, r1)
            java.lang.Double r10 = (java.lang.Double) r10
            com.facebook.cellinfo.parcelable.ParcelableCdmaCellInfo r8 = new com.facebook.cellinfo.parcelable.ParcelableCdmaCellInfo
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x054c:
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution$License r8 = new com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution$License
            r8.<init>(r0)
            return r8
        L_0x0552:
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution$AttributedAsset r8 = new com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution$AttributedAsset
            r8.<init>(r0)
            return r8
        L_0x0558:
            com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution r8 = new com.facebook.cameracore.mediapipeline.arengineservices.interfaces.EffectAttribution
            r8.<init>((android.os.Parcel) r0)
            return r8
        L_0x055e:
            float r12 = X.Pxi.A02(r0)
            float[] r10 = r0.createFloatArray()
            float[] r11 = r0.createFloatArray()
            boolean r13 = X.C41848B3p.A1X(r0)
            java.lang.Class<com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.WarpTransitionFilter> r1 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.WarpTransitionFilter.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r9 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams) r9
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.WarpTransitionFilter r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.WarpTransitionFilter
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x057c:
            float r12 = X.Pxi.A02(r0)
            float[] r10 = r0.createFloatArray()
            float[] r11 = r0.createFloatArray()
            boolean r13 = X.C41848B3p.A1X(r0)
            java.lang.Class<com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.TransformTransitionFilter> r1 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.TransformTransitionFilter.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r9 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams) r9
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.TransformTransitionFilter r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.TransformTransitionFilter
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x059a:
            float r12 = X.Pxi.A02(r0)
            float[] r10 = r0.createFloatArray()
            float[] r11 = r0.createFloatArray()
            boolean r13 = X.C41848B3p.A1X(r0)
            java.lang.Class<com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.TintTransitionFilter> r1 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.TintTransitionFilter.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r9 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams) r9
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.TintTransitionFilter r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.TintTransitionFilter
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x05b8:
            float r12 = X.Pxi.A02(r0)
            float[] r10 = r0.createFloatArray()
            float[] r11 = r0.createFloatArray()
            boolean r13 = X.C41848B3p.A1X(r0)
            java.lang.Class<com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.SpinTransitionFilter> r1 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.SpinTransitionFilter.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r9 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams) r9
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.SpinTransitionFilter r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.SpinTransitionFilter
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x05d6:
            float r12 = X.Pxi.A02(r0)
            float[] r10 = r0.createFloatArray()
            float[] r11 = r0.createFloatArray()
            boolean r13 = X.C41848B3p.A1X(r0)
            java.lang.Class<com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.ScreenBlendWithColorFilter> r1 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.ScreenBlendWithColorFilter.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r9 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams) r9
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.ScreenBlendWithColorFilter r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.ScreenBlendWithColorFilter
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x05f4:
            java.lang.String r10 = X.C41848B3p.A1D(r0)
            float[] r11 = r0.createFloatArray()
            float[] r12 = r0.createFloatArray()
            float r13 = r0.readFloat()
            int r14 = r0.readInt()
            boolean r15 = X.C41848B3p.A1X(r0)
            java.lang.Class<com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.PanFilter> r1 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.PanFilter.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r9 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams) r9
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.PanFilter r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.PanFilter
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        L_0x061a:
            float r12 = X.Pxi.A02(r0)
            float[] r10 = r0.createFloatArray()
            float[] r11 = r0.createFloatArray()
            boolean r13 = X.C41848B3p.A1X(r0)
            java.lang.Class<com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.LinearGradientTransitionFilter> r1 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.LinearGradientTransitionFilter.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r9 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams) r9
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.LinearGradientTransitionFilter r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.LinearGradientTransitionFilter
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x0638:
            float r12 = X.Pxi.A02(r0)
            float[] r10 = r0.createFloatArray()
            float[] r11 = r0.createFloatArray()
            boolean r13 = X.C41848B3p.A1X(r0)
            java.lang.Class<com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.GlitchTransitionFilter> r1 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.GlitchTransitionFilter.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r9 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams) r9
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.GlitchTransitionFilter r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.GlitchTransitionFilter
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x0656:
            float r12 = X.Pxi.A02(r0)
            float[] r10 = r0.createFloatArray()
            float[] r11 = r0.createFloatArray()
            boolean r13 = X.C41848B3p.A1X(r0)
            java.lang.Class<com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.FlareTransitionFilter> r1 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.FlareTransitionFilter.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r9 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams) r9
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.FlareTransitionFilter r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.FlareTransitionFilter
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x0674:
            float r12 = X.Pxi.A02(r0)
            float[] r10 = r0.createFloatArray()
            float[] r11 = r0.createFloatArray()
            boolean r13 = X.C41848B3p.A1X(r0)
            java.lang.Class<com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.FadeOutTransitionFilter> r1 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.FadeOutTransitionFilter.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r9 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams) r9
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.FadeOutTransitionFilter r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.FadeOutTransitionFilter
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x0692:
            float r12 = X.Pxi.A02(r0)
            float[] r10 = r0.createFloatArray()
            float[] r11 = r0.createFloatArray()
            boolean r13 = X.C41848B3p.A1X(r0)
            java.lang.Class<com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.ChromaticAberrationTransitionFilter> r1 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.ChromaticAberrationTransitionFilter.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r9 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams) r9
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.ChromaticAberrationTransitionFilter r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.ChromaticAberrationTransitionFilter
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x06b0:
            float r12 = X.Pxi.A02(r0)
            float[] r10 = r0.createFloatArray()
            float[] r11 = r0.createFloatArray()
            boolean r13 = X.C41848B3p.A1X(r0)
            java.lang.Class<com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BrightnessTransitionFilter> r1 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BrightnessTransitionFilter.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r9 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams) r9
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BrightnessTransitionFilter r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BrightnessTransitionFilter
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x06ce:
            float r12 = X.Pxi.A02(r0)
            float[] r10 = r0.createFloatArray()
            float[] r11 = r0.createFloatArray()
            boolean r13 = X.C41848B3p.A1X(r0)
            java.lang.Class<com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BoxBlurTransitionFilter> r1 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BoxBlurTransitionFilter.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r9 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams) r9
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BoxBlurTransitionFilter r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BoxBlurTransitionFilter
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x06ec:
            float r12 = X.Pxi.A02(r0)
            float r13 = r0.readFloat()
            float r14 = r0.readFloat()
            float[] r10 = r0.createFloatArray()
            float[] r11 = r0.createFloatArray()
            boolean r15 = X.C41848B3p.A1X(r0)
            java.lang.Class<com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BlurTransitionFilter> r1 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BlurTransitionFilter.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r9 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams) r9
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BlurTransitionFilter r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BlurTransitionFilter
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        L_0x0712:
            float r12 = X.Pxi.A02(r0)
            float[] r10 = r0.createFloatArray()
            float[] r11 = r0.createFloatArray()
            boolean r13 = X.C41848B3p.A1X(r0)
            java.lang.Class<com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BasicAdjustTransitionFilter> r1 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BasicAdjustTransitionFilter.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r9 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams) r9
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BasicAdjustTransitionFilter r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.BasicAdjustTransitionFilter
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x0730:
            java.lang.String r10 = X.C41848B3p.A1D(r0)
            float[] r11 = r0.createFloatArray()
            float[] r12 = r0.createFloatArray()
            boolean r13 = X.C41848B3p.A1X(r0)
            java.lang.Class<com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapAlphaFilter> r1 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapAlphaFilter.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r9 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams) r9
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapAlphaFilter r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapAlphaFilter
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x074e:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            boolean r9 = X.C41848B3p.A1X(r0)
            boolean r10 = X.C41848B3p.A1X(r0)
            boolean r11 = X.C41848B3p.A1X(r0)
            boolean r12 = X.C41848B3p.A1X(r0)
            boolean r13 = X.C41848B3p.A1X(r0)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$TransformSteps r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$TransformSteps
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x076c:
            float r7 = X.Pxi.A02(r0)
            float r6 = r0.readFloat()
            float r5 = r0.readFloat()
            float r4 = r0.readFloat()
            float r3 = r0.readFloat()
            float r2 = r0.readFloat()
            float r1 = r0.readFloat()
            int r0 = r0.readInt()
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FullTransform
            r8.<init>()
            r8.A06 = r7
            r8.A00 = r6
            r8.A01 = r5
            r8.A02 = r4
            r8.A03 = r3
            r8.A04 = r2
            r8.A05 = r1
            r8.A07 = r0
            return r8
        L_0x07a2:
            float r2 = X.Pxi.A02(r0)
            float r1 = r0.readFloat()
            float r0 = r0.readFloat()
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FitTransformParams r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel$FitTransformParams
            r8.<init>()
            r8.A02 = r2
            r8.A00 = r1
            r8.A01 = r0
            return r8
        L_0x07ba:
            java.lang.String r10 = X.C41848B3p.A1D(r0)
            java.lang.String r11 = r0.readString()
            float[] r12 = r0.createFloatArray()
            float[] r13 = r0.createFloatArray()
            boolean r14 = X.C41848B3p.A1X(r0)
            java.lang.Class<com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ExternalRenderFilterModel> r1 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ExternalRenderFilterModel.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r9 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams) r9
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ExternalRenderFilterModel r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ExternalRenderFilterModel
            r8.<init>(r9, r10, r11, r12, r13, r14)
            return r8
        L_0x07dc:
            java.lang.String r10 = X.C41848B3p.A1D(r0)
            java.lang.String r11 = r0.readString()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0805
            r12 = 0
        L_0x07eb:
            float[] r13 = r0.createFloatArray()
            float[] r14 = r0.createFloatArray()
            boolean r15 = X.C41848B3p.A1X(r0)
            java.lang.Class<com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenGraphFilter> r1 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenGraphFilter.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r9 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams) r9
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenGraphFilter r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenGraphFilter
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        L_0x0805:
            int r8 = r0.readInt()
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>(r8)
            r7 = 0
        L_0x080f:
            if (r7 == r8) goto L_0x07eb
            java.lang.String r6 = r0.readString()
            int r5 = r0.readInt()
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>(r5)
            r3 = 0
        L_0x081f:
            if (r3 == r5) goto L_0x0831
            java.lang.String r2 = r0.readString()
            java.lang.Class<com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenGraphFilter> r1 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenGraphFilter.class
            java.lang.Object r1 = X.Pxi.A0U(r0, r1)
            r4.put(r2, r1)
            int r3 = r3 + 1
            goto L_0x081f
        L_0x0831:
            r12.put(r6, r4)
            int r7 = r7 + 1
            goto L_0x080f
        L_0x0837:
            java.lang.String r10 = X.C41848B3p.A1D(r0)
            java.lang.String r11 = r0.readString()
            int r1 = r0.readInt()
            if (r1 != 0) goto L_0x0860
            r12 = 0
        L_0x0846:
            float[] r13 = r0.createFloatArray()
            float[] r14 = r0.createFloatArray()
            boolean r15 = X.C41848B3p.A1X(r0)
            java.lang.Class<com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenFilter> r1 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenFilter.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams r9 = (com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams) r9
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenFilter r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenFilter
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        L_0x0860:
            int r4 = r0.readInt()
            java.util.HashMap r12 = new java.util.HashMap
            r12.<init>(r4)
            r3 = 0
        L_0x086a:
            if (r3 == r4) goto L_0x0846
            java.lang.String r2 = r0.readString()
            java.lang.Class<com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenFilter> r1 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.DataDrivenFilter.class
            java.lang.Object r1 = X.Pxi.A0U(r0, r1)
            r12.put(r2, r1)
            int r3 = r3 + 1
            goto L_0x086a
        L_0x087c:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            android.os.Parcelable$Creator r1 = com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.detector.DefectDetectorFilter.CREATOR
            java.lang.String r0 = r0.readString()
            com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.detector.DefectDetectorFilter r8 = new com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.detector.DefectDetectorFilter
            r8.<init>(r0)
            return r8
        L_0x088c:
            com.facebook.cameracore.ardelivery.model.ARRequestEffect r8 = new com.facebook.cameracore.ardelivery.model.ARRequestEffect
            r8.<init>(r0)
            return r8
        L_0x0892:
            com.facebook.cameracore.ardelivery.model.AREffectAsyncAsset r8 = new com.facebook.cameracore.ardelivery.model.AREffectAsyncAsset
            r8.<init>(r0)
            return r8
        L_0x0898:
            com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCallData r8 = new com.facebook.businessextension.jscalls.SaveAutofillDataJSBridgeCallData
            r8.<init>((android.os.Parcel) r0)
            return r8
        L_0x089e:
            com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCallData r8 = new com.facebook.businessextension.jscalls.RequestAutofillJSBridgeCallData
            r8.<init>(r0)
            return r8
        L_0x08a4:
            com.facebook.businessextension.jscalls.InitJSBridgeCallData r8 = new com.facebook.businessextension.jscalls.InitJSBridgeCallData
            r8.<init>(r0)
            return r8
        L_0x08aa:
            X.Pxi.A11(r0)
            com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig$Peek r8 = com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig.Peek.A00
            return r8
        L_0x08b0:
            X.Pxi.A11(r0)
            com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig$HalfSheet r8 = com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig.HalfSheet.A00
            return r8
        L_0x08b6:
            X.Pxi.A11(r0)
            com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig$FullSheet r8 = com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig.FullSheet.A00
            return r8
        L_0x08bc:
            X.Pxi.A11(r0)
            com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig$FullScreen r8 = com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig.FullScreen.A00
            return r8
        L_0x08c2:
            com.facebook.browser.lite.ipc.PrefetchCacheEntry r8 = new com.facebook.browser.lite.ipc.PrefetchCacheEntry
            r8.<init>()
            java.lang.String r1 = r0.readString()
            r8.A03 = r1
            java.lang.String r1 = r0.readString()
            r8.A01 = r1
            java.lang.String r1 = r0.readString()
            r8.A02 = r1
            java.lang.String r0 = r0.readString()
            r8.A00 = r0
            return r8
        L_0x08e0:
            com.facebook.browser.lite.ipc.IABExtensionStatesHandlerPayload r8 = new com.facebook.browser.lite.ipc.IABExtensionStatesHandlerPayload
            r8.<init>()
            int r6 = r0.dataPosition()
            int r5 = r0.readInt()
            r1 = 4
            java.lang.String r4 = "Overflow in the size of parcelable"
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r5 < r1) goto L_0x0956
            int r1 = r0.dataPosition()     // Catch:{ all -> 0x095e }
            int r1 = r1 - r6
            if (r1 < r5) goto L_0x0905
            int r3 = r3 - r5
            if (r6 <= r3) goto L_0x09c8
            android.os.BadParcelableException r1 = new android.os.BadParcelableException
            r1.<init>(r4)
            throw r1
        L_0x0905:
            java.lang.String r1 = r0.readString()     // Catch:{ all -> 0x095e }
            r8.A01 = r1     // Catch:{ all -> 0x095e }
            int r1 = r0.dataPosition()     // Catch:{ all -> 0x095e }
            int r1 = r1 - r6
            if (r1 < r5) goto L_0x091b
            int r3 = r3 - r5
            if (r6 <= r3) goto L_0x09c8
            android.os.BadParcelableException r1 = new android.os.BadParcelableException
            r1.<init>(r4)
            throw r1
        L_0x091b:
            java.lang.String r1 = r0.readString()     // Catch:{ all -> 0x095e }
            r8.A02 = r1     // Catch:{ all -> 0x095e }
            int r1 = r0.dataPosition()     // Catch:{ all -> 0x095e }
            int r1 = r1 - r6
            if (r1 < r5) goto L_0x0931
            int r3 = r3 - r5
            if (r6 <= r3) goto L_0x09c8
            android.os.BadParcelableException r1 = new android.os.BadParcelableException
            r1.<init>(r4)
            throw r1
        L_0x0931:
            java.lang.String r1 = r0.readString()     // Catch:{ all -> 0x095e }
            r8.A00 = r1     // Catch:{ all -> 0x095e }
            int r1 = r0.dataPosition()     // Catch:{ all -> 0x095e }
            int r1 = r1 - r6
            if (r1 < r5) goto L_0x0947
            int r3 = r3 - r5
            if (r6 <= r3) goto L_0x09c8
            android.os.BadParcelableException r1 = new android.os.BadParcelableException
            r1.<init>(r4)
            throw r1
        L_0x0947:
            java.util.ArrayList r1 = r0.createStringArrayList()     // Catch:{ all -> 0x095e }
            r8.A03 = r1     // Catch:{ all -> 0x095e }
            int r3 = r3 - r5
            if (r6 <= r3) goto L_0x09c8
            android.os.BadParcelableException r1 = new android.os.BadParcelableException
            r1.<init>(r4)
            throw r1
        L_0x0956:
            java.lang.String r2 = "Parcelable too small"
            android.os.BadParcelableException r1 = new android.os.BadParcelableException     // Catch:{ all -> 0x095e }
            r1.<init>(r2)     // Catch:{ all -> 0x095e }
            throw r1     // Catch:{ all -> 0x095e }
        L_0x095e:
            r1 = move-exception
            int r3 = r3 - r5
            if (r6 <= r3) goto L_0x09df
            android.os.BadParcelableException r1 = new android.os.BadParcelableException
            r1.<init>(r4)
            throw r1
        L_0x0968:
            com.facebook.browser.lite.ipc.IABExtensionEventHandlerPayload r8 = new com.facebook.browser.lite.ipc.IABExtensionEventHandlerPayload
            r8.<init>()
            int r6 = r0.dataPosition()
            int r5 = r0.readInt()
            r1 = 4
            java.lang.String r4 = "Overflow in the size of parcelable"
            r3 = 2147483647(0x7fffffff, float:NaN)
            if (r5 < r1) goto L_0x09cd
            int r1 = r0.dataPosition()     // Catch:{ all -> 0x09d5 }
            int r1 = r1 - r6
            if (r1 < r5) goto L_0x098d
            int r3 = r3 - r5
            if (r6 <= r3) goto L_0x09c8
            android.os.BadParcelableException r1 = new android.os.BadParcelableException
            r1.<init>(r4)
            throw r1
        L_0x098d:
            java.lang.String r1 = r0.readString()     // Catch:{ all -> 0x09d5 }
            r8.A00 = r1     // Catch:{ all -> 0x09d5 }
            int r1 = r0.dataPosition()     // Catch:{ all -> 0x09d5 }
            int r1 = r1 - r6
            if (r1 < r5) goto L_0x09a3
            int r3 = r3 - r5
            if (r6 <= r3) goto L_0x09c8
            android.os.BadParcelableException r1 = new android.os.BadParcelableException
            r1.<init>(r4)
            throw r1
        L_0x09a3:
            java.lang.String r1 = r0.readString()     // Catch:{ all -> 0x09d5 }
            r8.A01 = r1     // Catch:{ all -> 0x09d5 }
            int r1 = r0.dataPosition()     // Catch:{ all -> 0x09d5 }
            int r1 = r1 - r6
            if (r1 < r5) goto L_0x09b9
            int r3 = r3 - r5
            if (r6 <= r3) goto L_0x09c8
            android.os.BadParcelableException r1 = new android.os.BadParcelableException
            r1.<init>(r4)
            throw r1
        L_0x09b9:
            java.util.ArrayList r1 = r0.createStringArrayList()     // Catch:{ all -> 0x09d5 }
            r8.A02 = r1     // Catch:{ all -> 0x09d5 }
            int r3 = r3 - r5
            if (r6 <= r3) goto L_0x09c8
            android.os.BadParcelableException r1 = new android.os.BadParcelableException
            r1.<init>(r4)
            throw r1
        L_0x09c8:
            int r6 = r6 + r5
            r0.setDataPosition(r6)
            return r8
        L_0x09cd:
            java.lang.String r2 = "Parcelable too small"
            android.os.BadParcelableException r1 = new android.os.BadParcelableException     // Catch:{ all -> 0x09d5 }
            r1.<init>(r2)     // Catch:{ all -> 0x09d5 }
            throw r1     // Catch:{ all -> 0x09d5 }
        L_0x09d5:
            r1 = move-exception
            int r3 = r3 - r5
            if (r6 <= r3) goto L_0x09df
            android.os.BadParcelableException r1 = new android.os.BadParcelableException
            r1.<init>(r4)
            throw r1
        L_0x09df:
            int r6 = r6 + r5
            r0.setDataPosition(r6)
            throw r1
        L_0x09e4:
            com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall r8 = new com.facebook.browser.lite.ipc.BrowserLiteJSBridgeCall
            r8.<init>(r0)
            return r8
        L_0x09ea:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.facebook.browser.lite.extensions.whatsapp.CTWABrowserCTAExtensionModel r8 = new com.facebook.browser.lite.extensions.whatsapp.CTWABrowserCTAExtensionModel
            r8.<init>(r0)
            return r8
        L_0x09f4:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.facebook.browser.lite.extensions.igleadformextension.IGLeadFormExtensionModel r8 = new com.facebook.browser.lite.extensions.igleadformextension.IGLeadFormExtensionModel
            r8.<init>(r0)
            return r8
        L_0x09fe:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            com.facebook.browser.lite.extensions.igcallextension.IGCallExtensionModel r8 = new com.facebook.browser.lite.extensions.igcallextension.IGCallExtensionModel
            r8.<init>(r0)
            return r8
        L_0x0a08:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            int r1 = r0.readInt()
            int r0 = r0.readInt()
            com.facebook.browser.lite.extensions.commercecheckout.models.DisclaimerText r8 = new com.facebook.browser.lite.extensions.commercecheckout.models.DisclaimerText
            r8.<init>(r2, r1, r0)
            return r8
        L_0x0a1a:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.lang.String r1 = "CHECKOUT_LOADING_SCREEN_IMPRESSION"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0a4c
            java.lang.Integer r11 = X.AnonymousClass05K.A00
        L_0x0a28:
            java.lang.Class<com.facebook.browser.lite.extensions.commercecheckout.models.CommerceMetaCheckoutLogEventRequest> r1 = com.facebook.browser.lite.extensions.commercecheckout.models.CommerceMetaCheckoutLogEventRequest.class
            android.os.Parcelable r9 = X.C41847B3o.A03(r0, r1)
            com.facebook.iabadscontext.IABAdsContext r9 = (com.facebook.iabadscontext.IABAdsContext) r9
            java.lang.String r12 = r0.readString()
            java.lang.String r13 = r0.readString()
            android.os.Parcelable r10 = X.C41847B3o.A03(r0, r1)
            com.facebook.iabadscontext.MetaCheckoutExperienceType r10 = (com.facebook.iabadscontext.MetaCheckoutExperienceType) r10
            java.lang.String r14 = r0.readString()
            java.lang.String r15 = r0.readString()
            com.facebook.browser.lite.extensions.commercecheckout.models.CommerceMetaCheckoutLogEventRequest r8 = new com.facebook.browser.lite.extensions.commercecheckout.models.CommerceMetaCheckoutLogEventRequest
            r8.<init>(r9, r10, r11, r12, r13, r14, r15)
            return r8
        L_0x0a4c:
            java.lang.String r1 = "ELIGIBILITY_SUCCESS"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0a57
            java.lang.Integer r11 = X.AnonymousClass05K.A01
            goto L_0x0a28
        L_0x0a57:
            java.lang.String r1 = "DISCLAIMER_IMPRESSION"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0a62
            java.lang.Integer r11 = X.AnonymousClass05K.A0C
            goto L_0x0a28
        L_0x0a62:
            java.lang.String r1 = "OPT_OUT"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0a6d
            java.lang.Integer r11 = X.AnonymousClass05K.A0N
            goto L_0x0a28
        L_0x0a6d:
            java.lang.String r1 = "URL_INTERCEPT_INIT"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0a78
            java.lang.Integer r11 = X.AnonymousClass05K.A0Y
            goto L_0x0a28
        L_0x0a78:
            java.lang.String r1 = "URL_INTERCEPT_SUCCESS"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0a83
            java.lang.Integer r11 = X.AnonymousClass05K.A0j
            goto L_0x0a28
        L_0x0a83:
            java.lang.String r1 = "URL_INTERCEPT_FAIL"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0a8e
            java.lang.Integer r11 = X.AnonymousClass05K.A0u
            goto L_0x0a28
        L_0x0a8e:
            java.lang.String r1 = "UNKNOWN"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0a99
            java.lang.Integer r11 = X.AnonymousClass05K.A15
            goto L_0x0a28
        L_0x0a99:
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r2)
            throw r1
        L_0x0a9e:
            java.lang.String r2 = X.C41848B3p.A1D(r0)
            java.lang.String r1 = "LOAD_URL"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0ab6
            java.lang.Integer r1 = X.AnonymousClass05K.A00
        L_0x0aac:
            java.lang.String r0 = r0.readString()
            com.facebook.browser.lite.extensions.commercecheckout.constant.MetaCheckoutRequest r8 = new com.facebook.browser.lite.extensions.commercecheckout.constant.MetaCheckoutRequest
            r8.<init>(r1, r0)
            return r8
        L_0x0ab6:
            java.lang.String r1 = "IGNORE_META_CHECKOUT"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0ac1
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            goto L_0x0aac
        L_0x0ac1:
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r2)
            throw r1
        L_0x0ac6:
            int r11 = X.C41848B3p.A00(r0)
            boolean r14 = X.C41848B3p.A1X(r0)
            int r12 = r0.readInt()
            boolean r15 = X.C41848B3p.A1X(r0)
            boolean r16 = X.C41848B3p.A1X(r0)
            boolean r17 = X.C41848B3p.A1X(r0)
            java.lang.String r9 = r0.readString()
            java.lang.String r10 = r0.readString()
            int r13 = r0.readInt()
            com.facebook.browser.lite.extensions.autofill.model.AutofillSettings r8 = new com.facebook.browser.lite.extensions.autofill.model.AutofillSettings
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            return r8
        L_0x0af0:
            com.facebook.browser.lite.extensions.autofill.model.AutofillData r8 = new com.facebook.browser.lite.extensions.autofill.model.AutofillData
            r8.<init>((android.os.Parcel) r0)
            return r8
        L_0x0af6:
            long r12 = r0.readLong()
            long r14 = r0.readLong()
            java.lang.String r9 = r0.readString()
            int r11 = r0.readInt()
            java.lang.String r10 = r0.readString()
            com.facebook.blescan.parcelable.ParcelableBleScanResult r8 = new com.facebook.blescan.parcelable.ParcelableBleScanResult
            r8.<init>(r9, r10, r11, r12, r14)
            return r8
        L_0x0b10:
            com.facebook.avatar.autogen.flow.AESelfieCaptureConfig r8 = new com.facebook.avatar.autogen.flow.AESelfieCaptureConfig
            r8.<init>(r0)
            return r8
        L_0x0b16:
            r1 = 0
            X.0qQ.A0B(r0, r1)
            java.lang.Class<com.facebook.avatar.autogen.download.IgModelDownloader> r1 = com.facebook.avatar.autogen.download.IgModelDownloader.class
            java.lang.Object r0 = X.Pxi.A0U(r0, r1)
            com.instagram.common.session.UserSession r0 = (com.instagram.common.session.UserSession) r0
            com.facebook.avatar.autogen.download.IgModelDownloader r8 = new com.facebook.avatar.autogen.download.IgModelDownloader
            r8.<init>(r0)
            return r8
        L_0x0b28:
            com.facebook.auth.viewercontext.ViewerContext r8 = new com.facebook.auth.viewercontext.ViewerContext
            r8.<init>(r0)
            return r8
        L_0x0b2e:
            com.facebook.android.maps.model.LatLngBounds r8 = new com.facebook.android.maps.model.LatLngBounds
            r8.<init>(r0)
            return r8
        L_0x0b34:
            com.facebook.android.maps.model.LatLng r8 = new com.facebook.android.maps.model.LatLng
            r8.<init>(r0)
            return r8
        L_0x0b3a:
            com.facebook.android.maps.model.CameraPosition r8 = new com.facebook.android.maps.model.CameraPosition
            r8.<init>(r0)
            return r8
        L_0x0b40:
            com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestUnknownCall r8 = new com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestUnknownCall
            r8.<init>(r0)
            java.lang.String r0 = r0.readString()
            r8.A00 = r0
            return r8
        L_0x0b4c:
            com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestSuccessCall r8 = new com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestSuccessCall
            r8.<init>(r0)
            java.lang.String r0 = r0.readString()
            r8.A00 = r0
            return r8
        L_0x0b58:
            com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestErrorCall r8 = new com.facebook.android.instantexperiences.payment.chargerequest.PaymentsChargeRequestErrorCall
            r8.<init>(r0)
            java.lang.String r0 = r0.readString()
            r8.A00 = r0
            return r8
        L_0x0b64:
            com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCallResult r8 = new com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCallResult
            r8.<init>((android.os.Parcel) r0)
            return r8
        L_0x0b6a:
            com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCall r8 = new com.facebook.android.instantexperiences.payment.PaymentsCheckoutJSBridgeCall
            r8.<init>(r0)
            return r8
        L_0x0b70:
            com.facebook.android.instantexperiences.payment.CanShowPaymentModuleJSBridgeCallResult r8 = new com.facebook.android.instantexperiences.payment.CanShowPaymentModuleJSBridgeCallResult
            r8.<init>((android.os.Parcel) r0)
            return r8
        L_0x0b76:
            com.facebook.android.instantexperiences.payment.CanShowPaymentModuleJSBridgeCall r8 = new com.facebook.android.instantexperiences.payment.CanShowPaymentModuleJSBridgeCall
            r8.<init>(r0)
            return r8
        L_0x0b7c:
            boolean r0 = X.Pxg.A1U(r0)
            com.facebook.common.parcels.ParcelableBoolean r8 = new com.facebook.common.parcels.ParcelableBoolean
            r8.<init>(r0)
            return r8
        L_0x0b86:
            int r2 = r0.readInt()     // Catch:{ Exception -> 0x0b99 }
            int r1 = r0.readInt()     // Catch:{ Exception -> 0x0b99 }
            byte[] r1 = new byte[r1]     // Catch:{ Exception -> 0x0b99 }
            r0.readByteArray(r1)     // Catch:{ Exception -> 0x0b99 }
            com.facebook.graphql.modelutil.parcel.TreeParcelable r8 = new com.facebook.graphql.modelutil.parcel.TreeParcelable     // Catch:{ Exception -> 0x0b99 }
            r8.<init>(r1, r2, r3)     // Catch:{ Exception -> 0x0b99 }
            return r8
        L_0x0b99:
            r0 = move-exception
            r0.printStackTrace()
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.SWS.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new CanShowPaymentModuleJSBridgeCall[i];
            case 1:
                return new CanShowPaymentModuleJSBridgeCallResult[i];
            case 2:
                return new PaymentsCheckoutJSBridgeCall[i];
            case 3:
                return new PaymentsCheckoutJSBridgeCallResult[i];
            case 4:
                return new PaymentsChargeRequestErrorCall[i];
            case 5:
                return new PaymentsChargeRequestSuccessCall[i];
            case 6:
                return new PaymentsChargeRequestUnknownCall[i];
            case 7:
                return new CameraPosition[i];
            case 8:
                return new LatLng[i];
            case 9:
                return new LatLngBounds[i];
            case 10:
                return new ViewerContext[i];
            case 11:
                return new IgModelDownloader[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new AESelfieCaptureConfig[i];
            case 13:
                return new ParcelableBleScanResult[i];
            case 14:
                return new BrowserLiteJSBridgeProxy[i];
            case 15:
                return new AutofillData[i];
            case 16:
                return new AutofillSettings[i];
            case 17:
                return new MetaCheckoutRequest[i];
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return new CommerceMetaCheckoutLogEventRequest[i];
            case 19:
                return new DisclaimerText[i];
            case 20:
                return new IGCallExtensionModel[i];
            case 21:
                return new IGLeadFormExtensionModel[i];
            case 22:
                return new CTWABrowserCTAExtensionModel[i];
            case 23:
                return new BrowserLiteJSBridgeCall[i];
            case 24:
                return new IABExtensionEventHandlerPayload[i];
            case 25:
                return new IABExtensionStatesHandlerPayload[i];
            case 26:
                return new PrefetchCacheEntry[i];
            case 27:
                return new IABViewModeLaunchConfig.FullScreen[i];
            case 28:
                return new IABViewModeLaunchConfig.FullSheet[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new IABViewModeLaunchConfig.HalfSheet[i];
            case 30:
                return new IABViewModeLaunchConfig.Peek[i];
            case 31:
                return new InitJSBridgeCallData[i];
            case 32:
                return new RequestAutofillJSBridgeCallData[i];
            case 33:
                return new SaveAutofillDataJSBridgeCallData[i];
            case 34:
                return new AREffectAsyncAsset[i];
            case 35:
                return new ARRequestEffect[i];
            case 36:
                return new DefectDetectorFilter[i];
            case 37:
                return new DataDrivenFilter[i];
            case 38:
                return new DataDrivenGraphFilter[i];
            case 39:
                return new ExternalRenderFilterModel[i];
            case 40:
                return new SurfaceCropFilterModel.FitTransformParams[i];
            case Seq.NULL_REFNUM /*41*/:
                return new SurfaceCropFilterModel.FullTransform[i];
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new SurfaceCropFilterModel.TransformSteps[i];
            case 43:
                return new GainmapAlphaFilter[i];
            case 44:
                return new BasicAdjustTransitionFilter[i];
            case 45:
                return new BlurTransitionFilter[i];
            case 46:
                return new BoxBlurTransitionFilter[i];
            case 47:
                return new BrightnessTransitionFilter[i];
            case 48:
                return new ChromaticAberrationTransitionFilter[i];
            case 49:
                return new FadeOutTransitionFilter[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new FlareTransitionFilter[i];
            case 51:
                return new GlitchTransitionFilter[i];
            case 52:
                return new LinearGradientTransitionFilter[i];
            case 53:
                return new PanFilter[i];
            case 54:
                return new ScreenBlendWithColorFilter[i];
            case 55:
                return new SpinTransitionFilter[i];
            case 56:
                return new TintTransitionFilter[i];
            case 57:
                return new TransformTransitionFilter[i];
            case 58:
                return new WarpTransitionFilter[i];
            case 59:
                return new EffectAttribution[i];
            case 60:
                return new EffectAttribution.AttributedAsset[i];
            case 61:
                return new EffectAttribution.License[i];
            case 62:
                return new ParcelableCdmaCellInfo[i];
            case 63:
                return new ParcelableGeneralCellInfo[i];
            case 64:
                return new OneoffTask[i];
            case 65:
                return new PeriodicTask[i];
            case 66:
                return new Matrix3[i];
            case 67:
                return new ParcelableBoolean[i];
            case 68:
                return new Address[i];
            case 69:
                return new AdditionalFields[i];
            case 70:
                return new CreditCard[i];
            case 71:
                return new NewCreditCard[i];
            case 72:
                return new NewPayPal[i];
            case 73:
                return new PayPalBillingAgreement[i];
            case 74:
                return new Either[i];
            case 75:
                return new ParcelablePair[i];
            case 76:
                return new Quartet[i];
            case 77:
                return new Triplet[i];
            case 78:
                return new ColorData[i];
            case 79:
                return new OpacityData[i];
            case 80:
                return new RendererContext[i];
            case 81:
                return new VideoCacheStatus[i];
            case 82:
                return new VideoPlayerServiceEvent[i];
            case 83:
                return new SelfieFaceTrackerProvider[i];
            case 84:
                return new FbPayP2pFriend[i];
            case 85:
                return new FbPayP2pWidgetSendRequest[i];
            case 86:
                return new OperationResult[i];
            case 87:
                return new GraphQLError[i];
            case 88:
                return new ModelParcelHelper$LazyHolder[i];
            case 89:
                return new TreeParcelable[i];
            case 90:
                return new RequestPriority[i];
            case 91:
                return new ApiErrorResult[i];
            case 92:
                return new Availability[i];
            case 93:
                return new CheckoutSetupPayload[i];
            case 94:
                return new DisclaimerBodyUrlRanges[i];
            case 95:
                return new com.facebook.iabadscontext.DisclaimerText[i];
            case 96:
                return new IABAdsBwIntegrationExtension[i];
            case 97:
                return new IABAdsContext[i];
            case 98:
                return new IABAdsMetaCheckoutDataExtension[i];
            default:
                return new IABAdsMetaCheckoutPaymentsSDKDataExtension[i];
        }
    }
}
