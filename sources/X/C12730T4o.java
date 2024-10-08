package X;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.T4o  reason: case insensitive filesystem */
public final class C12730T4o implements C13656TeN {
    public static final C13961TmO A04 = C12629T0r.A00;
    public static final C13962TmP A05 = C12718T4c.A00;
    public static final C13962TmP A06 = C12717T4b.A00;
    public static final C12719T4d A07 = new Object();
    public C13961TmO A00;
    public boolean A01;
    public final Map A02 = AnonymousClass7TE.A1E();
    public final Map A03;

    public final /* bridge */ /* synthetic */ C13656TeN EBa(C13961TmO tmO, Class cls) {
        this.A02.put(cls, tmO);
        this.A03.remove(cls);
        return this;
    }

    public C12730T4o() {
        HashMap A1E = AnonymousClass7TE.A1E();
        this.A03 = A1E;
        this.A00 = A04;
        this.A01 = false;
        Class<String> cls = String.class;
        A1E.put(cls, A06);
        this.A02.remove(cls);
        Class<Boolean> cls2 = Boolean.class;
        this.A03.put(cls2, A05);
        this.A02.remove(cls2);
        Class<Date> cls3 = Date.class;
        this.A03.put(cls3, A07);
        this.A02.remove(cls3);
    }
}
