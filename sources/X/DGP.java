package X;

import com.google.common.collect.ImmutableList;

public final class DGP implements AnonymousClass2hV {
    public static final DGP A00 = new DGP();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C250663lr reinterpretRequired;
        C250663lr optionalTreeField;
        C250663lr r6 = (C250663lr) obj;
        if (r6 == null || (reinterpretRequired = r6.reinterpretRequired(0, C42179BUa.class, 609878843)) == null || (optionalTreeField = reinterpretRequired.getOptionalTreeField(0, "get_server_encryption_key_logged_out(data:$data)", BUZ.class, 349832712)) == null) {
            throw new C13219TQk(0, "", "No server key response.");
        }
        ImmutableList requiredCompactedStringListField = optionalTreeField.getRequiredCompactedStringListField(2, "trust_chain");
        0qQ.A07(requiredCompactedStringListField);
        return requiredCompactedStringListField;
    }
}
