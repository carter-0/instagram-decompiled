package X;

import android.content.Context;
import android.text.TextUtils;

public final class FV8 implements AnonymousClass0iw, C61110lV {
    public static FV8 A02 = null;
    public static final String __redex_internal_original_name = "FacebookSessionStore";
    public Context A00;
    public C376149Gs A01;

    public final String A01(0lg r3, String str, String str2) {
        C376149Gs r0;
        C376159Gt r02;
        0qQ.A0B(r3, 0);
        if ((!AJ0.A04(str, str2, new C368198sE(r3, (String) null))) || (r0 = this.A01) == null || (r02 = r0.A00) == null) {
            return null;
        }
        return r02.A01;
    }

    public final String A02(0lg r3, String str, String str2) {
        C376149Gs r0;
        0qQ.A0B(r3, 0);
        if ((!AJ0.A04(str, str2, new C368198sE(r3, (String) null))) || (r0 = this.A01) == null) {
            return null;
        }
        return r0.A02;
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.0lV, java.lang.Object, X.FV8] */
    public static synchronized FV8 A00() {
        FV8 fv8;
        synchronized (FV8.class) {
            FV8 fv82 = A02;
            fv8 = fv82;
            if (fv82 == null) {
                Context context = C60960kU.A00;
                ? obj = new Object();
                obj.A00 = context;
                14i.A08.A0A(obj);
                AnonymousClass2XD.A00(context);
                A02 = obj;
                fv8 = obj;
            }
        }
        return fv8;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.1xE, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v4, types: [X.EHY, X.11X] */
    public final void A03(0lg r3, C46634DiE diE) {
        if (this.A01 != null || !AnonymousClass1G3.A04(this.A00)) {
            1xC.A01.A00(new Object());
        } else {
            1ES.A03(new EHY(r3, this, diE));
        }
    }

    public final boolean A04(0lg r2, String str, String str2) {
        return !TextUtils.isEmpty(A02(r2, str, str2));
    }

    public final void onAppBackgrounded() {
        int A03 = AnonymousClass0fD.A03(1545735477);
        this.A01 = null;
        AnonymousClass0fD.A0A(-863540580, A03);
    }

    public final void onAppForegrounded() {
        AnonymousClass0fD.A0A(189128367, AnonymousClass0fD.A03(391739263));
    }
}
