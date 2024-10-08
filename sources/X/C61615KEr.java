package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

/* renamed from: X.KEr  reason: case insensitive filesystem */
public final class C61615KEr extends C232222tE {
    public final /* bridge */ /* synthetic */ void bind(C232262tL r5, C249703kE r6) {
        C64812LiX liX = (C64812LiX) r5;
        C60584Jnt jnt = (C60584Jnt) r6;
        AnonymousClass7TG.A1N(liX, jnt);
        int i = liX.A00;
        jnt.A01.A02(AnonymousClass7TE.A16(jnt.A00, i), liX.A01);
    }

    public final Class modelClass() {
        return C64812LiX.class;
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        Context A06 = JTU.A06(viewGroup);
        return new C60584Jnt(A06, new U56(A06));
    }
}
