package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.captions.ClipsCaptionDataSource$special$$inlined$CoroutineExceptionHandler$1;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.CoroutineExceptionHandler;

/* renamed from: X.JjR  reason: case insensitive filesystem */
public final class C60322JjR extends 2YL implements C66540MVu {
    public float A00;
    public float A01;
    public LED A02;
    public AnonymousClass83F A03;
    public List A04;
    public List A05;
    public boolean A06;
    public final Context A07;
    public final AnonymousClass2Fj A08 = JTO.A0K();
    public final LOG A09;
    public final ClipsAudioStore A0A;
    public final ClipsCreationViewModel A0B;
    public final AnonymousClass07Z A0C;
    public final 2Fk A0D;
    public final UserSession A0E;
    public final C3507185x A0F;
    public final CoroutineExceptionHandler A0G = new ClipsCaptionDataSource$special$$inlined$CoroutineExceptionHandler$1(CoroutineExceptionHandler.Key, this);

    public C60322JjR(Context context, AnonymousClass07Z r9, UserSession userSession, LOG log, AnonymousClass83F r12, ClipsAudioStore clipsAudioStore, C3507185x r14, ClipsCreationViewModel clipsCreationViewModel) {
        AnonymousClass7TF.A1E(r14, 5, clipsAudioStore);
        this.A07 = context;
        this.A0E = userSession;
        this.A0C = r9;
        this.A0B = clipsCreationViewModel;
        this.A0F = r14;
        this.A09 = log;
        this.A0A = clipsAudioStore;
        this.A03 = r12;
        this.A00 = r14.A0E();
        ClipsAudioStore clipsAudioStore2 = r14.A01;
        AnonymousClass0Ud r5 = clipsAudioStore2.A0n;
        this.A01 = JTR.A03(r5);
        0sn r0 = 0sn.A00;
        this.A04 = r0;
        this.A05 = r0;
        Dba.A16(r9, clipsCreationViewModel.A0G, MP5.A00(this, 9), 67);
        JTS.A11(r9, MGV.A01(this, (AnonymousClass4D7) null, 3), clipsCreationViewModel.A0K.A0l);
        AnonymousClass0Ud r02 = clipsAudioStore2.A0k;
        19B r3 = 19B.A00;
        Dba.A16(r9, C226292g8.A00(r3, r02), MP5.A00(this, 10), 67);
        Dba.A16(r9, C226292g8.A00(r3, r5), MP5.A00(this, 11), 67);
        Dba.A16(r9, log.A00, JTO.A1C(this, 30), 67);
        this.A06 = true;
        this.A0D = JTO.A0K();
    }

    public final void EUl(String str, String str2) {
        0qQ.A0B(str, 0);
        C63155KsO.A00(this, str, str2);
        this.A09.A04.put(str, str2);
    }

    public final void FHa(Context context) {
    }

