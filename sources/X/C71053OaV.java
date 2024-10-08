package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.OaV  reason: case insensitive filesystem */
public abstract class C71053OaV {
    public static final C3253572b A00(Context context) {
        C3253572b r1 = new C3253572b();
        r1.A02 = R.drawable.instagram_error_outline_96;
        r1.A0D = context.getString(2131959783);
        r1.A07 = context.getString(2131960354);
        r1.A0C = null;
        r1.A06 = null;
        return r1;
    }

    public static final C3253572b A01(Context context, UserSession userSession, C69375NkF nkF, C322776wO r10, boolean z) {
        int i;
        int i2;
        int i3;
        Integer valueOf;
        int i4;
        String str;
        int ordinal = nkF.ordinal();
        if (ordinal != 1) {
            if (ordinal != 2) {
                i2 = 2131959930;
                if (ordinal != 6) {
                    i2 = 2131959932;
                    if (ordinal != 4) {
                        i = 2131959969;
                        if (ordinal != 5) {
                            i = 2131959931;
                        }
                        valueOf = null;
                    } else {
                        int i5 = 2131959972;
                        if (((OTF) userSession.A01(OTF.class, new C73914Plp(userSession, 28))).A01.size() != OTF.A02.size()) {
                            i5 = 2131959970;
                        }
                        i3 = 2131959971;
                        valueOf = Integer.valueOf(i3);
                    }
                } else {
                    i4 = 2131959929;
                }
            } else {
                i2 = 2131959962;
                i4 = 2131959961;
            }
            i3 = 2131959936;
            valueOf = Integer.valueOf(i3);
        } else {
            i2 = 2131959974;
            i4 = 2131959973;
            i3 = 2131959936;
            valueOf = Integer.valueOf(i3);
        }
        int i6 = R.drawable.empty_state_direct;
        if (z) {
            i6 = R.drawable.instagram_app_messenger_outline_96;
        }
        C3253572b r2 = new C3253572b();
        r2.A02 = i6;
        r2.A0D = context.getString(i2);
        r2.A07 = context.getString(i);
        if (valueOf != null) {
            str = context.getString(valueOf.intValue());
        } else {
            str = null;
        }
        r2.A0C = str;
        if (valueOf == null) {
            r10 = null;
        }
        r2.A06 = r10;
        r2.A0L = true;
        return r2;
    }

    public static final C3253572b A02(Context context, UserSession userSession, C70940OSn oSn) {
        C3253572b r2 = new C3253572b();
        r2.A02 = R.drawable.instagram_error_outline_96;
        r2.A0D = context.getString(2131959783);
        r2.A07 = context.getString(2131959987);
        r2.A0C = context.getString(2131959986);
        r2.A06 = new C72965PQx(0, userSession, oSn);
        return r2;
    }

    public static final C3253572b A03(Context context, C322776wO r6, boolean z, boolean z2, boolean z3) {
        Integer num;
        String str;
        int i = 2131959957;
        if (z3) {
            i = 2131959932;
        }
        if (z) {
            num = 2131959955;
        } else {
            num = null;
        }
        int i2 = R.drawable.empty_state_direct;
        if (z2) {
            i2 = R.drawable.instagram_app_messenger_outline_96;
        }
        C3253572b r2 = new C3253572b();
        r2.A02 = i2;
        r2.A0D = context.getString(i);
        r2.A07 = context.getString(2131959956);
        if (num != null) {
            str = context.getString(num.intValue());
        } else {
            str = null;
        }
        r2.A0C = str;
        if (num == null) {
            r6 = null;
        }
        r2.A06 = r6;
        r2.A0L = true;
        return r2;
    }
}
