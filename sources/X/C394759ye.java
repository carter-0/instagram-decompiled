package X;

import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.google.common.collect.ImmutableList;
import com.instagram.music.common.model.AudioOverlayTrack;

/* renamed from: X.9ye  reason: invalid class name and case insensitive filesystem */
public abstract class C394759ye {
    public static final C349307zv A00(AnonymousClass51M r20) {
        long currentTimeMillis = System.currentTimeMillis();
        AnonymousClass51M r4 = r20;
        AnonymousClass51R r6 = r4.A0F;
        int i = r6.A07;
        C349307zv r7 = new C349307zv(AnonymousClass7TE.A0t(r6.A0F), (Integer) null, r6.A0D, 1080, 1920, i, currentTimeMillis, currentTimeMillis, false, AnonymousClass7TF.A1P(r6.A08), true);
        r7.A19 = true;
        r7.A0v = AnonymousClass7TE.A1I(AEK.A00(r4, (AudioOverlayTrack) null, 0));
        ImmutableList of = ImmutableList.of(AnonymousClass51Q.A03(AnonymousClass51M.A00((GTT) null, r4, (AnonymousClass51R) null, 0.0f, 0, r4.A0F.A04, 0, 0, 1073741799)));
        0qQ.A07(of);
        ImmutableList of2 = ImmutableList.of();
        0qQ.A07(of2);
        0sn r12 = 0sn.A00;
        ImmutableList of3 = ImmutableList.of();
        AnonymousClass7TG.A1S(r12, of3);
        C41724AzF azF = C41724AzF.A00;
        0qQ.A0B(azF, 2);
        r7.A0O = new MediaComposition(AHK.A00((C365998o1) null, (C366518pA) null, of2, of, of3, (C357608Yw) null, r12, r12, azF, 1.0f, 0.5625f, 0, true, false));
        return r7;
    }
}