    public final void reset() {
        this.A02 = null;
        LOG log = this.A09;
        log.A05.clear();
        log.A06.clear();
        log.A04.clear();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006c, code lost:
        if (r5 != null) goto L_0x0070;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0099, code lost:
        if (X.LQE.A01(r0) == false) goto L_0x009b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AIS(android.content.Context r19) {
        /*
            r18 = this;
            r0 = r18
            X.LOG r10 = r0.A09
            java.util.List r1 = r0.A04
            java.util.List r2 = r0.A05
            X.AnonymousClass7TG.A1N(r1, r2)
            java.util.LinkedHashMap r8 = X.AnonymousClass7TE.A1H()
            java.util.LinkedHashMap r7 = X.AnonymousClass7TE.A1H()
            java.util.Map r0 = r10.A05
            java.util.List r1 = r10.A01(r1, r0, r8)
            java.util.Map r12 = r10.A06
            boolean r0 = r12.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0169
            java.util.ArrayList r9 = X.00k.A0U(r1)
            java.util.Iterator r17 = r2.iterator()
        L_0x002b:
            boolean r0 = r17.hasNext()
            if (r0 == 0) goto L_0x015f
            java.lang.Object r11 = r17.next()
            X.M1Y r11 = (X.M1Y) r11
            java.util.ArrayList r6 = X.AnonymousClass7TE.A1C()
            int r3 = r11.A03
            java.lang.Object r0 = r12.get(r11)
            X.JwF r0 = (X.C61077JwF) r0
            if (r0 == 0) goto L_0x006e
            java.lang.Object r0 = r0.A00
            java.util.List r0 = (java.util.List) r0
            if (r0 == 0) goto L_0x006e
            java.util.Iterator r2 = r0.iterator()
        L_0x004f:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L_0x0152
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.GNY r0 = (X.GNY) r0
            java.lang.Object r0 = r0.A01
            boolean r0 = X.G9w.A1b(r0)
            if (r0 == 0) goto L_0x004f
        L_0x0064:
            X.GNY r1 = (X.GNY) r1
            if (r1 == 0) goto L_0x006e
            java.lang.Object r5 = r1.A01
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L_0x0070
        L_0x006e:
            X.0sn r5 = X.0sn.A00
        L_0x0070:
            java.util.Iterator r13 = r5.iterator()
        L_0x0074:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x00af
            java.lang.Object r2 = r13.next()
            X.UOk r2 = (X.C15092UOk) r2
            r2.A03 = r3
            java.util.Map r4 = r10.A04
            java.lang.String r0 = r2.A05
            boolean r0 = r4.containsKey(r0)
            if (r0 == 0) goto L_0x009b
            java.lang.String r0 = r2.A05
            java.lang.String r0 = X.DbT.A11(r0, r4)
            if (r0 == 0) goto L_0x009b
            boolean r0 = X.LQE.A01(r0)
            r1 = 1
            if (r0 != 0) goto L_0x009c
        L_0x009b:
            r1 = 0
        L_0x009c:
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x00ac
            java.lang.String r0 = r2.A05
            boolean r0 = r4.containsKey(r0)
            if (r0 != 0) goto L_0x00ac
        L_0x00a8:
            X.JTU.A1B(r2, r6)
            goto L_0x0074
        L_0x00ac:
            if (r1 == 0) goto L_0x0074
            goto L_0x00a8
        L_0x00af:
            boolean r0 = X.AnonymousClass7TE.A1b(r5)
            if (r0 == 0) goto L_0x0122
            java.util.Iterator r3 = r5.iterator()
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x012a
            r4 = 0
        L_0x00c0:
            java.lang.String r16 = "Required value was null."
            if (r4 == 0) goto L_0x015a
            X.UOk r4 = (X.C15092UOk) r4
            java.util.Iterator r15 = r5.iterator()
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0155
            java.lang.Object r3 = r15.next()
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x0102
            r13 = r3
            X.UOk r13 = (X.C15092UOk) r13
            int r0 = r13.A02
            float r1 = (float) r0
            float r0 = r13.A01
            float r1 = r1 / r0
            int r2 = (int) r1
            int r0 = r13.A03
            int r2 = r2 + r0
        L_0x00e7:
            java.lang.Object r14 = r15.next()
            r13 = r14
            X.UOk r13 = (X.C15092UOk) r13
            int r0 = r13.A02
            float r1 = (float) r0
            float r0 = r13.A01
            float r1 = r1 / r0
            int r1 = (int) r1
            int r0 = r13.A03
            int r1 = r1 + r0
            if (r2 >= r1) goto L_0x00fc
            r3 = r14
            r2 = r1
        L_0x00fc:
            boolean r0 = r15.hasNext()
            if (r0 != 0) goto L_0x00e7
        L_0x0102:
            if (r3 == 0) goto L_0x0155
            X.UOk r3 = (X.C15092UOk) r3
            int r4 = r4.A01()
            int r0 = r3.A02
            float r1 = (float) r0
            float r0 = r3.A01
            float r1 = r1 / r0
            int r2 = (int) r1
            int r0 = r3.A03
            int r2 = r2 + r0
            X.2HY r1 = new X.2HY
            r1.<init>(r4, r2)
            r0 = 12
            X.MP5 r0 = X.MP5.A00(r1, r0)
            X.018.A1A(r9, r0)
        L_0x0122:
            r9.addAll(r5)
            r7.put(r11, r6)
            goto L_0x002b
        L_0x012a:
            java.lang.Object r4 = r3.next()
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x00c0
            r0 = r4
            X.UOk r0 = (X.C15092UOk) r0
            int r2 = r0.A01()
        L_0x013b:
            java.lang.Object r1 = r3.next()
            r0 = r1
            X.UOk r0 = (X.C15092UOk) r0
            int r0 = r0.A01()
            if (r2 <= r0) goto L_0x014a
            r4 = r1
            r2 = r0
        L_0x014a:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L_0x013b
            goto L_0x00c0
        L_0x0152:
            r1 = 0
            goto L_0x0064
        L_0x0155:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x015a:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r16)
            throw r0
        L_0x015f:
            r1 = 9
            X.MAY r0 = new X.MAY
            r0.<init>(r1)
            X.00k.A0g(r9, r0)
        L_0x0169:
            X.2Fj r1 = r10.A01
            X.83F r0 = new X.83F
            r0.<init>(r8, r7)
            r1.A0A(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60322JjR.AIS(android.content.Context):void");
    }

    public final void AUS(Context context) {
        AnonymousClass831 A0K = JTQ.A0K(this.A0B);
        if (A0K == null || !A0K.A01.isEmpty()) {
            if (this.A02 == null) {
                C306576Mr r1 = C306576Mr.DISABLED;
                List list = 0sn.A00;
                this.A02 = new LED(r1, (Integer) null, (Integer) null, "", AnonymousClass7TE.A1E(), list, list, 0, 0, -1);
            }
            1Eo.A05(this.A0G, new C66183MGu(this, (AnonymousClass4D7) null, 36), AnonymousClass07a.A00(this.A0C));
        }
    }

    public final 2Fk Ag2() {
        return this.A0D;
    }

    public final LED BJn() {
        return this.A02;
    }

    public final 2Fk C85() {
        return this.A08;
    }

    public final int C8i(Context context) {
        Iterator it = this.A04.iterator();
        int i = 0;
        while (it.hasNext()) {
            AnonymousClass51R r0 = JTO.A0g(it).A0F;
            i += r0.A02 - r0.A03;
        }
        return i;
    }

    public final void AHT() {
        AnonymousClass83F r3 = new AnonymousClass83F(AnonymousClass7TE.A1H(), AnonymousClass7TE.A1H());
        ClipsAudioStore clipsAudioStore = this.A0A;
        clipsAudioStore.A0I.Epw(r3);
        clipsAudioStore.A0J.Epw(r3.A00);
        clipsAudioStore.A0R.Epw(r3.A01);
        this.A03 = r3;
        LOG log = this.A09;
        log.A05.clear();
        log.A06.clear();
        log.A04.clear();
    }

    public final void Ead(LED led) {
        this.A02 = led;
    }
}
