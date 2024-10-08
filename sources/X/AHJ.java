package X;

import android.content.Context;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public abstract class AHJ {
    public static final C266824aP A00(Context context, UserSession userSession, AnonymousClass51W r18, 2Nn r19, boolean z, boolean z2, boolean z3) {
        ImmutableList of;
        float f;
        Object obj;
        2Nn r4 = r19;
        0qQ.A0B(r4, 2);
        Context context2 = context;
        UserSession userSession2 = userSession;
        CameraSpec A00 = AnonymousClass72R.A00(context2, userSession2);
        float f2 = ((float) A00.A03) / ((float) A00.A02);
        boolean A06 = 182.A06(0Tu.A05, userSession2, 36316254885122235L);
        ArrayList A1C = AnonymousClass7TE.A1C();
        AnonymousClass51W r5 = r18;
        List<AnonymousClass55O> list = r5.A03;
        if (list != null) {
            for (AnonymousClass55O r1 : list) {
                if (r1 instanceof C388659oB) {
                    C357588Yu r0 = ((C388659oB) r1).A00;
                    if (r0 != null) {
                        obj = r0.A00(context2);
                    }
                } else if (r1 instanceof C388649oA) {
                    obj = ((C388649oA) r1).A00;
                }
                if (obj != null) {
                    A1C.add(obj);
                }
            }
        }
        C357608Yw r14 = null;
        C366518pA r10 = new C366518pA(false);
        C365998o1 A002 = C365998o1.A00(context2, A06);
        AnonymousClass0eM r7 = r5.A06;
        ImmutableList A02 = AnonymousClass51Q.A02((Collection) r7.getValue(), z2);
        AnonymousClass3QS r02 = r5.A02;
        if (r02 != null) {
            of = A02(r02);
            f = r02.A00;
        } else {
            of = ImmutableList.of();
            0qQ.A07(of);
            f = 1.0f;
        }
        Map map = (Map) r5.A05.getValue();
        if (map != null) {
            String absolutePath = new File(r4.C4W(), "raw_karaoke_bleep.mp4").getAbsolutePath();
            0qQ.A07(absolutePath);
            r14 = A03(absolutePath, map);
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) A1C);
        0qQ.A07(copyOf);
        ImmutableList A003 = AnonymousClass51Q.A00(A002, r10, (Collection) r7.getValue());
        0qQ.A0B(A02, 1);
        return AHK.A00(A002, r10, of, A02, A003, r14, copyOf, 0sn.A00, C41705Ayw.A00, f, f2, 2, z, z3);
    }

    public static final MediaComposition A01(Context context, UserSession userSession, AnonymousClass51W r9, 2Nn r10, boolean z) {
        0qQ.A0B(userSession, 1);
        AnonymousClass7TG.A1Q(r10, r9);
        return new MediaComposition(A00(context, userSession, r9, r10, true, z, 182.A06(0Tu.A05, userSession, 36327559239121409L)));
    }

    public static final C357608Yw A03(String str, Map map) {
        0qQ.A0B(map, 3);
        LinkedHashMap linkedHashMap = new LinkedHashMap(0se.A0L(map.size()));
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            linkedHashMap.put(AnonymousClass51Q.A03((AnonymousClass51N) A1J.getKey()), A1J.getValue());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(0se.A0L(linkedHashMap.size()));
        Iterator A0s = AnonymousClass7TF.A0s(linkedHashMap);
        while (A0s.hasNext()) {
            Map.Entry A1J2 = AnonymousClass7TE.A1J(A0s);
            Object key = A1J2.getKey();
            Iterable<C53368Gms> iterable = (Iterable) A1J2.getValue();
            ArrayList A0r = AnonymousClass7TG.A0r(iterable);
            for (C53368Gms gms : iterable) {
                A0r.add(new C39784A9e(gms.A01, gms.A00));
            }
            linkedHashMap2.put(key, A0r);
        }
        return new C357608Yw(str, linkedHashMap2);
    }

    public static final ImmutableList A02(AnonymousClass3QS r14) {
        01N A1H = 0jo.A1H();
        for (AnonymousClass51I r2 : r14.A03) {
            String str = r2.A05;
            String str2 = str;
            float f = r2.A00;
            int i = r2.A02;
            int i2 = r2.A01;
            int i3 = r2.A03;
            AnonymousClass51J r1 = r2.A04;
            if (!(r1 == AnonymousClass51J.VIDEO_STICKER || r1 == AnonymousClass51J.VOICEOVER)) {
                AnonymousClass51J r0 = AnonymousClass51J.SOUND_EFFECTS;
                str = r1 == r0 ? r0.A00 : r2.A06;
            }
            A1H.add(new C39799A9u(r2.A09, r2.A0A, str2, str, f, r2.A08, i, i2, i3));
        }
        ImmutableList copyOf = ImmutableList.copyOf((Collection) 0jo.A1I(A1H));
        0qQ.A07(copyOf);
        return copyOf;
    }
}
