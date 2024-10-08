package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.business.promote.model.AudienceInterest;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.U9n  reason: case insensitive filesystem */
public final class C14793U9n extends 2Rw {
    public List A00 = new ArrayList();
    public final X3M A01;

    public C14793U9n(X3M x3m) {
        0qQ.A0B(x3m, 1);
        this.A01 = x3m;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new UCZ(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.interest_typeahead_item_view, false), this.A01);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r4, int i) {
        UCZ ucz = (UCZ) r4;
        0qQ.A0B(ucz, 0);
        AudienceInterest audienceInterest = (AudienceInterest) this.A00.get(i);
        0qQ.A0B(audienceInterest, 0);
        ucz.A00.setText(audienceInterest.A01());
        WBH.A01(ucz.itemView, 52, audienceInterest, ucz);
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1011513242);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(730684203, A03);
        return size;
    }
}
