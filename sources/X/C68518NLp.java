package X;

import java.util.List;

/* renamed from: X.NLp  reason: case insensitive filesystem */
public final class C68518NLp extends 1P0 {
    public final /* synthetic */ 1l3 A00;
    public final /* synthetic */ C66231l1 A01;

    public C68518NLp(1l3 r1, C66231l1 r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03 = AnonymousClass0fD.A03(-218145453);
        int A0D = AnonymousClass7TG.A0D(obj, -773365003);
        C68518NLp.super.onSuccess(obj);
        1Ng A002 = AnonymousClass1Nd.A00(this.A00.A00);
        List list = this.A01.A00;
        if (list != null) {
            A002.A00(new C321896uv(list.size()));
            AnonymousClass0fD.A0A(29225112, A0D);
            AnonymousClass0fD.A0A(-619880279, A03);
            return;
        }
        0qQ.A0F("recommendedUserIds");
        throw AnonymousClass00P.createAndThrow();
    }
}
