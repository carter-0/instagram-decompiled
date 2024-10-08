package X;

import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class FBZ {
    public final ComponentActivity A00;
    public final 0lg A01;
    public final boolean A02;

    public FBZ(ComponentActivity componentActivity, 0lg r3, boolean z) {
        0qQ.A0B(r3, 2);
        this.A00 = componentActivity;
        this.A01 = r3;
        this.A02 = z;
        if (componentActivity.getApplication() != null) {
            DbX.A0z(componentActivity);
        }
    }

    public static final ArrayList A00(List list) {
        0qQ.A0B(list, 0);
        C7210Pzc pzc = new C7210Pzc();
        pzc.A0A.add(new PzZ((TypeToken) null, C60937Jtv.class, new Object(), false));
        Gson A002 = pzc.A00();
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (Object A0B : list) {
            A0r.add(A002.A0B(A0B));
        }
        return AnonymousClass7TE.A1D(A0r);
    }

    public final ArrayList A01(Bundle bundle) {
        ArrayList<String> arrayList;
        if (bundle == null || (arrayList = bundle.getStringArrayList(AnonymousClass000.A00(641))) == null) {
            arrayList = AnonymousClass7TE.A1C();
        }
        C7210Pzc pzc = new C7210Pzc();
        Class<C60937Jtv> cls = C60937Jtv.class;
        pzc.A0A.add(new PzZ((TypeToken) null, cls, new Object(), false));
        Gson A002 = pzc.A00();
        ArrayList A0r = AnonymousClass7TG.A0r(arrayList);
        Iterator<String> it = arrayList.iterator();
        while (it.hasNext()) {
            A0r.add(A002.A09(AnonymousClass7TE.A18(it), cls));
        }
        return A0r;
    }

    public final boolean A02() {
        0Tu r2;
        boolean z = this.A02;
        0lg r3 = this.A01;
        if (z) {
            r2 = 0Tu.A05;
        } else {
            r2 = 0Tu.A06;
        }
        return 182.A06(r2, r3, 36312990709974599L);
    }
}
