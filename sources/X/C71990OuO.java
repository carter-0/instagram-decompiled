package X;

import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.Collection;
import java.util.List;

/* renamed from: X.OuO  reason: case insensitive filesystem */
public final class C71990OuO implements Y9W {
    public final /* synthetic */ C72204OyU A00;
    public final /* synthetic */ C254743sy A01;

    public C71990OuO(C72204OyU oyU, C254743sy r2) {
        this.A00 = oyU;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj, Object obj2) {
        C61066Jw4 jw4 = (C61066Jw4) obj;
        C61066Jw4 jw42 = (C61066Jw4) obj2;
        C72204OyU oyU = this.A00;
        if (!(this.A01 instanceof MsysThreadId)) {
            return jw4;
        }
        if (!182.A06(0Tu.A05, oyU.A04, 36315984302378841L) || jw4.A02) {
            return jw4;
        }
        boolean z = false;
        boolean A1P = AnonymousClass7TF.A1P(jw42.A02 ? 1 : 0);
        if (jw4.A01 || jw42.A01) {
            z = true;
        }
        return new C61066Jw4(A1P, z, (List) 00k.A0S((Iterable) jw42.A00, (Collection) jw4.A00), 7);
    }
}
