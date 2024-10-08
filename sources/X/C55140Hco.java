package X;

/* renamed from: X.Hco  reason: case insensitive filesystem */
public abstract class C55140Hco {
    public static void A00(16F r1, C54072Gyv gyv, String str) {
        if (C66579MXk.A00(378).equals(str)) {
            gyv.A06 = AnonymousClass7TG.A0l(r1);
        } else if ("has_more".equals(str)) {
            gyv.A0B = r1.A0d();
        } else if ("more_results_header".equals(str)) {
            gyv.A08 = AnonymousClass7TG.A0l(r1);
        } else if ("entity_results_header".equals(str)) {
            gyv.A05 = AnonymousClass7TG.A0l(r1);
        } else if ("rank_token".equals(str)) {
            gyv.A07 = AnonymousClass7TG.A0l(r1);
        } else if (C66579MXk.A00(910).equals(str)) {
            gyv.A01 = C44725Cjt.parseFromJson(r1);
        } else if ("see_more".equals(str)) {
            gyv.A04 = C70328O2g.parseFromJson(r1);
        } else if ("media_grid".equals(str)) {
            gyv.A02 = C55138Hcm.parseFromJson(r1);
        } else if ("high_confidence_module".equals(str)) {
            gyv.A00 = C70277O0h.parseFromJson(r1);
        } else if ("other_results".equals(str)) {
            gyv.A03 = C55139Hcn.parseFromJson(r1);
        } else {
            1XY.A01(r1, gyv, str);
        }
    }
}
