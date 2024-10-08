package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Uj3  reason: case insensitive filesystem */
public final class C15820Uj3 extends C232232tF {
    public final Context A00;
    public final UserSession A01;

    public C15820Uj3(UserSession userSession, Context context) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        this.A00 = context;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        View inflate = DbX.A0F(viewGroup, 0).inflate(R.layout.channel_education_cta_button_headline, viewGroup, false);
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        UserSession userSession = this.A01;
        Context context = this.A00;
        0qQ.A0A(inflate);
        return new UEC(context, inflate, userSession);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void bind(X.C232262tL r10, X.C249703kE r11) {
        /*
            r9 = this;
            X.WSg r10 = (X.C19273WSg) r10
            X.UEC r11 = (X.UEC) r11
            X.AnonymousClass7TG.A1N(r10, r11)
            r4 = 0
            com.instagram.common.ui.widget.imageview.IgImageView r1 = r11.A04
            int r0 = r10.A01
            r1.setImageResource(r0)
            com.instagram.common.ui.base.IgTextView r2 = r11.A03
            android.content.Context r0 = r2.getContext()
            int r1 = r10.A02
            android.content.Context r0 = X.02K.A01(r0)
            X.DbT.A18(r0, r2, r1)
            r2.setVisibility(r4)
            java.lang.Integer r0 = r10.A04
            int r2 = r0.intValue()
            com.instagram.common.ui.base.IgTextView r1 = r11.A01
            android.content.Context r3 = r11.A00
            android.content.Context r0 = X.02K.A01(r3)
            X.DbT.A18(r0, r1, r2)
            r1.setVisibility(r4)
            java.lang.Integer r0 = r10.A05
            int r2 = r0.intValue()
            com.instagram.common.ui.base.IgTextView r1 = r11.A02
            android.content.Context r0 = X.02K.A01(r3)
            X.DbT.A18(r0, r1, r2)
            r1.setVisibility(r4)
            java.lang.Integer r0 = r10.A03
            int r0 = r0.intValue()
            com.instagram.igds.components.button.IgdsButton r1 = r11.A06
            r1.setText((int) r0)
            r0 = 4
            X.WBG.A01(r1, r0, r11, r10)
            r1.setVisibility(r4)
            X.6gx r6 = r11.A05
            java.lang.String r8 = r10.A07
            java.lang.String r5 = r10.A06
            java.lang.String r4 = r10.A08
            java.lang.String r3 = r10.A09
            int r7 = r10.A00
            X.0wc r0 = r6.A03
            X.1Ln r2 = X.1Ln.A0E(r0)
            boolean r0 = X.DbT.A1Y(r2)
            if (r0 == 0) goto L_0x00b0
            long r0 = r6.A02
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r2.A0h(r0)
            java.lang.String r0 = "creator_education_details_rendered"
            r2.A0l(r0)
            java.lang.String r0 = "impression"
            r2.A0k(r0)
            int r0 = r8.hashCode()
            switch(r0) {
                case -2001117250: goto L_0x00ec;
                case -493687518: goto L_0x00dd;
                case 354039290: goto L_0x00ce;
                case 996503074: goto L_0x00bf;
                case 1718164945: goto L_0x00b4;
                default: goto L_0x008b;
            }
        L_0x008b:
            java.lang.String r0 = "send_message_education_button"
        L_0x008d:
            r2.A0p(r0)
            java.lang.String r0 = "best_practices_education"
            java.lang.Long r0 = X.DbZ.A0b(r2, r0, r4, r3, r7)
            r2.A0i(r0)
            java.lang.String r0 = r6.A01
            r2.A0v(r0)
            java.lang.String r0 = "thread_view"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x00b1
            X.Nmb r1 = X.C69493Nmb.THREAD_VIEW
        L_0x00a8:
            java.lang.String r0 = "entrypoint"
            r2.A0M(r1, r0)
            r2.Cgf()
        L_0x00b0:
            return
        L_0x00b1:
            X.Nmb r1 = X.C69493Nmb.THREAD_DETAILS
            goto L_0x00a8
        L_0x00b4:
            java.lang.String r0 = "create_spotlight"
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = "create_spotlight_button"
            goto L_0x008d
        L_0x00bf:
            r0 = 1536(0x600, float:2.152E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = "see_sharing_options_button"
            goto L_0x008d
        L_0x00ce:
            r0 = 428(0x1ac, float:6.0E-43)
            java.lang.String r0 = X.C273654mx.A00(r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = "unique_content_education_button"
            goto L_0x008d
        L_0x00dd:
            r0 = 1236(0x4d4, float:1.732E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = "create_poll_button"
            goto L_0x008d
        L_0x00ec:
            r0 = 1808(0x710, float:2.534E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            boolean r0 = r8.equals(r0)
            if (r0 == 0) goto L_0x008b
            java.lang.String r0 = "share_last_message_button"
            goto L_0x008d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15820Uj3.bind(X.2tL, X.3kE):void");
    }

    public final Class modelClass() {
        return C19273WSg.class;
    }
}
