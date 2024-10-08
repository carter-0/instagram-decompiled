package X;

import android.app.Application;
import android.content.Context;
import com.facebook.quicklog.reliability.CancelReason;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.MoreExecutors;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.common.session.UserSession;
import com.instagram.music.common.model.MusicAssetModel;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executors;

/* renamed from: X.8II  reason: invalid class name */
public final class AnonymousClass8II extends C361478gI {
    public static final Map A0H = new LinkedHashMap();
    public int A00;
    public int A01;
    public long A02 = 10000;
    public STM A03;
    public STM A04;
    public ListenableFuture A05;
    public ListenableFuture A06;
    public MusicAssetModel A07;
    public File A08;
    public File A09;
    public String A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D = true;
    public final C258483z9 A0E;
    public final UserSession A0F;
    public final 05G A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass8II(Application application, UserSession userSession) {
        super(application);
        0qQ.A0B(userSession, 2);
        this.A0F = userSession;
        C258483z9 listeningDecorator = MoreExecutors.listeningDecorator(Executors.newSingleThreadExecutor());
        0qQ.A07(listeningDecorator);
        this.A0E = listeningDecorator;
        AnonymousClass8IJ[] values = AnonymousClass8IJ.values();
        ArrayList<AnonymousClass8IJ> arrayList = new ArrayList<>();
        for (AnonymousClass8IJ r2 : values) {
            if (r2.A06 != AnonymousClass05K.A01 || AnonymousClass8IK.A03(this.A0F)) {
                arrayList.add(r2);
            }
        }
        ArrayList arrayList2 = new ArrayList(0Yv.A1E(arrayList, 10));
        for (AnonymousClass8IJ r5 : arrayList) {
            Integer num = AnonymousClass05K.A00;
            Application application2 = this.A00;
            0qQ.A0C(application2, "null cannot be cast to non-null type T of androidx.lifecycle.AndroidViewModel.getApplication");
            String string = application2.getString(r5.A03);
            boolean z = false;
            if (r5.A04 == AudioFilterType.UNRECOGNIZED) {
                z = true;
            }
            arrayList2.add(new AnonymousClass8IL(r5, num, string, 0, z));
        }
        this.A0G = new 02z(arrayList2);
    }

