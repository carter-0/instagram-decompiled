package X;

import android.content.Context;
import android.graphics.Point;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgProgressBar;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.LNs  reason: case insensitive filesystem */
public final class C64111LNs {
    public int A00 = -1;
    public final HashMap A01 = AnonymousClass7TE.A1E();

    public final LVA A01(Context context, MediaComposition mediaComposition, UserSession userSession, C60690Jpb jpb) {
        MediaComposition mediaComposition2 = mediaComposition;
        boolean A1b = C51973G9u.A1b(userSession, context, mediaComposition);
        Point A012 = AEW.A01(context, userSession, 0.5625f, C63472Kxb.A00(context, userSession, Integer.MAX_VALUE, false, false));
        0qQ.A07(A012);
        CameraSpec A013 = AnonymousClass72R.A01(userSession, A012.x, A012.y);
        HashMap hashMap = this.A01;
        Object obj = hashMap.get(mediaComposition);
        LVA lva = obj;
        if (obj == null) {
            C60690Jpb jpb2 = jpb;
            LVA lva2 = new LVA(context, jpb2.A03, userSession, A013);
            IgProgressBar igProgressBar = jpb2.A09;
            if (igProgressBar.getVisibility() == 0 && jpb2.A00 == 0) {
                STU stu = lva2.A01;
                CameraSpec cameraSpec = lva2.A03;
                stu.A0A(mediaComposition2, cameraSpec.A03, cameraSpec.A02, -1, -1, 0, A1b);
                lva2.A00();
            } else {
                STU stu2 = lva2.A01;
                CameraSpec cameraSpec2 = lva2.A03;
                stu2.A0A(mediaComposition2, cameraSpec2.A03, cameraSpec2.A02, -1, -1, 0, A1b);
            }
            igProgressBar.setVisibility(8);
            hashMap.put(mediaComposition, lva2);
            lva = lva2;
        }
        return (LVA) lva;
    }

    public static final void A00(C64111LNs lNs) {
        HashMap hashMap = lNs.A01;
        Iterator A0t = AnonymousClass7TF.A0t(hashMap);
        while (A0t.hasNext()) {
            LVA lva = (LVA) AnonymousClass7TF.A0a(A0t);
            lva.isPlaying = false;
            lva.A01.A07();
        }
        hashMap.clear();
    }
}
