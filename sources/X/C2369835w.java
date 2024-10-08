package X;

import android.view.ViewGroup;

/* renamed from: X.35w  reason: invalid class name and case insensitive filesystem */
public final class C2369835w implements 1wn {
    public final /* synthetic */ AnonymousClass35W A00;

    public C2369835w(AnonymousClass35W r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = AnonymousClass0fD.A03(-1180468601);
        int A032 = AnonymousClass0fD.A03(-1815098108);
        C227802jw r2 = (C227802jw) this.A00.A0b.get();
        if (r2 == null) {
            i = -1411515900;
        } else if (r2.mView == null) {
            i = 800239781;
        } else {
            ViewGroup CEd = r2.getScrollingViewProxy().CEd();
            if (CEd != null) {
                CEd.post(new C51322FsG(r2));
            }
            i = -1777322298;
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(-1930627899, A03);
    }
}
