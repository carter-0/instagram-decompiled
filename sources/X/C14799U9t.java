package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.business.promote.model.AudienceGeoLocation;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteState;

/* renamed from: X.U9t  reason: case insensitive filesystem */
public final class C14799U9t extends 2Rw {
    public final X3P A00;
    public final PromoteData A01;
    public final PromoteState A02;

    /* JADX WARNING: type inference failed for: r1v1, types: [X.3kE, X.UBT] */
    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        View A09 = DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.promote_create_audience_selected_location, false);
        X3P x3p = this.A00;
        AnonymousClass7TG.A1O(A09, x3p);
        ? r1 = new C249703kE(A09);
        r1.A01 = x3p;
        r1.A00 = AnonymousClass7TG.A0R(A09, R.id.selected_location_name);
        return r1;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r4, int i) {
        UBT ubt = (UBT) r4;
        0qQ.A0B(ubt, 0);
        AudienceGeoLocation audienceGeoLocation = (AudienceGeoLocation) this.A01.A0o.A05.get(i);
        0qQ.A0B(audienceGeoLocation, 0);
        ubt.A00.setText(audienceGeoLocation.A05);
        WBH.A01(ubt.itemView, 59, audienceGeoLocation, ubt);
    }

    public C14799U9t(X3P x3p, PromoteData promoteData, PromoteState promoteState) {
        AnonymousClass7TG.A1U(promoteData, promoteState, x3p);
        this.A01 = promoteData;
        this.A02 = promoteState;
        this.A00 = x3p;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(997707517);
        int size = this.A01.A0o.A05.size();
        AnonymousClass0fD.A0A(-141023191, A03);
        return size;
    }
}
