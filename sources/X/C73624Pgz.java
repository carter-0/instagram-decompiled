package X;

import com.instagram.infocenter.intf.InfoCenterShareInfoIntf;
import com.instagram.infocenter.model.ShareInfo;

/* renamed from: X.Pgz  reason: case insensitive filesystem */
public final /* synthetic */ class C73624Pgz extends 03J implements 0sL {
    public static final C73624Pgz A00 = new C73624Pgz();

    public C73624Pgz() {
        super(2, C71043OaL.class, "generateInfoCenterShareUrl", "generateInfoCenterShareUrl(Lcom/instagram/infocenter/intf/InfoCenterShareInfoIntf;Lcom/instagram/direct/deeplinking/Environment;)Ljava/lang/String;", 1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        InfoCenterShareInfoIntf infoCenterShareInfoIntf = (InfoCenterShareInfoIntf) obj;
        AnonymousClass7TG.A1N(infoCenterShareInfoIntf, obj2);
        return ((ShareInfo) infoCenterShareInfoIntf).A07;
    }
}
