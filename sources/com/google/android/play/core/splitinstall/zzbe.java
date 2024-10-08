package com.google.android.play.core.splitinstall;

import X.AnonymousClass0fD;
import X.C10893Rzt;
import X.C51970G9q;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class zzbe extends zzbh {
    public final void FQ5(List list) {
        int A03 = AnonymousClass0fD.A03(2119863800);
        super.FQ5(list);
        ArrayList A0m = C51970G9q.A0m(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A0m.add(C10893Rzt.A00((Bundle) it.next()));
        }
        this.A00.A00.A0F(A0m);
        AnonymousClass0fD.A0A(357027513, A03);
    }
}
