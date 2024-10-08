package X;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class SOM {
    public final C11224SFy A00;
    public final S5Y A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final Map A05;
    public final C66498MUb A06;
    public final C10571RuQ A07;
    public final String A08;

    private final void A00(QOy qOy, C11283SJb sJb, String str) {
        String str2;
        QOy qOy2 = qOy;
        String str3 = str;
        A01(qOy2, this, AnonymousClass05K.A0u, str3);
        C11283SJb sJb2 = sJb;
        try {
            C11224SFy sFy = this.A00;
            Map map = sFy.A0B;
            HashMap A19 = Pxe.A19(map);
            A19.put("X-MediaAccuracy-TimestampUs", String.valueOf(qOy2.A00));
            String str4 = qOy2.A04;
            if (!0qQ.A0K(str4, "0")) {
                A19.put("X-Player-Session-Id", str4);
            }
            A19.put("X-Media-Id", str3);
            Map map2 = this.A05;
            Object obj = map2.get("media_features");
            if (obj != null) {
                A19.put("X-Media-Features", obj);
            }
            A19.put("X-Source-Type", this.A03);
            String A002 = C9605Rdj.A00(qOy2.A01);
            A19.put("X-Snapshot-Type", A002);
            A19.put("x-media-accuracy-tags", qOy2.A05);
            map2.put("snapshot_type", A002);
            A19.remove("devserver-forward-host");
            A19.remove("enable-video-processing-forwarding");
            A19.remove("xpv_override");
            A19.remove("usc_encoding_override");
            A19.remove("X-Instagram-Rupload-Params");
            String str5 = this.A04;
            Integer num = this.A02;
            HashMap A0r = Pxf.A0r(str5, 1);
            if (num == AnonymousClass05K.A01) {
                str2 = "X_FB_PHOTO_WATERFALL_ID";
            } else {
                str2 = "X_FB_VIDEO_WATERFALL_ID";
            }
            A0r.put(str2, str5);
            A19.putAll(A0r);
            HashMap A1E = AnonymousClass7TE.A1E();
            new C10543Rtx(new C11181SEh());
            new S16(new C11180SEg(0, false));
            A1E.putAll(map);
            C11181SEh sEh = sFy.A04;
            C10543Rtx rtx = new C10543Rtx(sEh);
            C11180SEg sEg = sFy.A02;
            S16 s16 = new S16(sEg);
            String str6 = sFy.A09;
            String str7 = sFy.A0A;
            boolean z = sFy.A00;
            boolean z2 = sFy.A0F;
            boolean z3 = sFy.A0E;
            boolean z4 = sFy.A0C;
            C10542Rtw rtw = sFy.A06;
            long j = sFy.A01;
            String str8 = sFy.A08;
            boolean z5 = sFy.A0D;
            C62637KjI kjI = C62637KjI.A0m;
            0qQ.A0B(kjI, 0);
            boolean z6 = z3;
            boolean z7 = z;
            boolean z8 = z2;
            boolean z9 = z4;
            C11180SEg sEg2 = sEg;
            C62637KjI kjI2 = kjI;
            C11181SEh sEh2 = sEh;
            S16 s162 = s16;
            C10542Rtw rtw2 = rtw;
            this.A06.Ewf(new C11224SFy(sEg2, kjI2, sEh2, s162, rtw2, rtx, str8, str6, str7, A19, j, z5, z6, z7, z8, z9), new C11420SSw(AnonymousClass7TE.A0t(qOy2.A02), qOy2.A03), new C12077SmW(qOy2, sJb2, this, str3));
        } catch (Throwable th) {
            sJb2.A02(qOy2.A02);
            this.A01.A00(qOy2, AnonymousClass05K.A1F, str3, "Upload trigger failure", th, this.A05);
        }
    }

    public static final void A01(QOy qOy, SOM som, Integer num, String str) {
        som.A01.A00(qOy, num, str, (String) null, (Throwable) null, som.A05);
    }

    public final void A02() {
        C60340gF r4;
        ArrayList arrayList;
        Long A10;
        try {
            C10571RuQ ruQ = this.A07;
            S5Y s5y = this.A01;
            C11283SJb sJb = new C11283SJb(s5y, ruQ.A00, ruQ.A01, ruQ.A02);
            String str = this.A08;
            if (str == null) {
                A01((QOy) null, this, AnonymousClass05K.A0u, (String) null);
                s5y.A00((QOy) null, AnonymousClass05K.A1F, (String) null, "Cannot parse media id from the response", (Throwable) null, this.A05);
                sJb.A01();
                return;
            }
            File file = sJb.A01;
            String[] list = file.list(T97.A00);
            if (!(list == null || list.length == 0)) {
                File A0s = JTO.A0s(file, list[0]);
                C272134kB.A02(A0s, AnonymousClass15Q.A05, new C74179PqL(sJb, 26));
                A0s.delete();
            }
            r4 = C60340gF.A00;
            Throwable A002 = 0eR.A00(r4);
            if (A002 != null) {
                sJb.A00.A01(AnonymousClass05K.A00, (Integer) null, (Long) null, (String) null, (String) null, (String) null, A002, 0Yt.A0E(), (Map) null);
            }
            String A0z = DbT.A0z(",", sJb.A05, (0sP) null);
            for (QOy A003 : sJb.A00(A0z, true)) {
                A00(A003, sJb, str);
            }
            try {
                File file2 = sJb.A01;
                String[] list2 = file2.list(T98.A00);
                if (list2 != null) {
                    arrayList = AnonymousClass7TE.A1C();
                    for (String str2 : list2) {
                        List A0R = 00l.A0R(00l.A0G(".wav", 00l.A0F("preview_audio_", str2)), new String[]{"_"}, 2);
                        if (A0R.size() == 2 && (A10 = AnonymousClass7TE.A10(AnonymousClass7TE.A19(A0R, 1))) != null) {
                            long longValue = A10.longValue();
                            String str3 = sJb.A03;
                            String str4 = str3;
                            arrayList.add(new QOy(false, AnonymousClass05K.A00, str4, DbU.A0t(A0R, 0), JTP.A0u(JTO.A0s(file2, str2)), "audio/wav", A0z, longValue));
                        }
                    }
                } else {
                    arrayList = null;
                }
            } catch (Throwable th) {
                arrayList = JTO.A1B(th);
            }
            Throwable A004 = 0eR.A00(arrayList);
            if (A004 != null) {
                sJb.A00.A02(AnonymousClass05K.A00, (Integer) null, (Long) null, (String) null, A004, (Map) null);
                arrayList = null;
            }
            0sn<QOy> r5 = arrayList;
            if (r5 == null) {
                r5 = 0sn.A00;
            }
            for (QOy A005 : r5) {
                A00(A005, sJb, str);
            }
        } catch (Throwable th2) {
            this.A01.A01(AnonymousClass05K.A1F, (Integer) null, (Long) null, this.A04, this.A08, "Critical failure", th2, (Map) null, this.A05);
        }
    }

    public SOM(C11224SFy sFy, C66498MUb mUb, S5Y s5y, C10571RuQ ruQ, Integer num, String str, String str2, String str3, Collection collection) {
        this.A07 = ruQ;
        this.A01 = s5y;
        this.A04 = str;
        this.A00 = sFy;
        this.A08 = str2;
        this.A06 = mUb;
        this.A02 = num;
        HashMap A1E = AnonymousClass7TE.A1E();
        this.A05 = A1E;
        if (collection != null && !collection.isEmpty()) {
            String A002 = C2612548w.A00(",", collection);
            0qQ.A07(A002);
            A1E.put("media_features", A002);
        }
        this.A03 = str3;
    }
}
