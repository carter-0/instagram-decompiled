package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.ml.smarttracking.videoanalyzer.SmartTrackingVideoAnalyzer$predictVideo$2;
import com.instagram.util.creation.ShaderBridge;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.8L4  reason: invalid class name */
public final class AnonymousClass8L4 {
    public final UserSession A00;
    public final AnonymousClass8L9 A01;
    public final AnonymousClass8L5 A02;
    public final Context A03;

    public final void A00(String str, long j) {
        String str2 = str;
        0qQ.A0B(str, 0);
        AnonymousClass8L5 r4 = this.A02;
        11Z.A02(new AnonymousClass9TM(r4));
        ArrayList arrayList = r4.A00;
        Iterator it = arrayList.iterator();
        0qQ.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            0qQ.A07(next);
            ((AnonymousClass8LA) next).DtE();
        }
        if (AnonymousClass8LF.A00(r4.A02).A00(str) != null) {
            Iterator it2 = arrayList.iterator();
            0qQ.A07(it2);
            while (it2.hasNext()) {
                Object next2 = it2.next();
                0qQ.A07(next2);
                ((AnonymousClass8LA) next2).DtC();
            }
            return;
        }
        AnonymousClass19S A022 = 19E.A02(AnonymousClass12T.A00.AOJ(497892810, 3));
        SmartTrackingVideoAnalyzer$predictVideo$2 smartTrackingVideoAnalyzer$predictVideo$2 = new SmartTrackingVideoAnalyzer$predictVideo$2(r4, str2, (AnonymousClass4D7) null, j);
        1Eo.A03(AnonymousClass05K.A00, 19B.A00, smartTrackingVideoAnalyzer$predictVideo$2, A022);
    }

    public AnonymousClass8L4(Context context, UserSession userSession) {
        this.A03 = context;
        this.A00 = userSession;
        AnonymousClass8L5 r0 = new AnonymousClass8L5(context, userSession);
        this.A02 = r0;
        AnonymousClass8L9 r1 = new AnonymousClass8L9(userSession);
        this.A01 = r1;
        r0.A00.add(r1);
        ShaderBridge.loadLibraries(new AnonymousClass8LB(this));
        0xY AR4 = AnonymousClass8LF.A00(userSession).A00.AR4();
        AR4.AHM();
        AR4.apply();
    }
}
