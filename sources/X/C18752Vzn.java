package X;

import android.content.Context;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.uimanager.annotations.ReactPropGroup;
import java.lang.reflect.Method;

/* renamed from: X.Vzn  reason: case insensitive filesystem */
public abstract class C18752Vzn {
    public static final ThreadLocal A04 = new C20568Wul(1);
    public static final ThreadLocal A05 = new C20568Wul(2);
    public static final ThreadLocal A06 = new C20568Wul(2);
    public static final ThreadLocal A07 = new C20568Wul(3);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final Method A03;

    public final Object A00(Context context, Object obj) {
        boolean A1a;
        double A002;
        float A042;
        int A0M;
        if (!(this instanceof UT0) && !(this instanceof USz)) {
            if (this instanceof UT5) {
                UT5 ut5 = (UT5) this;
                if (obj == null) {
                    A0M = ut5.A00;
                } else {
                    A0M = AnonymousClass7TE.A0M(obj);
                }
                return Integer.valueOf(A0M);
            } else if (this instanceof UT4) {
                UT4 ut4 = (UT4) this;
                if (obj == null) {
                    A042 = ut4.A00;
                } else {
                    A042 = AnonymousClass7TE.A04(obj);
                }
                return Float.valueOf(A042);
            } else if (this instanceof USy) {
                if (!(obj instanceof Dynamic)) {
                    return new C19057WIj(obj);
                }
                return obj;
            } else if (this instanceof UT3) {
                UT3 ut3 = (UT3) this;
                if (obj == null) {
                    A002 = ut3.A00;
                } else {
                    A002 = JTO.A00(obj);
                }
                return Double.valueOf(A002);
            } else {
                if (this instanceof UT2) {
                    UT2 ut2 = (UT2) this;
                    if (obj == null) {
                        return Integer.valueOf(ut2.A00);
                    }
                } else if (this instanceof USx) {
                    if (obj == null) {
                        return null;
                    }
                    if (obj instanceof Double) {
                        return Integer.valueOf(AnonymousClass7TE.A0M(obj));
                    }
                    return obj;
                } else if (!(this instanceof USw)) {
                    if (this instanceof USv) {
                        if (obj == null) {
                            return null;
                        }
                        A1a = AnonymousClass7TE.A1a(obj);
                    } else if (this instanceof UT1) {
                        UT1 ut1 = (UT1) this;
                        if (obj == null) {
                            A1a = ut1.A00;
                        } else {
                            A1a = AnonymousClass7TE.A1a(obj);
                        }
                    }
                    if (A1a) {
                        return Boolean.TRUE;
                    }
                    return Boolean.FALSE;
                } else if (obj == null) {
                    return null;
                }
                return SPt.A00(context, obj);
            }
        }
        return obj;
    }

    public C18752Vzn(ReactProp reactProp, String str, Method method) {
        this.A01 = reactProp.name();
        String customType = reactProp.customType();
        this.A02 = !"__default_type__".equals(customType) ? customType : str;
        this.A03 = method;
        this.A00 = null;
    }

    public C18752Vzn(ReactPropGroup reactPropGroup, String str, Method method, int i) {
        this.A01 = reactPropGroup.names()[i];
        String customType = reactPropGroup.customType();
        this.A02 = !"__default_type__".equals(customType) ? customType : str;
        this.A03 = method;
        this.A00 = Integer.valueOf(i);
    }
}
