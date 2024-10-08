package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.reliability.UserFlowLoggerImpl;
import com.instagram.actionbar.ActionButton;
import com.instagram.common.session.UserSession;
import com.instagram.igds.components.form.IgFormField;
import java.util.Map;

/* renamed from: X.Fge  reason: case insensitive filesystem */
public final class C50679Fge implements G6D {
    public boolean A00;
    public final E33 A01;
    public final Map A02 = AnonymousClass7TE.A1E();
    public final Context A03;
    public final UserSession A04;
    public final C321576uP A05;

    public C50679Fge(Context context, UserSession userSession, E33 e33) {
        0qQ.A0B(userSession, 3);
        this.A01 = e33;
        this.A03 = context;
        this.A04 = userSession;
        this.A05 = (C321576uP) userSession.A01(C321576uP.class, new C51763G0f(userSession, 13));
    }

    public static final void A00(C50679Fge fge, C47365Dvz dvz, String str) {
        CharSequence charSequence;
        if (dvz.A01 != null) {
            C322326ve A002 = C322316vd.A00(fge.A04);
            long j = A002.A02;
            if (j != 0) {
                A002.A06 = true;
                UserFlowLoggerImpl userFlowLoggerImpl = A002.A0A;
                userFlowLoggerImpl.flowAnnotate(j, TraceFieldType.FailureReason, str);
                userFlowLoggerImpl.flowMarkPoint(A002.A02, "username_change_error");
            }
            C59689JTv.A03(fge.A03, dvz.A01, str, 0);
            C321576uP r1 = fge.A05;
            IgFormField igFormField = fge.A01.A03;
            if (igFormField != null) {
                charSequence = igFormField.getText();
            } else {
                charSequence = null;
            }
            r1.A02 = String.valueOf(charSequence);
            return;
        }
        0wb.A03("check_username", "no server error message");
    }

    public final void E2e() {
        CharSequence charSequence;
        ActionButton actionButton;
        boolean z;
        if (!this.A00) {
            E33 e33 = this.A01;
            IgFormField igFormField = e33.A03;
            if (igFormField != null) {
                charSequence = igFormField.getText();
            } else {
                charSequence = null;
            }
            String valueOf = String.valueOf(charSequence);
            if (valueOf.length() == 0) {
                AnonymousClass7TH.A0R(e33.A00);
                actionButton = e33.A02;
                if (actionButton != null) {
                    z = false;
                } else {
                    return;
                }
            } else {
                0eE r0 = AnonymousClass0t1.A01;
                UserSession userSession = this.A04;
                if (valueOf.equals(DbU.A0n(userSession, r0))) {
                    AnonymousClass7TH.A0R(e33.A00);
                } else {
                    C47365Dvz dvz = (C47365Dvz) this.A02.get(valueOf);
                    if (dvz != null) {
                        boolean z2 = dvz.A02;
                        AnonymousClass7TH.A0R(e33.A00);
                        if (!z2) {
                            ActionButton actionButton2 = e33.A02;
                            if (actionButton2 != null) {
                                actionButton2.setEnabled(false);
                            }
                            A00(this, dvz, "response_not_available");
                            return;
                        }
                    } else {
                        1OC A002 = C318486p2.A00(this.A03, userSession, valueOf);
                        A002.A00 = new C47688ECx(this, valueOf);
                        1ES.A03(A002);
                        return;
                    }
                }
                actionButton = e33.A02;
                if (actionButton != null) {
                    z = true;
                } else {
                    return;
                }
            }
            actionButton.setEnabled(z);
        }
    }
}
