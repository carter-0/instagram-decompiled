package X;

import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.refresh.RefreshableListView;

/* renamed from: X.SbN  reason: case insensitive filesystem */
public final class C11500SbN implements View.OnLayoutChangeListener {
    public final /* synthetic */ C257773xw A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ C15383Ubh A02;
    public final /* synthetic */ String A03;

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        View childAt;
        boolean z;
        String str;
        Boolean BuS;
        0qQ.A0B(view, 0);
        C15383Ubh ubh = this.A02;
        RefreshableListView refreshableListView = ubh.A0D;
        if (refreshableListView != null && refreshableListView.getChildCount() >= 3 && (childAt = refreshableListView.getChildAt(3)) != null) {
            int bottom = childAt.getBottom();
            int A08 = 0nA.A08(ubh.getRootActivity());
            refreshableListView.removeOnLayoutChangeListener(this);
            float f = ((float) (A08 - bottom)) / (((float) A08) * 1.0f);
            C257773xw r0 = this.A00;
            if (r0 == null || (BuS = r0.BuS()) == null) {
                z = false;
            } else {
                z = BuS.booleanValue();
            }
            1Xj r4 = this.A01;
            String str2 = this.A03;
            Us5 us5 = new Us5(r4, ubh, str2);
            T8H t8h = new T8H(r4, ubh);
            T8I t8i = new T8I(1, r4, ubh);
            C249763kK r9 = ubh.A0E;
            if (r9 == null) {
                str = "sessionIdProvider";
            } else {
                String sessionId = r9.getSessionId();
                UserSession A012 = C15383Ubh.A01(ubh);
                AnonymousClass4DU r14 = ubh.A0M;
                String str3 = ubh.A0F;
                str = "adId";
                if (str3 != null) {
                    S6e s6e = new S6e(r14, A012, str3, sessionId, "pbia_and_browse");
                    s6e.A00(f);
                    SUL sul = new SUL(ubh.requireActivity(), C15383Ubh.A01(ubh), 2EG.A2o, str2, false);
                    String str4 = ubh.A0F;
                    if (str4 != null) {
                        sul.A0B(str4);
                        sul.A0C(ubh.A0G);
                        sul.A0D(C231122qu.A06(C15383Ubh.A01(ubh), r4));
                        sul.A1L.A00.putString("TrackingInfo.ARG_CALLSITE_SESSION_ID", sessionId);
                        sul.A0z = true;
                        sul.A03 = f;
                        sul.A14 = z;
                        sul.A1B = !z;
                        sul.A0d = true;
                        sul.A11 = true;
                        sul.A18 = true;
                        sul.A19 = true;
                        sul.A0J = us5;
                        sul.A0H = t8h;
                        sul.A0I = t8i;
                        sul.A0K = s6e;
                        sul.A1C = true;
                        UserSession A013 = C15383Ubh.A01(ubh);
                        0Tu r42 = 0Tu.A06;
                        sul.A00 = 182.A00(r42, A013, 37163273976021264L);
                        sul.A0G(182.A06(r42, C15383Ubh.A01(ubh), 36318849045961218L));
                        sul.A17 = true;
                        if (182.A06(r42, C15383Ubh.A01(ubh), 36318849046026755L)) {
                            sul.A0c = false;
                            sul.A0k = true;
                            sul.A01 = 0.2f;
                            sul.A0f = true;
                            sul.A0F = new C19677Wdf(1);
                            sul.A0i = true;
                            sul.A16 = true;
                            sul.A15 = true;
                            sul.A1A = true;
                        }
                        String str5 = ubh.A0H;
                        if (str5 != null) {
                            sul.A0E(str5);
                        }
                        sul.A0A();
                        ubh.A0I = true;
                        return;
                    }
                }
            }
            0qQ.A0F(str);
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public C11500SbN(C257773xw r1, 1Xj r2, C15383Ubh ubh, String str) {
        this.A02 = ubh;
        this.A00 = r1;
        this.A03 = str;
        this.A01 = r2;
    }
}
