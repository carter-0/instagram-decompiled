package X;

import com.facebook.common.stringformat.StringFormatUtil;
import java.util.ArrayDeque;

/* renamed from: X.Vru  reason: case insensitive filesystem */
public final class C18447Vru {
    public static C18447Vru A02;
    public C58900Bc A00 = new C58900Bc(new C18993WFu(this), new C18994WFv(this));
    public String A01;

    public static synchronized void A00(String str, String str2) {
        synchronized (C18447Vru.class) {
            C18447Vru vru = A02;
            if (vru != null) {
                vru.A01 = str2;
                String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("%s [productName: %s]", str, str2);
                C58900Bc r3 = vru.A00;
                synchronized (r3) {
                    ArrayDeque arrayDeque = r3.A05;
                    arrayDeque.add(formatStrLocaleSafe);
                    if (arrayDeque.size() > 3) {
                        arrayDeque.removeFirst();
                    }
                }
            }
        }
    }

    public C18447Vru() {
        14i.A08.A0A(new C19249WRi(this, 0));
        0BU.A00(new C18992WFt(this));
    }
}
