package X;

/* renamed from: X.799  reason: invalid class name */
public abstract class AnonymousClass799 implements C234222xL {
    public final int A00;

    public final boolean Ds8(AnonymousClass5Gv r2) {
        return false;
    }

    public final void DsC(AnonymousClass5Gv r1) {
    }

    public boolean A00() {
        if (this instanceof AnonymousClass798) {
            return AnonymousClass4k9.A00(((AnonymousClass798) this).A00).A00.getBoolean("has_seen_try_cutouts_tooltip", false);
        }
        if (1Au.A00(((AnonymousClass79D) this).A03.A03).A01.getInt("add_yours_tool_tip_impression_count", 0) >= 2) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001d, code lost:
        if (X.182.A06(X.0Tu.A05, r4.A03, 36324136150576973L) == false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean A01() {
        /*
            r15 = this;
            boolean r0 = r15 instanceof X.AnonymousClass79D
            if (r0 == 0) goto L_0x0094
            r5 = r15
            X.79D r5 = (X.AnonymousClass79D) r5
            X.7KX r4 = r5.A03
            com.instagram.direct.prompts.DirectPromptTypes r1 = r5.A02
            com.instagram.direct.prompts.DirectPromptTypes r0 = com.instagram.direct.prompts.DirectPromptTypes.ADD_YOURS
            if (r1 != r0) goto L_0x001f
            com.instagram.common.session.UserSession r3 = r4.A03
            X.0Tu r2 = X.0Tu.A05
            r0 = 36324136150576973(0x810c9c00072f4d, double:3.03486819495651E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            r1 = 1
            if (r0 != 0) goto L_0x0020
        L_0x001f:
            r1 = 0
        L_0x0020:
            boolean r0 = r5.A06
            if (r0 == 0) goto L_0x00bc
            X.7KZ r0 = r5.A04
            boolean r0 = r0.A05()
            if (r0 == 0) goto L_0x00bc
            if (r1 != 0) goto L_0x00bc
            com.instagram.common.session.UserSession r2 = r4.A03
            X.1Av r3 = X.1Au.A00(r2)
            X.0s0 r1 = r3.A03
            X.0YZ[] r5 = X.1Av.A8a
            r0 = 204(0xcc, float:2.86E-43)
            r0 = r5[r0]
            java.lang.Object r0 = r1.CDM(r3, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r13 = r0.longValue()
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r13
            long r11 = r4.toDays(r0)
            X.1Av r3 = X.1Au.A00(r2)
            X.0s0 r1 = r3.A04
            r0 = 205(0xcd, float:2.87E-43)
            r0 = r5[r0]
            java.lang.Object r0 = r1.CDM(r3, r0)
            java.lang.Number r0 = (java.lang.Number) r0
            long r9 = r0.longValue()
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r9
            long r7 = r4.toDays(r0)
            r5 = 0
            int r0 = (r13 > r5 ? 1 : (r13 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x00bc
            r3 = 1
            int r0 = (r11 > r3 ? 1 : (r11 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bc
            X.1Av r0 = X.1Au.A00(r2)
            X.0xa r2 = r0.A01
            java.lang.String r1 = "add_yours_tool_tip_impression_count"
            r0 = 0
            int r1 = r2.getInt(r1, r0)
            r0 = 2
            if (r1 >= r0) goto L_0x00bc
            int r0 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0092
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x00bc
        L_0x0092:
            r4 = 1
        L_0x0093:
            return r4
        L_0x0094:
            r1 = r15
            X.798 r1 = (X.AnonymousClass798) r1
            X.793 r0 = r1.A01
            boolean r0 = r0.A03
            r4 = 0
            if (r0 == 0) goto L_0x0093
            com.instagram.common.session.UserSession r3 = r1.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36325166942466729(0x810d8c000332a9, double:3.035520071898258E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0093
            X.4kA r0 = X.AnonymousClass4k9.A00(r3)
            X.0xa r1 = r0.A00
            java.lang.String r0 = "has_seen_try_cutouts_tooltip"
            boolean r0 = r1.getBoolean(r0, r4)
            r4 = r0 ^ 1
            return r4
        L_0x00bc:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass799.A01():boolean");
    }

    public final void DsE(AnonymousClass5Gv r5) {
        if (this instanceof AnonymousClass79D) {
            AnonymousClass79D r3 = (AnonymousClass79D) this;
            C70846ONz oNz = new C70846ONz(r3.A00, r3.A01);
            String str = r3.A05;
            1Ln A03 = 1Ln.A03(oNz.A00);
            if (A03.A00.isSampled()) {
                A03.A0M(C69497Nmf.IMPRESSION, "action");
                A03.A0M(C69494Nmc.TOOLTIP, "source");
                A03.A0M(C69433Nld.A02, "prompt_type");
                A03.A0R("open_thread_id", str);
                A03.Cgf();
            }
        }
    }

    public AnonymousClass799(int i) {
        this.A00 = i;
    }
}
