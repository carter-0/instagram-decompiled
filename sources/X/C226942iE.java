package X;

import android.os.Looper;
import com.instagram.analytics.ppr.loggingdata.PPRLoggingData;
import com.instagram.common.typedurl.ImageCacheKey;
import com.instagram.common.typedurl.ImageUrl;
import java.lang.ref.WeakReference;
import kotlin.Deprecated;

/* renamed from: X.2iE  reason: invalid class name and case insensitive filesystem */
public final class C226942iE implements C226952iF {
    public final boolean A00;
    public final float A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final 16e A06;
    public final 1OO A07;
    public final C247833gz A08;
    public final 0lg A09;
    public final ImageUrl A0A;
    public final ImageUrl A0B;
    public final ImageUrl A0C;
    public final Object A0D;
    public final String A0E;
    public final String A0F;
    public final WeakReference A0G;
    public final WeakReference A0H;
    public final WeakReference A0I;
    public final WeakReference A0J;
    public final boolean A0K;
    public final boolean A0L;
    public final boolean A0M;
    public final boolean A0N;
    public final boolean A0O;
    public final boolean A0P;
    public final boolean A0Q;

    public C226942iE(1OO r9) {
        AnonymousClass16c r0;
        this.A07 = r9;
        this.A09 = r9.A05;
        ImageUrl imageUrl = r9.A06;
        if ((imageUrl instanceof AnonymousClass16c) && (r0 = (AnonymousClass16c) imageUrl) != null && r0.B2i() != null && r9.A05 == null) {
            0wb.A03("CacheRequest_build_withFallback", "ImageUrl supports expiry and fallback but session is null");
        }
        0qQ.A06(imageUrl);
        this.A0C = imageUrl;
        ImageUrl A002 = C226972iH.A00(imageUrl);
        this.A0A = A002;
        16e r02 = r9.A0P;
        0qQ.A06(r02);
        this.A06 = r02;
        Looper.myLooper();
        Looper.getMainLooper();
        A002.AjH();
        this.A0B = A002;
        this.A0F = r9.A0Q;
        this.A0G = r9.A0A;
        this.A0H = r9.A0B;
        this.A0J = r9.A0D;
        this.A0I = r9.A0C;
        this.A0E = r9.A09;
        this.A04 = r9.A02;
        this.A0Q = r9.A0M;
        this.A0K = r9.A0E;
        this.A02 = r9.A01;
        this.A0D = r9.A08;
        this.A08 = r9.A04;
        boolean z = r9.A0I;
        this.A0N = z;
        this.A0M = r9.A0H;
        this.A00 = r9.A0O;
        this.A0L = r9.A0F;
        this.A01 = r9.A00;
        1OM r2 = 1OO.A0R;
        int i = r9.A03;
        String scansProfile = A002.getScansProfile();
        PPRLoggingData BO8 = A002.BO8();
        boolean z2 = false;
        if (BO8 != null && BO8.A05) {
            z2 = true;
        }
        this.A05 = r2.EIg(A002, scansProfile, i, z2, z);
        this.A03 = 1OO.A0R.EIc(A002.getScansProfile());
        this.A0P = r9.A0L;
        this.A0O = r9.A0J;
    }

    public final boolean Cal() {
        return false;
    }

    public final C226952iF AI1() {
        1OO r1 = new 1OO(this.A06, this.A0C, this.A0F);
        r1.A05 = this.A09;
        r1.A0I = this.A0N;
        r1.A0F = this.A0L;
        r1.A08 = this.A0D;
        r1.A0O = this.A00;
        r1.A03 = this.A05;
        return r1.A00();
    }

