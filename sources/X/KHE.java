package X;

import android.graphics.Bitmap;
import java.io.IOException;

public final class KHE extends 2Cl {
    public Bitmap A00;
    public final /* synthetic */ ESR A01;

    public final int getRunnableId() {
        return 290;
    }

    public KHE(Bitmap bitmap, ESR esr) {
        this.A01 = esr;
        this.A00 = bitmap;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        boolean z;
        ESR esr = this.A01;
        Bitmap bitmap = this.A00;
        1FG A002 = LNw.A00(esr.requireContext());
        try {
            JZK.A00(Bitmap.CompressFormat.JPEG, bitmap, A002.CGq());
            A002.AIX();
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final void onFail(Exception exc) {
        C59689JTv.A07(C60960kU.A00, 2131953582);
    }

    public final void onFinish() {
        KHE.super.onFinish();
        ESR esr = this.A01;
        esr.A04 = false;
        Dbb.A0u(esr);
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        if (AnonymousClass7TE.A1a(obj)) {
            C59689JTv.A07(C60960kU.A00, 2131953579);
            0xY AR4 = AnonymousClass0xl.A00(C61170le.A00).A00.AR4();
            AR4.E5T(AnonymousClass000.A00(622), true);
            AR4.apply();
            return;
        }
        C59689JTv.A07(C60960kU.A00, 2131953582);
    }
}
