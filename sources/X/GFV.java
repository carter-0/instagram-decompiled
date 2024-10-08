package X;

import com.instagram.ui.animation.timeline.linear.TaskNotAvailableException;

public final class GFV {
    public final C52054GDa A00;

    public final C52206GIx A01(JMF jmf, JQN jqn) {
        C52056GDc gDc = (C52056GDc) this.A00.A03.get(jmf);
        if (gDc != null) {
            gDc.A01.A00 = jqn;
            return C52206GIx.A02;
        }
        TaskNotAvailableException taskNotAvailableException = TaskNotAvailableException.A00;
        0qQ.A0B(taskNotAvailableException, 0);
        return new C52206GIx(false, taskNotAvailableException);
    }

    public final C52206GIx A00(JMF jmf) {
        C52056GDc gDc = (C52056GDc) this.A00.A03.get(jmf);
        if (gDc == null) {
            TaskNotAvailableException taskNotAvailableException = TaskNotAvailableException.A00;
            0qQ.A0B(taskNotAvailableException, 0);
            return new C52206GIx(false, taskNotAvailableException);
        }
        gDc.A01.A02 = true;
        return C52206GIx.A02;
    }

    public GFV(C52054GDa gDa) {
        this.A00 = gDa;
    }
}
