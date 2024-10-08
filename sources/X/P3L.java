package X;

import android.widget.CompoundButton;

public final class P3L implements C51902G6w {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public P3L(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final void DBE(int i) {
        switch (this.A00) {
            case 0:
                C72346P2l p2l = (C72346P2l) this.A02;
                p2l.A03.C62().Cou(p2l.A01, p2l.A05, i);
                return;
            case 1:
                C72348P2n p2n = (C72348P2n) this.A02;
                p2n.A04.C62().Cp3(p2n.A01, p2n.A05.A0L, i);
                return;
            case 2:
                C70734OIr oIr = C67484Moe.A08;
                ((C67484Moe) this.A02).A03.Coy((C254743sy) this.A01, i);
                return;
            default:
                C70734OIr oIr2 = C67484Moe.A08;
                ((C67484Moe) this.A02).A03.Cp6((C254743sy) this.A01, i);
                return;
        }
    }

    public final void onCancel() {
        switch (this.A00) {
            case 0:
                ((CompoundButton) this.A01).setChecked(false);
                return;
            case 1:
                ((CompoundButton) this.A01).setChecked(false);
                ((C72348P2n) this.A02).A06.onToggle(false);
                return;
            default:
                return;
        }
    }
}
