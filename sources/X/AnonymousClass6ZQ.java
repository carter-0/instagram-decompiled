package X;

import androidx.fragment.app.Fragment;

/* renamed from: X.6ZQ  reason: invalid class name */
public final class AnonymousClass6ZQ implements 1wn {
    public final /* synthetic */ AnonymousClass6ZO A00;

    public AnonymousClass6ZQ(AnonymousClass6ZO r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int A03 = AnonymousClass0fD.A03(-1659205024);
        int A032 = AnonymousClass0fD.A03(1527213274);
        AnonymousClass6ZO r1 = this.A00;
        Fragment fragment = (Fragment) r1.A08.get();
        if (fragment == null || fragment.getContext() == null) {
            AnonymousClass0fD.A0A(-1463803415, A032);
            AnonymousClass0fD.A0A(-898943539, A03);
        } else if (r1.A00 == null) {
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        } else {
            throw new NullPointerException("getArchivePendingUpload");
        }
    }
}
