package X;

import android.content.Context;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.checkbox.IgdsCheckBox;

public final class OZO {
    public Integer A00;
    public final Context A01;
    public final View A02;
    public final UserSession A03;
    public final 2Er A04;
    public final C333547Zj A05;
    public final AnonymousClass0eM A06;
    public final View A07;
    public final TextView A08;
    public final IgdsCheckBox A09;

    public static final void A00(OZO ozo, boolean z) {
        C333547Zj r2;
        Integer num;
        2Er r0 = ozo.A04;
        if (r0 != null) {
            UserSession userSession = ozo.A03;
            if (A01(userSession, r0, ozo, z)) {
                boolean A062 = 182.A06(0Tu.A05, userSession, 36323144012737436L);
                View view = ozo.A02;
                if (!A062) {
                    if (view != null) {
                        view.setVisibility(0);
                    }
                    Integer num2 = ozo.A00;
                    if (num2 != null) {
                        int intValue = num2.intValue();
                        if (view != null) {
                            view.setBackgroundColor(intValue);
                        }
                    }
                    Integer num3 = ozo.A00;
                    if (num3 != null) {
                        ozo.A07.setBackgroundColor(num3.intValue());
                    }
                    TextView textView = ozo.A08;
                    if (textView != null) {
                        C66581MXm.A15(ozo.A01, textView, 2131954226);
                    }
                    IgdsCheckBox igdsCheckBox = ozo.A09;
                    if (igdsCheckBox != null) {
                        igdsCheckBox.setVisibility(0);
                        igdsCheckBox.setChecked(true);
                        igdsCheckBox.setOnCheckedChangeListener(new C71469OlD(ozo, 26));
                    }
                } else if (view != null) {
                    view.setVisibility(8);
                }
                r2 = ozo.A05;
                num = AnonymousClass05K.A0N;
                r2.Er5(num);
            }
        }
        IgdsCheckBox igdsCheckBox2 = ozo.A09;
        if (igdsCheckBox2 != null) {
            igdsCheckBox2.setChecked(false);
        }
        View view2 = ozo.A02;
        if (view2 != null) {
            view2.setVisibility(8);
        }
        ozo.A07.setBackgroundColor(0);
        r2 = ozo.A05;
        if (r2.CHQ() != AnonymousClass05K.A01) {
            num = AnonymousClass05K.A00;
            r2.Er5(num);
        }
    }

    public final boolean A02() {
        2Er r0;
        UserSession userSession = this.A03;
        if (182.A06(0Tu.A05, userSession, 36323144012737436L) && (r0 = this.A04) != null) {
            return A01(userSession, r0, this, false);
        }
        IgdsCheckBox igdsCheckBox = this.A09;
        if (igdsCheckBox != null) {
            return igdsCheckBox.isChecked();
        }
        return false;
    }

    public OZO(Context context, View view, View view2, UserSession userSession, 2Er r8, C333547Zj r9) {
        View view3;
        TextView textView;
        C51974G9v.A1M(context, view, view2);
        0qQ.A0B(r9, 5);
        this.A03 = userSession;
        this.A01 = context;
        this.A07 = view2;
        this.A05 = r9;
        this.A04 = r8;
        ViewStub A0F = DbS.A0F(view, R.id.enable_crossposting_composer_banner_viewstub);
        IgdsCheckBox igdsCheckBox = null;
        if (A0F != null) {
            view3 = A0F.inflate();
        } else {
            view3 = null;
        }
        this.A02 = view3;
        if (view3 != null) {
            textView = AnonymousClass7TE.A0d(view3, R.id.title);
        } else {
            textView = null;
        }
        this.A08 = textView;
        this.A09 = view3 != null ? (IgdsCheckBox) view3.requireViewById(R.id.crossposting_enabled_checkbox) : igdsCheckBox;
        this.A06 = AnonymousClass0eN.A01(new C73903Ple(this, 40));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006f, code lost:
        if (X.C66581MXm.A1Y(r6.A01, "broadcast_chat_creator_has_sent_first_message/", r5) == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x009d, code lost:
        if (r1 == false) goto L_0x009f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final boolean A01(com.instagram.common.session.UserSession r8, X.2Er r9, X.OZO r10, boolean r11) {
        /*
            int r1 = r9.C6a()
            r0 = 29
            boolean r5 = X.AnonymousClass7TF.A1S(r1, r0)
            java.lang.String r1 = r9.AsX()
            java.lang.String r0 = r8.A06
            r2 = 0
            boolean r4 = X.00p.A0j(r1, r0, r2)
            java.lang.Boolean r0 = r9.CSS()
            r3 = 1
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r3)
            boolean r1 = X.0qQ.A0K(r0, r7)
            java.util.List r0 = r9.CHP()
            if (r0 == 0) goto L_0x00a7
            boolean r0 = X.AnonymousClass7TE.A1b(r0)
        L_0x002c:
            if (r5 == 0) goto L_0x0071
            if (r4 == 0) goto L_0x0071
            if (r1 == 0) goto L_0x0071
            if (r0 == 0) goto L_0x0071
            X.1Av r6 = X.1Au.A00(r8)
            java.lang.Boolean r0 = r9.Amk()
            boolean r0 = X.0qQ.A0K(r0, r7)
            java.lang.String r5 = ""
            if (r0 != 0) goto L_0x0056
            if (r11 == 0) goto L_0x0056
            java.lang.String r4 = r9.C6C()
            if (r4 != 0) goto L_0x004d
            r4 = r5
        L_0x004d:
            X.0xY r1 = X.AnonymousClass7TE.A0p(r6)
            java.lang.String r0 = "broadcast_chat_creator_has_sent_first_message/"
            X.DbX.A1T(r1, r0, r4, r3)
        L_0x0056:
            java.lang.Boolean r0 = r9.Amk()
            boolean r0 = X.0qQ.A0K(r0, r7)
            if (r0 != 0) goto L_0x0072
            java.lang.String r0 = r9.C6C()
            if (r0 == 0) goto L_0x0067
            r5 = r0
        L_0x0067:
            X.0xa r1 = r6.A01
            java.lang.String r0 = "broadcast_chat_creator_has_sent_first_message/"
            boolean r0 = X.C66581MXm.A1Y(r1, r0, r5)
            if (r0 != 0) goto L_0x0072
        L_0x0071:
            return r2
        L_0x0072:
            java.util.List r0 = r9.BJk()
            if (r0 == 0) goto L_0x007e
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x009b
        L_0x007e:
            java.util.List r0 = r9.BJl()
            if (r0 == 0) goto L_0x008a
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x009b
        L_0x008a:
            r1 = 0
        L_0x008b:
            boolean r0 = X.AnonymousClass7K4.A03(r8, r3)
            if (r0 == 0) goto L_0x009d
            if (r1 == 0) goto L_0x009f
            X.7Zj r1 = r10.A05
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r1.Er5(r0)
            return r2
        L_0x009b:
            r1 = 1
            goto L_0x008b
        L_0x009d:
            if (r1 != 0) goto L_0x0071
        L_0x009f:
            boolean r0 = X.AnonymousClass7K4.A03(r8, r2)
            if (r0 == 0) goto L_0x0071
            r2 = 1
            return r2
        L_0x00a7:
            r0 = 0
            goto L_0x002c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OZO.A01(com.instagram.common.session.UserSession, X.2Er, X.OZO, boolean):boolean");
    }
}
