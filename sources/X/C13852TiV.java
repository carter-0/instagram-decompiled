package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;

/* renamed from: X.TiV  reason: case insensitive filesystem */
public interface C13852TiV {
    void addEffect(MediaEffect mediaEffect);

    void addEffect(Integer num, MediaEffect mediaEffect);

    void configure(C10568RuN ruN);

    void disableTrack(int i);

    void enableTrack(int i);

    int getWarmupDurationInSec();

    boolean isEffectSupported(MediaEffect mediaEffect);

    ByteBuffer process(ByteBuffer[] byteBufferArr, long j);

    void removeEffect(MediaEffect mediaEffect);

    void removeEffect(Integer num, MediaEffect mediaEffect);

    void warmup(ByteBuffer[] byteBufferArr, long j);
}
