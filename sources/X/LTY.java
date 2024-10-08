package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.facebook.catalyst.modules.cameraroll.CameraRollManager;
import com.instagram.creation.capture.quickcapture.sundial.tts.intf.VoiceOption;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class LTY {
    public static final 0eP A0C;
    public int A00;
    public LC0 A01;
    public String A02;
    public 0eP A03;
    public 0eP A04;
    public final HashMap A05;
    public final 01W A06;
    public final 05G A07;
    public final 05G A08;
    public final AnonymousClass0Ud A09;
    public final AnonymousClass0Ud A0A;
    public final boolean A0B;

    public static final C61193Jym A01(Context context, C268714ds r6) {
        int i;
        Integer CAk;
        C268714ds r2 = r6;
        C2802350v BzV = r6.BzV();
        if (!(BzV == null || (CAk = BzV.CAk()) == null)) {
            switch (CAk.intValue()) {
                case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                case 25:
                case 26:
                    i = 2131955898;
                    break;
                case CameraRollManager.IMAGES_MEDIA_LATITUDE_LONGITUDE_DEPRECATED_API_LEVEL:
                    i = 2131955895;
                    break;
                case 32:
                    i = 2131955899;
                    break;
                case 33:
                    i = 2131955900;
                    break;
                case 36:
                    i = 2131955901;
                    break;
            }
        }
        i = 2131955896;
        return new C61193Jym(C62529KhL.INTERACTIVE_STICKER, r2, AnonymousClass05K.A00, AnonymousClass7TE.A16(context, i), 0, false);
    }

    public static final void A08(LTY lty, ArrayList arrayList, HashSet hashSet, int i, int i2) {
        LTY lty2 = lty;
        int i3 = i;
        int i4 = i2;
        if (lty.A0V(i3, i4)) {
            C61194Jyn A0G = lty.A0G(i3, i4);
            int i5 = i + 1;
            05G r1 = lty.A08;
            HashSet hashSet2 = hashSet;
            if (i5 == JTR.A0J(r1)) {
                lty.A0M();
            } else if (i5 < JTR.A0J(r1)) {
                int i6 = A0G.A05;
                int i7 = A0G.A02;
                if (A0D(lty, i5, i6, i7)) {
                    int i8 = 0;
                    while (i8 < JTQ.A04(lty, i5)) {
                        C61194Jyn A0G2 = lty.A0G(i5, i8);
                        int i9 = A0G2.A05;
                        int i10 = A0G2.A02;
                        if (i9 < i7 && i10 > i6) {
                            A08(lty, arrayList, hashSet2, i5, i8);
                            i8--;
                        }
                        i8++;
                    }
                }
            }
            int A002 = A00(A0G, lty, i5, false);
            A0C(A0G, lty2, i3, false, true);
            AnonymousClass7TF.A1M(hashSet2, i3);
            AnonymousClass7TF.A1M(hashSet2, i5);
            String str = A0G.A0B;
            lty2.A09(str, i3, i4, i5, A002);
            if (arrayList != null) {
                arrayList.add(new C53387GnJ(str, i5, A002));
            }
        }
    }

    public static final boolean A0D(LTY lty, int i, int i2, int i3) {
        if (i >= 0 && i < JTR.A0J(lty.A08)) {
            for (C61194Jyn jyn : lty.A0H(i)) {
                int i4 = jyn.A05;
                int i5 = jyn.A02;
                if (i4 < i3 && i5 > i2) {
                    return true;
                }
            }
        }
        return false;
    }

    public final 0eP A0L(String str) {
        0qQ.A0B(str, 0);
        Iterator A15 = JTR.A15(this.A0A);
        int i = 0;
        while (A15.hasNext()) {
            Object next = A15.next();
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            List list = (List) next;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                if (0qQ.A0K(((C61194Jyn) next2).A0B, str)) {
                    if (next2 != null) {
                        return AnonymousClass7TF.A0x(Integer.valueOf(i), list.indexOf(next2));
                    }
                }
            }
            i = i2;
        }
        return null;
    }

    public final boolean A0U(int i) {
        return i >= 0 && i < JTR.A0J(this.A07);
    }

    public final boolean A0V(int i, int i2) {
        if (i < 0) {
            return false;
        }
        05G r1 = this.A08;
        return i < JTR.A0J(r1) && i2 >= 0 && i2 < ((AbstractCollection) ((AbstractList) r1.getValue()).get(i)).size();
    }

    public final boolean A0W(Context context, AnonymousClass5MI r13) {
        int B1e;
        0qQ.A0B(context, 0);
        int Byn = r13.Byn();
        int B1e2 = r13.B1e();
        if (Byn < 0 || Byn >= B1e2 || (r13.AfT() instanceof AnonymousClass9XK)) {
            return false;
        }
        05G r8 = this.A08;
        if (JTR.A0J(r8) == 0) {
            A0M();
        }
        List A17 = JTO.A17(this.A0A);
        int size = A17.size();
        int i = 0;
        loop0:
        while (true) {
            if (i >= size) {
                i = JTR.A0J(r8) - 1;
                break;
            }
            int size2 = ((Collection) A17.get(i)).size();
            int i2 = 0;
            while (i2 < size2) {
                C61194Jyn jyn = (C61194Jyn) C51966G9m.A19(A17.get(i), i2);
                int i3 = jyn.A05;
                int Byn2 = r13.Byn();
                if ((i3 > Byn2 || jyn.A02 <= Byn2) && (jyn.A05 >= (B1e = r13.B1e()) || jyn.A02 < B1e)) {
                    i2++;
                } else {
                    i++;
                }
            }
            break loop0;
        }
        if (A00(A03(context, r13), this, i, false) == -1) {
            A0M();
            if (A00(A03(context, r13), this, i + 1, false) != -1) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean A0X(C61194Jyn jyn) {
        0qQ.A0B(jyn, 0);
        int A0J = JTR.A0J(this.A08);
        for (int i = 0; i < A0J; i++) {
            int A042 = JTQ.A04(this, i);
            for (int i2 = 0; i2 < A042; i2++) {
                if (jyn.equals(A0G(i, i2))) {
                    return A0C(A0G(i, i2), this, i, true, true);
                }
            }
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0048, code lost:
        if (r0 >= r4) goto L_0x004a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(X.C61194Jyn r9, X.LTY r10, int r11, boolean r12) {
        /*
            X.05G r6 = r10.A08
            int r0 = X.JTR.A0J(r6)
            r3 = -1
            if (r11 >= r0) goto L_0x00bf
            int r5 = r9.A05
            int r4 = r9.A02
            int r0 = X.JTR.A0J(r6)
            r2 = -1
            if (r11 >= r0) goto L_0x0031
            r1 = 0
        L_0x0015:
            int r0 = X.JTQ.A04(r10, r11)
            if (r1 >= r0) goto L_0x004a
            X.Jyn r7 = r10.A0G(r11, r1)
            X.KhL r8 = r7.A09
            X.KhL r0 = X.C62529KhL.VOICEOVER
            if (r8 != r0) goto L_0x0034
            X.Jut r0 = r7.A08
            if (r0 == 0) goto L_0x0034
            java.lang.Boolean r0 = r0.A06
            boolean r0 = X.DbX.A1a(r0)
            if (r0 == 0) goto L_0x0034
        L_0x0031:
            if (r2 != r3) goto L_0x004c
            return r2
        L_0x0034:
            int r0 = r7.A05
            if (r0 > r5) goto L_0x0044
            int r0 = r7.A02
            if (r0 > r5) goto L_0x003f
            int r1 = r1 + 1
            goto L_0x0015
        L_0x003f:
            int r0 = r7.A02
            if (r0 < r5) goto L_0x0044
            goto L_0x0031
        L_0x0044:
            int r0 = r7.A05
            if (r0 < r5) goto L_0x0015
            if (r0 < r4) goto L_0x0031
        L_0x004a:
            r2 = r1
            goto L_0x0031
        L_0x004c:
            X.0eP r0 = r10.A04
            X.0eP r5 = A0C
            boolean r0 = X.0qQ.A0K(r0, r5)
            if (r0 != 0) goto L_0x0072
            int r0 = X.JTR.A0E(r10)
            if (r11 != r0) goto L_0x0072
            int r0 = X.JTS.A03(r10)
            if (r2 > r0) goto L_0x0072
            X.0eP r0 = r10.A04
            java.lang.Object r1 = r0.A00
            int r0 = X.C51969G9p.A0A(r0)
            int r0 = r0 + 1
            X.0eP r0 = X.AnonymousClass7TF.A0x(r1, r0)
            r10.A04 = r0
        L_0x0072:
            int r0 = X.JTR.A0J(r6)
            if (r11 >= r0) goto L_0x00bf
        L_0x0078:
            java.lang.Object r4 = r6.getValue()
            r3 = r4
            java.util.AbstractList r3 = (java.util.AbstractList) r3
            if (r11 < 0) goto L_0x00bd
            int r0 = X.JTR.A0J(r6)
            if (r11 >= r0) goto L_0x00bd
            java.util.AbstractList r1 = X.JTO.A12(r3, r11)
            X.Jyn r0 = r9.A04(r12)
            r1.add(r2, r0)
            boolean r0 = r6.AIY(r4, r3)
            if (r0 == 0) goto L_0x0078
            r1 = 1
            if (r12 == 0) goto L_0x009f
            r10.A0R(r11, r2, r1)
        L_0x009e:
            return r2
        L_0x009f:
            X.0eP r0 = r10.A04
            boolean r0 = X.C51966G9m.A1a(r0, r5)
            if (r0 == 0) goto L_0x009e
            int r0 = X.JTR.A0E(r10)
            if (r11 != r0) goto L_0x009e
            int r0 = X.JTS.A03(r10)
            if (r2 >= r0) goto L_0x009e
            int r0 = X.JTS.A03(r10)
            int r0 = r0 + 1
            r10.A0R(r11, r0, r1)
            return r2
        L_0x00bd:
            r2 = -1
            return r2
        L_0x00bf:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LTY.A00(X.Jyn, X.LTY, int, boolean):int");
    }

    public static final C61194Jyn A02(Context context, LTY lty, AudioOverlayTrack audioOverlayTrack, List list, int i, boolean z) {
        String A16;
        Integer num;
        Integer num2;
        float f;
        AudioOverlayTrack audioOverlayTrack2 = audioOverlayTrack;
        String str = audioOverlayTrack2.A0D;
        C62529KhL khL = C62529KhL.MUSIC;
        List list2 = list;
        boolean A1V = AnonymousClass7TF.A1V(list2);
        MusicAssetModel musicAssetModel = audioOverlayTrack2.A08;
        Context context2 = context;
        if (!A1V) {
            A16 = C51967G9n.A0p(context2, 2131955830);
        } else {
            int i2 = 2131955834;
            if (lty.A0B) {
                i2 = 2131953730;
            }
            String A162 = AnonymousClass7TE.A16(context2, i2);
            if (musicAssetModel != null) {
                A16 = JTR.A14(A162, new Object[]{musicAssetModel.A0I, musicAssetModel.A0D}, 2);
            } else {
                A16 = AnonymousClass7TE.A16(context2, 2131955835);
            }
        }
        int i3 = audioOverlayTrack2.A04;
        int i4 = audioOverlayTrack2.A01;
        int i5 = i4;
        int i6 = i;
        if (i4 == 0) {
            i5 = i6;
        }
        if (list != null) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A0Y;
        }
        int i7 = audioOverlayTrack2.A03;
        int i8 = audioOverlayTrack2.A02;
        int i9 = i8;
        String str2 = audioOverlayTrack2.A0D;
        MusicAssetModel musicAssetModel2 = audioOverlayTrack2.A08;
        if (musicAssetModel2 != null) {
            i8 = musicAssetModel2.A00;
        }
        AnonymousClass8IJ r4 = audioOverlayTrack2.A05;
        if (r4 != null) {
            num2 = Integer.valueOf(r4.A03);
            f = r4.A01;
        } else {
            num2 = null;
            f = 1.0f;
        }
        return new C61194Jyn((C61080JwI) null, (N49) null, new C60997Jut(false, num2, str2, list2, f, i6, i7, i9, i8, 0), khL, num, str, A16, i3, i5, i3, i4, 0, 0, z, false);
    }

    public static final C61194Jyn A03(Context context, AnonymousClass5MI r18) {
        String valueOf;
        N49 n49;
        int i;
        AnonymousClass5MI r3 = r18;
        String id = r3.getId();
        C62529KhL CAX = r3.CAX();
        int ordinal = r3.CAX().ordinal();
        if (ordinal == 0 || ordinal == 4) {
            valueOf = String.valueOf(r3.C4k());
        } else {
            if (ordinal != 3) {
                i = 2131955896;
            } else {
                Drawable AfT = r3.AfT();
                0qQ.A0C(AfT, "null cannot be cast to non-null type com.instagram.creation.capture.quickcapture.karaoke.view.common.KaraokeCaptionStickerDrawable");
                valueOf = DbT.A0z(" ", ((AnonymousClass5MM) AfT).A05().A07, C66334MNr.A00);
                if (00l.A0W(valueOf)) {
                    i = 2131955897;
                }
            }
            valueOf = AnonymousClass7TE.A16(context, i);
        }
        int Byn = r3.Byn();
        int B1e = r3.B1e();
        VoiceOption voiceOption = (VoiceOption) r3.CAA().A01;
        if (voiceOption != null) {
            String str = voiceOption.A02;
            String str2 = voiceOption.A00;
            if (!(str == null || str2 == null)) {
                n49 = new N49(str, str2, 23);
                return new C61194Jyn(new C61080JwI((Object) r3, 31), n49, (C60997Jut) null, CAX, AnonymousClass05K.A00, id, valueOf, Byn, B1e, Byn, B1e, 0, 0, false, false);
            }
        }
        n49 = null;
        return new C61194Jyn(new C61080JwI((Object) r3, 31), n49, (C60997Jut) null, CAX, AnonymousClass05K.A00, id, valueOf, Byn, B1e, Byn, B1e, 0, 0, false, false);
    }

    public static final C61194Jyn A04(Context context, M1Y m1y, int i) {
        String string;
        M1Y m1y2 = m1y;
        String str = m1y2.A06;
        if (str == null) {
            str = "";
        }
        C62529KhL khL = C62529KhL.VOICEOVER;
        int i2 = m1y2.A04;
        Context context2 = context;
        if (i2 > 0) {
            string = DbW.A0h(context2, Integer.valueOf(i2), 2131955861);
        } else {
            string = context2.getString(2131955860);
        }
        0qQ.A0A(string);
        int i3 = m1y2.A03;
        int i4 = m1y2.A02;
        List list = m1y2.A07;
        int i5 = m1y2.A05;
        int i6 = m1y2.A00 - m1y2.A01;
        return new C61194Jyn((C61080JwI) null, (N49) null, new C60997Jut(Boolean.valueOf(m1y2.A08), (Integer) null, "", list, 1.0f, i, i5, i4 - i3, i6, 0), khL, AnonymousClass05K.A00, str, string, i3, i4, i3, i4, 0, 0, false, false);
    }

    public static final void A06(LTY lty) {
        Object value;
        AbstractList abstractList;
        int i = lty.A00;
        05G r3 = lty.A07;
        do {
            value = r3.getValue();
            abstractList = (AbstractList) value;
            if (lty.A0U(i)) {
                C61193Jym jym = (C61193Jym) abstractList.get(i);
                Integer num = AnonymousClass05K.A00;
                C62529KhL khL = jym.A02;
                String str = jym.A04;
                C268714ds r7 = jym.A00;
                int i2 = jym.A01;
                AnonymousClass7TG.A1N(khL, str);
                0qQ.A0B(num, 4);
                abstractList.set(i, new C61193Jym(khL, r7, num, str, i2, false));
            } else {
                return;
            }
        } while (!r3.AIY(value, abstractList));
        lty.A00 = -1;
    }

    private final void A09(String str, int i, int i2, int i3, int i4) {
        AbstractList abstractList;
        C53387GnJ gnJ;
        int i5;
        HashMap hashMap = this.A05;
        Iterator it = hashMap.keySet().iterator();
        while (it.hasNext()) {
            Object A0a = AnonymousClass7TF.A0a(it);
            AbstractList abstractList2 = (AbstractList) hashMap.get(A0a);
            if (abstractList2 != null) {
                int size = abstractList2.size();
                for (int i6 = 0; i6 < size; i6++) {
                    if (!0qQ.A0K(((C53387GnJ) abstractList2.get(i6)).A02, str)) {
                        int i7 = ((C53387GnJ) abstractList2.get(i6)).A01;
                        C53387GnJ gnJ2 = (C53387GnJ) abstractList2.get(i6);
                        if (i7 == i3) {
                            if (i4 <= gnJ2.A00 && (abstractList = (AbstractList) hashMap.get(A0a)) != null) {
                                gnJ = (C53387GnJ) abstractList2.get(i6);
                                i5 = ((C53387GnJ) abstractList2.get(i6)).A00 + 1;
                            }
                        } else if (gnJ2.A01 == i && i2 < ((C53387GnJ) abstractList2.get(i6)).A00 && (abstractList = (AbstractList) hashMap.get(A0a)) != null) {
                            gnJ = (C53387GnJ) abstractList2.get(i6);
                            i5 = ((C53387GnJ) abstractList2.get(i6)).A00 - 1;
                        }
                        String str2 = gnJ.A02;
                        int i8 = gnJ.A01;
                        0qQ.A0B(str2, 0);
                        abstractList.set(i6, new C53387GnJ(str2, i8, i5));
                    }
                }
            }
        }
    }

    private final void A0A(HashSet hashSet, AnonymousClass59G r19) {
        HashMap hashMap = this.A05;
        ArrayList arrayList = (ArrayList) hashMap.get(r19);
        if (arrayList != null) {
            while (DbT.A1b(arrayList)) {
                HashSet hashSet2 = hashSet;
                AnonymousClass7TF.A1M(hashSet2, ((C53387GnJ) 00k.A0K(arrayList)).A01);
                AnonymousClass7TF.A1M(hashSet2, ((C53387GnJ) 00k.A0K(arrayList)).A01 - 1);
                int i = ((C53387GnJ) 00k.A0K(arrayList)).A01;
                int i2 = ((C53387GnJ) 00k.A0K(arrayList)).A00;
                if (A0V(i, i2)) {
                    C61194Jyn A0G = A0G(i, i2);
                    int i3 = i - 1;
                    int A002 = A00(A0G, this, i3, false);
                    if (A002 != -1) {
                        A0C(A0G, this, i, false, true);
                        A09(A0G.A0B, i, i2, i3, A002);
                        if (i3 == JTR.A0E(this) && A002 <= JTS.A03(this)) {
                            A0R(i3, JTS.A03(this) + 1, true);
                        }
                    } else if (i3 >= 0 && i3 < JTR.A0J(this.A08)) {
                        int i4 = 0;
                        int A042 = JTQ.A04(this, i3);
                        while (true) {
                            if (i4 >= A042) {
                                break;
                            }
                            C61194Jyn A0G2 = A0G(i3, i4);
                            int i5 = A0G.A05;
                            int i6 = A0G.A02;
                            int i7 = A0G2.A05;
                            int i8 = A0G2.A02;
                            if (i7 >= i6 || i8 <= i5) {
                                i4++;
                            } else if (i4 != -1) {
                                Iterator it = hashMap.keySet().iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    Object A0a = AnonymousClass7TF.A0a(it);
                                    AbstractCollection abstractCollection = (AbstractCollection) hashMap.get(A0a);
                                    if (abstractCollection != null) {
                                        Iterator A1G = AnonymousClass7TE.A1G(abstractCollection);
                                        while (A1G.hasNext()) {
                                            C53387GnJ gnJ = (C53387GnJ) AnonymousClass7TF.A0a(A1G);
                                            if (gnJ.A01 == i3 && gnJ.A00 == i4) {
                                                Object obj = hashMap.get(A0a);
                                                0qQ.A0C(obj, "null cannot be cast to non-null type java.util.ArrayList<com.instagram.creation.capture.quickcapture.sundial.edit.model.TimedElementsStore.RevertableElementShift>");
                                                ((AbstractList) obj).add(0, new C53387GnJ(gnJ.A02, i, i2));
                                                break;
                                            }
                                        }
                                        continue;
                                    }
                                }
                            }
                        }
                    }
                }
                arrayList.remove(00k.A0K(arrayList));
            }
        }
    }

    public static final boolean A0C(C61194Jyn jyn, LTY lty, int i, boolean z, boolean z2) {
        int i2;
        Object value;
        AbstractList abstractList;
        05G r3 = lty.A08;
        if (i < JTR.A0J(r3)) {
            i2 = 0;
            int A042 = JTQ.A04(lty, i);
            while (true) {
                if (i2 < A042) {
                    if (0qQ.A0K(jyn.A0B, lty.A0G(i, i2).A0B)) {
                        break;
                    }
                    i2++;
                } else {
                    break;
                }
            }
        }
        i2 = -1;
        if (i2 != -1) {
            0eP r0 = lty.A04;
            0eP r6 = A0C;
            if (C51966G9m.A1a(r0, r6) && JTR.A0E(lty) == i && JTS.A03(lty) == i2 && lty.A0V(i, i2) && lty.A0G(i, i2).A0D) {
                lty.A04 = r6;
            }
            boolean z3 = false;
            do {
                value = r3.getValue();
                abstractList = (AbstractList) value;
                if (lty.A0V(i, i2)) {
                    JTO.A12(abstractList, i).remove(i2);
                    z3 = true;
                }
            } while (!r3.AIY(value, abstractList));
            if (z3) {
                if (C51966G9m.A1a(lty.A04, r6) && JTR.A0E(lty) == i && i2 < JTS.A03(lty)) {
                    lty.A0R(JTR.A0E(lty), JTS.A03(lty) - 1, true);
                }
                if (lty.A0H(i).isEmpty() && ((i == JTR.A0J(r3) - 1 && z2) || z)) {
                    lty.A0N(i);
                }
                return true;
            }
        }
        return false;
    }

    public final int A0E(C61194Jyn jyn) {
        05G r1 = this.A08;
        if (JTR.A0J(r1) == 0) {
            A0M();
        }
        int A0J = JTR.A0J(r1) - 1;
        if (A00(jyn, this, A0J, false) != -1) {
            return A0J;
        }
        A0M();
        int i = A0J + 1;
        if (A00(jyn, this, i, false) == -1) {
            return -1;
        }
        return i;
    }

    public final C61194Jyn A0F() {
        if (!C51966G9m.A1a(this.A04, A0C)) {
            return null;
        }
        return A0G(JTR.A0E(this), JTS.A03(this));
    }

    public final C61194Jyn A0G(int i, int i2) {
        return (C61194Jyn) C51966G9m.A19(C51966G9m.A19(this.A0A.getValue(), i), i2);
    }

    public final List A0H(int i) {
        return (List) C51966G9m.A19(this.A0A.getValue(), i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:48:0x011c, code lost:
        if (r4.A0A != X.AnonymousClass05K.A0j) goto L_0x011e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0126, code lost:
        if (r4.A0A != X.AnonymousClass05K.A15) goto L_0x0128;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0146, code lost:
        if (r3 > r1) goto L_0x0148;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A0J(X.0sK r31, int r32, int r33, boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            r30 = this;
            if (r35 != 0) goto L_0x0007
            if (r32 != 0) goto L_0x0007
            X.0sn r0 = X.0sn.A00
            return r0
        L_0x0007:
            java.util.HashSet r16 = X.AnonymousClass7TE.A1F()
            int r7 = r33 + r32
            r8 = r30
            X.05G r0 = r8.A08
            r29 = r0
            int r0 = X.JTR.A0J(r29)
            int r6 = r0 + -1
        L_0x0019:
            r2 = -1
            if (r2 >= r6) goto L_0x020e
            java.util.List r0 = r8.A0H(r6)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x00d2
            r11 = 0
            int r0 = X.JTQ.A04(r8, r6)
            if (r34 == 0) goto L_0x0205
            X.2HY r0 = X.C229632nm.A0C(r11, r0)
        L_0x0031:
            int r10 = r0.A00
            int r9 = r0.A01
            int r5 = r0.A02
            if (r5 <= 0) goto L_0x00ff
            if (r10 <= r9) goto L_0x0103
        L_0x003b:
            if (r37 == 0) goto L_0x0076
            java.util.List r0 = r8.A0H(r6)
            java.lang.Object r2 = X.00k.A0L(r0)
            X.Jyn r2 = (X.C61194Jyn) r2
            if (r2 == 0) goto L_0x00fc
            X.KhL r1 = r2.A09
        L_0x004b:
            X.KhL r0 = X.C62529KhL.MUSIC
            if (r1 != r0) goto L_0x0076
            int r1 = r2.A02
            int r0 = r7 + -100
            if (r1 >= r0) goto L_0x0076
            r17 = 0
            int r0 = r2.A02
            r27 = 32647(0x7f87, float:4.5748E-41)
            r18 = r17
            r19 = r17
            r20 = r2
            r21 = r17
            r22 = r17
            r23 = r0
            r24 = r7
            r25 = r0
            r26 = r7
            r28 = r11
            X.Jyn r0 = X.C61194Jyn.A00(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            r8.A0E(r0)
        L_0x0076:
            if (r34 == 0) goto L_0x00f2
            r2 = 0
        L_0x0079:
            java.util.List r0 = r8.A0H(r6)
            java.lang.Object r0 = r0.get(r2)
            X.Jyn r0 = (X.C61194Jyn) r0
            int r1 = r0.A05
            java.util.List r0 = r8.A0H(r6)
            java.lang.Object r0 = r0.get(r2)
            X.Jyn r0 = (X.C61194Jyn) r0
            int r0 = r0.A02
            boolean r0 = r8.A0B(r6, r2, r1, r0)
            if (r0 == 0) goto L_0x00d2
            X.Jyn r0 = r8.A0G(r6, r2)
            X.KhL r1 = r0.A09
            X.KhL r0 = X.C62529KhL.MUSIC
            boolean r1 = X.AnonymousClass7TF.A1W(r1, r0)
            X.LC0 r0 = r8.A01
            if (r0 == 0) goto L_0x00aa
            r0.A00(r6)
        L_0x00aa:
            if (r1 == 0) goto L_0x00d6
            if (r37 == 0) goto L_0x00d6
            java.util.List r0 = r8.A0H(r6)
            int r3 = X.C51966G9m.A06(r0)
        L_0x00b6:
            java.lang.Object r2 = r29.getValue()
            r1 = r2
            java.util.AbstractList r1 = (java.util.AbstractList) r1
            boolean r0 = r8.A0V(r6, r3)
            if (r0 == 0) goto L_0x00ca
            java.util.AbstractList r0 = X.JTO.A12(r1, r6)
            r0.remove(r3)
        L_0x00ca:
            r0 = r29
            boolean r0 = r0.AIY(r2, r1)
            if (r0 == 0) goto L_0x00b6
        L_0x00d2:
            int r6 = r6 + -1
            goto L_0x0019
        L_0x00d6:
            java.util.List r0 = r8.A0H(r6)
            java.lang.Object r0 = r0.get(r2)
            X.Jyn r0 = (X.C61194Jyn) r0
            int r1 = r0.A05
            java.util.List r0 = r8.A0H(r6)
            java.lang.Object r0 = r0.get(r2)
            X.Jyn r0 = (X.C61194Jyn) r0
            int r0 = r0.A02
            r8.A05(r6, r2, r1, r0)
            goto L_0x00d2
        L_0x00f2:
            java.util.List r0 = r8.A0H(r6)
            int r2 = X.C51966G9m.A06(r0)
            goto L_0x0079
        L_0x00fc:
            r1 = 0
            goto L_0x004b
        L_0x00ff:
            if (r5 >= 0) goto L_0x003b
            if (r9 > r10) goto L_0x003b
        L_0x0103:
            X.Jyn r4 = r8.A0G(r6, r10)
            X.KhL r1 = r4.A09
            X.KhL r0 = X.C62529KhL.MUSIC
            boolean r13 = X.AnonymousClass7TF.A1W(r1, r0)
            X.KhL r0 = X.C62529KhL.TEXT
            boolean r3 = X.AnonymousClass7TF.A1W(r1, r0)
            if (r13 == 0) goto L_0x011e
            java.lang.Integer r1 = r4.A0A
            java.lang.Integer r0 = X.AnonymousClass05K.A0j
            r2 = 1
            if (r1 == r0) goto L_0x011f
        L_0x011e:
            r2 = 0
        L_0x011f:
            if (r3 == 0) goto L_0x0128
            java.lang.Integer r1 = r4.A0A
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            r12 = 1
            if (r1 == r0) goto L_0x0129
        L_0x0128:
            r12 = 0
        L_0x0129:
            if (r36 != 0) goto L_0x0139
            if (r34 != 0) goto L_0x0139
            int r0 = r4.A03
            if (r0 > r7) goto L_0x0139
            if (r13 != 0) goto L_0x0139
            if (r12 != 0) goto L_0x0139
        L_0x0135:
            if (r10 == r9) goto L_0x003b
            int r10 = r10 + r5
            goto L_0x0103
        L_0x0139:
            r0 = r16
            X.AnonymousClass7TF.A1M(r0, r6)
            if (r13 == 0) goto L_0x018d
            if (r37 == 0) goto L_0x018d
            int r3 = r4.A04
            int r1 = r7 + -100
            if (r3 <= r1) goto L_0x0149
        L_0x0148:
            r3 = r1
        L_0x0149:
            int r0 = r4.A03
            if (r0 != 0) goto L_0x018a
            X.Jut r0 = r4.A08
            if (r0 == 0) goto L_0x018a
            X.Jut r0 = r4.A08
            int r0 = r0.A02
        L_0x0155:
            if (r13 == 0) goto L_0x015f
            if (r37 == 0) goto L_0x015f
            r2 = r7
        L_0x015a:
            if (r35 != 0) goto L_0x01ac
            if (r12 == 0) goto L_0x01ac
            goto L_0x0135
        L_0x015f:
            if (r12 != 0) goto L_0x016f
            if (r2 != 0) goto L_0x016f
            if (r13 == 0) goto L_0x0181
            X.Jut r1 = r4.A08
            if (r1 == 0) goto L_0x017c
            int r2 = r4.A03
            int r1 = r1.A02
            if (r2 != r1) goto L_0x017c
        L_0x016f:
            r1 = 1
        L_0x0170:
            r2 = r7
            if (r34 == 0) goto L_0x0183
            int r0 = r0 + r32
            r1 = 100
            int r2 = X.0mi.A03(r0, r1, r7)
            goto L_0x015a
        L_0x017c:
            int r1 = r4.A03
            if (r1 != 0) goto L_0x0181
            goto L_0x016f
        L_0x0181:
            r1 = 0
            goto L_0x0170
        L_0x0183:
            if (r1 != 0) goto L_0x015a
            if (r0 <= r7) goto L_0x0188
            r0 = r7
        L_0x0188:
            r2 = r0
            goto L_0x015a
        L_0x018a:
            int r0 = r4.A03
            goto L_0x0155
        L_0x018d:
            int r1 = r4.A04
            if (r12 != 0) goto L_0x0199
            if (r2 != 0) goto L_0x0199
            if (r13 == 0) goto L_0x01a4
            int r0 = r4.A04
            if (r0 != 0) goto L_0x01a4
        L_0x0199:
            r0 = 1
        L_0x019a:
            if (r34 == 0) goto L_0x01a6
            if (r0 != 0) goto L_0x0148
            int r1 = r1 + r32
            if (r1 >= r11) goto L_0x0148
            r1 = 0
            goto L_0x0148
        L_0x01a4:
            r0 = 0
            goto L_0x019a
        L_0x01a6:
            int r0 = r7 + -100
            if (r1 <= r0) goto L_0x0148
            r1 = r0
            goto L_0x0148
        L_0x01ac:
            X.Jut r0 = r4.A08
            if (r0 == 0) goto L_0x01b7
            int r0 = r0.A03
            int r0 = r0 + r3
            int r2 = java.lang.Math.min(r2, r0)
        L_0x01b7:
            if (r35 != 0) goto L_0x01ca
            r13 = r31
            if (r31 == 0) goto L_0x01ca
            java.lang.String r12 = r4.A0B
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            r13.invoke(r12, r1, r0)
        L_0x01ca:
            java.lang.Object r12 = r29.getValue()
            r1 = r12
            java.util.AbstractList r1 = (java.util.AbstractList) r1
            boolean r0 = r8.A0V(r6, r10)
            if (r0 == 0) goto L_0x01ec
            java.util.AbstractList r15 = X.JTO.A12(r1, r6)
            if (r35 == 0) goto L_0x01f6
            X.Jyn r14 = X.JTS.A0L(r1, r6, r10)
            int r13 = r4.A04
            int r0 = r4.A03
            X.Jyn r0 = r14.A03(r3, r2, r13, r0)
        L_0x01e9:
            r15.set(r10, r0)
        L_0x01ec:
            r0 = r29
            boolean r0 = r0.AIY(r12, r1)
            if (r0 == 0) goto L_0x01ca
            goto L_0x0135
        L_0x01f6:
            java.util.AbstractList r0 = X.JTO.A12(r1, r6)
            java.lang.Object r0 = r0.get(r10)
            X.Jyn r0 = (X.C61194Jyn) r0
            X.Jyn r0 = r0.A03(r3, r2, r3, r2)
            goto L_0x01e9
        L_0x0205:
            int r1 = r0 + -1
            X.2HZ r0 = new X.2HZ
            r0.<init>(r1, r11, r2)
            goto L_0x0031
        L_0x020e:
            if (r35 == 0) goto L_0x0268
            X.01W r4 = r8.A06
            java.lang.Object r3 = r4.A0R()
            X.59G r3 = (X.AnonymousClass59G) r3
            if (r3 == 0) goto L_0x0259
            java.lang.Object r6 = r3.A00
            java.lang.Number r6 = (java.lang.Number) r6
            int r5 = r6.intValue()
            java.lang.Object r0 = r3.A01
            int r2 = X.AnonymousClass7TE.A0M(r0)
            if (r34 == 0) goto L_0x0262
            int r2 = r2 + r32
            int r2 = X.C51970G9q.A07(r2, r2)
        L_0x0230:
            java.lang.Object r0 = r3.A02
            int r1 = X.AnonymousClass7TE.A0M(r0)
            if (r34 == 0) goto L_0x025e
            int r1 = r1 + r32
            r0 = 100
            int r1 = X.0mi.A03(r1, r0, r7)
        L_0x0240:
            boolean r0 = A0D(r8, r5, r2, r1)
            if (r0 != 0) goto L_0x0259
            X.LC0 r1 = r8.A01
            if (r1 == 0) goto L_0x0251
            int r0 = r6.intValue()
            r1.A00(r0)
        L_0x0251:
            r0 = r16
            r8.A0A(r0, r3)
            r4.removeLast()
        L_0x0259:
            java.util.List r0 = X.00k.A0a(r16)
            return r0
        L_0x025e:
            if (r1 <= r7) goto L_0x0240
            r1 = r7
            goto L_0x0240
        L_0x0262:
            int r0 = r7 + -100
            if (r2 <= r0) goto L_0x0230
            r2 = r0
            goto L_0x0230
        L_0x0268:
            java.util.HashMap r0 = r8.A05
            r0.clear()
            X.01W r0 = r8.A06
            r0.clear()
            goto L_0x0259
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LTY.A0J(X.0sK, int, int, boolean, boolean, boolean, boolean):java.util.List");
    }

    public final 0eP A0K(AnonymousClass5MI r9) {
        Object obj;
        Iterator A15 = JTR.A15(this.A0A);
        int i = 0;
        while (A15.hasNext()) {
            Object next = A15.next();
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            List list = (List) next;
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next2 = it.next();
                C61080JwI jwI = ((C61194Jyn) next2).A06;
                if (jwI != null) {
                    obj = jwI.A00;
                } else {
                    obj = null;
                }
                if (0qQ.A0K(obj, r9)) {
                    if (next2 != null) {
                        return AnonymousClass7TF.A0x(Integer.valueOf(i), list.indexOf(next2));
                    }
                }
            }
            i = i2;
        }
        return null;
    }

    public final void A0M() {
        Object value;
        AbstractCollection abstractCollection;
        05G r3 = this.A08;
        do {
            value = r3.getValue();
            abstractCollection = (AbstractCollection) value;
            abstractCollection.add(AnonymousClass7TE.A1C());
        } while (!r3.AIY(value, abstractCollection));
    }

    public final void A0N(int i) {
        Object value;
        AbstractList abstractList;
        05G r5 = this.A08;
        do {
            value = r5.getValue();
            abstractList = (AbstractList) value;
            if (i >= 0 && i < JTR.A0J(r5)) {
                abstractList.remove(i);
            }
            if (C51966G9m.A1a(this.A04, A0C) && i < JTR.A0E(this)) {
                A0R(JTR.A0E(this) - 1, JTS.A03(this), true);
            }
        } while (!r5.AIY(value, abstractList));
    }

    public final void A0O(int i, int i2, String str, String str2) {
        Object value;
        AbstractList abstractList;
        String str3 = str;
        String str4 = str2;
        AnonymousClass7TG.A1Q(str3, str4);
        int i3 = i;
        int i4 = i2;
        if (A0V(i3, i4)) {
            05G r3 = this.A08;
            do {
                value = r3.getValue();
                abstractList = (AbstractList) value;
                if (i3 < abstractList.size() && i4 < ((AbstractCollection) abstractList.get(i3)).size()) {
                    JTO.A12(abstractList, i3).set(i4, C61194Jyn.A00((C61080JwI) null, new N49(str3, str4, 23), (C60997Jut) null, JTS.A0L(abstractList, i3, i4), (Integer) null, (String) null, 0, 0, 0, 0, 28671, false));
                }
            } while (!r3.AIY(value, abstractList));
        }
    }

    public final void A0Q(int i, int i2, boolean z) {
        Object value;
        AbstractList abstractList;
        Integer num;
        05G r5 = this.A08;
        do {
            value = r5.getValue();
            abstractList = (AbstractList) value;
            if (A0V(i, i2)) {
                AbstractList A12 = JTO.A12(abstractList, i);
                C61194Jyn A0L = JTS.A0L(abstractList, i, i2);
                if (z) {
                    num = AnonymousClass05K.A01;
                } else if (A0L.Ayv()) {
                    num = AnonymousClass05K.A00;
                } else {
                    num = A0L.A0A;
                }
                A12.set(i2, C61194Jyn.A00((C61080JwI) null, (N49) null, (C60997Jut) null, A0L, num, (String) null, 0, 0, 0, 0, 32511, false));
            } else {
                return;
            }
        } while (!r5.AIY(value, abstractList));
        if (z) {
            A0R(i, i2, z);
        }
    }

    public final void A0S(int i, boolean z) {
        Object value;
        AbstractList abstractList;
        Integer num;
        05G r3 = this.A07;
        do {
            value = r3.getValue();
            abstractList = (AbstractList) value;
            if (A0U(i)) {
                C61193Jym jym = (C61193Jym) abstractList.get(i);
                if (z) {
                    num = AnonymousClass05K.A01;
                } else if (jym.Ayv()) {
                    num = AnonymousClass05K.A00;
                } else {
                    num = jym.A03;
                }
                C62529KhL khL = jym.A02;
                String str = jym.A04;
                C268714ds r7 = jym.A00;
                boolean z2 = jym.A05;
                int i2 = jym.A01;
                AnonymousClass7TG.A1N(khL, str);
                0qQ.A0B(num, 4);
                abstractList.set(i, new C61193Jym(khL, r7, num, str, i2, z2));
            } else {
                return;
            }
        } while (!r3.AIY(value, abstractList));
        if (z) {
            A0T(i, true);
        }
    }

    public final void A0T(int i, boolean z) {
        Object value;
        AbstractList abstractList;
        Integer num;
        int i2 = this.A00;
        if (!(i2 == -1 || i2 == i)) {
            A06(this);
        }
        A07(this);
        05G r3 = this.A07;
        do {
            value = r3.getValue();
            abstractList = (AbstractList) value;
            if (A0U(i)) {
                C61193Jym jym = (C61193Jym) abstractList.get(i);
                boolean z2 = z;
                if (z) {
                    num = jym.A03;
                } else {
                    num = AnonymousClass05K.A00;
                }
                C62529KhL khL = jym.A02;
                String str = jym.A04;
                C268714ds r6 = jym.A00;
                int i3 = jym.A01;
                AnonymousClass7TG.A1N(khL, str);
                0qQ.A0B(num, 4);
                abstractList.set(i, new C61193Jym(khL, r6, num, str, i3, z2));
            } else {
                return;
            }
        } while (!r3.AIY(value, abstractList));
        if (!z) {
            i = -1;
        }
        this.A00 = i;
    }

    static {
        Integer A0j = C51967G9n.A0j();
        A0C = new 0eP(A0j, A0j);
    }

    public LTY(boolean z) {
        this.A0B = z;
        02z A10 = DbS.A10(AnonymousClass7TE.A1C());
        this.A08 = A10;
        this.A0A = A10;
        02z A102 = DbS.A10(AnonymousClass7TE.A1C());
        this.A07 = A102;
        this.A09 = A102;
        this.A05 = AnonymousClass7TE.A1E();
        this.A06 = new 01W();
        0eP r1 = A0C;
        this.A04 = r1;
        this.A00 = -1;
        this.A03 = r1;
    }

    private final List A05(int i, int i2, int i3, int i4) {
        HashSet A1F = AnonymousClass7TE.A1F();
        int i5 = 0;
        while (i5 < JTQ.A04(this, i)) {
            if (i5 != i2) {
                C61194Jyn A0G = A0G(i, i5);
                int i6 = A0G.A05;
                int i7 = A0G.A02;
                if (i6 < i4 && i7 > i3) {
                    C61194Jyn A0G2 = A0G(i, i5);
                    AnonymousClass59G r2 = new AnonymousClass59G(Integer.valueOf(i), Integer.valueOf(A0G2.A04), Integer.valueOf(A0G2.A03));
                    HashMap hashMap = this.A05;
                    hashMap.put(r2, AnonymousClass7TE.A1C());
                    this.A06.add(r2);
                    A08(this, (ArrayList) hashMap.get(r2), A1F, i, i5);
                    if (i5 < i2) {
                        i2--;
                        if (C51966G9m.A1a(this.A04, A0C)) {
                            A0R(i, i2, true);
                        }
                    }
                    i5--;
                }
            }
            i5++;
        }
        return 00k.A0a(A1F);
    }

    public static final void A07(LTY lty) {
        Object value;
        AbstractList abstractList;
        int A0E = JTR.A0E(lty);
        int A032 = JTS.A03(lty);
        05G r5 = lty.A08;
        do {
            value = r5.getValue();
            abstractList = (AbstractList) value;
            if (lty.A0V(A0E, A032)) {
                JTO.A12(abstractList, A0E).set(A032, JTS.A0L(abstractList, A0E, A032).A04(false));
            }
        } while (!r5.AIY(value, abstractList));
        lty.A04 = A0C;
    }

    private final boolean A0B(int i, int i2, int i3, int i4) {
        int i5;
        if (A0V(i, i2)) {
            C61194Jyn A0G = A0G(i, i2);
            if (i3 <= A0G.A05 && i2 > 0 && i3 < A0G(i, i2 - 1).A02) {
                return true;
            }
            if (i4 < A0G.A02 || (i5 = i2 + 1) >= JTQ.A04(this, i) || i4 <= A0G(i, i5).A05) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0093, code lost:
        if (r1 == null) goto L_0x00a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        r0 = r7.A01;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0097, code lost:
        if (r0 == null) goto L_0x009c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0099, code lost:
        r0.A00(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x009c, code lost:
        A0A(r2, r1);
        r3.remove(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A0I(int r8, int r9, int r10, int r11) {
        /*
            r7 = this;
            boolean r0 = r7.A0V(r8, r9)
            if (r0 != 0) goto L_0x0009
            X.0sn r0 = X.0sn.A00
            return r0
        L_0x0009:
            java.util.HashSet r2 = X.AnonymousClass7TE.A1F()
            boolean r0 = r7.A0B(r8, r9, r10, r11)
            if (r0 == 0) goto L_0x0021
            X.LC0 r0 = r7.A01
            if (r0 == 0) goto L_0x001a
            r0.A00(r8)
        L_0x001a:
            java.util.List r0 = r7.A05(r8, r9, r10, r11)
            r2.addAll(r0)
        L_0x0021:
            int r6 = X.JTS.A03(r7)
            X.05G r5 = r7.A08
        L_0x0027:
            java.lang.Object r4 = r5.getValue()
            r3 = r4
            java.util.AbstractList r3 = (java.util.AbstractList) r3
            boolean r0 = r7.A0V(r8, r6)
            if (r0 == 0) goto L_0x0049
            java.util.AbstractList r1 = X.JTO.A12(r3, r8)
            java.util.AbstractList r0 = X.JTO.A12(r3, r8)
            java.lang.Object r0 = r0.get(r6)
            X.Jyn r0 = (X.C61194Jyn) r0
            X.Jyn r0 = r0.A03(r10, r11, r10, r11)
            r1.set(r6, r0)
        L_0x0049:
            boolean r0 = r5.AIY(r4, r3)
            if (r0 == 0) goto L_0x0027
            X.AnonymousClass7TF.A1M(r2, r8)
            java.util.HashMap r3 = r7.A05
            java.util.Iterator r5 = X.AnonymousClass7TF.A0s(r3)
        L_0x0058:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x00a2
            java.util.Map$Entry r4 = X.AnonymousClass7TE.A1J(r5)
            java.lang.Object r0 = r4.getKey()
            X.59G r0 = (X.AnonymousClass59G) r0
            java.lang.Object r0 = r0.A00
            int r0 = X.AnonymousClass7TE.A0M(r0)
            if (r0 != r8) goto L_0x0058
            java.lang.Object r0 = r4.getKey()
            X.59G r0 = (X.AnonymousClass59G) r0
            java.lang.Object r0 = r0.A01
            int r1 = X.AnonymousClass7TE.A0M(r0)
            java.lang.Object r0 = r4.getKey()
            X.59G r0 = (X.AnonymousClass59G) r0
            java.lang.Object r0 = r0.A02
            int r0 = X.AnonymousClass7TE.A0M(r0)
            if (r1 >= r11) goto L_0x008d
            if (r0 <= r10) goto L_0x008d
            goto L_0x0058
        L_0x008d:
            java.lang.Object r1 = r4.getKey()
            X.59G r1 = (X.AnonymousClass59G) r1
            if (r1 == 0) goto L_0x00a2
            X.LC0 r0 = r7.A01
            if (r0 == 0) goto L_0x009c
            r0.A00(r8)
        L_0x009c:
            r7.A0A(r2, r1)
            r3.remove(r1)
        L_0x00a2:
            java.util.List r0 = X.00k.A0a(r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LTY.A0I(int, int, int, int):java.util.List");
    }

    public final void A0P(int i, int i2, boolean z) {
        Object value;
        AbstractList abstractList;
        Integer num;
        Integer num2;
        if (A0V(i, i2)) {
            if (z) {
                A0R(i, i2, true);
            }
            05G r4 = this.A08;
            do {
                value = r4.getValue();
                abstractList = (AbstractList) value;
                int i3 = 0;
                Iterator it = ((Iterable) DbZ.A0g(abstractList, i)).iterator();
                while (it.hasNext()) {
                    it.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        0sr.A1T();
                        throw AnonymousClass00P.createAndThrow();
                    }
                    AbstractList A12 = JTO.A12(abstractList, i);
                    C61194Jyn A0L = JTS.A0L(abstractList, i, i3);
                    if (z) {
                        num2 = AnonymousClass05K.A0N;
                    } else if (A0L.CFq() == AnonymousClass05K.A0N) {
                        num2 = AnonymousClass05K.A00;
                    } else {
                        num2 = A0L.A0A;
                    }
                    A12.set(i3, C61194Jyn.A00((C61080JwI) null, (N49) null, (C60997Jut) null, A0L, num2, (String) null, 0, 0, 0, 0, 32511, false));
                    i3 = i4;
                }
                AbstractList A122 = JTO.A12(abstractList, i);
                C61194Jyn A0L2 = JTS.A0L(abstractList, i, i2);
                if (z) {
                    num = AnonymousClass05K.A0u;
                } else {
                    num = AnonymousClass05K.A00;
                }
                A122.set(i2, C61194Jyn.A00((C61080JwI) null, (N49) null, (C60997Jut) null, A0L2, num, (String) null, 0, 0, 0, 0, 32511, false));
            } while (!r4.AIY(value, abstractList));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0011, code lost:
        if (X.JTS.A03(r6) != r8) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0R(int r7, int r8, boolean r9) {
        /*
            r6 = this;
            boolean r0 = r6.A0V(r7, r8)
            if (r0 == 0) goto L_0x0056
            int r0 = X.JTR.A0E(r6)
            if (r0 != r7) goto L_0x0013
            int r0 = X.JTS.A03(r6)
            r1 = 0
            if (r0 == r8) goto L_0x0014
        L_0x0013:
            r1 = 1
        L_0x0014:
            X.0eP r0 = r6.A04
            X.0eP r5 = A0C
            boolean r0 = X.C51966G9m.A1a(r0, r5)
            if (r0 == 0) goto L_0x0023
            if (r1 == 0) goto L_0x0023
            A07(r6)
        L_0x0023:
            A06(r6)
            X.05G r4 = r6.A08
        L_0x0028:
            java.lang.Object r3 = r4.getValue()
            r2 = r3
            java.util.AbstractList r2 = (java.util.AbstractList) r2
            boolean r0 = r6.A0V(r7, r8)
            if (r0 == 0) goto L_0x0044
            java.util.AbstractList r1 = X.JTO.A12(r2, r7)
            X.Jyn r0 = X.JTS.A0L(r2, r7, r8)
            X.Jyn r0 = r0.A04(r9)
            r1.set(r8, r0)
        L_0x0044:
            boolean r0 = r4.AIY(r3, r2)
            if (r0 == 0) goto L_0x0028
            if (r9 == 0) goto L_0x0054
            java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
            X.0eP r5 = X.AnonymousClass7TF.A0x(r0, r8)
        L_0x0054:
            r6.A04 = r5
        L_0x0056:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LTY.A0R(int, int, boolean):void");
    }

    public LTY() {
        this(false);
    }
}
