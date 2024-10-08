package X;

import com.instagram.common.session.UserSession;
import java.util.Map;

/* renamed from: X.9Oz  reason: invalid class name and case insensitive filesystem */
public final class C378229Oz implements AnonymousClass2Kv {
    public final /* synthetic */ AnonymousClass9PW A00;

    public C378229Oz(AnonymousClass9PW r1) {
        this.A00 = r1;
    }

    public final void invoke(AnonymousClass3JD r10) {
        Object Bny;
        Enum enumR;
        C391279sd r1;
        Integer num;
        C250663lr optionalTreeField;
        if (r10 != null && (Bny = r10.Bny()) != null) {
            AnonymousClass9PW r4 = this.A00;
            C250663lr r5 = (C250663lr) Bny;
            String str = null;
            if (r5 == null || (optionalTreeField = r5.getOptionalTreeField(0, "xcxp_ig_crossposting_linkage", AnonymousClass9P1.class, -610967666)) == null) {
                enumR = null;
            } else {
                enumR = optionalTreeField.getOptionalEnumField(0, "linkage_type", C391279sd.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            }
            if (enumR == null) {
                C378219Oy.A00(r4.A00.A00, false, AnonymousClass05K.A0I, r4.A01, (String) null, (Map) null);
                return;
            }
            C250663lr optionalTreeField2 = r5.getOptionalTreeField(0, "xcxp_ig_crossposting_linkage", AnonymousClass9P1.class, -610967666);
            if (optionalTreeField2 != null) {
                r1 = (C391279sd) optionalTreeField2.getOptionalEnumField(0, "linkage_type", C391279sd.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            } else {
                r1 = null;
            }
            UserSession userSession = r4.A00.A00;
            Integer num2 = AnonymousClass05K.A0K;
            String str2 = r4.A01;
            if (r1 != null) {
                str = r1.name();
            }
            C378219Oy.A00(userSession, false, num2, str2, str, (Map) null);
            2D6 A002 = 2D5.A00(userSession);
            if (r1 != null) {
                int ordinal = r1.ordinal();
                if (ordinal == 1) {
                    num = AnonymousClass05K.A00;
                } else if (ordinal == 2) {
                    num = AnonymousClass05K.A01;
                } else if (ordinal == 3) {
                    num = AnonymousClass05K.A0C;
                }
                0qQ.A0B(num, 0);
                0xY AR4 = A002.A04.AR4();
                AR4.E5g("PREFERENCE_CREATOR_DESTINATION_TYPE_STRING", C378169Ot.A00(num));
                AR4.apply();
            }
            num = AnonymousClass05K.A0N;
            0qQ.A0B(num, 0);
            0xY AR42 = A002.A04.AR4();
            AR42.E5g("PREFERENCE_CREATOR_DESTINATION_TYPE_STRING", C378169Ot.A00(num));
            AR42.apply();
        }
    }
}
