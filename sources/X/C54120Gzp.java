package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.List;

/* renamed from: X.Gzp  reason: case insensitive filesystem */
public abstract class C54120Gzp extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "HighlightsToGridBottomSheet";
    public Integer A00;
    public String A01;
    public String A02 = __redex_internal_original_name;
    public String A03;
    public List A04;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.nux_title);
        List A1P = 0sr.A1P(new LinearLayout[]{(LinearLayout) view.requireViewById(R.id.bullet_point_1), (LinearLayout) view.requireViewById(R.id.bullet_point_2), (LinearLayout) view.requireViewById(R.id.bullet_point_3)});
        String str = this.A03;
        if (str != null) {
            this.A02 = str;
        }
        Integer num = this.A00;
        if (num != null) {
            DbU.A1G(A0R, this, num.intValue());
        }
        List list = this.A04;
        if (list != null) {
            int i = 0;
            for (Object next : list) {
                int i2 = i + 1;
                if (i < 0) {
                    0sr.A1T();
                    throw AnonymousClass00P.createAndThrow();
                }
                C53368Gms gms = (C53368Gms) next;
                View view2 = (View) A1P.get(i);
                String A0z = DbV.A0z(this, this.A01, gms.A01);
                0qQ.A07(A0z);
                int i3 = gms.A00;
                DbW.A0B(view2, R.id.bullet_subtitle).setText(A0z);
                ((ImageView) AnonymousClass7TE.A0b(view2, R.id.bullet_icon)).setImageResource(i3);
                i = i2;
            }
        }
    }

    public final String getModuleName() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(445130277);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.layout_highlights_to_grid_nux_bottomsheet, viewGroup, false);
        AnonymousClass0fD.A09(1996959774, A022);
        return inflate;
    }
}
