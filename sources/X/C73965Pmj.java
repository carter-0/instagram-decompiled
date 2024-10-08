package X;

import android.app.Activity;
import java.util.List;

/* renamed from: X.Pmj  reason: case insensitive filesystem */
public final class C73965Pmj extends 0Yg implements 0sP {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Activity A01;
    public final /* synthetic */ 1a8 A02;
    public final /* synthetic */ C68714NUa A03;
    public final /* synthetic */ O69 A04;
    public final /* synthetic */ 0sP A05;
    public final /* synthetic */ boolean A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73965Pmj(Activity activity, 1a8 r3, C68714NUa nUa, O69 o69, 0sP r6, int i, boolean z) {
        super(1);
        this.A05 = r6;
        this.A04 = o69;
        this.A00 = i;
        this.A01 = activity;
        this.A06 = z;
        this.A02 = r3;
        this.A03 = nUa;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = obj;
        0qQ.A0B(obj2, 0);
        if (obj2 instanceof C68720NUg) {
            this.A05.invoke(obj2);
        } else {
            O69 o69 = this.A04;
            int i = this.A00 + 1;
            Activity activity = this.A01;
            boolean z = this.A06;
            1a8 r4 = this.A02;
            C68714NUa nUa = this.A03;
            0sP r7 = this.A05;
            List list = o69.A00;
            if (i >= list.size()) {
                r7.invoke(obj2);
            } else {
                ((C74386Pu2) list.get(i)).E2b(activity, r4, nUa, new C73965Pmj(activity, r4, nUa, o69, r7, i, z), z);
            }
        }
        return C60340gF.A00;
    }
}
