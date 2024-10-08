package X;

import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.ReZ  reason: case insensitive filesystem */
public abstract class C9655ReZ {
    public static final C11024S6b A00(QSW qsw) {
        String obj;
        String obj2;
        0qQ.A0B(qsw, 0);
        String optionalStringField = qsw.getOptionalStringField(0, "strong_id__");
        if (optionalStringField != null) {
            Enum optionalEnumField = qsw.getOptionalEnumField(2, "auth_ticket_status", EWW.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            if (optionalEnumField == null || (obj = optionalEnumField.toString()) == null) {
                throw AnonymousClass7TE.A0z("status is null expected not null");
            }
            Enum optionalEnumField2 = qsw.getOptionalEnumField(1, "auth_ticket_type", C8925RFt.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
            if (optionalEnumField2 == null || (obj2 = optionalEnumField2.toString()) == null) {
                throw AnonymousClass7TE.A0z("authTicketType is null expected non null");
            }
            String A0A = qsw.A0A("fingerprint");
            if (A0A != null) {
                int coercedIntField = qsw.getCoercedIntField(4, "ttl");
                String A0C = qsw.A0C("associated_credential_id");
                ImmutableList A0X = C41845B3m.A0X(qsw, QSV.class, "auth_ticket_capabilities", 6, -1213122889);
                ArrayList A0r = AnonymousClass7TG.A0r(A0X);
                Iterator it = A0X.iterator();
                while (it.hasNext()) {
                    C250663lr A0V = C41845B3m.A0V(it);
                    String optionalStringField2 = A0V.getOptionalStringField(0, "cap_name");
                    if (optionalStringField2 != null) {
                        A0r.add(new S5f(optionalStringField2, A0V.getCoercedIntField(1, "ttl")));
                    } else {
                        throw AnonymousClass7TE.A0z("capability null , expected nonnull");
                    }
                }
                return new C11024S6b(optionalStringField, obj, obj2, A0A, A0C, A0r, coercedIntField);
            }
            throw AnonymousClass7TE.A0z("finger print is null expected non null");
        }
        throw AnonymousClass7TE.A0z("id is null");
    }
}
