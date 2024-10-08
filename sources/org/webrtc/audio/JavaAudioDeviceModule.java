package org.webrtc.audio;

import X.Pxe;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioManager;
import org.webrtc.JniCommon;
import org.webrtc.Logging;
import org.webrtc.MediaStreamTrack;

public class JavaAudioDeviceModule implements AudioDeviceModule {
    public static final String TAG = "JavaAudioDeviceModule";
    public final WebRtcAudioRecord audioInput;
    public final AudioManager audioManager;
    public final WebRtcAudioTrack audioOutput;
    public final Context context;
    public final int inputSampleRate;
    public long nativeAudioDeviceModule;
    public final Object nativeLock;
    public final int outputSampleRate;
    public final boolean useStereoInput;
    public final boolean useStereoOutput;

    public interface AudioRecordErrorCallback {
        void onWebRtcAudioRecordError(String str);

        void onWebRtcAudioRecordInitError(String str);

        void onWebRtcAudioRecordStartError(AudioRecordStartErrorCode audioRecordStartErrorCode, String str);
    }

    public enum AudioRecordStartErrorCode {
        AUDIO_RECORD_START_EXCEPTION,
        AUDIO_RECORD_START_STATE_MISMATCH
    }

    public interface AudioRecordStateCallback {
        void onWebRtcAudioRecordStart();

        void onWebRtcAudioRecordStop();
    }

    public interface AudioTrackErrorCallback {
        void onWebRtcAudioTrackError(String str);

        void onWebRtcAudioTrackInitError(String str);

        void onWebRtcAudioTrackStartError(AudioTrackStartErrorCode audioTrackStartErrorCode, String str);
    }

    public enum AudioTrackStartErrorCode {
        AUDIO_TRACK_START_EXCEPTION,
        AUDIO_TRACK_START_STATE_MISMATCH
    }

    public interface AudioTrackStateCallback {
        void onWebRtcAudioTrackStart();

        void onWebRtcAudioTrackStop();
    }

    public class Builder {
        public AudioAttributes audioAttributes;
        public int audioFormat;
        public final AudioManager audioManager;
        public AudioRecordErrorCallback audioRecordErrorCallback;
        public AudioRecordStateCallback audioRecordStateCallback;
        public int audioSource;
        public AudioTrackErrorCallback audioTrackErrorCallback;
        public AudioTrackStateCallback audioTrackStateCallback;
        public final Context context;
        public int inputSampleRate;
        public int outputSampleRate;
        public SamplesReadyCallback samplesReadyCallback;
        public boolean useHardwareAcousticEchoCanceler;
        public boolean useHardwareNoiseSuppressor;
        public boolean useLowLatency;
        public boolean useStereoInput;
        public boolean useStereoOutput;

        public AudioDeviceModule createAudioDeviceModule() {
            boolean z = Logging.loggingEnabled;
            if (!this.useHardwareNoiseSuppressor) {
                WebRtcAudioEffects.isNoiseSuppressorSupported();
            }
            if (!this.useHardwareAcousticEchoCanceler) {
                WebRtcAudioEffects.isAcousticEchoCancelerSupported();
            }
            WebRtcAudioRecord webRtcAudioRecord = new WebRtcAudioRecord(this.context, this.audioManager, this.audioSource, this.audioFormat, this.audioRecordErrorCallback, this.audioRecordStateCallback, this.samplesReadyCallback, this.useHardwareAcousticEchoCanceler, this.useHardwareNoiseSuppressor);
            return new JavaAudioDeviceModule(this.context, this.audioManager, webRtcAudioRecord, new WebRtcAudioTrack(this.context, this.audioManager, this.audioAttributes, this.audioTrackErrorCallback, this.audioTrackStateCallback, this.useLowLatency), this.inputSampleRate, this.outputSampleRate, this.useStereoInput, this.useStereoOutput);
        }

        public Builder setInputSampleRate(int i) {
            boolean z = Logging.loggingEnabled;
            this.inputSampleRate = i;
            return this;
        }

        public Builder setOutputSampleRate(int i) {
            boolean z = Logging.loggingEnabled;
            this.outputSampleRate = i;
            return this;
        }

        public Builder setSampleRate(int i) {
            boolean z = Logging.loggingEnabled;
            this.inputSampleRate = i;
            this.outputSampleRate = i;
            return this;
        }

        public Builder setUseHardwareAcousticEchoCanceler(boolean z) {
            if (z && !WebRtcAudioEffects.isAcousticEchoCancelerSupported()) {
                boolean z2 = Logging.loggingEnabled;
                z = false;
            }
            this.useHardwareAcousticEchoCanceler = z;
            return this;
        }

        public Builder setUseHardwareNoiseSuppressor(boolean z) {
            if (z && !WebRtcAudioEffects.isNoiseSuppressorSupported()) {
                boolean z2 = Logging.loggingEnabled;
                z = false;
            }
            this.useHardwareNoiseSuppressor = z;
            return this;
        }

