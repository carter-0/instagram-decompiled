package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.LZa  reason: case insensitive filesystem */
public final class C64300LZa implements C13907Tl7 {
    public boolean A00;
    public final View A01;
    public final View A02;
    public final C63853L9i A03;
    public final KIN A04 = new KIN(this);
    public final C60314JjH A05;
    public final AnonymousClass4DU A06;
    public final C252213ok A07 = new C64871LjX(this, 8);
    public final AnonymousClass3E6 A08;

    public C64300LZa(Activity activity, View view, C60314JjH jjH, AnonymousClass4DU r7) {
        0qQ.A0B(jjH, 4);
        this.A02 = view;
        this.A05 = jjH;
        this.A06 = r7;
        C63853L9i l9i = new C63853L9i(view);
        this.A03 = l9i;
        AnonymousClass3E5 A012 = AnonymousClass3E4.A01(this, false, true);
        A012.DmJ(activity);
        this.A08 = A012;
        this.A01 = l9i.A00;
    }

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final void onDestroy(AnonymousClass07Z r2) {
        0qQ.A0B(r2, 0);
        AnonymousClass3E6 r0 = this.A08;
        r0.onStop();
        r0.onDestroy();
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.KIN, android.text.TextWatcher] */
    public final void onPause(AnonymousClass07Z r3) {
        0qQ.A0B(r3, 0);
        this.A08.EEH(this.A07);
        this.A03.A03.removeTextChangedListener(this.A04);
    }

    public final void onResume(AnonymousClass07Z r3) {
        0qQ.A0B(r3, 0);
        this.A08.A9Y(this.A07);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.KIN, android.text.TextWatcher] */
    public final void onStart(AnonymousClass07Z r3) {
        0qQ.A0B(r3, 0);
        this.A03.A03.addTextChangedListener(this.A04);
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }
}
