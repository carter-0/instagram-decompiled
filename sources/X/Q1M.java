package X;

import android.media.MediaFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

public abstract class Q1M {
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0018  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static X.Q1N A01(X.C13853TiW r7, boolean r8) {
        /*
            java.lang.String r0 = "audio/"
            java.util.ArrayList r7 = A03(r7, r0)
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x000e
            r3 = 0
        L_0x000d:
            return r3
        L_0x000e:
            java.util.Iterator r6 = r7.iterator()
        L_0x0012:
            boolean r0 = r6.hasNext()
            if (r0 == 0) goto L_0x0067
            java.lang.Object r3 = r6.next()
            X.Q1N r3 = (X.Q1N) r3
            java.lang.String r4 = r3.A02
            android.media.MediaFormat r5 = r3.A01
            if (r8 == 0) goto L_0x0056
            java.lang.String r0 = "audio/raw"
            boolean r0 = r4.startsWith(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0056
            java.lang.String r1 = "channel-count"
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x0056
            int r0 = r5.getInteger(r1)
            if (r0 != r2) goto L_0x0056
            java.lang.String r1 = "pcm-encoding"
            boolean r0 = r5.containsKey(r1)
            if (r0 == 0) goto L_0x0056
            int r1 = r5.getInteger(r1)
            r0 = 2
            if (r1 != r0) goto L_0x0056
        L_0x004b:
            int r1 = r7.size()
            r0 = 1
            if (r1 <= r0) goto L_0x000d
            A02(r7)
            return r3
        L_0x0056:
            java.lang.String r0 = "audio/mp4a"
            boolean r0 = r4.startsWith(r0)
            if (r0 != 0) goto L_0x004b
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r4.startsWith(r0)
            if (r0 == 0) goto L_0x0012
            goto L_0x004b
        L_0x0067:
            java.lang.String r1 = "Unsupported audio codec. Contained "
            java.lang.String r0 = A02(r7)
            java.lang.String r1 = X.002.A0R(r1, r0)
            X.Qe1 r0 = new X.Qe1
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q1M.A01(X.TiW, boolean):X.Q1N");
    }

    public static Q1N A00(C13853TiW tiW) {
        ArrayList A03 = A03(tiW, "video/");
        if (!A03.isEmpty()) {
            Iterator it = A03.iterator();
            while (it.hasNext()) {
                Q1N q1n = (Q1N) it.next();
                if (C7257Q1f.A04(q1n.A02)) {
                    if (A03.size() > 1) {
                        A02(A03);
                    }
                    return q1n;
                }
            }
            throw new Exception(002.A0R("Unsupported video codec. Contained ", A02(A03)));
        }
        throw new Exception(002.A0R("No video track exception. Track Info List: ", A02(A03(tiW, ""))));
    }

    public static String A02(List list) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            A1C.add(((Q1N) it.next()).A02);
        }
        int size = list.size();
        Iterator it2 = A1C.iterator();
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (it2.hasNext()) {
            while (true) {
                A1A.append(it2.next());
                if (!it2.hasNext()) {
                    break;
                }
                A1A.append(", ");
            }
        } else {
            A1A.append("null, input is empty");
        }
        return 002.A05(size, "", " tracks: ", A1A.toString());
    }

    public static ArrayList A03(C13853TiW tiW, String str) {
        ArrayList A1C = AnonymousClass7TE.A1C();
        int C93 = tiW.C93();
        for (int i = 0; i < C93; i++) {
            MediaFormat C97 = tiW.C97(i);
            String string = C97.getString("mime");
            if (string != null && string.startsWith(str)) {
                A1C.add(new Q1N(C97, string, i));
            }
        }
        return A1C;
    }

    public static JSONObject A04(C13853TiW tiW) {
        JSONObject A11 = DbS.A11();
        try {
            A11.put("sample-track-index", tiW.BpE());
            A11.put("track-count", tiW.C93());
            for (int i = 0; i < tiW.C93(); i++) {
                A11.put(String.format(Locale.ROOT, "track-%d", new Object[]{Integer.valueOf(i)}), tiW.C97(i).toString());
            }
        } catch (Exception unused) {
        }
        return A11;
    }
}
