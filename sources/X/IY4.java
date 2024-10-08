package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.IOException;
import java.io.StringWriter;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public final class IY4 implements C233012uo {
    public int A00;
    public 1OC A01;
    public C233072uu A02;
    public Integer A03 = AnonymousClass05K.A00;
    public boolean A04 = true;
    public boolean A05 = true;
    public C233042ur A06 = new C233032uq();
    public boolean A07;
    public final Context A08;
    public final UserSession A09;
    public final AnonymousClass4DU A0A;
    public final C233212vI A0B;
    public final C228232l0 A0C;
    public final String A0D;
    public final C55721HmI A0E;
    public final C233402vf A0F;

    public IY4(Context context, UserSession userSession, C56006HrC hrC, AnonymousClass4DU r7, C233402vf r8, C233212vI r9, C228232l0 r10, String str) {
        this.A09 = userSession;
        this.A08 = context;
        this.A0D = str;
        this.A0B = r9;
        this.A0F = r8;
        this.A0C = r10;
        this.A0A = r7;
        this.A0E = new C55721HmI(new IY0(this, hrC));
    }

    public final void A00(List list, int i) {
        String str;
        String str2;
        List list2 = list;
        0qQ.A0B(list2, 0);
        this.A06.DFK(new AnonymousClass4LN((Integer) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (String) null, (String) null, list2, false, false, false, false));
        Integer num = AnonymousClass05K.A01;
        this.A03 = num;
        UserSession userSession = this.A09;
        Context context = this.A08;
        C233072uu r0 = this.A02;
        if (r0 == null) {
            0qQ.A0F("responseCallback");
            throw AnonymousClass00P.createAndThrow();
        }
        Map Bk0 = r0.Bk0();
        boolean z = this.A04;
        String str3 = this.A0D;
        C228232l0 r9 = this.A0C;
        Bk0.getClass();
        1NY r5 = new 1NY(userSession);
        r5.A08(num);
        r5.A0A("discover/injected_chaining_explore_media/");
        r5.A0H("is_first_page", z);
        r5.A9m("chaining_session_id", str3);
        r5.A0C("ad_request_index", i);
        try {
            StringWriter stringWriter = new StringWriter();
            17W A0e = C51970G9q.A0e(stringWriter);
            Iterator A0v = AnonymousClass7TF.A0v(Bk0);
            while (A0v.hasNext()) {
                C271744jW r2 = (C271744jW) A0v.next();
                A0e.A0c();
                A0e.A0R("ad_id", r2.getId());
                A0e.A0P("position", r2.BHd());
                A0e.A0S("is_client_inserted_ad", r2.CVX());
                A0e.A0Z();
            }
            A0e.A0Y();
            A0e.close();
            str = stringWriter.toString();
        } catch (IOException e) {
            0KC.A07(C54968HZy.class, C66579MXk.A00(98), e, new Object[0]);
            str = null;
        }
        r5.AA0("inserted_ad_indices", str);
        try {
            StringWriter stringWriter2 = new StringWriter();
            17W A0e2 = C51970G9q.A0e(stringWriter2);
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                A0e2.A0t(AnonymousClass7TE.A18(it));
            }
            A0e2.A0Y();
            A0e2.close();
            str2 = stringWriter2.toString();
        } catch (IOException e2) {
            0KC.A07(C54968HZy.class, C66579MXk.A00(98), e2, new Object[0]);
            str2 = null;
        }
        r5.AA0("organic_item_ids", str2);
        r5.A0R(C54066Gyp.class, C56300HwD.class);
        Map AUH = r9.AUH("discover/injected_chaining_explore_media/");
        if (AUH != null && !AUH.isEmpty()) {
            Iterator A0u = AnonymousClass7TF.A0u(AUH);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                r5.AA0(DbT.A13(A1J), (String) A1J.getValue());
            }
        }
        r5.A0R = true;
        C51968G9o.A1C(context, r5, userSession);
        1OC A0M = r5.A0M();
        H50.A00(A0M, this.A0E, 5);
        this.A01 = A0M;
        1ES.A05(A0M, 1786782215, 2, true, true);
        this.A04 = false;
    }

    public final boolean A7L(C233632w4 r4, C233042ur r5, C233072uu r6) {
        boolean A1b = C51973G9u.A1b(r6, r5, r4);
        this.A07 = A1b;
        this.A02 = r6;
        this.A06 = r5;
        A00(r4.A03, 0);
        return A1b;
    }

    public final int BWK() {
        return 0;
    }

    public final int BfG() {
        return 0;
    }

    public final /* synthetic */ void CJE(C376459Ib r1, List list) {
    }

    public final void Cmr() {
    }

    public final void Cn7(C233632w4 r3, C238523Ce r4, boolean z) {
        0qQ.A0B(r3, 0);
        if (z) {
            1OC r0 = this.A01;
            if (r0 != null) {
                r0.cancel();
            }
            this.A01 = null;
        }
        A00(r3.A03, r3.A01);
    }

    public final void Cn9(int i) {
    }

    public final void DsJ(int i) {
    }

    public final /* synthetic */ boolean AFi() {
        return false;
    }

    public final /* synthetic */ AnonymousClass4lJ AN3() {
        return new C57364IYv();
    }

    public final /* synthetic */ String B4s() {
        return "";
    }

    public final boolean CTb() {
        return C51969G9p.A1a(this.A03, AnonymousClass05K.A00);
    }

    public final /* synthetic */ void Cmj(boolean z) {
        throw AnonymousClass7TE.A1B(AnonymousClass000.A00(110));
    }

    public final boolean D69(int i, int i2) {
        if (!this.A07) {
            return false;
        }
        if (i < this.A0E.A00 || this.A03 != AnonymousClass05K.A00) {
            return true;
        }
        A00(this.A0F.BYj(), i);
        this.A00 = i;
        return true;
    }

    public final void deactivate() {
        1OC r0 = this.A01;
        if (r0 != null) {
            r0.cancel();
        }
        this.A01 = null;
        this.A07 = false;
    }

    public final /* synthetic */ Set Bsw() {
        return AnonymousClass7TE.A1F();
    }

    public final /* synthetic */ void Cn8(AnonymousClass9J0 r1, C233632w4 r2, C238523Ce r3, String str, String str2, double d, boolean z) {
        AnonymousClass7TG.A1P(r2, r3);
        Cn7(r2, r3, z);
    }
}
