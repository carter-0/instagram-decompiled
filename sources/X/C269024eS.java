package X;

import java.io.Serializable;
import java.text.DateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* renamed from: X.4eS  reason: invalid class name and case insensitive filesystem */
public final class C269024eS implements Serializable {
    public static final TimeZone A0B = TimeZone.getTimeZone("UTC");
    public final C268974eN A00;
    public final C268854eA A01;
    public final T9E A02;
    public final C269034eT A03;
    public final C269014eR A04;
    public final C269004eQ A05;
    public final C13733Tg5 A06;
    public final AnonymousClass4eE A07;
    public final DateFormat A08;
    public final Locale A09;
    public final TimeZone A0A;

    public C269024eS(C268974eN r1, C268854eA r2, T9E t9e, C269034eT r4, C269014eR r5, C269004eQ r6, C13733Tg5 tg5, AnonymousClass4eE r8, DateFormat dateFormat, Locale locale, TimeZone timeZone) {
        this.A03 = r4;
        this.A01 = r2;
        this.A02 = t9e;
        this.A07 = r8;
        this.A06 = tg5;
        this.A08 = dateFormat;
        this.A09 = locale;
        this.A0A = timeZone;
        this.A00 = r1;
        this.A05 = r6;
        this.A04 = r5;
    }
}
