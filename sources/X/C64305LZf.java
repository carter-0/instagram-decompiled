package X;

import java.util.List;

/* renamed from: X.LZf  reason: case insensitive filesystem */
public final class C64305LZf implements AnonymousClass0hF {
    public boolean A00;
    public 07U A01;
    public final AnonymousClass07Z A02;
    public final AnonymousClass2gO A03;
    public final C65408Lso A04;

    public final void Dms(07T r6, AnonymousClass07Z r7) {
        07U A07 = this.A02.getLifecycle().A07();
        if (this.A01 == 07U.A03 && A07.compareTo(07U.A01) >= 0) {
            C65408Lso.A00(this.A04, true);
        } else if (A07 == 07U.A02) {
            C65408Lso lso = this.A04;
            AnonymousClass2gO r3 = this.A03;
            C64305LZf lZf = (C64305LZf) lso.A04.remove(r3);
            if (lZf != null) {
                C65408Lso.A00(lso, false);
                lZf.A02.getLifecycle().A0A(lZf);
                lso.A05.remove(r3);
                return;
            }
            return;
        }
        this.A01 = A07;
        boolean z = this.A00;
        boolean z2 = false;
        if (A07.compareTo(07U.A05) >= 0) {
            z2 = true;
        }
        this.A00 = z2;
        if (!z && z2) {
            C65408Lso lso2 = this.A04;
            AnonymousClass2gO r2 = this.A03;
            List list = (List) lso2.A05.get(r2);
            if (list != null && !list.isEmpty()) {
                r2.onChanged(list);
                list.clear();
            }
        }
    }

    public C64305LZf(AnonymousClass07Z r2, AnonymousClass2gO r3, C65408Lso lso) {
        this.A02 = r2;
        this.A03 = r3;
        this.A04 = lso;
        this.A01 = r2.getLifecycle().A07();
    }
}
