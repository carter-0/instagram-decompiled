package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UdT  reason: case insensitive filesystem */
public final class C15478UdT extends 2Ru {
    public List A00 = new ArrayList();
    public final Context A01;
    public final C15528UeH A02;
    public final C15502Udr A03;
    public final C15503Uds A04;
    public final C15504Udt A05;
    public final C15505Udu A06;
    public final C15506Udv A07;
    public final C15507Udw A08;
    public final C15508Udx A09;
    public final UserSession A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15478UdT(Context context, 0hq r10, UserSession userSession) {
        super(false);
        0qQ.A0B(userSession, 2);
        this.A01 = context;
        this.A0A = userSession;
        C15505Udu udu = new C15505Udu(context);
        this.A06 = udu;
        C15528UeH ueH = new C15528UeH(context, r10, userSession);
        this.A02 = ueH;
        C15508Udx udx = new C15508Udx(context);
        this.A09 = udx;
        C15507Udw udw = new C15507Udw(context);
        this.A08 = udw;
        C15504Udt udt = new C15504Udt(context);
        this.A05 = udt;
        C15502Udr udr = new C15502Udr(context);
        this.A03 = udr;
        C15506Udv udv = new C15506Udv(context);
        this.A07 = udv;
        C15503Uds uds = new C15503Uds(context);
        this.A04 = uds;
        init(new C231642s0[]{udu, ueH, udx, udw, udt, udr, udv, uds});
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [java.lang.Object, X.V38] */
    public static void A00(C15478UdT udT, Integer num) {
        ? obj = new Object();
        obj.A00 = num;
        udT.A00.add(obj);
    }

    public final void A01() {
        C231642s0 r0;
        for (Object next : this.A00) {
            if (next instanceof VVS) {
                r0 = this.A08;
            } else if (next instanceof C17330VRj) {
                r0 = this.A06;
            } else if (next instanceof VMY) {
                r0 = this.A09;
            } else if (next instanceof V38) {
                r0 = this.A05;
            } else if (next instanceof C17569VaN) {
                r0 = this.A03;
            } else if (next instanceof C17570VaO) {
                r0 = this.A07;
            } else if (next instanceof VZL) {
                r0 = this.A04;
            }
            addModel(next, r0);
        }
        notifyDataSetChanged();
    }
}
