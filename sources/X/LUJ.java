package X;

import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class LUJ implements DialogInterface.OnClickListener {
    public final int A00;
    public final long A01;
    public final Object A02;

    public LUJ(Object obj, long j, int i) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = j;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C318136oS A002;
        0sL imO;
        if (this.A00 != 0) {
            K8J k8j = (K8J) this.A02;
            C313886hJ r5 = k8j.A03;
            if (r5 != null) {
                String str = k8j.A04;
                if (str != null) {
                    long j = this.A01;
                    HashMap hashMap = r5.A08.A08;
                    Long valueOf = Long.valueOf(j);
                    Object obj = hashMap.get(valueOf);
                    if (obj != null) {
                        if (hashMap.containsKey(valueOf)) {
                            hashMap.remove(valueOf);
                        }
                        C313886hJ.A00(r5);
                        AnonymousClass2Fj r3 = r5.A03;
                        LGC lgc = (LGC) r3.A02();
                        if (lgc != null && lgc.A01 == j) {
                            r3.A0B((Object) null);
                        }
                        A002 = C318116oQ.A00(r5);
                        imO = new MFf(obj, r5, str, (AnonymousClass4D7) null, 2, j);
                    } else {
                        return;
                    }
                } else {
                    0qQ.A0F("broadcastId");
                    throw AnonymousClass00P.createAndThrow();
                }
            } else {
                return;
            }
        } else {
            H0I h0i = (H0I) this.A02;
            long j2 = this.A01;
            I6J i6j = I6J.A00;
            UserSession A0l = AnonymousClass7TE.A0l(h0i.A01);
            AnonymousClass0eM r32 = h0i.A00;
            i6j.A08(A0l, "challenge_end_dialog", "confirm_end_challenge", ((C53034GhQ) r32.getValue()).A04, (String) null, (List) null, (List) null, AnonymousClass7TE.A1I(Long.valueOf(j2)), (Map) null);
            2YL A0H = DbS.A0H(r32);
            A002 = C318116oQ.A00(A0H);
            imO = new C58102ImO(A0H, (AnonymousClass4D7) null, 17);
        }
        AnonymousClass7TE.A1Z(imO, A002);
    }
}
