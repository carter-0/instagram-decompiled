package X;

import com.instagram.api.schemas.IceBreakerMessageIntf;

/* renamed from: X.VXh  reason: case insensitive filesystem */
public class C17480VXh {
    public String A00;
    public String A01;
    public String A02;
    public final IceBreakerMessageIntf A03;

    public C17480VXh(IceBreakerMessageIntf iceBreakerMessageIntf) {
        this.A03 = iceBreakerMessageIntf;
        this.A00 = iceBreakerMessageIntf.getActionUrl();
        this.A01 = iceBreakerMessageIntf.getMessage();
        this.A02 = iceBreakerMessageIntf.BSH();
    }
}
