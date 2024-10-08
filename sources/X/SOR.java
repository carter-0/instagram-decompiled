package X;

import com.facebookpay.logging.FBPayLoggerData;
import com.fbpay.hub.form.params.FormDialogParams;
import com.fbpay.hub.form.params.FormLogEvents;
import com.fbpay.hub.form.params.FormParams;
import com.google.common.collect.ImmutableList;

public final class SOR {
    public FBPayLoggerData A00;
    public FormDialogParams A01;
    public FormLogEvents A02;
    public ImmutableList A03;
    public String A04;
    public String A05;
    public final int A06;
    public final int A07;
    public final int A08;
    public final ImmutableList.Builder A09;
    public final String A0A;
    public final String A0B;

    public SOR(String str, String str2) {
        this.A09 = Pxe.A0Y();
        this.A06 = 3;
        this.A08 = 0;
        this.A0B = str;
        this.A0A = str2;
        this.A07 = 2131962652;
    }

    public static FormParams A00(C10697Rwb rwb, SOR sor, int i) {
        rwb.A02 = i;
        rwb.A01 = 2131962653;
        sor.A01 = new FormDialogParams(rwb);
        return sor.A01();
    }

    public final FormParams A01() {
        ImmutableList build = this.A09.build();
        this.A03 = build;
        17k.A0G(DbT.A1b(build), "Provide at least one cell params");
        return new FormParams(this);
    }

    public SOR(int i, int i2, String str, int i3) {
        this.A09 = Pxe.A0Y();
        this.A06 = i;
        this.A08 = i2;
        this.A0B = null;
        this.A0A = str;
        this.A07 = i3;
    }
}
