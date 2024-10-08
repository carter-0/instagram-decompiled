package X;

import android.content.Context;
import com.facebook.msys.mci.MediaTranscoder;
import com.facebook.msys.mci.transcoder.DefaultMediaTranscoder;
import com.facebook.msys.util.Provider;
import java.util.Collections;

/* renamed from: X.3k2  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C249583k2 implements Provider {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ C257503xV A01;

    public /* synthetic */ C249583k2(Context context, C257503xV r2) {
        this.A00 = context;
        this.A01 = r2;
    }

    public final Object get() {
        Context context = this.A00;
        C257503xV r7 = this.A01;
        0na r8 = new 0na(1401572073, 3, false, true);
        MediaTranscoder mediaTranscoder = DefaultMediaTranscoder.A06;
        if (mediaTranscoder != null) {
            return mediaTranscoder;
        }
        C10213RoU roU = new C10213RoU(Collections.emptyList());
        DefaultMediaTranscoder defaultMediaTranscoder = new DefaultMediaTranscoder(context, new SSJ(roU), roU, r7, r8);
        DefaultMediaTranscoder.A06 = defaultMediaTranscoder;
        return defaultMediaTranscoder;
    }
}
