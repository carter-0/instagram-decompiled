package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.android.maps.model.LatLng;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.intf.MapEntryPoint;
import com.instagram.model.hashtag.Hashtag;

public final class WFH implements X2B {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WFH(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void DPW(LatLng latLng) {
        if (this.A00 != 0) {
            C298775u0 r3 = (C298775u0) this.A02;
            C15381Ube ube = ((VOB) this.A01).A00;
            Hashtag hashtag = C15381Ube.A01(ube).A01;
            if (hashtag.getId() != null && hashtag.getName() != null) {
                FragmentActivity requireActivity = ube.requireActivity();
                UserSession A0l = AnonymousClass7TE.A0l(ube.A0i);
                String str = ube.A0g;
                C18681Vwf.A01((Bundle) null, requireActivity, A0l, MapEntryPoint.HASHTAG_PAGE, C16614UyA.HASHTAG, str, hashtag.getId(), hashtag.getName(), r3.A01, (double[]) null);
                return;
            }
            return;
        }
        ((C17960Vit) this.A01).A00((C70826OMy) this.A02);
    }
}
