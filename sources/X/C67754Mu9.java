package X;

import com.instagram.common.session.UserSession;
import java.io.File;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.Mu9  reason: case insensitive filesystem */
public final class C67754Mu9 extends 2YL {
    public final 2Fk A00;
    public final C309516Yo A01;
    public final 1aU A02;
    public final 1aU A03;
    public final 1a8 A04 = new 1a8((C269794fh) null);
    public final UserSession A05;
    public final C60096Jfc A06;
    public final C72203OyT A07;
    public final C249513ju A08;
    public final AnonymousClass0r6 A09;
    public final 05G A0A;
    public final 05G A0B;
    public final 05G A0C;
    public final 05G A0D;
    public final 1Av A0E;

    public C67754Mu9(C309516Yo r29, AnonymousClass12V r30, 1aU r31, 1aU r32, UserSession userSession, C60096Jfc jfc, C72203OyT oyT, 1Av r36) {
        boolean z;
        UserSession userSession2 = userSession;
        1Av r1 = r36;
        int A032 = DbW.A03(1, userSession2, r1);
        AnonymousClass12V r13 = r30;
        C60096Jfc jfc2 = jfc;
        C72203OyT oyT2 = oyT;
        C51973G9u.A0s(4, oyT2, jfc2, r13);
        this.A05 = userSession2;
        this.A01 = r29;
        this.A0E = r1;
        this.A07 = oyT2;
        this.A02 = r31;
        this.A03 = r32;
        this.A06 = jfc2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = 1HR.A05;
        AnonymousClass3FN r0 = C249513ju.A00;
        1HR A1G = JTO.A1G(AnonymousClass3FN.A00);
        this.A08 = A1G;
        this.A09 = 0u9.A04(A1G);
        AnonymousClass0r6 A10 = DbS.A10(C69271NiX.FULLSCREEN_MODAL);
        this.A0D = A10;
        C67458MoD moD = new C67458MoD(userSession2);
        if (!C67458MoD.A04(moD)) {
            z = false;
        } else {
            z = moD.A00.getBoolean("EB_SHOW_DEBUG_TOASTS", false);
        }
        AnonymousClass0r6 A0s = JTQ.A0s(z);
        this.A0C = A0s;
        AnonymousClass0r6 A012 = 106.A01((Object) null);
        this.A0B = A012;
        C69301Nj2 nj2 = C69301Nj2.Unknown;
        AnonymousClass0r6 A102 = DbS.A10(nj2);
        this.A0A = A102;
        Integer num = AnonymousClass05K.A0Y;
        C72203OyT.A03(oyT2, num);
        AnonymousClass0Ud r14 = oyT2.A0P;
        C72203OyT.A03(oyT2, num);
        AnonymousClass0r6 r2 = oyT2.A0I;
        C72203OyT.A03(oyT2, num);
        AnonymousClass0r6 r12 = oyT2.A0H;
        C72203OyT.A03(oyT2, num);
        AnonymousClass0Ud r02 = oyT2.A0T;
        0qQ.A0B(num, 0);
        C72203OyT.A03(oyT2, num);
        AnonymousClass0Ud r17 = r14;
        AnonymousClass0r6 A0o = C66583MXo.A0o(r13, new C73521Pe6(new AnonymousClass0r6[]{r17, r2, r12, A012, r02, A10, A0s, A102, oyT2.A0O}, 0), 1705805791, A032);
        this.A00 = C66582MXn.A0G(new N3H((C266444Yx) null, nj2, C69302Nj3.Unknown, C69294Niu.Unknown, false, false, true, true, false, false, false, false, false), C318116oQ.A00(this), A0o, AnonymousClass10A.A00);
    }

    public final void onCleared() {
        this.A04.A01();
    }

    public static final void A00(C67754Mu9 mu9, File file) {
        File[] listFiles;
        if (file.isDirectory() && (listFiles = file.listFiles()) != null) {
            for (File file2 : listFiles) {
                0qQ.A0A(file2);
                A00(mu9, file2);
            }
        }
        String name = file.getName();
        0qQ.A07(name);
        if (DbU.A1a(name, C273654mx.A00(3044))) {
            file.delete();
        }
    }

    public static final void A01(C67754Mu9 mu9, String str) {
        C52255GKw A002 = JUH.A00(str);
        AnonymousClass7TE.A1Z(new C58104ImQ(A002, mu9, (AnonymousClass4D7) null, 46), C318116oQ.A00(mu9));
    }
}
