package org.webrtc.audio;

import android.media.AudioManager;
import java.util.Timer;
import java.util.TimerTask;
import org.webrtc.Logging;

public class VolumeLogger {
    public static final String TAG = "VolumeLogger";
    public static final String THREAD_NAME = "WebRtcVolumeLevelLoggerThread";
    public static final int TIMER_PERIOD_IN_SECONDS = 30;
    public final AudioManager audioManager;
    public Timer timer;

    public class LogVolumeTask extends TimerTask {
        public final int maxRingVolume;
        public final int maxVoiceCallVolume;

        public LogVolumeTask(int i, int i2) {
            this.maxRingVolume = i;
            this.maxVoiceCallVolume = i2;
        }

        public void run() {
            AudioManager audioManager;
            int i;
            int mode = VolumeLogger.this.audioManager.getMode();
            if (mode == 1) {
                audioManager = VolumeLogger.this.audioManager;
                i = 2;
            } else if (mode == 3) {
                audioManager = VolumeLogger.this.audioManager;
                i = 0;
            } else {
                return;
            }
            audioManager.getStreamVolume(i);
            boolean z = Logging.loggingEnabled;
        }
    }

    public VolumeLogger(AudioManager audioManager2) {
        this.audioManager = audioManager2;
    }

    public void start() {
        WebRtcAudioUtils.getThreadInfo();
        boolean z = Logging.loggingEnabled;
        if (this.timer == null) {
            this.audioManager.getMode();
            Timer timer2 = new Timer("WebRtcVolumeLevelLoggerThread");
            this.timer = timer2;
            timer2.schedule(new LogVolumeTask(this.audioManager.getStreamMaxVolume(2), this.audioManager.getStreamMaxVolume(0)), 0, 30000);
        }
    }

    public void stop() {
        WebRtcAudioUtils.getThreadInfo();
        boolean z = Logging.loggingEnabled;
        Timer timer2 = this.timer;
        if (timer2 != null) {
            timer2.cancel();
            this.timer = null;
        }
    }
}
