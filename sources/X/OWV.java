package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectSearchResult;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class OWV {
    public int A00;
    public Handler A01 = AnonymousClass7TF.A0D();
    public AnonymousClass9B2 A02;
    public C290645fe A03;
    public DirectSearchResult A04;
    public String A05;
    public String A06;
    public String A07;
    public List A08;
    public boolean A09;
    public C290975gJ A0A;
    public List A0B;
    public List A0C;
    public List A0D;
    public final Context A0E;
    public final UserSession A0F;
    public final Oy6 A0G;
    public final String A0H;
    public final String A0I;
    public final boolean A0J;
    public final boolean A0K;
    public final boolean A0L;

    public final void A03(HashMap hashMap) {
        0qQ.A0B(hashMap, 0);
        if (0qQ.A0K(this.A0H, "reshare_share_sheet")) {
            C70166NyK.A00(this.A0F).A00.markerPoint(145755797, "INTEROP_PROVIDER_UPDATE_EXTRA_DATA");
        }
        List list = this.A0C;
        if (list != null) {
            hashMap.put("ibc_chats", list);
        }
        List list2 = this.A0B;
        if (list2 != null) {
            hashMap.put("agents", list2);
        }
        DirectSearchResult directSearchResult = this.A04;
        if (directSearchResult != null) {
            hashMap.put("meta_ai_agent", directSearchResult);
        }
        List list3 = this.A0D;
        if (list3 != null) {
            hashMap.put("ai_prompts", list3);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00aa, code lost:
        if (r8 != null) goto L_0x0050;
     */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00a8  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C290645fe r10, X.OWV r11) {
        /*
            java.lang.String r4 = r11.A0H
            java.lang.String r3 = "reshare_share_sheet"
            boolean r0 = X.0qQ.A0K(r4, r3)
            if (r0 == 0) goto L_0x001a
            com.instagram.common.session.UserSession r0 = r11.A0F
            X.OC6 r0 = X.C70166NyK.A00(r0)
            X.02m r2 = r0.A00
            r1 = 145755797(0x8b00e95, float:1.0596043E-33)
            java.lang.String r0 = "BANYAN_FETCH_START"
            r2.markerPoint(r1, r0)
        L_0x001a:
            X.5gJ r8 = r11.A0A
            r9 = 77014026(0x497240a, float:3.5533026E-36)
            r0 = 0
            if (r8 == 0) goto L_0x0027
            X.02m r1 = r8.A00
            r1.markerStart(r9)
        L_0x0027:
            X.5g5 r7 = r10.A01(r4)
            boolean r1 = X.0qQ.A0K(r4, r3)
            if (r1 == 0) goto L_0x0041
            com.instagram.common.session.UserSession r1 = r11.A0F
            X.OC6 r1 = X.C70166NyK.A00(r1)
            X.02m r5 = r1.A00
            r2 = 145755797(0x8b00e95, float:1.0596043E-33)
            java.lang.String r1 = "BANYAN_FETCH_FINISH"
            r5.markerPoint(r2, r1)
        L_0x0041:
            java.lang.String r6 = r7.A01
            if (r6 == 0) goto L_0x00aa
            if (r8 == 0) goto L_0x0058
            java.util.List r1 = r7.A02
            int r1 = r1.size()
            r8.A00(r9, r6, r4, r1)
        L_0x0050:
            r2 = 77017147(0x497303b, float:3.5544222E-36)
            X.02m r1 = r8.A00
            r1.markerStart(r2)
        L_0x0058:
            java.util.List r1 = r7.A02
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.collections.List<T of com.instagram.direct.search.provider.InteropProviderDelegateImpl>"
            X.0qQ.A0C(r1, r5)
            r11.A08 = r1
            r11.A06 = r6
            java.lang.String r1 = "direct_ibc_nullstate"
            X.5g5 r2 = r10.A01(r1)
            boolean r1 = r11.A0K
            if (r1 == 0) goto L_0x00a8
            java.util.List r1 = r2.A02
            X.0qQ.A0C(r1, r5)
        L_0x0072:
            r11.A0C = r1
            java.lang.String r1 = r2.A01
            r11.A05 = r1
            boolean r2 = r11.A0J
            if (r2 == 0) goto L_0x00a6
            X.9B2 r1 = r11.A02
            java.util.ArrayList r1 = r1.A01()
            X.0qQ.A0C(r1, r5)
        L_0x0085:
            r11.A0B = r1
            if (r2 == 0) goto L_0x00a4
            X.9B2 r2 = r11.A02
            com.instagram.model.direct.DirectShareTarget r1 = r2.A00()
            if (r1 == 0) goto L_0x00a4
            com.instagram.model.direct.DirectShareTarget r2 = r2.A00()
            java.lang.String r1 = "null cannot be cast to non-null type T of com.instagram.direct.search.provider.InteropProviderDelegateImpl"
            X.0qQ.A0C(r2, r1)
        L_0x009a:
            r11.A04 = r2
            boolean r1 = r11.A0L
            if (r1 == 0) goto L_0x00b6
            X.9B2 r1 = r11.A02
            monitor-enter(r1)
            goto L_0x00ad
        L_0x00a4:
            r2 = r0
            goto L_0x009a
        L_0x00a6:
            r1 = r0
            goto L_0x0085
        L_0x00a8:
            r1 = r0
            goto L_0x0072
        L_0x00aa:
            if (r8 == 0) goto L_0x0058
            goto L_0x0050
        L_0x00ad:
            X.9B4 r0 = r1.A00     // Catch:{ all -> 0x00b2 }
            com.google.common.collect.ImmutableList r0 = r0.A01     // Catch:{ all -> 0x00b2 }
            goto L_0x00b5
        L_0x00b2:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        L_0x00b5:
            monitor-exit(r1)
        L_0x00b6:
            r11.A0D = r0
            r0 = 1
            r11.A09 = r0
            r11.A03 = r10
            boolean r0 = X.0qQ.A0K(r4, r3)
            if (r0 == 0) goto L_0x00d3
            com.instagram.common.session.UserSession r0 = r11.A0F
            X.OC6 r0 = X.C70166NyK.A00(r0)
            X.02m r2 = r0.A00
            r1 = 145755797(0x8b00e95, float:1.0596043E-33)
            java.lang.String r0 = "BANYAN_PROCESSING_FINISH"
            r2.markerPoint(r1, r0)
        L_0x00d3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.OWV.A00(X.5fe, X.OWV):void");
    }

    public final /* bridge */ /* synthetic */ List A01(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str) {
        List A012;
        0sn r5 = (List) obj2;
        List list = (List) obj3;
        List list2 = (List) obj4;
        List list3 = (List) obj5;
        Context context = this.A0E;
        UserSession userSession = this.A0F;
        if (r5 == null) {
            r5 = 0sn.A00;
        }
        ArrayList A013 = C46503Dg6.A01(context, userSession, r5);
        if (list != null && !list.isEmpty()) {
            A013.addAll(O0E.A00(userSession, list));
        }
        if (list2 != null && !list2.isEmpty()) {
            A013.addAll(list2);
        }
        if (list3 != null && !list3.isEmpty()) {
            A013.addAll(list3);
        }
        C49888FBo fBo = (C49888FBo) obj;
        if (fBo == null || (A012 = fBo.A01(A013, str)) == null) {
            return A013;
        }
        return A012;
    }

    public final void A02(int i, int i2, long j) {
        this.A0G.A00(this.A00, i, i2, j);
    }

    public OWV(Context context, UserSession userSession, Oy6 oy6, String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        C290645fe r0;
        C51972G9s.A1D(str, str2);
        0qQ.A0B(oy6, 10);
        this.A0E = context;
        this.A0F = userSession;
        this.A0H = str;
        this.A0I = str2;
        this.A0K = z2;
        this.A0J = z3;
        this.A0L = z4;
        this.A0G = oy6;
        this.A00 = str.equals("direct_user_search_nullstate") ? 0 : AnonymousClass972.MUTABLE_FLAG_MASK;
        if (!z) {
            r0 = C290635fd.A00(userSession);
        } else {
            r0 = null;
        }
        this.A03 = r0;
        this.A02 = (AnonymousClass9B2) userSession.A01(AnonymousClass9B2.class, new C377199Kx(userSession, 39));
        this.A0A = C290965gI.A00(userSession);
    }
}
