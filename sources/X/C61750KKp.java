package X;

import android.content.Context;
import android.view.View;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.KKp  reason: case insensitive filesystem */
public final class C61750KKp extends C353308Hc implements AnonymousClass8DG {
    public final C64724Lh1 A00;
    public final C387599mT A01;

    /* JADX WARNING: type inference failed for: r0v1, types: [X.9mT, X.8Hh] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61750KKp(Context context, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass8AL r9, C64724Lh1 lh1) {
        super(r9);
        0qQ.A0B(r9, 3);
        this.A00 = lh1;
        ? r0 = new C353358Hh(context, this, this, false, true);
        this.A01 = r0;
        this.A00 = r0;
        View view = r9.A0J;
        0qQ.A07(view);
        NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = (NineSixteenLayoutConfigImpl) targetViewSizeProvider;
        0nA.A0T(view, nineSixteenLayoutConfigImpl.A04 - nineSixteenLayoutConfigImpl.A0K.getHeight());
    }

    public final /* bridge */ /* synthetic */ void DBj(AnonymousClass518 r3, String str, int i, boolean z) {
        LED BJn;
        0qQ.A0B(r3, 0);
        C64724Lh1 lh1 = this.A00;
        if (lh1.A00 != null) {
            C66540MVu mVu = lh1.A06;
            if (!(mVu == null || (BJn = mVu.BJn()) == null)) {
                BJn.A02 = i;
            }
            C347017w8 r0 = lh1.A04;
            if (r0 != null) {
                r0.A0B(i);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void DMF(AnonymousClass518 r2, int i) {
        throw AnonymousClass00P.createAndThrow();
    }
}
