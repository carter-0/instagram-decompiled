package X;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.Map;

public final class UIG extends C18081VlB implements X27 {
    public C15046UKz A00;
    public GSY A01;
    public WeakReference A02;
    public Map A03;
    public boolean A04;
    public boolean A05;
    public final Context A06;
    public final C64301LZb A07;
    public final C262224Cq A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UIG(Context context, C17973VjA vjA, C64301LZb lZb, C262224Cq r5) {
        super(lZb);
        0qQ.A0B(context, 1);
        this.A06 = context;
        this.A07 = lZb;
        this.A08 = r5;
        this.A02 = new WeakReference(vjA);
    }

    public final void CxI(V28 v28) {
        V2A ui8;
        if (!(v28 instanceof C14923UFh) && !(v28 instanceof C14924UFk)) {
            if (v28 instanceof C14920UFe) {
                if (0qQ.A0K(((C14920UFe) v28).A00, this.A03)) {
                    String str = this.A03;
                    if (str != null) {
                        ui8 = new UIB(str, true);
                    } else {
                        throw AnonymousClass7TE.A0y();
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
                if (0qQ.A0K(str2, str3)) {
                    Integer num2 = AnonymousClass05K.A00;
                    if (num == num2) {
                        this.A04 = false;
                        1Eo.A03(num2, 19B.A00, new C59712JUv(this, (AnonymousClass4D7) null, 28), this.A08);
                        A05(new UIC(str3, uFl.A02));
                        this.A01 |= 1;
                        A03();
                        return;
                    }
                    0qQ.A0B(num, 0);
                    if (num == AnonymousClass05K.A0C || num == AnonymousClass05K.A01 || num == AnonymousClass05K.A15) {
                        A04();
                        ui8 = new UIA(str3, A002);
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else if (!(v28 instanceof C14921UFf) && !(v28 instanceof UFi)) {
                if (v28 instanceof C14922UFg) {
                    String str4 = this.A03;
                    String str5 = ((C14922UFg) v28).A00;
                    if (0qQ.A0K(str4, str5)) {
                        ui8 = new UI9(str5);
                    } else {
                        return;
                    }
                } else if (v28 instanceof UFj) {
                    String str6 = this.A03;
                    String str7 = ((UFj) v28).A01;
                    if (0qQ.A0K(str6, str7)) {
                        ui8 = new UI8(str7);
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

    public final void A02() {
        super.A02();
        C17973VjA vjA = (C17973VjA) this.A02.get();
        if (vjA != null) {
            vjA.A01(this);
        }
        C17973VjA vjA2 = (C17973VjA) this.A02.get();
        if (vjA2 != null) {
            VQW vqw = vjA2.A00;
            if (vqw == null) {
                0qQ.A0F("aleBridge");
                throw AnonymousClass00P.createAndThrow();
            } else {
                vqw.A00.clearAvatarCache();
            }
        }
    }
}
