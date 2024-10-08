package X;

import android.content.Context;
import java.lang.ref.WeakReference;

public final class UIF extends C18081VlB implements X27 {
    public C15046UKz A00;
    public GSY A01;
    public WeakReference A02;
    public boolean A03;
    public final C64301LZb A04;
    public final Context A05;
    public final C262224Cq A06;

    public final void CxI(V28 v28) {
        V2A ui8;
        if (!(v28 instanceof C14923UFh) && !(v28 instanceof C14924UFk)) {
            if (v28 instanceof C14920UFe) {
                if (0qQ.A0K(((C14920UFe) v28).A00, this.A03)) {
                    String str = this.A03;
                    if (str != null) {
                        ui8 = new UIB(str, true);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    return;
                }
            } else if (v28 instanceof C14925UFl) {
                C14925UFl uFl = (C14925UFl) v28;
                Integer num = uFl.A00;
                String A002 = C18090VlK.A00(num);
                String str2 = this.A03;
                String str3 = uFl.A01;
                if (!0qQ.A0K(str2, str3)) {
                    return;
                }
                if (num == AnonymousClass05K.A00) {
                    if (!this.A03) {
                        this.A03 = true;
                    }
                    A05(new UIC(str3, uFl.A02));
                    this.A01 |= 1;
                    A03();
                    return;
                }
                0qQ.A0B(num, 0);
                if (num == AnonymousClass05K.A0C || num == AnonymousClass05K.A01 || num == AnonymousClass05K.A15) {
                    A04();
                    String str4 = this.A03;
                    if (str4 != null) {
                        ui8 = new UIA(str4, A002);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    return;
                }
            } else if (!(v28 instanceof C14921UFf) && !(v28 instanceof UFi)) {
                if (v28 instanceof C14922UFg) {
                    AnonymousClass7TE.A1Z(new C59676JTh((Object) this, (AnonymousClass4D7) null, 26), this.A06);
                    String str5 = this.A03;
                    String str6 = ((C14922UFg) v28).A00;
                    if (0qQ.A0K(str5, str6)) {
                        ui8 = new UI9(str6);
                    } else {
                        return;
                    }
                } else if (v28 instanceof UFj) {
                    String str7 = this.A03;
                    String str8 = ((UFj) v28).A01;
                    if (0qQ.A0K(str7, str8)) {
                        ui8 = new UI8(str8);
                    } else {
                        return;
                    }
                } else {
                    throw new RuntimeException();
                }
            } else {
                return;
            }
            A05(ui8);
        }
    }

    public UIF(Context context, C17973VjA vjA, C64301LZb lZb, C262224Cq r5) {
        super(lZb);
        this.A05 = context;
        this.A04 = lZb;
        this.A06 = r5;
        this.A02 = new WeakReference(vjA);
    }

    public final void A02() {
        super.A02();
        C17973VjA vjA = (C17973VjA) this.A02.get();
        if (vjA != null) {
            vjA.A01(this);
        }
    }
}
