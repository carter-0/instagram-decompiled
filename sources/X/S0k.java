package X;

import android.content.Context;
import java.util.Map;

public abstract class S0k {
    public final Map A00 = AnonymousClass7TE.A1E();

    public final Object A00(Object obj) {
        Object sFe;
        Map map = this.A00;
        synchronized (map) {
            if (map.containsKey(obj)) {
                sFe = map.get(obj);
            } else {
                if (this instanceof R2u) {
                    sFe = new R2v(((R2u) this).A00, (SJS) obj);
                } else if (this instanceof R2t) {
                    RPJ rpj = (RPJ) obj;
                    SO3 A002 = SO3.A00();
                    Class<Context> cls = Context.class;
                    sFe = new C11332SNl((Context) A002.A01(cls), new SyQ((Context) SO3.A00().A01(cls), rpj), (SGk) A002.A01(SGk.class), ((C8549Qwn) rpj).A01);
                } else if (this instanceof R2s) {
                    C9056RNf rNf = (C9056RNf) obj;
                    SO3 A003 = SO3.A00();
                    Class<Context> cls2 = Context.class;
                    sFe = new C11215SFp((Context) A003.A01(cls2), new SyM((Context) SO3.A00().A01(cls2), rNf), (SGk) A003.A01(SGk.class), ((C8511Qw7) rNf).A01);
                } else {
                    C9022RLx rLx = (C9022RLx) obj;
                    SO3 A004 = SO3.A00();
                    Class<Context> cls3 = Context.class;
                    sFe = new C11204SFe((Context) A004.A01(cls3), new SyJ((Context) SO3.A00().A01(cls3), rLx), (SGk) A004.A01(SGk.class), ((C8507Qw3) rLx).A01);
                }
                map.put(obj, sFe);
            }
        }
        return sFe;
    }
}
