package X;

import android.content.Context;
import android.net.Uri;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.Llx  reason: case insensitive filesystem */
public final class C65020Llx implements MTX {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ Medium A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C357038Wf A03;

    public C65020Llx(Context context, Medium medium, UserSession userSession, C357038Wf r4) {
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = medium;
        this.A03 = r4;
    }

    public final void Dob(File file) {
        try {
            Context context = this.A00;
            UserSession userSession = this.A02;
            L0L l0l = new L0L(this.A03);
            Medium medium = this.A01;
            String str = medium.A0G.A03;
            String str2 = medium.A0N;
            long currentTimeMillis = System.currentTimeMillis();
            String absolutePath = file.getAbsolutePath();
            0qQ.A07(absolutePath);
            Medium medium2 = new Medium(Uri.fromFile(file), absolutePath, 0, 1, 0, 0, AnonymousClass7TE.A0P(currentTimeMillis), currentTimeMillis);
            medium2.A0G.A03 = str;
            medium2.A0N = str2;
            Context context2 = context;
            11Z.A02(new C65964M6b(l0l, (C352218Cl) new JYM(JTP.A0B(context), context2, medium2, userSession, AnonymousClass05K.A00).call()));
        } catch (Exception e) {
            JTP.A1U("unable to create platform sticker background input file", e);
            11Z.A02(new C65963M6a(this.A03, e));
        }
    }

    public final void onFailure(Exception exc) {
        this.A03.A00(exc);
    }
}
