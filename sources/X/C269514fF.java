package X;

import org.webrtc.CameraCapturer;

/* renamed from: X.4fF  reason: invalid class name and case insensitive filesystem */
public abstract class C269514fF {
    public final C13782Tgx A06(Object obj) {
        if (obj instanceof C13782Tgx) {
            return (C13782Tgx) obj;
        }
        if (obj instanceof Class) {
            Class<C12448Suf> cls = (Class) obj;
            if (cls == C12448Suf.class || C269574fL.A0I(cls)) {
                return null;
            }
            if (C13782Tgx.class.isAssignableFrom(cls)) {
                return (C13782Tgx) C269574fL.A03(cls, A03().A06());
            }
            throw new IllegalStateException(002.A0g("AnnotationIntrospector returned Class ", cls.getName(), "; expected Class<Converter>"));
        }
        throw new IllegalStateException(002.A0g("AnnotationIntrospector returned Converter definition of type ", obj.getClass().getName(), "; expected type Converter or Class<Converter> instead"));
    }

    public final T9X A02(C11243SHd sHd) {
        return ((T9X) C269574fL.A03(sHd.A01, A03().A06())).A00(sHd.A03);
    }

    public final C269144ee A03() {
        if (this instanceof C269504fE) {
            return ((C269504fE) this).A05;
        }
        return ((C269674fV) this).A02;
    }

    public final C8196Qk3 A04(C268894eF r5, String str, String str2) {
        if (this instanceof C269504fE) {
            String format = String.format("Could not resolve type id '%s' as a subtype of %s", new Object[]{str, C269574fL.A04(r5)});
            if (str2 != null) {
                format = 002.A0g(format, ": ", str2);
            }
            return new C8196Qk3((16F) null, r5, format);
        }
        String format2 = String.format("Could not resolve type id '%s' as a subtype of %s", new Object[]{str, C269574fL.A04(r5)});
        16F r1 = ((C269674fV) this).A07;
        if (str2 != null) {
            format2 = 002.A0g(format2, ": ", str2);
        }
        return new C8196Qk3(r1, r5, format2);
    }

    public final AnonymousClass4eE A05() {
        C269144ee r0;
        if (this instanceof C269674fV) {
            r0 = ((C269674fV) this).A02;
        } else {
            r0 = ((C269504fE) this).A05;
        }
        return r0.A01.A07;
    }

    public final String A07(String str) {
        if (str == null) {
            return "[N/A]";
        }
        int length = str.length();
        if (length > 500) {
            str = 002.A0g(str.substring(0, CameraCapturer.OPEN_CAMERA_DELAY_MS), "]...[", str.substring(length - CameraCapturer.OPEN_CAMERA_DELAY_MS));
        }
        return String.format("\"%s\"", new Object[]{str});
    }

    public final void A08(C268894eF r3, String str) {
        if (this instanceof C269504fE) {
            throw new C8161Qi4(((C269494fD) ((C269504fE) this)).A00, r3, str);
        }
        throw new C8161Qi4(((C269674fV) this).A07, r3, str);
    }

    public final void A09(String str, Class cls) {
        C268894eF A09;
        if (cls == null) {
            A09 = null;
        } else {
            A09 = A05().A09(cls);
        }
        A08(A09, str);
        throw AnonymousClass00P.createAndThrow();
    }
}
