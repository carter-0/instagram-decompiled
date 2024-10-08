package X;

import com.google.common.collect.ImmutableList;
import com.instagram.creator.inspiration.repository.graphql.GetCreatorInspirationHubQueryResponseImpl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

public final class II1 implements AnonymousClass2Kv {
    public final /* synthetic */ C56079HsS A00;
    public final /* synthetic */ Map A01;
    public final /* synthetic */ 0rk A02;
    public final /* synthetic */ 0rk A03;
    public final /* synthetic */ C252683pV A04;

    public II1(C56079HsS hsS, Map map, 0rk r3, 0rk r4, C252683pV r5) {
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A00 = hsS;
        this.A01 = map;
    }

    public final void invoke(AnonymousClass3JD r9) {
        GetCreatorInspirationHubQueryResponseImpl getCreatorInspirationHubQueryResponseImpl;
        int i;
        C250663lr r3;
        GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub A0E;
        ImmutableList A0E2;
        GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub A0E3;
        ImmutableList A0F;
        GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub A0E4;
        ImmutableList A0E5;
        String str = null;
        if (r9 != null) {
            getCreatorInspirationHubQueryResponseImpl = (GetCreatorInspirationHubQueryResponseImpl) r9.Bny();
        } else {
            getCreatorInspirationHubQueryResponseImpl = null;
        }
        0rk r5 = this.A02;
        if (getCreatorInspirationHubQueryResponseImpl == null || (A0E4 = getCreatorInspirationHubQueryResponseImpl.A0E()) == null || (A0E5 = A0E4.A0E()) == null) {
            i = 0;
        } else {
            i = A0E5.size();
        }
        r5.A00 = i;
        if (i != 0) {
            if (getCreatorInspirationHubQueryResponseImpl == null || (A0E = getCreatorInspirationHubQueryResponseImpl.A0E()) == null || (A0E2 = A0E.A0E()) == null) {
                r3 = null;
            } else {
                r3 = (C250663lr) 00k.A0L(A0E2);
            }
            Map map = this.A01;
            if (r3 != null) {
                str = C41847B3o.A1A(r3, "section_id", 2);
            }
            N4R n4r = (N4R) map.get(str);
            if (n4r != null) {
                n4r.A00 = r3;
            }
        } else if (!(getCreatorInspirationHubQueryResponseImpl == null || (A0E3 = getCreatorInspirationHubQueryResponseImpl.A0E()) == null || (A0F = A0E3.A0F()) == null)) {
            Map map2 = this.A01;
            ArrayList A0r = AnonymousClass7TG.A0r(A0F);
            Iterator it = A0F.iterator();
            while (it.hasNext()) {
                GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.Sections sections = (GetCreatorInspirationHubQueryResponseImpl.XdtAsyncGetCreatorInspirationHub.Sections) it.next();
                map2.put(C41847B3o.A1A(sections, "section_id", 2), new N4R(sections));
                A0r.add(C60340gF.A00);
            }
        }
        0rk r2 = this.A03;
        int i2 = r2.A00;
        if (i2 < r5.A00) {
            r2.A00 = i2 + 1;
            this.A04.FIG(getCreatorInspirationHubQueryResponseImpl);
            return;
        }
        this.A00.A00();
        19E.A04("Streaming termination response received", this.A04);
    }
}
