package X;

import android.view.MotionEvent;
import java.util.regex.Matcher;

/* renamed from: X.75U  reason: invalid class name */
public final class AnonymousClass75U implements AnonymousClass7DS {
    public final C332927Wz A00;

    public AnonymousClass75U(C332927Wz r2) {
        0qQ.A0B(r2, 1);
        this.A00 = r2;
    }

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        C66838MdW mdW = (C66838MdW) obj;
        0qQ.A0B(mdW, 0);
        Matcher A09 = 0mp.A09(String.valueOf(mdW.A02));
        if (!A09.find()) {
            A09 = 0mp.A09(String.valueOf(mdW.A01));
            if (!A09.find()) {
                return false;
            }
        }
        String group = A09.group(1);
        0qQ.A07(group);
        String substring = group.substring(1);
        0qQ.A07(substring);
        if (substring.length() == 0) {
            return false;
        }
        ((AnonymousClass7X9) this.A00).Cql(substring, false, mdW.BSG().A01);
        return true;
    }
}
