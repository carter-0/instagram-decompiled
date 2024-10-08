package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.Mom  reason: case insensitive filesystem */
public final class C67492Mom implements C74506Pw1 {
    public final Context A00;
    public final UserSession A01;
    public final C67490Mok A02;
    public final C74506Pw1 A03;

    public C67492Mom(Context context, UserSession userSession, C67490Mok mok, C74506Pw1 pw1) {
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = mok;
        this.A03 = pw1;
    }

    public static final void A00(List list, List list2, List list3) {
        for (Object next : list) {
            if (next instanceof DirectThreadKey) {
                list2.add(next);
            } else if (next instanceof MsysThreadId) {
                list3.add(next);
            }
        }
    }

    public static final void A01(Map map, Map map2, Map map3) {
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Object key = A1J.getKey();
            Object value = A1J.getValue();
            if (key instanceof DirectThreadKey) {
                map2.put(key, value);
            } else if (key instanceof MsysThreadId) {
                map3.put(key, value);
            }
        }
    }

    public final void AOd(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        A00(list, A1C, A1C2);
        this.A02.AOd(A1C);
        this.A03.AOd(A1C2);
    }

    public final void AVo(Map map) {
        HashMap A0x = C66582MXn.A0x(map);
        HashMap A1E = AnonymousClass7TE.A1E();
        A01(map, A0x, A1E);
        this.A02.AVo(A0x);
        this.A03.AVo(A1E);
    }

    public final void Cm5(Map map) {
        HashMap A0x = C66582MXn.A0x(map);
        HashMap A1E = AnonymousClass7TE.A1E();
        A01(map, A0x, A1E);
        this.A02.Cm5(A0x);
        this.A03.Cm5(A1E);
    }

    public final void Cog(N4G n4g, Map map) {
        HashMap A0x = C66582MXn.A0x(map);
        HashMap A1E = AnonymousClass7TE.A1E();
        A01(map, A0x, A1E);
        this.A02.Cog(n4g, A0x);
        this.A03.Cog(n4g, A1E);
    }

    public final void Coz(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        A00(list, A1C, A1C2);
        this.A02.Coz(A1C);
        this.A03.Coz(A1C2);
    }

    public final void Cp2(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        A00(list, A1C, A1C2);
        this.A02.Cp2(A1C);
        this.A03.Cp2(A1C2);
    }

    public final void Cp7(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        A00(list, A1C, A1C2);
        this.A02.Cp7(A1C);
        this.A03.Cp7(A1C2);
    }

    public final void FIX(Map map) {
        HashMap A0x = C66582MXn.A0x(map);
        HashMap A1E = AnonymousClass7TE.A1E();
        A01(map, A0x, A1E);
        this.A02.FIX(A0x);
        this.A03.FIX(A1E);
    }

    public final void FIk(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        A00(list, A1C, A1C2);
        this.A02.FIk(A1C);
        this.A03.FIk(A1C2);
    }

    public final void FIm(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        A00(list, A1C, A1C2);
        this.A02.FIm(A1C);
        this.A03.FIm(A1C2);
    }

    public final void FIp(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        A00(list, A1C, A1C2);
        this.A02.FIp(A1C);
        this.A03.FIp(A1C2);
    }
}
