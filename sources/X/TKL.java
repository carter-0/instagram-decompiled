package X;

import java.util.Map;

public final class TKL implements Runnable {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C12745T5f A01;
    public final /* synthetic */ C11002S4w A02;
    public final /* synthetic */ C62846KnM A03;
    public final /* synthetic */ String A04;

    public TKL(C12745T5f t5f, C11002S4w s4w, C62846KnM knM, String str, int i) {
        this.A03 = knM;
        this.A01 = t5f;
        this.A04 = str;
        this.A00 = i;
        this.A02 = s4w;
    }

    public final void run() {
        String str = ((C62021KVv) this.A03).A00.A07;
        if (str != null) {
            Map map = this.A01.A03;
            map.put(this.A04, str);
            if (map.size() >= this.A00) {
                this.A02.A01(0Yt.A0B(map));
                return;
            }
            return;
        }
        C12745T5f t5f = this.A01;
        t5f.A01.post(new THP(t5f, this.A02));
    }
}
