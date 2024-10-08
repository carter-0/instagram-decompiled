package X;

/* renamed from: X.XwS  reason: case insensitive filesystem */
public final class C22163XwS implements Y9G {
    public final /* bridge */ /* synthetic */ void reportTo(C21292XSz xSz, Y9F y9f) {
        XIZ xiz = (XIZ) xSz;
        C21302XUk.A00(y9f, xiz.A05, "total_bytes_freed");
        C21302XUk.A00(y9f, xiz.A04, "total_alloc_count_bytes");
        C21302XUk.A00(y9f, xiz.A02, AnonymousClass000.A00(3187));
        C21302XUk.A00(y9f, xiz.A03, C273654mx.A00(715));
        C21302XUk.A00(y9f, xiz.A00, AnonymousClass000.A00(2710));
        C21302XUk.A00(y9f, xiz.A01, Pxd.A00(652));
        String str = xiz.A07;
        if (str != null) {
            y9f.A7h("gc_count_rate_histogram", str);
        }
        String str2 = xiz.A06;
        if (str2 != null) {
            y9f.A7h("gc_blocking_gc_count_rate_histogram", str2);
        }
    }
}
