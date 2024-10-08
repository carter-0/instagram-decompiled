package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.media.MediaMetadataRetriever;
import android.media.MediaMuxer;
import com.google.common.io.Files;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: X.SAc  reason: case insensitive filesystem */
public final class C11101SAc {
    public static final float A00(File file, List list) {
        Q0V A00;
        MediaMuxer mediaMuxer;
        List<File> list2 = list;
        try {
            File file2 = file;
            if (list2.size() == 1) {
                File file3 = (File) list2.get(0);
                file3.getPath();
                file.getPath();
                Files.A01(file3, file);
            } else {
                try {
                    String A0t = JTP.A0t((File) list2.get(0));
                    file.getAbsolutePath();
                    A00 = Q0V.A00("media_stitch_utl_init_muxer");
                    A00.ETt(A0t);
                    MediaMuxer mediaMuxer2 = new MediaMuxer(file.getPath(), 0);
                    int trackCount = A00.A00.getTrackCount();
                    for (int i = 0; i < trackCount; i++) {
                        MediaFormat trackFormat = A00.A00.getTrackFormat(i);
                        0qQ.A07(trackFormat);
                        mediaMuxer2.addTrack(trackFormat);
                    }
                    mediaMuxer2.start();
                    A00.release();
                    mediaMuxer = mediaMuxer2;
                    ByteBuffer allocateDirect = ByteBuffer.allocateDirect(2097152);
                    long j = 0;
                    for (File file4 : list2) {
                        file4.getPath();
                        A00 = Q0V.A00("media_stitch_utl_init_demuxer");
                        A00.ETt(file4.getPath());
                        int trackCount2 = A00.A00.getTrackCount();
                        for (int i2 = 0; i2 < trackCount2; i2++) {
                            A00.ELD(i2);
                        }
                        0qQ.A0A(allocateDirect);
                        MediaCodec.BufferInfo bufferInfo = new MediaCodec.BufferInfo();
                        long j2 = 0;
                        while (true) {
                            allocateDirect.clear();
                            int readSampleData = A00.A00.readSampleData(allocateDirect, 0);
                            if (readSampleData < 0) {
                                break;
                            }
                            long sampleTime = A00.A00.getSampleTime();
                            j2 = Math.max(j2, sampleTime);
                            int sampleFlags = A00.A00.getSampleFlags();
                            int sampleTrackIndex = A00.A00.getSampleTrackIndex();
                            bufferInfo.set(0, readSampleData, sampleTime + j, sampleFlags);
                            0qQ.A0A(mediaMuxer2);
                            mediaMuxer2.writeSampleData(sampleTrackIndex, allocateDirect, bufferInfo);
                            A00.AAt();
                        }
                        A00.release();
                        j += j2;
                    }
                    mediaMuxer2.stop();
                    mediaMuxer2.release();
                } catch (Throwable th) {
                    th = th;
                    if (mediaMuxer != null) {
                        mediaMuxer.release();
                    }
                }
            }
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            mediaMetadataRetriever.setDataSource(file2.getPath());
            String extractMetadata = mediaMetadataRetriever.extractMetadata(9);
            if (extractMetadata != null) {
                return Float.parseFloat(extractMetadata) / 1000.0f;
            }
            th = AnonymousClass7TE.A0y();
            throw th;
        } catch (Exception e) {
            0KC.A07(C11101SAc.class, "Android demuxer muxer error for stitching movies.", e, new Object[0]);
            0wb.A07("system_media_stitch_err", e);
            return 0.0f;
        }
    }
}
