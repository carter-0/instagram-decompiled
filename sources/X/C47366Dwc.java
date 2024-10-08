package X;

import java.util.HashMap;
import java.util.List;

/* renamed from: X.Dwc  reason: case insensitive filesystem */
public final class C47366Dwc extends 1XP implements C336537em {
    public N3M A00;
    public Integer A01;
    public String A02;
    public String A03;
    public List A04;
    public List A05;
    public boolean A06;

    public final boolean CKA() {
        return false;
    }

    public final String getNextMaxId() {
        return null;
    }

    public final String BjE() {
        return this.A02;
    }

    public final Integer BlQ() {
        return this.A01;
    }

    public final String BnF() {
        return this.A03;
    }

    public final List Bqo() {
        return this.A04;
    }

    public final List getItems() {
        return AnonymousClass7TE.A1D(this.A05);
    }

    public final Object B3J() {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("filtered", Boolean.valueOf(this.A06));
        A1E.put("inform_module", this.A00);
        return A1E;
    }
}