        public Builder(Context context2) {
            this.audioSource = 7;
            this.audioFormat = 2;
            this.useHardwareAcousticEchoCanceler = WebRtcAudioEffects.isAcousticEchoCancelerSupported();
            this.useHardwareNoiseSuppressor = WebRtcAudioEffects.isNoiseSuppressorSupported();
            this.context = context2;
            AudioManager audioManager2 = (AudioManager) context2.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
            this.audioManager = audioManager2;
            this.inputSampleRate = WebRtcAudioManager.getSampleRate(audioManager2);
            this.outputSampleRate = WebRtcAudioManager.getSampleRate(audioManager2);
            this.useLowLatency = false;
        }

        public Builder setAudioAttributes(AudioAttributes audioAttributes2) {
            this.audioAttributes = audioAttributes2;
            return this;
        }

        public Builder setAudioFormat(int i) {
            this.audioFormat = i;
            return this;
        }

        public Builder setAudioRecordErrorCallback(AudioRecordErrorCallback audioRecordErrorCallback2) {
            this.audioRecordErrorCallback = audioRecordErrorCallback2;
            return this;
        }

        public Builder setAudioRecordStateCallback(AudioRecordStateCallback audioRecordStateCallback2) {
            this.audioRecordStateCallback = audioRecordStateCallback2;
            return this;
        }

        public Builder setAudioSource(int i) {
            this.audioSource = i;
            return this;
        }

        public Builder setAudioTrackErrorCallback(AudioTrackErrorCallback audioTrackErrorCallback2) {
            this.audioTrackErrorCallback = audioTrackErrorCallback2;
            return this;
        }

        public Builder setAudioTrackStateCallback(AudioTrackStateCallback audioTrackStateCallback2) {
            this.audioTrackStateCallback = audioTrackStateCallback2;
            return this;
        }

        public Builder setSamplesReadyCallback(SamplesReadyCallback samplesReadyCallback2) {
            this.samplesReadyCallback = samplesReadyCallback2;
            return this;
        }

        public Builder setUseLowLatency(boolean z) {
            this.useLowLatency = z;
            return this;
        }

        public Builder setUseStereoInput(boolean z) {
            this.useStereoInput = z;
            return this;
        }

        public Builder setUseStereoOutput(boolean z) {
            this.useStereoOutput = z;
            return this;
        }
    }

    public interface SamplesReadyCallback {
        void onWebRtcAudioRecordSamplesReady(AudioSamples audioSamples);
    }

    public static native long nativeCreateAudioDeviceModule(Context context2, AudioManager audioManager2, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i, int i2, boolean z, boolean z2);

    public class AudioSamples {
        public final int audioFormat;
        public final int channelCount;
        public final byte[] data;
        public final int sampleRate;

        public AudioSamples(int i, int i2, int i3, byte[] bArr) {
            this.audioFormat = i;
            this.channelCount = i2;
            this.sampleRate = i3;
            this.data = bArr;
        }

        public int getAudioFormat() {
            return this.audioFormat;
        }

        public int getChannelCount() {
            return this.channelCount;
        }

        public byte[] getData() {
            return this.data;
        }

        public int getSampleRate() {
            return this.sampleRate;
        }
    }

    public static Builder builder(Context context2) {
        return new Builder(context2);
    }

    public long getNativeAudioDeviceModulePointer() {
        long j;
        synchronized (this.nativeLock) {
            j = this.nativeAudioDeviceModule;
            if (j == 0) {
                j = nativeCreateAudioDeviceModule(this.context, this.audioManager, this.audioInput, this.audioOutput, this.inputSampleRate, this.outputSampleRate, this.useStereoInput, this.useStereoOutput);
                this.nativeAudioDeviceModule = j;
            }
        }
        return j;
    }

    public void release() {
        synchronized (this.nativeLock) {
            long j = this.nativeAudioDeviceModule;
            if (j != 0) {
                JniCommon.nativeReleaseRef(j);
                this.nativeAudioDeviceModule = 0;
            }
        }
    }

    public void setMicrophoneMute(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        this.audioInput.setMicrophoneMute(z);
    }

    public void setSpeakerMute(boolean z) {
        boolean z2 = Logging.loggingEnabled;
        this.audioOutput.setSpeakerMute(z);
    }

    public static boolean isBuiltInAcousticEchoCancelerSupported() {
        return WebRtcAudioEffects.isAcousticEchoCancelerSupported();
    }

    public static boolean isBuiltInNoiseSuppressorSupported() {
        return WebRtcAudioEffects.isNoiseSuppressorSupported();
    }

    public JavaAudioDeviceModule(Context context2, AudioManager audioManager2, WebRtcAudioRecord webRtcAudioRecord, WebRtcAudioTrack webRtcAudioTrack, int i, int i2, boolean z, boolean z2) {
        this.nativeLock = Pxe.A0p();
        this.context = context2;
        this.audioManager = audioManager2;
        this.audioInput = webRtcAudioRecord;
        this.audioOutput = webRtcAudioTrack;
        this.inputSampleRate = i;
        this.outputSampleRate = i2;
        this.useStereoInput = z;
        this.useStereoOutput = z2;
    }
}