    public static final void A01(AnonymousClass8II r3, AnonymousClass8IJ r4) {
        int i = 0;
        if (r4 != null) {
            Iterator it = ((List) r3.A0G.getValue()).iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((AnonymousClass8IL) it.next()).A01 == r4) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
        }
        r3.A00(i, AnonymousClass05K.A00);
    }

    public final void A0G(Context context, C357968a9 r10, C357968a9 r11, AnonymousClass8IJ r12, 0sJ r13) {
        int i;
        if (r12 != null) {
            Iterator it = ((List) this.A0G.getValue()).iterator();
            i = 0;
            while (true) {
                if (it.hasNext()) {
                    if (((AnonymousClass8IL) it.next()).A01 == r12) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
        } else {
            i = 0;
        }
        A0H(context, r10, r11, r13, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x003f, code lost:
        if (r1 == com.instagram.api.schemas.AudioFilterType.A0A) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0H(android.content.Context r22, X.C357968a9 r23, X.C357968a9 r24, X.0sJ r25, int r26) {
        /*
            r21 = this;
            r5 = 0
            r15 = r21
            X.05G r1 = r15.A0G
            java.lang.Object r0 = r1.getValue()
            java.util.List r0 = (java.util.List) r0
            r9 = r26
            java.lang.Object r0 = r0.get(r9)
            X.8IL r0 = (X.AnonymousClass8IL) r0
            java.lang.Integer r0 = r0.A02
            java.lang.Integer r8 = X.AnonymousClass05K.A0C
            if (r0 == r8) goto L_0x00b5
            java.lang.String r0 = "cancel_switch_filter"
            r15.A0I(r0)
            r4 = 0
            r15.A09 = r4
            r15.A08 = r4
            java.lang.Object r0 = r1.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r3 = X.00k.A0O(r0, r9)
            X.8IL r3 = (X.AnonymousClass8IL) r3
            if (r3 == 0) goto L_0x00b5
            boolean r0 = r15.A0D
            r14 = 1
            if (r0 == 0) goto L_0x0041
            X.8IJ r0 = r3.A01
            if (r0 == 0) goto L_0x00b8
            com.instagram.api.schemas.AudioFilterType r1 = r0.A04
        L_0x003c:
            com.instagram.api.schemas.AudioFilterType r0 = com.instagram.api.schemas.AudioFilterType.UNRECOGNIZED
            r13 = 1
            if (r1 != r0) goto L_0x0042
        L_0x0041:
            r13 = 0
        L_0x0042:
            com.instagram.common.session.UserSession r2 = r15.A0F
            X.27r r0 = X.27p.A01(r2)
            X.29H r12 = r0.A03
            X.8IJ r3 = r3.A01
            if (r3 == 0) goto L_0x00b6
            java.lang.String r1 = r3.name()
            if (r1 == 0) goto L_0x00b6
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r7 = r1.toLowerCase(r0)
            X.0qQ.A07(r7)
        L_0x005d:
            X.29E r10 = r12.A0E
            r6 = 17634511(0x10d14cf, float:2.591254E-38)
            r0 = 60000(0xea60, double:2.9644E-319)
            long r0 = r10.A03(r6, r0)
            r12.A01 = r0
            java.lang.String r11 = "use_case"
            java.lang.String r6 = "music_editor_filter_selected"
            r10.A09(r0, r11, r6)
            long r0 = r12.A01
            if (r7 != 0) goto L_0x0078
            java.lang.String r7 = "none"
        L_0x0078:
            r6 = 4503(0x1197, float:6.31E-42)
            java.lang.String r6 = X.AnonymousClass000.A00(r6)
            r10.A09(r0, r6, r7)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r15.A00(r9, r0)
            r7 = r25
            if (r13 == 0) goto L_0x00c4
            r0 = 8
            X.GaB r6 = new X.GaB
            r6.<init>((int) r0, (java.lang.Object) r7, (java.lang.Object) r15)
            com.instagram.music.common.model.MusicAssetModel r4 = r15.A07
            if (r4 == 0) goto L_0x00ba
            int r0 = r4.A00
            com.instagram.music.common.model.AudioOverlayTrack r1 = new com.instagram.music.common.model.AudioOverlayTrack
            r1.<init>(r4, r5, r0)
            X.AXU r13 = new X.AXU
            r14 = r22
            r17 = r23
            r16 = r24
            r18 = r3
            r19 = r1
            r20 = r6
            r13.<init>(r14, r15, r16, r17, r18, r19, r20)
            X.LDf r0 = new X.LDf
            r0.<init>(r14, r13, r2, r1)
            r0.A00()
        L_0x00b5:
            return
        L_0x00b6:
            r7 = r4
            goto L_0x005d
        L_0x00b8:
            r1 = r4
            goto L_0x003c
        L_0x00ba:
            java.lang.String r0 = "musicAssetModel"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00c4:
            r15.A0F(r9, r8)
            X.27r r0 = X.27p.A01(r2)
            X.29H r2 = r0.A03
            if (r3 == 0) goto L_0x00f6
            java.lang.String r1 = r3.name()
            if (r1 == 0) goto L_0x00f6
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r0 = r1.toLowerCase(r0)
            X.0qQ.A07(r0)
        L_0x00de:
            r2.A06(r4, r0, r5)
            java.lang.String r2 = r15.A0A
            if (r3 == 0) goto L_0x00f4
            com.instagram.api.schemas.AudioFilterType r1 = r3.A04
        L_0x00e7:
            com.instagram.api.schemas.AudioFilterType r0 = com.instagram.api.schemas.AudioFilterType.UNRECOGNIZED
            if (r1 != r0) goto L_0x00ec
            r3 = r4
        L_0x00ec:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r14)
            r7.invoke(r2, r3, r4, r0)
            return
        L_0x00f4:
            r1 = r4
            goto L_0x00e7
        L_0x00f6:
            r0 = r4
            goto L_0x00de
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass8II.A0H(android.content.Context, X.8a9, X.8a9, X.0sJ, int):void");
    }

    private final void A00(int i, Integer num) {
        05G r2 = this.A0G;
        ArrayList A0U = 00k.A0U((Collection) r2.getValue());
        Object A0O = 00k.A0O(A0U, i);
        if (A0O != null) {
            AnonymousClass8IL A0E2 = A0E();
            if (A0E2 != null && !A0E2.equals(A0O)) {
                A0U.set(this.A00, new AnonymousClass8IL(A0E2.A01, AnonymousClass05K.A00, A0E2.A03, A0E2.A00, false));
            }
            this.A00 = i;
            AnonymousClass8IL r0 = (AnonymousClass8IL) A0U.get(i);
            A0U.set(i, new AnonymousClass8IL(r0.A01, num, r0.A03, r0.A00, true));
            r2.Epw(A0U);
        }
    }

    public final AnonymousClass8IL A0E() {
        return (AnonymousClass8IL) 00k.A0O((List) this.A0G.getValue(), this.A00);
    }

    public final void A0F(int i, Integer num) {
        05G r2 = this.A0G;
        ArrayList A0U = 00k.A0U((Collection) r2.getValue());
        AnonymousClass8IL r0 = (AnonymousClass8IL) A0U.get(i);
        Integer num2 = num;
        A0U.set(i, new AnonymousClass8IL(r0.A01, num2, r0.A03, r0.A00, r0.A04));
        r2.Epw(A0U);
    }

    public final void A0I(String str) {
        ListenableFuture listenableFuture;
        ListenableFuture listenableFuture2 = this.A05;
        if ((listenableFuture2 != null && !listenableFuture2.isDone()) || ((listenableFuture = this.A06) != null && !listenableFuture.isDone())) {
            29H r2 = 27p.A01(this.A0F).A03;
            r2.A01 = r2.A0E.A06(CancelReason.SYSTEM_CANCELLED, str, 17634511, r2.A01);
        }
        ListenableFuture listenableFuture3 = this.A06;
        if (listenableFuture3 != null) {
            listenableFuture3.cancel(true);
        }
        ListenableFuture listenableFuture4 = this.A05;
        if (listenableFuture4 != null) {
            listenableFuture4.cancel(true);
        }
        STM stm = this.A04;
        if (stm != null) {
            stm.A05();
        }
        STM stm2 = this.A03;
        if (stm2 != null) {
            stm2.A05();
        }
        this.A06 = null;
        this.A05 = null;
        this.A04 = null;
        this.A03 = null;
    }
}
