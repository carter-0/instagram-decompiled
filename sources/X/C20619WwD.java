package X;

import com.facebook.flipper.plugins.bloksdebugger.Event;
import com.facebook.flipper.plugins.bloksdebugger.StateUpdateV2;
import com.facebook.flipper.plugins.bloksdebugger.StreamRateLimited;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;

/* renamed from: X.WwD  reason: case insensitive filesystem */
public final class C20619WwD extends 0Yg implements C62320sa {
    public static final C20619WwD A00 = new C20619WwD();

    public C20619WwD() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        0Yh r10 = new 0Yh(Event.class);
        C62230ry[] r12 = {new 0Yh(C14984UIj.class), new 0Yh(C14983UIh.class), new 0Yh(C14985UIk.class), new 0Yh(StateUpdateV2.class), new 0Yh(StreamRateLimited.class)};
        C20443Wrl wrl = C20443Wrl.A00;
        C20448Wrq wrq = C20448Wrq.A00;
        C20451Wrt wrt = C20451Wrt.A00;
        C20453Wrv wrv = C20453Wrv.A00;
        StreamRateLimited streamRateLimited = StreamRateLimited.A00;
        Annotation[] annotationArr = new Annotation[0];
        0qQ.A0B(streamRateLimited, 2);
        C360508eh r1 = new C360508eh("com.facebook.flipper.plugins.bloksdebugger.StreamRateLimited", streamRateLimited);
        0qQ.A0B(annotationArr, 0);
        List asList = Arrays.asList(annotationArr);
        0qQ.A07(asList);
        r1.A00 = asList;
        return new C20803WzG("com.facebook.flipper.plugins.bloksdebugger.Event", r10, new Annotation[0], r12, new C255463uA[]{wrl, wrq, wrt, wrv, r1});
    }
}
