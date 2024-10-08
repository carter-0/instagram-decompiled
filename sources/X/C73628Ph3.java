package X;

/* renamed from: X.Ph3  reason: case insensitive filesystem */
public final /* synthetic */ class C73628Ph3 extends 03J implements 0sL {
    public static final C73628Ph3 A00 = new C73628Ph3();

    public C73628Ph3() {
        super(2, C71043OaL.class, "generateFbPayReferralUrl", "generateFbPayReferralUrl(Lcom/instagram/direct/model/DirectFbPayReferralShare;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        N49 n49 = (N49) obj;
        AnonymousClass7TG.A1N(n49, obj2);
        return 002.A0u("https://www.instagram.com/_n/fbpay_referral_details?referral_id=", n49.A00, "&sender_id=", n49.A01);
    }
}
