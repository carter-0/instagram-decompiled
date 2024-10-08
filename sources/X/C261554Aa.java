package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.4Aa  reason: invalid class name and case insensitive filesystem */
public final class C261554Aa {
    public final ImageView A00;
    public final TextView A01;
    public final C2614749s A02;
    public final View A03;
    public final RecyclerView A04;
    public final AnonymousClass4AG A05;

    public C261554Aa(View view, AnonymousClass4AG r3, C2614749s r4) {
        this.A03 = view;
        this.A05 = r3;
        this.A02 = r4;
        View findViewById = view.findViewById(R.id.notes_netego_see_all_button);
        0qQ.A07(findViewById);
        this.A01 = (TextView) findViewById;
        View findViewById2 = view.findViewById(R.id.cf_hub_recycler_view);
        0qQ.A07(findViewById2);
        this.A04 = (RecyclerView) findViewById2;
        View findViewById3 = view.findViewById(R.id.overflow_button);
        0qQ.A07(findViewById3);
        this.A00 = (ImageView) findViewById3;
    }
}
