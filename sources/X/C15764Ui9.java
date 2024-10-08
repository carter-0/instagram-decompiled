package X;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Ui9  reason: case insensitive filesystem */
public final class C15764Ui9 extends C232222tE {
    public final UserSession A00;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View A09 = DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.upcoming_event_cta_row_item, false);
        Object A0U = C13988Tno.A0U(A09, new C14866UCu(A09));
        0qQ.A0C(A0U, "null cannot be cast to non-null type com.instagram.upcomingevents.bottomsheet.adapter.definition.UpcomingEventOffsiteLinkRowItemViewBinder.ViewHolder");
        return (C249703kE) A0U;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v1, resolved type: com.instagram.igds.components.button.IgdsButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: com.instagram.igds.components.textcell.IgdsListCell} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: com.instagram.igds.components.button.IgdsButton} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: com.instagram.igds.components.button.IgdsButton} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r13, X.C249703kE r14) {
        /*
            r12 = this;
            X.WSF r13 = (X.WSF) r13
            X.UCu r14 = (X.C14866UCu) r14
            boolean r11 = X.AnonymousClass7TG.A1Z(r13, r14)
            com.instagram.common.session.UserSession r7 = r12.A00
            boolean r3 = X.C51970G9q.A1Y(r7)
            X.VPq r2 = r13.A01
            X.JwF r6 = r13.A00
            java.lang.Object r0 = r6.A00
            int r0 = X.AnonymousClass7TE.A0M(r0)
            r4 = 8
            if (r0 == r11) goto L_0x005f
            if (r0 != r3) goto L_0x0094
            com.instagram.igds.components.textcell.IgdsListCell r1 = r14.A01
            r0 = 2131238496(0x7f081e60, float:1.8093272E38)
            r1.A05(r0)
            android.content.Context r5 = r1.getContext()
            int r0 = X.2Yu.A06(r5)
            r1.setIconColorContrib(r0)
            java.lang.String r0 = r6.A01
            r1.A0I(r0)
            int r0 = X.2Yu.A06(r5)
            r1.setTitleTextColorContrib(r0)
            r1.setTitleMaxLines(r11)
            r8 = 0
            r0 = 25
            X.MP8 r10 = new X.MP8
            r10.<init>(r2, r0)
            X.3aW r6 = new X.3aW
            r9 = r8
            r6.<init>(r7, r8, r9, r10, r11)
            r1.A0C(r6)
            com.instagram.igds.components.button.IgdsButton r0 = r14.A00
        L_0x0053:
            r0.setVisibility(r4)
            r1.setVisibility(r3)
            X.UbS r0 = r2.A00
            r0.A08(r1)
            return
        L_0x005f:
            com.instagram.igds.components.button.IgdsButton r1 = r14.A00
            boolean r0 = r6.A02
            if (r0 == 0) goto L_0x0070
            boolean r0 = X.C61670oa.A00()
            if (r0 != 0) goto L_0x0070
            X.1QG r0 = X.1QG.A03
            r1.setOverridePrismVariant(r0)
        L_0x0070:
            X.4lo r0 = X.C273014lo.PRIMARY
            r1.setStyle(r0)
            r0 = 2131238496(0x7f081e60, float:1.8093272E38)
            X.O33.A00(r1, r0)
            java.lang.String r0 = r6.A01
            r1.setText((java.lang.String) r0)
            r8 = 0
            r0 = 24
            X.MP8 r10 = new X.MP8
            r10.<init>(r2, r0)
            X.3aW r6 = new X.3aW
            r9 = r8
            r6.<init>(r7, r8, r9, r10, r11)
            X.AnonymousClass0fU.A00(r6, r1)
            com.instagram.igds.components.textcell.IgdsListCell r0 = r14.A01
            goto L_0x0053
        L_0x0094:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15764Ui9.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return WSF.class;
    }

    public C15764Ui9(UserSession userSession) {
        this.A00 = userSession;
    }
}
