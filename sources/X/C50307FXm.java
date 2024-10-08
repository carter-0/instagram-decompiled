package X;

import java.util.Map;

/* renamed from: X.FXm  reason: case insensitive filesystem */
public final class C50307FXm implements 1DN {
    public final int A00;
    public final Object A01;

    public C50307FXm(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.KHF, X.11X] */
    public final void DWm(Map map) {
        0Aj A0e;
        switch (this.A00) {
            case 0:
                if (map.get("android.permission.WRITE_EXTERNAL_STORAGE") == C346927vz.GRANTED) {
                    ESR.A07((ESR) this.A01);
                    return;
                } else {
                    DbZ.A0s(2131953583);
                    return;
                }
            case 1:
                if (map.get("android.permission.WRITE_EXTERNAL_STORAGE") == C346927vz.GRANTED) {
                    E4T e4t = (E4T) this.A01;
                    1ES.A03(new KHF(E4T.A00(e4t), e4t));
                    return;
                }
                C59689JTv.A07(DbT.A08(this.A01), 2131953583);
                return;
            default:
                C346927vz r0 = (C346927vz) map.get("android.permission.READ_CONTACTS");
                if (r0 == null) {
                    r0 = C346927vz.DENIED;
                }
                int ordinal = r0.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        1Q0 r1 = 1Q0.A0X;
                        E3V e3v = (E3V) this.A01;
                        DbU.A1R(r1.A02(e3v.A01).A05((EXD) null, C48156EZy.A0A.A00), e3v.A01);
                    } else if (ordinal == 2) {
                        AnonymousClass0aP r7 = ((E3V) this.A01).A01;
                        double A002 = DbV.A00(r7, 0);
                        double A003 = DbS.A00();
                        A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r7), "nux_contacts_upsell_automatically_declined");
                        Dbc.A0X(A0e, A002, A003);
                        DbS.A1H(A0e, "contacts_upsell");
                        DbZ.A1E(A0e);
                        FH8.A05(A0e);
                        FH8.A0D(A0e, r7, "release_channel", FH8.A01());
                    }
                    E3V.A00((E3V) this.A01);
                    return;
                }
                AnonymousClass0aP r72 = ((E3V) this.A01).A01;
                String str = C48156EZy.A0A.A00.A01;
                AnonymousClass7TF.A1H(r72, str);
                double A012 = DbS.A01();
                double A004 = DbS.A00();
                A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(r72), "nux_contacts_upsell_accepted");
                DbZ.A1G(A0e, A012, A004);
                FH8.A06(A0e);
                DbW.A12(A0e, A004);
                DbZ.A1J(A0e, str);
                FH8.A09(A0e, r72);
                A0e.A7p("silent", false);
                A0e.Cgf();
                E3V.A00((E3V) this.A01);
                return;
        }
    }
}
