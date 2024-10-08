package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgButton;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.VvI  reason: case insensitive filesystem */
public final class C18625VvI {
    public ImageButton A00;
    public TextView A01;
    public TextView A02;
    public TextView A03;
    public TextView A04;
    public TextView A05;
    public boolean A06;
    public IgButton A07;
    public IgButton A08;
    public final Context A09;
    public final C233292vT A0A;
    public final C233452vk A0B;
    public final View.OnClickListener A0C = new WB0(this, 14);
    public final View.OnClickListener A0D = new WB0(this, 15);
    public final View.OnClickListener A0E = new WB0(this, 16);

    public final void A02(View view) {
        0qQ.A0B(view, 0);
        this.A03 = DbU.A0G(view, R.id.pool_debug_info);
        this.A04 = DbU.A0G(view, R.id.debug_gap_rules);
        this.A05 = DbU.A0G(view, R.id.debug_insertion_log);
        this.A01 = DbU.A0G(view, R.id.debug_ad_pool);
        this.A00 = (ImageButton) view.requireViewById(R.id.media_pause_button);
        this.A07 = (IgButton) view.requireViewById(R.id.debug_clear_pool);
        this.A08 = (IgButton) view.requireViewById(R.id.debug_fill_pool);
        TextView textView = this.A04;
        if (textView != null) {
            AnonymousClass0fU.A00(this.A0E, textView);
        }
        TextView textView2 = this.A05;
        if (textView2 != null) {
            AnonymousClass0fU.A00(this.A0E, textView2);
        }
        TextView textView3 = this.A01;
        if (textView3 != null) {
            AnonymousClass0fU.A00(this.A0E, textView3);
        }
        ImageButton imageButton = this.A00;
        if (imageButton != null) {
            AnonymousClass0fU.A00(this.A0C, imageButton);
        }
        IgButton igButton = this.A07;
        if (igButton != null) {
            AnonymousClass0fU.A00(this.A0D, igButton);
        }
        IgButton igButton2 = this.A08;
        if (igButton2 != null) {
            AnonymousClass0fU.A00(this.A0D, igButton2);
        }
        TextView textView4 = this.A04;
        this.A02 = textView4;
        if (textView4 != null) {
            textView4.performClick();
        }
    }

    public static final void A00(StringBuilder sb, Map map) {
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            sb.append(DbT.A13(A1J));
            Pxg.A1P(": ", (String) A1J.getValue(), "\n", sb);
        }
        sb.append("\n");
    }

    public final void A01() {
        TextView textView;
        Integer valueOf;
        StringBuilder sb;
        if (this.A03 != null && (textView = this.A02) != null && (valueOf = Integer.valueOf(textView.getId())) != null) {
            int intValue = valueOf.intValue();
            if (intValue == R.id.debug_gap_rules) {
                C233452vk r4 = this.A0B;
                Map AuU = r4.AuU();
                sb = new StringBuilder();
                sb.append("Current State");
                sb.append(": \n");
                StringBuilder sb2 = new StringBuilder();
                A00(sb2, AuU);
                sb.append(sb2);
                if (r4.Atu() != null) {
                    StringBuilder sb3 = new StringBuilder();
                    Map B8v = r4.B8v();
                    sb3.append("Gap Rules Enforced");
                    sb3.append(": \n");
                    StringBuilder sb4 = new StringBuilder();
                    A00(sb4, B8v);
                    sb3.append(sb4);
                    sb.append(sb3);
                }
                sb.append("Pool Size");
                sb.append(": ");
                sb.append(Integer.valueOf(r4.Bdc().size()));
            } else if (intValue == R.id.debug_insertion_log) {
                List BHf = this.A0B.BHf();
                sb = new StringBuilder();
                if (BHf != null) {
                    Iterator it = BHf.iterator();
                    while (it.hasNext()) {
                        sb.append(AnonymousClass7TE.A18(it));
                        sb.append("\n");
                    }
                }
            } else if (intValue == R.id.debug_ad_pool) {
                Map Bdc = this.A0B.Bdc();
                sb = new StringBuilder();
                boolean z = false;
                if (!Bdc.isEmpty()) {
                    z = true;
                }
                if (z) {
                    sb.append("Pool List");
                    sb.append(":\n");
                    sb.append("\n");
                }
                Iterator A0u = AnonymousClass7TF.A0u(Bdc);
                while (A0u.hasNext()) {
                    sb.append((String) C51971G9r.A0p(A0u));
                    sb.append("\n");
                }
            } else {
                return;
            }
            TextView textView2 = this.A03;
            if (textView2 != null) {
                textView2.setText(sb);
            }
        }
    }

    public C18625VvI(Context context, C233292vT r4, C233452vk r5) {
        this.A0B = r5;
        this.A0A = r4;
        this.A09 = context;
        r5.EQL(this);
    }
}
