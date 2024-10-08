package X;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.igds.components.button.IgdsButton;
import java.util.Date;
import java.util.List;
import java.util.Map;

/* renamed from: X.GQm  reason: case insensitive filesystem */
public final class C52387GQm extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;
    public final Object A09;
    public final Object A0A;
    public final Object A0B;
    public final Object A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52387GQm(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, int i) {
        super(1);
        this.A00 = i;
        this.A03 = obj;
        this.A0C = obj2;
        this.A0A = obj3;
        this.A04 = obj4;
        this.A09 = obj5;
        this.A05 = obj6;
        this.A01 = obj7;
        this.A02 = obj8;
        this.A08 = obj9;
        this.A06 = obj10;
        this.A07 = obj11;
        this.A0B = obj12;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = obj;
        if (this.A00 != 0) {
            C55882Hp3 hp3 = (C55882Hp3) obj2;
            TextView textView = (TextView) this.A03;
            if (!textView.isFocused()) {
                textView.setText(hp3.A04);
            }
            ((View) this.A0C).setClickable(true);
            K6B k6b = (K6B) this.A04;
            DbT.A17(k6b.requireContext(), (TextView) this.A0A, R.color.igds_primary_text);
            ImageView imageView = (ImageView) this.A09;
            imageView.setClickable(true);
            Date date = hp3.A05;
            int i = 0;
            if (date != null) {
                TextView textView2 = (TextView) this.A0B;
                textView2.setText(C14240TsN.A02(k6b.requireContext(), AnonymousClass7TE.A0l(k6b.A01), date.getTime()));
                textView2.setVisibility(0);
            } else {
                ((View) this.A0B).setVisibility(8);
            }
            DbU.A13(k6b.requireContext(), imageView, hp3.A03);
            ((View) this.A05).setVisibility(DbW.A01(hp3.A06 ? 1 : 0));
            DbU.A13(k6b.requireContext(), (ImageView) this.A01, hp3.A00);
            DbU.A1G((TextView) this.A02, k6b, hp3.A01);
            ((View) this.A08).setVisibility(DbW.A01(hp3.A0A ? 1 : 0));
            View view = (View) this.A06;
            if (!hp3.A07) {
                i = 8;
            }
            view.setVisibility(i);
            IgdsButton igdsButton = (IgdsButton) this.A07;
            igdsButton.setText(hp3.A02);
            igdsButton.setLoading(hp3.A09);
            igdsButton.setEnabled(hp3.A08);
        } else {
            C305006Gb A0L = C51968G9o.A0L(obj2);
            Object obj3 = this.A03;
            if (obj3 != null) {
                A0L.Cf3("megaphone", "megaphone", AnonymousClass5PI.A03(new JJS(14, this.A04, obj3), 1201741658));
            }
            List list = (List) this.A02;
            C52380GQf gQf = C52380GQf.A00;
            GQB gqb = GQB.A00;
            C62320sa r10 = (C62320sa) this.A06;
            0sL r12 = (0sL) this.A0B;
            Map map = (Map) this.A01;
            Integer num = (Integer) this.A05;
            0sK r13 = (0sK) this.A07;
            C62320sa r11 = (C62320sa) this.A09;
            int size = list.size();
            C51967G9n.A12(A0L, new GQE(num, list, map, r10, r11, r12, r13, (0sJ) this.A0A, (0sJ) this.A08, (0sJ) this.A0C), new MPB(35, list, (0sP) gQf), new MPB(36, list, (0sP) gqb), size);
        }
        return C60340gF.A00;
    }
}
