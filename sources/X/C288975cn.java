package X;

import android.os.Build;
import android.view.View;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.util.List;

/* renamed from: X.5cn  reason: invalid class name and case insensitive filesystem */
public final class C288975cn {
    public final View A00;
    public final Object A01;

    public static C288975cn A00(View view, ContentCaptureSession contentCaptureSession) {
        return new C288975cn(view, contentCaptureSession);
    }

    public final AutofillId A01(long j) {
        if (Build.VERSION.SDK_INT < 29) {
            return null;
        }
        return C290095ek.A02(this.A00.getAutofillId(), (ContentCaptureSession) this.A01, j);
    }

    public final C290105el A02(AutofillId autofillId, long j) {
        if (Build.VERSION.SDK_INT >= 29) {
            return new C290105el(C290095ek.A01(autofillId, (ContentCaptureSession) this.A01, j));
        }
        return null;
    }

    public final void A03(AutofillId autofillId, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 29) {
            C290095ek.A04(autofillId, (ContentCaptureSession) this.A01, charSequence);
        }
    }

    public final void A04(List list) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            C290165er.A00((ContentCaptureSession) this.A01, list);
        } else if (i >= 29) {
            ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.A01;
            View view = this.A00;
            ViewStructure A002 = C290095ek.A00(view, contentCaptureSession);
            A002.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            C290095ek.A03(A002, contentCaptureSession);
            for (int i2 = 0; i2 < list.size(); i2++) {
                C290095ek.A03((ViewStructure) list.get(i2), contentCaptureSession);
            }
            ViewStructure A003 = C290095ek.A00(view, contentCaptureSession);
            A003.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            C290095ek.A03(A003, contentCaptureSession);
        }
    }

    public final void A05(long[] jArr) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 34) {
            C290095ek.A05(this.A00.getAutofillId(), (ContentCaptureSession) this.A01, jArr);
        } else if (i >= 29) {
            ContentCaptureSession contentCaptureSession = (ContentCaptureSession) this.A01;
            View view = this.A00;
            ViewStructure A002 = C290095ek.A00(view, contentCaptureSession);
            A002.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARING", true);
            C290095ek.A03(A002, contentCaptureSession);
            C290095ek.A05(view.getAutofillId(), contentCaptureSession, jArr);
            ViewStructure A003 = C290095ek.A00(view, contentCaptureSession);
            A003.getExtras().putBoolean("TREAT_AS_VIEW_TREE_APPEARED", true);
            C290095ek.A03(A003, contentCaptureSession);
        }
    }

    public C288975cn(View view, ContentCaptureSession contentCaptureSession) {
        this.A01 = contentCaptureSession;
        this.A00 = view;
    }
}
