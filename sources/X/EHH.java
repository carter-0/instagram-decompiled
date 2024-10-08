package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.hallpass.model.HallPassMemberViewModel;

public final class EHH extends C232232tF {
    public View A00;
    public final Context A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final E7T A04;

    public EHH(Context context, AnonymousClass0iw r3, UserSession userSession, E7T e7t) {
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A03 = userSession;
        this.A02 = r3;
        this.A04 = e7t;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x003c, code lost:
        if (r0.length() == 0) goto L_0x003e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r19, X.C249703kE r20) {
        /*
            r18 = this;
            r7 = r20
            r6 = r19
            com.instagram.hallpass.model.HallPassMemberViewModel r6 = (com.instagram.hallpass.model.HallPassMemberViewModel) r6
            X.Dp8 r7 = (X.C47016Dp8) r7
            boolean r0 = X.AnonymousClass7TG.A1Z(r6, r7)
            r1 = r18
            android.content.Context r11 = r1.A01
            com.instagram.common.session.UserSession r5 = r1.A03
            X.0iw r4 = r1.A02
            X.E7T r3 = r1.A04
            r15 = 0
            X.0qQ.A0B(r11, r15)
            X.AnonymousClass7TF.A1B(r5, r0, r4)
            r0 = 5
            X.0qQ.A0B(r3, r0)
            com.instagram.common.ui.base.IgTextView r8 = r7.A02
            com.instagram.user.model.User r2 = r6.A00
            java.lang.String r0 = r2.B8Q()
            r8.setText(r0)
            com.instagram.common.ui.base.IgTextView r10 = r7.A03
            X.DbU.A1H(r10, r2)
            java.lang.String r0 = r2.getFullName()
            if (r0 == 0) goto L_0x003e
            int r0 = r0.length()
            r9 = 0
            if (r0 != 0) goto L_0x003f
        L_0x003e:
            r9 = 1
        L_0x003f:
            r1 = 8
            r0 = 0
            if (r9 == 0) goto L_0x0046
            r0 = 8
        L_0x0046:
            r10.setVisibility(r0)
            com.instagram.common.ui.base.IgSimpleImageView r9 = r7.A01
            android.content.res.Resources r11 = r11.getResources()
            r0 = 2131165250(0x7f070042, float:1.7944712E38)
            int r14 = r11.getDimensionPixelSize(r0)
            com.instagram.common.typedurl.ImageUrl r12 = r2.Bh3()
            java.lang.String r13 = "HallPassMemberListItemViewBinder"
            X.3ay r11 = new X.3ay
            r16 = r15
            r17 = r15
            r11.<init>(r12, r13, r14, r15, r16, r17)
            r9.setImageDrawable(r11)
            r11 = 39
            X.FPF r0 = new X.FPF
            r0.<init>((X.E7T) r3, (com.instagram.hallpass.model.HallPassMemberViewModel) r6, (int) r11)
            X.AnonymousClass0fU.A00(r0, r8)
            r8 = 40
            X.FPF r0 = new X.FPF
            r0.<init>((X.E7T) r3, (com.instagram.hallpass.model.HallPassMemberViewModel) r6, (int) r8)
            X.AnonymousClass0fU.A00(r0, r10)
            r8 = 41
            X.FPF r0 = new X.FPF
            r0.<init>((X.E7T) r3, (com.instagram.hallpass.model.HallPassMemberViewModel) r6, (int) r8)
            X.AnonymousClass0fU.A00(r0, r9)
            java.lang.String r8 = r2.getId()
            com.instagram.user.model.User r0 = X.AnonymousClass7TF.A0Q(r5)
            boolean r0 = X.DbV.A1Z(r0, r8)
            if (r0 != 0) goto L_0x00b7
            boolean r0 = r2.A29()
            if (r0 != 0) goto L_0x00b7
            com.instagram.common.ui.base.IgSimpleImageView r0 = r7.A00
            r0.setVisibility(r1)
            X.3oV r1 = r7.A04
            r1.setVisibility(r15)
            android.view.View r0 = r1.getView()
            com.instagram.user.follow.FollowButtonBase r0 = (com.instagram.user.follow.FollowButtonBase) r0
            X.4at r0 = r0.A0J
            r0.A03(r4, r5, r2)
            android.view.View r0 = r1.getView()
            X.DbT.A1G(r0, r5, r2)
            return
        L_0x00b7:
            com.instagram.common.ui.base.IgSimpleImageView r2 = r7.A00
            r2.setVisibility(r15)
            X.3oV r0 = r7.A04
            r0.setVisibility(r1)
            r1 = 42
            X.FPF r0 = new X.FPF
            r0.<init>((X.E7T) r3, (com.instagram.hallpass.model.HallPassMemberViewModel) r6, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EHH.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return HallPassMemberViewModel.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_hall_pass_member_row_item, false);
        this.A00 = A0D;
        return new C47016Dp8(A0D);
    }
}
