package X;

import android.app.Application;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.creation.persistence.CreationDatabase;
import com.instagram.creation.persistence.CreationDatabase_Impl;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.roomdb.IgRoomDatabase;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.KMt  reason: case insensitive filesystem */
public final class C61805KMt extends C60098Jfe {
    public int A00;
    public int A01;
    public boolean A02;
    public final int A03;
    public final ClipsCreationViewModel A04;
    public final AnonymousClass8RL A05;
    public final AnonymousClass8RF A06;
    public final AnonymousClass2NQ A07;
    public final String A08;
    public final C62320sa A09;
    public final C249513ju A0A;
    public final AnonymousClass0r6 A0B;
    public final AnonymousClass0r6 A0C;
    public final 05G A0D;
    public final C61770pa A0E = this.A03;
    public final C3501583m A0F;
    public final 05G A0G;
    public final AnonymousClass0Ud A0H;

    public C61805KMt(Application application, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel, AnonymousClass8RL r10, AnonymousClass8RF r11, String str, C62320sa r13, int i, boolean z) {
        super(application, userSession, new MMR(clipsCreationViewModel, 41), z);
        AnonymousClass2NQ r0;
        this.A04 = clipsCreationViewModel;
        this.A06 = r11;
        this.A05 = r10;
        this.A03 = i;
        this.A09 = r13;
        this.A08 = str;
        this.A01 = i / 2;
        this.A00 = i / 2;
        AnonymousClass2MY r2 = CreationDatabase.A00;
        IgRoomDatabase igRoomDatabase = (IgRoomDatabase) userSession.A00(CreationDatabase.class);
        if (igRoomDatabase == null) {
            synchronized (r2) {
                igRoomDatabase = JTT.A0h(userSession, r2);
            }
        }
        CreationDatabase_Impl creationDatabase_Impl = (CreationDatabase_Impl) ((CreationDatabase) igRoomDatabase);
        if (creationDatabase_Impl.A00 != null) {
            r0 = creationDatabase_Impl.A00;
        } else {
            synchronized (creationDatabase_Impl) {
                if (creationDatabase_Impl.A00 == null) {
                    creationDatabase_Impl.A00 = new AnonymousClass2NQ(creationDatabase_Impl);
                }
                r0 = creationDatabase_Impl.A00;
            }
        }
        this.A07 = r0;
        02z A1J = JTO.A1J();
        this.A0G = A1J;
        this.A0H = A1J;
        02z A012 = 106.A01((Object) null);
        this.A0D = A012;
        this.A0B = MC9.A00(A012, 32);
        1HR A0w = G9w.A0w();
        this.A0A = A0w;
        this.A0C = 0u9.A04(A0w);
        this.A0F = clipsCreationViewModel.A0Q;
        1Eo.A05(JTR.A0j(3), new MG0(this, (AnonymousClass4D7) null, 26), C318116oQ.A00(this));
    }

    public final void A0Q(AnonymousClass8RH r5) {
        LTY lty;
        int i;
        int i2;
        0qQ.A0B(r5, 0);
        if (!(r5 instanceof AnonymousClass8RY) || !0qQ.A0K(this.A08, MediaStreamTrack.AUDIO_TRACK_KIND)) {
            if (!(r5 instanceof C355748Rf) || !0qQ.A0K(this.A08, MediaStreamTrack.AUDIO_TRACK_KIND)) {
                if (!(r5 instanceof C355758Rg) || !0qQ.A0K(this.A08, "voice_over")) {
                    if (!(r5 instanceof C355708Ra) && !(r5 instanceof C355798Rk) && !(r5 instanceof C355828Rn)) {
                        A0H();
                        return;
                    }
                    return;
                } else if (r5 instanceof AnonymousClass8RZ) {
                    lty = this.A01;
                    C355758Rg r52 = (C355758Rg) r5;
                    i = r52.A01;
                    i2 = r52.A00;
                } else {
                    return;
                }
            } else if (r5 instanceof AnonymousClass8RZ) {
                lty = this.A01;
                C355748Rf r53 = (C355748Rf) r5;
                i = r53.A01;
                i2 = r53.A00;
            } else {
                return;
            }
            lty.A0P(i, i2, false);
            A0J(i, i2);
            return;
        }
        LTY lty2 = this.A01;
        AnonymousClass8RY r54 = (AnonymousClass8RY) r5;
        int i3 = r54.A01;
        lty2.A0P(i3, r54.A00, true);
        A0I(i3);
    }

