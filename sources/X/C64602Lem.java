package X;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* renamed from: X.Lem  reason: case insensitive filesystem */
public final class C64602Lem implements AnonymousClass1GR {
    public final /* synthetic */ C55800Hng A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ C252683pV A02;

    public final void DEO(C268654dm r8, AnonymousClass1QW r9) {
        String message;
        0qQ.A0B(r8, 1);
        C55800Hng hng = this.A00;
        Throwable A012 = r8.A01();
        String valueOf = String.valueOf(A012);
        String A002 = AnonymousClass000.A00(1363);
        0qQ.A0B(valueOf, 1);
        Long l = hng.A01;
        if (l != null) {
            C51965G9l.A0a(hng.A04).flowEndFail(l.longValue(), A002, valueOf);
        }
        hng.A01 = null;
        if (A012 != null && (message = A012.getMessage()) != null) {
            19E.A04(message, this.A02);
        }
    }

    public final /* synthetic */ void DEQ(C268654dm r1, AnonymousClass1QW r2) {
    }

    public final /* synthetic */ void DTx() {
    }

    public final /* synthetic */ void DTy(1XR r1, AnonymousClass1QW r2, AnonymousClass2ZK r3) {
    }

    public final /* synthetic */ void DeX() {
    }

    public final /* synthetic */ void Den() {
    }

    public final /* synthetic */ void DfH(AnonymousClass1QW r1, AnonymousClass2ZK r2) {
    }

    public C64602Lem(C55800Hng hng, Map map, C252683pV r3) {
        this.A00 = hng;
        this.A02 = r3;
        this.A01 = map;
    }

    public final void D58(AnonymousClass1QW r6, AnonymousClass2ZK r7) {
        C55800Hng hng = this.A00;
        Long l = hng.A01;
        if (l != null) {
            C51965G9l.A0a(hng.A04).flowMarkPoint(l.longValue(), "STREAMING_SUCCESS");
        }
        Long l2 = hng.A01;
        if (l2 != null) {
            C51965G9l.A0a(hng.A04).flowEndSuccess(l2.longValue());
        }
        hng.A01 = null;
        this.A02.AI3((Throwable) null);
    }

    public final /* bridge */ /* synthetic */ void DTw(1XR r8, AnonymousClass1QW r9, AnonymousClass2ZK r10) {
        C59721JVf jVf;
        C43800CDs cDs = (C43800CDs) r8;
        0qQ.A0B(cDs, 2);
        C55800Hng hng = this.A00;
        Long l = hng.A01;
        if (l != null) {
            long longValue = l.longValue();
            hng.A00++;
            C51965G9l.A0a(hng.A04).flowMarkPoint(longValue, 002.A0O("STREAMING_RESPONSE_", hng.A00));
        }
        L3H l3h = cDs.A01;
        if (l3h == null) {
            C41845B3m.A0v();
            throw AnonymousClass00P.createAndThrow();
        }
        List<GSY> list = l3h.A01;
        if (list != null) {
            Map map = this.A01;
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            for (GSY gsy : list) {
                map.put(gsy.A02, new C59721JVf(gsy));
                A0r.add(C60340gF.A00);
            }
        }
        C61064Jw2 jw2 = l3h.A00;
        if (!(jw2 == null || (jVf = (C59721JVf) this.A01.get(jw2.A02)) == null)) {
            jVf.A00 = jw2;
        }
        this.A02.FIG(l3h);
    }
}
