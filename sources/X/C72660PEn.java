package X;

import android.content.Context;
import android.view.ActionMode;
import android.widget.TextView;
import java.util.List;
import java.util.Set;

/* renamed from: X.PEn  reason: case insensitive filesystem */
public final class C72660PEn implements C327817Ch {
    public final TextView A00;
    public final Set A01 = DbS.A0y();
    public final OCC A02;
    public final OCC A03;
    public final OCC A04;

    public static final void A00(C72660PEn pEn, C54618HLb hLb) {
        for (O8X o8x : pEn.A01) {
            C329247Id r0 = o8x.A00.A0k;
            if (r0 != null) {
                r0.A04.add(hLb);
            }
        }
    }

    public final List D6U(ActionMode actionMode) {
        return 0sr.A1P(new OCC[]{this.A02, this.A03, this.A04});
    }

    public C72660PEn(TextView textView) {
        this.A00 = textView;
        Context context = textView.getContext();
        this.A02 = new OCC(AnonymousClass7TF.A0d(context.getResources(), 2131972401), new C73933PmD(this, 2));
        this.A03 = new OCC(AnonymousClass7TF.A0d(context.getResources(), 2131972402), new C73933PmD(this, 3));
        this.A04 = new OCC(AnonymousClass7TF.A0d(context.getResources(), 2131972403), new C73933PmD(this, 4));
    }
}
