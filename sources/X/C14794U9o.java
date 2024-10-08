package X;

import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.api.schemas.AdGeoLocationType;
import com.instagram.business.promote.model.AudienceGeoLocation;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.U9o  reason: case insensitive filesystem */
public final class C14794U9o extends 2Rw {
    public List A00 = new ArrayList();
    public final X3N A01;

    public C14794U9o(X3N x3n) {
        0qQ.A0B(x3n, 1);
        this.A01 = x3n;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new UD3(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.location_typeahead_item_view, false), this.A01);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r6, int i) {
        int i2;
        UD3 ud3 = (UD3) r6;
        0qQ.A0B(ud3, 0);
        AudienceGeoLocation audienceGeoLocation = (AudienceGeoLocation) this.A00.get(i);
        0qQ.A0B(audienceGeoLocation, 0);
        TextView textView = ud3.A00;
        String str = audienceGeoLocation.A05;
        if (str != null) {
            textView.setText(str);
            TextView textView2 = ud3.A01;
            AdGeoLocationType adGeoLocationType = audienceGeoLocation.A03;
            if (adGeoLocationType != null) {
                int ordinal = adGeoLocationType.ordinal();
                if (ordinal == 2) {
                    i2 = 2131952236;
                } else if (ordinal == 3) {
                    i2 = 2131952239;
                } else if (ordinal == 4) {
                    i2 = 2131952235;
                } else if (ordinal != 5) {
                    i2 = 2131952238;
                    if (ordinal != 14) {
                        i2 = 2131952237;
                    }
                } else {
                    i2 = 2131952240;
                }
                textView2.setText(i2);
                WBH.A01(ud3.itemView, 53, audienceGeoLocation, ud3);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1299539326);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-842344788, A03);
        return size;
    }
}
