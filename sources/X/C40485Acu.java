package X;

import android.content.Context;
import android.text.SpannableString;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.Acu  reason: case insensitive filesystem */
public final class C40485Acu implements AnonymousClass7XO {
    public final C332907Wx A00;
    public final C62320sa A01;

    public C40485Acu(C332907Wx r2, C62320sa r3) {
        0qQ.A0B(r2, 2);
        this.A01 = r3;
        this.A00 = r2;
    }

    public final SpannableString DkY(Context context, MessageIdentifier messageIdentifier, Integer num, int i) {
        AnonymousClass7TG.A1T(context, messageIdentifier, num);
        return ((C41836B2r) ((C332457Vc) this.A01.invoke()).A02.getValue()).BV6(context, this.A00, messageIdentifier, num, i);
    }

    public final void Dry(MessageIdentifier messageIdentifier, Integer num) {
        0qQ.A0B(num, 1);
        ((C41836B2r) ((C332457Vc) this.A01.invoke()).A02.getValue()).Ds0(messageIdentifier, num);
    }
}
