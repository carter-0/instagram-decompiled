package X;

import android.content.Context;
import androidx.fragment.app.Fragment;

/* renamed from: X.Wd1  reason: case insensitive filesystem */
public final class C19638Wd1 implements C59631JQz {
    public boolean A00 = true;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ C314606iY A02;

    public final void CtT(int i) {
        boolean z = true;
        if (i == 1) {
            z = false;
        }
        this.A00 = z;
    }

    public C19638Wd1(Fragment fragment, C314606iY r3) {
        this.A02 = r3;
        this.A01 = fragment;
    }

    public final void CtR() {
        if (this.A00) {
            this.A02.A02.EHd();
        }
    }

    public final void DdU() {
        this.A02.A02.EHd();
    }

    public final void DdV() {
        this.A02.A02.EHY("dialog");
    }

    public final void Ddc() {
        Context context = this.A01.getContext();
        context.getClass();
        C59689JTv.A0F(context, "product_rejected_dialog_remove_tag_failure_toast", 2131969820);
    }

    public final void Ddd(String str) {
        this.A02.A07.Ddb(str);
    }
}
