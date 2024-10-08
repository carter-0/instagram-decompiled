package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;

/* renamed from: X.CCi  reason: case insensitive filesystem */
public final class C43764CCi extends C250663lr implements DaA {
    public final int getPriority() {
        return getCoercedIntField(1, "priority");
    }

    public final DYM BGb() {
        return (DYM) getOptionalTreeField(4, "impression_settings", C43761CCf.class, -1914839836);
    }

    public final DYN BJf() {
        return (DYN) getOptionalTreeField(3, "ixt_flow_target", C43762CCg.class, 41484427);
    }

    public final ImmutableList C4V() {
        return getRequiredCompactedTreeListField(2, "targets", C43763CCh.class, -1056328738);
    }

    public final String CAh() {
        return A07(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return C41846B3n.A0M(C41845B3m.A0H(AnonymousClass4Kz.A00), AnonymousClass7TE.A0f(AnonymousClass4L8.A00, "priority"), C41845B3m.A0A(AnonymousClass4Ks.A02(), C43763CCh.class, "targets", -1056328738), C41845B3m.A0C(C43762CCg.class, "ixt_flow_target", 41484427), C41845B3m.A0C(C43761CCf.class, "impression_settings", -1914839836));
    }

    public C43764CCi(int i) {
        super(i);
    }

    public C43764CCi() {
        super(708584938);
    }
}
