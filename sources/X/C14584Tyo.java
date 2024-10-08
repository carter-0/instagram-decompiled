package X;

import android.os.Bundle;
import java.util.Iterator;

/* renamed from: X.Tyo  reason: case insensitive filesystem */
public final class C14584Tyo implements C13907Tl7 {
    public final /* synthetic */ C18492Vsn A00;

    public C14584Tyo(C18492Vsn vsn) {
        this.A00 = vsn;
    }

    public final void onCreate(AnonymousClass07Z r4) {
        C16501Uvx valueOf;
        C18492Vsn vsn = this.A00;
        Bundle bundle = vsn.A03.mArguments;
        if (bundle != null) {
            String string = bundle.getString(AnonymousClass000.A00(1162));
            if (string == null || (valueOf = C16501Uvx.valueOf(string)) == null) {
                throw new IllegalStateException("Platform is missing from the bundle. Please check that 'cds_platform' field is set.");
            }
            vsn.A02 = valueOf;
            0eP A002 = C18492Vsn.A00(bundle, vsn, valueOf);
            vsn.A01 = (X5M) A002.A00;
            0h9 r1 = ((WE8) A002.A01).A00;
            vsn.A00 = r1;
            if (r1 == null) {
                0qQ.A0F("lifecycle");
                throw AnonymousClass00P.createAndThrow();
            } else {
                r1.A0C(07U.A01);
            }
        } else {
            throw new IllegalStateException("Arguments should not be null!");
        }
    }

    public final void onDestroy(AnonymousClass07Z r4) {
        Iterator A0v = AnonymousClass7TF.A0v(this.A00.A04);
        while (A0v.hasNext()) {
            ((WE8) JTO.A1A(A0v).A01).A00.A0C(07U.A02);
        }
    }

    public final void onPause(AnonymousClass07Z r3) {
        0h9 r1 = this.A00.A00;
        if (r1 == null) {
            0qQ.A0F("lifecycle");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r1.A0C(07U.A05);
        }
    }

    public final void onResume(AnonymousClass07Z r3) {
        0h9 r1 = this.A00.A00;
        if (r1 == null) {
            0qQ.A0F("lifecycle");
            throw AnonymousClass00P.createAndThrow();
        } else {
            r1.A0C(07U.A04);
        }
    }

    public final void onStart(AnonymousClass07Z r4) {
        Iterator A0v = AnonymousClass7TF.A0v(this.A00.A04);
        while (A0v.hasNext()) {
            ((WE8) ((0eP) A0v.next()).A01).A00.A0C(07U.A05);
        }
    }

    public final void onStop(AnonymousClass07Z r4) {
        Iterator A0v = AnonymousClass7TF.A0v(this.A00.A04);
        while (A0v.hasNext()) {
            ((WE8) JTO.A1A(A0v).A01).A00.A0C(07U.A01);
        }
    }
}