    public final void A0R(List list) {
        C355758Rg r1;
        0qQ.A0B(list, 0);
        LTY lty = this.A01;
        Context A0P = JTR.A0P(this);
        int A072 = JTO.A07(this.A04);
        LTY.A07(lty);
        05G r5 = lty.A08;
        do {
        } while (!JTS.A1Z(r5));
        Iterator it = list.iterator();
        loop1:
        while (true) {
            boolean z = true;
            while (true) {
                if (!it.hasNext()) {
                    break loop1;
                }
                M1Y m1y = (M1Y) it.next();
                0qQ.A0B(m1y, 1);
                int i = m1y.A01;
                int i2 = m1y.A00;
                if (i >= 0 && i <= i2) {
                    if (JTR.A0J(r5) == 0) {
                        lty.A0M();
                    }
                    int A0J = JTR.A0J(r5) - 1;
                    if (LTY.A00(LTY.A04(A0P, m1y, A072), lty, A0J, false) == -1) {
                        lty.A0M();
                        if (LTY.A00(LTY.A04(A0P, m1y, A072), lty, A0J + 1, false) == -1) {
                            continue;
                        }
                    }
                    if (z) {
                    }
                }
                z = false;
            }
        }
        AnonymousClass8RH A0E2 = this.A06.A0E();
        if ((A0E2 instanceof C355758Rg) && (r1 = (C355758Rg) A0E2) != null) {
            lty.A0R(r1.A01, r1.A00, true);
        }
        A0G();
    }

