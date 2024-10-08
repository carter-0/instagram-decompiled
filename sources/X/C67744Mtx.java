package X;

import com.instagram.common.session.UserSession;
import com.instagram.direct.securityalert.data.SecurityAlertLocalDataSource;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Mtx  reason: case insensitive filesystem */
public final class C67744Mtx extends 2YL {
    public final UserSession A00;
    public final SecurityAlertLocalDataSource A01;
    public final C283125Gf A02;
    public final 05G A03;
    public final AnonymousClass0Ud A04;

    public static final void A00(C74256Prk prk, C67744Mtx mtx) {
        Object value;
        C61084JwM jwM;
        ArrayList A0T;
        05G r5 = mtx.A03;
        do {
            value = r5.getValue();
            jwM = (C61084JwM) value;
            A0T = 00k.A0T(prk, (Collection) jwM.A01);
        } while (!r5.AIY(value, C61084JwM.A00((C61060Jvy) jwM.A00, (Integer) jwM.A02, A0T)));
    }

    public C67744Mtx(UserSession userSession, SecurityAlertLocalDataSource securityAlertLocalDataSource, C283125Gf r11) {
        AnonymousClass7TG.A1Q(r11, securityAlertLocalDataSource);
        this.A00 = userSession;
        this.A02 = r11;
        this.A01 = securityAlertLocalDataSource;
        02z A10 = DbS.A10(new C61084JwM((C61060Jvy) null, (Integer) null, (List) null, (DefaultConstructorMarker) null, 7, 35));
        this.A03 = A10;
        this.A04 = 10b.A03(A10);
        AnonymousClass7TE.A1Z(new MFa(this, (AnonymousClass4D7) null), C318116oQ.A00(this));
    }
}
