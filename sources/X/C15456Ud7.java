package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Ud7  reason: case insensitive filesystem */
public final class C15456Ud7 extends C331047Ph {
    public Reel A00;
    public C255773uh A01;
    public String A02;
    public final List A03 = new ArrayList();
    public final AnonymousClass2s2 A04;
    public final C251033mS A05;
    public final C250993mO A06;
    public final C14632Tze A07;
    public final C229122ms A08;
    public final C231762sK A09;
    public final boolean A0A;

    /* JADX WARNING: type inference failed for: r1v0, types: [X.2s2, java.lang.Object] */
    public C15456Ud7(Context context, AnonymousClass0iw r6, UserSession userSession, X9R x9r, C229122ms r9) {
        C14632Tze tze = new C14632Tze(context, r6, userSession, x9r);
        this.A07 = tze;
        C231762sK r2 = new C231762sK(context);
        this.A09 = r2;
        ? obj = new Object();
        this.A04 = obj;
        this.A08 = r9;
        this.A0A = DbV.A1Y(userSession);
        this.A05 = C251033mS.A00(userSession);
        C250993mO A012 = C250993mO.A01(userSession);
        0qQ.A07(A012);
        this.A06 = A012;
        C13990Tnq.A1I(this, tze, r2, obj, JTR.A05(context));
    }

    public static final void A00(C15456Ud7 ud7) {
        ud7.A06();
        AnonymousClass2s2 r4 = ud7.A04;
        ud7.A08(r4, (Object) null);
        Iterator it = ud7.A03.iterator();
        while (true) {
            boolean z = true;
            if (it.hasNext()) {
                DUC duc = (DUC) it.next();
                User CCd = duc.CCd();
                if (CCd != null) {
                    Reel reel = ud7.A00;
                    C255773uh r7 = ud7.A01;
                    if (r7 != null) {
                        if (!ud7.A0A || !ud7.A06.A0C(ud7.A05, CCd)) {
                            z = false;
                        }
                        C14631Tzd tzd = new C14631Tzd(reel, r7, CCd, z);
                        tzd.A08 = ud7.A02;
                        if (duc.Abv() != null) {
                            C255773uh r0 = ud7.A01;
                            0qQ.A0A(r0);
                            C19471WaJ A012 = C265894Ws.A01(r0);
                            if (A012 != null) {
                                List list = A012.A02.A0C;
                                if (list != null) {
                                    Object obj = list.get(JTP.A09(duc.Abv()));
                                    0qQ.A0A(obj);
                                    C21026XAf xAf = (C21026XAf) obj;
                                    0qQ.A0B(xAf, 0);
                                    String text = xAf.getText();
                                    if (text == null || text.length() > 1000) {
                                        text = "";
                                    }
                                    tzd.A07 = text;
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        }
                        ud7.A08(ud7.A07, tzd);
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else {
                C229122ms r1 = ud7.A08;
                if (r1 != null && r1.CKB()) {
                    ud7.A08(ud7.A09, r1);
                }
                ud7.A08(r4, (Object) null);
                ud7.A07();
                return;
            }
        }
    }
}
