package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.MlE  reason: case insensitive filesystem */
public final class C67279MlE implements 27S, C376339Hp {
    public final C66633Ma2 A00;

    public C67279MlE(C66633Ma2 ma2) {
        0qQ.A0B(ma2, 1);
        this.A00 = ma2;
    }

    private final boolean A00(String str) {
        2EN C3d;
        C66633Ma2 ma2 = this.A00;
        0qQ.A0B(str, 0);
        AnonymousClass3U9 A0N = ma2.A0v().A0N(str);
        if (A0N == null || (C3d = A0N.C3d()) == 2EN.A06 || C3d == 2EN.A07 || C3d == ma2.A0t().A01) {
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ boolean A72(Object obj) {
        AnonymousClass3EK r5 = (AnonymousClass3EK) obj;
        0qQ.A0B(r5, 0);
        C66633Ma2 ma2 = this.A00;
        AnonymousClass2ZV activity = ma2.A1J.getActivity();
        if (((activity instanceof AnonymousClass2ZV) && activity.CXf()) || !RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING.equals(r5.A00) || !0qQ.A0K(ma2.A0p().A06, r5.A01) || A00(AnonymousClass7QG.A01("thread_id:", r5.A02))) {
            return false;
        }
        r5.A04 = "user in inbox shown";
        r5.A03 = 1001;
        return true;
    }

    public final boolean Es6(String str) {
        return A00(str);
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-578562676);
        AnonymousClass0fD.A0A(-610445799, AnonymousClass0fD.A03(95550418));
        AnonymousClass0fD.A0A(432297883, A03);
    }
}
