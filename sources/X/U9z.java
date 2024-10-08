package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class U9z extends 2Rw {
    public List A00 = 0sn.A00;
    public final Context A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final Integer A04;

    public U9z(Context context, AnonymousClass0iw r3, UserSession userSession, Integer num) {
        0qQ.A0B(num, 3);
        this.A01 = context;
        this.A03 = userSession;
        this.A04 = num;
        this.A02 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v17, types: [com.instagram.common.ui.widget.imageview.RoundedCornerImageView, android.view.View] */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x009f A[Catch:{ NotFoundException -> 0x001b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBindViewHolder(X.C249703kE r11, int r12) {
        /*
            r10 = this;
            r2 = 0
            X.0qQ.A0B(r11, r2)
            java.util.List r0 = r10.A00
            java.lang.Object r5 = r0.get(r12)
            X.X6N r5 = (X.X6N) r5
            boolean r0 = r5 instanceof X.WOP
            if (r0 == 0) goto L_0x001c
            android.content.Context r1 = r10.A01
            X.UDd r11 = (X.C14875UDd) r11
            X.WOP r5 = (X.WOP) r5
            X.0iw r0 = r10.A02
            X.C18144VmK.A01(r1, r11, r5, r0)
        L_0x001b:
            return
        L_0x001c:
            boolean r0 = r5 instanceof X.WOO
            if (r0 == 0) goto L_0x001b
            android.content.Context r7 = r10.A01
            X.UDc r11 = (X.C14874UDc) r11
            X.WOO r5 = (X.WOO) r5
            X.0iw r8 = r10.A02
            X.AnonymousClass7TG.A1O(r11, r5)
            java.lang.Integer r0 = r5.A03     // Catch:{ NotFoundException -> 0x001b }
            int r0 = r0.intValue()     // Catch:{ NotFoundException -> 0x001b }
            r1 = 8
            if (r0 == r2) goto L_0x0062
            com.instagram.common.ui.base.IgTextView r0 = r11.A01     // Catch:{ NotFoundException -> 0x001b }
            r0.setVisibility(r1)     // Catch:{ NotFoundException -> 0x001b }
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r0 = r11.A03     // Catch:{ NotFoundException -> 0x001b }
            r0.setVisibility(r1)     // Catch:{ NotFoundException -> 0x001b }
            android.view.View r0 = r11.A00     // Catch:{ NotFoundException -> 0x001b }
            r0.setVisibility(r2)     // Catch:{ NotFoundException -> 0x001b }
            com.instagram.igds.components.button.IgdsButton r2 = r11.A04     // Catch:{ NotFoundException -> 0x001b }
            android.content.res.Resources r1 = r7.getResources()     // Catch:{ NotFoundException -> 0x001b }
            r0 = 2131970155(0x7f13486b, float:1.9577253E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ NotFoundException -> 0x001b }
            r2.setText((java.lang.String) r0)     // Catch:{ NotFoundException -> 0x001b }
            android.view.View$OnClickListener r0 = r5.A01     // Catch:{ NotFoundException -> 0x001b }
            X.AnonymousClass0fU.A00(r0, r2)     // Catch:{ NotFoundException -> 0x001b }
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r11.A02     // Catch:{ NotFoundException -> 0x001b }
            r0 = 2131237691(0x7f081b3b, float:1.809164E38)
            X.DbU.A13(r7, r1, r0)     // Catch:{ NotFoundException -> 0x001b }
            goto L_0x00b8
        L_0x0062:
            android.view.View r0 = r11.A00     // Catch:{ NotFoundException -> 0x001b }
            r0.setVisibility(r1)     // Catch:{ NotFoundException -> 0x001b }
            com.instagram.common.ui.base.IgTextView r9 = r11.A01     // Catch:{ NotFoundException -> 0x001b }
            r9.setVisibility(r2)     // Catch:{ NotFoundException -> 0x001b }
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r6 = r11.A03     // Catch:{ NotFoundException -> 0x001b }
            r6.setVisibility(r2)     // Catch:{ NotFoundException -> 0x001b }
            java.lang.String r1 = r5.A05     // Catch:{ NotFoundException -> 0x001b }
            int r0 = r1.length()     // Catch:{ NotFoundException -> 0x001b }
            if (r0 > 0) goto L_0x0098
            java.lang.Long r0 = r5.A04     // Catch:{ NotFoundException -> 0x001b }
            if (r0 == 0) goto L_0x009b
            long r1 = r0.longValue()     // Catch:{ NotFoundException -> 0x001b }
            android.content.res.Resources r4 = r7.getResources()     // Catch:{ NotFoundException -> 0x001b }
            r3 = 2131970154(0x7f13486a, float:1.9577251E38)
            java.util.TimeZone r0 = X.C14240TsN.A03     // Catch:{ NotFoundException -> 0x001b }
            java.lang.String r0 = "MMM d, yyyy"
            java.lang.String r0 = X.C14240TsN.A04(r0, r1)     // Catch:{ NotFoundException -> 0x001b }
            java.lang.Object[] r0 = new java.lang.Object[]{r0}     // Catch:{ NotFoundException -> 0x001b }
            java.lang.String r1 = r4.getString(r3, r0)     // Catch:{ NotFoundException -> 0x001b }
        L_0x0098:
            r9.setText(r1)     // Catch:{ NotFoundException -> 0x001b }
        L_0x009b:
            com.instagram.common.typedurl.ImageUrl r0 = r5.A02     // Catch:{ NotFoundException -> 0x001b }
            if (r0 == 0) goto L_0x00a2
            r6.setUrl(r0, r8)     // Catch:{ NotFoundException -> 0x001b }
        L_0x00a2:
            com.instagram.igds.components.button.IgdsButton r2 = r11.A04     // Catch:{ NotFoundException -> 0x001b }
            android.content.res.Resources r1 = r7.getResources()     // Catch:{ NotFoundException -> 0x001b }
            r0 = 2131970153(0x7f134869, float:1.957725E38)
            java.lang.String r0 = r1.getString(r0)     // Catch:{ NotFoundException -> 0x001b }
            r2.setText((java.lang.String) r0)     // Catch:{ NotFoundException -> 0x001b }
            android.view.View$OnClickListener r0 = r5.A01     // Catch:{ NotFoundException -> 0x001b }
            X.AnonymousClass0fU.A00(r0, r2)     // Catch:{ NotFoundException -> 0x001b }
            goto L_0x00b9
        L_0x00b8:
            return
        L_0x00b9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.U9z.onBindViewHolder(X.3kE, int):void");
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        ViewGroup A002;
        0qQ.A0B(viewGroup, 0);
        int intValue = this.A04.intValue();
        String A003 = AnonymousClass000.A00(1625);
        if (intValue == 0) {
            A002 = C18144VmK.A00(this.A01, viewGroup);
        } else if (intValue == 1) {
            A002 = (ViewGroup) DbW.A09(LayoutInflater.from(this.A01), viewGroup, R.layout.promote_ad_tools_multi_post_suggestions_card, false);
            A002.setTag(new C14874UDc(A002));
        } else {
            throw new RuntimeException();
        }
        Object tag = A002.getTag();
        0qQ.A0C(tag, A003);
        return (C249703kE) tag;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(1944561311);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-1322806782, A032);
        return size;
    }
}
