package X;

import com.instagram.common.session.UserSession;
import com.instagram.igds.components.form.IgFormField;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.ui.LeadGenFormDateTimeQuestionView;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* renamed from: X.Lnq  reason: case insensitive filesystem */
public final class C65128Lnq implements C74441Puw {
    public final int A00;
    public final Object A01;

    public C65128Lnq(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void D7r(Date date) {
        if (this.A00 != 0) {
            2YL A0H = DbS.A0H(((K6B) this.A01).A02);
            C66169MGg.A01(date, A0H, C318116oQ.A00(A0H), 33);
        }
    }

    public final void D9d() {
    }

    public final void D9n(Date date) {
        String A02;
        if (this.A00 != 0) {
            C60281Jic jic = (C60281Jic) ((K6B) this.A01).A02.getValue();
            jic.A0D.Epw(date);
            C64104LMy lMy = jic.A06;
            0Aj A0e = AnonymousClass7TE.A0e((0wc) lMy.A05.getValue(), "upcoming_event_creation_action");
            DbS.A1J(A0e, "set_start_time");
            A0e.AAJ("prior_module", lMy.A03);
            C64104LMy.A00(A0e, lMy, (Long) null);
            MGU.A02(jic, C318116oQ.A00(jic), 46);
            return;
        }
        L9C l9c = (L9C) this.A01;
        X1U x1u = l9c.A02;
        UserSession userSession = l9c.A00;
        LeadGenFormDateTimeQuestionView leadGenFormDateTimeQuestionView = (LeadGenFormDateTimeQuestionView) x1u;
        IgFormField igFormField = leadGenFormDateTimeQuestionView.A00;
        String str = "";
        if (date == null) {
            A02 = str;
        } else {
            A02 = C14240TsN.A02(AnonymousClass7TE.A0S(leadGenFormDateTimeQuestionView), userSession, date.getTime());
        }
        igFormField.setText(A02);
        LeadGenFormBaseQuestion leadGenFormBaseQuestion = leadGenFormDateTimeQuestionView.A00;
        if (leadGenFormBaseQuestion != null) {
            if (date != null) {
                str = new SimpleDateFormat(AnonymousClass000.A00(1975), Locale.US).format(date);
            }
            0qQ.A0A(str);
            leadGenFormDateTimeQuestionView.A0F(leadGenFormBaseQuestion, str);
        }
        C331157Pu r1 = l9c.A01.A00;
        if (r1 != null) {
            r1.A0L((C332277Ui) null);
        }
    }
}
