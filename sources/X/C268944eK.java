package X;

/* renamed from: X.4eK  reason: invalid class name and case insensitive filesystem */
public abstract class C268944eK extends C268894eF implements C252523pF {
    public static final C268924eI A03 = C268924eI.A04;
    public final C268894eF A00;
    public final C268924eI A01;
    public final C268894eF[] A02;

    public String A0R() {
        StringBuilder sb;
        if (!(this instanceof C268934eJ)) {
            return this.A00.getName();
        }
        C268934eJ r5 = (C268934eJ) this;
        if (r5 instanceof AnonymousClass4iM) {
            AnonymousClass4iM r52 = (AnonymousClass4iM) r5;
            sb = new StringBuilder();
            Class cls = r52.A00;
            sb.append(cls.getName());
            C268894eF r2 = r52.A01;
            if (r2 != null && cls.getTypeParameters().length == 1) {
                sb.append('<');
                sb.append(((C268944eK) r2).A0R());
            }
            return sb.toString();
        }
        sb = new StringBuilder();
        Class cls2 = r5.A00;
        sb.append(cls2.getName());
        int length = r5.A01.A01.length;
        if (length > 0 && cls2.getTypeParameters().length == length) {
            sb.append('<');
            int i = 0;
            do {
                C268894eF A07 = r5.A07(i);
                if (i > 0) {
                    sb.append(',');
                }
                sb.append(((C268944eK) A07).A0R());
                i++;
            } while (i < length);
        }
        return sb.toString();
        sb.append('>');
        return sb.toString();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.RyK, java.lang.Object] */
    public final void ENF(17Z r4, C269504fE r5, SPK spk) {
        16L r2 = 16L.A0J;
        ? obj = new Object();
        obj.A03 = this;
        obj.A04 = null;
        obj.A00 = r2;
        spk.A03(r4, obj);
        EN9(r4, r5);
        spk.A04(r4, obj);
    }

    public C268944eK(C268944eK r2) {
        super(r2);
        this.A00 = r2.A00;
        this.A02 = r2.A02;
        this.A01 = r2.A01;
    }

    public static void A01(Class cls, StringBuilder sb, boolean z) {
        char c;
        if (!cls.isPrimitive()) {
            sb.append('L');
            String name = cls.getName();
            int length = name.length();
            for (int i = 0; i < length; i++) {
                char charAt = name.charAt(i);
                if (charAt == '.') {
                    charAt = '/';
                }
                sb.append(charAt);
            }
            if (z) {
                c = ';';
            } else {
                return;
            }
        } else if (cls == Boolean.TYPE) {
            c = 'Z';
        } else if (cls == Byte.TYPE) {
            c = 'B';
        } else if (cls == Short.TYPE) {
            c = 'S';
        } else if (cls == Character.TYPE) {
            c = 'C';
        } else if (cls == Integer.TYPE) {
            c = 'I';
        } else if (cls == Long.TYPE) {
            c = 'J';
        } else if (cls == Float.TYPE) {
            c = 'F';
        } else if (cls == Double.TYPE) {
            c = 'D';
        } else if (cls == Void.TYPE) {
            c = 'V';
        } else {
            throw new IllegalStateException(002.A0R("Unrecognized primitive type: ", cls.getName()));
        }
        sb.append(c);
    }

    public final void EN9(17Z r2, C269504fE r3) {
        r2.A0t(A0R());
    }

    public C268944eK(C268894eF r7, C268924eI r8, Class cls, Object obj, Object obj2, C268894eF[] r12, int i, boolean z) {
        super(cls, obj, obj2, i, z);
        this.A01 = r8 == null ? A03 : r8;
        this.A00 = r7;
        this.A02 = r12;
    }
}
