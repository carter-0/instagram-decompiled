package X;

import java.io.IOException;

/* renamed from: X.VCd  reason: case insensitive filesystem */
public abstract class C16951VCd {
    public static C17435VVo parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            C17435VVo vVo = new C17435VVo();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if (C273654mx.A00(310).equals(A17)) {
                    vVo.A01 = AnonymousClass7TG.A0l(r3);
                } else if (Dbq.A03().equals(A17)) {
                    vVo.A02 = AnonymousClass7TG.A0l(r3);
                } else if (C66579MXk.A00(154).equals(A17)) {
                    vVo.A00 = C16950VCc.parseFromJson(r3);
                }
                r3.A0z();
            }
            return vVo;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw new IOException(e2);
        }
    }
}