    public static final void A00(C61805KMt kMt, AudioOverlayTrack audioOverlayTrack, String str, List list) {
        C355748Rf r2;
        AnonymousClass8RY r22;
        int i;
        Object value;
        String str2;
        C61805KMt kMt2 = kMt;
        LTY lty = kMt2.A01;
        if (0qQ.A0K(str, lty.A02)) {
            Context A0P = JTR.A0P(kMt2);
            int A072 = JTO.A07(kMt2.A04);
            AudioOverlayTrack audioOverlayTrack2 = audioOverlayTrack;
            0qQ.A0B(audioOverlayTrack2, 1);
            05G r11 = lty.A08;
            int i2 = 0;
            int i3 = -1;
            int i4 = -1;
            boolean z = false;
            for (Object next : JTO.A0x(r11)) {
                int i5 = i2 + 1;
                if (i2 >= 0) {
                    Iterator it = ((AbstractCollection) next).iterator();
                    int i6 = 0;
                    while (it.hasNext()) {
                        Object next2 = it.next();
                        int i7 = i6 + 1;
                        if (i6 >= 0) {
                            C61194Jyn jyn = (C61194Jyn) next2;
                            C60997Jut jut = jyn.A08;
                            if (jut != null) {
                                str2 = jut.A08;
                            } else {
                                str2 = null;
                            }
                            if (0qQ.A0K(str2, audioOverlayTrack2.A0D)) {
                                z = jyn.A0D;
                                i4 = i6;
                                i3 = i2;
                            }
                            i6 = i7;
                        }
                    }
                    i2 = i5;
                }
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            List list2 = list;
            if (i3 == -1 || i4 == -1) {
                int i8 = audioOverlayTrack2.A04;
                int i9 = A072;
                int i10 = audioOverlayTrack2.A01;
                if (i10 != 0) {
                    i9 = i10;
                }
                if (i8 >= 0 && i8 < i9) {
                    i3 = lty.A0E(LTY.A02(A0P, lty, audioOverlayTrack2, list2, A072, false));
                    if (i3 != -1) {
                        AnonymousClass8RF r7 = kMt2.A06;
                        AnonymousClass8RH A0E2 = r7.A0E();
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                do {
                    value = r11.getValue();
                    ((AbstractList) ((AbstractList) r11.getValue()).get(i3)).set(i4, LTY.A02(A0P, lty, audioOverlayTrack2, list2, A072, z));
                } while (!r11.AIY(value, value));
            }
            AnonymousClass8RF r72 = kMt2.A06;
            AnonymousClass8RH A0E22 = r72.A0E();
            if ((A0E22 instanceof AnonymousClass8RY) && (r22 = (AnonymousClass8RY) A0E22) != null && i3 == (i = r22.A01)) {
                lty.A0P(i, r22.A00, true);
            }
            AnonymousClass8RH A0E3 = r72.A0E();
            if ((A0E3 instanceof C355748Rf) && (r2 = (C355748Rf) A0E3) != null) {
                lty.A0R(r2.A01, r2.A00, true);
            }
            kMt2.A0I(i3);
        }
    }

    public final C61194Jyn A0M(int i, int i2) {
        List list = (List) 00k.A0O(JTO.A17(this.A01.A0A), i);
        if (list != null) {
            return (C61194Jyn) 00k.A0O(list, i2);
        }
        return null;
    }

    public final String A0N() {
        C60997Jut jut;
        C61194Jyn A0F2 = this.A01.A0F();
        if (A0F2 == null) {
            return null;
        }
        int ordinal = A0F2.A09.ordinal();
        if (ordinal == 6) {
            return A0F2.A0B;
        }
        if (ordinal != 5 || (jut = A0F2.A08) == null) {
            return null;
        }
        return jut.A08;
    }

    public final void A0P(int i, int i2, boolean z) {
        Iterator it = this.A01.A0J((0sK) null, i, i2, z, true, false, this.A04.A0K.A0F()).iterator();
        while (it.hasNext()) {
            A0I(AnonymousClass7TG.A0F(it));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r20 != false) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0U(int r15, int r16, int r17, boolean r18, boolean r19, boolean r20) {
        /*
            r14 = this;
            r12 = r18
            r2 = r20
            if (r18 == 0) goto L_0x0009
            r0 = 1
            if (r20 == 0) goto L_0x000a
        L_0x0009:
            r0 = 0
        L_0x000a:
            r7 = r14
            r14.A02 = r0
            X.LTY r4 = r14.A01
            int r3 = X.JTS.A03(r4)
            boolean r0 = r4.A0V(r15, r3)
            r11 = 0
            if (r0 == 0) goto L_0x009b
            r5 = 1
            r9 = r16
            r10 = r17
            r13 = r19
            if (r18 != 0) goto L_0x0073
            java.lang.String r1 = r14.A08
            java.lang.String r0 = "voice_over"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0059
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r14.A04
            X.83m r1 = r0.A0Q
            if (r20 == 0) goto L_0x0056
            X.8d5 r0 = X.C359548d5.VOICEOVER_DRAG
        L_0x0035:
            r1.A01(r0)
            if (r19 == 0) goto L_0x003d
            if (r20 != 0) goto L_0x003d
            r11 = 1
        L_0x003d:
            X.Jyn r0 = r4.A0G(r15, r3)
            java.lang.String r0 = r0.A0B
            r14.A0S(r11, r0)
        L_0x0046:
            r11 = 0
            X.6oS r0 = X.C318116oQ.A00(r14)
            r8 = 0
            X.MEj r6 = new X.MEj
            r12 = r11
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.AnonymousClass7TE.A1Z(r6, r0)
            return r5
        L_0x0056:
            X.8d5 r0 = X.C359548d5.VOICEOVER_TRIM
            goto L_0x0035
        L_0x0059:
            java.lang.String r0 = "audio"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0046
            com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel r0 = r14.A04
            X.83m r1 = r0.A0Q
            if (r20 == 0) goto L_0x0070
            X.8d5 r0 = X.C359548d5.AUDIO_DRAG
        L_0x0069:
            r1.A01(r0)
            r14.A0T(r2, r11)
            goto L_0x0046
        L_0x0070:
            X.8d5 r0 = X.C359548d5.AUDIO_TRIM
            goto L_0x0069
        L_0x0073:
            java.util.List r2 = r4.A0I(r15, r3, r9, r10)
            java.util.Iterator r1 = r2.iterator()
        L_0x007b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0089
            int r0 = X.AnonymousClass7TG.A0F(r1)
            r14.A0I(r0)
            goto L_0x007b
        L_0x0089:
            X.6oS r0 = X.C318116oQ.A00(r14)
            r8 = 0
            X.MEj r6 = new X.MEj
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)
            X.AnonymousClass7TE.A1Z(r6, r0)
            boolean r5 = X.AnonymousClass7TE.A1b(r2)
            return r5
        L_0x009b:
            r5 = 0
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61805KMt.A0U(int, int, int, boolean, boolean, boolean):boolean");
    }

    public final void A0O(int i) {
        String str;
        AudioOverlayTrack A012;
        C60997Jut jut;
        Integer valueOf = Integer.valueOf(i);
        ClipsCreationViewModel clipsCreationViewModel = this.A04;
        C61194Jyn A0F2 = this.A01.A0F();
        if (A0F2 == null || (jut = A0F2.A08) == null) {
            str = null;
        } else {
            str = jut.A08;
        }
        ClipsAudioStore clipsAudioStore = clipsCreationViewModel.A0K;
        clipsCreationViewModel.A0E();
        clipsAudioStore.A02 = true;
        AudioOverlayTrack A032 = clipsAudioStore.A03(str);
        if ((A032 != null || (A032 = (AudioOverlayTrack) ((C361278fx) clipsAudioStore.A0Y.getValue()).A01) != null) && (A012 = ClipsAudioStore.A01(new C376509Ig((Boolean) null, valueOf, (Integer) null, (Integer) null, 8), clipsAudioStore, A032)) != null) {
            clipsAudioStore.A09(new AnonymousClass8Y4(A012), A032);
        }
    }

    public final void A0S(boolean z, String str) {
        int intValue;
        Integer num;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator A1H = C51966G9m.A1H(this.A01.A0A.getValue());
        while (A1H.hasNext()) {
            Iterator A1H2 = C51966G9m.A1H(A1H.next());
            while (true) {
                if (A1H2.hasNext()) {
                    C61194Jyn jyn = (C61194Jyn) A1H2.next();
                    if (!z || !0qQ.A0K(str, jyn.A0B)) {
                        num = null;
                    } else {
                        Iterator A1H3 = C51966G9m.A1H(this.A04.A0K.A0S.getValue());
                        while (A1H3.hasNext()) {
                            M1Y m1y = (M1Y) A1H3.next();
                            if (0qQ.A0K(m1y.A06, str)) {
                                num = Integer.valueOf((m1y.A05 + jyn.A05) - m1y.A03);
                            }
                        }
                        throw new NoSuchElementException("Collection contains no element matching the predicate.");
                    }
                    AnonymousClass7TF.A1I(jyn.A0B, new C61084JwM(num, Integer.valueOf(jyn.A05), Integer.valueOf(jyn.A02), 15), A1C);
                }
            }
        }
        ClipsAudioStore clipsAudioStore = this.A04.A0K;
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        Iterator it = A1C.iterator();
        while (it.hasNext()) {
            0eP A1A = JTO.A1A(it);
            Object obj = A1A.A00;
            List list = clipsAudioStore.A0C;
            Iterator it2 = list.iterator();
            int i = 0;
            while (true) {
                if (it2.hasNext()) {
                    if (0qQ.A0K(((M1Y) it2.next()).A06, obj)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            Integer valueOf = Integer.valueOf(i);
            if (valueOf != null && (intValue = valueOf.intValue()) < list.size()) {
                C61084JwM jwM = (C61084JwM) A1A.A01;
                Number number = (Number) jwM.A02;
                Number number2 = (Number) jwM.A00;
                Number number3 = (Number) jwM.A01;
                M1Y A002 = ((M1Y) list.get(intValue)).A00();
                0qQ.A0C(A002, AnonymousClass000.A00(1630));
                if (number != null) {
                    A002.A03 = number.intValue();
                }
                if (number2 != null) {
                    A002.A02 = number2.intValue();
                }
                if (number3 != null) {
                    A002.A05 = number3.intValue();
                }
                A1C2.add(A002);
            }
        }
        List list2 = clipsAudioStore.A0C;
        list2.clear();
        list2.addAll(A1C2);
        clipsAudioStore.A0S.Epw(C59798JYr.A00(list2, ClipsAudioStore.A00(clipsAudioStore)));
    }

    public final void A0T(boolean z, boolean z2) {
        String str;
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator A1H = C51966G9m.A1H(this.A01.A0A.getValue());
        while (A1H.hasNext()) {
            Iterator A1H2 = C51966G9m.A1H(A1H.next());
            while (true) {
                if (A1H2.hasNext()) {
                    C61194Jyn jyn = (C61194Jyn) A1H2.next();
                    int i = jyn.A02;
                    if (i == JTO.A07(this.A04)) {
                        i = 0;
                    }
                    if (jyn.A0A != AnonymousClass05K.A0j) {
                        C60997Jut jut = jyn.A08;
                        if (!(jut == null || (str = jut.A08) == null)) {
                            int i2 = jyn.A05;
                            Integer num = null;
                            if (z || z2) {
                                num = Integer.valueOf(jut.A04);
                            }
                            AnonymousClass7TF.A1I(str, new C376509Ig((Boolean) null, num, Integer.valueOf(i2), Integer.valueOf(i), 8), A1C);
                        }
                    } else {
                        return;
                    }
                }
            }
        }
        ClipsCreationViewModel clipsCreationViewModel = this.A04;
        ClipsAudioStore clipsAudioStore = clipsCreationViewModel.A0K;
        clipsCreationViewModel.A0E();
        clipsAudioStore.A0D(A1C);
    }
}
