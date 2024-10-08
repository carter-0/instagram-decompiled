package X;

import com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService;
import java.util.List;

/* renamed from: X.9KG  reason: invalid class name */
public final class AnonymousClass9KG extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final int A02 = 1;
    public final long A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KG(C292975jp r2, List list, AnonymousClass4D7 r4, C262224Cq r5, long j) {
        super(2, r4);
        this.A03 = j;
        this.A04 = r5;
        this.A01 = list;
        this.A05 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9KG, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v2, types: [X.9KG, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        AnonymousClass4D7 r3 = r9;
        if (this.A02 != 0) {
            long j = this.A03;
            List list = (List) this.A01;
            return new AnonymousClass9KG((C292975jp) this.A05, list, r3, (C262224Cq) this.A04, j);
        }
        ? r0 = new AnonymousClass9KG((MiniGalleryCategoriesService) this.A05, (AnonymousClass849) this.A04, r3, this.A03);
        r0.A01 = obj;
        return r0;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AnonymousClass9KG) create(obj, (AnonymousClass4D7) obj2)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.9KG, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0090 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.A02
            if (r0 == 0) goto L_0x0050
            r7 = r11
            X.1Hj r3 = X.1Hj.A02
            int r0 = r10.A00
            r2 = 1
            if (r0 == 0) goto L_0x001a
            if (r0 != r2) goto L_0x0012
            X.0eS.A00(r11)     // Catch:{ 3EF -> 0x0037 }
            return r7
        L_0x0012:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x001a:
            X.0eS.A00(r11)
            long r0 = r10.A03     // Catch:{ 3EF -> 0x0037 }
            java.lang.Object r6 = r10.A04     // Catch:{ 3EF -> 0x0037 }
            java.lang.Object r5 = r10.A01     // Catch:{ 3EF -> 0x0037 }
            java.lang.Object r7 = r10.A05     // Catch:{ 3EF -> 0x0037 }
            r8 = 0
            r9 = 28
            X.MfO r4 = new X.MfO     // Catch:{ 3EF -> 0x0037 }
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ 3EF -> 0x0037 }
            r10.A00 = r2     // Catch:{ 3EF -> 0x0037 }
            java.lang.Object r7 = X.I3P.A00(r10, r4, r0)     // Catch:{ 3EF -> 0x0037 }
            if (r7 == r3) goto L_0x0036
            return r7
        L_0x0036:
            return r3
        L_0x0037:
            long r2 = r10.A03
            X.02m r4 = X.02m.A0p
            r1 = 1001141275(0x3bac341b, float:0.005255235)
            java.lang.String r0 = ""
            com.facebook.quicklog.EventBuilder r1 = r4.markEventBuilder(r1, r0)
            java.lang.String r0 = "timeout"
            com.facebook.quicklog.EventBuilder r0 = r1.annotate(r0, r2)
            r0.report()
            X.0gF r7 = X.C60340gF.A00
            return r7
        L_0x0050:
            X.1Hj r7 = X.1Hj.A02
            int r0 = r10.A00
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L_0x0060
            if (r0 == r5) goto L_0x007e
            X.0eS.A00(r11)
        L_0x005d:
            X.0gF r7 = X.C60340gF.A00
            return r7
        L_0x0060:
            X.0eS.A00(r11)
            java.lang.Object r4 = r10.A01
            X.02o r4 = (X.02o) r4
            java.lang.Object r0 = r10.A05
            com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService r0 = (com.instagram.ar.core.discovery.minigallery.services.MiniGalleryCategoriesService) r0
            com.instagram.ar.core.discovery.minigallery.persistence.MiniGalleryCategoriesRepository r3 = r0.A02
            java.lang.Object r2 = r10.A04
            X.849 r2 = (X.AnonymousClass849) r2
            long r0 = r10.A03
            r10.A01 = r4
            r10.A00 = r5
            java.lang.Object r11 = r3.A00(r2, r10, r0)
            if (r11 != r7) goto L_0x0085
            return r7
        L_0x007e:
            java.lang.Object r4 = r10.A01
            X.02o r4 = (X.02o) r4
            X.0eS.A00(r11)
        L_0x0085:
            r0 = 0
            r10.A01 = r0
            r10.A00 = r6
            java.lang.Object r0 = r4.emit(r11, r10)
            if (r0 != r7) goto L_0x005d
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass9KG.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9KG(MiniGalleryCategoriesService miniGalleryCategoriesService, AnonymousClass849 r3, AnonymousClass4D7 r4, long j) {
        super(2, r4);
        this.A05 = miniGalleryCategoriesService;
        this.A04 = r3;
        this.A03 = j;
    }
}
