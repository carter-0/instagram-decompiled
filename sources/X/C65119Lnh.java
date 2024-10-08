package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.io.IOException;

/* renamed from: X.Lnh  reason: case insensitive filesystem */
public final class C65119Lnh implements C66478MTg {
    public final /* synthetic */ C59767JXi A00;
    public final /* synthetic */ AnonymousClass51R A01;

    public final void Dob(File file) {
        0qQ.A0B(file, 0);
        C59767JXi jXi = this.A00;
        C59767JXi.A04(C63160KsT.A00((MediaComposition) null, this.A01, jXi.A0X.A02, JTP.A0t(file)), jXi);
    }

    public C65119Lnh(C59767JXi jXi, AnonymousClass51R r2) {
        this.A00 = jXi;
        this.A01 = r2;
    }

    public final void DEa(IOException iOException) {
        C59767JXi jXi = this.A00;
        C64169LRs.A02(jXi.A0L, AnonymousClass05K.A0j, AnonymousClass000.A00(948), 2131955554);
        C59767JXi.A0B(jXi, false);
    }
}
