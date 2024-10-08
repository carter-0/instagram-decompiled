package com.instagram.clips.audio.soundsync.repository;

import X.0Tu;
import X.0eP;
import X.0nV;
import X.0qQ;
import X.0sn;
import X.182;
import X.AnonymousClass00P;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass12T;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C51969G9p;
import X.C51970G9q;
import X.C51972G9s;
import X.C73669Phi;
import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public final class ClipsSoundSyncMediaImportRepository {
    public List A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public List A05;
    public final Context A06;
    public final UserSession A07;
    public final 0nV A08;
    public final CameraSpec A09;
    public final HashSet A0A = AnonymousClass7TE.A1F();
    public final AnonymousClass0eM A0B = C51970G9q.A0o(this, 48);
    public final AnonymousClass0eM A0C;

    public ClipsSoundSyncMediaImportRepository(Context context, UserSession userSession, CameraSpec cameraSpec, String str) {
        C51972G9s.A1D(cameraSpec, str);
        this.A06 = context;
        this.A07 = userSession;
        this.A09 = cameraSpec;
        this.A0C = AnonymousClass0eN.A01(new C73669Phi(str, this, 19));
        this.A08 = AnonymousClass12T.A00.AOJ(422445809, 1);
        0sn r0 = 0sn.A00;
        this.A00 = r0;
        this.A01 = r0;
        this.A04 = r0;
        this.A02 = r0;
        this.A05 = r0;
    }

    public final void A01(Integer num, List list) {
        int i;
        int intValue;
        this.A03 = list;
        ArrayList<0eP> A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Medium medium = (Medium) it.next();
            if (medium.A05()) {
                i = 5000;
            } else if (!medium.CeS() || (intValue = num.intValue()) == 0) {
                i = medium.A03;
            } else if (intValue == 1) {
                i = medium.A09;
            } else if (intValue == 2 || intValue == 3) {
                i = medium.A03 - medium.A0A;
            } else {
                i = (int) (182.A00(0Tu.A05, this.A07, 37165193825943939L) * 1000.0d);
            }
            AnonymousClass7TF.A1I(medium, Integer.valueOf(i), A1C);
        }
        this.A05 = A1C;
        ArrayList A0p = AnonymousClass7TF.A0p(A1C);
        for (0eP A0A2 : A1C) {
            AnonymousClass7TF.A1M(A0p, C51969G9p.A0A(A0A2));
        }
        this.A00 = A0p;
        List<Medium> list2 = this.A03;
        if (list2 != null) {
            ArrayList A0p2 = AnonymousClass7TF.A0p(list2);
            for (Medium medium2 : list2) {
                AnonymousClass7TF.A1M(A0p2, medium2.A0A);
            }
            this.A01 = A0p2;
            List<Medium> list3 = this.A03;
            if (list3 != null) {
                ArrayList A0p3 = AnonymousClass7TF.A0p(list3);
                for (Medium medium3 : list3) {
                    AnonymousClass7TF.A1M(A0p3, medium3.A09);
                }
                this.A04 = A0p3;
                List<Medium> list4 = this.A03;
                if (list4 != null) {
                    ArrayList A1C2 = AnonymousClass7TE.A1C();
                    for (Medium A052 : list4) {
                        int i2 = 2;
                        if (A052.A05()) {
                            i2 = 1;
                        }
                        AnonymousClass7TF.A1M(A1C2, i2);
                    }
                    this.A02 = A1C2;
                    return;
                }
            }
        }
        0qQ.A0F("importedMedia");
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.JUG, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(com.instagram.common.gallery.Medium r9, X.AnonymousClass4D7 r10) {
        /*
            r8 = this;
            r3 = 19
            boolean r0 = X.JUG.A03(r3, r10)
            if (r0 == 0) goto L_0x0025
            r4 = r10
            X.JUG r4 = (X.JUG) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0025
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r0 = r4.A01
            X.1Hj r5 = X.1Hj.A02
            int r1 = r4.A00
            r7 = 2
            r6 = 1
            if (r1 == 0) goto L_0x0036
            if (r1 == r6) goto L_0x005b
            if (r1 != r7) goto L_0x0031
            goto L_0x002d
        L_0x0025:
            r0 = 42
            X.JUG r4 = new X.JUG
            r4.<init>(r8, r10, r3, r0)
            goto L_0x0016
        L_0x002d:
            X.0eS.A00(r0)     // Catch:{ HP2 -> 0x009a, Kkf -> 0x0093, IllegalStateException -> 0x008c }
            return r0
        L_0x0031:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0036:
            X.0eS.A00(r0)
            com.instagram.common.session.UserSession r3 = r8.A07
            X.0Tu r2 = X.0Tu.A05
            r0 = 36317362986816600(0x81067300021458, double:3.030584818921109E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 == 0) goto L_0x0078
            r4.A00 = r6     // Catch:{ all -> 0x0062 }
            X.0nV r3 = r8.A08     // Catch:{ all -> 0x0062 }
            r2 = 0
            r1 = 42
            X.MGZ r0 = new X.MGZ     // Catch:{ all -> 0x0062 }
            r0.<init>((java.lang.Object) r9, (java.lang.Object) r8, (X.AnonymousClass4D7) r2, (int) r1)     // Catch:{ all -> 0x0062 }
            java.lang.Object r0 = X.1Eo.A00(r4, r3, r0)     // Catch:{ all -> 0x0062 }
            if (r0 != r5) goto L_0x005e
            return r5
        L_0x005b:
            X.0eS.A00(r0)     // Catch:{ all -> 0x0062 }
        L_0x005e:
            r5 = r0
            X.7zv r5 = (X.C349307zv) r5     // Catch:{ all -> 0x0062 }
            return r5
        L_0x0062:
            r3 = move-exception
            X.0kg r2 = X.0kg.A03
            java.lang.String r1 = r3.getMessage()
            if (r1 != 0) goto L_0x006d
            java.lang.String r1 = "no message"
        L_0x006d:
            java.lang.String r0 = "clips_sound_sync_import_photo"
            X.0wb.A01(r2, r0, r1)
            X.HP1 r0 = new X.HP1
            r0.<init>(r3)
            throw r0
        L_0x0078:
            r4.A00 = r7     // Catch:{ HP2 -> 0x009a, Kkf -> 0x0093, IllegalStateException -> 0x008c }
            X.0nV r3 = r8.A08     // Catch:{ HP2 -> 0x009a, Kkf -> 0x0093, IllegalStateException -> 0x008c }
            r2 = 0
            r1 = 42
            X.MGZ r0 = new X.MGZ     // Catch:{ HP2 -> 0x009a, Kkf -> 0x0093, IllegalStateException -> 0x008c }
            r0.<init>((java.lang.Object) r9, (java.lang.Object) r8, (X.AnonymousClass4D7) r2, (int) r1)     // Catch:{ HP2 -> 0x009a, Kkf -> 0x0093, IllegalStateException -> 0x008c }
            java.lang.Object r0 = X.1Eo.A00(r4, r3, r0)     // Catch:{ HP2 -> 0x009a, Kkf -> 0x0093, IllegalStateException -> 0x008c }
            if (r0 != r5) goto L_0x008b
            return r5
        L_0x008b:
            return r0
        L_0x008c:
            r1 = move-exception
            X.HP1 r0 = new X.HP1
            r0.<init>(r1)
            throw r0
        L_0x0093:
            r1 = move-exception
            X.HP1 r0 = new X.HP1
            r0.<init>(r1)
            throw r0
        L_0x009a:
            r1 = move-exception
            X.HP1 r0 = new X.HP1
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncMediaImportRepository.A00(com.instagram.common.gallery.Medium, X.4D7):java.lang.Object");
    }
}
