package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

public final class E90 extends C331047Ph implements AnonymousClass7Q7 {
    public boolean A00;
    public C336947fR A01;
    public C47631EAr A02;
    public boolean A03;
    public final C14029ToV A04;
    public final Set A05 = AnonymousClass7TE.A1F();
    public final C15540UeT A06;
    public final C46450DfD A07;
    public final C46437Dez A08;
    public final C229122ms A09;
    public final C231762sK A0A;
    public final String A0B;

    public final boolean AJe(String str) {
        0qQ.A0B(str, 0);
        return this.A05.contains(str);
    }

    public final boolean isEnabled(int i) {
        return false;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.2ms] */
    public E90(Activity activity, Context context, AnonymousClass0iw r22, UserSession userSession, C14029ToV toV, X99 x99, X4C x4c, AnonymousClass32K r27, G88 g88, EEF eef, String str) {
        UserSession userSession2 = userSession;
        boolean A1Z = DbW.A1Z(userSession2);
        C14029ToV toV2 = toV;
        G88 g882 = g88;
        AnonymousClass7TF.A1E(toV2, 6, g882);
        X99 x992 = x99;
        0qQ.A0B(x992, 9);
        String str2 = str;
        0qQ.A0B(str2, 11);
        this.A04 = toV2;
        this.A09 = new Object();
        Context context2 = context;
        C231762sK r2 = new C231762sK(context2);
        this.A0A = r2;
        AnonymousClass0iw r9 = r22;
        C46450DfD dfD = new C46450DfD(context2, r9, userSession2, r27, g882, false, A1Z, A1Z);
        this.A07 = dfD;
        C15540UeT ueT = new C15540UeT(context2, r9, userSession2, x992, x4c);
        this.A06 = ueT;
        boolean A062 = 182.A06(0Tu.A05, userSession2, 36318685836614007L);
        this.A03 = A062;
        if (A062) {
            EEF eef2 = eef;
            if (eef != null) {
                this.A02 = new C47631EAr(activity, context2, (F07) null, r9, userSession2, eef2, "unknown");
                this.A01 = new C336947fR(context2);
            }
        }
        C46437Dez dez = new C46437Dez(context2);
        this.A08 = dez;
        this.A0B = str2;
        ArrayList A1D = AnonymousClass7TE.A1D(0sr.A1P(new C231632rz[]{r2, dfD, ueT, this.A02, dez, this.A01}));
        Set singleton = Collections.singleton((Object) null);
        0qQ.A07(singleton);
        0u4.A00(A1D).removeAll(singleton);
        A0A(A1D);
    }

    public final void A0C(List list) {
        List list2 = this.A04.A00;
        list2.clear();
        Set set = this.A05;
        set.clear();
        for (Object next : list) {
            if (next instanceof AnonymousClass3UM) {
                set.add(DbU.A0q((AnonymousClass3UM) next));
            }
        }
        list2.addAll(00k.A0X(list));
        this.A00 = true;
        A00(this);
    }

    public static final void A00(E90 e90) {
        C231642s0 r0;
        Class<?> cls;
        Integer valueOf;
        C231642s0 r02;
        Object obj;
        e90.A06();
        C336947fR r4 = e90.A01;
        C47631EAr eAr = e90.A02;
        if (!(!e90.A03 || eAr == null || r4 == null)) {
            e90.A09(eAr, new Object(), new F2L(AnonymousClass05K.A0Y));
            e90.A09(r4, C46448DfA.A00(2131974682), new Object());
        }
        List list = e90.A04.A00;
        if (AnonymousClass7TE.A1b(list) || !e90.A00) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj2 = list.get(i);
                if (obj2 instanceof AnonymousClass3UM) {
                    valueOf = Integer.valueOf(i);
                    r02 = e90.A07;
                } else {
                    String str = null;
                    if (obj2 instanceof C17674Vc5) {
                        C17674Vc5 vc5 = (C17674Vc5) obj2;
                        Integer A002 = C18214Vne.A00(vc5);
                        if (A002 == AnonymousClass05K.A00 || A002 == AnonymousClass05K.A01) {
                            valueOf = Integer.valueOf(i);
                            r02 = e90.A06;
                        } else {
                            String A003 = AnonymousClass000.A00(127);
                            Integer A004 = C18214Vne.A00(vc5);
                            if (A004 != null) {
                                str = VEL.A00(A004);
                            }
                            throw AnonymousClass7TF.A0W(A003, str);
                        }
                    } else {
                        if (!(obj2 == null || (cls = obj2.getClass()) == null)) {
                            str = cls.getCanonicalName();
                        }
                        throw AnonymousClass7TF.A0W("Unaccepted model type: ", str);
                    }
                }
                e90.A09(r02, obj2, valueOf);
            }
            C229122ms r2 = e90.A09;
            if (r2 != null && r2.CKB()) {
                r0 = e90.A0A;
                obj = r2;
            }
            e90.A07();
        }
        Object obj3 = e90.A0B;
        r0 = e90.A08;
        obj = obj3;
        e90.A08(r0, obj);
        e90.A07();
    }

    public final void notifyDataSetChanged() {
        A00(this);
    }
}
