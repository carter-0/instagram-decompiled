package X;

import com.instagram.igsignals.core.IgSignalsFeature;

/* renamed from: X.PpD  reason: case insensitive filesystem */
public final class C74110PpD extends 0Yg implements 0sP {
    public static final C74110PpD A00 = new C74110PpD();

    public C74110PpD() {
        super(1);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        IgSignalsFeature igSignalsFeature = (IgSignalsFeature) obj;
        StringBuilder A0l = C51975G9x.A0l(igSignalsFeature);
        A0l.append('(');
        A0l.append(igSignalsFeature.A01);
        A0l.append(')');
        A0l.append(igSignalsFeature.A02);
        A0l.append(": ");
        A0l.append(igSignalsFeature.A00);
        return A0l.toString();
    }
}
