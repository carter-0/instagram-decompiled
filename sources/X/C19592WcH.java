package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductArEffectMetadata;
import com.instagram.user.model.Product;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.WcH  reason: case insensitive filesystem */
public final class C19592WcH implements C20969X6w {
    public final /* synthetic */ C18021Vjx A00;
    public final /* synthetic */ Product A01;

    public C19592WcH(C18021Vjx vjx, Product product) {
        this.A00 = vjx;
        this.A01 = product;
    }

    public final void DED() {
        X9C x9c = this.A00.A07;
        W2j A002 = W2j.A00(x9c);
        C18502Vsx vsx = x9c.Bz5().A02;
        C16605Uxz uxz = vsx.A03;
        boolean z = vsx.A06;
        C16605Uxz uxz2 = vsx.A00;
        C16605Uxz uxz3 = vsx.A04;
        C16605Uxz uxz4 = vsx.A05;
        A002.A02 = new C18502Vsx(uxz2, C16605Uxz.FAILED, vsx.A02, uxz, uxz3, uxz4, z);
        C18588Vuf.A00(x9c, A002);
    }

    public final void DoY(C15240UXa uXa) {
        ProductArEffectMetadata productArEffectMetadata;
        String str;
        C18021Vjx vjx = this.A00;
        UserSession userSession = vjx.A01;
        C15240UXa uXa2 = uXa;
        ArrayList A02 = C45894D9x.A02(userSession, C51966G9m.A1J(uXa2.A01));
        C45402Cvi cvi = uXa2.A00;
        C16276Urd urd = null;
        if (!(cvi == null || (productArEffectMetadata = cvi.A00) == null || (str = productArEffectMetadata.A03) == null)) {
            urd = C45894D9x.A00(cvi, str);
        }
        X9C x9c = vjx.A07;
        W2j A002 = W2j.A00(x9c);
        C18502Vsx vsx = x9c.Bz5().A02;
        C16605Uxz uxz = vsx.A03;
        boolean z = vsx.A06;
        C16605Uxz uxz2 = vsx.A00;
        C16605Uxz uxz3 = vsx.A04;
        C16605Uxz uxz4 = vsx.A05;
        A002.A02 = new C18502Vsx(uxz2, C16605Uxz.LOADED, vsx.A02, uxz, uxz3, uxz4, z);
        W1L w1l = x9c.Bz5().A04;
        HashMap hashMap = new HashMap();
        Uw7 uw7 = w1l.A01;
        1Xj r12 = w1l.A00;
        hashMap.putAll(w1l.A05);
        Integer num = w1l.A03;
        Map map = w1l.A04;
        Product product = this.A01;
        hashMap.put(W1L.A00(userSession, product), A02);
        A002.A04 = new W1L(r12, uw7, urd, num, map, hashMap);
        C18588Vuf.A00(x9c, A002);
        W03 w03 = vjx.A03;
        if (w03 != null) {
            w03.A02(product, A02.size());
        }
    }
}
