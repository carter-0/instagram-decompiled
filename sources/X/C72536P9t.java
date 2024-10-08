package X;

import android.app.Activity;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.ArrayList;

/* renamed from: X.P9t  reason: case insensitive filesystem */
public final class C72536P9t implements C332927Wz {
    public final Activity A00;
    public final AnonymousClass4DH A01;
    public final AnonymousClass0iw A02;
    public final 1a8 A03 = C66580MXl.A0O();
    public final UserSession A04;
    public final AnonymousClass7UF A05;
    public final OJa A06;
    public final AnonymousClass7X2 A07;
    public final AnonymousClass0eK A08;
    public final AnonymousClass0eK A09;
    public final OT9 A0A;
    public final AnonymousClass0eK A0B;

    public C72536P9t(Activity activity, AnonymousClass4DH r3, AnonymousClass0iw r4, UserSession userSession, AnonymousClass7UF r6, OJa oJa, OT9 ot9, AnonymousClass7X2 r9, AnonymousClass0eK r10, AnonymousClass0eK r11, AnonymousClass0eK r12) {
        0qQ.A0B(r3, 3);
        AnonymousClass7TG.A1S(r9, r6);
        C51974G9v.A1Q(r10, ot9, r11, oJa);
        0qQ.A0B(r12, 11);
        this.A04 = userSession;
        this.A00 = activity;
        this.A01 = r3;
        this.A02 = r4;
        this.A07 = r9;
        this.A05 = r6;
        this.A09 = r10;
        this.A0A = ot9;
        this.A08 = r11;
        this.A06 = oJa;
        this.A0B = r12;
        r3.registerLifecycleListener(new Mf9(this));
    }

    public final void EuX(MessageIdentifier messageIdentifier) {
        C358248ab A0X;
        CharSequence[] charSequenceArr;
        boolean z;
        DialogInterface.OnClickListener of4;
        String str;
        0qQ.A0B(messageIdentifier, 0);
        if (!AnonymousClass7TE.A1a(this.A0B.get())) {
            OT9 ot9 = this.A0A;
            UserSession userSession = this.A04;
            z = true;
            C254703su A002 = OT9.A00(ot9, messageIdentifier.A01, "FailedMessageDialogManager", true);
            if (A002 != null) {
                ArrayList A0v = DbS.A0v(2);
                Activity activity = this.A00;
                A0v.add(AnonymousClass7TE.A16(activity, 2131960654));
                if (A002.A1F != AnonymousClass05K.A0Y) {
                    A0v.add(AnonymousClass7TE.A16(activity, 2131960256));
                }
                A0v.add(AnonymousClass7TE.A16(activity, 2131971293));
                A0X = DbS.A0X(activity);
                C270214gN r1 = A002.A0r;
                if (!(r1 == null || r1.A0A || (str = r1.A02) == null || str.length() == 0)) {
                    A0X.A0q(str);
                }
                A0X.A0l(this.A01, userSession);
                charSequenceArr = (CharSequence[]) A0v.toArray(new String[0]);
                of4 = new C71185Of3(2, this, A002, A0v);
            } else {
                return;
            }
        } else {
            String str2 = messageIdentifier.A01;
            ArrayList A0v2 = DbS.A0v(2);
            Activity activity2 = this.A00;
            A0v2.add(AnonymousClass7TE.A16(activity2, 2131960654));
            if (C66582MXn.A0W(this.A08).Cat(str2)) {
                A0v2.add(AnonymousClass7TE.A16(activity2, 2131960256));
            }
            A0v2.add(AnonymousClass7TE.A16(activity2, 2131971293));
            A0X = DbS.A0X(activity2);
            A0X.A0l(this.A01, this.A04);
            charSequenceArr = (CharSequence[]) A0v2.toArray(new String[0]);
            z = true;
            of4 = new C71186Of4(A0v2, this, str2, 1);
        }
        A0X.A0e(of4, charSequenceArr);
        AnonymousClass7TH.A0a(A0X, z);
    }
}
