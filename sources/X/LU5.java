package X;

import android.content.Context;
import android.content.DialogInterface;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.drafts.repository.ClipsDraftRepository;

public final class LU5 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C64096LMq A00;

    public final void onClick(DialogInterface dialogInterface, int i) {
        ClipsDraftRepository clipsDraftRepository;
        C262224Cq r5;
        0sL mfw;
        0qQ.A0B(dialogInterface, 0);
        dialogInterface.dismiss();
        C64096LMq lMq = this.A00;
        CharSequence charSequence = C64096LMq.A00(lMq)[i];
        C65533Luw luw = lMq.A01;
        Context A0S = AnonymousClass7TE.A0S(luw.A0C);
        if (0qQ.A0K(A0S.getString(2131969303), charSequence)) {
            luw.A02(true);
        } else if (0qQ.A0K(A0S.getString(2131969299), charSequence)) {
            AnonymousClass3Q2 r3 = luw.A02;
            if (r3 != null) {
                1ua A002 = luw.A00();
                A002.A09(r3);
                r3.A0R(0);
                A002.A02.EG4(r3, "post later");
                A002.A05.A04();
            }
        } else {
            if (0qQ.A0K(A0S.getString(2131969287), charSequence)) {
                AnonymousClass3Q2 r32 = luw.A02;
                if (r32 != null) {
                    1ua A003 = luw.A00();
                    1ua.A02(r32);
                    A003.A02.EG4(r32, "retry on any network");
                    r5 = A003.A0A;
                    mfw = new C51648Fy7(A003, r32, (AnonymousClass4D7) null, 26);
                } else {
                    return;
                }
            } else if (0qQ.A0K(A0S.getString(2131969291), charSequence)) {
                C358248ab A0Y = DbS.A0Y(A0S);
                A0Y.A09(2131969292);
                A0Y.A0I(LV2.A00(lMq, 21), 2131969290);
                A0Y.A0r(true);
                A0Y.A0s(true);
                DbX.A16(C64226LUq.A00, A0Y);
                return;
            } else if (!0qQ.A0K(A0S.getString(2131969289), charSequence) || (clipsDraftRepository = luw.A01) == null) {
                throw AnonymousClass7TE.A1B(AnonymousClass7TG.A0m(charSequence, "Menu item click not handled: ", AnonymousClass7TE.A1A()));
            } else {
                AnonymousClass3Q2 r0 = luw.A02;
                if (r0 != null) {
                    String str = r0.A35;
                    0qQ.A0B(str, 0);
                    r5 = clipsDraftRepository.A01;
                    mfw = new MFW(clipsDraftRepository, str, (AnonymousClass4D7) null, 2);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            AnonymousClass7TE.A1Z(mfw, r5);
        }
    }

    public LU5(C64096LMq lMq) {
        this.A00 = lMq;
    }
}
