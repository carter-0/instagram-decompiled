package X;

import java.util.Map;

/* renamed from: X.OVt  reason: case insensitive filesystem */
public final class C70998OVt {
    public static final OP3 A01 = new Object();
    public static final AnonymousClass0eM A02 = AnonymousClass0eN.A01(C73717Pie.A00);
    public final Map A00;

    public final String A01(2FW r3, Object obj) {
        0qQ.A0B(r3, 0);
        return A00(new O65(true), r3, obj);
    }

    public C70998OVt() {
        0eP[] r2 = new 0eP[28];
        System.arraycopy(DbW.A1b(2FW.A1u, C73629Ph4.A00), AnonymousClass7TF.A1X(new 0eP[]{AnonymousClass7TE.A1L(2FW.A1O, C73620Pgv.A00), AnonymousClass7TE.A1L(2FW.A1w, C73630Ph5.A00), AnonymousClass7TE.A1L(2FW.A0H, C73631Ph6.A00), AnonymousClass7TE.A1L(2FW.A1D, C73632Ph7.A00), AnonymousClass7TE.A1L(2FW.A1v, C73633Ph8.A00), AnonymousClass7TE.A1L(2FW.A1q, C73634Ph9.A00), AnonymousClass7TE.A1L(2FW.A1T, C73635PhA.A00), AnonymousClass7TE.A1L(2FW.A1y, C73636PhB.A00), AnonymousClass7TE.A1L(2FW.A1e, C73637PhC.A00), AnonymousClass7TE.A1L(2FW.A20, C73610Pgl.A00), AnonymousClass7TE.A1L(2FW.A1x, C73611Pgm.A00), AnonymousClass7TE.A1L(2FW.A18, C73612Pgn.A00), AnonymousClass7TE.A1L(2FW.A19, C73613Pgo.A00), AnonymousClass7TE.A1L(2FW.A1t, C73614Pgp.A00), AnonymousClass7TE.A1L(2FW.A1Y, C73615Pgq.A00), AnonymousClass7TE.A1L(2FW.A0t, C73616Pgr.A00), AnonymousClass7TE.A1L(2FW.A0W, C73617Pgs.A00), AnonymousClass7TE.A1L(2FW.A1p, C73618Pgt.A00), AnonymousClass7TE.A1L(2FW.A0M, C73619Pgu.A00), AnonymousClass7TE.A1L(2FW.A1S, C73621Pgw.A00), AnonymousClass7TE.A1L(2FW.A1Z, C73622Pgx.A00), AnonymousClass7TE.A1L(2FW.A1a, C73623Pgy.A00), AnonymousClass7TE.A1L(2FW.A12, C73624Pgz.A00), AnonymousClass7TE.A1L(2FW.A11, C73625Ph0.A00), AnonymousClass7TE.A1L(2FW.A0g, C73626Ph1.A00), AnonymousClass7TE.A1L(2FW.A0w, C73627Ph2.A00), AnonymousClass7TE.A1L(2FW.A0r, C73628Ph3.A00)}, r2) ? 1 : 0, r2, 27, 1);
        this.A00 = 0Yt.A06(r2);
    }

    public final String A00(O65 o65, 2FW r4, Object obj) {
        Map map = this.A00;
        if (!map.containsKey(r4)) {
            return "";
        }
        Object A012 = 0Yt.A01(r4, map);
        0qQ.A0C(A012, "null cannot be cast to non-null type kotlin.Function2<@[ParameterName(name = \"content\")] T of com.instagram.direct.deeplinking.DeeplinkPlugin.getProvider, @[ParameterName(name = \"env\")] com.instagram.direct.deeplinking.Environment, kotlin.String>");
        0u4.A05(A012, 2);
        return (String) ((0sL) A012).invoke(obj, o65);
    }
}
