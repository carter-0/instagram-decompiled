package X;

/* renamed from: X.LiB  reason: case insensitive filesystem */
public final class C64791LiB implements C232262tL {
    public final String A00;
    public final String A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        String str;
        C64791LiB liB = (C64791LiB) obj;
        String str2 = this.A00;
        if (liB != null) {
            str = liB.A00;
        } else {
            str = null;
        }
        if (2PP.A00(str2, str)) {
            String str3 = this.A02;
            if (!2PP.A00(str3, str3)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public C64791LiB(String str, String str2, String str3) {
        this.A01 = str;
        this.A00 = str2;
        this.A02 = str3;
    }
}
