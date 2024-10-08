package X;

import com.instagram.realtimeclient.RealtimeConstants;

/* renamed from: X.Ot7  reason: case insensitive filesystem */
public final class C71923Ot7 implements 1wn {
    public final /* synthetic */ C69106Nel A00;

    public C71923Ot7(C69106Nel nel) {
        this.A00 = nel;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        String str;
        int A03 = AnonymousClass0fD.A03(-1620630703);
        int A032 = AnonymousClass0fD.A03(-852195678);
        0xE r4 = new 0xE();
        C69106Nel nel = this.A00;
        if (182.A06(0Tu.A05, nel.A0B, 36310327830315026L)) {
            str = RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
        } else {
            str = "story";
        }
        r4.A04(str);
        nel.A0C.A00(new IX1(str, (String) null, nel.A08, true));
        AnonymousClass0fD.A0A(-2015332841, A032);
        AnonymousClass0fD.A0A(1627322765, A03);
    }
}
