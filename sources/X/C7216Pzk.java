package X;

import android.os.Parcelable;
import android.support.v4.media.MediaBrowserCompat$MediaItem;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.MediaSessionCompat$QueueItem;
import android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper;
import android.support.v4.media.session.MediaSessionCompat$Token;
import android.support.v4.media.session.ParcelableVolumeInfo;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.os.ResultReceiver;
import androidx.appcompat.widget.ActionMenuPresenter$SavedState;
import androidx.appcompat.widget.AppCompatSpinner$SavedState;
import androidx.compose.foundation.lazy.layout.DefaultLazyKey;
import androidx.compose.runtime.ParcelableSnapshotMutableDoubleState;
import androidx.core.widget.NestedScrollView;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Metadata;
import androidx.media3.common.StreamKey;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4OrientationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.container.XmpData;
import androidx.media3.exoplayer.offline.DownloadRequest;
import androidx.media3.exoplayer.scheduler.Requirements;
import androidx.media3.extractor.metadata.dvbsi.AppInfoTable;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.flac.VorbisComment;
import androidx.media3.extractor.metadata.icy.IcyHeaders;
import androidx.media3.extractor.metadata.icy.IcyInfo;
import androidx.media3.extractor.metadata.id3.ApicFrame;
import androidx.media3.extractor.metadata.id3.BinaryFrame;
import androidx.media3.extractor.metadata.id3.ChapterFrame;
import androidx.media3.extractor.metadata.id3.ChapterTocFrame;
import androidx.media3.extractor.metadata.id3.CommentFrame;
import androidx.media3.extractor.metadata.id3.GeobFrame;
import androidx.media3.extractor.metadata.id3.InternalFrame;
import androidx.media3.extractor.metadata.id3.MlltFrame;
import androidx.media3.extractor.metadata.id3.PrivFrame;
import androidx.media3.extractor.metadata.id3.TextInformationFrame;
import androidx.media3.extractor.metadata.id3.UrlLinkFrame;
import androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata;
import androidx.media3.extractor.metadata.mp4.SlowMotionData;
import androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry;
import androidx.media3.extractor.metadata.scte35.PrivateCommand;
import androidx.media3.extractor.metadata.scte35.SpliceInsertCommand;
import androidx.media3.extractor.metadata.scte35.SpliceNullCommand;
import androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand;
import androidx.media3.extractor.metadata.scte35.TimeSignalCommand;
import androidx.navigation.NavBackStackEntryState;
import androidx.paging.compose.PagingPlaceholderKey;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.SeekBarPreference;
import androidx.preference.TwoStatePreference;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout$SavedState;
import androidx.test.internal.util.ParcelableIBinder;
import androidx.versionedparcelable.ParcelImpl;
import androidx.work.multiprocess.parcelable.ParcelableConstraints;
import androidx.work.multiprocess.parcelable.ParcelableData;
import androidx.work.multiprocess.parcelable.ParcelableForegroundRequestInfo;
import androidx.work.multiprocess.parcelable.ParcelableInterruptRequest;
import androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest;
import androidx.work.multiprocess.parcelable.ParcelableResult;
import androidx.work.multiprocess.parcelable.ParcelableRuntimeExtras;
import androidx.work.multiprocess.parcelable.ParcelableUpdateRequest;
import androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl;
import androidx.work.multiprocess.parcelable.ParcelableWorkInfo;
import androidx.work.multiprocess.parcelable.ParcelableWorkInfos;
import androidx.work.multiprocess.parcelable.ParcelableWorkQuery;
import androidx.work.multiprocess.parcelable.ParcelableWorkRequest;
import androidx.work.multiprocess.parcelable.ParcelableWorkRequests;
import androidx.work.multiprocess.parcelable.ParcelableWorkerParameters;
import com.airbnb.lottie.LottieAnimationView$SavedState;
import com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager;
import com.encryptedbackups.storagemanagers.otc.model.OneTimeCodeDevice;
import com.facebook.AccessToken;
import com.facebook.advancedcryptotransport.model.PeerDevice;
import com.facebook.advancedcryptotransport.model.SecurityAlert;
import com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCall;
import com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCallResult;
import com.facebook.android.instantexperiences.autofill.model.AddressAutofillData;
import com.facebook.android.instantexperiences.autofill.model.EmailAutofillData;
import com.facebook.android.instantexperiences.autofill.model.NameAutofillData;
import com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData;
import com.facebook.android.instantexperiences.autofill.save.SaveAutofillDataJSBridgeCall;
import com.facebook.android.instantexperiences.core.IGInstantExperiencesFeatureEnabledList;
import com.facebook.android.instantexperiences.jscall.InstantExperienceGenericErrorResult;
import com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCall;
import com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCallResult;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.debug.devoptions.direct.burner.BurnerSendSettingsHelper;
import com.instagram.react.modules.base.IgReactQEModule;
import go.Seq;
import org.webrtc.EglBase14Impl;

/* renamed from: X.Pzk  reason: case insensitive filesystem */
public final class C7216Pzk implements Parcelable.Creator {
    public final int A00;

    public C7216Pzk(int i) {
        this.A00 = i;
    }

    public static C7216Pzk A00(int i) {
        return new C7216Pzk(i);
    }

