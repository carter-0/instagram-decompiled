package X;

import android.graphics.ColorFilter;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import java.util.ArrayList;

public final class KKK extends C60381Jka {
    public final C361518gM A00;
    public final ArrayList A01 = AnonymousClass7TE.A1C();

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C60633Jog(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.filter_type_icon_layout, false), this);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r6, int i) {
        C60633Jog jog = (C60633Jog) r6;
        0qQ.A0B(jog, 0);
        C63945LEl lEl = (C63945LEl) DbZ.A0g(this.A01, i);
        0qQ.A0B(lEl, 0);
        jog.A00 = lEl;
        Integer num = lEl.A00;
        if (num != null) {
            int intValue = num.intValue();
            ImageView imageView = jog.A01;
            imageView.setImageResource(intValue);
            imageView.getDrawable().setColorFilter((ColorFilter) null);
        }
        jog.A02.setText(lEl.A01());
        View A0F = JTO.A0F(jog);
        KKK kkk = jog.A03;
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(A0F);
        A0m.A06 = false;
        A0m.A04 = new C61683KHr(0, lEl, kkk, jog);
        A0m.A00();
    }

    public KKK(C361518gM r2) {
        this.A00 = r2;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-857932649);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(-1527564606, A03);
        return size;
    }
}
