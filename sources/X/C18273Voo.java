package X;

import android.content.res.Resources;
import java.util.List;

/* renamed from: X.Voo  reason: case insensitive filesystem */
public abstract class C18273Voo {
    /* JADX WARNING: type inference failed for: r0v6, types: [X.Urm, X.Vrk] */
    public static C16284Urm A00(Resources resources, C17673Vc4 vc4, int i, int i2) {
        int i3;
        Object[] A1Z;
        String string;
        String str = vc4.A00.A00;
        String str2 = vc4.A03;
        if (i == -1) {
            string = null;
        } else {
            if (i2 == -1) {
                i3 = 2131974585;
                A1Z = AnonymousClass7TF.A1b(i);
            } else {
                i3 = 2131974584;
                A1Z = C51968G9o.A1Z(Integer.valueOf(i), i2);
            }
            string = resources.getString(i3, A1Z);
        }
        ? vrk = new C18441Vrk(C16524UwT.QUESTION, str2);
        vrk.A01 = string;
        vrk.A00 = str;
        return vrk;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.V3o, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v1, types: [X.Urp, X.Vrk] */
    public static void A01(C17673Vc4 vc4, C17443VVw vVw, List list, boolean z) {
        C16289Urr urr;
        Object vrk;
        String str = vVw.A01.A00;
        int i = vVw.A00;
        String str2 = vVw.A02;
        ? obj = new Object();
        obj.A00 = i;
        obj.A02 = str2;
        obj.A01 = str;
        if (z) {
            urr = new C16289Urr(obj, C16524UwT.RADIOWRITEIN, vc4.A03);
        } else {
            ? vrk2 = new C18441Vrk(C16524UwT.RADIO, vc4.A03);
            vrk2.A00 = obj;
            urr = vrk2;
        }
        list.add(urr);
        if (z) {
            vrk = new C16285Urn();
        } else {
            vrk = new C18441Vrk(C16524UwT.DIVIDER, vc4.A03);
        }
        list.add(vrk);
    }
}
