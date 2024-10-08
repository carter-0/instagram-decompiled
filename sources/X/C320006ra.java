package X;

import android.app.Activity;
import com.facebook.proxygen.LigerSamplePolicy;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.6ra  reason: invalid class name and case insensitive filesystem */
public final class C320006ra {
    public AnonymousClass72L A00;
    public AnonymousClass72L A01;
    public final AnonymousClass0JR A02 = new Object();
    public final UserSession A03;

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0024, code lost:
        if (((androidx.fragment.app.Fragment) r5.get(0)).mTag == "fragment_search") goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A01(androidx.fragment.app.FragmentActivity r8) {
        /*
            r7 = this;
            r2 = 0
            X.72L r4 = r7.A01
            if (r4 == 0) goto L_0x007a
            X.0hq r0 = r8.getSupportFragmentManager()
            X.06j r0 = r0.A0U
            java.util.List r5 = r0.A04()
            X.0qQ.A07(r5)
            boolean r0 = r5.isEmpty()
            java.lang.String r3 = "fragment_search"
            r6 = 1
            if (r0 != 0) goto L_0x0026
            java.lang.Object r0 = r5.get(r2)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.String r0 = r0.mTag
            r1 = 1
            if (r0 != r3) goto L_0x0027
        L_0x0026:
            r1 = 0
        L_0x0027:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x007b
            java.lang.Object r0 = r5.get(r2)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            java.lang.String r0 = r0.mTag
            if (r0 != r3) goto L_0x007b
            java.lang.Object r0 = r5.get(r2)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            X.0hq r0 = r0.getChildFragmentManager()
            int r0 = r0.A0M()
            if (r0 != 0) goto L_0x007b
        L_0x0047:
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.lang.String r1 = r4.A04
            java.lang.String r0 = "search_session_id"
            r5.put(r0, r1)
            r0 = 0
            r7.A01 = r0
            com.instagram.common.session.UserSession r4 = r7.A03
            X.0qQ.A0B(r4, r2)
            X.0Tu r2 = X.0Tu.A05
            r0 = 36599099956596147(0x8206b000030db3, double:3.208756413073413E-306)
            long r0 = X.182.A01(r2, r4, r0)
            int r3 = (int) r0
            java.lang.String r2 = "Required value was null."
            if (r3 == r6) goto L_0x0092
            r0 = 2
            java.lang.String r1 = "935001260753650"
            if (r3 == r0) goto L_0x0084
            r0 = 3
            if (r3 != r0) goto L_0x007a
            X.1Wj r0 = X.1Wj.A00
            if (r0 == 0) goto L_0x007e
            r0.A00(r8, r4, r1, r5)
        L_0x007a:
            return
        L_0x007b:
            if (r1 != 0) goto L_0x0047
            return
        L_0x007e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0084:
            X.1Wj r0 = X.1Wj.A00
            if (r0 == 0) goto L_0x008c
            r0.A01(r8, r4, r1, r5)
            return
        L_0x008c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        L_0x0092:
            X.1Wj r0 = X.1Wj.A00
            if (r0 == 0) goto L_0x00a1
            java.lang.String r1 = "1111276766222125"
            X.UfN r0 = new X.UfN
            r0.<init>(r4, r8, r1)
            X.C18798W2k.A02(r0, r4, r1)
            return
        L_0x00a1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C320006ra.A01(androidx.fragment.app.FragmentActivity):void");
    }

    public final void A00(Activity activity) {
        AnonymousClass72L r5 = this.A00;
        if (r5 != null) {
            long now = this.A02.now() - r5.A00;
            if (now < 300000 && now >= LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT) {
                HashMap hashMap = new HashMap();
                hashMap.put("entity_type", r5.A02);
                hashMap.put("entity_name", r5.A01);
                hashMap.put("search_session_id", r5.A04);
                hashMap.put("query_text", r5.A03);
                1Wj r2 = 1Wj.A00;
                if (r2 != null) {
                    r2.A00(activity, this.A03, "474680169747204", hashMap);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            this.A00 = null;
        }
    }

    public final void A02(String str) {
        String str2 = "";
        String str3 = "";
        this.A01 = new AnonymousClass72L("", str2, str3, str, this.A02.now());
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [java.lang.Object, X.0JR] */
    public C320006ra(UserSession userSession) {
        this.A03 = userSession;
    }
}
