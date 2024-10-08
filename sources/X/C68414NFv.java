package X;

import com.instagram.direct.armadilloexpress.transportpayload.CommonMediaTransport;
import com.instagram.direct.armadilloexpress.transportpayload.Thumbnail;
import com.instagram.direct.armadilloexpress.transportpayload.Video;
import com.instagram.direct.armadilloexpress.transportpayload.VideoExtraMetadata;

/* renamed from: X.NFv  reason: case insensitive filesystem */
public final class C68414NFv extends R4O implements C13662TeT {
    public C68414NFv() {
        super(Video.DEFAULT_INSTANCE);
    }

    public final void A06(int i) {
        Video video = (Video) C66580MXl.A0L(this);
        video.bitField0_ |= 2;
        video.height_ = i;
    }

    public final void A07(int i) {
        Video video = (Video) C66580MXl.A0L(this);
        video.bitField0_ |= 4;
        video.width_ = i;
    }

    public final void A08(CommonMediaTransport commonMediaTransport) {
        Video video = (Video) C66580MXl.A0L(this);
        commonMediaTransport.getClass();
        video.mediaTransport_ = commonMediaTransport;
        video.bitField0_ |= 1;
    }

    public final void A09(C68410NFr nFr) {
        Video video = (Video) C66580MXl.A0L(this);
        Thumbnail thumbnail = (Thumbnail) nFr.A02();
        thumbnail.getClass();
        video.thumbnail_ = thumbnail;
        video.bitField0_ |= 8;
    }

    public final void A0A(C68400NFh nFh) {
        Video video = (Video) C66580MXl.A0L(this);
        VideoExtraMetadata videoExtraMetadata = (VideoExtraMetadata) nFh.A02();
        videoExtraMetadata.getClass();
        video.videoExtraMetadata_ = videoExtraMetadata;
        video.bitField0_ |= 16;
    }
}
