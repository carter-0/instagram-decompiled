package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.gallery.metadata.MediaUploadMetadata;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: X.834  reason: invalid class name */
public final class AnonymousClass834 {
    public static final C349307zv A00(ImmutableList immutableList, UserSession userSession, File file) {
        boolean z;
        ImmutableList immutableList2 = immutableList;
        AnonymousClass51R r0 = ((AnonymousClass51M) immutableList2.get(0)).A0F;
        int i = r0.A09;
        int i2 = r0.A05;
        int i3 = r0.A07;
        String str = r0.A0D;
        int i4 = r0.A00;
        C249803kO it = immutableList2.iterator();
        0qQ.A07(it);
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                AnonymousClass51R r02 = ((AnonymousClass51M) it.next()).A0F;
                if (z || r02.A08 == 0) {
                    z = true;
                }
            }
        }
        long currentTimeMillis = System.currentTimeMillis();
        File file2 = file;
        C349307zv r6 = new C349307zv(file2, (Integer) null, str, i, i2, i3, currentTimeMillis, currentTimeMillis, false, !z, true);
        r6.A01 = i4;
        MediaUploadMetadata A02 = r6.A02();
        ArrayList arrayList = new ArrayList();
        C249803kO it2 = immutableList2.iterator();
        0qQ.A07(it2);
        while (it2.hasNext()) {
            String str2 = ((AnonymousClass51M) it2.next()).A0F.A0B.A03;
            if (str2 != null) {
                arrayList.add(str2);
            }
        }
        A02.A03 = C59737JVv.A02(userSession, "", arrayList);
        try {
            String path = file2.getPath();
            0qQ.A07(path);
            int A00 = AIF.A00(path);
            r6.A07 = A00;
            r6.A0H = 0;
            r6.A06 = A00;
            r6.A19 = true;
            return r6;
        } catch (IOException unused) {
            throw new Exception("Error extracting video duration");
        }
    }
}
