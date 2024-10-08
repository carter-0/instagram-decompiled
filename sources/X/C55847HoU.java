package X;

import android.content.Context;
import android.view.GestureDetector;

/* renamed from: X.HoU  reason: case insensitive filesystem */
public final class C55847HoU {
    public final Context A00;
    public final GestureDetector A01;
    public final AnonymousClass4GO A02;
    public final C254173s3 A03;
    public final 1Xj A04;
    public final AnonymousClass3W1 A05;
    public final C253913rc A06;

    public /* synthetic */ C55847HoU(Context context, AnonymousClass4GO r11, C254173s3 r12, 1Xj r13, AnonymousClass3W1 r14, int i) {
        HFp hFp = new HFp(r11, r12, r13, r14, i);
        C253913rc r2 = new C253913rc(context);
        GestureDetector gestureDetector = new GestureDetector(context, hFp);
        AnonymousClass7TG.A1Q(r13, r14);
        this.A00 = context;
        this.A04 = r13;
        this.A05 = r14;
        this.A03 = r12;
        this.A02 = r11;
        this.A06 = r2;
        this.A01 = gestureDetector;
        gestureDetector.setIsLongpressEnabled(false);
        r2.A01.add(hFp);
    }
}
