package X;

import com.facebook.stash.core.Stash;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.io.File;
import java.lang.ref.WeakReference;

/* renamed from: X.2jF  reason: invalid class name */
public final class AnonymousClass2jF implements Runnable {
    public final /* synthetic */ Stash A00;
    public final /* synthetic */ AnonymousClass1LE A01;
    public final /* synthetic */ 1L7 A02;
    public final /* synthetic */ File A03;
    public final /* synthetic */ File A04;

    public AnonymousClass2jF(Stash stash, AnonymousClass1LE r2, 1L7 r3, File file, File file2) {
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = file;
        this.A04 = file2;
        this.A00 = stash;
    }

    public final void run() {
        AnonymousClass1BJ A002 = AnonymousClass1F2.A00();
        AnonymousClass1LE r0 = this.A01;
        String str = r0.A05;
        1Lh r7 = new 1Lh(r0.A01, r0.A02, str);
        AnonymousClass1BN r8 = A002.A00;
        File file = this.A03;
        1Fd r02 = new 1Fd(str);
        r02.A00(r7);
        1Fi.A00(r8, r02, file);
        File file2 = this.A04;
        1Fd r5 = new 1Fd(002.A0R(str, "-dirty"));
        r5.A00(new 1LH((1Ff) null, new 1Fg(SandboxRepository.CACHE_TTL, false), "file", 002.A0R(str, "-dirty")));
        1Fi.A00(r8, r5, file2);
        r7.A00 = new WeakReference(this.A00);
    }
}
