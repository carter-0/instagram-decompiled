package X;

import com.instagram.model.keyword.Keyword;
import java.util.Set;

/* renamed from: X.Wbh  reason: case insensitive filesystem */
public final class C19557Wbh implements C20918X4j {
    public final /* synthetic */ Keyword A00;
    public final /* synthetic */ C66967Mg0 A01;
    public final /* synthetic */ C14436TwK A02;
    public final /* synthetic */ String A03;

    public C19557Wbh(Keyword keyword, C66967Mg0 mg0, C14436TwK twK, String str) {
        this.A01 = mg0;
        this.A02 = twK;
        this.A00 = keyword;
        this.A03 = str;
    }

    public final void EIv() {
        if (this.A01.A0F) {
            C14417Tvm.A00(this.A02.A01).A00(this.A00);
        }
        Set<C20915X4g> set = this.A02.A05;
        String str = this.A03;
        for (C20915X4g CLV : set) {
            CLV.CLV(str);
        }
    }
}
