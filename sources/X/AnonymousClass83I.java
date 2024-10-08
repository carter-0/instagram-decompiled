package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.store.ClipsAudioStore;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.83I  reason: invalid class name */
public final class AnonymousClass83I {
    public final Context A00;
    public final UserSession A01;
    public final ClipsAudioStore A02;
    public final AnonymousClass836 A03;
    public final AnonymousClass0r6 A04;
    public final 0V2 A05;
    public final AnonymousClass0Ud A06;
    public final AnonymousClass0Ud A07;
    public final AnonymousClass0r6 A08;
    public final AnonymousClass0r6 A09;
    public final AnonymousClass0Ud A0A;
    public final AnonymousClass0Ud A0B;
    public final AnonymousClass0Ud A0C;
    public final AnonymousClass0Ud A0D;
    public final AnonymousClass0Ud A0E;
    public final AnonymousClass0Ud A0F;
    public final AnonymousClass0Ud A0G;
    public final AnonymousClass0Ud A0H;

    public AnonymousClass83I(Context context, UserSession userSession, ClipsAudioStore clipsAudioStore, AnonymousClass836 r27, 2Nn r28, C262224Cq r29) {
        this.A00 = context;
        this.A01 = userSession;
        AnonymousClass836 r2 = r27;
        this.A03 = r2;
        ClipsAudioStore clipsAudioStore2 = clipsAudioStore;
        this.A02 = clipsAudioStore2;
        05D A012 = 10D.A01(AnonymousClass05K.A00, 0, 0);
        this.A05 = A012;
        055 A042 = 10q.A04(new AnonymousClass0r6[]{A012, r2.A03});
        AnonymousClass0Ud r22 = clipsAudioStore2.A0a;
        AnonymousClass0Ud r0 = clipsAudioStore2.A0c;
        AnonymousClass0Ud r222 = r0;
        this.A04 = AnonymousClass10H.A00(AnonymousClass83J.A00, A042, r22, r0);
        AnonymousClass0Ud r3 = clipsAudioStore2.A0V;
        AnonymousClass0r6 A022 = 10q.A02(new AnonymousClass9KD((Object) this, (AnonymousClass4D7) null, 8), new AnonymousClass0qC(r3));
        this.A08 = A022;
        02x A023 = 10q.A02(new AnonymousClass9KD((Object) this, (AnonymousClass4D7) null, 11), new AnonymousClass0qC(r3));
        AnonymousClass109 r32 = AnonymousClass10A.A01;
        C361268fw r23 = C361268fw.A00;
        C262224Cq r8 = r29;
        AnonymousClass0r6 A024 = 10b.A02(r23, r8, A023, r32);
        this.A09 = A024;
        AnonymousClass0Ud r11 = clipsAudioStore2.A0l;
        AnonymousClass0Ud r1 = clipsAudioStore2.A0n;
        AnonymousClass0Ud r10 = clipsAudioStore2.A0m;
        05F A025 = 10b.A02(r23, r8, 10q.A02(new AnonymousClass9KD((Object) this, (AnonymousClass4D7) null, 9), AnonymousClass10H.A00(AnonymousClass83L.A00, r11, r1, r10)), r32);
        this.A0G = A025;
        05F A026 = 10b.A02(r23, r8, 10q.A02(new AnonymousClass9KD((Object) this, (AnonymousClass4D7) null, 10), AnonymousClass10H.A03(AnonymousClass83M.A00, r11, r10)), r32);
        this.A0H = A026;
        05F A027 = 10b.A02(r23, r8, 10q.A02(new AnonymousClass9K2(6, (AnonymousClass4D7) null), clipsAudioStore2.A0j), r32);
        this.A0F = A027;
        05F A028 = 10b.A02(r23, r8, 10q.A02(new AnonymousClass9K2(5, (AnonymousClass4D7) null), clipsAudioStore2.A0h), r32);
        this.A0D = A028;
        AnonymousClass0Ud r14 = clipsAudioStore2.A0f;
        05F A029 = 10b.A02(r23, r8, 10q.A02(new AnonymousClass9K2(4, (AnonymousClass4D7) null), r14), r32);
        this.A0C = A029;
        05F A0210 = 10b.A02(r23, r8, 10q.A02(new AnonymousClass9KL(this, r28, (AnonymousClass4D7) null, 4), r14), r32);
        this.A0E = A0210;
        05F A0211 = 10b.A02(r23, r8, 10q.A02(new AnonymousClass9K2(3, (AnonymousClass4D7) null), AnonymousClass10H.A03(AnonymousClass83N.A00, A0210, clipsAudioStore2.A0g)), r32);
        this.A0B = A0211;
        05F A0212 = 10b.A02(r23, r8, new AnonymousClass83O(this, (AnonymousClass0r6[]) 00k.A0a(0sr.A1P(new AnonymousClass0r6[]{A024, A025, A027, A028, 10b.A02(r23, r8, 10q.A02(new C59731JVp(2, (AnonymousClass4D7) null), A0211), r32)})).toArray(new AnonymousClass0r6[0])), r32);
        this.A0A = A0212;
        this.A07 = 10b.A02(r23, r8, 10q.A02(new AnonymousClass9K2(2, (AnonymousClass4D7) null), new AnonymousClass83P(this, (AnonymousClass0r6[]) 00k.A0a(0sr.A1P(new AnonymousClass0r6[]{A022, A026, A027, A028, A029})).toArray(new AnonymousClass0r6[0]))), r32);
        this.A06 = 10b.A02(r23, r8, 10q.A02(new AnonymousClass9KD((Object) this, (AnonymousClass4D7) null, 6), AnonymousClass10H.A00(AnonymousClass83Q.A00, A0212, r222, clipsAudioStore2.A0k)), r32);
    }

