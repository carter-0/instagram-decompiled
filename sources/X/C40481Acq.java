package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.capabilities.Capabilities;
import com.instagram.direct.prompts.DirectPromptTypes;
import com.instagram.direct.sharetostory.data.MessageShareStickerData;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.Acq  reason: case insensitive filesystem */
public final class C40481Acq implements AnonymousClass7XK {
    public final Activity A00;
    public final UserSession A01;
    public final AnonymousClass0eK A02;
    public final AnonymousClass0eK A03;
    public final C62320sa A04;

    public C40481Acq(Activity activity, UserSession userSession, AnonymousClass0eK r4, AnonymousClass0eK r5, C62320sa r6) {
        0qQ.A0B(r4, 3);
        AnonymousClass7TG.A1R(r5, r6);
        this.A01 = userSession;
        this.A00 = activity;
        this.A02 = r4;
        this.A03 = r5;
        this.A04 = r6;
    }

    public final void ErZ(MessageIdentifier messageIdentifier, Integer num) {
        AnonymousClass7TG.A1N(messageIdentifier, num);
        UserSession userSession = this.A01;
        AnonymousClass0eK r9 = this.A02;
        MessageShareStickerData A002 = OQZ.A00(userSession, ((AnonymousClass9HC) this.A03.get()).A01, DirectPromptTypes.UNKNOWN, messageIdentifier, num, (String) null, r9);
        if (A002 != null) {
            OQZ.A01(this.A00, userSession, A002, (AnonymousClass6ST) this.A04.invoke());
        }
    }

    public final void Erd(AnonymousClass9JG r11, MessageIdentifier messageIdentifier, Integer num) {
        String str;
        Integer num2 = num;
        0qQ.A0B(num, 2);
        UserSession userSession = this.A01;
        AnonymousClass0eK r9 = this.A02;
        Capabilities capabilities = ((AnonymousClass9HC) this.A03.get()).A01;
        String str2 = null;
        if (r11 != null) {
            str = r11.A02;
        } else {
            str = null;
        }
        DirectPromptTypes A012 = AnonymousClass79B.A01(str);
        if (r11 != null) {
            str2 = r11.A01;
        }
        MessageShareStickerData A002 = OQZ.A00(userSession, capabilities, A012, messageIdentifier, num2, str2, r9);
        if (A002 != null) {
            OQZ.A01(this.A00, userSession, A002, (AnonymousClass6ST) this.A04.invoke());
        }
    }
}
