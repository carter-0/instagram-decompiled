package X;

/* renamed from: X.5qt  reason: invalid class name and case insensitive filesystem */
public abstract class C296935qt implements C232262tL, C296945qu {
    public VZS A00;
    public Integer A01;
    public final C296905qq A02;
    public final C295795ov A03;
    public final String A04;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public C296935qt(C296905qq r2, String str) {
        this(r2, (C295795ov) null, str);
        0qQ.A0B(str, 1);
    }

    /* renamed from: A03 */
    public boolean isContentSame(C296935qt r2) {
        return true;
    }

    public long A00() {
        if (this instanceof C296925qs) {
            return 24;
        }
        if (this instanceof C296985qy) {
            return 0;
        }
        return 26;
    }

    public final String A01() {
        if (this instanceof C296925qs) {
            return ((C296925qs) this).A01.A01().A00;
        }
        return null;
    }

    /* renamed from: A02 */
    public String getKey() {
        C295795ov r0;
        String A0T;
        if (!(this instanceof C296985qy) || (r0 = this.A03) == null || (A0T = 002.A0T(r0.A00(), this.A04, ':')) == null) {
            return this.A04;
        }
        return A0T;
    }

    public final C296905qq B9p() {
        return this.A02;
    }

    public C296935qt(C296905qq r1, C295795ov r2, String str) {
        this.A04 = str;
        this.A02 = r1;
        this.A03 = r2;
    }
}
