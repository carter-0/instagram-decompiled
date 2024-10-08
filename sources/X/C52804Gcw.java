package X;

import android.os.CountDownTimer;
import android.view.View;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.Gcw  reason: case insensitive filesystem */
public final class C52804Gcw extends CountDownTimer {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C314186hn A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C52804Gcw(View view, C314186hn r4, long j) {
        super(j, 1000);
        this.A01 = r4;
        this.A00 = view;
    }

    public final void onFinish() {
        C314186hn r4 = this.A01;
        this.A00.setVisibility(8);
        C314156hk r1 = r4.A0Y;
        C314156hk.A01(r1, r1.A01);
        if (r1.A06) {
            C314156hk.A01(r1, r1.A02);
        }
        r4.A01 = 0;
        C309426Yf r0 = r4.A0D;
        if (r0 != null) {
            r0.A0K = 0;
        }
        r4.A0a.A00(r4.A0B, AnonymousClass05K.A0u, "unknown", 0, r4.A0J);
        1Av A002 = 1Au.A00(r4.A0X.A03.A02);
        long currentTimeMillis = System.currentTimeMillis();
        0xY A0p = AnonymousClass7TE.A0p(A002);
        A0p.E5c(AnonymousClass000.A00(684), currentTimeMillis);
        A0p.apply();
        C314186hn.A02(r4);
    }

    public final void onTick(long j) {
        C314186hn r2 = this.A01;
        int A012 = AnonymousClass1GB.A01(((float) j) / 1000.0f);
        r2.A01 = A012;
        C309426Yf r0 = r2.A0D;
        if (r0 != null) {
            r0.A0K = A012;
        }
        IgTextView igTextView = r2.A09;
        if (igTextView != null) {
            DbX.A13(r2.A0T, igTextView, Integer.valueOf(A012), 2131974401);
        }
    }
}
