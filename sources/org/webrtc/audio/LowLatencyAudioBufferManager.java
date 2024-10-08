package org.webrtc.audio;

import android.media.AudioTrack;
import org.webrtc.Logging;

public class LowLatencyAudioBufferManager {
    public static final String TAG = "LowLatencyAudioBufferManager";
    public int bufferIncreaseCounter = 0;
    public boolean keepLoweringBufferSize = true;
    public int prevUnderrunCount = 0;
    public int ticksUntilNextDecrease = 10;

    public void maybeAdjustBufferSize(AudioTrack audioTrack) {
        int underrunCount = audioTrack.getUnderrunCount();
        if (underrunCount > this.prevUnderrunCount) {
            if (this.bufferIncreaseCounter < 5) {
                int bufferSizeInFrames = audioTrack.getBufferSizeInFrames();
                boolean z = Logging.loggingEnabled;
                audioTrack.setBufferSizeInFrames((audioTrack.getPlaybackRate() / 100) + bufferSizeInFrames);
                this.bufferIncreaseCounter++;
            }
            this.keepLoweringBufferSize = false;
            this.prevUnderrunCount = underrunCount;
        } else if (this.keepLoweringBufferSize) {
            int i = this.ticksUntilNextDecrease - 1;
            this.ticksUntilNextDecrease = i;
            if (i <= 0) {
                int playbackRate = audioTrack.getPlaybackRate() / 100;
                int bufferSizeInFrames2 = audioTrack.getBufferSizeInFrames();
                int max = Math.max(playbackRate, bufferSizeInFrames2 - playbackRate);
                if (max != bufferSizeInFrames2) {
                    boolean z2 = Logging.loggingEnabled;
                    audioTrack.setBufferSizeInFrames(max);
                }
            } else {
                return;
            }
        } else {
            return;
        }
        this.ticksUntilNextDecrease = 10;
    }
}
