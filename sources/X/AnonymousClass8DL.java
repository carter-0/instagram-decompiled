package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;
import java.util.Arrays;
import java.util.List;
import java.util.Set;

/* renamed from: X.8DL  reason: invalid class name */
public final class AnonymousClass8DL implements AnonymousClass8DM {
    public final Context A00;
    public final AnonymousClass876 A01;
    public final AnonymousClass8DI A02;
    public final AnonymousClass8DF A03;
    public final UserSession A04;
    public final AnonymousClass871 A05 = new AnonymousClass8DP(this);
    public final AnonymousClass8DS A06;
    public final AnonymousClass8DT A07;
    public final AnonymousClass8DO A08 = new AnonymousClass8DN(this);
    public final AnonymousClass0eK A09;

    public AnonymousClass8DL(Context context, AnonymousClass0iw r9, UserSession userSession, C357638Yz r11, AnonymousClass8DI r12, AnonymousClass8DF r13, String str, AnonymousClass0eK r15) {
        AnonymousClass8DS r4;
        UserSession userSession2 = userSession;
        this.A04 = userSession;
        Context context2 = context;
        this.A00 = context;
        this.A03 = r13;
        this.A02 = r12;
        this.A09 = r15;
        this.A01 = new AnonymousClass876(context, r9, userSession, new AnonymousClass8DQ(this));
        String str2 = str;
        if ("post_capture".equals(str)) {
            r4 = new C366338oi(context);
        } else if (r11 != null) {
            r4 = new AnonymousClass8DR(context, userSession, r11);
        } else {
            throw new IllegalStateException("Required value was null.");
        }
        AnonymousClass8DS r42 = r4;
        this.A06 = r42;
        this.A07 = new AnonymousClass8DT(context2, userSession2, r42, str2, false);
    }

    public final int B0W(AnonymousClass87G r2) {
        0qQ.A0B(r2, 0);
        int indexOf = this.A01.A08.indexOf(r2);
        if (indexOf < 0) {
            return AnonymousClass972.MUTABLE_FLAG_MASK;
        }
        return indexOf;
    }

    public final int B0X(String str) {
        0qQ.A0B(str, 0);
        return this.A01.A00(str);
    }

    public final void Cmz() {
    }

    public final void EBJ() {
    }

    public final void EI0() {
    }

    public final void EOe(boolean z) {
    }

    public final void EUK(boolean z) {
    }

    public final void EUw(List list) {
        0qQ.A0B(list, 0);
        this.A01.A06(list);
        A00();
        ((C3508386o) this.A09.get()).FLO();
    }

    public final void EeZ(C64998Llb llb) {
    }

    public final void EpC(C355948Rz r1) {
    }

    public final void EwC(AnonymousClass87G r1) {
    }

    private final void A00() {
        AnonymousClass876 r2 = this.A01;
        AnonymousClass8DT r1 = this.A07;
        r2.A04 = r1;
        C342277oK r0 = r2.A02;
        if (r0 != null) {
            r0.A00 = r1;
        }
        ((C3508386o) this.A09.get()).AIy(r2, this.A05);
    }

    public final boolean AFa() {
        return ((C3508386o) this.A09.get()).AFa();
    }

    public final void APJ() {
        AnonymousClass876 r1 = this.A01;
        r1.A05 = true;
        0fE.A00(r1, 1232124614);
    }

    public final void ARV() {
        AnonymousClass876 r1 = this.A01;
        r1.A05 = false;
        0fE.A00(r1, 525522009);
    }

    public final AnonymousClass8DO AcK() {
        return this.A08;
    }

    public final String AqZ(AnonymousClass87G r3) {
        String string;
        AnonymousClass87I r0 = r3.A04;
        if (r0 == null) {
            r0 = AnonymousClass87I.EMPTY;
        }
        int ordinal = r0.ordinal();
        if (ordinal == 22) {
            string = this.A00.getString(2131960861);
        } else if (ordinal == 33) {
            return this.A06.B0u();
        } else {
            string = r3.A0G;
        }
        0qQ.A07(string);
        return string;
    }

    public final AnonymousClass87G Aty() {
        return this.A01.A01();
    }

    public final AnonymousClass87G B0Q(int i) {
        return this.A01.A02(i);
    }

    public final int B0a() {
        return this.A01.getCount();
    }

    public final int B6H() {
        return ((C3508386o) this.A09.get()).B6L();
    }

    public final int BLO() {
        return ((C3508386o) this.A09.get()).BLQ();
    }

    public final AnonymousClass87G BaM() {
        AnonymousClass876 r1 = this.A01;
        return r1.A02(r1.A00);
    }

    public final int BcK() {
        return ((C3508386o) this.A09.get()).BcK();
    }

