package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.model.venue.Venue;
import java.util.List;

/* renamed from: X.Jl2  reason: case insensitive filesystem */
public final class C60409Jl2 extends 2Rw {
    public final List A00 = AnonymousClass7TE.A1C();
    public final /* synthetic */ LOe A01;

    public C60409Jl2(LOe lOe) {
        this.A01 = lOe;
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r5, int i) {
        View view;
        View.OnClickListener ly9;
        C60636Joj joj = (C60636Joj) r5;
        int A07 = JTP.A07(this, joj, 0, i);
        TextView textView = joj.A02;
        if (A07 == 2) {
            textView.setText(2131972797);
            joj.A01.setImageResource(R.drawable.search_location_small);
            view = joj.A00;
            ly9 = new LYB((Object) this.A01, 65);
        } else {
            textView.setText(((Venue) this.A00.get(i)).A00.getName());
            ImageView imageView = joj.A01;
            int i2 = 0;
            if (A07 == 1) {
                i2 = R.drawable.suggested_event_icon;
            }
            imageView.setImageResource(i2);
            view = joj.A00;
            ly9 = new LY9(i, 6, (Object) this.A01, (Object) this);
        }
        AnonymousClass0fU.A00(ly9, view);
    }

    public final int getItemCount() {
        int size;
        int A03 = AnonymousClass0fD.A03(-1206644797);
        List list = this.A00;
        if (list.isEmpty()) {
            size = 0;
        } else {
            size = list.size() + 1;
        }
        AnonymousClass0fD.A0A(370385708, A03);
        return size;
    }

    public final int getItemViewType(int i) {
        int i2;
        int i3;
        int A03 = AnonymousClass0fD.A03(1638733005);
        if (i <= 0 || i != this.A00.size()) {
            i2 = 0;
            i3 = -1270588140;
            if ("facebook_events".equals(((Venue) this.A00.get(i)).A03())) {
                i2 = 1;
                i3 = -454760471;
            }
        } else {
            i2 = 2;
            i3 = 216911207;
        }
        AnonymousClass0fD.A0A(i3, A03);
        return i2;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        C60636Joj A012 = C64005LIl.A01(viewGroup);
        A012.A02.setMaxWidth(this.A01.A03);
        return A012;
    }
}
