package X;

import android.graphics.Bitmap;
import java.io.IOException;
import java.io.OutputStream;

public final class KHF extends 2Cl {
    public final Bitmap A00;
    public final /* synthetic */ E4T A01;

    public final int getRunnableId() {
        return 258;
    }

    public KHF(Bitmap bitmap, E4T e4t) {
        this.A01 = e4t;
        this.A00 = bitmap;
    }

    public final /* bridge */ /* synthetic */ Object call() {
        boolean z;
        E4T e4t = this.A01;
        Bitmap bitmap = this.A00;
        1FG A002 = LNw.A00(e4t.requireContext());
        try {
            OutputStream CGq = A002.CGq();
            if (bitmap != null) {
                Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                0qQ.A0A(CGq);
                JZK.A00(compressFormat, bitmap, CGq);
            }
            A002.AIX();
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    public final void onFail(Exception exc) {
        C59689JTv.A07(this.A01.requireContext(), 2131953582);
    }

    public final void onFinish() {
        KHF.super.onFinish();
        Bitmap bitmap = this.A00;
        if (bitmap != null) {
            bitmap.recycle();
        }
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        boolean A1a = AnonymousClass7TE.A1a(obj);
        E4T e4t = this.A01;
        if (A1a) {
            FCE.A00(AnonymousClass7TE.A0l(e4t.A08), AnonymousClass05K.A1F);
            C59689JTv.A07(e4t.requireContext(), 2131953579);
            0xY AR4 = AnonymousClass0xl.A00(C61170le.A00).A00.AR4();
            AR4.E5T(AnonymousClass000.A00(622), true);
            AR4.apply();
            return;
        }
        C59689JTv.A07(e4t.requireContext(), 2131953582);
    }
}
