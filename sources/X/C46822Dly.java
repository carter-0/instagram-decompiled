package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.Dly  reason: case insensitive filesystem */
public final class C46822Dly extends 2Rw {
    public List A00 = AnonymousClass7TE.A1C();
    public boolean A01;
    public final G7H A02;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C46993Dol((ViewGroup) DbW.A09(DbX.A0E(viewGroup), viewGroup, R.layout.row_one_tap_user, false));
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView, android.view.View] */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r8, int i) {
        C46993Dol dol = (C46993Dol) r8;
        0qQ.A0B(dol, 0);
        C61079JwH jwH = (C61079JwH) this.A00.get(i);
        G7H g7h = this.A02;
        boolean z = this.A01;
        0qQ.A0B(jwH, 0);
        ImageUrl imageUrl = (ImageUrl) jwH.A01;
        String str = jwH.A02;
        if (imageUrl != null) {
            dol.A03.setUrl(imageUrl, DbS.A0O("NullAnalyticsModule"));
        } else {
            ? r2 = dol.A03;
            DbU.A13(r2.getContext(), r2, R.drawable.profile_anonymous_user);
        }
        TextView textView = dol.A02;
        if (str == null) {
            str = "";
        }
        textView.setText(str);
        FPG.A00(dol.itemView, 4, jwH, g7h);
        View view = dol.A00;
        FPG.A00(view, 5, jwH, g7h);
        2eS.A01(view);
        View view2 = dol.A01;
        if (z) {
            view2.setVisibility(8);
        } else {
            FPG.A00(view2, 6, jwH, g7h);
        }
    }

    public C46822Dly(G7H g7h) {
        this.A02 = g7h;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1614273418);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-1173568651, A03);
        return size;
    }
}
