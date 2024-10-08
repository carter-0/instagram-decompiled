package X;

import android.media.MediaCodecList;
import android.media.MediaFormat;

public final class TVI extends 0Yg implements C62320sa {
    public static final TVI A00 = new TVI();

    public TVI() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        MediaCodecList mediaCodecList = new MediaCodecList(1);
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", "video/dolby-vision");
        mediaFormat.setInteger("profile", 256);
        mediaFormat.setInteger("color-transfer", 7);
        mediaFormat.setInteger("color-standard", 6);
        return mediaCodecList.findEncoderForFormat(mediaFormat);
    }
}
