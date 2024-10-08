package X;

import android.accounts.Account;
import android.app.PendingIntent;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.android.maps.StaticMapView;
import com.facebook.cameracore.ardelivery.model.ARCapabilityMinVersionModeling;
import com.facebook.cameracore.ardelivery.model.ARRequestAsset;
import com.facebook.cameracore.ardelivery.model.SparkVisionCapability;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.TypedParameterMap;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.ValueMapFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterGroup;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.GradientTransformFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SplitScreenFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.SurfaceCropFilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.gainmap.GainmapFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.tiltshift.TiltShiftOverlayFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.transition.ZoomTransitionFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.CameraConfig;
import com.facebook.cameracore.mediapipeline.dataproviders.worldtracker.interfaces.DeviceConfig;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.ContextChain;
import com.facebook.common.locale.Country;
import com.facebook.common.math.matrix.Matrix4;
import com.facebook.notifications.constants.push.NotificationType;
import com.facebook.rti.mqtt.protocol.messages.SubscribeTopic;
import com.facebook.video.heroplayer.ipc.AudioFocusLossSettings;
import com.facebook.video.heroplayer.ipc.HeroScrollSetting;
import com.facebook.video.heroplayer.ipc.HttpTransferRequestedEvent;
import com.facebook.video.heroplayer.ipc.SubtitleConfiguration;
import com.facebook.xapp.messaging.capability.vector.Capabilities;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.video.ColorInfo;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.zzk;
import com.instagram.accountlinking.model.AccountFamily;
import com.instagram.analytics.ppr.loggingdata.PPRLoggingData;
import com.instagram.api.schemas.ACRType;
import com.instagram.api.schemas.AFI_TYPE;
import com.instagram.api.schemas.ActionButtonPartnerType;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.AdMetadataType;
import com.instagram.api.schemas.AppColorMode;
import com.instagram.api.schemas.AppstoreMetadataDictImpl;
import com.instagram.api.schemas.AttributionUserImpl;
import com.instagram.api.schemas.AudienceGroup;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.api.schemas.AudioMetadataLabels;
import com.instagram.api.schemas.AudioMutingInfo;
import com.instagram.api.schemas.AvatarCoinFlipBackgroundOptionResponse;
import com.instagram.api.schemas.AvatarStatusImpl;
import com.instagram.api.schemas.BirthdayVisibilityForViewer;
import com.instagram.api.schemas.BizUserInboxState;
import com.instagram.api.schemas.BrandSafetyContentBlocklistBitmapQLObjImpl;
import com.instagram.api.schemas.BrandedContentAdsPaidPartnershipLabelRemovalOption;
import com.instagram.api.schemas.BrandedContentGatingInfo;
import com.instagram.api.schemas.CameraTool;
import com.instagram.api.schemas.CanUseCreatorMonetizationProduct;
import com.instagram.api.schemas.CarouselRenderingType;
import com.instagram.api.schemas.CheckoutStyle;
import com.instagram.api.schemas.ClientDisplayMethod;
import com.instagram.api.schemas.ClipsCameraCommandAction;
import com.instagram.api.schemas.ClipsCreationEntryPoint;
import com.instagram.api.schemas.ClipsIFUType;
import com.instagram.api.schemas.ClipsMashupFollowButtonInfoImpl;
import com.instagram.api.schemas.ClipsMashupType;
import com.instagram.api.schemas.ClipsPrefetchTriggerType;
import com.instagram.api.schemas.ClipsSpecialResponseType;
import com.instagram.api.schemas.ClipsTextAlignment;
import com.instagram.api.schemas.ClipsTextEmphasisMode;
import com.instagram.api.schemas.ClipsTextFormatType;
import com.instagram.api.schemas.CollabFollowButtonInfoImpl;
import com.instagram.api.schemas.CollectionMediaRole;
import com.instagram.api.schemas.CommentAudienceControlType;
import com.instagram.api.schemas.CommentGiphyMediaImages;
import com.instagram.api.schemas.CommentGiphyMediaInfo;
import com.instagram.api.schemas.CommentRestrictStatus;
import com.instagram.api.schemas.CommerceReviewStatisticsDict;
import com.instagram.api.schemas.ConfirmationStyle;
import com.instagram.api.schemas.ConfirmationTitleStyle;
import com.instagram.api.schemas.ContextualHighlightType;
import com.instagram.api.schemas.CornerStyle;
import com.instagram.api.schemas.CreateModeType;
import com.instagram.api.schemas.CreationToolEnum;
import com.instagram.api.schemas.CreatorSegmentation;
import com.instagram.api.schemas.DemarcatorActionType;
import com.instagram.api.schemas.DemarcatorStyleEnum;
import com.instagram.api.schemas.DirectAudioFallbackUrlImpl;
import com.instagram.api.schemas.DirectMediaFallbackUrl;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.api.schemas.ElectionAddYoursInfoDict;
import com.instagram.api.schemas.FBBioLinkSocialContextType;
import com.instagram.api.schemas.FanClubFanConsiderationPageFeatureEligibilityResponseImpl;
import com.instagram.api.schemas.MusicMuteAudioReason;
import com.instagram.api.schemas.ProfilePicture;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;
import go.Seq;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import org.webrtc.EglBase14Impl;

/* renamed from: X.9Hw  reason: invalid class name and case insensitive filesystem */
public final class C376409Hw implements Parcelable.Creator {
    public final int A00;

    public C376409Hw(int i) {
        this.A00 = i;
    }