    public final boolean ARK() {
        return this.A07.A0G;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0007: MOVE  (r2v1 com.instagram.common.typedurl.ImageUrlBase) = (r2v0 com.instagram.common.typedurl.ImageUrlBase)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final java.lang.String AjE() {
        /*
            r3 = this;
            com.instagram.common.typedurl.ImageUrl r2 = r3.A0A
            boolean r1 = r2 instanceof com.instagram.common.typedurl.ImageUrlBase
            r0 = 0
            if (r1 == 0) goto L_0x0013
            com.instagram.common.typedurl.ImageUrlBase r2 = (com.instagram.common.typedurl.ImageUrlBase) r2
            if (r2 == 0) goto L_0x0013
            X.2hT r0 = r2.AmO()
            java.lang.String r0 = r0.name()
        L_0x0013:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C226942iE.AjE():java.lang.String");
    }

    public final String AjI() {
        String str = ((ImageCacheKey) this.A0B.AjH()).A03;
        0qQ.A07(str);
        return str;
    }

    public final AnonymousClass1MK AjZ() {
        WeakReference weakReference = this.A0G;
        if (weakReference != null) {
            return (AnonymousClass1MK) weakReference.get();
        }
        return null;
    }

    public final C226572hI AvU() {
        WeakReference weakReference = this.A0H;
        if (weakReference != null) {
            return (C226572hI) weakReference.get();
        }
        return null;
    }

    public final float Avb() {
        return this.A01;
    }

    public final ImageUrl BGK() {
        return this.A0A;
    }

    public final int BPJ() {
        return this.A02;
    }

    public final ImageUrl BRH() {
        return this.A0B;
    }

    public final int BTB() {
        return this.A03;
    }

    public final int BTJ() {
        return this.A04;
    }

    public final AnonymousClass2hC BTK() {
        WeakReference weakReference = this.A0I;
        if (weakReference != null) {
            return (AnonymousClass2hC) weakReference.get();
        }
        return null;
    }

    public final String BTL() {
        return this.A0E;
    }

    public final String BZG() {
        return this.A0B.BZG();
    }

    public final AnonymousClass2hE BhZ() {
        WeakReference weakReference = this.A0J;
        if (weakReference != null) {
            return (AnonymousClass2hE) weakReference.get();
        }
        return null;
    }

    public final C247833gz Bha() {
        return this.A08;
    }

    public final int Bpa() {
        return this.A05;
    }

    public final boolean Bwm() {
        return this.A07.A0N;
    }

    public final String Bxi() {
        return this.A0F;
    }

    public final Object C3s() {
        return this.A0D;
    }

    public final Boolean COJ() {
        return this.A0A.BIy();
    }

    public final boolean CPK() {
        return false;
    }

    public final boolean CTf() {
        return this.A0M;
    }

    public final boolean CWj() {
        return this.A0P;
    }

    public final boolean CZh() {
        return this.A0N;
    }

    public final boolean Cak() {
        return this.A0O;
    }

    public final boolean Ce1() {
        return this.A00;
    }

    public final boolean CeW() {
        return this.A07.A0K;
    }

    public final String EHW() {
        return this.A0F;
    }

    public final boolean Eru() {
        return this.A0K;
    }

    public final boolean Es0() {
        return this.A0L;
    }

    public final boolean Ess() {
        return this.A0Q;
    }

    public final Integer FMf() {
        return AnonymousClass05K.A0Y;
    }

    public final 0lg getSession() {
        return this.A09;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CacheRequestImpl: Source = ");
        sb.append(this.A0F);
        sb.append(AnonymousClass000.A00(849));
        sb.append(this.A0A);
        return sb.toString();
    }

    public final void E5t() {
        1NK.A00().A0N(this);
    }

    @Deprecated(message = "")
    public final void cancel() {
        1NK.A00().A0M(this);
    }

    @Deprecated(message = "no-op, historically there are a lot of call sites that tries to do cancellation without measuring the impact of it. When the cancellation logic was enabled internally, it regresses a lot of metrics. For now, we are going to deprecate all those call sites, and consider re-enabling them one by one.")
    public final void AGE() {
        1NK.A00();
    }
}
