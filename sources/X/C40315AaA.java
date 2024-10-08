package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.ui.swipenavigation.PositionConfig;
import java.util.List;

/* renamed from: X.AaA  reason: case insensitive filesystem */
public final class C40315AaA implements C41837B2s {
    public final AnonymousClass2a4 A00;
    public final 2ZT A01;
    public final C71162bE A02;
    public final UserSession A03;

    public final void AI5() {
    }

    public final /* synthetic */ void E11() {
    }

    private final void A00(String str) {
        this.A01.FLD(new PositionConfig((AnonymousClass57C) null, (CameraConfiguration) null, (AnonymousClass3QO) null, str, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 0.0f, 0, false));
    }

    public final void AI6(String str, List list, List list2, boolean z) {
        if (list == null || list.isEmpty()) {
            1QK r1 = 1QK.A0C;
            2ZT r0 = this.A01;
            r0.FLD(new PositionConfig((AnonymousClass57C) null, (CameraConfiguration) null, (AnonymousClass3QO) null, "return_from_recipient_pickers_to_inbox", (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, 1.0f, 0, false));
            r0.Enh(r1);
        }
    }

    public final void Cpf(String str) {
        String A002 = AnonymousClass000.A00(1582);
        0qQ.A0B(A002, 0);
        A00(A002);
        this.A01.Enh(C226412gl.A00(this.A03).A00());
    }

    public final void CqO(String str) {
        0qQ.A0B("media_posted_to_highlight", 0);
        A00("media_posted_to_highlight");
        this.A01.Enh(1QK.A0E);
    }

    public C40315AaA(UserSession userSession, 2ZT r3, C71162bE r4) {
        AnonymousClass7TG.A1Q(r4, r3);
        this.A03 = userSession;
        this.A02 = r4;
        this.A01 = r3;
        AnonymousClass2a4 r0 = r4.A04;
        0qQ.A07(r0);
        this.A00 = r0;
    }

    public final void Cpi(String str) {
        A00(str);
        this.A01.Enh(1QK.A0C);
    }
}
