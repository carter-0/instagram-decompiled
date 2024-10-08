package X;

/* renamed from: X.WKu  reason: case insensitive filesystem */
public final class C19087WKu implements C74378Ptt {
    public final int A00;
    public final Object A01;

    public C19087WKu(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onAppBackgrounded() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            ((C18760Vzv) obj).A08 = true;
        } else {
            ((C17917Vi8) obj).A00 = true;
        }
    }

    public final void onAppForegrounded() {
        int i = this.A00;
        Object obj = this.A01;
        if (i != 0) {
            ((C18760Vzv) obj).A08 = false;
        } else {
            ((C17917Vi8) obj).A00 = false;
        }
    }
}
