package X;

import android.net.Uri;
import java.util.List;

/* renamed from: X.Vil  reason: case insensitive filesystem */
public final class C17954Vil {
    public final List A00;

    public C17954Vil(List list) {
        0qQ.A0B(list, 1);
        this.A00 = list;
    }

    public final void A00(Object obj) {
        String str;
        String valueOf;
        String str2;
        String str3;
        if (obj instanceof AnonymousClass4OI) {
            AnonymousClass4OI r5 = (AnonymousClass4OI) obj;
            str = "VideoPlayRequest";
            A01(str, "mClientPlayerType", r5.A06);
            A01(str, "mRenderMode", String.valueOf(r5.A00));
            String valueOf2 = String.valueOf(false);
            A01(str, "mIsApiBroadcast", valueOf2);
            A01(str, "mPlayLowestQuality", String.valueOf(r5.A0C));
            A01(str, "mPrepareExoplayerUponPrepare", String.valueOf(r5.A0D));
            A01(str, "mReadAheadBufferPolicy", "DEFAULT");
            A01(str, "mStartPositionMs", String.valueOf(r5.A01));
            A01(str, "mCanRaisePriority", valueOf2);
            A01(str, "mWatermarkInPauseMs", String.valueOf(r5.A02));
            A01(str, "mOverridingPlayerWatermarkBeforePlayedMs", String.valueOf(r5.A0H));
            A01(str, "mOverridingPlayerWarmUpWatermarkMs", String.valueOf(r5.A0G));
            A01(str, "mLoadDataBeforePlayed", String.valueOf(r5.A0T));
            A01(str, "mSeekToPreviousKeyFrame", valueOf2);
            A01(str, "mEnableLazyAudioLoading", String.valueOf(r5.A0R));
            A01(str, "mBufferForUnpausePlaybackFactor", String.valueOf(1.0f));
            A01(str, "mAudioFocusType", String.valueOf(1));
            A01(str, "mShouldCropToFit", String.valueOf(r5.A0V));
            valueOf = String.valueOf(r5.A0U);
            str2 = "mNeedCentering";
        } else if (obj instanceof C255653uU) {
            C255653uU r52 = (C255653uU) obj;
            Uri uri = r52.A05;
            String str4 = "";
            if (uri != null) {
                str3 = String.valueOf(uri);
            } else {
                str3 = str4;
            }
            str = "VideoSource";
            A01(str, "mUri", str3);
            Uri uri2 = r52.A04;
            if (uri2 != null) {
                str4 = String.valueOf(uri2);
            }
            A01(str, "mSubtitleUri", str4);
            A01(str, "mVideoId", r52.A0G);
            A01(str, "mManifestContent", r52.A09);
            A01(str, "mVideoCodec", r52.A0F);
            A01(str, "mPlayOrigin", r52.A0A);
            A01(str, "mPlaySubOrigin", r52.A0B);
            A01(str, "mVideoType", r52.A07.toString());
            A01(str, "mTrackerId", r52.A0E);
            A01(str, "mIsSpherical", String.valueOf(r52.A0M));
            A01(str, "mIsSponsored", String.valueOf(r52.A0N));
            A01(str, "mIsLiveTraceEnabled", String.valueOf(r52.A0L));
            A01(str, "mIsAudioDataListenerEnabled", String.valueOf(r52.A0K));
            A01(str, "mRenderMode", r52.A0D);
            A01(str, "mIsBroadcast", String.valueOf(false));
            A01(str, "mContentType", r52.A06.toString());
            valueOf = r52.A01().toString();
            str2 = "isValid()";
        } else if (obj instanceof C263674Mx) {
            C263674Mx r53 = (C263674Mx) obj;
            str = "ServicePlayerState";
            A01(str, "mTimeMs", String.valueOf(r53.A0H));
            A01(str, "mIsPlaying", String.valueOf(r53.A0Q));
            A01(str, "mIsVisuallyPlaying", String.valueOf(r53.A0R));
            A01(str, "mIsBuffering", String.valueOf(r53.A0O));
            A01(str, "mDuration", String.valueOf(r53.A0U));
            A01(str, "mAudioDuration", String.valueOf(r53.A09));
            A01(str, "mAbsoluteCurrentPosition", String.valueOf(r53.A08));
            A01(str, "mRelativeCurrentPosition", String.valueOf(r53.A0D));
            A01(str, "mBufferedPosition", String.valueOf(r53.A0B));
            A01(str, "mStreamingFormat", r53.A0M);
            A01(str, "mStallStart", String.valueOf(r53.A0E));
            A01(str, "mStallStop", String.valueOf(r53.A0F));
            A01(str, "mNumDashStreams", String.valueOf(r53.A05));
            A01(str, "mNumDashAudioStreams", String.valueOf(r53.A04));
            A01(str, "mExecutedSeekRequestSeqNum", String.valueOf(r53.A0C));
            A01(str, "mIsMixedCodecManifest", String.valueOf(r53.A0P));
            A01(str, "mVideoCodecSwitchedDuringPlayback", String.valueOf(r53.A0S));
            valueOf = r53.A0L;
            str2 = "mManifestFilteringLog";
        } else if (obj instanceof C263684My) {
            C263684My r54 = (C263684My) obj;
            str = "LiveState";
            A01(str, "mTimeMs", String.valueOf(r54.A09));
            A01(str, "mLiveManifestFirstAvTimeMs", String.valueOf(r54.A03));
            A01(str, "mStaleManifestCount", String.valueOf(r54.A00));
            A01(str, "mLiveManifestServerTimeMs", String.valueOf(r54.A07));
            A01(str, "mLiveManifestLastVideoFrameTimeMs", String.valueOf(r54.A06));
            A01(str, "mPublishFrameTime", String.valueOf(r54.A08));
            valueOf = String.valueOf(r54.A02);
            str2 = "mLiveEdgePositionMs";
        } else {
            return;
        }
        A01(str, str2, valueOf);
    }

    public final void A01(String str, String str2, String str3) {
        this.A00.add(new C17822Vgb(str, str2, str3));
    }
}
