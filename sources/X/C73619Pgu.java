package X;

import com.instagram.direct.model.DirectAREffectShare;

/* renamed from: X.Pgu  reason: case insensitive filesystem */
public final /* synthetic */ class C73619Pgu extends 03J implements 0sL {
    public static final C73619Pgu A00 = new C73619Pgu();

    public C73619Pgu() {
        super(2, C71043OaL.class, "generateArEffectUrl", "generateArEffectUrl(Lcom/instagram/direct/model/DirectAREffectShare;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        DirectAREffectShare directAREffectShare = (DirectAREffectShare) obj;
        AnonymousClass7TG.A1N(directAREffectShare, obj2);
        return 002.A0R("https://www.instagram.com/ar/", directAREffectShare.A02());
    }
}
