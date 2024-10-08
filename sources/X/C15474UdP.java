package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.UdP  reason: case insensitive filesystem */
public final class C15474UdP extends 2Ru {
    public List A00;
    public final C47621EAh A01;
    public final C47637EAx A02;
    public final C15546Uea A03;
    public final C14338TuL A04 = new C14338TuL();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15474UdP(Context context, EtU etU, AnonymousClass0iw r12, UserSession userSession, String str, String str2) {
        super(false);
        C51974G9v.A1M(userSession, str, str2);
        C47621EAh eAh = new C47621EAh(context);
        this.A01 = eAh;
        C15546Uea uea = new C15546Uea(context, etU, r12, userSession, new VNA());
        this.A03 = uea;
        C47637EAx eAx = new C47637EAx(context, str, str2);
        this.A02 = eAx;
        this.A00 = new ArrayList();
        init(new C231642s0[]{eAx, uea, eAh});
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.V3U] */
    public final void A00() {
        String str;
        clear();
        addModel((Object) null, (Object) null, this.A02);
        int size = this.A00.size();
        for (int i = 0; i < size; i++) {
            C295745oq r2 = ((C17362VSp) this.A00.get(i)).A00;
            User user = ((C17362VSp) this.A00.get(i)).A01;
            if (!(r2 == null || user == null)) {
                VNC A002 = C16939VBr.A00(r2);
                ? obj = new Object();
                obj.A00 = A002;
                obj.A01 = user;
                C14338TuL tuL = this.A04;
                if (A002 == null || (str = AnonymousClass7TF.A0h(A002.A00)) == null) {
                    str = "";
                }
                AnonymousClass6u8 A0P = C13991Tnr.A0P(str, tuL.A00);
                boolean z = true;
                if (!(i == this.A00.size() - 1 || i == 9)) {
                    z = false;
                }
                A0P.A00(i, z);
                addModel(obj, A0P, this.A03);
            }
        }
        addModel((Object) null, (Object) null, this.A01);
        notifyDataSetChanged();
    }
}
