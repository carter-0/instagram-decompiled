package X;

import android.content.Context;
import android.os.Bundle;
import android.util.ArrayMap;
import androidx.fragment.app.Fragment;
import java.util.Map;

/* renamed from: X.Vsn  reason: case insensitive filesystem */
public final class C18492Vsn {
    public 0h9 A00;
    public X5M A01;
    public C16501Uvx A02;
    public final Fragment A03;
    public final Map A04 = new ArrayMap(C16501Uvx.A00.size());
    public final C14584Tyo A05;

    public static final 0eP A00(Bundle bundle, C18492Vsn vsn, C16501Uvx uvx) {
        Object fQn;
        String str;
        WE8 we8 = new WE8();
        String name = uvx.name();
        boolean equals = name.equals("Native");
        if (equals || name.equals("Bloks")) {
            G9A g9a = vsn.A03;
            G9A g9a2 = g9a;
            Context requireContext = g9a.requireContext();
            0h9 r1 = we8.A00;
            if (equals) {
                DbY.A1S(g9a2, r1);
                fQn = new C50130FQn(requireContext, bundle, r1, g9a2);
            } else if (name.equals("Bloks")) {
                DbY.A1S(g9a2, r1);
                fQn = new C46601Dhh(requireContext, bundle, r1, g9a2);
            } else {
                throw DbZ.A0Z(name);
            }
            0qQ.A0A(fQn);
            0eP r12 = new 0eP(fQn, we8);
            vsn.A04.put(uvx, r12);
            return r12;
        }
        C16501Uvx uvx2 = C16501Uvx.Bloks;
        StringBuilder sb = new StringBuilder();
        sb.append("There is no corresponding behavior factory for type: ");
        sb.append(uvx);
        sb.append('.');
        if (uvx == uvx2) {
            str = "The fallback bloks behavior was not used, because the fragment does not implement CDSBloksBottomSheet";
        } else {
            str = "";
        }
        throw Pxg.A0d(str, sb);
    }

    public C18492Vsn(Fragment fragment) {
        this.A03 = fragment;
        C14584Tyo tyo = new C14584Tyo(this);
        this.A05 = tyo;
        fragment.mLifecycleRegistry.A09(tyo);
    }
}
