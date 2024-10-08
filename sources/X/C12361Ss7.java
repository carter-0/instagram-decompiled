package X;

import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.Iterator;

/* renamed from: X.Ss7  reason: case insensitive filesystem */
public final /* synthetic */ class C12361Ss7 implements C13593TdL {
    public final /* synthetic */ SU1 A00;

    public /* synthetic */ C12361Ss7(SU1 su1) {
        this.A00 = su1;
    }

    public final void DQ1(Integer num, MediaEffect mediaEffect) {
        C10810RyW ryW = this.A00.A0L;
        int intValue = num.intValue();
        0qQ.A0B(mediaEffect, 1);
        Iterator A0u = AnonymousClass7TF.A0u(ryW.A07);
        while (A0u.hasNext()) {
            ((Q1G) C51971G9r.A0p(A0u)).A8G(mediaEffect, intValue);
        }
    }
}
