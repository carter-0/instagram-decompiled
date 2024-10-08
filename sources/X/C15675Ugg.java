package X;

import com.facebook.rsys.turnallocation.gen.TurnAllocationCallback;

/* renamed from: X.Ugg  reason: case insensitive filesystem */
public final class C15675Ugg extends C18594Vul {
    public final int A00;
    public final Object A01;

    public C15675Ugg(TurnAllocationCallback turnAllocationCallback, int i) {
        this.A00 = i;
        this.A01 = turnAllocationCallback;
    }

    public final void A03(Exception exc) {
        int i = this.A00;
        0qQ.A0B(exc, 0);
        String message = exc.getMessage();
        if (i != 0) {
            if (message == null || message.length() == 0) {
                message = "Relays allocation failed with unknown error.";
            }
        } else if (message == null || message.length() == 0) {
            message = "Turn allocation failed with unknown error.";
        }
        ((TurnAllocationCallback) this.A01).error(message, -1);
    }
}
