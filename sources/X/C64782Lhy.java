package X;

/* renamed from: X.Lhy  reason: case insensitive filesystem */
public final class C64782Lhy implements C232262tL {
    public final String A00;
    public final String A01;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return "video_metadata_series";
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C64782Lhy lhy = (C64782Lhy) obj;
        0qQ.A0B(lhy, 0);
        if (!0qQ.A0K(this.A01, lhy.A01) || !0qQ.A0K(this.A00, lhy.A00)) {
            return false;
        }
        return true;
    }

    public C64782Lhy(String str, String str2) {
        this.A01 = str;
        this.A00 = str2;
    }
}
