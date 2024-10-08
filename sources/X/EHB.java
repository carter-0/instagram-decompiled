package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.hallpass.model.HallPassMemberViewModel;

public final class EHB extends C232232tF {
    public View A00;
    public final Context A01;
    public final E7S A02;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0030, code lost:
        if (r1 == 0) goto L_0x0032;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r13, X.C249703kE r14) {
        /*
            r12 = this;
            com.instagram.hallpass.model.HallPassMemberViewModel r13 = (com.instagram.hallpass.model.HallPassMemberViewModel) r13
            X.Doj r14 = (X.C46991Doj) r14
            X.AnonymousClass7TG.A1N(r13, r14)
            android.content.Context r5 = r12.A01
            X.E7S r3 = r12.A02
            r9 = 0
            X.AnonymousClass7TF.A1C(r5, r9, r3)
            com.instagram.common.ui.base.IgTextView r2 = r14.A02
            com.instagram.user.model.User r4 = r13.A00
            java.lang.String r0 = r4.B8Q()
            r2.setText(r0)
            r1 = 32
            X.FPF r0 = new X.FPF
            r0.<init>((X.E7S) r3, (com.instagram.hallpass.model.HallPassMemberViewModel) r13, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
            java.lang.String r0 = r4.getFullName()
            r6 = 0
            if (r0 == 0) goto L_0x0032
            int r1 = r0.length()
            r0 = 0
            if (r1 != 0) goto L_0x0033
        L_0x0032:
            r0 = 1
        L_0x0033:
            r1 = r0 ^ 1
            boolean r0 = r13.A01
            com.instagram.common.ui.base.IgTextView r2 = r14.A03
            if (r0 == 0) goto L_0x00b9
            android.text.SpannableStringBuilder r7 = new android.text.SpannableStringBuilder
            r7.<init>()
            r0 = 2131954685(0x7f130bfd, float:1.9545876E38)
            java.lang.String r6 = X.AnonymousClass7TE.A16(r5, r0)
            if (r1 == 0) goto L_0x00b1
            java.lang.String r8 = r4.getUsername()
            r1 = 20
            java.util.regex.Pattern r0 = X.0mp.A01
            int r0 = r8.length()
            if (r0 < r1) goto L_0x0069
            java.lang.String r1 = r8.substring(r9, r1)
            X.0qQ.A07(r1)
            r0 = 2131961564(0x7f1326dc, float:1.9559828E38)
            java.lang.String r0 = r5.getString(r0)
            java.lang.String r8 = X.002.A0R(r1, r0)
        L_0x0069:
            r7.append(r8)
            java.lang.String r0 = " • "
            r7.append(r0)
            r7.append(r6)
        L_0x0074:
            r2.setText(r7)
            r2.setVisibility(r9)
        L_0x007a:
            r1 = 33
            X.FPF r0 = new X.FPF
            r0.<init>((X.E7S) r3, (com.instagram.hallpass.model.HallPassMemberViewModel) r13, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
            com.instagram.common.ui.base.IgSimpleImageView r2 = r14.A01
            int r8 = X.Dbb.A01(r5)
            com.instagram.common.typedurl.ImageUrl r6 = r4.Bh3()
            java.lang.String r7 = "CampfireMemberListItemViewBinder"
            X.3ay r5 = new X.3ay
            r10 = r9
            r11 = r9
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r2.setImageDrawable(r5)
            r1 = 34
            X.FPF r0 = new X.FPF
            r0.<init>((X.E7S) r3, (com.instagram.hallpass.model.HallPassMemberViewModel) r13, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
            com.instagram.common.ui.base.IgSimpleImageView r2 = r14.A00
            r1 = 35
            X.FPF r0 = new X.FPF
            r0.<init>((X.E7S) r3, (com.instagram.hallpass.model.HallPassMemberViewModel) r13, (int) r1)
            X.AnonymousClass0fU.A00(r0, r2)
            return
        L_0x00b1:
            android.text.SpannableStringBuilder r7 = r7.append(r6)
            X.0qQ.A07(r7)
            goto L_0x0074
        L_0x00b9:
            X.DbU.A1H(r2, r4)
            if (r1 != 0) goto L_0x00c0
            r6 = 8
        L_0x00c0:
            r2.setVisibility(r6)
            goto L_0x007a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EHB.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return HallPassMemberViewModel.class;
    }

    public EHB(Context context, E7S e7s) {
        this.A01 = context;
        this.A02 = e7s;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TG.A1N(viewGroup, layoutInflater);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_campfire_member_row_item, false);
        this.A00 = A0D;
        return new C46991Doj(A0D);
    }
}
