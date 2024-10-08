package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.direct.ui.polls.PollMessageOptionView;

/* renamed from: X.NOp  reason: case insensitive filesystem */
public final class C68593NOp extends C232222tE {
    public final OJe A00;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (X.00l.A0W(r8) != false) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C67968Mxs r6, X.C68593NOp r7, java.lang.CharSequence r8) {
        /*
            r2 = 0
            if (r8 == 0) goto L_0x000a
            boolean r1 = X.00l.A0W(r8)
            r0 = 0
            if (r1 == 0) goto L_0x000b
        L_0x000a:
            r0 = 1
        L_0x000b:
            r3 = 8
            if (r0 != 0) goto L_0x005c
            X.OJe r0 = r7.A00
            X.Oam r5 = r0.A00
            boolean r0 = r5.A0E
            if (r0 == 0) goto L_0x0051
            java.util.List r0 = r5.A0C
            int r0 = r0.size()
            java.util.List r4 = r5.A0B
            int r1 = X.DbT.A01(r4, r0)
            r0 = 100
            if (r1 >= r0) goto L_0x0051
            int r1 = r4.size()
            r0 = 1
            int r1 = r1 - r0
            java.lang.Object r0 = r4.get(r1)
            X.N5m r0 = (X.C68197N5m) r0
            java.lang.CharSequence r0 = r0.A00
            if (r0 == 0) goto L_0x0051
            int r0 = r0.length()
            if (r0 == 0) goto L_0x0051
            int r1 = r5.A00
            int r0 = r1 + 1
            r5.A00 = r0
            X.N5m r0 = new X.N5m
            r0.<init>(r1)
            r4.add(r0)
            X.C71067Oam.A01(r5)
            X.C71067Oam.A00(r5)
        L_0x0051:
            com.instagram.common.ui.base.IgCheckBox r0 = r6.A00
            r0.setVisibility(r2)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r6.A01
            r0.setVisibility(r3)
            return
        L_0x005c:
            com.instagram.common.ui.base.IgCheckBox r0 = r6.A00
            r0.setVisibility(r3)
            com.instagram.common.ui.base.IgSimpleImageView r0 = r6.A01
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C68593NOp.A00(X.Mxs, X.NOp, java.lang.CharSequence):void");
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        JTQ.A1L(viewGroup, layoutInflater);
        return new C67968Mxs(DbT.A0D(layoutInflater, viewGroup, R.layout.poll_message_add_option_item, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r4, C249703kE r5) {
        C68197N5m n5m = (C68197N5m) r4;
        C67968Mxs mxs = (C67968Mxs) r5;
        AnonymousClass7TG.A1N(n5m, mxs);
        A00(mxs, this, n5m.A00);
        PollMessageOptionView pollMessageOptionView = mxs.A02;
        pollMessageOptionView.setText(String.valueOf(n5m.A00));
        pollMessageOptionView.A01 = new P4F(mxs, this, n5m);
        mxs.A00.setOnCheckedChangeListener(new C71469OlD(n5m, 15));
    }

    public final Class modelClass() {
        return C68197N5m.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r3) {
        PollMessageOptionView pollMessageOptionView;
        C67968Mxs mxs = (C67968Mxs) r3;
        if (mxs != null && (pollMessageOptionView = mxs.A02) != null) {
            pollMessageOptionView.A01 = null;
        }
    }

    public C68593NOp(OJe oJe) {
        this.A00 = oJe;
    }
}
