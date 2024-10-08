package X;

import com.instagram.barcelona.creation.voiceclips.model.TranscriptionToken;
import com.instagram.feed.audio.AudioIntf;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.ChW  reason: case insensitive filesystem */
public abstract class C44598ChW {
    public static final C53283GlV A00(1Xj r13) {
        List list;
        Integer num;
        String str;
        Long l;
        AudioIntf AdR = r13.A0C.AdR();
        AnonymousClass62P r6 = null;
        if (AdR != null) {
            list = AdR.CGD();
        } else {
            list = null;
        }
        AudioIntf AdR2 = r13.A0C.AdR();
        if (AdR2 != null) {
            num = AdR2.CGE();
        } else {
            num = null;
        }
        AudioIntf AdR3 = r13.A0C.AdR();
        if (AdR3 != null) {
            str = AdR3.Adp();
        } else {
            str = null;
        }
        AudioIntf AdR4 = r13.A0C.AdR();
        if (AdR4 != null) {
            l = AdR4.AzI();
        } else {
            l = null;
        }
        if (list == null || num == null || str == null || l == null) {
            return null;
        }
        AnonymousClass62P A00 = AnonymousClass62Q.A00(list);
        int intValue = num.intValue();
        int longValue = (int) l.longValue();
        String id = r13.getId();
        if (id != null) {
            List<DTQ> C9O = r13.A0C.C9O();
            if (C9O != null) {
                ArrayList A0r = AnonymousClass7TG.A0r(C9O);
                for (DTQ dtq : C9O) {
                    A0r.add(new TranscriptionToken(dtq.getText(), dtq.Byb(), dtq.B1Q(), false));
                }
                r6 = AnonymousClass62Q.A00(A0r);
            }
            return new C53283GlV(str, id, A00, r6, intValue, longValue);
        }
        throw AnonymousClass7TE.A0y();
    }
}
