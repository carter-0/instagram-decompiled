package org.webrtc;

import X.AnonymousClass7TF;
import org.webrtc.EncodedImage;

public interface VideoEncoder {

    /* renamed from: org.webrtc.VideoEncoder$-CC  reason: invalid class name */
    public abstract /* synthetic */ class CC {
        public static EncoderInfo $default$getEncoderInfo(VideoEncoder videoEncoder) {
            return new EncoderInfo(1, false);
        }

        public static ResolutionBitrateLimits[] $default$getResolutionBitrateLimits(VideoEncoder videoEncoder) {
            return new ResolutionBitrateLimits[0];
        }

        public static boolean $default$isHardwareEncoder(VideoEncoder videoEncoder) {
            return true;
        }

        public static VideoCodecStatus $default$setRates(VideoEncoder videoEncoder, RateControlParameters rateControlParameters) {
            return videoEncoder.setRateAllocation(rateControlParameters.bitrate, (int) Math.ceil(rateControlParameters.framerateFps));
        }

        public static long $default$createNative(VideoEncoder videoEncoder, long j) {
            return 0;
        }
    }

    public class BitrateAllocation {
        public final int[][] bitratesBbs;

        public int getSum() {
            int i = 0;
            for (int[] iArr : this.bitratesBbs) {
                for (int i2 : r7[r5]) {
                    i += i2;
                }
            }
            return i;
        }

        public BitrateAllocation(int[][] iArr) {
            this.bitratesBbs = iArr;
        }
    }

    public interface Callback {
        void onEncodedFrame(EncodedImage encodedImage, CodecSpecificInfo codecSpecificInfo);
    }

    public class CodecSpecificInfo {
    }

    public class CodecSpecificInfoH264 extends CodecSpecificInfo {
    }

    public class CodecSpecificInfoVP8 extends CodecSpecificInfo {
    }

    public class CodecSpecificInfoVP9 extends CodecSpecificInfo {
    }

    public class EncoderInfo {
        public final boolean applyAlignmentToAllSimulcastLayers;
        public final int requestedResolutionAlignment;

        public boolean getApplyAlignmentToAllSimulcastLayers() {
            return this.applyAlignmentToAllSimulcastLayers;
        }

        public int getRequestedResolutionAlignment() {
            return this.requestedResolutionAlignment;
        }

        public EncoderInfo(int i, boolean z) {
            this.requestedResolutionAlignment = i;
            this.applyAlignmentToAllSimulcastLayers = z;
        }
    }

    public class ScalingSettings {
        public static final ScalingSettings OFF = new ScalingSettings();
        public final Integer high;
        public final Integer low;
        public final boolean on;

        public String toString() {
            if (!this.on) {
                return "OFF";
            }
            StringBuilder sb = new StringBuilder();
            sb.append("[ ");
            sb.append(this.low);
            sb.append(", ");
            sb.append(this.high);
            return AnonymousClass7TF.A0l(" ]", sb);
        }

        @Deprecated
        public ScalingSettings(boolean z, int i, int i2) {
            this.on = z;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }

        public ScalingSettings(int i, int i2) {
            this.on = true;
            this.low = Integer.valueOf(i);
            this.high = Integer.valueOf(i2);
        }

        @Deprecated
        public ScalingSettings(boolean z) {
            this.on = z;
            this.low = null;
            this.high = null;
        }

        public ScalingSettings() {
            this.on = false;
            this.low = null;
            this.high = null;
        }
    }

    long createNative(long j);

    VideoCodecStatus encode(VideoFrame videoFrame, EncodeInfo encodeInfo);

    EncoderInfo getEncoderInfo();

    String getImplementationName();

    ResolutionBitrateLimits[] getResolutionBitrateLimits();

    ScalingSettings getScalingSettings();

    VideoCodecStatus initEncode(Settings settings, Callback callback);

    boolean isHardwareEncoder();

    VideoCodecStatus release();

    VideoCodecStatus setRateAllocation(BitrateAllocation bitrateAllocation, int i);

    VideoCodecStatus setRates(RateControlParameters rateControlParameters);

    public class Capabilities {
        public final boolean lossNotification;

        public Capabilities(boolean z) {
            this.lossNotification = z;
        }
    }

    public class EncodeInfo {
        public final EncodedImage.FrameType[] frameTypes;

        public EncodeInfo(EncodedImage.FrameType[] frameTypeArr) {
            this.frameTypes = frameTypeArr;
        }
    }

    public class RateControlParameters {
        public final BitrateAllocation bitrate;
        public final double framerateFps;

        public RateControlParameters(BitrateAllocation bitrateAllocation, double d) {
            this.bitrate = bitrateAllocation;
            this.framerateFps = d;
        }
    }

    public class ResolutionBitrateLimits {
        public final int frameSizePixels;
        public final int maxBitrateBps;
        public final int minBitrateBps;
        public final int minStartBitrateBps;

        public ResolutionBitrateLimits(int i, int i2, int i3, int i4) {
            this.frameSizePixels = i;
            this.minStartBitrateBps = i2;
            this.minBitrateBps = i3;
            this.maxBitrateBps = i4;
        }

        public int getFrameSizePixels() {
            return this.frameSizePixels;
        }

        public int getMaxBitrateBps() {
            return this.maxBitrateBps;
        }

        public int getMinBitrateBps() {
            return this.minBitrateBps;
        }

        public int getMinStartBitrateBps() {
            return this.minStartBitrateBps;
        }
    }

    public class Settings {
        public final boolean automaticResizeOn;
        public final Capabilities capabilities;
        public final int height;
        public final int maxFramerate;
        public final int numberOfCores;
        public final int numberOfSimulcastStreams;
        public final int startBitrate;
        public final int width;

        @Deprecated
        public Settings(int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
            this(i, i2, i3, i4, i5, i6, z, new Capabilities(false));
        }

        public Settings(int i, int i2, int i3, int i4, int i5, int i6, boolean z, Capabilities capabilities2) {
            this.numberOfCores = i;
            this.width = i2;
            this.height = i3;
            this.startBitrate = i4;
            this.maxFramerate = i5;
            this.numberOfSimulcastStreams = i6;
            this.automaticResizeOn = z;
            this.capabilities = capabilities2;
        }
    }
}
