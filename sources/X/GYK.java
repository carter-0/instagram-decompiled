package X;

import com.instagram.ui.animation.timeline.linear.TaskNotAvailableException;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

public final class GYK {
    public final C52054GDa A00;
    public final AtomicBoolean A01 = new AtomicBoolean();

    public static final C52206GIx A00(JMF jmf, GYK gyk) {
        C52054GDa gDa = gyk.A00;
        C52056GDc gDc = (C52056GDc) gDa.A03.get(jmf);
        if (gDc != null) {
            gDa.A01 = gDc;
            GL1 gl1 = gDc.A01;
            gl1.A00.EJV(gl1, (GYL) gDa.A07.getValue());
            return C52206GIx.A02;
        }
        TaskNotAvailableException taskNotAvailableException = TaskNotAvailableException.A00;
        0qQ.A0B(taskNotAvailableException, 0);
        return new C52206GIx(false, taskNotAvailableException);
    }

    public final void A01() {
        C52054GDa gDa = this.A00;
        Iterator A0v = AnonymousClass7TF.A0v(gDa.A03);
        while (A0v.hasNext()) {
            GL1 gl1 = ((C52056GDc) A0v.next()).A01;
            gl1.A01 = AnonymousClass05K.A00;
            gl1.A00.reset();
            gl1.A03 = false;
        }
        C52056GDc gDc = gDa.A02;
        0qQ.A0B(gDc, 0);
        gDa.A01 = gDc;
        this.A01.set(false);
        ((C55944Hq8) gDa.A04.getValue()).A00 = null;
    }

    public GYK(C52054GDa gDa) {
        this.A00 = gDa;
    }
}
