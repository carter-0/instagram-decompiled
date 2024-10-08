package X;

import com.instagram.common.session.UserSession;
import java.util.ArrayList;

/* renamed from: X.Jhv  reason: case insensitive filesystem */
public final class C60238Jhv extends 2YL {
    public String A00;
    public C262204Co A01 = new AnonymousClass19G((C262204Co) null);
    public boolean A02;
    public final UserSession A03;
    public final String A04;
    public final ArrayList A05 = AnonymousClass7TE.A1C();
    public final 05G A06;
    public final AnonymousClass0Ud A07;

    public /* synthetic */ C60238Jhv(UserSession userSession, String str) {
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        this.A04 = str;
        02z A012 = 106.A01(Lw4.A00);
        this.A06 = A012;
        this.A07 = 10b.A03(A012);
        A00((String) null);
    }

    /* JADX WARNING: type inference failed for: r6v0, types: [X.0r1, java.lang.Object] */
    public final void A00(String str) {
        boolean z;
        0rm A11 = C51965G9l.A11();
        A11.A00 = "0";
        ? obj = new Object();
        C66412MQs mQs = (C66412MQs) this.A07.getValue();
        0qQ.A0B(mQs, 0);
        boolean z2 = mQs instanceof C61226JzK;
        String str2 = str;
        if ((z2 && 0qQ.A0K(str, ((C61226JzK) mQs).A00)) || ((mQs instanceof C61225JzJ) && str == null)) {
            obj.A00 = true;
            if (z2) {
                C61226JzK jzK = (C61226JzK) mQs;
                A11.A00 = jzK.A01;
                z = jzK.A03;
            } else if (mQs instanceof C61225JzJ) {
                C61225JzJ jzJ = (C61225JzJ) mQs;
                A11.A00 = jzJ.A00;
                z = jzJ.A02;
            }
            if (!z) {
                return;
            }
        }
        if (A11.A00 != null) {
            C318136oS A002 = C318116oQ.A00(this);
            if (this.A01.isCancelled()) {
                this.A01 = new AnonymousClass19G((C262204Co) null);
            }
            1Eo.A05(this.A01, new MH6((Object) A11, (Object) this, (Object) obj, str2, (AnonymousClass4D7) null, 19), A002);
        }
    }
}
