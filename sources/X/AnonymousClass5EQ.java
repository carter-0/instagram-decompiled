package X;

import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Util;

/* renamed from: X.5EQ  reason: invalid class name */
public final class AnonymousClass5EQ extends AnonymousClass4T8 {
    public static final Object A02 = new Object();
    public final Object A00;
    public final Object A01;

    public final int A06(Object obj) {
        Object obj2;
        Timeline timeline = this.A00;
        if (A02.equals(obj) && (obj2 = this.A00) != null) {
            obj = obj2;
        }
        return timeline.A06(obj);
    }

    public final Object A0C(int i) {
        Object A0C = this.A00.A0C(i);
        if (Util.A0I(A0C, this.A00)) {
            return A02;
        }
        return A0C;
    }

    public final C264744Rc A0D(C264744Rc r3, int i, boolean z) {
        this.A00.A0D(r3, i, z);
        if (Util.A0I(r3.A05, this.A00) && z) {
            r3.A05 = A02;
        }
        return r3;
    }

    public final AnonymousClass4RE A0E(AnonymousClass4RE r3, int i, long j) {
        this.A00.A0E(r3, i, j);
        if (Util.A0I(r3.A0C, this.A01)) {
            r3.A0C = AnonymousClass4RE.A0H;
        }
        return r3;
    }

    public AnonymousClass5EQ(Timeline timeline, Object obj, Object obj2) {
        super(timeline);
        this.A01 = obj;
        this.A00 = obj2;
    }
}
