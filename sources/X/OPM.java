package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewStub;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public abstract class OPM {
    public static final void A00(View view, AnonymousClass0iw r10, UserSession userSession, C314466iJ r12, N3L n3l) {
        0qQ.A0B(r12, 4);
        View findViewById = view.findViewById(R.id.nux_banner);
        if (findViewById != null && findViewById.getVisibility() == 0) {
            C48827Ekp.A00(findViewById);
            if (n3l != null) {
                1Av A00 = 1Au.A00(userSession);
                long j = n3l.A00;
                String valueOf = String.valueOf(j);
                C69354Njt njt = n3l.A01;
                String name = njt.name();
                0qQ.A0B(name, 1);
                0xY A0p = AnonymousClass7TE.A0p(A00);
                A0p.E5T(002.A0u("proactive_warning_banner_dismissed/userid/", valueOf, "/flowtype/", name), true);
                A0p.apply();
                C66813Mcz mcz = new C66813Mcz(r10, userSession);
                mcz.A01(XSV.A06, njt, n3l.A0C, j);
                C66813Mcz.A00(C69476NmK.PROACTIVE_WARNING_BANNER_DISMISS, mcz);
            }
            r12.DUr();
        }
    }

    public static final boolean A01(Context context, View view, AnonymousClass0iw r18, UserSession userSession, C314466iJ r20, AnonymousClass7L0 r21, N3L n3l) {
        ViewStub A0F;
        int color;
        SpannableStringBuilder A0C;
        View view2 = view;
        boolean A1Z = DbW.A1Z(view2);
        C314466iJ r14 = r20;
        N3L n3l2 = n3l;
        AnonymousClass7TG.A1S(n3l2, r14);
        UserSession userSession2 = userSession;
        if (!C70271O0b.A00(userSession2, n3l2, A1Z) || (A0F = DbS.A0F(view2, R.id.image_nux_banner_viewstub)) == null) {
            return false;
        }
        View inflate = A0F.inflate();
        Context context2 = context;
        AnonymousClass7L0 r6 = r21;
        if (r21 != null) {
            color = r6.A02;
        } else {
            color = context2.getColor(R.color.black_55_transparent);
        }
        inflate.setBackgroundColor(color);
        TextView A0d = AnonymousClass7TE.A0d(inflate, R.id.title);
        A0d.setText(n3l2.A0D);
        A0d.setFocusableInTouchMode(A1Z);
        if (r21 == null) {
            DbT.A17(context2, A0d, 2Yu.A0E(context2));
            DbT.A16(context2, inflate.findViewById(R.id.divider), 2Yu.A0H(context2, R.attr.igds_color_secondary_button_on_media));
        }
        TextView textView = (TextView) inflate.findViewById(R.id.message);
        DbT.A1H(textView);
        String str = n3l2.A08;
        AnonymousClass0iw r12 = r18;
        if (str == null || str.length() == 0) {
            A0C = DbS.A0C(n3l2.A06);
        } else {
            A0C = DbZ.A0B(n3l2.A06, str);
            0qQ.A07(A0C);
            AnonymousClass7AV.A03(A0C, new C69196Ngu(context2, view2, r12, userSession2, r14, n3l2, context2.getColor(2Yu.A0D(context2))), str);
        }
        textView.setText(A0C);
        if (r21 == null) {
            JTS.A0u(context2, textView, R.attr.igds_color_secondary_text_on_media);
        }
        DbU.A13(context2, DbX.A0J(inflate, R.id.icon), R.drawable.ig_illustrations_qp_warning2_refresh);
        View findViewById = inflate.findViewById(R.id.dismiss_button);
        AnonymousClass0fU.A00(new C71360OjF(A1Z ? 1 : 0, inflate, r12, userSession2, r14, n3l2), findViewById);
        findViewById.setVisibility(0);
        AnonymousClass7TH.A0R(inflate.findViewById(R.id.bottom_divider));
        r14.DUt();
        C66813Mcz mcz = new C66813Mcz(r12, userSession2);
        mcz.A01(XSV.A06, n3l2.A01, n3l2.A0C, n3l2.A00);
        C66813Mcz.A00(C69476NmK.PROACTIVE_WARNING_BANNER_SHOWN, mcz);
        return true;
    }
}
