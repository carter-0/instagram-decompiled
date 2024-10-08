package X;

import com.google.common.collect.ImmutableList;

public final class DGQ implements AnonymousClass2hV {
    public static final DGQ A00 = new DGQ();

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C250663lr reinterpretRequired;
        C250663lr optionalTreeField;
        C250663lr r6 = (C250663lr) obj;
        if (r6 == null || (reinterpretRequired = r6.reinterpretRequired(0, C42183BUe.class, -830474888)) == null || (optionalTreeField = reinterpretRequired.getOptionalTreeField(0, "get_server_encryption_key(data:$input)", C42182BUd.class, -200021125)) == null) {
            throw new C13219TQk(0, "", "No server key response.");
        }
        ImmutableList requiredCompactedStringListField = optionalTreeField.getRequiredCompactedStringListField(2, "trust_chain");
        0qQ.A07(requiredCompactedStringListField);
        return requiredCompactedStringListField;
    }
}
