package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

public final class IPS implements JPH {
    public boolean A00;
    public final Context A01;
    public final C54216H3l A02;
    public final UserSession A03;
    public final AnonymousClass4DU A04;
    public final 0sP A05;
    public final 0sK A06;
    public final 0sK A07;
    public final 0sJ A08;
    public final 0sJ A09;
    public final 0sI A0A;
    public final boolean A0B;
    public final boolean A0C;

    public final /* bridge */ /* synthetic */ void ADn(View view, Object obj) {
        int i;
        String str;
        C333777a7 r1 = (C333777a7) obj;
        0qQ.A0B(r1, 1);
        boolean z = this.A0C;
        View view2 = view;
        if (z) {
            C51967G9n.A0x(view2, R.id.header_section, 0);
        }
        boolean z2 = this.A0B;
        if (z2) {
            boolean z3 = this.A02.A01;
            int i2 = R.id.creator_view_footer_text_aligned_right;
            if (z3) {
                i2 = R.id.creator_view_footer_text_aligned_left;
            }
            C51967G9n.A0x(view2, i2, 0);
            C51967G9n.A0x(view2, R.id.footer_nux, 0);
        }
        ViewGroup A0I = DbX.A0I(view2, R.id.option_rows);
        C54216H3l h3l = this.A02;
        C272034jz r5 = h3l.A00;
        List C48 = r5.C48();
        if (C48 != null) {
            i = C48.size();
        } else {
            i = 4;
        }
        for (int i3 = 0; i3 < i; i3++) {
            A0I.addView(LayoutInflater.from(this.A01).inflate(R.layout.comment_poll_consumption_option_row, A0I, false));
        }
        C55890HpB hpB = new C55890HpB(view2);
        List C482 = r5.C48();
        0rm A11 = C51965G9l.A11();
        A11.A00 = r5.CFI();
        if (C482 != null) {
            if (z) {
                Context context = this.A01;
                User user = r1.A0A;
                String question = r5.getQuestion();
                long A042 = DbY.A04(r1.A0C);
                UserSession userSession = this.A03;
                AnonymousClass4DU r11 = this.A04;
                AnonymousClass4DU r16 = r11;
                User user2 = user;
                HWV.A00(context, hpB, userSession, r16, user2, question, new C59111J6t(this, 38), new JK0(this, 7), A042);
            }
            UserSession userSession2 = this.A03;
            Integer A002 = C52319GNl.A00(userSession2).A00(r5);
            Context context2 = this.A01;
            HWU.A00(context2, r5.Aoy());
            ArrayList A1C = AnonymousClass7TE.A1C();
            hpB.A02.removeAllViews();
            I6I i6i = I6I.A00;
            int size = C482.size();
            String str2 = r1.A0I;
            Integer num = r1.A0B;
            if (num != null) {
                str = C2606846q.A00(num);
            } else {
                str = "null";
            }
            I6I.A00(hpB, new C57051IMr(r1, this, r5, A1C, A11), str2, str, A1C, size);
            I6I.A02(hpB, userSession2, A002, C482, A1C, C297825sP.A04(userSession2, r5, true), this.A00);
            I0O i0o = I0O.A00;
            String moduleName = this.A04.getModuleName();
            boolean z4 = r1.A0f;
            Context context3 = context2;
            i0o.A00(context3, hpB, userSession2, r5, moduleName, new J6O(this, 26), new JG1(10, r1, this), z4);
            boolean z5 = this.A00;
            boolean z6 = h3l.A01;
            I6I i6i2 = i6i;
            C55890HpB hpB2 = hpB;
            i6i2.A04(hpB2, A002, new C58208IoC(21, hpB, this, A1C, r5), z5, z4, z6);
            i6i.A05(hpB, new C58218IoM(8, hpB, r1, this, r5, A1C), AnonymousClass7TF.A1V(A002), z6);
            if (z2) {
                1Au.A00(userSession2).A0S(1);
                hpB.A07.setVisibility(0);
                return;
            }
            hpB.A07.setVisibility(8);
        }
    }

    public IPS(Context context, C54216H3l h3l, UserSession userSession, AnonymousClass4DU r4, 0sP r5, 0sK r6, 0sK r7, 0sJ r8, 0sJ r9, 0sI r10, boolean z, boolean z2) {
        C51974G9v.A1M(context, userSession, r4);
        this.A02 = h3l;
        this.A01 = context;
        this.A03 = userSession;
        this.A04 = r4;
        this.A0C = z;
        this.A0B = z2;
        this.A05 = r5;
        this.A09 = r8;
        this.A07 = r6;
        this.A0A = r10;
        this.A06 = r7;
        this.A08 = r9;
    }

    public final View ANI(Context context) {
        View A082 = DbU.A08(LayoutInflater.from(context), R.layout.comment_poll_consumption);
        0qQ.A07(A082);
        return A082;
    }
}