    public static final C361278fx A00(C361278fx[] r5) {
        ArrayList arrayList = new ArrayList();
        for (C361278fx r1 : r5) {
            if (r1 instanceof C361338g4) {
                return C361338g4.A00;
            }
            if (r1 instanceof AnonymousClass8Y4) {
                arrayList.addAll((Collection) r1.A00());
            }
        }
        return new AnonymousClass8Y4(arrayList);
    }

    public static final AnonymousClass51I A01(AnonymousClass83I r13, C357588Yu r14, M1Y m1y, float f) {
        MediaEffect mediaEffect;
        String str = m1y.A06;
        if (str == null) {
            return null;
        }
        int i = m1y.A05;
        int i2 = m1y.A03;
        int i3 = m1y.A02 - i2;
        AnonymousClass51J r3 = AnonymousClass51J.VOICEOVER;
        if (r14 != null) {
            Context context = r13.A00;
            mediaEffect = r14.A00;
            if (mediaEffect == null) {
                mediaEffect = C394729yb.A00(context, r14.A05);
                r14.A00 = mediaEffect;
            }
        } else {
            mediaEffect = null;
        }
        return new AnonymousClass51I(mediaEffect, r3, (Float) null, str, (String) null, (String) null, f, 1.0f, i, i2, i3);
    }

    /* JADX WARNING: type inference failed for: r0v27, types: [X.55O, X.9oA, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v28, types: [X.55O, java.lang.Object, X.9oB] */
    public final AnonymousClass51W A02() {
        AnonymousClass3QS r6;
        C361278fx r1 = (C361278fx) this.A06.getValue();
        if (r1 instanceof AnonymousClass8Y4) {
            r6 = (AnonymousClass3QS) r1.A00();
        } else {
            r6 = new AnonymousClass3QS(((Number) this.A02.A0k.getValue()).floatValue(), 30);
        }
        ArrayList A052 = ((AnonymousClass831) this.A03.A03.getValue()).A05();
        ClipsAudioStore clipsAudioStore = this.A02;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((Map) clipsAudioStore.A0a.getValue()).entrySet()) {
            if (entry.getKey() instanceof AnonymousClass51M) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(0se.A0L(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            Object key = entry2.getKey();
            0qQ.A0C(key, AnonymousClass000.A00(3654));
            linkedHashMap2.put(key, entry2.getValue());
        }
        01N A1H = 0jo.A1H();
        C357588Yu r2 = (C357588Yu) clipsAudioStore.A0c.getValue();
        if (r2 != null) {
            Integer num = AnonymousClass05K.A00;
            ? obj = new Object();
            obj.A00 = num;
            obj.A00 = r2;
            A1H.add(obj);
        }
        C357618Yx r22 = (C357618Yx) clipsAudioStore.A0b.getValue();
        if (r22 != null) {
            Integer num2 = AnonymousClass05K.A01;
            ? obj2 = new Object();
            obj2.A00 = num2;
            obj2.A00 = r22;
            A1H.add(obj2);
        }
        Collection collection = (Collection) clipsAudioStore.A0X.getValue();
        if (collection != null) {
            A1H.addAll(collection);
        }
        return C39563A0f.A00(r6, A052, 0jo.A1I(A1H), linkedHashMap2);
    }
}
