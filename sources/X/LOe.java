package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.model.venue.Venue;

public final class LOe {
    public C66510MUo A00;
    public Venue A01;
    public Integer A02 = AnonymousClass05K.A00;
    public final int A03;
    public final C60409Jl2 A04;
    public final View A05;
    public final View A06;
    public final View A07;
    public final View A08;
    public final View A09;
    public final View A0A;
    public final ImageView A0B;
    public final TextView A0C;
    public final TextView A0D;
    public final RecyclerView A0E;

    public LOe(View view) {
        0qQ.A0B(view, 1);
        this.A09 = view;
        this.A0A = AnonymousClass7TF.A0G(view, R.id.venue_row);
        this.A0D = AnonymousClass7TG.A0R(view, R.id.venue_name);
        this.A0C = AnonymousClass7TG.A0R(view, R.id.venue_address);
        this.A0B = DbX.A0J(view, R.id.location_balloon);
        RecyclerView A0c = JTR.A0c(view, R.id.suggested_locations_recyclerview);
        this.A0E = A0c;
        this.A06 = AnonymousClass7TF.A0G(view, R.id.clear_button);
        this.A05 = AnonymousClass7TF.A0G(view, R.id.arrow);
        this.A08 = AnonymousClass7TF.A0G(view, R.id.location_label);
        this.A07 = AnonymousClass7TF.A0G(view, R.id.metadata_location_first_row);
        C60409Jl2 jl2 = new C60409Jl2(this);
        this.A04 = jl2;
        Context A0S = AnonymousClass7TE.A0S(view);
        Resources resources = view.getResources();
        this.A03 = (int) Math.max(((double) 0nA.A09(A0S)) / 2.5d, (double) resources.getDimension(R.dimen.ad_tag_max_width));
        DbV.A1A(A0S, A0c);
        A0c.setAdapter(jl2);
        JTP.A1D(A0c, AnonymousClass7TE.A0B(resources), AnonymousClass7TE.A0D(resources));
    }

    public final void A01(C66510MUo mUo, Venue venue) {
        Integer num;
        this.A00 = mUo;
        LYB.A00(this.A06, 66, this);
        this.A01 = venue;
        if (venue == null) {
            num = this.A02;
        } else {
            num = AnonymousClass05K.A01;
        }
        A00(this, num);
        this.A0B.setVisibility(0);
    }

    public static final void A00(LOe lOe, Integer num) {
        View view;
        String address;
        String str;
        String str2 = null;
        if (num == AnonymousClass05K.A00) {
            LYB.A00(lOe.A07, 67, lOe);
            ImageView imageView = lOe.A0B;
            imageView.setImageResource(R.drawable.instagram_location_pano_outline_24);
            imageView.setColorFilter((ColorFilter) null);
            lOe.A0A.setVisibility(8);
            lOe.A06.setVisibility(8);
            lOe.A05.setVisibility(0);
            lOe.A08.setVisibility(0);
            int itemCount = lOe.A04.getItemCount();
            view = lOe.A0E;
            if (itemCount > 0) {
                view.setVisibility(0);
            }
            view.setVisibility(8);
        } else if (num == AnonymousClass05K.A01) {
            TextView textView = lOe.A0D;
            Venue venue = lOe.A01;
            if (venue != null) {
                textView.setText(venue.A00.getName());
                Venue venue2 = lOe.A01;
                if (venue2 == null || (address = venue2.A00.getAddress()) == null || address.length() == 0) {
                    lOe.A0C.setVisibility(8);
                } else {
                    TextView textView2 = lOe.A0C;
                    Venue venue3 = lOe.A01;
                    if (venue3 != null) {
                        str = venue3.A00.getAddress();
                    } else {
                        str = null;
                    }
                    textView2.setText(str);
                    textView2.setVisibility(0);
                }
                lOe.A0A.setVisibility(0);
                Venue venue4 = lOe.A01;
                if (venue4 == null || venue4.A00.BLV() == null || venue4.A00.BNV() == null) {
                    AnonymousClass0fU.A00(C64266LXs.A00, lOe.A07);
                } else {
                    LYB.A00(lOe.A07, 68, lOe);
                }
                Venue venue5 = lOe.A01;
                if (venue5 != null) {
                    str2 = venue5.A03();
                }
                boolean equals = "facebook_events".equals(str2);
                ImageView imageView2 = lOe.A0B;
                int i = R.drawable.share_location;
                if (equals) {
                    i = R.drawable.event_icon;
                }
                imageView2.setImageResource(i);
                DbU.A14(imageView2.getContext(), imageView2, R.color.badge_color);
                lOe.A0E.setVisibility(8);
                lOe.A08.setVisibility(8);
                lOe.A06.setVisibility(0);
                view = lOe.A05;
                view.setVisibility(8);
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        lOe.A02 = num;
    }

    public final void A02(Venue venue) {
        Integer num;
        this.A01 = venue;
        if (venue != null) {
            num = AnonymousClass05K.A01;
        } else {
            num = AnonymousClass05K.A00;
        }
        A00(this, num);
    }
}
