package X;

import android.app.Activity;
import android.content.Context;
import java.util.LinkedHashMap;

public abstract class V4R {
    public AnonymousClass4OB A01(Context context) {
        AnonymousClass4O9 r1;
        AnonymousClass4OB r0;
        if (this instanceof C16132UpJ) {
            r1 = AnonymousClass4O9.NOTIFICATION;
        } else if (this instanceof C16131UpI) {
            r1 = AnonymousClass4O9.MICROPHONE;
        } else {
            r1 = AnonymousClass4O9.CAMERA;
        }
        C17965Viz viz = new C17965Viz(r1, AnonymousClass4OA.UNSPECIFIED);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r4));
        for (String str : viz.A01()) {
            if (1DL.A07(context, str)) {
                r0 = AnonymousClass4OB.GRANTED;
            } else {
                r0 = AnonymousClass4OB.DENIED;
            }
            linkedHashMap.put(str, r0);
        }
        return viz.A00(linkedHashMap);
    }

    public void A02(Activity activity, VVI vvi) {
        AnonymousClass4O9 r2;
        if (this instanceof C16132UpJ) {
            r2 = AnonymousClass4O9.NOTIFICATION;
        } else if (this instanceof C16131UpI) {
            r2 = AnonymousClass4O9.MICROPHONE;
        } else {
            r2 = AnonymousClass4O9.CAMERA;
        }
        C17965Viz viz = new C17965Viz(r2, AnonymousClass4OA.UNSPECIFIED);
        C19254WRn wRn = new C19254WRn(3, viz, vvi, this);
        String[] A01 = viz.A01();
        C13990Tnq.A0k(activity, wRn, A01, A01.length);
    }
}
