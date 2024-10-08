package X;

import java.util.List;

public final class F2H {
    public List A00;
    public List A01;
    public List A02;

    public final List A00() {
        if (this.A02 == null) {
            this.A02 = DbS.A0v(this.A01.size());
            for (C49512Ewr ewr : this.A01) {
                this.A02.add(ewr.A01);
            }
        }
        return this.A02;
    }
}
