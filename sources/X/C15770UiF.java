package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;

/* renamed from: X.UiF  reason: case insensitive filesystem */
public final class C15770UiF extends C232222tE {
    public final X47 A00;
    public final VO9 A01;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x002b, code lost:
        if (r10.length() == 0) goto L_0x002d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r12, X.C249703kE r13) {
        /*
            r11 = this;
            X.WSq r12 = (X.C19282WSq) r12
            boolean r2 = X.AnonymousClass7TG.A1Z(r12, r13)
            android.view.View r5 = r13.itemView
            X.0qQ.A06(r5)
            android.view.View r0 = r13.itemView
            java.lang.Object r7 = r0.getTag()
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.discovery.inform.ui.InlineInformMessageViewBinder.Holder"
            X.0qQ.A0C(r7, r0)
            X.VZQ r7 = (X.VZQ) r7
            X.N3M r6 = r12.A00
            X.VO9 r8 = r11.A01
            X.X47 r4 = r11.A00
            r9 = 0
            X.AnonymousClass7TG.A0w(r2, r7, r8, r4)
            java.lang.String r10 = r6.A09
            if (r10 == 0) goto L_0x002d
            int r0 = r10.length()
            r1 = 0
            if (r0 != 0) goto L_0x002e
        L_0x002d:
            r1 = 1
        L_0x002e:
            r3 = 8
            android.widget.TextView r0 = r7.A01
            if (r1 == 0) goto L_0x0072
            r0.setVisibility(r3)
        L_0x0037:
            java.lang.String r1 = r6.A04
            if (r1 == 0) goto L_0x006c
            int r0 = r1.length()
            if (r0 == 0) goto L_0x006c
            android.widget.TextView r0 = r7.A00
            X.C13990Tnq.A0v(r0, r1, r2)
        L_0x0046:
            java.lang.String r2 = r6.A03
            if (r2 == 0) goto L_0x0066
            int r0 = r2.length()
            if (r0 == 0) goto L_0x0066
            com.instagram.igds.components.button.IgdsButton r1 = r7.A02
            r1.setVisibility(r9)
            r1.setText((java.lang.String) r2)
            r0 = 11
            X.WBG.A01(r1, r0, r6, r8)
        L_0x005d:
            com.instagram.igds.components.button.IgdsButton r0 = r7.A03
            r0.setVisibility(r3)
            r4.EBK(r5, r6)
            return
        L_0x0066:
            com.instagram.igds.components.button.IgdsButton r0 = r7.A02
            r0.setVisibility(r3)
            goto L_0x005d
        L_0x006c:
            android.widget.TextView r0 = r7.A00
            r0.setVisibility(r3)
            goto L_0x0046
        L_0x0072:
            X.C13990Tnq.A0v(r0, r10, r2)
            goto L_0x0037
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15770UiF.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C19282WSq.class;
    }

    public C15770UiF(X47 x47, VO9 vo9) {
        AnonymousClass7TG.A1O(vo9, x47);
        this.A01 = vo9;
        this.A00 = x47;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View A0A = DbU.A0A(layoutInflater, viewGroup, R.layout.inform_header, false);
        A0A.setTag(new VZQ(A0A));
        C249703kE r1 = new C249703kE(A0A);
        if (A0A.getTag() instanceof VZQ) {
            return r1;
        }
        throw DbT.A0m();
    }
}
