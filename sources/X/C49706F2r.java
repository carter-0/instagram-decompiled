package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.registration.model.RegFlowExtras;
import com.instagram.ui.widget.searchedittext.SearchEditText;
import java.util.List;
import java.util.Random;

/* renamed from: X.F2r  reason: case insensitive filesystem */
public final class C49706F2r {
    public View A00;
    public RecyclerView A01;
    public Random A02 = new Random();
    public final ImageView A03;
    public final AnonymousClass0aP A04;
    public final RegFlowExtras A05;
    public final SearchEditText A06;
    public final EXD A07;
    public final C46634DiE A08;

    public final void A00(Context context, List list) {
        if (list != null && !list.isEmpty()) {
            ImageView imageView = this.A03;
            imageView.setVisibility(0);
            imageView.setImageResource(R.drawable.refresh);
            C49948FGd.A01(imageView, 2Yu.A09(context));
            FPG.A00(imageView, 13, this, list);
            DbT.A1A(imageView.getResources(), imageView, 2131974660);
            this.A00.setVisibility(0);
            RecyclerView recyclerView = this.A01;
            recyclerView.setAdapter(new C46825Dm1(0, context, this, list));
            DbV.A1A(context, recyclerView);
        }
    }

    public C49706F2r(View view, ImageView imageView, AnonymousClass0aP r6, RegFlowExtras regFlowExtras, SearchEditText searchEditText, EXD exd, C46634DiE diE) {
        this.A00 = view.findViewById(R.id.username_suggestions_container);
        RecyclerView A0I = DbT.A0I(view, R.id.username_suggestions);
        this.A01 = A0I;
        this.A06 = searchEditText;
        this.A03 = imageView;
        this.A04 = r6;
        this.A07 = exd;
        this.A05 = regFlowExtras;
        this.A08 = diE;
        A0I.A11(new C46856DmY(this, 0));
    }
}