    /* JADX WARNING: type inference failed for: r8v3, types: [androidx.recyclerview.widget.LinearLayoutManager$SavedState, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v7, types: [com.facebook.cameracore.ardelivery.model.SparkVisionCapability, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r8v44, types: [java.lang.Object, com.google.android.gms.common.internal.zzk] */
    /* JADX WARNING: type inference failed for: r8v51, types: [java.lang.Object, com.instagram.accountlinking.model.AccountFamily] */
    public final /* bridge */ /* synthetic */ Object createFromParcel(Parcel parcel) {
        Float valueOf;
        Integer valueOf2;
        Boolean valueOf3;
        ArrayList arrayList;
        HashMap hashMap;
        ArrayList arrayList2;
        Boolean valueOf4;
        Boolean valueOf5;
        Boolean valueOf6;
        Float valueOf7;
        ArrayList arrayList3;
        Boolean valueOf8;
        Parcel parcel2 = parcel;
        switch (this.A00) {
            case 0:
                return new ParcelableSnapshotMutableFloatState(parcel2.readFloat());
            case 1:
                return new ParcelableSnapshotMutableIntState(parcel2.readInt());
            case 2:
                return new ParcelableSnapshotMutableLongState(parcel2.readLong());
            case 3:
                ? obj = new Object();
                obj.A01 = parcel2.readInt();
                obj.A00 = parcel2.readInt();
                int readInt = parcel2.readInt();
                boolean z = true;
                if (readInt != 1) {
                    z = false;
                }
                obj.A02 = z;
                return obj;
            case 4:
                StaticMapView.StaticMapOptions staticMapOptions = new StaticMapView.StaticMapOptions(parcel2.readString());
                staticMapOptions.A04 = parcel2.readString();
                staticMapOptions.A0B = parcel2.readString();
                staticMapOptions.A02 = parcel2.readString();
                staticMapOptions.A0A = parcel2.readString();
                staticMapOptions.A03 = parcel2.readString();
                staticMapOptions.A05 = parcel2.readString();
                staticMapOptions.A06 = parcel2.readString();
                staticMapOptions.A07 = parcel2.readString();
                staticMapOptions.A00 = parcel2.readFloat();
                staticMapOptions.A01 = parcel2.readFloat();
                ArrayList arrayList4 = new ArrayList();
                staticMapOptions.A0C = arrayList4;
                parcel2.readStringList(arrayList4);
                staticMapOptions.A09 = parcel2.readString();
                return staticMapOptions;
            case 5:
                return new ARCapabilityMinVersionModeling(parcel2);
            case 6:
                return new ARRequestAsset(parcel2);
            case 7:
                ? obj2 = new Object();
                obj2.A00 = null;
                obj2.A00 = (List) parcel2.readValue(List.class.getClassLoader());
                return obj2;
            case 8:
                0qQ.A0B(parcel2, 0);
                int readInt2 = parcel2.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(readInt2);
                for (int i = 0; i != readInt2; i++) {
                    linkedHashMap.put(parcel2.readString(), Float.valueOf(parcel2.readFloat()));
                }
                int readInt3 = parcel2.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt3);
                for (int i2 = 0; i2 != readInt3; i2++) {
                    linkedHashMap2.put(parcel2.readString(), parcel2.createFloatArray());
                }
                int readInt4 = parcel2.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(readInt4);
                for (int i3 = 0; i3 != readInt4; i3++) {
                    linkedHashMap3.put(parcel2.readString(), Integer.valueOf(parcel2.readInt()));
                }
                int readInt5 = parcel2.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(readInt5);
                for (int i4 = 0; i4 != readInt5; i4++) {
                    String readString = parcel2.readString();
                    boolean z2 = false;
                    if (parcel2.readInt() != 0) {
                        z2 = true;
                    }
                    linkedHashMap4.put(readString, Boolean.valueOf(z2));
                }
                int readInt6 = parcel2.readInt();
                LinkedHashMap linkedHashMap5 = new LinkedHashMap(readInt6);
                for (int i5 = 0; i5 != readInt6; i5++) {
                    linkedHashMap5.put(parcel2.readString(), parcel2.readString());
                }
                int readInt7 = parcel2.readInt();
                LinkedHashMap linkedHashMap6 = new LinkedHashMap(readInt7);
                for (int i6 = 0; i6 != readInt7; i6++) {
                    linkedHashMap6.put(parcel2.readString(), parcel2.readString());
                }
                int readInt8 = parcel2.readInt();
                LinkedHashMap linkedHashMap7 = new LinkedHashMap(readInt8);
                for (int i7 = 0; i7 != readInt8; i7++) {
                    linkedHashMap7.put(parcel2.readString(), parcel2.readString());
                }
                return new TypedParameterMap(linkedHashMap, linkedHashMap2, linkedHashMap3, linkedHashMap4, linkedHashMap5, linkedHashMap6, linkedHashMap7);
            case 9:
                0qQ.A0B(parcel2, 0);
                String readString2 = parcel2.readString();
                float[] createFloatArray = parcel2.createFloatArray();
                float[] createFloatArray2 = parcel2.createFloatArray();
                boolean z3 = false;
                if (parcel2.readInt() != 0) {
                    z3 = true;
                }
                return new ValueMapFilterModel((TypedParameterMap) TypedParameterMap.CREATOR.createFromParcel(parcel2), (TransformMatrixParams) parcel2.readParcelable(ValueMapFilterModel.class.getClassLoader()), readString2, createFloatArray, createFloatArray2, z3);
            case 10:
                0qQ.A0B(parcel2, 0);
                String readString3 = parcel2.readString();
                float[] createFloatArray3 = parcel2.createFloatArray();
                float[] createFloatArray4 = parcel2.createFloatArray();
                float readFloat = parcel2.readFloat();
                boolean z4 = false;
                if (parcel2.readInt() != 0) {
                    z4 = true;
                }
                boolean z5 = false;
                if (parcel2.readInt() != 0) {
                    z5 = true;
                }
                boolean z6 = false;
                if (parcel2.readInt() != 0) {
                    z6 = true;
                }
                return new ColorFilter((TransformMatrixParams) parcel2.readParcelable(ColorFilter.class.getClassLoader()), readString3, createFloatArray3, createFloatArray4, readFloat, z4, z5, z6);
            case 11:
                0qQ.A0B(parcel2, 0);
                int readInt9 = parcel2.readInt();
                SparseArray sparseArray = new SparseArray(readInt9);
                while (readInt9 != 0) {
                    sparseArray.put(parcel2.readInt(), parcel2.readParcelable(FilterChain.class.getClassLoader()));
                    readInt9--;
                }
                int readInt10 = parcel2.readInt();
                SparseArray sparseArray2 = new SparseArray(readInt10);
                while (readInt10 != 0) {
                    sparseArray2.put(parcel2.readInt(), parcel2.readParcelable(FilterChain.class.getClassLoader()));
                    readInt10--;
                }
                String readString4 = parcel2.readString();
                boolean z7 = false;
                if (parcel2.readInt() != 0) {
                    z7 = true;
                }
                return new FilterChain(sparseArray, sparseArray2, (TransformMatrixParams) parcel2.readParcelable(FilterChain.class.getClassLoader()), readString4, parcel2.createFloatArray(), parcel2.createFloatArray(), z7);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                0qQ.A0B(parcel2, 0);
                int readInt11 = parcel2.readInt();
                SparseArray sparseArray3 = new SparseArray(readInt11);
                while (readInt11 != 0) {
                    sparseArray3.put(parcel2.readInt(), parcel2.readParcelable(FilterGroup.class.getClassLoader()));
                    readInt11--;
                }
                int readInt12 = parcel2.readInt();
                SparseArray sparseArray4 = new SparseArray(readInt12);
                while (readInt12 != 0) {
                    sparseArray4.put(parcel2.readInt(), parcel2.readParcelable(FilterGroup.class.getClassLoader()));
                    readInt12--;
                }
                String readString5 = parcel2.readString();
                boolean z8 = false;
                if (parcel2.readInt() != 0) {
                    z8 = true;
                }
                return new FilterGroup(sparseArray3, sparseArray4, (TransformMatrixParams) parcel2.readParcelable(FilterGroup.class.getClassLoader()), readString5, parcel2.createFloatArray(), parcel2.createFloatArray(), z8);
            case 13:
                0qQ.A0B(parcel2, 0);
                float[] createFloatArray5 = parcel2.createFloatArray();
                float[] createFloatArray6 = parcel2.createFloatArray();
                Class<GradientTransformFilter> cls = GradientTransformFilter.class;
                Bitmap bitmap = (Bitmap) parcel2.readParcelable(cls.getClassLoader());
                boolean z9 = false;
                if (parcel2.readInt() != 0) {
                    z9 = true;
                }
                float readFloat2 = parcel2.readFloat();
                float readFloat3 = parcel2.readFloat();
                float readFloat4 = parcel2.readFloat();
                boolean z10 = false;
                if (parcel2.readInt() != 0) {
                    z10 = true;
                }
                boolean z11 = false;
                if (parcel2.readInt() != 0) {
                    z11 = true;
                }
                return new GradientTransformFilter(bitmap, (TransformMatrixParams) parcel2.readParcelable(cls.getClassLoader()), parcel2.readString(), createFloatArray5, createFloatArray6, parcel2.createFloatArray(), parcel2.createFloatArray(), readFloat2, readFloat3, readFloat4, z9, z10, z11);
            case 14:
                0qQ.A0B(parcel2, 0);
                float readFloat5 = parcel2.readFloat();
                Class<SplitScreenFilter> cls2 = SplitScreenFilter.class;
                FilterModel filterModel = (FilterModel) parcel2.readParcelable(cls2.getClassLoader());
                FilterModel filterModel2 = (FilterModel) parcel2.readParcelable(cls2.getClassLoader());
                String readString6 = parcel2.readString();
                float[] createFloatArray7 = parcel2.createFloatArray();
                float[] createFloatArray8 = parcel2.createFloatArray();
                boolean z12 = false;
                if (parcel2.readInt() != 0) {
                    z12 = true;
                }
                return new SplitScreenFilter(filterModel, filterModel2, (TransformMatrixParams) parcel2.readParcelable(cls2.getClassLoader()), readString6, createFloatArray7, createFloatArray8, readFloat5, z12);
            case 15:
                0qQ.A0B(parcel2, 0);
                Parcelable.Creator creator = SurfaceCropFilterModel.FullTransform.CREATOR;
                SurfaceCropFilterModel.FullTransform fullTransform = (SurfaceCropFilterModel.FullTransform) creator.createFromParcel(parcel2);
                boolean z13 = false;
                if (parcel2.readInt() != 0) {
                    z13 = true;
                }
                SurfaceCropFilterModel.FullTransform fullTransform2 = (SurfaceCropFilterModel.FullTransform) creator.createFromParcel(parcel2);
                boolean z14 = false;
                if (parcel2.readInt() != 0) {
                    z14 = true;
                }
                boolean z15 = false;
                if (parcel2.readInt() != 0) {
                    z15 = true;
                }
                boolean z16 = false;
                if (parcel2.readInt() != 0) {
                    z16 = true;
                }
                int readInt13 = parcel2.readInt();
                Class<SurfaceCropFilterModel> cls3 = SurfaceCropFilterModel.class;
                Matrix4 matrix4 = (Matrix4) parcel2.readParcelable(cls3.getClassLoader());
                Matrix4 matrix42 = (Matrix4) parcel2.readParcelable(cls3.getClassLoader());
                Matrix4 matrix43 = (Matrix4) parcel2.readParcelable(cls3.getClassLoader());
                SurfaceCropFilterModel.TransformSteps transformSteps = (SurfaceCropFilterModel.TransformSteps) SurfaceCropFilterModel.TransformSteps.CREATOR.createFromParcel(parcel2);
                float readFloat6 = parcel2.readFloat();
                float readFloat7 = parcel2.readFloat();
                float readFloat8 = parcel2.readFloat();
                int readInt14 = parcel2.readInt();
                int readInt15 = parcel2.readInt();
                PointF pointF = (PointF) parcel2.readParcelable(cls3.getClassLoader());
                SurfaceCropFilterModel.FitTransformParams fitTransformParams = (SurfaceCropFilterModel.FitTransformParams) SurfaceCropFilterModel.FitTransformParams.CREATOR.createFromParcel(parcel2);
                boolean z17 = false;
                if (parcel2.readInt() != 0) {
                    z17 = true;
                }
                boolean z18 = false;
                if (parcel2.readInt() != 0) {
                    z18 = true;
                }
                boolean z19 = false;
                if (parcel2.readInt() != 0) {
                    z19 = true;
                }
                String readString7 = parcel2.readString();
                float[] createFloatArray9 = parcel2.createFloatArray();
                float[] createFloatArray10 = parcel2.createFloatArray();
                TransformMatrixParams transformMatrixParams = (TransformMatrixParams) parcel2.readParcelable(cls3.getClassLoader());
                boolean z20 = false;
                if (parcel2.readInt() != 0) {
                    z20 = true;
                }
                return new SurfaceCropFilterModel(pointF, fitTransformParams, fullTransform, fullTransform2, transformSteps, transformMatrixParams, matrix4, matrix42, matrix43, readString7, createFloatArray9, createFloatArray10, readFloat6, readFloat7, readFloat8, readInt13, readInt14, readInt15, z13, z14, z15, z16, z17, z18, z19, z20);
            case 16:
                0qQ.A0B(parcel2, 0);
                float readFloat9 = parcel2.readFloat();
                String readString8 = parcel2.readString();
                float[] createFloatArray11 = parcel2.createFloatArray();
                float[] createFloatArray12 = parcel2.createFloatArray();
                boolean z21 = false;
                if (parcel2.readInt() != 0) {
                    z21 = true;
                }
                return new GainmapFilter((TransformMatrixParams) parcel2.readParcelable(GainmapFilter.class.getClassLoader()), readString8, createFloatArray11, createFloatArray12, readFloat9, z21);
            case 17:
                0qQ.A0B(parcel2, 0);
                Integer A02 = AE9.A02(parcel2.readString());
                Class<TiltShiftFilter> cls4 = TiltShiftFilter.class;
                PointF pointF2 = (PointF) parcel2.readParcelable(cls4.getClassLoader());
                PointF pointF3 = (PointF) parcel2.readParcelable(cls4.getClassLoader());
                float readFloat10 = parcel2.readFloat();
                float readFloat11 = parcel2.readFloat();
                float readFloat12 = parcel2.readFloat();
                boolean z22 = false;
                if (parcel2.readInt() != 0) {
                    z22 = true;
                }
                return new TiltShiftFilter(pointF2, pointF3, (TransformMatrixParams) parcel2.readParcelable(cls4.getClassLoader()), A02, parcel2.readString(), parcel2.createFloatArray(), parcel2.createFloatArray(), readFloat10, readFloat11, readFloat12, z22);
            case EglBase14Impl.EGLExt_SDK_VERSION:
                0qQ.A0B(parcel2, 0);
                Integer A022 = AE9.A02(parcel2.readString());
                Class<TiltShiftOverlayFilter> cls5 = TiltShiftOverlayFilter.class;
                PointF pointF4 = (PointF) parcel2.readParcelable(cls5.getClassLoader());
                PointF pointF5 = (PointF) parcel2.readParcelable(cls5.getClassLoader());
                float readFloat13 = parcel2.readFloat();
                float readFloat14 = parcel2.readFloat();
                float readFloat15 = parcel2.readFloat();
                float readFloat16 = parcel2.readFloat();
                boolean z23 = false;
                if (parcel2.readInt() != 0) {
                    z23 = true;
                }
                return new TiltShiftOverlayFilter(pointF4, pointF5, (TransformMatrixParams) parcel2.readParcelable(cls5.getClassLoader()), A022, parcel2.readString(), parcel2.createFloatArray(), parcel2.createFloatArray(), readFloat13, readFloat14, readFloat15, readFloat16, z23);
            case 19:
                0qQ.A0B(parcel2, 0);
                float readFloat17 = parcel2.readFloat();
                float readFloat18 = parcel2.readFloat();
                float readFloat19 = parcel2.readFloat();
                float[] createFloatArray13 = parcel2.createFloatArray();
                float[] createFloatArray14 = parcel2.createFloatArray();
                boolean z24 = false;
                if (parcel2.readInt() != 0) {
                    z24 = true;
                }
                return new ZoomTransitionFilter((TransformMatrixParams) parcel2.readParcelable(ZoomTransitionFilter.class.getClassLoader()), createFloatArray13, createFloatArray14, readFloat17, readFloat18, readFloat19, z24);
            case 20:
                0qQ.A0B(parcel2, 0);
                boolean z25 = false;
                if (parcel2.readInt() != 0) {
                    z25 = true;
                }
                return new TransformMatrixParams(AAD.A00(parcel2.readString()), AAD.A00(parcel2.readString()), parcel2.readFloat(), parcel2.readFloat(), parcel2.readFloat(), parcel2.readFloat(), z25);
            case 21:
                return new CameraConfig(parcel2);
            case 22:
                return new DeviceConfig(parcel2);
            case 23:
                return new CallerContext(parcel2);
            case 24:
                return new ContextChain(parcel2);
            case 25:
                return Country.A00((Country) null, parcel2.readString());
            case 26:
                0qQ.A0B(parcel2, 0);
                return new Matrix4(parcel2);
            case 27:
                0qQ.A0B(parcel2, 0);
                return NotificationType.values()[parcel2.readInt()];
            case 28:
                return new SubscribeTopic(parcel2);
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new AudioFocusLossSettings(parcel2);
            case 30:
                return new HeroScrollSetting(parcel2);
            case 31:
                return new HttpTransferRequestedEvent(parcel2);
            case 32:
                return new SubtitleConfiguration(parcel2);
            case 33:
                0qQ.A0B(parcel2, 0);
                C330227Ly r1 = Capabilities.A01;
                byte[] createByteArray = parcel2.createByteArray();
                if (createByteArray == null) {
                    createByteArray = new byte[0];
                }
                int length = createByteArray.length;
                if (length == 0) {
                    return Capabilities.A02;
                }
                BitSet bitSet = new BitSet(length * 8);
                int i8 = 0;
                do {
                    byte b = createByteArray[i8];
                    int i9 = 0;
                    do {
                        if (((1 << i9) & b) != 0) {
                            bitSet.set((i8 * 8) + i9);
                        }
                        i9++;
                    } while (i9 < 8);
                    i8++;
                } while (i8 < length);
                return new Capabilities(bitSet);
            case 34:
                return new Metadata(parcel2);
            case 35:
                return new ColorInfo(parcel2);
            case 36:
                int A002 = C295505oK.A00(parcel2);
                String str = null;
                PendingIntent pendingIntent = null;
                ConnectionResult connectionResult = null;
                int i10 = 0;
                while (parcel2.dataPosition() < A002) {
                    int readInt16 = parcel2.readInt();
                    char c = (char) readInt16;
                    if (c == 1) {
                        C295505oK.A0D(parcel2, readInt16);
                        i10 = parcel2.readInt();
                    } else if (c == 2) {
                        str = C295505oK.A08(parcel2, readInt16);
                    } else if (c == 3) {
                        pendingIntent = (PendingIntent) C295505oK.A04(parcel2, PendingIntent.CREATOR, readInt16);
                    } else if (c != 4) {
                        C295505oK.A0C(parcel2, readInt16);
                    } else {
                        connectionResult = (ConnectionResult) C295505oK.A04(parcel2, ConnectionResult.CREATOR, readInt16);
                    }
                }
                C295505oK.A0B(parcel2, A002);
                return new Status(pendingIntent, connectionResult, str, i10);
            case 37:
                int A003 = C295505oK.A00(parcel2);
                int i11 = 0;
                boolean z26 = false;
                boolean z27 = false;
                int i12 = 0;
                int i13 = 0;
                while (parcel2.dataPosition() < A003) {
                    int readInt17 = parcel2.readInt();
                    char c2 = (char) readInt17;
                    if (c2 == 1) {
                        C295505oK.A0D(parcel2, readInt17);
                        i11 = parcel2.readInt();
                    } else if (c2 == 2) {
                        z26 = C295505oK.A0G(parcel2, readInt17);
                    } else if (c2 == 3) {
                        z27 = C295505oK.A0G(parcel2, readInt17);
                    } else if (c2 == 4) {
                        C295505oK.A0F(parcel2, readInt17, 4);
                        i12 = parcel2.readInt();
                    } else if (c2 != 5) {
                        C295505oK.A0C(parcel2, readInt17);
                    } else {
                        C295505oK.A0F(parcel2, readInt17, 4);
                        i13 = parcel2.readInt();
                    }
                }
                C295505oK.A0B(parcel2, A003);
                return new RootTelemetryConfiguration(i11, i12, i13, z26, z27);
            case 38:
                int A004 = C295505oK.A00(parcel2);
                Bundle bundle = null;
                Feature[] featureArr = null;
                ConnectionTelemetryConfiguration connectionTelemetryConfiguration = null;
                int i14 = 0;
                while (parcel2.dataPosition() < A004) {
                    int readInt18 = parcel2.readInt();
                    char c3 = (char) readInt18;
                    if (c3 == 1) {
                        bundle = C295505oK.A02(parcel2, readInt18);
                    } else if (c3 == 2) {
                        featureArr = (Feature[]) C295505oK.A0J(parcel2, Feature.CREATOR, readInt18);
                    } else if (c3 == 3) {
                        C295505oK.A0D(parcel2, readInt18);
                        i14 = parcel2.readInt();
                    } else if (c3 != 4) {
                        C295505oK.A0C(parcel2, readInt18);
                    } else {
                        connectionTelemetryConfiguration = (ConnectionTelemetryConfiguration) C295505oK.A04(parcel2, ConnectionTelemetryConfiguration.CREATOR, readInt18);
                    }
                }
                C295505oK.A0B(parcel2, A004);
                ? obj3 = new Object();
                obj3.A01 = bundle;
                obj3.A03 = featureArr;
                obj3.A00 = i14;
                obj3.A02 = connectionTelemetryConfiguration;
                return obj3;
            case 39:
                int A005 = C295505oK.A00(parcel2);
                RootTelemetryConfiguration rootTelemetryConfiguration = null;
                int[] iArr = null;
                int[] iArr2 = null;
                boolean z28 = false;
                boolean z29 = false;
                int i15 = 0;
                while (parcel2.dataPosition() < A005) {
                    int readInt19 = parcel2.readInt();
                    switch ((char) readInt19) {
                        case 1:
                            rootTelemetryConfiguration = (RootTelemetryConfiguration) C295505oK.A04(parcel2, RootTelemetryConfiguration.CREATOR, readInt19);
                            break;
                        case 2:
                            z28 = C295505oK.A0G(parcel2, readInt19);
                            break;
                        case 3:
                            z29 = C295505oK.A0G(parcel2, readInt19);
                            break;
                        case 4:
                            iArr = C295505oK.A0I(parcel2, readInt19);
                            break;
                        case 5:
                            C295505oK.A0D(parcel2, readInt19);
                            i15 = parcel2.readInt();
                            break;
                        case 6:
                            iArr2 = C295505oK.A0I(parcel2, readInt19);
                            break;
                        default:
                            C295505oK.A0C(parcel2, readInt19);
                            break;
                    }
                }
                C295505oK.A0B(parcel2, A005);
                return new ConnectionTelemetryConfiguration(rootTelemetryConfiguration, iArr, iArr2, i15, z28, z29);
            case 40:
                int A006 = C295505oK.A00(parcel2);
                Scope[] scopeArr = GetServiceRequest.A0F;
                Bundle bundle2 = new Bundle();
                Feature[] featureArr2 = GetServiceRequest.A0E;
                String str2 = null;
                Feature[] featureArr3 = featureArr2;
                IBinder iBinder = null;
                Account account = null;
                String str3 = null;
                int i16 = 0;
                int i17 = 0;
                int i18 = 0;
                boolean z30 = false;
                int i19 = 0;
                boolean z31 = false;
                while (parcel2.dataPosition() < A006) {
                    int readInt20 = parcel2.readInt();
                    switch ((char) readInt20) {
                        case 1:
                            C295505oK.A0D(parcel2, readInt20);
                            i16 = parcel2.readInt();
                            break;
                        case 2:
                            C295505oK.A0D(parcel2, readInt20);
                            i17 = parcel2.readInt();
                            break;
                        case 3:
                            C295505oK.A0D(parcel2, readInt20);
                            i18 = parcel2.readInt();
                            break;
                        case 4:
                            str2 = C295505oK.A08(parcel2, readInt20);
                            break;
                        case 5:
                            iBinder = C295505oK.A03(parcel2, readInt20);
                            break;
                        case 6:
                            scopeArr = (Scope[]) C295505oK.A0J(parcel2, Scope.CREATOR, readInt20);
                            break;
                        case 7:
                            bundle2 = C295505oK.A02(parcel2, readInt20);
                            break;
                        case 8:
                            account = (Account) C295505oK.A04(parcel2, Account.CREATOR, readInt20);
                            break;
                        case 10:
                            featureArr2 = (Feature[]) C295505oK.A0J(parcel2, Feature.CREATOR, readInt20);
                            break;
                        case 11:
                            featureArr3 = (Feature[]) C295505oK.A0J(parcel2, Feature.CREATOR, readInt20);
                            break;
                        case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                            z30 = C295505oK.A0G(parcel2, readInt20);
                            break;
                        case 13:
                            C295505oK.A0D(parcel2, readInt20);
                            i19 = parcel2.readInt();
                            break;
                        case 14:
                            z31 = C295505oK.A0G(parcel2, readInt20);
                            break;
                        case 15:
                            str3 = C295505oK.A08(parcel2, readInt20);
                            break;
                        default:
                            C295505oK.A0C(parcel2, readInt20);
                            break;
                    }
                }
                C295505oK.A0B(parcel2, A006);
                return new GetServiceRequest(account, bundle2, iBinder, str2, str3, featureArr2, featureArr3, scopeArr, i16, i17, i18, i19, z30, z31);
            case Seq.NULL_REFNUM:
                int A007 = C295505oK.A00(parcel2);
                int i20 = 0;
                PendingIntent pendingIntent2 = null;
                String str4 = null;
                int i21 = 0;
                while (parcel2.dataPosition() < A007) {
                    int readInt21 = parcel2.readInt();
                    char c4 = (char) readInt21;
                    if (c4 == 1) {
                        C295505oK.A0D(parcel2, readInt21);
                        i20 = parcel2.readInt();
                    } else if (c4 == 2) {
                        C295505oK.A0D(parcel2, readInt21);
                        i21 = parcel2.readInt();
                    } else if (c4 == 3) {
                        pendingIntent2 = (PendingIntent) C295505oK.A04(parcel2, PendingIntent.CREATOR, readInt21);
                    } else if (c4 != 4) {
                        C295505oK.A0C(parcel2, readInt21);
                    } else {
                        str4 = C295505oK.A08(parcel2, readInt21);
                    }
                }
                C295505oK.A0B(parcel2, A007);
                return new ConnectionResult(pendingIntent2, str4, i20, i21);
            case Seq.RefTracker.REF_OFFSET:
                int A008 = C295505oK.A00(parcel2);
                long j = -1;
                int i22 = 0;
                String str5 = null;
                while (parcel2.dataPosition() < A008) {
                    int readInt22 = parcel2.readInt();
                    char c5 = (char) readInt22;
                    if (c5 == 1) {
                        str5 = C295505oK.A08(parcel2, readInt22);
                    } else if (c5 == 2) {
                        C295505oK.A0D(parcel2, readInt22);
                        i22 = parcel2.readInt();
                    } else if (c5 != 3) {
                        C295505oK.A0C(parcel2, readInt22);
                    } else {
                        C295505oK.A0F(parcel2, readInt22, 8);
                        j = parcel2.readLong();
                    }
                }
                C295505oK.A0B(parcel2, A008);
                return new Feature(str5, i22, j);
            case 43:
                String readString9 = parcel2.readString();
                readString9.getClass();
                ? obj4 = new Object();
                obj4.A02 = readString9;
                obj4.A04 = new ArrayList();
                obj4.A03 = new ArrayList();
                obj4.A00 = AnonymousClass9BP.UNKNOWN;
                obj4.A00 = (AnonymousClass9BP) parcel2.readSerializable();
                List list = obj4.A04;
                Parcelable.Creator creator2 = User.CREATOR;
                parcel2.readTypedList(list, creator2);
                parcel2.readTypedList(obj4.A03, creator2);
                return obj4;
            case 44:
                0qQ.A0B(parcel2, 0);
                String readString10 = parcel2.readString();
                if (readString10 != null) {
                    Integer num = AnonymousClass05K.A00(5)[parcel2.readInt()];
                    boolean z32 = false;
                    if (parcel2.readInt() != 0) {
                        z32 = true;
                    }
                    boolean z33 = false;
                    if (parcel2.readInt() != 0) {
                        z33 = true;
                    }
                    Integer num2 = AnonymousClass05K.A00(5)[parcel2.readInt()];
                    boolean z34 = false;
                    if (parcel2.readInt() != 0) {
                        z34 = true;
                    }
                    return new PPRLoggingData(num, num2, readString10, z32, z33, z34);
                }
                throw new IllegalStateException("Required value was null.");
            case 45:
                0qQ.A0B(parcel2, 0);
                return ACRType.values()[parcel2.readInt()];
            case 46:
                0qQ.A0B(parcel2, 0);
                return AFI_TYPE.values()[parcel2.readInt()];
            case 47:
                0qQ.A0B(parcel2, 0);
                return ActionButtonPartnerType.values()[parcel2.readInt()];
            case 48:
                0qQ.A0B(parcel2, 0);
                return AdFormatType.values()[parcel2.readInt()];
            case 49:
                0qQ.A0B(parcel2, 0);
                return AdMetadataType.values()[parcel2.readInt()];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                0qQ.A0B(parcel2, 0);
                return AppColorMode.values()[parcel2.readInt()];
            case 51:
                0qQ.A0B(parcel2, 0);
                ArrayList arrayList5 = null;
                if (parcel2.readInt() == 0) {
                    valueOf = null;
                } else {
                    valueOf = Float.valueOf(parcel2.readFloat());
                }
                String readString11 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    valueOf2 = null;
                } else {
                    valueOf2 = Integer.valueOf(parcel2.readInt());
                }
                String readString12 = parcel2.readString();
                if (parcel2.readInt() != 0) {
                    int readInt23 = parcel2.readInt();
                    arrayList5 = new ArrayList(readInt23);
                    for (int i23 = 0; i23 != readInt23; i23++) {
                        arrayList5.add(parcel2.readParcelable(AppstoreMetadataDictImpl.class.getClassLoader()));
                    }
                }
                return new AppstoreMetadataDictImpl(valueOf, valueOf2, readString11, readString12, arrayList5);
            case 52:
                0qQ.A0B(parcel2, 0);
                String readString13 = parcel2.readString();
                if (parcel2.readInt() == 0) {
                    valueOf3 = null;
                } else {
                    boolean z35 = false;
                    if (parcel2.readInt() != 0) {
                        z35 = true;
                    }
                    valueOf3 = Boolean.valueOf(z35);
                }
                return new AttributionUserImpl((ProfilePicture) parcel2.readParcelable(AttributionUserImpl.class.getClassLoader()), valueOf3, readString13, parcel2.readString());
            case 53:
                0qQ.A0B(parcel2, 0);
                return AudienceGroup.values()[parcel2.readInt()];
            case 54:
                0qQ.A0B(parcel2, 0);
                return AudioFilterType.values()[parcel2.readInt()];
            case 55:
                0qQ.A0B(parcel2, 0);
                return AudioMetadataLabels.values()[parcel2.readInt()];
            case 56:
                0qQ.A0B(parcel2, 0);
                boolean z36 = false;
                if (parcel2.readInt() != 0) {
                    z36 = true;
                }
                boolean z37 = false;
                if (parcel2.readInt() != 0) {
                    z37 = true;
                }
                MusicMuteAudioReason readParcelable = parcel2.readParcelable(AudioMutingInfo.class.getClassLoader());
                String readString14 = parcel2.readString();
                boolean z38 = false;
                if (parcel2.readInt() != 0) {
                    z38 = true;
                }
                return new AudioMutingInfo(readParcelable, readString14, z36, z37, z38);
            case 57:
                0qQ.A0B(parcel2, 0);
                return new AvatarCoinFlipBackgroundOptionResponse(parcel2.readString(), parcel2.readString(), parcel2.readString(), parcel2.readString());
            case 58:
                0qQ.A0B(parcel2, 0);
                int readInt24 = parcel2.readInt();
                boolean z39 = false;
                if (readInt24 != 0) {
                    z39 = true;
                }
                return new AvatarStatusImpl(z39);
            case 59:
                0qQ.A0B(parcel2, 0);
                return BirthdayVisibilityForViewer.values()[parcel2.readInt()];
            case 60:
                0qQ.A0B(parcel2, 0);
                return BizUserInboxState.values()[parcel2.readInt()];
            case 61:
                0qQ.A0B(parcel2, 0);
                if (parcel2.readInt() == 0) {
                    arrayList = null;
                } else {
                    int readInt25 = parcel2.readInt();
                    arrayList = new ArrayList(readInt25);
                    for (int i24 = 0; i24 != readInt25; i24++) {
                        arrayList.add(Integer.valueOf(parcel2.readInt()));
                    }
                }
                return new BrandSafetyContentBlocklistBitmapQLObjImpl(arrayList);
            case 62:
                0qQ.A0B(parcel2, 0);
                return BrandedContentAdsPaidPartnershipLabelRemovalOption.values()[parcel2.readInt()];
            case 63:
                0qQ.A0B(parcel2, 0);
                Integer num3 = null;
                if (parcel2.readInt() == 0) {
                    hashMap = null;
                } else {
                    int readInt26 = parcel2.readInt();
                    hashMap = new HashMap(readInt26);
                    for (int i25 = 0; i25 != readInt26; i25++) {
                        hashMap.put(parcel2.readString(), Integer.valueOf(parcel2.readInt()));
                    }
                }
                if (parcel2.readInt() == 0) {
                    arrayList2 = null;
                } else {
                    int readInt27 = parcel2.readInt();
                    arrayList2 = new ArrayList(readInt27);
                    for (int i26 = 0; i26 != readInt27; i26++) {
                        arrayList2.add(parcel2.readParcelable(BrandedContentGatingInfo.class.getClassLoader()));
                    }
                }
                ArrayList<String> createStringArrayList = parcel2.createStringArrayList();
                if (parcel2.readInt() != 0) {
                    num3 = Integer.valueOf(parcel2.readInt());
                }
                return new BrandedContentGatingInfo(num3, parcel2.readString(), hashMap, arrayList2, createStringArrayList);
            case 64:
                0qQ.A0B(parcel2, 0);
                return CameraTool.values()[parcel2.readInt()];
            case 65:
                0qQ.A0B(parcel2, 0);
                return CanUseCreatorMonetizationProduct.values()[parcel2.readInt()];
            case 66:
                0qQ.A0B(parcel2, 0);
                return CarouselRenderingType.values()[parcel2.readInt()];
            case 67:
                0qQ.A0B(parcel2, 0);
                return CheckoutStyle.values()[parcel2.readInt()];
            case 68:
                0qQ.A0B(parcel2, 0);
                return ClientDisplayMethod.values()[parcel2.readInt()];
            case 69:
                0qQ.A0B(parcel2, 0);
                return ClipsCameraCommandAction.values()[parcel2.readInt()];
            case 70:
                0qQ.A0B(parcel2, 0);
                return ClipsCreationEntryPoint.values()[parcel2.readInt()];
            case 71:
                0qQ.A0B(parcel2, 0);
                return ClipsIFUType.values()[parcel2.readInt()];
            case 72:
                0qQ.A0B(parcel2, 0);
                boolean z40 = true;
                Boolean bool = null;
                if (parcel2.readInt() == 0) {
                    valueOf4 = null;
                } else {
                    boolean z41 = false;
                    if (parcel2.readInt() != 0) {
                        z41 = true;
                    }
                    valueOf4 = Boolean.valueOf(z41);
                }
                if (parcel2.readInt() != 0) {
                    if (parcel2.readInt() == 0) {
                        z40 = false;
                    }
                    bool = Boolean.valueOf(z40);
                }
                return new ClipsMashupFollowButtonInfoImpl(valueOf4, bool);
            case 73:
                0qQ.A0B(parcel2, 0);
                return ClipsMashupType.values()[parcel2.readInt()];
            case 74:
                0qQ.A0B(parcel2, 0);
                return ClipsPrefetchTriggerType.values()[parcel2.readInt()];
            case 75:
                0qQ.A0B(parcel2, 0);
                return ClipsSpecialResponseType.values()[parcel2.readInt()];
            case 76:
                0qQ.A0B(parcel2, 0);
                return ClipsTextAlignment.values()[parcel2.readInt()];
            case 77:
                0qQ.A0B(parcel2, 0);
                return ClipsTextEmphasisMode.values()[parcel2.readInt()];
            case 78:
                0qQ.A0B(parcel2, 0);
                return ClipsTextFormatType.values()[parcel2.readInt()];
            case 79:
                0qQ.A0B(parcel2, 0);
                boolean z42 = true;
                Boolean bool2 = null;
                if (parcel2.readInt() == 0) {
                    valueOf5 = null;
                } else {
                    boolean z43 = false;
                    if (parcel2.readInt() != 0) {
                        z43 = true;
                    }
                    valueOf5 = Boolean.valueOf(z43);
                }
                if (parcel2.readInt() != 0) {
                    if (parcel2.readInt() == 0) {
                        z42 = false;
                    }
                    bool2 = Boolean.valueOf(z42);
                }
                return new CollabFollowButtonInfoImpl(valueOf5, bool2);
            case 80:
                0qQ.A0B(parcel2, 0);
                return CollectionMediaRole.values()[parcel2.readInt()];
            case 81:
                0qQ.A0B(parcel2, 0);
                return CommentAudienceControlType.values()[parcel2.readInt()];
            case 82:
                0qQ.A0B(parcel2, 0);
                Class<CommentGiphyMediaInfo> cls6 = CommentGiphyMediaInfo.class;
                CommentGiphyMediaImages commentGiphyMediaImages = (CommentGiphyMediaImages) parcel2.readParcelable(cls6.getClassLoader());
                String readString15 = parcel2.readString();
                CommentGiphyMediaImages commentGiphyMediaImages2 = (CommentGiphyMediaImages) parcel2.readParcelable(cls6.getClassLoader());
                if (parcel2.readInt() == 0) {
                    valueOf6 = null;
                } else {
                    boolean z44 = false;
                    if (parcel2.readInt() != 0) {
                        z44 = true;
                    }
                    valueOf6 = Boolean.valueOf(z44);
                }
                return new CommentGiphyMediaInfo(commentGiphyMediaImages, commentGiphyMediaImages2, valueOf6, readString15, parcel2.readString(), parcel2.readString());
            case 83:
                0qQ.A0B(parcel2, 0);
                return CommentRestrictStatus.values()[parcel2.readInt()];
            case 84:
                0qQ.A0B(parcel2, 0);
                Integer num4 = null;
                if (parcel2.readInt() == 0) {
                    valueOf7 = null;
                } else {
                    valueOf7 = Float.valueOf(parcel2.readFloat());
                }
                if (parcel2.readInt() == 0) {
                    arrayList3 = null;
                } else {
                    int readInt28 = parcel2.readInt();
                    arrayList3 = new ArrayList(readInt28);
                    for (int i27 = 0; i27 != readInt28; i27++) {
                        arrayList3.add(parcel2.readParcelable(CommerceReviewStatisticsDict.class.getClassLoader()));
                    }
                }
                if (parcel2.readInt() != 0) {
                    num4 = Integer.valueOf(parcel2.readInt());
                }
                return new CommerceReviewStatisticsDict(valueOf7, num4, arrayList3);
            case 85:
                0qQ.A0B(parcel2, 0);
                return ConfirmationStyle.values()[parcel2.readInt()];
            case 86:
                0qQ.A0B(parcel2, 0);
                return ConfirmationTitleStyle.values()[parcel2.readInt()];
            case 87:
                0qQ.A0B(parcel2, 0);
                return ContextualHighlightType.values()[parcel2.readInt()];
            case 88:
                0qQ.A0B(parcel2, 0);
                return CornerStyle.values()[parcel2.readInt()];
            case 89:
                0qQ.A0B(parcel2, 0);
                return CreateModeType.values()[parcel2.readInt()];
            case 90:
                0qQ.A0B(parcel2, 0);
                return CreationToolEnum.values()[parcel2.readInt()];
            case 91:
                0qQ.A0B(parcel2, 0);
                return CreatorSegmentation.values()[parcel2.readInt()];
            case 92:
                0qQ.A0B(parcel2, 0);
                return DemarcatorActionType.values()[parcel2.readInt()];
            case 93:
                0qQ.A0B(parcel2, 0);
                return DemarcatorStyleEnum.values()[parcel2.readInt()];
            case 94:
                0qQ.A0B(parcel2, 0);
                return new DirectAudioFallbackUrlImpl(parcel2.readString());
            case 95:
                0qQ.A0B(parcel2, 0);
                return new DirectMediaFallbackUrl(parcel2.readString());
            case 96:
                0qQ.A0B(parcel2, 0);
                return DynamicProductAdDisplayOption.values()[parcel2.readInt()];
            case 97:
                0qQ.A0B(parcel2, 0);
                if (parcel2.readInt() == 0) {
                    valueOf8 = null;
                } else {
                    boolean z45 = false;
                    if (parcel2.readInt() != 0) {
                        z45 = true;
                    }
                    valueOf8 = Boolean.valueOf(z45);
                }
                return new ElectionAddYoursInfoDict(valueOf8, parcel2.readString(), parcel2.createStringArrayList());
            case 98:
                0qQ.A0B(parcel2, 0);
                return FBBioLinkSocialContextType.values()[parcel2.readInt()];
            default:
                boolean z46 = false;
                0qQ.A0B(parcel2, 0);
                boolean z47 = true;
                if (parcel2.readInt() != 0) {
                    z46 = true;
                }
                if (parcel2.readInt() == 0) {
                    z47 = false;
                }
                return new FanClubFanConsiderationPageFeatureEligibilityResponseImpl(z46, z47);
        }
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new ParcelableSnapshotMutableFloatState[i];
            case 1:
                return new ParcelableSnapshotMutableIntState[i];
            case 2:
                return new ParcelableSnapshotMutableLongState[i];
            case 3:
                return new LinearLayoutManager.SavedState[i];
            case 4:
                return new StaticMapView.StaticMapOptions[i];
            case 5:
                return new ARCapabilityMinVersionModeling[i];
            case 6:
                return new ARRequestAsset[i];
            case 7:
                return new SparkVisionCapability[i];
            case 8:
                return new TypedParameterMap[i];
            case 9:
                return new ValueMapFilterModel[i];
            case 10:
                return new ColorFilter[i];
            case 11:
                return new FilterChain[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new FilterGroup[i];
            case 13:
                return new GradientTransformFilter[i];
            case 14:
                return new SplitScreenFilter[i];
            case 15:
                return new SurfaceCropFilterModel[i];
            case 16:
                return new GainmapFilter[i];
            case 17:
                return new TiltShiftFilter[i];
            case EglBase14Impl.EGLExt_SDK_VERSION:
                return new TiltShiftOverlayFilter[i];
            case 19:
                return new ZoomTransitionFilter[i];
            case 20:
                return new TransformMatrixParams[i];
            case 21:
                return new CameraConfig[i];
            case 22:
                return new DeviceConfig[i];
            case 23:
                return new CallerContext[i];
            case 24:
                return new ContextChain[i];
            case 25:
                return new Country[i];
            case 26:
                return new Matrix4[i];
            case 27:
                return new NotificationType[i];
            case 28:
                return new SubscribeTopic[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                return new AudioFocusLossSettings[i];
            case 30:
                return new HeroScrollSetting[i];
            case 31:
                return new HttpTransferRequestedEvent[i];
            case 32:
                return new SubtitleConfiguration[i];
            case 33:
                return new Capabilities[i];
            case 34:
                return new Metadata[i];
            case 35:
                return new ColorInfo[i];
            case 36:
                return new Status[i];
            case 37:
                return new RootTelemetryConfiguration[i];
            case 38:
                return new zzk[i];
            case 39:
                return new ConnectionTelemetryConfiguration[i];
            case 40:
                return new GetServiceRequest[i];
            case Seq.NULL_REFNUM:
                return new ConnectionResult[i];
            case Seq.RefTracker.REF_OFFSET:
                return new Feature[i];
            case 43:
                return new AccountFamily[i];
            case 44:
                return new PPRLoggingData[i];
            case 45:
                return new ACRType[i];
            case 46:
                return new AFI_TYPE[i];
            case 47:
                return new ActionButtonPartnerType[i];
            case 48:
                return new AdFormatType[i];
            case 49:
                return new AdMetadataType[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new AppColorMode[i];
            case 51:
                return new AppstoreMetadataDictImpl[i];
            case 52:
                return new AttributionUserImpl[i];
            case 53:
                return new AudienceGroup[i];
            case 54:
                return new AudioFilterType[i];
            case 55:
                return new AudioMetadataLabels[i];
            case 56:
                return new AudioMutingInfo[i];
            case 57:
                return new AvatarCoinFlipBackgroundOptionResponse[i];
            case 58:
                return new AvatarStatusImpl[i];
            case 59:
                return new BirthdayVisibilityForViewer[i];
            case 60:
                return new BizUserInboxState[i];
            case 61:
                return new BrandSafetyContentBlocklistBitmapQLObjImpl[i];
            case 62:
                return new BrandedContentAdsPaidPartnershipLabelRemovalOption[i];
            case 63:
                return new BrandedContentGatingInfo[i];
            case 64:
                return new CameraTool[i];
            case 65:
                return new CanUseCreatorMonetizationProduct[i];
            case 66:
                return new CarouselRenderingType[i];
            case 67:
                return new CheckoutStyle[i];
            case 68:
                return new ClientDisplayMethod[i];
            case 69:
                return new ClipsCameraCommandAction[i];
            case 70:
                return new ClipsCreationEntryPoint[i];
            case 71:
                return new ClipsIFUType[i];
            case 72:
                return new ClipsMashupFollowButtonInfoImpl[i];
            case 73:
                return new ClipsMashupType[i];
            case 74:
                return new ClipsPrefetchTriggerType[i];
            case 75:
                return new ClipsSpecialResponseType[i];
            case 76:
                return new ClipsTextAlignment[i];
            case 77:
                return new ClipsTextEmphasisMode[i];
            case 78:
                return new ClipsTextFormatType[i];
            case 79:
                return new CollabFollowButtonInfoImpl[i];
            case 80:
                return new CollectionMediaRole[i];
            case 81:
                return new CommentAudienceControlType[i];
            case 82:
                return new CommentGiphyMediaInfo[i];
            case 83:
                return new CommentRestrictStatus[i];
            case 84:
                return new CommerceReviewStatisticsDict[i];
            case 85:
                return new ConfirmationStyle[i];
            case 86:
                return new ConfirmationTitleStyle[i];
            case 87:
                return new ContextualHighlightType[i];
            case 88:
                return new CornerStyle[i];
            case 89:
                return new CreateModeType[i];
            case 90:
                return new CreationToolEnum[i];
            case 91:
                return new CreatorSegmentation[i];
            case 92:
                return new DemarcatorActionType[i];
            case 93:
                return new DemarcatorStyleEnum[i];
            case 94:
                return new DirectAudioFallbackUrlImpl[i];
            case 95:
                return new DirectMediaFallbackUrl[i];
            case 96:
                return new DynamicProductAdDisplayOption[i];
            case 97:
                return new ElectionAddYoursInfoDict[i];
            case 98:
                return new FBBioLinkSocialContextType[i];
            default:
                return new FanClubFanConsiderationPageFeatureEligibilityResponseImpl[i];
        }
    }

    public static void A00(Parcel parcel, GetServiceRequest getServiceRequest, int i) {
        int A002 = C301145yd.A00(parcel);
        C301145yd.A05(parcel, getServiceRequest.A08);
        C301145yd.A07(parcel, 2, getServiceRequest.A09);
        C301145yd.A07(parcel, 3, getServiceRequest.A0A);
        C301145yd.A0C(parcel, getServiceRequest.A03, 4, false);
        C301145yd.A03(getServiceRequest.A02, parcel, 5);
        C301145yd.A0G(parcel, getServiceRequest.A07, 6, i);
        C301145yd.A02(getServiceRequest.A01, parcel, 7);
        C301145yd.A0A(parcel, getServiceRequest.A00, 8, i, false);
        C301145yd.A0G(parcel, getServiceRequest.A05, 10, i);
        C301145yd.A0G(parcel, getServiceRequest.A06, 11, i);
        C301145yd.A09(parcel, 12, getServiceRequest.A0D);
        C301145yd.A07(parcel, 13, getServiceRequest.A0B);
        C301145yd.A09(parcel, 14, getServiceRequest.A04);
        C301145yd.A0C(parcel, getServiceRequest.A0C, 15, false);
        C301145yd.A06(parcel, A002);
    }
}
