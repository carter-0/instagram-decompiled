package X;

import com.instagram.user.model.User;
import java.util.Map;

/* renamed from: X.Fvb  reason: case insensitive filesystem */
public final class C51529Fvb implements Runnable {
    public final /* synthetic */ FXZ A00;
    public final /* synthetic */ 27U A01;
    public final /* synthetic */ FAH A02;
    public final /* synthetic */ FAI A03;

    public C51529Fvb(FXZ fxz, 27U r2, FAH fah, FAI fai) {
        this.A00 = fxz;
        this.A01 = r2;
        this.A02 = fah;
        this.A03 = fai;
    }

    public final void run() {
        User user = this.A01.A00;
        FAH fah = this.A02;
        if (fah != null) {
            if (user.CXO() || user.CPV()) {
                Map map = fah.A01;
                if (!map.containsKey(user.getId())) {
                    1XQ r1 = new 1XQ();
                    F8C.A01(user, r1);
                    fah.A00.push(r1);
                    map.put(user.getId(), r1);
                }
            } else {
                Map map2 = fah.A01;
                if (map2.containsKey(user.getId())) {
                    fah.A00.remove(map2.remove(user.getId()));
                }
            }
            FAH.A00(fah);
        }
        FAI fai = this.A03;
        if (fai == null) {
            return;
        }
        if (user.CXO() || user.CPV()) {
            Map map3 = fai.A02;
            if (map3.containsKey(user.getId())) {
                fai.A01.remove(map3.remove(user.getId()));
                FAI.A00(fai);
            }
        }
    }
}
