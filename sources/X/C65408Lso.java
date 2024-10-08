package X;

import java.util.Map;

/* renamed from: X.Lso  reason: case insensitive filesystem */
public final class C65408Lso implements C66559MWn {
    public int A00;
    public final 1Nh A01;
    public final 1wn A02 = C64698LgT.A00(this, 65);
    public final Class A03;
    public final Map A04 = AnonymousClass7TE.A1H();
    public final Map A05 = AnonymousClass7TE.A1H();

    public C65408Lso(1Nh r2, Class cls) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
        this.A03 = cls;
    }

    public final void CsP(AnonymousClass07Z r5, AnonymousClass2gO r6) {
        if (r5.getLifecycle().A07() != 07U.A02) {
            Map map = this.A04;
            if (map.containsKey(r6)) {
                Object obj = map.get(r6);
                0qQ.A0A(obj);
                if (!0qQ.A0K(((C64305LZf) obj).A02, r5)) {
                    throw AnonymousClass7TE.A0z("Already observing IgBaseLiveEvent with a different LifecycleOwner");
                }
                return;
            }
            C64305LZf lZf = new C64305LZf(r5, r6, this);
            map.put(r6, lZf);
            r5.getLifecycle().A09(lZf);
            if (r5.getLifecycle().A07().compareTo(07U.A01) >= 0) {
                A00(this, true);
            }
            this.A05.put(r6, AnonymousClass7TE.A1C());
        }
    }

    public static final void A00(C65408Lso lso, boolean z) {
        int i = lso.A00;
        boolean z2 = false;
        boolean A1R = AnonymousClass7TF.A1R(i);
        int i2 = -1;
        if (z) {
            i2 = 1;
        }
        int i3 = i + i2;
        lso.A00 = i3;
        if (i3 > 0) {
            z2 = true;
        }
        if (!A1R) {
            if (z2) {
                lso.A01.A99(lso.A02, lso.A03);
            }
        } else if (!z2) {
            lso.A01.EDz(lso.A02, lso.A03);
        }
    }
}
