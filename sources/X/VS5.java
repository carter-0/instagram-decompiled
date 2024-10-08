package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.discovery.mediamap.model.MediaMapPin;

public final class VS5 {
    public C20951X6e A00;
    public final ViewGroup A01;

    public VS5(View view, UserSession userSession, LocationDetailFragment locationDetailFragment, MediaMapFragment mediaMapFragment, MediaMapFragment mediaMapFragment2, MediaMapPin mediaMapPin, boolean z) {
        C20951X6e wVu;
        0qQ.A0B(view, 4);
        View A0H = JTP.A0H(JTR.A0X(view, R.id.layout_location_detail_action_bar), z ? R.layout.layout_sheet_location_detail_action_bar : R.layout.layout_sheet_action_bar);
        C66580MXl.A1R(A0H);
        ViewGroup viewGroup = (ViewGroup) A0H;
        this.A01 = viewGroup;
        UserSession userSession2 = userSession;
        0qQ.A0A(userSession);
        MediaMapPin mediaMapPin2 = mediaMapPin;
        0qQ.A0A(mediaMapPin);
        MediaMapFragment mediaMapFragment3 = mediaMapFragment;
        0qQ.A0A(mediaMapFragment);
        LocationDetailFragment locationDetailFragment2 = locationDetailFragment;
        MediaMapFragment mediaMapFragment4 = mediaMapFragment2;
        if (z) {
            0qQ.A0A(mediaMapFragment2);
            wVu = new C19354WVv(viewGroup, userSession2, locationDetailFragment2, mediaMapFragment3, mediaMapFragment4, mediaMapPin2);
        } else {
            0qQ.A0A(mediaMapFragment2);
            wVu = new C19353WVu(viewGroup, userSession2, locationDetailFragment2, mediaMapFragment3, mediaMapFragment4, mediaMapPin2);
        }
        this.A00 = wVu;
    }
}
