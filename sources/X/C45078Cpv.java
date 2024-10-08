package X;

import java.io.IOException;

/* renamed from: X.Cpv  reason: case insensitive filesystem */
public abstract class C45078Cpv {
    public static C45431CwB parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C45431CwB cwB = new C45431CwB();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("endpoint".equals(A17)) {
                    cwB.A09 = C44913Cn4.parseFromJson(r3);
                } else if ("merchant".equals(A17)) {
                    cwB.A0B = C45072Cpp.parseFromJson(r3);
                } else if ("search".equals(A17)) {
                    cwB.A00 = C44346CdS.parseFromJson(r3);
                } else if (C41845B3m.A1D(A17)) {
                    cwB.A05 = C45071Cpo.parseFromJson(r3);
                } else if ("product".equals(A17)) {
                    cwB.A02 = C45076Cpt.parseFromJson(r3);
                } else if ("igtv".equals(A17)) {
                    cwB.A01 = C55151Hcz.parseFromJson(r3);
                } else if ("product_collection".equals(A17)) {
                    cwB.A08 = C45075Cps.parseFromJson(r3);
                } else if ("module".equals(A17)) {
                    cwB.A07 = C45073Cpq.parseFromJson(r3);
                } else if ("account_seeded_channel".equals(A17)) {
                    cwB.A06 = C45068Cpl.parseFromJson(r3);
                } else if ("unseeded_channel".equals(A17)) {
                    cwB.A04 = C45077Cpu.parseFromJson(r3);
                } else if ("ads_rediscovery".equals(A17)) {
                    cwB.A0A = C45069Cpm.parseFromJson(r3);
                } else if ("ig_funded_incentive".equals(A17)) {
                    cwB.A03 = C45070Cpn.parseFromJson(r3);
                } else if ("deeplink".equals(A17)) {
                    C41846B3n.A1A(r3);
                }
                r3.A0z();
            }
            return cwB;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
