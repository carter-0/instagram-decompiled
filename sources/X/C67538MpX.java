package X;

import android.content.Context;
import android.text.SpannableString;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.List;
import kotlin.Deprecated;

@Deprecated(message = "legacy translation feature")
/* renamed from: X.MpX  reason: case insensitive filesystem */
public final class C67538MpX implements C41836B2r {
    public final 0wc A00;
    public final UserSession A01;
    public final AnonymousClass0eK A02;
    public final AnonymousClass0eM A03 = C73899Pla.A00(this, 18);

    public final void Ds0(MessageIdentifier messageIdentifier, Integer num) {
        0qQ.A0B(num, 1);
        ((C72542P9z) this.A03.getValue()).Dry(messageIdentifier, num);
    }

    public final void onDestroy() {
    }

    public final boolean AP3() {
        return ((C72542P9z) this.A03.getValue()).A01();
    }

    public final SpannableString BV6(Context context, C332907Wx r3, MessageIdentifier messageIdentifier, Integer num, int i) {
        return ((C72542P9z) this.A03.getValue()).DkY(context, messageIdentifier, num, i);
    }

    public final void FHw(AnonymousClass7SD r2, List list, boolean z, boolean z2) {
        ((C72542P9z) this.A03.getValue()).A00(r2, list, z);
    }

    public C67538MpX(0wc r2, UserSession userSession, AnonymousClass0eK r4) {
        this.A01 = userSession;
        this.A00 = r2;
        this.A02 = r4;
    }
}
