package X;

import com.instagram.common.typedurl.ImageUrl;
import java.lang.ref.WeakReference;

public final class FVX implements C226952iF {
    public final ImageUrl A00;
    public final Integer A01;
    public final Object A02;
    public final String A03;
    public final WeakReference A04;
    public final WeakReference A05;
    public final WeakReference A06;
    public final WeakReference A07;
    public final boolean A08;
    public final boolean A09;

    public final void AGE() {
    }

    public final String AjI() {
        return "";
    }

    public final float Avb() {
        return 0.0f;
    }

    public final int BPJ() {
        return 0;
    }

    public final int BTB() {
        return 0;
    }

    public final int BTJ() {
        return 0;
    }

    public final String BTL() {
        return null;
    }

    public final String BZG() {
        return "";
    }

    public final C247833gz Bha() {
        return null;
    }

    public final int Bpa() {
        return 0;
    }

    public final boolean CPK() {
        return true;
    }

    public final boolean CTf() {
        return false;
    }

    public final boolean CWj() {
        return false;
    }

    public final boolean CZh() {
        return false;
    }

    public final boolean Cak() {
        return false;
    }

    public final boolean Cal() {
        return false;
    }

    public final boolean Ce1() {
        return false;
    }

    public final boolean CeW() {
        return false;
    }

    public final boolean Eru() {
        return false;
    }

    public final boolean Es0() {
        return false;
    }

    public final boolean Ess() {
        return false;
    }

    public final void cancel() {
    }

    public final 0lg getSession() {
        return null;
    }

    public final C226952iF AI1() {
        ImageUrl imageUrl = this.A00;
        String str = this.A03;
        return new FVX(imageUrl, this.A01, this.A02, str, this.A08, this.A09);
    }

    public final boolean ARK() {
        return this.A08;
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
            com.instagram.common.typedurl.ImageUrl r2 = r3.A00
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
        throw new UnsupportedOperationException("Method not decompiled: X.FVX.AjE():java.lang.String");
    }

    public final AnonymousClass1MK AjZ() {
        WeakReference weakReference = this.A04;
        if (weakReference != null) {
            return (AnonymousClass1MK) weakReference.get();
        }
        return null;
    }

    public final C226572hI AvU() {
        WeakReference weakReference = this.A05;
        if (weakReference != null) {
            return (C226572hI) weakReference.get();
        }
        return null;
    }

    public final ImageUrl BGK() {
        return this.A00;
    }

    public final ImageUrl BRH() {
        return this.A00;
    }

    public final AnonymousClass2hC BTK() {
        WeakReference weakReference = this.A06;
        if (weakReference != null) {
            return (AnonymousClass2hC) weakReference.get();
        }
        return null;
    }

    public final AnonymousClass2hE BhZ() {
        WeakReference weakReference = this.A07;
        if (weakReference != null) {
            return (AnonymousClass2hE) weakReference.get();
        }
        return null;
    }

    public final boolean Bwm() {
        return this.A09;
    }

    public final String Bxi() {
        return this.A03;
    }

    public final Object C3s() {
        return this.A02;
    }

    public final Boolean COJ() {
        return this.A00.BIy();
    }

    public final String EHW() {
        return this.A03;
    }

    public final Integer FMf() {
        return this.A01;
    }

    public FVX(1OO r2) {
        this.A00 = r2.A06;
        this.A03 = r2.A0Q;
        this.A04 = r2.A0A;
        this.A05 = r2.A0B;
        this.A07 = r2.A0D;
        this.A06 = r2.A0C;
        this.A02 = r2.A08;
        this.A01 = r2.A07;
        this.A08 = r2.A0G;
        this.A09 = r2.A0N;
    }

    public final void E5t() {
        1NK.A00().A0N(this);
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("BadUrlCacheRequest: Source = ");
        A1A.append(this.A03);
        A1A.append(AnonymousClass000.A00(849));
        return AnonymousClass7TF.A0i(this.A00, A1A);
    }

    public FVX(ImageUrl imageUrl, Integer num, Object obj, String str, boolean z, boolean z2) {
        this.A00 = imageUrl;
        this.A03 = str;
        this.A02 = obj;
        this.A04 = null;
        this.A05 = null;
        this.A07 = null;
        this.A06 = null;
        this.A01 = num;
        this.A08 = z;
        this.A09 = z2;
    }
}
