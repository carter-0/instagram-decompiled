package X;

import android.view.Window;
import com.instagram.react.modules.base.IgReactQEModule;

public final class FmG implements C273414mX {
    public final int A00;
    public final Object A01;

    public FmG(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static C331157Pu A00(C331127Pr r1, Object obj, int i) {
        r1.A0U = new FmG(obj, i);
        return r1.A00();
    }

    public final void Cyc() {
        ESI esi;
        boolean z;
        switch (this.A00) {
            case 0:
                C47467E3p.A03((C47467E3p) this.A01, false);
                return;
            case 1:
            case 2:
            case 3:
                DbS.A1U(this.A01);
                return;
            case 4:
                Window window = ((C47853EJz) this.A01).A02.A00.A0A.getWindow();
                if (window != null) {
                    window.addFlags(512);
                    return;
                }
                return;
            case 5:
            case 6:
                ((C51913G7h) this.A01).DUs();
                return;
            case 7:
                ((C49636Ezt) this.A01).A03.ETo(true);
                return;
            case 8:
                E3F e3f = (E3F) this.A01;
                E99 e99 = e3f.A03;
                if (e99 == null) {
                    0qQ.A0F("accountAdapter");
                    throw AnonymousClass00P.createAndThrow();
                } else {
                    e99.A00(E3F.A01(e3f));
                    return;
                }
            case 9:
                DxF.A00((DxF) this.A01);
                return;
            case 10:
                esi = (ESI) this.A01;
                esi.A08 = false;
                esi.A09 = false;
                z = true;
                break;
            case 11:
                esi = (ESI) this.A01;
                z = false;
                esi.A09 = false;
                break;
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                LBK lbk = (LBK) this.A01;
                boolean A06 = C367288qV.A06(lbk.A05);
                C66461MSp mSp = lbk.A08;
                if (mSp != null) {
                    mSp.afterSelection(A06);
                    return;
                }
                return;
            case 13:
                AnonymousClass6a7 r0 = ((Q03) this.A01).A0W;
                if (r0 != null) {
                    r0.A00();
                    return;
                }
                return;
            case 14:
                ((G87) this.A01).Doy();
                return;
            default:
                return;
        }
        ESI.A0A(esi, z);
    }

    public final /* synthetic */ void Cyf() {
    }
}
