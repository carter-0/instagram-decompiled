package X;

import com.facebook.rsys.turnallocation.gen.TurnAllocationCallback;

/* renamed from: X.Vul  reason: case insensitive filesystem */
public abstract class C18594Vul {
    public void A03(Exception exc) {
    }

    public void A04(Object obj) {
        ((TurnAllocationCallback) ((C15675Ugg) this).A01).success(C41847B3o.A1E(obj));
    }

    public static void A01(C18594Vul vul, Exception exc) {
        if (vul != null) {
            11Z.A02(new C20197Wmv(vul, exc));
        }
    }

    public static void A02(C18594Vul vul, Object obj) {
        if (vul != null) {
            11Z.A02(new C20196Wmu(vul, obj));
        }
    }
}
