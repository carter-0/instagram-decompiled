package X;

public final class WSQ implements C232262tL {
    public final C19276WSj A00;
    public final C19276WSj A01;
    public final String A02;

    public final /* bridge */ /* synthetic */ Object getKey() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.A00.A02);
        sb.append(" + ");
        C19276WSj wSj = this.A01;
        if (wSj != null) {
            str = wSj.A02;
        } else {
            str = null;
        }
        sb.append(str);
        sb.append('_');
        return AnonymousClass7TF.A0l(this.A02, sb);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C19276WSj wSj;
        UL1 ul1;
        C19276WSj wSj2;
        UL1 ul12;
        WSQ wsq = (WSQ) obj;
        C19276WSj wSj3 = this.A00;
        C19276WSj wSj4 = null;
        if (wsq != null) {
            wSj = wsq.A00;
        } else {
            wSj = null;
        }
        UL1 ul13 = wSj3.A00;
        if (wSj != null) {
            ul1 = wSj.A00;
        } else {
            ul1 = null;
        }
        if (!0qQ.A0K(ul13, ul1) || (wSj2 = this.A01) == null) {
            return false;
        }
        if (wsq != null) {
            wSj4 = wsq.A01;
        }
        UL1 ul14 = wSj2.A00;
        if (wSj4 != null) {
            ul12 = wSj4.A00;
        } else {
            ul12 = null;
        }
        if (0qQ.A0K(ul14, ul12)) {
            return true;
        }
        return false;
    }

    public WSQ(C19276WSj wSj, C19276WSj wSj2, String str) {
        this.A02 = str;
        this.A00 = wSj;
        this.A01 = wSj2;
    }
}
