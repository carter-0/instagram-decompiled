package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel;

public final class KFG extends C232222tE {
    public final AnonymousClass0iw A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C60615JoO(DbT.A0D(layoutInflater, viewGroup, R.layout.poll_message_option_voters_item, false));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0027, code lost:
        if (r2.length() == 0) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r8, X.C249703kE r9) {
        /*
            r7 = this;
            com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel r8 = (com.instagram.direct.fragment.thread.poll.view.PollMessageVoterInfoViewModel) r8
            X.JoO r9 = (X.C60615JoO) r9
            r6 = 0
            X.AnonymousClass7TF.A1H(r8, r9)
            com.instagram.common.ui.widget.imageview.CircularImageView r2 = r9.A02
            com.instagram.common.typedurl.ImageUrl r1 = r8.A00
            X.0iw r0 = r7.A00
            r2.setUrl(r1, r0)
            android.view.View r5 = r9.itemView
            java.lang.String r0 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout"
            X.0qQ.A0C(r5, r0)
            androidx.constraintlayout.widget.ConstraintLayout r5 = (androidx.constraintlayout.widget.ConstraintLayout) r5
            X.4gb r4 = X.JTQ.A0C(r5)
            java.lang.String r2 = r8.A02
            if (r2 == 0) goto L_0x0029
            int r1 = r2.length()
            r0 = 0
            if (r1 != 0) goto L_0x002a
        L_0x0029:
            r0 = 1
        L_0x002a:
            r3 = 4
            com.instagram.common.ui.base.IgTextView r1 = r9.A00
            if (r0 == 0) goto L_0x004b
            java.lang.String r0 = r8.A03
            r1.setText(r0)
            com.instagram.common.ui.base.IgTextView r1 = r9.A01
            r0 = 8
            r1.setVisibility(r0)
            X.DbS.A1C(r1)
            r1 = 2131437353(0x7f0b2729, float:1.8496602E38)
            r0 = 2131437352(0x7f0b2728, float:1.84966E38)
            r4.A0C(r1, r3, r0, r3)
        L_0x0047:
            r4.A0G(r5)
            return
        L_0x004b:
            r1.setText(r2)
            com.instagram.common.ui.base.IgTextView r1 = r9.A01
            r1.setVisibility(r6)
            java.lang.String r0 = r8.A03
            r1.setText(r0)
            r2 = 2131437353(0x7f0b2729, float:1.8496602E38)
            r1 = 2131437354(0x7f0b272a, float:1.8496604E38)
            r0 = 3
            r4.A0C(r2, r3, r1, r0)
            goto L_0x0047
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KFG.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return PollMessageVoterInfoViewModel.class;
    }

    public KFG(AnonymousClass0iw r1) {
        this.A00 = r1;
    }
}
