package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.google.common.util.concurrent.ListenableFuture;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.DownloadedTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.io.File;
import java.util.Map;

public final class AXU implements MTQ {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ AnonymousClass8II A01;
    public final /* synthetic */ C357968a9 A02;
    public final /* synthetic */ C357968a9 A03;
    public final /* synthetic */ AnonymousClass8IJ A04;
    public final /* synthetic */ AudioOverlayTrack A05;
    public final /* synthetic */ 0sJ A06;

    public final void DSo(String str) {
    }

    public AXU(Context context, AnonymousClass8II r2, C357968a9 r3, C357968a9 r4, AnonymousClass8IJ r5, AudioOverlayTrack audioOverlayTrack, 0sJ r7) {
        this.A05 = audioOverlayTrack;
        this.A04 = r5;
        this.A01 = r2;
        this.A00 = context;
        this.A03 = r3;
        this.A02 = r4;
        this.A06 = r7;
    }

    /* JADX WARNING: type inference failed for: r21v0, types: [X.Q1d, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r25v1, types: [X.Q1d, java.lang.Object] */
    public final void DSp() {
        float f;
        Float f2;
        String str;
        File A052;
        ListenableFuture Eyk;
        AnonymousClass8IJ r8;
        String str2;
        File A053;
        MediaEffect mediaEffect;
        ListenableFuture Eyk2;
        AnonymousClass8IJ r1;
        AudioFilterType audioFilterType;
        AudioFilterType audioFilterType2;
        AudioOverlayTrack audioOverlayTrack = this.A05;
        DownloadedTrack downloadedTrack = audioOverlayTrack.A06;
        if (downloadedTrack != null) {
            AnonymousClass8IJ r5 = this.A04;
            AnonymousClass8II r4 = this.A01;
            Context context = this.A00;
            C357968a9 r19 = this.A03;
            C357968a9 r37 = this.A02;
            0sJ r11 = this.A06;
            if (r5 != null) {
                f = r5.A01;
            } else {
                f = 1.0f;
            }
            MediaEffect mediaEffect2 = null;
            if (r5 != null) {
                f2 = r5.A05;
            } else {
                f2 = null;
            }
            String str3 = downloadedTrack.A02;
            if (r5 == null || (audioFilterType2 = r5.A04) == null || (str = audioFilterType2.name()) == null) {
                str = "UNFILTERED";
            }
            String A0i = 002.A0i("full_", str3, str, '_');
            Map map = AnonymousClass8II.A0H;
            String str4 = (String) map.get(A0i);
            if (str4 == null || !AnonymousClass7TE.A0t(str4).exists()) {
                A052 = 0mb.A05(context);
            } else {
                A052 = AnonymousClass7TE.A0t(str4);
            }
            J6W j6w = new J6W(21, A052, r11, r4);
            if (str4 == null || AnonymousClass7TE.A0t(str4).length() <= 0) {
                if (r4.A0B) {
                    long j = (long) r4.A01;
                    long j2 = r4.A02;
                    StringBuilder A1A = AnonymousClass7TE.A1A();
                    A1A.append("preview_");
                    String str5 = downloadedTrack.A02;
                    A1A.append(str5);
                    A1A.append('_');
                    if (r5 == null || (audioFilterType = r5.A04) == null || (str2 = audioFilterType.name()) == null) {
                        str2 = "UNFILTERED";
                    }
                    A1A.append(str2);
                    A1A.append('_');
                    A1A.append(j);
                    A1A.append('_');
                    A1A.append(j2);
                    String obj = A1A.toString();
                    String str6 = (String) map.get(obj);
                    if (str6 == null || !AnonymousClass7TE.A0t(str6).exists()) {
                        A053 = 0mb.A05(context);
                    } else {
                        A053 = AnonymousClass7TE.A0t(str6);
                    }
                    J6W j6w2 = new J6W(22, A053, r11, r4);
                    if (str6 != null) {
                        j6w2.invoke(r5);
                    } else {
                        UserSession userSession = r4.A0F;
                        File A0t = AnonymousClass7TE.A0t(str5);
                        int i = r4.A01;
                        long j3 = (long) i;
                        long j4 = r4.A02;
                        MusicAssetModel musicAssetModel = r4.A07;
                        if (musicAssetModel != null) {
                            long j5 = (long) (musicAssetModel.A00 - i);
                            if (j4 > j5) {
                                j4 = j5;
                            }
                            AnonymousClass8IL A0E = r4.A0E();
                            if (A0E == null || (r1 = A0E.A01) == null) {
                                mediaEffect = null;
                            } else {
                                mediaEffect = r1.A00(context);
                            }
                            0qQ.A0A(A053);
                            STM A002 = SAL.A00(context, 0wj.A01, new Object(), mediaEffect, userSession, r19, A0t, A053, f2, f, j3, j4);
                            r4.A04 = A002;
                            if (r5 == null) {
                                Eyk2 = 1Ks.A01;
                            } else {
                                Eyk2 = r4.A0E.Eyk(new C13146TNe(2, A002, r5, audioOverlayTrack));
                            }
                            0qQ.A07(Eyk2);
                            r4.A06 = Eyk2;
                            C255183ti.A04(new T0R(A053, j6w2, obj, 3), Eyk2, AnonymousClass6OG.A01);
                        }
                        0qQ.A0F("musicAssetModel");
                        throw AnonymousClass00P.createAndThrow();
                    }
                }
                UserSession userSession2 = r4.A0F;
                File A0t2 = AnonymousClass7TE.A0t(downloadedTrack.A02);
                MusicAssetModel musicAssetModel2 = r4.A07;
                if (musicAssetModel2 != null) {
                    long j6 = (long) musicAssetModel2.A00;
                    AnonymousClass8IL A0E2 = r4.A0E();
                    if (!(A0E2 == null || (r8 = A0E2.A01) == null)) {
                        mediaEffect2 = r8.A00(context);
                    }
                    0qQ.A0A(A052);
                    STM A003 = SAL.A00(context, 0wj.A01, new Object(), mediaEffect2, userSession2, r37, A0t2, A052, f2, f, 0, j6);
                    r4.A03 = A003;
                    if (r5 == null) {
                        Eyk = 1Ks.A01;
                    } else {
                        Eyk = r4.A0E.Eyk(new C13146TNe(2, A003, r5, audioOverlayTrack));
                    }
                    0qQ.A07(Eyk);
                    r4.A05 = Eyk;
                    C255183ti.A04(new T0R(A052, j6w, A0i, 4), Eyk, AnonymousClass6OG.A01);
                    return;
                }
                0qQ.A0F("musicAssetModel");
                throw AnonymousClass00P.createAndThrow();
            }
            j6w.invoke(r5);
        }
    }
}
