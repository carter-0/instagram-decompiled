package X;

/* renamed from: X.U8f  reason: case insensitive filesystem */
public abstract class C14769U8f extends 2YL {
    public String A00 = "";
    public final C17776Vfn A01;
    public final C249513ju A02;
    public final AnonymousClass0r6 A03;

    public final String A00() {
        if (this instanceof C16054Unh) {
            return ((C16054Unh) this).A02;
        }
        return ((C16053Ung) this).A02;
    }

    public final void A01() {
        if (this instanceof C16054Unh) {
            C16054Unh unh = (C16054Unh) this;
            unh.A01.A00(unh.A00);
            return;
        }
        C16053Ung ung = (C16053Ung) this;
        ung.A00.A1N = ung.A00;
    }

    public C14769U8f(C17776Vfn vfn) {
        this.A01 = vfn;
        1HR A0f = C13990Tnq.A0f();
        this.A02 = A0f;
        this.A03 = 0u9.A04(A0f);
    }
}
