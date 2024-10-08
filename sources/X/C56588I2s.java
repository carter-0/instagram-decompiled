package X;

import android.content.Context;

/* renamed from: X.I2s  reason: case insensitive filesystem */
public abstract class C56588I2s {
    public static final void A01(Context context, int i) {
        0qQ.A0B(context, 0);
        Integer valueOf = Integer.valueOf(i);
        C310346aq r2 = C310346aq.ERROR;
        String str = null;
        C310336ap A0a = DbS.A0a();
        if (valueOf != null) {
            str = context.getString(valueOf.intValue());
        }
        A0a.A0D = str;
        A0a.A0C = r2;
        Dbb.A1Q(A0a);
    }

    public static final void A02(Context context, MVB mvb, String str, String str2) {
        0qQ.A0B(str, 1);
        C310336ap A0a = DbS.A0a();
        A0a.A0D = str;
        if (str2 != null) {
            A0a.A09 = DbS.A0V(str2);
            A0a.A03();
        }
        if (mvb != null) {
            A0a.A0L = true;
            DbW.A0q(context, A0a, 2131952148);
            A0a.A0A = mvb;
        }
        Dbb.A1Q(A0a);
    }

    public static final void A00(Context context) {
        C310346aq r1 = C310346aq.ERROR;
        C310336ap A0a = DbS.A0a();
        DbS.A19(context, A0a, 2131968971);
        A0a.A0C = r1;
        Dbb.A1Q(A0a);
    }
}
