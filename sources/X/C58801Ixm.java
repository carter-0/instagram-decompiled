package X;

import com.facebookpay.logging.LoggingContext;
import java.util.List;

/* renamed from: X.Ixm  reason: case insensitive filesystem */
public final class C58801Ixm extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58801Ixm(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A04 = obj;
        this.A06 = z;
        this.A01 = obj2;
        this.A05 = str;
        this.A02 = obj3;
        this.A03 = obj4;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        if (this.A00 != 0) {
            0qQ.A0B(obj, 0);
            if (this.A06) {
                C284945Oz r1 = (C284945Oz) this.A04;
                if (r1.getValue() == null) {
                    r1.Epw(this.A05);
                    ((0sL) this.A02).invoke(this.A01, obj);
                }
            } else {
                ((0sP) this.A03).invoke(this.A01);
            }
            return C60340gF.A00;
        }
        1Ln r5 = (1Ln) obj;
        0bb r3 = new 0bb();
        LoggingContext loggingContext = (LoggingContext) this.A04;
        C51971G9r.A1B(r3, loggingContext);
        r3.A03("perform_validation", Boolean.valueOf(this.A06));
        G9t.A1L(r3, loggingContext, "account_mutation_data_list", (List) this.A01);
        r3.A06("view_name", this.A05);
        HO3 ho3 = (HO3) this.A02;
        if (ho3 != null) {
            r3.A01(ho3, "account_mutation_failure_step");
        }
        r5.A0N(r3, "event_payload");
        C51969G9p.A1G(r5, this.A03);
        return r5;
    }
}
