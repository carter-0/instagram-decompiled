package X;

import android.app.Activity;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class UA2 extends 2Rw {
    public final Activity A00;
    public final AnonymousClass0iw A01;
    public final UserSession A02;
    public final C230062or A03;
    public final C17706Vcb A04;
    public final WWQ A05;
    public final List A06;

    public UA2(Activity activity, AnonymousClass0iw r3, UserSession userSession, C230062or r5, C17706Vcb vcb, WWQ wwq, List list) {
        C51973G9u.A0r(1, activity, r3, r5);
        0qQ.A0B(userSession, 7);
        this.A00 = activity;
        this.A05 = wwq;
        this.A06 = list;
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = vcb;
        this.A02 = userSession;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onBindViewHolder(X.C249703kE r12, int r13) {
        /*
            r11 = this;
            r10 = r12
            X.UEI r10 = (X.UEI) r10
            r4 = 0
            X.0qQ.A0B(r10, r4)
            java.util.List r0 = r11.A06
            r7 = r13
            java.lang.Object r2 = r0.get(r13)
            X.VXz r2 = (X.C17496VXz) r2
            com.instagram.user.model.User r9 = r2.A02
            if (r9 == 0) goto L_0x009f
            com.instagram.user.follow.FollowButton r6 = r10.A08
            r8 = 1
            r6.A0A = r8
            X.4at r1 = r6.A0J
            com.instagram.common.session.UserSession r0 = r11.A02
            X.0iw r5 = r11.A01
            r1.A03(r5, r0, r9)
            boolean r3 = r9.A2D()
            r1 = 8
            android.view.View r0 = r10.A02
            if (r3 == 0) goto L_0x00a5
            r0.setVisibility(r4)
            r6.setVisibility(r1)
        L_0x0032:
            android.widget.TextView r3 = r10.A06
            boolean r0 = r9.isVerified()
            X.C244273av.A0B(r3, r0)
            android.widget.TextView r1 = r10.A04
            boolean r0 = r1 instanceof com.instagram.common.ui.text.TightTextView
            if (r0 == 0) goto L_0x0046
            r0 = r1
            com.instagram.common.ui.text.TightTextView r0 = (com.instagram.common.ui.text.TightTextView) r0
            r0.A00 = r8
        L_0x0046:
            java.lang.String r0 = r2.A03
            r1.setText(r0)
            java.lang.String r0 = r9.getFullName()
            if (r0 == 0) goto L_0x006c
            int r0 = r0.length()
            if (r0 == 0) goto L_0x006c
            java.lang.String r0 = r9.getFullName()
            r3.setText(r0)
            java.lang.CharSequence r0 = r1.getText()
            X.0qQ.A07(r0)
            int r0 = r0.length()
            if (r0 != 0) goto L_0x006f
            r3 = r1
        L_0x006c:
            X.DbU.A1H(r3, r9)
        L_0x006f:
            X.X9o r0 = r2.A00
            if (r0 == 0) goto L_0x00a0
            X.UMv r0 = (X.UMv) r0
            java.lang.String r3 = r0.A02
            int r2 = r0.A01
            int r0 = r0.A00
            com.instagram.model.mediasize.ExtendedImageUrl r1 = new com.instagram.model.mediasize.ExtendedImageUrl
            r1.<init>(r3, r2, r0)
        L_0x0080:
            com.instagram.common.ui.widget.imageview.CircularImageView r0 = r10.A07
            r0.setUrl(r1, r5)
            android.view.View r0 = r10.A00
            X.WB3.A00(r0, r9, r11, r13, r4)
            android.widget.TextView r0 = r10.A03
            X.WA1 r6 = new X.WA1
            r6.<init>(r7, r8, r9, r10, r11)
            X.AnonymousClass0fU.A00(r6, r0)
            android.widget.TextView r0 = r10.A05
            r8 = 2
            X.WA1 r6 = new X.WA1
            r6.<init>(r7, r8, r9, r10, r11)
            X.AnonymousClass0fU.A00(r6, r0)
        L_0x009f:
            return
        L_0x00a0:
            com.instagram.common.typedurl.ImageUrl r1 = r9.Bh3()
            goto L_0x0080
        L_0x00a5:
            r0.setVisibility(r1)
            r6.setVisibility(r4)
            goto L_0x0032
        */
        throw new UnsupportedOperationException("Method not decompiled: X.UA2.onBindViewHolder(X.3kE, int):void");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        Activity activity = this.A00;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.suggested_entity_card, viewGroup, false);
        Resources A0A = AnonymousClass7TF.A0A(activity);
        int A09 = 0nA.A09(activity);
        Integer num = AnonymousClass05K.A00;
        int A002 = C292995jr.A00(A0A, num, A09);
        inflate.setLayoutParams(new AnonymousClass3MX(A002, -1));
        UEI uei = new UEI(inflate);
        C293985lf.A00(uei.A00, uei.A07, (TextView) null, uei.A04, num, false);
        uei.A01.setVisibility(8);
        TextView textView = uei.A03;
        Resources A052 = DbU.A05(textView);
        textView.getLayoutParams().width = ((A002 - JTP.A03(A052)) - (AnonymousClass7TE.A0F(A052) * 2)) / 2;
        uei.A05.getLayoutParams().width = textView.getLayoutParams().width;
        return uei;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(173874936);
        int size = this.A06.size();
        AnonymousClass0fD.A0A(1763839783, A032);
        return size;
    }
}
