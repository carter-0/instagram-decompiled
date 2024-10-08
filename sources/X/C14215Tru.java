package X;

import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.user.model.UpcomingEvent;

/* renamed from: X.Tru  reason: case insensitive filesystem */
public final class C14215Tru implements C46216DQu {
    public final Fragment A00;
    public final AnonymousClass32N A01;
    public final C14192TrX A02;

    public final String CC2(1Xj r4) {
        int i;
        C14192TrX trX = this.A02;
        Context requireContext = this.A00.requireContext();
        C17290VPr A002 = ((C17808VgL) trX.A05.getValue()).A00(r4);
        if (A002 instanceof C16361Uta) {
            i = 2131976011;
        } else if (A002 instanceof C16360UtZ) {
            i = 2131976010;
        } else if (A002 instanceof C16359UtY) {
            i = 2131976632;
        } else if (A002 instanceof C16358UtX) {
            i = 2131976009;
        } else if (A002 instanceof C16357UtW) {
            i = 2131971941;
        } else {
            i = 2131976006;
        }
        return AnonymousClass7TE.A16(requireContext, i);
    }

    public final void DvK(1Xj r5, AnonymousClass3W1 r6) {
        C16346UtL A002;
        C16346UtL A003;
        C16346UtL A004;
        C17290VPr A005 = ((C17808VgL) this.A02.A05.getValue()).A00(r5);
        if (A005 instanceof C16361Uta) {
            AnonymousClass7TG.A1N(r5, r6);
            C14192TrX trX = A005.A00;
            UpcomingEvent A27 = r5.A27(trX.A01);
            if (A27 != null && (A004 = ((C18003Vjf) trX.A06.getValue()).A00(A27)) != null) {
                A004.A00.A00(r5);
            }
        } else if (A005 instanceof C16360UtZ) {
            boolean A1Z = AnonymousClass7TG.A1Z(r5, r6);
            C14192TrX trX2 = A005.A00;
            UpcomingEvent A272 = r5.A27(trX2.A01);
            if (A272 != null) {
                r6.A1u = A1Z;
                AnonymousClass3W1.A00(r6, 26);
                C16346UtL A006 = ((C18003Vjf) trX2.A06.getValue()).A00(A272);
                if (A006 != null) {
                    A006.A00.A02(r5, new C19795Wfc(r5, r6, trX2));
                }
            }
        } else if (A005 instanceof C16359UtY) {
            AnonymousClass7TG.A1N(r5, r6);
            A005.A00.A02(r5, r6);
        } else if (A005 instanceof C16358UtX) {
            AnonymousClass7TG.A1N(r5, r6);
            C14192TrX trX3 = A005.A00;
            UpcomingEvent A273 = r5.A27(trX3.A01);
            if (A273 != null && (A003 = ((C18003Vjf) trX3.A06.getValue()).A00(A273)) != null) {
                A003.A00.A01(r5);
            }
        } else {
            boolean z = A005 instanceof C16357UtW;
            AnonymousClass7TG.A1N(r5, r6);
            if (z) {
                A005.A00.A03(r5, r6, "cta_bar_set_live_shopping_reminder");
                return;
            }
            C14192TrX trX4 = A005.A00;
            UpcomingEvent A274 = r5.A27(trX4.A01);
            if (A274 != null && (A002 = ((C18003Vjf) trX4.A06.getValue()).A00(A274)) != null) {
                A002.A00(r5);
            }
        }
    }

    public final void EC8(View view, 1Xj r3) {
        this.A01.A00(view, r3);
    }

    public C14215Tru(Fragment fragment, AnonymousClass32N r2, C14192TrX trX) {
        AnonymousClass7TG.A1Q(trX, r2);
        this.A00 = fragment;
        this.A02 = trX;
        this.A01 = r2;
    }
}
