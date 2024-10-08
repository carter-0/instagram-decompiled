package X;

/* renamed from: X.Lhr  reason: case insensitive filesystem */
public final class C64775Lhr implements C232262tL {
    public final boolean A00;
    public final boolean A01;

    public final /* bridge */ /* synthetic */ Object getKey() {
        return "close_friends_story_row_view_model";
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        boolean z;
        C64775Lhr lhr = (C64775Lhr) obj;
        boolean z2 = this.A01;
        if (lhr != null) {
            z = lhr.A01;
        } else {
            z = false;
        }
        if (z2 == z) {
            return true;
        }
        return false;
    }

    public C64775Lhr(boolean z, boolean z2) {
        this.A01 = z;
        this.A00 = z2;
    }
}
