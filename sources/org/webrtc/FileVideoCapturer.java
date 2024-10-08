package org.webrtc;

import X.002;
import X.AnonymousClass7TE;
import X.C41845B3m;
import X.Pxg;
import android.content.Context;
import android.os.SystemClock;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;

public class FileVideoCapturer implements VideoCapturer {
    public static final String TAG = "FileVideoCapturer";
    public CapturerObserver capturerObserver;
    public final TimerTask tickTask = new TimerTask() {
        public void run() {
            FileVideoCapturer.this.tick();
        }
    };
    public final Timer timer = new Timer();
    public final VideoReader videoReader;

    public class VideoReaderY4M implements VideoReader {
        public static final int FRAME_DELIMETER_LENGTH = 6;
        public static final String TAG = "VideoReaderY4M";
        public static final String Y4M_FRAME_DELIMETER = "FRAME";
        public final int frameHeight;
        public final int frameWidth;
        public final RandomAccessFile mediaFile;
        public final FileChannel mediaFileChannel;
        public final long videoStart;

        public void close() {
            try {
                this.mediaFile.close();
            } catch (IOException e) {
                boolean z = Logging.loggingEnabled;
                e.toString();
                Logging.getStackTraceString(e);
            }
        }

        public VideoFrame getNextFrame() {
            RuntimeException A15;
            long nanos = TimeUnit.MILLISECONDS.toNanos(SystemClock.elapsedRealtime());
            JavaI420Buffer allocate = JavaI420Buffer.allocate(this.frameWidth, this.frameHeight);
            ByteBuffer dataY = allocate.getDataY();
            ByteBuffer dataU = allocate.getDataU();
            ByteBuffer dataV = allocate.getDataV();
            try {
                int i = FRAME_DELIMETER_LENGTH;
                ByteBuffer allocate2 = ByteBuffer.allocate(i);
                if (this.mediaFileChannel.read(allocate2) < i) {
                    this.mediaFileChannel.position(this.videoStart);
                    if (this.mediaFileChannel.read(allocate2) < i) {
                        A15 = AnonymousClass7TE.A15("Error looping video");
                        throw A15;
                    }
                }
                String str = new String(allocate2.array(), Charset.forName("US-ASCII"));
                if (str.equals("FRAME\n")) {
                    this.mediaFileChannel.read(dataY);
                    this.mediaFileChannel.read(dataU);
                    this.mediaFileChannel.read(dataV);
                    return new VideoFrame(allocate, 0, nanos);
                }
                A15 = AnonymousClass7TE.A15(002.A0g("Frames should be delimited by FRAME plus newline, found delimter was: '", str, "'"));
                throw A15;
            } catch (IOException e) {
                throw C41845B3m.A0j(e);
            }
        }

        public VideoReaderY4M(String str) {
            RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
            this.mediaFile = randomAccessFile;
            this.mediaFileChannel = randomAccessFile.getChannel();
            StringBuilder A1A = AnonymousClass7TE.A1A();
            while (true) {
                int read = this.mediaFile.read();
                if (read == -1) {
                    throw Pxg.A0k("Found end of file before end of header for file: ", str);
                } else if (read == 10) {
                    this.videoStart = this.mediaFileChannel.position();
                    String str2 = "";
                    int i = 0;
                    int i2 = 0;
                    for (String str3 : A1A.toString().split("[ ]")) {
                        char charAt = str3.charAt(0);
                        if (charAt == 'C') {
                            str2 = str3.substring(1);
                        } else if (charAt == 'H') {
                            i2 = Integer.parseInt(str3.substring(1));
                        } else if (charAt == 'W') {
                            i = Integer.parseInt(str3.substring(1));
                        }
                    }
                    boolean z = Logging.loggingEnabled;
                    if (!str2.equals("420") && !str2.equals("420mpeg2")) {
                        throw AnonymousClass7TE.A0w("Does not support any other color space than I420 or I420mpeg2");
                    } else if (i % 2 == 1 || i2 % 2 == 1) {
                        throw AnonymousClass7TE.A0w("Does not support odd width or height");
                    } else {
                        this.frameWidth = i;
                        this.frameHeight = i2;
                        return;
                    }
                } else {
                    A1A.append((char) read);
                }
            }
        }
    }

    public interface VideoReader {
        void close();

        VideoFrame getNextFrame();
    }

    public void changeCaptureFormat(int i, int i2, int i3) {
    }

    public boolean isScreencast() {
        return false;
    }

    public void dispose() {
        this.videoReader.close();
    }

    public void startCapture(int i, int i2, int i3) {
        this.timer.schedule(this.tickTask, 0, (long) (IgNetworkConsentStorage.MAX_ENTRIES / i3));
    }

    public void stopCapture() {
        this.timer.cancel();
    }

    public void tick() {
        VideoFrame nextFrame = this.videoReader.getNextFrame();
        this.capturerObserver.onFrameCaptured(nextFrame);
        nextFrame.release();
    }

    public FileVideoCapturer(String str) {
        try {
            this.videoReader = new VideoReaderY4M(str);
        } catch (IOException e) {
            boolean z = Logging.loggingEnabled;
            throw e;
        }
    }

    public void initialize(SurfaceTextureHelper surfaceTextureHelper, Context context, CapturerObserver capturerObserver2) {
        this.capturerObserver = capturerObserver2;
    }
}
