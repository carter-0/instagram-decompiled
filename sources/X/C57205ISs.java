package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.ISs  reason: case insensitive filesystem */
public final class C57205ISs implements G73 {
    public final /* synthetic */ Fragment A00;
    public final /* synthetic */ C314606iY A01;
    public final /* synthetic */ String A02;

    public C57205ISs(Fragment fragment, C314606iY r2, String str) {
        this.A01 = r2;
        this.A00 = fragment;
        this.A02 = str;
    }

    public final void DoN(1Xj r4) {
        I5a.A01(this.A00.getActivity(), this.A01.A00, r4, this.A02);
    }

    public final void onFail(String str) {
        0wb.A03(C273654mx.A00(1357), "Failed to fetch comment share sticker original media");
    }
}
