package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class NOU extends C232222tE {
    public final Context A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C74448Pv3 A03;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: com.instagram.model.direct.DirectMessageSearchThread} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.instagram.model.direct.DirectMessageSearchMessage} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.instagram.model.direct.DirectMessageSearchThread} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.instagram.model.direct.DirectMessageSearchThread} */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x00db, code lost:
        if (X.0qQ.A0K(r1, "secure_group") != false) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x007c, code lost:
        if (X.0qQ.A0K(r1, "secure_group") != false) goto L_0x007e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r23, X.C249703kE r24) {
        /*
            r22 = this;
            r6 = r24
            r1 = r23
            X.Ou5 r1 = (X.Ou5) r1
            X.Mz2 r6 = (X.C68035Mz2) r6
            r8 = r22
            android.content.Context r11 = r8.A00
            com.instagram.model.direct.DirectSearchResult r5 = r1.A04
            X.Pv3 r0 = r8.A03
            r21 = r0
            int r7 = r1.A00
            int r4 = r1.A01
            int r3 = r1.A03
            int r2 = r1.A02
            X.0iw r10 = r8.A01
            com.instagram.common.session.UserSession r9 = r8.A02
            boolean r0 = r5 instanceof com.instagram.model.direct.DirectMessageSearchMessage
            r8 = 0
            if (r0 == 0) goto L_0x00a7
            com.instagram.model.direct.DirectMessageSearchMessage r5 = (com.instagram.model.direct.DirectMessageSearchMessage) r5
            com.instagram.common.ui.base.IgTextView r1 = r6.A07
            java.lang.String r0 = r5.A0B
            r1.setText(r0)
            long r0 = r5.A02
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            r6.A03 = r12
            com.google.common.collect.ImmutableList r12 = r5.A03
            r6.A00 = r12
            android.widget.TextView r12 = r6.A06
            java.lang.String r13 = r5.A08
            java.lang.String r14 = " • "
            r15 = 61
            java.lang.String r15 = X.AnonymousClass000.A00(r15)
            java.lang.String r0 = X.C14240TsN.A04(r15, r0)
            java.lang.String r0 = X.002.A0R(r14, r0)
            android.text.SpannableStringBuilder r0 = X.OPF.A00(r11, r6, r13, r0, r8)
            r12.setText(r0)
            android.view.ViewGroup r12 = r6.A04
            X.OjL r0 = new X.OjL
            r20 = r8
            r19 = r2
            r17 = r4
            r18 = r3
            r15 = r5
            r16 = r7
            r13 = r0
            r14 = r21
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            X.AnonymousClass0fU.A00(r0, r12)
            java.lang.String r1 = r5.A0A
            java.lang.String r0 = "group"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x007e
            java.lang.String r0 = "secure_group"
            boolean r1 = X.0qQ.A0K(r1, r0)
            r0 = 0
            if (r1 == 0) goto L_0x007f
        L_0x007e:
            r0 = 1
        L_0x007f:
            com.google.common.collect.ImmutableList r1 = r5.A04
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.OPF.A01(r10, r9, r6, r0, r1)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r6.A02
            r0.setGradientSpinnerVisible(r8)
            android.view.ViewTreeObserver r1 = r12.getViewTreeObserver()
            X.Oki r0 = new X.Oki
            r0.<init>(r11, r9, r6)
            r1.addOnDrawListener(r0)
        L_0x0099:
            android.view.View r0 = r6.itemView
            r8 = r21
            r9 = r0
            r10 = r5
            r11 = r7
            r12 = r4
            r13 = r3
            r14 = r2
            r8.DfX(r9, r10, r11, r12, r13, r14)
        L_0x00a6:
            return
        L_0x00a7:
            boolean r0 = r5 instanceof com.instagram.model.direct.DirectMessageSearchThread
            if (r0 == 0) goto L_0x00a6
            com.instagram.model.direct.DirectMessageSearchThread r5 = (com.instagram.model.direct.DirectMessageSearchThread) r5
            com.instagram.common.ui.base.IgTextView r1 = r6.A07
            java.lang.String r0 = r5.A09
            r1.setText(r0)
            android.view.ViewGroup r1 = r6.A04
            r18 = 1
            X.OjL r0 = new X.OjL
            r11 = r0
            r12 = r21
            r13 = r5
            r14 = r7
            r15 = r4
            r16 = r3
            r17 = r2
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            X.AnonymousClass0fU.A00(r0, r1)
            java.lang.String r1 = r5.A0A
            java.lang.String r0 = "group"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 != 0) goto L_0x00dd
            java.lang.String r0 = "secure_group"
            boolean r1 = X.0qQ.A0K(r1, r0)
            r0 = 0
            if (r1 == 0) goto L_0x00de
        L_0x00dd:
            r0 = 1
        L_0x00de:
            com.google.common.collect.ImmutableList r1 = r5.A03
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.OPF.A01(r10, r9, r6, r0, r1)
            com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView r0 = r6.A02
            r0.setGradientSpinnerVisible(r8)
            android.widget.TextView r1 = r6.A06
            java.lang.String r0 = r5.A06
            r1.setText(r0)
            goto L_0x0099
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NOU.bind(X.2tL, X.3kE):void");
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C68035Mz2(DbT.A0C(layoutInflater, viewGroup, R.layout.direct_inbox_search_row_layout));
    }

    public final Class modelClass() {
        return Ou5.class;
    }

    public NOU(Context context, AnonymousClass0iw r2, UserSession userSession, C74448Pv3 pv3) {
        this.A00 = context;
        this.A03 = pv3;
        this.A01 = r2;
        this.A02 = userSession;
    }
}
