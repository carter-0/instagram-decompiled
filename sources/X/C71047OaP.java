package X;

import android.view.View;
import com.instagram.api.schemas.NotePogVideoDict;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;

/* renamed from: X.OaP  reason: case insensitive filesystem */
public abstract class C71047OaP {
    public static final OIR A00(View view, View view2, C68209N5y n5y, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        return new OIR(view, view2, (NotePogVideoDict) null, (C279864zZ) null, (ContentNoteMetadata) null, n5y, (Integer) null, str, str2, str3, str4, 0sn.A00, false, false, z, z2, false, z3, true, z4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        if (r19 != null) goto L_0x000f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final X.OIR A01(android.view.View r17, com.instagram.api.schemas.NotePogVideoDict r18, X.C279864zZ r19, com.instagram.contentnotes.data.metadata.ContentNoteMetadata r20, X.C68209N5y r21, boolean r22, boolean r23, boolean r24, boolean r25) {
        /*
            r9 = 0
            r4 = r19
            if (r19 == 0) goto L_0x003c
            X.5y2 r0 = r4.A0A
            if (r0 == 0) goto L_0x003c
            X.60F r0 = r0.A0B
            if (r0 == 0) goto L_0x003c
            java.lang.String r8 = r0.A02
        L_0x000f:
            X.5y2 r0 = r4.A0A
            if (r0 == 0) goto L_0x0019
            X.60F r0 = r0.A0B
            if (r0 == 0) goto L_0x0019
            java.lang.String r9 = r0.A03
        L_0x0019:
            r2 = 0
            r15 = 0
            X.0sn r12 = X.0sn.A00
            r19 = 1
            X.OIR r0 = new X.OIR
            r1 = r17
            r3 = r18
            r5 = r20
            r6 = r21
            r13 = r22
            r14 = r23
            r16 = r24
            r17 = r25
            r7 = r2
            r10 = r2
            r11 = r2
            r18 = r15
            r20 = r15
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return r0
        L_0x003c:
            r8 = r9
            if (r19 == 0) goto L_0x0019
            goto L_0x000f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71047OaP.A01(android.view.View, com.instagram.api.schemas.NotePogVideoDict, X.4zZ, com.instagram.contentnotes.data.metadata.ContentNoteMetadata, X.N5y, boolean, boolean, boolean, boolean):X.OIR");
    }

    public static final OIR A02(NotePogVideoDict notePogVideoDict, C279864zZ r20, Double d, Double d2) {
        String str;
        String str2 = null;
        if (d != null) {
            str = d.toString();
        } else {
            str = null;
        }
        if (d2 != null) {
            str2 = d2.toString();
        }
        return new OIR((View) null, (View) null, notePogVideoDict, r20, (ContentNoteMetadata) null, (C68209N5y) null, (Integer) null, (String) null, (String) null, str, str2, 0sn.A00, false, false, false, false, false, true, false, false);
    }

    public static final OIR A03(NotePogVideoDict notePogVideoDict, C279864zZ r17, String str, String str2, boolean z, boolean z2) {
        AnonymousClass60F r0;
        String str3 = str2;
        C279864zZ r4 = r17;
        0qQ.A0B(r4, 0);
        if (str2 == null) {
            C300845y2 r02 = r4.A0A;
            if (r02 == null || (r0 = r02.A0B) == null) {
                str3 = null;
            } else {
                str3 = r0.A03;
            }
        }
        return new OIR((View) null, (View) null, notePogVideoDict, r4, (ContentNoteMetadata) null, (C68209N5y) null, (Integer) null, str, str3, (String) null, (String) null, 0sn.A00, false, false, false, z, false, false, true, z2);
    }
}
