package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;
import com.instagram.discovery.mediamap.fragment.MediaMapFragment;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.model.reels.Reel;
import com.instagram.model.venue.Venue;

/* renamed from: X.WVu  reason: case insensitive filesystem */
public final class C19353WVu implements C20951X6e {
    public MediaMapPin A00;
    public final LocationDetailFragment A01;
    public final MediaMapFragment A02;
    public final MediaMapFragment A03;
    public final Context A04;
    public final UserSession A05;
    public final C18066Vks A06;

    public final void ADS() {
        Venue A002 = C18231Vnv.A00(this.A00.A09);
        C17896Vhn vhn = this.A03.A05;
        String A052 = A002.A05();
        0qQ.A07(A052);
        Reel reel = (Reel) vhn.A03.get(A052);
        LocationPageInformation locationPageInformation = this.A00.A06;
        if (!(locationPageInformation == null || locationPageInformation.A00() == null)) {
            182.A06(0Tu.A05, this.A05, 36315039409376203L);
        }
        C18066Vks vks = this.A06;
        vks.A00((Spannable) null, new WB8((Object) this, 48), A002.A00.getName());
        if (reel != null) {
            vks.A01(this.A01, new C19351WVs(this), reel, A002);
        } else {
            vks.A03(false);
        }
        WB8 wb8 = new WB8((Object) this, 49);
        ImageView imageView = vks.A02;
        AnonymousClass0fU.A00(wb8, imageView);
        imageView.setVisibility(0);
        Drawable drawable = this.A04.getDrawable(R.drawable.instagram_more_vertical_pano_outline_24);
        0qQ.A0A(drawable);
        WB8 wb82 = new WB8((Object) this, 50);
        ImageView imageView2 = vks.A01;
        imageView2.setImageDrawable(drawable);
        AnonymousClass0fU.A00(wb82, imageView2);
        imageView2.setVisibility(0);
    }

    public final void Ed7(MediaMapPin mediaMapPin) {
        this.A00 = mediaMapPin;
    }

    public C19353WVu(ViewGroup viewGroup, UserSession userSession, LocationDetailFragment locationDetailFragment, MediaMapFragment mediaMapFragment, MediaMapFragment mediaMapFragment2, MediaMapPin mediaMapPin) {
        C51974G9v.A1S(userSession, mediaMapPin, viewGroup, mediaMapFragment, mediaMapFragment2);
        this.A01 = locationDetailFragment;
        this.A00 = mediaMapPin;
        this.A03 = mediaMapFragment;
        this.A04 = locationDetailFragment.requireContext();
        this.A06 = new C18066Vks(viewGroup, userSession);
        this.A02 = mediaMapFragment2;
        this.A05 = userSession;
    }
}
