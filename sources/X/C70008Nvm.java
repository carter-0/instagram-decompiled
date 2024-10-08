package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.Nvm  reason: case insensitive filesystem */
public abstract class C70008Nvm {
    public static final C68817NYb A00(Context context, UserSession userSession, AnonymousClass9HC r19, AnonymousClass7LQ r20, AnonymousClass7L2 r21, Map map) {
        1Xj r2;
        C69610Nos na7;
        boolean z;
        0eP A00;
        int A09;
        Map map2 = map;
        0qQ.A0B(map2, 5);
        0t0 A01 = AnonymousClass0eN.A01(AnonymousClass7FC.A00);
        AnonymousClass7LQ r5 = r20;
        C254703su r3 = r5.A0e;
        AnonymousClass9HC r6 = r19;
        AnonymousClass9HC r12 = r6;
        AnonymousClass7FE A04 = AnonymousClass7FD.A04(userSession, r12, r5, r21, r3.A10, A01);
        C3264276s r7 = new C3264276s((AnonymousClass773) null, (Map) null, (DefaultConstructorMarker) null, 3);
        Object obj = r3.A1T;
        C70456O7h o7h = null;
        Context context2 = context;
        if (C376649Iu.A00(6, obj)) {
            r2 = (1Xj) ((C376649Iu) obj).A00;
            na7 = C68871Na8.A00;
            String id = r2.getId();
            if (id != null) {
                map2.put(id, r2);
                A00 = AnonymousClass7TE.A1L("H,0.640625:1", (Object) null);
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else if (obj instanceof AnonymousClass77X) {
            AnonymousClass77X r8 = (AnonymousClass77X) obj;
            r2 = r8.A01;
            na7 = new Na7(r2.A0C.getClipsMetadata(), r8.A02);
            String str = r8.A03;
            if (str != null) {
                o7h = new C70456O7h(C317486nL.A04.A04(str));
                z = true;
            } else {
                z = false;
            }
            A00 = AnonymousClass750.A00(context2, r6, z);
        } else {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            A1A.append("Content Invalid - type:");
            A1A.append(r3.A10);
            throw C66582MXn.A0k(obj, " content:", A1A);
        }
        String str2 = (String) A00.A00;
        Number number = (Number) A00.A01;
        C328667Fr A012 = r7.A01(context, userSession, A04, r6, r5);
        N4R n4r = new N4R(r2, r3.A0V());
        String id2 = r2.getId();
        if (id2 != null) {
            if (number != null) {
                A09 = number.intValue();
            } else {
                A09 = (int) (((float) 0nA.A09(context2)) / 2.5f);
            }
            return new C68817NYb(n4r, A012, o7h, na7, id2, str2, A09);
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
