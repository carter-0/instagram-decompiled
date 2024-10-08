package X;

import android.content.Context;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class NVA extends NVB {
    public final O6G A00;
    public final UserSession A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NVA(View view, UserSession userSession, OLM olm, O6G o6g, int i, boolean z) {
        super(view, userSession, olm, i, z);
        AnonymousClass7TG.A1O(userSession, olm);
        0qQ.A0B(o6g, 6);
        this.A01 = userSession;
        this.A00 = o6g;
        0nA.A0n(this.A02.A04.getView(), view, R.dimen.abc_button_padding_horizontal_material);
    }

    public final void A01(NVH nvh) {
        super.A01(nvh);
        Integer num = nvh.A01.A04;
        if (num != null) {
            Context A07 = DbS.A07(this);
            TextView textView = (TextView) this.A02.A0I.getView();
            0qQ.A0A(A07);
            textView.setText(1G0.A08(A07, (long) num.intValue()));
            DbT.A17(A07, textView, 2Yu.A0A(textView.getContext()));
            textView.setVisibility(0);
        }
        CompoundButton compoundButton = (CompoundButton) this.A02.A04.getView();
        if (nvh.A09) {
            compoundButton.setVisibility(0);
            compoundButton.setOnCheckedChangeListener((CompoundButton.OnCheckedChangeListener) null);
            compoundButton.setChecked(nvh.A0A);
            compoundButton.setOnCheckedChangeListener(new C71459Ol0(2, this, nvh));
            return;
        }
        compoundButton.setVisibility(8);
        compoundButton.setOnClickListener((View.OnClickListener) null);
    }
}
