package X;

import com.instagram.music.common.model.AudioOverlayTrack;
import java.util.List;

/* renamed from: X.8JT  reason: invalid class name */
public final class AnonymousClass8JT implements AnonymousClass2gO {
    public final /* synthetic */ C353498Hw A00;

    public AnonymousClass8JT(C353498Hw r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        int i;
        List list = (List) obj;
        0qQ.A0B(list, 0);
        C353498Hw r2 = this.A00;
        if (r2.A1g()) {
            C3495880y r0 = r2.A0I;
            if (r0 != null) {
                i = r0.A01;
            } else {
                return;
            }
        } else {
            AudioOverlayTrack audioOverlayTrack = r2.A0N;
            if (audioOverlayTrack != null) {
                i = audioOverlayTrack.A02;
            } else {
                return;
            }
        }
        Integer valueOf = Integer.valueOf(i);
        if (valueOf != null && (!list.isEmpty())) {
            C353498Hw.A0Q(new C39653A3t(r2), r2, list, valueOf.intValue(), false, false);
        }
    }
}
