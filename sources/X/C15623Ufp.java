package X;

import com.google.common.collect.ImmutableList;
import java.util.Collection;

/* renamed from: X.Ufp  reason: case insensitive filesystem */
public abstract class C15623Ufp extends 1P0 {
    public WGU A00;
    public Long A01 = C51968G9o.A0u();
    public String A02;

    public static ImmutableList A01(Collection collection) {
        if (collection == null) {
            return ImmutableList.of();
        }
        return ImmutableList.copyOf(collection);
    }

    public C15623Ufp(WGU wgu, String str) {
        this.A02 = str;
        this.A00 = wgu;
    }

    private void A02(V1S v1s, WGU wgu) {
        Long valueOf = Long.valueOf(System.currentTimeMillis() - this.A01.longValue());
        String str = this.A02;
        0Aj A0e = AnonymousClass7TE.A0e(wgu.A05, "ig_boost_platform_api_call");
        A0e.AAJ("flow_id", wgu.A03);
        A0e.AAJ("api_path", str);
        A0e.A9F("latency_ms", valueOf);
        A0e.A8M(v1s, C66579MXk.A00(159));
        A0e.Cgf();
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0064, code lost:
        if (r0 != false) goto L_0x0066;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00bd, code lost:
        if (r0 != null) goto L_0x0039;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03(X.AnonymousClass1XT r4) {
        /*
            r3 = this;
            r0 = 361431094(0x158b0036, float:5.6141986E-26)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.C15623Ufp.super.onSuccess(r4)
            r1 = r3
            boolean r0 = r3 instanceof X.C15422UcY
            if (r0 == 0) goto L_0x0056
            X.UcY r1 = (X.C15422UcY) r1
            int r0 = r1.A00
            if (r0 == 0) goto L_0x0047
            X.CD1 r4 = (X.CD1) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.X9m r0 = r4.A00
            if (r0 == 0) goto L_0x00fd
            X.UMt r0 = (X.UMt) r0
            java.util.List r0 = r0.A00
            java.util.Iterator r1 = r0.iterator()
        L_0x0027:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0066
            java.lang.Object r0 = r1.next()
            X.X9l r0 = (X.C21010X9l) r0
            X.UMs r0 = (X.UMs) r0
            X.UKM r0 = r0.A01
            if (r0 == 0) goto L_0x0027
        L_0x0039:
            X.V1S r1 = X.V1S.ERROR
        L_0x003b:
            X.WGU r0 = r3.A00
            r3.A02(r1, r0)
            r0 = -1209523514(0xffffffffb7e822c6, float:-2.7672748E-5)
            X.AnonymousClass0fD.A0A(r0, r2)
            return
        L_0x0047:
            X.CEY r4 = (X.CEY) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.X9l r0 = r4.A01
            if (r0 == 0) goto L_0x00fd
            X.UMs r0 = (X.UMs) r0
            X.UKM r0 = r0.A01
            goto L_0x00bd
        L_0x0056:
            boolean r0 = r3 instanceof X.C15421UcX
            if (r0 == 0) goto L_0x0069
            X.UcX r1 = (X.C15421UcX) r1
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0066
            X.UXU r4 = (X.UXU) r4
            boolean r0 = r4.A01
        L_0x0064:
            if (r0 == 0) goto L_0x0039
        L_0x0066:
            X.V1S r1 = X.V1S.SUCCESS
            goto L_0x003b
        L_0x0069:
            boolean r0 = r3 instanceof X.C15423UcZ
            if (r0 == 0) goto L_0x00c9
            X.UcZ r1 = (X.C15423UcZ) r1
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x00b5;
                case 1: goto L_0x0074;
                case 2: goto L_0x00ae;
                case 3: goto L_0x0074;
                case 4: goto L_0x00a5;
                case 5: goto L_0x0074;
                case 6: goto L_0x0074;
                case 7: goto L_0x009c;
                case 8: goto L_0x0093;
                case 9: goto L_0x0074;
                case 10: goto L_0x00c0;
                case 11: goto L_0x009c;
                case 12: goto L_0x007e;
                case 13: goto L_0x0075;
                default: goto L_0x0074;
            }
        L_0x0074:
            goto L_0x0066
        L_0x0075:
            X.UX5 r4 = (X.UX5) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.UKM r0 = r4.A00
            goto L_0x00bd
        L_0x007e:
            X.CEi r4 = (X.C43816CEi) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.UKf r0 = r4.A08
            if (r0 != 0) goto L_0x0090
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0090:
            X.UKM r0 = r0.A07
            goto L_0x00bd
        L_0x0093:
            com.instagram.business.promote.model.PromoteCreateAudienceResponse r4 = (com.instagram.business.promote.model.PromoteCreateAudienceResponse) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.UKM r0 = r4.A00
            goto L_0x00bd
        L_0x009c:
            X.UXc r4 = (X.C15242UXc) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.UKM r0 = r4.A00
            goto L_0x00bd
        L_0x00a5:
            X.UX6 r4 = (X.UX6) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.UKM r0 = r4.A00
            goto L_0x00bd
        L_0x00ae:
            X.UXB r4 = (X.UXB) r4
            if (r4 == 0) goto L_0x0066
            X.UKM r0 = r4.A00
            goto L_0x00bd
        L_0x00b5:
            X.UXo r4 = (X.C15254UXo) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.UKM r0 = r4.A01
        L_0x00bd:
            if (r0 != 0) goto L_0x0039
            goto L_0x0066
        L_0x00c0:
            com.instagram.business.promote.model.PromoteSaveAudienceEditResponse r4 = (com.instagram.business.promote.model.PromoteSaveAudienceEditResponse) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            boolean r0 = r4.A00
            goto L_0x0064
        L_0x00c9:
            boolean r0 = r3 instanceof X.C15420UcW
            if (r0 == 0) goto L_0x00d6
            X.UXd r4 = (X.C15243UXd) r4
            X.UKM r0 = r4.A00
            boolean r0 = X.DbW.A1a(r0)
            goto L_0x0064
        L_0x00d6:
            boolean r0 = r3 instanceof X.C15419UcV
            if (r0 == 0) goto L_0x00e3
            X.UXo r4 = (X.C15254UXo) r4
            X.UKM r0 = r4.A01
            boolean r0 = X.DbW.A1a(r0)
            goto L_0x0064
        L_0x00e3:
            X.CEi r4 = (X.C43816CEi) r4
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.UKf r0 = r4.A08
            if (r0 != 0) goto L_0x00f5
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00f5:
            X.UKM r0 = r0.A07
            boolean r0 = X.DbW.A1a(r0)
            goto L_0x0064
        L_0x00fd:
            X.C41845B3m.A0v()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15623Ufp.A03(X.1XT):void");
    }

    public void onFail(C268654dm r4) {
        int A03 = AnonymousClass0fD.A03(-1895372974);
        C15623Ufp.super.onFail(r4);
        A02(V1S.FAILURE, this.A00);
        AnonymousClass0fD.A0A(-1737615023, A03);
    }

    public void onStart() {
        int A03 = AnonymousClass0fD.A03(-1479099202);
        C15623Ufp.super.onStart();
        this.A01 = C51968G9o.A0u();
        AnonymousClass0fD.A0A(-1076988579, A03);
    }
}
