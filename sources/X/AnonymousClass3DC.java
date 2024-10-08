package X;

/* renamed from: X.3DC  reason: invalid class name */
public final class AnonymousClass3DC extends C232322tW {
    public final /* synthetic */ AnonymousClass3D9 A00;

    public AnonymousClass3DC(AnonymousClass3D9 r1) {
        this.A00 = r1;
    }

    public final int A02() {
        return this.A00.A03.size();
    }

    public final int A03() {
        return this.A00.A04.size();
    }

    public final boolean A04(int i, int i2) {
        AnonymousClass3D9 r3 = this.A00;
        Object obj = r3.A04.get(i);
        Object obj2 = r3.A03.get(i2);
        if (obj != null) {
            if (obj2 != null) {
                return r3.A01.A04.A00.areContentsTheSame(obj, obj2);
            }
        } else if (obj2 == null) {
            return true;
        }
        throw new AssertionError();
    }

    public final boolean A05(int i, int i2) {
        AnonymousClass3D9 r3 = this.A00;
        Object obj = r3.A04.get(i);
        Object obj2 = r3.A03.get(i2);
        if (obj != null) {
            if (obj2 != null) {
                return r3.A01.A04.A00.areItemsTheSame(obj, obj2);
            }
            return false;
        } else if (obj2 != null) {
            return false;
        } else {
            return true;
        }
    }
}
