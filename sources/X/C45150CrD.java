package X;

import java.io.IOException;

/* renamed from: X.CrD  reason: case insensitive filesystem */
public abstract class C45150CrD {
    /* JADX WARNING: type inference failed for: r0v4, types: [X.Cv8, java.lang.Object] */
    public static C45366Cv8 parseFromJson(16F r3) {
        0qQ.A0B(r3, 0);
        try {
            ? obj = new Object();
            if (r3.A11() != 16L.A0D) {
                r3.A0z();
                return null;
            }
            while (r3.A1J() != 16L.A09) {
                String A17 = AnonymousClass7TE.A17(r3);
                if ("donations_count".equals(A17) || "donations_count_current_session_only".equals(A17)) {
                    r3.A1D();
                } else {
                    if ("formatted_amount_raised".equals(A17)) {
                        if (r3.A11() == 16L.A0G) {
                        }
                    } else if ("formatted_donations_count".equals(A17)) {
                        obj.A01 = AnonymousClass7TG.A0l(r3);
                    } else if ("formatted_amount_raised_current_session_only".equals(A17)) {
                        if (r3.A11() == 16L.A0G) {
                        }
                    } else if ("formatted_donations_count_current_session_only".equals(A17)) {
                        if (r3.A11() == 16L.A0G) {
                        }
                    } else if (!"formatted_goal_amount".equals(A17)) {
                        if (!"live_fundraiser_id".equals(A17)) {
                            if ("formatted_amount_raised_of_goal_amount_str".equals(A17)) {
                                obj.A00 = AnonymousClass7TG.A0l(r3);
                            } else if ("formatted_amount_raised_during_live_str".equals(A17)) {
                                if (r3.A11() == 16L.A0G) {
                                }
                            } else if ("fundraiser_title".equals(A17)) {
                                obj.A02 = AnonymousClass7TG.A0l(r3);
                            } else if (!"standalone_fundraiser_id".equals(A17)) {
                            }
                        }
                        r3.A0y();
                    } else if (r3.A11() == 16L.A0G) {
                    }
                    r3.A1P();
                }
                r3.A0z();
            }
            return obj;
        } catch (IOException e) {
            throw e;
        } catch (Exception e2) {
            throw AnonymousClass7TE.A0j(e2);
        }
    }
}
