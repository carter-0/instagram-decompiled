package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import java.util.List;

public final class KGA extends C232222tE {
    public final Context A00;
    public final FragmentActivity A01;
    public final AnonymousClass4DH A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final AnonymousClass4DU A05;
    public final String A06;

    public KGA(AnonymousClass4DH r2, AnonymousClass0iw r3, UserSession userSession, AnonymousClass4DU r5, String str) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A02 = r2;
        this.A03 = r3;
        this.A05 = r5;
        this.A06 = str;
        this.A00 = r2.requireContext();
        this.A01 = r2.requireActivity();
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        return new C60664JpB(DbU.A09(layoutInflater, viewGroup, R.layout.pa_ad_code_row, false));
    }

    private final Drawable A00(List list) {
        Context context = this.A00;
        String moduleName = this.A03.getModuleName();
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.audition_flow_footer_button_horizontal_padding);
        Integer num = AnonymousClass05K.A0C;
        UserSession userSession = this.A04;
        return C244283aw.A01(context, Float.valueOf(0.7f), num, moduleName, list, dimensionPixelSize, 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36325501949719552L), true, true);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c6, code lost:
        if (r7 != null) goto L_0x00c8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r11, X.C249703kE r12) {
        /*
            r10 = this;
            X.Li2 r11 = (X.C64786Li2) r11
            X.JpB r12 = (X.C60664JpB) r12
            r2 = 0
            boolean r9 = X.AnonymousClass7TF.A1U(r2, r11, r12)
            X.DU2 r7 = r11.A00
            r3 = 8
            if (r7 == 0) goto L_0x0159
            java.lang.String r4 = r7.getAccessToken()
            java.lang.String r8 = r11.A01
            android.view.View r0 = r12.A00
            r0.setVisibility(r2)
            com.instagram.common.session.UserSession r6 = r10.A04
            X.0Tu r5 = X.0Tu.A05
            r0 = 36326240684226196(0x810e8600023694, double:3.0361991105105557E-306)
            boolean r0 = X.182.A06(r5, r6, r0)
            if (r0 == 0) goto L_0x0129
            com.instagram.common.ui.base.IgTextView r1 = r12.A03
            r1.setVisibility(r2)
            com.instagram.igds.components.button.IgdsButton r5 = r12.A05
            r5.setVisibility(r2)
            com.instagram.igds.components.button.IgdsButton r0 = r12.A04
            r0.setVisibility(r3)
            r1.setText(r4)
            r1 = 2
            X.LXW r0 = new X.LXW
            r0.<init>(r10, r8, r4, r1)
        L_0x0041:
            X.AnonymousClass0fU.A00(r0, r5)
            com.instagram.igds.components.button.IgdsButton r5 = r12.A06
            r1 = 3
            X.LXW r0 = new X.LXW
            r0.<init>(r10, r8, r4, r1)
            X.AnonymousClass0fU.A00(r0, r5)
            com.instagram.common.ui.base.IgSimpleImageView r5 = r12.A02
            android.widget.TextView r4 = r12.A01
            com.instagram.user.model.User r0 = r7.ByI()
            java.util.List r7 = r7.ByP()
            if (r7 == 0) goto L_0x0069
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x0069
            java.lang.Object r0 = X.00k.A0O(r7, r2)
            com.instagram.user.model.User r0 = (com.instagram.user.model.User) r0
        L_0x0069:
            if (r0 == 0) goto L_0x00c6
            if (r7 == 0) goto L_0x0079
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L_0x0079
            int r1 = r7.size()
            if (r1 != r9) goto L_0x00c8
        L_0x0079:
            boolean r1 = r0.A2Q()
            if (r1 == 0) goto L_0x0085
            java.lang.String r7 = r0.getFullName()
            if (r7 != 0) goto L_0x0089
        L_0x0085:
            java.lang.String r7 = r0.getUsername()
        L_0x0089:
            java.lang.String r6 = r0.getId()
            com.instagram.user.model.User[] r0 = new com.instagram.user.model.User[]{r0}
            java.util.ArrayList r0 = X.0sr.A1L(r0)
            android.graphics.drawable.Drawable r0 = r10.A00(r0)
            r5.setImageDrawable(r0)
            r5.setVisibility(r2)
            X.LXK r0 = new X.LXK
            r0.<init>(r6, r10, r2)
            X.AnonymousClass0fU.A00(r0, r5)
            android.content.Context r1 = r10.A00
            r0 = 2131969174(0x7f134496, float:1.9575263E38)
            android.text.SpannableStringBuilder r3 = X.DbY.A0D(r1, r7, r0)
            int r1 = X.DbV.A01(r1)
            X.UsQ r0 = new X.UsQ
            r0.<init>((X.KGA) r10, (java.lang.String) r6, (int) r1)
            X.AnonymousClass7AV.A05(r3, r0, r7)
            r4.setText(r3)
            r4.setVisibility(r2)
            X.DbT.A1H(r4)
        L_0x00c5:
            return
        L_0x00c6:
            if (r7 == 0) goto L_0x0152
        L_0x00c8:
            boolean r0 = r7.isEmpty()
            if (r0 != 0) goto L_0x0152
            int r0 = r7.size()
            if (r0 <= r9) goto L_0x0152
            android.graphics.drawable.Drawable r0 = r10.A00(r7)
            r5.setImageDrawable(r0)
            r5.setVisibility(r2)
            android.content.Context r3 = r10.A00
            r1 = 2131969178(0x7f13449a, float:1.9575272E38)
            java.lang.Integer r0 = X.C51968G9o.A0t(r7)
            X.DbX.A13(r3, r4, r0, r1)
            r4.setVisibility(r2)
            X.1Xj r1 = X.DbV.A0U(r6, r8)
            if (r1 == 0) goto L_0x00c5
            android.os.Bundle r6 = X.AnonymousClass7TE.A0a()
            java.lang.String r0 = "media_id"
            r6.putString(r0, r8)
            r0 = 1818(0x71a, float:2.548E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r6.putBoolean(r0, r2)
            X.1iA r1 = r1.BR7()
            java.lang.String r0 = "media_type"
            r6.putSerializable(r0, r1)
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r2 = r7.iterator()
        L_0x0116:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0142
            com.instagram.user.model.User r1 = X.DbT.A0k(r2)
            com.instagram.model.people.PeopleTag r0 = new com.instagram.model.people.PeopleTag
            r0.<init>((com.instagram.user.model.User) r1)
            r3.add(r0)
            goto L_0x0116
        L_0x0129:
            com.instagram.igds.components.button.IgdsButton r5 = r12.A04
            r5.setVisibility(r2)
            com.instagram.igds.components.button.IgdsButton r0 = r12.A05
            r0.setVisibility(r3)
            com.instagram.common.ui.base.IgTextView r0 = r12.A03
            r0.setVisibility(r3)
            r5.setText((java.lang.String) r4)
            X.LXW r0 = new X.LXW
            r0.<init>(r10, r8, r4, r9)
            goto L_0x0041
        L_0x0142:
            java.lang.String r0 = "tagged_people"
            r6.putParcelableArrayList(r0, r3)
            r0 = 18
            X.LY8.A00(r5, r0, r6, r10)
            r0 = 19
            X.LY8.A00(r4, r0, r6, r10)
            return
        L_0x0152:
            r5.setVisibility(r3)
            r4.setVisibility(r3)
            return
        L_0x0159:
            android.view.View r0 = r12.A00
            r0.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KGA.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C64786Li2.class;
    }
}
