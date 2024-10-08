package X;

import android.graphics.Bitmap;
import java.util.Map;

/* renamed from: X.2iC  reason: invalid class name and case insensitive filesystem */
public final class C226922iC extends 1TY implements AnonymousClass1MK, AnonymousClass2hE, AnonymousClass2hC {
    public C226932iD A00 = C226932iD.NO_IMAGE;
    public final AnonymousClass1TV A01;
    public final C268764dx A02;
    public final C226632hb A03;

    public C226922iC(AnonymousClass1TV r2, C268764dx r3, C226632hb r4) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }

    public final /* bridge */ /* synthetic */ Object A02() {
        C249903kY r0;
        synchronized (this) {
            C249903kY r02 = (C249903kY) C226922iC.super.A02();
            if (r02 != null) {
                r0 = r02.A04();
            } else {
                r0 = null;
            }
        }
        return r0;
    }

    public final void CyF(C226952iF r11, AnonymousClass3LX r12) {
        Bitmap bitmap;
        0qQ.A0B(r12, 1);
        Bitmap bitmap2 = r12.A01;
        if (bitmap2 == null) {
            A09((Object) null, (Map) null, true);
            return;
        }
        C268764dx r1 = this.A02;
        if (r1 == null || (bitmap = (Bitmap) r1.A00(bitmap2, this.A01).A05()) == null) {
            C226632hb r0 = this.A03;
            if (r0 != null) {
                bitmap2 = r0.renderImage(bitmap2);
            }
        } else {
            bitmap2 = bitmap;
        }
        int i = r12.A00;
        C226932iD r6 = C226932iD.FULL_IMAGE;
        String str = r12.A04;
        AnonymousClass3LZ r4 = new AnonymousClass3LZ(bitmap2, r6, str, -1, i);
        A09(C249903kY.A00(C249903kY.A05, C249903kY.A06, r4), 0se.A0M(new 0eP("LOAD_SOURCE", str)), true);
        this.A00 = r6;
    }

    public final void DK4(C226952iF r3, int i) {
        A05(((float) i) / 100.0f);
    }

    public final /* bridge */ /* synthetic */ void A07(Object obj) {
        C249903kY.A01((C249903kY) obj);
        this.A00 = C226932iD.NO_IMAGE;
    }

    public final void DJx(C226952iF r4, C254673sr r5) {
        int i;
        C254663sq r1;
        if (r5 != null) {
            i = r5.A00;
            r1 = r5.A01;
        } else {
            i = 0;
            r1 = null;
        }
        A0A(new C69546Nnq(r1, i));
    }

    public final void DS7(C226952iF r9, AnonymousClass3LX r10) {
        if (this.A00 == C226932iD.NO_IMAGE) {
            Bitmap bitmap = r10.A01;
            C226932iD r4 = C226932iD.MINI_PREVIEW_IMAGE;
            AnonymousClass3LZ r2 = new AnonymousClass3LZ(bitmap, r4, r10.A04, 0, -1);
            A09(C249903kY.A00(C249903kY.A05, C249903kY.A06, r2), (Map) null, false);
            this.A00 = r4;
        }
    }

    public final void DaX(C226952iF r9, AnonymousClass3LX r10, int i) {
        Bitmap bitmap = r10.A01;
        int i2 = r10.A00;
        C226932iD r4 = C226932iD.PARTIAL_PROGRESSIVE_IMAGE;
        AnonymousClass3LZ r2 = new AnonymousClass3LZ(bitmap, r4, r10.A04, i, i2);
        A09(C249903kY.A00(C249903kY.A05, C249903kY.A06, r2), (Map) null, false);
        this.A00 = r4;
    }

    public final boolean Ca4(C226952iF r2) {
        return true;
    }
}
