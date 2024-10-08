package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import com.instagram.creation.base.CropInfo;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.util.creation.RenderBridge;
import java.io.IOException;
import java.util.List;

/* renamed from: X.LQm  reason: case insensitive filesystem */
public final class C64149LQm {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final Handler A07 = AnonymousClass7TF.A0D();
    public final C344207rU A08;
    public final UserSession A09;
    public final CropInfo A0A;
    public final C3499782r A0B;
    public final MV7 A0C;
    public final LO5 A0D;
    public final AR4 A0E;
    public final FilterGroupModel A0F;
    public final Integer A0G;
    public final List A0H;
    public final AnonymousClass0eK A0I;
    public final AnonymousClass0eK A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;

    public C64149LQm(Context context, C344207rU r3, UserSession userSession, CropInfo cropInfo, C3499782r r6, MV7 mv7, AR4 ar4, FilterGroupModel filterGroupModel, Integer num, List list, AnonymousClass0eK r12, AnonymousClass0eK r13, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        AnonymousClass7TF.A1E(ar4, 4, num);
        this.A09 = userSession;
        this.A08 = r3;
        this.A0E = ar4;
        this.A0C = mv7;
        this.A0F = filterGroupModel;
        this.A0G = num;
        this.A05 = i;
        this.A04 = i2;
        this.A0L = z;
        this.A0J = r12;
        this.A0I = r13;
        this.A0H = list;
        this.A0N = z2;
        this.A0O = z3;
        this.A0K = z4;
        this.A0M = z5;
        this.A0A = cropInfo;
        this.A06 = i3;
        this.A0B = r6;
        this.A0D = new LO5(context, userSession, mv7, num);
    }

    public static final void A00(Bitmap bitmap, C364988mL r23, LAM lam, C63927LDk lDk, C64149LQm lQm) {
        AnonymousClass514 r3;
        boolean z;
        int i = -1;
        Bitmap bitmap2 = bitmap;
        C63927LDk lDk2 = lDk;
        C64149LQm lQm2 = lQm;
        if (bitmap == null) {
            try {
                Exception A012 = r23.A01();
                if (A012 != null) {
                    lDk2.A00(A012);
                    return;
                }
                int readRenderResult = RenderBridge.readRenderResult(lQm2.A03, lQm2.A02, 6408, 12);
                if (readRenderResult != -1) {
                    i = readRenderResult;
                } else {
                    throw AnonymousClass7TE.A15("RenderBridge.readRenderResult failure");
                }
            } catch (IOException | RuntimeException e) {
                lDk2.A00(e);
                return;
            }
        }
        LAM lam2 = lam;
        if (!lQm2.A0O || bitmap != null) {
            LO5 lo5 = lQm2.A0D;
            int i2 = lQm2.A01;
            int i3 = lQm2.A00;
            int i4 = lQm2.A03;
            int i5 = lQm2.A02;
            UserSession userSession = lQm2.A09;
            boolean z2 = lQm2.A0K;
            L6Q l6q = new L6Q(userSession, false, z2);
            L4D l4d = new L4D(userSession, z2);
            C3499782r r2 = lQm2.A0B;
            if (r2 != null) {
                r3 = r2.ANP();
            } else {
                r3 = null;
            }
            if (r3 == AnonymousClass514.ORIGINAL) {
                z = true;
                if (!182.A06(0Tu.A05, userSession, 36325222777303791L)) {
                }
                int i6 = i3;
                int i7 = i2;
                int i8 = i;
                LAM lam3 = lam2;
                L4D l4d2 = l4d;
                L6Q l6q2 = l6q;
                L6R A013 = lo5.A01(bitmap2, l6q2, l4d2, lam3, i8, i7, i6, i4, i5, z, false);
                int i9 = A013.A00;
                Point point = new Point(lQm2.A03, lQm2.A02);
                Point point2 = new Point(lQm2.A03, lQm2.A02);
                Double d = A013.A01;
                Double d2 = A013.A02;
                0qQ.A0B(lam2, 0);
                Double d3 = d;
                LAM lam4 = lam2;
                lDk2.A04.set(new LEA(point, point2, lam4, d3, d2, (Exception) null, AnonymousClass05K.A00, i9));
                lDk2.A03.countDown();
                return;
            }
            z = false;
            int i62 = i3;
            int i72 = i2;
            int i82 = i;
            LAM lam32 = lam2;
            L4D l4d22 = l4d;
            L6Q l6q22 = l6q;
            L6R A0132 = lo5.A01(bitmap2, l6q22, l4d22, lam32, i82, i72, i62, i4, i5, z, false);
            int i92 = A0132.A00;
            Point point3 = new Point(lQm2.A03, lQm2.A02);
            Point point22 = new Point(lQm2.A03, lQm2.A02);
            Double d4 = A0132.A01;
            Double d22 = A0132.A02;
            0qQ.A0B(lam2, 0);
            Double d32 = d4;
            LAM lam42 = lam2;
            lDk2.A04.set(new LEA(point3, point22, lam42, d32, d22, (Exception) null, AnonymousClass05K.A00, i92));
            lDk2.A03.countDown();
            return;
        }
        RenderBridge.mirrorImage(i);
        String str = lam2.A04;
        UserSession userSession2 = lQm2.A09;
        RenderBridge.saveAndClearCachedImageFull(i, str, true, false, 75, 182.A06(DbS.A0J(userSession2, 0), userSession2, 36313291357685617L), false);
        lDk2.A04.set(new LEA(new Point(lQm2.A03, lQm2.A02), new Point(lQm2.A03, lQm2.A02), lam2, (Double) null, (Double) null, (Exception) null, AnonymousClass05K.A00, 90));
        lDk2.A03.countDown();
    }

    public static final void A01(C346267ut r19, C364988mL r20, C64149LQm lQm, C365358my r22, int i, int i2) {
        C64149LQm lQm2 = lQm;
        int i3 = lQm2.A05;
        int width = r22.getWidth();
        lQm2.A01 = width;
        int height = r22.getHeight();
        lQm2.A00 = height;
        boolean z = false;
        boolean A1P = AnonymousClass7TF.A1P(i3 % 180);
        boolean z2 = false;
        C365398n2 r5 = new C365398n2(C365378n0.ENABLE, new C365368mz(width, height, 0, 0, 0, lQm2.A04), C365138mb.A01, (C365468nA) null, C343747qj.A06, "OneCameraImageRenderer", false, false, true, true, false);
        C364988mL r13 = r20;
        r13.A08(r5);
        if (A1P) {
            z = lQm2.A0L;
        } else {
            z2 = lQm2.A0L;
        }
        r13.A06(lQm2.A01, lQm2.A00, -i3, z2, !z);
        int i4 = i;
        int i5 = i2;
        r13.A09(r19, i4, i5);
        r13.A05(i4, i5);
        try {
            r5.A02(r22.getTexture());
        } catch (IllegalStateException | InterruptedException | RuntimeException e) {
            r13.A0D("Render failure", "OneCameraImageRenderer", e);
        }
    }
}
