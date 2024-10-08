package X;

import android.view.ViewGroup;
import android.widget.SeekBar;
import com.instagram.android.R;

/* renamed from: X.GxX  reason: case insensitive filesystem */
public final class C53989GxX extends C243963aQ {
    public static final 2WU A04 = G9t.A17(C56960IJe.A00);
    public final int A00;
    public final SeekBar.OnSeekBarChangeListener A01;
    public final 2V5 A02;
    public final 2WX A03;

    public C53989GxX(SeekBar.OnSeekBarChangeListener onSeekBarChangeListener, 2V5 r3, 2WX r4, int i) {
        0qQ.A0B(r3, 1);
        this.A02 = r3;
        this.A00 = i;
        this.A01 = onSeekBarChangeListener;
        this.A03 = r4;
    }

    public final C244523bK A0X(C244463bE r7) {
        0qQ.A0B(r7, 0);
        Object A002 = AnonymousClass3Zw.A00(r7, new C58180Ink(r7, 23), new Object[0]);
        return C51965G9l.A0W(this.A03, IKY.A00, C51969G9p.A0f(r7, A04, C58446Is3.A00, new C59104J6m(2, A002, (Object) r7, (Object) this)));
    }

    public static final void A00(ViewGroup viewGroup, int i, int i2) {
        AnonymousClass7TG.A0R(viewGroup, R.id.timer).setText(1G0.A02((long) (i - i2)));
    }
}
