package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import kotlin.enums.EnumEntries;

/* renamed from: X.9Nx  reason: invalid class name and case insensitive filesystem */
public final class C377959Nx extends C392289uY implements G76 {
    public C49336Etr A00;
    public AnonymousClass2Ep A01;
    public final UserSession A02;
    public final C3726091o A03;
    public final AnonymousClass0iw A04;
    public final C41479Aud A05;

    /* JADX WARNING: type inference failed for: r0v11, types: [X.OKm, java.lang.Object] */
    public final void onActionClicked() {
        String BZP;
        C41479Aud aud = this.A05;
        if (aud != null) {
            AnonymousClass9H7 r0 = ((AnonymousClass7SM) aud.A00.A0F.invoke()).A00;
            C331697Sa r3 = r0.A18;
            Context context = r0.A02;
            if (context == null) {
                0qQ.A0F("context");
                throw AnonymousClass00P.createAndThrow();
            }
            String A0d = AnonymousClass7TF.A0d(context.getResources(), 2131958649);
            EnumEntries enumEntries = AnonymousClass5FV.A07;
            ? obj = new Object();
            obj.A00 = 3;
            obj.A01 = null;
            obj.A02 = null;
            r3.A06(obj, A0d, (String) null);
            AnonymousClass2Ep r02 = this.A01;
            if (!(r02 == null || (BZP = r02.BZP()) == null)) {
                this.A03.A02("dm", "confetti_upsell", (String) null, Long.parseLong(BZP), Long.parseLong(this.A02.A06));
            }
        }
        C49336Etr etr = this.A00;
        if (etr != null) {
            etr.A00.setVisibility(8);
        }
    }

    public final void onBannerDismissed() {
        String BZP;
        AnonymousClass2Ep r0 = this.A01;
        if (r0 != null && (BZP = r0.BZP()) != null) {
            this.A03.A00(Long.parseLong(BZP), "dm", Long.parseLong(this.A02.A06), "confetti_upsell");
        }
    }

    public C377959Nx(AnonymousClass0iw r2, UserSession userSession, C41479Aud aud) {
        this.A02 = userSession;
        this.A05 = aud;
        this.A04 = r2;
        this.A03 = new C3726091o(r2, userSession);
    }
}
