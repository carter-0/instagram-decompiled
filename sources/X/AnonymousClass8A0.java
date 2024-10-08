package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import com.instagram.common.session.UserSession;
import java.io.File;
import java.io.IOException;
import java.util.TreeSet;

/* renamed from: X.8A0  reason: invalid class name */
public final class AnonymousClass8A0 {
    public C39786A9g A00;
    public final UserSession A01;
    public final AnonymousClass8A5 A02;
    public final C3516889w A03;
    public final TreeSet A04 = new TreeSet(new AnonymousClass8A3(new AnonymousClass9LZ(this, 18)));
    public final Context A05;
    public final AnonymousClass8A2 A06;

    public AnonymousClass8A0(Context context, AnonymousClass07Z r6, UserSession userSession, AnonymousClass89v r8, AnonymousClass89v r9, C3516889w r10) {
        0qQ.A0B(userSession, 3);
        0qQ.A0B(r10, 4);
        this.A05 = context;
        this.A01 = userSession;
        this.A03 = r10;
        this.A06 = AnonymousClass8A1.A01(userSession);
        this.A02 = AnonymousClass8A4.A00(context, userSession);
        r10.A02(r8, r9);
        r10.A04.A06(r6, new C319096q2(new AnonymousClass8A7(this)));
        AnonymousClass11O.A03(AnonymousClass07a.A00(r6), new C61860pz(new C376879Jr(this, (AnonymousClass4D7) null, 19), r10.A0A));
    }

    public static final void A00(AnonymousClass8A0 r4) {
        AnonymousClass8A2 r42;
        Long valueOf;
        if (r4.A00 == null) {
            05G r2 = r4.A03.A0A;
            if (((Boolean) r2.getValue()).booleanValue()) {
                TreeSet treeSet = r4.A04;
                if (!treeSet.isEmpty()) {
                    C39786A9g a9g = (C39786A9g) treeSet.pollFirst();
                    r4.A00 = a9g;
                    if (a9g != null) {
                        a9g.A02.invoke();
                    }
                }
            }
            if (r4.A04.isEmpty()) {
                r42 = r4.A06;
                Long l = r42.A0E;
                if (l != null) {
                    long longValue = l.longValue();
                    AE4 ae4 = new AE4(r42.A0J);
                    ae4.A01 = longValue;
                    ae4.A02();
                } else {
                    return;
                }
            } else {
                boolean booleanValue = ((Boolean) r2.getValue()).booleanValue();
                r42 = r4.A06;
                if (!booleanValue) {
                    Long l2 = r42.A0E;
                    if (l2 != null) {
                        long longValue2 = l2.longValue();
                        AE4 ae42 = new AE4(r42.A0J);
                        ae42.A01 = longValue2;
                        ae42.A03("view scope ended");
                    } else {
                        return;
                    }
                } else if (r42.A0E == null) {
                    valueOf = Long.valueOf(r42.A0J.A01("video_track_thumbnail_request", 17643603).A01());
                    r42.A0E = valueOf;
                } else {
                    return;
                }
            }
            valueOf = null;
            r42.A0E = valueOf;
        }
    }

    public static final void A01(AnonymousClass8A0 r16, AnonymousClass89v r17, AnonymousClass51M r18, String str, C62320sa r20, 0sL r21, 0sL r22, int i, boolean z, boolean z2) {
        AnonymousClass8A5 r7;
        int i2;
        int i3;
        boolean z3;
        AnonymousClass89v r8 = r17;
        AnonymousClass51M r9 = r18;
        0eP r1 = (0eP) r8.A06.invoke(r9);
        int intValue = ((Number) r1.A00).intValue();
        int intValue2 = ((Number) r1.A01).intValue();
        AnonymousClass8A0 r72 = r16;
        String str2 = str;
        C62320sa r11 = r20;
        0sL r12 = r21;
        0sL r13 = r22;
        int i4 = i;
        boolean z4 = z;
        if (z || Build.VERSION.SDK_INT < 30) {
            AnonymousClass8A5 r5 = r72.A02;
            String A0E = r9.A0E();
            Bitmap.Config config = r8.A03;
            C40392AbP abP = new C40392AbP(r72, r8, r9, str2, r11, r12, r13, i4, z4);
            0qQ.A0B(A0E, 0);
            0qQ.A0B(config, 4);
            AnonymousClass51M A002 = LIO.A00(A0E);
            C378989Rz r2 = new C378989Rz(intValue2);
            try {
                File A003 = AnonymousClass8A5.A00(r2, r5, A002, i4);
                A003.exists();
                0nY.A00().ATE(new C386999lV(config, r2, abP, r5, A002, A003, i4, intValue, intValue2));
            } catch (IOException unused) {
                abP.DH1();
            }
        } else {
            AnonymousClass8A5 r52 = r72.A02;
            String A0E2 = r9.A0E();
            Bitmap.Config config2 = r8.A03;
            C40392AbP abP2 = new C40392AbP(r72, r8, r9, str2, r11, r12, r13, i4, false);
            0qQ.A0B(A0E2, 0);
            0qQ.A0B(config2, 4);
            AnonymousClass51M A004 = LIO.A00(A0E2);
            if (z2) {
                z3 = true;
                r7 = r52;
                i2 = i4;
                i3 = intValue2;
            } else {
                r7 = r52;
                i2 = i4;
                i3 = intValue2;
                z3 = false;
            }
            AnonymousClass8A5.A01(config2, abP2, r7, A004, i2, intValue, i3, z3);
        }
    }
}
