package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.GraphGuardianContent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Y0w  reason: case insensitive filesystem */
public final class C22368Y0w implements G8I {
    public final CTS A00;

    public C22368Y0w(CTS cts) {
        0qQ.A0B(cts, 1);
        this.A00 = cts;
    }

    public final long AjP() {
        return this.A00.A01.A01;
    }

    public final G9S B8C() {
        return C21055XCg.A0G(this.A00.A00, C43695C5r.class, 1195986619);
    }

    public final List BAC() {
        return this.A00.A00.BAC();
    }

    public final int BCX() {
        return this.A00.A00.getCoercedIntField(8, AnonymousClass000.A00(1406));
    }

    public final boolean BUB() {
        return this.A00.A00.getCoercedBooleanField(4, "more_groups_available");
    }

    public final List BW1() {
        List CD6 = this.A00.A00.CD6();
        if (CD6 == null) {
            return 0sn.A00;
        }
        return CD6;
    }

    public final List Bey() {
        ImmutableList optionalCompactedTreeListField = this.A00.A00.getOptionalCompactedTreeListField(9, AnonymousClass000.A00(1701), C43698C5u.class, -22302801);
        if (optionalCompactedTreeListField == null) {
            return 0sn.A00;
        }
        ArrayList A0r = AnonymousClass7TG.A0r(optionalCompactedTreeListField);
        Iterator it = optionalCompactedTreeListField.iterator();
        while (it.hasNext()) {
            A0r.add(((C250663lr) it.next()).getRequiredStringField(0, PublicKeyCredentialControllerUtility.JSON_KEY_NAME));
        }
        return A0r;
    }

    public final boolean BuE() {
        return this.A00.A00.getCoercedBooleanField(7, AnonymousClass000.A00(188));
    }

    public final GraphGuardianContent By9() {
        return this.A00.A00.By9();
    }

    public final List C2q() {
        List C2q = this.A00.A00.C2q();
        if (C2q == null) {
            return 0sn.A00;
        }
        return C2q;
    }

    public final boolean CCU() {
        return this.A00.A00.getCoercedBooleanField(13, "use_clickable_see_more");
    }

    public final boolean CPt() {
        return this.A00.A01.CPt();
    }

    public final String getNextMaxId() {
        return this.A00.A00.getNextMaxId();
    }
}
