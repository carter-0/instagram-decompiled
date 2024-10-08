package X;

import androidx.recyclerview.widget.RecyclerView;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.7Mt  reason: invalid class name and case insensitive filesystem */
public final class C330437Mt {
    public C249403jg A00;
    public RecyclerView A01;
    public ImmutableList A02;
    public AnonymousClass7BI A03;
    public OG0 A04;
    public C254743sy A05;
    public String A06;
    public String A07;
    public boolean A08;
    public final UserSession A09;
    public final AnonymousClass4D6 A0A;
    public final 2Dm A0B;
    public final Long A0C;
    public final List A0D = new ArrayList();
    public final boolean A0E;

    public final void A00() {
        List unmodifiableList;
        C254743sy r1 = this.A05;
        String str = this.A06;
        if (r1 != null && str != null && (r1 instanceof DirectThreadKey)) {
            DirectThreadKey directThreadKey = (DirectThreadKey) r1;
            2Dr r3 = this.A0B;
            0qQ.A0B(directThreadKey, 0);
            AnonymousClass48S A0P = r3.A0P(directThreadKey);
            if (A0P == null) {
                0wb.A03(C66579MXk.A00(543), AnonymousClass000.A00(226));
                return;
            }
            synchronized (A0P) {
                ArrayList arrayList = new ArrayList();
                Iterator it = A0P.A0K.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C254703su r12 = (C254703su) it.next();
                    if (0mp.A0G(r12.A0g(), str)) {
                        r12.A0H = null;
                        arrayList.add(r12);
                        break;
                    }
                }
                unmodifiableList = Collections.unmodifiableList(arrayList);
            }
            2Kb r4 = new 2Kb(A0P.A0I.BJz(), AnonymousClass05K.A0D, (List) null, AnonymousClass48S.A03((List) null, false), unmodifiableList, false);
            r3.A09.accept(r4);
            r3.A06.A00(r4);
        }
    }

    public final void A02() {
        String str;
        C254743sy r2 = this.A05;
        if (r2 != null && (str = this.A06) != null) {
            if (this.A08 && str.equals(this.A07)) {
                return;
            }
            if (r2 instanceof DirectThreadKey) {
                0qQ.A0C(r2, "null cannot be cast to non-null type com.instagram.model.direct.DirectThreadKey");
                String str2 = ((DirectThreadKey) r2).A00;
                if (str2 != null) {
                    String str3 = this.A06;
                    if (str3 != null) {
                        AnonymousClass4D6 r4 = this.A0A;
                        1NY r22 = new 1NY(this.A09, -2);
                        r22.A05();
                        r22.A0K("direct_v2/threads_message_context/%s/", new Object[]{str2});
                        r22.A9m("cursor", str3);
                        r22.A0C("limit", 20);
                        r22.A0Q(NGx.class, OQG.class);
                        1OC A0M = r22.A0M();
                        A0M.A00 = new NMB(this, str2);
                        r4.schedule(A0M);
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                return;
            }
            AnonymousClass7BI r0 = this.A03;
            if (r0 != null) {
                r0.A00.post(new PVL(r0.A01));
            }
        }
    }

    public final boolean A03() {
        if (this.A05 == null || this.A06 == null) {
            return false;
        }
        return true;
    }

    public C330437Mt(UserSession userSession, C254743sy r3, Long l, String str, List list, boolean z) {
        this.A09 = userSession;
        this.A05 = r3;
        this.A06 = str;
        this.A0C = l;
        this.A0E = z;
        this.A0B = 1bJ.A00(userSession);
        if (list != null) {
            this.A02 = ImmutableList.copyOf((Collection) list);
        }
        this.A0A = 1ES.A01();
    }

    public final void A01() {
        if (A03()) {
            A00();
            if (A04()) {
                this.A05 = null;
            }
            this.A06 = null;
            this.A02 = null;
            for (AnonymousClass7BK DNH : this.A0D) {
                DNH.DNH();
            }
        }
    }

    public final boolean A04() {
        if (!A03() || !this.A0E) {
            return false;
        }
        return true;
    }
}