    /* JADX WARNING: type inference failed for: r10v16, types: [android.view.View$BaseSavedState, com.airbnb.lottie.LottieAnimationView$SavedState, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v23, types: [java.lang.Object, androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl] */
    /* JADX WARNING: type inference failed for: r10v35, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v36, types: [androidx.preference.TwoStatePreference$SavedState, androidx.preference.Preference$BaseSavedState, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v37, types: [androidx.preference.SeekBarPreference$SavedState, androidx.preference.Preference$BaseSavedState, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v38, types: [androidx.preference.PreferenceGroup$SavedState, androidx.preference.Preference$BaseSavedState, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v40, types: [androidx.preference.Preference$BaseSavedState, java.lang.Object, androidx.preference.MultiSelectListPreference$SavedState] */
    /* JADX WARNING: type inference failed for: r10v41, types: [androidx.preference.Preference$BaseSavedState, java.lang.Object, androidx.preference.ListPreference$SavedState] */
    /* JADX WARNING: type inference failed for: r10v42, types: [androidx.preference.EditTextPreference$SavedState, androidx.preference.Preference$BaseSavedState, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v83, types: [android.view.View$BaseSavedState, androidx.core.widget.NestedScrollView$SavedState, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v84, types: [androidx.compose.runtime.ParcelableSnapshotMutableDoubleState, X.5Ow, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v12, types: [X.QAZ, X.5P2] */
    /* JADX WARNING: type inference failed for: r1v2, types: [X.QAZ, X.5P2] */
    /* JADX WARNING: type inference failed for: r10v86, types: [android.view.View$BaseSavedState, androidx.appcompat.widget.AppCompatSpinner$SavedState, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v87, types: [java.lang.Object, androidx.appcompat.widget.ActionMenuPresenter$SavedState] */
    /* JADX WARNING: type inference failed for: r10v88, types: [java.lang.Object, android.support.v4.os.ResultReceiver] */
    /* JADX WARNING: type inference failed for: r2v14, types: [java.lang.Object, android.support.v4.os.IResultReceiver$Stub$Proxy] */
    /* JADX WARNING: type inference failed for: r10v91, types: [android.support.v4.media.session.ParcelableVolumeInfo, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v93, types: [android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r10v98, types: [androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:258:0x051f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r17) {
        /*
            r16 = this;
            r0 = r16
            int r0 = r0.A00
            r1 = r17
            switch(r0) {
                case 0: goto L_0x0068;
                case 1: goto L_0x000f;
                case 2: goto L_0x006e;
                case 3: goto L_0x0074;
                case 4: goto L_0x0082;
                case 5: goto L_0x0088;
                case 6: goto L_0x0098;
                case 7: goto L_0x00a3;
                case 8: goto L_0x00c7;
                case 9: goto L_0x00cd;
                case 10: goto L_0x00d3;
                case 11: goto L_0x0106;
                case 12: goto L_0x0112;
                case 13: goto L_0x0122;
                case 14: goto L_0x012c;
                case 15: goto L_0x0151;
                case 16: goto L_0x015d;
                case 17: goto L_0x0163;
                case 18: goto L_0x0169;
                case 19: goto L_0x016f;
                case 20: goto L_0x0175;
                case 21: goto L_0x017b;
                case 22: goto L_0x0181;
                case 23: goto L_0x0187;
                case 24: goto L_0x018d;
                case 25: goto L_0x0193;
                case 26: goto L_0x0199;
                case 27: goto L_0x01a3;
                case 28: goto L_0x01b4;
                case 29: goto L_0x01ba;
                case 30: goto L_0x01c0;
                case 31: goto L_0x01c6;
                case 32: goto L_0x01cc;
                case 33: goto L_0x01d2;
                case 34: goto L_0x01d8;
                case 35: goto L_0x01de;
                case 36: goto L_0x01e4;
                case 37: goto L_0x01ea;
                case 38: goto L_0x01f0;
                case 39: goto L_0x01f6;
                case 40: goto L_0x01fc;
                case 41: goto L_0x0202;
                case 42: goto L_0x0208;
                case 43: goto L_0x0224;
                case 44: goto L_0x022a;
                case 45: goto L_0x0230;
                case 46: goto L_0x023f;
                case 47: goto L_0x0251;
                case 48: goto L_0x0257;
                case 49: goto L_0x025d;
                case 50: goto L_0x0263;
                case 51: goto L_0x0269;
                case 52: goto L_0x026f;
                case 53: goto L_0x027d;
                case 54: goto L_0x0283;
                case 55: goto L_0x028d;
                case 56: goto L_0x0297;
                case 57: goto L_0x02a3;
                case 58: goto L_0x02af;
                case 59: goto L_0x02c9;
                case 60: goto L_0x02cf;
                case 61: goto L_0x02db;
                case 62: goto L_0x02f3;
                case 63: goto L_0x0043;
                case 64: goto L_0x02ff;
                case 65: goto L_0x0352;
                case 66: goto L_0x0358;
                case 67: goto L_0x035e;
                case 68: goto L_0x0364;
                case 69: goto L_0x036a;
                case 70: goto L_0x0370;
                case 71: goto L_0x0376;
                case 72: goto L_0x0387;
                case 73: goto L_0x038d;
                case 74: goto L_0x0393;
                case 75: goto L_0x0399;
                case 76: goto L_0x039f;
                case 77: goto L_0x03fe;
                case 78: goto L_0x0404;
                case 79: goto L_0x040a;
                case 80: goto L_0x0410;
                case 81: goto L_0x0416;
                case 82: goto L_0x041c;
                case 83: goto L_0x0422;
                case 84: goto L_0x044c;
                case 85: goto L_0x0456;
                case 86: goto L_0x0470;
                case 87: goto L_0x0476;
                case 88: goto L_0x047c;
                case 89: goto L_0x0482;
                case 90: goto L_0x048c;
                case 91: goto L_0x0496;
                case 92: goto L_0x04a0;
                case 93: goto L_0x04aa;
                case 94: goto L_0x04b4;
                case 95: goto L_0x04be;
                case 96: goto L_0x04d4;
                case 97: goto L_0x04c8;
                case 98: goto L_0x04ce;
                default: goto L_0x0009;
            }
        L_0x0009:
            com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCallResult r10 = new com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCallResult
            r10.<init>((android.os.Parcel) r1)
        L_0x000e:
            return r10
        L_0x000f:
            android.os.Parcelable$Creator r0 = android.media.MediaDescription.CREATOR
            java.lang.Object r4 = r0.createFromParcel(r1)
            r10 = 0
            if (r4 == 0) goto L_0x000e
            android.media.MediaDescription r4 = (android.media.MediaDescription) r4
            java.lang.String r14 = r4.getMediaId()
            java.lang.CharSequence r11 = r4.getTitle()
            java.lang.CharSequence r12 = r4.getSubtitle()
            java.lang.CharSequence r13 = r4.getDescription()
            android.graphics.Bitmap r7 = r4.getIconBitmap()
            android.net.Uri r8 = r4.getIconUri()
            android.os.Bundle r5 = r4.getExtras()
            if (r5 == 0) goto L_0x04f0
            java.lang.Class<X.RLD> r0 = X.RLD.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            r5.setClassLoader(r0)
            goto L_0x04e4
        L_0x0043:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem r10 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem
            r10.<init>()
            int r0 = r1.readInt()
            r10.A01 = r0
            int r0 = r1.readInt()
            r10.A00 = r0
            boolean r0 = X.Pxg.A1U(r1)
            r10.A02 = r0
            int r0 = r1.readInt()
            if (r0 <= 0) goto L_0x000e
            int[] r0 = new int[r0]
            r10.A03 = r0
            r1.readIntArray(r0)
            return r10
        L_0x0068:
            android.support.v4.media.MediaBrowserCompat$MediaItem r10 = new android.support.v4.media.MediaBrowserCompat$MediaItem
            r10.<init>(r1)
            return r10
        L_0x006e:
            android.support.v4.media.MediaMetadataCompat r10 = new android.support.v4.media.MediaMetadataCompat
            r10.<init>(r1)
            return r10
        L_0x0074:
            int r2 = r1.readInt()
            float r0 = r1.readFloat()
            android.support.v4.media.RatingCompat r10 = new android.support.v4.media.RatingCompat
            r10.<init>(r2, r0)
            return r10
        L_0x0082:
            android.support.v4.media.session.MediaSessionCompat$QueueItem r10 = new android.support.v4.media.session.MediaSessionCompat$QueueItem
            r10.<init>(r1)
            return r10
        L_0x0088:
            android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper r10 = new android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper
            r10.<init>()
            android.os.Parcelable$Creator r0 = android.os.ResultReceiver.CREATOR
            java.lang.Object r0 = r0.createFromParcel(r1)
            android.os.ResultReceiver r0 = (android.os.ResultReceiver) r0
            r10.A00 = r0
            return r10
        L_0x0098:
            r0 = 0
            android.os.Parcelable r0 = r1.readParcelable(r0)
            android.support.v4.media.session.MediaSessionCompat$Token r10 = new android.support.v4.media.session.MediaSessionCompat$Token
            r10.<init>(r0)
            return r10
        L_0x00a3:
            android.support.v4.media.session.ParcelableVolumeInfo r10 = new android.support.v4.media.session.ParcelableVolumeInfo
            r10.<init>()
            int r0 = r1.readInt()
            r10.A04 = r0
            int r0 = r1.readInt()
            r10.A01 = r0
            int r0 = r1.readInt()
            r10.A03 = r0
            int r0 = r1.readInt()
            r10.A02 = r0
            int r0 = r1.readInt()
            r10.A00 = r0
            return r10
        L_0x00c7:
            android.support.v4.media.session.PlaybackStateCompat r10 = new android.support.v4.media.session.PlaybackStateCompat
            r10.<init>(r1)
            return r10
        L_0x00cd:
            android.support.v4.media.session.PlaybackStateCompat$CustomAction r10 = new android.support.v4.media.session.PlaybackStateCompat$CustomAction
            r10.<init>(r1)
            return r10
        L_0x00d3:
            android.support.v4.os.ResultReceiver r10 = new android.support.v4.os.ResultReceiver
            r10.<init>()
            android.os.IBinder r3 = r1.readStrongBinder()
            if (r3 != 0) goto L_0x00e2
            r2 = 0
        L_0x00df:
            r10.A00 = r2
            return r10
        L_0x00e2:
            java.lang.String r0 = android.support.v4.os.IResultReceiver.A00
            android.os.IInterface r2 = r3.queryLocalInterface(r0)
            if (r2 == 0) goto L_0x00f1
            boolean r0 = r2 instanceof android.support.v4.os.IResultReceiver
            if (r0 == 0) goto L_0x00f1
            android.support.v4.os.IResultReceiver r2 = (android.support.v4.os.IResultReceiver) r2
            goto L_0x00df
        L_0x00f1:
            android.support.v4.os.IResultReceiver$Stub$Proxy r2 = new android.support.v4.os.IResultReceiver$Stub$Proxy
            r2.<init>()
            r0 = -719786202(0xffffffffd518ef26, float:-1.05095564E13)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r2.A00 = r3
            r0 = -735258490(0xffffffffd42cd886, float:-2.96946814E12)
            X.AnonymousClass0fD.A0A(r0, r1)
            goto L_0x00df
        L_0x0106:
            androidx.appcompat.widget.ActionMenuPresenter$SavedState r10 = new androidx.appcompat.widget.ActionMenuPresenter$SavedState
            r10.<init>()
            int r0 = r1.readInt()
            r10.A00 = r0
            return r10
        L_0x0112:
            androidx.appcompat.widget.AppCompatSpinner$SavedState r10 = new androidx.appcompat.widget.AppCompatSpinner$SavedState
            r10.<init>(r1)
            byte r0 = r1.readByte()
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            r10.A00 = r0
            return r10
        L_0x0122:
            int r0 = r1.readInt()
            androidx.compose.foundation.lazy.layout.DefaultLazyKey r10 = new androidx.compose.foundation.lazy.layout.DefaultLazyKey
            r10.<init>(r0)
            return r10
        L_0x012c:
            double r3 = r1.readDouble()
            androidx.compose.runtime.ParcelableSnapshotMutableDoubleState r10 = new androidx.compose.runtime.ParcelableSnapshotMutableDoubleState
            r10.<init>()
            X.QAZ r2 = new X.QAZ
            r2.<init>()
            r2.A00 = r3
            boolean r0 = X.AnonymousClass5PH.A07()
            if (r0 == 0) goto L_0x014e
            X.QAZ r1 = new X.QAZ
            r1.<init>()
            r1.A00 = r3
            r0 = 1
            r1.A00 = r0
            r2.A01 = r1
        L_0x014e:
            r10.A00 = r2
            return r10
        L_0x0151:
            androidx.core.widget.NestedScrollView$SavedState r10 = new androidx.core.widget.NestedScrollView$SavedState
            r10.<init>(r1)
            int r0 = r1.readInt()
            r10.A00 = r0
            return r10
        L_0x015d:
            androidx.media3.common.DrmInitData r10 = new androidx.media3.common.DrmInitData
            r10.<init>(r1)
            return r10
        L_0x0163:
            androidx.media3.common.DrmInitData$SchemeData r10 = new androidx.media3.common.DrmInitData$SchemeData
            r10.<init>(r1)
            return r10
        L_0x0169:
            androidx.media3.common.Metadata r10 = new androidx.media3.common.Metadata
            r10.<init>((android.os.Parcel) r1)
            return r10
        L_0x016f:
            androidx.media3.common.StreamKey r10 = new androidx.media3.common.StreamKey
            r10.<init>(r1)
            return r10
        L_0x0175:
            androidx.media3.container.MdtaMetadataEntry r10 = new androidx.media3.container.MdtaMetadataEntry
            r10.<init>(r1)
            return r10
        L_0x017b:
            androidx.media3.container.Mp4LocationData r10 = new androidx.media3.container.Mp4LocationData
            r10.<init>(r1)
            return r10
        L_0x0181:
            androidx.media3.container.Mp4OrientationData r10 = new androidx.media3.container.Mp4OrientationData
            r10.<init>((android.os.Parcel) r1)
            return r10
        L_0x0187:
            androidx.media3.container.Mp4TimestampData r10 = new androidx.media3.container.Mp4TimestampData
            r10.<init>(r1)
            return r10
        L_0x018d:
            androidx.media3.container.XmpData r10 = new androidx.media3.container.XmpData
            r10.<init>(r1)
            return r10
        L_0x0193:
            androidx.media3.exoplayer.offline.DownloadRequest r10 = new androidx.media3.exoplayer.offline.DownloadRequest
            r10.<init>(r1)
            return r10
        L_0x0199:
            int r0 = r1.readInt()
            androidx.media3.exoplayer.scheduler.Requirements r10 = new androidx.media3.exoplayer.scheduler.Requirements
            r10.<init>(r0)
            return r10
        L_0x01a3:
            java.lang.String r2 = r1.readString()
            r2.getClass()
            int r0 = r1.readInt()
            androidx.media3.extractor.metadata.dvbsi.AppInfoTable r10 = new androidx.media3.extractor.metadata.dvbsi.AppInfoTable
            r10.<init>(r0, r2)
            return r10
        L_0x01b4:
            androidx.media3.extractor.metadata.emsg.EventMessage r10 = new androidx.media3.extractor.metadata.emsg.EventMessage
            r10.<init>(r1)
            return r10
        L_0x01ba:
            androidx.media3.extractor.metadata.flac.PictureFrame r10 = new androidx.media3.extractor.metadata.flac.PictureFrame
            r10.<init>(r1)
            return r10
        L_0x01c0:
            androidx.media3.extractor.metadata.flac.VorbisComment r10 = new androidx.media3.extractor.metadata.flac.VorbisComment
            r10.<init>(r1)
            return r10
        L_0x01c6:
            androidx.media3.extractor.metadata.icy.IcyHeaders r10 = new androidx.media3.extractor.metadata.icy.IcyHeaders
            r10.<init>(r1)
            return r10
        L_0x01cc:
            androidx.media3.extractor.metadata.icy.IcyInfo r10 = new androidx.media3.extractor.metadata.icy.IcyInfo
            r10.<init>(r1)
            return r10
        L_0x01d2:
            androidx.media3.extractor.metadata.id3.ApicFrame r10 = new androidx.media3.extractor.metadata.id3.ApicFrame
            r10.<init>(r1)
            return r10
        L_0x01d8:
            androidx.media3.extractor.metadata.id3.BinaryFrame r10 = new androidx.media3.extractor.metadata.id3.BinaryFrame
            r10.<init>(r1)
            return r10
        L_0x01de:
            androidx.media3.extractor.metadata.id3.ChapterFrame r10 = new androidx.media3.extractor.metadata.id3.ChapterFrame
            r10.<init>(r1)
            return r10
        L_0x01e4:
            androidx.media3.extractor.metadata.id3.ChapterTocFrame r10 = new androidx.media3.extractor.metadata.id3.ChapterTocFrame
            r10.<init>(r1)
            return r10
        L_0x01ea:
            androidx.media3.extractor.metadata.id3.CommentFrame r10 = new androidx.media3.extractor.metadata.id3.CommentFrame
            r10.<init>(r1)
            return r10
        L_0x01f0:
            androidx.media3.extractor.metadata.id3.GeobFrame r10 = new androidx.media3.extractor.metadata.id3.GeobFrame
            r10.<init>(r1)
            return r10
        L_0x01f6:
            androidx.media3.extractor.metadata.id3.InternalFrame r10 = new androidx.media3.extractor.metadata.id3.InternalFrame
            r10.<init>(r1)
            return r10
        L_0x01fc:
            androidx.media3.extractor.metadata.id3.MlltFrame r10 = new androidx.media3.extractor.metadata.id3.MlltFrame
            r10.<init>(r1)
            return r10
        L_0x0202:
            androidx.media3.extractor.metadata.id3.PrivFrame r10 = new androidx.media3.extractor.metadata.id3.PrivFrame
            r10.<init>(r1)
            return r10
        L_0x0208:
            java.lang.String r3 = r1.readString()
            r3.getClass()
            java.lang.String r2 = r1.readString()
            java.lang.String[] r0 = r1.createStringArray()
            r0.getClass()
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.copyOf((java.lang.Object[]) r0)
            androidx.media3.extractor.metadata.id3.TextInformationFrame r10 = new androidx.media3.extractor.metadata.id3.TextInformationFrame
            r10.<init>(r3, r2, r0)
            return r10
        L_0x0224:
            androidx.media3.extractor.metadata.id3.UrlLinkFrame r10 = new androidx.media3.extractor.metadata.id3.UrlLinkFrame
            r10.<init>(r1)
            return r10
        L_0x022a:
            androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata r10 = new androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata
            r10.<init>(r1)
            return r10
        L_0x0230:
            java.util.ArrayList r2 = X.AnonymousClass7TE.A1C()
            java.lang.Class<androidx.media3.extractor.metadata.mp4.SlowMotionData$Segment> r0 = androidx.media3.extractor.metadata.mp4.SlowMotionData.Segment.class
            X.Pxe.A1O(r1, r0, r2)
            androidx.media3.extractor.metadata.mp4.SlowMotionData r10 = new androidx.media3.extractor.metadata.mp4.SlowMotionData
            r10.<init>(r2)
            return r10
        L_0x023f:
            long r11 = r1.readLong()
            long r13 = r1.readLong()
            int r15 = r1.readInt()
            androidx.media3.extractor.metadata.mp4.SlowMotionData$Segment r10 = new androidx.media3.extractor.metadata.mp4.SlowMotionData$Segment
            r10.<init>(r11, r13, r15)
            return r10
        L_0x0251:
            androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry r10 = new androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry
            r10.<init>(r1)
            return r10
        L_0x0257:
            androidx.media3.extractor.metadata.scte35.PrivateCommand r10 = new androidx.media3.extractor.metadata.scte35.PrivateCommand
            r10.<init>(r1)
            return r10
        L_0x025d:
            androidx.media3.extractor.metadata.scte35.SpliceInsertCommand r10 = new androidx.media3.extractor.metadata.scte35.SpliceInsertCommand
            r10.<init>(r1)
            return r10
        L_0x0263:
            androidx.media3.extractor.metadata.scte35.SpliceNullCommand r10 = new androidx.media3.extractor.metadata.scte35.SpliceNullCommand
            r10.<init>()
            return r10
        L_0x0269:
            androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand r10 = new androidx.media3.extractor.metadata.scte35.SpliceScheduleCommand
            r10.<init>(r1)
            return r10
        L_0x026f:
            long r2 = r1.readLong()
            long r0 = r1.readLong()
            androidx.media3.extractor.metadata.scte35.TimeSignalCommand r10 = new androidx.media3.extractor.metadata.scte35.TimeSignalCommand
            r10.<init>(r2, r0)
            return r10
        L_0x027d:
            androidx.media3.extractor.metadata.vorbis.VorbisComment r10 = new androidx.media3.extractor.metadata.vorbis.VorbisComment
            r10.<init>(r1)
            return r10
        L_0x0283:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            androidx.navigation.NavBackStackEntryState r10 = new androidx.navigation.NavBackStackEntryState
            r10.<init>(r1)
            return r10
        L_0x028d:
            int r0 = X.C41848B3p.A00(r1)
            androidx.paging.compose.PagingPlaceholderKey r10 = new androidx.paging.compose.PagingPlaceholderKey
            r10.<init>(r0)
            return r10
        L_0x0297:
            androidx.preference.EditTextPreference$SavedState r10 = new androidx.preference.EditTextPreference$SavedState
            r10.<init>((android.os.Parcel) r1)
            java.lang.String r0 = r1.readString()
            r10.A00 = r0
            return r10
        L_0x02a3:
            androidx.preference.ListPreference$SavedState r10 = new androidx.preference.ListPreference$SavedState
            r10.<init>((android.os.Parcel) r1)
            java.lang.String r0 = r1.readString()
            r10.A00 = r0
            return r10
        L_0x02af:
            androidx.preference.MultiSelectListPreference$SavedState r10 = new androidx.preference.MultiSelectListPreference$SavedState
            r10.<init>((android.os.Parcel) r1)
            int r2 = r1.readInt()
            java.util.HashSet r0 = X.AnonymousClass7TE.A1F()
            r10.A00 = r0
            java.lang.String[] r2 = new java.lang.String[r2]
            r1.readStringArray(r2)
            java.util.Set r0 = r10.A00
            java.util.Collections.addAll(r0, r2)
            return r10
        L_0x02c9:
            androidx.preference.Preference$BaseSavedState r10 = new androidx.preference.Preference$BaseSavedState
            r10.<init>((android.os.Parcel) r1)
            return r10
        L_0x02cf:
            androidx.preference.PreferenceGroup$SavedState r10 = new androidx.preference.PreferenceGroup$SavedState
            r10.<init>((android.os.Parcel) r1)
            int r0 = r1.readInt()
            r10.A00 = r0
            return r10
        L_0x02db:
            androidx.preference.SeekBarPreference$SavedState r10 = new androidx.preference.SeekBarPreference$SavedState
            r10.<init>((android.os.Parcel) r1)
            int r0 = r1.readInt()
            r10.A02 = r0
            int r0 = r1.readInt()
            r10.A01 = r0
            int r0 = r1.readInt()
            r10.A00 = r0
            return r10
        L_0x02f3:
            androidx.preference.TwoStatePreference$SavedState r10 = new androidx.preference.TwoStatePreference$SavedState
            r10.<init>((android.os.Parcel) r1)
            boolean r0 = X.Pxg.A1U(r1)
            r10.A00 = r0
            return r10
        L_0x02ff:
            androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState r10 = new androidx.recyclerview.widget.StaggeredGridLayoutManager$SavedState
            r10.<init>()
            int r0 = r1.readInt()
            r10.A00 = r0
            int r0 = r1.readInt()
            r10.A03 = r0
            int r0 = r1.readInt()
            r10.A02 = r0
            if (r0 <= 0) goto L_0x031f
            int[] r0 = new int[r0]
            r10.A09 = r0
            r1.readIntArray(r0)
        L_0x031f:
            int r0 = r1.readInt()
            r10.A01 = r0
            if (r0 <= 0) goto L_0x032e
            int[] r0 = new int[r0]
            r10.A08 = r0
            r1.readIntArray(r0)
        L_0x032e:
            int r2 = r1.readInt()
            r0 = 1
            boolean r0 = X.AnonymousClass7TF.A1S(r2, r0)
            r10.A07 = r0
            boolean r0 = X.DbY.A1X(r1)
            r10.A05 = r0
            boolean r0 = X.Pxg.A1V(r1)
            r10.A06 = r0
            java.lang.Class<androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem> r0 = androidx.recyclerview.widget.StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.class
            java.lang.ClassLoader r0 = r0.getClassLoader()
            java.util.ArrayList r0 = r1.readArrayList(r0)
            r10.A04 = r0
            return r10
        L_0x0352:
            androidx.swiperefreshlayout.widget.SwipeRefreshLayout$SavedState r10 = new androidx.swiperefreshlayout.widget.SwipeRefreshLayout$SavedState
            r10.<init>(r1)
            return r10
        L_0x0358:
            androidx.test.internal.util.ParcelableIBinder r10 = new androidx.test.internal.util.ParcelableIBinder
            r10.<init>(r1)
            return r10
        L_0x035e:
            androidx.versionedparcelable.ParcelImpl r10 = new androidx.versionedparcelable.ParcelImpl
            r10.<init>(r1)
            return r10
        L_0x0364:
            androidx.work.multiprocess.parcelable.ParcelableConstraints r10 = new androidx.work.multiprocess.parcelable.ParcelableConstraints
            r10.<init>((android.os.Parcel) r1)
            return r10
        L_0x036a:
            androidx.work.multiprocess.parcelable.ParcelableData r10 = new androidx.work.multiprocess.parcelable.ParcelableData
            r10.<init>((android.os.Parcel) r1)
            return r10
        L_0x0370:
            androidx.work.multiprocess.parcelable.ParcelableForegroundRequestInfo r10 = new androidx.work.multiprocess.parcelable.ParcelableForegroundRequestInfo
            r10.<init>(r1)
            return r10
        L_0x0376:
            java.lang.String r2 = X.C41848B3p.A1D(r1)
            X.0qQ.A0A(r2)
            int r0 = r1.readInt()
            androidx.work.multiprocess.parcelable.ParcelableInterruptRequest r10 = new androidx.work.multiprocess.parcelable.ParcelableInterruptRequest
            r10.<init>(r2, r0)
            return r10
        L_0x0387:
            androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest r10 = new androidx.work.multiprocess.parcelable.ParcelableRemoteWorkRequest
            r10.<init>(r1)
            return r10
        L_0x038d:
            androidx.work.multiprocess.parcelable.ParcelableResult r10 = new androidx.work.multiprocess.parcelable.ParcelableResult
            r10.<init>(r1)
            return r10
        L_0x0393:
            androidx.work.multiprocess.parcelable.ParcelableRuntimeExtras r10 = new androidx.work.multiprocess.parcelable.ParcelableRuntimeExtras
            r10.<init>(r1)
            return r10
        L_0x0399:
            androidx.work.multiprocess.parcelable.ParcelableUpdateRequest r10 = new androidx.work.multiprocess.parcelable.ParcelableUpdateRequest
            r10.<init>(r1)
            return r10
        L_0x039f:
            androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl r10 = new androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl
            r10.<init>()
            boolean r0 = X.Pxg.A1U(r1)
            r2 = 0
            if (r0 == 0) goto L_0x03d5
            java.lang.String r7 = r1.readString()
        L_0x03af:
            int r3 = r1.readInt()
            java.lang.Integer[] r0 = androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl.A01
            r6 = r0[r3]
            int r9 = r1.readInt()
            java.util.ArrayList r5 = X.DbS.A0v(r9)
            java.lang.ClassLoader r8 = X.Pxf.A0W(r10)
            r4 = 0
            r3 = 0
        L_0x03c5:
            if (r3 >= r9) goto L_0x03d7
            android.os.Parcelable r0 = r1.readParcelable(r8)
            androidx.work.multiprocess.parcelable.ParcelableWorkRequest r0 = (androidx.work.multiprocess.parcelable.ParcelableWorkRequest) r0
            X.9En r0 = r0.A00
            r5.add(r0)
            int r3 = r3 + 1
            goto L_0x03c5
        L_0x03d5:
            r7 = r2
            goto L_0x03af
        L_0x03d7:
            int r3 = r1.readInt()
            r0 = 1
            if (r3 != r0) goto L_0x03f6
            int r3 = r1.readInt()
            java.util.ArrayList r2 = X.DbS.A0v(r3)
        L_0x03e6:
            if (r4 >= r3) goto L_0x03f6
            android.os.Parcelable r0 = r1.readParcelable(r8)
            androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl r0 = (androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl) r0
            X.SF3 r0 = r0.A00
            r2.add(r0)
            int r4 = r4 + 1
            goto L_0x03e6
        L_0x03f6:
            X.SF3 r0 = new X.SF3
            r0.<init>(r6, r7, r5, r2)
            r10.A00 = r0
            return r10
        L_0x03fe:
            androidx.work.multiprocess.parcelable.ParcelableWorkInfo r10 = new androidx.work.multiprocess.parcelable.ParcelableWorkInfo
            r10.<init>((android.os.Parcel) r1)
            return r10
        L_0x0404:
            androidx.work.multiprocess.parcelable.ParcelableWorkInfos r10 = new androidx.work.multiprocess.parcelable.ParcelableWorkInfos
            r10.<init>((android.os.Parcel) r1)
            return r10
        L_0x040a:
            androidx.work.multiprocess.parcelable.ParcelableWorkQuery r10 = new androidx.work.multiprocess.parcelable.ParcelableWorkQuery
            r10.<init>(r1)
            return r10
        L_0x0410:
            androidx.work.multiprocess.parcelable.ParcelableWorkRequest r10 = new androidx.work.multiprocess.parcelable.ParcelableWorkRequest
            r10.<init>((android.os.Parcel) r1)
            return r10
        L_0x0416:
            androidx.work.multiprocess.parcelable.ParcelableWorkRequests r10 = new androidx.work.multiprocess.parcelable.ParcelableWorkRequests
            r10.<init>(r1)
            return r10
        L_0x041c:
            androidx.work.multiprocess.parcelable.ParcelableWorkerParameters r10 = new androidx.work.multiprocess.parcelable.ParcelableWorkerParameters
            r10.<init>((android.os.Parcel) r1)
            return r10
        L_0x0422:
            com.airbnb.lottie.LottieAnimationView$SavedState r10 = new com.airbnb.lottie.LottieAnimationView$SavedState
            r10.<init>(r1)
            java.lang.String r0 = r1.readString()
            r10.A04 = r0
            float r0 = r1.readFloat()
            r10.A00 = r0
            boolean r0 = X.Pxg.A1U(r1)
            r10.A06 = r0
            java.lang.String r0 = r1.readString()
            r10.A05 = r0
            int r0 = r1.readInt()
            r10.A03 = r0
            int r0 = r1.readInt()
            r10.A02 = r0
            return r10
        L_0x044c:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager$SavedState r10 = new com.bloks.stdlib.components.bkcomponentscollection.StickyHeadersLinearLayoutManager$SavedState
            r10.<init>(r1)
            return r10
        L_0x0456:
            java.lang.String r11 = X.C41848B3p.A1D(r1)
            java.lang.String r12 = r1.readString()
            java.lang.String r13 = r1.readString()
            java.lang.String r14 = r1.readString()
            java.lang.String r15 = r1.readString()
            com.encryptedbackups.storagemanagers.otc.model.OneTimeCodeDevice r10 = new com.encryptedbackups.storagemanagers.otc.model.OneTimeCodeDevice
            r10.<init>(r11, r12, r13, r14, r15)
            return r10
        L_0x0470:
            com.facebook.AccessToken r10 = new com.facebook.AccessToken
            r10.<init>(r1)
            return r10
        L_0x0476:
            com.facebook.advancedcryptotransport.model.PeerDevice r10 = new com.facebook.advancedcryptotransport.model.PeerDevice
            r10.<init>(r1)
            return r10
        L_0x047c:
            com.facebook.advancedcryptotransport.model.SecurityAlert r10 = new com.facebook.advancedcryptotransport.model.SecurityAlert
            r10.<init>(r1)
            return r10
        L_0x0482:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCall r10 = new com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCall
            r10.<init>(r1)
            return r10
        L_0x048c:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCallResult r10 = new com.facebook.android.instantexperiences.autofill.RequestAutofillJSBridgeCallResult
            r10.<init>((android.os.Parcel) r1)
            return r10
        L_0x0496:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.facebook.android.instantexperiences.autofill.model.AddressAutofillData r10 = new com.facebook.android.instantexperiences.autofill.model.AddressAutofillData
            r10.<init>((android.os.Parcel) r1)
            return r10
        L_0x04a0:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.facebook.android.instantexperiences.autofill.model.EmailAutofillData r10 = new com.facebook.android.instantexperiences.autofill.model.EmailAutofillData
            r10.<init>((android.os.Parcel) r1)
            return r10
        L_0x04aa:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.facebook.android.instantexperiences.autofill.model.NameAutofillData r10 = new com.facebook.android.instantexperiences.autofill.model.NameAutofillData
            r10.<init>((android.os.Parcel) r1)
            return r10
        L_0x04b4:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData r10 = new com.facebook.android.instantexperiences.autofill.model.TelephoneAutofillData
            r10.<init>((android.os.Parcel) r1)
            return r10
        L_0x04be:
            r0 = 0
            X.0qQ.A0B(r1, r0)
            com.facebook.android.instantexperiences.autofill.save.SaveAutofillDataJSBridgeCall r10 = new com.facebook.android.instantexperiences.autofill.save.SaveAutofillDataJSBridgeCall
            r10.<init>(r1)
            return r10
        L_0x04c8:
            com.facebook.android.instantexperiences.jscall.InstantExperienceGenericErrorResult r10 = new com.facebook.android.instantexperiences.jscall.InstantExperienceGenericErrorResult
            r10.<init>((android.os.Parcel) r1)
            return r10
        L_0x04ce:
            com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCall r10 = new com.facebook.android.instantexperiences.payment.CanMakePaymentJSBridgeCall
            r10.<init>(r1)
            return r10
        L_0x04d4:
            com.facebook.android.instantexperiences.core.IGInstantExperiencesFeatureEnabledList r10 = new com.facebook.android.instantexperiences.core.IGInstantExperiencesFeatureEnabledList     // Catch:{ JSONException -> 0x04da }
            r10.<init>()     // Catch:{ JSONException -> 0x04da }
            return r10
        L_0x04da:
            r2 = move-exception
            java.lang.String r1 = "IGInstantExperiencesFeatureEnabledList"
            java.lang.String r0 = "Failed to create feature enabled list"
            X.0KC.A0F(r1, r0, r2)
            r10 = 0
            return r10
        L_0x04e4:
            r5.isEmpty()     // Catch:{ BadParcelableException -> 0x04e8 }
            goto L_0x04f0
        L_0x04e8:
            java.lang.String r1 = "MediaSessionCompat"
            java.lang.String r0 = "Could not unparcel the data."
            android.util.Log.e(r1, r0)
            r5 = r10
        L_0x04f0:
            java.lang.String r3 = "android.support.v4.media.description.MEDIA_URI"
            if (r5 == 0) goto L_0x0514
            android.os.Parcelable r9 = r5.getParcelable(r3)
            android.net.Uri r9 = (android.net.Uri) r9
            if (r9 == 0) goto L_0x051c
            java.lang.String r2 = "android.support.v4.media.description.NULL_BUNDLE_FLAG"
            boolean r0 = r5.containsKey(r2)
            if (r0 == 0) goto L_0x0516
            int r1 = r5.size()
            r0 = 2
            if (r1 != r0) goto L_0x0516
        L_0x050b:
            android.support.v4.media.MediaDescriptionCompat r6 = new android.support.v4.media.MediaDescriptionCompat
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14)
            r10 = r6
            r6.A00 = r4
            return r10
        L_0x0514:
            r9 = r10
            goto L_0x051c
        L_0x0516:
            r5.remove(r3)
            r5.remove(r2)
        L_0x051c:
            r10 = r5
            if (r9 != 0) goto L_0x050b
            android.net.Uri r9 = r4.getMediaUri()
            goto L_0x050b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7216Pzk.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        switch (this.A00) {
            case 0:
                return new MediaBrowserCompat$MediaItem[i];
            case 1:
                return new MediaDescriptionCompat[i];
            case 2:
                return new MediaMetadataCompat[i];
            case 3:
                return new RatingCompat[i];
            case 4:
                return new MediaSessionCompat$QueueItem[i];
            case 5:
                return new MediaSessionCompat$ResultReceiverWrapper[i];
            case 6:
                return new MediaSessionCompat$Token[i];
            case 7:
                return new ParcelableVolumeInfo[i];
            case 8:
                return new PlaybackStateCompat[i];
            case 9:
                return new PlaybackStateCompat.CustomAction[i];
            case 10:
                return new ResultReceiver[i];
            case 11:
                return new ActionMenuPresenter$SavedState[i];
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                return new AppCompatSpinner$SavedState[i];
            case 13:
                return new DefaultLazyKey[i];
            case 14:
                return new ParcelableSnapshotMutableDoubleState[i];
            case 15:
                return new NestedScrollView.SavedState[i];
            case 16:
                return new DrmInitData[i];
            case 17:
                return new DrmInitData.SchemeData[i];
            case EglBase14Impl.EGLExt_SDK_VERSION /*18*/:
                return new Metadata[i];
            case 19:
                return new StreamKey[i];
            case 20:
                return new MdtaMetadataEntry[i];
            case 21:
                return new Mp4LocationData[i];
            case 22:
                return new Mp4OrientationData[i];
            case 23:
                return new Mp4TimestampData[i];
            case 24:
                return new XmpData[i];
            case 25:
                return new DownloadRequest[i];
            case 26:
                return new Requirements[i];
            case 27:
                return new AppInfoTable[i];
            case 28:
                return new EventMessage[i];
            case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL /*29*/:
                return new PictureFrame[i];
            case 30:
                return new VorbisComment[i];
            case 31:
                return new IcyHeaders[i];
            case 32:
                return new IcyInfo[i];
            case 33:
                return new ApicFrame[i];
            case 34:
                return new BinaryFrame[i];
            case 35:
                return new ChapterFrame[i];
            case 36:
                return new ChapterTocFrame[i];
            case 37:
                return new CommentFrame[i];
            case 38:
                return new GeobFrame[i];
            case 39:
                return new InternalFrame[i];
            case 40:
                return new MlltFrame[i];
            case Seq.NULL_REFNUM /*41*/:
                return new PrivFrame[i];
            case Seq.RefTracker.REF_OFFSET /*42*/:
                return new TextInformationFrame[i];
            case 43:
                return new UrlLinkFrame[i];
            case 44:
                return new MotionPhotoMetadata[i];
            case 45:
                return new SlowMotionData[i];
            case 46:
                return new SlowMotionData.Segment[i];
            case 47:
                return new SmtaMetadataEntry[i];
            case 48:
                return new PrivateCommand[i];
            case 49:
                return new SpliceInsertCommand[i];
            case BurnerSendSettingsHelper.MESSAGE_SEND_BATCH_SIZE /*50*/:
                return new SpliceNullCommand[i];
            case 51:
                return new SpliceScheduleCommand[i];
            case 52:
                return new TimeSignalCommand[i];
            case 53:
                return new androidx.media3.extractor.metadata.vorbis.VorbisComment[i];
            case 54:
                return new NavBackStackEntryState[i];
            case 55:
                return new PagingPlaceholderKey[i];
            case 56:
                return new EditTextPreference.SavedState[i];
            case 57:
                return new ListPreference.SavedState[i];
            case 58:
                return new MultiSelectListPreference.SavedState[i];
            case 59:
                return new Preference.BaseSavedState[i];
            case 60:
                return new PreferenceGroup.SavedState[i];
            case 61:
                return new SeekBarPreference.SavedState[i];
            case 62:
                return new TwoStatePreference.SavedState[i];
            case 63:
                return new StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem[i];
            case 64:
                return new StaggeredGridLayoutManager.SavedState[i];
            case 65:
                return new SwipeRefreshLayout$SavedState[i];
            case 66:
                return new ParcelableIBinder[i];
            case 67:
                return new ParcelImpl[i];
            case 68:
                return new ParcelableConstraints[i];
            case 69:
                return new ParcelableData[i];
            case 70:
                return new ParcelableForegroundRequestInfo[i];
            case 71:
                return new ParcelableInterruptRequest[i];
            case 72:
                return new ParcelableRemoteWorkRequest[i];
            case 73:
                return new ParcelableResult[i];
            case 74:
                return new ParcelableRuntimeExtras[i];
            case 75:
                return new ParcelableUpdateRequest[i];
            case 76:
                return new ParcelableWorkContinuationImpl[i];
            case 77:
                return new ParcelableWorkInfo[i];
            case 78:
                return new ParcelableWorkInfos[i];
            case 79:
                return new ParcelableWorkQuery[i];
            case 80:
                return new ParcelableWorkRequest[i];
            case 81:
                return new ParcelableWorkRequests[i];
            case 82:
                return new ParcelableWorkerParameters[i];
            case 83:
                return new LottieAnimationView$SavedState[i];
            case 84:
                return new StickyHeadersLinearLayoutManager.SavedState[i];
            case 85:
                return new OneTimeCodeDevice[i];
            case 86:
                return new AccessToken[i];
            case 87:
                return new PeerDevice[i];
            case 88:
                return new SecurityAlert[i];
            case 89:
                return new RequestAutofillJSBridgeCall[i];
            case 90:
                return new RequestAutofillJSBridgeCallResult[i];
            case 91:
                return new AddressAutofillData[i];
            case 92:
                return new EmailAutofillData[i];
            case 93:
                return new NameAutofillData[i];
            case 94:
                return new TelephoneAutofillData[i];
            case 95:
                return new SaveAutofillDataJSBridgeCall[i];
            case 96:
                return new IGInstantExperiencesFeatureEnabledList[i];
            case 97:
                return new InstantExperienceGenericErrorResult[i];
            case 98:
                return new CanMakePaymentJSBridgeCall[i];
            default:
                return new CanMakePaymentJSBridgeCallResult[i];
        }
    }
}
