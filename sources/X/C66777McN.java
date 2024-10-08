package X;

import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.McN  reason: case insensitive filesystem */
public final class C66777McN implements AnonymousClass0lh {
    public C74442Pux A00;
    public String A01;
    public boolean A02;
    public boolean A03;
    public final 1Ng A04;
    public final UserSession A05;
    public final 0xa A06;
    public final Map A07 = AnonymousClass7TE.A1E();
    public final 0ng A08;

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: X.Mq3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: X.Mq3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: X.Mq3} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: X.Mq3} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C67569Mq3 A02(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 0
            X.0qQ.A0B(r6, r0)
            r4 = 0
            java.lang.String r0 = "This operation must be run on UI thread."
            X.11Z.A06(r0)
            int r0 = r6.length()
            if (r0 == 0) goto L_0x0036
            java.util.Locale r0 = X.AnonymousClass1Q2.A02()
            java.lang.String r3 = X.DbT.A12(r0, r6)
            java.util.Map r0 = r5.A07
            java.util.Iterator r2 = X.AnonymousClass7TF.A0v(r0)
        L_0x001e:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0034
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.Mq3 r0 = (X.C67569Mq3) r0
            java.lang.String r0 = r0.A03
            boolean r0 = X.0qQ.A0K(r0, r3)
            if (r0 == 0) goto L_0x001e
            r4 = r1
        L_0x0034:
            X.Mq3 r4 = (X.C67569Mq3) r4
        L_0x0036:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C66777McN.A02(java.lang.String):X.Mq3");
    }

    public final ArrayList A03(String str) {
        C67569Mq3 mq3 = null;
        11Z.A06("This operation must be run on UI thread.");
        ArrayList A1C = AnonymousClass7TE.A1C();
        String A12 = DbT.A12(AnonymousClass1Q2.A02(), str);
        11Z.A06("This operation must be run on UI thread.");
        if (!(A02(A12) == null || (mq3 = A02(A12)) == null)) {
            A1C.add(mq3);
        }
        if (A12.length() >= 5) {
            Iterator A0v = AnonymousClass7TF.A0v(this.A07);
            while (A0v.hasNext()) {
                C67569Mq3 mq32 = (C67569Mq3) A0v.next();
                String str2 = mq32.A02;
                if (str2 != null && 00l.A0d(C66582MXn.A0w(str2), A12, false) && !mq32.equals(mq3)) {
                    A1C.add(mq32);
                }
            }
        }
        return A1C;
    }

    public static final void A00(C66777McN mcN) {
        ArrayList A0e = Dba.A0e(mcN.A07);
        String str = mcN.A01;
        ArrayList A1D = AnonymousClass7TE.A1D(A0e);
        try {
            StringWriter A0v = JTO.A0v();
            17W A0K = AnonymousClass7TF.A0K(A0v);
            if (str != null) {
                A0K.A0R("modification_token", str);
            }
            16P.A03(A0K, "quick_replies");
            Iterator it = A1D.iterator();
            while (it.hasNext()) {
                C67569Mq3 mq3 = (C67569Mq3) it.next();
                if (mq3 != null) {
                    A0K.A0c();
                    String str2 = mq3.A03;
                    if (str2 != null) {
                        A0K.A0R("shortcut", str2);
                    }
                    String str3 = mq3.A02;
                    if (str3 != null) {
                        A0K.A0R("text", str3);
                    }
                    String str4 = mq3.A01;
                    if (str4 != null) {
                        A0K.A0R("uuid", str4);
                    }
                    Integer num = mq3.A00;
                    if (num != null) {
                        A0K.A0P("label", C69999Nvd.A00(num));
                    }
                    A0K.A0Z();
                }
            }
            A0K.A0Y();
            String A0k = AnonymousClass7TG.A0k(A0K, A0v);
            0xY AR4 = mcN.A06.AR4();
            AR4.E5g("quickRepliesCollection", A0k);
            AR4.apply();
            mcN.A04.A00(new C67583MqH());
        } catch (IOException e) {
            0wb.A05("quick_replies_serialization", "failed to serialize", 1, e);
        }
    }

    public static final void A01(C66777McN mcN, List list) {
        Map map = mcN.A07;
        map.clear();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C67569Mq3 mq3 = (C67569Mq3) it.next();
            String A002 = mq3.A00();
            if (A002 != null) {
                map.put(A002, mq3);
            }
        }
    }

    public final List A04() {
        11Z.A06("This operation must be run on UI thread.");
        ArrayList A0e = Dba.A0e(this.A07);
        01V.A1D(A0e, AnonymousClass7QA.A00);
        return C51966G9m.A1J(A0e);
    }

    public final void A05() {
        11Z.A06("This operation must be run on UI thread.");
        0nY.A00().ATE(this.A08);
    }

    public final void onSessionWillEnd() {
        this.A05.A03(C66777McN.class);
    }

    public C66777McN(1Ng r2, UserSession userSession, 0xa r4) {
        AnonymousClass7TG.A1O(userSession, r2);
        this.A06 = r4;
        this.A05 = userSession;
        this.A04 = r2;
        this.A01 = "";
        this.A08 = new C67493Mon(this);
    }
}
