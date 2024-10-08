package X;

import android.media.AudioFormat;
import android.media.AudioPlaybackCaptureConfiguration;
import android.media.AudioRecord;
import android.media.projection.MediaProjection;

public abstract class XVT {
    public static final AudioRecord A00(MediaProjection mediaProjection, int i) {
        AudioPlaybackCaptureConfiguration build = new AudioPlaybackCaptureConfiguration.Builder(mediaProjection).addMatchingUsage(14).addMatchingUsage(1).addMatchingUsage(0).build();
        0qQ.A07(build);
        AudioRecord build2 = new AudioRecord.Builder().setAudioFormat(new AudioFormat.Builder().setEncoding(2).setSampleRate(16000).setChannelMask(16).build()).setAudioPlaybackCaptureConfig(build).setBufferSizeInBytes(i).build();
        0qQ.A07(build2);
        return build2;
    }
}
