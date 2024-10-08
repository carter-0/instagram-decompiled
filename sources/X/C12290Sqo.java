package X;

import android.content.Context;
import java.io.File;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.Sqo  reason: case insensitive filesystem */
public final class C12290Sqo implements C13723Tfp {
    public final C10953S2l A00;

    private C7937QdV A00(File file, String str, Map map, int i) {
        boolean z;
        long j;
        long j2;
        int length;
        C7937QdV qdV;
        0sn A1C;
        String name;
        C10953S2l s2l = this.A00;
        if (s2l.A01 == null) {
            File parentFile = s2l.A03.getDatabasePath("ignore").getParentFile();
            if (parentFile == null) {
                name = "/databases";
            } else {
                name = parentFile.getName();
            }
            s2l.A01 = name;
        }
        File file2 = file;
        int i2 = i;
        if (!file2.getPath().contains(s2l.A01)) {
            String A0R = 002.A0R(file2.getPath(), "/");
            if (i2 != 1) {
                A1C = 0sn.A00;
            } else {
                A1C = AnonymousClass7TE.A1C();
            }
            Iterator it = A1C.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (A0R.contains(AnonymousClass7TE.A18(it))) {
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            z = true;
        } else {
            z = true;
        }
        int i3 = i + 1;
        File[] A04 = C258893zo.A04(file2);
        long j3 = 0;
        String str2 = str;
        Map map2 = map;
        if (A04 == null || (length = A04.length) <= 0) {
            j = 0;
            j2 = 0;
        } else {
            j = 0;
            j2 = 0;
            int i4 = 0;
            do {
                File file3 = A04[i4];
                if (!C258893zo.A03(file3)) {
                    if (!file3.isDirectory()) {
                        qdV = new C7937QdV(C258893zo.A01(file3));
                        if (z) {
                            A01(qdV, 002.A0R(str2, s2l.A00(file3)), map2);
                        }
                    } else if (((long) i3) > s2l.A00) {
                        String A0R2 = 002.A0R(file3.getPath(), "/");
                        Iterator it2 = Collections.emptyList().iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                if (A0R2.contains(AnonymousClass7TE.A18(it2))) {
                                    break;
                                }
                            } else {
                                qdV = new C7937QdV(C258893zo.A01(file3));
                                break;
                            }
                        }
                        qdV = A00(file3, 002.A0g(str2, s2l.A00(file3), "/"), map2, i3);
                    } else {
                        qdV = A00(file3, 002.A0g(str2, s2l.A00(file3), "/"), map2, i3);
                    }
                    j3 += qdV.A00;
                    j += qdV.A02;
                    j2 += qdV.A01;
                }
                i4++;
            } while (i4 < length);
        }
        S1t A02 = C258893zo.A02(file2, file2.isDirectory());
        S1t s1t = new S1t(j3 + A02.A00, A02.A02 + j, 1 + j2);
        A01(s1t, str2, map2);
        return s1t;
    }

    public final String CfJ() {
        return "filetree";
    }

    public C12290Sqo(C10953S2l s2l) {
        this.A00 = s2l;
    }

    public static void A01(C7937QdV qdV, String str, Map map) {
        if (!map.containsKey(str)) {
            map.put(str, qdV);
            return;
        }
        S1t s1t = (S1t) map.get(str);
        if (s1t != null) {
            map.put(str, new C7937QdV(qdV.A00(s1t)));
        }
    }

    public final HashMap E4i() {
        HashMap A1E = AnonymousClass7TE.A1E();
        C10953S2l s2l = this.A00;
        Map map = s2l.A02;
        if (map.size() == 0) {
            Context context = s2l.A03;
            File cacheDir = context.getCacheDir();
            if (cacheDir != null) {
                map.put("/", cacheDir.getParentFile());
            }
            try {
                map.put("<external_cache>/", context.getExternalCacheDir());
                map.put("<external_files>/", context.getExternalFilesDir((String) null));
            } catch (Exception e) {
                0I1.A07("DefaultFileTreeProviderConfig", "Failed to report external dirs", e);
            }
            try {
                File[] externalMediaDirs = context.getExternalMediaDirs();
                for (int i = 0; i < externalMediaDirs.length; i++) {
                    map.put(002.A0c("<external_media_", ">/", i), externalMediaDirs[i]);
                }
            } catch (Exception unused) {
            }
        }
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            if (A1J.getValue() != null) {
                A00((File) A1J.getValue(), DbT.A13(A1J), A1E, 0);
            }
        }
        return A1E;
    }
}
