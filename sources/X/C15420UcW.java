package X;

import com.instagram.api.schemas.Estimate;
import com.instagram.api.schemas.XIGIGBoostDestination;
import com.instagram.business.promote.model.PromoteData;
import com.instagram.business.promote.model.PromoteReachEstimationStore;
import com.instagram.business.promote.model.PromoteState;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.UcW  reason: case insensitive filesystem */
public final class C15420UcW extends C15623Ufp {
    public final /* synthetic */ XIGIGBoostDestination A00;
    public final /* synthetic */ C16678UzE A01;
    public final /* synthetic */ C18784W1k A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15420UcW(XIGIGBoostDestination xIGIGBoostDestination, C16678UzE uzE, WGU wgu, C18784W1k w1k, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        super(wgu, str);
        this.A02 = w1k;
        this.A01 = uzE;
        this.A04 = str2;
        this.A00 = xIGIGBoostDestination;
        this.A03 = str3;
        this.A05 = str4;
        this.A06 = z;
        this.A07 = z2;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.UXd, X.1XT] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-321608507);
        ? r6 = (C15243UXd) obj;
        int A033 = AnonymousClass0fD.A03(186467843);
        UKM ukm = r6.A00;
        C18784W1k w1k = this.A02;
        if (ukm != null) {
            w1k.A02.A0I(this.A01, "reach_estimation_fetch", ukm.A03);
        } else {
            WGU wgu = w1k.A02;
            C16678UzE uzE = this.A01;
            wgu.A0D(uzE, "reach_estimation_fetch");
            PromoteData promoteData = w1k.A03;
            PromoteReachEstimationStore promoteReachEstimationStore = promoteData.A0w;
            HashMap hashMap = new HashMap();
            Iterator A0u = Pxf.A0u(r6.A02);
            while (A0u.hasNext()) {
                String A18 = AnonymousClass7TE.A18(A0u);
                hashMap.put(Pxf.A0Z(A18), r6.A02.get(A18));
            }
            HashMap hashMap2 = new HashMap();
            Iterator A0u2 = Pxf.A0u(r6.A01);
            while (A0u2.hasNext()) {
                String A182 = AnonymousClass7TE.A18(A0u2);
                hashMap2.put(Pxf.A0Z(A182), r6.A01.get(A182));
            }
            String str = this.A04;
            String obj2 = this.A00.toString();
            String str2 = this.A03;
            String str3 = this.A05;
            boolean z = this.A06;
            boolean z2 = this.A07;
            C51974G9v.A1M(str, obj2, str2);
            if (!0qQ.A0K(promoteReachEstimationStore.A03, str) || !0qQ.A0K(promoteReachEstimationStore.A02, obj2) || !0qQ.A0K(promoteReachEstimationStore.A00, str2) || !0qQ.A0K(promoteReachEstimationStore.A01, str3) || promoteReachEstimationStore.A06 != z || promoteReachEstimationStore.A07 != z2) {
                promoteReachEstimationStore.A05 = new HashMap();
                promoteReachEstimationStore.A04 = new HashMap();
                promoteReachEstimationStore.A03 = str;
                promoteReachEstimationStore.A02 = obj2;
                promoteReachEstimationStore.A00 = str2;
                promoteReachEstimationStore.A01 = str3;
                promoteReachEstimationStore.A06 = z;
                promoteReachEstimationStore.A07 = z2;
            }
            promoteReachEstimationStore.A05.putAll(hashMap);
            promoteReachEstimationStore.A04.putAll(hashMap2);
            String A034 = w1k.A03(uzE.toString(), "reach_estimation_fetch");
            Estimate A052 = promoteData.A05(A034);
            Estimate A042 = promoteData.A04(A034);
            if (!(A052 == null || A042 == null)) {
                PromoteState promoteState = w1k.A04;
                promoteData.A0U = A052;
                promoteData.A0T = A042;
                PromoteState.A01(promoteState, AnonymousClass05K.A03);
            }
        }
        A03(r6);
        AnonymousClass0fD.A0A(1609937776, A033);
        AnonymousClass0fD.A0A(-1149185208, A032);
    }

    public final void onFail(C268654dm r6) {
        int A032 = AnonymousClass0fD.A03(908842644);
        this.A02.A02.A0L(this.A01, "reach_estimation_fetch", r6.A01());
        super.onFail(r6);
        AnonymousClass0fD.A0A(-650356420, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(-76459522);
        super.onStart();
        AnonymousClass0fD.A0A(-877952898, A032);
    }
}
