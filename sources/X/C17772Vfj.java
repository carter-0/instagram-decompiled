package X;

import android.os.Bundle;
import com.instagram.discovery.mediamap.fragment.LocationDetailFragment;
import com.instagram.discovery.mediamap.model.MediaMapPin;
import com.instagram.modal.ModalActivity;
import com.instagram.model.venue.Venue;

/* renamed from: X.Vfj  reason: case insensitive filesystem */
public final class C17772Vfj {
    public final /* synthetic */ LocationDetailFragment A00;

    public C17772Vfj(LocationDetailFragment locationDetailFragment) {
        this.A00 = locationDetailFragment;
    }

    public final void A00(MediaMapPin mediaMapPin) {
        LocationDetailFragment locationDetailFragment = this.A00;
        Venue A002 = C18231Vnv.A00(mediaMapPin.A09);
        if (mediaMapPin.A06 != null) {
            Bundle bundle = new Bundle();
            bundle.putString("location_id_key", A002.A05());
            bundle.putString("fb_page_id_key", A002.A04());
            bundle.putString("info_page_logging_entry_point", "map_location_sheet");
            bundle.putParcelable(AnonymousClass000.A00(693), mediaMapPin.A06);
            DbV.A0Y(locationDetailFragment.requireActivity(), bundle, AnonymousClass7TE.A0l(locationDetailFragment.A00), ModalActivity.class, "location_info").A0C(locationDetailFragment.requireContext());
        }
    }
}