    public final C252203oj BoF() {
        return ((C3508386o) this.A09.get()).BoF();
    }

    public final AnonymousClass87G Bre() {
        AnonymousClass876 r1 = this.A01;
        return r1.A02(r1.A01);
    }

    public final int Brp() {
        return this.A01.A01;
    }

    public final float C9d() {
        View view = ((C3508386o) this.A09.get()).getView();
        if (view != null) {
            return view.getTranslationY();
        }
        return 0.0f;
    }

    public final void CLD() {
        this.A01.A07 = true;
    }

    public final void CLe() {
        AnonymousClass876 r1 = this.A01;
        r1.A06 = true;
        0fE.A00(r1, -975016333);
    }

    public final boolean CZ5() {
        return ((C3508386o) this.A09.get()).CZ5();
    }

    public final boolean CZO(int i) {
        return this.A01.A07(i);
    }

    public final void Crx(int i) {
        0fE.A00(this.A01, -577041618);
    }

    public final void Cuj(Set set) {
        AnonymousClass87G A012;
        if (!set.contains(C358088aL.A0C) && (A012 = this.A01.A01()) != null) {
            ((C3508386o) this.A09.get()).ETd(A012.A0G);
        }
    }

    public final void DDM() {
        ((C3508386o) this.A09.get()).E4E();
    }

    public final void Dke() {
        ((C3508386o) this.A09.get()).Dke();
    }

    public final boolean EDa(AnonymousClass87G r5) {
        AnonymousClass876 r3 = this.A01;
        List list = r3.A08;
        if (!list.contains(r5)) {
            return false;
        }
        list.remove(r5);
        0fE.A00(r3, -1287938786);
        return true;
    }

    public final boolean EDb(int i) {
        AnonymousClass876 r1 = this.A01;
        if (!r1.A07(i)) {
            return false;
        }
        r1.A08.remove(i);
        0fE.A00(r1, 791222157);
        return true;
    }

    public final void EEa() {
        AnonymousClass876 r1 = this.A01;
        r1.A01 = -1;
        r1.A00 = -1;
    }

    public final void EKh(int i, boolean z) {
        ((C3508386o) this.A09.get()).EKh(i, z);
    }

    public final void EUv(String str) {
        ((C3508386o) this.A09.get()).ETd(str);
    }

    public final void EXs(boolean z) {
        ((C3508386o) this.A09.get()).EXs(z);
    }

    public final void Egp(Product product) {
        ((C3508386o) this.A09.get()).Egp(product);
    }

    public final void Egv(boolean z) {
        ((C3508386o) this.A09.get()).Egv(z);
    }

    public final void EpH(float f) {
        View view = ((C3508386o) this.A09.get()).getView();
        if (view != null) {
            view.setTranslationY(f);
        }
    }

    public final void Eu0() {
        this.A01.A07 = false;
    }

    public final void Ev0() {
        AnonymousClass876 r1 = this.A01;
        r1.A06 = false;
        0fE.A00(r1, -1121325918);
    }

    public final void FL7(float f) {
        ((C3508386o) this.A09.get()).FL7(1.0f);
    }

    public final boolean isEmpty() {
        return this.A01.isEmpty();
    }

    public final void notifyDataSetChanged() {
        0fE.A00(this.A01, -1949594038);
    }

    public final void onPause() {
        ((C3508386o) this.A09.get()).onPause();
    }

    public final void onResume() {
        ((C3508386o) this.A09.get()).onResume();
    }

    public final void setVisibility(int i) {
        View view = ((C3508386o) this.A09.get()).getView();
        if (view != null) {
            view.setVisibility(i);
        }
    }

    public final void A8H(AnonymousClass87G r5, int i) {
        List asList = Arrays.asList(new AnonymousClass87G[]{r5});
        0qQ.A07(asList);
        AnonymousClass876 r2 = this.A01;
        if (!asList.isEmpty()) {
            List list = r2.A08;
            if (!list.isEmpty()) {
                i = Math.min(i, list.size() - 1);
            }
            list.addAll(i, asList);
            int i2 = r2.A01;
            if (i2 >= i) {
                r2.A01 = i2 + asList.size();
            }
            0fE.A00(r2, -1176982571);
        }
    }

    public final void DCI() {
        A00();
        ((C3508386o) this.A09.get()).E4F();
    }

    public final void EL8(String str) {
        A00();
        ((C3508386o) this.A09.get()).EL8(str);
    }

    public final void ELA(String str, int i, boolean z) {
        A00();
        AnonymousClass0eK r1 = this.A09;
        ((C3508386o) r1.get()).E4F();
        ((C3508386o) r1.get()).ELA(str, i, z);
    }
}
