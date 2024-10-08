package X;

import java.util.List;

/* renamed from: X.Oyu  reason: case insensitive filesystem */
public final class C72226Oyu implements AnonymousClass11X {
    public Object A00;
    public final int A01;
    public final Object A02;

    public C72226Oyu(int i, Object obj, Object obj2) {
        this.A01 = i;
        this.A02 = obj;
        this.A00 = obj2;
    }

    public final String getName() {
        switch (this.A01) {
            case 0:
                return AnonymousClass000.A00(2406);
            case 1:
                return "mainChannels";
            default:
                return "IBC Chats Null State Context Lines";
        }
    }

    public final int getRunnableId() {
        switch (this.A01) {
            case 0:
                return 715233643;
            case 1:
                return 567;
            default:
                return 301436582;
        }
    }

    public final void onCancel() {
    }

    public final void onFinish() {
        AnonymousClass2mA r0;
        switch (this.A01) {
            case 0:
                C19138WMu wMu = (C19138WMu) this.A02;
                wMu.A04.A03.A00(AnonymousClass05K.A01);
                wMu.A06.DQ4(new C268664dn((Throwable) this.A00), wMu.A07);
                if (!wMu.A08 && (r0 = wMu.A05) != null) {
                    r0.A00();
                    return;
                }
                return;
            case 1:
                C72920PPe pPe = (C72920PPe) this.A02;
                pPe.A01 = this.A00;
                C336267eL r1 = pPe.A04;
                r1.EcJ((C337237fw) null);
                r1.EhX(pPe.A02);
                r1.EcJ(pPe);
                return;
            default:
                return;
        }
    }

    public final void onStart() {
    }

    public final void run() {
        switch (this.A01) {
            case 0:
                return;
            case 1:
                C72920PPe pPe = (C72920PPe) this.A02;
                Object Bo1 = pPe.A04.Bo1();
                if (Bo1 != null) {
                    this.A00 = pPe.A03.A00(Bo1);
                    return;
                }
                return;
            default:
                C72921PPf pPf = (C72921PPf) this.A02;
                C336267eL r1 = pPf.A0D;
                if (!r1.CWX()) {
                    r1.ERO((List) this.A00);
                    r1.EcJ(pPf);
                }
                C72921PPf.A00(pPf);
                return;
        }
    }

    public C72226Oyu(C72920PPe pPe) {
        this.A01 = 1;
        this.A02 = pPe;
        this.A00 = 0sn.A00;
    }
}
